package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.PhotoUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.LNavigation.NavigationExt;

public class ContactAddActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    private boolean addContact;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private boolean checkShare;
    private ContactAddActivityDelegate delegate;
    private MessagesController.DialogPhotos dialogPhotos;
    private View doneButton;
    private EditTextCell firstNameField;
    private String firstNameFromCard;
    private boolean firstSet;
    private boolean focusNotes;
    private ImageUpdater imageUpdater;
    private FrameLayout infoLayout;
    private EditTextCell lastNameField;
    private String lastNameFromCard;
    private UniversalRecyclerView listView;
    private TextView nameTextView;
    private boolean needAddException;
    private EditTextCell noteField;
    private BackupImageView oldAvatarView;
    private TextCell oldPhotoCell;
    private TextView onlineTextView;
    boolean paused;
    private String phone;
    private int photoSelectedType;
    private int photoSelectedTypeFinal;
    private TLRPC.Photo prevAvatar;
    private Theme.ResourcesProvider resourcesProvider;
    private TextCell setAvatarCell;
    private TextCell suggestBirthday;
    private TextCell suggestPhoto;
    MessageObject suggestPhotoMessageFinal;
    private long user_id;

    public interface ContactAddActivityDelegate {
        void didAddToContacts();
    }

    public static void $r8$lambda$LPPvgrrSUfJi0dFhajZWoG7VFqg() {
    }

    public static void $r8$lambda$xBHCyOJY0xiiShPXNdsiY1Ru3IA() {
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public ContactAddActivity(Bundle bundle) {
        super(bundle);
        this.checkShare = false;
        this.firstSet = true;
        this.imageUpdater = new ImageUpdater(true, 0, true);
    }

    public ContactAddActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.checkShare = false;
        this.firstSet = true;
        this.resourcesProvider = resourcesProvider;
        this.imageUpdater = new ImageUpdater(true, 0, true);
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.user_id = getArguments().getLong("user_id", 0L);
        this.phone = getArguments().getString("phone");
        this.firstNameFromCard = getArguments().getString("first_name_card");
        this.lastNameFromCard = getArguments().getString("last_name_card");
        this.addContact = getArguments().getBoolean("addContact", false);
        this.focusNotes = getArguments().getBoolean("focus_notes", false);
        this.needAddException = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.user_id, false);
        TLRPC.User user = this.user_id != 0 ? getMessagesController().getUser(Long.valueOf(this.user_id)) : null;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.parentFragment = this;
            imageUpdater.setDelegate(this);
        }
        this.dialogPhotos = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.user_id);
        return user != null && super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_avatar_actionBarSelectorBlue, this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.addContact) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i != -1) {
                    if (i != 1 || ContactAddActivity.this.firstNameField.getText().length() == 0) {
                        return;
                    }
                    TLRPC.User user = ContactAddActivity.this.getMessagesController().getUser(Long.valueOf(ContactAddActivity.this.user_id));
                    TLRPC.UserFull userFull = ContactAddActivity.this.getMessagesController().getUserFull(ContactAddActivity.this.user_id);
                    user.first_name = ContactAddActivity.this.firstNameField.getText().toString();
                    user.last_name = ContactAddActivity.this.lastNameField.getText().toString();
                    user.contact = true;
                    TLRPC.TL_textWithEntities textWithEntities = ContactAddActivity.this.noteField.getTextWithEntities();
                    ContactAddActivity.this.getMessagesController().putUser(user, false);
                    ContactAddActivity.this.getContactsController().addContact(user, textWithEntities, ContactAddActivity.this.needAddException && ContactAddActivity.this.checkShare);
                    MessagesController.getNotificationsSettings(((BaseFragment) ContactAddActivity.this).currentAccount).edit().putInt("dialog_bar_vis3" + ContactAddActivity.this.user_id, 3).commit();
                    ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                    ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ContactAddActivity.this.user_id));
                    if (userFull != null) {
                        if (textWithEntities != null && textWithEntities.text.length() > 0) {
                            userFull.flags2 |= 4194304;
                            userFull.note = textWithEntities;
                        } else {
                            userFull.flags2 &= -4194305;
                            userFull.note = null;
                        }
                        MessagesStorage.getInstance(((BaseFragment) ContactAddActivity.this).currentAccount).updateUserInfo(userFull, true);
                        ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
                    }
                    ContactAddActivity.this.finishFragment();
                    if (ContactAddActivity.this.delegate != null) {
                        ContactAddActivity.this.delegate.didAddToContacts();
                        return;
                    }
                    return;
                }
                ContactAddActivity.this.finishFragment();
            }
        });
        this.doneButton = this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        final FrameLayout frameLayout = new FrameLayout(context);
        int i = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.infoLayout = frameLayout2;
        int i2 = Theme.key_windowBackgroundWhite;
        frameLayout2.setBackgroundColor(getThemedColor(i2));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.infoLayout.addView(this.avatarImage, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        final Paint paint = new Paint(1);
        paint.setColor(1426063360);
        View view = new View(context) {
            @Override
            protected void onDraw(Canvas canvas) {
                if (ContactAddActivity.this.avatarImage == null || !ContactAddActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                    return;
                }
                paint.setAlpha((int) (ContactAddActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
            }
        };
        this.avatarOverlay = view;
        this.infoLayout.addView(view, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.infoLayout.addView(this.avatarProgressView, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        showAvatarProgress(false, false);
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.nameTextView.setTextSize(1, 18.0f);
        this.nameTextView.setLines(1);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setSingleLine(true);
        TextView textView2 = this.nameTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.nameTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.infoLayout;
        TextView textView3 = this.nameTextView;
        boolean z = LocaleController.isRTL;
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 0.0f : 94.0f, 25.66f, z ? 94.0f : 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.onlineTextView = textView4;
        textView4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
        this.onlineTextView.setTextSize(1, 14.0f);
        this.onlineTextView.setLines(1);
        this.onlineTextView.setMaxLines(1);
        this.onlineTextView.setSingleLine(true);
        this.onlineTextView.setEllipsize(truncateAt);
        this.onlineTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.infoLayout;
        TextView textView5 = this.onlineTextView;
        boolean z2 = LocaleController.isRTL;
        frameLayout4.addView(textView5, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 94.0f, 49.66f, z2 ? 94.0f : 0.0f, 0.0f));
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.resourcesProvider);
        this.firstNameField = editTextCell;
        editTextCell.editText.setImeOptions(5);
        this.firstNameField.setBackgroundColor(getThemedColor(i2));
        this.firstNameField.setDivider(true);
        this.firstNameField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView6, int i3, KeyEvent keyEvent) {
                return ContactAddActivity.m3013$r8$lambda$3Ke0YFOZiSmmGaLyyocYBbwso0(this.f$0, textView6, i3, keyEvent);
            }
        });
        this.firstNameField.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            boolean focused;

            @Override
            public void onFocusChange(View view2, boolean z3) {
                this.focused = z3;
            }
        });
        this.firstNameField.setText(this.firstNameFromCard);
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.LastName), false, false, -1, this.resourcesProvider);
        this.lastNameField = editTextCell2;
        editTextCell2.editText.setImeOptions(5);
        this.lastNameField.setBackgroundColor(getThemedColor(i2));
        this.lastNameField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView6, int i3, KeyEvent keyEvent) {
                return ContactAddActivity.$r8$lambda$Yv3qDHbupvNsFO0WOskvRfEhOMU(this.f$0, textView6, i3, keyEvent);
            }
        });
        this.lastNameField.setText(this.lastNameFromCard);
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.resourcesProvider);
        this.noteField = editTextCell3;
        editTextCell3.editText.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.noteField.editText.setImeOptions(6);
        this.noteField.setBackgroundColor(getThemedColor(i2));
        this.noteField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView6, int i3, KeyEvent keyEvent) {
                return ContactAddActivity.m3016$r8$lambda$R6Hd7gjnA3L0IzvXDmd_zGagyU(this.f$0, textView6, i3, keyEvent);
            }
        });
        if (!this.addContact) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            TextCell textCell = new TextCell(context, this.resourcesProvider);
            this.suggestPhoto = textCell;
            String string = LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name);
            int i3 = R.drawable.msg_addphoto;
            textCell.setTextAndIcon((CharSequence) string, i3, true);
            this.suggestPhoto.setBackground(Theme.getSelectorDrawable(true, this.resourcesProvider));
            TextCell textCell2 = this.suggestPhoto;
            int i4 = Theme.key_windowBackgroundWhiteBlueIcon;
            int i5 = Theme.key_windowBackgroundWhiteBlueButton;
            textCell2.setColors(i4, i5);
            int i6 = R.raw.photo_suggest_icon;
            final RLottieDrawable rLottieDrawable = new RLottieDrawable(i6, "" + i6, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.suggestPhoto.imageView.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.suggestPhoto.imageView.setAnimation(rLottieDrawable);
            this.suggestPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ContactAddActivity.m3018$r8$lambda$_EzzeNPOlfXaByXkvKt2mLFsuM(this.f$0, user, rLottieDrawable, view2);
                }
            });
            TextCell textCell3 = new TextCell(context, this.resourcesProvider);
            this.setAvatarCell = textCell3;
            textCell3.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.UserSetPhoto, user.first_name), i3, false);
            this.setAvatarCell.setBackground(Theme.getSelectorDrawable(true, this.resourcesProvider));
            this.setAvatarCell.setColors(i4, i5);
            int i7 = R.raw.camera_outline;
            final RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i7, "" + i7, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.setAvatarCell.imageView.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.setAvatarCell.imageView.setAnimation(rLottieDrawable2);
            this.setAvatarCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ContactAddActivity.$r8$lambda$kpNUl29aiUAMS4rH4tm8ukJGJg0(this.f$0, user, rLottieDrawable2, view2);
                }
            });
            this.oldAvatarView = new BackupImageView(context);
            this.oldPhotoCell = new TextCell(context, this.resourcesProvider) {
                @Override
                protected void onMeasure(int i8, int i9) {
                    super.onMeasure(i8, i9);
                    ContactAddActivity.this.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                    ContactAddActivity.this.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                }

                @Override
                protected void onLayout(boolean z3, int i8, int i9, int i10, int i11) {
                    super.onLayout(z3, i8, i9, i10, i11);
                    int iDp = AndroidUtilities.dp(21.0f);
                    int measuredHeight = (getMeasuredHeight() - ContactAddActivity.this.oldAvatarView.getMeasuredHeight()) / 2;
                    ContactAddActivity.this.oldAvatarView.layout(iDp, measuredHeight, ContactAddActivity.this.oldAvatarView.getMeasuredWidth() + iDp, ContactAddActivity.this.oldAvatarView.getMeasuredHeight() + measuredHeight);
                }
            };
            if (this.avatarDrawable == null) {
                this.avatarDrawable = new AvatarDrawable(user);
            }
            this.oldAvatarView.setForUserOrChat(user.photo, this.avatarDrawable);
            this.oldPhotoCell.addView(this.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.oldPhotoCell.setText(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.oldPhotoCell.getImageView().setVisibility(0);
            this.oldPhotoCell.setBackground(Theme.getSelectorDrawable(true, this.resourcesProvider));
            this.oldPhotoCell.setColors(i4, i5);
            this.oldPhotoCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ContactAddActivity.$r8$lambda$qDO9pkHLNwldO3qCRYQWvfP7jKI(this.f$0, context, user, view2);
                }
            });
            TextCell textCell4 = new TextCell(context, this.resourcesProvider);
            this.suggestBirthday = textCell4;
            textCell4.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), R.drawable.menu_birthday, false);
            this.suggestBirthday.setBackground(Theme.getSelectorDrawable(true, this.resourcesProvider));
            this.suggestBirthday.setColors(i4, i5);
            this.suggestBirthday.setNeedDivider(true);
            this.suggestBirthday.imageView.setTranslationX(AndroidUtilities.dp(4.0f));
            this.suggestBirthday.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ContactAddActivity contactAddActivity = this.f$0;
                    contactAddActivity.showDialog(AlertsCreator.createBirthdayPickerDialog(contactAddActivity.getContext(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName(user)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            ContactAddActivity.$r8$lambda$6fK64oJczWipKHj06X0ITORcu0A(this.f$0, (TL_account.TL_birthday) obj);
                        }
                    }, null, false, false, contactAddActivity.resourcesProvider).create());
                }
            });
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.user_id);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.prevAvatar = photo;
                if (photo == null) {
                    this.prevAvatar = userFull.fallback_photo;
                }
            }
            updateCustomPhotoInfo();
        }
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                if (ContactAddActivity.this.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(frameLayout);
                }
            }
        });
        this.listView.setBackgroundColor(getThemedColor(i));
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.listView);
        if (this.addContact && this.needAddException) {
            this.checkShare = true;
        }
        this.listView.adapter.update(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public static boolean m3013$r8$lambda$3Ke0YFOZiSmmGaLyyocYBbwso0(ContactAddActivity contactAddActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            contactAddActivity.getClass();
            return false;
        }
        contactAddActivity.lastNameField.editText.requestFocus();
        EditTextCaption editTextCaption = contactAddActivity.lastNameField.editText;
        editTextCaption.setSelection(editTextCaption.length());
        return true;
    }

    public static boolean $r8$lambda$Yv3qDHbupvNsFO0WOskvRfEhOMU(ContactAddActivity contactAddActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            contactAddActivity.doneButton.performClick();
            return true;
        }
        if (i != 5) {
            contactAddActivity.getClass();
            return false;
        }
        contactAddActivity.noteField.editText.requestFocus();
        contactAddActivity.noteField.editText.setSelection(contactAddActivity.lastNameField.editText.length());
        return true;
    }

    public static boolean m3016$r8$lambda$R6Hd7gjnA3L0IzvXDmd_zGagyU(ContactAddActivity contactAddActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            contactAddActivity.doneButton.performClick();
            return true;
        }
        contactAddActivity.getClass();
        return false;
    }

    public static void m3018$r8$lambda$_EzzeNPOlfXaByXkvKt2mLFsuM(final ContactAddActivity contactAddActivity, TLRPC.User user, final RLottieDrawable rLottieDrawable, View view) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        contactAddActivity.photoSelectedType = 1;
        contactAddActivity.imageUpdater.setUser(user);
        contactAddActivity.imageUpdater.openMenu(((user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.photo_small) != null, new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity.$r8$lambda$LPPvgrrSUfJi0dFhajZWoG7VFqg();
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ContactAddActivity.$r8$lambda$ad2UodIu9do5Pj3zEbveRtIvjZc(this.f$0, rLottieDrawable, dialogInterface);
            }
        }, 2);
        rLottieDrawable.setCurrentFrame(0);
        rLottieDrawable.setCustomEndFrame(43);
        contactAddActivity.suggestPhoto.imageView.playAnimation();
    }

    public static void $r8$lambda$ad2UodIu9do5Pj3zEbveRtIvjZc(ContactAddActivity contactAddActivity, RLottieDrawable rLottieDrawable, DialogInterface dialogInterface) {
        if (!contactAddActivity.imageUpdater.isUploadingImage()) {
            rLottieDrawable.setCustomEndFrame(85);
            contactAddActivity.suggestPhoto.imageView.playAnimation();
        } else {
            rLottieDrawable.setCurrentFrame(0, false);
        }
    }

    public static void $r8$lambda$kpNUl29aiUAMS4rH4tm8ukJGJg0(final ContactAddActivity contactAddActivity, TLRPC.User user, final RLottieDrawable rLottieDrawable, View view) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        contactAddActivity.photoSelectedType = 2;
        contactAddActivity.imageUpdater.setUser(user);
        contactAddActivity.imageUpdater.openMenu(((user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.photo_small) != null, new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity.$r8$lambda$xBHCyOJY0xiiShPXNdsiY1Ru3IA();
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ContactAddActivity.m3015$r8$lambda$EH0aC7TQw_tVreAqbFCIFNP6pg(this.f$0, rLottieDrawable, dialogInterface);
            }
        }, 1);
        rLottieDrawable.setCurrentFrame(0);
        rLottieDrawable.setCustomEndFrame(43);
        contactAddActivity.setAvatarCell.imageView.playAnimation();
    }

    public static void m3015$r8$lambda$EH0aC7TQw_tVreAqbFCIFNP6pg(ContactAddActivity contactAddActivity, RLottieDrawable rLottieDrawable, DialogInterface dialogInterface) {
        if (!contactAddActivity.imageUpdater.isUploadingImage()) {
            rLottieDrawable.setCustomEndFrame(86);
            contactAddActivity.setAvatarCell.imageView.playAnimation();
        } else {
            rLottieDrawable.setCurrentFrame(0, false);
        }
    }

    public static void $r8$lambda$qDO9pkHLNwldO3qCRYQWvfP7jKI(final ContactAddActivity contactAddActivity, Context context, final TLRPC.User user, View view) {
        contactAddActivity.getClass();
        AlertsCreator.createSimpleAlert(context, LocaleController.getString(R.string.ResetToOriginalPhotoTitle), LocaleController.formatString(R.string.ResetToOriginalPhotoMessage, user.first_name), LocaleController.getString(R.string.Reset), new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity.$r8$lambda$A1D9DYZfHyXBJQijDCGXKICfiYY(this.f$0, user);
            }
        }, contactAddActivity.resourcesProvider).show();
    }

    public static void $r8$lambda$A1D9DYZfHyXBJQijDCGXKICfiYY(ContactAddActivity contactAddActivity, TLRPC.User user) {
        contactAddActivity.avatar = null;
        contactAddActivity.sendPhotoChangedRequest(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(contactAddActivity.currentAccount).getUserFull(contactAddActivity.user_id);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            contactAddActivity.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = contactAddActivity.prevAvatar;
        if (photo != null) {
            user2.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null) {
                user2.photo.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                user2.photo.photo_big = closestPhotoSizeWithSize2.location;
            }
        } else {
            user2.photo = null;
            user2.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        contactAddActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        contactAddActivity.updateCustomPhotoInfo();
        contactAddActivity.getNotificationCenter().postNotificationName(NotificationCenter.reloadDialogPhotos, new Object[0]);
        contactAddActivity.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void $r8$lambda$6fK64oJczWipKHj06X0ITORcu0A(final ContactAddActivity contactAddActivity, TL_account.TL_birthday tL_birthday) {
        contactAddActivity.getClass();
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = contactAddActivity.getMessagesController().getInputUser(contactAddActivity.user_id);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(contactAddActivity.currentAccount).sendRequest(tL_users_suggestBirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactAddActivity.$r8$lambda$onHRfweks0FkISKAl_O3ozbOX9A(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$onHRfweks0FkISKAl_O3ozbOX9A(final ContactAddActivity contactAddActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        contactAddActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity contactAddActivity2 = this.f$0;
                contactAddActivity2.presentFragment(ChatActivity.of(contactAddActivity2.user_id), true);
            }
        });
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        arrayList.add(UItem.asCustom(this.infoLayout));
        arrayList.add(UItem.asCustom(this.firstNameField));
        arrayList.add(UItem.asCustom(this.lastNameField));
        if (TextUtils.isEmpty(getPhone())) {
            arrayList.add(UItem.asShadow(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
        } else if (this.needAddException) {
            arrayList.add(UItem.asShadow(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
        } else {
            arrayList.add(UItem.asShadow(null));
        }
        if (this.addContact && this.needAddException) {
            arrayList.add(UItem.asCheck(2, LocaleController.getString(R.string.AddContactShareNumber)).setChecked(this.checkShare));
            arrayList.add(UItem.asShadow(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
        }
        arrayList.add(UItem.asCustom(this.noteField));
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.AddNotesInfo)));
        if (!this.addContact) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.user_id);
            if (userFull != null && userFull.birthday == null) {
                arrayList.add(UItem.asCustom(this.suggestBirthday));
            }
            arrayList.add(UItem.asCustom(this.suggestPhoto));
            arrayList.add(UItem.asCustom(this.setAvatarCell));
            if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                arrayList.add(UItem.asCustom(this.oldPhotoCell));
            }
            arrayList.add(UItem.asShadow(null));
            arrayList.add(UItem.asButton(1, LocaleController.getString(R.string.DeleteContact)).red());
        }
        arrayList.add(UItem.asShadow(null));
        if (this.firstSet) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactAddActivity.$r8$lambda$xdKjEnTnfha47Imxskb0NLcS64k(this.f$0, user);
                }
            });
            this.firstSet = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ContactAddActivity.$r8$lambda$zbhpFdZP3ohrp6wd36cgS_y1EzY(this.f$0);
                }
            }, 200L);
        }
    }

    public static void $r8$lambda$xdKjEnTnfha47Imxskb0NLcS64k(ContactAddActivity contactAddActivity, TLRPC.User user) {
        String str;
        if (user != null && contactAddActivity.firstNameFromCard == null && contactAddActivity.lastNameFromCard == null) {
            if (user.phone == null && (str = contactAddActivity.phone) != null) {
                user.phone = PhoneFormat.stripExceptNumbers(str);
            }
            contactAddActivity.firstNameField.setText(user.first_name);
            EditTextCaption editTextCaption = contactAddActivity.firstNameField.editText;
            editTextCaption.setSelection(editTextCaption.length());
            contactAddActivity.lastNameField.setText(user.last_name);
        }
        TLRPC.UserFull userFull = contactAddActivity.getMessagesController().getUserFull(contactAddActivity.user_id);
        if (userFull != null) {
            TLRPC.TL_textWithEntities tL_textWithEntities = userFull.note;
            if (tL_textWithEntities != null) {
                contactAddActivity.noteField.setText(tL_textWithEntities);
            } else {
                contactAddActivity.noteField.setText("");
            }
        }
        if (contactAddActivity.focusNotes) {
            contactAddActivity.noteField.editText.requestFocus();
            AndroidUtilities.showKeyboard(contactAddActivity.noteField.editText);
        }
    }

    public static void $r8$lambda$zbhpFdZP3ohrp6wd36cgS_y1EzY(ContactAddActivity contactAddActivity) {
        if (contactAddActivity.focusNotes) {
            contactAddActivity.noteField.editText.requestFocus();
            AndroidUtilities.showKeyboard(contactAddActivity.noteField.editText);
        }
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            if (user == null || getParentActivity() == null) {
                return;
            }
            new AlertDialog.Builder(getParentActivity(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.DeleteContact)).setMessage(LocaleController.getString(R.string.AreYouSureDeleteContact)).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    ContactAddActivity.m3012$r8$lambda$e3wlnV0R6aSXk3GYIRYW8Z9SQw(this.f$0, user, alertDialog, i3);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            return;
        }
        if (i2 == 2) {
            boolean z = !this.checkShare;
            this.checkShare = z;
            ((TextCheckCell) view).setChecked(z);
        }
    }

    public static void m3012$r8$lambda$e3wlnV0R6aSXk3GYIRYW8Z9SQw(ContactAddActivity contactAddActivity, TLRPC.User user, AlertDialog alertDialog, int i) {
        contactAddActivity.getClass();
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        contactAddActivity.getContactsController().deleteContact(arrayList, true);
        if (user != null) {
            user.contact = false;
        }
        contactAddActivity.finishFragment();
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                this.avatarOverlay.setAlpha(1.0f);
                this.avatarOverlay.setVisibility(0);
                return;
            }
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            this.avatarOverlay.setAlpha(0.0f);
            this.avatarOverlay.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarOverlay.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            RadialProgressView radialProgressView = this.avatarProgressView;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<View, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ContactAddActivity.this.avatarAnimation == null || ContactAddActivity.this.avatarProgressView == null) {
                    return;
                }
                if (!z) {
                    ContactAddActivity.this.avatarProgressView.setVisibility(4);
                    ContactAddActivity.this.avatarOverlay.setVisibility(4);
                }
                ContactAddActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                ContactAddActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    public void setDelegate(ContactAddActivityDelegate contactAddActivityDelegate) {
        this.delegate = contactAddActivityDelegate;
    }

    private void updateAvatarLayout() {
        TLRPC.User user;
        if (this.nameTextView == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        if (TextUtils.isEmpty(getPhone())) {
            this.nameTextView.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.nameTextView.setText(PhoneFormat.getInstance().format("+" + getPhone()));
        }
        this.onlineTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.avatar == null) {
            BackupImageView backupImageView = this.avatarImage;
            AvatarDrawable avatarDrawable = new AvatarDrawable(user);
            this.avatarDrawable = avatarDrawable;
            backupImageView.setForUserOrChat(user, avatarDrawable);
        }
    }

    private String getPhone() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.phone : user.phone;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (iIntValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            updateAvatarLayout();
            return;
        }
        if (i == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.dialogPhotos) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (arrayList.get(i3) == null) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList.size() > 0) {
                this.prevAvatar = (TLRPC.Photo) arrayList.get(0);
                updateCustomPhotoInfo();
            }
        }
    }

    private void updateCustomPhotoInfo() {
        TLRPC.Photo photo;
        if (this.addContact) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.prevAvatar) != null) {
            this.oldAvatarView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.prevAvatar), "50_50", this.avatarDrawable, (Object) null);
        }
        if (this.avatarDrawable == null) {
            this.avatarDrawable = new AvatarDrawable(user);
        }
        TLRPC.FileLocation fileLocation = this.avatar;
        if (fileLocation == null) {
            this.avatarImage.setForUserOrChat(user, this.avatarDrawable);
        } else {
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, getMessagesController().getUser(Long.valueOf(this.user_id)));
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.paused = true;
        this.imageUpdater.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        updateAvatarLayout();
        this.imageUpdater.onResume();
    }

    @Override
    public boolean canFinishFragment() {
        return this.photoSelectedTypeFinal != 1;
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity.$r8$lambda$exa9PMiFxqkTsrAA0XoM_oa3ICY(this.f$0, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    public static void $r8$lambda$exa9PMiFxqkTsrAA0XoM_oa3ICY(final ContactAddActivity contactAddActivity, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z) {
        if (contactAddActivity.imageUpdater.isCanceled()) {
            return;
        }
        int i = contactAddActivity.photoSelectedTypeFinal;
        if (i == 2) {
            contactAddActivity.avatar = photoSize.location;
        } else if (i == 1) {
            NavigationExt.backToFragment(contactAddActivity, new NavigationExt.FragmentConsumer() {
                @Override
                public final boolean consume(BaseFragment baseFragment) {
                    return ContactAddActivity.$r8$lambda$WipdR54a5GE4KAyeowHETpSDC2w(this.f$0, baseFragment);
                }
            });
        }
        if (inputFile != null || inputFile2 != null) {
            TLRPC.User user = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
            if (contactAddActivity.suggestPhotoMessageFinal == null && user != null) {
                PhotoUtilities.applyPhotoToUser(photoSize, photoSize2, inputFile2 != null, user, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                contactAddActivity.getMessagesStorage().putUsersAndChats(arrayList, null, false, true);
                contactAddActivity.getNotificationCenter().postNotificationName(NotificationCenter.reloadDialogPhotos, new Object[0]);
                contactAddActivity.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            contactAddActivity.sendPhotoChangedRequest(contactAddActivity.avatar, photoSize2.location, inputFile, inputFile2, videoSize, d, contactAddActivity.photoSelectedTypeFinal);
            contactAddActivity.showAvatarProgress(false, true);
        } else {
            contactAddActivity.avatarImage.setImage(ImageLocation.getForLocal(contactAddActivity.avatar), "50_50", contactAddActivity.avatarDrawable, contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id)));
            if (contactAddActivity.photoSelectedTypeFinal == 2) {
                contactAddActivity.showAvatarProgress(true, false);
            } else {
                contactAddActivity.createServiceMessageLocal(photoSize, photoSize2, z);
            }
        }
        contactAddActivity.updateCustomPhotoInfo();
    }

    public static boolean $r8$lambda$WipdR54a5GE4KAyeowHETpSDC2w(ContactAddActivity contactAddActivity, BaseFragment baseFragment) {
        contactAddActivity.getClass();
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chatActivity.getDialogId() == contactAddActivity.user_id && chatActivity.getChatMode() == 0) {
                chatActivity.scrollToLastMessage(true, false);
                return true;
            }
        }
        return false;
    }

    @Override
    public void didUploadFailed() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity.m3020$r8$lambda$qYGxjBsWvau4rfOiPeoUNv2Vxo(this.f$0);
            }
        });
    }

    public static void m3020$r8$lambda$qYGxjBsWvau4rfOiPeoUNv2Vxo(ContactAddActivity contactAddActivity) {
        contactAddActivity.getClass();
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(contactAddActivity);
        if (contactAddActivity.suggestPhotoMessageFinal != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(contactAddActivity.suggestPhotoMessageFinal.getId()));
            NotificationCenter.getInstance(contactAddActivity.currentAccount).postNotificationName(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    private void createServiceMessageLocal(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
        tL_messageService.dialog_id = this.user_id;
        tL_messageService.unread = true;
        tL_messageService.out = true;
        int newMessageId = getUserConfig().getNewMessageId();
        tL_messageService.id = newMessageId;
        tL_messageService.local_id = newMessageId;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.flags |= 256;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_messageService.peer_id = tL_peerUser2;
        tL_peerUser2.user_id = this.user_id;
        tL_messageService.date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
        tL_messageService.action = tL_messageActionSuggestProfilePhoto;
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_messageActionSuggestProfilePhoto.photo = tL_photo;
        tL_photo.sizes.add(photoSize);
        tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
        tL_messageActionSuggestProfilePhoto.video = z;
        tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_messageService, false, false);
        this.suggestPhotoMessageFinal = messageObject;
        arrayList.add(messageObject);
        new ArrayList().add(tL_messageService);
        MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.user_id, arrayList, 0);
        getMessagesController().photoSuggestion.put(tL_messageService.local_id, this.imageUpdater);
    }

    private void sendPhotoChangedRequest(final TLRPC.FileLocation fileLocation, final TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final int i) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.user_id);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i2 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i2 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ContactAddActivity.$r8$lambda$eGkCh7LY_YtQXfGR1eAlRjBHfN8(this.f$0, fileLocation, inputFile2, fileLocation2, i, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$eGkCh7LY_YtQXfGR1eAlRjBHfN8(final ContactAddActivity contactAddActivity, final TLRPC.FileLocation fileLocation, final TLRPC.InputFile inputFile, final TLRPC.FileLocation fileLocation2, final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        contactAddActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactAddActivity.$r8$lambda$kKVjjLtKJNSYaQon_nZfpucaUMo(this.f$0, fileLocation, inputFile, tLObject, fileLocation2, i);
            }
        });
    }

    public static void $r8$lambda$kKVjjLtKJNSYaQon_nZfpucaUMo(ContactAddActivity contactAddActivity, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (contactAddActivity.suggestPhotoMessageFinal != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
        TLRPC.UserFull userFull = MessagesController.getInstance(contactAddActivity.currentAccount).getUserFull(contactAddActivity.user_id);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= 2097152;
            contactAddActivity.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(contactAddActivity.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(contactAddActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                ImageLoader.getInstance().replaceImageInCache(fileLocation.volume_id + "_" + fileLocation.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUser(contactAddActivity.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(contactAddActivity.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(contactAddActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            PhotoUtilities.applyPhotoToUser(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            contactAddActivity.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            contactAddActivity.getMessagesController().getDialogPhotos(contactAddActivity.user_id).addPhotoAtStart(tL_photos_photo.photo);
            contactAddActivity.getNotificationCenter().postNotificationName(NotificationCenter.reloadDialogPhotos, new Object[0]);
            contactAddActivity.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (contactAddActivity.getParentActivity() != null) {
                if (i == 2) {
                    BulletinFactory.of(contactAddActivity).createUsersBulletin(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name))).show();
                } else {
                    BulletinFactory.of(contactAddActivity).createUsersBulletin(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name))).show();
                }
            }
        }
        contactAddActivity.avatar = null;
        contactAddActivity.updateCustomPhotoInfo();
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        this.photoSelectedTypeFinal = this.photoSelectedType;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ContactAddActivity.m3017$r8$lambda$T_6M11wWMFrF7SslX27q5BlHQ(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextView textView = this.nameTextView;
        int i = ThemeDescription.FLAG_TEXTCOLOR;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.onlineTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        EditTextCell editTextCell = this.firstNameField;
        int i3 = ThemeDescription.FLAG_HINTTEXTCOLOR;
        int i4 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextCell, i3, null, null, null, null, i4));
        EditTextCell editTextCell2 = this.firstNameField;
        int i5 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i6 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(editTextCell2, i5, null, null, null, null, i6));
        EditTextCell editTextCell3 = this.firstNameField;
        int i7 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i8 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(editTextCell3, i7, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public static void m3017$r8$lambda$T_6M11wWMFrF7SslX27q5BlHQ(ContactAddActivity contactAddActivity) {
        TLRPC.User user;
        if (contactAddActivity.avatarImage == null || (user = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id))) == null) {
            return;
        }
        contactAddActivity.avatarDrawable.setInfo(contactAddActivity.currentAccount, user);
        contactAddActivity.avatarImage.invalidate();
    }
}
