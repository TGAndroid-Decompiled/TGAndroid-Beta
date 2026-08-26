package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
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
import org.telegram.ui.Components.AutoDeletePopupWrapper;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;

public class GroupCreateFinalActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    private static final int done_button = 1;
    private GroupCreateAdapter adapter;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private TLRPC.FileLocation avatarBig;
    private AvatarDrawable avatarDrawable;
    private RLottieImageView avatarEditor;
    private BackupImageView avatarImage;
    private View avatarOverlay;
    private RadialProgressView avatarProgressView;
    private RLottieDrawable cameraDrawable;
    private boolean canToggleTopics;
    private int chatType;
    private boolean createAfterUpload;
    private String currentGroupCreateAddress;
    private Location currentGroupCreateLocation;
    private GroupCreateFinalActivityDelegate delegate;
    private boolean donePressed;
    private EditTextEmoji editText;
    private FrameLayout editTextContainer;
    private FragmentFloatingButton floatingButton;
    private boolean forImport;
    private ImageUpdater imageUpdater;
    private TLRPC.VideoSize inputEmojiMarkup;
    private TLRPC.InputFile inputPhoto;
    private TLRPC.InputFile inputVideo;
    private String inputVideoPath;
    private FillLastLinearLayoutManager linearLayoutManager;
    private RecyclerListView listView;
    private String nameToSet;
    ActionBarPopupWindow popupWindow;
    private int reqId;
    private ArrayList<Long> selectedContacts;
    private Drawable shadowDrawable;
    private int ttlPeriod;
    private double videoTimestamp;

    public class GroupCreateAdapter extends RecyclerListView.SelectionAdapter {
        private static final int VIEW_TYPE_AUTO_DELETE = 4;
        private static final int VIEW_TYPE_HEADER_CELL = 1;
        private static final int VIEW_TYPE_LAST_EMPTY_VIEW = 7;
        private static final int VIEW_TYPE_SHADOW_SECTION_CELL = 0;
        private static final int VIEW_TYPE_TEXT_INFO_CELL = 5;
        private static final int VIEW_TYPE_TEXT_SETTINGS = 3;
        private static final int VIEW_TYPE_TOPICS = 6;
        private static final int VIEW_TYPE_USER_CELL = 2;
        private Context context;
        ArrayList<InnerItem> items = new ArrayList<>();
        private int usersStartRow;

        public GroupCreateAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return this.items.get(i).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 4) {
                return true;
            }
            return viewHolder.getItemViewType() == 6 && GroupCreateFinalActivity.this.canToggleTopics;
        }

        @Override
        public void notifyDataSetChanged() {
            this.items.clear();
            this.items.add(new InnerItem(0));
            if (GroupCreateFinalActivity.this.chatType == 5) {
                this.items.add(new InnerItem(6));
                this.items.add(new InnerItem(5, LocaleController.getString(R.string.ForumToggleDescription)));
            } else {
                this.items.add(new InnerItem(4));
                this.items.add(new InnerItem(5, LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
            }
            if (GroupCreateFinalActivity.this.currentGroupCreateAddress != null) {
                this.items.add(new InnerItem(1));
                this.items.add(new InnerItem(3));
                this.items.add(new InnerItem(0));
            }
            if (GroupCreateFinalActivity.this.selectedContacts.size() > 0) {
                this.items.add(new InnerItem(1));
                this.usersStartRow = this.items.size();
                for (int i = 0; i < GroupCreateFinalActivity.this.selectedContacts.size(); i++) {
                    this.items.add(new InnerItem(2));
                }
                this.items.add(new InnerItem(7));
            }
            super.notifyDataSetChanged();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            switch (viewHolder.getItemViewType()) {
                case 1:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (GroupCreateFinalActivity.this.currentGroupCreateAddress != null && i == 1) {
                        headerCell.setText(LocaleController.getString(R.string.AttachLocation));
                    } else {
                        headerCell.setText(LocaleController.formatPluralString("Members", GroupCreateFinalActivity.this.selectedContacts.size(), new Object[0]));
                    }
                    break;
                case 2:
                    GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
                    groupCreateUserCell.setObject(GroupCreateFinalActivity.this.getMessagesController().getUser((Long) GroupCreateFinalActivity.this.selectedContacts.get(i - this.usersStartRow)), null, null);
                    groupCreateUserCell.setDrawDivider(i != this.items.size() - 1);
                    break;
                case 3:
                    ((TextSettingsCell) viewHolder.itemView).setText(GroupCreateFinalActivity.this.currentGroupCreateAddress, false);
                    break;
                case 4:
                    ((TextCell) viewHolder.itemView).setTextAndValueAndIcon(LocaleController.getString(R.string.AutoDeleteMessages), GroupCreateFinalActivity.this.ttlPeriod == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(GroupCreateFinalActivity.this.ttlPeriod), ((BaseFragment) GroupCreateFinalActivity.this).fragmentBeginToShow, R.drawable.msg_autodelete, false);
                    break;
                case 5:
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(this.items.get(i).string);
                    break;
                case 6:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    textCell.setTextAndCheckAndIcon((CharSequence) LocaleController.getString(R.string.ChannelTopics), true, R.drawable.msg_topics, false);
                    textCell.getCheckBox().setAlpha(0.75f);
                    break;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View groupCreateUserCell;
            if (i == 0) {
                shadowSectionCell = new ShadowSectionCell(this.context, null, 0);
            } else if (i != 1) {
                if (i == 2) {
                    groupCreateUserCell = new GroupCreateUserCell(0, 3, this.context, null, false, false);
                } else if (i == 4) {
                    shadowSectionCell = new TextCell(this.context);
                } else if (i == 5) {
                    shadowSectionCell = new TextInfoPrivacyCell(this.context, 24, null);
                } else if (i == 6) {
                    groupCreateUserCell = new TextCell(23, this.context, GroupCreateFinalActivity.this.getResourceProvider(), false, true);
                } else if (i != 7) {
                    shadowSectionCell = new TextSettingsCell(this.context, null, 0);
                } else {
                    View view = new View(this.context);
                    view.setTag(-33024);
                    shadowSectionCell = view;
                }
                shadowSectionCell = groupCreateUserCell;
            } else {
                HeaderCell headerCell = new HeaderCell(this.context);
                headerCell.setHeight(46);
                shadowSectionCell = headerCell;
            }
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 2) {
                ((GroupCreateUserCell) viewHolder.itemView).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public class InnerItem extends AdapterWithDiffUtils.Item {
            String string;

            public InnerItem(int i) {
                super(i, true);
            }

            public InnerItem(int i, String str) {
                super(i, true);
                this.string = str;
            }
        }
    }

    public interface GroupCreateFinalActivityDelegate {
        void didFailChatCreation();

        void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity, long j);

        void didStartChatCreation();
    }

    public GroupCreateFinalActivity(Bundle bundle) {
        super(bundle);
        this.chatType = bundle.getInt("chatType", 0);
        this.avatarDrawable = new AvatarDrawable();
        this.currentGroupCreateAddress = bundle.getString("address");
        this.currentGroupCreateLocation = (Location) bundle.getParcelable("location");
        this.forImport = bundle.getBoolean("forImport", false);
        this.nameToSet = bundle.getString("title", null);
        this.canToggleTopics = bundle.getBoolean("canToggleTopics", true);
    }

    private String getFirstNameByPos(int i) {
        return getMessagesController().getUser(this.selectedContacts.get(i)).first_name;
    }

    public static boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$2() {
        this.avatar = null;
        this.avatarBig = null;
        this.inputPhoto = null;
        this.inputVideo = null;
        this.inputVideoPath = null;
        this.inputEmojiMarkup = null;
        this.videoTimestamp = 0.0d;
        showAvatarProgress(false, true);
        this.avatarImage.setImage((ImageLocation) null, (String) null, this.avatarDrawable, (Object) null);
        this.avatarEditor.setAnimation(this.cameraDrawable);
        this.cameraDrawable.setCurrentFrame(0);
    }

    public void lambda$createView$3(DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCurrentFrame(0, false);
        } else {
            this.cameraDrawable.setCustomEndFrame(86);
            this.avatarEditor.playAnimation();
        }
    }

    public void lambda$createView$4(View view) {
        this.imageUpdater.openMenu(this.avatar != null, new IntroActivity$$ExternalSyntheticLambda5(this, 28), new OAuthSheet$$ExternalSyntheticLambda18(this, 8), 0);
        this.cameraDrawable.setCurrentFrame(0);
        this.cameraDrawable.setCustomEndFrame(43);
        this.avatarEditor.playAnimation();
    }

    public void lambda$createView$5(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.currentGroupCreateLocation.setLatitude(messageMedia.geo.lat);
        this.currentGroupCreateLocation.setLongitude(messageMedia.geo._long);
        this.currentGroupCreateAddress = messageMedia.address;
    }

    public void lambda$createView$6(View view, int i, float f, float f2) {
        if (view instanceof TextSettingsCell) {
            if (!AndroidUtilities.isMapsInstalled(this)) {
                return;
            }
            LocationActivity locationActivity = new LocationActivity(4);
            locationActivity.setDialogId(0L);
            locationActivity.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 6));
            presentFragment(locationActivity);
        }
        if (!(view instanceof TextCell) || this.chatType == 5) {
            return;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            AutoDeletePopupWrapper autoDeletePopupWrapper = new AutoDeletePopupWrapper(getContext(), null, new AutoDeletePopupWrapper.Callback() {
                @Override
                public void dismiss() {
                    GroupCreateFinalActivity.this.popupWindow.dismiss();
                }

                @Override
                public void setAutoDeleteHistory(int i2, int i3) {
                    GroupCreateFinalActivity.this.ttlPeriod = i2;
                    AndroidUtilities.updateVisibleRows(GroupCreateFinalActivity.this.listView);
                }

                @Override
                public final void showGlobalAutoDeleteScreen() {
                    AutoDeletePopupWrapper.Callback.CC.$default$showGlobalAutoDeleteScreen(this);
                }
            }, true, 1, null);
            autoDeletePopupWrapper.lambda$updateItems$7(this.ttlPeriod);
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(autoDeletePopupWrapper.windowLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.setPauseNotifications(true);
            this.popupWindow.setDismissAnimationDuration(220);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            this.popupWindow.setFocusable(true);
            autoDeletePopupWrapper.windowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.showAtLocation(getFragmentView(), 0, (int) (view.getX() + f), (int) ((autoDeletePopupWrapper.windowLayout.getMeasuredHeight() / 2.0f) + view.getY() + f2));
            this.popupWindow.dimBehind();
        }
    }

    public void lambda$createView$7(View view) {
        if (this.donePressed) {
            return;
        }
        if (this.editText.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.editText);
            return;
        }
        this.donePressed = true;
        AndroidUtilities.hideKeyboard(this.editText);
        this.editText.setEnabled(false);
        if (this.imageUpdater.isUploadingImage()) {
            this.createAfterUpload = true;
        } else {
            showEditDoneProgress(true);
            this.reqId = getMessagesController().createChat(this.editText.getText().toString(), this.selectedContacts, null, this.chatType, this.forImport, this.currentGroupCreateLocation, this.currentGroupCreateAddress, this.ttlPeriod, this);
        }
    }

    public void lambda$didUploadPhoto$8(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
            showAvatarProgress(true, false);
            return;
        }
        this.inputPhoto = inputFile;
        this.inputVideo = inputFile2;
        this.inputEmojiMarkup = videoSize;
        this.inputVideoPath = str;
        this.videoTimestamp = d;
        if (this.createAfterUpload) {
            GroupCreateFinalActivityDelegate groupCreateFinalActivityDelegate = this.delegate;
            if (groupCreateFinalActivityDelegate != null) {
                groupCreateFinalActivityDelegate.didStartChatCreation();
            }
            getMessagesController().createChat(this.editText.getText().toString(), this.selectedContacts, null, this.chatType, this.forImport, this.currentGroupCreateLocation, this.currentGroupCreateAddress, this.ttlPeriod, this);
        }
        showAvatarProgress(false, true);
        this.avatarEditor.setImageDrawable(null);
    }

    public void lambda$getThemeDescriptions$9() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof GroupCreateUserCell) {
                    ((GroupCreateUserCell) childAt).update(0);
                }
            }
        }
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.updateColors();
        }
    }

    public void lambda$onFragmentCreate$0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(this.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    private void setDefaultGroupName() {
        String string;
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        int size = this.selectedContacts.size() + 1;
        if (size < 2 || size > 5 || !TextUtils.isEmpty(this.editText.getText())) {
            return;
        }
        try {
            if (size == 2) {
                string = LocaleController.formatString("GroupCreateMembersTwo", R.string.GroupCreateMembersTwo, currentUser.first_name, getFirstNameByPos(0));
            } else if (size == 3) {
                string = LocaleController.formatString("GroupCreateMembersThree", R.string.GroupCreateMembersThree, currentUser.first_name, getFirstNameByPos(0), getFirstNameByPos(1));
            } else {
                if (size != 4) {
                    if (size != 5) {
                        string = "";
                    } else {
                        string = LocaleController.formatString("GroupCreateMembersFive", R.string.GroupCreateMembersFive, currentUser.first_name, getFirstNameByPos(0), getFirstNameByPos(1), getFirstNameByPos(2), getFirstNameByPos(3));
                    }
                    if (TextUtils.isEmpty(string)) {
                    }
                    this.editText.setText(string);
                    EditTextEmoji editTextEmoji = this.editText;
                    editTextEmoji.setSelection(0, editTextEmoji.getText().length());
                }
                string = LocaleController.formatString("GroupCreateMembersFour", R.string.GroupCreateMembersFour, currentUser.first_name, getFirstNameByPos(0), getFirstNameByPos(1), getFirstNameByPos(2));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (TextUtils.isEmpty(string)) {
            this.editText.setText(string);
            EditTextEmoji editTextEmoji2 = this.editText;
            editTextEmoji2.setSelection(0, editTextEmoji2.getText().length());
        }
    }

    private void showAvatarProgress(final boolean z, boolean z2) {
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
            RLottieImageView rLottieImageView = this.avatarEditor;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 1.0f));
        } else {
            this.avatarEditor.setVisibility(0);
            AnimatorSet animatorSet3 = this.avatarAnimation;
            RLottieImageView rLottieImageView2 = this.avatarEditor;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                GroupCreateFinalActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (GroupCreateFinalActivity.this.avatarAnimation == null || GroupCreateFinalActivity.this.avatarEditor == null) {
                    return;
                }
                if (z) {
                    GroupCreateFinalActivity.this.avatarEditor.setVisibility(4);
                } else {
                    GroupCreateFinalActivity.this.avatarProgressView.setVisibility(4);
                }
                GroupCreateFinalActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    private void showEditDoneProgress(boolean z) {
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setProgressVisible(z, true);
        }
    }

    @Override
    public final boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public View createView(Context context) {
        final int i = 0;
        final int i2 = 1;
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NewGroup));
        ActionBar actionBar = this.actionBar;
        int i3 = Theme.key_windowBackgroundGray;
        actionBar.setBackgroundColor(getThemedColor(i3));
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i4) {
                if (i4 == -1) {
                    GroupCreateFinalActivity.this.finishFragment();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int paddingTop;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int iMeasureKeyboardHeight = measureKeyboardHeight();
                int emojiPadding = (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : GroupCreateFinalActivity.this.editText.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i14 = layoutParams.gravity;
                        if (i14 == -1) {
                            i14 = 51;
                        }
                        int i15 = i14 & 112;
                        int i16 = i14 & 7;
                        if (i16 != 1) {
                            if (i16 != 5) {
                                i10 = layoutParams.leftMargin;
                            } else {
                                i8 = i6 - measuredWidth;
                                i9 = layoutParams.rightMargin;
                            }
                            if (i15 != 16) {
                                if (i15 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i15 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i11 = ((i7 - emojiPadding) - i5) - measuredHeight3;
                                    i12 = layoutParams.bottomMargin;
                                }
                                if (GroupCreateFinalActivity.this.editText != null && GroupCreateFinalActivity.this.editText.isPopupView(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i10, paddingTop, measuredWidth + i10, measuredHeight3 + paddingTop);
                            } else {
                                i11 = ((((i7 - emojiPadding) - i5) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i12 = layoutParams.bottomMargin;
                            }
                            paddingTop = i11 - i12;
                            if (GroupCreateFinalActivity.this.editText != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i10, paddingTop, measuredWidth + i10, measuredHeight3 + paddingTop);
                        } else {
                            i8 = (((i6 - i4) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i9 = layoutParams.rightMargin;
                        }
                        i10 = i8 - i9;
                        if (i15 != 16) {
                            if (i15 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i15 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i11 = ((i7 - emojiPadding) - i5) - measuredHeight3;
                                i12 = layoutParams.bottomMargin;
                            }
                            if (GroupCreateFinalActivity.this.editText != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i10, paddingTop, measuredWidth + i10, measuredHeight3 + paddingTop);
                        } else {
                            i11 = ((((i7 - emojiPadding) - i5) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i12 = layoutParams.bottomMargin;
                        }
                        paddingTop = i11 - i12;
                        if (GroupCreateFinalActivity.this.editText != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i10, paddingTop, measuredWidth + i10, measuredHeight3 + paddingTop);
                    }
                }
                notifyHeightChanged();
            }

            @Override
            public void onMeasure(int i4, int i5) {
                int size = View.MeasureSpec.getSize(i4);
                int size2 = View.MeasureSpec.getSize(i5);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) GroupCreateFinalActivity.this).actionBar, i4, 0, i5, 0);
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && !GroupCreateFinalActivity.this.editText.isPopupShowing()) {
                    this.ignoreLayout = true;
                    GroupCreateFinalActivity.this.editText.hideEmojiView();
                    this.ignoreLayout = false;
                }
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) GroupCreateFinalActivity.this).actionBar) {
                        if (GroupCreateFinalActivity.this.editText == null || !GroupCreateFinalActivity.this.editText.isPopupView(childAt)) {
                            measureChildWithMargins(childAt, i4, 0, i5, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(i3));
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(16));
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (view == GroupCreateFinalActivity.this.listView && GroupCreateFinalActivity.this.shadowDrawable != null) {
                    int measuredHeight = GroupCreateFinalActivity.this.editTextContainer.getMeasuredHeight();
                    GroupCreateFinalActivity.this.shadowDrawable.setBounds(0, measuredHeight, getMeasuredWidth(), GroupCreateFinalActivity.this.shadowDrawable.getIntrinsicHeight() + measuredHeight);
                    GroupCreateFinalActivity.this.shadowDrawable.draw(canvas);
                }
                return zDrawChild;
            }
        };
        linearLayout.setOrientation(1);
        sizeNotifierFrameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.editTextContainer = frameLayout;
        frameLayout.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), getThemedColor(Theme.key_windowBackgroundWhite)));
        linearLayout.addView(this.editTextContainer, LayoutHelper.createLinear(-1, -2, 9.0f, 0.0f, 9.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context) {
            @Override
            public void invalidate() {
                if (GroupCreateFinalActivity.this.avatarOverlay != null) {
                    GroupCreateFinalActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate();
            }

            @Override
            public void invalidate(int i4, int i5, int i6, int i7) {
                if (GroupCreateFinalActivity.this.avatarOverlay != null) {
                    GroupCreateFinalActivity.this.avatarOverlay.invalidate();
                }
                super.invalidate(i4, i5, i6, i7);
            }
        };
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(this.chatType == 5 ? 16.0f : 32.0f));
        this.avatarDrawable.setInfo(5L, null, null);
        this.avatarImage.setImageDrawable(this.avatarDrawable);
        this.avatarImage.setContentDescription(LocaleController.getString(R.string.ChoosePhoto));
        FrameLayout frameLayout2 = this.editTextContainer;
        BackupImageView backupImageView2 = this.avatarImage;
        boolean z = LocaleController.isRTL;
        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(64, 64.0f, (z ? 5 : 3) | 48, z ? 0.0f : 16.0f, 16.0f, z ? 16.0f : 0.0f, 16.0f));
        final Paint paint = new Paint(1);
        paint.setColor(1426063360);
        View view = new View(context) {
            @Override
            public void onDraw(Canvas canvas) {
                if (GroupCreateFinalActivity.this.avatarImage != null && GroupCreateFinalActivity.this.avatarProgressView.getVisibility() == 0 && GroupCreateFinalActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                    paint.setAlpha((int) (GroupCreateFinalActivity.this.avatarProgressView.getAlpha() * GroupCreateFinalActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            }
        };
        this.avatarOverlay = view;
        FrameLayout frameLayout3 = this.editTextContainer;
        boolean z2 = LocaleController.isRTL;
        frameLayout3.addView(view, LayoutHelper.createFrame(64, 64.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 16.0f, z2 ? 16.0f : 0.0f, 16.0f));
        this.avatarOverlay.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCreateFinalActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$4(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$7(view2);
                        break;
                }
            }
        });
        int i4 = R.raw.camera;
        this.cameraDrawable = new RLottieDrawable(i4, Fragment$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        RLottieImageView rLottieImageView = new RLottieImageView(context) {
            @Override
            public void invalidate(int i5, int i6, int i7, int i8) {
                super.invalidate(i5, i6, i7, i8);
                GroupCreateFinalActivity.this.avatarOverlay.invalidate();
            }

            @Override
            public void invalidate() {
                super.invalidate();
                GroupCreateFinalActivity.this.avatarOverlay.invalidate();
            }
        };
        this.avatarEditor = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.avatarEditor.setAnimation(this.cameraDrawable);
        this.avatarEditor.setEnabled(false);
        this.avatarEditor.setClickable(false);
        this.avatarEditor.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
        FrameLayout frameLayout4 = this.editTextContainer;
        RLottieImageView rLottieImageView2 = this.avatarEditor;
        boolean z3 = LocaleController.isRTL;
        frameLayout4.addView(rLottieImageView2, LayoutHelper.createFrame(64, 64.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 15.0f, 16.0f, z3 ? 15.0f : 0.0f, 16.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                GroupCreateFinalActivity.this.avatarOverlay.invalidate();
            }
        };
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        FrameLayout frameLayout5 = this.editTextContainer;
        RadialProgressView radialProgressView2 = this.avatarProgressView;
        boolean z4 = LocaleController.isRTL;
        frameLayout5.addView(radialProgressView2, LayoutHelper.createFrame(64, 64.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 16.0f, 16.0f, z4 ? 16.0f : 0.0f, 16.0f));
        showAvatarProgress(false, false);
        EditTextEmoji editTextEmoji2 = new EditTextEmoji(context, sizeNotifierFrameLayout, this, 0, false);
        this.editText = editTextEmoji2;
        int i5 = this.chatType;
        editTextEmoji2.setHint(LocaleController.getString((i5 == 0 || i5 == 4 || i5 == 5) ? R.string.EnterGroupNamePlaceholder : R.string.EnterListName));
        String str = this.nameToSet;
        if (str != null) {
            this.editText.setText(str);
            EditTextEmoji editTextEmoji3 = this.editText;
            editTextEmoji3.setSelection(editTextEmoji3.getText().length());
            this.nameToSet = null;
        }
        setDefaultGroupName();
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout6 = this.editTextContainer;
        EditTextEmoji editTextEmoji4 = this.editText;
        boolean z5 = LocaleController.isRTL;
        frameLayout6.addView(editTextEmoji4, LayoutHelper.createFrame(-1, -2.0f, 16, z5 ? 5.0f : 96.0f, 0.0f, z5 ? 96.0f : 5.0f, 0.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.linearLayoutManager = new FillLastLinearLayoutManager(context, 1, this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        GroupCreateAdapter groupCreateAdapter = new GroupCreateAdapter(context);
        this.adapter = groupCreateAdapter;
        recyclerListView2.setAdapter(groupCreateAdapter);
        this.listView.setLayoutManager(this.linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, -1));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                if (i6 == 1) {
                    AndroidUtilities.hideKeyboard(GroupCreateFinalActivity.this.editText);
                }
            }
        });
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda4(this, 25));
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        VerticalPositionAutoAnimator.attach(fragmentFloatingButton);
        sizeNotifierFrameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCreateFinalActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$4(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$7(view2);
                        break;
                }
            }
        });
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Done));
        this.floatingButton.imageView.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
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
            showEditDoneProgress(false);
            EditTextEmoji editTextEmoji = this.editText;
            if (editTextEmoji != null) {
                editTextEmoji.setEnabled(true);
            }
            GroupCreateFinalActivityDelegate groupCreateFinalActivityDelegate = this.delegate;
            if (groupCreateFinalActivityDelegate != null) {
                groupCreateFinalActivityDelegate.didFailChatCreation();
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatDidCreated) {
            this.reqId = 0;
            long jLongValue = ((Long) objArr[0]).longValue();
            GroupCreateFinalActivityDelegate groupCreateFinalActivityDelegate2 = this.delegate;
            if (groupCreateFinalActivityDelegate2 != null) {
                groupCreateFinalActivityDelegate2.didFinishChatCreation(this, jLongValue);
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
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ChatEditActivity$$ExternalSyntheticLambda50(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    @Override
    public void dismissCurrentDialog() {
        if (this.imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        return this.imageUpdater.dismissDialogOnPause(dialog) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return this.editText.getText().toString();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 18);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GroupCreateUserCell.class}, null, Theme.avatarDrawables, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.editText, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        return arrayList;
    }

    @Override
    public boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    @Override
    public boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji == null || !editTextEmoji.isPopupShowing()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        this.editText.hidePopup(true);
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        GroupCreateFinalActivity groupCreateFinalActivity;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        ImageUpdater imageUpdater = new ImageUpdater(true, 2, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.parentFragment = this;
        imageUpdater.setDelegate(this);
        long[] longArray = getArguments().getLongArray("result");
        int i = 0;
        if (longArray != null) {
            this.selectedContacts = new ArrayList<>(longArray.length);
            int iM = 0;
            while (iM < longArray.length) {
                iM = MessagesController$$ExternalSyntheticOutline2.m(longArray[iM], this.selectedContacts, iM, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            Long l = this.selectedContacts.get(i2);
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
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ChatActivity$$ExternalSyntheticLambda5(29, groupCreateFinalActivity, arrayList2, arrayList, countDownLatch));
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
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.imageUpdater.clear();
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
    public void onPause() {
        super.onPause();
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onPause();
        }
        this.imageUpdater.onPause();
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public void onResume() {
        super.onResume();
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null) {
            editTextEmoji.onResume();
        }
        GroupCreateAdapter groupCreateAdapter = this.adapter;
        if (groupCreateAdapter != null) {
            groupCreateAdapter.notifyDataSetChanged();
        }
        this.imageUpdater.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.editText.openKeyboard();
        }
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
    public void restoreSelfArgs(Bundle bundle) {
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
    public void saveSelfArgs(Bundle bundle) {
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

    public void setDelegate(GroupCreateFinalActivityDelegate groupCreateFinalActivityDelegate) {
        this.delegate = groupCreateFinalActivityDelegate;
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }
}
