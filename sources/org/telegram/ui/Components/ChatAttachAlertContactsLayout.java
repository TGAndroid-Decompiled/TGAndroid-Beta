package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline1;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.MessageEnterTransitionContainer;
import org.telegram.ui.UsersSelectActivity;

public final class ChatAttachAlertContactsLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final BoolAnimator animatorFadeVisible;
    public PhonebookShareAlertDelegate delegate;
    public final EmptyTextProgressView emptyView;
    public final MessageEnterTransitionContainer fadeView;
    public final FrameLayout frameLayout;
    public final ChatAttachAlertPollLayout.AnonymousClass4 layoutManager;
    public final ShareAdapter listAdapter;
    public final ChatActivity.AnonymousClass34 listView;
    public boolean multipleSelectionAllowed;
    public final ShareSearchAdapter searchAdapter;
    public final ChatAttachAlert.AttachSearchField searchField;
    public final HashMap selectedContacts;
    public final ArrayList selectedContactsOrder;
    public boolean sendPressed;

    public final class ListItemID {
        public final long id;
        public final int type;

        public ListItemID(int i, long j) {
            this.type = i;
            this.id = j;
        }

        public static ListItemID of(Object obj) {
            if (obj instanceof ContactsController.Contact) {
                return new ListItemID(2, ((ContactsController.Contact) obj).contact_id);
            }
            if (obj instanceof TLRPC.User) {
                return new ListItemID(1, ((TLRPC.User) obj).id);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListItemID.class != obj.getClass()) {
                return false;
            }
            ListItemID listItemID = (ListItemID) obj;
            return this.id == listItemID.id && this.type == listItemID.type;
        }

        public final int hashCode() {
            Long lValueOf = Long.valueOf(this.id);
            int i = this.type;
            return Objects.hash(i == 0 ? null : Integer.valueOf(i - 1), lValueOf);
        }
    }

    public interface PhonebookShareAlertDelegate {
        void didSelectContact(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j);

        void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2);
    }

    public final class ShareAdapter extends RecyclerListView.SectionsAdapter {
        public final int currentAccount = UserConfig.selectedAccount;
        public final Context mContext;

        public ShareAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getCountForSection(int i) {
            if (i == 0 || i == getSectionCount() - 1) {
                return 1;
            }
            int i2 = i - 1;
            int i3 = this.currentAccount;
            HashMap<String, ArrayList<Object>> map = ContactsController.getInstance(i3).phoneBookSectionsDict;
            ArrayList<String> arrayList = ContactsController.getInstance(i3).phoneBookSectionsArray;
            if (i2 < arrayList.size()) {
                return map.get(arrayList.get(i2)).size();
            }
            return 0;
        }

        @Override
        public final Object getItem(int i, int i2) {
            if (i == 0) {
                return null;
            }
            int i3 = i - 1;
            int i4 = this.currentAccount;
            HashMap<String, ArrayList<Object>> map = ContactsController.getInstance(i4).phoneBookSectionsDict;
            ArrayList<String> arrayList = ContactsController.getInstance(i4).phoneBookSectionsArray;
            if (i3 < arrayList.size()) {
                ArrayList<Object> arrayList2 = map.get(arrayList.get(i3));
                if (i2 < arrayList2.size()) {
                    return arrayList2.get(i2);
                }
            }
            return null;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            return i == getSectionCount() - 1 ? 2 : 0;
        }

        @Override
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            return ContactsController.getInstance(this.currentAccount).phoneBookSectionsArray.size() + 2;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            return null;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (i == 0 || i == getSectionCount() - 1) {
                return false;
            }
            int i3 = this.currentAccount;
            return i2 < ContactsController.getInstance(i3).phoneBookSectionsDict.get(ContactsController.getInstance(i3).phoneBookSectionsArray.get(i + (-1))).size();
        }

        @Override
        public final void notifyDataSetChanged() {
            update(false);
            ChatAttachAlertContactsLayout.this.updateEmptyView$2();
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            TLRPC.User user;
            if (viewHolder.mItemViewType == 0) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                Object item = getItem(i, i2);
                boolean z = true;
                if (i == getSectionCount() - 2 && i2 == getCountForSection(i) - 1) {
                    z = false;
                }
                if (item instanceof ContactsController.Contact) {
                    ContactsController.Contact contact = (ContactsController.Contact) item;
                    user = contact.user;
                    if (user == null) {
                        userCell.setCurrentId(contact.contact_id);
                        userCell.setData(null, ContactsController.formatName(contact.first_name, contact.last_name), new ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda0(contact, 0), z);
                        user = null;
                    }
                } else {
                    user = (TLRPC.User) item;
                }
                if (user != null) {
                    userCell.setData(user, null, new ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda1(0, user), z);
                }
                boolean zContainsKey = ChatAttachAlertContactsLayout.this.selectedContacts.containsKey(ListItemID.of(item));
                int visibility = userCell.checkBox.getVisibility();
                CheckBox2 checkBox2 = userCell.checkBox;
                if (visibility != 0) {
                    checkBox2.setVisibility(0);
                }
                checkBox2.checkBoxBase.setChecked(-1, zContainsKey, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            Context context = this.mContext;
            if (i == 0) {
                userCell = new UserCell(context, ChatAttachAlertContactsLayout.this.resourcesProvider);
            } else if (i != 1) {
                userCell = new View(context);
                userCell.setTag(-33024);
            } else {
                userCell = new View(context);
                userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                userCell.setTag(-33024);
            }
            return new RecyclerListView.Holder(userCell);
        }
    }

    public final class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        public int lastSearchId;
        public final Context mContext;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2 searchRunnable;

        public ShareSearchAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return this.searchResult.size() + 2;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == this.searchResult.size() + 1 ? 2 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            ChatAttachAlertContactsLayout.this.updateEmptyView$2();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 0) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                boolean z = i != this.searchResult.size();
                int i2 = i - 1;
                TLRPC.User user = null;
                Object obj = (i2 < 0 || i2 >= this.searchResult.size()) ? null : this.searchResult.get(i2);
                if (obj instanceof ContactsController.Contact) {
                    ContactsController.Contact contact = (ContactsController.Contact) obj;
                    TLRPC.User user2 = contact.user;
                    if (user2 != null) {
                        user = user2;
                    } else {
                        userCell.setCurrentId(contact.contact_id);
                        userCell.setData(null, (CharSequence) this.searchResultNames.get(i - 1), new ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda0(contact, 1), z);
                    }
                } else {
                    user = (TLRPC.User) obj;
                }
                if (user != null) {
                    userCell.setData(user, (CharSequence) this.searchResultNames.get(i - 1), new ChatAttachAlertContactsLayout$ShareAdapter$$ExternalSyntheticLambda1(1, user), z);
                }
                boolean zContainsKey = ChatAttachAlertContactsLayout.this.selectedContacts.containsKey(ListItemID.of(obj));
                int visibility = userCell.checkBox.getVisibility();
                CheckBox2 checkBox2 = userCell.checkBox;
                if (visibility != 0) {
                    checkBox2.setVisibility(0);
                }
                checkBox2.checkBoxBase.setChecked(-1, zContainsKey, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            Context context = this.mContext;
            if (i == 0) {
                userCell = new UserCell(context, ChatAttachAlertContactsLayout.this.resourcesProvider);
            } else if (i != 1) {
                userCell = new View(context);
                userCell.setTag(-33024);
            } else {
                userCell = new View(context);
                userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
                userCell.setTag(-33024);
            }
            return new RecyclerListView.Holder(userCell);
        }
    }

    public final class UserCell extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarImageView;
        public final CheckBox2 checkBox;
        public final int currentAccount;
        public int currentId;
        public CharSequence currentName;
        public CharSequence currentStatus;
        public TLRPC.User currentUser;
        public String formattedPhoneNumber;
        public TLRPC.User formattedPhoneNumberUser;
        public String lastName;
        public final UserCell2.AnonymousClass1 nameTextView;
        public boolean needDivider;
        public final SimpleTextView statusTextView;

        public interface CharSequenceCallback {
            String run();
        }

        public UserCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            this.avatarDrawable = new AvatarDrawable(resourcesProvider);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
            boolean z = LocaleController.isRTL;
            addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 14.0f, 9.0f, z ? 14.0f : 0.0f, 0.0f));
            UserCell2.AnonymousClass1 anonymousClass1 = new UserCell2.AnonymousClass1(context, 3);
            this.nameTextView = anonymousClass1;
            NotificationCenter.listenEmojiLoading(anonymousClass1);
            anonymousClass1.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            anonymousClass1.setTypeface(AndroidUtilities.bold());
            anonymousClass1.setTextSize(16);
            anonymousClass1.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z2 = LocaleController.isRTL;
            addView(anonymousClass1, LayoutHelper.createFrame(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 12.0f, z2 ? 72.0f : 28.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.statusTextView = simpleTextView;
            simpleTextView.setTextSize(13);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, resourcesProvider));
            simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z3 = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 36.0f, z3 ? 72.0f : 28.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            boolean z4 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 44.0f, 37.0f, z4 ? 44.0f : 0.0f, 0.0f));
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void setCurrentId(int i) {
            this.currentId = i;
        }

        public final void setData(TLRPC.User user, CharSequence charSequence, CharSequenceCallback charSequenceCallback, boolean z) {
            if (user == null && charSequence == null) {
                this.currentStatus = null;
                this.currentName = null;
                this.nameTextView.setText("", false);
                this.statusTextView.setText("", false);
                this.avatarImageView.setImageDrawable(null);
            } else {
                this.currentStatus = null;
                this.currentName = charSequence;
                this.currentUser = user;
                this.needDivider = z;
                setWillNotDraw(!z);
                update();
            }
            Utilities.globalQueue.postRunnable(new EmojiView$2$$ExternalSyntheticLambda1(2, this, charSequenceCallback));
        }

        public void setStatus(CharSequence charSequence) {
            String str;
            this.currentStatus = charSequence;
            if (charSequence != null) {
                this.statusTextView.setText(charSequence, false);
                return;
            }
            TLRPC.User user = this.currentUser;
            if (user != null) {
                if (TextUtils.isEmpty(user.phone)) {
                    this.statusTextView.setText(LocaleController.getString(R.string.NumberUnknown), false);
                } else if (this.formattedPhoneNumberUser != this.currentUser && (str = this.formattedPhoneNumber) != null) {
                    this.statusTextView.setText(str, false);
                } else {
                    this.statusTextView.setText("", false);
                    Utilities.globalQueue.postRunnable(new ChatAttachAlertContactsLayout$UserCell$$ExternalSyntheticLambda0(this, 0));
                }
            }
        }

        public final void update() {
            TLRPC.User user = this.currentUser;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            if (user != null) {
                avatarDrawable.setInfo(this.currentAccount, user);
                TLRPC.UserStatus userStatus = this.currentUser.status;
            } else {
                CharSequence charSequence = this.currentName;
                if (charSequence != null) {
                    avatarDrawable.setInfo(this.currentId, charSequence.toString(), null, null, null);
                } else {
                    avatarDrawable.setInfo(this.currentId, "#", null, null, null);
                }
            }
            CharSequence charSequence2 = this.currentName;
            UserCell2.AnonymousClass1 anonymousClass1 = this.nameTextView;
            if (charSequence2 != null) {
                this.lastName = null;
                anonymousClass1.setText(charSequence2, false);
            } else {
                TLRPC.User user2 = this.currentUser;
                if (user2 != null) {
                    this.lastName = UserObject.getUserName(user2);
                } else {
                    this.lastName = "";
                }
                anonymousClass1.setText(this.lastName, false);
            }
            setStatus(this.currentStatus);
            TLRPC.User user3 = this.currentUser;
            BackupImageView backupImageView = this.avatarImageView;
            if (user3 == null) {
                backupImageView.setImageDrawable(avatarDrawable);
            } else {
                backupImageView.imageReceiver.setForUserOrChat(user3, avatarDrawable);
                backupImageView.onNewImageSet();
            }
        }
    }

    public ChatAttachAlertContactsLayout(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
        this.animatorFadeVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.selectedContacts = new HashMap();
        this.selectedContactsOrder = new ArrayList();
        this.sendPressed = false;
        this.searchAdapter = new ShareSearchAdapter(context);
        MessageEnterTransitionContainer messageEnterTransitionContainer = new MessageEnterTransitionContainer(context, Theme.key_windowBackgroundWhite, resourcesProvider);
        this.fadeView = messageEnterTransitionContainer;
        messageEnterTransitionContainer.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        ChatAttachAlert.AttachSearchField attachSearchField = new ChatAttachAlert.AttachSearchField(context, resourcesProvider, this.parentAlert);
        this.searchField = attachSearchField;
        attachSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        String string = LocaleController.getString(R.string.SearchFriends);
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = attachSearchField.editText;
        anonymousClass4.setHint(string);
        anonymousClass4.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string2 = editable.toString();
                if (string2.isEmpty()) {
                    RecyclerView.Adapter adapter = ChatAttachAlertContactsLayout.this.listView.getAdapter();
                    ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = ChatAttachAlertContactsLayout.this;
                    if (adapter != chatAttachAlertContactsLayout.listAdapter) {
                        int currentTop = chatAttachAlertContactsLayout.getCurrentTop();
                        ChatAttachAlertContactsLayout.this.emptyView.setText(LocaleController.getString(R.string.NoContacts));
                        ChatAttachAlertContactsLayout.this.emptyView.showTextView();
                        ChatAttachAlertContactsLayout chatAttachAlertContactsLayout2 = ChatAttachAlertContactsLayout.this;
                        chatAttachAlertContactsLayout2.listView.setAdapter(chatAttachAlertContactsLayout2.listAdapter);
                        ChatAttachAlertContactsLayout.this.listAdapter.notifyDataSetChanged();
                        if (currentTop > 0) {
                            ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass5 = ChatAttachAlertContactsLayout.this.layoutManager;
                            anonymousClass5.scrollToPositionWithOffset(0, -currentTop, anonymousClass5.mShouldReverseLayout);
                        }
                    }
                } else {
                    EmptyTextProgressView emptyTextProgressView = ChatAttachAlertContactsLayout.this.emptyView;
                    if (emptyTextProgressView != null) {
                        emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
                    }
                }
                ShareSearchAdapter shareSearchAdapter = ChatAttachAlertContactsLayout.this.searchAdapter;
                if (shareSearchAdapter != null) {
                    if (shareSearchAdapter.searchRunnable != null) {
                        Utilities.searchQueue.cancelRunnable(shareSearchAdapter.searchRunnable);
                        shareSearchAdapter.searchRunnable = null;
                    }
                    int i = shareSearchAdapter.lastSearchId + 1;
                    shareSearchAdapter.lastSearchId = i;
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2 chatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2 = new ChatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2(shareSearchAdapter, string2, i, 0);
                    shareSearchAdapter.searchRunnable = chatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2;
                    dispatchQueue.postRunnable(chatAttachAlertContactsLayout$ShareSearchAdapter$$ExternalSyntheticLambda2, 300L);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        frameLayout.addView(messageEnterTransitionContainer, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(attachSearchField, layoutParamsCreateFrame);
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, resourcesProvider);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoContacts));
        addView(emptyTextProgressView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, resourcesProvider, 9);
        this.listView = anonymousClass34;
        this.iBlur3Capture = anonymousClass34;
        this.iBlur3CaptureView = anonymousClass34;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        anonymousClass34.setSections();
        anonymousClass34.setClipToPadding(false);
        getContext();
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass5 = new ChatAttachAlertPollLayout.AnonymousClass4(this, AndroidUtilities.dp(9.0f), anonymousClass34, 2);
        this.layoutManager = anonymousClass5;
        anonymousClass34.setLayoutManager(anonymousClass5);
        anonymousClass5.bind = false;
        anonymousClass34.setHorizontalScrollBarEnabled(false);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        anonymousClass34.setClipToPadding(false);
        addView(anonymousClass34, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ShareAdapter shareAdapter = new ShareAdapter(context);
        this.listAdapter = shareAdapter;
        anonymousClass34.setAdapter(shareAdapter);
        anonymousClass34.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow, this.resourcesProvider));
        anonymousClass34.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(7, this, resourcesProvider));
        anonymousClass34.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 17));
        anonymousClass34.setOnItemLongClickListener(new ChatAttachAlertContactsLayout$$ExternalSyntheticLambda1(this));
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, layoutParamsCreateFrame2);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        updateEmptyView$2();
    }

    public int getCurrentTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = anonymousClass34.getPaddingTop();
        if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    public final void addOrRemoveSelectedContact(UserCell userCell, Object obj) {
        boolean z;
        HashMap map = this.selectedContacts;
        if (map.isEmpty() && !this.multipleSelectionAllowed) {
            String string = LocaleController.formatString("AttachContactsSlowMode", R.string.AttachContactsSlowMode, new Object[0]);
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.AppName);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string2;
            alertDialog.message = string;
            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
            return;
        }
        ListItemID listItemIDOf = ListItemID.of(obj);
        boolean zContainsKey = map.containsKey(listItemIDOf);
        ArrayList arrayList = this.selectedContactsOrder;
        if (zContainsKey) {
            map.remove(listItemIDOf);
            arrayList.remove(listItemIDOf);
            z = false;
        } else {
            map.put(listItemIDOf, obj);
            arrayList.add(listItemIDOf);
            z = true;
        }
        int visibility = userCell.checkBox.getVisibility();
        CheckBox2 checkBox2 = userCell.checkBox;
        if (visibility != 0) {
            checkBox2.setVisibility(0);
        }
        checkBox2.checkBoxBase.setChecked(-1, z, true);
        this.parentAlert.updateCountButton(z ? 1 : 2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ShareAdapter shareAdapter;
        if (i != NotificationCenter.contactsDidLoad || (shareAdapter = this.listAdapter) == null) {
            return;
        }
        shareAdapter.notifyDataSetChanged();
    }

    @Override
    public int getCurrentItemTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = anonymousClass34.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findContainingViewHolder(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        BoolAnimator boolAnimator = this.animatorFadeVisible;
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            boolAnimator.setValue(true, true);
            top = i;
        } else {
            boolAnimator.setValue(false, true);
        }
        this.frameLayout.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap map = this.selectedContacts;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(map.size());
        ArrayList arrayList2 = this.selectedContactsOrder;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(prepareContact(map.get((ListItemID) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.selectedContacts.size();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 13);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_dialogTextGray2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusTextView"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public final void onDestroy() {
        NotificationCenter.getInstance(this.parentAlert.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            MessageEnterTransitionContainer messageEnterTransitionContainer = this.fadeView;
            messageEnterTransitionContainer.setAlpha(f);
            messageEnterTransitionContainer.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition$2();
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            chatAttachAlert.setAllowNestedScroll(false);
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
            chatAttachAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp + AndroidUtilities.statusBarHeight, 0, this.listPaddingBottom);
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(0, 0, anonymousClass4.mShouldReverseLayout);
    }

    public final TLRPC.TL_userContact_old2 prepareContact(Object obj) {
        String str;
        ContactsController.Contact contact;
        String str2;
        ArrayList<TLRPC.User> arrayListLoadVCardFromStream;
        ArrayList<TLRPC.RestrictionReason> arrayList;
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
                        if (i2 >= arrayList3.size()) {
                            arrayList3.add(vcardItem2);
                            break;
                        }
                        if (((AndroidUtilities.VcardItem) arrayList3.get(i2)).getValue(false).equals(vcardItem2.getValue(false))) {
                            vcardItem2.checked = false;
                            break;
                        }
                        i2++;
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
        StringBuilder sb = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
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
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public final boolean sendSelectedItems(final int i, final boolean z, int i2, final boolean z2, final long j) {
        HashMap map = this.selectedContacts;
        int i3 = 0;
        if ((map.size() == 0 && this.delegate == null) || this.sendPressed) {
            return false;
        }
        this.sendPressed = true;
        final ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = this.selectedContactsOrder;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(prepareContact(map.get((ListItemID) obj)));
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        return AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = this.f$0;
                ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate phonebookShareAlertDelegate = chatAttachAlertContactsLayout.delegate;
                ChatAttachAlert chatAttachAlert2 = chatAttachAlertContactsLayout.parentAlert;
                String string = chatAttachAlert2.getCommentView().getText().toString();
                ((Long) obj2).getClass();
                phonebookShareAlertDelegate.didSelectContacts(arrayList, string, z, i, j, z2);
                chatAttachAlert2.lambda$showGiftOfferSheet$15();
            }
        }, 0L);
    }

    public void setDelegate(PhonebookShareAlertDelegate phonebookShareAlertDelegate) {
        this.delegate = phonebookShareAlertDelegate;
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.multipleSelectionAllowed = z;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        ChatAttachAlert.AttachSearchField attachSearchField = this.searchField;
        if (attachSearchField != null) {
            attachSearchField.setupBlurredBackground(blurredBackgroundDrawableViewFactory.create(attachSearchField, BlurredBackgroundProviderImpl.attachMenuSearch(this.resourcesProvider), false));
        }
    }

    public final void updateEmptyView$2() {
        this.emptyView.setVisibility(this.listView.getAdapter().getItemCount() == 2 ? 0 : 8);
        updateEmptyViewPosition$2();
    }

    public final void updateEmptyViewPosition$2() {
        View childAt;
        EmptyTextProgressView emptyTextProgressView = this.emptyView;
        if (emptyTextProgressView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            emptyTextProgressView.setTranslationY((childAt.getTop() + (emptyTextProgressView.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }
}
