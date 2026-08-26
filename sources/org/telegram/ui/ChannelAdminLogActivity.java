package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.content.FileProvider;
import androidx.core.math.MathUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import me.vkryl.core.BitwiseUtils;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.OnPostDrawView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageUnsupportedCell;
import org.telegram.ui.Cells.ChatUnreadCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AdminLogFilterAlert2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ChatScrimPopupContainerLayout;
import org.telegram.ui.Components.ClearHistoryAlert;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.WallpaperBitmapProvider;
import org.telegram.ui.Components.chat.layouts.ChatActivityChannelButtonsLayout;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class ChannelAdminLogActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int BLUR_INVALIDATE_FLAG_CLIP = 4;
    private static final int BLUR_INVALIDATE_FLAG_POSITIONS = 2;
    private static final int BLUR_INVALIDATE_FLAG_SCROLL = 1;
    private static final int OPTION_ADD_CONTACT = 15;
    private static final int OPTION_APPLY_FILE = 5;
    private static final int OPTION_BAN = 35;
    private static final int OPTION_CALL = 17;
    private static final int OPTION_COPY = 3;
    private static final int OPTION_COPY_PHONE = 16;
    private static final int OPTION_REPORT_FALSE_POSITIVE = 34;
    private static final int OPTION_RESTRICT = 33;
    private static final int OPTION_SAVE_STICKER = 9;
    private static final int OPTION_SAVE_TO_DOWNLOADS_OR_MUSIC = 10;
    private static final int OPTION_SAVE_TO_GALLERY = 4;
    private static final int OPTION_SAVE_TO_GALLERY2 = 7;
    private static final int OPTION_SAVE_TO_GIFS = 11;
    private static final int OPTION_SHARE = 6;
    private static final int[] allowedNotificationsDuringChatListAnimations = {NotificationCenter.chatInfoDidLoad, NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.messagesDidLoad, NotificationCenter.botKeyboardDidLoad};
    public static int lastStableId = 10;
    private long activityResumeTime;
    private ArrayList<TLRPC.ChannelParticipant> admins;
    private Paint aspectPaint;
    private Path aspectPath;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private ChatAvatarContainer avatarContainer;
    private ChatActivityChannelButtonsLayout bottomOverlayChat2;
    private TextView bottomOverlayChatText;
    private ChatActivityFadeView chatActivityFadeView;
    private ChatActivityAdapter chatAdapter;
    private LinearLayoutManager chatLayoutManager;
    private ChatListItemAnimator chatListItemAnimator;
    private ChatListRecyclerView chatListView;
    private ArrayList<ChatMessageCell> chatMessageCellsCache;
    private RecyclerAnimationScrollHelper chatScrollHelper;
    private final ChatScrollCallback chatScrollHelperCallback;
    private boolean checkTextureViewPosition;
    private float contentPanTranslation;
    private float contentPanTranslationT;
    private ChatActivityFragmentView contentView;
    protected TLRPC.Chat currentChat;
    private TLRPC.TL_channelAdminLogEventsFilter currentFilter;
    private boolean currentFloatingDateOnScreen;
    private boolean currentFloatingTopIsNotMessage;
    private ChatMessageCell dummyMessageCell;
    private ImageView emptyImageView;
    private LinearLayout emptyLayoutView;
    private TextView emptyView;
    private FrameLayout emptyViewContainer;
    private boolean endReached;
    private final HashSet<Long> expandedEvents;
    private final ArrayList<MessageObject> filteredMessages;
    private final ArrayList<Integer> filteredMessagesUpdatedPosition;
    private AnimatorSet floatingDateAnimation;
    private ChatActionCell floatingDateView;
    private final ReferenceList glassAttachedViews;
    private final BlurredBackgroundDrawableViewFactory glassBackgroundDrawableFactory;
    private final BlurredBackgroundDrawableViewFactory glassBackgroundDrawableFactoryFrosted;
    private final BlurredBackgroundSourceRenderNode glassBackgroundSourceFrostedRenderNode;
    private final BlurredBackgroundSourceRenderNode glassBackgroundSourceRenderNode;
    private final ArrayList<RectF> glassDrawablesPositions;
    private int glassDrawablesPositionsCount;
    private final ArrayList<RectF> glassDrawablesPositionsMerged;
    public int highlightMessageId;
    public String highlightMessageQuote;
    public boolean highlightMessageQuoteFirst;
    public int highlightMessageQuoteOffset;
    private OnPostDrawView invalidateBlurredSourcesView;
    private HashMap<String, Object> invitesCache;
    private boolean linviteLoading;
    private boolean loading;
    private int loadsCount;
    protected ArrayList<MessageObject> messages;
    private final HashMap<String, ArrayList<MessageObject>> messagesByDays;
    private final LongSparseArray messagesDict;
    private final int[] mid;
    private int minDate;
    private long minEventId;
    private final BlurredBackgroundDrawableViewFactory navbarContentDrawableFactory;
    private final BlurredBackgroundSourceWrapped navbarContentSourceWallpaper;
    private AnimationNotificationsLocker notificationsLocker;
    private boolean openAnimationEnded;
    private boolean paused;
    private RadialProgressView progressBar;
    private FrameLayout progressView;
    private View progressView2;
    private PhotoViewer.PhotoViewerProvider provider;
    private final LongSparseArray realMessagesDict;
    private final int recommendedAdditionalSizeY;
    private boolean reloadingLastMessages;
    private FrameLayout roundVideoContainer;
    private long savedScrollEventId;
    private int savedScrollOffset;
    private int savedScrollPosition;
    private ActionBarPopupWindow scrimPopupWindow;
    private int scrimPopupX;
    private int scrimPopupY;
    private boolean scrollByTouch;
    private int scrollCallbackAnimationIndex;
    private MessageObject scrollToMessage;
    private int scrollToMessagePosition;
    private int scrollToOffsetOnRecreate;
    private int scrollToPositionOnRecreate;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private boolean scrollingFloatingDate;
    private ImageView searchCalendarButton;
    private FrameLayout searchContainer;
    private SimpleTextView searchCountText;
    private ImageView searchDownButton;
    private ActionBarMenuItem searchItem;
    private String searchQuery;
    private ImageView searchUpButton;
    private boolean searchWas;
    private LongSparseArray selectedAdmins;
    private MessageObject selectedObject;
    private TLRPC.ChannelParticipant selectedParticipant;
    public boolean showNoQuoteAlert;
    private final LongSparseArray stableIdByEventExpand;
    private final RectF tmpViewRectF;
    private UndoView undoView;
    private Runnable unselectRunnable;
    private HashMap<Long, TLRPC.User> usersMap;
    private TextureView videoTextureView;
    private boolean wasManualScroll;
    private boolean wasPaused;

    public static class AnonymousClass21 {
        static final int[] $SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem;

        static {
            int[] iArr = new int[AvatarPreviewer.MenuItem.values().length];
            $SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem = iArr;
            try {
                iArr[AvatarPreviewer.MenuItem.SEND_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem[AvatarPreviewer.MenuItem.OPEN_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AnonymousClass9 extends ChatListItemAnimator {
        Runnable finishRunnable;
        int scrollAnimationIndex;

        public AnonymousClass9(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
            super(chatActivity, recyclerListView, resourcesProvider);
            this.scrollAnimationIndex = -1;
        }

        public void lambda$onAllAnimationsDone$0() {
            if (this.scrollAnimationIndex != -1) {
                ChannelAdminLogActivity.this.getNotificationCenter().onAnimationFinish(this.scrollAnimationIndex);
                this.scrollAnimationIndex = -1;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("admin logs chatItemAnimator enable notifications");
            }
        }

        @Override
        public void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            ChatActivity$21$$ExternalSyntheticLambda4 chatActivity$21$$ExternalSyntheticLambda4 = new ChatActivity$21$$ExternalSyntheticLambda4(this, 6);
            this.finishRunnable = chatActivity$21$$ExternalSyntheticLambda4;
            AndroidUtilities.runOnUIThread(chatActivity$21$$ExternalSyntheticLambda4);
        }

        @Override
        public void onAnimationStart() {
            if (this.scrollAnimationIndex == -1) {
                this.scrollAnimationIndex = ChannelAdminLogActivity.this.getNotificationCenter().setAnimationInProgress(this.scrollAnimationIndex, ChannelAdminLogActivity.allowedNotificationsDuringChatListAnimations, false);
            }
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("admin logs chatItemAnimator disable notifications");
            }
        }
    }

    public class ChatActivityAdapter extends RecyclerView.Adapter {
        private int loadingUpRow;
        private Context mContext;
        private int messagesEndRow;
        private int messagesStartRow;
        private int rowCount;
        private final ArrayList<Long> oldStableIds = new ArrayList<>();
        private final ArrayList<Long> stableIds = new ArrayList<>();

        public class AnonymousClass1 implements ChatMessageCell.ChatMessageCellDelegate {
            public AnonymousClass1() {
            }

            public void lambda$didLongPressUserAvatar$0(ChatMessageCell chatMessageCell, TLRPC.User user, AvatarPreviewer.MenuItem menuItem) {
                int i = AnonymousClass21.$SwitchMap$org$telegram$ui$AvatarPreviewer$MenuItem[menuItem.ordinal()];
                if (i == 1) {
                    openDialog(chatMessageCell, user);
                } else {
                    if (i != 2) {
                        return;
                    }
                    openProfile(user);
                }
            }

            public void lambda$didPressUrl$1(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    Browser.openUrl(ChannelAdminLogActivity.this.getParentActivity(), str, true);
                    return;
                }
                if (i == 1) {
                    if (str.startsWith("mailto:")) {
                        str = str.substring(7);
                    } else if (str.startsWith("tel:")) {
                        str = str.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str);
                }
            }

            private void openDialog(ChatMessageCell chatMessageCell, TLRPC.User user) {
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    if (ChannelAdminLogActivity.this.getMessagesController().checkCanOpenChat(bundle, ChannelAdminLogActivity.this)) {
                        ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle));
                    }
                }
            }

            private void openProfile(TLRPC.User user) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                ChannelAdminLogActivity.this.addCanBanUser(bundle, user.id);
                ProfileActivity profileActivity = new ProfileActivity(bundle);
                profileActivity.setPlayProfileAnimation(0);
                ChannelAdminLogActivity.this.presentFragment(profileActivity);
            }

            @Override
            public boolean allowAddPollOptions() {
                return false;
            }

            @Override
            public boolean canDrawOutboundsContent() {
                return true;
            }

            @Override
            public boolean canPerformActions() {
                return true;
            }

            @Override
            public boolean canPerformReply() {
                return canPerformActions();
            }

            @Override
            public boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                return false;
            }

            @Override
            public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                return false;
            }

            @Override
            public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                ChannelAdminLogActivity.this.createMenu(chatMessageCell);
            }

            @Override
            public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            @Override
            public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2) {
                return false;
            }

            @Override
            public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            @Override
            public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                return false;
            }

            @Override
            public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                return false;
            }

            @Override
            public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                int i = 2;
                if (user != null && user.id != UserConfig.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getClientUserId()) {
                    AvatarPreviewer.MenuItem[] menuItemArr = {AvatarPreviewer.MenuItem.OPEN_PROFILE, AvatarPreviewer.MenuItem.SEND_MESSAGE};
                    TLRPC.UserFull userFull = ChannelAdminLogActivity.this.getMessagesController().getUserFull(user.id);
                    AvatarPreviewer.Data dataOf = userFull != null ? AvatarPreviewer.Data.of(user, userFull, menuItemArr) : AvatarPreviewer.Data.of(user, ((BaseFragment) ChannelAdminLogActivity.this).classGuid, menuItemArr);
                    if (AvatarPreviewer.canPreview(dataOf)) {
                        AvatarPreviewer avatarPreviewer = AvatarPreviewer.getInstance();
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        avatarPreviewer.show((ViewGroup) channelAdminLogActivity.fragmentView, channelAdminLogActivity.getResourceProvider(), dataOf, new WearAuthSheet$$ExternalSyntheticLambda5(this, chatMessageCell, user, i));
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void didPressAboutRevenueSharingAds() {
            }

            @Override
            public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressAdmin(ChatMessageCell chatMessageCell) {
            }

            @Override
            public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                return false;
            }

            @Override
            public void didPressAppUpdateButton() {
                if (ApplicationLoader.isStandaloneBuild()) {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null) {
                        launchActivity.checkAppUpdate(true, null);
                        return;
                    }
                    return;
                }
                if (BuildVars.isHuaweiStoreApp()) {
                    Browser.openUrl(ChannelAdminLogActivity.this.getContext(), BuildVars.HUAWEI_STORE_URL);
                } else {
                    Browser.openUrl(ChannelAdminLogActivity.this.getContext(), BuildVars.PLAYSTORE_APP_URL);
                }
            }

            @Override
            public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (ChannelAdminLogActivity.this.expandedEvents.contains(Long.valueOf(messageObject.eventId))) {
                    ChannelAdminLogActivity.this.expandedEvents.remove(Long.valueOf(messageObject.eventId));
                } else {
                    ChannelAdminLogActivity.this.expandedEvents.add(Long.valueOf(messageObject.eventId));
                }
                ChannelAdminLogActivity.this.saveScrollPosition(true);
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
            }

            @Override
            public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
                if (chat == null || chat == ChannelAdminLogActivity.this.currentChat) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chat.id);
                if (i != 0) {
                    bundle.putInt("message_id", i);
                }
                if (MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).checkCanOpenChat(bundle, ChannelAdminLogActivity.this)) {
                    ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle), true);
                }
            }

            @Override
            public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
            }

            @Override
            public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
            }

            @Override
            public void didPressCommentButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
            }

            public void didPressDialogButton(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressEffect(ChatMessageCell chatMessageCell) {
            }

            public void didPressEmojiStatus() {
            }

            @Override
            public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
            }

            @Override
            public void didPressFactCheck(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i, int i2) {
            }

            @Override
            public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i) {
            }

            @Override
            public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
            }

            @Override
            public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressHint(ChatMessageCell chatMessageCell, int i) {
            }

            @Override
            public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                int i;
                File file;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject.getInputStickerSet() != null) {
                    ChannelAdminLogActivity.this.showDialog(new StickersAlert(ChannelAdminLogActivity.this.getParentActivity(), ChannelAdminLogActivity.this, messageObject.getInputStickerSet(), null, null, false));
                    return;
                }
                if (messageObject.isVideo() || (i = messageObject.type) == 1 || ((i == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
                    PhotoViewer.getInstance().setParentActivity(ChannelAdminLogActivity.this);
                    PhotoViewer.getInstance().openPhoto(messageObject, (ChatActivity) null, 0L, 0L, 0L, ChannelAdminLogActivity.this.provider);
                    return;
                }
                int i2 = messageObject.type;
                File pathToMessage = null;
                if (i2 == 3) {
                    try {
                        String str = messageObject.messageOwner.attachPath;
                        if (str != null && str.length() != 0) {
                            pathToMessage = new File(messageObject.messageOwner.attachPath);
                        }
                        if (pathToMessage == null || !pathToMessage.exists()) {
                            pathToMessage = ChannelAdminLogActivity.this.getFileLoader().getPathToMessage(messageObject.messageOwner);
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.setFlags(1);
                            intent.setDataAndType(FileProvider.getUriForFile(ChannelAdminLogActivity.this.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToMessage), "video/mp4");
                        } else {
                            intent.setDataAndType(Uri.fromFile(pathToMessage), "video/mp4");
                        }
                        ChannelAdminLogActivity.this.getParentActivity().startActivityForResult(intent, 500);
                        return;
                    } catch (Exception unused) {
                        ChannelAdminLogActivity.this.alertUserOpenError(messageObject);
                        return;
                    }
                }
                if (i2 == 4) {
                    if (AndroidUtilities.isMapsInstalled(ChannelAdminLogActivity.this)) {
                        LocationActivity locationActivity = new LocationActivity(0);
                        locationActivity.setMessageObject(messageObject);
                        ChannelAdminLogActivity.this.presentFragment(locationActivity);
                        return;
                    }
                    return;
                }
                if (i2 == 9 || i2 == 0) {
                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                        String str2 = messageObject.messageOwner.attachPath;
                        if (str2 == null || str2.length() == 0) {
                            file = null;
                        } else {
                            file = new File(messageObject.messageOwner.attachPath);
                            if (!file.exists()) {
                                file = null;
                            }
                        }
                        if (file == null) {
                            File pathToMessage2 = ChannelAdminLogActivity.this.getFileLoader().getPathToMessage(messageObject.messageOwner);
                            if (pathToMessage2.exists()) {
                                file = pathToMessage2;
                            }
                        }
                        if (ChannelAdminLogActivity.this.chatLayoutManager != null) {
                            if (ChannelAdminLogActivity.this.chatLayoutManager.findLastVisibleItemPosition() < ChannelAdminLogActivity.this.chatLayoutManager.getItemCount() - 1) {
                                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                                channelAdminLogActivity.scrollToPositionOnRecreate = channelAdminLogActivity.chatLayoutManager.findFirstVisibleItemPosition();
                                RecyclerListView.Holder holder = (RecyclerListView.Holder) ChannelAdminLogActivity.this.chatListView.findViewHolderForAdapterPosition(ChannelAdminLogActivity.this.scrollToPositionOnRecreate);
                                if (holder != null) {
                                    ChannelAdminLogActivity.this.scrollToOffsetOnRecreate = holder.itemView.getTop();
                                } else {
                                    ChannelAdminLogActivity.this.scrollToPositionOnRecreate = -1;
                                }
                            } else {
                                ChannelAdminLogActivity.this.scrollToPositionOnRecreate = -1;
                            }
                        }
                        Theme.ThemeInfo themeInfoApplyThemeFile = Theme.applyThemeFile(file, messageObject.getDocumentName(), null, true);
                        if (themeInfoApplyThemeFile != null) {
                            ChannelAdminLogActivity.this.presentFragment(new ThemePreviewActivity(themeInfoApplyThemeFile));
                            return;
                        }
                        ChannelAdminLogActivity.this.scrollToPositionOnRecreate = -1;
                    }
                    try {
                        AndroidUtilities.openForView(messageObject, ChannelAdminLogActivity.this.getParentActivity(), null, false);
                    } catch (Exception unused2) {
                        ChannelAdminLogActivity.this.alertUserOpenError(messageObject);
                    }
                }
            }

            @Override
            public void didPressInstantButton(ChatMessageCell chatMessageCell, int i) {
                TLRPC.WebPage webPage;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
                if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -messageObject.getDialogId());
                    bundle.putInt("message_id", messageObject.getRealId());
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    if (ChatObject.isForum(ChannelAdminLogActivity.this.currentChat)) {
                        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject.messageOwner, true)));
                    }
                    ChannelAdminLogActivity.this.presentFragment(chatActivity);
                    return;
                }
                if (i == 0) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                        return;
                    }
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                        ChannelAdminLogActivity.this.createArticleViewer(false).open(messageObject);
                        return;
                    }
                    return;
                }
                if (i == 5) {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    TLRPC.User user = channelAdminLogActivity.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    channelAdminLogActivity.openVCard(user, messageMedia2.vcard, messageMedia2.first_name, messageMedia2.last_name);
                    return;
                }
                TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
                if (messageMedia3 == null || messageMedia3.webpage == null) {
                    return;
                }
                Browser.openUrl(ChannelAdminLogActivity.this.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            }

            @Override
            public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                ChannelAdminLogActivity.this.createMenu(chatMessageCell);
            }

            @Override
            public void didPressPollMedia(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
            }

            @Override
            public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            @Override
            public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
                MessageObject messageObject = chatMessageCell.getMessageObject().replyMessageObject;
                if (messageObject.getDialogId() == (-ChannelAdminLogActivity.this.currentChat.id)) {
                    for (int i2 = 0; i2 < ChannelAdminLogActivity.this.filteredMessages.size(); i2++) {
                        MessageObject messageObject2 = (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get(i2);
                        if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                            ChannelAdminLogActivity.this.scrollToMessage(messageObject2, true);
                            return;
                        }
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ChannelAdminLogActivity.this.currentChat.id);
                bundle.putInt("message_id", messageObject.getRealId());
                ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle));
            }

            @Override
            public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
            }

            @Override
            public void didPressShowMore(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressSideButton(ChatMessageCell chatMessageCell) {
                if (ChannelAdminLogActivity.this.getParentActivity() == null) {
                    return;
                }
                ChatActivityAdapter chatActivityAdapter = ChatActivityAdapter.this;
                ChannelAdminLogActivity.this.showDialog(ShareAlert.createShareAlert(chatActivityAdapter.mContext, chatMessageCell.getMessageObject(), null, ChatObject.isChannel(ChannelAdminLogActivity.this.currentChat) && !ChannelAdminLogActivity.this.currentChat.megagroup, null, false));
            }

            @Override
            public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
            }

            @Override
            public void didPressSummarize(ChatMessageCell chatMessageCell, boolean z) {
            }

            @Override
            public void didPressTime(ChatMessageCell chatMessageCell) {
            }

            @Override
            public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                return false;
            }

            public void didPressTopicButton(ChatMessageCell chatMessageCell) {
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -messageObject.getDialogId());
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(messageObject.getDialogId(), MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject.messageOwner, true)));
                    ChannelAdminLogActivity.this.presentFragment(chatActivity);
                }
            }

            @Override
            public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                TLRPC.WebPage webPage;
                int i = 1;
                if (characterStyle == null) {
                    return;
                }
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (characterStyle instanceof URLSpanMono) {
                    ((URLSpanMono) characterStyle).copyToClipboard();
                    if (AndroidUtilities.shouldShowClipboardToast()) {
                        Toast.makeText(ChannelAdminLogActivity.this.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                        return;
                    }
                    return;
                }
                if (characterStyle instanceof URLSpanUserMention) {
                    Long l = Utilities.parseLong(((URLSpanUserMention) characterStyle).getURL());
                    long jLongValue = l.longValue();
                    if (jLongValue > 0) {
                        TLRPC.User user = MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getUser(l);
                        if (user != null) {
                            MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).openChatOrProfileWith(user, null, ChannelAdminLogActivity.this, 0, false);
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getChat(Long.valueOf(-jLongValue));
                    if (chat != null) {
                        MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).openChatOrProfileWith(null, chat, ChannelAdminLogActivity.this, 0, false);
                        return;
                    }
                    return;
                }
                if (characterStyle instanceof URLSpanNoUnderline) {
                    String url = ((URLSpanNoUnderline) characterStyle).getURL();
                    if (url.startsWith("@")) {
                        MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).openByUserName(url.substring(1), ChannelAdminLogActivity.this, 0);
                        return;
                    } else {
                        if (url.startsWith("#")) {
                            DialogsActivity dialogsActivity = new DialogsActivity(null);
                            dialogsActivity.setSearchString(url);
                            ChannelAdminLogActivity.this.presentFragment(dialogsActivity);
                            return;
                        }
                        return;
                    }
                }
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z) {
                    BottomSheet bottomSheet = new BottomSheet(ChannelAdminLogActivity.this.getParentActivity(), false, false, null);
                    bottomSheet.fixNavigationBar();
                    bottomSheet.title = url2;
                    bottomSheet.bigTitle = false;
                    CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                    ArticleViewer$$ExternalSyntheticLambda1 articleViewer$$ExternalSyntheticLambda1 = new ArticleViewer$$ExternalSyntheticLambda1(i, this, url2);
                    bottomSheet.items = charSequenceArr;
                    bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda1;
                    ChannelAdminLogActivity.this.showDialog(bottomSheet);
                    return;
                }
                if (characterStyle instanceof URLSpanReplacement) {
                    ChannelAdminLogActivity.this.showOpenUrlAlert(((URLSpanReplacement) characterStyle).getURL(), true);
                    return;
                }
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                    String lowerCase = url2.toLowerCase();
                    String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
                    if ((Browser.isTelegraphUrl(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                        LaunchActivity launchActivity = LaunchActivity.instance;
                        if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                            ChannelAdminLogActivity.this.createArticleViewer(false).open(messageObject);
                            return;
                        }
                        return;
                    }
                }
                Browser.openUrl(ChannelAdminLogActivity.this.getParentActivity(), url2, true);
            }

            @Override
            public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
                if (user == null || user.id == UserConfig.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getClientUserId()) {
                    return;
                }
                openProfile(user);
            }

            @Override
            public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
            }

            @Override
            public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
            }

            @Override
            public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
            }

            @Override
            public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
            }

            @Override
            public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                Browser.openUrl(chatMessageCell.getContext(), str);
            }

            @Override
            public void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
            }

            @Override
            public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
            }

            @Override
            public void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
            }

            @Override
            public void didStartVideoStream(MessageObject messageObject) {
            }

            @Override
            public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
            }

            @Override
            public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z, Runnable runnable) {
            }

            @Override
            public boolean doNotShowLoadingReply(MessageObject messageObject) {
                return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
            }

            @Override
            public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
            }

            public boolean drawingVideoPlayerContainer() {
                return false;
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
            }

            @Override
            public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z) {
            }

            @Override
            public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                return 0;
            }

            @Override
            public String getAdminRank(long j) {
                return null;
            }

            @Override
            public int getChatMode() {
                return 0;
            }

            @Override
            public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                return null;
            }

            @Override
            public PinchToZoomHelper getPinchToZoomHelper() {
                return null;
            }

            @Override
            public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                return null;
            }

            @Override
            public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                return null;
            }

            @Override
            public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                return null;
            }

            @Override
            public boolean hasSelectedMessages() {
                return false;
            }

            @Override
            public void invalidateBlur() {
            }

            @Override
            public boolean isAdmin(long j) {
                return false;
            }

            @Override
            public boolean isLandscape() {
                return false;
            }

            @Override
            public boolean isOwner(long j) {
                return false;
            }

            @Override
            public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i) {
                return false;
            }

            @Override
            public boolean isReplyOrSelf() {
                return false;
            }

            @Override
            public boolean keyboardIsOpened() {
                return false;
            }

            @Override
            public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                EmbedBottomSheet.show(channelAdminLogActivity, messageObject, channelAdminLogActivity.provider, str2, str3, str4, str, i, i2, false);
            }

            @Override
            public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject, z);
                    MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
                    return zPlayMessage;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(ChannelAdminLogActivity.this.filteredMessages, messageObject, 0L);
                }
                return false;
            }

            @Override
            public void needReloadPolls() {
            }

            @Override
            public void needShowPremiumBulletin(int i) {
            }

            public void needShowPremiumFeatures(String str) {
            }

            @Override
            public boolean onAccessibilityAction(int i, Bundle bundle) {
                return false;
            }

            @Override
            public void onDiceFinished() {
            }

            @Override
            public boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                return false;
            }

            @Override
            public void setShouldNotRepeatSticker(MessageObject messageObject) {
            }

            @Override
            public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                return false;
            }

            @Override
            public boolean shouldRepeatSticker(MessageObject messageObject) {
                return true;
            }

            public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell) {
                return false;
            }

            public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject == null || (tL_channelAdminLogEvent = messageObject.currentEvent) == null) {
                    return false;
                }
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if ((channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
                    return ChatObject.isForum(ChannelAdminLogActivity.this.currentChat);
                }
                return false;
            }

            @Override
            public void videoTimerReached() {
            }

            @Override
            public void forceUpdate(ChatMessageCell chatMessageCell, boolean z, boolean z2) {
                forceUpdate(chatMessageCell, z);
            }
        }

        public class AnonymousClass3 implements ChatActionCell.ChatActionCellDelegate {
            public AnonymousClass3() {
            }

            public void lambda$needOpenInviteLink$0(boolean[] zArr, DialogInterface dialogInterface) {
                ChannelAdminLogActivity.this.linviteLoading = false;
                zArr[0] = true;
            }

            public void lambda$needOpenInviteLink$1(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, boolean[] zArr, AlertDialog alertDialog) {
                ChannelAdminLogActivity.this.linviteLoading = false;
                ChannelAdminLogActivity.this.invitesCache.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (zArr[0]) {
                    return;
                }
                alertDialog.dismiss();
                if (tL_messages_exportedChatInvite == null) {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkHashExpired, BulletinFactory.of(ChannelAdminLogActivity.this), R.raw.linkbroken);
                } else {
                    ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                    channelAdminLogActivity.showInviteLinkBottomSheet(tL_messages_exportedChatInvite, channelAdminLogActivity.usersMap);
                }
            }

            public void lambda$needOpenInviteLink$2(TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i = 0; i < tL_messages_exportedChatInvite.users.size(); i++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i);
                        if (ChannelAdminLogActivity.this.usersMap == null) {
                            ChannelAdminLogActivity.this.usersMap = new HashMap();
                        }
                        ChannelAdminLogActivity.this.usersMap.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22(this, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, alertDialog, 1));
            }

            @Override
            public boolean canDrawOutboundsContent() {
                return true;
            }

            @Override
            public void didClickButton(ChatActionCell chatActionCell) {
            }

            @Override
            public void didClickImage(ChatActionCell chatActionCell) {
                MessageObject messageObject = chatActionCell.getMessageObject();
                if (messageObject.type == 22) {
                    ChannelAdminLogActivity.this.presentFragment(new ChannelColorActivity(getDialogId()).setOnApplied(ChannelAdminLogActivity.this));
                    return;
                }
                PhotoViewer.getInstance().setParentActivity(ChannelAdminLogActivity.this);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
                if (closestPhotoSizeWithSize == null) {
                    PhotoViewer.getInstance().openPhoto(messageObject, (ChatActivity) null, 0L, 0L, 0L, ChannelAdminLogActivity.this.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ChannelAdminLogActivity.this.provider);
                }
            }

            @Override
            public boolean didLongPress(ChatActionCell chatActionCell, float f, float f2) {
                return ChannelAdminLogActivity.this.createMenu(chatActionCell);
            }

            @Override
            public void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
            }

            @Override
            public void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str, boolean z) {
            }

            public void didPressBotButton(MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
            }

            @Override
            public void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            @Override
            public void didPressReplyMessage(ChatActionCell chatActionCell, int i) {
            }

            @Override
            public void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2) {
            }

            @Override
            public void forceUpdate(ChatActionCell chatActionCell, boolean z) {
            }

            @Override
            public BaseFragment getBaseFragment() {
                return ChannelAdminLogActivity.this;
            }

            @Override
            public long getDialogId() {
                return -ChannelAdminLogActivity.this.currentChat.id;
            }

            @Override
            public long getTopicId() {
                return 0L;
            }

            @Override
            public void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                if (ChannelAdminLogActivity.this.linviteLoading) {
                    return;
                }
                Object obj = ChannelAdminLogActivity.this.invitesCache.containsKey(tL_chatInviteExported.link) ? ChannelAdminLogActivity.this.invitesCache.get(tL_chatInviteExported.link) : null;
                if (obj != null) {
                    if (!(obj instanceof TLRPC.TL_messages_exportedChatInvite)) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkHashExpired, BulletinFactory.of(ChannelAdminLogActivity.this), R.raw.linkbroken);
                        return;
                    } else {
                        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                        channelAdminLogActivity.showInviteLinkBottomSheet((TLRPC.TL_messages_exportedChatInvite) obj, channelAdminLogActivity.usersMap);
                        return;
                    }
                }
                TLRPC.TL_messages_getExportedChatInvite tL_messages_getExportedChatInvite = new TLRPC.TL_messages_getExportedChatInvite();
                tL_messages_getExportedChatInvite.peer = ChannelAdminLogActivity.this.getMessagesController().getInputPeer(-ChannelAdminLogActivity.this.currentChat.id);
                tL_messages_getExportedChatInvite.link = tL_chatInviteExported.link;
                ChannelAdminLogActivity.this.linviteLoading = true;
                final boolean[] zArr = new boolean[1];
                AlertDialog alertDialog = new AlertDialog(ChannelAdminLogActivity.this.getParentActivity(), 3, null);
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.f$0.lambda$needOpenInviteLink$0(zArr, dialogInterface);
                    }
                });
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
                ChannelAdminLogActivity.this.getConnectionsManager().bindRequestToGuid(ChannelAdminLogActivity.this.getConnectionsManager().sendRequest(tL_messages_getExportedChatInvite, new LoginActivity$$ExternalSyntheticLambda27(1, this, tL_chatInviteExported, zArr, alertDialog)), ((BaseFragment) ChannelAdminLogActivity.this).classGuid);
            }

            @Override
            public void needOpenUserProfile(long j) {
                if (j < 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    if (MessagesController.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).checkCanOpenChat(bundle, ChannelAdminLogActivity.this)) {
                        ChannelAdminLogActivity.this.presentFragment(new ChatActivity(bundle), true);
                        return;
                    }
                    return;
                }
                if (j != UserConfig.getInstance(((BaseFragment) ChannelAdminLogActivity.this).currentAccount).getClientUserId()) {
                    Bundle bundleM = FBool.m(j, "user_id");
                    ChannelAdminLogActivity.this.addCanBanUser(bundleM, j);
                    ProfileActivity profileActivity = new ProfileActivity(bundleM);
                    profileActivity.setPlayProfileAnimation(0);
                    ChannelAdminLogActivity.this.presentFragment(profileActivity);
                }
            }

            @Override
            public void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
            }

            @Override
            public void onTopicClick(ChatActionCell chatActionCell) {
            }
        }

        public ChatActivityAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public int getItemCount() {
            return this.rowCount;
        }

        @Override
        public long getItemId(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return i == this.loadingUpRow ? 2L : 5L;
            }
            return ((MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1)).stableId;
        }

        @Override
        public int getItemViewType(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return 4;
            }
            return ((MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1)).contentType;
        }

        public MessageObject getMessageObject(int i) {
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return null;
            }
            return (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1);
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            try {
                super.notifyDataSetChanged();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void lambda$onBindViewHolder$31(int i) {
            updateRows(false);
            try {
                super.lambda$onBindViewHolder$31(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemInserted(int i) {
            updateRows(false);
            try {
                super.notifyItemInserted(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemMoved(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemMoved(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemRangeChanged(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemRangeInserted(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows(false);
            try {
                super.notifyItemRangeRemoved(i, i2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void notifyItemRemoved(int i) {
            updateRows(false);
            try {
                super.notifyItemRemoved(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            if (i == this.loadingUpRow) {
                ((ChatLoadingCell) viewHolder.itemView).setProgressVisible(true);
                return;
            }
            if (i < this.messagesStartRow || i >= this.messagesEndRow) {
                return;
            }
            MessageObject messageObject = (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow)) - 1);
            View view = viewHolder.itemView;
            if (!(view instanceof ChatMessageCell)) {
                if (view instanceof ChatActionCell) {
                    ChatActionCell chatActionCell = (ChatActionCell) view;
                    chatActionCell.setMessageObject(messageObject);
                    chatActionCell.setAlpha(1.0f);
                    return;
                }
                return;
            }
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            chatMessageCell.isChat = true;
            int i2 = i + 1;
            int itemViewType = getItemViewType(i2);
            int itemViewType2 = getItemViewType(i - 1);
            if ((messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) || itemViewType != viewHolder.getItemViewType()) {
                z = false;
            } else {
                MessageObject messageObject2 = (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get((ChannelAdminLogActivity.this.filteredMessages.size() - (i2 - this.messagesStartRow)) - 1);
                z = messageObject2.isOutOwner() == messageObject.isOutOwner() && messageObject2.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) <= 300;
                if (z) {
                    TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
                    long topicId = tL_forumTopic == null ? MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject.messageOwner, true) : tL_forumTopic.id;
                    TLRPC.TL_forumTopic tL_forumTopic2 = messageObject2.replyToForumTopic;
                    if (topicId != (tL_forumTopic2 == null ? MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject2.messageOwner, true) : tL_forumTopic2.id)) {
                        z = false;
                    }
                }
            }
            if (itemViewType2 == viewHolder.getItemViewType()) {
                MessageObject messageObject3 = (MessageObject) ChannelAdminLogActivity.this.filteredMessages.get(ChannelAdminLogActivity.this.filteredMessages.size() - (i - this.messagesStartRow));
                boolean z3 = !(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && messageObject3.getFromChatId() == messageObject.getFromChatId() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300;
                if (z3) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = messageObject.replyToForumTopic;
                    long topicId2 = tL_forumTopic3 == null ? MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject.messageOwner, true) : tL_forumTopic3.id;
                    TLRPC.TL_forumTopic tL_forumTopic4 = messageObject3.replyToForumTopic;
                    if (topicId2 != (tL_forumTopic4 == null ? MessageObject.getTopicId(((BaseFragment) ChannelAdminLogActivity.this).currentAccount, messageObject3.messageOwner, true) : tL_forumTopic4.id)) {
                        z2 = false;
                    }
                }
                z2 = z3;
            } else {
                z2 = false;
            }
            chatMessageCell.setMessageObject(messageObject, null, z, z2, false);
            chatMessageCell.setHighlighted(false);
            chatMessageCell.setHighlightedText(ChannelAdminLogActivity.this.searchQuery);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View chatLoadingCell;
            View chatMessageCell;
            if (i == 0) {
                if (ChannelAdminLogActivity.this.chatMessageCellsCache.isEmpty()) {
                    chatMessageCell = new ChatMessageCell(this.mContext, ((BaseFragment) ChannelAdminLogActivity.this).currentAccount, false, null, null);
                } else {
                    View view = (View) ChannelAdminLogActivity.this.chatMessageCellsCache.get(0);
                    ChannelAdminLogActivity.this.chatMessageCellsCache.remove(0);
                    chatMessageCell = view;
                }
                ChatMessageCell chatMessageCell2 = (ChatMessageCell) chatMessageCell;
                chatMessageCell2.setDelegate(new AnonymousClass1());
                chatMessageCell2.setAllowAssistant(true);
                chatLoadingCell = chatMessageCell;
            } else if (i == 1) {
                ChatActionCell chatActionCell = new ChatActionCell(this.mContext) {
                    @Override
                    public boolean drawPinnedBottom() {
                        return false;
                    }

                    @Override
                    public boolean drawPinnedTop() {
                        return false;
                    }

                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setVisibleToUser(true);
                    }

                    @Override
                    public void setAnimationRunning(boolean z, boolean z2) {
                    }

                    @Override
                    public boolean shouldDrawAlphaLayer() {
                        return false;
                    }

                    @Override
                    public boolean willRemovedAfterAnimation() {
                        return false;
                    }
                };
                chatActionCell.setDelegate(new AnonymousClass3());
                chatLoadingCell = chatActionCell;
            } else if (i == 2) {
                chatLoadingCell = new ChatUnreadCell(this.mContext, null);
            } else if (i == 10) {
                ChatMessageUnsupportedCell chatMessageUnsupportedCell = new ChatMessageUnsupportedCell(this.mContext, ((BaseFragment) ChannelAdminLogActivity.this).resourceProvider);
                chatMessageUnsupportedCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                    @Override
                    public boolean allowAddPollOptions() {
                        return false;
                    }

                    @Override
                    public boolean canDrawOutboundsContent() {
                        return true;
                    }

                    @Override
                    public boolean canPerformActions() {
                        return false;
                    }

                    @Override
                    public boolean canPerformReply() {
                        return canPerformActions();
                    }

                    @Override
                    public boolean canSaveRichDocument(ChatMessageCell chatMessageCell3) {
                        return false;
                    }

                    @Override
                    public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3) {
                        return false;
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell3, float f, float f2) {
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i2, float f, float f2) {
                        return false;
                    }

                    @Override
                    public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    }

                    @Override
                    public boolean didLongPressPollOption(ChatMessageCell chatMessageCell3, TLRPC.PollAnswer pollAnswer) {
                        return false;
                    }

                    @Override
                    public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem) {
                        return false;
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2) {
                        return false;
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                    }

                    @Override
                    public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressAdmin(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell3, AnimatedEmojiSpan animatedEmojiSpan) {
                        return false;
                    }

                    @Override
                    public void didPressAppUpdateButton() {
                        if (ApplicationLoader.isStandaloneBuild()) {
                            LaunchActivity launchActivity = LaunchActivity.instance;
                            if (launchActivity != null) {
                                launchActivity.checkAppUpdate(true, null);
                                return;
                            }
                            return;
                        }
                        if (BuildVars.isHuaweiStoreApp()) {
                            Browser.openUrl(ChannelAdminLogActivity.this.getContext(), BuildVars.HUAWEI_STORE_URL);
                        } else {
                            Browser.openUrl(ChannelAdminLogActivity.this.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        }
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell3, TLObject tLObject, boolean z) {
                    }

                    @Override
                    public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressCodeCopy(ChatMessageCell chatMessageCell3, MessageObject.TextLayoutBlock textLayoutBlock) {
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    }

                    public void didPressDialogButton(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell3) {
                    }

                    public void didPressEmojiStatus() {
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    }

                    @Override
                    public void didPressFactCheck(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressFactCheckWhat(ChatMessageCell chatMessageCell3, int i2, int i3) {
                    }

                    @Override
                    public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell3, int i2) {
                    }

                    @Override
                    public void didPressGroupImage(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    }

                    @Override
                    public void didPressHiddenForward(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressHint(ChatMessageCell chatMessageCell3, int i2) {
                    }

                    @Override
                    public void didPressImage(ChatMessageCell chatMessageCell3, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell3, int i2) {
                    }

                    @Override
                    public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell3, float f, float f2) {
                    }

                    @Override
                    public void didPressPollMedia(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell3, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell3, int i2, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell3, TLRPC.Document document, float f, float f2) {
                    }

                    @Override
                    public void didPressShowMore(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressSideButton(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressSponsoredClose(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressSponsoredInfo(ChatMessageCell chatMessageCell3, float f, float f2) {
                    }

                    @Override
                    public void didPressSummarize(ChatMessageCell chatMessageCell3, boolean z) {
                    }

                    @Override
                    public void didPressTime(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public boolean didPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem, boolean z) {
                        return false;
                    }

                    public void didPressTopicButton(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell3, CharacterStyle characterStyle, boolean z) {
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell3, TLRPC.User user, TLRPC.Document document, String str) {
                    }

                    @Override
                    public void didPressViaBot(ChatMessageCell chatMessageCell3, String str) {
                    }

                    @Override
                    public void didPressViaBotNotInline(ChatMessageCell chatMessageCell3, long j) {
                    }

                    @Override
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell3, ArrayList arrayList, int i2, int i3, int i4) {
                    }

                    @Override
                    public void didPressWebPage(ChatMessageCell chatMessageCell3, TLRPC.WebPage webPage, String str, boolean z) {
                        Browser.openUrl(chatMessageCell3.getContext(), str);
                    }

                    @Override
                    public void didQuickShareEnd(ChatMessageCell chatMessageCell3, float f, float f2) {
                    }

                    @Override
                    public void didQuickShareMove(ChatMessageCell chatMessageCell3, float f, float f2) {
                    }

                    @Override
                    public void didQuickShareStart(ChatMessageCell chatMessageCell3, float f, float f2) {
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject) {
                    }

                    @Override
                    public void didTogglePollPreview(ChatMessageCell chatMessageCell3) {
                    }

                    @Override
                    public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3, boolean z, Runnable runnable) {
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
                    }

                    @Override
                    public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell3) {
                    }

                    public boolean drawingVideoPlayerContainer() {
                        return false;
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell3, boolean z) {
                    }

                    @Override
                    public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell3, boolean z) {
                    }

                    @Override
                    public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell3) {
                        return 0;
                    }

                    @Override
                    public String getAdminRank(long j) {
                        return null;
                    }

                    @Override
                    public int getChatMode() {
                        return 0;
                    }

                    @Override
                    public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                        return null;
                    }

                    @Override
                    public PinchToZoomHelper getPinchToZoomHelper() {
                        return null;
                    }

                    @Override
                    public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell3) {
                        return null;
                    }

                    @Override
                    public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell3) {
                        return null;
                    }

                    @Override
                    public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                        return null;
                    }

                    @Override
                    public boolean hasSelectedMessages() {
                        return false;
                    }

                    @Override
                    public void invalidateBlur() {
                    }

                    @Override
                    public boolean isAdmin(long j) {
                        return false;
                    }

                    @Override
                    public boolean isLandscape() {
                        return false;
                    }

                    @Override
                    public boolean isOwner(long j) {
                        return false;
                    }

                    @Override
                    public boolean isProgressLoading(ChatMessageCell chatMessageCell3, int i2) {
                        return false;
                    }

                    @Override
                    public boolean isReplyOrSelf() {
                        return false;
                    }

                    @Override
                    public boolean keyboardIsOpened() {
                        return false;
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                    }

                    @Override
                    public boolean needPlayMessage(ChatMessageCell chatMessageCell3, MessageObject messageObject, boolean z) {
                        return false;
                    }

                    @Override
                    public void needReloadPolls() {
                    }

                    @Override
                    public void needShowPremiumBulletin(int i2) {
                    }

                    public void needShowPremiumFeatures(String str) {
                    }

                    @Override
                    public boolean onAccessibilityAction(int i2, Bundle bundle) {
                        return false;
                    }

                    @Override
                    public void onDiceFinished() {
                    }

                    @Override
                    public boolean openArticlePhoto(ChatMessageCell chatMessageCell3, TL_iv.PageBlock pageBlock) {
                        return false;
                    }

                    @Override
                    public void setShouldNotRepeatSticker(MessageObject messageObject) {
                    }

                    @Override
                    public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell3, boolean z) {
                        return false;
                    }

                    @Override
                    public boolean shouldRepeatSticker(MessageObject messageObject) {
                        return true;
                    }

                    public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell3) {
                        return false;
                    }

                    public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell3) {
                        return false;
                    }

                    @Override
                    public void videoTimerReached() {
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell3, boolean z, boolean z2) {
                        forceUpdate(chatMessageCell3, z);
                    }
                });
                chatLoadingCell = chatMessageUnsupportedCell;
            } else {
                Context context = this.mContext;
                ChatActivityFragmentView unused = ChannelAdminLogActivity.this.contentView;
                chatLoadingCell = new ChatLoadingCell(context, null);
            }
            return zzkd.m(chatLoadingCell, chatLoadingCell, -2);
        }

        @Override
        public void onViewAttachedToWindow(final RecyclerView.ViewHolder viewHolder) {
            final View view = viewHolder.itemView;
            if ((view instanceof ChatMessageCell) || (view instanceof ChatActionCell)) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        int measuredHeight = ChannelAdminLogActivity.this.chatListView.getMeasuredHeight();
                        int top = view.getTop();
                        view.getBottom();
                        int i = top >= 0 ? 0 : -top;
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (measuredHeight2 > measuredHeight) {
                            measuredHeight2 = i + measuredHeight;
                        }
                        View view2 = viewHolder.itemView;
                        if (view2 instanceof ChatMessageCell) {
                            ((ChatMessageCell) view).setVisiblePart(i, measuredHeight2 - i, (ChannelAdminLogActivity.this.contentView.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ChannelAdminLogActivity.this.chatListView.getTop(), 0.0f, (view.getY() + ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight()) - ChannelAdminLogActivity.this.contentView.getBackgroundTranslationY(), ChannelAdminLogActivity.this.contentView.getMeasuredWidth(), ChannelAdminLogActivity.this.contentView.getBackgroundSizeY(), 0, 0, 0);
                            return true;
                        }
                        if (!(view2 instanceof ChatActionCell) || ((BaseFragment) ChannelAdminLogActivity.this).actionBar == null || ChannelAdminLogActivity.this.contentView == null) {
                            return true;
                        }
                        View view3 = view;
                        ((ChatActionCell) view3).setVisiblePart((view3.getY() + ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight()) - ChannelAdminLogActivity.this.contentView.getBackgroundTranslationY(), ChannelAdminLogActivity.this.contentView.getBackgroundSizeY());
                        return true;
                    }
                });
            }
            View view2 = viewHolder.itemView;
            if (view2 instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view2;
                chatMessageCell.getMessageObject();
                chatMessageCell.setBackgroundDrawable(null);
                chatMessageCell.setCheckPressed(true, false);
                chatMessageCell.setHighlighted(false);
            }
        }

        public void updateRowWithMessageObject(MessageObject messageObject) {
            int iIndexOf = ChannelAdminLogActivity.this.filteredMessages.indexOf(messageObject);
            if (iIndexOf == -1) {
                return;
            }
            lambda$onBindViewHolder$31(((ChannelAdminLogActivity.this.filteredMessages.size() + this.messagesStartRow) - iIndexOf) - 1);
        }

        public void updateRows() {
            updateRows(true);
        }

        public void updateRows(boolean z) {
            this.rowCount = 0;
            if (ChannelAdminLogActivity.this.filteredMessages.isEmpty()) {
                this.loadingUpRow = -1;
                this.messagesStartRow = -1;
                this.messagesEndRow = -1;
                return;
            }
            if (ChannelAdminLogActivity.this.endReached) {
                this.loadingUpRow = -1;
            } else {
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.loadingUpRow = i;
            }
            int i2 = this.rowCount;
            this.messagesStartRow = i2;
            int size = ChannelAdminLogActivity.this.filteredMessages.size() + i2;
            this.rowCount = size;
            this.messagesEndRow = size;
        }
    }

    public class ChatActivityFragmentView extends SizeNotifierFrameLayout {
        public ChatActivityFragmentView(Context context) {
            super(context);
        }

        public void drawList(Canvas canvas, RectF rectF) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (ChannelAdminLogActivity.this.chatListView.hasActiveEdgeEffects()) {
                canvas.save();
                canvas.clipRect(rectF);
                drawChild(canvas, ChannelAdminLogActivity.this.chatListView, jUptimeMillis);
                canvas.restore();
                return;
            }
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, ChannelAdminLogActivity.this.chatListView.getY());
            ChannelAdminLogActivity.this.chatListView.drawChatBackgroundElements(canvas, rectF);
            for (int i = 0; i < ChannelAdminLogActivity.this.chatListView.getChildCount(); i++) {
                View childAt = ChannelAdminLogActivity.this.chatListView.getChildAt(i);
                if (!ChannelAdminLogActivity.this.quickRejectChild(childAt, rectF)) {
                    if (childAt instanceof ChatMessageCell) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                        if (chatMessageCell.drawBackgroundInParent()) {
                            canvas.save();
                            canvas.translate(0.0f, chatMessageCell.starsPriceTopPadding);
                            chatMessageCell.drawBackgroundInternal(canvas, true);
                            canvas.restore();
                        }
                        canvas.restore();
                        ChannelAdminLogActivity.this.chatListView.drawChild(canvas, childAt, jUptimeMillis);
                        if (chatMessageCell.hasOutboundsContent()) {
                            canvas.save();
                            canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                            chatMessageCell.drawOutboundsContent(canvas);
                            canvas.restore();
                        }
                    } else if (childAt instanceof ChatActionCell) {
                        ChannelAdminLogActivity.this.chatListView.drawChild(canvas, childAt, jUptimeMillis);
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        ((ChatActionCell) childAt).drawOutboundsContent(canvas);
                        canvas.restore();
                    } else {
                        ChannelAdminLogActivity.this.chatListView.drawChild(canvas, childAt, jUptimeMillis);
                    }
                }
            }
            ChannelAdminLogActivity.this.chatListView.drawChatForegroundElements(canvas, rectF);
            canvas.restore();
        }
    }

    public abstract class ChatListRecyclerView extends RecyclerListView {
        public ChatListRecyclerView(Context context) {
            super(context);
        }

        public void drawChatBackgroundElements(Canvas canvas, RectF rectF) {
        }

        public void drawChatForegroundElements(Canvas canvas, RectF rectF) {
        }

        public void drawChatBackgroundElements(Canvas canvas) {
            drawChatBackgroundElements(canvas, null);
        }

        public void drawChatForegroundElements(Canvas canvas) {
            drawChatForegroundElements(canvas, null);
        }
    }

    public class ChatScrollCallback extends RecyclerAnimationScrollHelper.AnimationCallback {
        private boolean lastBottom;
        private int lastItemOffset;
        private int lastPadding;
        private MessageObject scrollTo;
        private int position = 0;
        private boolean bottom = true;
        private int offset = 0;

        public ChatScrollCallback() {
        }

        public void lambda$onEndAnimation$0() {
            ChannelAdminLogActivity.this.getNotificationCenter().onAnimationFinish(ChannelAdminLogActivity.this.scrollCallbackAnimationIndex);
        }

        @Override
        public void onEndAnimation() {
            if (this.scrollTo != null) {
                int iIndexOf = ChannelAdminLogActivity.this.filteredMessages.indexOf(this.scrollTo) + ChannelAdminLogActivity.this.chatAdapter.messagesStartRow;
                if (iIndexOf >= 0) {
                    ChannelAdminLogActivity.this.chatLayoutManager.scrollToPositionWithOffset(iIndexOf, this.lastItemOffset + this.lastPadding, this.lastBottom);
                }
            } else {
                ChannelAdminLogActivity.this.chatLayoutManager.scrollToPositionWithOffset(this.position, this.offset, this.bottom);
            }
            this.scrollTo = null;
            ChannelAdminLogActivity.this.checkTextureViewPosition = true;
            ChannelAdminLogActivity.this.updateVisibleRows();
            AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(this, 1));
        }

        @Override
        public void onStartAnimation() {
            super.onStartAnimation();
            ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
            channelAdminLogActivity.scrollCallbackAnimationIndex = channelAdminLogActivity.getNotificationCenter().setAnimationInProgress(ChannelAdminLogActivity.this.scrollCallbackAnimationIndex, ChannelAdminLogActivity.allowedNotificationsDuringChatListAnimations);
        }

        @Override
        public void recycleView(View view) {
            if (view instanceof ChatMessageCell) {
                ChannelAdminLogActivity.this.chatMessageCellsCache.add((ChatMessageCell) view);
            }
        }
    }

    public ChannelAdminLogActivity(TLRPC.Chat chat) {
        super(null);
        ReferenceList referenceList = new ReferenceList(true);
        this.glassAttachedViews = referenceList;
        this.chatMessageCellsCache = new ArrayList<>();
        this.mid = new int[]{2};
        this.scrollToPositionOnRecreate = -1;
        this.scrollToOffsetOnRecreate = 0;
        this.paused = true;
        this.wasPaused = false;
        this.messagesDict = new LongSparseArray();
        this.realMessagesDict = new LongSparseArray();
        this.messagesByDays = new HashMap<>();
        this.messages = new ArrayList<>();
        this.filteredMessages = new ArrayList<>();
        this.expandedEvents = new HashSet<>();
        this.currentFilter = null;
        this.searchQuery = "";
        this.notificationsLocker = new AnimationNotificationsLocker(allowedNotificationsDuringChatListAnimations);
        this.invitesCache = new HashMap<>();
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                ChatActionCell chatActionCell;
                MessageObject messageObject2;
                ChatMessageCell chatMessageCell;
                MessageObject messageObject3;
                int childCount = ChannelAdminLogActivity.this.chatListView.getChildCount();
                int i2 = 0;
                while (true) {
                    ImageReceiver photoImage = null;
                    if (i2 >= childCount) {
                        return null;
                    }
                    View childAt = ChannelAdminLogActivity.this.chatListView.getChildAt(i2);
                    if (!(childAt instanceof ChatMessageCell)) {
                        if ((childAt instanceof ChatActionCell) && (messageObject2 = (chatActionCell = (ChatActionCell) childAt).getMessageObject()) != null) {
                            if (messageObject == null) {
                                if (fileLocation != null && messageObject2.photoThumbs != null) {
                                    for (int i3 = 0; i3 < messageObject2.photoThumbs.size(); i3++) {
                                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i3).location;
                                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                                            photoImage = chatActionCell.getPhotoImage();
                                            break;
                                        }
                                    }
                                }
                            } else if (messageObject2.getId() == messageObject.getId()) {
                                photoImage = chatActionCell.getPhotoImage();
                            }
                        }
                    } else if (messageObject != null && (messageObject3 = (chatMessageCell = (ChatMessageCell) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                        photoImage = chatMessageCell.getPhotoImage();
                    }
                    if (photoImage != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                        placeProviderObject.viewX = iArr[0];
                        placeProviderObject.viewY = iArr[1];
                        placeProviderObject.parentView = ChannelAdminLogActivity.this.chatListView;
                        placeProviderObject.imageReceiver = photoImage;
                        placeProviderObject.thumb = photoImage.getBitmapSafe();
                        placeProviderObject.radius = photoImage.getRoundRadius(true);
                        placeProviderObject.isEvent = true;
                        return placeProviderObject;
                    }
                    i2++;
                }
            }
        };
        this.filteredMessagesUpdatedPosition = new ArrayList<>();
        this.stableIdByEventExpand = new LongSparseArray();
        this.highlightMessageId = Integer.MAX_VALUE;
        this.highlightMessageQuoteOffset = -1;
        this.scrollToMessagePosition = -10000;
        this.chatScrollHelperCallback = new ChatScrollCallback();
        this.savedScrollPosition = -1;
        this.glassDrawablesPositions = new ArrayList<>();
        this.glassDrawablesPositionsMerged = new ArrayList<>();
        this.tmpViewRectF = new RectF();
        BlurredBackgroundSourceWrapped blurredBackgroundSourceWrapped = new BlurredBackgroundSourceWrapped();
        this.navbarContentSourceWallpaper = blurredBackgroundSourceWrapped;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
        this.navbarContentDrawableFactory = blurredBackgroundDrawableViewFactory;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.scrollableViewNoiseSuppressor = null;
            this.recommendedAdditionalSizeY = 0;
            this.glassBackgroundSourceRenderNode = null;
            this.glassBackgroundSourceFrostedRenderNode = null;
            this.glassBackgroundDrawableFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
            this.glassBackgroundDrawableFactoryFrosted = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
        } else {
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.scrollableViewNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceWrapped);
            this.glassBackgroundSourceFrostedRenderNode = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.onDrawablesRelativePositionChangeListener = new ChannelAdminLogActivity$$ExternalSyntheticLambda11(this, 0);
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressor = downscaleScrollableNoiseSuppressor;
            blurredBackgroundSourceRenderNode.scrollableNoiseSuppressorIndex = -3;
            blurredBackgroundSourceRenderNode.underSource = blurredBackgroundSourceWrapped;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.glassBackgroundDrawableFactoryFrosted = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceWrapped);
                this.glassBackgroundSourceRenderNode = blurredBackgroundSourceRenderNode2;
                blurredBackgroundSourceRenderNode2.onDrawablesRelativePositionChangeListener = new ChannelAdminLogActivity$$ExternalSyntheticLambda11(this, 0);
                blurredBackgroundSourceRenderNode2.scrollableNoiseSuppressor = downscaleScrollableNoiseSuppressor;
                blurredBackgroundSourceRenderNode2.scrollableNoiseSuppressorIndex = -2;
                blurredBackgroundSourceRenderNode2.underSource = blurredBackgroundSourceWrapped;
                BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
                this.glassBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory3;
                blurredBackgroundDrawableViewFactory3.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
                this.recommendedAdditionalSizeY = 0;
            } else {
                this.glassBackgroundSourceRenderNode = null;
                this.glassBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory2;
                this.recommendedAdditionalSizeY = AndroidUtilities.dp(48.0f);
            }
        }
        blurredBackgroundDrawableViewFactory.linkedViews = referenceList;
        this.glassBackgroundDrawableFactory.linkedViews = referenceList;
        this.glassBackgroundDrawableFactoryFrosted.linkedViews = referenceList;
        this.currentChat = chat;
    }

    private MessageObject actionMessagesDeletedBy(long j, long j2, ArrayList<MessageObject> arrayList, boolean z, boolean z2) {
        MessageObject messageObject;
        int i = 0;
        while (true) {
            if (i >= this.filteredMessages.size()) {
                messageObject = null;
                break;
            }
            messageObject = this.filteredMessages.get(i);
            if (messageObject != null && messageObject.contentType == 1 && messageObject.actionDeleteGroupEventId == j) {
                break;
            }
            i++;
        }
        if (messageObject == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.dialog_id = -this.currentChat.id;
            tL_message.id = -1;
            try {
                tL_message.date = arrayList.get(0).messageOwner.date;
            } catch (Exception e) {
                FileLog.e(e);
            }
            messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j2));
        messageObject.contentType = 1;
        if (!z2 || arrayList.size() <= 1) {
            messageObject.actionDeleteGroupEventId = -1L;
        } else {
            messageObject.actionDeleteGroupEventId = j;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(MessageObject.replaceWithLink(LocaleController.formatPluralString(z2 ? "EventLogDeletedMultipleMessagesToExpand" : "EventLogDeletedMultipleMessages", arrayList.size(), TextUtils.join(", ", Collection.EL.stream(arrayList).map(new GroupCallSheet$$ExternalSyntheticLambda0(2)).distinct().map(new Function() {
            public final Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                return this.f$0.lambda$actionMessagesDeletedBy$5((Long) obj);
            }

            public final Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new ChannelAdminLogActivity$$ExternalSyntheticLambda30()).limit(4L).toArray())), "un1", user));
        if (z2 && arrayList.size() > 1) {
            ProfileActivity.ShowDrawable showDrawableFindDrawable = findDrawable(messageObject.messageText);
            if (showDrawableFindDrawable == null) {
                showDrawableFindDrawable = new ProfileActivity.ShowDrawable(LocaleController.getString(z ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow));
                showDrawableFindDrawable.textDrawable.setTypeface(AndroidUtilities.bold());
                showDrawableFindDrawable.textDrawable.setTextSize(AndroidUtilities.dp(10.0f));
                showDrawableFindDrawable.setTextColor(-1);
                showDrawableFindDrawable.setBackgroundColor(503316480);
            } else {
                showDrawableFindDrawable.textDrawable.setText(LocaleController.getString(z ? R.string.EventLogDeletedMultipleMessagesHide : R.string.EventLogDeletedMultipleMessagesShow), false);
            }
            showDrawableFindDrawable.setBounds(0, 0, showDrawableFindDrawable.getIntrinsicWidth(), showDrawableFindDrawable.getIntrinsicHeight());
            spannableStringBuilder.append((CharSequence) " S");
            spannableStringBuilder.setSpan(new ColoredImageSpan(showDrawableFindDrawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        messageObject.messageText = spannableStringBuilder;
        MessageObject messageObject2 = arrayList.size() > 0 ? (MessageObject) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList) : null;
        if (messageObject2 != null) {
            if (!this.stableIdByEventExpand.containsKey(messageObject2.eventId)) {
                LongSparseArray longSparseArray = this.stableIdByEventExpand;
                long j3 = messageObject2.eventId;
                int i2 = lastStableId;
                lastStableId = 1 + i2;
                longSparseArray.put(Integer.valueOf(i2), j3);
            }
            messageObject.stableId = ((Integer) this.stableIdByEventExpand.get(messageObject2.eventId)).intValue();
        }
        return messageObject;
    }

    public void addCanBanUser(Bundle bundle, long j) {
        TLRPC.Chat chat = this.currentChat;
        if (chat.megagroup && this.admins != null && ChatObject.canBlockUsers(chat)) {
            for (int i = 0; i < this.admins.size(); i++) {
                TLRPC.ChannelParticipant channelParticipant = this.admins.get(i);
                if (MessageObject.getPeerId(channelParticipant.peer) == j) {
                    if (channelParticipant.can_edit) {
                        break;
                    } else {
                        return;
                    }
                }
            }
            bundle.putLong("ban_chat_id", this.currentChat.id);
        }
    }

    public void alertUserOpenError(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            builder.setMessage(LocaleController.getString(R.string.NoPlayerInstalled));
        } else {
            builder.setMessage(LocaleController.formatString(R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type));
        }
        showDialog(builder.create());
    }

    public void checkScrollForLoad(boolean z) {
        LinearLayoutManager linearLayoutManager = this.chatLayoutManager;
        if (linearLayoutManager == null || this.paused) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if ((iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(this.chatLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1) > 0) {
            this.chatAdapter.getItemCount();
            if (iFindFirstVisibleItemPosition > (z ? 4 : 1) || this.loading || this.endReached) {
                return;
            }
            loadMessages(false);
        }
    }

    public void closeMenu() {
        ActionBarPopupWindow actionBarPopupWindow = this.scrimPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public boolean createMenu(View view) {
        return createMenu(view, 0.0f, 0.0f);
    }

    public TextureView createTextureView(boolean z) {
        if (this.parentLayout == null) {
            return null;
        }
        if (this.roundVideoContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity()) {
                @Override
                public void setTranslationY(float f) {
                    super.setTranslationY(f);
                    ChannelAdminLogActivity.this.contentView.invalidate();
                }
            };
            this.roundVideoContainer = frameLayout;
            frameLayout.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    int i = AndroidUtilities.roundMessageSize;
                    outline.setOval(0, 0, i, i);
                }
            });
            this.roundVideoContainer.setClipToOutline(true);
            this.roundVideoContainer.setWillNotDraw(false);
            this.roundVideoContainer.setVisibility(4);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(getParentActivity());
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setBackgroundColor(0);
            if (z) {
                this.roundVideoContainer.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.videoTextureView = textureView;
            textureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1.0f));
        }
        if (this.roundVideoContainer.getParent() == null) {
            ChatActivityFragmentView chatActivityFragmentView = this.contentView;
            FrameLayout frameLayout2 = this.roundVideoContainer;
            int i = AndroidUtilities.roundMessageSize;
            chatActivityFragmentView.addView(frameLayout2, 1, new FrameLayout.LayoutParams(i, i));
        }
        this.roundVideoContainer.setVisibility(4);
        this.aspectRatioFrameLayout.setDrawingReady(false);
        return this.videoTextureView;
    }

    private void destroyTextureView() {
        FrameLayout frameLayout = this.roundVideoContainer;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        this.contentView.removeView(this.roundVideoContainer);
        this.aspectRatioFrameLayout.setDrawingReady(false);
        this.roundVideoContainer.setVisibility(4);
    }

    public void filterDeletedMessages() {
        ChannelAdminLogActivity channelAdminLogActivity = this;
        ArrayList arrayList = new ArrayList();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        channelAdminLogActivity.filteredMessagesUpdatedPosition.clear();
        int i = 0;
        while (i < channelAdminLogActivity.messages.size()) {
            MessageObject messageObject = channelAdminLogActivity.messages.get(i);
            long jMessageDeletedBy = channelAdminLogActivity.messageDeletedBy(messageObject);
            if (messageObject.stableId <= 0) {
                int i2 = lastStableId;
                lastStableId = i2 + 1;
                messageObject.stableId = i2;
            }
            int i3 = i + 1;
            long jMessageDeletedBy2 = channelAdminLogActivity.messageDeletedBy(i3 < channelAdminLogActivity.messages.size() ? channelAdminLogActivity.messages.get(i3) : null);
            if (jMessageDeletedBy != 0) {
                arrayList2.add(messageObject);
            } else {
                arrayList.add(messageObject);
            }
            if (jMessageDeletedBy == jMessageDeletedBy2 || arrayList2.isEmpty()) {
                arrayList2 = arrayList2;
            } else {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                boolean z = (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty();
                int size = arrayList.size();
                ArrayList<MessageObject> arrayList3 = new ArrayList<>();
                for (int size2 = arrayList2.size() - 1; size2 >= 0 && arrayList2.get(size2).contentType == 1; size2--) {
                    arrayList3.add(arrayList2.remove(size2));
                }
                if (!arrayList2.isEmpty()) {
                    MessageObject messageObject2 = (MessageObject) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList2);
                    boolean z2 = TextUtils.isEmpty(channelAdminLogActivity.searchQuery) && arrayList2.size() > 3;
                    if (channelAdminLogActivity.expandedEvents.contains(Long.valueOf(messageObject2.eventId)) || !z2) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            channelAdminLogActivity.setupExpandButton(arrayList2.get(i4), 0);
                        }
                        arrayList.addAll(arrayList2);
                    } else {
                        channelAdminLogActivity.setupExpandButton(messageObject2, arrayList2.size() - 1);
                        arrayList.add(messageObject2);
                    }
                    TLRPC.ReplyMarkup replyMarkup2 = messageObject2.messageOwner.reply_markup;
                    if (z != ((replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows.isEmpty())) {
                        messageObject2.forceUpdate = true;
                        channelAdminLogActivity.chatAdapter.lambda$onBindViewHolder$31((z ? arrayList2.size() - 1 : 0) + size);
                        channelAdminLogActivity.chatAdapter.lambda$onBindViewHolder$31(size + (z ? arrayList2.size() - 1 : 0) + 1);
                    }
                    long j = messageObject.eventId;
                    arrayList.add(channelAdminLogActivity.actionMessagesDeletedBy(j, messageObject.currentEvent.user_id, arrayList2, channelAdminLogActivity.expandedEvents.contains(Long.valueOf(j)), z2));
                }
                if (arrayList3.isEmpty()) {
                    channelAdminLogActivity = this;
                } else {
                    MessageObject messageObject3 = (MessageObject) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList3);
                    arrayList.addAll(arrayList3);
                    long j2 = messageObject3.eventId;
                    long j3 = messageObject3.currentEvent.user_id;
                    channelAdminLogActivity = this;
                    arrayList.add(channelAdminLogActivity.actionMessagesDeletedBy(j2, j3, arrayList3, true, false));
                }
                arrayList2.clear();
            }
            i = i3;
            arrayList2 = arrayList2;
        }
        channelAdminLogActivity.filteredMessages.clear();
        channelAdminLogActivity.filteredMessages.addAll(arrayList);
    }

    public static ProfileActivity.ShowDrawable findDrawable(CharSequence charSequence) {
        if (!(charSequence instanceof Spannable)) {
            return null;
        }
        for (ColoredImageSpan coloredImageSpan : (ColoredImageSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), ColoredImageSpan.class)) {
            if (coloredImageSpan != null) {
                Drawable drawable = coloredImageSpan.drawable;
                if (drawable instanceof ProfileActivity.ShowDrawable) {
                    return (ProfileActivity.ShowDrawable) drawable;
                }
            }
        }
        return null;
    }

    private int getHeightForMessage(MessageObject messageObject, boolean z) {
        boolean z2 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.dummyMessageCell == null) {
            this.dummyMessageCell = new ChatMessageCell(getParentActivity(), this.currentAccount, false, null, null);
        }
        ChatMessageCell chatMessageCell = this.dummyMessageCell;
        TLRPC.Chat chat = this.currentChat;
        chatMessageCell.isChat = chat != null;
        if (ChatObject.isChannel(chat) && this.currentChat.megagroup) {
            z2 = true;
        }
        chatMessageCell.isMegagroup = z2;
        return this.dummyMessageCell.computeHeight(messageObject, null, z);
    }

    private int getMergedVisibleBlurredPositions(List<RectF> list) {
        int iMergeOverlapping = FBool.mergeOverlapping(this.glassDrawablesPositions, list, getVisibleBlurredPositions(this.glassDrawablesPositions));
        int measuredWidth = this.contentView.getMeasuredWidth();
        for (int i = 0; i < iMergeOverlapping; i++) {
            RectF rectF = list.get(i);
            float f = measuredWidth;
            rectF.left = MathUtils.clamp(rectF.left, 0.0f, f);
            rectF.top = Math.max(this.chatListView.getY(), rectF.top);
            rectF.right = MathUtils.clamp(rectF.right, 0.0f, f);
            rectF.bottom = Math.min(this.chatListView.getY() + this.chatListView.getMeasuredHeight(), rectF.bottom);
        }
        return iMergeOverlapping;
    }

    private CharSequence getMessageContent(MessageObject messageObject, int i, boolean z) {
        TLRPC.Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            long fromChatId = messageObject.getFromChatId();
            if (i != fromChatId) {
                if (fromChatId > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user.first_name, user.last_name)).append((CharSequence) ":\n");
                    }
                } else if (fromChatId < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
        }
        if (TextUtils.isEmpty(messageObject.messageText)) {
            spannableStringBuilder.append((CharSequence) messageObject.messageOwner.message);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(messageObject.messageText);
        return spannableStringBuilder;
    }

    private int getMessageType(MessageObject messageObject) {
        int i;
        String str;
        if (messageObject == null || (i = messageObject.type) == 6) {
            return -1;
        }
        if (i == 10 || i == 11 || i == 16) {
            return messageObject.getId() == 0 ? -1 : 1;
        }
        if (messageObject.isVoice()) {
            return 2;
        }
        if (messageObject.isSticker() || messageObject.isAnimatedSticker()) {
            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
            if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                if (!MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet.id)) {
                    return 7;
                }
            } else if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && !MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(inputStickerSet.short_name)) {
                return 7;
            }
        } else if ((!messageObject.isRoundVideo() || (messageObject.isRoundVideo() && BuildVars.DEBUG_VERSION)) && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
            String str2 = messageObject.messageOwner.attachPath;
            boolean z = (str2 == null || str2.length() == 0 || !new File(messageObject.messageOwner.attachPath).exists()) ? false : true;
            if ((z || !getFileLoader().getPathToMessage(messageObject.messageOwner).exists()) ? z : true) {
                if (messageObject.getDocument() == null || (str = messageObject.getDocument().mime_type) == null) {
                    return 4;
                }
                if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                    return 10;
                }
                if (str.endsWith("/xml")) {
                    return 5;
                }
                return (str.endsWith("/png") || str.endsWith("/jpg") || str.endsWith("/jpeg")) ? 6 : 4;
            }
        } else {
            if (messageObject.type == 12) {
                return 8;
            }
            if (messageObject.isMediaEmpty()) {
                return 3;
            }
        }
        return 2;
    }

    private int getScrollOffsetForMessage(MessageObject messageObject) {
        return getScrollOffsetForMessage(getHeightForMessage(messageObject, !TextUtils.isEmpty(this.highlightMessageQuote))) - scrollOffsetForQuote(messageObject);
    }

    private int getScrollingOffsetForView(View view) {
        return (this.chatListView.getMeasuredHeight() - view.getBottom()) - this.chatListView.getPaddingBottom();
    }

    private int getVisibleBlurredPositions(List<RectF> list) {
        RectF rectF;
        int visiblePositions = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.glassBackgroundSourceFrostedRenderNode != null) {
                if (list.isEmpty()) {
                    rectF = new RectF();
                    list.add(rectF);
                } else {
                    rectF = list.get(0);
                }
                rectF.set(0.0f, 0.0f, this.contentView.getMeasuredWidth(), this.chatListView.getY() + this.chatListView.getPaddingTop());
                rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                visiblePositions = 1 + this.glassBackgroundSourceFrostedRenderNode.getVisiblePositions(list, 1, AndroidUtilities.dp(48.0f));
            }
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.glassBackgroundSourceRenderNode;
            if (blurredBackgroundSourceRenderNode != null) {
                return blurredBackgroundSourceRenderNode.getVisiblePositions(list, visiblePositions, AndroidUtilities.dp(8.0f)) + visiblePositions;
            }
        }
        return visiblePositions;
    }

    public void hideFloatingDateView(boolean z) {
        if (this.floatingDateView.getTag() == null || this.currentFloatingDateOnScreen) {
            return;
        }
        if (!this.scrollingFloatingDate || this.currentFloatingTopIsNotMessage) {
            this.floatingDateView.setTag(null);
            if (!z) {
                AnimatorSet animatorSet = this.floatingDateAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.floatingDateAnimation = null;
                }
                this.floatingDateView.setAlpha(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingDateAnimation = animatorSet2;
            animatorSet2.setDuration(150L);
            this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, "alpha", 0.0f));
            this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChannelAdminLogActivity.this.floatingDateAnimation)) {
                        ChannelAdminLogActivity.this.floatingDateAnimation = null;
                    }
                }
            });
            this.floatingDateAnimation.setStartDelay(500L);
            this.floatingDateAnimation.start();
        }
    }

    private void invalidateAllGlassAttachedViews() {
        this.contentView.invalidate();
        Iterator it = this.glassAttachedViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public void invalidateMergedVisibleBlurredPositionsAndSources(int i) {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        OnPostDrawView onPostDrawView = this.invalidateBlurredSourcesView;
        if (onPostDrawView.invalidateFlags == 0) {
            onPostDrawView.invalidate();
        }
        onPostDrawView.invalidateFlags = i | onPostDrawView.invalidateFlags;
    }

    public void invalidateMergedVisibleBlurredPositionsAndSourcesImpl(int i) {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        if (BitwiseUtils.hasFlag(i, 2)) {
            int mergedVisibleBlurredPositions = getMergedVisibleBlurredPositions(this.glassDrawablesPositionsMerged);
            this.glassDrawablesPositionsCount = mergedVisibleBlurredPositions;
            this.scrollableViewNoiseSuppressor.setupRenderNodes(mergedVisibleBlurredPositions, this.glassDrawablesPositionsMerged);
        }
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor;
        ChatActivityFragmentView chatActivityFragmentView = this.contentView;
        Objects.requireNonNull(chatActivityFragmentView);
        if (downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(new PremiumPreviewFragment$$ExternalSyntheticLambda14(chatActivityFragmentView, 1), this.contentView.getWidth(), this.contentView.getHeight())) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.glassBackgroundSourceRenderNode;
            if (blurredBackgroundSourceRenderNode != null) {
                blurredBackgroundSourceRenderNode.invalidateDisplayListForDrawables();
            }
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = this.glassBackgroundSourceFrostedRenderNode;
            if (blurredBackgroundSourceRenderNode2 != null) {
                blurredBackgroundSourceRenderNode2.invalidateDisplayListForDrawables();
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.invalidate();
            }
            invalidateAllGlassAttachedViews();
        }
    }

    public void invalidateMergedVisibleBlurredPositionsAndSourcesPositions() {
        invalidateMergedVisibleBlurredPositionsAndSources(2);
    }

    public String lambda$actionMessagesDeletedBy$5(Long l) {
        if (l.longValue() >= 0) {
            return UserObject.getForcedFirstName(getMessagesController().getUser(l));
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-l.longValue()));
        if (chat == null) {
            return null;
        }
        return chat.title;
    }

    public static boolean lambda$actionMessagesDeletedBy$6(String str) {
        return str != null;
    }

    public void lambda$createMenu$13(int i, ArrayList arrayList, Integer num, View view) {
        if (this.selectedObject == null || i >= arrayList.size()) {
            return;
        }
        processSelectedOption(num.intValue());
    }

    public void lambda$createMenu$14(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f, float f2) {
        ArrayList arrayList4 = arrayList;
        if (arrayList4.isEmpty() || getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        int i = R.drawable.popup_fixed_alert;
        int iDp = 0;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity, i, getResourceProvider(), 0);
        actionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
        Rect rect = new Rect();
        getParentActivity().getResources().getDrawable(i).mutate().getPadding(rect);
        actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            if (arrayList4.get(i2) == null) {
                actionBarPopupWindowLayout.addView((View) new ActionBarPopupWindow.GapView(getContext(), getResourceProvider(), Theme.key_actionBarDefaultSubmenuSeparator), LayoutHelper.createLinear(-1, 8));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getParentActivity(), getResourceProvider(), i2 == 0, i2 == size + (-1));
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon((CharSequence) arrayList2.get(i2), ((Integer) arrayList3.get(i2)).intValue());
                if (((Integer) arrayList4.get(i2)).intValue() == 35) {
                    actionBarMenuSubItem.setColors(getThemedColor(Theme.key_text_RedBold), getThemedColor(Theme.key_text_RedRegular));
                }
                Integer num = (Integer) arrayList4.get(i2);
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                actionBarMenuSubItem.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda1(this, i2, arrayList4, num, 1));
            }
            i2++;
            arrayList4 = arrayList;
        }
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = new ChatScrimPopupContainerLayout(this.contentView.getContext()) {
            @Override
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ChannelAdminLogActivity.this.closeMenu();
                }
                return super.dispatchKeyEvent(keyEvent);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !zDispatchTouchEvent) {
                    ChannelAdminLogActivity.this.closeMenu();
                }
                return zDispatchTouchEvent;
            }
        };
        chatScrimPopupContainerLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinearRelatively(-2.0f, -2.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
        chatScrimPopupContainerLayout.setPopupWindowLayout(actionBarPopupWindowLayout);
        int i3 = -2;
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(chatScrimPopupContainerLayout, i3, i3) {
            @Override
            public void dismiss() {
                dismiss(true);
                if (ChannelAdminLogActivity.this.scrimPopupWindow != this) {
                    return;
                }
                Bulletin.hideVisible();
                ChannelAdminLogActivity.this.scrimPopupWindow = null;
            }
        };
        this.scrimPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setPauseNotifications(true);
        this.scrimPopupWindow.setDismissAnimationDuration(220);
        this.scrimPopupWindow.setOutsideTouchable(true);
        this.scrimPopupWindow.setClippingEnabled(true);
        this.scrimPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        this.scrimPopupWindow.setFocusable(true);
        chatScrimPopupContainerLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.scrimPopupWindow.setInputMethodMode(2);
        this.scrimPopupWindow.setSoftInputMode(48);
        this.scrimPopupWindow.getContentView().setFocusableInTouchMode(true);
        actionBarPopupWindowLayout.setFitItems(true);
        int left = (((view.getLeft() + ((int) f)) - chatScrimPopupContainerLayout.getMeasuredWidth()) + rect.left) - AndroidUtilities.dp(28.0f);
        if (left < AndroidUtilities.dp(6.0f)) {
            left = AndroidUtilities.dp(6.0f);
        } else if (left > (this.chatListView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - chatScrimPopupContainerLayout.getMeasuredWidth()) {
            left = (this.chatListView.getMeasuredWidth() - AndroidUtilities.dp(6.0f)) - chatScrimPopupContainerLayout.getMeasuredWidth();
        }
        if (AndroidUtilities.isTablet()) {
            int[] iArr = new int[2];
            this.fragmentView.getLocationInWindow(iArr);
            left += iArr[0];
        }
        int height = this.contentView.getHeight();
        int iDp2 = AndroidUtilities.dp(48.0f) + chatScrimPopupContainerLayout.getMeasuredHeight();
        int iMeasureKeyboardHeight = this.contentView.measureKeyboardHeight();
        if (iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f)) {
            height += iMeasureKeyboardHeight;
        }
        if (iDp2 < height) {
            int y = (int) (this.chatListView.getY() + view.getTop() + f2);
            iDp = (iDp2 - rect.top) - rect.bottom > AndroidUtilities.dp(240.0f) ? (AndroidUtilities.dp(240.0f) - iDp2) + y : y;
            if (iDp < this.chatListView.getY() + AndroidUtilities.dp(24.0f)) {
                iDp = (int) (this.chatListView.getY() + AndroidUtilities.dp(24.0f));
            } else {
                int i4 = height - iDp2;
                if (iDp > i4 - AndroidUtilities.dp(8.0f)) {
                    iDp = i4 - AndroidUtilities.dp(8.0f);
                }
            }
        } else if (!this.inBubbleMode) {
            iDp = AndroidUtilities.statusBarHeight;
        }
        this.scrimPopupX = left;
        this.scrimPopupY = iDp;
        chatScrimPopupContainerLayout.setMaxHeight(height - iDp);
        this.scrimPopupWindow.showAtLocation(this.chatListView, 51, left, iDp);
        this.scrimPopupWindow.dimBehind();
    }

    public void lambda$createMenu$15(TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
        TLRPC.ChatParticipants chatParticipants;
        this.selectedParticipant = channelParticipant;
        if (channelParticipant != null) {
            if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                if (ChatObject.isChannel(this.currentChat)) {
                    TLRPC.ChannelParticipant adminInChannel = getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, this.currentChat.id);
                    if (adminInChannel != null && ((adminInChannel instanceof TLRPC.TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call)) {
                        if (this.currentChat.creator) {
                        }
                    }
                } else {
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.currentChat.id);
                    if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                        int size = chatParticipants.participants.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i);
                                if (chatParticipant.user_id != channelParticipant.peer.user_id) {
                                    i++;
                                } else if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                    if (this.currentChat.creator) {
                                    }
                                }
                            }
                        }
                    }
                }
                if (ChatObject.canUserDoAction(this.currentChat, channelParticipant, 6)) {
                    arrayList.add(LocaleController.getString(R.string.Restrict));
                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_block2, arrayList2, 33, arrayList3);
                } else {
                    arrayList.add(LocaleController.getString(R.string.Restrict));
                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_block2, arrayList2, 33, arrayList3);
                }
                arrayList.add(LocaleController.getString(R.string.Ban));
                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_block, arrayList2, 35, arrayList3);
            } else {
                if (ChatObject.canUserDoAction(this.currentChat, channelParticipant, 6) || ChatObject.canUserDoAction(this.currentChat, channelParticipant, 7)) {
                    arrayList.add(LocaleController.getString(R.string.Restrict));
                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_block2, arrayList2, 33, arrayList3);
                }
                arrayList.add(LocaleController.getString(R.string.Ban));
                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_block, arrayList2, 35, arrayList3);
            }
        }
        runnable.run();
    }

    public void lambda$createMenu$16(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable, TLRPC.ChannelParticipant channelParticipant) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda295(this, channelParticipant, arrayList, arrayList2, arrayList3, runnable, 3));
    }

    public void lambda$createView$10(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        if (this.currentChat.megagroup) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetail)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogInfoDetailChannel)));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(LocaleController.getString(R.string.EventLogInfoTitle));
        showDialog(builder.create());
    }

    public void lambda$createView$11(int i) {
        loadMessages(true);
    }

    public void lambda$createView$12(View view) {
        if (getParentActivity() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.searchItem.getSearchField());
        showDialog(AlertsCreator.createCalendarPickerDialog(getParentActivity(), 1375315200000L, new PhotoViewer$$ExternalSyntheticLambda122(this, 3), null).bottomSheet);
    }

    public static boolean lambda$createView$7(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$8(TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, LongSparseArray longSparseArray) {
        this.currentFilter = tL_channelAdminLogEventsFilter;
        this.selectedAdmins = longSparseArray;
        if (tL_channelAdminLogEventsFilter == null && longSparseArray == null) {
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        } else {
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.EventLogSelectedEvents));
        }
        loadMessages(true);
    }

    public void lambda$createView$9(View view) {
        if (getParentActivity() == null) {
            return;
        }
        AdminLogFilterAlert2 adminLogFilterAlert2 = new AdminLogFilterAlert2(this, this.currentFilter, this.selectedAdmins, this.currentChat.megagroup);
        adminLogFilterAlert2.setCurrentAdmins(this.admins);
        adminLogFilterAlert2.setAdminLogFilterAlertDelegate(new ChannelAdminLogActivity$$ExternalSyntheticLambda0(this));
        showDialog(adminLogFilterAlert2);
    }

    public void lambda$loadAdmins$21(TLRPC.TL_error tL_error, TLObject tLObject) {
        TLRPC.ChatFull chatFull;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            this.admins = tL_channels_channelParticipants.participants;
            if (this.currentChat != null && (chatFull = getMessagesController().getChatFull(this.currentChat.id)) != null && chatFull.antispam) {
                TLRPC.ChannelParticipant channelParticipant = new TLRPC.ChannelParticipant() {
                };
                channelParticipant.user_id = getMessagesController().telegramAntispamUserId;
                channelParticipant.peer = getMessagesController().getPeer(channelParticipant.user_id);
                loadAntispamUser(getMessagesController().telegramAntispamUserId);
                this.admins.add(0, channelParticipant);
            }
            Dialog dialog = this.visibleDialog;
            if (dialog instanceof AdminLogFilterAlert2) {
                ((AdminLogFilterAlert2) dialog).setCurrentAdmins(this.admins);
            }
        }
    }

    public void lambda$loadAdmins$22(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, tL_error, tLObject, 29));
    }

    public void lambda$loadAntispamUser$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            ArrayList<T> arrayList = ((Vector) tLObject).objects;
            ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof TLRPC.User) {
                    arrayList2.add((TLRPC.User) arrayList.get(i));
                }
            }
            getMessagesController().putUsers(arrayList2, false);
        }
    }

    public void lambda$loadMessages$2() {
        saveScrollPosition(false);
        this.chatAdapter.notifyDataSetChanged();
    }

    public void lambda$loadMessages$3(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        MessageObject messageObject;
        MessageObject messageObject2;
        this.loadsCount--;
        int i = 0;
        this.chatListItemAnimator.setShouldAnimateEnterFromBottom(false);
        saveScrollPosition(false);
        MessagesController.getInstance(this.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        boolean z = false;
        for (int i2 = 0; i2 < tL_channels_adminLogResults.events.size(); i2++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = tL_channels_adminLogResults.events.get(i2);
            if (this.messagesDict.indexOfKey(tL_channelAdminLogEvent.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if (!(tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) || (tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                        this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent.id);
                        messageObject2 = new MessageObject(this.currentAccount, tL_channelAdminLogEvent, this.messages, this.messagesByDays, this.currentChat, this.mid, false);
                        if (messageObject2.contentType >= 0) {
                            this.messagesDict.put(messageObject2, tL_channelAdminLogEvent.id);
                        }
                        z = true;
                    }
                } else {
                    this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent.id);
                    messageObject2 = new MessageObject(this.currentAccount, tL_channelAdminLogEvent, this.messages, this.messagesByDays, this.currentChat, this.mid, false);
                    if (messageObject2.contentType >= 0) {
                        this.messagesDict.put(messageObject2, tL_channelAdminLogEvent.id);
                    }
                    z = true;
                }
            }
        }
        this.messages.size();
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int size = this.messages.size(); size < this.messages.size(); size++) {
            MessageObject messageObject3 = this.messages.get(size);
            if (messageObject3 != null && messageObject3.contentType != 0 && messageObject3.getRealId() >= 0) {
                this.realMessagesDict.put(messageObject3, messageObject3.getRealId());
            }
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (messageReplyHeader = message.reply_to) != null) {
                if (messageReplyHeader.reply_to_peer_id == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.messages.size()) {
                            messageObject = null;
                            break;
                        }
                        if (size != i3) {
                            messageObject = this.messages.get(i3);
                            if (messageObject.contentType != 1 && messageObject.getRealId() == messageReplyHeader.reply_to_msg_id) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (messageObject != null) {
                        messageObject3.replyMessageObject = messageObject;
                    }
                }
                arrayList.add(messageObject3);
            }
        }
        if (!arrayList.isEmpty()) {
            MediaDataController.getInstance(this.currentAccount).loadReplyMessagesForMessages(arrayList, -this.currentChat.id, 0, 0L, new ChannelAdminLogActivity$$ExternalSyntheticLambda11(this, 3), getClassGuid(), null);
        }
        filterDeletedMessages();
        this.loading = false;
        if (!z) {
            this.endReached = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.3f, true);
        this.chatListView.setEmptyView(this.emptyViewContainer);
        ChatActivityAdapter chatActivityAdapter = this.chatAdapter;
        if (chatActivityAdapter != null) {
            chatActivityAdapter.notifyDataSetChanged();
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            if (this.filteredMessages.isEmpty() && TextUtils.isEmpty(this.searchQuery)) {
                i = 8;
            }
            actionBarMenuItem.setVisibility(i);
        }
    }

    public void lambda$loadMessages$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new ChannelAdminLogActivity$$ExternalSyntheticLambda13(this, (TLRPC.TL_channels_adminLogResults) tLObject, 0));
        }
    }

    public void lambda$processSelectedOption$17(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.ChannelAntiSpamFalsePositiveReported, BulletinFactory.of(this), R.raw.msg_antispam);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(this), R.raw.error);
        } else {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(this), R.raw.error);
        }
    }

    public void lambda$processSelectedOption$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(25, this, tLObject));
    }

    public void lambda$processSelectedOption$19(TLRPC.User user) {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.ic_ban, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName(user)))).show(false);
        lambda$processSelectedOption$20();
    }

    public void lambda$reloadLastMessages$0(TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults) {
        MessageObject messageObject;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        this.reloadingLastMessages = false;
        this.chatListItemAnimator.setShouldAnimateEnterFromBottom(false);
        saveScrollPosition(false);
        MessagesController.getInstance(this.currentAccount).putUsers(tL_channels_adminLogResults.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_channels_adminLogResults.chats, false);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        boolean z = false;
        for (int i = 0; i < tL_channels_adminLogResults.events.size(); i++) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channels_adminLogResults.events.get(i);
            if (this.messagesDict.indexOfKey(tL_channelAdminLogEvent2.id) < 0) {
                TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                    if (!(tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant instanceof TLRPC.TL_channelParticipantCreator) || (tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant instanceof TLRPC.TL_channelParticipantCreator)) {
                        this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent2.id);
                        messageObject = new MessageObject(this.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) map, this.currentChat, this.mid, false);
                        if (messageObject.contentType < 0 && (((tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) && !this.messagesDict.containsKey(tL_channelAdminLogEvent2.id))) {
                            this.messages.add(0, messageObject);
                            this.messagesDict.put(messageObject, tL_channelAdminLogEvent2.id);
                            z = true;
                        }
                    }
                } else {
                    this.minEventId = Math.min(this.minEventId, tL_channelAdminLogEvent2.id);
                    messageObject = new MessageObject(this.currentAccount, tL_channelAdminLogEvent2, (ArrayList<MessageObject>) arrayList, (HashMap<String, ArrayList<MessageObject>>) map, this.currentChat, this.mid, false);
                    if (messageObject.contentType < 0) {
                    }
                }
            }
        }
        if (this.chatAdapter == null || !z) {
            return;
        }
        filterDeletedMessages();
        this.chatAdapter.notifyDataSetChanged();
    }

    public void lambda$reloadLastMessages$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new ChannelAdminLogActivity$$ExternalSyntheticLambda13(this, (TLRPC.TL_channels_adminLogResults) tLObject, 1));
        }
    }

    public void lambda$showOpenUrlAlert$24(String str, AlertDialog alertDialog, int i) {
        Browser.openUrl(getParentActivity(), str, true);
    }

    public void lambda$startMessageUnselect$25() {
        this.highlightMessageId = Integer.MAX_VALUE;
        this.highlightMessageQuoteFirst = false;
        this.highlightMessageQuote = null;
        this.highlightMessageQuoteOffset = -1;
        this.showNoQuoteAlert = false;
        updateVisibleRows();
        this.unselectRunnable = null;
    }

    private void loadAdmins() {
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getParticipants, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 3)), this.classGuid);
    }

    private void loadAntispamUser(long j) {
        if (getMessagesController().getUser(Long.valueOf(j)) != null) {
            return;
        }
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
        tL_inputUser.user_id = j;
        tL_users_getUsers.id.add(tL_inputUser);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getUsers, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 0));
    }

    public void loadMessages(boolean z) {
        ChatActivityAdapter chatActivityAdapter;
        if (this.loading) {
            return;
        }
        if (z) {
            this.minEventId = Long.MAX_VALUE;
            FrameLayout frameLayout = this.progressView;
            if (frameLayout != null) {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 0.3f, true);
                this.emptyViewContainer.setVisibility(4);
                this.chatListView.setEmptyView(null);
            }
            this.messagesDict.clear();
            this.messages.clear();
            this.messagesByDays.clear();
            filterDeletedMessages();
            this.loadsCount = 0;
        }
        this.loading = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_getAdminLog.q = this.searchQuery;
        tL_channels_getAdminLog.limit = 50;
        if (z || this.messages.isEmpty()) {
            tL_channels_getAdminLog.max_id = 0L;
        } else {
            tL_channels_getAdminLog.max_id = this.minEventId;
        }
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.currentFilter;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags |= 1;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.selectedAdmins != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.selectedAdmins.size(); i++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.selectedAdmins.valueAt(i)));
            }
        }
        this.loadsCount++;
        updateEmptyPlaceholder();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 4));
        if (!z || (chatActivityAdapter = this.chatAdapter) == null) {
            return;
        }
        chatActivityAdapter.notifyDataSetChanged();
    }

    private long messageDeletedBy(MessageObject messageObject) {
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        if (messageObject == null || (tL_channelAdminLogEvent = messageObject.currentEvent) == null || !(tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage)) {
            return 0L;
        }
        return tL_channelAdminLogEvent.user_id;
    }

    public void moveScrollToLastMessage() {
        if (this.chatListView == null || this.messages.isEmpty()) {
            return;
        }
        this.chatLayoutManager.scrollToPositionWithOffset(this.filteredMessages.size() - 1, (-100000) - this.chatListView.getPaddingTop());
    }

    private void processSelectedOption(int i) {
        File file;
        TLRPC.User user;
        closeMenu();
        MessageObject messageObject = this.selectedObject;
        if (messageObject == null) {
            return;
        }
        if (i == 3) {
            AndroidUtilities.addToClipboard(getMessageContent(messageObject, 0, true));
            ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(this), R.string.MessageCopied);
        } else if (i == 4) {
            String string = messageObject.messageOwner.attachPath;
            if (string != null && string.length() > 0 && !Theme.ResourcesProvider.CC.m(string)) {
                string = null;
            }
            if (string == null || string.length() == 0) {
                string = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
            }
            int i2 = this.selectedObject.type;
            if (i2 == 3 || i2 == 1) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 23 && ((i3 <= 28 || BuildVars.NO_SCOPED_STORAGE) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    this.selectedObject = null;
                    this.selectedParticipant = null;
                    return;
                }
                MediaController.saveFile(string, getParentActivity(), this.selectedObject.type == 3 ? 1 : 0, null, null);
            }
        } else if (i == 5) {
            String str = messageObject.messageOwner.attachPath;
            if (str == null || str.length() == 0) {
                file = null;
            } else {
                file = new File(this.selectedObject.messageOwner.attachPath);
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                File pathToMessage = getFileLoader().getPathToMessage(this.selectedObject.messageOwner);
                if (pathToMessage.exists()) {
                    file = pathToMessage;
                }
            }
            if (file != null) {
                if (file.getName().toLowerCase().endsWith("attheme")) {
                    LinearLayoutManager linearLayoutManager = this.chatLayoutManager;
                    if (linearLayoutManager != null) {
                        if (linearLayoutManager.findLastVisibleItemPosition() < this.chatLayoutManager.getItemCount() - 1) {
                            int iFindFirstVisibleItemPosition = this.chatLayoutManager.findFirstVisibleItemPosition();
                            this.scrollToPositionOnRecreate = iFindFirstVisibleItemPosition;
                            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.chatListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            if (holder != null) {
                                this.scrollToOffsetOnRecreate = holder.itemView.getTop();
                            } else {
                                this.scrollToPositionOnRecreate = -1;
                            }
                        } else {
                            this.scrollToPositionOnRecreate = -1;
                        }
                    }
                    Theme.ThemeInfo themeInfoApplyThemeFile = Theme.applyThemeFile(file, this.selectedObject.getDocumentName(), null, true);
                    if (themeInfoApplyThemeFile != null) {
                        presentFragment(new ThemePreviewActivity(themeInfoApplyThemeFile));
                    } else {
                        this.scrollToPositionOnRecreate = -1;
                        if (getParentActivity() == null) {
                            this.selectedObject = null;
                            this.selectedParticipant = null;
                            return;
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                            builder.setTitle(LocaleController.getString(R.string.AppName));
                            builder.setMessage(LocaleController.getString(R.string.IncorrectTheme));
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            showDialog(builder.create());
                        }
                    }
                } else if (LocaleController.getInstance().applyLanguageFile(file, this.currentAccount)) {
                    presentFragment(new LanguageSelectActivity());
                } else if (getParentActivity() == null) {
                    this.selectedObject = null;
                    this.selectedParticipant = null;
                    return;
                } else {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                    builder2.setTitle(LocaleController.getString(R.string.AppName));
                    builder2.setMessage(LocaleController.getString(R.string.IncorrectLocalization));
                    builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    showDialog(builder2.create());
                }
            }
        } else if (i == 6) {
            String string2 = messageObject.messageOwner.attachPath;
            if (string2 != null && string2.length() > 0 && !Theme.ResourcesProvider.CC.m(string2)) {
                string2 = null;
            }
            if (string2 == null || string2.length() == 0) {
                string2 = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(this.selectedObject.getDocument().mime_type);
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", new File(string2)));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(string2)));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(string2)));
            }
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            } catch (Exception unused2) {
            }
        } else if (i != 7) {
            switch (i) {
                case 9:
                    showDialog(new StickersAlert(getParentActivity(), this, this.selectedObject.getInputStickerSet(), null, null, false));
                    break;
                case 10:
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 23 && ((i4 <= 28 || BuildVars.NO_SCOPED_STORAGE) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                        this.selectedObject = null;
                        this.selectedParticipant = null;
                        return;
                    }
                    String documentFileName = FileLoader.getDocumentFileName(this.selectedObject.getDocument());
                    if (TextUtils.isEmpty(documentFileName)) {
                        documentFileName = this.selectedObject.getFileName();
                    }
                    String string3 = this.selectedObject.messageOwner.attachPath;
                    if (string3 != null && string3.length() > 0 && !Theme.ResourcesProvider.CC.m(string3)) {
                        string3 = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        string3 = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
                    }
                    MediaController.saveFile(string3, getParentActivity(), this.selectedObject.isMusic() ? 3 : 2, documentFileName, this.selectedObject.getDocument() != null ? this.selectedObject.getDocument().mime_type : "");
                    break;
                    break;
                case 11:
                    MessagesController.getInstance(this.currentAccount).saveGif(this.selectedObject, messageObject.getDocument());
                    break;
                default:
                    switch (i) {
                        case 15:
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", this.selectedObject.messageOwner.media.user_id);
                            bundle.putString("phone", this.selectedObject.messageOwner.media.phone_number);
                            bundle.putBoolean("addContact", true);
                            presentFragment(new ContactAddActivity(bundle));
                            break;
                        case 16:
                            AndroidUtilities.addToClipboard(messageObject.messageOwner.media.phone_number);
                            ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(this), R.string.PhoneCopied);
                            break;
                        case 17:
                            try {
                                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.selectedObject.messageOwner.media.phone_number));
                                intent2.addFlags(268435456);
                                getParentActivity().startActivityForResult(intent2, 500);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            break;
                        default:
                            switch (i) {
                                case 33:
                                    if (this.selectedParticipant != null) {
                                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(DialogObject.getPeerDialogId(this.selectedParticipant.peer)));
                                        TLRPC.ChannelParticipant channelParticipant = this.selectedParticipant;
                                        if (channelParticipant.banned_rights == null) {
                                            channelParticipant.banned_rights = new TLRPC.TL_chatBannedRights();
                                        }
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.selectedParticipant.banned_rights;
                                        tL_chatBannedRights.send_plain = true;
                                        tL_chatBannedRights.send_messages = true;
                                        tL_chatBannedRights.send_media = true;
                                        tL_chatBannedRights.send_stickers = true;
                                        tL_chatBannedRights.send_gifs = true;
                                        tL_chatBannedRights.send_games = true;
                                        tL_chatBannedRights.send_inline = true;
                                        tL_chatBannedRights.send_polls = true;
                                        tL_chatBannedRights.send_photos = true;
                                        tL_chatBannedRights.send_videos = true;
                                        tL_chatBannedRights.send_roundvideos = true;
                                        tL_chatBannedRights.send_audios = true;
                                        tL_chatBannedRights.send_voices = true;
                                        tL_chatBannedRights.send_docs = true;
                                        tL_chatBannedRights.send_reactions = true;
                                        getMessagesController().setParticipantBannedRole(this.currentChat.id, user2, null, this.selectedParticipant.banned_rights, true, getFragmentForAlert(1), new PhotoViewer$7$$ExternalSyntheticLambda0(26, this, user2));
                                    }
                                    break;
                                case 34:
                                    TLRPC.TL_channels_reportAntiSpamFalsePositive tL_channels_reportAntiSpamFalsePositive = new TLRPC.TL_channels_reportAntiSpamFalsePositive();
                                    tL_channels_reportAntiSpamFalsePositive.channel = getMessagesController().getInputChannel(this.currentChat.id);
                                    tL_channels_reportAntiSpamFalsePositive.msg_id = this.selectedObject.getRealId();
                                    getConnectionsManager().sendRequest(tL_channels_reportAntiSpamFalsePositive, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 2));
                                    break;
                                case 35:
                                    getMessagesController().deleteParticipantFromChat(this.currentChat.id, getMessagesController().getInputPeer(this.selectedObject.messageOwner.from_id), false, false, (Runnable) new ChannelAdminLogActivity$$ExternalSyntheticLambda11(this, 2));
                                    if (this.currentChat != null && (this.selectedObject.messageOwner.from_id instanceof TLRPC.TL_peerUser) && BulletinFactory.canShowBulletin(this) && (user = getMessagesController().getUser(Long.valueOf(this.selectedObject.messageOwner.from_id.user_id))) != null) {
                                        BulletinFactory.createRemoveFromChatBulletin(this, user, this.currentChat.title).show();
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            String string4 = messageObject.messageOwner.attachPath;
            if (string4 != null && string4.length() > 0 && !Theme.ResourcesProvider.CC.m(string4)) {
                string4 = null;
            }
            if (string4 == null || string4.length() == 0) {
                string4 = getFileLoader().getPathToMessage(this.selectedObject.messageOwner).toString();
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23 && ((i5 <= 28 || BuildVars.NO_SCOPED_STORAGE) && getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                this.selectedObject = null;
                this.selectedParticipant = null;
                return;
            }
            MediaController.saveFile(string4, getParentActivity(), 0, null, null);
        }
        this.selectedObject = null;
        this.selectedParticipant = null;
    }

    public boolean quickRejectChild(View view, RectF rectF) {
        if (rectF == null || this.chatListView == null || view == null) {
            return false;
        }
        this.tmpViewRectF.set(view.getX(), this.chatListView.getY() + view.getY(), view.getX() + view.getWidth(), this.chatListView.getY() + view.getY() + view.getHeight());
        return !this.tmpViewRectF.intersect(rectF);
    }

    private void removeSelectedMessageHighlight() {
        if (this.highlightMessageQuote != null) {
            return;
        }
        Runnable runnable = this.unselectRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.unselectRunnable = null;
        }
        this.highlightMessageId = Integer.MAX_VALUE;
        this.highlightMessageQuoteFirst = false;
        this.highlightMessageQuote = null;
    }

    private int scrollOffsetForQuote(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int iDp;
        int iFindQuoteStart;
        ChatMessageCell chatMessageCell;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        if (TextUtils.isEmpty(this.highlightMessageQuote) || messageObject == null) {
            ChatMessageCell chatMessageCell2 = this.dummyMessageCell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.computedGroupCaptionY = 0;
                chatMessageCell2.computedCaptionLayout = null;
            }
            return 0;
        }
        if (TextUtils.isEmpty(messageObject.caption) || (chatMessageCell = this.dummyMessageCell) == null || (textLayoutBlocks = chatMessageCell.captionLayout) == null) {
            CharSequence charSequence2 = messageObject.messageText;
            arrayList = messageObject.textLayoutBlocks;
            ChatMessageCell chatMessageCell3 = this.dummyMessageCell;
            if (chatMessageCell3 == null || !chatMessageCell3.linkPreviewAbove) {
                charSequence = charSequence2;
                iDp = 0;
            } else {
                iDp = chatMessageCell3.linkPreviewHeight + AndroidUtilities.dp(10.0f);
                charSequence = charSequence2;
            }
        } else {
            iDp = (int) chatMessageCell.captionY;
            charSequence = messageObject.caption;
            arrayList = textLayoutBlocks.textLayoutBlocks;
        }
        ChatMessageCell chatMessageCell4 = this.dummyMessageCell;
        if (chatMessageCell4 != null) {
            chatMessageCell4.computedGroupCaptionY = 0;
            chatMessageCell4.computedCaptionLayout = null;
        }
        if (arrayList == null || charSequence == null || (iFindQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.highlightMessageQuote, this.highlightMessageQuoteOffset)) < 0) {
            return 0;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i);
            StaticLayout staticLayout = textLayoutBlock.textLayout;
            String string = staticLayout.getText().toString();
            int i2 = textLayoutBlock.charactersOffset;
            if (iFindQuoteStart > i2) {
                float fTextYOffset = iFindQuoteStart - i2 > string.length() + (-1) ? iDp + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height)) : staticLayout.getLineTop(staticLayout.getLineForOffset(iFindQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + iDp + textLayoutBlock.padTop;
                if (fTextYOffset > AndroidUtilities.displaySize.y * (isKeyboardVisible() ? 0.7f : 0.5f)) {
                    return (int) (fTextYOffset - (AndroidUtilities.displaySize.y * (isKeyboardVisible() ? 0.7f : 0.5f)));
                }
                return 0;
            }
        }
        return 0;
    }

    private void setupExpandButton(MessageObject messageObject, int i) {
        if (messageObject == null) {
            return;
        }
        if (i <= 0) {
            TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.clear();
            }
            TLRPC.ReplyMarkup replyMarkup2 = messageObject.messageOwner.reply_markup;
            if (replyMarkup2 instanceof TLRPC.TL_replyKeyboardMarkup) {
                ((TLRPC.TL_replyKeyboardMarkup) replyMarkup2).rows.clear();
            }
        } else {
            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = new TLRPC.TL_replyInlineMarkup();
            messageObject.messageOwner.reply_markup = tL_replyInlineMarkup;
            TL_keyboard.TL_keyboardInlineButtonRow tL_keyboardInlineButtonRow = new TL_keyboard.TL_keyboardInlineButtonRow();
            tL_replyInlineMarkup.rows.add(tL_keyboardInlineButtonRow);
            TL_keyboard.TL_keyboardInlineButton tL_keyboardInlineButton = new TL_keyboard.TL_keyboardInlineButton();
            tL_keyboardInlineButton.text = LocaleController.formatPluralString("EventLogExpandMore", i, new Object[0]);
            tL_keyboardInlineButtonRow.buttons.add(tL_keyboardInlineButton);
        }
        messageObject.measureInlineBotButtons();
    }

    public void showInviteLinkBottomSheet(TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite, HashMap<Long, TLRPC.User> map) {
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.currentChat.id);
        InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(this.contentView.getContext(), (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvite.invite, chatFull, map, this, chatFull.id, false, ChatObject.isChannel(this.currentChat));
        inviteLinkBottomSheet.setInviteDelegate(new InviteLinkBottomSheet.InviteDelegate() {
            @Override
            public void linkRevoked(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                int size = ChannelAdminLogActivity.this.filteredMessages.size();
                tL_chatInviteExported.revoked = true;
                TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = new TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke();
                tL_channelAdminLogEventActionExportedInviteRevoke.invite = tL_chatInviteExported;
                tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteRevoke;
                tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                tL_channelAdminLogEvent.user_id = ChannelAdminLogActivity.this.getAccountInstance().getUserConfig().clientUserId;
                int i = ((BaseFragment) ChannelAdminLogActivity.this).currentAccount;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                ArrayList<MessageObject> arrayList = channelAdminLogActivity.messages;
                HashMap map2 = channelAdminLogActivity.messagesByDays;
                ChannelAdminLogActivity channelAdminLogActivity2 = ChannelAdminLogActivity.this;
                if (new MessageObject(i, tL_channelAdminLogEvent, arrayList, (HashMap<String, ArrayList<MessageObject>>) map2, channelAdminLogActivity2.currentChat, channelAdminLogActivity2.mid, true).contentType < 0) {
                    return;
                }
                ChannelAdminLogActivity.this.filterDeletedMessages();
                int size2 = ChannelAdminLogActivity.this.filteredMessages.size() - size;
                if (size2 > 0) {
                    ChannelAdminLogActivity.this.chatListItemAnimator.setShouldAnimateEnterFromBottom(true);
                    ChannelAdminLogActivity.this.chatAdapter.notifyItemRangeInserted(ChannelAdminLogActivity.this.chatAdapter.messagesEndRow, size2);
                    ChannelAdminLogActivity.this.moveScrollToLastMessage();
                }
                ChannelAdminLogActivity.this.invitesCache.remove(tL_chatInviteExported.link);
            }

            @Override
            public void onLinkDeleted(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                int size = ChannelAdminLogActivity.this.filteredMessages.size();
                int unused = ChannelAdminLogActivity.this.chatAdapter.messagesEndRow;
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                tL_channelAdminLogEvent.user_id = ChannelAdminLogActivity.this.getAccountInstance().getUserConfig().clientUserId;
                int i = ((BaseFragment) ChannelAdminLogActivity.this).currentAccount;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                ArrayList<MessageObject> arrayList = channelAdminLogActivity.messages;
                HashMap map2 = channelAdminLogActivity.messagesByDays;
                ChannelAdminLogActivity channelAdminLogActivity2 = ChannelAdminLogActivity.this;
                if (new MessageObject(i, tL_channelAdminLogEvent, arrayList, (HashMap<String, ArrayList<MessageObject>>) map2, channelAdminLogActivity2.currentChat, channelAdminLogActivity2.mid, true).contentType < 0) {
                    return;
                }
                ChannelAdminLogActivity.this.filterDeletedMessages();
                int size2 = ChannelAdminLogActivity.this.filteredMessages.size() - size;
                if (size2 > 0) {
                    ChannelAdminLogActivity.this.chatListItemAnimator.setShouldAnimateEnterFromBottom(true);
                    ChannelAdminLogActivity.this.chatAdapter.notifyItemRangeInserted(ChannelAdminLogActivity.this.chatAdapter.messagesEndRow, size2);
                    ChannelAdminLogActivity.this.moveScrollToLastMessage();
                }
                ChannelAdminLogActivity.this.invitesCache.remove(tL_chatInviteExported.link);
            }

            @Override
            public void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
                tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
                tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
                tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
                tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                tL_channelAdminLogEvent.user_id = ChannelAdminLogActivity.this.getAccountInstance().getUserConfig().clientUserId;
                int i = ((BaseFragment) ChannelAdminLogActivity.this).currentAccount;
                ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
                ArrayList<MessageObject> arrayList = channelAdminLogActivity.messages;
                HashMap map2 = channelAdminLogActivity.messagesByDays;
                ChannelAdminLogActivity channelAdminLogActivity2 = ChannelAdminLogActivity.this;
                if (new MessageObject(i, tL_channelAdminLogEvent, arrayList, (HashMap<String, ArrayList<MessageObject>>) map2, channelAdminLogActivity2.currentChat, channelAdminLogActivity2.mid, true).contentType < 0) {
                    return;
                }
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
                ChannelAdminLogActivity.this.moveScrollToLastMessage();
            }

            @Override
            public void permanentLinkReplaced(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteExported tL_chatInviteExported2) {
            }
        });
        inviteLinkBottomSheet.show();
    }

    private CharSequence smallerNewNewLine(CharSequence charSequence) {
        int iCharSequenceIndexOf = AndroidUtilities.charSequenceIndexOf(charSequence, "\n\n");
        if (iCharSequenceIndexOf >= 0 && Build.VERSION.SDK_INT >= 29) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = new SpannableStringBuilder(charSequence);
            }
            Theme$$ExternalSyntheticApiModelOutline3.m1072m$1();
            ((SpannableStringBuilder) charSequence).setSpan(Theme$$ExternalSyntheticApiModelOutline3.m(AndroidUtilities.dp(8.0f)), iCharSequenceIndexOf + 1, iCharSequenceIndexOf + 2, 33);
        }
        return charSequence;
    }

    private void startMessageUnselect() {
        Runnable runnable = this.unselectRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        ChannelAdminLogActivity$$ExternalSyntheticLambda11 channelAdminLogActivity$$ExternalSyntheticLambda11 = new ChannelAdminLogActivity$$ExternalSyntheticLambda11(this, 1);
        this.unselectRunnable = channelAdminLogActivity$$ExternalSyntheticLambda11;
        AndroidUtilities.runOnUIThread(channelAdminLogActivity$$ExternalSyntheticLambda11, this.highlightMessageQuote != null ? 2500L : 1000L);
    }

    public void updateBottomOverlay() {
    }

    private void updateEmptyPlaceholder() {
        if (this.emptyView == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.searchQuery)) {
            this.emptyImageView.setVisibility(8);
            this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.NoLogFound, this.emptyView);
            return;
        }
        if (this.selectedAdmins != null || this.currentFilter != null) {
            this.emptyImageView.setVisibility(8);
            this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(3.0f));
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.NoLogFoundFiltered, this.emptyView);
            return;
        }
        this.emptyImageView.setVisibility(0);
        this.emptyView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        if (this.currentChat.megagroup) {
            this.emptyView.setText(smallerNewNewLine(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmpty2))));
        } else {
            this.emptyView.setText(smallerNewNewLine(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EventLogEmptyChannel2))));
        }
    }

    public void updateMessagesVisiblePart() {
        ChatListRecyclerView chatListRecyclerView = this.chatListView;
        if (chatListRecyclerView == null) {
            return;
        }
        int childCount = chatListRecyclerView.getChildCount();
        int measuredHeight = this.chatListView.getMeasuredHeight();
        int i = Integer.MAX_VALUE;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        boolean z2 = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.chatListView.getChildAt(i3);
            if (childAt instanceof ChatMessageUnsupportedCell) {
                ChatMessageUnsupportedCell chatMessageUnsupportedCell = (ChatMessageUnsupportedCell) childAt;
                float y = (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.contentView.getBackgroundTranslationY();
                int backgroundSizeY = this.contentView.getBackgroundSizeY();
                chatMessageUnsupportedCell.mViewTop = y;
                chatMessageUnsupportedCell.mParentH = backgroundSizeY;
            } else if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                int top = chatMessageCell.getTop();
                chatMessageCell.getBottom();
                int i4 = top >= 0 ? 0 : -top;
                int measuredHeight2 = chatMessageCell.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i4 + measuredHeight;
                }
                chatMessageCell.setVisiblePart(i4, measuredHeight2 - i4, (this.contentView.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - this.chatListView.getTop(), 0.0f, (childAt.getY() + this.actionBar.getMeasuredHeight()) - this.contentView.getBackgroundTranslationY(), this.contentView.getMeasuredWidth(), this.contentView.getBackgroundSizeY(), 0, 0, 0);
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (this.roundVideoContainer != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                    this.roundVideoContainer.setTranslationX(photoImage.getImageX());
                    this.roundVideoContainer.setTranslationY(photoImage.getImageY() + this.fragmentView.getPaddingTop() + top);
                    this.fragmentView.invalidate();
                    this.roundVideoContainer.invalidate();
                    z2 = true;
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                chatActionCell.setVisiblePart((childAt.getY() + this.actionBar.getMeasuredHeight()) - this.contentView.getBackgroundTranslationY(), this.contentView.getBackgroundSizeY());
                if (chatActionCell.hasGradientService()) {
                    chatActionCell.invalidate();
                }
            }
            if (childAt.getBottom() > this.chatListView.getPaddingTop()) {
                int bottom = childAt.getBottom();
                if (bottom < i) {
                    if ((childAt instanceof ChatMessageCell) || (childAt instanceof ChatActionCell)) {
                        view3 = childAt;
                    }
                    i = bottom;
                    view2 = childAt;
                }
                ChatListItemAnimator chatListItemAnimator = this.chatListItemAnimator;
                if ((chatListItemAnimator == null || (!chatListItemAnimator.willRemoved(childAt) && !this.chatListItemAnimator.willAddedFromAlpha(childAt))) && (childAt instanceof ChatActionCell) && ((ChatActionCell) childAt).getMessageObject().isDateObject) {
                    if (childAt.getAlpha() != 1.0f) {
                        childAt.setAlpha(1.0f);
                    }
                    if (bottom < i2) {
                        i2 = bottom;
                        view = childAt;
                    }
                }
            }
        }
        FrameLayout frameLayout = this.roundVideoContainer;
        if (frameLayout != null) {
            if (z2) {
                MediaController.getInstance().setCurrentVideoVisible(true);
            } else {
                frameLayout.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
                this.fragmentView.invalidate();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject != null && playingMessageObject.isRoundVideo() && this.checkTextureViewPosition) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
            }
        }
        if (view3 != null) {
            this.floatingDateView.setCustomDate((view3 instanceof ChatMessageCell ? ((ChatMessageCell) view3).getMessageObject() : ((ChatActionCell) view3).getMessageObject()).messageOwner.date, false, true);
        }
        this.currentFloatingDateOnScreen = false;
        if (!(view2 instanceof ChatMessageCell) && !(view2 instanceof ChatActionCell)) {
            z = true;
        }
        this.currentFloatingTopIsNotMessage = z;
        if (view == null) {
            hideFloatingDateView(true);
            this.floatingDateView.setTranslationY(0.0f);
            return;
        }
        if (view.getTop() > this.chatListView.getPaddingTop() || this.currentFloatingTopIsNotMessage) {
            if (view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            hideFloatingDateView(true ^ this.currentFloatingTopIsNotMessage);
        } else {
            if (view.getAlpha() != 0.0f) {
                view.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = this.floatingDateAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.floatingDateAnimation = null;
            }
            if (this.floatingDateView.getTag() == null) {
                this.floatingDateView.setTag(1);
            }
            if (this.floatingDateView.getAlpha() != 1.0f) {
                this.floatingDateView.setAlpha(1.0f);
            }
            this.currentFloatingDateOnScreen = true;
        }
        int bottom2 = view.getBottom() - this.chatListView.getPaddingTop();
        if (bottom2 <= this.floatingDateView.getMeasuredHeight() || bottom2 >= this.floatingDateView.getMeasuredHeight() * 2) {
            this.floatingDateView.setTranslationY(0.0f);
        } else {
            ChatActionCell chatActionCell2 = this.floatingDateView;
            chatActionCell2.setTranslationY(((-chatActionCell2.getMeasuredHeight()) * 2) + bottom2);
        }
    }

    private void updateTextureViewPosition() {
        boolean z;
        int childCount = this.chatListView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (this.roundVideoContainer != null && messageObject.isRoundVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                    ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                    this.roundVideoContainer.setTranslationX(photoImage.getImageX());
                    this.roundVideoContainer.setTranslationY(photoImage.getImageY() + chatMessageCell.getTop() + this.fragmentView.getPaddingTop());
                    this.fragmentView.invalidate();
                    this.roundVideoContainer.invalidate();
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (this.roundVideoContainer != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            if (z) {
                MediaController.getInstance().setCurrentVideoVisible(true);
                return;
            }
            this.roundVideoContainer.setTranslationY((-AndroidUtilities.roundMessageSize) - 100);
            this.fragmentView.invalidate();
            if (playingMessageObject == null || !playingMessageObject.isRoundVideo()) {
                return;
            }
            if (this.checkTextureViewPosition || PipRoundVideoView.getInstance() != null) {
                MediaController.getInstance().setCurrentVideoVisible(false);
            }
        }
    }

    public void updateVisibleRows() {
        updateVisibleRows(false);
    }

    public void applyScrolledPosition() {
        int i;
        if (this.chatListView == null || this.chatLayoutManager == null || (i = this.savedScrollPosition) < 0) {
            return;
        }
        if (this.savedScrollEventId != 0) {
            for (int i2 = 0; i2 < this.chatAdapter.getItemCount(); i2++) {
                MessageObject messageObject = this.chatAdapter.getMessageObject(i2);
                if (messageObject != null && messageObject.eventId == this.savedScrollEventId) {
                    i = i2;
                    break;
                }
            }
        }
        this.chatLayoutManager.scrollToPositionWithOffset(i, this.savedScrollOffset, true);
        this.savedScrollPosition = -1;
        this.savedScrollEventId = 0L;
    }

    @Override
    public View createView(Context context) {
        if (this.chatMessageCellsCache.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                this.chatMessageCellsCache.add(new ChatMessageCell(context, this.currentAccount, false, null, null));
            }
        }
        this.searchWas = false;
        this.hasOwnBackground = true;
        Theme.createChatResources(context);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackground(null);
        this.actionBar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        zzki.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    ChannelAdminLogActivity.this.finishFragment();
                }
            }
        });
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setGlassMode();
        this.avatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 54.0f, 0.0f, 52.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                ChannelAdminLogActivity.this.searchQuery = "";
                ChannelAdminLogActivity.this.avatarContainer.setVisibility(0);
                if (ChannelAdminLogActivity.this.searchWas) {
                    ChannelAdminLogActivity.this.searchWas = false;
                    ChannelAdminLogActivity.this.loadMessages(true);
                }
                ChannelAdminLogActivity.this.updateBottomOverlay();
            }

            @Override
            public void onSearchExpand() {
                ChannelAdminLogActivity.this.avatarContainer.setVisibility(8);
                ChannelAdminLogActivity.this.updateBottomOverlay();
            }

            @Override
            public void onSearchPressed(EditText editText) {
                ChannelAdminLogActivity.this.searchWas = true;
                ChannelAdminLogActivity.this.searchQuery = editText.getText().toString();
                ChannelAdminLogActivity.this.loadMessages(true);
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.searchItem.setSearchPaddingStart(7);
        this.avatarContainer.setEnabled(false);
        this.avatarContainer.setTitle(this.currentChat.title);
        this.avatarContainer.setSubtitle(LocaleController.getString(R.string.EventLogAllEvents));
        this.avatarContainer.setChatAvatar(this.currentChat);
        ChatActivityFragmentView chatActivityFragmentView = new ChatActivityFragmentView(context) {
            private final WallpaperBitmapProvider wallpaperBitmapProvider = new WallpaperBitmapProvider();

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (!AvatarPreviewer.hasVisibleInstance()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                AvatarPreviewer.getInstance().onTouchEvent(motionEvent);
                return true;
            }

            @Override
            public boolean isActionBarVisible() {
                return false;
            }

            @Override
            public boolean isStatusBarVisible() {
                return false;
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0 || playingMessageObject.getDialogId() != (-ChannelAdminLogActivity.this.currentChat.id)) {
                    return;
                }
                MediaController.getInstance().setTextureView(ChannelAdminLogActivity.this.createTextureView(false), ChannelAdminLogActivity.this.aspectRatioFrameLayout, ChannelAdminLogActivity.this.roundVideoContainer, true);
            }

            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int paddingTop;
                int paddingTop2;
                int measuredHeight;
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        int i12 = layoutParams.gravity;
                        if (i12 == -1) {
                            i12 = 51;
                        }
                        int i13 = i12 & 112;
                        int i14 = i12 & 7;
                        if (i14 != 1) {
                            if (i14 != 5) {
                                i8 = layoutParams.leftMargin;
                            } else {
                                i6 = i4 - measuredWidth;
                                i7 = layoutParams.rightMargin;
                            }
                            if (i13 != 16) {
                                if (i13 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                    if (childAt != ((BaseFragment) ChannelAdminLogActivity.this).actionBar && ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                                        paddingTop += ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight();
                                    }
                                } else if (i13 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i9 = (i5 - i3) - measuredHeight2;
                                    i10 = layoutParams.bottomMargin;
                                }
                                if (childAt == ChannelAdminLogActivity.this.emptyViewContainer) {
                                    int iDp = AndroidUtilities.dp(24.0f);
                                    if (((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                                        measuredHeight = ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight() / 2;
                                    } else {
                                        measuredHeight = 0;
                                    }
                                    paddingTop2 = iDp - measuredHeight;
                                } else {
                                    if (childAt == ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                                        paddingTop2 = getPaddingTop();
                                    } else if (childAt != this.backgroundView || childAt == ChannelAdminLogActivity.this.chatActivityFadeView) {
                                        paddingTop = 0;
                                    } else if (childAt == ChannelAdminLogActivity.this.chatListView) {
                                        paddingTop = -ChannelAdminLogActivity.this.recommendedAdditionalSizeY;
                                    }
                                    childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                                }
                                paddingTop -= paddingTop2;
                                childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                            } else {
                                i9 = (((i5 - i3) - measuredHeight2) / 2) + layoutParams.topMargin;
                                i10 = layoutParams.bottomMargin;
                            }
                            paddingTop = i9 - i10;
                            if (childAt == ChannelAdminLogActivity.this.emptyViewContainer) {
                                int iDp2 = AndroidUtilities.dp(24.0f);
                                if (((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                                    measuredHeight = ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight() / 2;
                                } else {
                                    measuredHeight = 0;
                                }
                                paddingTop2 = iDp2 - measuredHeight;
                            } else {
                                if (childAt == ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                                    paddingTop2 = getPaddingTop();
                                } else if (childAt != this.backgroundView) {
                                    paddingTop = 0;
                                } else {
                                    paddingTop = 0;
                                }
                                childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                            }
                            paddingTop -= paddingTop2;
                            childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                        } else {
                            i6 = (((i4 - i2) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i7 = layoutParams.rightMargin;
                        }
                        i8 = i6 - i7;
                        if (i13 != 16) {
                            if (i13 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                                if (childAt != ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                                    paddingTop += ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight();
                                }
                            } else if (i13 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i9 = (i5 - i3) - measuredHeight2;
                                i10 = layoutParams.bottomMargin;
                            }
                            if (childAt == ChannelAdminLogActivity.this.emptyViewContainer) {
                                int iDp3 = AndroidUtilities.dp(24.0f);
                                if (((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                                    measuredHeight = ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight() / 2;
                                } else {
                                    measuredHeight = 0;
                                }
                                paddingTop2 = iDp3 - measuredHeight;
                            } else {
                                if (childAt == ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                                    paddingTop2 = getPaddingTop();
                                } else if (childAt != this.backgroundView) {
                                    paddingTop = 0;
                                } else {
                                    paddingTop = 0;
                                }
                                childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                            }
                            paddingTop -= paddingTop2;
                            childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                        } else {
                            i9 = (((i5 - i3) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i10 = layoutParams.bottomMargin;
                        }
                        paddingTop = i9 - i10;
                        if (childAt == ChannelAdminLogActivity.this.emptyViewContainer) {
                            int iDp4 = AndroidUtilities.dp(24.0f);
                            if (((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                                measuredHeight = ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight() / 2;
                            } else {
                                measuredHeight = 0;
                            }
                            paddingTop2 = iDp4 - measuredHeight;
                        } else {
                            if (childAt == ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                                paddingTop2 = getPaddingTop();
                            } else if (childAt != this.backgroundView) {
                                paddingTop = 0;
                            } else {
                                paddingTop = 0;
                            }
                            childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                        }
                        paddingTop -= paddingTop2;
                        childAt.layout(i8, paddingTop, measuredWidth + i8, measuredHeight2 + paddingTop);
                    }
                }
                ChannelAdminLogActivity.this.updateMessagesVisiblePart();
                notifyHeightChanged();
            }

            @Override
            public void onMeasure(int i2, int i3) {
                ViewGroup viewGroup;
                int iIndexOfChild;
                OnPostDrawView onPostDrawView = ChannelAdminLogActivity.this.invalidateBlurredSourcesView;
                ViewParent parent = onPostDrawView.getParent();
                if ((parent instanceof ViewGroup) && (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(onPostDrawView)) >= 0 && iIndexOfChild != viewGroup.getChildCount() - 1) {
                    viewGroup.bringChildToFront(onPostDrawView);
                }
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                if (ChannelAdminLogActivity.this.navbarContentSourceWallpaper.sourceInternal instanceof BlurredBackgroundSourceBitmap) {
                    BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = (BlurredBackgroundSourceBitmap) ChannelAdminLogActivity.this.navbarContentSourceWallpaper.sourceInternal;
                    if (blurredBackgroundSourceBitmap.parentWidth != size || blurredBackgroundSourceBitmap.parentHeight != size2) {
                        blurredBackgroundSourceBitmap.parentWidth = size;
                        blurredBackgroundSourceBitmap.parentHeight = size2;
                        blurredBackgroundSourceBitmap.updateMatrix();
                    }
                }
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                measureChildWithMargins(((BaseFragment) ChannelAdminLogActivity.this).actionBar, i2, 0, i3, 0);
                int measuredHeight = ((BaseFragment) ChannelAdminLogActivity.this).actionBar.getMeasuredHeight();
                if (((BaseFragment) ChannelAdminLogActivity.this).actionBar.getVisibility() == 0) {
                    paddingTop -= measuredHeight;
                }
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) ChannelAdminLogActivity.this).actionBar) {
                        if (childAt == ChannelAdminLogActivity.this.chatListView || childAt == ChannelAdminLogActivity.this.progressView) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i3)) + (ChannelAdminLogActivity.this.recommendedAdditionalSizeY * 2), 1073741824));
                        } else if (childAt == ChannelAdminLogActivity.this.emptyViewContainer) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i2, 0, i3, 0);
                        }
                    }
                }
            }

            @Override
            public void onUpdateBackgroundDrawable(Drawable drawable) {
                super.onUpdateBackgroundDrawable(drawable);
                if (drawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) drawable).setFastRenderAllowed();
                }
                BlurredBackgroundSource blurredBackgroundSourceUpdateSourceFromBackgroundViewDrawable = this.wallpaperBitmapProvider.updateSourceFromBackgroundViewDrawable(drawable);
                AndroidUtilities.computePerceivedBrightness(this.wallpaperBitmapProvider.getNavigationBarColor(blurredBackgroundSourceUpdateSourceFromBackgroundViewDrawable));
                ChannelAdminLogActivity.this.navbarContentSourceWallpaper.sourceInternal = blurredBackgroundSourceUpdateSourceFromBackgroundViewDrawable;
                if (ChannelAdminLogActivity.this.chatActivityFadeView != null) {
                    ChannelAdminLogActivity.this.chatActivityFadeView.invalidate();
                }
            }
        };
        this.fragmentView = chatActivityFragmentView;
        this.contentView = chatActivityFragmentView;
        OnPostDrawView onPostDrawView = new OnPostDrawView(context, new ChannelAdminLogActivity$$ExternalSyntheticLambda0(this));
        this.invalidateBlurredSourcesView = onPostDrawView;
        this.contentView.addView(onPostDrawView);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.glassBackgroundDrawableFactory;
        ChatActivityFragmentView chatActivityFragmentView2 = this.contentView;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = chatActivityFragmentView2;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = this.glassBackgroundDrawableFactoryFrosted;
        blurredBackgroundDrawableViewFactory2.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory2.parent = chatActivityFragmentView2;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = this.navbarContentDrawableFactory;
        blurredBackgroundDrawableViewFactory3.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory3.parent = chatActivityFragmentView2;
        chatActivityFragmentView2.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.contentView.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion);
        this.actionBar.setupGlass(this.glassBackgroundDrawableFactory, BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.emptyViewContainer = frameLayout;
        frameLayout.setVisibility(4);
        this.contentView.addView(this.emptyViewContainer, LayoutHelper.createFrame(-1, -2, 17));
        this.emptyViewContainer.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(8));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyLayoutView = linearLayout;
        linearLayout.setBackground(new Theme.AnonymousClass7(this.emptyView, this.contentView, AndroidUtilities.dp(12.0f), Theme.chat_actionBackgroundPaint));
        this.emptyLayoutView.setOrientation(1);
        ImageView imageView = new ImageView(context);
        this.emptyImageView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.emptyImageView.setImageResource(R.drawable.large_log_actions);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.emptyImageView.setVisibility(8);
        this.emptyLayoutView.addView(this.emptyImageView, LayoutHelper.createLinear(54, 54, 17, 16, 20, 16, -4));
        TextView textView = new TextView(context) {
            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(220.0f)), View.MeasureSpec.getMode(i2)), i3);
            }
        };
        this.emptyView = textView;
        textView.setTextSize(1, 14.0f);
        this.emptyView.setGravity(17);
        TextView textView2 = this.emptyView;
        int i2 = Theme.key_chat_serviceText;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        this.emptyView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        this.emptyLayoutView.addView(this.emptyView, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
        this.emptyViewContainer.addView(this.emptyLayoutView, LayoutHelper.createFrame(-2, -2.0f, 17, 20.0f, 0.0f, 20.0f, 0.0f));
        ChatListRecyclerView chatListRecyclerView = new ChatListRecyclerView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                ChatMessageCell chatMessageCell;
                ImageReceiver avatarImage;
                int y;
                int adapterPosition;
                if (view instanceof ChatMessageUnsupportedCell) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    ((ChatMessageUnsupportedCell) view).drawBackground(canvas);
                    canvas.restore();
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if ((view instanceof ChatMessageCell) && (avatarImage = (chatMessageCell = (ChatMessageCell) view).getAvatarImage()) != null) {
                    boolean z = (chatMessageCell.getMessageObject().deleted || ChannelAdminLogActivity.this.chatListView.getChildAdapterPosition(chatMessageCell) == -1) ? false : true;
                    if (chatMessageCell.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return zDrawChild;
                    }
                    int y2 = (int) view.getY();
                    if (chatMessageCell.drawPinnedBottom() && (adapterPosition = ChannelAdminLogActivity.this.chatListView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                        if (ChannelAdminLogActivity.this.chatListView.findViewHolderForAdapterPosition(adapterPosition + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return zDrawChild;
                        }
                    }
                    float checkBoxTranslation = chatMessageCell.getCheckBoxTranslation() + chatMessageCell.getSlidingOffsetX();
                    int layoutHeight = chatMessageCell.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = ChannelAdminLogActivity.this.chatListView.getMeasuredHeight() - ChannelAdminLogActivity.this.chatListView.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (chatMessageCell.drawPinnedTop() && (adapterPosition = ChannelAdminLogActivity.this.chatListView.getChildViewHolder(view).getAdapterPosition()) >= 0) {
                        int i3 = 0;
                        while (i3 < 20) {
                            i3++;
                            int adapterPosition2 = adapterPosition2 - 1;
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChannelAdminLogActivity.this.chatListView.findViewHolderForAdapterPosition(adapterPosition2);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                break;
                            }
                            y2 = viewHolderFindViewHolderForAdapterPosition.itemView.getTop();
                            View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                            if (!(view2 instanceof ChatMessageCell)) {
                                break;
                            }
                            chatMessageCell = (ChatMessageCell) view2;
                            if (!chatMessageCell.drawPinnedTop()) {
                                break;
                            }
                        }
                    }
                    if (layoutHeight - AndroidUtilities.dp(48.0f) < y2) {
                        layoutHeight = AndroidUtilities.dp(48.0f) + y2;
                    }
                    if (!chatMessageCell.drawPinnedBottom() && layoutHeight > (y = (int) (chatMessageCell.getY() + chatMessageCell.getMeasuredHeight()))) {
                        layoutHeight = y;
                    }
                    canvas.save();
                    if (checkBoxTranslation != 0.0f) {
                        canvas.translate(checkBoxTranslation, 0.0f);
                    }
                    if (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        layoutHeight = (int) (layoutHeight - chatMessageCell.getTranslationY());
                    }
                    if (z) {
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                    }
                    if (chatMessageCell.shouldDrawAlphaLayer()) {
                        avatarImage.setAlpha(chatMessageCell.getAlpha());
                        canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX() + chatMessageCell.getX(), chatMessageCell.getY() + (chatMessageCell.getHeight() >> 1));
                    } else {
                        avatarImage.setAlpha(1.0f);
                    }
                    if (z) {
                        avatarImage.setVisible(true, false);
                    }
                    avatarImage.draw(canvas);
                    canvas.restore();
                }
                return zDrawChild;
            }

            @Override
            public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                ChannelAdminLogActivity.this.applyScrolledPosition();
                super.onLayout(z, i3, i4, i5, i6);
            }
        };
        this.chatListView = chatListRecyclerView;
        chatListRecyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public final boolean hasDoubleTap(View view, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i3);
            }

            @Override
            public final void onDoubleTap(View view, int i3, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i3, f, f2);
            }

            @Override
            public void onItemClick(View view, int i3, float f, float f2) {
                MessageObject messageObject;
                if (!(view instanceof ChatActionCell) || (messageObject = ((ChatActionCell) view).getMessageObject()) == null || messageObject.actionDeleteGroupEventId == -1) {
                    ChannelAdminLogActivity.this.createMenu(view, f, f2);
                    return;
                }
                if (ChannelAdminLogActivity.this.expandedEvents.contains(Long.valueOf(messageObject.actionDeleteGroupEventId))) {
                    ChannelAdminLogActivity.this.expandedEvents.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ChannelAdminLogActivity.this.expandedEvents.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ChannelAdminLogActivity.this.saveScrollPosition(true);
                ChannelAdminLogActivity.this.filterDeletedMessages();
                ChannelAdminLogActivity.this.chatAdapter.notifyDataSetChanged();
            }
        });
        this.chatListView.setTag(1);
        this.chatListView.setVerticalScrollBarEnabled(true);
        ChatListRecyclerView chatListRecyclerView2 = this.chatListView;
        ChatActivityAdapter chatActivityAdapter = new ChatActivityAdapter(context);
        this.chatAdapter = chatActivityAdapter;
        chatListRecyclerView2.setAdapter(chatActivityAdapter);
        this.chatListView.setClipToPadding(false);
        this.chatListView.setPadding(0, AndroidUtilities.dp(4.0f) + ActionBar.getCurrentActionBarHeight() + this.recommendedAdditionalSizeY + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.dp(60.0f) + this.recommendedAdditionalSizeY + AndroidUtilities.navigationBarHeight);
        ChatListRecyclerView chatListRecyclerView3 = this.chatListView;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(null, this.chatListView, this.resourceProvider);
        this.chatListItemAnimator = anonymousClass9;
        chatListRecyclerView3.lambda$onCellEnter$52(anonymousClass9);
        this.chatListItemAnimator.setReversePositions(true);
        this.chatListView.setLayoutAnimation(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            {
                super(1, false);
            }

            @Override
            public void scrollToPositionWithOffset(int i3, int i4) {
                super.scrollToPositionWithOffset(i3, i4);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i3) {
                ChannelAdminLogActivity.this.scrollByTouch = false;
                LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
                linearSmoothScrollerCustom.setTargetPosition(i3);
                startSmoothScroll(linearSmoothScrollerCustom);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }
        };
        this.chatLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.chatLayoutManager.setStackFromEnd(true);
        this.chatListView.setLayoutManager(this.chatLayoutManager);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.chatListView, this.chatLayoutManager);
        this.chatScrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new ChannelAdminLogActivity$$ExternalSyntheticLambda0(this));
        this.chatScrollHelper.setAnimationCallback(this.chatScrollHelperCallback);
        this.contentView.addView(this.chatListView, LayoutHelper.createFrame(-1, -1.0f));
        this.chatListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            private float totalDy = 0.0f;
            private final int scrollValue = AndroidUtilities.dp(100.0f);

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                if (i3 == 1) {
                    ChannelAdminLogActivity.this.scrollingFloatingDate = true;
                    ChannelAdminLogActivity.this.checkTextureViewPosition = true;
                } else if (i3 == 0) {
                    ChannelAdminLogActivity.this.scrollingFloatingDate = false;
                    ChannelAdminLogActivity.this.checkTextureViewPosition = false;
                    ChannelAdminLogActivity.this.hideFloatingDateView(true);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                ChannelAdminLogActivity.this.chatListView.invalidate();
                if (i4 != 0 && ChannelAdminLogActivity.this.scrollingFloatingDate && !ChannelAdminLogActivity.this.currentFloatingTopIsNotMessage && ChannelAdminLogActivity.this.floatingDateView.getTag() == null) {
                    if (ChannelAdminLogActivity.this.floatingDateAnimation != null) {
                        ChannelAdminLogActivity.this.floatingDateAnimation.cancel();
                    }
                    ChannelAdminLogActivity.this.floatingDateView.setTag(1);
                    ChannelAdminLogActivity.this.floatingDateAnimation = new AnimatorSet();
                    ChannelAdminLogActivity.this.floatingDateAnimation.setDuration(150L);
                    ChannelAdminLogActivity.this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(ChannelAdminLogActivity.this.floatingDateView, "alpha", 1.0f));
                    ChannelAdminLogActivity.this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(ChannelAdminLogActivity.this.floatingDateAnimation)) {
                                ChannelAdminLogActivity.this.floatingDateAnimation = null;
                            }
                        }
                    });
                    ChannelAdminLogActivity.this.floatingDateAnimation.start();
                }
                if (i4 != 0) {
                    ChannelAdminLogActivity.this.invalidateMergedVisibleBlurredPositionsAndSources(1);
                }
                ChannelAdminLogActivity.this.checkScrollForLoad(true);
                ChannelAdminLogActivity.this.updateMessagesVisiblePart();
            }
        });
        int i3 = this.scrollToPositionOnRecreate;
        if (i3 != -1) {
            this.chatLayoutManager.scrollToPositionWithOffset(i3, this.scrollToOffsetOnRecreate);
            this.scrollToPositionOnRecreate = -1;
        }
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.chatActivityFadeView = chatActivityFadeView;
        chatActivityFadeView.setup(this.navbarContentDrawableFactory);
        this.chatActivityFadeView.setFadeZoneTop(AndroidUtilities.dp(2.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.chatActivityFadeView.setFadeHeightTop(AndroidUtilities.dp(60.0f));
        this.chatActivityFadeView.setFadeZoneBottom(AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(9.0f) + AndroidUtilities.navigationBarHeight);
        this.chatActivityFadeView.setFadeHeightBottom(AndroidUtilities.dp(60.0f));
        this.contentView.addView(this.chatActivityFadeView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.progressView = frameLayout2;
        frameLayout2.setVisibility(4);
        this.contentView.addView(this.progressView, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context);
        this.progressView2 = view;
        view.setBackground(new Theme.AnonymousClass7(this.progressView2, this.contentView, AndroidUtilities.dp(18.0f), Theme.chat_actionBackgroundPaint));
        this.progressView.addView(this.progressView2, LayoutHelper.createFrame(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressBar = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        this.progressBar.setProgressColor(Theme.getColor(null, i2, false));
        this.progressView.addView(this.progressBar, LayoutHelper.createFrame(32, 32, 17));
        ChatActionCell chatActionCell = new ChatActionCell(context, false, null);
        this.floatingDateView = chatActionCell;
        chatActionCell.setAlpha(0.0f);
        this.floatingDateView.setImportantForAccessibility(2);
        this.contentView.addView(this.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        this.contentView.addView(this.actionBar);
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        ChatActivityChannelButtonsLayout chatActivityChannelButtonsLayout = new ChatActivityChannelButtonsLayout(context, resourcesProvider, this.glassBackgroundDrawableFactory, BlurredBackgroundProviderImpl.bottomPanelChatActivity(resourcesProvider));
        this.bottomOverlayChat2 = chatActivityChannelButtonsLayout;
        chatActivityChannelButtonsLayout.setTotalVisibilityFactor(1.0f);
        this.bottomOverlayChat2.setTranslationY(-AndroidUtilities.navigationBarHeight);
        this.bottomOverlayChat2.showButton(4, true, false);
        this.bottomOverlayChat2.setupDrawableForContainer();
        this.contentView.addView(this.bottomOverlayChat2, LayoutHelper.createFrame(-1, 56.0f, 80, 54.0f, 0.0f, 0.0f, 3.0f));
        TextView textView3 = new TextView(context);
        this.bottomOverlayChatText = textView3;
        final int i4 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChannelAdminLogActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$createView$9(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$10(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$12(view2);
                        break;
                }
            }
        });
        this.bottomOverlayChatText.setTextSize(1, 15.0f);
        this.bottomOverlayChatText.setTypeface(AndroidUtilities.bold());
        this.bottomOverlayChatText.setTextColor(Theme.getColor(null, Theme.key_chat_fieldOverlayText, false));
        this.bottomOverlayChatText.setText(LocaleController.getString(R.string.SETTINGS));
        this.bottomOverlayChatText.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.bottomOverlayChat2.getContainer().addView(this.bottomOverlayChatText, LayoutHelper.createFrame(-2, -2, 17));
        this.bottomOverlayChat2.makeViewWrapContent(this.bottomOverlayChatText);
        this.bottomOverlayChat2.updateWrappingVisible(false);
        final int i5 = 1;
        this.bottomOverlayChat2.setButtonOnClickListener(4, new View.OnClickListener(this) {
            public final ChannelAdminLogActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        this.f$0.lambda$createView$9(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$10(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$12(view2);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.searchContainer = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.searchContainer.setVisibility(4);
        this.searchContainer.setFocusable(true);
        this.searchContainer.setFocusableInTouchMode(true);
        this.searchContainer.setClickable(true);
        this.searchContainer.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.contentView.addView(this.searchContainer, LayoutHelper.createFrame(-1, 51, 80));
        ImageView imageView2 = new ImageView(context);
        this.searchCalendarButton = imageView2;
        imageView2.setScaleType(scaleType);
        this.searchCalendarButton.setImageResource(R.drawable.msg_calendar);
        this.searchCalendarButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_searchPanelIcons, false), PorterDuff.Mode.MULTIPLY));
        this.searchContainer.addView(this.searchCalendarButton, LayoutHelper.createFrame(48, 48, 53));
        final int i6 = 2;
        this.searchCalendarButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChannelAdminLogActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        this.f$0.lambda$createView$9(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$10(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$12(view2);
                        break;
                }
            }
        });
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.searchCountText = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_chat_searchPanelText, false));
        this.searchCountText.setTextSize(15);
        this.searchCountText.setTypeface(AndroidUtilities.bold());
        this.searchContainer.addView(this.searchCountText, LayoutHelper.createFrame(-1, -2.0f, 19, 108.0f, 0.0f, 0.0f, 0.0f));
        this.chatAdapter.updateRows();
        if (this.loading && this.messages.isEmpty()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, true, 0.3f, true);
            this.chatListView.setEmptyView(null);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(this.progressView, false, 0.3f, true);
            this.chatListView.setEmptyView(this.emptyViewContainer);
        }
        this.chatListView.setAnimateEmptyView(true, 1);
        UndoView undoView = new UndoView(context);
        this.undoView = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.contentView.addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        updateEmptyPlaceholder();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ChatMessageCell chatMessageCell;
        MessageObject messageObject;
        ChatMessageCell chatMessageCell2;
        MessageObject messageObject2;
        ChatMessageCell chatMessageCell3;
        MessageObject messageObject3;
        if (i == NotificationCenter.emojiLoaded) {
            ChatListRecyclerView chatListRecyclerView = this.chatListView;
            if (chatListRecyclerView != null) {
                chatListRecyclerView.invalidateViews();
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart) {
            if (((MessageObject) objArr[0]).isRoundVideo()) {
                MediaController.getInstance().setTextureView(createTextureView(true), this.aspectRatioFrameLayout, this.roundVideoContainer, true);
                updateTextureViewPosition();
            }
            ChatListRecyclerView chatListRecyclerView2 = this.chatListView;
            if (chatListRecyclerView2 != null) {
                int childCount = chatListRecyclerView2.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.chatListView.getChildAt(i3);
                    if ((childAt instanceof ChatMessageCell) && (messageObject3 = (chatMessageCell3 = (ChatMessageCell) childAt).getMessageObject()) != null) {
                        if (messageObject3.isVoice() || messageObject3.isMusic()) {
                            chatMessageCell3.updateButtonState(false, true, false);
                        } else if (messageObject3.isRoundVideo()) {
                            chatMessageCell3.checkVideoPlayback(false, null);
                            if (!MediaController.getInstance().isPlayingMessage(messageObject3) && messageObject3.audioProgress != 0.0f) {
                                messageObject3.resetPlayingProgress();
                                chatMessageCell3.invalidate();
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            ChatListRecyclerView chatListRecyclerView3 = this.chatListView;
            if (chatListRecyclerView3 != null) {
                int childCount2 = chatListRecyclerView3.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = this.chatListView.getChildAt(i4);
                    if ((childAt2 instanceof ChatMessageCell) && (messageObject = (chatMessageCell = (ChatMessageCell) childAt2).getMessageObject()) != null) {
                        if (messageObject.isVoice() || messageObject.isMusic()) {
                            chatMessageCell.updateButtonState(false, true, false);
                        } else if (messageObject.isRoundVideo() && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                            chatMessageCell.checkVideoPlayback(true, null);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.messagePlayingProgressDidChanged) {
            if (i != NotificationCenter.didSetNewWallpapper || this.fragmentView == null) {
                return;
            }
            this.contentView.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion);
            this.progressView2.invalidate();
            TextView textView = this.emptyView;
            if (textView != null) {
                textView.invalidate();
            }
            this.chatListView.invalidateViews();
            return;
        }
        Integer num = (Integer) objArr[0];
        ChatListRecyclerView chatListRecyclerView4 = this.chatListView;
        if (chatListRecyclerView4 != null) {
            int childCount3 = chatListRecyclerView4.getChildCount();
            for (int i5 = 0; i5 < childCount3; i5++) {
                View childAt3 = this.chatListView.getChildAt(i5);
                if ((childAt3 instanceof ChatMessageCell) && (messageObject2 = (chatMessageCell2 = (ChatMessageCell) childAt3).getMessageObject()) != null && messageObject2.getId() == num.intValue()) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null) {
                        messageObject2.audioProgress = playingMessageObject.audioProgress;
                        messageObject2.audioProgressSec = playingMessageObject.audioProgressSec;
                        messageObject2.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                        chatMessageCell2.updatePlayingMessageProgress();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    public TLRPC.Chat getCurrentChat() {
        return this.currentChat;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 0, null, null, null, null, Theme.key_chat_wallpaper));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.chatListView, 32768, null, null, null, null, i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_actionBarDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar2, 64, null, null, null, null, i2));
        ActionBar actionBar3 = this.actionBar;
        int i3 = Theme.key_actionBarDefaultSelector;
        arrayList.add(new ThemeDescription(actionBar3, 256, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.chatListView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.avatarContainer.getTitleTextView(), 4, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.avatarContainer.getSubtitleTextView(), 4, (Class[]) null, new Paint[]{Theme.chat_statusPaint, Theme.chat_statusRecordPaint}, Theme.key_actionBarDefaultSubtitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageRed));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageOrange));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageViolet));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageGreen));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageCyan));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessageBlue));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_avatar_nameInMessagePink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
        int i4 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables, null, i4));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i4));
        Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
        int i5 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables2, null, i5));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i5));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        TextPaint textPaint = Theme.chat_actionTextPaint;
        int i6 = Theme.key_chat_serviceText;
        arrayList.add(new ThemeDescription(this.chatListView, 4, new Class[]{ChatActionCell.class}, textPaint, null, null, i6));
        arrayList.add(new ThemeDescription(this.chatListView, 2, new Class[]{ChatActionCell.class}, Theme.chat_actionTextPaint, null, null, Theme.key_chat_serviceLink));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_botCardDrawable, Theme.chat_shareIconDrawable, Theme.chat_botInlineDrawable, Theme.chat_botLinkDrawable, Theme.chat_goIconDrawable, Theme.chat_commentStickerDrawable}, null, Theme.key_chat_serviceIcon));
        int i7 = Theme.key_chat_serviceBackground;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class, ChatActionCell.class}, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class, ChatActionCell.class}, null, null, null, Theme.key_chat_serviceBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.chatListView, 2, new Class[]{ChatMessageCell.class}, (Paint[]) null, Theme.key_chat_messageLinkIn));
        arrayList.add(new ThemeDescription(this.chatListView, 2, new Class[]{ChatMessageCell.class}, (Paint[]) null, Theme.key_chat_messageLinkOut));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutViewsDrawable, Theme.chat_msgOutRepliesDrawable, Theme.chat_msgOutPinnedDrawable}, null, Theme.key_chat_outViews));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutViewsSelectedDrawable, Theme.chat_msgOutRepliesSelectedDrawable, Theme.chat_msgOutPinnedSelectedDrawable}, null, Theme.key_chat_outViewsSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInViewsDrawable, Theme.chat_msgInRepliesDrawable, Theme.chat_msgInPinnedDrawable}, null, Theme.key_chat_inViews));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInViewsSelectedDrawable, Theme.chat_msgInRepliesSelectedDrawable, Theme.chat_msgInPinnedSelectedDrawable}, null, Theme.key_chat_inViewsSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaViewsDrawable, Theme.chat_msgMediaRepliesDrawable, Theme.chat_msgMediaPinnedDrawable}, null, Theme.key_chat_mediaViews));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutMenuDrawable}, null, Theme.key_chat_outMenu));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutMenuSelectedDrawable}, null, Theme.key_chat_outMenuSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInMenuDrawable}, null, Theme.key_chat_inMenu));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInMenuSelectedDrawable}, null, Theme.key_chat_inMenuSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaMenuDrawable}, null, Theme.key_chat_mediaMenu));
        Drawable[] drawableArr = {Theme.chat_msgOutInstantDrawable};
        int i8 = Theme.key_chat_outInstant;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, drawableArr, null, i8));
        Drawable[] drawableArr2 = {Theme.chat_msgInInstantDrawable, Theme.chat_commentDrawable, Theme.chat_commentArrowDrawable};
        int i9 = Theme.key_chat_inInstant;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, drawableArr2, null, i9));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutCallDrawable, null, i8));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutCallSelectedDrawable, null, Theme.key_chat_outInstantSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInCallDrawable, null, i9));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInCallSelectedDrawable, null, Theme.key_chat_inInstantSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgCallUpGreenDrawable}, null, Theme.key_chat_outGreenCall));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgCallDownRedDrawable}, null, Theme.key_fill_RedNormal));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgCallDownGreenDrawable}, null, Theme.key_chat_inGreenCall));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_msgErrorPaint, null, null, Theme.key_chat_sentError));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgErrorDrawable}, null, Theme.key_chat_sentErrorIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_durationPaint, null, null, Theme.key_chat_previewDurationText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_gamePaint, null, null, Theme.key_chat_previewGameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inPreviewInstantText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outPreviewInstantText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_deleteProgressPaint, null, null, Theme.key_chat_secretTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_botButtonPaint, null, null, Theme.key_chat_botButtonText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inForwardedNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outForwardedNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inViaBotNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outViaBotNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerViaBotNameText));
        int i10 = Theme.key_chat_inReplyLine;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, i10));
        int i11 = Theme.key_chat_outReplyLine;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyLine2));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerReplyLine));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerReplyNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMediaMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMediaMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_stickerReplyMessageText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inPreviewLine));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outPreviewLine));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inSiteNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outSiteNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inContactNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outContactNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inContactPhoneText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outContactPhoneText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_mediaProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSelectedProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSelectedProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_mediaTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outTimeSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioPerformerText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioPerformerText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioTitleText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioTitleText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioDurationText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioDurationText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioDurationSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioDurationSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inAudioCacheSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outAudioCacheSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVoiceSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVoiceSeekbar));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVoiceSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVoiceSeekbarSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVoiceSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVoiceSeekbarFill));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileProgress));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileProgressSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileProgressSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileNameText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inFileBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outFileBackgroundSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVenueInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVenueInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inVenueInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outVenueInfoSelectedText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_mediaInfoText));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_urlPaint, null, null, i10));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, Theme.chat_textSearchSelectionPaint, null, null, i11));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outLoader));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outMediaIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outLoaderSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outMediaIconSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLoader));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inMediaIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLoaderSelected));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inMediaIconSelected));
        Drawable[] drawableArr3 = Theme.chat_contactDrawable;
        arrayList.add(new ThemeDescription(this.chatListView, 32, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[0]}, null, Theme.key_chat_inContactBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[0]}, null, Theme.key_chat_inContactIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 32, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[1]}, null, Theme.key_chat_outContactBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr3[1]}, null, Theme.key_chat_outContactIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inLocationBackground));
        Drawable[] drawableArr4 = Theme.chat_locationDrawable;
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr4[0]}, null, Theme.key_chat_inLocationIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{drawableArr4[1]}, null, Theme.key_chat_outLocationIcon));
        arrayList.add(new ThemeDescription(this.bottomOverlayChatText, 4, null, null, null, null, Theme.key_chat_fieldOverlayText));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.progressBar, 2048, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.chatListView, 131072, new Class[]{ChatUnreadCell.class}, new String[]{"backgroundLayout"}, null, null, null, Theme.key_chat_unreadMessagesStartBackground));
        arrayList.add(new ThemeDescription(this.chatListView, 8, new Class[]{ChatUnreadCell.class}, new String[]{"imageView"}, null, null, null, Theme.key_chat_unreadMessagesStartArrowIcon));
        arrayList.add(new ThemeDescription(this.chatListView, 4, new Class[]{ChatUnreadCell.class}, new String[]{"textView"}, null, null, null, Theme.key_chat_unreadMessagesStartText));
        arrayList.add(new ThemeDescription(this.progressView2, 536870912, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.emptyView, 536870912, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.undoView, 32, null, null, null, null, Theme.key_undo_background));
        int i12 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i12));
        int i13 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.undoView, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i13));
        return arrayList;
    }

    public boolean isKeyboardVisible() {
        return this.contentView.getKeyboardHeight() > AndroidUtilities.dp(20.0f);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        loadMessages(true);
        loadAdmins();
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.dp(51.0f);
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        });
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        this.notificationsLocker.unlock();
    }

    @Override
    public void onPause() {
        super.onPause();
        ChatActivityFragmentView chatActivityFragmentView = this.contentView;
        if (chatActivityFragmentView != null) {
            chatActivityFragmentView.onPause();
        }
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.paused = true;
        this.wasPaused = true;
        if (AvatarPreviewer.hasVisibleInstance()) {
            AvatarPreviewer.getInstance().close();
        }
    }

    @Override
    public void onRemoveFromParent() {
        MediaController.getInstance().setTextureView(this.videoTextureView, null, null, false);
        super.onRemoveFromParent();
    }

    @Override
    public void onResume() {
        super.onResume();
        this.activityResumeTime = System.currentTimeMillis();
        ChatActivityFragmentView chatActivityFragmentView = this.contentView;
        if (chatActivityFragmentView != null) {
            chatActivityFragmentView.onResume();
        }
        this.paused = false;
        checkScrollForLoad(false);
        if (this.wasPaused) {
            this.wasPaused = false;
            ChatActivityAdapter chatActivityAdapter = this.chatAdapter;
            if (chatActivityAdapter != null) {
                chatActivityAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.notificationsLocker.unlock();
            this.openAnimationEnded = true;
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        if (z) {
            this.notificationsLocker.lock();
            this.openAnimationEnded = false;
        }
    }

    public void openVCard(TLRPC.User user, String str, String str2, String str3) {
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            File file = new File(sharingDirectory, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            try {
                showDialog(new PhonebookShareAlert(this, null, user, null, file, str2, str3));
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void lambda$processSelectedOption$20() {
        if (this.reloadingLastMessages) {
            return;
        }
        this.reloadingLastMessages = true;
        TLRPC.TL_channels_getAdminLog tL_channels_getAdminLog = new TLRPC.TL_channels_getAdminLog();
        tL_channels_getAdminLog.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_getAdminLog.q = this.searchQuery;
        tL_channels_getAdminLog.limit = 10;
        tL_channels_getAdminLog.max_id = 0L;
        tL_channels_getAdminLog.min_id = 0L;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.currentFilter;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channels_getAdminLog.flags = 1 | tL_channels_getAdminLog.flags;
            tL_channels_getAdminLog.events_filter = tL_channelAdminLogEventsFilter;
        }
        if (this.selectedAdmins != null) {
            tL_channels_getAdminLog.flags |= 2;
            for (int i = 0; i < this.selectedAdmins.size(); i++) {
                tL_channels_getAdminLog.admins.add(MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) this.selectedAdmins.valueAt(i)));
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminLog, new ChannelAdminLogActivity$$ExternalSyntheticLambda6(this, 1));
    }

    public void saveScrollPosition(boolean z) {
        ChatListRecyclerView chatListRecyclerView = this.chatListView;
        if (chatListRecyclerView == null || this.chatLayoutManager == null || chatListRecyclerView.getChildCount() <= 0) {
            return;
        }
        int top = z ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        View view = null;
        int i = -1;
        for (int i2 = 0; i2 < this.chatListView.getChildCount(); i2++) {
            View childAt = this.chatListView.getChildAt(i2);
            int childAdapterPosition = this.chatListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0) {
                if (z) {
                    if (childAt.getTop() < top) {
                        top = childAt.getTop();
                        view = childAt;
                        i = childAdapterPosition;
                    }
                } else if (childAt.getTop() > top) {
                    top = childAt.getTop();
                    view = childAt;
                    i = childAdapterPosition;
                }
            }
        }
        if (view != null) {
            this.savedScrollEventId = view instanceof ChatMessageCell ? ((ChatMessageCell) view).getMessageObject().eventId : view instanceof ChatActionCell ? ((ChatActionCell) view).getMessageObject().eventId : 0L;
            this.savedScrollPosition = i;
            this.savedScrollOffset = getScrollingOffsetForView(view);
        }
    }

    public void scrollToMessage(MessageObject messageObject, boolean z) {
        int i;
        int i2;
        int iIndexOf;
        MessageObject messageObject2;
        this.wasManualScroll = true;
        if (this.filteredMessages.size() <= 0) {
            i = -1;
            i2 = 0;
            break;
        }
        int iFindLastVisibleItemPosition = this.chatLayoutManager.findLastVisibleItemPosition();
        int iFindFirstVisibleItemPosition = this.chatLayoutManager.findFirstVisibleItemPosition();
        while (true) {
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                i = -1;
                i2 = 0;
                break;
            }
            if (iFindFirstVisibleItemPosition >= this.chatAdapter.messagesStartRow && iFindFirstVisibleItemPosition < this.chatAdapter.messagesEndRow) {
                MessageObject messageObject3 = this.filteredMessages.get(iFindFirstVisibleItemPosition - this.chatAdapter.messagesStartRow);
                if (messageObject3.contentType != 1 && messageObject3.getRealId() != 0 && !messageObject3.isSponsored()) {
                    i2 = iFindFirstVisibleItemPosition - this.chatAdapter.messagesStartRow;
                    i = (messageObject3.getRealId() < messageObject.getRealId() ? 1 : 0) ^ 1;
                    break;
                }
            }
            iFindFirstVisibleItemPosition++;
        }
        this.chatScrollHelper.setScrollDirection(i);
        if (messageObject == null || (iIndexOf = this.filteredMessages.indexOf(messageObject)) == -1) {
            return;
        }
        if (i2 > 0) {
            i = i2 > iIndexOf ? 0 : 1;
            this.chatScrollHelper.setScrollDirection(i);
        }
        removeSelectedMessageHighlight();
        if (z) {
            this.highlightMessageId = messageObject.getRealId();
        }
        int iIndexOf2 = this.filteredMessages.indexOf(messageObject) + this.chatAdapter.messagesStartRow;
        updateVisibleRows();
        int childCount = this.chatListView.getChildCount();
        boolean z2 = false;
        int iScrollOffsetForQuote = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.chatListView.getChildAt(i3);
            if (childAt instanceof ChatMessageCell) {
                MessageObject messageObject4 = ((ChatMessageCell) childAt).getMessageObject();
                if (messageObject4 != null && messageObject4.getRealId() == messageObject.getRealId()) {
                    childAt.sendAccessibilityEvent(8);
                    iScrollOffsetForQuote = scrollOffsetForQuote(messageObject4);
                    z2 = true;
                }
            } else if ((childAt instanceof ChatActionCell) && (messageObject2 = ((ChatActionCell) childAt).getMessageObject()) != null && messageObject2.getRealId() == messageObject.getRealId()) {
                childAt.sendAccessibilityEvent(8);
                z2 = true;
            }
            if (z2) {
                int top = childAt.getTop() - (getScrollOffsetForMessage(childAt.getHeight()) - iScrollOffsetForQuote);
                int iComputeVerticalScrollRange = (this.chatListView.computeVerticalScrollRange() - this.chatListView.computeVerticalScrollOffset()) - this.chatListView.computeVerticalScrollExtent();
                if (iComputeVerticalScrollRange < 0) {
                    iComputeVerticalScrollRange = 0;
                }
                if (top > iComputeVerticalScrollRange) {
                    top = iComputeVerticalScrollRange;
                }
                if (top == 0) {
                    break;
                }
                this.chatListView.smoothScrollBy(0, top);
                this.chatListView.setOverScrollMode(2);
                break;
            }
        }
        if (z2) {
            return;
        }
        int scrollOffsetForMessage = getScrollOffsetForMessage(messageObject);
        this.chatScrollHelperCallback.scrollTo = messageObject;
        this.chatScrollHelperCallback.lastBottom = false;
        this.chatScrollHelperCallback.lastItemOffset = scrollOffsetForMessage;
        this.chatScrollHelper.setScrollDirection(i);
        this.chatScrollHelper.scrollToPosition(this.chatScrollHelperCallback.position = iIndexOf2, this.chatScrollHelperCallback.offset = scrollOffsetForMessage, this.chatScrollHelperCallback.bottom = false, true);
    }

    public void showNoQuoteFound() {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.QuoteNotFound)).show(true);
    }

    public void showOpenUrlAlert(String str, boolean z) {
        if (Browser.isInternalUri(Uri.parse(str), false, null) || !z) {
            Browser.openUrl(getParentActivity(), str, true);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.OpenUrlTitle));
        builder.setMessage(LocaleController.formatString(R.string.OpenUrlAlert2, str));
        builder.setPositiveButton(LocaleController.getString(R.string.Open), new WearAuthSheet$$ExternalSyntheticLambda3(22, this, str));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public boolean createMenu(final View view, final float f, final float f2) {
        MessageObject messageObject;
        MessageObject messageObject2;
        int messageType;
        ArrayList arrayList;
        final ArrayList arrayList2;
        final ArrayList arrayList3;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent;
        MessageObject messageObject3;
        ArrayList arrayList4;
        TLRPC.User user;
        TLRPC.MessageMedia messageMedia;
        Runnable runnable;
        final ArrayList arrayList5;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction;
        TLRPC.Message message;
        TLRPC.User user2;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent3;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction2;
        TLRPC.TL_channelAdminLogEventActionChangeStickerSet tL_channelAdminLogEventActionChangeStickerSet;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent4;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction3;
        TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite;
        if (!(view instanceof ChatMessageCell)) {
            if (view instanceof ChatActionCell) {
                messageObject2 = ((ChatActionCell) view).getMessageObject();
            } else {
                messageObject = null;
            }
            if (messageObject != null) {
                messageType = getMessageType(messageObject);
                this.selectedObject = messageObject;
                if (getParentActivity() != null) {
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    if (this.currentChat != null && (tL_channelAdminLogEvent4 = messageObject.currentEvent) != null) {
                        channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                        if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                            tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction3;
                            if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                                TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.currentChat.id);
                                Context context = getContext();
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = tL_channelAdminLogEventActionParticipantJoinByInvite.invite;
                                TLRPC.Chat chat = this.currentChat;
                                InviteLinkBottomSheet inviteLinkBottomSheet = new InviteLinkBottomSheet(context, tL_chatInviteExported, chatFull, null, this, chat.id, false, ChatObject.isChannelAndNotMegaGroup(chat));
                                inviteLinkBottomSheet.setCanEdit(false);
                                inviteLinkBottomSheet.show();
                                return true;
                            }
                        }
                    }
                    tL_channelAdminLogEvent = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent != null && (((tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) && tL_channelAdminLogEvent.user_id == getMessagesController().telegramAntispamUserId) || (messageObject.currentEvent.action instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam))) {
                        if (view instanceof ChatActionCell) {
                            SpannableString spannableString = new SpannableString(">");
                            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_undo_cancelColor), PorterDuff.Mode.MULTIPLY));
                            drawableMutate.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(new ImageSpan(drawableMutate, 2), 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                            spannableStringBuilder.setSpan(new ClickableSpan() {
                                @Override
                                public void onClick(View view2) {
                                    ChannelAdminLogActivity.this.finishFragment();
                                }

                                @Override
                                public void updateDrawState(TextPaint textPaint) {
                                    super.updateDrawState(textPaint);
                                    textPaint.setUnderlineText(false);
                                }
                            }, 0, spannableStringBuilder.length(), 33);
                            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.msg_antispam, LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder));
                            bulletinCreateSimpleBulletin.setDuration(5000);
                            bulletinCreateSimpleBulletin.show();
                            return true;
                        }
                        arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_notspam, arrayList3, 34, arrayList2);
                        arrayList.add(null);
                        arrayList3.add(null);
                        arrayList2.add(null);
                    }
                    messageObject3 = this.selectedObject;
                    if (messageObject3.type != 0 || messageObject3.caption != null) {
                        arrayList.add(LocaleController.getString(R.string.Copy));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_copy, arrayList3, 3, arrayList2);
                    }
                    if (messageType == 1) {
                        tL_channelAdminLogEvent3 = this.selectedObject.currentEvent;
                        if (tL_channelAdminLogEvent3 != null) {
                            channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                            if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                                if (inputStickerSet != null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                                }
                                if (inputStickerSet != null) {
                                    showDialog(new StickersAlert(getParentActivity(), this, inputStickerSet, null, null, false));
                                    return true;
                                }
                                arrayList4 = arrayList;
                            } else {
                                arrayList4 = arrayList;
                                if (tL_channelAdminLogEvent3 == null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet)) {
                                    GroupStickersActivity groupStickersActivity = new GroupStickersActivity(this.currentChat.id, true);
                                    TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(this.currentChat.id);
                                    if (chatFull2 != null) {
                                        groupStickersActivity.setInfo(chatFull2);
                                        presentFragment(groupStickersActivity);
                                    }
                                } else if (tL_channelAdminLogEvent3 != null && (tL_channelAdminLogEvent3.action instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) && ChatObject.canUserDoAdminAction(this.currentChat, 13)) {
                                    ClearHistoryAlert clearHistoryAlert = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                                    clearHistoryAlert.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                        @Override
                                        public void onAutoDeleteHistory(int i, int i2) {
                                            ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                            TLRPC.ChatFull chatFull3 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                            if (chatFull3 != null) {
                                                ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull3.ttl_period), (Runnable) null, (Runnable) null);
                                            }
                                        }

                                        @Override
                                        public final void onClearHistory(boolean z) {
                                            ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                        }
                                    });
                                    showDialog(clearHistoryAlert);
                                }
                            }
                        } else {
                            arrayList4 = arrayList;
                            if (tL_channelAdminLogEvent3 == null) {
                                if (tL_channelAdminLogEvent3 != null) {
                                    ClearHistoryAlert clearHistoryAlert2 = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                                    clearHistoryAlert2.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                        @Override
                                        public void onAutoDeleteHistory(int i, int i2) {
                                            ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                            TLRPC.ChatFull chatFull3 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                            if (chatFull3 != null) {
                                                ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull3.ttl_period), (Runnable) null, (Runnable) null);
                                            }
                                        }

                                        @Override
                                        public final void onClearHistory(boolean z) {
                                            ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                        }
                                    });
                                    showDialog(clearHistoryAlert2);
                                }
                            } else if (tL_channelAdminLogEvent3 != null) {
                                ClearHistoryAlert clearHistoryAlert3 = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                                clearHistoryAlert3.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                    @Override
                                    public void onAutoDeleteHistory(int i, int i2) {
                                        ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                        TLRPC.ChatFull chatFull3 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                        if (chatFull3 != null) {
                                            ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull3.ttl_period), (Runnable) null, (Runnable) null);
                                        }
                                    }

                                    @Override
                                    public final void onClearHistory(boolean z) {
                                        ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                    }
                                });
                                showDialog(clearHistoryAlert3);
                            }
                        }
                    } else {
                        arrayList4 = arrayList;
                        if (messageType == 3) {
                            messageMedia = this.selectedObject.messageOwner.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.isNewGifDocument(messageMedia.webpage.document)) {
                                arrayList4.add(LocaleController.getString(R.string.SaveToGIFs));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gif, arrayList3, 11, arrayList2);
                            }
                        } else if (messageType == 4) {
                            if (this.selectedObject.isVideo()) {
                                arrayList4.add(LocaleController.getString(R.string.SaveToGallery));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gallery, arrayList3, 4, arrayList2);
                                arrayList4.add(LocaleController.getString(R.string.ShareFile));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                            } else if (this.selectedObject.isMusic()) {
                                arrayList4.add(LocaleController.getString(R.string.SaveToMusic));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                                arrayList4.add(LocaleController.getString(R.string.ShareFile));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                            } else if (this.selectedObject.getDocument() != null) {
                                if (MessageObject.isNewGifDocument(this.selectedObject.getDocument())) {
                                    arrayList4.add(LocaleController.getString(R.string.SaveToGIFs));
                                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gif, arrayList3, 11, arrayList2);
                                }
                                arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                                arrayList4.add(LocaleController.getString(R.string.ShareFile));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                            } else {
                                arrayList4.add(LocaleController.getString(R.string.SaveToGallery));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gallery, arrayList3, 4, arrayList2);
                            }
                        } else if (messageType == 5) {
                            arrayList4.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_language, arrayList3, 5, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.ShareFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                        } else if (messageType == 10) {
                            arrayList4.add(LocaleController.getString(R.string.ApplyThemeFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_theme, arrayList3, 5, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.ShareFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                        } else if (messageType == 6) {
                            arrayList4.add(LocaleController.getString(R.string.SaveToGallery));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gallery, arrayList3, 7, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.ShareFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                        } else if (messageType == 7) {
                            if (this.selectedObject.isMask()) {
                                arrayList4.add(LocaleController.getString(R.string.AddToMasks));
                            } else {
                                arrayList4.add(LocaleController.getString(R.string.AddToStickers));
                            }
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_sticker, arrayList3, 9, arrayList2);
                        } else if (messageType == 8) {
                            long j = this.selectedObject.messageOwner.media.user_id;
                            user = j != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)) : null;
                            if (user != null && user.id != UserConfig.getInstance(this.currentAccount).getClientUserId() && ContactsController.getInstance(this.currentAccount).contactsDict.get(Long.valueOf(user.id)) == null) {
                                arrayList4.add(LocaleController.getString(R.string.AddContactTitle));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_addcontact, arrayList3, 15, arrayList2);
                            }
                            if (!TextUtils.isEmpty(this.selectedObject.messageOwner.media.phone_number)) {
                                arrayList4.add(LocaleController.getString(R.string.Copy));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_copy, arrayList3, 16, arrayList2);
                                arrayList4.add(LocaleController.getString(R.string.Call));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_calls, arrayList3, 17, arrayList2);
                            }
                        }
                    }
                    arrayList5 = arrayList4;
                    runnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$createMenu$14(arrayList2, arrayList5, arrayList3, view, f, f2);
                        }
                    };
                    if (ChatObject.canBlockUsers(this.currentChat) && (tL_channelAdminLogEvent2 = messageObject.currentEvent) != null) {
                        channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                        if (((channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) || (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest)) && (message = messageObject.messageOwner) != null && message.from_id != null && (user2 = getMessagesController().getUser(Long.valueOf(this.selectedObject.messageOwner.from_id.user_id))) != null && !UserObject.isUserSelf(user2)) {
                            getMessagesController().getChannelParticipant(this.currentChat, user2, new ChatActivity$$ExternalSyntheticLambda129(this, arrayList5, arrayList3, arrayList2, runnable, 1));
                            return true;
                        }
                    }
                    runnable.run();
                    return true;
                }
            }
            return false;
        }
        messageObject2 = ((ChatMessageCell) view).getMessageObject();
        messageObject = messageObject2;
        if (messageObject != null) {
            messageType = getMessageType(messageObject);
            this.selectedObject = messageObject;
            if (getParentActivity() != null) {
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                if (this.currentChat != null) {
                    channelAdminLogEventAction3 = tL_channelAdminLogEvent4.action;
                    if (channelAdminLogEventAction3 instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                        tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction3;
                        if (tL_channelAdminLogEventActionParticipantJoinByInvite.invite != null) {
                            TLRPC.ChatFull chatFull3 = getMessagesController().getChatFull(this.currentChat.id);
                            Context context2 = getContext();
                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_channelAdminLogEventActionParticipantJoinByInvite.invite;
                            TLRPC.Chat chat2 = this.currentChat;
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = new InviteLinkBottomSheet(context2, tL_chatInviteExported2, chatFull3, null, this, chat2.id, false, ChatObject.isChannelAndNotMegaGroup(chat2));
                            inviteLinkBottomSheet2.setCanEdit(false);
                            inviteLinkBottomSheet2.show();
                            return true;
                        }
                    }
                }
                tL_channelAdminLogEvent = messageObject.currentEvent;
                if (tL_channelAdminLogEvent != null) {
                    if (view instanceof ChatActionCell) {
                        SpannableString spannableString2 = new SpannableString(">");
                        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_undo_cancelColor), PorterDuff.Mode.MULTIPLY));
                        drawableMutate2.setBounds(0, 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
                        spannableString2.setSpan(new ImageSpan(drawableMutate2, 2), 0, spannableString2.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.EventLogFilterGroupInfo)).append((CharSequence) "\u2009").append((CharSequence) spannableString2).append((CharSequence) "\u2009").append((CharSequence) LocaleController.getString(R.string.ChannelAdministrators));
                        spannableStringBuilder2.setSpan(new ClickableSpan() {
                            @Override
                            public void onClick(View view2) {
                                ChannelAdminLogActivity.this.finishFragment();
                            }

                            @Override
                            public void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setUnderlineText(false);
                            }
                        }, 0, spannableStringBuilder2.length(), 33);
                        Bulletin bulletinCreateSimpleBulletin2 = BulletinFactory.of(this).createSimpleBulletin(R.raw.msg_antispam, LocaleController.getString(R.string.ChannelAntiSpamUser), AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.ChannelAntiSpamInfo2), spannableStringBuilder2));
                        bulletinCreateSimpleBulletin2.setDuration(5000);
                        bulletinCreateSimpleBulletin2.show();
                        return true;
                    }
                    arrayList.add(LocaleController.getString(R.string.ReportFalsePositive));
                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_notspam, arrayList3, 34, arrayList2);
                    arrayList.add(null);
                    arrayList3.add(null);
                    arrayList2.add(null);
                }
                messageObject3 = this.selectedObject;
                if (messageObject3.type != 0) {
                    arrayList.add(LocaleController.getString(R.string.Copy));
                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_copy, arrayList3, 3, arrayList2);
                } else {
                    arrayList.add(LocaleController.getString(R.string.Copy));
                    ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_copy, arrayList3, 3, arrayList2);
                }
                if (messageType == 1) {
                    tL_channelAdminLogEvent3 = this.selectedObject.currentEvent;
                    if (tL_channelAdminLogEvent3 != null) {
                        channelAdminLogEventAction2 = tL_channelAdminLogEvent3.action;
                        if (channelAdminLogEventAction2 instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                            tL_channelAdminLogEventActionChangeStickerSet = (TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction2;
                            inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.new_stickerset;
                            if (inputStickerSet != null) {
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                            } else {
                                inputStickerSet = tL_channelAdminLogEventActionChangeStickerSet.prev_stickerset;
                            }
                            if (inputStickerSet != null) {
                                showDialog(new StickersAlert(getParentActivity(), this, inputStickerSet, null, null, false));
                                return true;
                            }
                            arrayList4 = arrayList;
                        } else {
                            arrayList4 = arrayList;
                            if (tL_channelAdminLogEvent3 == null) {
                                if (tL_channelAdminLogEvent3 != null) {
                                    ClearHistoryAlert clearHistoryAlert4 = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                                    clearHistoryAlert4.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                        @Override
                                        public void onAutoDeleteHistory(int i, int i2) {
                                            ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                            TLRPC.ChatFull chatFull4 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                            if (chatFull4 != null) {
                                                ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull4.ttl_period), (Runnable) null, (Runnable) null);
                                            }
                                        }

                                        @Override
                                        public final void onClearHistory(boolean z) {
                                            ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                        }
                                    });
                                    showDialog(clearHistoryAlert4);
                                }
                            } else if (tL_channelAdminLogEvent3 != null) {
                                ClearHistoryAlert clearHistoryAlert5 = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                                clearHistoryAlert5.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                    @Override
                                    public void onAutoDeleteHistory(int i, int i2) {
                                        ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                        TLRPC.ChatFull chatFull4 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                        if (chatFull4 != null) {
                                            ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull4.ttl_period), (Runnable) null, (Runnable) null);
                                        }
                                    }

                                    @Override
                                    public final void onClearHistory(boolean z) {
                                        ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                    }
                                });
                                showDialog(clearHistoryAlert5);
                            }
                        }
                    } else {
                        arrayList4 = arrayList;
                        if (tL_channelAdminLogEvent3 == null) {
                            if (tL_channelAdminLogEvent3 != null) {
                                ClearHistoryAlert clearHistoryAlert6 = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                                clearHistoryAlert6.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                    @Override
                                    public void onAutoDeleteHistory(int i, int i2) {
                                        ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                        TLRPC.ChatFull chatFull4 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                        if (chatFull4 != null) {
                                            ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull4.ttl_period), (Runnable) null, (Runnable) null);
                                        }
                                    }

                                    @Override
                                    public final void onClearHistory(boolean z) {
                                        ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                    }
                                });
                                showDialog(clearHistoryAlert6);
                            }
                        } else if (tL_channelAdminLogEvent3 != null) {
                            ClearHistoryAlert clearHistoryAlert7 = new ClearHistoryAlert(getParentActivity(), null, this.currentChat, false, null);
                            clearHistoryAlert7.setDelegate(new ClearHistoryAlert.ClearHistoryAlertDelegate() {
                                @Override
                                public void onAutoDeleteHistory(int i, int i2) {
                                    ChannelAdminLogActivity.this.getMessagesController().setDialogHistoryTTL(-ChannelAdminLogActivity.this.currentChat.id, i);
                                    TLRPC.ChatFull chatFull4 = ChannelAdminLogActivity.this.getMessagesController().getChatFull(ChannelAdminLogActivity.this.currentChat.id);
                                    if (chatFull4 != null) {
                                        ChannelAdminLogActivity.this.undoView.showWithAction(-ChannelAdminLogActivity.this.currentChat.id, i2, (Object) null, Integer.valueOf(chatFull4.ttl_period), (Runnable) null, (Runnable) null);
                                    }
                                }

                                @Override
                                public final void onClearHistory(boolean z) {
                                    ClearHistoryAlert.ClearHistoryAlertDelegate.CC.$default$onClearHistory(this, z);
                                }
                            });
                            showDialog(clearHistoryAlert7);
                        }
                    }
                } else {
                    arrayList4 = arrayList;
                    if (messageType == 3) {
                        messageMedia = this.selectedObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            arrayList4.add(LocaleController.getString(R.string.SaveToGIFs));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gif, arrayList3, 11, arrayList2);
                        }
                    } else if (messageType == 4) {
                        if (this.selectedObject.isVideo()) {
                            arrayList4.add(LocaleController.getString(R.string.SaveToGallery));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gallery, arrayList3, 4, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.ShareFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                        } else if (this.selectedObject.isMusic()) {
                            arrayList4.add(LocaleController.getString(R.string.SaveToMusic));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.ShareFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                        } else if (this.selectedObject.getDocument() != null) {
                            if (MessageObject.isNewGifDocument(this.selectedObject.getDocument())) {
                                arrayList4.add(LocaleController.getString(R.string.SaveToGIFs));
                                ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gif, arrayList3, 11, arrayList2);
                            }
                            arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.ShareFile));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                        } else {
                            arrayList4.add(LocaleController.getString(R.string.SaveToGallery));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gallery, arrayList3, 4, arrayList2);
                        }
                    } else if (messageType == 5) {
                        arrayList4.add(LocaleController.getString(R.string.ApplyLocalizationFile));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_language, arrayList3, 5, arrayList2);
                        arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                        arrayList4.add(LocaleController.getString(R.string.ShareFile));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                    } else if (messageType == 10) {
                        arrayList4.add(LocaleController.getString(R.string.ApplyThemeFile));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_theme, arrayList3, 5, arrayList2);
                        arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                        arrayList4.add(LocaleController.getString(R.string.ShareFile));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                    } else if (messageType == 6) {
                        arrayList4.add(LocaleController.getString(R.string.SaveToGallery));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_gallery, arrayList3, 7, arrayList2);
                        arrayList4.add(LocaleController.getString(R.string.SaveToDownloads));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_download, arrayList3, 10, arrayList2);
                        arrayList4.add(LocaleController.getString(R.string.ShareFile));
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_share, arrayList3, 6, arrayList2);
                    } else if (messageType == 7) {
                        if (this.selectedObject.isMask()) {
                            arrayList4.add(LocaleController.getString(R.string.AddToMasks));
                        } else {
                            arrayList4.add(LocaleController.getString(R.string.AddToStickers));
                        }
                        ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_sticker, arrayList3, 9, arrayList2);
                    } else if (messageType == 8) {
                        long j2 = this.selectedObject.messageOwner.media.user_id;
                        if (j2 != 0) {
                        }
                        if (user != null) {
                            arrayList4.add(LocaleController.getString(R.string.AddContactTitle));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_addcontact, arrayList3, 15, arrayList2);
                        }
                        if (!TextUtils.isEmpty(this.selectedObject.messageOwner.media.phone_number)) {
                            arrayList4.add(LocaleController.getString(R.string.Copy));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_copy, arrayList3, 16, arrayList2);
                            arrayList4.add(LocaleController.getString(R.string.Call));
                            ChannelAdminLogActivity$$ExternalSyntheticOutline0.m(R.drawable.msg_calls, arrayList3, 17, arrayList2);
                        }
                    }
                }
                arrayList5 = arrayList4;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createMenu$14(arrayList2, arrayList5, arrayList3, view, f, f2);
                    }
                };
                if (ChatObject.canBlockUsers(this.currentChat)) {
                    channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        getMessagesController().getChannelParticipant(this.currentChat, user2, new ChatActivity$$ExternalSyntheticLambda129(this, arrayList5, arrayList3, arrayList2, runnable, 1));
                        return true;
                    }
                    getMessagesController().getChannelParticipant(this.currentChat, user2, new ChatActivity$$ExternalSyntheticLambda129(this, arrayList5, arrayList3, arrayList2, runnable, 1));
                    return true;
                }
                runnable.run();
                return true;
            }
        }
        return false;
    }

    private int getScrollOffsetForMessage(int i) {
        return Math.max(-AndroidUtilities.dp(2.0f), (this.chatListView.getMeasuredHeight() - i) / 2);
    }

    private void updateVisibleRows(boolean z) {
        String str;
        ChatListRecyclerView chatListRecyclerView = this.chatListView;
        if (chatListRecyclerView == null) {
            return;
        }
        int childCount = chatListRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                MessageObject messageObject = chatMessageCell.getMessageObject();
                if (messageObject != null) {
                    if (this.actionBar.isActionModeShowed()) {
                        this.highlightMessageQuoteFirst = false;
                        this.highlightMessageQuote = null;
                    } else {
                        chatMessageCell.setDrawSelectionBackground(false);
                        chatMessageCell.setCheckBoxVisible(false, true);
                        chatMessageCell.setChecked(false, false, true);
                    }
                    chatMessageCell.setHighlighted(this.highlightMessageId != Integer.MAX_VALUE && messageObject.getRealId() == this.highlightMessageId);
                    if (this.highlightMessageId != Integer.MAX_VALUE) {
                        startMessageUnselect();
                    }
                    if (chatMessageCell.isHighlighted() && (str = this.highlightMessageQuote) != null) {
                        if (!chatMessageCell.setHighlightedText(str, true, this.highlightMessageQuoteOffset, this.highlightMessageQuoteFirst) && this.showNoQuoteAlert) {
                            showNoQuoteFound();
                        }
                        this.highlightMessageQuoteFirst = false;
                        this.showNoQuoteAlert = false;
                    } else if (TextUtils.isEmpty(this.searchQuery)) {
                        chatMessageCell.setHighlightedText(null);
                    } else {
                        chatMessageCell.setHighlightedText(this.searchQuery);
                    }
                    chatMessageCell.setSpoilersSuppressed(this.chatListView.getScrollState() != 0);
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                if (!z) {
                    chatActionCell.setMessageObject(chatActionCell.getMessageObject());
                }
                chatActionCell.setSpoilersSuppressed(this.chatListView.getScrollState() != 0);
            }
        }
    }
}
