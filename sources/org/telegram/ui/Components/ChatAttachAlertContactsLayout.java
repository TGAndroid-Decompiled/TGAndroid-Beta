package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;

public class ChatAttachAlertContactsLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private final BoolAnimator animatorFadeVisible;
    private PhonebookShareAlertDelegate delegate;
    private final EmptyTextProgressView emptyView;
    private final View fadeView;
    private final FrameLayout frameLayout;
    private final FillLastLinearLayoutManager layoutManager;
    private final ShareAdapter listAdapter;
    private final RecyclerListView listView;
    private boolean multipleSelectionAllowed;
    private final ShareSearchAdapter searchAdapter;
    private final FragmentSearchField searchField;
    private final HashMap selectedContacts;
    private final ArrayList selectedContactsOrder;
    private boolean sendPressed;

    public interface PhonebookShareAlertDelegate {

        public abstract class CC {
            public static void $default$didSelectContacts(PhonebookShareAlertDelegate phonebookShareAlertDelegate, ArrayList arrayList, String str, boolean z, int i, long j, boolean z2, long j2) {
            }
        }

        void didSelectContact(TLRPC.User user, boolean z, int i, long j, boolean z2, long j2);

        void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2, long j2);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public static class UserCell extends FrameLayout {
        private AvatarDrawable avatarDrawable;
        private BackupImageView avatarImageView;
        private CheckBox2 checkBox;
        private int currentAccount;
        private int currentId;
        private CharSequence currentName;
        private CharSequence currentStatus;
        private TLRPC.User currentUser;
        private CharSequence formattedPhoneNumber;
        private TLRPC.User formattedPhoneNumberUser;
        private TLRPC.FileLocation lastAvatar;
        private String lastName;
        private int lastStatus;
        private SimpleTextView nameTextView;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private SimpleTextView statusTextView;

        public interface CharSequenceCallback {
            CharSequence run();
        }

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public UserCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            this.resourcesProvider = resourcesProvider;
            this.avatarDrawable = new AvatarDrawable(resourcesProvider);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
            BackupImageView backupImageView2 = this.avatarImageView;
            boolean z = LocaleController.isRTL;
            addView(backupImageView2, LayoutHelper.createFrame(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 14.0f, 9.0f, z ? 14.0f : 0.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context) {
                @Override
                public boolean setText(CharSequence charSequence, boolean z2) {
                    return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z2);
                }
            };
            this.nameTextView = simpleTextView;
            NotificationCenter.listenEmojiLoading(simpleTextView);
            this.nameTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            this.nameTextView.setTypeface(AndroidUtilities.bold());
            this.nameTextView.setTextSize(16);
            this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            SimpleTextView simpleTextView2 = this.nameTextView;
            boolean z2 = LocaleController.isRTL;
            addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 12.0f, z2 ? 72.0f : 28.0f, 0.0f));
            SimpleTextView simpleTextView3 = new SimpleTextView(context);
            this.statusTextView = simpleTextView3;
            simpleTextView3.setTextSize(13);
            this.statusTextView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
            this.statusTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            SimpleTextView simpleTextView4 = this.statusTextView;
            boolean z3 = LocaleController.isRTL;
            addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 36.0f, z3 ? 72.0f : 28.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            CheckBox2 checkBox3 = this.checkBox;
            boolean z4 = LocaleController.isRTL;
            addView(checkBox3, LayoutHelper.createFrame(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 44.0f, 37.0f, z4 ? 44.0f : 0.0f, 0.0f));
        }

        public void setCurrentId(int i) {
            this.currentId = i;
        }

        public void setData(TLRPC.User user, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            if (user == null && charSequence == null && charSequence2 == null) {
                this.currentStatus = null;
                this.currentName = null;
                this.nameTextView.setText("");
                this.statusTextView.setText("");
                this.avatarImageView.setImageDrawable(null);
                return;
            }
            this.currentStatus = charSequence2;
            this.currentName = charSequence;
            this.currentUser = user;
            this.needDivider = z;
            setWillNotDraw(!z);
            update(0);
        }

        public void setData(TLRPC.User user, CharSequence charSequence, final CharSequenceCallback charSequenceCallback, boolean z) {
            setData(user, charSequence, (CharSequence) null, z);
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertContactsLayout.UserCell.$r8$lambda$zIXSX9FkL26mOBD5O1cOZ0zsBTE(this.f$0, charSequenceCallback);
                }
            });
        }

        public static void $r8$lambda$zIXSX9FkL26mOBD5O1cOZ0zsBTE(final UserCell userCell, CharSequenceCallback charSequenceCallback) {
            userCell.getClass();
            final CharSequence charSequenceRun = charSequenceCallback.run();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.setStatus(charSequenceRun);
                }
            });
        }

        public void setChecked(boolean z, boolean z2) {
            if (this.checkBox.getVisibility() != 0) {
                this.checkBox.setVisibility(0);
            }
            this.checkBox.setChecked(z, z2);
        }

        public void setStatus(CharSequence charSequence) {
            CharSequence charSequence2;
            this.currentStatus = charSequence;
            if (charSequence != null) {
                this.statusTextView.setText(charSequence);
                return;
            }
            TLRPC.User user = this.currentUser;
            if (user != null) {
                if (TextUtils.isEmpty(user.phone)) {
                    this.statusTextView.setText(LocaleController.getString(R.string.NumberUnknown));
                } else if (this.formattedPhoneNumberUser != this.currentUser && (charSequence2 = this.formattedPhoneNumber) != null) {
                    this.statusTextView.setText(charSequence2);
                } else {
                    this.statusTextView.setText("");
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            ChatAttachAlertContactsLayout.UserCell.$r8$lambda$fwdvdjzXD_8HrYNJpryRge_XHdY(this.f$0);
                        }
                    });
                }
            }
        }

        public static void $r8$lambda$fwdvdjzXD_8HrYNJpryRge_XHdY(final UserCell userCell) {
            if (userCell.currentUser != null) {
                userCell.formattedPhoneNumber = PhoneFormat.getInstance().format("+" + userCell.currentUser.phone);
                userCell.formattedPhoneNumberUser = userCell.currentUser;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlertContactsLayout.UserCell userCell2 = this.f$0;
                        userCell2.statusTextView.setText(userCell2.formattedPhoneNumber);
                    }
                });
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void update(int i) {
            String userName;
            TLRPC.FileLocation fileLocation;
            TLRPC.UserProfilePhoto userProfilePhoto;
            TLRPC.User user = this.currentUser;
            TLRPC.FileLocation fileLocation2 = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.photo_small;
            if (i != 0) {
                boolean z = true;
                boolean z2 = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((fileLocation = this.lastAvatar) != null && fileLocation2 == null) || ((fileLocation == null && fileLocation2 != null) || !(fileLocation == null || fileLocation2 == null || (fileLocation.volume_id == fileLocation2.volume_id && fileLocation.local_id == fileLocation2.local_id))));
                if (user != null && !z2 && (MessagesController.UPDATE_MASK_STATUS & i) != 0) {
                    TLRPC.UserStatus userStatus = user.status;
                    if ((userStatus != null ? userStatus.expires : 0) != this.lastStatus) {
                        z2 = true;
                    }
                }
                if (z2 || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                    userName = null;
                } else {
                    userName = user != null ? UserObject.getUserName(user) : null;
                    if (userName.equals(this.lastName)) {
                    }
                    if (!z) {
                        return;
                    }
                }
                z = z2;
                if (!z) {
                    return;
                }
            } else {
                userName = null;
            }
            TLRPC.User user2 = this.currentUser;
            if (user2 != null) {
                this.avatarDrawable.setInfo(this.currentAccount, user2);
                TLRPC.UserStatus userStatus2 = this.currentUser.status;
                if (userStatus2 != null) {
                    this.lastStatus = userStatus2.expires;
                } else {
                    this.lastStatus = 0;
                }
            } else {
                CharSequence charSequence = this.currentName;
                if (charSequence != null) {
                    this.avatarDrawable.setInfo(this.currentId, charSequence.toString(), null);
                } else {
                    this.avatarDrawable.setInfo(this.currentId, "#", null);
                }
            }
            CharSequence charSequence2 = this.currentName;
            if (charSequence2 != null) {
                this.lastName = null;
                this.nameTextView.setText(charSequence2);
            } else {
                TLRPC.User user3 = this.currentUser;
                if (user3 != null) {
                    if (userName == null) {
                        userName = UserObject.getUserName(user3);
                    }
                    this.lastName = userName;
                } else {
                    this.lastName = "";
                }
                this.nameTextView.setText(this.lastName);
            }
            setStatus(this.currentStatus);
            this.lastAvatar = fileLocation2;
            TLRPC.User user4 = this.currentUser;
            if (user4 != null) {
                this.avatarImageView.setForUserOrChat(user4, this.avatarDrawable);
            } else {
                this.avatarImageView.setImageDrawable(this.avatarDrawable);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    private static class ListItemID {
        private final long id;
        private final Type type;

        public enum Type {
            USER,
            CONTACT
        }

        public static ListItemID of(Object obj) {
            if (obj instanceof ContactsController.Contact) {
                return new ListItemID(Type.CONTACT, ((ContactsController.Contact) obj).contact_id);
            }
            if (obj instanceof TLRPC.User) {
                return new ListItemID(Type.USER, ((TLRPC.User) obj).id);
            }
            return null;
        }

        public ListItemID(Type type, long j) {
            this.type = type;
            this.id = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ListItemID listItemID = (ListItemID) obj;
                if (this.id == listItemID.id && this.type == listItemID.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.type, Long.valueOf(this.id));
        }
    }

    public ChatAttachAlertContactsLayout(ChatAttachAlert chatAttachAlert, Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.animatorFadeVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.selectedContacts = new HashMap();
        this.selectedContactsOrder = new ArrayList();
        this.sendPressed = false;
        this.searchAdapter = new ShareSearchAdapter(context);
        ChatAttachAlert.SearchFadeView searchFadeView = new ChatAttachAlert.SearchFadeView(context, Theme.key_windowBackgroundWhite, resourcesProvider);
        this.fadeView = searchFadeView;
        searchFadeView.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        ChatAttachAlert.AttachSearchField attachSearchField = new ChatAttachAlert.AttachSearchField(context, this.parentAlert, resourcesProvider);
        this.searchField = attachSearchField;
        attachSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        attachSearchField.editText.setHint(LocaleController.getString(R.string.SearchFriends));
        attachSearchField.editText.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String string = editable.toString();
                if (!string.isEmpty()) {
                    if (ChatAttachAlertContactsLayout.this.emptyView != null) {
                        ChatAttachAlertContactsLayout.this.emptyView.setText(LocaleController.getString(R.string.NoResult));
                    }
                } else if (ChatAttachAlertContactsLayout.this.listView.getAdapter() != ChatAttachAlertContactsLayout.this.listAdapter) {
                    int currentTop = ChatAttachAlertContactsLayout.this.getCurrentTop();
                    ChatAttachAlertContactsLayout.this.emptyView.setText(LocaleController.getString(R.string.NoContacts));
                    ChatAttachAlertContactsLayout.this.emptyView.showTextView();
                    ChatAttachAlertContactsLayout.this.listView.setAdapter(ChatAttachAlertContactsLayout.this.listAdapter);
                    ChatAttachAlertContactsLayout.this.listAdapter.notifyDataSetChanged();
                    if (currentTop > 0) {
                        ChatAttachAlertContactsLayout.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                    }
                }
                if (ChatAttachAlertContactsLayout.this.searchAdapter != null) {
                    ChatAttachAlertContactsLayout.this.searchAdapter.search(string);
                }
            }
        });
        frameLayout.addView(searchFadeView, LayoutHelper.createFrameMatchParent());
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(attachSearchField, layoutParamsCreateFrame);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null, resourcesProvider);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoContacts));
        addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) ((ChatAttachAlertContactsLayout.this.parentAlert.scrollOffsetY[0] + AndroidUtilities.dp(30.0f)) + (!ChatAttachAlertContactsLayout.this.parentAlert.inBubbleMode ? AndroidUtilities.statusBarHeight : 0)));
            }
        };
        this.listView = recyclerListView;
        this.iBlur3Capture = recyclerListView;
        this.iBlur3CaptureView = recyclerListView;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        recyclerListView.setSections();
        recyclerListView.setClipToPadding(false);
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(getContext(), 1, false, AndroidUtilities.dp(9.0f), recyclerListView) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i2) {
                        return super.calculateDyToMakeVisible(view, i2) - ((ChatAttachAlertContactsLayout.this.listView.getPaddingTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f));
                    }

                    @Override
                    protected int calculateTimeForDeceleration(int i2) {
                        return super.calculateTimeForDeceleration(i2) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView.setLayoutManager(fillLastLinearLayoutManager);
        fillLastLinearLayoutManager.setBind(false);
        recyclerListView.setHorizontalScrollBarEnabled(false);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ShareAdapter shareAdapter = new ShareAdapter(context);
        this.listAdapter = shareAdapter;
        recyclerListView.setAdapter(shareAdapter);
        recyclerListView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ChatAttachAlertContactsLayout.$r8$lambda$HPujm4VLF1fPOtSSIU8f02dK538(this.f$0, resourcesProvider, view, i);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = ChatAttachAlertContactsLayout.this;
                chatAttachAlertContactsLayout.parentAlert.updateLayout(chatAttachAlertContactsLayout, true, i2);
                ChatAttachAlertContactsLayout.this.updateEmptyViewPosition();
            }
        });
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                return ChatAttachAlertContactsLayout.$r8$lambda$u02oZMfRJELqtNFi_mWx9DKsq4c(this.f$0, view, i);
            }
        });
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, layoutParamsCreateFrame2);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        updateEmptyView();
    }

    public static void $r8$lambda$HPujm4VLF1fPOtSSIU8f02dK538(final ChatAttachAlertContactsLayout chatAttachAlertContactsLayout, Theme.ResourcesProvider resourcesProvider, View view, int i) {
        Object item;
        ContactsController.Contact contact;
        String str;
        String str2;
        String str3;
        String str4;
        RecyclerView.Adapter adapter = chatAttachAlertContactsLayout.listView.getAdapter();
        ShareSearchAdapter shareSearchAdapter = chatAttachAlertContactsLayout.searchAdapter;
        if (adapter == shareSearchAdapter) {
            item = shareSearchAdapter.getItem(i);
        } else {
            int sectionForPosition = chatAttachAlertContactsLayout.listAdapter.getSectionForPosition(i);
            int positionInSectionForPosition = chatAttachAlertContactsLayout.listAdapter.getPositionInSectionForPosition(i);
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return;
            } else {
                item = chatAttachAlertContactsLayout.listAdapter.getItem(sectionForPosition, positionInSectionForPosition);
            }
        }
        if (item != null) {
            if (!chatAttachAlertContactsLayout.selectedContacts.isEmpty()) {
                chatAttachAlertContactsLayout.addOrRemoveSelectedContact((UserCell) view, item);
                return;
            }
            if (item instanceof ContactsController.Contact) {
                ContactsController.Contact contact2 = (ContactsController.Contact) item;
                TLRPC.User user = contact2.user;
                if (user != null) {
                    str3 = user.first_name;
                    str4 = user.last_name;
                } else {
                    str3 = contact2.first_name;
                    str4 = contact2.last_name;
                }
                contact = contact2;
                str2 = str4;
                str = str3;
            } else {
                TLRPC.User user2 = (TLRPC.User) item;
                ContactsController.Contact contact3 = new ContactsController.Contact();
                String str5 = user2.first_name;
                contact3.first_name = str5;
                String str6 = user2.last_name;
                contact3.last_name = str6;
                contact3.phones.add(user2.phone);
                contact3.user = user2;
                contact = contact3;
                str = str5;
                str2 = str6;
            }
            PhonebookShareAlert phonebookShareAlert = new PhonebookShareAlert(chatAttachAlertContactsLayout.parentAlert.baseFragment, contact, (TLRPC.User) null, (Uri) null, (File) null, str, str2, resourcesProvider);
            phonebookShareAlert.setDelegate(new PhonebookShareAlertDelegate() {
                @Override
                public final void didSelectContact(TLRPC.User user3, boolean z, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlertContactsLayout.m2155$r8$lambda$VAy_qnTnGly2ou0OqagNK6Us78(this.f$0, user3, z, i2, j, z2, j2);
                }

                @Override
                public void didSelectContacts(ArrayList arrayList, String str7, boolean z, int i2, long j, boolean z2, long j2) {
                    ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate.CC.$default$didSelectContacts(this, arrayList, str7, z, i2, j, z2, j2);
                }
            });
            phonebookShareAlert.show();
        }
    }

    public static void m2155$r8$lambda$VAy_qnTnGly2ou0OqagNK6Us78(ChatAttachAlertContactsLayout chatAttachAlertContactsLayout, TLRPC.User user, boolean z, int i, long j, boolean z2, long j2) {
        chatAttachAlertContactsLayout.parentAlert.dismiss(true);
        chatAttachAlertContactsLayout.delegate.didSelectContact(user, z, i, j, z2, j2);
    }

    public static boolean $r8$lambda$u02oZMfRJELqtNFi_mWx9DKsq4c(ChatAttachAlertContactsLayout chatAttachAlertContactsLayout, View view, int i) {
        Object item;
        RecyclerView.Adapter adapter = chatAttachAlertContactsLayout.listView.getAdapter();
        ShareSearchAdapter shareSearchAdapter = chatAttachAlertContactsLayout.searchAdapter;
        if (adapter == shareSearchAdapter) {
            item = shareSearchAdapter.getItem(i);
        } else {
            item = chatAttachAlertContactsLayout.listAdapter.getItem(i);
        }
        if (item == null) {
            return false;
        }
        chatAttachAlertContactsLayout.addOrRemoveSelectedContact((UserCell) view, item);
        return true;
    }

    public void addOrRemoveSelectedContact(UserCell userCell, Object obj) {
        boolean z = false;
        if (this.selectedContacts.isEmpty() && !this.multipleSelectionAllowed) {
            showErrorBox(LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]));
            return;
        }
        ListItemID listItemIDOf = ListItemID.of(obj);
        if (this.selectedContacts.containsKey(listItemIDOf)) {
            this.selectedContacts.remove(listItemIDOf);
            this.selectedContactsOrder.remove(listItemIDOf);
        } else {
            this.selectedContacts.put(listItemIDOf, obj);
            this.selectedContactsOrder.add(listItemIDOf);
            z = true;
        }
        userCell.setChecked(z, true);
        this.parentAlert.updateCountButton(z ? 1 : 2);
    }

    public void setupBlurredSearchField(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        FragmentSearchField fragmentSearchField = this.searchField;
        if (fragmentSearchField != null) {
            fragmentSearchField.setupBlurredBackground(blurredBackgroundDrawableViewFactory.create(fragmentSearchField, BlurredBackgroundProviderImpl.attachMenuSearch(this.resourcesProvider)));
        }
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.multipleSelectionAllowed = z;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.selectedContacts.size();
    }

    private void showErrorBox(String str) {
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.AppName)).setMessage(str).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    private TLRPC.User prepareContact(Object obj) {
        String str;
        ContactsController.Contact contact;
        String str2;
        ArrayList<TLRPC.User> arrayListLoadVCardFromStream;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        StringBuilder sb;
        if (obj instanceof ContactsController.Contact) {
            contact = (ContactsController.Contact) obj;
            TLRPC.User user = contact.user;
            if (user != null) {
                str = user.first_name;
                str2 = user.last_name;
            } else {
                str = contact.first_name;
                str2 = contact.last_name;
            }
        } else {
            TLRPC.User user2 = (TLRPC.User) obj;
            ContactsController.Contact contact2 = new ContactsController.Contact();
            str = user2.first_name;
            contact2.first_name = str;
            String str3 = user2.last_name;
            contact2.last_name = str3;
            contact2.phones.add(user2.phone);
            contact2.user = user2;
            contact = contact2;
            str2 = str3;
        }
        String name = ContactsController.formatName(str, str2);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        String str4 = contact.key;
        if (str4 != null) {
            arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str4), this.parentAlert.currentAccount, true, arrayList2, name);
        } else {
            AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
            vcardItem.type = 0;
            ArrayList<String> arrayList5 = vcardItem.vcardData;
            String str5 = "TEL;MOBILE:+" + contact.user.phone;
            vcardItem.fullData = str5;
            arrayList5.add(str5);
            arrayList3.add(vcardItem);
            arrayListLoadVCardFromStream = null;
        }
        TLRPC.User user3 = contact.user;
        if (arrayListLoadVCardFromStream != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList2.get(i);
                if (vcardItem2.type == 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < arrayList3.size()) {
                            if (((AndroidUtilities.VcardItem) arrayList3.get(i2)).getValue(false).equals(vcardItem2.getValue(false))) {
                                vcardItem2.checked = false;
                                break;
                            }
                            i2++;
                        } else {
                            arrayList3.add(vcardItem2);
                            break;
                        }
                    }
                } else {
                    arrayList4.add(vcardItem2);
                }
            }
            if (arrayListLoadVCardFromStream.isEmpty()) {
                arrayList = null;
            } else {
                TLRPC.User user4 = arrayListLoadVCardFromStream.get(0);
                arrayList = user4.restriction_reason;
                if (TextUtils.isEmpty(str)) {
                    str = user4.first_name;
                    str2 = user4.last_name;
                }
            }
        } else {
            arrayList = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
        if (user3 != null) {
            tL_userContact_old2.id = user3.id;
            tL_userContact_old2.access_hash = user3.access_hash;
            tL_userContact_old2.photo = user3.photo;
            tL_userContact_old2.status = user3.status;
            tL_userContact_old2.first_name = user3.first_name;
            tL_userContact_old2.last_name = user3.last_name;
            tL_userContact_old2.phone = user3.phone;
            if (arrayList != null) {
                tL_userContact_old2.restriction_reason = arrayList;
            }
        } else {
            tL_userContact_old2.first_name = str;
            tL_userContact_old2.last_name = str2;
        }
        if (!tL_userContact_old2.restriction_reason.isEmpty()) {
            sb = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
        } else {
            sb = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        }
        int iLastIndexOf = sb.lastIndexOf("END:VCARD");
        if (iLastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList3.get(size);
                if (vcardItem3.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem3.getValue(false);
                    }
                    for (int i3 = 0; i3 < vcardItem3.vcardData.size(); i3++) {
                        sb.insert(iLastIndexOf, vcardItem3.vcardData.get(i3) + "\n");
                    }
                }
            }
            for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem4 = (AndroidUtilities.VcardItem) arrayList4.get(size2);
                if (vcardItem4.checked) {
                    for (int size3 = vcardItem4.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb.insert(iLastIndexOf, vcardItem4.vcardData.get(size3) + "\n");
                    }
                }
            }
            tL_userContact_old2.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            tL_userContact_old2.restriction_reason.add(restrictionReason);
        }
        return tL_userContact_old2;
    }

    @Override
    public boolean sendSelectedItems(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int i3 = 0;
        if ((this.selectedContacts.size() == 0 && this.delegate == null) || this.sendPressed) {
            return false;
        }
        this.sendPressed = true;
        final ArrayList arrayList = new ArrayList(this.selectedContacts.size());
        ArrayList arrayList2 = this.selectedContactsOrder;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(prepareContact(this.selectedContacts.get((ListItemID) obj)));
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        return AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), arrayList.size() + this.parentAlert.getAdditionalMessagesCount(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                ChatAttachAlertContactsLayout.$r8$lambda$Iq5f7aBv1TY030iP54CDvbiZzeE(this.f$0, arrayList, z, i, j, z2, (Long) obj2);
            }
        });
    }

    public static void $r8$lambda$Iq5f7aBv1TY030iP54CDvbiZzeE(ChatAttachAlertContactsLayout chatAttachAlertContactsLayout, ArrayList arrayList, boolean z, int i, long j, boolean z2, Long l) {
        chatAttachAlertContactsLayout.delegate.didSelectContacts(arrayList, chatAttachAlertContactsLayout.parentAlert.getCommentView().getText().toString(), z, i, j, z2, l.longValue());
        chatAttachAlertContactsLayout.parentAlert.dismiss();
    }

    public ArrayList<TLRPC.User> getSelected() {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(this.selectedContacts.size());
        ArrayList arrayList2 = this.selectedContactsOrder;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(prepareContact(this.selectedContacts.get((ListItemID) obj)));
        }
        return arrayList;
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            this.animatorFadeVisible.setValue(false, true);
        } else {
            this.animatorFadeVisible.setValue(true, true);
            top = i;
        }
        this.frameLayout.setTranslationY(top);
        return top + AndroidUtilities.dp(12.0f);
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(4.0f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int iDp;
        if (this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            this.parentAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                iDp = (i2 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    iDp = (int) (i2 / 3.5f);
                } else {
                    iDp = (i2 / 5) * 2;
                }
            }
            this.parentAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp + AndroidUtilities.statusBarHeight, 0, this.listPaddingBottom);
    }

    public int getCurrentTop() {
        if (this.listView.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.listView.getPaddingTop();
        if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    public void setDelegate(PhonebookShareAlertDelegate phonebookShareAlertDelegate) {
        this.delegate = phonebookShareAlertDelegate;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ShareAdapter shareAdapter;
        if (i != NotificationCenter.contactsDidLoad || (shareAdapter = this.listAdapter) == null) {
            return;
        }
        shareAdapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroy() {
        NotificationCenter.getInstance(this.parentAlert.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition();
    }

    public void updateEmptyViewPosition() {
        View childAt;
        if (this.emptyView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            emptyTextProgressView.setTranslationY(((emptyTextProgressView.getMeasuredHeight() - getMeasuredHeight()) + childAt.getTop()) / 2);
        }
    }

    public void updateEmptyView() {
        this.emptyView.setVisibility(this.listView.getAdapter().getItemCount() == 2 ? 0 : 8);
        updateEmptyViewPosition();
    }

    public class ShareAdapter extends RecyclerListView.SectionsAdapter {
        private int currentAccount = UserConfig.selectedAccount;
        private Context mContext;

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            return null;
        }

        public ShareAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public Object getItem(int i, int i2) {
            if (i == 0) {
                return null;
            }
            int i3 = i - 1;
            HashMap<String, ArrayList<Object>> map = ContactsController.getInstance(this.currentAccount).phoneBookSectionsDict;
            ArrayList<String> arrayList = ContactsController.getInstance(this.currentAccount).phoneBookSectionsArray;
            if (i3 < arrayList.size()) {
                ArrayList<Object> arrayList2 = map.get(arrayList.get(i3));
                if (i2 < arrayList2.size()) {
                    return arrayList2.get(i2);
                }
            }
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            if (i != 0 && i != getSectionCount() - 1) {
                if (i2 < ContactsController.getInstance(this.currentAccount).phoneBookSectionsDict.get(ContactsController.getInstance(this.currentAccount).phoneBookSectionsArray.get(i - 1)).size()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int getSectionCount() {
            return ContactsController.getInstance(this.currentAccount).phoneBookSectionsArray.size() + 2;
        }

        @Override
        public int getCountForSection(int i) {
            if (i == 0 || i == getSectionCount() - 1) {
                return 1;
            }
            int i2 = i - 1;
            HashMap<String, ArrayList<Object>> map = ContactsController.getInstance(this.currentAccount).phoneBookSectionsDict;
            ArrayList<String> arrayList = ContactsController.getInstance(this.currentAccount).phoneBookSectionsArray;
            if (i2 < arrayList.size()) {
                return map.get(arrayList.get(i2)).size();
            }
            return 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            if (i == 0) {
                userCell = new UserCell(this.mContext, ChatAttachAlertContactsLayout.this.resourcesProvider);
            } else if (i == 1) {
                userCell = new View(this.mContext);
                userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                userCell.setTag(-33024);
            } else {
                userCell = new View(this.mContext);
                userCell.setTag(-33024);
            }
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            final TLRPC.User user;
            if (viewHolder.getItemViewType() == 0) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                Object item = getItem(i, i2);
                boolean z = true;
                if (i == getSectionCount() - 2 && i2 == getCountForSection(i) - 1) {
                    z = false;
                }
                if (item instanceof ContactsController.Contact) {
                    final ContactsController.Contact contact = (ContactsController.Contact) item;
                    user = contact.user;
                    if (user == null) {
                        userCell.setCurrentId(contact.contact_id);
                        userCell.setData((TLRPC.User) null, ContactsController.formatName(contact.first_name, contact.last_name), new UserCell.CharSequenceCallback() {
                            @Override
                            public final CharSequence run() {
                                return ChatAttachAlertContactsLayout.ShareAdapter.$r8$lambda$P5ZiTS1sCM5N3fBMSNztNGvaA88(contact);
                            }
                        }, z);
                        user = null;
                    }
                } else {
                    user = (TLRPC.User) item;
                }
                if (user != null) {
                    userCell.setData(user, (CharSequence) null, new UserCell.CharSequenceCallback() {
                        @Override
                        public final CharSequence run() {
                            return PhoneFormat.getInstance().format("+" + user.phone);
                        }
                    }, z);
                }
                userCell.setChecked(ChatAttachAlertContactsLayout.this.selectedContacts.containsKey(ListItemID.of(item)), false);
            }
        }

        public static CharSequence $r8$lambda$P5ZiTS1sCM5N3fBMSNztNGvaA88(ContactsController.Contact contact) {
            return contact.phones.isEmpty() ? "" : PhoneFormat.getInstance().format(contact.phones.get(0));
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            return i == getSectionCount() - 1 ? 2 : 0;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertContactsLayout.this.updateEmptyView();
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        private int lastSearchId;
        private Context mContext;
        private ArrayList searchResult = new ArrayList();
        private ArrayList searchResultNames = new ArrayList();
        private Runnable searchRunnable;

        public ShareSearchAdapter(Context context) {
            this.mContext = context;
        }

        public void search(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (str == null) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                notifyDataSetChanged();
            } else {
                final int i = this.lastSearchId + 1;
                this.lastSearchId = i;
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.processSearch(str, i);
                    }
                };
                this.searchRunnable = runnable;
                dispatchQueue.postRunnable(runnable, 300L);
            }
        }

        public void processSearch(final String str, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertContactsLayout.ShareSearchAdapter.m2157$r8$lambda$v2YTDGtRV7nrKvFD16WqCdupow(this.f$0, str, i);
                }
            });
        }

        public static void m2157$r8$lambda$v2YTDGtRV7nrKvFD16WqCdupow(final ShareSearchAdapter shareSearchAdapter, final String str, final int i) {
            shareSearchAdapter.getClass();
            final int i2 = UserConfig.selectedAccount;
            final ArrayList arrayList = new ArrayList(ContactsController.getInstance(i2).contactsBook.values());
            final ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i2).contacts);
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertContactsLayout.ShareSearchAdapter.$r8$lambda$cjfAfMTT8TS2D7pcoo1NIveGhTk(this.f$0, str, arrayList, arrayList2, i2, i);
                }
            });
        }

        public static void $r8$lambda$cjfAfMTT8TS2D7pcoo1NIveGhTk(ShareSearchAdapter shareSearchAdapter, String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
            int i3;
            String lowerCase;
            String translitString;
            int i4;
            TLRPC.User user;
            char c;
            String publicUsername;
            shareSearchAdapter.getClass();
            String lowerCase2 = str.trim().toLowerCase();
            if (lowerCase2.length() == 0) {
                shareSearchAdapter.lastSearchId = -1;
                shareSearchAdapter.updateSearchResults(str, new ArrayList(), new ArrayList(), shareSearchAdapter.lastSearchId);
                return;
            }
            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
            if (lowerCase2.equals(translitString2) || translitString2.length() == 0) {
                translitString2 = null;
            }
            int i5 = (translitString2 != null ? 1 : 0) + 1;
            String[] strArr = new String[i5];
            strArr[0] = lowerCase2;
            if (translitString2 != null) {
                strArr[1] = translitString2;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
            int i6 = 0;
            while (i6 < arrayList.size()) {
                ContactsController.Contact contact = (ContactsController.Contact) arrayList.get(i6);
                String lowerCase3 = ContactsController.formatName(contact.first_name, contact.last_name).toLowerCase();
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                TLRPC.User user2 = contact.user;
                if (user2 != null) {
                    lowerCase = ContactsController.formatName(user2.first_name, user2.last_name).toLowerCase();
                    translitString = LocaleController.getInstance().getTranslitString(lowerCase3);
                } else {
                    lowerCase = null;
                    translitString = null;
                }
                if (lowerCase3.equals(translitString3)) {
                    translitString3 = null;
                }
                String[] strArr2 = strArr;
                int i7 = 0;
                char c2 = 0;
                while (true) {
                    if (i7 >= i5) {
                        i4 = i6;
                        break;
                    }
                    int i8 = i7;
                    String str2 = strArr2[i8];
                    i4 = i6;
                    if (lowerCase != null) {
                        if (!lowerCase.startsWith(str2)) {
                            if (!lowerCase.contains(" " + str2)) {
                                if (translitString != null) {
                                    if (!translitString.startsWith(str2)) {
                                        if (translitString.contains(" " + str2)) {
                                        }
                                    }
                                }
                                user = contact.user;
                                if (user == null) {
                                    if (lowerCase3.startsWith(str2)) {
                                        c = 3;
                                    } else {
                                        if (lowerCase3.contains(" " + str2)) {
                                            c = 3;
                                        } else {
                                            if (translitString3 != null) {
                                                if (!translitString3.startsWith(str2)) {
                                                    if (translitString3.contains(" " + str2)) {
                                                    }
                                                }
                                                c = 3;
                                            }
                                            c = c2;
                                        }
                                    }
                                } else if (lowerCase3.startsWith(str2)) {
                                    if (lowerCase3.contains(" " + str2)) {
                                        c = 3;
                                    } else {
                                        if (translitString3 != null) {
                                            if (!translitString3.startsWith(str2)) {
                                                if (translitString3.contains(" " + str2)) {
                                                }
                                            }
                                            c = 3;
                                        }
                                        c = c2;
                                    }
                                } else {
                                    c = 3;
                                }
                            }
                        }
                        c = 1;
                    } else {
                        if (translitString != null) {
                            if (!translitString.startsWith(str2)) {
                                if (translitString.contains(" " + str2)) {
                                }
                            }
                            c = 1;
                        }
                        user = contact.user;
                        if (user == null && (publicUsername = UserObject.getPublicUsername(user)) != null && publicUsername.startsWith(str2)) {
                            c = 2;
                        } else if (lowerCase3.startsWith(str2)) {
                            if (lowerCase3.contains(" " + str2)) {
                                c = 3;
                            } else {
                                if (translitString3 != null) {
                                    if (!translitString3.startsWith(str2)) {
                                        if (translitString3.contains(" " + str2)) {
                                        }
                                    }
                                    c = 3;
                                }
                                c = c2;
                            }
                        } else {
                            c = 3;
                        }
                    }
                    String str3 = lowerCase;
                    if (c != 0 && (!contact.phones.isEmpty() || !contact.shortPhones.isEmpty())) {
                        if (c == 3) {
                            arrayList4.add(AndroidUtilities.generateSearchName(contact.first_name, contact.last_name, str2));
                        } else if (c == 1) {
                            TLRPC.User user3 = contact.user;
                            arrayList4.add(AndroidUtilities.generateSearchName(user3.first_name, user3.last_name, str2));
                        } else {
                            arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(contact.user), null, "@" + str2));
                        }
                        TLRPC.User user4 = contact.user;
                        if (user4 != null) {
                            longSparseIntArray.put(user4.id, 1);
                        }
                        arrayList3.add(contact);
                        break;
                    }
                    i7 = i8 + 1;
                    lowerCase = str3;
                    c2 = c;
                    i6 = i4;
                }
                i6 = i4 + 1;
                strArr = strArr2;
            }
            String[] strArr3 = strArr;
            int i9 = 0;
            while (i9 < arrayList2.size()) {
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i9);
                if (longSparseIntArray.indexOfKey(tL_contact.user_id) < 0) {
                    TLRPC.User user5 = MessagesController.getInstance(i).getUser(Long.valueOf(tL_contact.user_id));
                    String lowerCase4 = ContactsController.formatName(user5.first_name, user5.last_name).toLowerCase();
                    String translitString4 = LocaleController.getInstance().getTranslitString(lowerCase4);
                    if (lowerCase4.equals(translitString4)) {
                        translitString4 = null;
                    }
                    char c3 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i5) {
                            i3 = i9;
                            break;
                            break;
                        }
                        String str4 = strArr3[i10];
                        if (!lowerCase4.startsWith(str4)) {
                            i3 = i9;
                            if (!lowerCase4.contains(" " + str4)) {
                                if (translitString4 != null) {
                                    if (!translitString4.startsWith(str4)) {
                                        if (translitString4.contains(" " + str4)) {
                                        }
                                    }
                                }
                                String publicUsername2 = UserObject.getPublicUsername(user5);
                                if (publicUsername2 != null && publicUsername2.startsWith(str4)) {
                                    c3 = 2;
                                }
                            }
                            if (c3 == 0 && user5.phone != null) {
                                if (c3 == 1) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(user5.first_name, user5.last_name, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user5), null, "@" + str4));
                                }
                                arrayList3.add(user5);
                                break;
                            }
                            i10++;
                            i9 = i3;
                        } else {
                            i3 = i9;
                        }
                        c3 = 1;
                        if (c3 == 0) {
                        }
                        i10++;
                        i9 = i3;
                    }
                } else {
                    i3 = i9;
                    break;
                }
                i9 = i3 + 1;
            }
            shareSearchAdapter.updateSearchResults(str, arrayList3, arrayList4, i2);
        }

        private void updateSearchResults(String str, final ArrayList arrayList, final ArrayList arrayList2, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertContactsLayout.ShareSearchAdapter.m2156$r8$lambda$Z5bW9m8vz7hl2reMoLrASBs7iY(this.f$0, i, arrayList, arrayList2);
                }
            });
        }

        public static void m2156$r8$lambda$Z5bW9m8vz7hl2reMoLrASBs7iY(ShareSearchAdapter shareSearchAdapter, int i, ArrayList arrayList, ArrayList arrayList2) {
            if (i != shareSearchAdapter.lastSearchId) {
                return;
            }
            if (i != -1 && ChatAttachAlertContactsLayout.this.listView.getAdapter() != ChatAttachAlertContactsLayout.this.searchAdapter) {
                ChatAttachAlertContactsLayout.this.listView.setAdapter(ChatAttachAlertContactsLayout.this.searchAdapter);
            }
            shareSearchAdapter.searchResult = arrayList;
            shareSearchAdapter.searchResultNames = arrayList2;
            shareSearchAdapter.notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            return this.searchResult.size() + 2;
        }

        public Object getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.searchResult.size()) {
                return null;
            }
            return this.searchResult.get(i2);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            if (i == 0) {
                userCell = new UserCell(this.mContext, ChatAttachAlertContactsLayout.this.resourcesProvider);
            } else if (i == 1) {
                userCell = new View(this.mContext);
                userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                userCell.setTag(-33024);
            } else {
                userCell = new View(this.mContext);
                userCell.setTag(-33024);
            }
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            final TLRPC.User user;
            if (viewHolder.getItemViewType() == 0) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                boolean z = i != getItemCount() + (-2);
                Object item = getItem(i);
                if (item instanceof ContactsController.Contact) {
                    final ContactsController.Contact contact = (ContactsController.Contact) item;
                    user = contact.user;
                    if (user == null) {
                        userCell.setCurrentId(contact.contact_id);
                        userCell.setData((TLRPC.User) null, (CharSequence) this.searchResultNames.get(i - 1), new UserCell.CharSequenceCallback() {
                            @Override
                            public final CharSequence run() {
                                return ChatAttachAlertContactsLayout.ShareSearchAdapter.$r8$lambda$ohVs6ue6ETDwcw3OZ9SHGpDXFzI(contact);
                            }
                        }, z);
                        user = null;
                    }
                } else {
                    user = (TLRPC.User) item;
                }
                if (user != null) {
                    userCell.setData(user, (CharSequence) this.searchResultNames.get(i - 1), new UserCell.CharSequenceCallback() {
                        @Override
                        public final CharSequence run() {
                            return PhoneFormat.getInstance().format("+" + user.phone);
                        }
                    }, z);
                }
                userCell.setChecked(ChatAttachAlertContactsLayout.this.selectedContacts.containsKey(ListItemID.of(item)), false);
            }
        }

        public static CharSequence $r8$lambda$ohVs6ue6ETDwcw3OZ9SHGpDXFzI(ContactsController.Contact contact) {
            return contact.phones.isEmpty() ? "" : PhoneFormat.getInstance().format(contact.phones.get(0));
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == getItemCount() - 1 ? 2 : 0;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertContactsLayout.this.updateEmptyView();
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            this.fadeView.setAlpha(f);
            this.fadeView.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatAttachAlertContactsLayout.$r8$lambda$rWJ78Ps4apXysrdb_HS3Yw_SBG0(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_dialogTextGray2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusTextView"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public static void $r8$lambda$rWJ78Ps4apXysrdb_HS3Yw_SBG0(ChatAttachAlertContactsLayout chatAttachAlertContactsLayout) {
        RecyclerListView recyclerListView = chatAttachAlertContactsLayout.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = chatAttachAlertContactsLayout.listView.getChildAt(i);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
        FragmentSearchField fragmentSearchField = chatAttachAlertContactsLayout.searchField;
        if (fragmentSearchField != null) {
            fragmentSearchField.updateColors();
        }
    }
}
