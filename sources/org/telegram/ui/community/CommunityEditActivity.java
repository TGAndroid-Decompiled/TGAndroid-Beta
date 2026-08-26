package org.telegram.ui.community;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda31;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda76;
import org.telegram.ui.SettingsActivity$$ExternalSyntheticLambda21;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;
import org.telegram.ui.web.WebActionBar;

public final class CommunityEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final BoolAnimator animatorDoneVisible;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public AvatarDrawable avatarDrawable;
    public BackupImageView avatarImage;
    public ChatActivity.AnonymousClass27 avatarOverlay;
    public RadialProgressView avatarProgressView;
    public boolean canAllManageLinkedPeers;
    public boolean canAllManageLinkedPeersOriginal;
    public CommunityHeaderView communityHeaderView;
    public long communityId;
    public String communityNameOriginal;
    public GroupCreateActivity.AnonymousClass7 containerView;
    public TLRPC.Chat currentChat;
    public IntroActivity.AnonymousClass4 doneItem;
    public LoginActivity.AnonymousClass4 editTextCell;
    public ImageUpdater imageUpdater;
    public TLRPC.ChatFull info;
    public UniversalRecyclerView listView;
    public final AlertDialog[] progressDialog;
    public final AnonymousClass6 provider;

    public final class CommunityHeaderView extends FrameLayout implements Theme.Colorable {
        public final BackupImageView avatarView;

        public CommunityHeaderView(Context context) {
            super(context);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView, LayoutHelper.createFrame(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            Drawable drawable = Theme.dialogs_communityCardsDrawable;
            BackupImageView backupImageView = this.avatarView;
            DrawableUtils.drawCommunityCardDrawable(canvas, drawable, (backupImageView.getWidth() / 2.0f) + backupImageView.getLeft(), (backupImageView.getHeight() / 2.0f) + backupImageView.getTop(), backupImageView.getHeight());
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
        }

        @Override
        public final void updateColors$1() {
        }
    }

    public CommunityEditActivity(Bundle bundle) {
        super(bundle);
        this.animatorDoneVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, false);
        this.progressDialog = new AlertDialog[1];
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public final boolean canLoadMoreAvatars() {
                return false;
            }

            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                TLRPC.FileLocation fileLocation2;
                TLRPC.ChatPhoto chatPhoto;
                if (fileLocation != null) {
                    CommunityEditActivity communityEditActivity = CommunityEditActivity.this;
                    TLRPC.Chat chat = communityEditActivity.getMessagesController().getChat(Long.valueOf(communityEditActivity.communityId));
                    if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                        fileLocation2 = null;
                    }
                    if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                        int[] iArr = new int[2];
                        communityEditActivity.avatarImage.getLocationInWindow(iArr);
                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1];
                        BackupImageView backupImageView = communityEditActivity.avatarImage;
                        placeProviderObject.parentView = backupImageView;
                        ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                        placeProviderObject.imageReceiver = imageReceiver;
                        placeProviderObject.dialogId = -communityEditActivity.communityId;
                        placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                        placeProviderObject.size = -1L;
                        placeProviderObject.radius = communityEditActivity.avatarImage.getImageReceiver().getRoundRadius(true);
                        placeProviderObject.scale = 1.0f;
                        placeProviderObject.canEdit = true;
                        return placeProviderObject;
                    }
                }
                return null;
            }

            @Override
            public final int getTotalImageCount() {
                return 1;
            }

            @Override
            public final void openPhotoForEdit(String str, String str2, boolean z) {
                CommunityEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, z);
            }

            @Override
            public final void willHidePhotoViewer() {
                CommunityEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
            }
        };
    }

    @Override
    public final boolean canFinishFragment() {
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 8));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.actionBar.setupGlass(new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor), BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider), false);
        this.actionBar.glassOnlyBack = true;
        GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(this, context);
        this.containerView = anonymousClass7;
        anonymousClass7.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.avatarDrawable = new AvatarDrawable(this.currentChat);
        CommunityHeaderView communityHeaderView = new CommunityHeaderView(context);
        this.communityHeaderView = communityHeaderView;
        BackupImageView backupImageView = communityHeaderView.avatarView;
        backupImageView.imageReceiver.setForUserOrChat(this.currentChat, this.avatarDrawable);
        backupImageView.onNewImageSet();
        this.avatarImage = this.communityHeaderView.avatarView;
        String name = DialogObject.getName(this.currentChat);
        this.communityNameOriginal = name;
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(context, this.resourceProvider);
        this.editTextCell = anonymousClass4;
        ((WebActionBar.AnonymousClass4) anonymousClass4.this$0).setText(name);
        ((WebActionBar.AnonymousClass4) this.editTextCell.this$0).setSelection(name.length());
        ((WebActionBar.AnonymousClass4) this.editTextCell.this$0).addTextChangedListener(new WebActionBar.AnonymousClass5(this, 7));
        IntroActivity.AnonymousClass4 anonymousClass5 = new IntroActivity.AnonymousClass4(this, context);
        this.doneItem = anonymousClass5;
        anonymousClass5.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        this.doneItem.setText(LocaleController.getString(R.string.Save));
        this.doneItem.setTypeface(AndroidUtilities.bold());
        this.doneItem.setTextSize(1, 14.0f);
        this.doneItem.setGravity(17);
        this.doneItem.setVisibility(8);
        this.doneItem.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.doneItem.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 6));
        ScaleStateListAnimator.apply(this.doneItem, 0.1f, 1.5f);
        this.actionBar.addView(this.doneItem, LayoutHelper.createFrame(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context);
        this.avatarOverlay = anonymousClass27;
        this.communityHeaderView.addView(anonymousClass27, LayoutHelper.createFrame(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.communityHeaderView.addView(this.avatarProgressView, LayoutHelper.createFrame(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        showAvatarProgress$6(false, false);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new CommunityEditActivity$$ExternalSyntheticLambda1(this, 0), new CommunityEditActivity$$ExternalSyntheticLambda2(this), new CommunityEditActivity$$ExternalSyntheticLambda2(this), getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        UniversalRecyclerView universalRecyclerView2 = this.listView;
        universalRecyclerView2.adapter.applyBackground = false;
        universalRecyclerView2.setSections();
        this.actionBar.setBackground(null);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        GroupCreateActivity.AnonymousClass7 anonymousClass8 = this.containerView;
        CommunityEditActivity$$ExternalSyntheticLambda2 communityEditActivity$$ExternalSyntheticLambda2 = new CommunityEditActivity$$ExternalSyntheticLambda2(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass8, communityEditActivity$$ExternalSyntheticLambda2);
        GroupCreateActivity.AnonymousClass7 anonymousClass9 = this.containerView;
        this.fragmentView = anonymousClass9;
        return anonymousClass9;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.info = chatFull;
                this.listView.adapter.update(true);
            }
        }
    }

    @Override
    public final void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void didUploadFailed() {
    }

    @Override
    public final void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda76(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
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
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((WebActionBar.AnonymousClass4) this.editTextCell.this$0).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$onLongClick$4(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new CommunityEditActivity$$ExternalSyntheticLambda1(this, 1));
    }

    public final void lambda$openSetPhotoAlert$7() {
        this.avatar = null;
        MessagesController.getInstance(this.currentAccount).changeChatAvatar(this.communityId, null, null, null, null, 0.0d, null, null, null, null);
        showAvatarProgress$6(false, true);
        this.avatarImage.setImage(null, null, this.avatarDrawable, this.currentChat);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    public final void onClick$12(UItem uItem) throws Throwable {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i = uItem.id;
        if (i == 140) {
            if (this.imageUpdater.isUploadingImage() || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.communityId))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation forPhoto = null;
            PhotoViewer.getInstance().setParentActivity(null, this, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i2 = chatPhoto2.dc_id;
            if (i2 != 0) {
                chatPhoto2.photo_big.dc_id = i2;
            }
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    forPhoto = ImageLocation.getForPhoto(this.info.chat_photo.video_sizes.get(0), this.info.chat_photo);
                }
            }
            PhotoViewer.getInstance().openPhoto(null, chat.photo.photo_big, null, forPhoto, null, null, null, 0, this.provider, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i == 141) {
            this.imageUpdater.openMenu(this.avatar != null, new CommunityEditActivity$$ExternalSyntheticLambda6(this, 1), new SettingsActivity$$ExternalSyntheticLambda21(0), 0);
            return;
        }
        if (i == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.communityId);
            bundle.putInt("type", 1);
            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
            chatUsersActivity.setInfo(this.info);
            presentFragment(chatUsersActivity);
            return;
        }
        if (i == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", this.communityId);
            bundle2.putInt("type", 0);
            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
            chatUsersActivity2.setInfo(this.info);
            presentFragment(chatUsersActivity2);
            return;
        }
        if (i == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", this.communityId);
            presentFragment(new CommunityPendingRequestsActivity(bundle3));
            return;
        }
        if (i == 150) {
            setAllowedManageLinkedPeers(true);
            return;
        }
        if (i == 151) {
            setAllowedManageLinkedPeers(false);
            return;
        }
        if (i == 145) {
            AlertsCreator.createClearOrDeleteDialogAlert(this, false, this.currentChat, null, false, true, true, false, new CommunityEditActivity$$ExternalSyntheticLambda2(this));
            return;
        }
        if (i == 146) {
            CommunityUtils.showChatsToAddToCommunity(this.progressDialog, this, this.currentAccount, this.currentChat);
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            presentFragment(ChatActivity.of(-((TLRPC.Chat) obj).id));
        } else if (obj instanceof TLRPC.User) {
            presentFragment(ChatActivity.of(((TLRPC.User) obj).id));
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.doneItem.setAlpha(f);
        this.doneItem.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f));
        this.doneItem.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f));
        this.doneItem.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.communityId = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.communityId));
        this.currentChat = chat;
        boolean z = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.canAllManageLinkedPeersOriginal = z;
        this.canAllManageLinkedPeers = z;
        this.info = getMessagesController().getChatFull(this.communityId);
        ImageUpdater imageUpdater = new ImageUpdater(3, true, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.parentFragment = this;
        imageUpdater.delegate = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear$1();
        }
    }

    public final boolean onLongClick$6(UItem uItem, View view) {
        long j;
        boolean zCanRemoveBotFromCommunity;
        boolean z;
        boolean z2;
        int i;
        Object obj = uItem.object;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j = user.id;
                boolean zIsBot = UserObject.isBot(user);
                zCanRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, this.currentChat);
                z = zIsBot;
                z2 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j = -chat.id;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        zCanRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, this.currentChat);
        z2 = zIsChannelAndNotMegaGroup;
        z = false;
        long j2 = j;
        int communityChatType = CommunityUtils.getCommunityChatType(this.currentAccount, j2);
        boolean z3 = communityChatType == 1 || communityChatType == 2;
        if (zCanRemoveBotFromCommunity || z3) {
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, null, view);
            int i2 = R.drawable.msg_viewintopic;
            if (z) {
                i = R.string.CommunityMenuViewBot;
            } else {
                i = z2 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup;
            }
            itemOptionsMakeOptions.addIf(i2, LocaleController.getString(i), new CommunityEditActivity$$ExternalSyntheticLambda7(this, j2, 0), z3);
            int i3 = R.drawable.msg_cancel;
            String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
            ChatActivity$$ExternalSyntheticLambda31 chatActivity$$ExternalSyntheticLambda31 = new ChatActivity$$ExternalSyntheticLambda31(this, z, z2, j2, 2);
            if (zCanRemoveBotFromCommunity) {
                itemOptionsMakeOptions.add(i3, string, chatActivity$$ExternalSyntheticLambda31, true);
            }
            itemOptionsMakeOptions.setScrimViewBackground(this.listView.getClipBackground(view, true));
            itemOptionsMakeOptions.show();
            return true;
        }
        return false;
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
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
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

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null && (str = imageUpdater.currentPicturePath) != null) {
            bundle.putString("path", str);
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.editTextCell;
        if (anonymousClass4 != null) {
            String string = ((WebActionBar.AnonymousClass4) anonymousClass4.this$0).getText().toString();
            if (string.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", string);
        }
    }

    public final void setAllowedManageLinkedPeers(boolean z) {
        if (this.canAllManageLinkedPeers == z) {
            return;
        }
        RadioButtonCell radioButtonCell = (RadioButtonCell) this.listView.findViewByItemId(151);
        if (radioButtonCell != null) {
            radioButtonCell.radioButton.setChecked(!z, true);
        }
        RadioButtonCell radioButtonCell2 = (RadioButtonCell) this.listView.findViewByItemId(150);
        if (radioButtonCell2 != null) {
            radioButtonCell2.radioButton.setChecked(z, true);
        }
        this.canAllManageLinkedPeers = z;
        this.animatorDoneVisible.setValue((this.canAllManageLinkedPeersOriginal == z && TextUtils.equals(((WebActionBar.AnonymousClass4) this.editTextCell.this$0).getText().toString(), this.communityNameOriginal)) ? false : true, true);
    }

    public final void showAvatarProgress$6(boolean z, boolean z2) {
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
        this.avatarAnimation.addListener(new TodoItemMenu.AnonymousClass15(16, this, z));
        this.avatarAnimation.start();
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }
}
