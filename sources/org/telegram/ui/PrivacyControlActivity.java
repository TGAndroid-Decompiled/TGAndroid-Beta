package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public class PrivacyControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    private int alwaysShareRow;
    private TLRPC.PhotoSize avatarForRest;
    private TLRPC.Photo avatarForRestPhoto;
    private RLottieDrawable cameraDrawable;
    private boolean currentGiftChannelsValue;
    private boolean currentGiftIconValue;
    private boolean currentGiftLimitedValue;
    private boolean currentGiftPremiumValue;
    private boolean currentGiftUniqueValue;
    private boolean currentGiftUnlimitedValue;
    private ArrayList currentMinus;
    private int currentPhotoForRestRow;
    private ArrayList currentPlus;
    private final boolean[] currentPlusChannels;
    private final boolean[] currentPlusMiniapps;
    private final boolean[] currentPlusPremium;
    private boolean currentReadValue;
    private long currentStars;
    private int currentSubType;
    private int currentType;
    private int detailRow;
    private int detailRow2;
    private View doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private int everybodyRow;
    private int giftTypeChannelsRow;
    private int giftTypeLimitedRow;
    private int giftTypePremiumRow;
    private int giftTypeUniqueRow;
    private int giftTypeUnlimitedRow;
    private int giftTypesHeaderRow;
    private int giftTypesInfoRow;
    ImageUpdater imageUpdater;
    private ArrayList initialMinus;
    private ArrayList initialPlus;
    private final boolean[] initialPlusChannels;
    private final boolean[] initialPlusMiniapps;
    private final boolean[] initialPlusPremium;
    private int initialRulesSubType;
    private int initialRulesType;
    private long initialStars;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private CharSequence lockSpan;
    private MessageCell messageCell;
    private int messageRow;
    private int myContactsRow;
    private int neverShareRow;
    private int nobodyRow;
    private BackupImageView oldAvatarView;
    private TextCell oldPhotoCell;
    private int p2pDetailRow;
    private int p2pRow;
    private int p2pSectionRow;
    private int payRow;
    private int phoneContactsRow;
    private int phoneDetailRow;
    private int phoneEverybodyRow;
    private int phoneSectionRow;
    private int photoForRestDescriptionRow;
    private int photoForRestRow;
    private boolean prevSubtypeContacts;
    private int priceButtonRow;
    private int priceHeaderRow;
    private int priceInfoRow;
    private int priceRow;
    private int readDetailRow;
    private int readPremiumDetailRow;
    private int readPremiumRow;
    private int readRow;
    private int rowCount;
    private int rulesType;
    private int sectionRow;
    private boolean selectedGiftChannelsValue;
    private boolean selectedGiftIconValue;
    private boolean selectedGiftLimitedValue;
    private boolean selectedGiftPremiumValue;
    private boolean selectedGiftUniqueValue;
    private boolean selectedGiftUnlimitedValue;
    private boolean selectedReadValue;
    private TextCell setAvatarCell;
    private int setBirthdayRow;
    private int shakeDp;
    private int shareDetailRow;
    private int shareSectionRow;
    private int showGiftIconInfoRow;
    private int showGiftIconRow;

    public static void lambda$createView$4() {
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onUploadProgressChanged(float f) {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$2(photoSize2, inputFile, inputFile2, d, videoSize, photoSize);
            }
        });
    }

    public void lambda$didUploadPhoto$2(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2) {
        this.avatarForRest = photoSize;
        this.avatarForRestPhoto = null;
        updateAvatarForRestInfo();
        if (inputFile != null || inputFile2 != null) {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            tL_photos_uploadProfilePhoto.fallback = true;
            tL_photos_uploadProfilePhoto.flags |= 8;
            getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$didUploadPhoto$1(tLObject, tL_error);
                }
            });
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            tL_user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_small = photoSize.location;
            tL_userProfilePhoto.photo_big = photoSize2.location;
            tL_user.first_name = getUserConfig().getCurrentUser().first_name;
            tL_user.last_name = getUserConfig().getCurrentUser().last_name;
            tL_user.access_hash = getUserConfig().getCurrentUser().access_hash;
            BulletinFactory.of(this).createUsersBulletin(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip)).show();
        }
        updateRows(false);
    }

    public void lambda$didUploadPhoto$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$0(tLObject);
            }
        });
    }

    public void lambda$didUploadPhoto$0(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            userFull.flags |= 4194304;
            userFull.fallback_photo = tL_photos_photo.photo;
            getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
            if (closestPhotoSizeWithSize != null && this.avatarForRest != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                ImageLoader.getInstance().replaceImageInCache(this.avatarForRest.location.volume_id + "_" + this.avatarForRest.location.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || this.avatarForRest == null) {
                return;
            }
            FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest.location, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    private void updateAvatarForRestInfo() {
        TLRPC.PhotoSize photoSize;
        TextCell textCell = this.setAvatarCell;
        if (textCell != null) {
            if (this.avatarForRest == null) {
                textCell.getTextView().setText(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.setAvatarCell.setNeedDivider(false);
            } else {
                textCell.getTextView().setText(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.setAvatarCell.setNeedDivider(true);
            }
        }
        BackupImageView backupImageView = this.oldAvatarView;
        if (backupImageView == null || (photoSize = this.avatarForRest) == null) {
            return;
        }
        TLRPC.Photo photo = this.avatarForRestPhoto;
        if (photo != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize, photo), "50_50", (Drawable) null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        } else {
            backupImageView.setImage(ImageLocation.getForLocal(photoSize.location), "50_50", (Drawable) null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
    }

    class MessageCell extends FrameLayout {
        private Drawable backgroundDrawable;
        private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        private ChatMessageCell cell;
        private HintView hintView;
        private final Runnable invalidateRunnable;
        private MessageObject messageObject;
        private Drawable shadowDrawable;

        @Override
        protected void dispatchSetPressed(boolean z) {
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public MessageCell(Context context) {
            super(context);
            this.invalidateRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidate();
                }
            };
            setWillNotDraw(false);
            setClipToPadding(false);
            this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
            setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = iCurrentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(((BaseFragment) PrivacyControlActivity.this).currentAccount, tL_message, true, false);
            this.messageObject = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            ChatMessageCell chatMessageCell = new ChatMessageCell(context, ((BaseFragment) PrivacyControlActivity.this).currentAccount);
            this.cell = chatMessageCell;
            chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformActions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canPerformActions(this);
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButton);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat, i, f, f2);
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell2, pollAnswer);
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell2, todoItem);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell2, user2, f, f2);
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell2);
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell2);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell2, animatedEmojiSpan);
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell2);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButton);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell2);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat, i, f, f2, z);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z);
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell2);
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell2, textLayoutBlock);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell2);
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell2);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TLRPC.KeyboardButton keyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardButton);
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell2);
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i, i2);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i);
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell2, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell2);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell2, i);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell2, f, f2, z);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell2, i);
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell2);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell2, imageReceiver, pollAnswer, messageMedia, f, f2, i);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z, f, f2);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell2, i, f, f2, z);
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell2);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell2);
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell2);
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell2, z);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell2);
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell2, user2, f, f2, z);
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user2, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell2, user2, document, str);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell2, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i, i2, i3);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell2.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell2, f, f2);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject2);
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell2);
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject2);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell2);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell2, z);
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell2, z);
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell2);
                }

                @Override
                public String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getDraftMessageMeasureController(this);
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell2);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell2);
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                }

                @Override
                public boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                }

                @Override
                public void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                }

                @Override
                public boolean isAdmin(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j);
                }

                @Override
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean isOwner(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j);
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell2, i);
                }

                @Override
                public boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
                }

                @Override
                public boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                }

                @Override
                public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject2, str, str2, str3, str4, i, i2);
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell2, messageObject2, z);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void needShowPremiumBulletin(int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i);
                }

                @Override
                public boolean onAccessibilityAction(int i, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i, bundle);
                }

                @Override
                public void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell2, pageBlock);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject2);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject2);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell2 = this.cell;
            chatMessageCell2.isChat = false;
            chatMessageCell2.setFullyDraw(true);
            this.cell.setMessageObject(this.messageObject, null, false, false, false);
            addView(this.cell, LayoutHelper.createLinear(-1, -2));
            HintView hintView = new HintView(context, 1, true);
            this.hintView = hintView;
            addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.hintView.showForMessageCell(this.cell, false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
            if (cachedWallpaperNonBlocking != null && this.backgroundDrawable != cachedWallpaperNonBlocking) {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
                this.backgroundDrawable = cachedWallpaperNonBlocking;
            }
            Drawable drawable = this.backgroundDrawable;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Drawable drawable2 = this.backgroundDrawable;
                if (drawable2 instanceof BackgroundGradientDrawable) {
                    this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable2).drawExactBoundsSize(canvas, this);
                } else {
                    drawable2.draw(canvas);
                }
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / AndroidUtilities.density;
                    canvas.scale(f, f);
                    this.backgroundDrawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float fMax = Math.max(getMeasuredWidth() / this.backgroundDrawable.getIntrinsicWidth(), measuredHeight / this.backgroundDrawable.getIntrinsicHeight());
                    int iCeil = (int) Math.ceil(this.backgroundDrawable.getIntrinsicWidth() * fMax);
                    int iCeil2 = (int) Math.ceil(this.backgroundDrawable.getIntrinsicHeight() * fMax);
                    int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                    int i = (measuredHeight - iCeil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                    this.backgroundDrawable.setBounds(measuredWidth, i, iCeil + measuredWidth, iCeil2 + i);
                }
                this.backgroundDrawable.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
            this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.shadowDrawable.draw(canvas);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.cell.invalidate();
        }
    }

    public PrivacyControlActivity(int i) {
        this(i, false);
    }

    public PrivacyControlActivity(int i, boolean z) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.initialPlus = new ArrayList();
        this.initialMinus = new ArrayList();
        this.initialPlusPremium = new boolean[4];
        this.initialPlusMiniapps = new boolean[4];
        this.initialPlusChannels = new boolean[4];
        this.currentPlusPremium = new boolean[4];
        this.currentPlusMiniapps = new boolean[4];
        this.currentPlusChannels = new boolean[4];
        this.currentStars = 10L;
        this.shakeDp = 4;
        this.rulesType = i;
        if (z) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.rulesType == 4) {
            ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
            this.imageUpdater = imageUpdater;
            imageUpdater.parentFragment = this;
            imageUpdater.setDelegate(this);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.avatarForRest = closestPhotoSizeWithSize;
            this.avatarForRestPhoto = userFull.fallback_photo;
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        checkPrivacy();
        updateRows(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public View createView(Context context) {
        if (this.rulesType == 5) {
            this.messageCell = new MessageCell(context);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.rulesType;
        if (i == 6) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i == 9) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i == 14) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i == 8) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i == 10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i == 11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i == 12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (PrivacyControlActivity.this.checkDiscard(true)) {
                        PrivacyControlActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    PrivacyControlActivity.this.processDone();
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i2)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(1, crossfadeDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        boolean zHasChanges = hasChanges();
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setEnabled(zHasChanges);
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                this.f$0.lambda$createView$9(view, i3);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                PrivacyControlActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        setMessageText();
        return this.fragmentView;
    }

    public void lambda$createView$9(android.view.View r10, final int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacyControlActivity.lambda$createView$9(android.view.View, int):void");
    }

    public void lambda$createView$3() {
        TLRPC.Photo photo;
        this.avatarForRest = null;
        this.avatarForRestPhoto = null;
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
        if (userFull == null || (photo = userFull.fallback_photo) == null) {
            return;
        }
        userFull.flags &= -4194305;
        userFull.fallback_photo = null;
        getMessagesStorage().updateUserInfo(userFull, true);
        updateAvatarForRestInfo();
        updateRows(true);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        byte[] bArr = photo.file_reference;
        tL_inputPhoto.file_reference = bArr;
        if (bArr == null) {
            tL_inputPhoto.file_reference = new byte[0];
        }
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(tL_inputPhoto);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    public void lambda$createView$5(DialogInterface dialogInterface) {
        if (!this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
        } else {
            this.cameraDrawable.setCurrentFrame(0, false);
        }
    }

    public void lambda$createView$6() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    public void lambda$createView$7() {
        presentFragment(new PremiumPreviewFragment("settings"));
    }

    public void lambda$createView$8(int i, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        int i2 = 0;
        if (i == this.neverShareRow) {
            this.currentMinus = arrayList;
            this.currentPlusMiniapps[this.currentType] = z && z3;
            while (i2 < this.currentMinus.size()) {
                this.currentPlus.remove(this.currentMinus.get(i2));
                i2++;
            }
        } else {
            boolean[] zArr = this.currentPlusPremium;
            int i3 = this.currentType;
            zArr[i3 == 2 ? (char) 0 : (char) 1] = z2;
            this.currentPlusMiniapps[i3] = z && z3;
            this.currentPlus = arrayList;
            while (i2 < this.currentPlus.size()) {
                this.currentMinus.remove(this.currentPlus.get(i2));
                i2++;
            }
        }
        updateDoneButton();
        this.listAdapter.notifyDataSetChanged();
    }

    private void showPremiumBulletin() {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showPremiumBulletin$10();
            }
        }).show();
    }

    public void lambda$showPremiumBulletin$10() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageCell messageCell;
        if (i == NotificationCenter.privacyRulesUpdated) {
            checkPrivacy();
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            this.listView.invalidateViews();
        } else {
            if (i != NotificationCenter.didSetNewWallpapper || (messageCell = this.messageCell) == null) {
                return;
            }
            messageCell.invalidate();
        }
    }

    public void updateDoneButton() {
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
    }

    private void finished() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.doneButtonDrawable.animateToProgress(0.0f);
        int i = this.rulesType;
        if ((i == 10 || i == 1 || i == 2) && this.currentType != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i2 = 0; i2 < 2; i2++) {
                final int i3 = iArr[i2];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i3);
                if (i3 != this.rulesType && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle)).setMessage(LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText)).setPositiveButton(LocaleController.getString(R.string.CheckPrivacyReview), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            this.f$0.lambda$finished$11(i3, alertDialog, i4);
                        }
                    }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i4) {
                            this.f$0.lambda$finished$12(alertDialog, i4);
                        }
                    }).show();
                    return;
                }
            }
        }
        finishFragment();
    }

    public void lambda$finished$11(int i, AlertDialog alertDialog, int i2) {
        presentFragment(new PrivacyControlActivity(i), true);
    }

    public void lambda$finished$12(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    private void applyCurrentPrivacySettings() {
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        if (this.rulesType == 10) {
            final boolean[] zArr = {true, false};
            if (this.currentType == 3) {
                Collections.sort(this.initialPlus);
                Collections.sort(this.currentPlus);
                if (!this.initialPlus.equals(this.currentPlus)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.currentType != 0 && this.currentPlus.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i = 0; i < this.currentPlus.size(); i++) {
                            Long l = (Long) this.currentPlus.get(i);
                            long jLongValue = l.longValue();
                            if (DialogObject.isUserDialog(jLongValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
                                if (user != null && (inputUser3 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-jLongValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$applyCurrentPrivacySettings$15(zArr, tLObject, tL_error);
                        }
                    });
                }
            }
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                globalPrivacySettings2.flags = globalPrivacySettings.flags;
                globalPrivacySettings2.disallowed_stargifts = globalPrivacySettings.disallowed_stargifts;
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings2.noncontact_peers_paid_stars = globalPrivacySettings.noncontact_peers_paid_stars;
                globalPrivacySettings2.keep_archived_folders = globalPrivacySettings.keep_archived_folders;
                globalPrivacySettings2.keep_archived_unmuted = globalPrivacySettings.keep_archived_unmuted;
                globalPrivacySettings2.hide_read_marks = globalPrivacySettings.hide_read_marks;
            }
            int i2 = this.currentType;
            if (i2 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.currentStars;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i2 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$applyCurrentPrivacySettings$17(zArr, globalPrivacySettings, setglobalprivacysettings, tLObject, tL_error);
                }
            });
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        int i3 = this.rulesType;
        if (i3 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.currentType == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.currentSubType == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$applyCurrentPrivacySettings$19(atomicInteger, tLObject, tL_error);
                    }
                }, 2);
            }
        } else if (i3 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i3 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i3 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i3 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i3 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i3 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i3 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i3 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i3 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i3 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.currentType != 0 && this.currentPlus.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i4 = 0; i4 < this.currentPlus.size(); i4++) {
                Long l2 = (Long) this.currentPlus.get(i4);
                long jLongValue2 = l2.longValue();
                if (DialogObject.isUserDialog(jLongValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l2);
                    if (user2 != null && (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user2)) != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(inputUser2);
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-jLongValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.currentType != 1 && this.currentMinus.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i5 = 0; i5 < this.currentMinus.size(); i5++) {
                Long l3 = (Long) this.currentMinus.get(i5);
                long jLongValue3 = l3.longValue();
                if (DialogObject.isUserDialog(jLongValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l3);
                    if (user3 != null && (inputUser = getMessagesController().getInputUser(user3)) != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-jLongValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i6 = this.currentType;
        if (i6 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i6 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i6 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i7 = this.currentType;
        if (i7 != 0) {
            if (this.currentPlusPremium[i7 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        boolean[] zArr2 = this.currentPlusMiniapps;
        int i8 = this.currentType;
        if (zArr2[i8]) {
            if (i8 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$applyCurrentPrivacySettings$21(atomicInteger, tLObject, tL_error);
            }
        }, 2);
        if (this.rulesType == 0 && this.selectedReadValue != this.currentReadValue) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.selectedReadValue;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$applyCurrentPrivacySettings$23(globalPrivacySettings5, setglobalprivacysettings2, atomicInteger, tLObject, tL_error);
                }
            });
        }
        if (this.rulesType == 12 && (this.selectedGiftIconValue != this.currentGiftIconValue || this.selectedGiftLimitedValue != this.currentGiftLimitedValue || this.selectedGiftUnlimitedValue != this.currentGiftUnlimitedValue || this.selectedGiftUniqueValue != this.currentGiftUniqueValue || this.selectedGiftPremiumValue != this.currentGiftPremiumValue)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = this.selectedGiftIconValue;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.selectedGiftUnlimitedValue;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.selectedGiftLimitedValue;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.selectedGiftUniqueValue;
                disallowedGiftsSettings.disallow_premium_gifts = !this.selectedGiftPremiumValue;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$applyCurrentPrivacySettings$25(globalPrivacySettings7, setglobalprivacysettings3, atomicInteger, tLObject, tL_error);
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.doneButtonDrawable.animateToProgress(1.0f);
        }
    }

    public void lambda$applyCurrentPrivacySettings$15(final boolean[] zArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyCurrentPrivacySettings$14(tL_error, tLObject, zArr);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$14(TLRPC.TL_error tL_error, TLObject tLObject, final boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, 13);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$applyCurrentPrivacySettings$13(zArr);
                }
            });
            return;
        }
        showErrorAlert();
    }

    public void lambda$applyCurrentPrivacySettings$13(boolean[] zArr) {
        zArr[0] = true;
        if (zArr[1]) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$17(final boolean[] zArr, final TLRPC.GlobalPrivacySettings globalPrivacySettings, final TL_account.setGlobalPrivacySettings setglobalprivacysettings, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyCurrentPrivacySettings$16(tL_error, zArr, globalPrivacySettings, setglobalprivacysettings);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$16(TLRPC.TL_error tL_error, boolean[] zArr, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        zArr[1] = true;
        if (globalPrivacySettings != null) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
            globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
            int i = globalPrivacySettings2.flags;
            globalPrivacySettings.flags = i;
            globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
            long j = globalPrivacySettings2.noncontact_peers_paid_stars;
            if (j > 0) {
                globalPrivacySettings.flags = i | 32;
                globalPrivacySettings.noncontact_peers_paid_stars = j;
            } else {
                globalPrivacySettings.flags = i & (-33);
                globalPrivacySettings.noncontact_peers_paid_stars = 0L;
            }
        }
        if (zArr[0]) {
            finished();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void lambda$applyCurrentPrivacySettings$19(final AtomicInteger atomicInteger, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyCurrentPrivacySettings$18(tL_error, tLObject, atomicInteger);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$18(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            ContactsController.getInstance(this.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
            if (atomicInteger.decrementAndGet() == 0) {
                finished();
                return;
            }
            return;
        }
        BulletinFactory.of(this).showForError(tL_error);
    }

    public void lambda$applyCurrentPrivacySettings$21(final AtomicInteger atomicInteger, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyCurrentPrivacySettings$20(tL_error, tLObject, atomicInteger);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$20(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, this.rulesType);
            if (atomicInteger.decrementAndGet() == 0) {
                finished();
                return;
            }
            return;
        }
        showErrorAlert();
    }

    public void lambda$applyCurrentPrivacySettings$23(final TLRPC.GlobalPrivacySettings globalPrivacySettings, final TL_account.setGlobalPrivacySettings setglobalprivacysettings, final AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyCurrentPrivacySettings$22(globalPrivacySettings, setglobalprivacysettings, atomicInteger);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$22(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger) {
        boolean z = setglobalprivacysettings.settings.hide_read_marks;
        this.currentReadValue = z;
        globalPrivacySettings.hide_read_marks = z;
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$25(final TLRPC.GlobalPrivacySettings globalPrivacySettings, final TL_account.setGlobalPrivacySettings setglobalprivacysettings, final AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$applyCurrentPrivacySettings$24(globalPrivacySettings, setglobalprivacysettings, atomicInteger);
            }
        });
    }

    public void lambda$applyCurrentPrivacySettings$24(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger) {
        TLRPC.UserFull userFull;
        if (globalPrivacySettings.display_gifts_button != setglobalprivacysettings.settings.display_gifts_button && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null) {
            userFull.display_gifts_button = setglobalprivacysettings.settings.display_gifts_button;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        boolean z = setglobalprivacysettings.settings.display_gifts_button;
        this.currentGiftIconValue = z;
        globalPrivacySettings.display_gifts_button = z;
        if (globalPrivacySettings.disallowed_stargifts == null) {
            globalPrivacySettings.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings.settings.disallowed_stargifts;
        if (disallowedGiftsSettings != null) {
            globalPrivacySettings.flags |= 64;
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts;
            boolean z2 = disallowedGiftsSettings.disallow_unlimited_stargifts;
            disallowedGiftsSettings2.disallow_unlimited_stargifts = z2;
            this.currentGiftUnlimitedValue = !z2;
            boolean z3 = disallowedGiftsSettings.disallow_limited_stargifts;
            disallowedGiftsSettings2.disallow_limited_stargifts = z3;
            this.currentGiftLimitedValue = !z3;
            boolean z4 = disallowedGiftsSettings.disallow_unique_stargifts;
            disallowedGiftsSettings2.disallow_unique_stargifts = z4;
            this.currentGiftUniqueValue = !z4;
            boolean z5 = disallowedGiftsSettings.disallow_stargifts_from_channels;
            disallowedGiftsSettings2.disallow_stargifts_from_channels = z5;
            this.currentGiftChannelsValue = !z5;
            boolean z6 = disallowedGiftsSettings.disallow_premium_gifts;
            disallowedGiftsSettings2.disallow_premium_gifts = z6;
            this.currentGiftPremiumValue = !z6;
        }
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    private void showErrorAlert() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.getString(R.string.PrivacyFloodControlError));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    public boolean areAllStarGiftsDisabled() {
        return (this.selectedGiftUniqueValue || this.selectedGiftUnlimitedValue || this.selectedGiftLimitedValue) ? false : true;
    }

    private void checkPrivacy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacyControlActivity.checkPrivacy():void");
    }

    private boolean hasChanges() {
        ArrayList arrayList;
        if (this.rulesType == 0 && ((this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty())) && this.currentReadValue != this.selectedReadValue)) {
            return true;
        }
        int i = this.rulesType;
        if (i == 12 && (this.currentGiftIconValue != this.selectedGiftIconValue || this.currentGiftLimitedValue != this.selectedGiftLimitedValue || this.currentGiftUnlimitedValue != this.selectedGiftUnlimitedValue || this.currentGiftUniqueValue != this.selectedGiftUniqueValue || this.currentGiftChannelsValue != this.selectedGiftChannelsValue || this.currentGiftPremiumValue != this.selectedGiftPremiumValue)) {
            return true;
        }
        int i2 = this.initialRulesType;
        int i3 = this.currentType;
        if (i2 != i3) {
            return true;
        }
        if (i == 6 && i3 == 1 && this.initialRulesSubType != this.currentSubType) {
            return true;
        }
        if (i3 != 0) {
            if (this.initialPlusPremium[i3 == 2 ? (char) 0 : (char) 1] != this.currentPlusPremium[i3 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i == 10 && i3 == 3 && this.currentStars != this.initialStars) || this.initialPlusMiniapps[i3] != this.currentPlusMiniapps[i3] || this.initialMinus.size() != this.currentMinus.size() || this.initialPlus.size() != this.currentPlus.size()) {
            return true;
        }
        if (this.rulesType != 10 || this.currentType == 3) {
            Collections.sort(this.initialPlus);
            Collections.sort(this.currentPlus);
            if (!this.initialPlus.equals(this.currentPlus)) {
                return true;
            }
            Collections.sort(this.initialMinus);
            Collections.sort(this.currentMinus);
            if (!this.initialMinus.equals(this.currentMinus)) {
                return true;
            }
        }
        return false;
    }

    public void updateRows(boolean z) {
        ArrayList arrayList;
        int i;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int i2;
        TLRPC.UserFull userFull;
        DiffCallback diffCallback = null;
        Object[] objArr = 0;
        if (z) {
            DiffCallback diffCallback2 = new DiffCallback();
            diffCallback2.fillPositions(diffCallback2.oldPositionToItem);
            diffCallback2.oldRowCount = this.rowCount;
            diffCallback = diffCallback2;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.photoForRestDescriptionRow = -1;
        this.messageRow = -1;
        this.setBirthdayRow = -1;
        this.phoneDetailRow = -1;
        this.phoneSectionRow = -1;
        this.phoneEverybodyRow = -1;
        this.phoneContactsRow = -1;
        this.alwaysShareRow = -1;
        this.neverShareRow = -1;
        this.p2pSectionRow = -1;
        this.p2pRow = -1;
        this.detailRow = -1;
        this.detailRow2 = -1;
        this.p2pDetailRow = -1;
        this.readDetailRow = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.shareSectionRow = -1;
        this.shareDetailRow = -1;
        this.payRow = -1;
        this.priceHeaderRow = -1;
        this.priceRow = -1;
        this.priceInfoRow = -1;
        this.priceButtonRow = -1;
        this.readPremiumRow = -1;
        this.readPremiumDetailRow = -1;
        this.showGiftIconRow = -1;
        this.showGiftIconInfoRow = -1;
        this.giftTypesHeaderRow = -1;
        this.giftTypeUnlimitedRow = -1;
        this.giftTypeLimitedRow = -1;
        this.giftTypeUniqueRow = -1;
        this.giftTypeChannelsRow = -1;
        this.giftTypePremiumRow = -1;
        this.giftTypesInfoRow = -1;
        this.rowCount = 0;
        int i3 = this.rulesType;
        if (i3 == 12) {
            this.showGiftIconRow = 0;
            this.rowCount = 2;
            this.showGiftIconInfoRow = 1;
        }
        if (i3 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i4 = this.rowCount;
            this.rowCount = i4 + 1;
            this.setBirthdayRow = i4;
        }
        int i5 = this.rulesType;
        if (i5 == 5) {
            int i6 = this.rowCount;
            this.rowCount = i6 + 1;
            this.messageRow = i6;
        }
        int i7 = this.rowCount;
        this.sectionRow = i7;
        this.everybodyRow = i7 + 1;
        int i8 = i7 + 3;
        this.rowCount = i8;
        this.myContactsRow = i7 + 2;
        if (i5 == 4 || i5 == 9 || i5 == 14 || i5 == 0 || i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6 || i5 == 8 || i5 == 1 || i5 == 11 || i5 == 12) {
            this.rowCount = i7 + 4;
            this.nobodyRow = i8;
        }
        if (getMessagesController().starsPaidMessagesAvailable && this.rulesType == 10) {
            int i9 = this.rowCount;
            this.rowCount = i9 + 1;
            this.payRow = i9;
        }
        int i10 = this.rulesType;
        if (i10 == 6 && this.currentType == 1) {
            int i11 = this.rowCount;
            this.phoneDetailRow = i11;
            this.phoneSectionRow = i11 + 1;
            this.phoneEverybodyRow = i11 + 2;
            this.rowCount = i11 + 4;
            this.phoneContactsRow = i11 + 3;
        }
        if (i10 == 10 && this.currentType == 3) {
            int i12 = this.rowCount;
            this.rowCount = i12 + 1;
            this.detailRow2 = i12;
        } else {
            int i13 = this.rowCount;
            this.rowCount = i13 + 1;
            this.detailRow = i13;
        }
        if (i10 == 10) {
            if (this.currentType == 3) {
                int i14 = this.rowCount;
                this.priceHeaderRow = i14;
                this.rowCount = i14 + 2;
                this.priceRow = i14 + 1;
                if (!getUserConfig().isPremium()) {
                    int i15 = this.rowCount;
                    this.rowCount = i15 + 1;
                    this.priceButtonRow = i15;
                }
                int i16 = this.rowCount;
                this.rowCount = i16 + 1;
                this.priceInfoRow = i16;
                if (getUserConfig().isPremium()) {
                    int i17 = this.rowCount;
                    this.shareSectionRow = i17;
                    this.alwaysShareRow = i17 + 1;
                    this.rowCount = i17 + 3;
                    this.shareDetailRow = i17 + 2;
                }
            }
        } else if (i10 != 8 || getUserConfig().isPremium()) {
            int i18 = this.rowCount;
            int i19 = i18 + 1;
            this.rowCount = i19;
            this.shareSectionRow = i18;
            int i20 = this.currentType;
            if (i20 == 1 || i20 == 2) {
                this.rowCount = i18 + 2;
                this.alwaysShareRow = i19;
            }
            if (i20 == 0 || i20 == 2) {
                int i21 = this.rowCount;
                this.rowCount = i21 + 1;
                this.neverShareRow = i21;
            }
            int i22 = this.rowCount;
            int i23 = i22 + 1;
            this.rowCount = i23;
            this.shareDetailRow = i22;
            int i24 = this.rulesType;
            if (i24 == 2) {
                this.p2pSectionRow = i23;
                this.p2pRow = i22 + 2;
                this.rowCount = i22 + 4;
                this.p2pDetailRow = i22 + 3;
            }
            if (i24 == 4 && (this.currentMinus.size() > 0 || (i = this.currentType) == 2 || i == 1)) {
                int i25 = this.rowCount;
                int i26 = i25 + 1;
                this.rowCount = i26;
                this.photoForRestRow = i25;
                if (this.avatarForRest != null) {
                    this.rowCount = i25 + 2;
                    this.currentPhotoForRestRow = i26;
                }
                int i27 = this.rowCount;
                this.rowCount = i27 + 1;
                this.photoForRestDescriptionRow = i27;
            }
            if (this.rulesType == 0 && (this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty()))) {
                int i28 = this.rowCount;
                this.readRow = i28;
                this.rowCount = i28 + 2;
                this.readDetailRow = i28 + 1;
            }
            if (this.rulesType == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i29 = this.rowCount;
                this.readPremiumRow = i29;
                this.rowCount = i29 + 2;
                this.readPremiumDetailRow = i29 + 1;
            }
        }
        if (this.rulesType == 12) {
            int i30 = this.rowCount;
            this.giftTypesHeaderRow = i30;
            this.giftTypeLimitedRow = i30 + 1;
            this.giftTypeUnlimitedRow = i30 + 2;
            this.giftTypeUniqueRow = i30 + 3;
            this.giftTypeChannelsRow = i30 + 4;
            this.giftTypePremiumRow = i30 + 5;
            this.rowCount = i30 + 7;
            this.giftTypesInfoRow = i30 + 6;
        }
        setMessageText();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            if (z) {
                int childCount = this.listView.getChildCount();
                for (int i31 = 0; i31 < childCount; i31++) {
                    View childAt = this.listView.getChildAt(i31);
                    if ((childAt instanceof RadioCell) && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                        int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                        RadioCell radioCell = (RadioCell) childAt;
                        int i32 = this.everybodyRow;
                        if (adapterPosition == i32 || adapterPosition == this.myContactsRow || adapterPosition == this.nobodyRow || adapterPosition == this.payRow) {
                            if (adapterPosition == i32) {
                                i2 = 0;
                            } else if (adapterPosition == this.myContactsRow) {
                                i2 = 2;
                            } else {
                                i2 = adapterPosition == this.nobodyRow ? 1 : 3;
                            }
                            radioCell.setChecked(this.currentType == i2, true);
                        } else {
                            radioCell.setChecked(this.currentSubType == (adapterPosition == this.phoneContactsRow ? 1 : 0), true);
                        }
                    }
                }
                diffCallback.fillPositions(diffCallback.newPositionToItem);
                DiffUtil.calculateDiff(diffCallback).dispatchUpdatesTo(this.listAdapter);
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
            listAdapter.notifyDataSetChanged();
        }
    }

    private void setMessageText() {
        MessageCell messageCell = this.messageCell;
        if (messageCell != null) {
            messageCell.messageObject.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i = this.currentType;
            if (i == 0) {
                this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i == 1) {
                this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.messageCell.cell.forceResetMessageObject();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateRows(false);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onPause();
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        return checkDiscard(z);
    }

    public void processDone() {
        if (getParentActivity() == null) {
            return;
        }
        if (this.rulesType == 10 && this.currentType == 3 && !getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, 27, true));
            return;
        }
        if (this.currentType != 0 && this.rulesType == 0 && !getUserConfig().isPremium()) {
            final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                if (this.rulesType == 1) {
                    builder.setMessage(LocaleController.getString(R.string.WhoCanAddMeInfo));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.CustomHelp));
                }
                builder.setTitle(LocaleController.getString(R.string.AppName));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$processDone$26(globalMainSettings, alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return;
            }
        }
        applyCurrentPrivacySettings();
    }

    public void lambda$processDone$26(SharedPreferences sharedPreferences, AlertDialog alertDialog, int i) {
        applyCurrentPrivacySettings();
        sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
    }

    public boolean checkDiscard(boolean z) {
        if (this.doneButton.getAlpha() != 1.0f) {
            return true;
        }
        if (!z) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges));
        builder.setMessage(LocaleController.getString(R.string.PrivacySettingsChangedAlert));
        builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$checkDiscard$27(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$checkDiscard$28(alertDialog, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    public void lambda$checkDiscard$27(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$28(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return (adapterPosition == PrivacyControlActivity.this.p2pRow && !ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivacyInfo(3)) || adapterPosition == PrivacyControlActivity.this.currentPhotoForRestRow || adapterPosition == PrivacyControlActivity.this.photoForRestDescriptionRow || adapterPosition == PrivacyControlActivity.this.photoForRestRow || adapterPosition == PrivacyControlActivity.this.readRow || adapterPosition == PrivacyControlActivity.this.showGiftIconRow || adapterPosition == PrivacyControlActivity.this.readPremiumRow || adapterPosition == PrivacyControlActivity.this.giftTypeUniqueRow || adapterPosition == PrivacyControlActivity.this.giftTypeChannelsRow || adapterPosition == PrivacyControlActivity.this.giftTypePremiumRow || adapterPosition == PrivacyControlActivity.this.giftTypeLimitedRow || adapterPosition == PrivacyControlActivity.this.giftTypeUnlimitedRow || (!(PrivacyControlActivity.this.rulesType == 12 && PrivacyControlActivity.this.areAllStarGiftsDisabled()) && (adapterPosition == PrivacyControlActivity.this.nobodyRow || adapterPosition == PrivacyControlActivity.this.myContactsRow || adapterPosition == PrivacyControlActivity.this.payRow || adapterPosition == PrivacyControlActivity.this.everybodyRow || adapterPosition == PrivacyControlActivity.this.neverShareRow || adapterPosition == PrivacyControlActivity.this.alwaysShareRow));
        }

        @Override
        public int getItemCount() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            TextSettingsCell textSettingsCell;
            switch (i) {
                case 0:
                    TextSettingsCell textSettingsCell2 = new TextSettingsCell(this.mContext);
                    textSettingsCell2.setCanDisable(true);
                    textSettingsCell = textSettingsCell2;
                    textInfoPrivacyCell = textSettingsCell;
                    break;
                case 1:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 2:
                    textInfoPrivacyCell = new HeaderCell(this.mContext);
                    break;
                case 3:
                    textInfoPrivacyCell = new RadioCell(this.mContext);
                    break;
                case 4:
                    textInfoPrivacyCell = PrivacyControlActivity.this.messageCell;
                    break;
                case 5:
                default:
                    textInfoPrivacyCell = new ShadowSectionCell(this.mContext);
                    break;
                case 6:
                    PrivacyControlActivity.this.setAvatarCell = new TextCell(PrivacyControlActivity.this.getContext());
                    if (PrivacyControlActivity.this.avatarForRest == null) {
                        PrivacyControlActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), R.drawable.msg_addphoto, false);
                    } else {
                        PrivacyControlActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), R.drawable.msg_addphoto, true);
                    }
                    PrivacyControlActivity.this.setAvatarCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    PrivacyControlActivity.this.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                    int i2 = R.raw.camera_outline;
                    privacyControlActivity.cameraDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    PrivacyControlActivity.this.setAvatarCell.imageView.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                    PrivacyControlActivity.this.setAvatarCell.imageView.setAnimation(PrivacyControlActivity.this.cameraDrawable);
                    textInfoPrivacyCell = PrivacyControlActivity.this.setAvatarCell;
                    break;
                case 7:
                    PrivacyControlActivity.this.oldAvatarView = new BackupImageView(PrivacyControlActivity.this.getContext());
                    PrivacyControlActivity.this.oldPhotoCell = new TextCell(PrivacyControlActivity.this.getContext()) {
                        @Override
                        protected void onMeasure(int i3, int i4) {
                            super.onMeasure(i3, i4);
                            PrivacyControlActivity.this.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                            PrivacyControlActivity.this.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                        }

                        @Override
                        protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                            super.onLayout(z, i3, i4, i5, i6);
                            int iDp = AndroidUtilities.dp(21.0f);
                            int measuredHeight = (getMeasuredHeight() - PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight()) / 2;
                            PrivacyControlActivity.this.oldAvatarView.layout(iDp, measuredHeight, PrivacyControlActivity.this.oldAvatarView.getMeasuredWidth() + iDp, PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight() + measuredHeight);
                        }
                    };
                    if (PrivacyControlActivity.this.avatarForRest != null) {
                        if (PrivacyControlActivity.this.avatarForRestPhoto != null) {
                            PrivacyControlActivity.this.oldAvatarView.setImage(ImageLocation.getForPhoto(PrivacyControlActivity.this.avatarForRest, PrivacyControlActivity.this.avatarForRestPhoto), "50_50", (Drawable) null, UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getCurrentUser());
                        } else {
                            PrivacyControlActivity.this.oldAvatarView.setImage(ImageLocation.getForLocal(PrivacyControlActivity.this.avatarForRest.location), "50_50", (Drawable) null, UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getCurrentUser());
                        }
                    }
                    PrivacyControlActivity.this.oldPhotoCell.addView(PrivacyControlActivity.this.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    PrivacyControlActivity.this.oldPhotoCell.setText(LocaleController.getString(R.string.RemovePublicPhoto), false);
                    PrivacyControlActivity.this.oldPhotoCell.getImageView().setVisibility(0);
                    PrivacyControlActivity.this.oldPhotoCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    TextCell textCell = PrivacyControlActivity.this.oldPhotoCell;
                    int i3 = Theme.key_text_RedRegular;
                    textCell.setColors(i3, i3);
                    textInfoPrivacyCell = PrivacyControlActivity.this.oldPhotoCell;
                    break;
                case 8:
                    textInfoPrivacyCell = new TextCheckCell(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    break;
                case 9:
                    textInfoPrivacyCell = new SlideIntChooseView(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    break;
                case 10:
                    ?? frameLayout = new FrameLayout(this.mContext);
                    ButtonWithCounterView round = new ButtonWithCounterView(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider).setRound();
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                    spannableStringBuilder.append((CharSequence) " l");
                    spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    round.setText(spannableStringBuilder, false);
                    round.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$0(view);
                        }
                    });
                    frameLayout.addView(round, LayoutHelper.createFrame(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                    textSettingsCell = frameLayout;
                    textInfoPrivacyCell = textSettingsCell;
                    break;
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }

        public void lambda$onCreateViewHolder$0(View view) {
            PrivacyControlActivity.this.showDialog(new PremiumFeatureBottomSheet(PrivacyControlActivity.this, 27, false));
        }

        private int getUsersCount(ArrayList arrayList) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long jLongValue = ((Long) arrayList.get(i2)).longValue();
                if (jLongValue > 0) {
                    i++;
                } else {
                    TLRPC.Chat chat = PrivacyControlActivity.this.getMessagesController().getChat(Long.valueOf(-jLongValue));
                    if (chat != null) {
                        i += chat.participants_count;
                    }
                }
            }
            return i;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String rulesString;
            String string;
            String string2;
            int itemViewType = viewHolder.getItemViewType();
            int i2 = 0;
            i = 0;
            int i3 = 0;
            i = 0;
            int i4 = 0;
            i = 0;
            int i5 = 0;
            i = 0;
            int i6 = 0;
            i2 = 0;
            if (itemViewType == 8) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                textCheckCell.setCheckBoxIcon(0);
                if (i == PrivacyControlActivity.this.readRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.HideReadTime), PrivacyControlActivity.this.selectedReadValue, false);
                    return;
                }
                if (i == PrivacyControlActivity.this.showGiftIconRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsShowIcon), PrivacyControlActivity.this.selectedGiftIconValue, false);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeUnlimitedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), PrivacyControlActivity.this.selectedGiftUnlimitedValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftUnlimitedValue) {
                        i3 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i3);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeLimitedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), PrivacyControlActivity.this.selectedGiftLimitedValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftLimitedValue) {
                        i4 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i4);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeUniqueRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), PrivacyControlActivity.this.selectedGiftUniqueValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftUniqueValue) {
                        i5 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i5);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeChannelsRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), PrivacyControlActivity.this.selectedGiftChannelsValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftChannelsValue) {
                        i6 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i6);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypePremiumRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypePremium), PrivacyControlActivity.this.selectedGiftPremiumValue, false);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftPremiumValue) {
                        i2 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i2);
                    return;
                }
                return;
            }
            if (itemViewType == 9) {
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                if (i == PrivacyControlActivity.this.priceRow) {
                    slideIntChooseView.set((int) Utilities.clamp(PrivacyControlActivity.this.currentStars, PrivacyControlActivity.this.getMessagesController().starsPaidMessageAmountMax, 1L), SlideIntChooseView.Options.make(1, SlideIntChooseView.cut(new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) PrivacyControlActivity.this.getMessagesController().starsPaidMessageAmountMax), 20, new Utilities.Callback2Return() {
                        @Override
                        public final Object run(Object obj, Object obj2) {
                            return this.f$0.lambda$onBindViewHolder$6((Integer) obj, (Integer) obj2);
                        }
                    }), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$onBindViewHolder$7((Integer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            if (itemViewType == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                textSettingsCell.setTextColor(PrivacyControlActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                if (i == PrivacyControlActivity.this.alwaysShareRow) {
                    if (PrivacyControlActivity.this.currentPlus.size() != 0) {
                        string2 = LocaleController.formatPluralString("Users", getUsersCount(PrivacyControlActivity.this.currentPlus), new Object[0]);
                    } else {
                        string2 = LocaleController.getString(R.string.EmpryUsersPlaceholder);
                    }
                    if (PrivacyControlActivity.this.currentPlusPremium[PrivacyControlActivity.this.currentType == 2 ? (char) 0 : (char) 1]) {
                        if (PrivacyControlActivity.this.currentPlus == null || PrivacyControlActivity.this.currentPlus.isEmpty()) {
                            string2 = LocaleController.formatString(R.string.PrivacyPremium, new Object[0]);
                        } else {
                            string2 = LocaleController.formatString(R.string.PrivacyPremiumAnd, string2);
                        }
                    }
                    if (PrivacyControlActivity.this.rulesType != 10 && PrivacyControlActivity.this.currentPlusMiniapps[PrivacyControlActivity.this.currentType] && PrivacyControlActivity.this.currentType != 0) {
                        if (PrivacyControlActivity.this.currentPlus == null || PrivacyControlActivity.this.currentPlus.isEmpty()) {
                            string2 = LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]);
                        } else {
                            string2 = LocaleController.formatString(R.string.PrivacyValueBotsAnd, string2);
                        }
                    }
                    if (PrivacyControlActivity.this.rulesType != 10) {
                        if (PrivacyControlActivity.this.rulesType == 0 || PrivacyControlActivity.this.rulesType == 4 || PrivacyControlActivity.this.rulesType == 9 || PrivacyControlActivity.this.rulesType == 14) {
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AlwaysShareWith), string2, PrivacyControlActivity.this.neverShareRow != -1);
                        } else {
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AlwaysAllow), string2, PrivacyControlActivity.this.neverShareRow != -1);
                        }
                    } else {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivateMessagesExceptions), string2, false);
                    }
                    if (PrivacyControlActivity.this.rulesType == 12) {
                        textSettingsCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled());
                        return;
                    }
                    return;
                }
                if (i == PrivacyControlActivity.this.neverShareRow) {
                    if (PrivacyControlActivity.this.currentMinus.size() != 0) {
                        string = LocaleController.formatPluralString("Users", getUsersCount(PrivacyControlActivity.this.currentMinus), new Object[0]);
                    } else {
                        string = LocaleController.getString(R.string.EmpryUsersPlaceholder);
                    }
                    if (PrivacyControlActivity.this.currentPlusMiniapps[PrivacyControlActivity.this.currentType] && PrivacyControlActivity.this.currentType == 0) {
                        if (PrivacyControlActivity.this.currentMinus == null || PrivacyControlActivity.this.currentMinus.isEmpty()) {
                            string = LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]);
                        } else {
                            string = LocaleController.formatString(R.string.PrivacyValueBotsAnd, string);
                        }
                    }
                    if (PrivacyControlActivity.this.rulesType != 0 && PrivacyControlActivity.this.rulesType != 4 && PrivacyControlActivity.this.rulesType != 9 && PrivacyControlActivity.this.rulesType != 14) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NeverAllow), string, false);
                    } else {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NeverShareWith), string, false);
                    }
                    if (PrivacyControlActivity.this.rulesType == 12) {
                        textSettingsCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled());
                        return;
                    }
                    return;
                }
                if (i == PrivacyControlActivity.this.p2pRow) {
                    if (ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivacyInfo(3)) {
                        rulesString = LocaleController.getString(R.string.Loading);
                    } else {
                        rulesString = PrivacySettingsActivity.formatRulesString(PrivacyControlActivity.this.getAccountInstance(), 3);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyP2P2), rulesString, false);
                    return;
                }
                if (i == PrivacyControlActivity.this.readPremiumRow) {
                    textSettingsCell.setText(LocaleController.getString(PrivacyControlActivity.this.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                    textSettingsCell.setTextColor(PrivacyControlActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText));
                    return;
                }
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i != PrivacyControlActivity.this.detailRow2) {
                    if (i != PrivacyControlActivity.this.detailRow || PrivacyControlActivity.this.rulesType != 10) {
                        if (i != PrivacyControlActivity.this.detailRow || PrivacyControlActivity.this.rulesType != 8) {
                            if (i != PrivacyControlActivity.this.setBirthdayRow) {
                                if (i == PrivacyControlActivity.this.detailRow) {
                                    if (PrivacyControlActivity.this.rulesType != 6) {
                                        if (PrivacyControlActivity.this.rulesType != 5) {
                                            if (PrivacyControlActivity.this.rulesType != 4) {
                                                if (PrivacyControlActivity.this.rulesType != 9) {
                                                    if (PrivacyControlActivity.this.rulesType != 14) {
                                                        if (PrivacyControlActivity.this.rulesType != 11) {
                                                            if (PrivacyControlActivity.this.rulesType != 12) {
                                                                if (PrivacyControlActivity.this.rulesType != 3) {
                                                                    if (PrivacyControlActivity.this.rulesType != 2) {
                                                                        if (PrivacyControlActivity.this.rulesType == 1) {
                                                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                                                                        } else {
                                                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomHelp));
                                                                        }
                                                                    } else {
                                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                                                                    }
                                                                } else {
                                                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                                                                }
                                                            } else {
                                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                                                            }
                                                        } else {
                                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                                                        }
                                                    } else {
                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                                                    }
                                                } else {
                                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                                                }
                                            } else {
                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                                            }
                                        } else {
                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                                        }
                                    } else {
                                        PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                                        if (privacyControlActivity.prevSubtypeContacts = privacyControlActivity.currentType == 1 && PrivacyControlActivity.this.currentSubType == 1) {
                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            final String str = String.format(Locale.ENGLISH, "https://t.me/+%s", PrivacyControlActivity.this.getUserConfig().getClientPhone());
                                            SpannableString spannableString = new SpannableString(str);
                                            spannableString.setSpan(new ClickableSpan() {
                                                @Override
                                                public void onClick(View view) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                                    BulletinFactory.of(PrivacyControlActivity.this).createCopyLinkBulletin(LocaleController.getString(R.string.LinkCopied), PrivacyControlActivity.this.getResourceProvider()).show();
                                                }
                                            }, 0, str.length(), 33);
                                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                            textInfoPrivacyCell.setText(spannableStringBuilder);
                                        }
                                    }
                                } else if (i == PrivacyControlActivity.this.shareDetailRow) {
                                    if (PrivacyControlActivity.this.rulesType != 6) {
                                        if (PrivacyControlActivity.this.rulesType != 5) {
                                            if (PrivacyControlActivity.this.rulesType == 4) {
                                                if (PrivacyControlActivity.this.currentType != 2) {
                                                    if (PrivacyControlActivity.this.currentType == 0) {
                                                        textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                                                    } else {
                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                                                    }
                                                } else {
                                                    textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                                                }
                                            } else if (PrivacyControlActivity.this.rulesType != 3) {
                                                if (PrivacyControlActivity.this.rulesType != 9) {
                                                    if (PrivacyControlActivity.this.rulesType != 14) {
                                                        if (PrivacyControlActivity.this.rulesType != 11) {
                                                            if (PrivacyControlActivity.this.rulesType != 2) {
                                                                if (PrivacyControlActivity.this.rulesType != 1) {
                                                                    if (PrivacyControlActivity.this.rulesType != 12) {
                                                                        if (PrivacyControlActivity.this.rulesType != 8) {
                                                                            if (PrivacyControlActivity.this.rulesType == 10) {
                                                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                                                                            } else {
                                                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                                                                            }
                                                                        } else {
                                                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                                                                        }
                                                                    } else {
                                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                                                                    }
                                                                } else {
                                                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareInfo));
                                                                }
                                                            } else {
                                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomCallInfo));
                                                            }
                                                        } else {
                                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                                                        }
                                                    } else {
                                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                                                    }
                                                } else {
                                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                                                }
                                            } else {
                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomP2PInfo));
                                            }
                                        } else {
                                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                                        }
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                                    }
                                } else if (i != PrivacyControlActivity.this.photoForRestDescriptionRow) {
                                    if (i != PrivacyControlActivity.this.readDetailRow) {
                                        if (i == PrivacyControlActivity.this.readPremiumDetailRow) {
                                            textInfoPrivacyCell.setText(LocaleController.getString(PrivacyControlActivity.this.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                                        } else if (i == PrivacyControlActivity.this.priceInfoRow) {
                                            textInfoPrivacyCell.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, AffiliateProgramFragment.percents(PrivacyControlActivity.this.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((PrivacyControlActivity.this.currentStars * (PrivacyControlActivity.this.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * PrivacyControlActivity.this.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                                        } else if (i != PrivacyControlActivity.this.showGiftIconInfoRow) {
                                            if (i == PrivacyControlActivity.this.giftTypesInfoRow) {
                                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                                            }
                                        } else {
                                            SpannableString spannableString2 = new SpannableString("g");
                                            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_input_gift);
                                            coloredImageSpan.setScale(0.583f, 0.583f);
                                            spannableString2.setSpan(coloredImageSpan, 0, 1, 33);
                                            textInfoPrivacyCell.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                                        }
                                    } else {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                                    }
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                                }
                            } else {
                                textInfoPrivacyCell.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$onBindViewHolder$5();
                                    }
                                }), true));
                            }
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                        }
                    } else {
                        textInfoPrivacyCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyMessagesInfo), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onBindViewHolder$1();
                            }
                        }));
                    }
                } else {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
                }
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                RadioCell radioCell = (RadioCell) viewHolder.itemView;
                radioCell.setRadioIcon(null);
                if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.payRow) {
                    if (i == PrivacyControlActivity.this.everybodyRow) {
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PEverybody), PrivacyControlActivity.this.currentType == 0, true);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenEverybody), PrivacyControlActivity.this.currentType == 0, true);
                        }
                    } else if (i == PrivacyControlActivity.this.myContactsRow) {
                        if ((PrivacyControlActivity.this.rulesType == 8 && !PrivacyControlActivity.this.getUserConfig().isPremium()) || (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !PrivacyControlActivity.this.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PContacts), PrivacyControlActivity.this.currentType == 2, (PrivacyControlActivity.this.nobodyRow == -1 && PrivacyControlActivity.this.payRow == -1) ? false : true);
                        } else if (PrivacyControlActivity.this.rulesType == 10) {
                            radioCell.setText(LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium), PrivacyControlActivity.this.currentType == 2, (PrivacyControlActivity.this.nobodyRow == -1 && PrivacyControlActivity.this.payRow == -1) ? false : true);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenContacts), PrivacyControlActivity.this.currentType == 2, (PrivacyControlActivity.this.nobodyRow == -1 && PrivacyControlActivity.this.payRow == -1) ? false : true);
                        }
                    } else if (i == PrivacyControlActivity.this.payRow) {
                        if (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getUserConfig().isPremium()) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        radioCell.setText(LocaleController.getString(R.string.PrivateMessagesChargePrice), PrivacyControlActivity.this.currentType == 3, false);
                    } else {
                        if ((PrivacyControlActivity.this.rulesType == 8 && !PrivacyControlActivity.this.getUserConfig().isPremium()) || (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !PrivacyControlActivity.this.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PNobody), PrivacyControlActivity.this.currentType == 1, false);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenNobody), PrivacyControlActivity.this.currentType == 1, false);
                        }
                    }
                } else if (i == PrivacyControlActivity.this.phoneContactsRow) {
                    radioCell.setText(LocaleController.getString(R.string.LastSeenContacts), PrivacyControlActivity.this.currentSubType == 1, false);
                } else if (i == PrivacyControlActivity.this.phoneEverybodyRow) {
                    radioCell.setText(LocaleController.getString(R.string.LastSeenEverybody), PrivacyControlActivity.this.currentSubType == 0, true);
                }
                if (PrivacyControlActivity.this.rulesType == 12) {
                    radioCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled(), null);
                    return;
                }
                return;
            }
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            if (i == PrivacyControlActivity.this.sectionRow) {
                if (PrivacyControlActivity.this.rulesType != 6) {
                    if (PrivacyControlActivity.this.rulesType != 5) {
                        if (PrivacyControlActivity.this.rulesType != 4) {
                            if (PrivacyControlActivity.this.rulesType != 9) {
                                if (PrivacyControlActivity.this.rulesType != 14) {
                                    if (PrivacyControlActivity.this.rulesType != 3) {
                                        if (PrivacyControlActivity.this.rulesType != 2) {
                                            if (PrivacyControlActivity.this.rulesType != 1) {
                                                if (PrivacyControlActivity.this.rulesType != 8) {
                                                    if (PrivacyControlActivity.this.rulesType != 10) {
                                                        if (PrivacyControlActivity.this.rulesType != 11) {
                                                            if (PrivacyControlActivity.this.rulesType == 12) {
                                                                headerCell.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
                                                                return;
                                                            } else {
                                                                headerCell.setText(LocaleController.getString(R.string.LastSeenTitle));
                                                                return;
                                                            }
                                                        }
                                                        headerCell.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
                                                        return;
                                                    }
                                                    headerCell.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                                                    return;
                                                }
                                                headerCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                                                return;
                                            }
                                            headerCell.setText(LocaleController.getString(R.string.WhoCanAddMe));
                                            return;
                                        }
                                        headerCell.setText(LocaleController.getString(R.string.WhoCanCallMe));
                                        return;
                                    }
                                    headerCell.setText(LocaleController.getString(R.string.P2PEnabledWith));
                                    return;
                                }
                                headerCell.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                                return;
                            }
                            headerCell.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                            return;
                        }
                        headerCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                        return;
                    }
                    headerCell.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                    return;
                }
                headerCell.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (i == PrivacyControlActivity.this.shareSectionRow) {
                if (PrivacyControlActivity.this.rulesType == 10) {
                    headerCell.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                    return;
                } else {
                    headerCell.setText(LocaleController.getString(R.string.AddExceptions));
                    return;
                }
            }
            if (i != PrivacyControlActivity.this.p2pSectionRow) {
                if (i != PrivacyControlActivity.this.phoneSectionRow) {
                    if (i != PrivacyControlActivity.this.priceHeaderRow) {
                        if (i == PrivacyControlActivity.this.giftTypesHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                            return;
                        }
                        return;
                    }
                    headerCell.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                }
                headerCell.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                return;
            }
            headerCell.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
        }

        public void lambda$onBindViewHolder$1() {
            PrivacyControlActivity.this.presentFragment(new PremiumPreviewFragment("noncontacts"));
        }

        public void lambda$onBindViewHolder$5() {
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            privacyControlActivity.showDialog(AlertsCreator.createBirthdayPickerDialog(privacyControlActivity.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onBindViewHolder$4((TL_account.TL_birthday) obj);
                }
            }, null, false, false, PrivacyControlActivity.this.getResourceProvider()).create());
        }

        public void lambda$onBindViewHolder$4(TL_account.TL_birthday tL_birthday) {
            TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
            updatebirthday.flags |= 1;
            updatebirthday.birthday = tL_birthday;
            final TLRPC.UserFull userFull = PrivacyControlActivity.this.getMessagesController().getUserFull(PrivacyControlActivity.this.getUserConfig().getClientUserId());
            final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
            if (userFull != null) {
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                PrivacyControlActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
            }
            PrivacyControlActivity.this.getMessagesController().invalidateContentSettings();
            PrivacyControlActivity.this.getConnectionsManager().sendRequest(updatebirthday, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$onBindViewHolder$3(userFull, tL_birthday2, tLObject, tL_error);
                }
            }, 1024);
            MessagesController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
            NotificationCenter.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            PrivacyControlActivity.this.updateRows(true);
        }

        public void lambda$onBindViewHolder$3(final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onBindViewHolder$2(tLObject, userFull, tL_birthday, tL_error);
                }
            });
        }

        public void lambda$onBindViewHolder$2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
            String str;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                BulletinFactory.of(PrivacyControlActivity.this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
                return;
            }
            if (userFull != null) {
                if (tL_birthday == null) {
                    userFull.flags2 &= -33;
                } else {
                    userFull.flags2 |= 32;
                }
                userFull.birthday = tL_birthday;
                PrivacyControlActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
            }
            if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (PrivacyControlActivity.this.getContext() != null) {
                    PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                    privacyControlActivity.showDialog(new AlertDialog.Builder(privacyControlActivity.getContext(), ((BaseFragment) PrivacyControlActivity.this).resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                    return;
                }
                return;
            }
            BulletinFactory.of(PrivacyControlActivity.this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
        }

        public CharSequence lambda$onBindViewHolder$6(Integer num, Integer num2) {
            if (num.intValue() == 0) {
                if (!PrivacyControlActivity.this.getUserConfig().isPremium()) {
                    if (PrivacyControlActivity.this.lockSpan == null) {
                        SpannableString spannableString = new SpannableString("l");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                        coloredImageSpan.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                        PrivacyControlActivity.this.lockSpan = spannableString;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(PrivacyControlActivity.this.lockSpan);
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num2.intValue()));
                    return spannableStringBuilder;
                }
                return LocaleController.formatPluralStringComma("Stars", num2.intValue());
            }
            return LocaleController.formatNumber(num2.intValue(), ',');
        }

        public void lambda$onBindViewHolder$7(Integer num) {
            PrivacyControlActivity.this.currentStars = num.intValue();
            AndroidUtilities.updateVisibleRow(PrivacyControlActivity.this.listView, PrivacyControlActivity.this.priceInfoRow);
            PrivacyControlActivity.this.updateDoneButton();
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PrivacyControlActivity.this.alwaysShareRow || i == PrivacyControlActivity.this.neverShareRow || i == PrivacyControlActivity.this.p2pRow || i == PrivacyControlActivity.this.readPremiumRow) {
                return 0;
            }
            if (i == PrivacyControlActivity.this.shareDetailRow || i == PrivacyControlActivity.this.detailRow || i == PrivacyControlActivity.this.detailRow2 || i == PrivacyControlActivity.this.priceInfoRow || i == PrivacyControlActivity.this.p2pDetailRow || i == PrivacyControlActivity.this.photoForRestDescriptionRow || i == PrivacyControlActivity.this.readDetailRow || i == PrivacyControlActivity.this.readPremiumDetailRow || i == PrivacyControlActivity.this.setBirthdayRow || i == PrivacyControlActivity.this.showGiftIconInfoRow || i == PrivacyControlActivity.this.giftTypesInfoRow) {
                return 1;
            }
            if (i == PrivacyControlActivity.this.sectionRow || i == PrivacyControlActivity.this.priceHeaderRow || i == PrivacyControlActivity.this.shareSectionRow || i == PrivacyControlActivity.this.p2pSectionRow || i == PrivacyControlActivity.this.phoneSectionRow || i == PrivacyControlActivity.this.giftTypesHeaderRow) {
                return 2;
            }
            if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.payRow || i == PrivacyControlActivity.this.phoneEverybodyRow || i == PrivacyControlActivity.this.phoneContactsRow) {
                return 3;
            }
            if (i == PrivacyControlActivity.this.messageRow) {
                return 4;
            }
            if (i == PrivacyControlActivity.this.phoneDetailRow) {
                return 5;
            }
            if (i == PrivacyControlActivity.this.photoForRestRow) {
                return 6;
            }
            if (i == PrivacyControlActivity.this.currentPhotoForRestRow) {
                return 7;
            }
            if (i == PrivacyControlActivity.this.readRow || i == PrivacyControlActivity.this.showGiftIconRow || i == PrivacyControlActivity.this.giftTypeUniqueRow || i == PrivacyControlActivity.this.giftTypeChannelsRow || i == PrivacyControlActivity.this.giftTypePremiumRow || i == PrivacyControlActivity.this.giftTypeUnlimitedRow || i == PrivacyControlActivity.this.giftTypeLimitedRow) {
                return 8;
            }
            if (i == PrivacyControlActivity.this.priceRow) {
                return 9;
            }
            return i == PrivacyControlActivity.this.priceButtonRow ? 10 : 0;
        }
    }

    private class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
        }

        @Override
        public int getOldListSize() {
            return this.oldRowCount;
        }

        @Override
        public int getNewListSize() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            int i3 = this.oldPositionToItem.get(i, -1);
            return i3 == this.newPositionToItem.get(i2, -1) && i3 >= 0;
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, PrivacyControlActivity.this.messageRow, sparseIntArray);
            put(2, PrivacyControlActivity.this.sectionRow, sparseIntArray);
            put(3, PrivacyControlActivity.this.everybodyRow, sparseIntArray);
            put(4, PrivacyControlActivity.this.myContactsRow, sparseIntArray);
            put(5, PrivacyControlActivity.this.nobodyRow, sparseIntArray);
            put(6, PrivacyControlActivity.this.payRow, sparseIntArray);
            put(7, PrivacyControlActivity.this.detailRow, sparseIntArray);
            put(8, PrivacyControlActivity.this.shareSectionRow, sparseIntArray);
            put(9, PrivacyControlActivity.this.alwaysShareRow, sparseIntArray);
            put(10, PrivacyControlActivity.this.neverShareRow, sparseIntArray);
            put(11, PrivacyControlActivity.this.shareDetailRow, sparseIntArray);
            put(12, PrivacyControlActivity.this.phoneSectionRow, sparseIntArray);
            put(13, PrivacyControlActivity.this.phoneEverybodyRow, sparseIntArray);
            put(14, PrivacyControlActivity.this.phoneContactsRow, sparseIntArray);
            put(15, PrivacyControlActivity.this.phoneDetailRow, sparseIntArray);
            put(16, PrivacyControlActivity.this.photoForRestRow, sparseIntArray);
            put(17, PrivacyControlActivity.this.currentPhotoForRestRow, sparseIntArray);
            put(18, PrivacyControlActivity.this.photoForRestDescriptionRow, sparseIntArray);
            put(19, PrivacyControlActivity.this.p2pSectionRow, sparseIntArray);
            put(20, PrivacyControlActivity.this.p2pRow, sparseIntArray);
            put(21, PrivacyControlActivity.this.p2pDetailRow, sparseIntArray);
            put(22, PrivacyControlActivity.this.readRow, sparseIntArray);
            put(23, PrivacyControlActivity.this.readDetailRow, sparseIntArray);
            put(24, PrivacyControlActivity.this.readPremiumRow, sparseIntArray);
            put(25, PrivacyControlActivity.this.readPremiumDetailRow, sparseIntArray);
            put(26, PrivacyControlActivity.this.priceHeaderRow, sparseIntArray);
            put(27, PrivacyControlActivity.this.priceRow, sparseIntArray);
            put(28, PrivacyControlActivity.this.priceInfoRow, sparseIntArray);
            put(29, PrivacyControlActivity.this.showGiftIconRow, sparseIntArray);
            put(30, PrivacyControlActivity.this.showGiftIconInfoRow, sparseIntArray);
            put(31, PrivacyControlActivity.this.giftTypesHeaderRow, sparseIntArray);
            put(32, PrivacyControlActivity.this.giftTypeLimitedRow, sparseIntArray);
            put(33, PrivacyControlActivity.this.giftTypeUnlimitedRow, sparseIntArray);
            put(34, PrivacyControlActivity.this.giftTypeUniqueRow, sparseIntArray);
            put(35, PrivacyControlActivity.this.giftTypeChannelsRow, sparseIntArray);
            put(36, PrivacyControlActivity.this.giftTypePremiumRow, sparseIntArray);
            put(37, PrivacyControlActivity.this.giftTypesInfoRow, sparseIntArray);
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, HeaderCell.class, RadioCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i3 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackground));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        RecyclerListView recyclerListView = this.listView;
        Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
        int i4 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView, 0, null, null, shadowDrawables, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        RecyclerListView recyclerListView2 = this.listView;
        Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
        int i5 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView2, 0, null, null, shadowDrawables2, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outTimeSelectedText));
        return arrayList;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
