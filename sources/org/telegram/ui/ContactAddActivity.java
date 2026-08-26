package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_label.zzcv;
import java.util.ArrayList;
import java.util.List;
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
import org.telegram.messenger.utils.PhotoUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;

public final class ContactAddActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    public boolean addContact;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public AvatarDrawable avatarDrawable;
    public BackupImageView avatarImage;
    public ChatActivity.AnonymousClass27 avatarOverlay;
    public RadialProgressView avatarProgressView;
    public boolean checkShare;
    public ContactAddActivityDelegate delegate;
    public MessagesController.DialogPhotos dialogPhotos;
    public ActionBarMenuItem doneButton;
    public EditTextCell firstNameField;
    public String firstNameFromCard;
    public boolean firstSet;
    public boolean focusNotes;
    public final ImageUpdater imageUpdater;
    public FrameLayout infoLayout;
    public EditTextCell lastNameField;
    public String lastNameFromCard;
    public UniversalRecyclerView listView;
    public TextView nameTextView;
    public boolean needAddException;
    public EditTextCell noteField;
    public BackupImageView oldAvatarView;
    public AnonymousClass4 oldPhotoCell;
    public TextView onlineTextView;
    public String phone;
    public int photoSelectedType;
    public int photoSelectedTypeFinal;
    public TLRPC.Photo prevAvatar;
    public final Theme.ResourcesProvider resourcesProvider;
    public TextCell setAvatarCell;
    public TextCell suggestBirthday;
    public TextCell suggestPhoto;
    public MessageObject suggestPhotoMessageFinal;
    public long user_id;

    public final class AnonymousClass3 implements View.OnFocusChangeListener {
        @Override
        public final void onFocusChange(View view, boolean z) {
        }
    }

    public interface ContactAddActivityDelegate {
        void didAddToContacts();
    }

    public ContactAddActivity(Bundle bundle) {
        super(bundle);
        this.checkShare = false;
        this.firstSet = true;
        this.imageUpdater = new ImageUpdater(0, true, true);
    }

    @Override
    public final boolean canFinishFragment() {
        return this.photoSelectedTypeFinal != 1;
    }

    @Override
    public final View createView(Context context) {
        final int i = 2;
        int i2 = 5;
        ActionBar actionBar = this.actionBar;
        int i3 = Theme.key_avatar_actionBarSelectorBlue;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        final int i4 = 0;
        actionBar.setItemsBackgroundColor(Theme.getColor(i3, resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i5 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.addContact) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i6) {
                ContactAddActivity contactAddActivity = ContactAddActivity.this;
                if (i6 == -1) {
                    contactAddActivity.finishFragment();
                    return;
                }
                if (i6 != 1 || contactAddActivity.firstNameField.getText().length() == 0) {
                    return;
                }
                TLRPC.User user = contactAddActivity.getMessagesController().getUser(Long.valueOf(contactAddActivity.user_id));
                TLRPC.UserFull userFull = contactAddActivity.getMessagesController().getUserFull(contactAddActivity.user_id);
                user.first_name = contactAddActivity.firstNameField.getText().toString();
                user.last_name = contactAddActivity.lastNameField.getText().toString();
                user.contact = true;
                TLRPC.TL_textWithEntities textWithEntities = contactAddActivity.noteField.getTextWithEntities();
                contactAddActivity.getMessagesController().putUser(user, false);
                contactAddActivity.getContactsController().addContact(user, textWithEntities, contactAddActivity.needAddException && contactAddActivity.checkShare);
                MessagesController.getNotificationsSettings(((BaseFragment) contactAddActivity).currentAccount).edit().putInt("dialog_bar_vis3" + contactAddActivity.user_id, 3).commit();
                contactAddActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                contactAddActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(contactAddActivity.user_id));
                if (userFull != null) {
                    if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                        userFull.flags2 &= -4194305;
                        userFull.note = null;
                    } else {
                        userFull.flags2 |= 4194304;
                        userFull.note = textWithEntities;
                    }
                    MessagesStorage.getInstance(((BaseFragment) contactAddActivity).currentAccount).updateUserInfo(userFull, true);
                    contactAddActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
                }
                contactAddActivity.finishFragment();
                ContactAddActivityDelegate contactAddActivityDelegate = contactAddActivity.delegate;
                if (contactAddActivityDelegate != null) {
                    contactAddActivityDelegate.didAddToContacts();
                }
            }
        });
        this.doneButton = this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i6 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i6));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.infoLayout = frameLayout2;
        int i7 = Theme.key_windowBackgroundWhite;
        frameLayout2.setBackgroundColor(getThemedColor(i7));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.infoLayout.addView(this.avatarImage, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context, paint, i2);
        this.avatarOverlay = anonymousClass27;
        this.infoLayout.addView(anonymousClass27, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.infoLayout.addView(this.avatarProgressView, LayoutHelper.createFrame(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        showAvatarProgress$2(false, false);
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
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
        TextView textViewM = zzcv.m(frameLayout3, textView3, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 0.0f : 94.0f, 25.66f, z ? 94.0f : 0.0f, 0.0f), context);
        this.onlineTextView = textViewM;
        textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        this.onlineTextView.setTextSize(1, 14.0f);
        this.onlineTextView.setLines(1);
        this.onlineTextView.setMaxLines(1);
        this.onlineTextView.setSingleLine(true);
        this.onlineTextView.setEllipsize(truncateAt);
        this.onlineTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.infoLayout;
        TextView textView4 = this.onlineTextView;
        boolean z2 = LocaleController.isRTL;
        frameLayout4.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 94.0f, 49.66f, z2 ? 94.0f : 0.0f, 0.0f));
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.resourcesProvider);
        this.firstNameField = editTextCell;
        editTextCell.editText.setImeOptions(5);
        this.firstNameField.setBackgroundColor(getThemedColor(i7));
        this.firstNameField.setDivider(true);
        this.firstNameField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ContactAddActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i8, KeyEvent keyEvent) {
                switch (i4) {
                    case 0:
                        ContactAddActivity contactAddActivity = this.f$0;
                        if (i8 != 5) {
                            contactAddActivity.getClass();
                            return false;
                        }
                        contactAddActivity.lastNameField.editText.requestFocus();
                        EditTextCell.AnonymousClass2 anonymousClass2 = contactAddActivity.lastNameField.editText;
                        anonymousClass2.setSelection(anonymousClass2.length());
                        return true;
                    case 1:
                        ContactAddActivity contactAddActivity2 = this.f$0;
                        if (i8 == 6) {
                            contactAddActivity2.doneButton.performClick();
                            return true;
                        }
                        if (i8 != 5) {
                            contactAddActivity2.getClass();
                            return false;
                        }
                        contactAddActivity2.noteField.editText.requestFocus();
                        contactAddActivity2.noteField.editText.setSelection(contactAddActivity2.lastNameField.editText.length());
                        return true;
                    default:
                        ContactAddActivity contactAddActivity3 = this.f$0;
                        if (i8 == 6) {
                            contactAddActivity3.doneButton.performClick();
                            return true;
                        }
                        contactAddActivity3.getClass();
                        return false;
                }
            }
        });
        this.firstNameField.editText.setOnFocusChangeListener(new AnonymousClass3());
        this.firstNameField.setText(this.firstNameFromCard);
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.LastName), false, false, -1, this.resourcesProvider);
        this.lastNameField = editTextCell2;
        editTextCell2.editText.setImeOptions(5);
        this.lastNameField.setBackgroundColor(getThemedColor(i7));
        this.lastNameField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ContactAddActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i8, KeyEvent keyEvent) {
                switch (i5) {
                    case 0:
                        ContactAddActivity contactAddActivity = this.f$0;
                        if (i8 != 5) {
                            contactAddActivity.getClass();
                            return false;
                        }
                        contactAddActivity.lastNameField.editText.requestFocus();
                        EditTextCell.AnonymousClass2 anonymousClass2 = contactAddActivity.lastNameField.editText;
                        anonymousClass2.setSelection(anonymousClass2.length());
                        return true;
                    case 1:
                        ContactAddActivity contactAddActivity2 = this.f$0;
                        if (i8 == 6) {
                            contactAddActivity2.doneButton.performClick();
                            return true;
                        }
                        if (i8 != 5) {
                            contactAddActivity2.getClass();
                            return false;
                        }
                        contactAddActivity2.noteField.editText.requestFocus();
                        contactAddActivity2.noteField.editText.setSelection(contactAddActivity2.lastNameField.editText.length());
                        return true;
                    default:
                        ContactAddActivity contactAddActivity3 = this.f$0;
                        if (i8 == 6) {
                            contactAddActivity3.doneButton.performClick();
                            return true;
                        }
                        contactAddActivity3.getClass();
                        return false;
                }
            }
        });
        this.lastNameField.setText(this.lastNameFromCard);
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.resourcesProvider);
        this.noteField = editTextCell3;
        editTextCell3.editText.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.noteField.editText.setImeOptions(6);
        this.noteField.setBackgroundColor(getThemedColor(i7));
        this.noteField.editText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ContactAddActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i8, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        ContactAddActivity contactAddActivity = this.f$0;
                        if (i8 != 5) {
                            contactAddActivity.getClass();
                            return false;
                        }
                        contactAddActivity.lastNameField.editText.requestFocus();
                        EditTextCell.AnonymousClass2 anonymousClass2 = contactAddActivity.lastNameField.editText;
                        anonymousClass2.setSelection(anonymousClass2.length());
                        return true;
                    case 1:
                        ContactAddActivity contactAddActivity2 = this.f$0;
                        if (i8 == 6) {
                            contactAddActivity2.doneButton.performClick();
                            return true;
                        }
                        if (i8 != 5) {
                            contactAddActivity2.getClass();
                            return false;
                        }
                        contactAddActivity2.noteField.editText.requestFocus();
                        contactAddActivity2.noteField.editText.setSelection(contactAddActivity2.lastNameField.editText.length());
                        return true;
                    default:
                        ContactAddActivity contactAddActivity3 = this.f$0;
                        if (i8 == 6) {
                            contactAddActivity3.doneButton.performClick();
                            return true;
                        }
                        contactAddActivity3.getClass();
                        return false;
                }
            }
        });
        if (!this.addContact) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            TextCell textCell = new TextCell(23, context, this.resourcesProvider, false, false);
            this.suggestPhoto = textCell;
            String string = LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name);
            int i8 = R.drawable.msg_addphoto;
            textCell.setTextAndIcon(i8, (CharSequence) string, true);
            this.suggestPhoto.setBackground(Theme.getSelectorDrawable(resourcesProvider, true));
            TextCell textCell2 = this.suggestPhoto;
            int i9 = Theme.key_windowBackgroundWhiteBlueIcon;
            int i10 = Theme.key_windowBackgroundWhiteBlueButton;
            textCell2.setColors(i9, i10);
            int i11 = R.raw.photo_suggest_icon;
            final RLottieDrawable rLottieDrawable = new RLottieDrawable(i11, SurfaceContainer$$ExternalSyntheticOutline0.m(i11, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.suggestPhoto.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.suggestPhoto.imageView.setAnimation(rLottieDrawable);
            this.suggestPhoto.setOnClickListener(new View.OnClickListener(this) {
                public final ContactAddActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            final ContactAddActivity contactAddActivity = this.f$0;
                            contactAddActivity.photoSelectedType = 1;
                            TLRPC.User user2 = user;
                            ImageUpdater imageUpdater = contactAddActivity.imageUpdater;
                            imageUpdater.user = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z3 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda470 = new ChatActivity$$ExternalSyntheticLambda470(5);
                            final RLottieDrawable rLottieDrawable2 = rLottieDrawable;
                            final int i12 = 1;
                            imageUpdater.openMenu(z3, chatActivity$$ExternalSyntheticLambda470, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i12) {
                                        case 0:
                                            ContactAddActivity contactAddActivity2 = contactAddActivity;
                                            boolean zIsUploadingImage = contactAddActivity2.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable3 = rLottieDrawable2;
                                            if (!zIsUploadingImage) {
                                                rLottieDrawable3.setCustomEndFrame(86);
                                                contactAddActivity2.setAvatarCell.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable3.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                        default:
                                            ContactAddActivity contactAddActivity3 = contactAddActivity;
                                            boolean zIsUploadingImage2 = contactAddActivity3.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable4 = rLottieDrawable2;
                                            if (!zIsUploadingImage2) {
                                                rLottieDrawable4.setCustomEndFrame(85);
                                                contactAddActivity3.suggestPhoto.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable4.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 2);
                            rLottieDrawable2.setCurrentFrame(0, true, false);
                            rLottieDrawable2.setCustomEndFrame(43);
                            contactAddActivity.suggestPhoto.imageView.playAnimation();
                            break;
                        default:
                            final ContactAddActivity contactAddActivity2 = this.f$0;
                            contactAddActivity2.photoSelectedType = 2;
                            TLRPC.User user3 = user;
                            ImageUpdater imageUpdater2 = contactAddActivity2.imageUpdater;
                            imageUpdater2.user = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z4 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda471 = new ChatActivity$$ExternalSyntheticLambda470(5);
                            final RLottieDrawable rLottieDrawable3 = rLottieDrawable;
                            final int i13 = 0;
                            imageUpdater2.openMenu(z4, chatActivity$$ExternalSyntheticLambda471, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i13) {
                                        case 0:
                                            ContactAddActivity contactAddActivity3 = contactAddActivity2;
                                            boolean zIsUploadingImage = contactAddActivity3.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable4 = rLottieDrawable3;
                                            if (!zIsUploadingImage) {
                                                rLottieDrawable4.setCustomEndFrame(86);
                                                contactAddActivity3.setAvatarCell.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable4.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                        default:
                                            ContactAddActivity contactAddActivity4 = contactAddActivity2;
                                            boolean zIsUploadingImage2 = contactAddActivity4.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable5 = rLottieDrawable3;
                                            if (!zIsUploadingImage2) {
                                                rLottieDrawable5.setCustomEndFrame(85);
                                                contactAddActivity4.suggestPhoto.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable5.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 1);
                            rLottieDrawable3.setCurrentFrame(0, true, false);
                            rLottieDrawable3.setCustomEndFrame(43);
                            contactAddActivity2.setAvatarCell.imageView.playAnimation();
                            break;
                    }
                }
            });
            TextCell textCell3 = new TextCell(23, context, this.resourcesProvider, false, false);
            this.setAvatarCell = textCell3;
            textCell3.setTextAndIcon(i8, (CharSequence) LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.setAvatarCell.setBackground(Theme.getSelectorDrawable(resourcesProvider, true));
            this.setAvatarCell.setColors(i9, i10);
            int i12 = R.raw.camera_outline;
            final RLottieDrawable rLottieDrawable2 = new RLottieDrawable(i12, SurfaceContainer$$ExternalSyntheticOutline0.m(i12, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.setAvatarCell.imageView.setAnimation(rLottieDrawable2);
            this.setAvatarCell.setOnClickListener(new View.OnClickListener(this) {
                public final ContactAddActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            final ContactAddActivity contactAddActivity = this.f$0;
                            contactAddActivity.photoSelectedType = 1;
                            TLRPC.User user2 = user;
                            ImageUpdater imageUpdater = contactAddActivity.imageUpdater;
                            imageUpdater.user = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z3 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda470 = new ChatActivity$$ExternalSyntheticLambda470(5);
                            final RLottieDrawable rLottieDrawable3 = rLottieDrawable2;
                            final int i13 = 1;
                            imageUpdater.openMenu(z3, chatActivity$$ExternalSyntheticLambda470, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i13) {
                                        case 0:
                                            ContactAddActivity contactAddActivity3 = contactAddActivity;
                                            boolean zIsUploadingImage = contactAddActivity3.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable4 = rLottieDrawable3;
                                            if (!zIsUploadingImage) {
                                                rLottieDrawable4.setCustomEndFrame(86);
                                                contactAddActivity3.setAvatarCell.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable4.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                        default:
                                            ContactAddActivity contactAddActivity4 = contactAddActivity;
                                            boolean zIsUploadingImage2 = contactAddActivity4.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable5 = rLottieDrawable3;
                                            if (!zIsUploadingImage2) {
                                                rLottieDrawable5.setCustomEndFrame(85);
                                                contactAddActivity4.suggestPhoto.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable5.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 2);
                            rLottieDrawable3.setCurrentFrame(0, true, false);
                            rLottieDrawable3.setCustomEndFrame(43);
                            contactAddActivity.suggestPhoto.imageView.playAnimation();
                            break;
                        default:
                            final ContactAddActivity contactAddActivity2 = this.f$0;
                            contactAddActivity2.photoSelectedType = 2;
                            TLRPC.User user3 = user;
                            ImageUpdater imageUpdater2 = contactAddActivity2.imageUpdater;
                            imageUpdater2.user = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z4 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda471 = new ChatActivity$$ExternalSyntheticLambda470(5);
                            final RLottieDrawable rLottieDrawable4 = rLottieDrawable2;
                            final int i14 = 0;
                            imageUpdater2.openMenu(z4, chatActivity$$ExternalSyntheticLambda471, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i14) {
                                        case 0:
                                            ContactAddActivity contactAddActivity3 = contactAddActivity2;
                                            boolean zIsUploadingImage = contactAddActivity3.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable5 = rLottieDrawable4;
                                            if (!zIsUploadingImage) {
                                                rLottieDrawable5.setCustomEndFrame(86);
                                                contactAddActivity3.setAvatarCell.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable5.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                        default:
                                            ContactAddActivity contactAddActivity4 = contactAddActivity2;
                                            boolean zIsUploadingImage2 = contactAddActivity4.imageUpdater.isUploadingImage();
                                            RLottieDrawable rLottieDrawable6 = rLottieDrawable4;
                                            if (!zIsUploadingImage2) {
                                                rLottieDrawable6.setCustomEndFrame(85);
                                                contactAddActivity4.suggestPhoto.imageView.playAnimation();
                                            } else {
                                                rLottieDrawable6.setCurrentFrame(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 1);
                            rLottieDrawable4.setCurrentFrame(0, true, false);
                            rLottieDrawable4.setCustomEndFrame(43);
                            contactAddActivity2.setAvatarCell.imageView.playAnimation();
                            break;
                    }
                }
            });
            this.oldAvatarView = new BackupImageView(context);
            this.oldPhotoCell = new AnonymousClass4(this, context, resourcesProvider);
            if (this.avatarDrawable == null) {
                this.avatarDrawable = new AvatarDrawable(user);
            }
            BackupImageView backupImageView2 = this.oldAvatarView;
            backupImageView2.imageReceiver.setForUserOrChat(user.photo, this.avatarDrawable);
            backupImageView2.onNewImageSet();
            this.oldPhotoCell.addView(this.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.oldPhotoCell.setText(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.oldPhotoCell.getImageView().setVisibility(0);
            this.oldPhotoCell.setBackground(Theme.getSelectorDrawable(resourcesProvider, true));
            this.oldPhotoCell.setColors(i9, i10);
            this.oldPhotoCell.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(this, context, user, 2));
            TextCell textCell4 = new TextCell(23, context, this.resourcesProvider, false, false);
            this.suggestBirthday = textCell4;
            textCell4.setTextAndIcon(R.drawable.menu_birthday, (CharSequence) LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.suggestBirthday.setBackground(Theme.getSelectorDrawable(resourcesProvider, true));
            this.suggestBirthday.setColors(i9, i10);
            this.suggestBirthday.setNeedDivider(true);
            this.suggestBirthday.imageView.setTranslationX(AndroidUtilities.dp(4.0f));
            this.suggestBirthday.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(i4, this, user));
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
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new GiftSheet$$ExternalSyntheticLambda8(this, 15), new VideoEditTextureView$$ExternalSyntheticLambda1(this, 9), null, this.resourcesProvider);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.setOnScrollListener(new ChatActivity.AnonymousClass35(3, this, frameLayout));
        this.listView.setBackgroundColor(getThemedColor(i6));
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.listView);
        if (this.addContact && this.needAddException) {
            this.checkShare = true;
        }
        this.listView.adapter.update(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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

    @Override
    public final void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        this.photoSelectedTypeFinal = this.photoSelectedType;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
        AndroidUtilities.runOnUIThread(new ContactAddActivity$$ExternalSyntheticLambda1(this, 0));
    }

    @Override
    public final void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$19(photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 23);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        TextView textView = this.nameTextView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.onlineTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.firstNameField, 4, null, null, null, null, i));
        EditTextCell editTextCell = this.firstNameField;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextCell, 8388608, null, null, null, null, i2));
        EditTextCell editTextCell2 = this.firstNameField;
        int i3 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(editTextCell2, 32, null, null, null, null, i3));
        EditTextCell editTextCell3 = this.firstNameField;
        int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(editTextCell3, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.lastNameField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.lastNameField, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public final void lambda$createView$13(TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = getMessagesController().getInputUser(this.user_id);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_suggestBirthday, new LinkManager$$ExternalSyntheticLambda3(this, 8));
    }

    public final void lambda$createView$9(TLRPC.User user) {
        this.avatar = null;
        sendPhotoChangedRequest(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.user_id));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.user_id);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = this.prevAvatar;
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
        getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        updateCustomPhotoInfo();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public final void lambda$didUploadFailed$20() {
        if (this.suggestPhotoMessageFinal != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.suggestPhotoMessageFinal.getId()));
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    public final void lambda$didUploadPhoto$19(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater.canceled) {
            return;
        }
        int i = this.photoSelectedTypeFinal;
        if (i == 2) {
            this.avatar = photoSize.location;
        } else if (i == 1 && getParentLayout() != null) {
            INavigationLayout parentLayout = getParentLayout();
            BaseFragment lastFragment = ((ActionBarLayout) getParentLayout()).getLastFragment();
            List<BaseFragment> fragmentStack = ((ActionBarLayout) lastFragment.getParentLayout()).getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int iM = ArticleViewer.IBlock.CC.m((ActionBarLayout) parentLayout, 1); iM >= 0; iM--) {
                BaseFragment baseFragment = fragmentStack.get(iM);
                if (baseFragment instanceof ChatActivity) {
                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                    BaseFragment baseFragment2 = lastFragment;
                    if (chatActivity.getDialogId() == this.user_id && chatActivity.chatMode == 0) {
                        chatActivity.scrollToLastMessage(null, false);
                        int size = arrayList.size() - 1;
                        while (size >= 0) {
                            BaseFragment baseFragment3 = baseFragment2;
                            if (arrayList.get(size) != baseFragment3) {
                                ((BaseFragment) arrayList.get(size)).removeSelfFromStack();
                            }
                            size--;
                            baseFragment2 = baseFragment3;
                        }
                        baseFragment2.finishFragment();
                        break;
                    }
                    lastFragment = baseFragment2;
                }
                arrayList.add(fragmentStack.get(iM));
            }
        }
        if (inputFile == null && inputFile2 == null) {
            this.avatarImage.setImage(ImageLocation.getForLocal(this.avatar), "50_50", this.avatarDrawable, getMessagesController().getUser(Long.valueOf(this.user_id)));
            if (this.photoSelectedTypeFinal == 2) {
                showAvatarProgress$2(true, false);
            } else {
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
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(this.currentAccount, tL_messageService, false, false);
                this.suggestPhotoMessageFinal = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.user_id, arrayList2, 0);
                getMessagesController().photoSuggestion.put(tL_messageService.local_id, imageUpdater);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
            if (this.suggestPhotoMessageFinal == null && user != null) {
                boolean z2 = inputFile2 != null;
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z2;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            sendPhotoChangedRequest(this.avatar, photoSize2.location, inputFile, inputFile2, videoSize, d, this.photoSelectedTypeFinal);
            showAvatarProgress$2(false, true);
        }
        updateCustomPhotoInfo();
    }

    public final void lambda$getThemeDescriptions$23() {
        TLRPC.User user;
        if (this.avatarImage == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        this.avatarDrawable.setInfo(this.currentAccount, user);
        this.avatarImage.invalidate();
    }

    public final void lambda$sendPhotoChangedRequest$21(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (this.suggestPhotoMessageFinal != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.user_id);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= 2097152;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(fileLocation.volume_id);
                sb.append("_");
                String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(fileLocation.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(strM, SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(this.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            PhotoUtilities.applyPhotoToUser(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            getMessagesController().getDialogPhotos(this.user_id).addPhotoAtStart(tL_photos_photo.photo);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (getParentActivity() != null) {
                if (i == 2) {
                    BulletinFactory.of(this).createUsersBulletin(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).show();
                } else {
                    BulletinFactory.of(this).createUsersBulletin(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).show();
                }
            }
        }
        this.avatar = null;
        updateCustomPhotoInfo();
    }

    @Override
    public final boolean onFragmentCreate() {
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
            imageUpdater.delegate = this;
        }
        this.dialogPhotos = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.user_id);
        return user != null && super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear$1();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ChatAttachAlert chatAttachAlert = this.imageUpdater.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        updateAvatarLayout();
        ChatAttachAlert chatAttachAlert = this.imageUpdater.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onResume();
        }
    }

    @Override
    public final void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    public final void sendPhotoChangedRequest(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i) {
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new GroupCallSheet$$ExternalSyntheticLambda0(this, fileLocation, inputFile2, fileLocation2, i, 8));
    }

    public final void showAvatarProgress$2(boolean z, boolean z2) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<ChatActivity.AnonymousClass27, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<ChatActivity.AnonymousClass27, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new LoginActivity.AnonymousClass9(16, this, z));
        this.avatarAnimation.start();
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }

    public final void updateAvatarLayout() {
        TLRPC.User user;
        if (this.nameTextView == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.user_id));
        if (TextUtils.isEmpty((user2 == null || TextUtils.isEmpty(user2.phone)) ? this.phone : user2.phone)) {
            this.nameTextView.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            TextView textView = this.nameTextView;
            PhoneFormat phoneFormat = PhoneFormat.getInstance();
            StringBuilder sb = new StringBuilder("+");
            TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(this.user_id));
            sb.append((user3 == null || TextUtils.isEmpty(user3.phone)) ? this.phone : user3.phone);
            textView.setText(phoneFormat.format(sb.toString()));
        }
        this.onlineTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.avatar == null) {
            BackupImageView backupImageView = this.avatarImage;
            AvatarDrawable avatarDrawable = new AvatarDrawable(user);
            this.avatarDrawable = avatarDrawable;
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
        }
    }

    public final void updateCustomPhotoInfo() {
        TLRPC.Photo photo;
        if (this.addContact) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.prevAvatar) != null) {
            this.oldAvatarView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.prevAvatar), "50_50", this.avatarDrawable, null);
        }
        if (this.avatarDrawable == null) {
            this.avatarDrawable = new AvatarDrawable(user);
        }
        TLRPC.FileLocation fileLocation = this.avatar;
        if (fileLocation != null) {
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, getMessagesController().getUser(Long.valueOf(this.user_id)));
            return;
        }
        BackupImageView backupImageView = this.avatarImage;
        backupImageView.imageReceiver.setForUserOrChat(user, this.avatarDrawable);
        backupImageView.onNewImageSet();
    }

    public final class AnonymousClass4 extends TextCell {
        public final int $r8$classId = 0;
        public final Object this$0;

        public AnonymousClass4(ContactAddActivity contactAddActivity, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(23, context, resourcesProvider, false, false);
            this.this$0 = contactAddActivity;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    super.onLayout(z, i, i2, i3, i4);
                    int iDp = AndroidUtilities.dp(21.0f);
                    int measuredHeight = getMeasuredHeight();
                    ContactAddActivity contactAddActivity = (ContactAddActivity) this.this$0;
                    int measuredHeight2 = (measuredHeight - contactAddActivity.oldAvatarView.getMeasuredHeight()) / 2;
                    BackupImageView backupImageView = contactAddActivity.oldAvatarView;
                    backupImageView.layout(iDp, measuredHeight2, backupImageView.getMeasuredWidth() + iDp, contactAddActivity.oldAvatarView.getMeasuredHeight() + measuredHeight2);
                    break;
                case 1:
                    super.onLayout(z, i, i2, i3, i4);
                    int iDp2 = AndroidUtilities.dp(21.0f);
                    int measuredHeight3 = getMeasuredHeight();
                    PrivacyControlActivity.ListAdapter listAdapter = (PrivacyControlActivity.ListAdapter) this.this$0;
                    int measuredHeight4 = (measuredHeight3 - PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight()) / 2;
                    BackupImageView backupImageView2 = PrivacyControlActivity.this.oldAvatarView;
                    backupImageView2.layout(iDp2, measuredHeight4, backupImageView2.getMeasuredWidth() + iDp2, PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight() + measuredHeight4);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    ContactAddActivity contactAddActivity = (ContactAddActivity) this.this$0;
                    contactAddActivity.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                    contactAddActivity.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                    break;
                case 1:
                    super.onMeasure(i, i2);
                    PrivacyControlActivity.ListAdapter listAdapter = (PrivacyControlActivity.ListAdapter) this.this$0;
                    PrivacyControlActivity.this.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                    PrivacyControlActivity.this.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public int processColor(int i) {
            switch (this.$r8$classId) {
                case 2:
                    ProfileActivity.this.getClass();
                    break;
            }
            return i;
        }

        public AnonymousClass4(PrivacyControlActivity.ListAdapter listAdapter, Activity activity) {
            super(activity);
            this.this$0 = listAdapter;
        }

        public AnonymousClass4(ProfileActivity.ListAdapter listAdapter, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(18, context, resourcesProvider, false, false);
            this.this$0 = listAdapter;
        }
    }

    public ContactAddActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.checkShare = false;
        this.firstSet = true;
        this.resourcesProvider = resourcesProvider;
        this.imageUpdater = new ImageUpdater(0, true, true);
    }
}
