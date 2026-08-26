package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;

public final class GroupCreateFinalActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    public GroupCreateAdapter adapter;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public TLRPC.FileLocation avatarBig;
    public final AvatarDrawable avatarDrawable;
    public ChannelCreateActivity.AnonymousClass5 avatarEditor;
    public UserCell.AnonymousClass2 avatarImage;
    public ChatActivity.AnonymousClass27 avatarOverlay;
    public AnonymousClass7 avatarProgressView;
    public RLottieDrawable cameraDrawable;
    public final boolean canToggleTopics;
    public final int chatType;
    public boolean createAfterUpload;
    public String currentGroupCreateAddress;
    public final Location currentGroupCreateLocation;
    public GroupCreateFinalActivityDelegate delegate;
    public boolean donePressed;
    public EditTextEmoji editText;
    public FrameLayout editTextContainer;
    public FragmentFloatingButton floatingButton;
    public final boolean forImport;
    public ImageUpdater imageUpdater;
    public TLRPC.VideoSize inputEmojiMarkup;
    public TLRPC.InputFile inputPhoto;
    public TLRPC.InputFile inputVideo;
    public String inputVideoPath;
    public FillLastLinearLayoutManager linearLayoutManager;
    public RecyclerListView listView;
    public String nameToSet;
    public ActionBarPopupWindow popupWindow;
    public int reqId;
    public ArrayList selectedContacts;
    public Drawable shadowDrawable;
    public int ttlPeriod;
    public double videoTimestamp;

    public final class AnonymousClass7 extends RadialProgressView {
        public AnonymousClass7(Context context) {
            super(context, null);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            GroupCreateFinalActivity.this.avatarOverlay.invalidate();
        }
    }

    public final class GroupCreateAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public final ArrayList items = new ArrayList();
        public int usersStartRow;

        public final class InnerItem extends AdapterWithDiffUtils.Item {
            public final String string;

            public InnerItem(String str) {
                super(5, true);
                this.string = str;
            }
        }

        public GroupCreateAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            return this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((InnerItem) this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            if (i == 3 || i == 4) {
                return true;
            }
            return i == 6 && GroupCreateFinalActivity.this.canToggleTopics;
        }

        @Override
        public final void notifyDataSetChanged() {
            ArrayList arrayList = this.items;
            arrayList.clear();
            arrayList.add(new InnerItem(0, true));
            GroupCreateFinalActivity groupCreateFinalActivity = GroupCreateFinalActivity.this;
            if (groupCreateFinalActivity.chatType == 5) {
                arrayList.add(new InnerItem(6, true));
                arrayList.add(new InnerItem(LocaleController.getString(R.string.ForumToggleDescription)));
            } else {
                arrayList.add(new InnerItem(4, true));
                arrayList.add(new InnerItem(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
            }
            if (groupCreateFinalActivity.currentGroupCreateAddress != null) {
                arrayList.add(new InnerItem(1, true));
                arrayList.add(new InnerItem(3, true));
                arrayList.add(new InnerItem(0, true));
            }
            if (groupCreateFinalActivity.selectedContacts.size() > 0) {
                arrayList.add(new InnerItem(1, true));
                this.usersStartRow = arrayList.size();
                for (int i = 0; i < groupCreateFinalActivity.selectedContacts.size(); i++) {
                    arrayList.add(new InnerItem(2, true));
                }
                arrayList.add(new InnerItem(7, true));
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            ArrayList arrayList = this.items;
            GroupCreateFinalActivity groupCreateFinalActivity = GroupCreateFinalActivity.this;
            View view = viewHolder.itemView;
            switch (i2) {
                case 1:
                    HeaderCell headerCell = (HeaderCell) view;
                    if (groupCreateFinalActivity.currentGroupCreateAddress != null && i == 1) {
                        headerCell.setText(LocaleController.getString(R.string.AttachLocation));
                    } else {
                        headerCell.setText(LocaleController.formatPluralString("Members", groupCreateFinalActivity.selectedContacts.size(), new Object[0]));
                    }
                    break;
                case 2:
                    GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                    groupCreateUserCell.setObject(groupCreateFinalActivity.getMessagesController().getUser((Long) groupCreateFinalActivity.selectedContacts.get(i - this.usersStartRow)), null, null);
                    groupCreateUserCell.setDrawDivider(i != arrayList.size() - 1);
                    break;
                case 3:
                    ((TextSettingsCell) view).setText(groupCreateFinalActivity.currentGroupCreateAddress, false);
                    break;
                case 4:
                    TextCell textCell = (TextCell) view;
                    int i3 = groupCreateFinalActivity.ttlPeriod;
                    textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.AutoDeleteMessages), i3 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i3), ((BaseFragment) groupCreateFinalActivity).fragmentBeginToShow, R.drawable.msg_autodelete, false);
                    break;
                case 5:
                    ((TextInfoPrivacyCell) view).setText(((InnerItem) arrayList.get(i)).string);
                    break;
                case 6:
                    TextCell textCell2 = (TextCell) view;
                    textCell2.setTextAndCheckAndIcon(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                    textCell2.getCheckBox().setAlpha(0.75f);
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View groupCreateUserCell;
            Context context = this.context;
            if (i == 0) {
                groupCreateUserCell = new ShadowSectionCell(context, (Object) null);
            } else if (i == 1) {
                HeaderCell headerCell = new HeaderCell(context);
                headerCell.setHeight(46);
                groupCreateUserCell = headerCell;
            } else if (i == 2) {
                groupCreateUserCell = new GroupCreateUserCell(0, 3, this.context, null, false, false);
            } else if (i == 4) {
                groupCreateUserCell = new TextCell(context);
            } else if (i == 5) {
                groupCreateUserCell = new TextInfoPrivacyCell(context, 24, null);
            } else if (i == 6) {
                groupCreateUserCell = new TextCell(23, this.context, GroupCreateFinalActivity.this.getResourceProvider(), false, true);
            } else if (i != 7) {
                groupCreateUserCell = new TextSettingsCell(context, 0, null);
            } else {
                View view = new View(context);
                view.setTag(-33024);
                groupCreateUserCell = view;
            }
            return new RecyclerListView.Holder(groupCreateUserCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 2) {
                ((GroupCreateUserCell) viewHolder.itemView).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public interface GroupCreateFinalActivityDelegate {
        void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity, long j);
    }

    public GroupCreateFinalActivity(Bundle bundle) {
        super(bundle);
        this.chatType = bundle.getInt("chatType", 0);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.currentGroupCreateAddress = bundle.getString("address");
        this.currentGroupCreateLocation = (Location) bundle.getParcelable("location");
        this.forImport = bundle.getBoolean("forImport", false);
        this.nameToSet = bundle.getString("title", null);
        this.canToggleTopics = bundle.getBoolean("canToggleTopics", true);
    }

    @Override
    public final boolean canFinishFragment() {
        return true;
    }

    @Override
    public final View createView(Context context) {
        String str;
        String string;
        final int i = 0;
        final int i2 = 1;
        int i3 = 2;
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        ActionBar actionBar = this.actionBar;
        int i4 = Theme.key_windowBackgroundGray;
        actionBar.setBackgroundColor(getThemedColor(i4));
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 22));
        ChatEditActivity.AnonymousClass3 anonymousClass3 = new ChatEditActivity.AnonymousClass3(i3, context, this);
        anonymousClass3.setBackgroundColor(getThemedColor(i4));
        this.fragmentView = anonymousClass3;
        anonymousClass3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 11);
        anonymousClass35.setOrientation(1);
        anonymousClass3.addView(anonymousClass35, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.editTextContainer = frameLayout;
        frameLayout.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), getThemedColor(Theme.key_windowBackgroundWhite)));
        anonymousClass35.addView(this.editTextContainer, LayoutHelper.createLinear(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context, 8);
        this.avatarImage = anonymousClass2;
        int i5 = this.chatType;
        anonymousClass2.setRoundRadius(AndroidUtilities.dp(i5 == 5 ? 16.0f : 32.0f));
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(5L, null, null, null, null);
        this.avatarImage.setImageDrawable(avatarDrawable);
        this.avatarImage.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.editTextContainer;
        UserCell.AnonymousClass2 anonymousClass4 = this.avatarImage;
        boolean z = LocaleController.isRTL;
        frameLayout2.addView(anonymousClass4, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 16.0f, z ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context, paint, 7);
        this.avatarOverlay = anonymousClass27;
        FrameLayout frameLayout3 = this.editTextContainer;
        boolean z2 = LocaleController.isRTL;
        frameLayout3.addView(anonymousClass27, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 16.0f, z2 ? 16.0f : 0.0f, 16.0f));
        this.avatarOverlay.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCreateFinalActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        GroupCreateFinalActivity groupCreateFinalActivity = this.f$0;
                        groupCreateFinalActivity.imageUpdater.openMenu(groupCreateFinalActivity.avatar != null, new IntroActivity$$ExternalSyntheticLambda6(groupCreateFinalActivity, 6), new OAuthSheet$$ExternalSyntheticLambda11(groupCreateFinalActivity, 23), 0);
                        groupCreateFinalActivity.cameraDrawable.setCurrentFrame(0, true, false);
                        groupCreateFinalActivity.cameraDrawable.setCustomEndFrame(43);
                        groupCreateFinalActivity.avatarEditor.playAnimation();
                        break;
                    default:
                        GroupCreateFinalActivity groupCreateFinalActivity2 = this.f$0;
                        if (!groupCreateFinalActivity2.donePressed) {
                            if (groupCreateFinalActivity2.editText.editText.length() != 0) {
                                groupCreateFinalActivity2.donePressed = true;
                                AndroidUtilities.hideKeyboard(groupCreateFinalActivity2.editText);
                                groupCreateFinalActivity2.editText.setEnabled(false);
                                if (!groupCreateFinalActivity2.imageUpdater.isUploadingImage()) {
                                    FragmentFloatingButton fragmentFloatingButton = groupCreateFinalActivity2.floatingButton;
                                    if (fragmentFloatingButton != null) {
                                        fragmentFloatingButton.animatorProgressVisible.setValue(true, true);
                                    }
                                    groupCreateFinalActivity2.reqId = groupCreateFinalActivity2.getMessagesController().createChat(groupCreateFinalActivity2.editText.getText().toString(), groupCreateFinalActivity2.selectedContacts, null, groupCreateFinalActivity2.chatType, groupCreateFinalActivity2.forImport, groupCreateFinalActivity2.currentGroupCreateLocation, groupCreateFinalActivity2.currentGroupCreateAddress, groupCreateFinalActivity2.ttlPeriod, groupCreateFinalActivity2);
                                } else {
                                    groupCreateFinalActivity2.createAfterUpload = true;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) groupCreateFinalActivity2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(groupCreateFinalActivity2.editText);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        int i6 = R.raw.camera;
        this.cameraDrawable = new RLottieDrawable(i6, SurfaceContainer$$ExternalSyntheticOutline0.m(i6, ""), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        ChannelCreateActivity.AnonymousClass5 anonymousClass5 = new ChannelCreateActivity.AnonymousClass5(this, context, i3);
        this.avatarEditor = anonymousClass5;
        anonymousClass5.setScaleType(ImageView.ScaleType.CENTER);
        this.avatarEditor.setAnimation(this.cameraDrawable);
        this.avatarEditor.setEnabled(false);
        this.avatarEditor.setClickable(false);
        this.avatarEditor.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.editTextContainer;
        ChannelCreateActivity.AnonymousClass5 anonymousClass6 = this.avatarEditor;
        boolean z3 = LocaleController.isRTL;
        frameLayout4.addView(anonymousClass6, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 16.0f, z3 ? 15.0f : 0.0f, 16.0f));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.avatarProgressView = anonymousClass7;
        anonymousClass7.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        FrameLayout frameLayout5 = this.editTextContainer;
        AnonymousClass7 anonymousClass8 = this.avatarProgressView;
        boolean z4 = LocaleController.isRTL;
        frameLayout5.addView(anonymousClass8, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        showAvatarProgress$3(false, false);
        EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, anonymousClass3, this, 0, false, null);
        this.editText = editTextEmoji2;
        editTextEmoji2.setHint(LocaleController.getString((i5 == 0 || i5 == 4 || i5 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str2 = this.nameToSet;
        if (str2 != null) {
            this.editText.setText(str2);
            EditTextEmoji editTextEmoji3 = this.editText;
            editTextEmoji3.setSelection(editTextEmoji3.getText().length());
            this.nameToSet = null;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.selectedContacts.size() + 1;
        if (size >= 2 && size <= 5 && TextUtils.isEmpty(this.editText.getText())) {
            try {
                if (size == 2) {
                    string = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, getFirstNameByPos(0));
                } else if (size == 3) {
                    string = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, getFirstNameByPos(0), getFirstNameByPos(1));
                } else if (size != 4) {
                    if (size != 5) {
                        str = "";
                    } else {
                        string = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, getFirstNameByPos(0), getFirstNameByPos(1), getFirstNameByPos(2), getFirstNameByPos(3));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.editText.setText(str);
                        EditTextEmoji editTextEmoji4 = this.editText;
                        editTextEmoji4.editText.setSelection(0, editTextEmoji4.getText().length());
                    }
                } else {
                    string = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, getFirstNameByPos(0), getFirstNameByPos(1), getFirstNameByPos(2));
                }
                str = string;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (!TextUtils.isEmpty(str)) {
                this.editText.setText(str);
                EditTextEmoji editTextEmoji5 = this.editText;
                editTextEmoji5.editText.setSelection(0, editTextEmoji5.getText().length());
            }
        }
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.editTextContainer;
        EditTextEmoji editTextEmoji6 = this.editText;
        boolean z5 = LocaleController.isRTL;
        frameLayout6.addView(editTextEmoji6, LayoutHelper.createFrame(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.linearLayoutManager = new FillLastLinearLayoutManager(this.listView, 1);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(this.linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        anonymousClass35.addView(this.listView, LayoutHelper.createLinear(-1, -1));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 23));
        this.listView.setOnItemClickListener(new GroupCreateFinalActivity$$ExternalSyntheticLambda2(this));
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        new PhotoViewer.AnonymousClass14(fragmentFloatingButton);
        anonymousClass3.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCreateFinalActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        GroupCreateFinalActivity groupCreateFinalActivity = this.f$0;
                        groupCreateFinalActivity.imageUpdater.openMenu(groupCreateFinalActivity.avatar != null, new IntroActivity$$ExternalSyntheticLambda6(groupCreateFinalActivity, 6), new OAuthSheet$$ExternalSyntheticLambda11(groupCreateFinalActivity, 23), 0);
                        groupCreateFinalActivity.cameraDrawable.setCurrentFrame(0, true, false);
                        groupCreateFinalActivity.cameraDrawable.setCustomEndFrame(43);
                        groupCreateFinalActivity.avatarEditor.playAnimation();
                        break;
                    default:
                        GroupCreateFinalActivity groupCreateFinalActivity2 = this.f$0;
                        if (!groupCreateFinalActivity2.donePressed) {
                            if (groupCreateFinalActivity2.editText.editText.length() != 0) {
                                groupCreateFinalActivity2.donePressed = true;
                                AndroidUtilities.hideKeyboard(groupCreateFinalActivity2.editText);
                                groupCreateFinalActivity2.editText.setEnabled(false);
                                if (!groupCreateFinalActivity2.imageUpdater.isUploadingImage()) {
                                    FragmentFloatingButton fragmentFloatingButton2 = groupCreateFinalActivity2.floatingButton;
                                    if (fragmentFloatingButton2 != null) {
                                        fragmentFloatingButton2.animatorProgressVisible.setValue(true, true);
                                    }
                                    groupCreateFinalActivity2.reqId = groupCreateFinalActivity2.getMessagesController().createChat(groupCreateFinalActivity2.editText.getText().toString(), groupCreateFinalActivity2.selectedContacts, null, groupCreateFinalActivity2.chatType, groupCreateFinalActivity2.forImport, groupCreateFinalActivity2.currentGroupCreateLocation, groupCreateFinalActivity2.currentGroupCreateAddress, groupCreateFinalActivity2.ttlPeriod, groupCreateFinalActivity2);
                                } else {
                                    groupCreateFinalActivity2.createAfterUpload = true;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) groupCreateFinalActivity2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(groupCreateFinalActivity2.editText);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Done));
        this.floatingButton.imageView.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.updateInterfaces) {
            if (this.listView == null) {
                return;
            }
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0) {
                return;
            }
            int childCount = this.listView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(iIntValue);
                }
            }
            return;
        }
        if (i == NotificationCenter.chatDidFailCreate) {
            this.reqId = 0;
            this.donePressed = false;
            FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
            if (fragmentFloatingButton != null) {
                fragmentFloatingButton.animatorProgressVisible.setValue(false, true);
            }
            EditTextEmoji editTextEmoji = this.editText;
            if (editTextEmoji != null) {
                editTextEmoji.setEnabled(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatDidCreated) {
            this.reqId = 0;
            long jLongValue = ((Long) objArr[0]).longValue();
            GroupCreateFinalActivityDelegate groupCreateFinalActivityDelegate = this.delegate;
            if (groupCreateFinalActivityDelegate != null) {
                groupCreateFinalActivityDelegate.didFinishChatCreation(this, jLongValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", jLongValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new ChatActivity(bundle), true);
            }
            if (this.inputPhoto == null && this.inputVideo == null && this.inputEmojiMarkup == null) {
                return;
            }
            getMessagesController().changeChatAvatar(jLongValue, null, this.inputPhoto, this.inputVideo, this.inputEmojiMarkup, this.videoTimestamp, this.inputVideoPath, this.avatar, this.avatarBig, null);
        }
    }

    @Override
    public final void didStartUpload(boolean z, boolean z2) {
        AnonymousClass7 anonymousClass7 = this.avatarProgressView;
        if (anonymousClass7 == null) {
            return;
        }
        anonymousClass7.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
    }

    @Override
    public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda76(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.imageUpdater.chatAttachAlert && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    public final String getFirstNameByPos(int i) {
        return getMessagesController().getUser((Long) this.selectedContacts.get(i)).first_name;
    }

    @Override
    public final String getInitialSearchString() {
        return this.editText.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 29);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        EditTextEmoji editTextEmoji = this.editText;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(editTextEmoji, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, Theme.key_groupcreate_hintText));
        arrayList.add(new ThemeDescription(this.editText, 16777216, null, null, null, null, Theme.key_groupcreate_cursor));
        arrayList.add(new ThemeDescription(this.editText, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.editText, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{GroupCreateUserCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_groupcreate_sectionText));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{GroupCreateUserCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.editText, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void lambda$onFragmentCreate$0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(this.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji == null || !editTextEmoji.emojiViewVisible) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        editTextEmoji.hidePopup(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        GroupCreateFinalActivity groupCreateFinalActivity;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        ImageUpdater imageUpdater = new ImageUpdater(2, true, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.parentFragment = this;
        imageUpdater.delegate = this;
        long[] longArray = getArguments().getLongArray("result");
        int i = 0;
        if (longArray != null) {
            this.selectedContacts = new ArrayList(longArray.length);
            int iM = 0;
            while (iM < longArray.length) {
                iM = MessagesController$$ExternalSyntheticOutline2.m(longArray[iM], this.selectedContacts, iM, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            Long l = (Long) this.selectedContacts.get(i2);
            if (getMessagesController().getUser(l) == null) {
                arrayList.add(l);
            }
        }
        if (arrayList.isEmpty()) {
            groupCreateFinalActivity = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            groupCreateFinalActivity = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new LinkManager$$ExternalSyntheticLambda12(groupCreateFinalActivity, arrayList2, arrayList, countDownLatch, 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        }
        groupCreateFinalActivity.ttlPeriod = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.imageUpdater.clear$1();
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
        }
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        ChatAttachAlert chatAttachAlert = this.imageUpdater.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onPause();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
        }
        GroupCreateAdapter groupCreateAdapter = this.adapter;
        if (groupCreateAdapter != null) {
            groupCreateAdapter.notifyDataSetChanged();
        }
        ChatAttachAlert chatAttachAlert = this.imageUpdater.chatAttachAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.onResume();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            EditTextEmoji editTextEmoji = this.editText;
            editTextEmoji.editText.requestFocus();
            AndroidUtilities.showKeyboard(editTextEmoji.editText);
        }
    }

    @Override
    public final void onUploadProgressChanged(float f) {
        AnonymousClass7 anonymousClass7 = this.avatarProgressView;
        if (anonymousClass7 == null) {
            return;
        }
        anonymousClass7.setProgress(f);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            EditTextEmoji editTextEmoji = this.editText;
            if (editTextEmoji != null) {
                editTextEmoji.setText(string);
            } else {
                this.nameToSet = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null && (str = imageUpdater.currentPicturePath) != null) {
            bundle.putString("path", str);
        }
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            String string = editTextEmoji.getText().toString();
            if (string.length() != 0) {
                bundle.putString("nameTextView", string);
            }
        }
    }

    public final void showAvatarProgress$3(boolean z, boolean z2) {
        if (this.avatarEditor == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarEditor.setAlpha(1.0f);
                this.avatarEditor.setVisibility(4);
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                return;
            }
            this.avatarEditor.setAlpha(1.0f);
            this.avatarEditor.setVisibility(0);
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
            return;
        }
        this.avatarAnimation = new AnimatorSet();
        if (z) {
            this.avatarProgressView.setVisibility(0);
            AnimatorSet animatorSet2 = this.avatarAnimation;
            ChannelCreateActivity.AnonymousClass5 anonymousClass5 = this.avatarEditor;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass5, (Property<ChannelCreateActivity.AnonymousClass5, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<AnonymousClass7, Float>) property, 1.0f));
        } else {
            this.avatarEditor.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            ChannelCreateActivity.AnonymousClass5 anonymousClass6 = this.avatarEditor;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass6, (Property<ChannelCreateActivity.AnonymousClass5, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<AnonymousClass7, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new LoginActivity.AnonymousClass9(20, this, z));
        this.avatarAnimation.start();
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }
}
