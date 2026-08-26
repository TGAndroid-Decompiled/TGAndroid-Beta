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
import com.google.android.gms.internal.mlkit_vision_common.zzki;
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
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda484;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.PlayPauseButton;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebActionBar;

public final class CommunityEditActivity extends BaseFragment implements ImageUpdater.ImageUpdaterDelegate, NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final BoolAnimator animatorDoneVisible;
    public TLRPC.FileLocation avatar;
    public AnimatorSet avatarAnimation;
    public AvatarDrawable avatarDrawable;
    public BackupImageView avatarImage;
    public PlayPauseButton avatarOverlay;
    public RadialProgressView avatarProgressView;
    public boolean canAllManageLinkedPeers;
    public boolean canAllManageLinkedPeersOriginal;
    public CommunityHeaderView communityHeaderView;
    public long communityId;
    public String communityNameOriginal;
    public StealthModeAlert.ItemCell containerView;
    public TLRPC.Chat currentChat;
    public RichTextCell.AnonymousClass1 doneItem;
    public ChatLoadingCell.AnonymousClass1 editTextCell;
    public ImageUpdater imageUpdater;
    public TLRPC.ChatFull info;
    public UniversalRecyclerView listView;
    public final AlertDialog[] progressDialog;
    public final AnonymousClass6 provider;

    public final class CommunityHeaderView extends FrameLayout implements Theme.Colorable {
        public final BackupImageView avatarView;
        public final Theme.ResourcesProvider resourcesProvider;

        public CommunityHeaderView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
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
        public final void updateColors() {
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
                if (fileLocation == null) {
                    return null;
                }
                CommunityEditActivity communityEditActivity = CommunityEditActivity.this;
                TLRPC.Chat chat = communityEditActivity.getMessagesController().getChat(Long.valueOf(communityEditActivity.communityId));
                if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                if (fileLocation2 == null || fileLocation2.local_id != fileLocation.local_id || fileLocation2.volume_id != fileLocation.volume_id || fileLocation2.dc_id != fileLocation.dc_id) {
                    return null;
                }
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

            @Override
            public final int getTotalImageCount() {
                return 1;
            }

            @Override
            public final boolean onDeletePhoto(int i) {
                return true;
            }

            @Override
            public final void openPhotoForEdit(String str, String str2, boolean z) {
                CommunityEditActivity.this.imageUpdater.openPhotoForEdit(str, str2, 0, z);
            }

            @Override
            public final void willHidePhotoViewer() {
                CommunityEditActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
            }
        };
    }

    @Override
    public final boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 19));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.actionBar.setupGlass(new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor), BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider));
        this.actionBar.setGlassOnlyBack();
        StealthModeAlert.ItemCell itemCell = new StealthModeAlert.ItemCell(this, context);
        this.containerView = itemCell;
        itemCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.avatarDrawable = new AvatarDrawable(this.currentChat);
        CommunityHeaderView communityHeaderView = new CommunityHeaderView(context, this.resourceProvider);
        this.communityHeaderView = communityHeaderView;
        communityHeaderView.avatarView.setForUserOrChat(this.currentChat, this.avatarDrawable);
        this.avatarImage = this.communityHeaderView.avatarView;
        String name = DialogObject.getName(this.currentChat);
        this.communityNameOriginal = name;
        ChatLoadingCell.AnonymousClass1 anonymousClass1 = new ChatLoadingCell.AnonymousClass1(context, this.resourceProvider, 10);
        this.editTextCell = anonymousClass1;
        ((WebActionBar.AnonymousClass4) anonymousClass1.this$0).setText(name);
        ((WebActionBar.AnonymousClass4) this.editTextCell.this$0).setSelection(name.length());
        ((WebActionBar.AnonymousClass4) this.editTextCell.this$0).addTextChangedListener(new WebActionBar.AnonymousClass5(this, 8));
        RichTextCell.AnonymousClass1 anonymousClass2 = new RichTextCell.AnonymousClass1(this, context);
        this.doneItem = anonymousClass2;
        anonymousClass2.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        this.doneItem.setText(LocaleController.getString(R.string.Save));
        this.doneItem.setTypeface(AndroidUtilities.bold());
        this.doneItem.setTextSize(1, 14.0f);
        this.doneItem.setGravity(17);
        this.doneItem.setVisibility(8);
        this.doneItem.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.doneItem.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 24));
        ScaleStateListAnimator.apply(this.doneItem);
        this.actionBar.addView(this.doneItem, LayoutHelper.createFrame(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        PlayPauseButton playPauseButton = new PlayPauseButton(this, context);
        this.avatarOverlay = playPauseButton;
        this.communityHeaderView.addView(playPauseButton, LayoutHelper.createFrame(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(false);
        this.communityHeaderView.addView(this.avatarProgressView, LayoutHelper.createFrame(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        showAvatarProgress(false, false);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new CommunityEditActivity$$ExternalSyntheticLambda1(this, 0), new CommunityEditActivity$$ExternalSyntheticLambda2(this), new CommunityEditActivity$$ExternalSyntheticLambda2(this));
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        this.listView.adapter.setApplyBackground(false);
        this.listView.setSections();
        this.actionBar.setBackground(null);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        StealthModeAlert.ItemCell itemCell2 = this.containerView;
        CommunityEditActivity$$ExternalSyntheticLambda2 communityEditActivity$$ExternalSyntheticLambda2 = new CommunityEditActivity$$ExternalSyntheticLambda2(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(itemCell2, communityEditActivity$$ExternalSyntheticLambda2);
        StealthModeAlert.ItemCell itemCell3 = this.containerView;
        this.fragmentView = itemCell3;
        return itemCell3;
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
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public final void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                boolean z2;
                CommunityEditActivity communityEditActivity = this.f$0;
                communityEditActivity.getClass();
                TLRPC.PhotoSize photoSize3 = photoSize2;
                TLRPC.FileLocation fileLocation = photoSize3.location;
                communityEditActivity.avatar = fileLocation;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    communityEditActivity.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", communityEditActivity.avatarDrawable, communityEditActivity.currentChat);
                    communityEditActivity.showAvatarProgress(true, false);
                    z2 = true;
                } else {
                    z2 = true;
                    communityEditActivity.getMessagesController().changeChatAvatar(communityEditActivity.communityId, null, inputFile3, inputFile4, videoSize2, d, str, photoSize3.location, photoSize.location, null);
                    communityEditActivity.showAvatarProgress(false, true);
                }
                communityEditActivity.listView.adapter.update(z2);
            }
        });
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
        return this.imageUpdater.dismissDialogOnPause(dialog) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
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
        showAvatarProgress(false, true);
        this.avatarImage.setImage((ImageLocation) null, (String) null, this.avatarDrawable, this.currentChat);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.imageUpdater.onActivityResult(i, i2, intent);
    }

    public final void onClick$9(UItem uItem) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        ImageLocation forPhoto;
        int i = uItem.id;
        if (i == 140) {
            if (this.imageUpdater.isUploadingImage() || (chatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.communityId))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(this);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i2 = chatPhoto2.dc_id;
            if (i2 != 0) {
                chatPhoto2.photo_big.dc_id = i2;
            }
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if (!(photo instanceof TLRPC.TL_photo) || photo.video_sizes.isEmpty()) {
                    forPhoto = null;
                } else {
                    forPhoto = ImageLocation.getForPhoto(this.info.chat_photo.video_sizes.get(0), this.info.chat_photo);
                }
            } else {
                forPhoto = null;
            }
            PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, forPhoto, this.provider);
            return;
        }
        if (i == 141) {
            this.imageUpdater.openMenu(this.avatar != null, new CommunityEditActivity$$ExternalSyntheticLambda6(this, 1), new EmojiBottomSheet$$ExternalSyntheticLambda4(2), 0);
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
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
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
        ImageUpdater imageUpdater = new ImageUpdater(true, 3, true);
        this.imageUpdater = imageUpdater;
        imageUpdater.parentFragment = this;
        imageUpdater.setDelegate(this);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
    }

    public final boolean onLongClick$3(UItem uItem, View view) {
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
        boolean z3 = zCanRemoveBotFromCommunity;
        long j2 = j;
        int communityChatType = CommunityUtils.getCommunityChatType(this.currentAccount, j2);
        boolean z4 = communityChatType == 1 || communityChatType == 2;
        if (z3 || z4) {
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, view);
            int i2 = R.drawable.msg_viewintopic;
            if (z) {
                i = R.string.CommunityMenuViewBot;
            } else {
                i = z2 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup;
            }
            itemOptionsMakeOptions.addIf(z4, i2, LocaleController.getString(i), new CommunityEditActivity$$ExternalSyntheticLambda7(this, j2, 0));
            itemOptionsMakeOptions.addIf(z3, R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, (Runnable) new ChatActivity$$ExternalSyntheticLambda484(this, z, z2, j2, 2));
            itemOptionsMakeOptions.setScrimViewBackground(this.listView.getClipBackground(view, true));
            itemOptionsMakeOptions.show();
            return true;
        }
        return false;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.imageUpdater.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.imageUpdater.onResume();
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
        ChatLoadingCell.AnonymousClass1 anonymousClass1 = this.editTextCell;
        if (anonymousClass1 != null) {
            String string = ((WebActionBar.AnonymousClass4) anonymousClass1.this$0).getText().toString();
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

    public final void showAvatarProgress(boolean z, boolean z2) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<PlayPauseButton, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.avatarProgressView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.avatarOverlay, (Property<PlayPauseButton, Float>) property2, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new StoryViewer.AnonymousClass7(this, z, 20));
        this.avatarAnimation.start();
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }
}
