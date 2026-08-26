package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.cast.internal.zzr;
import com.google.android.gms.cast.zzbp;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.stripe.android.Stripe;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Charts.ChartPickerDelegate$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda189;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda26;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.chat.SendButtonBlockedByTypingView;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Components.inset.WindowInsetsInAppController;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GLIconSettingsView;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.GroupCallActivity$$ExternalSyntheticLambda88;
import org.telegram.ui.GroupStickersActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkEditActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.MessageSendPreview$15$$ExternalSyntheticLambda0;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda106;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.bots.BotCommandsMenuContainer;
import org.telegram.ui.bots.BotCommandsMenuView;
import org.telegram.ui.bots.BotKeyboardView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatActivityBotWebViewButton;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichHtml;
import org.telegram.ui.iv.RichMessageConvert;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class ChatActivityEnterView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, StickersAlert.StickersAlertDelegate, SuggestEmojiView.AnchorViewDelegate, FactorAnimator.Target, Theme.Colorable {
    public static final int $r8$clinit = 0;
    public final AnonymousClass10 ATTACH_LAYOUT_ALPHA;
    public final AnonymousClass10 ATTACH_LAYOUT_TRANSLATION_X;
    public final AnonymousClass10 EMOJI_BUTTON_ALPHA;
    public final AnonymousClass10 EMOJI_BUTTON_SCALE;
    public final AnonymousClass10 MESSAGE_TEXT_TRANSLATION_X;
    public AccountInstance accountInstance;
    public ActionBarMenuSubItem actionScheduleButton;
    public AdjustPanLayoutHelper adjustPanLayoutHelper;
    public final ImageView aiButton;
    public final AiButtonDrawable aiButtonIcon;
    public HintView2 aiHint;
    public boolean allowAnimatedEmoji;
    public boolean allowBlur;
    public boolean allowGifs;
    public boolean allowShowTopView;
    public boolean allowStickers;
    public int animatedTop;
    public int animatingContentType;
    public Runnable animationEndRunnable;
    public final HashMap animationParamsX;
    public final BoolAnimator animatorEphemeralMessageVisibility;
    public final FactorAnimator animatorInputFieldHeight;
    public final BoolAnimator animatorIsBlockedByStreaming;
    public final BoolAnimator animatorTopViewVisibility;
    public final VoIPFragment.AnonymousClass9 attachButton;
    public float attachButtonAlpha;
    public ViewPropertyAnimator attachButtonAnimator;
    public final GLIconSettingsView attachLayout;
    public float attachLayoutAlpha;
    public float attachLayoutPaddingAlpha;
    public float attachLayoutPaddingTranslationX;
    public float attachLayoutTranslationX;
    public RecordedAudioPlayerView audioTimelineView;
    public TLRPC.TL_document audioToSend;
    public MessageObject audioToSendMessageObject;
    public String audioToSendPath;
    public final AnonymousClass24 audioVideoButtonContainer;
    public boolean audioVideoButtonContainerForbidden;
    public final AnonymousClass25 audioVideoSendButton;
    public final Paint backgroundPaint;
    public HintView2 birthdayHint;
    public final Rect blurBounds;
    public AnonymousClass32 botButton;
    public ReplaceableIconDrawable botButtonDrawable;
    public MessageObject botButtonsMessageObject;
    public int botCommandLastPosition;
    public int botCommandLastTop;
    public BotCommandsMenuView.BotCommandsAdapter botCommandsAdapter;
    public BotCommandsMenuView botCommandsMenuButton;
    public AnonymousClass47 botCommandsMenuContainer;
    public int botCount;
    public AnonymousClass75 botKeyboardView;
    public boolean botKeyboardViewVisible;
    public int botMenuButtonType;
    public String botMenuWebViewTitle;
    public String botMenuWebViewUrl;
    public MessageObject botMessageObject;
    public TLRPC.TL_replyKeyboardMarkup botReplyMarkup;
    public ChatActivityBotWebViewButton botWebViewButton;
    public final AnimatedFloat bottomGradientAlpha;
    public boolean calledRecordRunnable;
    public Drawable cameraDrawable;
    public Drawable cameraOutline;
    public boolean canWriteToChannel;
    public final ImageView cancelBotButton;
    public boolean canceledByGesture;
    public boolean captionAbove;
    public boolean captionLimitBulletinShown;
    public NumberTextView captionLimitView;
    public boolean clearBotButtonsOnKeyboardOpen;
    public final LinearGradient clipGradient;
    public final Matrix clipMatrix;
    public boolean closeAnimationInProgress;
    public int codePointCount;
    public int commonInputType;
    public float composeShadowAlpha;
    public float controlsScale;
    public ControlsView controlsView;
    public boolean ctrlPressed;
    public int currentAccount;
    public float currentIslandTotalHeight;
    public float currentIslandTotalHeightTarget;
    public int currentLimit;
    public int currentPopupContentType;
    public ChatActivityEnterViewDelegate delegate;
    public final ImageView deleteRichDraftButton;
    public boolean destroyed;
    public long dialog_id;
    public final ChatActivityEnterView$$ExternalSyntheticLambda4 dismissSendPreview;
    public boolean dismissSendPreviewSent;
    public float distCanMove;
    public RichEditor.AnonymousClass9 doneButton;
    public boolean doneButtonEnabled;
    public final Paint dotPaint;
    public Editable draftMessage;
    public boolean draftSearchWebpage;
    public TL_account.TL_businessChatLink editingBusinessLink;
    public boolean editingCaption;
    public MessageObject editingMessageObject;
    public long effectId;
    public final AnonymousClass17 emojiButton;
    public float emojiButtonAlpha;
    public float emojiButtonPaddingAlpha;
    public float emojiButtonPaddingScale;
    public boolean emojiButtonRestricted;
    public float emojiButtonScale;
    public int emojiPadding;
    public boolean emojiTabOpen;
    public AnonymousClass78 emojiView;
    public boolean emojiViewFrozen;
    public boolean emojiViewVisible;
    public float exitTransition;
    public AnonymousClass34 expandStickersButton;
    public ChatActivityEnterView$$ExternalSyntheticLambda4 focusRunnable;
    public boolean forceShowSendButton;
    public AnonymousClass30 giftButton;
    public final Paint gradientPaint;
    public boolean hasBotCommands;
    public boolean hasRecordVideo;
    public ChatActivityEnterView$$ExternalSyntheticLambda4 hideKeyboardRunnable;
    public float horizontalPadding;
    public float idleProgress;
    public boolean ignoreTextChange;
    public TLRPC.ChatFull info;
    public int innerTextChange;
    public final boolean isChat;
    public boolean isInVideoMode;
    public boolean isInitLineCount;
    public boolean isLiveComment;
    public boolean isPaste;
    public boolean isPaused;
    public boolean isStories;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public boolean keyboardVisible;
    public int lastAttachVisible;
    public LongSparseArray lastBotInfo;
    public int lastRecordState;
    public BusinessLinkPresetMessage lastSavedBusinessLinkMessage;
    public int lastSizeChangeValue1;
    public boolean lastSizeChangeValue2;
    public long lastTypingTimeSend;
    public int lineCount;
    public final int[] location;
    public float lockAnimatedTranslation;
    public Drawable lockShadowDrawable;
    public View mCustomWindowView;
    public AuctionBidSheet.AnonymousClass4 mOverrideEditTextView;
    public AnonymousClass50 messageEditText;
    public final AnonymousClass16 messageEditTextContainer;
    public boolean messageEditTextEnabled;
    public ArrayList messageEditTextWatchers;
    public ChatAttachAlert.AnonymousClass25 messageSendPreview;
    public float messageTextPaddingTranslationX;
    public float messageTextTranslationX;
    public boolean messageTransitionIsRunning;
    public TLRPC.WebPage messageWebPage;
    public boolean messageWebPageSearch;
    public Drawable micDrawable;
    public Drawable micOutline;
    public long millisecondsRecorded;
    public Runnable moveToSendStateRunnable;
    public boolean needShowTopView;
    public final AnimationNotificationsLocker notificationsLocker;
    public final ImageView notifyButton;
    public CrossOutDrawable notifySilentDrawable;
    public ChatActivityEnterView$$ExternalSyntheticLambda4 onEmojiSearchClosed;
    public final AnonymousClass2 onFinishInitCameraRunnable;
    public ChatActivityEnterView$$ExternalSyntheticLambda4 onKeyboardClosed;
    public boolean onceVisible;
    public final AnonymousClass2 openKeyboardRunnable;
    public int originalViewHeight;
    public CharSequence overrideHint;
    public String overrideHint2;
    public boolean overrideKeyboardAnimation;
    public long paidMessagesPrice;
    public final Paint paint;
    public AnimatorSet panelAnimation;
    public final Activity parentActivity;
    public final ChatActivity parentFragment;
    public final RectF pauseRect;
    public TL_keyboard.KeyboardButtonProto pendingLocationButton;
    public MessageObject pendingMessageObject;
    public int popupX;
    public int popupY;
    public boolean preventInput;
    public final AnonymousClass26 progressDrawable;
    public final AnonymousClass8 recordAudioVideoRunnable;
    public boolean recordAudioVideoRunnableStarted;
    public RecordCircle recordCircle;
    public final PhotoViewer.AnonymousClass13 recordCircleScale;
    public final PhotoViewer.AnonymousClass13 recordControlsCircleScale;
    public RLottieImageView recordDeleteImageView;
    public RecordDot recordDot;
    public int recordInterfaceState;
    public boolean recordIsCanceled;
    public PhotoViewer.AnonymousClass19 recordPanel;
    public AnimatorSet recordPannelAnimation;
    public LinearLayout recordTimeContainer;
    public TimerView recordTimerView;
    public AnonymousClass35 recordedAudioPanel;
    public boolean recordingAudioVideo;
    public int recordingGuid;
    public final Rect rect;
    public final Paint redDotPaint;
    public boolean removeEmojiViewAfterAnimation;
    public MessageObject replyingMessageObject;
    public ChatActivity.ReplyQuote replyingQuote;
    public MessageObject replyingTopMessage;
    public boolean resizeForTopViewLastShow;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ImageView richButton;
    public boolean richDraftActive;
    public TL_iv.RichMessage richDraftMessage;
    public RichMessageLayout.PreviewView richDraftPreview;
    public final PhotoViewer.AnonymousClass13 roundedTranslationYProperty;
    public final AnonymousClass2 runEmojiPanelAnimation;
    public AnimatorSet runningAnimation;
    public AnimatorSet runningAnimation2;
    public AnimatorSet runningAnimationAudio;
    public int runningAnimationType;
    public float scale;
    public boolean scheduleButtonHidden;
    public AnonymousClass29 scheduledButton;
    public AnimatorSet scheduledButtonAnimation;
    public ValueAnimator searchAnimator;
    public float searchToOpenProgress;
    public int searchingType;
    public final AnonymousClass27 sendButton;
    public int sendButtonBackgroundColor;
    public final SendButtonBlockedByTypingView sendButtonBlockedByTypingView;
    public final AnonymousClass15 sendButtonContainer;
    public boolean sendButtonEnabled;
    public boolean sendButtonVisible;
    public final boolean sendByEnter;
    public Drawable sendDrawable;
    public final ImageView sendOutlineView;
    public boolean sendPlainEnabled;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    public AnonymousClass44 sendPopupWindow;
    public final Rect sendRect;
    public boolean sendRoundEnabled;
    public HintView2 sendSuggestHintView;
    public boolean sendVoiceEnabled;
    public ActionBarMenuSubItem sendWhenOnlineButton;
    public AnonymousClass37 senderSelectPopupWindow;
    public SenderSelectView senderSelectView;
    public long sentFromPreview;
    public ChatLinkActivity$$ExternalSyntheticLambda9 setTextFieldRunnable;
    public boolean shiftPressed;
    public boolean shouldAnimateEditTextWithBounds;
    public boolean shouldDrawBackground;
    public boolean shouldDrawRecordedAudioPanelInParent;
    public boolean showKeyboardOnResume;
    public boolean showTooltip;
    public long showTooltipStartTime;
    public ChatActivityEnterView$$ExternalSyntheticLambda4 showTopViewRunnable;
    public boolean shownAiButton;
    public boolean shownRichButton;
    public ChatActivitySideControlsButtonsLayout sideButtons;
    public boolean silent;
    public final SizeNotifierFrameLayout sizeNotifierLayout;
    public int slideDelta;
    public SlideTextView slideText;
    public float slideToCancelLockProgress;
    public float slideToCancelProgress;
    public final SlowModeBtn slowModeButton;
    public int slowModeTimer;
    public boolean smoothKeyboard;
    public float snapAnimationProgress;
    public final ColoredImageSpan[] spans;
    public float startTranslation;
    public float startedDraggingX;
    public AnimatedArrowDrawable stickersArrow;
    public boolean stickersDragging;
    public boolean stickersEnabled;
    public boolean stickersExpanded;
    public int stickersExpandedHeight;
    public AnimatorSet stickersExpansionAnim;
    public float stickersExpansionProgress;
    public boolean stickersTabOpen;
    public BotForumHelper.SteamingSendButtonState streamingState;
    public ImageView suggestButton;
    public ValueAnimator suggestButtonAppear;
    public boolean suggestButtonVisible;
    public final AnonymousClass15 textFieldContainer;
    public boolean textTransitionIsRunning;
    public float tooltipAlpha;
    public final AnimatedFloat topGradientAlpha;
    public FrameLayout topView;
    public boolean topViewShowed;
    public float transformToSeekbar;
    public AnonymousClass79.AnonymousClass2 trendingStickersAlert;
    public final zzr updateExpandabilityRunnable;
    public ChatActivityEnterView$$ExternalSyntheticLambda4 updateSlowModeRunnable;
    public TLRPC.UserFull userInfo;
    public VideoTimelineView videoTimelineView;
    public VideoEditedInfo videoToSendMessageObject;
    public ViewGroup viewParentForEmojiView;
    public boolean voiceOnce;
    public boolean waitingForKeyboardOpen;
    public boolean waitingForKeyboardOpenAfterAnimation;
    public PowerManager.WakeLock wakeLock;
    public boolean wasSendTyping;
    public WindowInsetsInAppController windowInsetsInAppController;

    public final class AnonymousClass10 extends Property {
        public final int $r8$classId;
        public final ChatActivityEnterView this$0;

        public AnonymousClass10(ChatActivityEnterView chatActivityEnterView, int i) {
            super(Float.class, "emoji_button_scale");
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.this$0 = chatActivityEnterView;
                    super(Float.class, "attach_scale");
                    break;
                case 2:
                    this.this$0 = chatActivityEnterView;
                    super(Float.class, "emoji_button_alpha");
                    break;
                case 3:
                    this.this$0 = chatActivityEnterView;
                    super(Float.class, "attach_layout_translation_x");
                    break;
                case 4:
                    this.this$0 = chatActivityEnterView;
                    super(Float.class, "message_text_translation_x");
                    break;
                default:
                    this.this$0 = chatActivityEnterView;
                    break;
            }
        }

        @Override
        public final Object get(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return Float.valueOf(this.this$0.emojiButtonScale);
                case 1:
                    return Float.valueOf(this.this$0.attachLayoutAlpha);
                case 2:
                    return Float.valueOf(this.this$0.emojiButtonAlpha);
                case 3:
                    return Float.valueOf(this.this$0.attachLayoutTranslationX);
                default:
                    return Float.valueOf(this.this$0.messageTextTranslationX);
            }
        }

        @Override
        public final void set(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    float fFloatValue = ((Float) obj2).floatValue();
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    chatActivityEnterView.emojiButtonScale = fFloatValue;
                    chatActivityEnterView.updateEmojiButtonParams();
                    break;
                case 1:
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    chatActivityEnterView2.attachLayoutAlpha = fFloatValue2;
                    chatActivityEnterView2.updateAttachLayoutParams();
                    break;
                case 2:
                    float fFloatValue3 = ((Float) obj2).floatValue();
                    ChatActivityEnterView chatActivityEnterView3 = this.this$0;
                    chatActivityEnterView3.emojiButtonAlpha = fFloatValue3;
                    chatActivityEnterView3.updateEmojiButtonParams();
                    break;
                case 3:
                    float fFloatValue4 = ((Float) obj2).floatValue();
                    ChatActivityEnterView chatActivityEnterView4 = this.this$0;
                    chatActivityEnterView4.attachLayoutTranslationX = fFloatValue4;
                    chatActivityEnterView4.updateAttachLayoutParams();
                    break;
                default:
                    float fFloatValue5 = ((Float) obj2).floatValue();
                    ChatActivityEnterView chatActivityEnterView5 = this.this$0;
                    chatActivityEnterView5.messageTextTranslationX = fFloatValue5;
                    chatActivityEnterView5.updateMessageTextParams();
                    break;
            }
        }
    }

    public final class AnonymousClass16 extends FrameLayout {
        public AnonymousClass16(Activity activity) {
            super(activity);
        }

        @Override
        public final boolean drawChild(final Canvas canvas, final View view, final long j) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (view != null && view == chatActivityEnterView.messageEditText) {
                return chatActivityEnterView.drawMessageEditText(canvas, new Utilities.Callback0Return() {
                    @Override
                    public final Object run() {
                        return this.f$0.lambda$drawChild$0(canvas, view, j);
                    }
                });
            }
            if (chatActivityEnterView.shouldDrawRecordedAudioPanelInParent && view == chatActivityEnterView.recordedAudioPanel) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public final Boolean lambda$drawChild$0(Canvas canvas, View view, long j) {
            return Boolean.valueOf(super.drawChild(canvas, view, j));
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.animationParamsX.isEmpty()) {
                return;
            }
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                Float f = (Float) chatActivityEnterView.animationParamsX.get(childAt);
                if (f != null) {
                    childAt.setTranslationX(f.floatValue() - childAt.getLeft());
                    childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
            }
            chatActivityEnterView.animationParamsX.clear();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int iMax = Math.max(AndroidUtilities.dp(44.0f), getMeasuredHeight());
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            FactorAnimator factorAnimator = chatActivityEnterView.animatorInputFieldHeight;
            if (factorAnimator.factor > 0.0f) {
                factorAnimator.animateTo(iMax);
            } else {
                factorAnimator.forceFactor(iMax);
            }
            chatActivityEnterView.checkUi_TopViewVisibility();
        }
    }

    public final class AnonymousClass2 implements Runnable {
        public final int $r8$classId;
        public final ChatActivityEnterView this$0;

        public AnonymousClass2(ChatActivityEnterView chatActivityEnterView, int i) {
            this.$r8$classId = i;
            this.this$0 = chatActivityEnterView;
        }

        @Override
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    if ((!chatActivityEnterView.hasBotWebView() || !chatActivityEnterView.botCommandsMenuIsShowing()) && !BaseFragment.hasSheets(chatActivityEnterView.parentFragment) && !chatActivityEnterView.destroyed && chatActivityEnterView.messageEditText != null && chatActivityEnterView.waitingForKeyboardOpen && !chatActivityEnterView.keyboardVisible && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                        if (chatActivityEnterViewDelegate != null) {
                            chatActivityEnterViewDelegate.onKeyboardRequested();
                        }
                        chatActivityEnterView.messageEditText.requestFocus();
                        AndroidUtilities.showKeyboard(chatActivityEnterView.messageEditText);
                        AnonymousClass2 anonymousClass2 = chatActivityEnterView.openKeyboardRunnable;
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
                        AndroidUtilities.runOnUIThread(anonymousClass2, 100L);
                    }
                    break;
                case 1:
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.this$0.delegate;
                    if (chatActivityEnterViewDelegate2 != null) {
                        chatActivityEnterViewDelegate2.needStartRecordVideo(0, 0, 0, 0L, 0L, true);
                    }
                    break;
                default:
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    AnimatorSet animatorSet = chatActivityEnterView2.panelAnimation;
                    if (animatorSet != null && !animatorSet.isRunning()) {
                        chatActivityEnterView2.panelAnimation.start();
                        break;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass21 implements AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListener {
        public AnonymousClass21() {
        }

        @Override
        public void didSelectDate(int i, int i2, boolean z) {
            ChatActivityEnterView.this.sendMessageInternal(i, z, i2, true, 0L);
        }

        @Override
        public boolean onItemClick(int i, View view) {
            if (!(view instanceof BotCommandsMenuView.BotCommandView)) {
                return false;
            }
            String str = ((BotCommandsMenuView.BotCommandView) view).getCommand() + " ";
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.setFieldText(str);
            chatActivityEnterView.botCommandsMenuContainer.dismiss();
            return true;
        }
    }

    public final class AnonymousClass22 implements AlertsCreator.ScheduleDatePickerDelegate {
        public final int $r8$classId;
        public final ChatActivityEnterView this$0;

        public AnonymousClass22(ChatActivityEnterView chatActivityEnterView, int i) {
            this.$r8$classId = i;
            this.this$0 = chatActivityEnterView;
        }

        @Override
        public final void didSelectDate(int i, int i2, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    boolean zSendMessageInternal = this.this$0.sendMessageInternal(i, z, i2, true, 0L);
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatActivityEnterView.messageSendPreview;
                    if (anonymousClass25 != null) {
                        anonymousClass25.sent = !zSendMessageInternal;
                        anonymousClass25.dismiss();
                        chatActivityEnterView.messageSendPreview = null;
                    }
                    break;
                default:
                    boolean zSendMessageInternal2 = this.this$0.sendMessageInternal(i, z, i2, true, 0L);
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    ChatAttachAlert.AnonymousClass25 anonymousClass26 = chatActivityEnterView2.messageSendPreview;
                    if (anonymousClass26 != null) {
                        anonymousClass26.sent = !zSendMessageInternal2;
                        anonymousClass26.dismiss();
                        chatActivityEnterView2.messageSendPreview = null;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass24 extends FrameLayout {
        public final RectF backgroundRect;
        public final Paint paint;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass24(Activity activity, Theme.ResourcesProvider resourcesProvider) {
            super(activity);
            this.val$resourcesProvider = resourcesProvider;
            this.paint = new Paint(1);
            this.backgroundRect = new RectF();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!chatActivityEnterView.audioVideoButtonContainerForbidden) {
                AnonymousClass34 anonymousClass34 = chatActivityEnterView.expandStickersButton;
                float alpha = 1.0f;
                if (anonymousClass34 != null && anonymousClass34.getVisibility() == 0) {
                    alpha = 1.0f - chatActivityEnterView.expandStickersButton.getAlpha();
                }
                float fDpf2 = AndroidUtilities.dpf2(19.0f);
                Paint paint = this.paint;
                paint.setColor(chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelSend));
                float fDpf3 = AndroidUtilities.dpf2(3.0f);
                float fDpf4 = AndroidUtilities.dpf2(38.0f);
                float fDpf5 = AndroidUtilities.dpf2(38.0f);
                RectF rectF = this.backgroundRect;
                rectF.set((getMeasuredWidth() - fDpf5) - fDpf3, (getMeasuredHeight() - fDpf4) - fDpf3, getMeasuredWidth() - fDpf3, getMeasuredHeight() - fDpf3);
                canvas.save();
                canvas.scale(alpha, alpha, rectF.centerX(), rectF.centerY());
                canvas.drawRoundRect(rectF, fDpf2, fDpf2, paint);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return !ChatActivityEnterView.this.isLiveComment;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            AnonymousClass35 anonymousClass35;
            long j;
            long j2;
            long j3;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!chatActivityEnterView.isLiveComment) {
                chatActivityEnterView.createRecordCircle();
                int action = motionEvent.getAction();
                AnonymousClass8 anonymousClass8 = chatActivityEnterView.recordAudioVideoRunnable;
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                AnonymousClass27 anonymousClass27 = chatActivityEnterView.sendButton;
                if (action == 0) {
                    if (!ChatActivityEnterView.this.sendButtonVisible) {
                        TLRPC.Chat chat = chatActivity == null ? null : chatActivity.currentChat;
                        TLRPC.UserFull userFull = chatActivity == null ? chatActivityEnterView.userInfo : chatActivity.userInfo;
                        if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.hasRecordVideo)) || (userFull != null && userFull.voice_messages_forbidden)) {
                            chatActivityEnterView.delegate.needShowMediaBanHint();
                            return true;
                        }
                        if (!chatActivityEnterView.hasRecordVideo) {
                            anonymousClass8.run();
                            return true;
                        }
                        chatActivityEnterView.calledRecordRunnable = false;
                        chatActivityEnterView.recordAudioVideoRunnableStarted = true;
                        AndroidUtilities.runOnUIThread(anonymousClass8, 150L);
                        return true;
                    }
                    boolean z = chatActivityEnterView.hasRecordVideo;
                    if (!z || chatActivityEnterView.calledRecordRunnable) {
                        chatActivityEnterView.startedDraggingX = -1.0f;
                        if (!z || !chatActivityEnterView.isInVideoMode) {
                            if (chatActivityEnterView.recordingAudioVideo && chatActivityEnterView.isInScheduleMode()) {
                                AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivity.getDialogId(), -1L, 0, new EmojiView$$ExternalSyntheticLambda21(23), new ChatActivity$$ExternalSyntheticLambda470(15), this.val$resourcesProvider);
                            }
                            if (AlertsCreator.needsPaidMessageAlert(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
                                if (chatActivityEnterView.isInVideoMode) {
                                    SlideTextView slideTextView = chatActivityEnterView.slideText;
                                    if (slideTextView != null) {
                                        slideTextView.setEnabled(false);
                                    }
                                    chatActivityEnterView.delegate.toggleVideoRecordingPause();
                                } else {
                                    if (chatActivityEnterView.sendButtonVisible) {
                                        chatActivityEnterView.calledRecordRunnable = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.voiceOnce);
                                    chatActivityEnterView.delegate.needStartRecordAudio(0);
                                    SlideTextView slideTextView2 = chatActivityEnterView.slideText;
                                    if (slideTextView2 != null) {
                                        slideTextView2.setEnabled(false);
                                    }
                                }
                                int i = chatActivityEnterView.currentAccount;
                                long j4 = chatActivityEnterView.dialog_id;
                                final int i2 = 1;
                                AlertsCreator.ensurePaidMessageConfirmation(i, j4, 1, new Utilities.Callback(this) {
                                    public final ChatActivityEnterView.AnonymousClass24 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l = (Long) obj;
                                        switch (i2) {
                                            case 0:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass24 = this.f$0;
                                                anonymousClass24.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            case 1:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass25 = this.f$0;
                                                anonymousClass25.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            case 2:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass26 = this.f$0;
                                                anonymousClass26.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            default:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass28 = this.f$0;
                                                anonymousClass28.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                        }
                                    }
                                }, 0L);
                                return true;
                            }
                            MediaController.getInstance().stopRecording(chatActivityEnterView.isInScheduleMode() ? 3 : 1, true, 0, chatActivityEnterView.voiceOnce, 0L);
                            chatActivityEnterView.delegate.needStartRecordAudio(0);
                        } else {
                            if (AlertsCreator.needsPaidMessageAlert(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
                                SlideTextView slideTextView3 = chatActivityEnterView.slideText;
                                if (slideTextView3 != null) {
                                    slideTextView3.setEnabled(false);
                                }
                                chatActivityEnterView.delegate.toggleVideoRecordingPause();
                                int i3 = chatActivityEnterView.currentAccount;
                                long j5 = chatActivityEnterView.dialog_id;
                                final int i4 = 0;
                                AlertsCreator.ensurePaidMessageConfirmation(i3, j5, 1, new Utilities.Callback(this) {
                                    public final ChatActivityEnterView.AnonymousClass24 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l = (Long) obj;
                                        switch (i4) {
                                            case 0:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass24 = this.f$0;
                                                anonymousClass24.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            case 1:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass25 = this.f$0;
                                                anonymousClass25.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            case 2:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass26 = this.f$0;
                                                anonymousClass26.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            default:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass28 = this.f$0;
                                                anonymousClass28.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                        }
                                    }
                                }, 0L);
                                return true;
                            }
                            chatActivityEnterView.delegate.needStartRecordVideo(1, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                            chatActivityEnterView.effectId = 0L;
                            anonymousClass27.setEffect(0L);
                        }
                        chatActivityEnterView.recordingAudioVideo = false;
                        chatActivityEnterView.messageTransitionIsRunning = false;
                        final int i5 = 0;
                        Runnable runnable = new Runnable(this) {
                            public final ChatActivityEnterView.AnonymousClass24 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                                        chatActivityEnterView2.moveToSendStateRunnable = null;
                                        chatActivityEnterView2.updateRecordInterface(1, true);
                                        break;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                        chatActivityEnterView3.moveToSendStateRunnable = null;
                                        chatActivityEnterView3.updateRecordInterface(1, true);
                                        break;
                                }
                            }
                        };
                        chatActivityEnterView.moveToSendStateRunnable = runnable;
                        AndroidUtilities.runOnUIThread(runnable, 200L);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                int action2 = motionEvent.getAction();
                AnonymousClass24 anonymousClass24 = chatActivityEnterView.audioVideoButtonContainer;
                AnonymousClass2 anonymousClass2 = chatActivityEnterView.onFinishInitCameraRunnable;
                float f = 1.0f;
                if (action2 != 1 && motionEvent.getAction() != 3) {
                    if (motionEvent.getAction() == 2 && chatActivityEnterView.recordingAudioVideo) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        RecordCircle recordCircle = chatActivityEnterView.recordCircle;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        boolean z2 = chatActivityEnterView2.sendButtonVisible;
                        if (!z2) {
                            if (!z2) {
                                if (chatActivityEnterView2.lockAnimatedTranslation == -1.0f) {
                                    chatActivityEnterView2.startTranslation = y;
                                }
                                chatActivityEnterView2.lockAnimatedTranslation = y;
                                recordCircle.invalidate();
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.canceledByGesture || chatActivityEnterView3.slideToCancelProgress < 0.7f || chatActivityEnterView3.startTranslation - chatActivityEnterView3.lockAnimatedTranslation < AndroidUtilities.dp(57.0f)) {
                                    RecordCircle recordCircle2 = chatActivityEnterView.recordCircle;
                                    float f2 = x - recordCircle2.lastMovingX;
                                    float f3 = y - recordCircle2.lastMovingY;
                                    float f4 = (f3 * f3) + (f2 * f2);
                                    recordCircle2.lastMovingY = y;
                                    recordCircle2.lastMovingX = x;
                                    ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                                    if (chatActivityEnterView4.showTooltip && chatActivityEnterView4.tooltipAlpha == 0.0f && f4 > recordCircle2.touchSlop) {
                                        chatActivityEnterView4.showTooltipStartTime = System.currentTimeMillis();
                                    }
                                    if (chatActivityEnterView.startedDraggingX == -1.0f) {
                                        chatActivityEnterView.startedDraggingX = x;
                                        float measuredWidth = (float) (((double) chatActivityEnterView.sizeNotifierLayout.getMeasuredWidth()) * 0.35d);
                                        chatActivityEnterView.distCanMove = measuredWidth;
                                        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                            chatActivityEnterView.distCanMove = AndroidUtilities.dp(140.0f);
                                        }
                                    }
                                    float x2 = anonymousClass24.getX() + x;
                                    float f5 = chatActivityEnterView.startedDraggingX;
                                    float f6 = ((x2 - f5) / chatActivityEnterView.distCanMove) + 1.0f;
                                    if (f5 != -1.0f) {
                                        if (f6 <= 1.0f) {
                                            f = f6 < 0.0f ? 0.0f : f6;
                                        }
                                        SlideTextView slideTextView4 = chatActivityEnterView.slideText;
                                        if (slideTextView4 != null) {
                                            slideTextView4.slideProgress = f;
                                        }
                                        chatActivityEnterView.setSlideToCancelProgress(f);
                                        f6 = f;
                                    }
                                    if (f6 == 0.0f) {
                                        if (chatActivityEnterView.hasRecordVideo && chatActivityEnterView.isInVideoMode) {
                                            CameraController.getInstance().cancelOnInitRunnable(anonymousClass2);
                                            chatActivityEnterView.delegate.needStartRecordVideo(2, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                                            chatActivityEnterView.effectId = 0L;
                                            anonymousClass27.setEffect(0L);
                                        } else {
                                            chatActivityEnterView.delegate.needStartRecordAudio(0);
                                            MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.voiceOnce, 0L);
                                        }
                                        chatActivityEnterView.recordingAudioVideo = false;
                                        chatActivityEnterView.updateRecordInterface(5, true);
                                        return true;
                                    }
                                } else {
                                    chatActivityEnterView3.sendButtonVisible = true;
                                    ControlsView controlsView = chatActivityEnterView3.controlsView;
                                    if (controlsView != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                        controlsView.hideHintView();
                                        HintView2 hintView2 = new HintView2(controlsView.getContext(), 2);
                                        controlsView.pauseHint = hintView2;
                                        hintView2.setJoint(1.0f, 0.0f);
                                        controlsView.pauseHint.setMultilineText(true);
                                        controlsView.pauseHint.setText(LocaleController.getString(R.string.VoicePauseHint));
                                        MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                        controlsView.addView(controlsView.pauseHint, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                        HintView2 hintView3 = controlsView.pauseHint;
                                        hintView3.onHidden = new ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda3(controlsView, hintView3, 3);
                                        hintView3.show();
                                    }
                                }
                            }
                            ChatActivityEnterView.access$8700(chatActivityEnterView);
                            return false;
                        }
                    }
                    return true;
                }
                if (motionEvent.getAction() == 3 && chatActivityEnterView.recordingAudioVideo) {
                    if (chatActivityEnterView.slideToCancelProgress >= 0.7f) {
                        chatActivityEnterView.sendButtonVisible = true;
                        ChatActivityEnterView.access$8700(chatActivityEnterView);
                        return false;
                    }
                    if (chatActivityEnterView.hasRecordVideo && chatActivityEnterView.isInVideoMode) {
                        CameraController.getInstance().cancelOnInitRunnable(anonymousClass2);
                        chatActivityEnterView.delegate.needStartRecordVideo(2, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.effectId = 0L;
                        anonymousClass27.setEffect(0L);
                    } else {
                        chatActivityEnterView.delegate.needStartRecordAudio(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.voiceOnce, 0L);
                        j3 = 0;
                    }
                    chatActivityEnterView.millisecondsRecorded = j3;
                    chatActivityEnterView.recordingAudioVideo = false;
                    chatActivityEnterView.updateRecordInterface(5, true);
                    return false;
                }
                RecordCircle recordCircle3 = chatActivityEnterView.recordCircle;
                if ((recordCircle3 == null || !ChatActivityEnterView.this.sendButtonVisible) && ((anonymousClass35 = chatActivityEnterView.recordedAudioPanel) == null || anonymousClass35.getVisibility() != 0)) {
                    if ((((anonymousClass24.getX() + motionEvent.getX()) - chatActivityEnterView.startedDraggingX) / chatActivityEnterView.distCanMove) + 1.0f < 0.45d) {
                        if (chatActivityEnterView.hasRecordVideo && chatActivityEnterView.isInVideoMode) {
                            CameraController.getInstance().cancelOnInitRunnable(anonymousClass2);
                            chatActivityEnterView.delegate.needStartRecordVideo(2, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                            j2 = 0;
                            chatActivityEnterView.effectId = 0L;
                            anonymousClass27.setEffect(0L);
                        } else {
                            chatActivityEnterView.delegate.needStartRecordAudio(0);
                            MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.voiceOnce, 0L);
                            j2 = 0;
                        }
                        chatActivityEnterView.millisecondsRecorded = j2;
                        chatActivityEnterView.recordingAudioVideo = false;
                        chatActivityEnterView.updateRecordInterface(5, true);
                        return true;
                    }
                    if (chatActivityEnterView.recordAudioVideoRunnableStarted) {
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass8);
                        if (chatActivityEnterView.sendVoiceEnabled && chatActivityEnterView.sendRoundEnabled) {
                            chatActivityEnterView.delegate.onSwitchRecordMode(!chatActivityEnterView.isInVideoMode);
                            chatActivityEnterView.setRecordVideoButtonVisible(!chatActivityEnterView.isInVideoMode, true);
                        } else {
                            chatActivityEnterView.delegate.needShowMediaBanHint();
                        }
                        performHapticFeedback(3);
                        sendAccessibilityEvent(1);
                        return true;
                    }
                    boolean z3 = chatActivityEnterView.hasRecordVideo;
                    if (!z3 || chatActivityEnterView.calledRecordRunnable) {
                        chatActivityEnterView.startedDraggingX = -1.0f;
                        if (!z3 || !chatActivityEnterView.isInVideoMode) {
                            j = 0;
                            if (!chatActivityEnterView.sendVoiceEnabled) {
                                chatActivityEnterView.delegate.needShowMediaBanHint();
                            } else {
                                if (AlertsCreator.needsPaidMessageAlert(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
                                    if (chatActivityEnterView.sendButtonVisible) {
                                        chatActivityEnterView.calledRecordRunnable = true;
                                    }
                                    MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.voiceOnce);
                                    chatActivityEnterView.delegate.needStartRecordAudio(0);
                                    SlideTextView slideTextView5 = chatActivityEnterView.slideText;
                                    if (slideTextView5 != null) {
                                        slideTextView5.setEnabled(false);
                                    }
                                    int i6 = chatActivityEnterView.currentAccount;
                                    long j6 = chatActivityEnterView.dialog_id;
                                    final int i7 = 3;
                                    AlertsCreator.ensurePaidMessageConfirmation(i6, j6, 1, new Utilities.Callback(this) {
                                        public final ChatActivityEnterView.AnonymousClass24 f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void run(Object obj) {
                                            Long l = (Long) obj;
                                            switch (i7) {
                                                case 0:
                                                    ChatActivityEnterView.AnonymousClass24 anonymousClass25 = this.f$0;
                                                    anonymousClass25.getClass();
                                                    ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                    break;
                                                case 1:
                                                    ChatActivityEnterView.AnonymousClass24 anonymousClass26 = this.f$0;
                                                    anonymousClass26.getClass();
                                                    ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                    break;
                                                case 2:
                                                    ChatActivityEnterView.AnonymousClass24 anonymousClass28 = this.f$0;
                                                    anonymousClass28.getClass();
                                                    ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                    break;
                                                default:
                                                    ChatActivityEnterView.AnonymousClass24 anonymousClass29 = this.f$0;
                                                    anonymousClass29.getClass();
                                                    ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                    break;
                                            }
                                        }
                                    }, 0L);
                                    return true;
                                }
                                if (chatActivityEnterView.recordingAudioVideo && chatActivityEnterView.isInScheduleMode()) {
                                    AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivity.getDialogId(), -1L, 0, new EmojiView$$ExternalSyntheticLambda21(24), new ChatActivity$$ExternalSyntheticLambda470(16), this.val$resourcesProvider);
                                }
                                chatActivityEnterView.delegate.needStartRecordAudio(0);
                                MediaController.getInstance().stopRecording(chatActivityEnterView.isInScheduleMode() ? 3 : 1, true, 0, chatActivityEnterView.voiceOnce, 0L);
                            }
                        } else {
                            if (AlertsCreator.needsPaidMessageAlert(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id)) {
                                SlideTextView slideTextView6 = chatActivityEnterView.slideText;
                                if (slideTextView6 != null) {
                                    slideTextView6.setEnabled(false);
                                }
                                chatActivityEnterView.delegate.toggleVideoRecordingPause();
                                int i8 = chatActivityEnterView.currentAccount;
                                long j7 = chatActivityEnterView.dialog_id;
                                final int i9 = 2;
                                AlertsCreator.ensurePaidMessageConfirmation(i8, j7, 1, new Utilities.Callback(this) {
                                    public final ChatActivityEnterView.AnonymousClass24 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run(Object obj) {
                                        Long l = (Long) obj;
                                        switch (i9) {
                                            case 0:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass25 = this.f$0;
                                                anonymousClass25.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            case 1:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass26 = this.f$0;
                                                anonymousClass26.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            case 2:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass28 = this.f$0;
                                                anonymousClass28.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                            default:
                                                ChatActivityEnterView.AnonymousClass24 anonymousClass29 = this.f$0;
                                                anonymousClass29.getClass();
                                                ChatActivityEnterView.this.sendMessageInternal(0, true, 0, false, l.longValue());
                                                break;
                                        }
                                    }
                                }, 0L);
                                return true;
                            }
                            CameraController.getInstance().cancelOnInitRunnable(anonymousClass2);
                            chatActivityEnterView.delegate.needStartRecordVideo(1, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                            j = 0;
                            chatActivityEnterView.effectId = 0L;
                            anonymousClass27.setEffect(0L);
                        }
                        chatActivityEnterView.recordingAudioVideo = false;
                        chatActivityEnterView.messageTransitionIsRunning = false;
                        final int i10 = 1;
                        Runnable runnable2 = new Runnable(this) {
                            public final ChatActivityEnterView.AnonymousClass24 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                                        chatActivityEnterView5.moveToSendStateRunnable = null;
                                        chatActivityEnterView5.updateRecordInterface(1, true);
                                        break;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView6 = ChatActivityEnterView.this;
                                        chatActivityEnterView6.moveToSendStateRunnable = null;
                                        chatActivityEnterView6.updateRecordInterface(1, true);
                                        break;
                                }
                            }
                        };
                        chatActivityEnterView.moveToSendStateRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.shouldDrawBackground ? 500L : j);
                        return true;
                    }
                    return true;
                }
                if (chatActivityEnterView.recordAudioVideoRunnableStarted) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass8);
                }
            }
            return false;
        }
    }

    public final class AnonymousClass26 extends CloseProgressDrawable2 {
        public final int $r8$classId;

        public AnonymousClass26(float f, int i) {
            super(f);
            this.$r8$classId = i;
        }

        @Override
        public final int getCurrentColor() {
            switch (this.$r8$classId) {
                case 0:
                    return Theme.getColor(null, Theme.key_chat_messagePanelCancelInlineBot, false);
                default:
                    return -6182737;
            }
        }
    }

    public final class AnonymousClass28 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatActivityEnterView this$0;

        public AnonymousClass28(ChatActivityEnterView chatActivityEnterView, int i) {
            this.$r8$classId = i;
            this.this$0 = chatActivityEnterView;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 3:
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    if (animator.equals(chatActivityEnterView.runningAnimation2)) {
                        chatActivityEnterView.runningAnimation2 = null;
                    }
                    break;
                case 4:
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    if (animator.equals(chatActivityEnterView2.runningAnimation)) {
                        chatActivityEnterView2.runningAnimation = null;
                    }
                    break;
                case 5:
                    ChatActivityEnterView chatActivityEnterView3 = this.this$0;
                    if (animator.equals(chatActivityEnterView3.runningAnimation2)) {
                        chatActivityEnterView3.runningAnimation2 = null;
                    }
                    break;
                case 6:
                    ChatActivityEnterView chatActivityEnterView4 = this.this$0;
                    if (animator.equals(chatActivityEnterView4.runningAnimation)) {
                        chatActivityEnterView4.runningAnimation = null;
                    }
                    break;
                case 7:
                    ChatActivityEnterView chatActivityEnterView5 = this.this$0;
                    if (animator.equals(chatActivityEnterView5.runningAnimation2)) {
                        chatActivityEnterView5.runningAnimation2 = null;
                    }
                    break;
                case 8:
                    ChatActivityEnterView chatActivityEnterView6 = this.this$0;
                    if (animator.equals(chatActivityEnterView6.runningAnimation)) {
                        chatActivityEnterView6.runningAnimation = null;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.captionLimitView.setVisibility(8);
                    break;
                case 1:
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    AnonymousClass35 anonymousClass35 = chatActivityEnterView.recordedAudioPanel;
                    if (anonymousClass35 != null) {
                        anonymousClass35.setVisibility(8);
                    }
                    AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                    if (anonymousClass50 != null) {
                        anonymousClass50.requestFocus();
                    }
                    chatActivityEnterView.isRecordingStateChanged();
                    break;
                case 2:
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    VideoTimelineView videoTimelineView = chatActivityEnterView2.videoTimelineView;
                    if (videoTimelineView != null) {
                        videoTimelineView.setVisibility(8);
                    }
                    RecordedAudioPlayerView recordedAudioPlayerView = chatActivityEnterView2.audioTimelineView;
                    if (recordedAudioPlayerView != null) {
                        recordedAudioPlayerView.setVisibility(8);
                    }
                    chatActivityEnterView2.transformToSeekbar = 0.0f;
                    chatActivityEnterView2.isRecordingStateChanged();
                    chatActivityEnterView2.hideRecordedAudioPanelInternal();
                    RecordCircle recordCircle = chatActivityEnterView2.recordCircle;
                    if (recordCircle != null) {
                        recordCircle.setSendButtonInvisible();
                    }
                    break;
                case 3:
                    ChatActivityEnterView chatActivityEnterView3 = this.this$0;
                    if (animator.equals(chatActivityEnterView3.runningAnimation2)) {
                        chatActivityEnterView3.attachLayout.setVisibility(8);
                        chatActivityEnterView3.runningAnimation2 = null;
                    }
                    break;
                case 4:
                    ChatActivityEnterView chatActivityEnterView4 = this.this$0;
                    if (animator.equals(chatActivityEnterView4.runningAnimation)) {
                        chatActivityEnterView4.getSendButtonInternal().setVisibility(8);
                        chatActivityEnterView4.cancelBotButton.setVisibility(8);
                        chatActivityEnterView4.audioVideoButtonContainer.setVisibility(8);
                        AnonymousClass34 anonymousClass34 = chatActivityEnterView4.expandStickersButton;
                        if (anonymousClass34 != null) {
                            anonymousClass34.setVisibility(8);
                        }
                        chatActivityEnterView4.runningAnimation = null;
                        chatActivityEnterView4.runningAnimationType = 0;
                    }
                    break;
                case 5:
                    ChatActivityEnterView chatActivityEnterView5 = this.this$0;
                    if (animator.equals(chatActivityEnterView5.runningAnimation2)) {
                        chatActivityEnterView5.runningAnimation2 = null;
                    }
                    break;
                case 6:
                    ChatActivityEnterView chatActivityEnterView6 = this.this$0;
                    if (animator.equals(chatActivityEnterView6.runningAnimation)) {
                        chatActivityEnterView6.getSendButtonInternal().setVisibility(8);
                        chatActivityEnterView6.cancelBotButton.setVisibility(8);
                        chatActivityEnterView6.setSlowModeButtonVisible(false);
                        chatActivityEnterView6.audioVideoButtonContainer.setVisibility(8);
                        chatActivityEnterView6.expandStickersButton.setVisibility(0);
                        chatActivityEnterView6.runningAnimation = null;
                        chatActivityEnterView6.runningAnimationType = 0;
                    }
                    break;
                case 7:
                    ChatActivityEnterView chatActivityEnterView7 = this.this$0;
                    if (animator.equals(chatActivityEnterView7.runningAnimation2)) {
                        chatActivityEnterView7.runningAnimation2 = null;
                    }
                    break;
                case 8:
                    ChatActivityEnterView chatActivityEnterView8 = this.this$0;
                    if (animator.equals(chatActivityEnterView8.runningAnimation)) {
                        chatActivityEnterView8.setSlowModeButtonVisible(false);
                        chatActivityEnterView8.runningAnimation = null;
                        chatActivityEnterView8.runningAnimationType = 0;
                        AnonymousClass24 anonymousClass24 = chatActivityEnterView8.audioVideoButtonContainer;
                        if (anonymousClass24 != null) {
                            anonymousClass24.setVisibility(0);
                        }
                    }
                    break;
                case 9:
                    ChatActivityEnterView chatActivityEnterView9 = this.this$0;
                    chatActivityEnterView9.audioTimelineView.setAllowDraw(true);
                    chatActivityEnterView9.recordCircle.setTransformToSeekbar(1.0f);
                    chatActivityEnterView9.isRecordingStateChanged();
                    break;
                case 10:
                    ChatActivityEnterView chatActivityEnterView10 = this.this$0;
                    AnonymousClass25 anonymousClass25 = chatActivityEnterView10.audioVideoSendButton;
                    if (anonymousClass25 != null) {
                        anonymousClass25.setScaleX(1.0f);
                        chatActivityEnterView10.audioVideoSendButton.setScaleY(1.0f);
                    }
                    break;
                case 11:
                    super.onAnimationEnd(animator);
                    AnonymousClass25 anonymousClass26 = this.this$0.audioVideoSendButton;
                    if (anonymousClass26 != null) {
                        anonymousClass26.setAlpha(1.0f);
                    }
                    break;
                case 12:
                    ChatActivityEnterView chatActivityEnterView11 = this.this$0;
                    chatActivityEnterView11.panelAnimation = null;
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView11.delegate;
                    if (chatActivityEnterViewDelegate != null) {
                        chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
                    }
                    chatActivityEnterView11.requestLayout();
                    chatActivityEnterView11.notificationsLocker.unlock();
                    break;
                case 13:
                    ChatActivityEnterView chatActivityEnterView12 = this.this$0;
                    chatActivityEnterView12.stickersExpansionAnim = null;
                    chatActivityEnterView12.emojiView.setLayerType(0, null);
                    break;
                default:
                    ChatActivityEnterView chatActivityEnterView13 = this.this$0;
                    chatActivityEnterView13.stickersExpansionAnim = null;
                    chatActivityEnterView13.emojiView.setLayerType(0, null);
                    chatActivityEnterView13.notificationsLocker.unlock();
                    break;
            }
        }
    }

    public final class AnonymousClass29 extends ImageView {
        public float innerTranslationX;

        public AnonymousClass29(Context context) {
            super(context);
        }

        @Override
        public final float getTranslationX() {
            return this.innerTranslationX;
        }

        @Override
        public final void setTranslationX(float f) {
            this.innerTranslationX = f;
            float fDp = AndroidUtilities.dp(-44.0f) + this.innerTranslationX;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f2 = fDp + chatActivityEnterView.attachLayoutPaddingTranslationX + chatActivityEnterView.attachLayoutTranslationX;
            AnonymousClass30 anonymousClass30 = chatActivityEnterView.giftButton;
            float fDp2 = AndroidUtilities.dp((anonymousClass30 == null || anonymousClass30.getVisibility() != 0) ? 0.0f : -44.0f);
            AnonymousClass30 anonymousClass31 = chatActivityEnterView.giftButton;
            float alpha = (fDp2 * (anonymousClass31 == null ? 0.0f : anonymousClass31.getAlpha())) + f2;
            AnonymousClass32 anonymousClass32 = chatActivityEnterView.botButton;
            float fDp3 = AndroidUtilities.dp((anonymousClass32 == null || anonymousClass32.getVisibility() != 0) ? 0.0f : -44.0f);
            AnonymousClass32 anonymousClass33 = chatActivityEnterView.botButton;
            super.setTranslationX((fDp3 * (anonymousClass33 != null ? anonymousClass33.getAlpha() : 0.0f)) + alpha);
        }
    }

    public final class AnonymousClass31 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatActivityEnterView this$0;
        public final boolean val$visible;

        public AnonymousClass31(ChatActivityEnterView chatActivityEnterView, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = chatActivityEnterView;
            this.val$visible = z;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    if (animator.equals(chatActivityEnterView.runningAnimation2)) {
                        chatActivityEnterView.runningAnimation2 = null;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            AnonymousClass29 anonymousClass29;
            switch (this.$r8$classId) {
                case 0:
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    if (chatActivityEnterView.isLiveComment) {
                        chatActivityEnterView.suggestButton.setVisibility(this.val$visible ? 0 : 8);
                    }
                    break;
                case 1:
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    if (animator.equals(chatActivityEnterView2.runningAnimation2)) {
                        chatActivityEnterView2.attachLayout.setVisibility(8);
                        if (this.val$visible && (anonymousClass29 = chatActivityEnterView2.scheduledButton) != null) {
                            anonymousClass29.setVisibility(8);
                        }
                        chatActivityEnterView2.runningAnimation2 = null;
                    }
                    break;
                case 2:
                    ChatActivityEnterView chatActivityEnterView3 = this.this$0;
                    if (animator.equals(chatActivityEnterView3.runningAnimationAudio)) {
                        chatActivityEnterView3.runningAnimationAudio = null;
                    }
                    chatActivityEnterView3.isRecordingStateChanged();
                    chatActivityEnterView3.slideText.setAlpha(1.0f);
                    chatActivityEnterView3.slideText.setTranslationX(0.0f);
                    ControlsView controlsView = chatActivityEnterView3.controlsView;
                    if (controlsView != null && SharedConfig.lockRecordAudioVideoHint < 3) {
                        ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                        chatActivityEnterView4.showTooltip = true;
                        chatActivityEnterView4.showTooltipStartTime = System.currentTimeMillis();
                    }
                    AnonymousClass50 anonymousClass50 = chatActivityEnterView3.messageEditText;
                    if (anonymousClass50 != null) {
                        anonymousClass50.setAlpha(0.0f);
                    }
                    if (this.val$visible) {
                        RecordedAudioPlayerView recordedAudioPlayerView = chatActivityEnterView3.audioTimelineView;
                        if (recordedAudioPlayerView != null) {
                            recordedAudioPlayerView.setVisibility(8);
                        }
                        AnonymousClass35 anonymousClass35 = chatActivityEnterView3.recordedAudioPanel;
                        if (anonymousClass35 != null) {
                            anonymousClass35.setVisibility(8);
                        }
                        chatActivityEnterView3.isRecordingStateChanged();
                    }
                    break;
                case 3:
                    ChatActivityEnterView chatActivityEnterView5 = this.this$0;
                    chatActivityEnterView5.scheduledButtonAnimation = null;
                    if (!this.val$visible) {
                        chatActivityEnterView5.scheduledButton.setVisibility(8);
                    }
                    break;
                default:
                    float f = this.val$visible ? 1.0f : 0.0f;
                    ChatActivityEnterView chatActivityEnterView6 = this.this$0;
                    chatActivityEnterView6.searchToOpenProgress = f;
                    AnonymousClass78 anonymousClass78 = chatActivityEnterView6.emojiView;
                    if (anonymousClass78 != null) {
                        anonymousClass78.updateStickerTabsPosition();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass32 extends ImageView {
        public AnonymousClass32(Context context) {
            super(context);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            AnonymousClass29 anonymousClass29 = ChatActivityEnterView.this.scheduledButton;
            if (anonymousClass29 != null) {
                anonymousClass29.setTranslationX(anonymousClass29.innerTranslationX);
            }
        }
    }

    public final class AnonymousClass34 extends ImageView {
        public AnonymousClass34(Context context) {
            super(context);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (getAlpha() <= 0.0f) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            AnonymousClass24 anonymousClass24 = ChatActivityEnterView.this.audioVideoButtonContainer;
            if (anonymousClass24 != null) {
                anonymousClass24.invalidate();
            }
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            AnonymousClass24 anonymousClass24 = ChatActivityEnterView.this.audioVideoButtonContainer;
            if (anonymousClass24 != null) {
                anonymousClass24.invalidate();
            }
        }
    }

    public final class AnonymousClass35 extends FrameLayout {
        public AnonymousClass35(Context context) {
            super(context);
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            ChatActivityEnterView.this.updateSendAsButton(true);
        }
    }

    public final class AnonymousClass36 implements VideoTimelineView.VideoTimelineViewDelegate {
        public AnonymousClass36() {
        }
    }

    public final class AnonymousClass37 extends SenderSelectPopup {
        public AnonymousClass37(Context context, ChatActivity chatActivity, MessagesController messagesController, boolean z, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, ChatActivity$$ExternalSyntheticLambda248 chatActivity$$ExternalSyntheticLambda248, Theme.ResourcesProvider resourcesProvider) {
            super(context, chatActivity, messagesController, z, peer, tL_channels_sendAsPeers, chatActivity$$ExternalSyntheticLambda248, resourcesProvider);
        }

        @Override
        public final void dismiss() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.senderSelectPopupWindow != this) {
                super.dismiss();
                return;
            }
            chatActivityEnterView.senderSelectPopupWindow = null;
            int i = 0;
            if (!this.runningCustomSprings) {
                startDismissAnimation(new SpringAnimation[0]);
                chatActivityEnterView.senderSelectView.setProgress(true, true, 0.0f);
                return;
            }
            ArrayList arrayList = this.springAnimations;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((SpringAnimation) obj).cancel();
            }
            arrayList.clear();
            super.dismiss();
        }
    }

    public final class AnonymousClass44 extends ActionBarPopupWindow {
        public AnonymousClass44(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            super(actionBarPopupWindowLayout);
        }

        @Override
        public final void dismiss() {
            dismiss(true);
            invalidate();
        }
    }

    public final class AnonymousClass47 extends BotCommandsMenuContainer {
        public boolean ignoreLayout;

        public AnonymousClass47(Context context) {
            super(context);
            this.ignoreLayout = false;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.ignoreLayout) {
                return;
            }
            this.ignoreLayout = true;
            ChatActivityEnterView.this.updateBotCommandsMenuContainerTopPadding();
        }
    }

    public final class AnonymousClass48 implements RecyclerListView.OnItemClickListener {
        public AnonymousClass48() {
        }

        @Override
        public final void onItemClick(int i, View view) {
            CharSequence slowModeTimer;
            if (view instanceof BotCommandsMenuView.BotCommandView) {
                String command = ((BotCommandsMenuView.BotCommandView) view).getCommand();
                if (TextUtils.isEmpty(command)) {
                    return;
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivityEnterView.dialog_id, -1L, 0, new ChatActivity$$ExternalSyntheticLambda189(24, this, command), null, chatActivityEnterView.resourcesProvider);
                    return;
                }
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                if (chatActivity == null || (slowModeTimer = chatActivity.chatActivityEnterView.getSlowModeTimer()) == null) {
                    AlertsCreator.ensurePaidMessageConfirmation(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id, 1, new ArticleViewer$$ExternalSyntheticLambda21(21, this, command), 0L);
                } else {
                    chatActivity.showSlowModeHint(slowModeTimer, view, true);
                }
            }
        }
    }

    public final class AnonymousClass50 extends ChatActivityEditTextCaption {
        public boolean clickMaybe;
        public boolean firstDraw;
        public float touchX;
        public float touchY;

        public AnonymousClass50(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.firstDraw = true;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            View view = chatActivityEnterView.mCustomWindowView;
            if (view != null) {
                setWindowView(view);
                return;
            }
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            if (chatActivity == null || chatActivity.getParentLayout() == null || !((ActionBarLayout) chatActivityEnterView.parentFragment.getParentLayout()).isSheet) {
                setWindowView(chatActivityEnterView.parentActivity.getWindow().getDecorView());
            } else {
                setWindowView(((ActionBarLayout) chatActivityEnterView.parentFragment.getParentLayout()).getWindow().getDecorView());
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (getLayout() == null || !this.firstDraw) {
                return;
            }
            this.firstDraw = false;
            ChatActivityEnterView.this.checkSendButton(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.lineCount != chatActivityEnterView.messageEditText.getLineCount()) {
                boolean z = false;
                chatActivityEnterView.showAiButton((chatActivityEnterView.messageEditText.getLineCount() <= 2 || chatActivityEnterView.messageEditText.getText() == null || TextUtils.isEmpty(chatActivityEnterView.messageEditText.getText().toString().trim())) ? false : true);
                if (chatActivityEnterView.messageEditText.getLineCount() > 2 && chatActivityEnterView.messageEditText.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.messageEditText.getText().toString().trim())) {
                    z = true;
                }
                chatActivityEnterView.showRichButton(z);
            }
        }

        @Override
        public final boolean onTextContextMenuItem(int i) {
            if (i == 16908322) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.messageEditText != null) {
                    try {
                        ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                        if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                            String htmlText = primaryClip.getItemAt(0).getHtmlText();
                            if (!TextUtils.isEmpty(htmlText)) {
                                HashMap map = new HashMap();
                                ArrayList arrayList = RichHtml.parse(htmlText, map);
                                if (!arrayList.isEmpty()) {
                                    if (!RichMessageConvert.isLossy(arrayList, map)) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichMessageConvert.rowsToCharSequence(arrayList, false));
                                        Emoji.replaceEmoji((CharSequence) spannableStringBuilder, chatActivityEnterView.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
                                        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
                                        if (animatedEmojiSpanArr != null) {
                                            for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                                                animatedEmojiSpan.applyFontMetrics(chatActivityEnterView.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
                                            }
                                        }
                                        int iMax = Math.max(0, chatActivityEnterView.messageEditText.getSelectionStart());
                                        int iMin = Math.min(chatActivityEnterView.messageEditText.getText().length(), chatActivityEnterView.messageEditText.getSelectionEnd());
                                        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) chatActivityEnterView.messageEditText.getText().getSpans(iMax, iMin, QuoteSpan.QuoteStyleSpan.class);
                                        if (quoteStyleSpanArr == null || quoteStyleSpanArr.length <= 0) {
                                            QuoteSpan.normalizeQuotes(spannableStringBuilder);
                                        } else {
                                            QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr2 = (QuoteSpan.QuoteStyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QuoteSpan.QuoteStyleSpan.class);
                                            for (int i2 = 0; i2 < quoteStyleSpanArr2.length; i2++) {
                                                spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2]);
                                                spannableStringBuilder.removeSpan(quoteStyleSpanArr2[i2].span);
                                            }
                                        }
                                        AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                                        anonymousClass50.setText(anonymousClass50.getText().replace(iMax, iMin, spannableStringBuilder));
                                        chatActivityEnterView.messageEditText.setSelection(Math.min(iMax + spannableStringBuilder.length(), chatActivityEnterView.messageEditText.getText().length()));
                                        return true;
                                    }
                                    if (MessagesController.getInstance(chatActivityEnterView.currentAccount).richEditorAvailable()) {
                                        int iMax2 = Math.max(0, chatActivityEnterView.messageEditText.getSelectionStart());
                                        int iMin2 = Math.min(chatActivityEnterView.messageEditText.getText().length(), chatActivityEnterView.messageEditText.getSelectionEnd());
                                        chatActivityEnterView.openRichEditorWithHtml(chatActivityEnterView.messageEditText.getText().subSequence(0, Math.min(iMax2, iMin2)), htmlText, chatActivityEnterView.messageEditText.getText().subSequence(Math.max(iMax2, iMin2), chatActivityEnterView.messageEditText.getText().length()));
                                        return true;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            return super.onTextContextMenuItem(i);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!chatActivityEnterView.botCommandsMenuIsShowing()) {
                if (motionEvent.getAction() == 0 && chatActivityEnterView.delegate != null) {
                    int i = Theme.key_chat_TextSelectionCursor;
                    int i2 = ChatActivityEnterView.$r8$clinit;
                    setHandlesColor(chatActivityEnterView.getThemedColor$6(i));
                    chatActivityEnterView.delegate.onKeyboardRequested();
                }
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                this.touchX = motionEvent.getX();
                this.touchY = motionEvent.getY();
                this.clickMaybe = true;
            } else if (this.clickMaybe && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.touchX) > AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.touchY) > AndroidUtilities.touchSlop) {
                    this.clickMaybe = false;
                }
            } else if (this.clickMaybe) {
                if (chatActivityEnterView.delegate != null) {
                    int i3 = Theme.key_chat_TextSelectionCursor;
                    int i4 = ChatActivityEnterView.$r8$clinit;
                    setHandlesColor(chatActivityEnterView.getThemedColor$6(i3));
                    chatActivityEnterView.delegate.onKeyboardRequested();
                }
                AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                if (anonymousClass50 != null && !AndroidUtilities.showKeyboard(anonymousClass50)) {
                    chatActivityEnterView.messageEditText.clearFocus();
                    chatActivityEnterView.messageEditText.requestFocus();
                }
            }
            return this.clickMaybe;
        }

        @Override
        public final void setOffsetY(float f) {
            super.setOffsetY(f);
            ChatActivityEnterView.this.messageEditTextContainer.invalidate();
        }
    }

    public final class AnonymousClass53 implements TextWatcher {
        public boolean heightShouldBeChanged;
        public boolean ignorePrevTextChange;
        public boolean nextChangeIsSend;
        public String prevText;
        public boolean processChange;

        public AnonymousClass53() {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            NumberTextView numberTextView;
            boolean z;
            RichEditor.AnonymousClass9 anonymousClass9;
            if (this.ignorePrevTextChange) {
                return;
            }
            if (this.prevText != null) {
                this.ignorePrevTextChange = true;
                editable.replace(0, editable.length(), this.prevText);
                this.prevText = null;
                this.ignorePrevTextChange = false;
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.innerTextChange == 0) {
                if (this.nextChangeIsSend) {
                    chatActivityEnterView.sendMessage();
                    this.nextChangeIsSend = false;
                }
                if (this.processChange) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    Emoji.replaceEmoji((CharSequence) editable, chatActivityEnterView.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
                    this.processChange = false;
                }
            }
            int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
            chatActivityEnterView.codePointCount = iCodePointCount;
            int i = chatActivityEnterView.currentLimit;
            if (i > 0) {
                int i2 = i - iCodePointCount;
                if (i2 <= (chatActivityEnterView.isLiveComment ? 5 : 100)) {
                    if (i2 < -9999) {
                        i2 = -9999;
                    }
                    chatActivityEnterView.createCaptionLimitView();
                    NumberTextView numberTextView2 = chatActivityEnterView.captionLimitView;
                    numberTextView2.setNumber(i2, numberTextView2.getVisibility() == 0);
                    if (chatActivityEnterView.captionLimitView.getVisibility() != 0) {
                        chatActivityEnterView.captionLimitView.setVisibility(0);
                        chatActivityEnterView.captionLimitView.setAlpha(0.0f);
                        chatActivityEnterView.captionLimitView.setScaleX(0.5f);
                        chatActivityEnterView.captionLimitView.setScaleY(0.5f);
                    }
                    chatActivityEnterView.captionLimitView.animate().setListener(null).cancel();
                    chatActivityEnterView.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i2 < 0) {
                        chatActivityEnterView.captionLimitView.setTextColor(chatActivityEnterView.getThemedColor$6(Theme.key_text_RedRegular));
                        z = false;
                    } else {
                        chatActivityEnterView.captionLimitView.setTextColor(chatActivityEnterView.getThemedColor$6(Theme.key_windowBackgroundWhiteGrayText));
                    }
                } else {
                    numberTextView = chatActivityEnterView.captionLimitView;
                    if (numberTextView != null) {
                        numberTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new CheckBox.AnonymousClass1(this, 11));
                    }
                }
                z = true;
            } else {
                numberTextView = chatActivityEnterView.captionLimitView;
                if (numberTextView != null) {
                    numberTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new CheckBox.AnonymousClass1(this, 11));
                }
                z = true;
            }
            if (chatActivityEnterView.doneButtonEnabled != z && (anonymousClass9 = chatActivityEnterView.doneButton) != null) {
                chatActivityEnterView.doneButtonEnabled = z;
                anonymousClass9.invalidate();
            }
            AnonymousClass47 anonymousClass47 = chatActivityEnterView.botCommandsMenuContainer;
            if (anonymousClass47 != null) {
                anonymousClass47.dismiss();
            }
            chatActivityEnterView.checkBotMenu();
            if (chatActivityEnterView.editingCaption && !chatActivityEnterView.captionLimitBulletinShown && !MessagesController.getInstance(chatActivityEnterView.currentAccount).premiumFeaturesBlocked() && !UserConfig.getInstance(chatActivityEnterView.currentAccount).isPremium() && chatActivityEnterView.codePointCount > MessagesController.getInstance(chatActivityEnterView.currentAccount).captionLengthLimitDefault && chatActivityEnterView.codePointCount < MessagesController.getInstance(chatActivityEnterView.currentAccount).captionLengthLimitPremium) {
                chatActivityEnterView.captionLimitBulletinShown = true;
                if (this.heightShouldBeChanged) {
                    AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 10), 300L);
                } else {
                    chatActivityEnterView.showCaptionLimitBulletin();
                }
            }
            chatActivityEnterView.showAiButton(chatActivityEnterView.lineCount > 2 && !TextUtils.isEmpty(editable.toString().trim()));
            chatActivityEnterView.checkIsEphemeralMessage(true);
            chatActivityEnterView.showRichButton(chatActivityEnterView.lineCount > 2 && !TextUtils.isEmpty(editable.toString().trim()));
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.ignorePrevTextChange && ChatActivityEnterView.this.recordingAudioVideo) {
                this.prevText = charSequence.toString();
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.ignorePrevTextChange) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            AnonymousClass78 anonymousClass78 = chatActivityEnterView.emojiView;
            boolean z = (anonymousClass78 == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : anonymousClass78.getCurrentPage()) != 0 && (chatActivityEnterView.allowStickers || chatActivityEnterView.allowGifs);
            if (((i2 == 0 && !TextUtils.isEmpty(charSequence)) || (i2 != 0 && TextUtils.isEmpty(charSequence))) && z) {
                chatActivityEnterView.setEmojiButtonImage(false, true);
            }
            if (chatActivityEnterView.lineCount != chatActivityEnterView.messageEditText.getLineCount()) {
                this.heightShouldBeChanged = (chatActivityEnterView.messageEditText.getLineCount() >= 4) != (chatActivityEnterView.lineCount >= 4);
                if (!chatActivityEnterView.isInitLineCount && chatActivityEnterView.messageEditText.getMeasuredWidth() > 0) {
                    chatActivityEnterView.onLineCountChanged(chatActivityEnterView.lineCount, chatActivityEnterView.messageEditText.getLineCount());
                }
                int lineCount = chatActivityEnterView.messageEditText.getLineCount();
                chatActivityEnterView.lineCount = lineCount;
                chatActivityEnterView.showAiButton((lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
                chatActivityEnterView.showRichButton((chatActivityEnterView.lineCount <= 2 || charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) ? false : true);
            } else {
                this.heightShouldBeChanged = false;
            }
            if (chatActivityEnterView.innerTextChange == 1) {
                return;
            }
            if (chatActivityEnterView.sendByEnter && !chatActivityEnterView.ctrlPressed && !chatActivityEnterView.shiftPressed && !chatActivityEnterView.ignoreTextChange && !chatActivityEnterView.isPaste && chatActivityEnterView.editingMessageObject == null && i3 > i2 && charSequence.length() > 0 && charSequence.length() == i + i3 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                this.nextChangeIsSend = true;
            }
            chatActivityEnterView.isPaste = false;
            chatActivityEnterView.checkSendButton(true);
            CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence.toString());
            if (chatActivityEnterView.delegate != null && !chatActivityEnterView.ignoreTextChange) {
                int i4 = i3 + 1;
                if (i2 > i4 || i3 - i2 > 2 || TextUtils.isEmpty(charSequence)) {
                    chatActivityEnterView.messageWebPageSearch = true;
                }
                chatActivityEnterView.delegate.onTextChanged(charSequence, i2 > i4 || i3 - i2 > 2, false);
            }
            if (chatActivityEnterView.innerTextChange != 2 && i3 - i2 > 1) {
                this.processChange = true;
            }
            if (chatActivityEnterView.editingMessageObject == null && !chatActivityEnterView.canWriteToChannel && trimmedString.length() != 0 && chatActivityEnterView.lastTypingTimeSend < System.currentTimeMillis() - 5000 && !chatActivityEnterView.ignoreTextChange) {
                chatActivityEnterView.lastTypingTimeSend = System.currentTimeMillis();
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.needSendTyping();
                }
            }
            chatActivityEnterView.updateSendButtonPaid();
        }
    }

    public final class AnonymousClass70 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatActivityEnterView this$0;
        public final int val$recordState;

        public AnonymousClass70(ChatActivityEnterView chatActivityEnterView, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = chatActivityEnterView;
            this.val$recordState = i;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ChatActivityEnterView chatActivityEnterView = this.this$0;
                    if (animator.equals(chatActivityEnterView.runningAnimationAudio)) {
                        int i = this.val$recordState;
                        if (i != 3 && chatActivityEnterView.messageEditText != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            chatActivityEnterView.messageEditText.requestFocus();
                        }
                        chatActivityEnterView.cancelRecordInterfaceInternal();
                        if (i != 3) {
                            ControlsView controlsView = chatActivityEnterView.controlsView;
                            if (controlsView != null) {
                                controlsView.setVisibility(8);
                            }
                            RecordCircle recordCircle = chatActivityEnterView.recordCircle;
                            if (recordCircle != null) {
                                recordCircle.setSendButtonInvisible();
                            }
                        }
                    }
                    break;
                case 1:
                    int i2 = this.val$recordState;
                    ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                    if (i2 == 0) {
                        chatActivityEnterView2.emojiPadding = 0;
                    }
                    chatActivityEnterView2.panelAnimation = null;
                    chatActivityEnterView2.botKeyboardView.setTranslationY(0.0f);
                    chatActivityEnterView2.botKeyboardView.setVisibility(8);
                    chatActivityEnterView2.notificationsLocker.unlock();
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView2.delegate;
                    if (chatActivityEnterViewDelegate != null) {
                        chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
                    }
                    chatActivityEnterView2.requestLayout();
                    break;
                default:
                    ChatActivityEnterView chatActivityEnterView3 = this.this$0;
                    chatActivityEnterView3.closeAnimationInProgress = false;
                    chatActivityEnterView3.stickersExpansionAnim = null;
                    AnonymousClass78 anonymousClass78 = chatActivityEnterView3.emojiView;
                    if (anonymousClass78 != null) {
                        if (chatActivityEnterView3.windowInsetsInAppController == null) {
                            anonymousClass78.getLayoutParams().height = this.val$recordState;
                        }
                        chatActivityEnterView3.emojiView.setLayerType(0, null);
                    }
                    SizeNotifierFrameLayout sizeNotifierFrameLayout = chatActivityEnterView3.sizeNotifierLayout;
                    if (sizeNotifierFrameLayout != null) {
                        sizeNotifierFrameLayout.requestLayout();
                        sizeNotifierFrameLayout.setForeground(null);
                        sizeNotifierFrameLayout.setWillNotDraw(false);
                    }
                    if (chatActivityEnterView3.keyboardVisible && chatActivityEnterView3.isPopupShowing()) {
                        chatActivityEnterView3.showPopup(0, chatActivityEnterView3.currentPopupContentType, true, true);
                    }
                    ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = chatActivityEnterView3.onEmojiSearchClosed;
                    if (chatActivityEnterView$$ExternalSyntheticLambda4 != null) {
                        chatActivityEnterView$$ExternalSyntheticLambda4.run();
                        chatActivityEnterView3.onEmojiSearchClosed = null;
                    }
                    chatActivityEnterView3.notificationsLocker.unlock();
                    break;
            }
        }
    }

    public final class AnonymousClass72 extends MessageObject {
        @Override
        public final boolean isOutOwner() {
            return true;
        }

        @Override
        public final boolean needDrawShareButton() {
            return false;
        }
    }

    public final class AnonymousClass75 extends BotKeyboardView {
        public AnonymousClass75(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.panelAnimation == null || chatActivityEnterView.animatingContentType != 1) {
                return;
            }
            chatActivityEnterView.delegate.bottomPanelTranslationYChanged(f);
        }
    }

    public final class AnonymousClass76 implements Runnable {
        public final long val$botId;
        public final TL_keyboard.KeyboardButtonProto val$button;
        public final MessageObject val$messageObject;
        public final MessageObject val$replyMessageObject;
        public final TLRPC.User val$user;

        public AnonymousClass76(MessageObject messageObject, long j, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
            this.val$messageObject = messageObject;
            this.val$botId = j;
            this.val$button = keyboardButtonProto;
            this.val$replyMessageObject = messageObject2;
            this.val$user = user;
        }

        @Override
        public final void run() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.sizeNotifierLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.isPopupShowing()) {
                chatActivityEnterView.hidePopup(false, false, true);
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                AndroidUtilities.runOnUIThread(this, 150L);
                return;
            }
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            if (chatActivity == null) {
                return;
            }
            int i = chatActivityEnterView.currentAccount;
            long j = this.val$messageObject.messageOwner.dialog_id;
            TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.val$button;
            String text = keyboardButtonProto.getText();
            String url = keyboardButtonProto.getUrl();
            boolean zIsType = TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
            MessageObject messageObject = this.val$replyMessageObject;
            WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, this.val$botId, text, url, zIsType ? 1 : 0, messageObject != null ? messageObject.messageOwner.id : 0, chatActivity == null ? 0L : chatActivity.getSendMonoForumPeerId(), null, false, null, null, 0, false, false);
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null && launchActivity.getBottomSheetTabs() != null && LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) != null) {
                BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
                if (botCommandsMenuView != null) {
                    botCommandsMenuView.setOpened(false);
                    return;
                }
                return;
            }
            TLRPC.User user = this.val$user;
            String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.currentAccount).getRestrictionReason(user.restriction_reason);
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(chatActivityEnterView.currentAccount);
                MessagesController.showCantOpenAlert(chatActivity, restrictionReason);
            } else {
                BotWebViewSheet botWebViewSheet = new BotWebViewSheet(chatActivityEnterView.getContext(), chatActivityEnterView.resourcesProvider);
                botWebViewSheet.parentActivity = chatActivityEnterView.parentActivity;
                botWebViewSheet.requestWebView(chatActivity, webViewRequestPropsOf);
                botWebViewSheet.show();
            }
        }
    }

    public final class AnonymousClass78 extends EmojiView {
        public AnonymousClass78(BaseFragment baseFragment, boolean z, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z2, Theme.ResourcesProvider resourcesProvider, boolean z3, boolean z4) {
            super(baseFragment, z, true, true, context, true, chatFull, viewGroup, z2, resourcesProvider, z3, z4);
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.panelAnimation == null || chatActivityEnterView.animatingContentType != 0) {
                return;
            }
            chatActivityEnterView.delegate.bottomPanelTranslationYChanged(f);
        }
    }

    public final class AnonymousClass79 implements EmojiView.EmojiViewDelegate {

        public final class AnonymousClass2 extends TrendingStickersAlert {
            public AnonymousClass2(Context context, BaseFragment baseFragment, TrendingStickersLayout trendingStickersLayout, Theme.ResourcesProvider resourcesProvider) {
                super(context, baseFragment, trendingStickersLayout, resourcesProvider);
            }

            @Override
            public final void lambda$showGiftOfferSheet$15() {
                super.lambda$showGiftOfferSheet$15();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.trendingStickersAlert == this) {
                    chatActivityEnterView.trendingStickersAlert = null;
                }
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.onTrendingStickersShowed(false);
                }
            }
        }

        public AnonymousClass79() {
        }

        @Override
        public final boolean canAddCaptionToGif() {
            return true;
        }

        @Override
        public final boolean canSchedule() {
            ChatActivity chatActivity = ChatActivityEnterView.this.parentFragment;
            return chatActivity != null && chatActivity.canScheduleMessage();
        }

        @Override
        public final long getDialogId() {
            return ChatActivityEnterView.this.dialog_id;
        }

        @Override
        public final float getProgressToSearchOpened() {
            return ChatActivityEnterView.this.searchToOpenProgress;
        }

        @Override
        public final int getThreadId() {
            return ChatActivityEnterView.this.getThreadMessageId();
        }

        @Override
        public final void invalidateEnterView() {
            ChatActivityEnterView.this.invalidate();
        }

        @Override
        public final boolean isExpanded() {
            return ChatActivityEnterView.this.stickersExpanded;
        }

        @Override
        public final boolean isInScheduleMode() {
            ChatActivity chatActivity = ChatActivityEnterView.this.parentFragment;
            return chatActivity != null && chatActivity.isInScheduleMode();
        }

        @Override
        public final boolean isSearchOpened() {
            return ChatActivityEnterView.this.searchingType != 0;
        }

        @Override
        public final boolean isUserSelf() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            return chatActivityEnterView.dialog_id == UserConfig.getInstance(chatActivityEnterView.currentAccount).getClientUserId();
        }

        @Override
        public final void onAnimatedEmojiUnlockClick() {
            BaseFragment lastFragment = ChatActivityEnterView.this.parentFragment;
            if (lastFragment == null) {
                lastFragment = LaunchActivity.getLastFragment();
            }
            lastFragment.showDialog(new PremiumFeatureBottomSheet(lastFragment, 11, false));
        }

        @Override
        public final boolean onBackspace() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            TextView textView = chatActivityEnterView.mOverrideEditTextView;
            if (textView == null) {
                textView = chatActivityEnterView.messageEditText;
            }
            if (textView == null || textView.length() == 0) {
                return false;
            }
            textView.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public final void onClearEmojiRecent() {
            Activity activity;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.parentFragment == null || (activity = chatActivityEnterView.parentActivity) == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, chatActivityEnterView.resourcesProvider);
            String string = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.ClearRecentEmojiText);
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ColorPicker$$ExternalSyntheticLambda6(this, 11));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            chatActivityEnterView.parentFragment.showDialog(alertDialog);
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            EditTextCaption editTextCaption = chatActivityEnterView.mOverrideEditTextView;
            if (editTextCaption == null) {
                editTextCaption = chatActivityEnterView.messageEditText;
            }
            AndroidUtilities.runOnUIThread(new GroupCallActivity$$ExternalSyntheticLambda88(this, editTextCaption, str, document, j, z));
        }

        @Override
        public final void onEmojiSelected(String str) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            EditText editText = chatActivityEnterView.mOverrideEditTextView;
            if (editText == null) {
                editText = chatActivityEnterView.messageEditText;
            }
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                chatActivityEnterView.innerTextChange = 2;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) str, editText.getPaint().getFontMetricsInt(), false, (int[]) null);
                editText.setText(editText.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                chatActivityEnterView.innerTextChange = 0;
            }
        }

        @Override
        public final void onEmojiSettingsClick(ArrayList arrayList) {
            ChatActivity chatActivity = ChatActivityEnterView.this.parentFragment;
            if (chatActivity != null) {
                chatActivity.presentFragment(new StickersActivity(5, arrayList));
            }
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            onGifSelected(view, obj, str, obj2, null, z, false, i, i2);
        }

        @Override
        public final void onGifSelectedForAddCaption(final TLObject tLObject, final Object obj) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.parentFragment == null) {
                return;
            }
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            photoViewer.setParentActivity(null, chatActivity, chatActivity.themeDelegate);
            File pathToAttach = tLObject instanceof TLRPC.Document ? FileLoader.getInstance(chatActivityEnterView.currentAccount).getPathToAttach((TLRPC.Document) tLObject) : null;
            if (pathToAttach == null) {
                return;
            }
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            if (!pathToAttach.exists()) {
                if (!file.exists()) {
                    return;
                } else {
                    pathToAttach = file;
                }
            }
            ArrayList arrayList = new ArrayList();
            final MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
            photoEntry.caption = null;
            photoEntry.isVideo = true;
            arrayList.add(photoEntry);
            PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 12, false, new PhotoViewer.PhotoViewerProvider() {
                public boolean isCaptionAbove;

                @Override
                public final boolean allowCaption() {
                    return true;
                }

                @Override
                public final boolean allowLivePhotos() {
                    return false;
                }

                @Override
                public final boolean allowSendingSubmenu() {
                    return true;
                }

                @Override
                public final boolean canCaptureMorePhotos() {
                    return false;
                }

                @Override
                public final boolean canEdit() {
                    return false;
                }

                @Override
                public final boolean canLoadMoreAvatars() {
                    return !false;
                }

                @Override
                public final boolean canMoveCaptionAbove() {
                    return true;
                }

                @Override
                public final boolean canReplace() {
                    return false;
                }

                @Override
                public final boolean canSchedule() {
                    return false;
                }

                @Override
                public final boolean canScrollAway() {
                    return false;
                }

                @Override
                public final boolean canSetTimer() {
                    return false;
                }

                @Override
                public final boolean cancelButtonPressed() {
                    return false;
                }

                @Override
                public final boolean closeKeyboard() {
                    return false;
                }

                @Override
                public final void deleteImageAtIndex(int i) {
                }

                @Override
                public final boolean forceAllInGroup() {
                    return false;
                }

                @Override
                public final String getDeleteMessageString() {
                    return "";
                }

                @Override
                public final long getDialogId() {
                    return 0L;
                }

                @Override
                public final MessageObject getEditingMessageObject() {
                    return null;
                }

                @Override
                public final int getPhotoIndex(int i) {
                    return 0;
                }

                @Override
                public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                    return null;
                }

                @Override
                public final int getSelectedCount() {
                    return 0;
                }

                @Override
                public final HashMap getSelectedPhotos() {
                    return null;
                }

                @Override
                public final ArrayList getSelectedPhotosOrder() {
                    return null;
                }

                @Override
                public final CharSequence getSubtitleFor(int i) {
                    return null;
                }

                @Override
                public final ImageReceiver.BitmapHolder getThumbForPhoto(int i) {
                    return null;
                }

                @Override
                public final CharSequence getTitleFor(int i) {
                    return null;
                }

                @Override
                public final int getTotalImageCount() {
                    return 0;
                }

                @Override
                public final boolean isCaptionAbove() {
                    return this.isCaptionAbove;
                }

                @Override
                public final boolean isEditingMessage() {
                    return false;
                }

                @Override
                public final boolean isEditingMessageResend() {
                    return false;
                }

                @Override
                public final boolean isEditingSticker() {
                    return false;
                }

                @Override
                public final boolean isPhotoChecked(int i) {
                    return false;
                }

                @Override
                public final boolean loadMore() {
                    return false;
                }

                @Override
                public final void moveCaptionAbove(boolean z) {
                    this.isCaptionAbove = z;
                }

                @Override
                public final void needAddMorePhotos() {
                }

                @Override
                public final void onApplyCaption(CharSequence charSequence) {
                }

                @Override
                public final void onClose() {
                }

                @Override
                public final boolean onDeletePhoto() {
                    return true;
                }

                @Override
                public final void onEditModeChanged() {
                }

                @Override
                public final void onOpen() {
                    CaptionContainerView.AnonymousClass3 anonymousClass3;
                    CaptionPhotoViewer captionView = PhotoViewer.getInstance().getCaptionView();
                    if (captionView == null || (anonymousClass3 = captionView.editText) == null) {
                        return;
                    }
                    EditTextEmoji.AnonymousClass2 anonymousClass2 = anonymousClass3.editText;
                    anonymousClass2.requestFocus();
                    AndroidUtilities.showKeyboard(anonymousClass2);
                }

                @Override
                public final void onPollAttachDelete() {
                }

                @Override
                public final void onPollAttachReplace() {
                }

                @Override
                public final void onPreClose() {
                }

                @Override
                public final void onReleasePlayerBeforeClose(int i) {
                }

                @Override
                public final void openPhotoForEdit(String str, String str2, boolean z) {
                }

                @Override
                public final void replaceButtonPressed(VideoEditedInfo videoEditedInfo) {
                }

                @Override
                public final boolean scaleToFill() {
                    return false;
                }

                @Override
                public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
                    boolean z3 = this.isCaptionAbove;
                    AnonymousClass79.this.onGifSelected(null, tLObject, null, obj, photoEntry, z, z3, i2, i3);
                }

                @Override
                public final int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
                    return 0;
                }

                @Override
                public final int setPhotoUnchecked(Object obj2) {
                    return 0;
                }

                @Override
                public final void updatePhotoAtIndex(int i) {
                }

                @Override
                public final void updatedLivePhotos() {
                }

                @Override
                public final void willHidePhotoViewer() {
                }

                @Override
                public final void willSwitchFromPhoto(int i) {
                }
            }, chatActivityEnterView.parentFragment);
        }

        @Override
        public final void onSearchOpenClose(int i) {
            int i2 = ChatActivityEnterView.$r8$clinit;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.setSearchingTypeInternal(i, true);
            if (i != 0) {
                chatActivityEnterView.setStickersExpanded(true, true, false, i == 1);
            }
            if (chatActivityEnterView.emojiTabOpen && chatActivityEnterView.searchingType == 2) {
                chatActivityEnterView.checkStickresExpandHeight();
            }
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            AnonymousClass2 anonymousClass2 = chatActivityEnterView.trendingStickersAlert;
            if (anonymousClass2 != null && !anonymousClass2.isDismissed()) {
                chatActivityEnterView.trendingStickersAlert.layout.showStickerSet(stickerSet, inputStickerSet);
                return;
            }
            BaseFragment lastFragment = chatActivityEnterView.parentFragment;
            if (lastFragment == null) {
                lastFragment = LaunchActivity.getLastFragment();
            }
            BaseFragment baseFragment = lastFragment;
            if (baseFragment == null || chatActivityEnterView.parentActivity == null) {
                return;
            }
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.id = stickerSet.id;
            }
            Theme.ResourcesProvider resourcesProvider = chatActivityEnterView.resourcesProvider;
            StickersAlert stickersAlert = new StickersAlert(chatActivityEnterView.parentActivity, baseFragment, inputStickerSet, null, chatActivityEnterView, resourcesProvider);
            baseFragment.showDialog(stickersAlert);
            if (z) {
                stickersAlert.enableEditMode();
            }
        }

        @Override
        public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
            View view;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.isLiveComment) {
                return;
            }
            AnonymousClass2 anonymousClass2 = chatActivityEnterView.trendingStickersAlert;
            if (anonymousClass2 != null) {
                anonymousClass2.lambda$showGiftOfferSheet$15();
                chatActivityEnterView.trendingStickersAlert = null;
            }
            if (chatActivityEnterView.slowModeTimer > 0 && !isInScheduleMode()) {
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    SlowModeBtn slowModeBtn = chatActivityEnterView.slowModeButton;
                    if (stickerEmojiCell == null) {
                        view = stickerEmojiCell;
                        view = slowModeBtn;
                    }
                    view = stickerEmojiCell;
                    chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn.textView.getText(), view, true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.stickersExpanded) {
                if (chatActivityEnterView.searchingType != 0) {
                    chatActivityEnterView.setSearchingTypeInternal(0, true);
                    chatActivityEnterView.emojiView.closeSearch(MessageObject.getStickerSetId(document), true);
                    chatActivityEnterView.emojiView.hideSearchKeyboard();
                }
                chatActivityEnterView.setStickersExpanded(false, true, false, true);
            }
            ChatActivityEnterView.this.onStickerSelected(document, str, obj, sendAnimationData, false, z, i, 0);
            if (DialogObject.isEncryptedDialog(chatActivityEnterView.dialog_id) && MessageObject.isGifDocument(document)) {
                chatActivityEnterView.accountInstance.getMessagesController().saveGif(obj, document);
            }
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            MediaDataController.getInstance(chatActivityEnterView.currentAccount).toggleStickerSet(chatActivityEnterView.parentActivity, stickerSetCovered, 2, chatActivityEnterView.parentFragment, false, false);
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            MediaDataController.getInstance(chatActivityEnterView.currentAccount).toggleStickerSet(chatActivityEnterView.parentActivity, stickerSetCovered, 0, chatActivityEnterView.parentFragment, false, false);
        }

        @Override
        public final void onStickersGroupClick(long j) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.parentFragment != null) {
                if (AndroidUtilities.isTablet()) {
                    chatActivityEnterView.hidePopup(false, false, true);
                }
                GroupStickersActivity groupStickersActivity = new GroupStickersActivity(j);
                groupStickersActivity.setInfo(chatActivityEnterView.info);
                chatActivityEnterView.parentFragment.presentFragment(groupStickersActivity);
            }
        }

        @Override
        public final void onStickersSettingsClick() {
            ChatActivity chatActivity = ChatActivityEnterView.this.parentFragment;
            if (chatActivity != null) {
                chatActivity.presentFragment(new StickersActivity(0, null));
            }
        }

        @Override
        public final void onTabOpened(int i) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.delegate.onEmojiViewTabChanged();
            chatActivityEnterView.delegate.onStickersTab(i == 3);
            chatActivityEnterView.post(chatActivityEnterView.updateExpandabilityRunnable);
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            BaseFragment lastFragment = chatActivityEnterView.parentFragment;
            if (lastFragment == null) {
                lastFragment = LaunchActivity.getLastFragment();
            }
            BaseFragment baseFragment = lastFragment;
            if (baseFragment != null) {
                chatActivityEnterView.trendingStickersAlert = new AnonymousClass2(chatActivityEnterView.getContext(), baseFragment, trendingStickersLayout, chatActivityEnterView.resourcesProvider);
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.onTrendingStickersShowed(true);
                }
                baseFragment.showDialog(chatActivityEnterView.trendingStickersAlert);
            }
        }

        public final void onGifSelected(View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z, boolean z2, int i, int i2) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            ChatActivity.ReplyQuote replyQuote = chatActivityEnterView.replyingQuote;
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            if (replyQuote != null && chatActivity != null && replyQuote.outdated) {
                chatActivity.showQuoteMessageUpdate();
                return;
            }
            if (isInScheduleMode() && i == 0) {
                AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, chatActivity.getDialogId(), -1L, 0, new ChatUsersActivity$$ExternalSyntheticLambda26(this, view, obj, str, obj2, photoEntry, z2), null, chatActivityEnterView.resourcesProvider);
                return;
            }
            if (chatActivityEnterView.slowModeTimer <= 0 || isInScheduleMode()) {
                AlertsCreator.ensurePaidMessageConfirmation(chatActivityEnterView.currentAccount, chatActivityEnterView.dialog_id, 1, new ChatActivityEnterView$$ExternalSyntheticLambda88(this, obj, photoEntry, z, i, i2, z2, str, obj2), 0L);
                return;
            }
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate != null) {
                SlowModeBtn slowModeBtn = chatActivityEnterView.slowModeButton;
                chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn.textView.getText(), view != null ? view : slowModeBtn, true);
            }
        }
    }

    public final class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override
        public final void run() {
            Activity activity;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate == null || (activity = chatActivityEnterView.parentActivity) == null) {
                return;
            }
            chatActivityEnterViewDelegate.onPreAudioVideoRecord();
            chatActivityEnterView.calledRecordRunnable = true;
            chatActivityEnterView.recordAudioVideoRunnableStarted = false;
            SlideTextView slideTextView = chatActivityEnterView.slideText;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.slideText.setTranslationY(0.0f);
            }
            chatActivityEnterView.audioToSendPath = null;
            chatActivityEnterView.audioToSend = null;
            if (!chatActivityEnterView.isInVideoMode) {
                if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                    return;
                }
                chatActivityEnterView.delegate.needStartRecordAudio(1);
                chatActivityEnterView.startedDraggingX = -1.0f;
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = chatActivityEnterView.delegate;
                TL_stories.StoryItem replyToStory = chatActivityEnterViewDelegate2 != null ? chatActivityEnterViewDelegate2.getReplyToStory() : null;
                MediaController mediaController = MediaController.getInstance();
                int i = chatActivityEnterView.currentAccount;
                long j = chatActivityEnterView.dialog_id;
                MessageObject messageObject = chatActivityEnterView.replyingMessageObject;
                MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
                int i2 = chatActivityEnterView.recordingGuid;
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                mediaController.startRecording(i, j, messageObject, threadMessage, replyToStory, i2, true, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.recordingAudioVideo = true;
                chatActivityEnterView.updateRecordInterface(0, true);
                TimerView timerView = chatActivityEnterView.recordTimerView;
                if (timerView != null) {
                    timerView.isRunning = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    timerView.startTime = jCurrentTimeMillis;
                    timerView.lastSendTypingTime = jCurrentTimeMillis;
                    timerView.invalidate();
                }
                RecordDot recordDot = chatActivityEnterView.recordDot;
                if (recordDot != null) {
                    recordDot.enterAnimation = false;
                }
                chatActivityEnterView.audioVideoButtonContainer.getParent().requestDisallowInterceptTouchEvent(true);
                RecordCircle recordCircle = chatActivityEnterView.recordCircle;
                if (recordCircle != null) {
                    recordCircle.wavesEnterAnimation = 1.0f;
                    recordCircle.showWaves = true;
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                boolean z = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
                boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
                if (!z || !z2) {
                    String[] strArr = new String[(z || z2) ? 1 : 2];
                    if (!z && !z2) {
                        strArr[0] = "android.permission.RECORD_AUDIO";
                        strArr[1] = "android.permission.CAMERA";
                    } else if (z) {
                        strArr[0] = "android.permission.CAMERA";
                    } else {
                        strArr[0] = "android.permission.RECORD_AUDIO";
                    }
                    activity.requestPermissions(strArr, 150);
                    return;
                }
            }
            boolean zIsCameraInitied = CameraController.getInstance().isCameraInitied();
            AnonymousClass2 anonymousClass2 = chatActivityEnterView.onFinishInitCameraRunnable;
            if (zIsCameraInitied) {
                anonymousClass2.run();
            } else {
                CameraController.getInstance().initCamera(anonymousClass2);
            }
            if (chatActivityEnterView.recordingAudioVideo) {
                return;
            }
            chatActivityEnterView.recordingAudioVideo = true;
            chatActivityEnterView.updateRecordInterface(0, true);
            RecordCircle recordCircle2 = chatActivityEnterView.recordCircle;
            if (recordCircle2 != null) {
                recordCircle2.wavesEnterAnimation = 0.5f;
                recordCircle2.showWaves = false;
            }
            TimerView timerView2 = chatActivityEnterView.recordTimerView;
            if (timerView2 != null) {
                timerView2.isRunning = false;
                timerView2.startTime = 0L;
                timerView2.stopTime = 0L;
                timerView2.stoppedInternal = false;
            }
        }
    }

    public final class AnonymousClass80 implements EmojiView.DragListener {
        public int initialOffset;
        public boolean wasExpanded;

        public AnonymousClass80() {
        }

        public final boolean allowDragging() {
            EmojiView.StickersGridAdapter stickersGridAdapter;
            AnonymousClass50 anonymousClass50;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.stickersTabOpen) {
                return (chatActivityEnterView.stickersExpanded || (anonymousClass50 = chatActivityEnterView.messageEditText) == null || anonymousClass50.length() <= 0) && (stickersGridAdapter = chatActivityEnterView.emojiView.stickersGridAdapter) != null && stickersGridAdapter.getItemCount() > 0 && !chatActivityEnterView.waitingForKeyboardOpen;
            }
            return false;
        }

        public final void onDragStart() {
            if (allowDragging()) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                AnimatorSet animatorSet = chatActivityEnterView.stickersExpansionAnim;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                chatActivityEnterView.stickersDragging = true;
                this.wasExpanded = chatActivityEnterView.stickersExpanded;
                chatActivityEnterView.stickersExpanded = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                SizeNotifierFrameLayout sizeNotifierFrameLayout = chatActivityEnterView.sizeNotifierLayout;
                int height = ((((sizeNotifierFrameLayout.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - ActionBar.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
                chatActivityEnterView.stickersExpandedHeight = height;
                if (chatActivityEnterView.searchingType == 2) {
                    int iDp = AndroidUtilities.dp(175.0f);
                    Point point = AndroidUtilities.displaySize;
                    chatActivityEnterView.stickersExpandedHeight = Math.min(height, iDp + (point.x > point.y ? chatActivityEnterView.keyboardHeightLand : chatActivityEnterView.keyboardHeight));
                }
                if (chatActivityEnterView.windowInsetsInAppController == null) {
                    chatActivityEnterView.emojiView.getLayoutParams().height = chatActivityEnterView.stickersExpandedHeight;
                }
                chatActivityEnterView.emojiView.setLayerType(2, null);
                sizeNotifierFrameLayout.requestLayout();
                if (chatActivityEnterView.shouldDrawBackground) {
                    sizeNotifierFrameLayout.setForeground(new CanvasButton.AnonymousClass2(chatActivityEnterView));
                }
                this.initialOffset = (int) chatActivityEnterView.getTranslationY();
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.onStickersExpandedChange();
                }
            }
        }
    }

    public final class BusinessLinkPresetMessage {
        public ArrayList entities;
        public String text;
    }

    public abstract class ChatActivityEditTextCaption extends EditTextCaption {
        public CanvasButton canvasButton;

        public ChatActivityEditTextCaption(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            int i;
            boolean z = false;
            if (ChatActivityEnterView.this.preventInput) {
                return false;
            }
            if (keyEvent.getAction() == 0 && keyEvent.isCtrlPressed() && !keyEvent.isAltPressed()) {
                if (keyEvent.isShiftPressed()) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 41) {
                        i = 4;
                    } else if (keyCode == 44) {
                        i = 256;
                    } else if (keyCode == 47 || keyCode == 52) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                } else {
                    int keyCode2 = keyEvent.getKeyCode();
                    if (keyCode2 == 30) {
                        i = 1;
                    } else if (keyCode2 == 33) {
                        i = 4;
                    } else if (keyCode2 == 37) {
                        i = 2;
                    } else if (keyCode2 == 39) {
                        i = 0;
                        z = true;
                    } else if (keyCode2 != 49) {
                        i = 0;
                    } else {
                        i = 16;
                    }
                }
                if ((z || i != 0) && getSelectionStart() != getSelectionEnd()) {
                    if (z) {
                        makeSelectedUrl();
                        return true;
                    }
                    toggleStyleForSelection(i);
                    return true;
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        public final void editPhoto(Uri uri, String str) {
            ChatActivity chatActivity = ChatActivityEnterView.this.parentFragment;
            Utilities.globalQueue.postRunnable(new FilterGLThread$$ExternalSyntheticLambda1(this, uri, AndroidUtilities.generatePicturePath(chatActivity != null && chatActivity.isSecretChat(), MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 3));
        }

        @Override
        public final void extendActionMode(ActionMode actionMode, Menu menu) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            if (chatActivity != null) {
                chatActivity.extendActionMode(menu);
            } else {
                chatActivityEnterView.extendActionMode$1(menu);
            }
        }

        @Override
        public final Theme.ResourcesProvider getResourcesProvider() {
            return ChatActivityEnterView.this.resourcesProvider;
        }

        @Override
        public final void onContextMenuClose() {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onContextMenuClose();
            }
        }

        @Override
        public final void onContextMenuOpen() {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onContextMenuOpen();
            }
        }

        @Override
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (inputConnectionOnCreateInputConnection == null) {
                return null;
            }
            try {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                int i = ChatActivityEnterView.$r8$clinit;
                if (chatActivityEnterView.editingBusinessLink == null && !chatActivityEnterView.isLiveComment) {
                    EditorInfoCompat.setContentMimeTypes(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                } else {
                    EditorInfoCompat.setContentMimeTypes(editorInfo, null);
                }
                return EditorInfoCompat.createWrapper(inputConnectionOnCreateInputConnection, editorInfo, new ColorPicker$$ExternalSyntheticLambda6(this, 12));
            } catch (Throwable th) {
                FileLog.e(th);
                return inputConnectionOnCreateInputConnection;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            boolean z = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.isInitLineCount = z;
            super.onMeasure(i, i2);
            if (chatActivityEnterView.isInitLineCount) {
                chatActivityEnterView.lineCount = getLineCount();
                chatActivityEnterView.showAiButton(chatActivityEnterView.lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
                chatActivityEnterView.showRichButton(chatActivityEnterView.lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim()));
            }
            chatActivityEnterView.isInitLineCount = false;
        }

        @Override
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onEditTextScroll();
            }
        }

        @Override
        public final void onSelectionChanged(int i, int i2) {
            super.onSelectionChanged(i, i2);
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = ChatActivityEnterView.this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onTextSelectionChanged(i, i2);
            }
        }

        @Override
        public boolean onTextContextMenuItem(int i) {
            if (i == 16908322) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.isPaste = true;
                ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.editingBusinessLink == null) {
                    editPhoto(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
                }
            }
            return super.onTextContextMenuItem(i);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!chatActivityEnterView.stickersDragging && chatActivityEnterView.stickersExpansionAnim == null) {
                if (!chatActivityEnterView.sendPlainEnabled && !chatActivityEnterView.isEditingMessage()) {
                    if (this.canvasButton == null) {
                        CanvasButton canvasButton = new CanvasButton(this);
                        this.canvasButton = canvasButton;
                        final int i = 0;
                        canvasButton.delegate = new Runnable(this) {
                            public final ChatActivityEnterView.ChatActivityEditTextCaption f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                ChatActivityEnterView.ChatActivityEditTextCaption chatActivityEditTextCaption = this.f$0;
                                switch (i) {
                                    case 0:
                                        chatActivityEditTextCaption.getClass();
                                        int i2 = ChatActivityEnterView.$r8$clinit;
                                        ChatActivityEnterView.this.showRestrictedHint();
                                        break;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                                        chatActivityEnterView2.waitingForKeyboardOpenAfterAnimation = false;
                                        chatActivityEnterView2.openKeyboardInternal();
                                        break;
                                }
                            }
                        };
                    }
                    CanvasButton canvasButton2 = this.canvasButton;
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    canvasButton2.getClass();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f = 0;
                    rectF.set(f, f, measuredWidth, measuredHeight);
                    canvasButton2.pathCreated = false;
                    canvasButton2.usingRectCount = 0;
                    canvasButton2.addRect(rectF);
                    return this.canvasButton.checkTouchEvent(motionEvent);
                }
                if (chatActivityEnterView.isPopupShowing() && motionEvent.getAction() == 0) {
                    if (chatActivityEnterView.searchingType != 0) {
                        chatActivityEnterView.setSearchingTypeInternal(0, false);
                        chatActivityEnterView.emojiView.closeSearch(-1L, false);
                        requestFocus();
                    }
                    chatActivityEnterView.showPopup(AndroidUtilities.usingHardwareInput ? 0 : 2, 0, true, true);
                    if (!chatActivityEnterView.stickersExpanded) {
                        chatActivityEnterView.openKeyboardInternal();
                        return true;
                    }
                    chatActivityEnterView.setStickersExpanded(false, true, false, true);
                    chatActivityEnterView.waitingForKeyboardOpenAfterAnimation = true;
                    final int i2 = 1;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ChatActivityEnterView.ChatActivityEditTextCaption f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            ChatActivityEnterView.ChatActivityEditTextCaption chatActivityEditTextCaption = this.f$0;
                            switch (i2) {
                                case 0:
                                    chatActivityEditTextCaption.getClass();
                                    int i3 = ChatActivityEnterView.$r8$clinit;
                                    ChatActivityEnterView.this.showRestrictedHint();
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                                    chatActivityEnterView2.waitingForKeyboardOpenAfterAnimation = false;
                                    chatActivityEnterView2.openKeyboardInternal();
                                    break;
                            }
                        }
                    }, 200L);
                    return true;
                }
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return false;
        }

        public final void openPhotoViewerForEdit(final File file, ArrayList arrayList) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            ChatActivity chatActivity = chatActivityEnterView.parentFragment;
            if (chatActivity == null || chatActivity.getParentActivity() == null) {
                return;
            }
            final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.keyboardVisible) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new zzbp(this, arrayList, file, 13), 100L);
            } else {
                PhotoViewer.getInstance().setParentActivity(null, chatActivityEnterView.parentFragment, chatActivityEnterView.resourcesProvider);
                PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 2, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                    public boolean sending;

                    @Override
                    public final boolean canCaptureMorePhotos() {
                        return false;
                    }

                    @Override
                    public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
                        String str;
                        ChatActivity chatActivity2;
                        ChatActivityEditTextCaption chatActivityEditTextCaption = ChatActivityEditTextCaption.this;
                        ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                        ChatActivity.ReplyQuote replyQuote = chatActivityEnterView2.replyingQuote;
                        if (replyQuote != null && (chatActivity2 = chatActivityEnterView2.parentFragment) != null && replyQuote.outdated) {
                            chatActivity2.showQuoteMessageUpdate();
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        MediaController.PhotoEntry photoEntry2 = photoEntry;
                        if (photoEntry2.isVideo || (str = photoEntry2.imagePath) == null) {
                            String str2 = photoEntry2.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                        }
                        sendingMediaInfo.thumbPath = photoEntry2.thumbPath;
                        sendingMediaInfo.isLivePhoto = photoEntry2.isLivePhoto();
                        sendingMediaInfo.isVideo = photoEntry2.isVideo;
                        sendingMediaInfo.discardLivePhoto = photoEntry2.isUnalivePhoto();
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry2.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry2.livePhotoTimestampUs;
                        CharSequence charSequence = photoEntry2.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = photoEntry2.entities;
                        sendingMediaInfo.masks = photoEntry2.stickers;
                        sendingMediaInfo.ttl = photoEntry2.ttl;
                        sendingMediaInfo.videoEditedInfo = videoEditedInfo;
                        sendingMediaInfo.canDeleteAfter = true;
                        arrayList2.add(sendingMediaInfo);
                        photoEntry2.reset();
                        this.sending = true;
                        boolean zCheckUpdateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(sendingMediaInfo.caption);
                        ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                        AccountInstance accountInstance = chatActivityEnterView3.accountInstance;
                        MessageSuggestionParams messageSuggestionParams = null;
                        long j = chatActivityEnterView3.dialog_id;
                        MessageObject messageObject = chatActivityEnterView3.replyingMessageObject;
                        MessageObject threadMessage = chatActivityEnterView3.getThreadMessage();
                        ChatActivity.ReplyQuote replyQuote2 = chatActivityEnterView3.replyingQuote;
                        MessageObject messageObject2 = chatActivityEnterView3.editingMessageObject;
                        ChatActivity chatActivity3 = chatActivityEnterView3.parentFragment;
                        int i4 = chatActivity3 == null ? 0 : chatActivity3.chatMode;
                        SendMessageChatArguments messageChatSendParams = chatActivity3 != null ? chatActivity3.getMessageChatSendParams() : null;
                        long sendMonoForumPeerId = chatActivityEnterView3.getSendMonoForumPeerId();
                        ChatActivity chatActivity4 = chatActivityEnterView3.parentFragment;
                        if (chatActivity4 != null) {
                            messageSuggestionParams = chatActivity4.messageSuggestionParams;
                        }
                        SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList2, j, messageObject, threadMessage, null, replyQuote2, false, false, messageObject2, z, i2, i3, i4, zCheckUpdateStickersOrder, null, messageChatSendParams, 0L, false, 0L, sendMonoForumPeerId, messageSuggestionParams);
                        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView3.delegate;
                        if (chatActivityEnterViewDelegate != null) {
                            chatActivityEnterViewDelegate.onMessageSend(null, true, i2, i3, 0L);
                        }
                    }

                    @Override
                    public final void willHidePhotoViewer() {
                        if (this.sending) {
                            return;
                        }
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }, chatActivityEnterView.parentFragment);
            }
        }

        @Override
        public final boolean requestFocus(int i, Rect rect) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!chatActivityEnterView.sendPlainEnabled && !chatActivityEnterView.isEditingMessage()) {
                return false;
            }
            chatActivityEnterView.getClass();
            return super.requestFocus(i, rect);
        }

        @Override
        public final boolean requestRectangleOnScreen(Rect rect) {
            rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
            return super.requestRectangleOnScreen(rect);
        }

        public final void send(InputContentInfoCompat inputContentInfoCompat, boolean z, int i, int i2) {
            ChatActivityEnterView chatActivityEnterView;
            ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
            ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatActivityEnterView2.messageSendPreview;
            if (anonymousClass25 != null) {
                anonymousClass25.sent = true;
                anonymousClass25.dismiss();
                chatActivityEnterView2.messageSendPreview = null;
            }
            ChatActivity.ReplyQuote replyQuote = chatActivityEnterView2.replyingQuote;
            ChatActivity chatActivity = chatActivityEnterView2.parentFragment;
            if (replyQuote != null && chatActivity != null && replyQuote.outdated) {
                chatActivity.showQuoteMessageUpdate();
                return;
            }
            boolean zHasMimeType = inputContentInfoCompat.mImpl.getDescription().hasMimeType("image/gif");
            InputContentInfoCompat.InputContentInfoCompatImpl inputContentInfoCompatImpl = inputContentInfoCompat.mImpl;
            if (zHasMimeType) {
                AccountInstance accountInstance = chatActivityEnterView2.accountInstance;
                SendMessageChatArguments messageChatSendParams = null;
                Uri contentUri = inputContentInfoCompatImpl.getContentUri();
                long j = chatActivityEnterView2.dialog_id;
                MessageObject messageObject = chatActivityEnterView2.replyingMessageObject;
                MessageObject threadMessage = chatActivityEnterView2.getThreadMessage();
                ChatActivity.ReplyQuote replyQuote2 = chatActivityEnterView2.replyingQuote;
                if (chatActivity != null) {
                    messageChatSendParams = chatActivity.getMessageChatSendParams();
                }
                SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, contentUri, null, "image/gif", j, messageObject, threadMessage, null, replyQuote2, null, z, 0, inputContentInfoCompat, messageChatSendParams, false);
                chatActivityEnterView = chatActivityEnterView2;
            } else {
                SendMessageChatArguments messageChatSendParams2 = null;
                AccountInstance accountInstance2 = chatActivityEnterView2.accountInstance;
                Uri contentUri2 = inputContentInfoCompatImpl.getContentUri();
                long j2 = chatActivityEnterView2.dialog_id;
                MessageObject messageObject2 = chatActivityEnterView2.replyingMessageObject;
                MessageObject threadMessage2 = chatActivityEnterView2.getThreadMessage();
                ChatActivity.ReplyQuote replyQuote3 = chatActivityEnterView2.replyingQuote;
                int i3 = chatActivity == null ? 0 : chatActivity.chatMode;
                if (chatActivity != null) {
                    messageChatSendParams2 = chatActivity.getMessageChatSendParams();
                }
                SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, contentUri2, j2, messageObject2, threadMessage2, replyQuote3, null, null, null, inputContentInfoCompat, 0, null, z, 0, i3, messageChatSendParams2);
                chatActivityEnterView = chatActivityEnterView2;
            }
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onMessageSend(null, true, i, i2, 0L);
            }
        }

        @Override
        public void setOffsetY(float f) {
            super.setOffsetY(f);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.sizeNotifierLayout.getForeground() != null) {
                SizeNotifierFrameLayout sizeNotifierFrameLayout = chatActivityEnterView.sizeNotifierLayout;
                sizeNotifierFrameLayout.invalidateDrawable(sizeNotifierFrameLayout.getForeground());
            }
        }
    }

    public interface ChatActivityEnterViewDelegate {
        void bottomPanelTranslationYChanged(float f);

        boolean checkCanRemoveRestrictionsByBoosts();

        void didPressAttachButton();

        void didPressStreamingStop();

        void didPressSuggestionButton();

        int getContentViewHeight();

        TLRPC.Peer getDefaultSendAs();

        ChatActivity.ReplyQuote getReplyQuote();

        TL_stories.StoryItem getReplyToStory();

        TLRPC.TL_channels_sendAsPeers getSendAsPeers();

        boolean hasForwardingMessages();

        boolean hasScheduledMessages();

        boolean isVideoRecordingPaused();

        int measureKeyboardHeight();

        void needChangeVideoPreviewState(float f, int i);

        void needSendTyping();

        void needShowMediaBanHint();

        void needStartRecordAudio(int i);

        void needStartRecordVideo(int i, int i2, int i3, long j, long j2, boolean z);

        void onAttachButtonHidden();

        void onAttachButtonShow();

        void onAudioVideoInterfaceUpdated();

        void onContextMenuClose();

        void onContextMenuOpen();

        void onEditTextScroll();

        void onEmojiViewTabChanged();

        void onKeyboardRequested();

        void onMessageEditEnd();

        void onMessageSend(CharSequence charSequence, boolean z, int i, int i2, long j);

        void onPreAudioVideoRecord();

        void onSendLongClick();

        void onStickersExpandedChange();

        void onStickersTab(boolean z);

        void onSwitchRecordMode(boolean z);

        void onTextChanged(CharSequence charSequence, boolean z, boolean z2);

        void onTextSelectionChanged(int i, int i2);

        void onTextSpansChanged(CharSequence charSequence);

        void onTrendingStickersShowed(boolean z);

        void onUpdateSlowModeButton(CharSequence charSequence, View view, boolean z);

        void onWindowSizeChanged(int i);

        boolean onceVoiceAvailable();

        void openScheduledMessages();

        void prepareMessageSending();

        void scrollToSendingMessage();

        boolean setDefaultSendAs(long j);

        void toggleVideoRecordingPause();
    }

    public final class ControlsView extends FrameLayout {
        public BlurredBackgroundColorProviderThemed colorProvider;
        public final AnimatedFloat hidePauseT;
        public int lastSize;
        public long lastUpdateTime;
        public BlurredBackgroundDrawable lockBackgroundDrawable;
        public final Paint lockBackgroundPaint;
        public final Paint lockOutlinePaint;
        public final Paint lockPaint;
        public final Drawable micDrawable;
        public HintView2 onceHint;
        public boolean oncePressed;
        public final RectF onceRect;
        public final Paint p;
        public final Path path;
        public final Path path2;
        public HintView2 pauseHint;
        public boolean pausePressed;
        public BlurredBackgroundDrawable periodBackgroundDrawable;
        public final CaptionContainerView.PeriodDrawable periodDrawable;
        public final float[] radiiLeft;
        public final float[] radiiRight;
        public final RectF rectF;
        public ShapeDrawable tooltipBackground;
        public final Drawable tooltipBackgroundArrow;
        public StaticLayout tooltipLayout;
        public final String tooltipMessage;
        public final TextPaint tooltipPaint;
        public float tooltipWidth;
        public boolean useGlassDesign;
        public final Drawable vidDrawable;
        public final VirtualViewHelper virtualViewHelper;

        public final class VirtualViewHelper extends ExploreByTouchHelper {
            public VirtualViewHelper(ControlsView controlsView) {
                super(controlsView);
            }

            @Override
            public final int getVirtualViewAt(float f, float f2) {
                ControlsView controlsView = ControlsView.this;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.sendButtonVisible && chatActivityEnterView.recordCircle != null && chatActivityEnterView.pauseRect.contains(f, f2)) {
                    return 2;
                }
                ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                return (!chatActivityEnterView2.onceVisible || chatActivityEnterView2.recordCircle == null || chatActivityEnterView2.snapAnimationProgress <= 0.1f || !controlsView.onceRect.contains(f, f2)) ? -1 : 4;
            }

            @Override
            public final void getVisibleVirtualViews(ArrayList arrayList) {
                ControlsView controlsView = ControlsView.this;
                if (ChatActivityEnterView.this.sendButtonVisible) {
                    arrayList.add(2);
                }
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (!chatActivityEnterView.onceVisible || chatActivityEnterView.recordCircle == null || chatActivityEnterView.snapAnimationProgress <= 0.1f) {
                    return;
                }
                arrayList.add(4);
            }

            @Override
            public final boolean onPerformActionForVirtualView(int i, int i2) {
                return true;
            }

            @Override
            public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                ControlsView controlsView = ControlsView.this;
                if (i == 2) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    Rect rect = chatActivityEnterView.rect;
                    RectF rectF = chatActivityEnterView.pauseRect;
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    accessibilityNodeInfoCompat.setBoundsInParent(chatActivityEnterView2.rect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString(chatActivityEnterView2.transformToSeekbar > 0.5f ? R.string.AccActionResume : R.string.AccActionPause));
                    return;
                }
                if (i == 4) {
                    Rect rect2 = ChatActivityEnterView.this.rect;
                    RectF rectF2 = controlsView.onceRect;
                    rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                    accessibilityNodeInfoCompat.setBoundsInParent(chatActivityEnterView3.rect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString(chatActivityEnterView3.voiceOnce ? R.string.AccActionOnceDeactivate : R.string.AccActionOnceActivate));
                }
            }
        }

        public ControlsView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.tooltipPaint = textPaint;
            this.lockBackgroundPaint = new Paint(1);
            this.lockPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.lockOutlinePaint = paint;
            this.path = new Path();
            this.p = new Paint(1);
            this.rectF = new RectF();
            this.onceRect = new RectF();
            this.path2 = new Path();
            this.radiiLeft = new float[]{fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f, fDp, fDp};
            this.radiiRight = new float[]{0.0f, 0.0f, fDp, fDp, fDp, fDp, 0.0f, 0.0f};
            this.hidePauseT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            VirtualViewHelper virtualViewHelper = new VirtualViewHelper(this);
            this.virtualViewHelper = virtualViewHelper;
            ViewCompat.setAccessibilityDelegate(this, virtualViewHelper);
            CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable(5);
            this.periodDrawable = periodDrawable;
            periodDrawable.setCallback(this);
            periodDrawable.setValue(1, ChatActivityEnterView.this.voiceOnce, false);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
            Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
            ChatActivityEnterView.this.lockShadowDrawable = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(ChatActivityEnterView.this.getThemedColor$6(Theme.key_chat_messagePanelVoiceLockShadow), PorterDuff.Mode.MULTIPLY));
            this.tooltipBackground = Theme.createRoundRectDrawable(AndroidUtilities.dp(5.0f), ChatActivityEnterView.this.getThemedColor$6(Theme.key_chat_gifSaveHintBackground));
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.tooltipBackgroundArrow = context.getDrawable(R.drawable.tooltip_arrow);
            this.tooltipMessage = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
            float fDp = AndroidUtilities.dp(3.0f);
            float fDp2 = AndroidUtilities.dp(3.0f);
            this.micDrawable = getResources().getDrawable(R.drawable.input_mic).mutate();
            this.vidDrawable = getResources().getDrawable(R.drawable.input_video).mutate();
            setWillNotDraw(false);
            updateColors();
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.virtualViewHelper.dispatchHoverEvent(motionEvent);
        }

        public final void hideHintView() {
            HintView2 hintView2 = this.pauseHint;
            if (hintView2 != null) {
                hintView2.onHidden = new ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda3(this, hintView2, 1);
                hintView2.hide(true);
                this.pauseHint = null;
            }
            HintView2 hintView3 = this.onceHint;
            if (hintView3 != null) {
                hintView3.onHidden = new ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda3(this, hintView3, 2);
                hintView3.hide(true);
                this.onceHint = null;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float fMax;
            float fDp;
            float fDp2;
            float fDpf2;
            float fM;
            float f2;
            float f3;
            float f4;
            float f5;
            boolean z;
            float f6;
            float fM2;
            float interpolation;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float fDpf3;
            float f12;
            float fM3;
            float f13;
            float f14;
            BlurredBackgroundDrawable blurredBackgroundDrawable;
            Paint paint;
            HintView2 hintView2;
            float f15;
            float f16;
            float fCenterX;
            float fCenterY;
            float fClamp;
            Paint paint2;
            Canvas canvas2;
            Paint paint3;
            float f17;
            Drawable drawable;
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
            boolean z2;
            HintView2 hintView3;
            BlurredBackgroundDrawable blurredBackgroundDrawable2;
            float f18;
            int i;
            Drawable drawable2;
            float f19;
            float f20;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f21 = chatActivityEnterView.scale;
            if (f21 <= 0.5f) {
                f = f21 / 0.5f;
            } else {
                f = f21 <= 0.75f ? 1.0f - (((f21 - 0.5f) / 0.25f) * 0.1f) : (((f21 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            this.lastUpdateTime = System.currentTimeMillis();
            float f22 = chatActivityEnterView.lockAnimatedTranslation;
            if (f22 != 10000.0f) {
                fMax = Math.max(0, (int) (chatActivityEnterView.startTranslation - f22));
                if (fMax > AndroidUtilities.dp(57.0f)) {
                    fMax = AndroidUtilities.dp(57.0f);
                }
            } else {
                fMax = 0.0f;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            float fDp3 = 1.0f - (fMax / AndroidUtilities.dp(57.0f));
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(194.0f);
            if (chatActivityEnterView.sendButtonVisible) {
                fDp = AndroidUtilities.dp(36.0f);
                fDp2 = (AndroidUtilities.dpf2(14.0f) * fDp3) + ((((1.0f - f) * AndroidUtilities.dpf2(30.0f)) + (AndroidUtilities.dp(60.0f) + measuredHeight)) - fMax);
                fDpf2 = AndroidUtilities.dpf2(2.0f) + (((fDp / 2.0f) + fDp2) - AndroidUtilities.dpf2(8.0f));
                AndroidUtilities.dpf2(16.0f);
                AndroidUtilities.dpf2(2.0f);
                float f23 = fDp3 > 0.4f ? 1.0f : fDp3 / 0.4f;
                float f24 = chatActivityEnterView.snapAnimationProgress;
                fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, f23, f24 * 15.0f, (1.0f - f24) * (1.0f - fDp3) * 9.0f);
                f2 = fDp3;
            } else {
                fDp = AndroidUtilities.dp(36.0f) + ((int) (AndroidUtilities.dp(14.0f) * fDp3));
                fDp2 = (chatActivityEnterView.idleProgress * fDp3 * (-AndroidUtilities.dp(8.0f))) + (((AndroidUtilities.dp(60.0f) + measuredHeight) + ((int) ((1.0f - f) * AndroidUtilities.dp(30.0f)))) - ((int) fMax));
                fDpf2 = (AndroidUtilities.dpf2(2.0f) * fDp3) + AndroidUtilities.dpf2(2.0f) + (((fDp / 2.0f) + fDp2) - AndroidUtilities.dpf2(8.0f));
                AndroidUtilities.dpf2(16.0f);
                AndroidUtilities.dpf2(2.0f);
                AndroidUtilities.dpf2(2.0f);
                fM = (1.0f - fDp3) * 9.0f;
                chatActivityEnterView.snapAnimationProgress = 0.0f;
                f2 = 0.0f;
            }
            float f25 = fM;
            float f26 = fDpf2;
            float f27 = fDp2;
            boolean z3 = chatActivityEnterView.showTooltip;
            RectF rectF = this.rectF;
            if (z3) {
                f3 = f27;
                f4 = 0.0f;
                if (System.currentTimeMillis() - chatActivityEnterView.showTooltipStartTime > 200) {
                    if (fDp3 >= 0.8f || chatActivityEnterView.sendButtonVisible || chatActivityEnterView.exitTransition != f4 || chatActivityEnterView.transformToSeekbar != f4) {
                        chatActivityEnterView.showTooltip = false;
                    }
                    if (chatActivityEnterView.showTooltip) {
                        f19 = chatActivityEnterView.tooltipAlpha;
                        if (f19 != 1.0f) {
                            f20 = (jCurrentTimeMillis / 150.0f) + f19;
                            chatActivityEnterView.tooltipAlpha = f20;
                            if (f20 >= 1.0f) {
                                chatActivityEnterView.tooltipAlpha = 1.0f;
                                SharedConfig.increaseLockRecordAudioVideoHintShowed();
                            }
                        }
                    } else {
                        f18 = chatActivityEnterView.tooltipAlpha - (jCurrentTimeMillis / 150.0f);
                        chatActivityEnterView.tooltipAlpha = f18;
                        if (f18 < f4) {
                            chatActivityEnterView.tooltipAlpha = 0.0f;
                        }
                    }
                    i = (int) (chatActivityEnterView.tooltipAlpha * 255.0f);
                    this.tooltipBackground.setAlpha(i);
                    drawable2 = this.tooltipBackgroundArrow;
                    drawable2.setAlpha(i);
                    this.tooltipPaint.setAlpha(i);
                    if (this.tooltipLayout != null) {
                        canvas.save();
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.translate((getMeasuredWidth() - this.tooltipWidth) - AndroidUtilities.dp(44.0f), AndroidUtilities.dpf2(16.0f) + measuredHeight);
                        f5 = 1.0f;
                        this.tooltipBackground.setBounds(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(2.0f), (int) (this.tooltipWidth + AndroidUtilities.dp(36.0f)), (int) (AndroidUtilities.dpf2(4.0f) + this.tooltipLayout.getHeight()));
                        this.tooltipBackground.draw(canvas);
                        this.tooltipLayout.draw(canvas);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(getMeasuredWidth() - AndroidUtilities.dp(26.0f), ((this.tooltipLayout.getHeight() / 2.0f) + (AndroidUtilities.dpf2(17.0f) + measuredHeight)) - (AndroidUtilities.dpf2(3.0f) * chatActivityEnterView.idleProgress));
                        Path path = this.path;
                        path.reset();
                        path.setLastPoint(-AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                        path.lineTo(0.0f, 0.0f);
                        path.lineTo(AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                        Paint paint4 = this.p;
                        paint4.setColor(-1);
                        paint4.setAlpha(i);
                        paint4.setStyle(Paint.Style.STROKE);
                        paint4.setStrokeCap(Paint.Cap.ROUND);
                        paint4.setStrokeJoin(Paint.Join.ROUND);
                        paint4.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                        canvas.drawPath(path, paint4);
                        canvas.restore();
                        canvas.save();
                        drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (AndroidUtilities.dpf2(20.0f) + this.tooltipLayout.getHeight() + measuredHeight), (drawable2.getIntrinsicWidth() / 2) + measuredWidth, drawable2.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(20.0f) + this.tooltipLayout.getHeight() + measuredHeight)));
                        drawable2.draw(canvas);
                        canvas.restore();
                    } else {
                        f5 = 1.0f;
                    }
                }
                if (chatActivityEnterView.isInVideoMode || chatActivityEnterView.millisecondsRecorded < 59000) {
                    z = false;
                } else {
                    z = true;
                }
                float f28 = this.hidePauseT.set(z);
                f6 = chatActivityEnterView.transformToSeekbar;
                if (f6 != 0.0f || chatActivityEnterView.audioTimelineView == null) {
                    fM2 = chatActivityEnterView.exitTransition;
                    if (fM2 != 0.0f) {
                        if (fM2 > 0.6f) {
                            f8 = 1.0f;
                        } else {
                            f8 = fM2 / 0.6f;
                        }
                        if (!chatActivityEnterView.messageTransitionIsRunning) {
                            fM2 = ChatActivity$$ExternalSyntheticOutline0.m(fM2, 0.6f, 0.4f, 0.0f);
                        }
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
                        float interpolation2 = cubicBezierInterpolator.getInterpolation(f8);
                        interpolation = cubicBezierInterpolator.getInterpolation(fM2);
                        f7 = interpolation2;
                    } else {
                        interpolation = 0.0f;
                        f7 = 0.0f;
                    }
                } else {
                    float f29 = f6 > 0.38f ? 1.0f : f6 / 0.38f;
                    float fM4 = f6 > 0.63f ? 1.0f : ChatActivity$$ExternalSyntheticOutline0.m(f6, 0.38f, 0.25f, 0.0f);
                    CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_BOTH;
                    float interpolation3 = cubicBezierInterpolator2.getInterpolation(f29);
                    cubicBezierInterpolator2.getInterpolation(fM4);
                    f7 = interpolation3;
                    interpolation = 0.0f;
                }
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView.textFieldContainer.getMeasuredHeight());
                f9 = f5 - chatActivityEnterView.controlsScale;
                if (f9 == 0.0f) {
                    if (interpolation != 0.0f) {
                        f9 = interpolation;
                    } else {
                        f9 = 0.0f;
                    }
                }
                if (chatActivityEnterView.slideToCancelProgress >= 0.7f || chatActivityEnterView.canceledByGesture) {
                    chatActivityEnterView.showTooltip = false;
                    f10 = chatActivityEnterView.slideToCancelLockProgress;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.12f;
                        chatActivityEnterView.slideToCancelLockProgress = f11;
                        if (f11 < 0.0f) {
                            chatActivityEnterView.slideToCancelLockProgress = 0.0f;
                        }
                    }
                } else {
                    float f30 = chatActivityEnterView.slideToCancelLockProgress;
                    if (f30 != f5) {
                        float f31 = f30 + 0.12f;
                        chatActivityEnterView.slideToCancelLockProgress = f31;
                        if (f31 > f5) {
                            chatActivityEnterView.slideToCancelLockProgress = 1.0f;
                        }
                    }
                }
                fDpf3 = AndroidUtilities.dpf2(72.0f);
                f12 = f2;
                float fM5 = DiffUtil.m(1.0f, f9, AndroidUtilities.dpf2(24.0f) * f7, fDpf3 * f9);
                float f32 = chatActivityEnterView.slideToCancelLockProgress;
                fM3 = DiffUtil.m(1.0f, f32, fDpf3, fM5);
                if (fM3 > fDpf3) {
                    f13 = fDpf3;
                } else {
                    f13 = fM3;
                }
                float fM6 = ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, interpolation, (1.0f - f28) * chatActivityEnterView.controlsScale, f32);
                f14 = measuredWidth;
                float f33 = f26 + f13;
                canvas.scale(fM6, fM6, f14, f33);
                float f34 = f3 + f13;
                rectF.set(f14 - AndroidUtilities.dpf2(18.0f), f34, AndroidUtilities.dpf2(18.0f) + f14, f34 + fDp);
                blurredBackgroundDrawable = this.lockBackgroundDrawable;
                paint = this.lockBackgroundPaint;
                if (blurredBackgroundDrawable != null) {
                    blurredBackgroundDrawable.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                    this.lockBackgroundDrawable.draw(canvas);
                } else {
                    chatActivityEnterView.lockShadowDrawable.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                    chatActivityEnterView.lockShadowDrawable.draw(canvas);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
                }
                RectF rectF2 = chatActivityEnterView.pauseRect;
                rectF2.set(rectF);
                float fCenterX2 = rectF2.centerX();
                float fCenterY2 = rectF2.centerY();
                rectF2.left = AndroidUtilities.lerp(fCenterX2, rectF2.left, fM6);
                rectF2.right = AndroidUtilities.lerp(fCenterX2, rectF2.right, fM6);
                rectF2.top = AndroidUtilities.lerp(fCenterY2, rectF2.top, fM6);
                rectF2.bottom = AndroidUtilities.lerp(fCenterY2, rectF2.bottom, fM6);
                hintView2 = this.pauseHint;
                if (hintView2 != null) {
                    hintView2.setJointPx(0.0f, rectF.centerY());
                    this.pauseHint.invalidate();
                }
                f15 = 1.0f - f12;
                rectF.set((f14 - AndroidUtilities.dpf2(6.0f)) - (AndroidUtilities.dpf2(2.0f) * f15), f33 - (AndroidUtilities.dpf2(2.0f) * f15), (AndroidUtilities.dpf2(2.0f) * f15) + AndroidUtilities.dp(6.0f) + measuredWidth, (AndroidUtilities.dpf2(2.0f) * f15) + f33 + AndroidUtilities.dp(12.0f));
                f16 = rectF.bottom;
                fCenterX = rectF.centerX();
                fCenterY = rectF.centerY();
                canvas.save();
                fClamp = Utilities.clamp(chatActivityEnterView.transformToSeekbar * 2.0f, 1.0f, 0.0f);
                paint2 = this.lockPaint;
                int alpha = paint2.getAlpha();
                int i2 = (int) (alpha * (1.0f - fClamp));
                float f35 = f7;
                float f36 = fDp;
                canvas2 = canvas;
                int iSaveLayerAlpha = canvas2.saveLayerAlpha(fCenterX - AndroidUtilities.dp(24.0f), fCenterY - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f) + fCenterX, AndroidUtilities.dp(24.0f) + fCenterY, i2, 31);
                paint3 = this.lockOutlinePaint;
                paint3.setAlpha(255);
                paint2.setAlpha(255);
                f17 = 1.0f - fDp3;
                canvas2.translate(0.0f, AndroidUtilities.dpf2(2.0f) * f17);
                canvas2.rotate(f25, fCenterX, fCenterY);
                if (f12 != 1.0f) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f));
                    canvas2.save();
                    canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.dpf2(2.0f) * f17) + f13 + f16);
                    canvas2.translate(f14 - AndroidUtilities.dpf2(4.0f), (AndroidUtilities.dpf2(2.0f) * chatActivityEnterView.snapAnimationProgress) + (AndroidUtilities.dpf2(12.0f) * f12) + ((rectF.top - AndroidUtilities.dp(6.0f)) - AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), (1.0f - chatActivityEnterView.idleProgress) * AndroidUtilities.dpf2(1.5f), fDp3)));
                    if (f25 > 0.0f) {
                        canvas2.rotate(f25, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    }
                    canvas2.drawLine(AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(6.0f) + (AndroidUtilities.dpf2(4.0f) * f15), paint3);
                    canvas.drawArc(rectF3, 0.0f, -180.0f, false, paint3);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, AndroidUtilities.dpf2(4.0f), 0.0f, SurfaceContainer$$ExternalSyntheticOutline0.m(AndroidUtilities.dpf2(4.0f), chatActivityEnterView.snapAnimationProgress, f17, (AndroidUtilities.dpf2(4.0f) * chatActivityEnterView.idleProgress * fDp3 * (!chatActivityEnterView.sendButtonVisible ? 1 : 0)) + AndroidUtilities.dpf2(4.0f)), paint3);
                    canvas2.restore();
                }
                if (fClamp > 0.0f) {
                    drawable = null;
                } else if (chatActivityEnterView.isInVideoMode) {
                    drawable = this.vidDrawable;
                } else {
                    drawable = this.micDrawable;
                }
                if (f12 > 0.0f) {
                    if (this.periodBackgroundDrawable == null) {
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint);
                    }
                    Path path2 = this.path2;
                    path2.rewind();
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(rectF);
                    rectF4.right = rectF.centerX() - (AndroidUtilities.dp(1.66f) * f12);
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f12);
                    float[] fArr = this.radiiLeft;
                    fArr[7] = fLerp;
                    fArr[6] = fLerp;
                    fArr[1] = fLerp;
                    fArr[0] = fLerp;
                    float fDp4 = AndroidUtilities.dp(1.5f) * f12;
                    float[] fArr2 = this.radiiLeft;
                    fArr2[5] = fDp4;
                    fArr2[4] = fDp4;
                    fArr2[3] = fDp4;
                    fArr2[2] = fDp4;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addRoundRect(rectF4, fArr2, direction);
                    rectF4.set(rectF);
                    rectF4.left = (AndroidUtilities.dp(1.66f) * f12) + rectF.centerX();
                    float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f12);
                    float[] fArr3 = this.radiiRight;
                    fArr3[5] = fLerp2;
                    fArr3[4] = fLerp2;
                    fArr3[3] = fLerp2;
                    fArr3[2] = fLerp2;
                    float fDp5 = AndroidUtilities.dp(1.5f) * f12;
                    float[] fArr4 = this.radiiRight;
                    fArr4[7] = fDp5;
                    fArr4[6] = fDp5;
                    fArr4[1] = fDp5;
                    fArr4[0] = fDp5;
                    path2.addRoundRect(rectF4, fArr4, direction);
                    canvas2.drawPath(path2, paint2);
                } else {
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint2);
                }
                paint2.setAlpha(alpha);
                paint3.setAlpha(alpha);
                canvas2.restoreToCount(iSaveLayerAlpha);
                if (drawable != null) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set((int) (rectF.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF.centerY()));
                    drawable.setBounds(rect);
                    drawable.setAlpha((int) (fClamp * 255.0f));
                    drawable.draw(canvas2);
                }
                if (f12 != 1.0f) {
                    canvas2.drawCircle(fCenterX, fCenterY, AndroidUtilities.dpf2(2.0f) * f15, paint);
                }
                canvas2.restore();
                canvas2.restore();
                float fDp6 = (AndroidUtilities.dp(38.0f) * f28) + AndroidUtilities.lerp(f3, getMeasuredHeight() - AndroidUtilities.dp(118.0f), Math.max(chatActivityEnterView.exitTransition, Math.min(f35, chatActivityEnterView.slideToCancelLockProgress))) + f13;
                rectF.set(f14 - AndroidUtilities.dpf2(18.0f), fDp6, AndroidUtilities.dpf2(18.0f) + f14, fDp6 + f36);
                chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate == null && chatActivityEnterViewDelegate.onceVoiceAvailable()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                chatActivityEnterView.onceVisible = z2;
                if (z2) {
                    float fDpf4 = AndroidUtilities.dpf2(12.0f);
                    rectF.set(rectF.left, (rectF.top - AndroidUtilities.dpf2(36.0f)) - fDpf4, rectF.right, rectF.top - fDpf4);
                    hintView3 = this.onceHint;
                    if (hintView3 != null) {
                        hintView3.setJointPx(0.0f, rectF.centerY());
                        this.onceHint.invalidate();
                    }
                    this.onceRect.set(rectF);
                    canvas2.save();
                    float f37 = (1.0f - chatActivityEnterView.exitTransition) * chatActivityEnterView.controlsScale * chatActivityEnterView.slideToCancelLockProgress * chatActivityEnterView.snapAnimationProgress;
                    canvas2.scale(f37, f37, rectF.centerX(), rectF.centerY());
                    blurredBackgroundDrawable2 = this.periodBackgroundDrawable;
                    if (blurredBackgroundDrawable2 != null) {
                        blurredBackgroundDrawable2.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                        this.periodBackgroundDrawable.draw(canvas2);
                    } else {
                        chatActivityEnterView.lockShadowDrawable.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                        chatActivityEnterView.lockShadowDrawable.draw(canvas2);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
                    }
                    this.periodDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.periodDrawable.draw(canvas2, 1.0f);
                    canvas2.restore();
                }
            }
            f3 = f27;
            f4 = 0.0f;
            if (chatActivityEnterView.tooltipAlpha != f4) {
                if (fDp3 >= 0.8f) {
                    chatActivityEnterView.showTooltip = false;
                } else {
                    chatActivityEnterView.showTooltip = false;
                }
                if (chatActivityEnterView.showTooltip) {
                    f19 = chatActivityEnterView.tooltipAlpha;
                    if (f19 != 1.0f) {
                        f20 = (jCurrentTimeMillis / 150.0f) + f19;
                        chatActivityEnterView.tooltipAlpha = f20;
                        if (f20 >= 1.0f) {
                            chatActivityEnterView.tooltipAlpha = 1.0f;
                            SharedConfig.increaseLockRecordAudioVideoHintShowed();
                        }
                    }
                } else {
                    f18 = chatActivityEnterView.tooltipAlpha - (jCurrentTimeMillis / 150.0f);
                    chatActivityEnterView.tooltipAlpha = f18;
                    if (f18 < f4) {
                        chatActivityEnterView.tooltipAlpha = 0.0f;
                    }
                }
                i = (int) (chatActivityEnterView.tooltipAlpha * 255.0f);
                this.tooltipBackground.setAlpha(i);
                drawable2 = this.tooltipBackgroundArrow;
                drawable2.setAlpha(i);
                this.tooltipPaint.setAlpha(i);
                if (this.tooltipLayout != null) {
                    canvas.save();
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.tooltipWidth) - AndroidUtilities.dp(44.0f), AndroidUtilities.dpf2(16.0f) + measuredHeight);
                    f5 = 1.0f;
                    this.tooltipBackground.setBounds(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(2.0f), (int) (this.tooltipWidth + AndroidUtilities.dp(36.0f)), (int) (AndroidUtilities.dpf2(4.0f) + this.tooltipLayout.getHeight()));
                    this.tooltipBackground.draw(canvas);
                    this.tooltipLayout.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - AndroidUtilities.dp(26.0f), ((this.tooltipLayout.getHeight() / 2.0f) + (AndroidUtilities.dpf2(17.0f) + measuredHeight)) - (AndroidUtilities.dpf2(3.0f) * chatActivityEnterView.idleProgress));
                    Path path3 = this.path;
                    path3.reset();
                    path3.setLastPoint(-AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                    path3.lineTo(0.0f, 0.0f);
                    path3.lineTo(AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                    Paint paint5 = this.p;
                    paint5.setColor(-1);
                    paint5.setAlpha(i);
                    paint5.setStyle(Paint.Style.STROKE);
                    paint5.setStrokeCap(Paint.Cap.ROUND);
                    paint5.setStrokeJoin(Paint.Join.ROUND);
                    paint5.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                    canvas.drawPath(path3, paint5);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (AndroidUtilities.dpf2(20.0f) + this.tooltipLayout.getHeight() + measuredHeight), (drawable2.getIntrinsicWidth() / 2) + measuredWidth, drawable2.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(20.0f) + this.tooltipLayout.getHeight() + measuredHeight)));
                    drawable2.draw(canvas);
                    canvas.restore();
                } else {
                    f5 = 1.0f;
                }
            } else {
                f5 = 1.0f;
            }
            if (chatActivityEnterView.isInVideoMode) {
                z = false;
            } else {
                z = false;
            }
            float f210 = this.hidePauseT.set(z);
            f6 = chatActivityEnterView.transformToSeekbar;
            if (f6 != 0.0f) {
                fM2 = chatActivityEnterView.exitTransition;
                if (fM2 != 0.0f) {
                    if (fM2 > 0.6f) {
                        f8 = 1.0f;
                    } else {
                        f8 = fM2 / 0.6f;
                    }
                    if (!chatActivityEnterView.messageTransitionIsRunning) {
                        fM2 = ChatActivity$$ExternalSyntheticOutline0.m(fM2, 0.6f, 0.4f, 0.0f);
                    }
                    CubicBezierInterpolator cubicBezierInterpolator3 = CubicBezierInterpolator.EASE_BOTH;
                    float interpolation4 = cubicBezierInterpolator3.getInterpolation(f8);
                    interpolation = cubicBezierInterpolator3.getInterpolation(fM2);
                    f7 = interpolation4;
                } else {
                    interpolation = 0.0f;
                    f7 = 0.0f;
                }
            } else {
                fM2 = chatActivityEnterView.exitTransition;
                if (fM2 != 0.0f) {
                    if (fM2 > 0.6f) {
                        f8 = 1.0f;
                    } else {
                        f8 = fM2 / 0.6f;
                    }
                    if (!chatActivityEnterView.messageTransitionIsRunning) {
                        fM2 = ChatActivity$$ExternalSyntheticOutline0.m(fM2, 0.6f, 0.4f, 0.0f);
                    }
                    CubicBezierInterpolator cubicBezierInterpolator4 = CubicBezierInterpolator.EASE_BOTH;
                    float interpolation5 = cubicBezierInterpolator4.getInterpolation(f8);
                    interpolation = cubicBezierInterpolator4.getInterpolation(fM2);
                    f7 = interpolation5;
                } else {
                    interpolation = 0.0f;
                    f7 = 0.0f;
                }
            }
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView.textFieldContainer.getMeasuredHeight());
            f9 = f5 - chatActivityEnterView.controlsScale;
            if (f9 == 0.0f) {
                if (interpolation != 0.0f) {
                    f9 = interpolation;
                } else {
                    f9 = 0.0f;
                }
            }
            if (chatActivityEnterView.slideToCancelProgress >= 0.7f) {
                chatActivityEnterView.showTooltip = false;
                f10 = chatActivityEnterView.slideToCancelLockProgress;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.12f;
                    chatActivityEnterView.slideToCancelLockProgress = f11;
                    if (f11 < 0.0f) {
                        chatActivityEnterView.slideToCancelLockProgress = 0.0f;
                    }
                }
            } else {
                chatActivityEnterView.showTooltip = false;
                f10 = chatActivityEnterView.slideToCancelLockProgress;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.12f;
                    chatActivityEnterView.slideToCancelLockProgress = f11;
                    if (f11 < 0.0f) {
                        chatActivityEnterView.slideToCancelLockProgress = 0.0f;
                    }
                }
            }
            fDpf3 = AndroidUtilities.dpf2(72.0f);
            f12 = f2;
            float fM7 = DiffUtil.m(1.0f, f9, AndroidUtilities.dpf2(24.0f) * f7, fDpf3 * f9);
            float f38 = chatActivityEnterView.slideToCancelLockProgress;
            fM3 = DiffUtil.m(1.0f, f38, fDpf3, fM7);
            if (fM3 > fDpf3) {
                f13 = fDpf3;
            } else {
                f13 = fM3;
            }
            float fM8 = ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, interpolation, (1.0f - f210) * chatActivityEnterView.controlsScale, f38);
            f14 = measuredWidth;
            float f39 = f26 + f13;
            canvas.scale(fM8, fM8, f14, f39);
            float f310 = f3 + f13;
            rectF.set(f14 - AndroidUtilities.dpf2(18.0f), f310, AndroidUtilities.dpf2(18.0f) + f14, f310 + fDp);
            blurredBackgroundDrawable = this.lockBackgroundDrawable;
            paint = this.lockBackgroundPaint;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                this.lockBackgroundDrawable.draw(canvas);
            } else {
                chatActivityEnterView.lockShadowDrawable.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                chatActivityEnterView.lockShadowDrawable.draw(canvas);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
            }
            RectF rectF5 = chatActivityEnterView.pauseRect;
            rectF5.set(rectF);
            float fCenterX3 = rectF5.centerX();
            float fCenterY3 = rectF5.centerY();
            rectF5.left = AndroidUtilities.lerp(fCenterX3, rectF5.left, fM8);
            rectF5.right = AndroidUtilities.lerp(fCenterX3, rectF5.right, fM8);
            rectF5.top = AndroidUtilities.lerp(fCenterY3, rectF5.top, fM8);
            rectF5.bottom = AndroidUtilities.lerp(fCenterY3, rectF5.bottom, fM8);
            hintView2 = this.pauseHint;
            if (hintView2 != null) {
                hintView2.setJointPx(0.0f, rectF.centerY());
                this.pauseHint.invalidate();
            }
            f15 = 1.0f - f12;
            rectF.set((f14 - AndroidUtilities.dpf2(6.0f)) - (AndroidUtilities.dpf2(2.0f) * f15), f39 - (AndroidUtilities.dpf2(2.0f) * f15), (AndroidUtilities.dpf2(2.0f) * f15) + AndroidUtilities.dp(6.0f) + measuredWidth, (AndroidUtilities.dpf2(2.0f) * f15) + f39 + AndroidUtilities.dp(12.0f));
            f16 = rectF.bottom;
            fCenterX = rectF.centerX();
            fCenterY = rectF.centerY();
            canvas.save();
            fClamp = Utilities.clamp(chatActivityEnterView.transformToSeekbar * 2.0f, 1.0f, 0.0f);
            paint2 = this.lockPaint;
            int alpha2 = paint2.getAlpha();
            int i3 = (int) (alpha2 * (1.0f - fClamp));
            float f311 = f7;
            float f312 = fDp;
            canvas2 = canvas;
            int iSaveLayerAlpha2 = canvas2.saveLayerAlpha(fCenterX - AndroidUtilities.dp(24.0f), fCenterY - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f) + fCenterX, AndroidUtilities.dp(24.0f) + fCenterY, i3, 31);
            paint3 = this.lockOutlinePaint;
            paint3.setAlpha(255);
            paint2.setAlpha(255);
            f17 = 1.0f - fDp3;
            canvas2.translate(0.0f, AndroidUtilities.dpf2(2.0f) * f17);
            canvas2.rotate(f25, fCenterX, fCenterY);
            if (f12 != 1.0f) {
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, 0.0f, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f));
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.dpf2(2.0f) * f17) + f13 + f16);
                canvas2.translate(f14 - AndroidUtilities.dpf2(4.0f), (AndroidUtilities.dpf2(2.0f) * chatActivityEnterView.snapAnimationProgress) + (AndroidUtilities.dpf2(12.0f) * f12) + ((rectF.top - AndroidUtilities.dp(6.0f)) - AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), (1.0f - chatActivityEnterView.idleProgress) * AndroidUtilities.dpf2(1.5f), fDp3)));
                if (f25 > 0.0f) {
                    canvas2.rotate(f25, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                }
                canvas2.drawLine(AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(6.0f) + (AndroidUtilities.dpf2(4.0f) * f15), paint3);
                canvas.drawArc(rectF6, 0.0f, -180.0f, false, paint3);
                canvas2 = canvas;
                canvas2.drawLine(0.0f, AndroidUtilities.dpf2(4.0f), 0.0f, SurfaceContainer$$ExternalSyntheticOutline0.m(AndroidUtilities.dpf2(4.0f), chatActivityEnterView.snapAnimationProgress, f17, (AndroidUtilities.dpf2(4.0f) * chatActivityEnterView.idleProgress * fDp3 * (!chatActivityEnterView.sendButtonVisible ? 1 : 0)) + AndroidUtilities.dpf2(4.0f)), paint3);
                canvas2.restore();
            }
            if (fClamp > 0.0f) {
                drawable = null;
            } else if (chatActivityEnterView.isInVideoMode) {
                drawable = this.vidDrawable;
            } else {
                drawable = this.micDrawable;
            }
            if (f12 > 0.0f) {
                if (this.periodBackgroundDrawable == null) {
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint);
                }
                Path path4 = this.path2;
                path4.rewind();
                RectF rectF7 = AndroidUtilities.rectTmp;
                rectF7.set(rectF);
                rectF7.right = rectF.centerX() - (AndroidUtilities.dp(1.66f) * f12);
                float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f12);
                float[] fArr5 = this.radiiLeft;
                fArr5[7] = fLerp3;
                fArr5[6] = fLerp3;
                fArr5[1] = fLerp3;
                fArr5[0] = fLerp3;
                float fDp7 = AndroidUtilities.dp(1.5f) * f12;
                float[] fArr6 = this.radiiLeft;
                fArr6[5] = fDp7;
                fArr6[4] = fDp7;
                fArr6[3] = fDp7;
                fArr6[2] = fDp7;
                Path.Direction direction2 = Path.Direction.CW;
                path4.addRoundRect(rectF7, fArr6, direction2);
                rectF7.set(rectF);
                rectF7.left = (AndroidUtilities.dp(1.66f) * f12) + rectF.centerX();
                float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f12);
                float[] fArr7 = this.radiiRight;
                fArr7[5] = fLerp4;
                fArr7[4] = fLerp4;
                fArr7[3] = fLerp4;
                fArr7[2] = fLerp4;
                float fDp8 = AndroidUtilities.dp(1.5f) * f12;
                float[] fArr8 = this.radiiRight;
                fArr8[7] = fDp8;
                fArr8[6] = fDp8;
                fArr8[1] = fDp8;
                fArr8[0] = fDp8;
                path4.addRoundRect(rectF7, fArr8, direction2);
                canvas2.drawPath(path4, paint2);
            } else {
                canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint2);
            }
            paint2.setAlpha(alpha2);
            paint3.setAlpha(alpha2);
            canvas2.restoreToCount(iSaveLayerAlpha2);
            if (drawable != null) {
                Rect rect2 = AndroidUtilities.rectTmp2;
                rect2.set((int) (rectF.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF.centerY()));
                drawable.setBounds(rect2);
                drawable.setAlpha((int) (fClamp * 255.0f));
                drawable.draw(canvas2);
            }
            if (f12 != 1.0f) {
                canvas2.drawCircle(fCenterX, fCenterY, AndroidUtilities.dpf2(2.0f) * f15, paint);
            }
            canvas2.restore();
            canvas2.restore();
            float fDp9 = (AndroidUtilities.dp(38.0f) * f210) + AndroidUtilities.lerp(f3, getMeasuredHeight() - AndroidUtilities.dp(118.0f), Math.max(chatActivityEnterView.exitTransition, Math.min(f311, chatActivityEnterView.slideToCancelLockProgress))) + f13;
            rectF.set(f14 - AndroidUtilities.dpf2(18.0f), fDp9, AndroidUtilities.dpf2(18.0f) + f14, fDp9 + f312);
            chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
            if (chatActivityEnterViewDelegate == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            chatActivityEnterView.onceVisible = z2;
            if (z2) {
                float fDpf5 = AndroidUtilities.dpf2(12.0f);
                rectF.set(rectF.left, (rectF.top - AndroidUtilities.dpf2(36.0f)) - fDpf5, rectF.right, rectF.top - fDpf5);
                hintView3 = this.onceHint;
                if (hintView3 != null) {
                    hintView3.setJointPx(0.0f, rectF.centerY());
                    this.onceHint.invalidate();
                }
                this.onceRect.set(rectF);
                canvas2.save();
                float f313 = (1.0f - chatActivityEnterView.exitTransition) * chatActivityEnterView.controlsScale * chatActivityEnterView.slideToCancelLockProgress * chatActivityEnterView.snapAnimationProgress;
                canvas2.scale(f313, f313, rectF.centerX(), rectF.centerY());
                blurredBackgroundDrawable2 = this.periodBackgroundDrawable;
                if (blurredBackgroundDrawable2 != null) {
                    blurredBackgroundDrawable2.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                    this.periodBackgroundDrawable.draw(canvas2);
                } else {
                    chatActivityEnterView.lockShadowDrawable.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                    chatActivityEnterView.lockShadowDrawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
                }
                this.periodDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.periodDrawable.draw(canvas2, 1.0f);
                canvas2.restore();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int iDp = AndroidUtilities.dp(250.0f);
            if (this.lastSize != size) {
                this.lastSize = size;
                StaticLayout staticLayout = new StaticLayout(this.tooltipMessage, this.tooltipPaint, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                this.tooltipLayout = staticLayout;
                int lineCount = staticLayout.getLineCount();
                this.tooltipWidth = 0.0f;
                for (int i3 = 0; i3 < lineCount; i3++) {
                    float lineWidth = this.tooltipLayout.getLineWidth(i3);
                    if (lineWidth > this.tooltipWidth) {
                        this.tooltipWidth = lineWidth;
                    }
                }
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }

        @Override
        public final boolean onSetAlpha(int i) {
            return super.onSetAlpha(i);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            RectF rectF = this.onceRect;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (action == 0) {
                if (chatActivityEnterView.sendButtonVisible) {
                    this.pausePressed = chatActivityEnterView.pauseRect.contains(x, y);
                }
                if (chatActivityEnterView.onceVisible && chatActivityEnterView.recordCircle != null && chatActivityEnterView.snapAnimationProgress > 0.1f) {
                    this.oncePressed = rectF.contains(x, y);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.pausePressed && chatActivityEnterView.pauseRect.contains(x, y)) {
                    if (chatActivityEnterView.isInVideoMode) {
                        SlideTextView slideTextView = chatActivityEnterView.slideText;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        chatActivityEnterView.delegate.toggleVideoRecordingPause();
                    } else {
                        Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = new Bulletin$2$$ExternalSyntheticLambda1(this, 11);
                        HintView2 hintView2 = this.pauseHint;
                        if (hintView2 != null && hintView2.shown) {
                            hideHintView();
                        }
                        RecordedAudioPlayerView recordedAudioPlayerView = chatActivityEnterView.audioTimelineView;
                        if (recordedAudioPlayerView != null) {
                            recordedAudioPlayerView.setPlaying(false);
                        }
                        if (!MediaController.getInstance().isRecordingPaused() || (chatActivityEnterView.audioTimelineView.getAudioLeft() <= 0.01f && chatActivityEnterView.audioTimelineView.getAudioRight() >= 0.99f)) {
                            bulletin$2$$ExternalSyntheticLambda1.run();
                        } else {
                            ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9 = new ChatLinkActivity$$ExternalSyntheticLambda9(24, this, bulletin$2$$ExternalSyntheticLambda1);
                            if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, chatActivityEnterView.resourcesProvider);
                                String string = LocaleController.getString(R.string.RecordingTrimTitle);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string;
                                alertDialog.message = LocaleController.getString(R.string.RecordingTrimText);
                                builder.setPositiveButton(LocaleController.getString(R.string.OK), new ColorPicker$$ExternalSyntheticLambda6(chatLinkActivity$$ExternalSyntheticLambda9, 13));
                                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
                            } else {
                                chatLinkActivity$$ExternalSyntheticLambda9.run();
                            }
                        }
                    }
                    this.oncePressed = false;
                    this.pausePressed = false;
                    return true;
                }
                if (this.oncePressed && rectF.contains(x, y)) {
                    boolean z = !chatActivityEnterView.voiceOnce;
                    chatActivityEnterView.voiceOnce = z;
                    this.periodDrawable.setValue(1, z, true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.currentAccount);
                    long j = chatActivityEnterView.dialog_id;
                    ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                    mediaDataController.toggleDraftVoiceOnce(j, (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId(), chatActivityEnterView.voiceOnce);
                    if (chatActivityEnterView.voiceOnce) {
                        showOnceHint();
                    } else {
                        hideHintView();
                    }
                    invalidate();
                    this.oncePressed = false;
                    this.pausePressed = false;
                    return true;
                }
                this.oncePressed = false;
                this.pausePressed = false;
            } else if (motionEvent.getAction() == 3) {
                this.oncePressed = false;
                this.pausePressed = false;
            }
            return this.pausePressed || this.oncePressed;
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
        }

        public void setBlurredBackgroundFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
            this.useGlassDesign = true;
            if (this.colorProvider == null) {
                this.colorProvider = new BlurredBackgroundColorProviderThemed(Theme.key_chat_messagePanelVoiceLockBackground, ChatActivityEnterView.this.resourcesProvider);
            }
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, this.colorProvider, false);
            this.lockBackgroundDrawable = blurredBackgroundDrawableCreate;
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(18.0f));
            this.lockBackgroundDrawable.setPadding(AndroidUtilities.dp(3.0f));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, this.colorProvider, false);
            this.periodBackgroundDrawable = blurredBackgroundDrawableCreate2;
            blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(18.0f));
            this.periodBackgroundDrawable.setPadding(AndroidUtilities.dp(3.0f));
            updateColors();
        }

        public final void showOnceHint() {
            int i;
            hideHintView();
            HintView2 hintView2 = new HintView2(getContext(), 2);
            this.onceHint = hintView2;
            hintView2.setJoint(1.0f, 0.0f);
            this.onceHint.setMultilineText(true);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.isInVideoMode) {
                i = chatActivityEnterView.voiceOnce ? R.string.VideoSetOnceHintEnabled : R.string.VideoSetOnceHint;
            } else {
                i = chatActivityEnterView.voiceOnce ? R.string.VoiceSetOnceHintEnabled : R.string.VoiceSetOnceHint;
            }
            this.onceHint.setText(AndroidUtilities.replaceTags(LocaleController.getString(i)));
            HintView2 hintView3 = this.onceHint;
            hintView3.textMaxWidth = HintView2.cutInFancyHalf(hintView3.getText(), this.onceHint.getTextPaint());
            if (chatActivityEnterView.voiceOnce) {
                HintView2 hintView4 = this.onceHint;
                int i2 = R.raw.fire_on;
                hintView4.getClass();
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f), true, null);
                rLottieDrawable.start();
                hintView4.setIcon(rLottieDrawable);
            } else {
                MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
            }
            addView(this.onceHint, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
            HintView2 hintView5 = this.onceHint;
            hintView5.onHidden = new ChatActivityEnterView$ControlsView$$ExternalSyntheticLambda3(this, hintView5, 0);
            hintView5.show();
        }

        public final void updateColors() {
            BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = this.colorProvider;
            if (blurredBackgroundColorProviderThemed != null) {
                blurredBackgroundColorProviderThemed.updateColors();
            }
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.lockBackgroundDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.updateColors();
            }
            BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.periodBackgroundDrawable;
            if (blurredBackgroundDrawable2 != null) {
                blurredBackgroundDrawable2.updateColors();
            }
            int i = this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            this.periodDrawable.updateColors(chatActivityEnterView.getThemedColor$6(i), chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelVoiceBackground), -1);
            this.tooltipPaint.setColor(chatActivityEnterView.getThemedColor$6(Theme.key_chat_gifSaveHintText));
            int iDp = AndroidUtilities.dp(5.0f);
            int i2 = Theme.key_chat_gifSaveHintBackground;
            this.tooltipBackground = Theme.createRoundRectDrawable(iDp, chatActivityEnterView.getThemedColor$6(i2));
            int themedColor$6 = chatActivityEnterView.getThemedColor$6(i2);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            this.tooltipBackgroundArrow.setColorFilter(new PorterDuffColorFilter(themedColor$6, mode));
            this.lockBackgroundPaint.setColor(chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelVoiceLockBackground));
            this.lockPaint.setColor(chatActivityEnterView.getThemedColor$6(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock));
            this.lockOutlinePaint.setColor(chatActivityEnterView.getThemedColor$6(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock));
            this.micDrawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.getThemedColor$6(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock), mode));
            this.vidDrawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.getThemedColor$6(this.useGlassDesign ? Theme.key_glass_defaultIcon : Theme.key_chat_messagePanelVoiceLock), mode));
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.periodDrawable || super.verifyDrawable(drawable);
        }
    }

    public final class RecordCircle extends View {
        public float amplitude;
        public float animateAmplitudeDiff;
        public float animateToAmplitude;
        public final BlobDrawable bigWaveDrawable;
        public final float circleRadius;
        public final float circleRadiusAmplitude;
        public float drawingCircleRadius;
        public float drawingCx;
        public float drawingCy;
        public boolean incIdle;
        public float lastMovingX;
        public float lastMovingY;
        public long lastUpdateTime;
        public int paintAlpha;
        public float progressToSeekbarStep3;
        public float progressToSendButton;
        public final RectF rectF;
        public boolean showWaves;
        public boolean skipDraw;
        public final BlobDrawable tinyWaveDrawable;
        public final float touchSlop;
        public final VirtualViewHelper virtualViewHelper;
        public boolean voiceEnterTransitionInProgress;
        public float wavesEnterAnimation;

        public final class VirtualViewHelper extends ExploreByTouchHelper {
            public final int[] coords;

            public VirtualViewHelper(RecordCircle recordCircle) {
                super(recordCircle);
                this.coords = new int[2];
            }

            @Override
            public final int getVirtualViewAt(float f, float f2) {
                Rect rect;
                RecordCircle recordCircle = RecordCircle.this;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (!chatActivityEnterView.sendButtonVisible || chatActivityEnterView.recordCircle == null) {
                    return -1;
                }
                if (chatActivityEnterView.sendRect.contains((int) f, (int) f2)) {
                    return 1;
                }
                ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                if (chatActivityEnterView2.pauseRect.contains(f, f2)) {
                    return 2;
                }
                SlideTextView slideTextView = chatActivityEnterView2.slideText;
                if (slideTextView == null || (rect = slideTextView.cancelRect) == null) {
                    return -1;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                SlideTextView slideTextView2 = chatActivityEnterView2.slideText;
                int[] iArr = this.coords;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView2.recordCircle.getLocationOnScreen(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
                return rectF.contains(f, f2) ? 3 : -1;
            }

            @Override
            public final void getVisibleVirtualViews(ArrayList arrayList) {
                if (ChatActivityEnterView.this.sendButtonVisible) {
                    arrayList.add(1);
                    arrayList.add(3);
                }
            }

            @Override
            public final boolean onPerformActionForVirtualView(int i, int i2) {
                return true;
            }

            @Override
            public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Rect rect;
                RecordCircle recordCircle = RecordCircle.this;
                if (i == 1) {
                    accessibilityNodeInfoCompat.setBoundsInParent(ChatActivityEnterView.this.sendRect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString("Send", R.string.Send));
                    return;
                }
                if (i == 2) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    Rect rect2 = chatActivityEnterView.rect;
                    RectF rectF = chatActivityEnterView.pauseRect;
                    rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    accessibilityNodeInfoCompat.setBoundsInParent(ChatActivityEnterView.this.rect);
                    accessibilityNodeInfoCompat.setText(LocaleController.getString(R.string.Stop));
                    return;
                }
                if (i == 3) {
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    if (chatActivityEnterView2.recordCircle != null) {
                        SlideTextView slideTextView = chatActivityEnterView2.slideText;
                        if (slideTextView != null && (rect = slideTextView.cancelRect) != null) {
                            Rect rect3 = AndroidUtilities.rectTmp2;
                            rect3.set(rect);
                            ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                            SlideTextView slideTextView2 = chatActivityEnterView3.slideText;
                            int[] iArr = this.coords;
                            slideTextView2.getLocationOnScreen(iArr);
                            rect3.offset(iArr[0], iArr[1]);
                            chatActivityEnterView3.recordCircle.getLocationOnScreen(iArr);
                            rect3.offset(-iArr[0], -iArr[1]);
                            accessibilityNodeInfoCompat.setBoundsInParent(rect3);
                        }
                        accessibilityNodeInfoCompat.setText(LocaleController.getString("Cancel", R.string.Cancel));
                    }
                }
            }
        }

        public RecordCircle(Context context) {
            super(context);
            BlobDrawable blobDrawable = new BlobDrawable(11, 360928);
            this.tinyWaveDrawable = blobDrawable;
            BlobDrawable blobDrawable2 = new BlobDrawable(12, 360928);
            this.bigWaveDrawable = blobDrawable2;
            this.circleRadius = AndroidUtilities.dpf2(41.0f);
            this.circleRadiusAmplitude = AndroidUtilities.dp(30.0f);
            this.rectF = new RectF();
            this.wavesEnterAnimation = 0.0f;
            this.showWaves = true;
            VirtualViewHelper virtualViewHelper = new VirtualViewHelper(this);
            this.virtualViewHelper = virtualViewHelper;
            ViewCompat.setAccessibilityDelegate(this, virtualViewHelper);
            blobDrawable.minRadius = AndroidUtilities.dp(47.0f);
            blobDrawable.maxRadius = AndroidUtilities.dp(55.0f);
            blobDrawable.generateBlob();
            blobDrawable2.minRadius = AndroidUtilities.dp(47.0f);
            blobDrawable2.maxRadius = AndroidUtilities.dp(55.0f);
            blobDrawable2.generateBlob();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.touchSlop = scaledTouchSlop * scaledTouchSlop;
            updateColors();
        }

        public final void checkDrawables() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.micDrawable != null) {
                return;
            }
            chatActivityEnterView.micDrawable = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.micDrawable;
            int i = Theme.key_chat_messagePanelVoicePressed;
            int themedColor$6 = chatActivityEnterView.getThemedColor$6(i);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor$6, mode));
            chatActivityEnterView.cameraDrawable = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.cameraDrawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.getThemedColor$6(i), mode));
            chatActivityEnterView.sendDrawable = getResources().getDrawable(R.drawable.attach_send).mutate();
            chatActivityEnterView.sendDrawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.getThemedColor$6(i), mode));
            chatActivityEnterView.micOutline = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.micOutline;
            int i2 = Theme.key_glass_defaultIcon;
            drawable2.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.getThemedColor$6(i2), mode));
            chatActivityEnterView.cameraOutline = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.cameraOutline.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.getThemedColor$6(i2), mode));
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.virtualViewHelper.dispatchHoverEvent(motionEvent);
        }

        public final void drawIconInternal(Canvas canvas, Drawable drawable, Drawable drawable2, float f, int i) {
            checkDrawables();
            if (f != 0.0f && f != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f, f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f2 = i;
                drawable.setAlpha((int) (f2 * f));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f3 = 1.0f - f;
                canvas.scale(f3, f3, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f2 * f3));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z = chatActivityEnterView.canceledByGesture;
            if (z && chatActivityEnterView.slideToCancelProgress == 1.0f) {
                chatActivityEnterView.audioVideoSendButton.setAlpha(1.0f);
                setVisibility(8);
            } else if (z && chatActivityEnterView.slideToCancelProgress < 1.0f) {
                drawable.setAlpha(255);
                drawable.draw(canvas);
            } else {
                if (z) {
                    return;
                }
                drawable.setAlpha(i);
                drawable.draw(canvas);
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.controlsScale;
        }

        public float getScale() {
            return ChatActivityEnterView.this.scale;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.progressToSeekbarStep3;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            ControlsView controlsView = ChatActivityEnterView.this.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float interpolation;
            float f2;
            float fMax;
            float interpolation2;
            float f3;
            float f4;
            Paint paint;
            float f5;
            boolean z;
            Rect rect;
            Drawable drawable;
            int i;
            float f6;
            Drawable drawable2;
            Drawable drawable3;
            float f7;
            boolean zIsEnabled;
            BlobDrawable blobDrawable;
            BlobDrawable blobDrawable2;
            Drawable drawable4;
            float f8;
            float f9;
            Drawable drawable5;
            Drawable drawable6;
            float f10;
            float f11;
            RecordedAudioPlayerView recordedAudioPlayerView;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            Drawable drawable7;
            float f24;
            float f25;
            if (this.skipDraw) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
            int iDp = (int) (AndroidUtilities.dp(170.0f) + 0.0f);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            this.drawingCx = chatActivityEnterView.slideDelta + measuredWidth;
            float f26 = iDp;
            this.drawingCy = f26;
            float f27 = chatActivityEnterView.scale;
            float f28 = f27 <= 0.5f ? f27 / 0.5f : f27 <= 0.75f ? 1.0f - (((f27 - 0.5f) / 0.25f) * 0.1f) : (((f27 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            float f29 = this.animateToAmplitude;
            float f30 = this.amplitude;
            if (f29 != f30) {
                float f31 = this.animateAmplitudeDiff;
                float f32 = (jCurrentTimeMillis * f31) + f30;
                this.amplitude = f32;
                if (f31 > 0.0f) {
                    if (f32 > f29) {
                        this.amplitude = f29;
                    }
                } else if (f32 < f29) {
                    this.amplitude = f29;
                }
                invalidate();
            }
            float interpolation3 = ((this.circleRadiusAmplitude * this.amplitude) + this.circleRadius) * f28 * (chatActivityEnterView.canceledByGesture ? CubicBezierInterpolator.EASE_OUT.getInterpolation(1.0f - chatActivityEnterView.slideToCancelProgress) * 0.7f : (chatActivityEnterView.slideToCancelProgress * 0.3f) + 0.7f);
            this.progressToSeekbarStep3 = 0.0f;
            float f33 = chatActivityEnterView.transformToSeekbar;
            if (f33 != 0.0f) {
                f = 0.7f;
                if (chatActivityEnterView.audioTimelineView != null) {
                    float f34 = f33 > 0.38f ? 1.0f : f33 / 0.38f;
                    float fM = f33 > 0.63f ? 1.0f : ChatActivity$$ExternalSyntheticOutline0.m(f33, 0.38f, 0.25f, 0.0f);
                    this.progressToSeekbarStep3 = Math.max(0.0f, ((chatActivityEnterView.transformToSeekbar - 0.38f) - 0.25f) / 0.37f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
                    float interpolation4 = cubicBezierInterpolator.getInterpolation(f34);
                    interpolation = cubicBezierInterpolator.getInterpolation(fM);
                    this.progressToSeekbarStep3 = cubicBezierInterpolator.getInterpolation(this.progressToSeekbarStep3);
                    float fDp = (AndroidUtilities.dp(16.0f) * interpolation4) + interpolation3;
                    float fDp2 = AndroidUtilities.dp(8.0f);
                    interpolation3 = DiffUtil.m(1.0f, interpolation, fDp - fDp2, fDp2);
                    interpolation2 = interpolation4;
                    f2 = 0.0f;
                    fMax = 1.0f;
                }
                f3 = 0.6f;
                if (chatActivityEnterView.canceledByGesture) {
                    f25 = chatActivityEnterView.slideToCancelProgress;
                    if (f25 > f) {
                        fMax *= 1.0f - ((f25 - f) / 0.3f);
                    }
                }
                f4 = this.progressToSeekbarStep3;
                paint = chatActivityEnterView.paint;
                if (f4 > 0.0f) {
                    f5 = 1.0f;
                    paint.setColor(ColorUtils.blendARGB(this.progressToSeekbarStep3, chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelVoiceBackground), chatActivityEnterView.getThemedColor$6(Theme.key_chat_recordedVoiceBackground)));
                } else {
                    f5 = 1.0f;
                    paint.setColor(chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelVoiceBackground));
                }
                checkDrawables();
                z = chatActivityEnterView.sendButtonVisible;
                rect = chatActivityEnterView.sendRect;
                drawable = null;
                if (z) {
                    f23 = this.progressToSendButton;
                    if (f23 != f5) {
                        f6 = 12.0f;
                        f24 = (jCurrentTimeMillis / 150.0f) + f23;
                        this.progressToSendButton = f24;
                        if (f24 > f5) {
                            this.progressToSendButton = 1.0f;
                        }
                        if (chatActivityEnterView.isInVideoMode) {
                            drawable7 = chatActivityEnterView.cameraDrawable;
                        } else {
                            drawable7 = chatActivityEnterView.micDrawable;
                        }
                    } else {
                        f6 = 12.0f;
                        drawable7 = null;
                    }
                    Drawable drawable8 = chatActivityEnterView.sendDrawable;
                    i = measuredWidth;
                    rect.set(zzle.m(measuredWidth, drawable8), iDp - (drawable8.getIntrinsicHeight() / 2), (drawable8.getIntrinsicWidth() / 2) + i, (drawable8.getIntrinsicHeight() / 2) + iDp);
                    if (drawable7 != null) {
                        drawable7.setBounds(i - (drawable7.getIntrinsicWidth() / 2), iDp - (drawable7.getIntrinsicHeight() / 2), (drawable7.getIntrinsicWidth() / 2) + i, (drawable7.getIntrinsicHeight() / 2) + iDp);
                    }
                    drawable = drawable7;
                    drawable3 = drawable8;
                } else {
                    i = measuredWidth;
                    f6 = 12.0f;
                    if (chatActivityEnterView.isInVideoMode) {
                        drawable2 = chatActivityEnterView.cameraDrawable;
                    } else {
                        drawable2 = chatActivityEnterView.micDrawable;
                    }
                    Drawable drawable9 = drawable2;
                    rect.set(i - AndroidUtilities.dp(12.0f), iDp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i, AndroidUtilities.dp(12.0f) + iDp);
                    drawable3 = drawable9;
                }
                drawable3.setBounds(rect);
                if (this.incIdle) {
                    f22 = chatActivityEnterView.idleProgress + 0.01f;
                    chatActivityEnterView.idleProgress = f22;
                    if (f22 > 1.0f) {
                        this.incIdle = false;
                        chatActivityEnterView.idleProgress = 1.0f;
                    }
                } else {
                    f7 = chatActivityEnterView.idleProgress - 0.01f;
                    chatActivityEnterView.idleProgress = f7;
                    if (f7 < 0.0f) {
                        this.incIdle = true;
                        chatActivityEnterView.idleProgress = 0.0f;
                    }
                }
                zIsEnabled = LiteMode.isEnabled(360928);
                blobDrawable = this.bigWaveDrawable;
                blobDrawable2 = this.tinyWaveDrawable;
                if (zIsEnabled) {
                    blobDrawable2.minRadius = AndroidUtilities.dp(47.0f);
                    blobDrawable2.maxRadius = (AndroidUtilities.dp(15.0f) * f3) + AndroidUtilities.dp(47.0f);
                    blobDrawable.minRadius = AndroidUtilities.dp(50.0f);
                    blobDrawable.maxRadius = (AndroidUtilities.dp(f6) * f3) + AndroidUtilities.dp(50.0f);
                    f14 = blobDrawable.animateToAmplitude;
                    f15 = blobDrawable.amplitude;
                    if (f14 != f15) {
                        f20 = blobDrawable.animateAmplitudeDiff;
                        drawable4 = drawable3;
                        f21 = (jCurrentTimeMillis * f20) + f15;
                        blobDrawable.amplitude = f21;
                        if (f20 > 0.0f) {
                            if (f21 > f14) {
                                blobDrawable.amplitude = f14;
                            }
                        } else if (f21 < f14) {
                            blobDrawable.amplitude = f14;
                        }
                    } else {
                        drawable4 = drawable3;
                    }
                    blobDrawable.update(blobDrawable.amplitude, 1.01f);
                    f16 = blobDrawable2.animateToAmplitude;
                    f17 = blobDrawable2.amplitude;
                    if (f16 != f17) {
                        f18 = blobDrawable2.animateAmplitudeDiff;
                        f19 = (jCurrentTimeMillis * f18) + f17;
                        blobDrawable2.amplitude = f19;
                        if (f18 > 0.0f) {
                            if (f19 > f16) {
                                blobDrawable2.amplitude = f16;
                            }
                        } else if (f19 < f16) {
                            blobDrawable2.amplitude = f16;
                        }
                    }
                    blobDrawable2.update(blobDrawable2.amplitude, 1.02f);
                } else {
                    drawable4 = drawable3;
                }
                this.lastUpdateTime = System.currentTimeMillis();
                f8 = chatActivityEnterView.slideToCancelProgress;
                if (f8 > f) {
                    f9 = 1.0f;
                } else {
                    f9 = f8 / f;
                }
                if (LiteMode.isEnabled(360928) && interpolation != 1.0f && f2 < 0.4f && f9 > 0.0f && !chatActivityEnterView.canceledByGesture) {
                    if (this.showWaves) {
                        f12 = this.wavesEnterAnimation;
                        if (f12 != 1.0f) {
                            f13 = f12 + 0.04f;
                            this.wavesEnterAnimation = f13;
                            if (f13 > 1.0f) {
                                this.wavesEnterAnimation = 1.0f;
                            }
                        }
                    }
                    if (!this.voiceEnterTransitionInProgress) {
                        float interpolation5 = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnterAnimation);
                        canvas.save();
                        float f35 = 1.0f - interpolation2;
                        float fM2 = AndroidUtilities$$ExternalSyntheticOutline0.m(blobDrawable.amplitude, 1.4f, 0.878f, MediaController$$ExternalSyntheticOutline0.m(chatActivityEnterView.scale, f35, f9, interpolation5));
                        canvas.scale(fM2, fM2, i + chatActivityEnterView.slideDelta, f26);
                        blobDrawable.draw(i + chatActivityEnterView.slideDelta, f26, canvas, blobDrawable.paint);
                        canvas.restore();
                        float fM3 = ((blobDrawable2.amplitude * 1.4f) + 0.926f) * MediaController$$ExternalSyntheticOutline0.m(chatActivityEnterView.scale, f35, f9, interpolation5);
                        canvas.save();
                        canvas.scale(fM3, fM3, i + chatActivityEnterView.slideDelta, f26);
                        blobDrawable2.draw(i + chatActivityEnterView.slideDelta, f26, canvas, blobDrawable2.paint);
                        canvas.restore();
                    }
                }
                if (chatActivityEnterView.canceledByGesture && chatActivityEnterView.slideToCancelProgress < 1.0f) {
                    interpolation3 = Math.max(interpolation3, AndroidUtilities.dp(19.0f));
                }
                if (this.voiceEnterTransitionInProgress) {
                    drawable5 = drawable4;
                    drawable6 = drawable;
                    f10 = 1.0f;
                } else {
                    paint.setAlpha((int) (this.paintAlpha * fMax));
                    if (chatActivityEnterView.scale == 1.0f) {
                        if (chatActivityEnterView.transformToSeekbar != 0.0f) {
                            f10 = 1.0f;
                            canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, interpolation3, paint);
                        } else if (!chatActivityEnterView.isInVideoMode || this.progressToSeekbarStep3 <= 0.0f || (recordedAudioPlayerView = chatActivityEnterView.audioTimelineView) == null) {
                            f10 = 1.0f;
                            canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, (1.0f - this.progressToSeekbarStep3) * interpolation3, paint);
                        } else {
                            float f36 = f26 + interpolation3;
                            float f37 = f26 - interpolation3;
                            float f38 = i + chatActivityEnterView.slideDelta;
                            float f39 = f38 + interpolation3;
                            float f40 = f38 - interpolation3;
                            int y = 0;
                            int x = 0;
                            for (View view = (View) recordedAudioPlayerView.getParent(); view != getParent(); view = (View) view.getParent()) {
                                y = (int) (view.getY() + y);
                                x = (int) (view.getX() + x);
                            }
                            float f41 = y;
                            float y2 = (recordedAudioPlayerView.getY() + f41) - getY();
                            float y3 = ((recordedAudioPlayerView.getY() + recordedAudioPlayerView.getMeasuredHeight()) + f41) - getY();
                            float f42 = x;
                            float x2 = (((recordedAudioPlayerView.getX() + recordedAudioPlayerView.getMeasuredWidth()) + f42) - getX()) - chatActivityEnterView.horizontalPadding;
                            float x3 = ((recordedAudioPlayerView.getX() + f42) - getX()) + chatActivityEnterView.horizontalPadding;
                            float measuredHeight = chatActivityEnterView.isInVideoMode ? 0.0f : recordedAudioPlayerView.getMeasuredHeight() / 2.0f;
                            float fLerp = AndroidUtilities.lerp(f37, y2, this.progressToSeekbarStep3);
                            float fLerp2 = AndroidUtilities.lerp(f36, y3, this.progressToSeekbarStep3);
                            float fLerp3 = AndroidUtilities.lerp(f40, x3, this.progressToSeekbarStep3);
                            float fLerp4 = AndroidUtilities.lerp(f39, x2, this.progressToSeekbarStep3);
                            AndroidUtilities.lerp(interpolation3, measuredHeight, this.progressToSeekbarStep3);
                            RectF rectF = this.rectF;
                            rectF.set(fLerp3, fLerp, fLerp4, fLerp2);
                            chatActivityEnterView.audioTimelineView.drawIn(canvas, rectF);
                            f10 = 1.0f;
                        }
                        canvas.save();
                        float f43 = f10 - f2;
                        canvas.translate(chatActivityEnterView.slideDelta, 0.0f);
                        float f44 = this.progressToSendButton;
                        int iM = (int) ImageReceiver$$ExternalSyntheticOutline2.m(f10, interpolation, f43, 255.0f);
                        drawable5 = drawable4;
                        drawable6 = drawable;
                        drawIconInternal(canvas, drawable5, drawable6, f44, iM);
                        canvas.restore();
                    } else {
                        drawable5 = drawable4;
                        drawable6 = drawable;
                        f10 = 1.0f;
                    }
                }
                if (chatActivityEnterView.scale != f10) {
                    canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, interpolation3, paint);
                    if (chatActivityEnterView.canceledByGesture) {
                        f11 = f10 - chatActivityEnterView.slideToCancelProgress;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(chatActivityEnterView.slideDelta, 0.0f);
                    drawIconInternal(canvas, drawable5, drawable6, this.progressToSendButton, (int) (f11 * 255.0f));
                    canvas.restore();
                }
                this.drawingCircleRadius = interpolation3;
            }
            f = 0.7f;
            float fM4 = chatActivityEnterView.exitTransition;
            if (fM4 != 0.0f) {
                float f45 = fM4 > 0.6f ? 1.0f : fM4 / 0.6f;
                if (!chatActivityEnterView.messageTransitionIsRunning) {
                    fM4 = ChatActivity$$ExternalSyntheticOutline0.m(fM4, 0.6f, 0.4f, 0.0f);
                }
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_BOTH;
                interpolation2 = cubicBezierInterpolator2.getInterpolation(f45);
                float interpolation6 = cubicBezierInterpolator2.getInterpolation(fM4);
                interpolation3 = (1.0f - interpolation6) * ((AndroidUtilities.dp(16.0f) * interpolation2) + interpolation3);
                if (LiteMode.isEnabled(360928)) {
                    float f46 = chatActivityEnterView.exitTransition;
                    if (f46 > 0.6f) {
                        fMax = Math.max(0.0f, 1.0f - ((f46 - 0.6f) / 0.4f));
                    } else {
                        fMax = 1.0f;
                    }
                } else {
                    fMax = 1.0f;
                }
                f3 = 0.6f;
                f2 = interpolation6;
                interpolation = 0.0f;
            } else {
                interpolation = 0.0f;
                f2 = 0.0f;
                fMax = 1.0f;
                interpolation2 = 0.0f;
                f3 = 0.6f;
            }
            if (chatActivityEnterView.canceledByGesture) {
                f25 = chatActivityEnterView.slideToCancelProgress;
                if (f25 > f) {
                    fMax *= 1.0f - ((f25 - f) / 0.3f);
                }
            }
            f4 = this.progressToSeekbarStep3;
            paint = chatActivityEnterView.paint;
            if (f4 > 0.0f) {
                f5 = 1.0f;
                paint.setColor(ColorUtils.blendARGB(this.progressToSeekbarStep3, chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelVoiceBackground), chatActivityEnterView.getThemedColor$6(Theme.key_chat_recordedVoiceBackground)));
            } else {
                f5 = 1.0f;
                paint.setColor(chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelVoiceBackground));
            }
            checkDrawables();
            z = chatActivityEnterView.sendButtonVisible;
            rect = chatActivityEnterView.sendRect;
            drawable = null;
            if (z) {
                f23 = this.progressToSendButton;
                if (f23 != f5) {
                    f6 = 12.0f;
                    f24 = (jCurrentTimeMillis / 150.0f) + f23;
                    this.progressToSendButton = f24;
                    if (f24 > f5) {
                        this.progressToSendButton = 1.0f;
                    }
                    if (chatActivityEnterView.isInVideoMode) {
                        drawable7 = chatActivityEnterView.cameraDrawable;
                    } else {
                        drawable7 = chatActivityEnterView.micDrawable;
                    }
                } else {
                    f6 = 12.0f;
                    drawable7 = null;
                }
                Drawable drawable10 = chatActivityEnterView.sendDrawable;
                i = measuredWidth;
                rect.set(zzle.m(measuredWidth, drawable10), iDp - (drawable10.getIntrinsicHeight() / 2), (drawable10.getIntrinsicWidth() / 2) + i, (drawable10.getIntrinsicHeight() / 2) + iDp);
                if (drawable7 != null) {
                    drawable7.setBounds(i - (drawable7.getIntrinsicWidth() / 2), iDp - (drawable7.getIntrinsicHeight() / 2), (drawable7.getIntrinsicWidth() / 2) + i, (drawable7.getIntrinsicHeight() / 2) + iDp);
                }
                drawable = drawable7;
                drawable3 = drawable10;
            } else {
                i = measuredWidth;
                f6 = 12.0f;
                if (chatActivityEnterView.isInVideoMode) {
                    drawable2 = chatActivityEnterView.cameraDrawable;
                } else {
                    drawable2 = chatActivityEnterView.micDrawable;
                }
                Drawable drawable11 = drawable2;
                rect.set(i - AndroidUtilities.dp(12.0f), iDp - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i, AndroidUtilities.dp(12.0f) + iDp);
                drawable3 = drawable11;
            }
            drawable3.setBounds(rect);
            if (this.incIdle) {
                f22 = chatActivityEnterView.idleProgress + 0.01f;
                chatActivityEnterView.idleProgress = f22;
                if (f22 > 1.0f) {
                    this.incIdle = false;
                    chatActivityEnterView.idleProgress = 1.0f;
                }
            } else {
                f7 = chatActivityEnterView.idleProgress - 0.01f;
                chatActivityEnterView.idleProgress = f7;
                if (f7 < 0.0f) {
                    this.incIdle = true;
                    chatActivityEnterView.idleProgress = 0.0f;
                }
            }
            zIsEnabled = LiteMode.isEnabled(360928);
            blobDrawable = this.bigWaveDrawable;
            blobDrawable2 = this.tinyWaveDrawable;
            if (zIsEnabled) {
                blobDrawable2.minRadius = AndroidUtilities.dp(47.0f);
                blobDrawable2.maxRadius = (AndroidUtilities.dp(15.0f) * f3) + AndroidUtilities.dp(47.0f);
                blobDrawable.minRadius = AndroidUtilities.dp(50.0f);
                blobDrawable.maxRadius = (AndroidUtilities.dp(f6) * f3) + AndroidUtilities.dp(50.0f);
                f14 = blobDrawable.animateToAmplitude;
                f15 = blobDrawable.amplitude;
                if (f14 != f15) {
                    f20 = blobDrawable.animateAmplitudeDiff;
                    drawable4 = drawable3;
                    f21 = (jCurrentTimeMillis * f20) + f15;
                    blobDrawable.amplitude = f21;
                    if (f20 > 0.0f) {
                        if (f21 > f14) {
                            blobDrawable.amplitude = f14;
                        }
                    } else if (f21 < f14) {
                        blobDrawable.amplitude = f14;
                    }
                } else {
                    drawable4 = drawable3;
                }
                blobDrawable.update(blobDrawable.amplitude, 1.01f);
                f16 = blobDrawable2.animateToAmplitude;
                f17 = blobDrawable2.amplitude;
                if (f16 != f17) {
                    f18 = blobDrawable2.animateAmplitudeDiff;
                    f19 = (jCurrentTimeMillis * f18) + f17;
                    blobDrawable2.amplitude = f19;
                    if (f18 > 0.0f) {
                        if (f19 > f16) {
                            blobDrawable2.amplitude = f16;
                        }
                    } else if (f19 < f16) {
                        blobDrawable2.amplitude = f16;
                    }
                }
                blobDrawable2.update(blobDrawable2.amplitude, 1.02f);
            } else {
                drawable4 = drawable3;
            }
            this.lastUpdateTime = System.currentTimeMillis();
            f8 = chatActivityEnterView.slideToCancelProgress;
            if (f8 > f) {
                f9 = 1.0f;
            } else {
                f9 = f8 / f;
            }
            if (LiteMode.isEnabled(360928)) {
                if (this.showWaves) {
                    f12 = this.wavesEnterAnimation;
                    if (f12 != 1.0f) {
                        f13 = f12 + 0.04f;
                        this.wavesEnterAnimation = f13;
                        if (f13 > 1.0f) {
                            this.wavesEnterAnimation = 1.0f;
                        }
                    }
                }
                if (!this.voiceEnterTransitionInProgress) {
                    float interpolation7 = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.wavesEnterAnimation);
                    canvas.save();
                    float f310 = 1.0f - interpolation2;
                    float fM5 = AndroidUtilities$$ExternalSyntheticOutline0.m(blobDrawable.amplitude, 1.4f, 0.878f, MediaController$$ExternalSyntheticOutline0.m(chatActivityEnterView.scale, f310, f9, interpolation7));
                    canvas.scale(fM5, fM5, i + chatActivityEnterView.slideDelta, f26);
                    blobDrawable.draw(i + chatActivityEnterView.slideDelta, f26, canvas, blobDrawable.paint);
                    canvas.restore();
                    float fM6 = ((blobDrawable2.amplitude * 1.4f) + 0.926f) * MediaController$$ExternalSyntheticOutline0.m(chatActivityEnterView.scale, f310, f9, interpolation7);
                    canvas.save();
                    canvas.scale(fM6, fM6, i + chatActivityEnterView.slideDelta, f26);
                    blobDrawable2.draw(i + chatActivityEnterView.slideDelta, f26, canvas, blobDrawable2.paint);
                    canvas.restore();
                }
            }
            if (chatActivityEnterView.canceledByGesture) {
                interpolation3 = Math.max(interpolation3, AndroidUtilities.dp(19.0f));
            }
            if (this.voiceEnterTransitionInProgress) {
                paint.setAlpha((int) (this.paintAlpha * fMax));
                if (chatActivityEnterView.scale == 1.0f) {
                    if (chatActivityEnterView.transformToSeekbar != 0.0f) {
                        f10 = 1.0f;
                        canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, interpolation3, paint);
                    } else if (chatActivityEnterView.isInVideoMode) {
                        f10 = 1.0f;
                        canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, (1.0f - this.progressToSeekbarStep3) * interpolation3, paint);
                    } else {
                        f10 = 1.0f;
                        canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, (1.0f - this.progressToSeekbarStep3) * interpolation3, paint);
                    }
                    canvas.save();
                    float f47 = f10 - f2;
                    canvas.translate(chatActivityEnterView.slideDelta, 0.0f);
                    float f48 = this.progressToSendButton;
                    int iM2 = (int) ImageReceiver$$ExternalSyntheticOutline2.m(f10, interpolation, f47, 255.0f);
                    drawable5 = drawable4;
                    drawable6 = drawable;
                    drawIconInternal(canvas, drawable5, drawable6, f48, iM2);
                    canvas.restore();
                } else {
                    drawable5 = drawable4;
                    drawable6 = drawable;
                    f10 = 1.0f;
                }
            } else {
                drawable5 = drawable4;
                drawable6 = drawable;
                f10 = 1.0f;
            }
            if (chatActivityEnterView.scale != f10) {
                canvas.drawCircle(i + chatActivityEnterView.slideDelta, f26, interpolation3, paint);
                if (chatActivityEnterView.canceledByGesture) {
                    f11 = f10 - chatActivityEnterView.slideToCancelProgress;
                } else {
                    f11 = 1.0f;
                }
                canvas.save();
                canvas.translate(chatActivityEnterView.slideDelta, 0.0f);
                drawIconInternal(canvas, drawable5, drawable6, this.progressToSendButton, (int) (f11 * 255.0f));
                canvas.restore();
            }
            this.drawingCircleRadius = interpolation3;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                measuredWidth = AndroidUtilities.dp(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.slideDelta = (int) ((1.0f - chatActivityEnterView.slideToCancelProgress) * (-measuredWidth));
        }

        public final void resetLockTranslation(boolean z) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z) {
                chatActivityEnterView.sendButtonVisible = false;
                chatActivityEnterView.lockAnimatedTranslation = -1.0f;
                chatActivityEnterView.startTranslation = -1.0f;
                chatActivityEnterView.slideToCancelProgress = 1.0f;
                chatActivityEnterView.slideToCancelLockProgress = 1.0f;
                chatActivityEnterView.snapAnimationProgress = 0.0f;
                chatActivityEnterView.controlsScale = 0.0f;
            }
            invalidate();
            chatActivityEnterView.transformToSeekbar = 0.0f;
            chatActivityEnterView.isRecordingStateChanged();
            chatActivityEnterView.exitTransition = 0.0f;
            chatActivityEnterView.scale = 0.0f;
            chatActivityEnterView.tooltipAlpha = 0.0f;
            chatActivityEnterView.showTooltip = false;
            this.progressToSendButton = 0.0f;
            chatActivityEnterView.canceledByGesture = false;
            ControlsView controlsView = chatActivityEnterView.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public void setAmplitude(double d) {
            this.bigWaveDrawable.setValue((float) (Math.min(1800.0d, d) / 1800.0d), true);
            this.tinyWaveDrawable.setValue((float) (Math.min(1800.0d, d) / 1800.0d), false);
            float fMin = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.animateToAmplitude = fMin;
            this.animateAmplitudeDiff = (fMin - this.amplitude) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.controlsScale = f;
            ControlsView controlsView = chatActivityEnterView.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public void setScale(float f) {
            ChatActivityEnterView.this.scale = f;
            invalidate();
        }

        public final void setSendButtonInvisible() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.sendButtonVisible = false;
            invalidate();
            ControlsView controlsView = chatActivityEnterView.controlsView;
            if (controlsView != null) {
                controlsView.invalidate();
            }
        }

        public void setTransformToSeekbar(float f) {
            ChatActivityEnterView.this.transformToSeekbar = f;
            invalidate();
        }

        public final void updateColors() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.paint;
            int i = Theme.key_chat_messagePanelVoiceBackground;
            paint.setColor(chatActivityEnterView.getThemedColor$6(i));
            this.tinyWaveDrawable.paint.setColor(ColorUtils.setAlphaComponent(chatActivityEnterView.getThemedColor$6(i), 38));
            this.bigWaveDrawable.paint.setColor(ColorUtils.setAlphaComponent(chatActivityEnterView.getThemedColor$6(i), 76));
            this.paintAlpha = chatActivityEnterView.paint.getAlpha();
        }
    }

    public final class RecordDot extends View {
        public float alpha;
        public boolean attachedToWindow;
        public final RLottieDrawable drawable;
        public boolean enterAnimation;
        public boolean isIncr;
        public long lastUpdateTime;
        public boolean playing;

        public RecordDot(Context context) {
            super(context);
            int i = R.raw.chat_audio_record_delete_2;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            this.drawable = rLottieDrawable;
            rLottieDrawable.invalidateOnProgressSet = true;
            updateColors();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attachedToWindow = true;
            boolean z = this.playing;
            RLottieDrawable rLottieDrawable = this.drawable;
            if (z) {
                rLottieDrawable.start();
            }
            rLottieDrawable.masterParent = this;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attachedToWindow = false;
            RLottieDrawable rLottieDrawable = this.drawable;
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
            this.drawable.masterParent = null;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            boolean z = this.playing;
            RLottieDrawable rLottieDrawable = this.drawable;
            if (z) {
                rLottieDrawable.setAlpha((int) (this.alpha * 255.0f));
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.redDotPaint.setAlpha((int) (this.alpha * 255.0f));
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
            if (this.enterAnimation) {
                this.alpha = 1.0f;
            } else if (this.isIncr || this.playing) {
                float f = (jCurrentTimeMillis / 600.0f) + this.alpha;
                this.alpha = f;
                if (f >= 1.0f) {
                    this.alpha = 1.0f;
                    this.isIncr = false;
                }
            } else {
                float f2 = this.alpha - (jCurrentTimeMillis / 600.0f);
                this.alpha = f2;
                if (f2 <= 0.0f) {
                    this.alpha = 0.0f;
                    this.isIncr = true;
                }
            }
            this.lastUpdateTime = System.currentTimeMillis();
            if (this.playing) {
                rLottieDrawable.draw(canvas);
            }
            if (!this.playing || !rLottieDrawable.hasBitmap()) {
                canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, AndroidUtilities.dp(5.0f), chatActivityEnterView.redDotPaint);
            }
            invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }

        public final void playDeleteAnimation() {
            this.playing = true;
            RLottieDrawable rLottieDrawable = this.drawable;
            rLottieDrawable.setProgress(0.0f, true);
            if (this.attachedToWindow) {
                rLottieDrawable.start();
            }
        }

        public final void updateColors() {
            int i = Theme.key_chat_recordedVoiceDot;
            int i2 = ChatActivityEnterView.$r8$clinit;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int themedColor$6 = chatActivityEnterView.getThemedColor$6(i);
            int themedColor$7 = chatActivityEnterView.getThemedColor$6(Theme.key_chat_messagePanelBackground);
            chatActivityEnterView.redDotPaint.setColor(themedColor$6);
            RLottieDrawable rLottieDrawable = this.drawable;
            rLottieDrawable.applyingLayerColors = true;
            OKLCH.m(themedColor$6, rLottieDrawable.newColorUpdates, "Cup Red", rLottieDrawable);
            OKLCH.m(themedColor$6, rLottieDrawable.newColorUpdates, "Box", rLottieDrawable);
            OKLCH.m(themedColor$7, rLottieDrawable.newColorUpdates, "Line 1", rLottieDrawable);
            OKLCH.m(themedColor$7, rLottieDrawable.newColorUpdates, "Line 2", rLottieDrawable);
            OKLCH.m(themedColor$7, rLottieDrawable.newColorUpdates, "Line 3", rLottieDrawable);
            rLottieDrawable.commitApplyLayerColors();
        }
    }

    public abstract class SendButton extends View implements ItemOptions.ScrimView {
        public final AnimatedFloat animatedPriceVisible;
        public final AnimatedFloat appear;
        public final Paint backgroundPaint;
        public final RectF backgroundRect;
        public BlurredBackgroundDrawable blurredBackgroundDrawable;
        public final ButtonBounce bounce;
        public ValueAnimator bounceCountAnimator;
        public int circleHeight;
        public float circlePadX;
        public float circlePadY;
        public int circleWidth;
        public final AnimatedTextView.AnimatedTextDrawable count;
        public float countBounceScale;
        public Drawable drawable;
        public int drawableColor;
        public Drawable drawableInverse;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiDrawable;
        public float ephemeralFactor;
        public Drawable ephemeralOutlineDrawable;
        public boolean hidePrice;
        public Drawable inactiveDrawable;
        public boolean infiniteLoading;
        public boolean isNewDesignSendButton;
        public final AnimatedFloat loadingAnimatedProgress;
        public final AnimatedFloat loadingAnimatedShown;
        public final FastOutSlowInInterpolator loadingInterpolator;
        public final Paint loadingPaint;
        public float loadingProgress;
        public boolean loadingShown;
        public Drawable lockIcon;
        public int lockIconColor;
        public boolean locked;
        public int messagesCount;
        public boolean newCounterPos;
        public final AnimatedFloat open;
        public final Path path;
        public final AnimatedTextView.AnimatedTextDrawable priceText;
        public int resId;
        public final Theme.ResourcesProvider resourcesProvider;
        public float sameWidthFactor;
        public int scrimViewBackgroundColor;
        public final Paint scrimViewBackgroundPaint;
        public final ColoredImageSpan[] spans;
        public long starsPrice;

        public SendButton(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPriceVisible = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.backgroundPaint = new Paint(1);
            this.circleWidth = -1;
            this.circleHeight = -1;
            this.scrimViewBackgroundPaint = new Paint(1);
            this.spans = new ColoredImageSpan[1];
            this.open = new AnimatedFloat(this, 0L, 420L, cubicBezierInterpolator);
            this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
            this.loadingInterpolator = new FastOutSlowInInterpolator();
            this.loadingAnimatedShown = new AnimatedFloat(this, 0L, 420L, cubicBezierInterpolator);
            this.loadingAnimatedProgress = new AnimatedFloat(this, 0L, 500L, cubicBezierInterpolator);
            this.path = new Path();
            Paint paint = new Paint(1);
            this.loadingPaint = paint;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
            this.count = animatedTextDrawable;
            this.countBounceScale = 1.0f;
            this.appear = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.backgroundRect = new RectF();
            this.resId = i;
            this.resourcesProvider = resourcesProvider;
            this.isNewDesignSendButton = z;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
            this.priceText = animatedTextDrawable2;
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(15.0f));
            Typeface typefaceBold = AndroidUtilities.bold();
            TextPaint textPaint = animatedTextDrawable2.textPaint;
            textPaint.setTypeface(typefaceBold);
            textPaint.setColor(-1);
            animatedTextDrawable2.alpha = Color.alpha(-1);
            animatedTextDrawable2.gravity = 3;
            animatedTextDrawable2.setCallback(this);
            animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
            this.drawable = context.getResources().getDrawable(i).mutate();
            this.inactiveDrawable = context.getResources().getDrawable(i).mutate();
            this.drawableInverse = context.getResources().getDrawable(i).mutate();
            this.emojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(14.0f), 7);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            animatedTextDrawable.setCallback(this);
            TextPaint textPaint2 = animatedTextDrawable.textPaint;
            textPaint2.setColor(-1);
            animatedTextDrawable.alpha = Color.alpha(-1);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.gravity = 17;
        }

        public final void bounceCount() {
            ValueAnimator valueAnimator = this.bounceCountAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.bounceCountAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0((ChatAttachAlert.AnonymousClass24) this, 26));
            this.bounceCountAnimator.addListener(new CheckBox.AnonymousClass1((ChatAttachAlert.AnonymousClass24) this, 12));
            this.bounceCountAnimator.setDuration(180L);
            this.bounceCountAnimator.setInterpolator(new OvershootInterpolator());
            this.bounceCountAnimator.start();
        }

        @Override
        public final void draw(Canvas canvas) {
            if (!this.locked) {
                super.draw(canvas);
                return;
            }
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), getWidth(), getHeight(), 255, 31);
            super.draw(canvas);
            float fDp = AndroidUtilities.dp(18.0f);
            RectF rectF = this.backgroundRect;
            float f = fDp / 2.0f;
            float fDp2 = (rectF.left + f) - AndroidUtilities.dp(6.0f);
            float fDp3 = (rectF.top + f) - AndroidUtilities.dp(6.0f);
            canvas.drawCircle(fDp2, fDp3, AndroidUtilities.dp(2.0f) + f, Theme.PAINT_CLEAR);
            canvas.drawCircle(fDp2, fDp3, f, this.backgroundPaint);
            if (this.lockIcon == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
                this.lockIcon = drawableMutate;
                int i = this.drawableColor;
                this.lockIconColor = i;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            if (this.lockIconColor != this.drawableColor) {
                Drawable drawable = this.lockIcon;
                int i2 = this.drawableColor;
                this.lockIconColor = i2;
                drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            this.lockIcon.setBounds((int) (fDp2 - AndroidUtilities.dp(8.0f)), (int) (fDp3 - AndroidUtilities.dp(8.0f)), (int) (fDp2 + AndroidUtilities.dp(8.0f)), (int) (fDp3 + AndroidUtilities.dp(8.0f)));
            this.lockIcon.draw(canvas);
            canvas.restore();
        }

        @Override
        public final void drawScrim(Canvas canvas, float f) {
            float fLerp;
            float fLerp2;
            float fLerp3;
            float fDp;
            float circleHeight;
            int i = this.scrimViewBackgroundColor;
            if (i != 0) {
                Paint paint = this.scrimViewBackgroundPaint;
                paint.setColor(i);
                paint.setAlpha((int) (Color.alpha(this.scrimViewBackgroundColor) * f));
                float f2 = this.open.value;
                float f3 = this.animatedPriceVisible.value;
                if (this.newCounterPos) {
                    fLerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f2) - this.circlePadX;
                    fLerp3 = getCircleHeight() * f2;
                    fLerp2 = ((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (fLerp3 / 2.0f);
                } else {
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f2) - this.circlePadX, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f3);
                    fLerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f3);
                    fLerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f3) * f2;
                }
                float fLerp4 = AndroidUtilities.lerp(getCircleWidth(), this.priceText.getCurrentWidth() + AndroidUtilities.dp(this.isNewDesignSendButton ? 20.0f : 22.0f), f3) * f2;
                if (f2 > 0.0f && fLerp4 > 0.0f && fLerp3 > 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f4 = fLerp3 / 2.0f;
                    rectF.set(fLerp - fLerp4, fLerp2 - f4, fLerp, f4 + fLerp2);
                    rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                    float fMin = (Math.min(fLerp4, fLerp3) / 2.0f) + AndroidUtilities.dp(4.0f);
                    canvas.drawRoundRect(rectF, fMin, fMin, paint);
                }
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.count;
                float fIsNotEmpty = (1.0f - f3) * animatedTextDrawable.isNotEmpty();
                if (fIsNotEmpty > 0.0f) {
                    float fMax = Math.max(animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                    if (this.newCounterPos) {
                        fDp = fLerp - AndroidUtilities.dp(50.0f);
                        circleHeight = (fMax / 2.0f) + (fLerp2 - (getCircleHeight() / 2.0f));
                    } else {
                        float f5 = fMax / 2.0f;
                        float measuredWidth = (getMeasuredWidth() - this.circlePadX) - f5;
                        float measuredHeight = (getMeasuredHeight() - this.circlePadY) - f5;
                        fDp = measuredWidth;
                        circleHeight = measuredHeight;
                    }
                    canvas.drawCircle(fDp, circleHeight, ((fMax / 2.0f) + AndroidUtilities.dp(2.0f)) * fIsNotEmpty * this.countBounceScale, paint);
                }
            }
            draw(canvas);
        }

        @Override
        public final void getBounds(RectF rectF) {
            float circleWidth = getCircleWidth();
            float circleHeight = getCircleHeight();
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(4.0f)) - this.circlePadX;
            float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(4.0f)) - this.circlePadY;
            rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
        }

        public int getCircleHeight() {
            int i = this.circleHeight;
            return i >= 0 ? i : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        }

        public int getCircleWidth() {
            int i = this.circleWidth;
            return i >= 0 ? i : getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        }

        public int getFillColor() {
            return Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider);
        }

        public boolean isInScheduleMode() {
            return false;
        }

        public boolean isInactive() {
            return false;
        }

        public abstract boolean isOpen();

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            int iM;
            int measuredHeight;
            float f;
            float fLerp;
            float fLerp2;
            float fLerp3;
            float f2;
            float measuredWidth;
            float measuredHeight2;
            float fDp;
            float f3;
            int iSave = canvas.save();
            if (this.isNewDesignSendButton) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            }
            updateColors();
            float fDpf2 = AndroidUtilities.dpf2(3.0f);
            float fDpf3 = AndroidUtilities.dpf2(38.0f);
            float fDpf4 = AndroidUtilities.dpf2(20.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.priceText;
            float fLerp4 = AndroidUtilities.lerp(Math.max(fDpf3, animatedTextDrawable.getCurrentWidth() + fDpf4), fDpf3, this.sameWidthFactor);
            RectF rectF = this.backgroundRect;
            rectF.set((getMeasuredWidth() - fLerp4) - fDpf2, (getMeasuredHeight() - fDpf3) - fDpf2, getMeasuredWidth() - fDpf2, getMeasuredHeight() - fDpf2);
            boolean z = this.isNewDesignSendButton;
            Paint paint = this.backgroundPaint;
            if (z) {
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
            }
            Drawable drawable = isInactive() ? this.inactiveDrawable : this.drawable;
            if (this.isNewDesignSendButton) {
                iM = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
                measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
            } else {
                iM = zzle.m(getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
                measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
                if (isInScheduleMode()) {
                    measuredHeight -= AndroidUtilities.dp(1.0f);
                } else {
                    iM += AndroidUtilities.dp(2.0f);
                }
            }
            int i = iM;
            int i2 = measuredHeight;
            float f4 = this.loadingAnimatedShown.set(this.loadingShown);
            float f5 = this.open.set(isOpen());
            float f6 = this.animatedPriceVisible.set(this.starsPrice > 0 && !this.hidePrice) * (1.0f - this.ephemeralFactor);
            float f7 = this.appear.set(1.0f, false);
            if (f5 < 1.0f) {
                canvas2.save();
                f = 2.0f;
                float f8 = 1.0f - f7;
                canvas2.translate((-AndroidUtilities.dp(24.0f)) * f8, AndroidUtilities.dp(24.0f) * f8);
                float fLerp5 = AndroidUtilities.lerp(0.35f, 1.0f, f7);
                float f9 = i;
                float f10 = i2;
                canvas2.scale(fLerp5, fLerp5, (drawable.getIntrinsicWidth() / 2.0f) + f9, (drawable.getIntrinsicHeight() / 2.0f) + f10);
                canvas2.rotate(60.0f * f8, (drawable.getIntrinsicWidth() / 2.0f) + f9, (drawable.getIntrinsicHeight() / 2.0f) + f10);
                drawable.setBounds(i, i2, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i2);
                drawable.setAlpha((int) ((1.0f - f6) * 255.0f));
                drawable.draw(canvas2);
                canvas2.restore();
            } else {
                f = 2.0f;
            }
            if (this.newCounterPos) {
                fLerp = AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f5) - this.circlePadX;
                fLerp3 = getCircleHeight() * f5;
                fLerp2 = ((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (fLerp3 / f);
            } else {
                fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(getMeasuredWidth() - (getMeasuredHeight() / f), getMeasuredWidth() - AndroidUtilities.dp(4.0f), f5) - this.circlePadX, getMeasuredWidth() - AndroidUtilities.dp(9.0f), f6);
                fLerp2 = AndroidUtilities.lerp(((getMeasuredHeight() - this.circlePadY) - AndroidUtilities.dp(4.0f)) - (getCircleHeight() / f), getMeasuredHeight() - AndroidUtilities.dp(24.0f), f6);
                fLerp3 = AndroidUtilities.lerp(getCircleHeight(), AndroidUtilities.dp(32.0f), f6) * f5;
            }
            float f11 = fLerp3;
            float f12 = fLerp;
            float fLerp6 = AndroidUtilities.lerp(getCircleWidth(), animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(this.isNewDesignSendButton ? 20.0f : 22.0f), f6);
            float fLerp7 = AndroidUtilities.lerp(fLerp6, f11, this.sameWidthFactor) * f5;
            float f13 = fLerp6 - fLerp7;
            float f14 = f12 - (fLerp7 / f);
            setPivotX(f14);
            setPivotY(fLerp2);
            int i3 = i2;
            float fLerp8 = AndroidUtilities.lerp(1.0f, 0.79f, this.ephemeralFactor);
            if (f5 > 0.0f) {
                canvas2.save();
                Path path = this.path;
                path.rewind();
                f2 = 0.0f;
                float fMin = Math.min(fLerp7, f11) / f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f15 = f11 / f;
                float f16 = fLerp2 - f15;
                float f17 = fLerp2 + f15;
                rectF2.set(f12 - fLerp7, f16, f12, f17);
                path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
                float fCenterX = rectF2.centerX();
                float fCenterY = rectF2.centerY();
                float f18 = f14;
                if (this.ephemeralFactor > 0.0f) {
                    if (this.ephemeralOutlineDrawable == null) {
                        this.ephemeralOutlineDrawable = getContext().getResources().getDrawable(R.drawable.send_outline);
                    }
                    this.ephemeralOutlineDrawable.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                    DrawableUtils.setBounds(this.ephemeralOutlineDrawable, fCenterX, fCenterY, 17);
                    DrawableUtils.drawWithScale(canvas2, this.ephemeralOutlineDrawable, this.ephemeralFactor);
                } else {
                    f12 = f12;
                }
                canvas2.scale(fLerp8, fLerp8, fCenterX, fCenterY);
                if (this.blurredBackgroundDrawable != null) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    rectF2.round(rect);
                    rect.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                    this.blurredBackgroundDrawable.setBounds(rect);
                    this.blurredBackgroundDrawable.draw(canvas2);
                }
                if (!this.isNewDesignSendButton) {
                    canvas2.drawPath(path, paint);
                }
                canvas2.clipPath(path);
                int i4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                if (i4 > 0) {
                    Paint paint2 = this.loadingPaint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (f4 * 255.0f));
                    float fDp2 = AndroidUtilities.dp(8.66f);
                    rectF2.set(f18 - fDp2, fLerp2 - fDp2, f18 + fDp2, fDp2 + fLerp2);
                    if (this.infiniteLoading) {
                        long jCurrentTimeMillis = System.currentTimeMillis() % 5400;
                        float interpolation = (1520 * jCurrentTimeMillis) / 5400.0f;
                        float fMax = Math.max(0.0f, interpolation - 20.0f);
                        int i5 = 0;
                        while (i5 < 4) {
                            int i6 = i5 * 1350;
                            long j = jCurrentTimeMillis;
                            FastOutSlowInInterpolator fastOutSlowInInterpolator = this.loadingInterpolator;
                            interpolation += fastOutSlowInInterpolator.getInterpolation((j - ((long) i6)) / 667.0f) * 250.0f;
                            fMax += fastOutSlowInInterpolator.getInterpolation((j - ((long) (i6 + 667))) / 667.0f) * 250.0f;
                            i5++;
                            jCurrentTimeMillis = j;
                        }
                        canvas2 = canvas;
                        f2 = 0.0f;
                        canvas2.drawArc(AndroidUtilities.rectTmp, fMax, interpolation - fMax, false, paint2);
                    } else {
                        canvas2 = canvas;
                        canvas2.drawArc(rectF2, ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f) - 90.0f, this.loadingAnimatedProgress.set(this.loadingProgress, false) * 360.0f, false, paint2);
                    }
                    canvas2.save();
                    float fLerp9 = AndroidUtilities.lerp(1.0f, 0.6f, f4);
                    canvas2.scale(fLerp9, fLerp9, f18, fLerp2);
                    invalidate();
                } else {
                    f4 = f4;
                    i3 = i3;
                    i4 = i4;
                    f18 = f18;
                }
                if (f6 > f2) {
                    if (this.newCounterPos) {
                        animatedTextDrawable.setBounds((f12 - animatedTextDrawable.currentWidth) - AndroidUtilities.dp(11.0f), f16, f12 - AndroidUtilities.dp(11.0f), f17);
                    } else if (this.isNewDesignSendButton) {
                        animatedTextDrawable.setBounds(rectF.left + AndroidUtilities.dp(10.0f), rectF.top, rectF.right, rectF.bottom);
                    } else {
                        animatedTextDrawable.setBounds((getMeasuredWidth() - animatedTextDrawable.currentWidth) - AndroidUtilities.dp(20.0f), getMeasuredHeight() - AndroidUtilities.dp(48.0f), getMeasuredWidth() - AndroidUtilities.dp(20.0f), getMeasuredHeight());
                    }
                    f3 = 1.0f;
                    animatedTextDrawable.alpha = (int) ((1.0f - f4) * f6 * 255.0f);
                    animatedTextDrawable.draw(canvas2);
                } else {
                    f3 = 1.0f;
                }
                this.drawableInverse.setAlpha((int) ((f3 - f6) * (f3 - f4) * 255.0f));
                if (this.circleWidth > 0) {
                    Drawable drawable2 = this.drawableInverse;
                    drawable2.setBounds((int) (f18 - (drawable2.getIntrinsicWidth() / f)), (int) (fLerp2 - (this.drawableInverse.getIntrinsicHeight() / f)), (int) ((this.drawableInverse.getIntrinsicWidth() / f) + f18), (int) ((this.drawableInverse.getIntrinsicHeight() / f) + fLerp2));
                } else {
                    this.drawableInverse.setBounds(i, i3, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i3);
                }
                this.drawableInverse.draw(canvas2);
                if (i4 > 0) {
                    canvas2.restore();
                }
                canvas2.restore();
            } else {
                f12 = f12;
                f2 = 0.0f;
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.count;
            float fIsNotEmpty = (1.0f - f6) * animatedTextDrawable2.isNotEmpty();
            if (!this.locked) {
                float fMax2 = Math.max(animatedTextDrawable2.getCurrentWidth() + AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f));
                if (this.newCounterPos) {
                    measuredWidth = (f12 - AndroidUtilities.dp(50.0f)) + f13;
                    measuredHeight2 = (fMax2 / f) + (fLerp2 - (getCircleHeight() / f));
                    fDp = AndroidUtilities.dp(0.66f);
                } else {
                    float f19 = fMax2 / f;
                    measuredWidth = (getMeasuredWidth() - this.circlePadX) - f19;
                    measuredHeight2 = (getMeasuredHeight() - this.circlePadY) - f19;
                    fDp = 0.0f;
                }
                float f20 = fMax2 / f;
                animatedTextDrawable2.setBounds((int) (measuredWidth - f20), (int) ((measuredHeight2 - f20) - fDp), (int) (measuredWidth + f20), (int) ((measuredHeight2 + f20) - fDp));
                if (fIsNotEmpty > f2) {
                    float fLerp10 = AndroidUtilities.lerp(1.0f, 0.85f, this.ephemeralFactor);
                    canvas2.save();
                    canvas2.scale(fLerp10, fLerp10, measuredWidth, measuredHeight2);
                    if (!this.isNewDesignSendButton) {
                        canvas2.drawCircle(measuredWidth, measuredHeight2, (AndroidUtilities.dp(f) + f20) * fIsNotEmpty * this.countBounceScale, Theme.PAINT_CLEAR);
                        canvas2.drawCircle(measuredWidth, measuredHeight2, f20 * fIsNotEmpty * this.countBounceScale, paint);
                    }
                    animatedTextDrawable2.alpha = (int) (fIsNotEmpty * 255.0f);
                    animatedTextDrawable2.draw(canvas2);
                    canvas2.restore();
                }
            }
            if (fIsNotEmpty < 1.0f) {
                int iDp = AndroidUtilities.dp(8.0f);
                int iLerp = (int) AndroidUtilities.lerp(((getMeasuredWidth() - (getCircleWidth() / f)) - this.circlePadX) + AndroidUtilities.dp(12.0f), f12 - AndroidUtilities.dp(f), f6);
                int iLerp2 = (int) AndroidUtilities.lerp(((getMeasuredHeight() - (getCircleHeight() / f)) - this.circlePadY) + AndroidUtilities.dp(10.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f), f6);
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
                swapAnimatedEmojiDrawable.setBounds(iLerp - iDp, iLerp2 - iDp, iLerp + iDp, iLerp2 + iDp);
                swapAnimatedEmojiDrawable.alpha = (int) ((1.0f - fIsNotEmpty) * 255.0f);
                swapAnimatedEmojiDrawable.draw(canvas2);
            }
            if (!this.isNewDesignSendButton) {
                canvas2.restore();
            }
            canvas2.restoreToCount(iSave);
            super.onDraw(canvas);
        }

        @Override
        public final boolean onTouchEvent(android.view.MotionEvent r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.SendButton.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
            this.blurredBackgroundDrawable = blurredBackgroundDrawable;
            blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
            this.blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
        }

        public void setCircleSize(int i) {
            this.circleWidth = i;
            this.circleHeight = i;
        }

        public final void setCount(int i, boolean z) {
            this.count.setText(i > 0 ? DiffUtil.m(i, "") : "", z, true);
            invalidate();
        }

        public void setEffect(long j) {
            TLRPC.TL_availableEffect effect = MessagesController.getInstance(UserConfig.selectedAccount).getEffect(j);
            setEmoji(effect != null ? Emoji.getEmojiDrawable(effect.emoticon) : null);
        }

        public void setEmoji(Drawable drawable) {
            this.emojiDrawable.set(drawable, true);
        }

        public void setEphemeralFactor(float f) {
            if (this.ephemeralFactor != f) {
                this.ephemeralFactor = f;
                invalidate();
            }
        }

        public final void setLoading(boolean z) {
            if (this.loadingShown == z && (!z || Math.abs(this.loadingProgress - (-3.0f)) < 0.01f)) {
                if (this.infiniteLoading == (Math.abs(0.0f) < 0.01f)) {
                    return;
                }
            }
            this.infiniteLoading = Math.abs(0.0f) < 0.01f;
            if (!this.loadingShown && z) {
                this.loadingAnimatedProgress.set(0.0f, true);
            }
            AnimatedFloat animatedFloat = this.loadingAnimatedShown;
            animatedFloat.transitionDelay = (!z || animatedFloat.value < 1.0f) ? 0L : 650L;
            this.loadingShown = z;
            this.loadingProgress = z ? -3.0f : 1.0f;
            invalidate();
        }

        public void setLocked(boolean z) {
            if (this.locked == z) {
                return;
            }
            this.locked = z;
            invalidate();
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            this.bounce.setPressed(z);
        }

        public void setResourceId(int i) {
            if (this.resId != i) {
                this.resId = i;
                this.drawable = getContext().getResources().getDrawable(i).mutate();
                this.inactiveDrawable = getContext().getResources().getDrawable(i).mutate();
                this.drawableInverse = getContext().getResources().getDrawable(i).mutate();
                invalidate();
            }
        }

        public void setSameWidthFactor(float f) {
            if (this.sameWidthFactor != f) {
                this.sameWidthFactor = f;
                invalidate();
            }
        }

        public void setScrimViewBackgroundColor(int i) {
            this.scrimViewBackgroundColor = i;
            this.scrimViewBackgroundPaint.setColor(i);
        }

        public final void setStarsPrice(int i, long j, boolean z) {
            if (this.starsPrice == j && this.messagesCount == i) {
                return;
            }
            this.starsPrice = j;
            this.messagesCount = i;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.priceText;
            if (j > 0) {
                animatedTextDrawable.setText(StarsIntroActivity.replaceStars(false, BillingController$$ExternalSyntheticOutline0.m(j * ((long) Math.max(1, this.messagesCount)), ',', new StringBuilder("⭐️")), this.spans), z, true);
            } else {
                animatedTextDrawable.setText("", z, true);
            }
            if (z) {
                invalidate();
            } else {
                this.animatedPriceVisible.force(this.starsPrice > 0);
            }
        }

        public boolean shouldDrawBackground() {
            return this instanceof ChatAttachAlert.AnonymousClass24;
        }

        public final void updateColors() {
            boolean z = this.isNewDesignSendButton;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = z ? -1 : Theme.getColor(Theme.key_chat_messagePanelSend, resourcesProvider);
            if (color != this.drawableColor) {
                this.drawableColor = color;
                Drawable drawable = this.drawable;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                int color2 = Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider);
                this.inactiveDrawable.setColorFilter(new PorterDuffColorFilter(Color.argb(180, Color.red(color2), Color.green(color2), Color.blue(color2)), mode));
                this.drawableInverse.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelVoicePressed, resourcesProvider), mode));
            }
            boolean z2 = this.isNewDesignSendButton;
            Paint paint = this.backgroundPaint;
            if (z2) {
                paint.setColor(Theme.getColor(Theme.key_chat_messagePanelSend, resourcesProvider));
            } else if (shouldDrawBackground()) {
                paint.setColor(getFillColor());
            } else {
                paint.setColor(ColorUtils.setAlphaComponent(-1, 75));
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.count || drawable == this.emojiDrawable || drawable == this.priceText || super.verifyDrawable(drawable);
        }

        public final int width$1() {
            return (int) AndroidUtilities.lerp(this.circlePadX + getCircleWidth() + this.circlePadX, AndroidUtilities.dp(this.isNewDesignSendButton ? 20.0f : 22.0f) + AndroidUtilities.dp(18.0f) + this.priceText.currentWidth, (this.starsPrice > 0 ? 1.0f : 0.0f) * (isOpen() ? 1.0f : 0.0f));
        }
    }

    public final class SlideTextView extends View {
        public final Paint arrowPaint;
        public final Path arrowPath;
        public final TextPaint bluePaint;
        public float cancelAlpha;
        public final int cancelCharOffset;
        public StaticLayout cancelLayout;
        public final Rect cancelRect;
        public final String cancelString;
        public float cancelToProgress;
        public float cancelWidth;
        public final TextPaint grayPaint;
        public int lastSize;
        public long lastUpdateTime;
        public boolean moveForward;
        public boolean pressed;
        public BaseCell.RippleDrawableSafe selectableBackground;
        public float slideProgress;
        public float slideToAlpha;
        public final String slideToCancelString;
        public float slideToCancelWidth;
        public StaticLayout slideToLayout;
        public final boolean smallSize;
        public float xOffset;

        public SlideTextView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            this.xOffset = 0.0f;
            this.arrowPath = new Path();
            this.cancelRect = new Rect();
            boolean z = AndroidUtilities.displaySize.x <= AndroidUtilities.dp(320.0f);
            this.smallSize = z;
            TextPaint textPaint = new TextPaint(1);
            this.grayPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(z ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.bluePaint = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            int i = Theme.key_glass_defaultIcon;
            int i2 = ChatActivityEnterView.$r8$clinit;
            paint.setColor(ChatActivityEnterView.this.getThemedColor$6(i));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(z ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String string = LocaleController.getString(R.string.SlideToCancel2);
            this.slideToCancelString = string;
            String upperCase = LocaleController.getString("Cancel", R.string.Cancel).toUpperCase();
            this.cancelString = upperCase;
            this.cancelCharOffset = string.indexOf(upperCase);
            updateColors();
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.selectableBackground.setState(getDrawableState());
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectableBackground;
            if (rippleDrawableSafe != null) {
                rippleDrawableSafe.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f;
            float f2;
            float f3;
            float f4;
            if (this.slideToLayout == null || (staticLayout = this.cancelLayout) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.recordCircle == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(16.0f) + staticLayout.getWidth();
            TextPaint textPaint = this.grayPaint;
            textPaint.setColor(chatActivityEnterView.getThemedColor$6(Theme.key_chat_recordTime));
            textPaint.setAlpha((int) ((1.0f - this.cancelToProgress) * this.slideToAlpha * this.slideProgress));
            this.bluePaint.setAlpha((int) (this.cancelAlpha * this.cancelToProgress));
            Paint paint = this.arrowPaint;
            paint.setColor(textPaint.getColor());
            boolean z = this.smallSize;
            if (z) {
                this.xOffset = AndroidUtilities.dp(16.0f);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.lastUpdateTime;
                this.lastUpdateTime = System.currentTimeMillis();
                if (this.cancelToProgress == 0.0f && this.slideProgress > 0.8f) {
                    if (this.moveForward) {
                        float fDp = ((AndroidUtilities.dp(3.0f) / 250.0f) * jCurrentTimeMillis) + this.xOffset;
                        this.xOffset = fDp;
                        if (fDp > AndroidUtilities.dp(6.0f)) {
                            this.xOffset = AndroidUtilities.dp(6.0f);
                            this.moveForward = false;
                        }
                    } else {
                        float fDp2 = this.xOffset - ((AndroidUtilities.dp(3.0f) / 250.0f) * jCurrentTimeMillis);
                        this.xOffset = fDp2;
                        if (fDp2 < (-AndroidUtilities.dp(6.0f))) {
                            this.xOffset = -AndroidUtilities.dp(6.0f);
                            this.moveForward = true;
                        }
                    }
                }
            }
            int i = this.cancelCharOffset;
            boolean z2 = i >= 0;
            int iDp2 = AndroidUtilities.dp(5.0f) + ((int) ((getMeasuredWidth() - this.slideToCancelWidth) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.cancelWidth) / 2.0f);
            float primaryHorizontal = z2 ? this.slideToLayout.getPrimaryHorizontal(i) : 0.0f;
            if (z2) {
                f = 16.0f;
                f2 = (iDp2 + primaryHorizontal) - measuredWidth;
            } else {
                f = 16.0f;
                f2 = 0.0f;
            }
            float f5 = iDp2;
            float f6 = this.xOffset;
            float f7 = this.cancelToProgress;
            float fDp3 = (((((1.0f - f7) * f6) * this.slideProgress) + f5) - (f2 * f7)) + AndroidUtilities.dp(f);
            float fDp4 = z2 ? 0.0f : this.cancelToProgress * AndroidUtilities.dp(12.0f);
            if (this.cancelToProgress != 1.0f) {
                f3 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.recordCircle.getTranslationX() * 0.3f) + ((1.0f - this.slideProgress) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                TimerView timerView = chatActivityEnterView.recordTimerView;
                f4 = 2.0f;
                canvas.clipRect((timerView == null ? 0.0f : timerView.getLeftProperty()) + AndroidUtilities.dp(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i2 = (int) fDp3;
                canvas.translate((i2 - AndroidUtilities.dp(z ? 7.0f : 10.0f)) + translationX, fDp4);
                canvas.drawPath(this.arrowPath, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i2 + translationX, ((getMeasuredHeight() - this.slideToLayout.getHeight()) / 2.0f) + fDp4);
                this.slideToLayout.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f3 = 12.0f;
                f4 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.cancelLayout.getHeight()) / f4;
            if (!z2) {
                measuredHeight -= AndroidUtilities.dp(f3) - fDp4;
            }
            float f8 = z2 ? fDp3 + primaryHorizontal : measuredWidth;
            int width = (int) (this.cancelLayout.getWidth() + f8);
            int height = (int) (this.cancelLayout.getHeight() + measuredHeight);
            Rect rect = this.cancelRect;
            rect.set((int) f8, (int) measuredHeight, width, height);
            rect.inset(-AndroidUtilities.dp(f), -AndroidUtilities.dp(f));
            if (this.cancelToProgress > 0.0f) {
                this.selectableBackground.setBounds((getMeasuredWidth() / 2) - iDp, (getMeasuredHeight() / 2) - iDp, (getMeasuredWidth() / 2) + iDp, (getMeasuredHeight() / 2) + iDp);
                this.selectableBackground.draw(canvas);
                canvas.save();
                canvas.translate(f8, measuredHeight);
                this.cancelLayout.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.cancelToProgress != 1.0f) {
                invalidate();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.lastSize != measuredHeight) {
                this.lastSize = measuredHeight;
                TextPaint textPaint = this.grayPaint;
                this.slideToCancelWidth = textPaint.measureText(this.slideToCancelString);
                TextPaint textPaint2 = this.bluePaint;
                this.cancelWidth = textPaint2.measureText(this.cancelString);
                this.lastUpdateTime = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.arrowPath;
                path.reset();
                if (this.smallSize) {
                    float f = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(2.5f), f - AndroidUtilities.dpf2(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(AndroidUtilities.dpf2(2.5f), AndroidUtilities.dpf2(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(AndroidUtilities.dpf2(4.0f), f2 - AndroidUtilities.dpf2(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(5.0f) + f2);
                }
                int i3 = (int) this.slideToCancelWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.slideToLayout = new StaticLayout(this.slideToCancelString, textPaint, i3, alignment, 1.0f, 0.0f, false);
                this.cancelLayout = new StaticLayout(this.cancelString, textPaint2, (int) this.cancelWidth, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.cancelToProgress == 0.0f || !isEnabled()) {
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.cancelRect;
            if (action == 0) {
                boolean zContains = rect.contains(x, y);
                this.pressed = zContains;
                if (zContains) {
                    this.selectableBackground.setHotspot(x, y);
                    setPressed(true);
                }
                return this.pressed;
            }
            boolean z = this.pressed;
            if (!z) {
                return z;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x, y)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x, y)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long topicId = 0;
                if (chatActivityEnterView.hasRecordVideo && chatActivityEnterView.isInVideoMode) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.onFinishInitCameraRunnable);
                    chatActivityEnterView.delegate.needStartRecordVideo(5, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                    chatActivityEnterView.effectId = 0L;
                    chatActivityEnterView.sendButton.setEffect(0L);
                } else {
                    chatActivityEnterView.delegate.needStartRecordAudio(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.voiceOnce, 0L);
                }
                chatActivityEnterView.audioToSend = null;
                chatActivityEnterView.audioToSendMessageObject = null;
                chatActivityEnterView.videoToSendMessageObject = null;
                chatActivityEnterView.millisecondsRecorded = 0L;
                chatActivityEnterView.recordingAudioVideo = false;
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.currentAccount);
                long j = chatActivityEnterView.dialog_id;
                ChatActivity chatActivity = chatActivityEnterView.parentFragment;
                if (chatActivity != null && chatActivity.isTopic) {
                    topicId = chatActivity.getTopicId();
                }
                mediaDataController.pushDraftVoiceMessage(j, topicId, null);
                chatActivityEnterView.updateRecordInterface(2, true);
                chatActivityEnterView.checkSendButton(true);
            }
            return true;
        }

        public final void updateColors() {
            int i = Theme.key_chat_recordTime;
            int i2 = ChatActivityEnterView.$r8$clinit;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int themedColor$6 = chatActivityEnterView.getThemedColor$6(i);
            TextPaint textPaint = this.grayPaint;
            textPaint.setColor(themedColor$6);
            int i3 = Theme.key_chat_recordVoiceCancel;
            int themedColor$7 = chatActivityEnterView.getThemedColor$6(i3);
            TextPaint textPaint2 = this.bluePaint;
            textPaint2.setColor(themedColor$7);
            this.slideToAlpha = textPaint.getAlpha();
            this.cancelAlpha = textPaint2.getAlpha();
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(60.0f), 0, ColorUtils.setAlphaComponent(chatActivityEnterView.getThemedColor$6(i3), 26));
            this.selectableBackground = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
            rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.selectableBackground == drawable || super.verifyDrawable(drawable);
        }
    }

    public final class SlowModeBtn extends FrameLayout {
        public final RectF bgRect;
        public final Drawable closeDrawable;
        public final Paint gradientPaint;
        public boolean isPremiumMode;
        public final SimpleTextView textView;

        public SlowModeBtn(Activity activity) {
            super(activity);
            this.bgRect = new RectF();
            this.gradientPaint = new Paint(1);
            this.isPremiumMode = false;
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            this.textView = simpleTextView;
            addView(simpleTextView, LayoutHelper.createFrame(-1.0f, -1));
            setWillNotDraw(false);
            Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
            this.closeDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            setClipToPadding(false);
            setClipChildren(false);
            ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (!(view instanceof SimpleTextView) || !this.isPremiumMode) {
                return super.drawChild(canvas, view, j);
            }
            SimpleTextView simpleTextView = (SimpleTextView) view;
            canvas.save();
            canvas.scale(0.8f, 0.8f);
            canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int color = simpleTextView.getTextPaint().getColor();
            simpleTextView.getTextPaint().setColor(-1);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            simpleTextView.getTextPaint().setColor(color);
            canvas.restore();
            return zDrawChild;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.isPremiumMode) {
                canvas.save();
                int iDp = AndroidUtilities.dp(26.0f);
                canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - iDp) / 2.0f);
                RectF rectF = this.bgRect;
                float f = iDp;
                rectF.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f);
                float f2 = f / 2.0f;
                canvas.drawRoundRect(rectF, f2, f2, this.gradientPaint);
                int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - AndroidUtilities.dp(6.0f);
                Drawable drawable = this.closeDrawable;
                canvas.translate(measuredWidth - drawable.getIntrinsicWidth(), AndroidUtilities.dp(5.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public final class TimerView extends View {
        public StaticLayout inLayout;
        public boolean isRunning;
        public long lastSendTypingTime;
        public float left;
        public String oldString;
        public StaticLayout outLayout;
        public final float replaceDistance;
        public final SpannableStringBuilder replaceIn;
        public final SpannableStringBuilder replaceOut;
        public SpannableStringBuilder replaceStable;
        public float replaceTransition;
        public long startTime;
        public long stopTime;
        public boolean stoppedInternal;
        public TextPaint textPaint;

        public TimerView(Context context) {
            super(context);
            this.replaceIn = new SpannableStringBuilder();
            this.replaceOut = new SpannableStringBuilder();
            this.replaceStable = new SpannableStringBuilder();
            this.replaceDistance = AndroidUtilities.dp(15.0f);
        }

        public float getLeftProperty() {
            return this.left;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            String str;
            boolean z = false;
            TextPaint textPaint = this.textPaint;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (textPaint == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.textPaint = textPaint2;
                textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
                this.textPaint.setTypeface(AndroidUtilities.bold());
                TextPaint textPaint3 = this.textPaint;
                int i = Theme.key_chat_recordTime;
                int i2 = ChatActivityEnterView.$r8$clinit;
                textPaint3.setColor(chatActivityEnterView.getThemedColor$6(i));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.isRunning ? jCurrentTimeMillis - this.startTime : this.stopTime - this.startTime;
            long j2 = j / 1000;
            int i3 = ((int) (j % 1000)) / 10;
            if (chatActivityEnterView.isInVideoMode && j >= 59500 && !this.stoppedInternal) {
                chatActivityEnterView.startedDraggingX = -1.0f;
                chatActivityEnterView.delegate.needStartRecordVideo(3, 0, chatActivityEnterView.voiceOnce ? Integer.MAX_VALUE : 0, chatActivityEnterView.effectId, 0L, true);
                chatActivityEnterView.effectId = 0L;
                chatActivityEnterView.sendButton.setEffect(0L);
                this.stoppedInternal = true;
            }
            if (this.isRunning && jCurrentTimeMillis > this.lastSendTypingTime + 5000) {
                this.lastSendTypingTime = jCurrentTimeMillis;
                MessagesController.getInstance(chatActivityEnterView.currentAccount).sendTyping(chatActivityEnterView.dialog_id, chatActivityEnterView.getThreadMessageId(), chatActivityEnterView.isInVideoMode ? 7 : 1, 0);
            }
            String timerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j2, i3);
            if (timerDurationFast.length() < 3 || (str = this.oldString) == null || str.length() < 3 || timerDurationFast.length() != this.oldString.length() || timerDurationFast.charAt(timerDurationFast.length() - 3) == this.oldString.charAt(timerDurationFast.length() - 3)) {
                if (this.replaceStable == null) {
                    this.replaceStable = new SpannableStringBuilder(timerDurationFast);
                }
                if (this.replaceStable.length() == 0 || this.replaceStable.length() != timerDurationFast.length()) {
                    this.replaceStable.clear();
                    this.replaceStable.append((CharSequence) timerDurationFast);
                } else {
                    SpannableStringBuilder spannableStringBuilder = this.replaceStable;
                    spannableStringBuilder.replace(spannableStringBuilder.length() - 1, this.replaceStable.length(), (CharSequence) timerDurationFast, (timerDurationFast.length() - 1) - (timerDurationFast.length() - this.replaceStable.length()), timerDurationFast.length());
                }
            } else {
                int length = timerDurationFast.length();
                SpannableStringBuilder spannableStringBuilder2 = this.replaceIn;
                spannableStringBuilder2.clear();
                SpannableStringBuilder spannableStringBuilder3 = this.replaceOut;
                spannableStringBuilder3.clear();
                this.replaceStable.clear();
                spannableStringBuilder2.append((CharSequence) timerDurationFast);
                spannableStringBuilder3.append((CharSequence) this.oldString);
                this.replaceStable.append((CharSequence) timerDurationFast);
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < length - 1; i8++) {
                    if (this.oldString.charAt(i8) != timerDurationFast.charAt(i8)) {
                        if (i7 == 0) {
                            i5 = i8;
                        }
                        i7++;
                        if (i6 != 0) {
                            CountrySelectActivity.AnonymousClass5 anonymousClass5 = new CountrySelectActivity.AnonymousClass5(z);
                            if (i8 == length - 2) {
                                i6++;
                            }
                            int i9 = i6 + i4;
                            spannableStringBuilder2.setSpan(anonymousClass5, i4, i9, 33);
                            spannableStringBuilder3.setSpan(anonymousClass5, i4, i9, 33);
                            i6 = 0;
                        }
                    } else {
                        if (i6 == 0) {
                            i4 = i8;
                        }
                        i6++;
                        if (i7 != 0) {
                            this.replaceStable.setSpan(new CountrySelectActivity.AnonymousClass5(z), i5, i7 + i5, 33);
                            i7 = 0;
                        }
                    }
                }
                if (i6 != 0) {
                    CountrySelectActivity.AnonymousClass5 anonymousClass6 = new CountrySelectActivity.AnonymousClass5(z);
                    int i10 = i6 + i4 + 1;
                    spannableStringBuilder2.setSpan(anonymousClass6, i4, i10, 33);
                    spannableStringBuilder3.setSpan(anonymousClass6, i4, i10, 33);
                }
                if (i7 != 0) {
                    this.replaceStable.setSpan(new CountrySelectActivity.AnonymousClass5(z), i5, i7 + i5, 33);
                }
                TextPaint textPaint4 = this.textPaint;
                int measuredWidth = getMeasuredWidth();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.inLayout = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
                this.outLayout = new StaticLayout(spannableStringBuilder3, this.textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
                this.replaceTransition = 1.0f;
            }
            float f = this.replaceTransition;
            if (f != 0.0f) {
                float f2 = f - 0.15f;
                this.replaceTransition = f2;
                if (f2 < 0.0f) {
                    this.replaceTransition = 0.0f;
                }
            }
            float measuredHeight = getMeasuredHeight() / 2;
            if (this.replaceTransition == 0.0f) {
                this.replaceStable.clearSpans();
                StaticLayout staticLayout = new StaticLayout(this.replaceStable, this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                canvas.save();
                canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
                staticLayout.draw(canvas);
                canvas.restore();
                this.left = staticLayout.getLineWidth(0) + 0.0f;
            } else {
                StaticLayout staticLayout2 = this.inLayout;
                float f3 = this.replaceDistance;
                if (staticLayout2 != null) {
                    canvas.save();
                    this.textPaint.setAlpha((int) ((1.0f - this.replaceTransition) * 255.0f));
                    canvas.translate(0.0f, (measuredHeight - (this.inLayout.getHeight() / 2.0f)) - (this.replaceTransition * f3));
                    this.inLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.outLayout != null) {
                    canvas.save();
                    this.textPaint.setAlpha((int) (this.replaceTransition * 255.0f));
                    canvas.translate(0.0f, DiffUtil.m(1.0f, this.replaceTransition, f3, measuredHeight - (this.outLayout.getHeight() / 2.0f)));
                    this.outLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.save();
                this.textPaint.setAlpha(255);
                StaticLayout staticLayout3 = new StaticLayout(this.replaceStable, this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
                staticLayout3.draw(canvas);
                canvas.restore();
                this.left = staticLayout3.getLineWidth(0) + 0.0f;
            }
            this.oldString = timerDurationFast;
            if (this.isRunning || this.replaceTransition != 0.0f) {
                invalidate();
            }
        }

        public final void stop() {
            if (this.isRunning) {
                this.isRunning = false;
                if (this.startTime > 0) {
                    this.stopTime = System.currentTimeMillis();
                }
                invalidate();
            }
            this.lastSendTypingTime = 0L;
        }
    }

    public ChatActivityEnterView(final Activity activity, SizeNotifierFrameLayout sizeNotifierFrameLayout, final ChatActivity chatActivity, boolean z, final Theme.ResourcesProvider resourcesProvider) {
        int i;
        String str;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate;
        super(activity);
        int i2 = 2;
        final int i3 = 0;
        this.emojiButtonScale = 1.0f;
        this.emojiButtonAlpha = 1.0f;
        this.emojiButtonPaddingScale = 1.0f;
        this.emojiButtonPaddingAlpha = 1.0f;
        this.attachLayoutAlpha = 1.0f;
        this.attachLayoutPaddingAlpha = 1.0f;
        this.horizontalPadding = 0.0f;
        int i4 = 1;
        this.sendButtonEnabled = true;
        int i5 = UserConfig.selectedAccount;
        this.currentAccount = i5;
        this.accountInstance = AccountInstance.getInstance(i5);
        this.lineCount = 1;
        this.currentLimit = -1;
        this.botMenuButtonType = 1;
        this.sendRoundEnabled = true;
        this.sendVoiceEnabled = true;
        this.sendPlainEnabled = true;
        this.animationParamsX = new HashMap();
        new RecyclerListView.AnonymousClass1(i4);
        this.ctrlPressed = false;
        this.shiftPressed = false;
        this.attachButtonAlpha = 1.0f;
        this.currentPopupContentType = -1;
        this.isPaused = true;
        this.startedDraggingX = -1.0f;
        this.distCanMove = AndroidUtilities.dp(80.0f);
        this.location = new int[2];
        this.messageWebPageSearch = true;
        this.animatingContentType = -1;
        this.doneButtonEnabled = true;
        this.openKeyboardRunnable = new AnonymousClass2(this, i3);
        this.updateExpandabilityRunnable = new zzr(this);
        this.roundedTranslationYProperty = new PhotoViewer.AnonymousClass13(Integer.class, "translationY", i2);
        Class<Float> cls = Float.class;
        this.recordCircleScale = new PhotoViewer.AnonymousClass13(cls, "scale", 3);
        this.recordControlsCircleScale = new PhotoViewer.AnonymousClass13(cls, "controlsScale", 4);
        this.redDotPaint = new Paint(1);
        this.onFinishInitCameraRunnable = new AnonymousClass2(this, i4);
        this.recordAudioVideoRunnable = new AnonymousClass8();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.paint = new Paint(1);
        this.pauseRect = new RectF();
        this.sendRect = new Rect();
        this.rect = new Rect();
        this.runEmojiPanelAnimation = new AnonymousClass2(this, i2);
        this.EMOJI_BUTTON_SCALE = new AnonymousClass10(this, 0);
        this.ATTACH_LAYOUT_ALPHA = new AnonymousClass10(this, 1);
        this.EMOJI_BUTTON_ALPHA = new AnonymousClass10(this, 2);
        this.ATTACH_LAYOUT_TRANSLATION_X = new AnonymousClass10(this, 3);
        this.MESSAGE_TEXT_TRANSLATION_X = new AnonymousClass10(this, 4);
        this.allowBlur = true;
        this.shouldDrawBackground = true;
        this.backgroundPaint = new Paint();
        this.composeShadowAlpha = 1.0f;
        this.blurBounds = new Rect();
        this.dismissSendPreview = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, i3);
        this.messageEditTextEnabled = true;
        this.spans = new ColoredImageSpan[1];
        this.streamingState = BotForumHelper.SteamingSendButtonState.NO_STREAMING;
        this.botCommandLastPosition = -1;
        Paint paint = new Paint(1);
        this.gradientPaint = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.clipGradient = linearGradient;
        this.clipMatrix = new Matrix();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        final int i6 = 1;
        this.topGradientAlpha = new AnimatedFloat(this, 0L, 280L, cubicBezierInterpolator);
        this.bottomGradientAlpha = new AnimatedFloat(this, 0L, 280L, cubicBezierInterpolator);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        CubicBezierInterpolator cubicBezierInterpolator2 = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
        this.animatorInputFieldHeight = new FactorAnimator(0, this, cubicBezierInterpolator2, 250L);
        this.animatorTopViewVisibility = new BoolAnimator(1, this, cubicBezierInterpolator2, 250L, false);
        this.animatorIsBlockedByStreaming = new BoolAnimator(2, this, cubicBezierInterpolator, 320L, false);
        this.animatorEphemeralMessageVisibility = new BoolAnimator(3, this, cubicBezierInterpolator, 320L, false);
        this.resourcesProvider = resourcesProvider;
        this.isChat = z;
        this.smoothKeyboard = z && !AndroidUtilities.isInMultiwindow && (chatActivity == null || !chatActivity.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.dotPaint = paint2;
        paint2.setColor(getThemedColor$6(Theme.key_chat_emojiPanelNewTrending));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.parentActivity = activity;
        this.parentFragment = chatActivity;
        if (chatActivity != null) {
            this.recordingGuid = chatActivity.getClassGuid();
        }
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        this.viewParentForEmojiView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(this);
        this.sendByEnter = MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false);
        ?? r0 = new FrameLayout(this, activity) {
            public final ChatActivityEnterView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 0:
                        ChatActivityEnterView chatActivityEnterView = this.this$0;
                        ChatActivityBotWebViewButton chatActivityBotWebViewButton = chatActivityEnterView.botWebViewButton;
                        return (chatActivityBotWebViewButton == null || chatActivityBotWebViewButton.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.botWebViewButton.dispatchTouchEvent(motionEvent);
                    default:
                        ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                        if (!chatActivityEnterView2.sendButtonEnabled || chatActivityEnterView2.streamingState == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                            return false;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i3) {
                    case 1:
                        ChatActivityEnterView chatActivityEnterView = this.this$0;
                        if (view == chatActivityEnterView.sendButton && chatActivityEnterView.textTransitionIsRunning) {
                            return true;
                        }
                        return super.drawChild(canvas, view, j);
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onSizeChanged(int i7, int i8, int i9, int i10) {
                switch (i3) {
                    case 1:
                        super.onSizeChanged(i7, i8, i9, i10);
                        setPivotX(i7 - AndroidUtilities.dp(22.0f));
                        setPivotY(i8 - AndroidUtilities.dp(22.0f));
                        break;
                    default:
                        super.onSizeChanged(i7, i8, i9, i10);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 1:
                        ChatActivityEnterView chatActivityEnterView = this.this$0;
                        if (!chatActivityEnterView.sendButtonEnabled || chatActivityEnterView.streamingState == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                            return false;
                        }
                        return super.onTouchEvent(motionEvent);
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.textFieldContainer = r0;
        r0.setClipChildren(false);
        r0.setClipToPadding(false);
        r0.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
        addView((View) r0, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(activity);
        this.messageEditTextContainer = anonymousClass16;
        anonymousClass16.setClipChildren(false);
        r0.addView(anonymousClass16, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ?? r3 = new ChatActivityEnterViewAnimatedIconView(activity) {
            @Override
            public final void onDraw(Canvas canvas) {
                Paint paint3;
                super.onDraw(canvas);
                if (getTag() != null) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    if (chatActivityEnterView.attachLayout == null || chatActivityEnterView.emojiViewVisible || MediaDataController.getInstance(chatActivityEnterView.currentAccount).getUnreadStickerSets().isEmpty() || (paint3 = chatActivityEnterView.dotPaint) == null) {
                        return;
                    }
                    canvas.drawCircle(AndroidUtilities.dp(9.0f) + (getWidth() / 2), (getHeight() / 2) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f), paint3);
                }
            }
        };
        this.emojiButton = r3;
        r3.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        r3.setFocusable(true);
        int iDp = AndroidUtilities.dp(7.5f);
        r3.setPadding(iDp, iDp, iDp, iDp);
        int i7 = Theme.key_glass_defaultIcon;
        int themedColor$6 = getThemedColor$6(i7);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r3.setColorFilter(new PorterDuffColorFilter(themedColor$6, mode));
        int i8 = Theme.key_listSelector;
        int themedColor$7 = getThemedColor$6(i8);
        float fDp = AndroidUtilities.dp(19.0f);
        int iDp2 = AndroidUtilities.dp(1.0f);
        int iDp3 = AndroidUtilities.dp(3.0f);
        r3.setBackground(Theme.createInsetRoundRectDrawable(fDp, themedColor$7, iDp2, iDp3, iDp2, iDp3));
        r3.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 19));
        anonymousClass16.addView((View) r3, LayoutHelper.createFrame(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        setEmojiButtonImage(false, false);
        ImageView imageView = new ImageView(activity);
        this.deleteRichDraftButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i7), mode));
        int themedColor$8 = getThemedColor$6(i8);
        float fDp2 = AndroidUtilities.dp(19.0f);
        int iDp4 = AndroidUtilities.dp(1.0f);
        int iDp5 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(Theme.createInsetRoundRectDrawable(fDp2, themedColor$8, iDp4, iDp5, iDp4, iDp5));
        imageView.setVisibility(8);
        imageView.setContentDescription(LocaleController.getString(R.string.ArticleDeleteDraft));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ChatActivityEnterView chatActivityEnterView = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(chatActivityEnterView.getContext(), 0, resourcesProvider);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivityEnterView$$ExternalSyntheticLambda30(chatActivityEnterView));
                        builder.makeRed(-1);
                        builder.show();
                        break;
                    default:
                        ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivity chatActivity2 = chatActivityEnterView2.parentFragment;
                        long dialogId = chatActivity2 != null ? chatActivity2.getDialogId() : chatActivityEnterView2.dialog_id;
                        boolean z2 = chatActivityEnterView2.richDraftActive;
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (!z2) {
                            if (chatActivityEnterView2.messageEditText != null) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatActivityEnterView2.getContext(), resourcesProvider2);
                                aIEditorAlert.setText(chatActivityEnterView2.messageEditText.getText());
                                aIEditorAlert.onUseListener = new ChatActivityEnterView$$ExternalSyntheticLambda53(chatActivityEnterView2, 1);
                                boolean z3 = chatActivityEnterView2.editingMessageObject != null;
                                ChatActivityEnterView$$ExternalSyntheticLambda54 chatActivityEnterView$$ExternalSyntheticLambda54 = new ChatActivityEnterView$$ExternalSyntheticLambda54(chatActivityEnterView2, dialogId, resourcesProvider2, 1);
                                aIEditorAlert.dialogId = dialogId;
                                aIEditorAlert.editing = z3;
                                aIEditorAlert.onSendListener = chatActivityEnterView$$ExternalSyntheticLambda54;
                                aIEditorAlert.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.richDraftMessage != null) {
                            AIEditorAlert aIEditorAlert2 = new AIEditorAlert(chatActivityEnterView2.getContext(), resourcesProvider2);
                            aIEditorAlert2.setText(chatActivityEnterView2.richDraftMessage);
                            aIEditorAlert2.onUseRichListener = new ChatActivityEnterView$$ExternalSyntheticLambda53(chatActivityEnterView2, 0);
                            ChatActivityEnterView$$ExternalSyntheticLambda54 chatActivityEnterView$$ExternalSyntheticLambda55 = new ChatActivityEnterView$$ExternalSyntheticLambda54(chatActivityEnterView2, dialogId, resourcesProvider2, 0);
                            aIEditorAlert2.dialogId = dialogId;
                            aIEditorAlert2.onSendRichListener = chatActivityEnterView$$ExternalSyntheticLambda55;
                            aIEditorAlert2.show();
                            break;
                        }
                        break;
                }
            }
        });
        anonymousClass16.addView(imageView, LayoutHelper.createFrame(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            int i9 = chatActivity != null ? chatActivity.chatMode : -1;
            GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(activity, 3);
            this.attachLayout = gLIconSettingsView;
            gLIconSettingsView.setOrientation(0);
            gLIconSettingsView.setEnabled(false);
            gLIconSettingsView.setClipChildren(false);
            anonymousClass16.addView(gLIconSettingsView, LayoutHelper.createFrame(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i9 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.notifyButton = imageView2;
                CrossOutDrawable crossOutDrawable = new CrossOutDrawable(activity, R.drawable.input_notify_on, i7);
                this.notifySilentDrawable = crossOutDrawable;
                imageView2.setImageDrawable(crossOutDrawable);
                this.notifySilentDrawable.setCrossOut(this.silent, false);
                if (this.silent) {
                    i = R.string.AccDescrChanSilentOn;
                    str = "AccDescrChanSilentOn";
                } else {
                    i = R.string.AccDescrChanSilentOff;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(LocaleController.getString(str, i));
                imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i7), PorterDuff.Mode.MULTIPLY));
                imageView2.setScaleType(scaleType);
                imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor$6(i8), 1, -1));
                imageView2.setVisibility((!this.canWriteToChannel || ((chatActivityEnterViewDelegate = this.delegate) != null && chatActivityEnterViewDelegate.hasScheduledMessages())) ? 8 : 0);
                gLIconSettingsView.addView(imageView2, LayoutHelper.createLinear(44, 44));
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        int i10;
                        String str2;
                        ChatActivity chatActivity2 = chatActivity;
                        if (chatActivity2 == null) {
                            return;
                        }
                        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                        chatActivityEnterView.silent = !chatActivityEnterView.silent;
                        if (chatActivityEnterView.notifySilentDrawable == null) {
                            chatActivityEnterView.notifySilentDrawable = new CrossOutDrawable(activity, R.drawable.input_notify_on, Theme.key_glass_defaultIcon);
                        }
                        chatActivityEnterView.notifySilentDrawable.setCrossOut(chatActivityEnterView.silent, true);
                        chatActivityEnterView.notifyButton.setImageDrawable(chatActivityEnterView.notifySilentDrawable);
                        MessagesController.getNotificationsSettings(chatActivityEnterView.currentAccount).edit().putBoolean("silent_" + chatActivityEnterView.dialog_id, chatActivityEnterView.silent).commit();
                        NotificationsController.getInstance(chatActivityEnterView.currentAccount).updateServerNotificationsSettings(chatActivityEnterView.dialog_id, chatActivity2 == null ? 0L : chatActivity2.getTopicId());
                        chatActivity2.createUndoView();
                        UndoView undoView = chatActivity2.undoView;
                        if (undoView != null) {
                            undoView.showWithAction(0L, !chatActivityEnterView.silent ? 54 : 55, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                        }
                        ImageView imageView3 = chatActivityEnterView.notifyButton;
                        if (chatActivityEnterView.silent) {
                            i10 = R.string.AccDescrChanSilentOn;
                            str2 = "AccDescrChanSilentOn";
                        } else {
                            i10 = R.string.AccDescrChanSilentOff;
                            str2 = "AccDescrChanSilentOff";
                        }
                        imageView3.setContentDescription(LocaleController.getString(str2, i10));
                        chatActivityEnterView.updateFieldHint(true);
                    }
                });
            }
            VoIPFragment.AnonymousClass9 anonymousClass9 = new VoIPFragment.AnonymousClass9(activity, 2);
            this.attachButton = anonymousClass9;
            anonymousClass9.setScaleType(scaleType);
            anonymousClass9.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i7), PorterDuff.Mode.MULTIPLY));
            anonymousClass9.setImageResource(R.drawable.msg_input_attach2);
            anonymousClass9.setBackground(Theme.createSelectorDrawable(getThemedColor$6(i8), 1, -1));
            anonymousClass16.addView(anonymousClass9, LayoutHelper.createFrame(44, 44, 85));
            anonymousClass9.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, i6));
            anonymousClass9.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            updateFieldRight(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.aiButton = imageView3;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(activity);
        this.aiButtonIcon = aiButtonDrawable;
        imageView3.setImageDrawable(aiButtonDrawable);
        imageView3.setScaleType(scaleType);
        int themedColor$9 = getThemedColor$6(i7);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor$9, mode2));
        imageView3.setBackground(Theme.createSelectorDrawable(getThemedColor$6(i8), 1, AndroidUtilities.dp(16.0f)));
        r0.addView(imageView3, LayoutHelper.createFrame(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        ScaleStateListAnimator.apply(imageView3, 0.1f, 1.5f);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        ChatActivityEnterView chatActivityEnterView = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(chatActivityEnterView.getContext(), 0, resourcesProvider);
                        String string = LocaleController.getString(R.string.ArticleDeleteDraftTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.ArticleDeleteDraftMessage);
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ChatActivityEnterView$$ExternalSyntheticLambda30(chatActivityEnterView));
                        builder.makeRed(-1);
                        builder.show();
                        break;
                    default:
                        ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                        ChatActivity chatActivity2 = chatActivityEnterView2.parentFragment;
                        long dialogId = chatActivity2 != null ? chatActivity2.getDialogId() : chatActivityEnterView2.dialog_id;
                        boolean z2 = chatActivityEnterView2.richDraftActive;
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        if (!z2) {
                            if (chatActivityEnterView2.messageEditText != null) {
                                AIEditorAlert aIEditorAlert = new AIEditorAlert(chatActivityEnterView2.getContext(), resourcesProvider2);
                                aIEditorAlert.setText(chatActivityEnterView2.messageEditText.getText());
                                aIEditorAlert.onUseListener = new ChatActivityEnterView$$ExternalSyntheticLambda53(chatActivityEnterView2, 1);
                                boolean z3 = chatActivityEnterView2.editingMessageObject != null;
                                ChatActivityEnterView$$ExternalSyntheticLambda54 chatActivityEnterView$$ExternalSyntheticLambda54 = new ChatActivityEnterView$$ExternalSyntheticLambda54(chatActivityEnterView2, dialogId, resourcesProvider2, 1);
                                aIEditorAlert.dialogId = dialogId;
                                aIEditorAlert.editing = z3;
                                aIEditorAlert.onSendListener = chatActivityEnterView$$ExternalSyntheticLambda54;
                                aIEditorAlert.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.richDraftMessage != null) {
                            AIEditorAlert aIEditorAlert2 = new AIEditorAlert(chatActivityEnterView2.getContext(), resourcesProvider2);
                            aIEditorAlert2.setText(chatActivityEnterView2.richDraftMessage);
                            aIEditorAlert2.onUseRichListener = new ChatActivityEnterView$$ExternalSyntheticLambda53(chatActivityEnterView2, 0);
                            ChatActivityEnterView$$ExternalSyntheticLambda54 chatActivityEnterView$$ExternalSyntheticLambda55 = new ChatActivityEnterView$$ExternalSyntheticLambda54(chatActivityEnterView2, dialogId, resourcesProvider2, 0);
                            aIEditorAlert2.dialogId = dialogId;
                            aIEditorAlert2.onSendRichListener = chatActivityEnterView$$ExternalSyntheticLambda55;
                            aIEditorAlert2.show();
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.richButton = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i7), mode2));
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor$6(i8), 1, AndroidUtilities.dp(16.0f)));
        r0.addView(imageView4, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(LocaleController.getString(R.string.ArticleEditor));
        ScaleStateListAnimator.apply(imageView4, 0.1f, 1.5f);
        imageView4.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 2));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.audioToSend != null) {
            createRecordAudioPanel();
        }
        ImageView imageView5 = new ImageView(activity);
        this.sendOutlineView = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        imageView5.setColorFilter(getThemedColor$6(Theme.key_telegram_color), mode);
        r0.addView(imageView5, LayoutHelper.createFrame(44, 44, 85));
        ?? r1 = new FrameLayout(this, activity) {
            public final ChatActivityEnterView this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i6) {
                    case 0:
                        ChatActivityEnterView chatActivityEnterView = this.this$0;
                        ChatActivityBotWebViewButton chatActivityBotWebViewButton = chatActivityEnterView.botWebViewButton;
                        return (chatActivityBotWebViewButton == null || chatActivityBotWebViewButton.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.botWebViewButton.dispatchTouchEvent(motionEvent);
                    default:
                        ChatActivityEnterView chatActivityEnterView2 = this.this$0;
                        if (!chatActivityEnterView2.sendButtonEnabled || chatActivityEnterView2.streamingState == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                            return false;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i6) {
                    case 1:
                        ChatActivityEnterView chatActivityEnterView = this.this$0;
                        if (view == chatActivityEnterView.sendButton && chatActivityEnterView.textTransitionIsRunning) {
                            return true;
                        }
                        return super.drawChild(canvas, view, j);
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public void onSizeChanged(int i10, int i11, int i12, int i13) {
                switch (i6) {
                    case 1:
                        super.onSizeChanged(i10, i11, i12, i13);
                        setPivotX(i10 - AndroidUtilities.dp(22.0f));
                        setPivotY(i11 - AndroidUtilities.dp(22.0f));
                        break;
                    default:
                        super.onSizeChanged(i10, i11, i12, i13);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i6) {
                    case 1:
                        ChatActivityEnterView chatActivityEnterView = this.this$0;
                        if (!chatActivityEnterView.sendButtonEnabled || chatActivityEnterView.streamingState == BotForumHelper.SteamingSendButtonState.BLOCKING) {
                            return false;
                        }
                        return super.onTouchEvent(motionEvent);
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.sendButtonContainer = r1;
        r1.setClipChildren(false);
        r1.setClipToPadding(false);
        r0.addView(r1, LayoutHelper.createFrame(100, 44, 85));
        AnonymousClass24 anonymousClass24 = new AnonymousClass24(activity, resourcesProvider);
        this.audioVideoButtonContainer = anonymousClass24;
        anonymousClass24.setSoundEffectsEnabled(false);
        r1.addView(anonymousClass24, LayoutHelper.createFrame(44, 44, 85));
        anonymousClass24.setFocusable(true);
        anonymousClass24.setImportantForAccessibility(1);
        Drawable drawableMutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.micOutline = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i7), mode2));
        Drawable drawableMutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.cameraOutline = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i7), mode2));
        ?? r6 = new ChatActivityEnterViewAnimatedIconView(activity) {
            public final Rect tmpRectF = new Rect();

            @Override
            public final void draw(Canvas canvas) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (!chatActivityEnterView.audioVideoButtonContainerForbidden) {
                    super.draw(canvas);
                    return;
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Rect rect = this.tmpRectF;
                rect.set(0, 0, measuredWidth, measuredHeight);
                rect.inset(AndroidUtilities.dp(7.5f), AndroidUtilities.dp(7.5f));
                Drawable drawable = getCurrentState() == ChatActivityEnterViewAnimatedIconView.State.VIDEO ? chatActivityEnterView.cameraOutline : chatActivityEnterView.micOutline;
                drawable.setBounds(rect);
                drawable.draw(canvas);
            }
        };
        this.audioVideoSendButton = r6;
        r6.setImportantForAccessibility(2);
        int iDp6 = AndroidUtilities.dp(10.0f);
        r6.setPadding(iDp6, iDp6, iDp6, iDp6);
        anonymousClass24.addView((View) r6, LayoutHelper.createFrame(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.cancelBotButton = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        AnonymousClass26 anonymousClass26 = new AnonymousClass26(2.0f, 0);
        this.progressDrawable = anonymousClass26;
        imageView6.setImageDrawable(anonymousClass26);
        imageView6.setContentDescription(LocaleController.getString("Cancel", R.string.Cancel));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        imageView6.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor$6(i8), 1, -1));
        r1.addView(imageView6, LayoutHelper.createFrame(44, 44, 85));
        imageView6.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 3));
        ?? r2 = new SendButton(activity, isInScheduleMode() ? R.drawable.input_schedule : R.drawable.send_plane_24, resourcesProvider) {
            @Override
            public final boolean isInScheduleMode() {
                return ChatActivityEnterView.this.isInScheduleMode();
            }

            @Override
            public final boolean isInactive() {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                return !chatActivityEnterView.isInScheduleMode() && chatActivityEnterView.slowModeTimer == Integer.MAX_VALUE;
            }

            @Override
            public final boolean isOpen() {
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = ChatActivityEnterView.this.messageSendPreview;
                return !(anonymousClass25 == null || anonymousClass25.dismissing) || this.starsPrice > 0;
            }

            @Override
            public final void setAlpha(float f) {
                super.setAlpha(f);
                int i10 = ChatActivityEnterView.$r8$clinit;
                ChatActivityEnterView.this.updateAttachButtonTranslationX();
            }

            @Override
            public final boolean shouldDrawBackground() {
                return ChatActivityEnterView.this.shouldDrawBackground;
            }
        };
        this.sendButton = r2;
        r2.setVisibility(4);
        r2.setContentDescription(LocaleController.getString(R.string.Send));
        r2.setSoundEffectsEnabled(false);
        r2.setScaleX(0.1f);
        r2.setScaleY(0.1f);
        r2.setAlpha(0.0f);
        r1.addView(r2, LayoutHelper.createFrame(100, 44, 85));
        r2.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 4));
        r2.setOnLongClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda7(this, 1));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            r1.setOnLongClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda7(this, 1));
        }
        SendButtonBlockedByTypingView sendButtonBlockedByTypingView = new SendButtonBlockedByTypingView(activity, resourcesProvider);
        this.sendButtonBlockedByTypingView = sendButtonBlockedByTypingView;
        sendButtonBlockedByTypingView.setVisibility(4);
        sendButtonBlockedByTypingView.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 0));
        r1.addView(sendButtonBlockedByTypingView, LayoutHelper.createFrame(44, 44, 85));
        SlowModeBtn slowModeBtn = new SlowModeBtn(activity);
        this.slowModeButton = slowModeBtn;
        SimpleTextView simpleTextView = slowModeBtn.textView;
        simpleTextView.setTextSize(16);
        slowModeBtn.invalidate();
        slowModeBtn.setVisibility(4);
        slowModeBtn.setSoundEffectsEnabled(false);
        slowModeBtn.setScaleX(0.1f);
        slowModeBtn.setScaleY(0.1f);
        slowModeBtn.setAlpha(0.0f);
        slowModeBtn.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        simpleTextView.setGravity(21);
        slowModeBtn.invalidate();
        simpleTextView.setTextColor(getThemedColor$6(i7));
        slowModeBtn.invalidate();
        r1.addView(slowModeBtn, LayoutHelper.createFrame(74, 44, 85));
        slowModeBtn.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 15));
        slowModeBtn.setOnLongClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda7(this, 0));
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        this.keyboardHeight = globalEmojiSettings.getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.keyboardHeightLand = globalEmojiSettings.getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        setRecordVideoButtonVisible(false, false);
        checkSendButton(false);
        checkChannelRights();
        createMessageEditText();
    }

    public static void access$8700(ChatActivityEnterView chatActivityEnterView) {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            chatActivityEnterView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(chatActivityEnterView, "lockAnimatedTranslation", chatActivityEnterView.startTranslation);
        objectAnimatorOfFloat.setStartDelay(100L);
        objectAnimatorOfFloat.setDuration(350L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(chatActivityEnterView, "snapAnimationProgress", 1.0f);
        objectAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        objectAnimatorOfFloat2.setDuration(250L);
        SharedConfig.removeLockRecordAudioVideoHint();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat, ObjectAnimator.ofFloat(chatActivityEnterView, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(chatActivityEnterView.slideText, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public static CharSequence applyMessageEntities(ArrayList arrayList, CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        AnimatedEmojiSpan animatedEmojiSpan;
        MediaDataController.sortEntities(arrayList);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(FormattedDateSpan.rebuildFormatedDateEntities(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            URLSpanUserMention uRLSpanUserMention = new URLSpanUserMention("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i2 = messageEntity.offset;
                            spannableStringBuilder.setSpan(uRLSpanUserMention, i2, messageEntity.length + i2, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            URLSpanUserMention uRLSpanUserMention2 = new URLSpanUserMention("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i3 = messageEntity.offset;
                            spannableStringBuilder.setSpan(uRLSpanUserMention2, i3, messageEntity.length + i3, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                            textStyleRun.flags |= 4;
                            TextStyleSpan textStyleSpan = new TextStyleSpan(textStyleRun, 0);
                            int i4 = messageEntity.offset;
                            MediaDataController.addStyleToText(textStyleSpan, i4, messageEntity.length + i4, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                                textStyleRun2.flags |= 1;
                                TextStyleSpan textStyleSpan2 = new TextStyleSpan(textStyleRun2, 0);
                                int i5 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan2, i5, messageEntity.length + i5, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun();
                                textStyleRun3.flags |= 2;
                                TextStyleSpan textStyleSpan3 = new TextStyleSpan(textStyleRun3, 0);
                                int i6 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan3, i6, messageEntity.length + i6, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                TextStyleSpan.TextStyleRun textStyleRun4 = new TextStyleSpan.TextStyleRun();
                                textStyleRun4.flags |= 8;
                                TextStyleSpan textStyleSpan4 = new TextStyleSpan(textStyleRun4, 0);
                                int i7 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan4, i7, messageEntity.length + i7, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                TextStyleSpan.TextStyleRun textStyleRun5 = new TextStyleSpan.TextStyleRun();
                                textStyleRun5.flags |= 16;
                                TextStyleSpan textStyleSpan5 = new TextStyleSpan(textStyleRun5, 0);
                                int i8 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan5, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                URLSpanReplacement uRLSpanReplacement = new URLSpanReplacement(messageEntity.url, null);
                                int i9 = messageEntity.offset;
                                spannableStringBuilder.setSpan(uRLSpanReplacement, i9, messageEntity.length + i9, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                TextStyleSpan.TextStyleRun textStyleRun6 = new TextStyleSpan.TextStyleRun();
                                textStyleRun6.flags |= 128;
                                int i10 = messageEntity.offset;
                                textStyleRun6.start = i10;
                                textStyleRun6.end = i10 + messageEntity.length;
                                textStyleRun6.urlEntity = messageEntity;
                                int i11 = messageEntity.offset;
                                FormattedDateSpan formattedDateSpan = new FormattedDateSpan(spannableStringBuilder.subSequence(i11, messageEntity.length + i11).toString(), textStyleRun6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(formattedDateSpan, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                TextStyleSpan.TextStyleRun textStyleRun7 = new TextStyleSpan.TextStyleRun();
                                textStyleRun7.flags |= 256;
                                TextStyleSpan textStyleSpan6 = new TextStyleSpan(textStyleRun7, 0);
                                int i13 = messageEntity.offset;
                                MediaDataController.addStyleToText(textStyleSpan6, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    TLRPC.Document document = tL_messageEntityCustomEmoji.document;
                                    animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, fontMetricsInt);
                                    animatedEmojiSpan.document = document;
                                } else {
                                    animatedEmojiSpan = new AnimatedEmojiSpan(tL_messageEntityCustomEmoji.document_id, 1.2f, fontMetricsInt);
                                }
                                int i14 = messageEntity.offset;
                                spannableStringBuilder.setSpan(animatedEmojiSpan, i14, messageEntity.length + i14, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        if (arrayList != null) {
            TreeSet<Integer> treeSet = new TreeSet();
            HashMap map = new HashMap();
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i15);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i16 = messageEntity2.offset;
                    int i17 = messageEntity2.length + i16;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i16));
                        treeSet.add(Integer.valueOf(i17));
                        map.put(Integer.valueOf(i16), Integer.valueOf((messageEntity2.collapsed ? 16 : 1) | (map.containsKey(Integer.valueOf(i16)) ? ((Integer) map.get(Integer.valueOf(i16))).intValue() : 0)));
                        map.put(Integer.valueOf(i17), Integer.valueOf((map.containsKey(Integer.valueOf(i17)) ? ((Integer) map.get(Integer.valueOf(i17))).intValue() : 0) | 2));
                    }
                }
            }
            int i18 = 0;
            int i19 = 0;
            boolean z = false;
            for (Integer num : treeSet) {
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) map.get(num)).intValue();
                if (i18 != iIntValue) {
                    int i20 = iIntValue - 1;
                    int i21 = (i20 < 0 || i20 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i20) != '\n') ? iIntValue : iIntValue - 1;
                    if (i19 > 0) {
                        QuoteSpan.putQuoteToEditable(spannableStringBuilder, i18, i21, z);
                    }
                    i18 = iIntValue + 1;
                    if (i18 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(iIntValue) != '\n') {
                        i18 = iIntValue;
                    }
                }
                if ((iIntValue2 & 2) != 0) {
                    i19--;
                }
                if ((iIntValue2 & 1) != 0 || (iIntValue2 & 16) != 0) {
                    i19++;
                    z = (iIntValue2 & 16) != 0;
                }
            }
            if (i18 < spannableStringBuilder.length() && i19 > 0) {
                QuoteSpan.putQuoteToEditable(spannableStringBuilder, i18, spannableStringBuilder.length(), z);
            }
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, (int[]) null);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= charSequenceReplaceEmoji.length()) {
                        if (!(charSequenceReplaceEmoji instanceof Spannable)) {
                            charSequenceReplaceEmoji = new SpannableStringBuilder(charSequenceReplaceEmoji);
                        }
                        ((SpannableStringBuilder) charSequenceReplaceEmoji).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequenceReplaceEmoji;
                        int i22 = messageEntity3.offset;
                        StringBuilder sb = new StringBuilder();
                        sb.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("\n");
                        spannableStringBuilder2.insert(i22, (CharSequence) sb.toString());
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return charSequenceReplaceEmoji;
    }

    public static boolean checkPremiumAnimatedEmoji(int i, long j, BaseFragment baseFragment, CharSequence charSequence) {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int i2;
        int i3;
        boolean z;
        TLRPC.ChatFull chatFull;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        ArrayList<TLRPC.StickerSetCovered> arrayList;
        int i4;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList4;
        ArrayList<TLRPC.Document> arrayList5;
        if (charSequence != null && baseFragment != null && !UserConfig.getInstance(i).isPremium() && UserConfig.getInstance(i).getClientUserId() != j && (charSequence instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) != null) {
            int i5 = 0;
            while (i5 < animatedEmojiSpanArr.length) {
                AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i5];
                if (animatedEmojiSpan != null) {
                    TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                    if (documentFindDocument == null) {
                        i3 = i;
                        documentFindDocument = AnimatedEmojiDrawable.findDocument(i3, animatedEmojiSpan.getDocumentId());
                    } else {
                        i3 = i;
                    }
                    long documentId = animatedEmojiSpanArr[i5].getDocumentId();
                    if (documentFindDocument != null) {
                        i2 = i5;
                        z = false;
                        break;
                    }
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i3).getStickerSets(5);
                    int size = stickerSets.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            i2 = i5;
                            z = false;
                            break;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i6);
                        i6++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        if (tL_messages_stickerSet2 != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet2.documents;
                            int size2 = arrayList6.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    i2 = i5;
                                    arrayList4 = stickerSets;
                                    z = false;
                                    break;
                                }
                                TLRPC.Document document = arrayList6.get(i7);
                                i7++;
                                z = false;
                                TLRPC.Document document2 = document;
                                i2 = i5;
                                arrayList4 = stickerSets;
                                if (document2.id == documentId) {
                                    documentFindDocument = document2;
                                    break;
                                }
                                stickerSets = arrayList4;
                                i5 = i2;
                            }
                        } else {
                            i2 = i5;
                            arrayList4 = stickerSets;
                            z = false;
                            break;
                        }
                        if (documentFindDocument != null) {
                            break;
                        }
                        stickerSets = arrayList4;
                        i5 = i2;
                    }
                    if (documentFindDocument == null) {
                        ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i3).getFeaturedEmojiSets();
                        int size3 = featuredEmojiSets.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i8);
                            i8++;
                            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                            if (stickerSetCovered2 != null && (arrayList3 = stickerSetCovered2.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered2.covers;
                                int size4 = arrayList7.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size4) {
                                        arrayList = featuredEmojiSets;
                                        i4 = size3;
                                        break;
                                    }
                                    TLRPC.Document document3 = arrayList7.get(i9);
                                    i9++;
                                    TLRPC.Document document4 = document3;
                                    arrayList = featuredEmojiSets;
                                    i4 = size3;
                                    if (document4.id == documentId) {
                                        documentFindDocument = document4;
                                        break;
                                    }
                                    featuredEmojiSets = arrayList;
                                    size3 = i4;
                                }
                            } else {
                                arrayList = featuredEmojiSets;
                                i4 = size3;
                                break;
                            }
                            if (documentFindDocument != null) {
                                break;
                            }
                            if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered2).documents;
                            } else if (!(stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) || stickerSetCovered2.set == null) {
                                arrayList2 = null;
                            } else {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i3).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                                if (stickerSet == null || (arrayList2 = stickerSet.documents) == null) {
                                    arrayList2 = null;
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                int size5 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size5) {
                                    TLRPC.Document document5 = arrayList2.get(i10);
                                    i10++;
                                    TLRPC.Document document6 = document5;
                                    if (document6.id == documentId) {
                                        documentFindDocument = document6;
                                        break;
                                    }
                                }
                            }
                            if (documentFindDocument != null) {
                                break;
                            }
                            featuredEmojiSets = arrayList;
                            size3 = i4;
                        }
                    }
                    if (documentFindDocument != null && (chatFull = MessagesController.getInstance(i3).getChatFull(-j)) != null && chatFull.emojiset != null && (groupStickerSetById = MediaDataController.getInstance(i3).getGroupStickerSetById(chatFull.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = groupStickerSetById.documents;
                        int size6 = arrayList8.size();
                        int i11 = 0;
                        while (i11 < size6) {
                            TLRPC.Document document7 = arrayList8.get(i11);
                            i11++;
                            if (document7.id == documentId) {
                                return z;
                            }
                        }
                    }
                    if (documentFindDocument == null || !MessageObject.isFreeEmoji(documentFindDocument)) {
                        BulletinFactory.of(baseFragment).createEmojiBulletin(documentFindDocument, AndroidUtilities.replaceTags(LocaleController.getString("UnlockPremiumEmojiHint", R.string.UnlockPremiumEmojiHint)), LocaleController.getString("PremiumMore", R.string.PremiumMore), new MessageSendPreview$15$$ExternalSyntheticLambda0(1, baseFragment)).show();
                        return true;
                    }
                } else {
                    i2 = i5;
                }
                i5 = i2 + 1;
            }
        }
        return false;
    }

    public MessageObject getThreadMessage() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.threadMessageObject;
        }
        return null;
    }

    public int getThreadMessageId() {
        MessageObject messageObject;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || (messageObject = chatActivity.threadMessageObject) == null) {
            return 0;
        }
        return messageObject.getId();
    }

    private String getTopicKeyString() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || !chatActivity.isTopic) {
            return "" + this.dialog_id;
        }
        return this.dialog_id + "_" + chatActivity.getTopicId();
    }

    public void setSlowModeButtonVisible(boolean z) {
        int iDp;
        int i = z ? 0 : 8;
        SlowModeBtn slowModeBtn = this.slowModeButton;
        slowModeBtn.setVisibility(i);
        if (z) {
            iDp = AndroidUtilities.dp(slowModeBtn.isPremiumMode ? 26.0f : 16.0f);
        } else {
            iDp = 0;
        }
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null || anonymousClass50.getPaddingRight() == iDp) {
            return;
        }
        this.messageEditText.setPadding(0, AndroidUtilities.dp(9.0f), iDp, AndroidUtilities.dp(10.0f));
    }

    public final void addStickerToRecent(TLRPC.TL_document tL_document) {
        createEmojiView();
        AnonymousClass78 anonymousClass78 = this.emojiView;
        if (tL_document == null) {
            anonymousClass78.getClass();
            return;
        }
        MediaDataController.getInstance(anonymousClass78.currentAccount).addRecentSticker(0, null, tL_document, (int) (System.currentTimeMillis() / 1000), false);
        boolean zIsEmpty = anonymousClass78.recentStickers.isEmpty();
        anonymousClass78.recentStickers = MediaDataController.getInstance(anonymousClass78.currentAccount).getRecentStickers(0, true);
        EmojiView.StickersGridAdapter stickersGridAdapter = anonymousClass78.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.updateItems$4();
            stickersGridAdapter.mObservable.notifyChanged();
        }
        if (zIsEmpty) {
            anonymousClass78.updateStickerTabs(false);
        }
    }

    @Override
    public final void addTextChangedListener(ArticleViewer.AnonymousClass16 anonymousClass16) {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.addTextChangedListener(anonymousClass16);
            return;
        }
        if (this.messageEditTextWatchers == null) {
            this.messageEditTextWatchers = new ArrayList();
        }
        this.messageEditTextWatchers.add(anonymousClass16);
    }

    public final ValueAnimator animateScheduledTranslationX(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.scheduledButton.innerTranslationX, f);
        valueAnimatorOfFloat.addUpdateListener(new ChatActivityEnterView$$ExternalSyntheticLambda3(this, 5));
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator animateSendButton(boolean z) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f = z ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f2 = z ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f3 = z ? 1.0f : 0.1f;
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof SendButton)) {
            SendButton sendButton = (SendButton) getSendButtonInternal();
            sendButton.appear.set(0.0f, true);
            sendButton.invalidate();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                chatActivityEnterView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(AndroidUtilities.lerp(alpha, f, fFloatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(AndroidUtilities.lerp(scaleX, f2, fFloatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(AndroidUtilities.lerp(scaleY, f3, fFloatValue));
            }
        });
        return valueAnimatorOfFloat;
    }

    public boolean areLiveCommentsFree() {
        return false;
    }

    public final boolean botCommandsMenuIsShowing() {
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        return botCommandsMenuView != null && botCommandsMenuView.isOpened;
    }

    public final boolean businessLinkHasChanges() {
        BusinessLinkPresetMessage businessLinkPresetMessageCalculateBusinessLinkPresetMessage = calculateBusinessLinkPresetMessage();
        return (TextUtils.equals(businessLinkPresetMessageCalculateBusinessLinkPresetMessage.text, this.lastSavedBusinessLinkMessage.text) && MediaDataController.entitiesEqual((ArrayList<TLRPC.MessageEntity>) this.lastSavedBusinessLinkMessage.entities, (ArrayList<TLRPC.MessageEntity>) businessLinkPresetMessageCalculateBusinessLinkPresetMessage.entities)) ? false : true;
    }

    public final BusinessLinkPresetMessage calculateBusinessLinkPresetMessage() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        CharSequence[] charSequenceArr = {AndroidUtilities.getTrimmedString(anonymousClass50 == null ? "" : anonymousClass50.getTextToUse())};
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = entities.size();
        for (int i = 0; i < size; i++) {
            TLRPC.MessageEntity messageEntity = entities.get(i);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        BusinessLinkPresetMessage businessLinkPresetMessage = new BusinessLinkPresetMessage();
        businessLinkPresetMessage.text = charSequence.toString();
        businessLinkPresetMessage.entities = entities;
        return businessLinkPresetMessage;
    }

    public final float calculateIslandTotalHeight(boolean z) {
        FactorAnimator factorAnimator = this.animatorInputFieldHeight;
        float f = (z && factorAnimator.isAnimating) ? factorAnimator.toFactor : factorAnimator.factor;
        BoolAnimator boolAnimator = this.animatorTopViewVisibility;
        float f2 = z ? boolAnimator.value ? 1.0f : 0.0f : boolAnimator.floatValue;
        FrameLayout frameLayout = this.topView;
        return ((frameLayout != null ? frameLayout.getMeasuredHeight() : 0) * f2) + f;
    }

    @Override
    public final boolean canSchedule() {
        ChatActivity chatActivity = this.parentFragment;
        return chatActivity != null && chatActivity.canScheduleMessage();
    }

    public final void cancelRecordInterfaceInternal() {
        PhotoViewer.AnonymousClass19 anonymousClass19 = this.recordPanel;
        if (anonymousClass19 != null) {
            anonymousClass19.setVisibility(8);
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.runningAnimationAudio = null;
        isRecordingStateChanged();
        if (this.attachLayout != null) {
            this.attachLayoutTranslationX = 0.0f;
            updateAttachLayoutParams();
        }
        SlideTextView slideTextView = this.slideText;
        if (slideTextView != null) {
            slideTextView.cancelToProgress = 0.0f;
        }
        this.delegate.onAudioVideoInterfaceUpdated();
        updateSendAsButton(true);
    }

    public final void cancelRecordingAudioVideo() {
        if (this.hasRecordVideo && this.isInVideoMode) {
            CameraController.getInstance().cancelOnInitRunnable(this.onFinishInitCameraRunnable);
            this.delegate.needStartRecordVideo(5, 0, this.voiceOnce ? Integer.MAX_VALUE : 0, this.effectId, 0L, true);
            this.effectId = 0L;
            setEffect(0L);
        } else {
            this.delegate.needStartRecordAudio(0);
            MediaController.getInstance().stopRecording(0, false, 0, false, 0L);
        }
        this.recordingAudioVideo = false;
        updateRecordInterface(2, true);
    }

    public final void checkBirthdayHint() {
        AnonymousClass30 anonymousClass30;
        ChatActivity chatActivity;
        if (this.birthdayHint != null || (anonymousClass30 = this.giftButton) == null || anonymousClass30.getRight() == 0 || (chatActivity = this.parentFragment) == null || !BirthdayController.isToday(chatActivity.userInfo)) {
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + chatActivity.getDialogId(), true)) {
            AiTonesController$$ExternalSyntheticOutline0.m(this.currentAccount).putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + chatActivity.getDialogId(), false).apply();
            HintView2 hintView2 = new HintView2(getContext(), 3);
            this.birthdayHint = hintView2;
            hintView2.setRounding(13.0f);
            this.birthdayHint.setMultilineText(true);
            setBirthdayHintText();
            this.birthdayHint.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.birthdayHint.setJointPx(1.0f, -((getWidth() - AndroidUtilities.dp(12.0f)) - ((getMeasuredWidth() / 2.0f) + (getX() + (this.attachLayout.getX() + this.messageEditTextContainer.getX())))));
            addView(this.birthdayHint, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            HintView2 hintView3 = this.birthdayHint;
            hintView3.onHidden = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 15);
            hintView3.duration = 8000L;
            hintView3.show();
        }
    }

    public final void checkBotMenu() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        boolean z = ((anonymousClass50 != null && !TextUtils.isEmpty(anonymousClass50.getText())) || this.keyboardVisible || this.waitingForKeyboardOpen || isPopupShowing()) ? false : true;
        if (z) {
            createBotCommandsMenuButton();
        }
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        if (botCommandsMenuView != null) {
            boolean z2 = botCommandsMenuView.expanded;
            if (z2 != z) {
                botCommandsMenuView.expanded = z;
                botCommandsMenuView.requestLayout();
                botCommandsMenuView.invalidate();
            }
            if (z2 != this.botCommandsMenuButton.expanded) {
                AnonymousClass17 anonymousClass17 = this.emojiButton;
                Float fValueOf = Float.valueOf(anonymousClass17.getX());
                HashMap map = this.animationParamsX;
                map.put(anonymousClass17, fValueOf);
                AnonymousClass50 anonymousClass51 = this.messageEditText;
                if (anonymousClass51 != null) {
                    map.put(anonymousClass51, Float.valueOf(anonymousClass51.getX()));
                }
            }
        }
    }

    public final void checkChannelRights() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null) {
            return;
        }
        updateRecordButton(chatActivity.currentChat, chatActivity.userInfo);
    }

    public final void checkIsEphemeralMessage(boolean z) {
        MessageObject messageObject;
        boolean z2 = this.dialog_id < 0 && this.isChat && this.editingMessageObject == null && (EphemeralMessagesHelper.getInstance(this.currentAccount).getEphemeralCommandBotId(getEditText() != null ? getEditText().toString() : null, this.lastBotInfo) > 0 || ((messageObject = this.replyingMessageObject) != null && messageObject.isEphemeral()));
        BoolAnimator boolAnimator = this.animatorEphemeralMessageVisibility;
        boolean z3 = boolAnimator.value != z2;
        boolAnimator.setValue(z2, z);
        AnonymousClass27 anonymousClass27 = this.sendButton;
        if (anonymousClass27 != null) {
            anonymousClass27.hidePrice = z2;
            anonymousClass27.invalidate();
        }
        if (z3) {
            checkSendButton(z);
        }
    }

    public final void checkRoundVideo() {
        boolean z;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.hasRecordVideo) {
            return;
        }
        if (this.attachLayout == null) {
            this.hasRecordVideo = false;
            setRecordVideoButtonVisible(false, false);
            return;
        }
        boolean z3 = true;
        this.hasRecordVideo = true;
        this.sendRoundEnabled = true;
        this.sendVoiceEnabled = true;
        if (DialogObject.isChatDialog(this.dialog_id)) {
            TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
            z = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z && !chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.hasRecordVideo = false;
            }
            this.sendRoundEnabled = ChatObject.canSendRoundVideo(chat);
            this.sendVoiceEnabled = ChatObject.canSendVoice(chat);
        } else {
            z = false;
        }
        if (!SharedConfig.inappCamera) {
            this.hasRecordVideo = false;
        }
        if (this.hasRecordVideo) {
            if (SharedConfig.hasCameraCache) {
                CameraController.getInstance().initCamera(null);
            }
            z2 = MessagesController.getGlobalMainSettings().getBoolean(z ? "currentModeVideoChannel" : "currentModeVideo", z);
        } else {
            z2 = false;
        }
        if (!this.sendRoundEnabled && z2) {
            z2 = false;
        }
        if (this.sendVoiceEnabled || z2) {
            z3 = z2;
        } else if (!this.hasRecordVideo) {
            z3 = false;
        }
        setRecordVideoButtonVisible(z3, false);
    }

    public final void checkSendButton(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.checkSendButton(boolean):void");
    }

    public final void checkStickresExpandHeight() {
        boolean z = false;
        int i = 2;
        if (this.emojiView == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int i2 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
        int iDp = ((((this.originalViewHeight - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - ActionBar.getCurrentActionBarHeight()) - getHeight();
        if (this.searchingType == 2) {
            iDp = Math.min(iDp, AndroidUtilities.dp(175.0f) + i2);
        }
        int i3 = this.emojiView.getLayoutParams().height;
        if (i3 == iDp) {
            return;
        }
        AnimatorSet animatorSet = this.stickersExpansionAnim;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.stickersExpansionAnim = null;
        }
        this.stickersExpandedHeight = iDp;
        PhotoViewer.AnonymousClass13 anonymousClass13 = this.roundedTranslationYProperty;
        if (i3 > iDp) {
            ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 9);
            this.emojiView.setLayerType(2, null);
            if (this.overrideKeyboardAnimation) {
                this.animationEndRunnable = chatActivityEnterView$$ExternalSyntheticLambda4;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.windowInsetsInAppController != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.stickersExpandedHeight - i2)), ValueAnimator.ofInt(-(this.stickersExpandedHeight - i2)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, anonymousClass13, -(this.stickersExpandedHeight - i2)), ObjectAnimator.ofInt(this.emojiView, anonymousClass13, -(this.stickersExpandedHeight - i2)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ChatActivityEnterView$$ExternalSyntheticLambda3(this, i));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet2.addListener(new ChatActivity.AnonymousClass74(this, chatActivityEnterView$$ExternalSyntheticLambda4, z, 14));
                this.stickersExpansionAnim = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.windowInsetsInAppController == null) {
                this.emojiView.getLayoutParams().height = this.stickersExpandedHeight;
            }
            this.sizeNotifierLayout.requestLayout();
            AnonymousClass50 anonymousClass50 = this.messageEditText;
            if (anonymousClass50 != null) {
                int selectionStart = anonymousClass50.getSelectionStart();
                int selectionEnd = this.messageEditText.getSelectionEnd();
                AnonymousClass50 anonymousClass51 = this.messageEditText;
                anonymousClass51.setText(anonymousClass51.getText());
                this.messageEditText.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.windowInsetsInAppController != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.stickersExpandedHeight - i2)), ValueAnimator.ofInt(-(this.stickersExpandedHeight - i2)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, anonymousClass13, -(this.stickersExpandedHeight - i2)), ObjectAnimator.ofInt(this.emojiView, anonymousClass13, -(this.stickersExpandedHeight - i2)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ChatActivityEnterView$$ExternalSyntheticLambda3(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet3.addListener(new AnonymousClass28(this, 13));
            this.stickersExpansionAnim = animatorSet3;
            this.emojiView.setLayerType(2, null);
            animatorSet3.start();
        }
        WindowInsetsInAppController windowInsetsInAppController = this.windowInsetsInAppController;
        if (windowInsetsInAppController != null) {
            if (iDp <= 0) {
                ((WindowInsetsStateHolder) windowInsetsInAppController).resetInAppKeyboardHeight(true);
                return;
            }
            int i4 = iDp + AndroidUtilities.navigationBarHeight;
            WindowInsetsStateHolder windowInsetsStateHolder = (WindowInsetsStateHolder) windowInsetsInAppController;
            if (windowInsetsStateHolder.inAppKeyboardHeight == i4 && windowInsetsStateHolder.inAppKeyboardState == 0) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder.closeInAppKeyboard);
            windowInsetsStateHolder.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder.inAppKeyboardHeight, i4);
            windowInsetsStateHolder.inAppKeyboardHeight = i4;
            windowInsetsStateHolder.inAppKeyboardState = 0;
            windowInsetsStateHolder.setInsets(windowInsetsStateHolder.lastInsets);
        }
    }

    public final void checkUi_TopViewVisibility() {
        float f = this.animatorTopViewVisibility.floatValue;
        if (this.topView != null) {
            float measuredHeight = getMeasuredHeight() - this.animatorInputFieldHeight.factor;
            FrameLayout frameLayout = this.topView;
            frameLayout.setTranslationY(measuredHeight - (frameLayout.getMeasuredHeight() * f));
            this.topView.setVisibility(f > 0.0f ? 0 : 8);
        }
        boolean z = f > 0.0f;
        if (this.resizeForTopViewLastShow == z) {
            return;
        }
        AnonymousClass15 anonymousClass15 = this.textFieldContainer;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass15.getLayoutParams();
        int i = z ? this.topView.getLayoutParams().height : 0;
        layoutParams.topMargin = i;
        layoutParams.topMargin = AndroidUtilities.dp(9.0f) + i;
        anonymousClass15.setLayoutParams(layoutParams);
        this.resizeForTopViewLastShow = z;
        setMinimumHeight(AndroidUtilities.dp(44.0f) + (z ? this.topView.getLayoutParams().height : 0));
        if (this.stickersExpanded) {
            if (this.searchingType == 0) {
                setStickersExpanded(false, true, false, true);
            } else {
                checkStickresExpandHeight();
            }
        }
    }

    public final void clearRichDraft() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            MediaDataController.getInstance(this.currentAccount).saveDraft(chatActivity.getDialogId(), chatActivity.computeDraftThreadId(chatActivity.replyingMessageObject), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void createBotButton() {
        if (this.botButton != null) {
            return;
        }
        AnonymousClass32 anonymousClass32 = new AnonymousClass32(getContext());
        this.botButton = anonymousClass32;
        ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(getContext());
        this.botButtonDrawable = replaceableIconDrawable;
        anonymousClass32.setImageDrawable(replaceableIconDrawable);
        this.botButtonDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(Theme.key_glass_defaultIcon), PorterDuff.Mode.MULTIPLY));
        this.botButtonDrawable.setIcon(R.drawable.input_bot2, false);
        this.botButton.setScaleType(ImageView.ScaleType.CENTER);
        this.botButton.setBackground(Theme.createSelectorDrawable(getThemedColor$6(Theme.key_listSelector), 1, -1));
        this.botButton.setVisibility(8);
        AndroidUtilities.updateViewVisibilityAnimated(this.botButton, false, 0.1f, false);
        this.attachLayout.addView(this.botButton, 0, LayoutHelper.createLinear(44, 44));
        this.botButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 16));
    }

    public final void createBotCommandsMenuButton() {
        if (this.botCommandsMenuButton != null) {
            return;
        }
        BotCommandsMenuView botCommandsMenuView = new BotCommandsMenuView(getContext());
        this.botCommandsMenuButton = botCommandsMenuView;
        botCommandsMenuView.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 9));
        this.messageEditTextContainer.addView(this.botCommandsMenuButton, LayoutHelper.createFrame(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.botCommandsMenuButton, false, 1.0f, false);
        BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
        if (!botCommandsMenuView2.expanded) {
            botCommandsMenuView2.expanded = true;
            botCommandsMenuView2.expandProgress = 1.0f;
            botCommandsMenuView2.requestLayout();
            botCommandsMenuView2.invalidate();
        }
    }

    public final void createCaptionLimitView() {
        if (this.captionLimitView != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.captionLimitView = numberTextView;
        numberTextView.setVisibility(8);
        this.captionLimitView.setTextSize(15);
        this.captionLimitView.setTextColor(getThemedColor$6(Theme.key_windowBackgroundWhiteGrayText));
        this.captionLimitView.setTypeface(AndroidUtilities.bold());
        this.captionLimitView.setCenterAlign(true);
        addView(this.captionLimitView, Math.min(2, getChildCount()), LayoutHelper.createFrame(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void createDoneButton(boolean z) {
        if (this.doneButton != null) {
            return;
        }
        RichEditor.AnonymousClass9 anonymousClass9 = new RichEditor.AnonymousClass9(this, getContext(), R.drawable.input_done, this.resourcesProvider, 1);
        this.doneButton = anonymousClass9;
        anonymousClass9.setContentDescription(LocaleController.getString(R.string.EditMessage));
        if (z) {
            ScaleStateListAnimator.apply(this.doneButton, 0.1f, 1.5f);
        }
        addView(this.doneButton, LayoutHelper.createFrame(44, 44, 85));
    }

    public final void createEmojiView() {
        AnonymousClass78 anonymousClass78 = this.emojiView;
        if (anonymousClass78 != null && anonymousClass78.currentAccount != UserConfig.selectedAccount) {
            this.viewParentForEmojiView.removeView(anonymousClass78);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        AnonymousClass78 anonymousClass79 = new AnonymousClass78(this.parentFragment, this.allowAnimatedEmoji, getContext(), this.info, this.sizeNotifierLayout, this.shouldDrawBackground, this.resourcesProvider, this.emojiViewFrozen, this.windowInsetsInAppController != null);
        this.emojiView = anonymousClass79;
        anonymousClass79.shouldDrawStickerSettings = true;
        if (!this.shouldDrawBackground) {
            anonymousClass79.updateColors$1();
        }
        this.emojiView.setAllow(true, this.allowStickers, this.allowGifs, true);
        this.emojiView.setVisibility(8);
        this.emojiView.setShowing(false);
        if (this.windowInsetsInAppController != null) {
            AnonymousClass78 anonymousClass710 = this.emojiView;
            anonymousClass710.shouldLightenBackground = false;
            anonymousClass710.setShouldDrawBackground(false);
            this.emojiView.isNewHeightControl = true;
        }
        this.emojiView.setDelegate(new AnonymousClass79());
        this.emojiView.setDragListener(new AnonymousClass80());
        AnonymousClass78 anonymousClass711 = this.emojiView;
        if (anonymousClass711 != null) {
            anonymousClass711.setStickersBanned(-this.dialog_id, !this.sendPlainEnabled, !this.stickersEnabled);
        }
        if (this.emojiView.getParent() == null) {
            if (this.windowInsetsInAppController == null) {
                this.viewParentForEmojiView.addView(this.emojiView);
            } else {
                this.viewParentForEmojiView.addView(this.emojiView, LayoutHelper.createFrame(-1.0f, -1));
            }
        }
        checkChannelRights();
    }

    public final void createExpandStickersButton() {
        if (this.expandStickersButton != null) {
            return;
        }
        AnonymousClass34 anonymousClass34 = new AnonymousClass34(getContext());
        this.expandStickersButton = anonymousClass34;
        anonymousClass34.setScaleType(ImageView.ScaleType.CENTER);
        AnonymousClass34 anonymousClass35 = this.expandStickersButton;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(getThemedColor$6(Theme.key_glass_defaultIcon), false);
        this.stickersArrow = animatedArrowDrawable;
        anonymousClass35.setImageDrawable(animatedArrowDrawable);
        this.expandStickersButton.setVisibility(8);
        this.expandStickersButton.setScaleX(0.1f);
        this.expandStickersButton.setScaleY(0.1f);
        this.expandStickersButton.setAlpha(0.0f);
        this.expandStickersButton.setBackground(Theme.createSelectorDrawable(getThemedColor$6(Theme.key_listSelector), 1, -1));
        addView(this.expandStickersButton, LayoutHelper.createFrame(44, 44, 85));
        this.expandStickersButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 7));
        this.expandStickersButton.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
    }

    public final void createMessageEditText() {
        if (this.messageEditText != null) {
            return;
        }
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        AnonymousClass50 anonymousClass50 = new AnonymousClass50(context, resourcesProvider);
        this.messageEditText = anonymousClass50;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            anonymousClass50.setFallbackLineSpacing(false);
        }
        if (i >= 35) {
            this.messageEditText.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.messageEditText.setDelegate(new ChatActivityEnterView$$ExternalSyntheticLambda30(this));
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || chatActivity.getParentLayout() == null || !((ActionBarLayout) chatActivity.getParentLayout()).isSheet) {
            this.messageEditText.setWindowView(this.parentActivity.getWindow().getDecorView());
        } else {
            this.messageEditText.setWindowView(((ActionBarLayout) chatActivity.getParentLayout()).getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = chatActivity != null ? chatActivity.currentEncryptedChat : null;
        this.messageEditText.setAllowTextEntitiesIntersection(supportsSendingNewEntities());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i2 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : 268435456;
        this.messageEditText.setIncludeFontPadding(false);
        this.messageEditText.setImeOptions(i2);
        AnonymousClass50 anonymousClass51 = this.messageEditText;
        int inputType = anonymousClass51.getInputType() | 147456;
        this.commonInputType = inputType;
        anonymousClass51.setInputType(inputType);
        updateFieldHint(false);
        this.messageEditText.setSingleLine(false);
        this.messageEditText.setMaxLines(6);
        this.messageEditText.setTextSize(1, 18.0f);
        this.messageEditText.setGravity(80);
        this.messageEditText.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(10.0f));
        this.messageEditText.setBackgroundDrawable(null);
        this.messageEditText.setTextColor(getThemedColor$6(Theme.key_chat_messagePanelText));
        this.messageEditText.setLinkTextColor(getThemedColor$6(Theme.key_chat_messageLinkOut));
        this.messageEditText.setHighlightColor(getThemedColor$6(Theme.key_chat_inTextSelectionHighlight));
        AnonymousClass50 anonymousClass52 = this.messageEditText;
        int i3 = Theme.key_chat_messagePanelHint;
        anonymousClass52.setHintColor(getThemedColor$6(i3));
        this.messageEditText.setHintTextColor(getThemedColor$6(i3));
        this.messageEditText.setCursorColor(getThemedColor$6(Theme.key_chat_messagePanelCursor));
        this.messageEditText.setHandlesColor(getThemedColor$6(Theme.key_chat_TextSelectionCursor));
        AnonymousClass50 anonymousClass53 = this.messageEditText;
        boolean z = this.isChat;
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f, 80, 52.0f, 0.0f, z ? 50.0f : 2.0f, 1.5f);
        AnonymousClass16 anonymousClass16 = this.messageEditTextContainer;
        anonymousClass16.addView(anonymousClass53, 1, layoutParamsCreateFrame);
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(getContext(), this.currentAccount, resourcesProvider);
        this.richDraftPreview = previewView;
        previewView.setAllowActions(false);
        this.richDraftPreview.setMaxHeight(AndroidUtilities.dp(150.0f));
        this.richDraftPreview.setMinHeight(AndroidUtilities.dp(88.0f));
        this.richDraftPreview.setVisibility(8);
        this.richDraftPreview.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
        this.richDraftPreview.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 11));
        anonymousClass16.addView(this.richDraftPreview, 2, LayoutHelper.createFrame(-1, -2.0f, 80, 44.0f, 0.0f, (z ? 50 : 2) - 8, 1.5f));
        this.messageEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                ChatActivityEnterView chatActivityEnterView;
                if (keyEvent != null) {
                    ChatActivityEnterView.this.shiftPressed = keyEvent.isShiftPressed();
                    ChatActivityEnterView.this.ctrlPressed = keyEvent.isCtrlPressed();
                }
                if (i4 == 4) {
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    if (!chatActivityEnterView2.keyboardVisible && chatActivityEnterView2.isPopupShowing() && keyEvent.getAction() == 1) {
                        if (ContentPreviewViewer.Instance != null && ContentPreviewViewer.getInstance().isVisible) {
                            ContentPreviewViewer.getInstance().closeWithMenu();
                            return true;
                        }
                        ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                        if (chatActivityEnterView3.currentPopupContentType != 1 || chatActivityEnterView3.botButtonsMessageObject == null) {
                            if (keyEvent.getAction() == 1) {
                                ChatActivityEnterView chatActivityEnterView4 = ChatActivityEnterView.this;
                                if (chatActivityEnterView4.currentPopupContentType == 1 && chatActivityEnterView4.botButtonsMessageObject != null) {
                                    MessagesController.getMainSettings(chatActivityEnterView4.currentAccount).edit().putInt("hidekeyboard_" + ChatActivityEnterView.this.dialog_id, ChatActivityEnterView.this.botButtonsMessageObject.getId()).commit();
                                }
                                ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                                if (chatActivityEnterView5.searchingType != 0) {
                                    chatActivityEnterView5.setSearchingTypeInternal(0, true);
                                    AnonymousClass78 anonymousClass78 = ChatActivityEnterView.this.emojiView;
                                    if (anonymousClass78 != null) {
                                        anonymousClass78.closeSearch(-1L, true);
                                    }
                                    ChatActivityEnterView.this.messageEditText.requestFocus();
                                    return true;
                                }
                                if (chatActivityEnterView5.stickersExpanded) {
                                    chatActivityEnterView5.setStickersExpanded(false, true, false, true);
                                    return true;
                                }
                                if (chatActivityEnterView5.stickersExpansionAnim == null) {
                                    if (chatActivityEnterView5.botButtonsMessageObject != null && chatActivityEnterView5.currentPopupContentType != 1 && TextUtils.isEmpty(chatActivityEnterView5.messageEditText.getTextToUse())) {
                                        ChatActivityEnterView.this.showPopup(1, 1, true, true);
                                        return true;
                                    }
                                    ChatActivityEnterView.this.showPopup(0, 0, true, false);
                                }
                            }
                            return true;
                        }
                    } else if (i4 == 66 && !keyEvent.isShiftPressed() && (!ChatActivityEnterView.this.sendByEnter ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0) {
                        chatActivityEnterView = ChatActivityEnterView.this;
                        if (chatActivityEnterView.editingMessageObject == null) {
                            chatActivityEnterView.sendMessage();
                            return true;
                        }
                    }
                } else if (i4 == 66) {
                    chatActivityEnterView = ChatActivityEnterView.this;
                    if (chatActivityEnterView.editingMessageObject == null) {
                        chatActivityEnterView.sendMessage();
                        return true;
                    }
                }
                return false;
            }
        });
        this.messageEditText.setOnEditorActionListener(new EditTextCell.AnonymousClass1(this, 3));
        this.messageEditText.addTextChangedListener(new AnonymousClass53());
        this.messageEditText.addTextChangedListener(new EditTextCell.AnonymousClass3());
        this.messageEditText.setEnabled(this.messageEditTextEnabled);
        ArrayList arrayList = this.messageEditTextWatchers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.messageEditText.addTextChangedListener((TextWatcher) obj);
            }
            this.messageEditTextWatchers.clear();
        }
        updateFieldHint(false);
        updateSendAsButton(chatActivity != null && chatActivity.getFragmentBeginToShow());
        if (chatActivity != null) {
            chatActivity.applyDraftMaybe(false, false);
        }
        updateFieldRight(this.lastAttachVisible);
    }

    public final void createRecordAudioPanel() {
        if (this.recordedAudioPanel != null) {
            return;
        }
        AnonymousClass35 anonymousClass35 = new AnonymousClass35(getContext());
        this.recordedAudioPanel = anonymousClass35;
        anonymousClass35.setVisibility(this.audioToSend == null ? 8 : 0);
        this.recordedAudioPanel.setFocusable(true);
        this.recordedAudioPanel.setFocusableInTouchMode(true);
        this.recordedAudioPanel.setClickable(true);
        this.messageEditTextContainer.addView(this.recordedAudioPanel, LayoutHelper.createFrame(-1, 44, 80));
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        this.recordDeleteImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.recordDeleteImageView.setAnimation(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.recordDeleteImageView.getAnimatedDrawable().invalidateOnProgressSet = true;
        updateRecordedDeleteIconColors();
        this.recordDeleteImageView.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.recordDeleteImageView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor$6(Theme.key_listSelector), 1, -1));
        this.recordedAudioPanel.addView(this.recordDeleteImageView, LayoutHelper.createFrame(44.0f, 44));
        this.recordDeleteImageView.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 8));
        VideoTimelineView videoTimelineView = new VideoTimelineView(getContext());
        this.videoTimelineView = videoTimelineView;
        videoTimelineView.setVisibility(4);
        VideoTimelineView videoTimelineView2 = this.videoTimelineView;
        videoTimelineView2.useClip = !this.shouldDrawBackground;
        videoTimelineView2.setRoundFrames(true);
        this.videoTimelineView.setDelegate(new AnonymousClass36());
        this.recordedAudioPanel.addView(this.videoTimelineView, LayoutHelper.createFrame(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        VideoTimelineView.TimeHintView timeHintView = new VideoTimelineView.TimeHintView(getContext());
        this.videoTimelineView.setTimeHintView(timeHintView);
        this.sizeNotifierLayout.addView(timeHintView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        RecordedAudioPlayerView recordedAudioPlayerView = new RecordedAudioPlayerView(getContext(), this.resourcesProvider);
        this.audioTimelineView = recordedAudioPlayerView;
        this.recordedAudioPanel.addView(recordedAudioPlayerView, LayoutHelper.createFrame(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        updateFieldRight(this.lastAttachVisible);
    }

    public final void createRecordCircle() {
        ControlsView controlsView = this.controlsView;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        if (controlsView == null) {
            ControlsView controlsView2 = new ControlsView(getContext());
            this.controlsView = controlsView2;
            controlsView2.setVisibility(8);
            sizeNotifierFrameLayout.addView(this.controlsView, LayoutHelper.createFrame(-1, -2, 80));
        }
        if (this.recordCircle != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.recordCircle = recordCircle;
        recordCircle.setVisibility(8);
        sizeNotifierFrameLayout.addView(this.recordCircle, LayoutHelper.createFrame(-1, -2, 80));
    }

    public final void createRecordPanel() {
        if (this.recordPanel != null || getContext() == null) {
            return;
        }
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(getContext(), 13);
        this.recordPanel = anonymousClass19;
        anonymousClass19.setClipChildren(false);
        this.recordPanel.setVisibility(8);
        this.messageEditTextContainer.addView(this.recordPanel, LayoutHelper.createFrame(44.0f, -1));
        this.recordPanel.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(11));
        PhotoViewer.AnonymousClass19 anonymousClass110 = this.recordPanel;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.slideText = slideTextView;
        anonymousClass110.addView(slideTextView, LayoutHelper.createFrame(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.recordTimeContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.recordTimeContainer.setPadding(AndroidUtilities.dp(13.0f), 0, 0, 0);
        this.recordTimeContainer.setFocusable(false);
        LinearLayout linearLayout2 = this.recordTimeContainer;
        RecordDot recordDot = new RecordDot(getContext());
        this.recordDot = recordDot;
        linearLayout2.addView(recordDot, LayoutHelper.createLinear(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.recordTimeContainer;
        TimerView timerView = new TimerView(getContext());
        this.recordTimerView = timerView;
        linearLayout3.addView(timerView, LayoutHelper.createLinear(-1, -1, 16, 6, 0, 0, 0));
        this.recordPanel.addView(this.recordTimeContainer, LayoutHelper.createFrame(-1, -1, 16));
    }

    public final void createScheduledButton() {
        if (this.scheduledButton != null || this.parentFragment == null) {
            return;
        }
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int themedColor$6 = getThemedColor$6(Theme.key_glass_defaultIcon);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor$6, mode));
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(Theme.key_chat_recordedVoiceDot), mode));
        CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, drawableMutate2);
        AnonymousClass29 anonymousClass29 = new AnonymousClass29(getContext());
        this.scheduledButton = anonymousClass29;
        anonymousClass29.setImageDrawable(combinedDrawable);
        this.scheduledButton.setVisibility(8);
        this.scheduledButton.setContentDescription(LocaleController.getString(R.string.ScheduledMessages));
        this.scheduledButton.setScaleType(ImageView.ScaleType.CENTER);
        this.scheduledButton.setBackground(Theme.createSelectorDrawable(getThemedColor$6(Theme.key_listSelector), 1, -1));
        this.messageEditTextContainer.addView(this.scheduledButton, 2, LayoutHelper.createFrame(44, 44, 85));
        this.scheduledButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 5));
        this.scheduledButton.setTranslationX(0.0f);
    }

    public final void createSenderSelectView() {
        if (this.senderSelectView != null || getContext() == null) {
            return;
        }
        SenderSelectView senderSelectView = new SenderSelectView(getContext());
        this.senderSelectView = senderSelectView;
        senderSelectView.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 17));
        this.senderSelectView.setVisibility(8);
        this.messageEditTextContainer.addView(this.senderSelectView, LayoutHelper.createFrame(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final boolean didPressedBotButton(TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject, MessageObject messageObject2, ChatActivity.AnonymousClass127 anonymousClass127) {
        ChatActivity chatActivity;
        int i;
        int i2 = 0;
        if (keyboardButtonProto != null && messageObject2 != null && ((chatActivity = this.parentFragment) == null || chatActivity.chatMode != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                AndroidUtilities.addToClipboard(tL_inlineButtonTypeCopy.copy_text);
                BulletinFactory.of(chatActivity).createCopyBulletin(LocaleController.formatString(R.string.ExactTextCopied, tL_inlineButtonTypeCopy.copy_text)).show(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_keyboardButton.text, this.dialog_id, messageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    sendMessageParamsOf.sendMessageChatArguments = chatActivity != null ? chatActivity.getMessageChatSendParams() : null;
                    sendMessageParamsOf.effect_id = this.effectId;
                    this.effectId = 0L;
                    setEffect(0L);
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                    return true;
                }
            }
            Activity activity = this.parentActivity;
            if (tL_inlineButtonTypeUrl != null) {
                String str = tL_inlineButtonTypeUrl.url;
                if (Browser.isTelegraphUrl(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)")) {
                    Browser.openUrl(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, anonymousClass127);
                    return true;
                }
                AlertsCreator.showOpenUrlAlert(this.parentFragment, tL_inlineButtonTypeUrl.url, false, true, false, anonymousClass127, null, this.resourcesProvider);
                return true;
            }
            if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                chatActivity.shareMyContact(messageObject2, 2);
                return true;
            }
            if (!TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeWebView.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class)) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    long j = message.via_bot_id;
                    if (j == 0) {
                        j = message.from_id.user_id;
                    }
                    AnonymousClass76 anonymousClass76 = new AnonymousClass76(messageObject2, j, keyboardButtonProto, messageObject, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
                    if (SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, j) || MessagesController.getInstance(this.currentAccount).whitelistedBots.contains(Long.valueOf(j))) {
                        anonymousClass76.run();
                        return true;
                    }
                    AlertsCreator.createBotLaunchAlert(chatActivity, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialog_id)), new PollItemMenu$$ExternalSyntheticLambda12(this, anonymousClass76, j, 10), (Runnable) null);
                    return true;
                }
                if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
                    String string = LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString("ShareYouLocationInfo", R.string.ShareYouLocationInfo);
                    builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new ChatActivity$$ExternalSyntheticLambda248(this, messageObject2, keyboardButtonProto, 23));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    chatActivity.showDialog(alertDialog);
                    return true;
                }
                if (TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || TLKeyboardHelper.isType(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    SendMessagesHelper.getInstance(this.currentAccount).sendCallback(true, messageObject2, keyboardButtonProto, chatActivity);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!chatActivity.processSwitchButton(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                bundleM.putBoolean("allowGroups", false);
                                bundleM.putBoolean("allowMegagroups", false);
                                bundleM.putBoolean("allowLegacyGroups", false);
                                bundleM.putBoolean("allowUsers", false);
                                bundleM.putBoolean("allowChannels", false);
                                bundleM.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i2 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i2);
                                    i2++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        bundleM.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        bundleM.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        bundleM.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        bundleM.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        bundleM.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            DialogsActivity dialogsActivity = new DialogsActivity(bundleM);
                            dialogsActivity.delegate = new ChatActivity$$ExternalSyntheticLambda248(this, messageObject2, tL_inlineButtonTypeSwitchInline, 24);
                            chatActivity.presentFragment(dialogsActivity);
                            return true;
                        }
                        TLRPC.Message message2 = messageObject2.messageOwner;
                        long j2 = message2.from_id.user_id;
                        long j3 = message2.via_bot_id;
                        if (j3 != 0) {
                            j2 = j3;
                        }
                        TLRPC.User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(j2));
                        if (user != null) {
                            setFieldText("@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        chatActivity.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || messageObject2.messageOwner == null) {
                        FileLog.e("button.peer_type is null");
                    } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        TLRPC.User currentUser = getParentFragment() != null ? getParentFragment().getCurrentUser() : MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialog_id));
                        if (currentUser != null) {
                            CreateBotAlert.show(getContext(), this.currentAccount, currentUser, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new GiftSheet$$ExternalSyntheticLambda23(this, messageObject2, tL_buttonTypeRequestPeer, currentUser, 3), this.resourcesProvider, null);
                            return false;
                        }
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) || (i = tL_buttonTypeRequestPeer.max_quantity) <= 1) {
                            Bundle bundleM2 = TelegramMediaSession$$ExternalSyntheticOutline0.m(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = messageObject2.messageOwner;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    bundleM2.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                bundleM2.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            DialogsActivity dialogsActivity2 = new DialogsActivity(bundleM2);
                            dialogsActivity2.delegate = new ChatActivityEnterView$$ExternalSyntheticLambda81(this, messageObject2, tL_buttonTypeRequestPeer);
                            chatActivity.presentFragment(dialogsActivity2);
                            return false;
                        }
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        ChatActivityEnterView$$ExternalSyntheticLambda81 chatActivityEnterView$$ExternalSyntheticLambda81 = new ChatActivityEnterView$$ExternalSyntheticLambda81(this, messageObject2, tL_buttonTypeRequestPeer);
                        MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = MultiContactsSelectorBottomSheet.instance;
                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                        if (lastFragment != null && MultiContactsSelectorBottomSheet.instance == null) {
                            MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet2 = new MultiContactsSelectorBottomSheet(lastFragment, i, bool, bool2, chatActivityEnterView$$ExternalSyntheticLambda81);
                            multiContactsSelectorBottomSheet2.show();
                            MultiContactsSelectorBottomSheet.instance = multiContactsSelectorBottomSheet2;
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) TLKeyboardHelper.getType(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean boolValueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            chatActivity.openAttachMenu();
            ChatActivity.AnonymousClass78 anonymousClass78 = chatActivity.chatAttachAlert;
            if (anonymousClass78 != null) {
                anonymousClass78.typeButtonsAvailable = false;
                anonymousClass78.buttonsRecyclerViewWrapper.setVisibility(8);
                anonymousClass78.showPollLayout(false, boolValueOf);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        AnonymousClass27 anonymousClass27;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat;
        double d;
        byte[] bArr;
        VoIPFragment.AnonymousClass9 anonymousClass9;
        int i4 = 0;
        if (i == NotificationCenter.emojiLoaded) {
            AnonymousClass78 anonymousClass78 = this.emojiView;
            if (anonymousClass78 != null) {
                anonymousClass78.emojiGridView.invalidateViews();
            }
            AnonymousClass75 anonymousClass75 = this.botKeyboardView;
            if (anonymousClass75 != null) {
                while (true) {
                    ArrayList arrayList = anonymousClass75.buttonViews;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    ((BotKeyboardView.Button) arrayList.get(i4)).invalidate();
                    i4++;
                }
            }
            AnonymousClass50 anonymousClass50 = this.messageEditText;
            if (anonymousClass50 != null) {
                anonymousClass50.postInvalidate();
                this.messageEditText.invalidateForce();
                return;
            }
            return;
        }
        if (i == NotificationCenter.recordProgressChanged) {
            if (((Integer) objArr[0]).intValue() != this.recordingGuid) {
                return;
            }
            if (this.recordInterfaceState != 0 && !this.wasSendTyping && !isInScheduleMode()) {
                this.wasSendTyping = true;
                this.accountInstance.getMessagesController().sendTyping(this.dialog_id, getThreadMessageId(), this.isInVideoMode ? 7 : 1, 0);
            }
            RecordCircle recordCircle = this.recordCircle;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i == NotificationCenter.closeChats) {
            AnonymousClass50 anonymousClass51 = this.messageEditText;
            if (anonymousClass51 == null || !anonymousClass51.isFocused()) {
                return;
            }
            AndroidUtilities.hideKeyboard(this.messageEditText);
            return;
        }
        int i5 = 5;
        if (i == NotificationCenter.recordStartError || i == NotificationCenter.recordStopped) {
            if (((Integer) objArr[0]).intValue() == this.recordingGuid && this.recordingAudioVideo) {
                this.recordingAudioVideo = false;
                if (i != NotificationCenter.recordStopped) {
                    updateRecordInterface(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i3 = 3;
                    i5 = 4;
                } else if (this.isInVideoMode && num.intValue() == 5) {
                    i3 = 3;
                    i5 = 1;
                } else if (num.intValue() == 0) {
                    i3 = 3;
                } else if (num.intValue() == 6) {
                    i3 = 3;
                    i5 = 2;
                } else {
                    i3 = 3;
                    i5 = 3;
                }
                if (i5 != i3) {
                    updateRecordInterface(i5, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.recordStarted) {
            if (((Integer) objArr[0]).intValue() != this.recordingGuid) {
                return;
            }
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            this.isInVideoMode = !zBooleanValue;
            AnonymousClass25 anonymousClass25 = this.audioVideoSendButton;
            if (anonymousClass25 != null) {
                anonymousClass25.setState(zBooleanValue ? ChatActivityEnterViewAnimatedIconView.State.VOICE : ChatActivityEnterViewAnimatedIconView.State.VIDEO, true);
            }
            if (this.recordingAudioVideo) {
                RecordCircle recordCircle2 = this.recordCircle;
                if (recordCircle2 != null) {
                    recordCircle2.showWaves = true;
                }
            } else {
                this.recordingAudioVideo = true;
                updateRecordInterface(0, true);
            }
            TimerView timerView = this.recordTimerView;
            if (timerView != null) {
                long j = this.millisecondsRecorded;
                timerView.isRunning = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                timerView.startTime = jCurrentTimeMillis;
                timerView.lastSendTypingTime = jCurrentTimeMillis;
                timerView.invalidate();
            }
            RecordDot recordDot = this.recordDot;
            if (recordDot != null) {
                recordDot.enterAnimation = false;
                return;
            }
            return;
        }
        if (i == NotificationCenter.recordPaused) {
            this.recordingAudioVideo = false;
            this.audioToSend = null;
            this.videoToSendMessageObject = null;
            return;
        }
        if (i == NotificationCenter.recordResumed) {
            this.audioToSend = null;
            this.videoToSendMessageObject = null;
            TimerView timerView2 = this.recordTimerView;
            if (timerView2 != null) {
                long j2 = this.millisecondsRecorded;
                timerView2.isRunning = true;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
                timerView2.startTime = jCurrentTimeMillis2;
                timerView2.lastSendTypingTime = jCurrentTimeMillis2;
                timerView2.invalidate();
            }
            checkSendButton(true);
            this.recordingAudioVideo = true;
            updateRecordInterface(0, true);
            return;
        }
        if (i != NotificationCenter.audioDidSent) {
            if (i == NotificationCenter.audioRouteChanged) {
                Activity activity = this.parentActivity;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : Integer.MIN_VALUE);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.messagePlayingProgressDidChanged) {
                if (this.audioToSendMessageObject == null || !MediaController.getInstance().isPlayingMessage(this.audioToSendMessageObject)) {
                    return;
                }
                MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                MessageObject messageObject = this.audioToSendMessageObject;
                messageObject.audioProgress = playingMessageObject.audioProgress;
                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                return;
            }
            if (i == NotificationCenter.featuredStickersDidLoad) {
                AnonymousClass17 anonymousClass17 = this.emojiButton;
                if (anonymousClass17 != null) {
                    anonymousClass17.invalidate();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.messageReceivedByServer2) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long jLongValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (jLongValue != this.dialog_id || (chatFull = this.info) == null || chatFull.slowmode_seconds == 0 || MessageObject.isEphemeralMessageId(num2.intValue()) || (chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(this.info.id))) == null || ChatObject.hasAdminRights(chat) || ChatObject.isIgnoredChatRestrictionsForBoosters(chat)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.info;
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.info;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i == NotificationCenter.sendingMessagesChanged) {
                if (this.info != null) {
                    updateSlowModeText();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.audioRecordTooShort) {
                this.audioToSend = null;
                this.videoToSendMessageObject = null;
                updateRecordInterface(4, true);
                return;
            }
            if (i != NotificationCenter.updateBotMenuButton) {
                if (i == NotificationCenter.didUpdatePremiumGiftFieldIcon) {
                    updateGiftButton(true);
                    return;
                } else {
                    if (i == NotificationCenter.currentUserPremiumStatusChanged && this.richDraftActive && (anonymousClass27 = this.sendButton) != null) {
                        anonymousClass27.setLocked(!UserConfig.getInstance(this.currentAccount).isPremium());
                        return;
                    }
                    return;
                }
            }
            long jLongValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (jLongValue2 == this.dialog_id) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.botMenuWebViewTitle = tL_botMenuButton.text;
                    this.botMenuWebViewUrl = tL_botMenuButton.url;
                    this.botMenuButtonType = 3;
                } else if (this.hasBotCommands) {
                    this.botMenuButtonType = 2;
                } else {
                    this.botMenuButtonType = 1;
                }
                updateBotButton(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.recordingGuid) {
            return;
        }
        this.millisecondsRecorded = 0L;
        Object obj = objArr[1];
        if (obj instanceof VideoEditedInfo) {
            VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
            this.videoToSendMessageObject = videoEditedInfo;
            String str = (String) objArr[2];
            this.audioToSendPath = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.millisecondsRecorded = videoEditedInfo.estimatedDuration;
            VideoTimelineView videoTimelineView = this.videoTimelineView;
            if (videoTimelineView != null) {
                videoTimelineView.setVideoPath(str);
                this.videoTimelineView.setKeyframes(arrayList2);
                this.videoTimelineView.setVisibility(0);
                this.videoTimelineView.setMinProgressDiff(1000.0f / this.videoToSendMessageObject.estimatedDuration);
                isRecordingStateChanged();
            }
            updateRecordInterface(3, true);
            checkSendButton(false);
            return;
        }
        this.audioToSend = (TLRPC.TL_document) obj;
        this.audioToSendPath = (String) objArr[2];
        boolean z = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float fFloatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float fFloatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.audioToSend == null) {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onMessageSend(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        createRecordAudioPanel();
        if (this.recordedAudioPanel == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = 0;
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        tL_peerUser.user_id = clientUserId;
        peer.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.audioToSendPath;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.audioToSend;
        tL_message.flags |= 768;
        this.audioToSendMessageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
        this.recordedAudioPanel.setAlpha(1.0f);
        this.recordedAudioPanel.setVisibility(0);
        this.recordDeleteImageView.setVisibility(0);
        this.recordDeleteImageView.setAlpha(0.0f);
        this.recordDeleteImageView.setScaleY(0.0f);
        this.recordDeleteImageView.setScaleX(0.0f);
        int i6 = 0;
        while (true) {
            if (i6 >= this.audioToSend.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.audioToSend.attributes.get(i6);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.audioToSend.attributes.size()) {
                bArr = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.audioToSend.attributes.get(i7);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.audioToSendPath);
                }
                bArr = documentAttribute2.waveform;
                break;
            }
            i7++;
        }
        if (z && (anonymousClass9 = this.attachButton) != null) {
            this.attachButtonAlpha = 0.0f;
            anonymousClass9.setAlpha(0.0f);
            anonymousClass9.setScaleX(0.0f);
            anonymousClass9.setScaleY(0.0f);
        }
        this.millisecondsRecorded = (long) (1000.0d * d);
        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
        String str2 = this.audioToSendPath;
        if (!recordedAudioPlayerView.destroyed) {
            recordedAudioPlayerView.duration = (float) d;
            recordedAudioPlayerView.left = fFloatValue;
            recordedAudioPlayerView.right = fFloatValue2;
            recordedAudioPlayerView.wasPlaying = false;
            recordedAudioPlayerView.text.setText(AndroidUtilities.formatDuration((int) Math.round(Math.max(1.0d, d)), false), false, true);
            recordedAudioPlayerView.playPauseDrawable.setPause(false, false);
            if (recordedAudioPlayerView.player == null) {
                VideoPlayer videoPlayer = new VideoPlayer(true, false);
                recordedAudioPlayerView.player = videoPlayer;
                videoPlayer.delegate = new Stripe(recordedAudioPlayerView, 25);
            }
            recordedAudioPlayerView.player.preparePlayer(Uri.fromFile(new File(str2)), "other", 0L);
            recordedAudioPlayerView.lastWaveformWidth = 0;
            recordedAudioPlayerView.waveformData = bArr;
            recordedAudioPlayerView.invalidate();
        }
        checkSendButton(false);
        if (z) {
            createRecordCircle();
            createRecordPanel();
            createRecordAudioPanel();
            this.recordInterfaceState = 1;
            this.recordCircle.resetLockTranslation(false);
            RecordCircle recordCircle3 = this.recordCircle;
            this.recordControlsCircleScale.getClass();
            recordCircle3.setControlsScale(1.0f);
            ControlsView controlsView = this.controlsView;
            if (controlsView != null) {
                controlsView.setVisibility(0);
                this.controlsView.setAlpha(1.0f);
            }
        }
        updateRecordInterface(3, !z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        AnonymousClass78 anonymousClass78 = this.emojiView;
        if (anonymousClass78 == null || anonymousClass78.getVisibility() != 0 || this.emojiView.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.emojiView.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void doneEditingMessage() {
        MessagePreviewParams messagePreviewParams;
        MessageSuggestionParams messageSuggestionParamsOf;
        TLRPC.Chat chat;
        int i;
        MessageSuggestionParams messageSuggestionParamsOf2;
        MessageObject messageObject = this.editingMessageObject;
        if (messageObject == null) {
            return;
        }
        boolean zNeedResendWhenEdit = messageObject.needResendWhenEdit();
        ChatActivity chatActivity = this.parentFragment;
        if (zNeedResendWhenEdit && !ChatObject.canManageMonoForum(this.currentAccount, this.editingMessageObject.getDialogId())) {
            if (chatActivity == null || (messageSuggestionParamsOf2 = chatActivity.messageSuggestionParams) == null) {
                messageSuggestionParamsOf2 = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
            }
            if (!StarsController.isEnoughAmount(this.currentAccount, messageSuggestionParamsOf2.amount)) {
                if (chatActivity != null) {
                    chatActivity.showSuggestionOfferForEditMessage(messageSuggestionParamsOf2);
                    return;
                }
                return;
            }
        }
        if (this.currentLimit - this.codePointCount < 0) {
            NumberTextView numberTextView = this.captionLimitView;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.captionLimitView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.codePointCount) {
                return;
            }
            showCaptionLimitBulletin();
            return;
        }
        if (this.searchingType != 0) {
            setSearchingTypeInternal(0, true);
            this.emojiView.closeSearch(-1L, false);
            if (this.stickersExpanded) {
                setStickersExpanded(false, true, false, true);
                this.waitingForKeyboardOpenAfterAnimation = true;
                AndroidUtilities.runOnUIThread(new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 29), 200L);
            }
        }
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        CharSequence textToUse = anonymousClass50 == null ? "" : anonymousClass50.getTextToUse();
        MessageObject messageObject2 = this.editingMessageObject;
        if (messageObject2 == null || messageObject2.type != 19) {
            textToUse = AndroidUtilities.getTrimmedString(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.editingMessageObject.messageOwner.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                AndroidUtilities.shakeViewSpring(this.messageEditText, -3.0f);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
        }
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, supportsSendingNewEntities());
        if (!TextUtils.equals(charSequenceArr[0], this.editingMessageObject.messageText) || ((entities != null && !entities.isEmpty()) || !this.editingMessageObject.messageOwner.entities.isEmpty() || (this.editingMessageObject.messageOwner.media instanceof TLRPC.TL_messageMediaWebPage))) {
            MessageObject messageObject3 = this.editingMessageObject;
            messageObject3.editingMessage = charSequenceArr[0];
            messageObject3.editingMessageEntities = entities;
            messageObject3.editingMessageSearchWebPage = this.messageWebPageSearch;
            if (chatActivity != null && (chat = chatActivity.currentChat) != null && (((i = messageObject3.type) == 0 || i == 19) && !ChatObject.canSendEmbed(chat))) {
                MessageObject messageObject4 = this.editingMessageObject;
                messageObject4.editingMessageSearchWebPage = false;
                TLRPC.Message message = messageObject4.messageOwner;
                message.flags &= -513;
                message.media = null;
            } else if (chatActivity == null || (messagePreviewParams = chatActivity.messagePreviewParams) == null) {
                MessageObject messageObject5 = this.editingMessageObject;
                messageObject5.editingMessageSearchWebPage = false;
                int i2 = messageObject5.type;
                if (i2 == 0 || i2 == 19) {
                    TLRPC.Message message2 = messageObject5.messageOwner;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (chatActivity.foundWebPage instanceof TLRPC.TL_webPagePending) {
                    MessageObject messageObject6 = this.editingMessageObject;
                    messageObject6.editingMessageSearchWebPage = false;
                    int i3 = messageObject6.type;
                    if (i3 == 0 || i3 == 19) {
                        messageObject6.messageOwner.media = new TLRPC.TL_messageMediaEmpty();
                        this.editingMessageObject.messageOwner.flags |= 512;
                    }
                } else if (messagePreviewParams.webpage != null) {
                    MessageObject messageObject7 = this.editingMessageObject;
                    messageObject7.editingMessageSearchWebPage = false;
                    TLRPC.Message message3 = messageObject7.messageOwner;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.editingMessageObject.messageOwner.media.webpage = chatActivity.messagePreviewParams.webpage;
                } else {
                    MessageObject messageObject8 = this.editingMessageObject;
                    messageObject8.editingMessageSearchWebPage = false;
                    int i4 = messageObject8.type;
                    if (i4 == 0 || i4 == 19) {
                        TLRPC.Message message4 = messageObject8.messageOwner;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.editingMessageObject.messageOwner;
                MessagePreviewParams messagePreviewParams2 = chatActivity.messagePreviewParams;
                message5.invert_media = messagePreviewParams2.webpageTop;
                if (messagePreviewParams2.hasMedia) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z = messagePreviewParams2.webpageSmall;
                        messageMedia2.force_small_media = z;
                        messageMedia2.force_large_media = true ^ z;
                    }
                }
            }
            if (this.editingMessageObject.needResendWhenEdit()) {
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.editingMessageObject.editingMessage.toString(), this.editingMessageObject.getDialogId());
                if (chatActivity == null || (messageSuggestionParamsOf = chatActivity.messageSuggestionParams) == null) {
                    messageSuggestionParamsOf = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
                }
                sendMessageParamsOf.suggestionParams = messageSuggestionParamsOf;
                sendMessageParamsOf.monoForumPeer = DialogObject.getPeerDialogId(this.editingMessageObject.messageOwner.saved_peer_id);
                sendMessageParamsOf.hasMediaSpoilers = this.editingMessageObject.hasMediaSpoilers();
                MessageObject messageObject9 = this.editingMessageObject;
                sendMessageParamsOf.replyToMsg = messageObject9;
                sendMessageParamsOf.parentObject = messageObject9;
                if (messageObject9.getDocument() instanceof TLRPC.TL_document) {
                    sendMessageParamsOf.document = (TLRPC.TL_document) this.editingMessageObject.getDocument();
                    sendMessageParamsOf.caption = sendMessageParamsOf.message;
                    sendMessageParamsOf.message = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.editingMessageObject.messageOwner.media;
                    if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                        TLRPC.Photo photo = messageMedia3.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            sendMessageParamsOf.photo = (TLRPC.TL_photo) photo;
                        } else {
                            sendMessageParamsOf.location = messageMedia3;
                        }
                        sendMessageParamsOf.caption = sendMessageParamsOf.message;
                        sendMessageParamsOf.message = null;
                    }
                }
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            } else {
                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.currentAccount);
                MessageObject messageObject10 = this.editingMessageObject;
                sendMessagesHelper.editMessage(messageObject10, null, null, null, null, null, null, false, messageObject10.hasMediaSpoilers(), null);
            }
        }
        setEditingMessageObject(null, null, false);
    }

    public final void drawBackground(Canvas canvas, boolean z) {
        if (this.shouldDrawBackground) {
            int iM = (int) DiffUtil.m(1.0f, this.composeShadowAlpha, Theme.chat_composeShadowDrawable.getIntrinsicHeight(), this.animatedTop);
            FrameLayout frameLayout = this.topView;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                iM = (int) (((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height) + iM);
            }
            int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight() + iM;
            if (z) {
                Theme.chat_composeShadowDrawable.setAlpha((int) (this.composeShadowAlpha * 255.0f));
                Theme.chat_composeShadowDrawable.setBounds(0, iM, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
            }
            if (this.allowBlur) {
                Paint paint = this.backgroundPaint;
                paint.setColor(getThemedColor$6(Theme.key_chat_messagePanelBackground));
                if (!SharedConfig.chatBlurEnabled() || this.sizeNotifierLayout == null) {
                    canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
                    return;
                } else {
                    this.blurBounds.set(0, intrinsicHeight, getWidth(), getHeight());
                    this.sizeNotifierLayout.drawBlurRect(canvas, getTop(), this.blurBounds, paint, false);
                    return;
                }
            }
            float f = intrinsicHeight;
            float width = getWidth();
            float height = getHeight();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint2 = resourcesProvider != null ? resourcesProvider.getPaint("paintChatComposeBackground") : null;
            if (paint2 == null) {
                paint2 = Theme.getThemePaint("paintChatComposeBackground");
            }
            canvas.drawRect(0.0f, f, width, height, paint2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        FrameLayout frameLayout = this.topView;
        AnonymousClass15 anonymousClass15 = this.textFieldContainer;
        boolean z = view == frameLayout || view == anonymousClass15;
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.animatorInputFieldHeight.factor;
            canvas.save();
            if (view == anonymousClass15) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.topView) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public final boolean drawMessageEditText(Canvas canvas, Utilities.Callback0Return callback0Return) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = this.topGradientAlpha.set(this.messageEditText.canScrollVertically(-1));
        float f6 = this.bottomGradientAlpha.set(this.messageEditText.canScrollVertically(1));
        if (f5 <= 0.0f && f6 <= 0.0f) {
            return ((Boolean) callback0Return.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.messageEditText.getX() + this.messageEditText.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.messageEditText.getY() + this.messageEditText.getMeasuredHeight() + AndroidUtilities.dp(2.0f), 255, 31);
        boolean zBooleanValue = ((Boolean) callback0Return.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.clipGradient;
        Paint paint = this.gradientPaint;
        Matrix matrix = this.clipMatrix;
        if (f5 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            f = 255.0f;
            f2 = 16.0f;
            f3 = 0.0f;
            f4 = 5.0f;
            rectF.set(this.messageEditText.getX() - AndroidUtilities.dp(5.0f), (this.messageEditText.getY() + this.animatedTop) - 1.0f, this.messageEditText.getX() + this.messageEditText.getMeasuredWidth() + AndroidUtilities.dp(5.0f), this.messageEditText.getY() + this.animatedTop + AndroidUtilities.dp(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (f5 * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f = 255.0f;
            f2 = 16.0f;
            f3 = 0.0f;
            f4 = 5.0f;
        }
        if (f6 > f3) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.messageEditText.getX() - AndroidUtilities.dp(f4), (this.messageEditText.getY() + this.messageEditText.getMeasuredHeight()) - AndroidUtilities.dp(15.0f), this.messageEditText.getX() + this.messageEditText.getMeasuredWidth() + AndroidUtilities.dp(f4), this.messageEditText.getY() + this.messageEditText.getMeasuredHeight() + AndroidUtilities.dp(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f2);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (f6 * f));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return zBooleanValue;
    }

    public final AnonymousClass72 editingMessageObjectPreview(MessageObject messageObject, boolean z) {
        AnonymousClass72 anonymousClass72 = new AnonymousClass72(messageObject.currentAccount, messageObject.messageOwner, true, true);
        if (z) {
            AnonymousClass50 anonymousClass50 = this.messageEditText;
            CharSequence[] charSequenceArr = {anonymousClass50 == null ? "" : anonymousClass50.getTextToUse()};
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            MessageObject.addEntitiesToText(spannableStringBuilder, entities, true, true, false, true);
            anonymousClass72.caption = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder, Theme.chat_msgTextPaint.getFontMetricsInt(), false, (int[]) null), entities, Theme.chat_msgTextPaint.getFontMetricsInt());
        }
        return anonymousClass72;
    }

    public void extendActionMode$1(Menu menu) {
    }

    public AdjustPanLayoutHelper getAdjustPanLayoutHelper() {
        return this.adjustPanLayoutHelper;
    }

    public int getAnimatedTop() {
        return this.animatedTop;
    }

    public ImageView getAttachButton() {
        return this.attachButton;
    }

    public View getAudioVideoButtonContainer() {
        return this.audioVideoButtonContainer;
    }

    public int getBackgroundTop() {
        int top = getTop();
        FrameLayout frameLayout = this.topView;
        return (frameLayout == null || frameLayout.getVisibility() != 0) ? top : top + this.topView.getLayoutParams().height;
    }

    public ChatActivityBotWebViewButton getBotWebViewButton() {
        if (this.botWebViewButton == null) {
            ChatActivityBotWebViewButton chatActivityBotWebViewButton = new ChatActivityBotWebViewButton(getContext());
            this.botWebViewButton = chatActivityBotWebViewButton;
            chatActivityBotWebViewButton.setVisibility(8);
            createBotCommandsMenuButton();
            this.botWebViewButton.setBotMenuButton(this.botCommandsMenuButton);
            this.messageEditTextContainer.addView(this.botWebViewButton, LayoutHelper.createFrame(-1, -1, 80));
        }
        return this.botWebViewButton;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCursorPosition() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null) {
            return 0;
        }
        return anonymousClass50.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.editingMessageObject != null) {
            if (TextUtils.isEmpty(this.draftMessage)) {
                return null;
            }
            return this.draftMessage;
        }
        if (this.messageEditText == null || !hasText()) {
            return null;
        }
        return this.messageEditText.getText();
    }

    @Override
    public Editable getEditText() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null) {
            return null;
        }
        return anonymousClass50.getText();
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    public long getEffectId() {
        return this.effectId;
    }

    public View getEmojiButton() {
        return this.emojiButton;
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    public EmojiView getEmojiView() {
        return this.emojiView;
    }

    public float getExitTransition() {
        return this.exitTransition;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.messageEditText == null || !hasText()) {
            return null;
        }
        return this.messageEditText.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        FrameLayout frameLayout = this.topView;
        return (frameLayout == null || frameLayout.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height));
    }

    public float getLockAnimatedTranslation() {
        return this.lockAnimatedTranslation;
    }

    public int getMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        ChatActivity chatActivity = this.parentFragment;
        int forwardedMessagesCount = (chatActivity == null || (messagePreviewParams = chatActivity.messagePreviewParams) == null) ? 0 : messagePreviewParams.getForwardedMessagesCount();
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null && !TextUtils.isEmpty(anonymousClass50.getText())) {
            String trimmedString = SendMessagesHelper.getTrimmedString(this.messageEditText.getText().toString());
            int maxMessageLength = this.accountInstance.getMessagesController().getMaxMessageLength();
            if (trimmedString.length() != 0) {
                forwardedMessagesCount += (int) Math.ceil(trimmedString.length() / maxMessageLength);
            } else {
                forwardedMessagesCount++;
            }
        } else if (this.audioToSendMessageObject != null || this.videoToSendMessageObject != null) {
            forwardedMessagesCount++;
        }
        return Math.max(1, forwardedMessagesCount);
    }

    public RecordCircle getRecordCircle() {
        return this.recordCircle;
    }

    public MessageObject getReplyingMessageObject() {
        return this.replyingMessageObject;
    }

    public int getSelectionLength() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null) {
            return 0;
        }
        try {
            return anonymousClass50.getSelectionEnd() - this.messageEditText.getSelectionStart();
        } catch (Exception e) {
            FileLog.e(e);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.audioVideoButtonContainer;
    }

    public View getSendButtonInternal() {
        return this.sendButton;
    }

    public MessageSuggestionParams getSendMessageSuggestionParams() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.messageSuggestionParams;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            return chatActivity.getSendMonoForumPeerId();
        }
        return 0L;
    }

    public SenderSelectView getSenderSelectView() {
        return this.senderSelectView;
    }

    public SizeNotifierFrameLayout getSizeNotifierLayout() {
        return this.sizeNotifierLayout;
    }

    public float getSlideToCancelProgress() {
        return this.slideToCancelProgress;
    }

    public CharSequence getSlowModeTimer() {
        if (this.slowModeTimer > 0) {
            return this.slowModeButton.textView.getText();
        }
        return null;
    }

    public long getStarsPrice() {
        ChatActivity chatActivity = this.parentFragment;
        return chatActivity != null ? chatActivity.getMessagesController().getSendPaidMessagesStars(chatActivity.getDialogId()) : MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialog_id);
    }

    public Drawable getStickersArrowDrawable() {
        return this.stickersArrow;
    }

    public int getStickersExpandedHeight() {
        return this.stickersExpandedHeight;
    }

    public ImageView getSuggestButton() {
        return this.suggestButton;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public final int getThemedColor$6(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    public float getTopViewEnterProgress() {
        return this.animatorTopViewVisibility.floatValue;
    }

    public float getTopViewHeight() {
        FrameLayout frameLayout = this.topView;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return 0.0f;
        }
        return this.topView.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        FrameLayout frameLayout = this.topView;
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return 0.0f;
        }
        return this.topView.getTranslationY();
    }

    public TrendingStickersAlert getTrendingStickersAlert() {
        return this.trendingStickersAlert;
    }

    public int getVisibleEmojiPadding() {
        if (this.emojiViewVisible) {
            return this.emojiPadding;
        }
        return 0;
    }

    public float getVisualHeight() {
        float topViewEnterProgress = this.animatedTop;
        FrameLayout frameLayout = this.topView;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            topViewEnterProgress += (1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height;
        }
        return getMeasuredHeight() - topViewEnterProgress;
    }

    public final boolean hasBotWebView() {
        return this.botMenuButtonType == 3;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean hasText() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        return anonymousClass50 != null && anonymousClass50.length() > 0;
    }

    public final void hideHints$1() {
        HintView2 hintView2 = this.sendSuggestHintView;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
        HintView2 hintView3 = this.birthdayHint;
        if (hintView3 != null) {
            hintView3.hide(true);
        }
    }

    public final void hidePopup(boolean z, boolean z2, boolean z3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (isPopupShowing()) {
            if (this.currentPopupContentType == 1 && (tL_replyKeyboardMarkup = this.botReplyMarkup) != null && z && this.botButtonsMessageObject != null) {
                if (tL_replyKeyboardMarkup.is_persistent) {
                    return;
                }
                MessagesController.getMainSettings(this.currentAccount).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.botButtonsMessageObject.getId()).apply();
            }
            if ((z && this.searchingType != 0) || z2) {
                setSearchingTypeInternal(0, true);
                AnonymousClass78 anonymousClass78 = this.emojiView;
                if (anonymousClass78 != null) {
                    anonymousClass78.closeSearch(-1L, true);
                }
                AnonymousClass50 anonymousClass50 = this.messageEditText;
                if (anonymousClass50 != null) {
                    anonymousClass50.requestFocus();
                }
                setStickersExpanded(false, true, false, true);
                if (this.emojiTabOpen) {
                    checkSendButton(true);
                    return;
                }
                return;
            }
            if (this.searchingType == 0) {
                if (this.stickersExpanded) {
                    setStickersExpanded(false, true, false, true);
                    return;
                } else {
                    showPopup(0, 0, true, z3 && !z);
                    return;
                }
            }
            setSearchingTypeInternal(0, false);
            this.emojiView.closeSearch(-1L, false);
            AnonymousClass50 anonymousClass51 = this.messageEditText;
            if (anonymousClass51 != null) {
                anonymousClass51.requestFocus();
            }
        }
    }

    public final void hideRecordedAudioPanel(boolean z) {
        AnimatorSet animatorSet;
        int i;
        int i2 = 1;
        AnimatorSet animatorSet2 = this.recordPannelAnimation;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.audioToSendPath = null;
            this.audioToSend = null;
            this.audioToSendMessageObject = null;
            this.videoToSendMessageObject = null;
            VideoTimelineView videoTimelineView = this.videoTimelineView;
            if (videoTimelineView != null) {
                videoTimelineView.destroy(true);
            }
            AnonymousClass25 anonymousClass25 = this.audioVideoSendButton;
            if (anonymousClass25 != null) {
                anonymousClass25.setVisibility(0);
            }
            AnonymousClass10 anonymousClass10 = this.MESSAGE_TEXT_TRANSLATION_X;
            AnonymousClass10 anonymousClass11 = this.EMOJI_BUTTON_SCALE;
            AnonymousClass10 anonymousClass12 = this.EMOJI_BUTTON_ALPHA;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            AnonymousClass17 anonymousClass17 = this.emojiButton;
            Property property3 = View.ALPHA;
            VoIPFragment.AnonymousClass9 anonymousClass9 = this.attachButton;
            if (z) {
                if (anonymousClass9 != null) {
                    this.attachButtonAlpha = 0.0f;
                    anonymousClass9.setAlpha(0.0f);
                    anonymousClass9.setScaleX(0.0f);
                    anonymousClass9.setScaleY(0.0f);
                }
                this.emojiButtonAlpha = 0.0f;
                this.emojiButtonScale = 0.0f;
                updateEmojiButtonParams();
                this.recordPannelAnimation = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass17, anonymousClass12, this.emojiButtonRestricted ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass17, anonymousClass11, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.recordedAudioPanel, (Property<AnonymousClass35, Float>) property3, 0.0f));
                if (anonymousClass9 != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.attachButtonAnimator;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.attachButtonAnimator = null;
                    }
                    this.attachButtonAlpha = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.messageEditText, anonymousClass10, 0.0f));
                ControlsView controlsView = this.controlsView;
                if (controlsView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(controlsView, (Property<ControlsView, Float>) property3, 0.0f));
                    this.controlsView.hideHintView();
                }
                this.recordPannelAnimation.playTogether(arrayList);
                BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
                if (botCommandsMenuView != null) {
                    botCommandsMenuView.setAlpha(0.0f);
                    this.botCommandsMenuButton.setScaleY(0.0f);
                    this.botCommandsMenuButton.setScaleX(0.0f);
                    this.recordPannelAnimation.playTogether(ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property, 1.0f));
                }
                this.recordPannelAnimation.setDuration(150L);
                this.recordPannelAnimation.addListener(new AnonymousClass28(this, i2));
            } else {
                RLottieImageView rLottieImageView = this.recordDeleteImageView;
                if (rLottieImageView != null) {
                    rLottieImageView.playAnimation();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = this.isInVideoMode;
                Property property4 = View.TRANSLATION_X;
                if (z2) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.messageEditText, anonymousClass10, 0.0f));
                    ControlsView controlsView2 = this.controlsView;
                    if (controlsView2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(controlsView2, (Property<ControlsView, Float>) property3, 0.0f));
                        this.controlsView.hideHintView();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.emojiButtonPaddingAlpha == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property3, 1.0f);
                        objectAnimatorOfFloat.setStartDelay(750L);
                        objectAnimatorOfFloat.setDuration(200L);
                        animatorSet3.playTogether(objectAnimatorOfFloat);
                    }
                } else {
                    AnonymousClass50 anonymousClass50 = this.messageEditText;
                    if (anonymousClass50 == null || this.emojiButtonPaddingAlpha != 1.0f) {
                        this.messageTextTranslationX = 0.0f;
                        updateMessageTextParams();
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property3, 1.0f);
                        objectAnimatorOfFloat2.setStartDelay(750L);
                        objectAnimatorOfFloat2.setDuration(200L);
                        animatorSet3.playTogether(objectAnimatorOfFloat2);
                    } else {
                        anonymousClass50.setAlpha(1.0f);
                        this.messageTextTranslationX = 0.0f;
                        updateMessageTextParams();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.audioTimelineView, (Property<RecordedAudioPlayerView, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.audioTimelineView, (Property<RecordedAudioPlayerView, Float>) property4, -AndroidUtilities.dp(20.0f)));
                    ControlsView controlsView3 = this.controlsView;
                    if (controlsView3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(controlsView3, (Property<ControlsView, Float>) property3, 0.0f));
                        this.controlsView.hideHintView();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (anonymousClass9 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.attachButtonAnimator;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.attachButtonAnimator = null;
                    }
                    this.attachButtonAlpha = 0.0f;
                    anonymousClass9.setAlpha(0.0f);
                    anonymousClass9.setScaleX(0.0f);
                    anonymousClass9.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.attachButtonAlpha = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 1.0f), ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 1.0f), ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.emojiButtonScale = 0.0f;
                this.emojiButtonAlpha = 0.0f;
                updateEmojiButtonParams();
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(anonymousClass17, anonymousClass12, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(anonymousClass17, anonymousClass11, 1.0f));
                BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
                if (botCommandsMenuView2 != null) {
                    botCommandsMenuView2.setAlpha(0.0f);
                    this.botCommandsMenuButton.setScaleY(0.0f);
                    this.botCommandsMenuButton.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property, 1.0f));
                }
                animatorSet4.setDuration(150L);
                animatorSet4.setStartDelay(600L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.recordPannelAnimation = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                    i = 2;
                } else {
                    i = 2;
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.recordPannelAnimation.addListener(new AnonymousClass28(this, i));
            }
            AnimatorSet animatorSet6 = this.recordPannelAnimation;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            ControlsView controlsView4 = this.controlsView;
            if (controlsView4 != null) {
                controlsView4.invalidate();
            }
        }
    }

    public final void hideRecordedAudioPanelInternal() {
        this.audioToSendPath = null;
        this.audioToSend = null;
        this.audioToSendMessageObject = null;
        this.videoToSendMessageObject = null;
        VideoTimelineView videoTimelineView = this.videoTimelineView;
        if (videoTimelineView != null) {
            videoTimelineView.destroy(true);
        }
        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
        if (recordedAudioPlayerView != null) {
            recordedAudioPlayerView.setAlpha(1.0f);
            this.audioTimelineView.setTranslationX(0.0f);
        }
        VideoTimelineView videoTimelineView2 = this.videoTimelineView;
        if (videoTimelineView2 != null) {
            videoTimelineView2.setAlpha(1.0f);
            this.videoTimelineView.setTranslationX(0.0f);
        }
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.setAlpha(1.0f);
            this.messageTextTranslationX = 0.0f;
            updateMessageTextParams();
            this.messageEditText.requestFocus();
        }
        AnonymousClass35 anonymousClass35 = this.recordedAudioPanel;
        if (anonymousClass35 != null) {
            anonymousClass35.setVisibility(8);
        }
        isRecordingStateChanged();
    }

    public void hideTopView(boolean z) {
        if (this.topView == null || !this.topViewShowed) {
            return;
        }
        ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = this.showTopViewRunnable;
        if (chatActivityEnterView$$ExternalSyntheticLambda4 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4);
        }
        this.topViewShowed = false;
        this.needShowTopView = false;
        if (this.allowShowTopView) {
            this.animatorTopViewVisibility.setValue(false, z);
        }
    }

    public final boolean isEditingMessage() {
        return this.editingMessageObject != null;
    }

    @Override
    public final boolean isInScheduleMode() {
        ChatActivity chatActivity = this.parentFragment;
        return chatActivity != null && chatActivity.isInScheduleMode();
    }

    public final boolean isInVideoMode() {
        return this.isInVideoMode;
    }

    public final boolean isPopupShowing() {
        return this.emojiViewVisible || this.botKeyboardViewVisible;
    }

    public final boolean isPopupView(View view) {
        return view == this.botKeyboardView || view == this.emojiView;
    }

    public final boolean isRecordingAudioVideo() {
        if (this.recordingAudioVideo) {
            return true;
        }
        AnimatorSet animatorSet = this.runningAnimationAudio;
        return (animatorSet == null || !animatorSet.isRunning() || this.recordIsCanceled) ? false : true;
    }

    public void isRecordingStateChanged() {
    }

    public final boolean isStickersExpanded() {
        return this.stickersExpanded;
    }

    public final boolean isTopViewVisible() {
        FrameLayout frameLayout = this.topView;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    public final void lambda$onStickerSelected$98(TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        if (this.slowModeTimer > 0 && !isInScheduleMode()) {
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                SlowModeBtn slowModeBtn = this.slowModeButton;
                chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn.textView.getText(), slowModeBtn, true);
                return;
            }
            return;
        }
        if (this.searchingType != 0) {
            setSearchingTypeInternal(0, true);
            this.emojiView.closeSearch(-1L, true);
            this.emojiView.hideSearchKeyboard();
        }
        setStickersExpanded(false, true, false, true);
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.delegate;
        TL_stories.StoryItem replyToStory = chatActivityEnterViewDelegate2 != null ? chatActivityEnterViewDelegate2.getReplyToStory() : null;
        SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(this.currentAccount);
        long j = this.dialog_id;
        MessageObject messageObject = this.replyingMessageObject;
        MessageObject threadMessage = getThreadMessage();
        ChatActivity.ReplyQuote replyQuote = this.replyingQuote;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        ChatActivity chatActivity = this.parentFragment;
        sendMessagesHelper.sendSticker(document, str, j, messageObject, threadMessage, replyToStory, replyQuote, sendAnimationData, z, i, i2, z3, obj, chatActivity != null ? chatActivity.getMessageChatSendParams() : null, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = this.delegate;
        if (chatActivityEnterViewDelegate3 != null) {
            chatActivityEnterViewDelegate3.onMessageSend(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        MediaDataController.getInstance(this.currentAccount).addRecentSticker(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void lambda$setButtons$90(TL_keyboard.KeyboardButton keyboardButton) {
        MessageObject messageObject;
        ChatActivity chatActivity;
        boolean z = this.replyingMessageObject != null && (chatActivity = this.parentFragment) != null && chatActivity.isTopic && chatActivity.getTopicId() == ((long) this.replyingMessageObject.getId());
        if ((this.replyingMessageObject == null || z) && !BotForumHelper.isBotForum(this.currentAccount, this.dialog_id)) {
            messageObject = DialogObject.isChatDialog(this.dialog_id) ? this.botButtonsMessageObject : null;
        } else {
            messageObject = this.replyingMessageObject;
        }
        MessageObject messageObject2 = this.replyingMessageObject;
        if (messageObject2 == null || z) {
            messageObject2 = this.botButtonsMessageObject;
        }
        boolean zDidPressedBotButton = didPressedBotButton(keyboardButton, messageObject, messageObject2, null);
        if (this.replyingMessageObject == null || z) {
            MessageObject messageObject3 = this.botButtonsMessageObject;
            if (messageObject3 != null && messageObject3.messageOwner.reply_markup.single_use) {
                if (zDidPressedBotButton) {
                    openKeyboardInternal();
                } else {
                    showPopup(0, 0, true, true);
                }
                MessagesController.getMainSettings(this.currentAccount).edit().putInt("answered_" + getTopicKeyString(), this.botButtonsMessageObject.getId()).commit();
            }
        } else {
            openKeyboardInternal();
            setButtons(this.botMessageObject, true, false);
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onMessageSend(null, true, 0, 0, 0L);
        }
    }

    public void onChangedIslandTotalHeight(float f) {
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass37 anonymousClass37 = this.senderSelectPopupWindow;
        if (anonymousClass37 != null) {
            anonymousClass37.pauseNotifications = false;
            anonymousClass37.dismiss();
        }
    }

    public final void onDestroy() {
        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
        if (recordedAudioPlayerView != null) {
            recordedAudioPlayerView.destroyed = true;
            VideoPlayer videoPlayer = recordedAudioPlayerView.player;
            if (videoPlayer != null) {
                videoPlayer.setPlayWhenReady(false);
                recordedAudioPlayerView.player.releasePlayer();
                recordedAudioPlayerView.player = null;
            }
        }
        if (this.audioTimelineView != null && this.audioToSend != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            long j = this.dialog_id;
            ChatActivity chatActivity = this.parentFragment;
            long topicId = (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId();
            RecordedAudioPlayerView recordedAudioPlayerView2 = this.audioTimelineView;
            float audioLeft = recordedAudioPlayerView2 == null ? 0.0f : recordedAudioPlayerView2.getAudioLeft();
            RecordedAudioPlayerView recordedAudioPlayerView3 = this.audioTimelineView;
            mediaDataController.setDraftVoiceRegion(j, topicId, audioLeft, recordedAudioPlayerView3 == null ? 1.0f : recordedAudioPlayerView3.getAudioRight());
        }
        this.destroyed = true;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordStarted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordPaused);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordResumed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordStartError);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordStopped);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recordProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.audioDidSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.audioRouteChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messageReceivedByServer2);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.sendingMessagesChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.audioRecordTooShort);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateBotMenuButton);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftFieldIcon);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        AnonymousClass78 anonymousClass78 = this.emojiView;
        if (anonymousClass78 != null) {
            anonymousClass78.onDestroy();
        }
        ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = this.updateSlowModeRunnable;
        if (chatActivityEnterView$$ExternalSyntheticLambda4 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4);
            this.updateSlowModeRunnable = null;
        }
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.wakeLock = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.setDelegate(null);
        }
        AnonymousClass37 anonymousClass37 = this.senderSelectPopupWindow;
        if (anonymousClass37 != null) {
            anonymousClass37.pauseNotifications = false;
            anonymousClass37.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        drawBackground(canvas, true);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            this.currentIslandTotalHeightTarget = calculateIslandTotalHeight(true);
            float fCalculateIslandTotalHeight = calculateIslandTotalHeight(false);
            if (this.currentIslandTotalHeight != fCalculateIslandTotalHeight) {
                this.currentIslandTotalHeight = fCalculateIslandTotalHeight;
                onChangedIslandTotalHeight(fCalculateIslandTotalHeight);
            }
            checkUi_TopViewVisibility();
        } else if (i == 1) {
            this.currentIslandTotalHeightTarget = calculateIslandTotalHeight(true);
            float fCalculateIslandTotalHeight2 = calculateIslandTotalHeight(false);
            if (this.currentIslandTotalHeight != fCalculateIslandTotalHeight2) {
                this.currentIslandTotalHeight = fCalculateIslandTotalHeight2;
                onChangedIslandTotalHeight(fCalculateIslandTotalHeight2);
            }
            checkUi_TopViewVisibility();
        } else if (i == 2) {
            SendButtonBlockedByTypingView sendButtonBlockedByTypingView = this.sendButtonBlockedByTypingView;
            sendButtonBlockedByTypingView.setAlpha(f);
            sendButtonBlockedByTypingView.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, f));
            sendButtonBlockedByTypingView.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, f));
            sendButtonBlockedByTypingView.setVisibility(f <= 0.0f ? 4 : 0);
        } else if (i == 3) {
            float fLerp = AndroidUtilities.lerp(1.0f, 0.79f, f);
            AnonymousClass15 anonymousClass15 = this.sendButtonContainer;
            anonymousClass15.setScaleX(fLerp);
            anonymousClass15.setScaleY(AndroidUtilities.lerp(1.0f, 0.79f, f));
            ImageView imageView = this.sendOutlineView;
            imageView.setScaleX(AndroidUtilities.lerp(0.79f, 1.0f, f));
            imageView.setScaleY(AndroidUtilities.lerp(0.79f, 1.0f, f));
            imageView.setVisibility(f <= 0.0f ? 8 : 0);
            imageView.setAlpha(f);
            AnonymousClass27 anonymousClass27 = this.sendButton;
            if (anonymousClass27 != null) {
                anonymousClass27.setSameWidthFactor(f);
            }
        }
        invalidate();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View viewFindChildViewUnder;
        if (this.recordingAudioVideo) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (viewFindChildViewUnder = AndroidUtilities.findChildViewUnder(this, motionEvent.getX(), motionEvent.getY())) != this.birthdayHint && viewFindChildViewUnder != this.aiHint) {
            hideHints$1();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass47 anonymousClass47;
        super.onLayout(z, i, i2, i3, i4);
        if (this.botCommandLastPosition == -1 || (anonymousClass47 = this.botCommandsMenuContainer) == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) anonymousClass47.listView.getLayoutManager();
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.botCommandLastPosition, this.botCommandLastTop);
        }
        this.botCommandLastPosition = -1;
    }

    public void onLineCountChanged(int i, int i2) {
    }

    @Override
    public final void onMeasure(int i, int i2) {
        AnonymousClass15 anonymousClass15 = this.textFieldContainer;
        int measuredHeight = anonymousClass15.getMeasuredHeight();
        BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
        ImageView imageView = this.deleteRichDraftButton;
        AnonymousClass17 anonymousClass17 = this.emojiButton;
        int i3 = 0;
        if (botCommandsMenuView == null || botCommandsMenuView.getTag() == null) {
            SenderSelectView senderSelectView = this.senderSelectView;
            if (senderSelectView == null || senderSelectView.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) anonymousClass17.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                }
                AnonymousClass50 anonymousClass50 = this.messageEditText;
                if (anonymousClass50 != null) {
                    ((ViewGroup.MarginLayoutParams) anonymousClass50.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
                RichMessageLayout.PreviewView previewView = this.richDraftPreview;
                if (previewView != null) {
                    ((ViewGroup.MarginLayoutParams) previewView.getLayoutParams()).leftMargin = AndroidUtilities.dp(50.0f);
                }
            } else {
                int i4 = this.senderSelectView.getLayoutParams().width;
                this.senderSelectView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.senderSelectView.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) anonymousClass17.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i4;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = AndroidUtilities.dp(7.0f) + i4;
                }
                AnonymousClass50 anonymousClass51 = this.messageEditText;
                if (anonymousClass51 != null) {
                    ((ViewGroup.MarginLayoutParams) anonymousClass51.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i4;
                }
                RichMessageLayout.PreviewView previewView2 = this.richDraftPreview;
                if (previewView2 != null) {
                    ((ViewGroup.MarginLayoutParams) previewView2.getLayoutParams()).leftMargin = AndroidUtilities.dp(54.0f) + i4;
                }
            }
        } else {
            this.botCommandsMenuButton.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass17.getLayoutParams();
            int iDp = AndroidUtilities.dp(10.0f);
            BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
            marginLayoutParams.leftMargin = iDp + (botCommandsMenuView2 == null ? 0 : botCommandsMenuView2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iDp2 = AndroidUtilities.dp(10.0f);
                BotCommandsMenuView botCommandsMenuView3 = this.botCommandsMenuButton;
                marginLayoutParams2.leftMargin = iDp2 + (botCommandsMenuView3 == null ? 0 : botCommandsMenuView3.getMeasuredWidth());
            }
            AnonymousClass50 anonymousClass52 = this.messageEditText;
            if (anonymousClass52 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) anonymousClass52.getLayoutParams();
                int iDp3 = AndroidUtilities.dp(57.0f);
                BotCommandsMenuView botCommandsMenuView4 = this.botCommandsMenuButton;
                marginLayoutParams3.leftMargin = iDp3 + (botCommandsMenuView4 == null ? 0 : botCommandsMenuView4.getMeasuredWidth());
            }
            RichMessageLayout.PreviewView previewView3 = this.richDraftPreview;
            if (previewView3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) previewView3.getLayoutParams();
                int iDp4 = AndroidUtilities.dp(57.0f);
                BotCommandsMenuView botCommandsMenuView5 = this.botCommandsMenuButton;
                marginLayoutParams4.leftMargin = iDp4 + (botCommandsMenuView5 == null ? 0 : botCommandsMenuView5.getMeasuredWidth());
            }
        }
        updateBotCommandsMenuContainerTopPadding();
        super.onMeasure(i, i2);
        ChatActivityBotWebViewButton chatActivityBotWebViewButton = this.botWebViewButton;
        if (chatActivityBotWebViewButton != null) {
            BotCommandsMenuView botCommandsMenuView6 = this.botCommandsMenuButton;
            if (botCommandsMenuView6 != null) {
                chatActivityBotWebViewButton.setMeasuredButtonWidth(botCommandsMenuView6.getMeasuredWidth());
            }
            this.botWebViewButton.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
            measureChild(this.botWebViewButton, i, i2);
        }
        this.currentIslandTotalHeightTarget = calculateIslandTotalHeight(true);
        float fCalculateIslandTotalHeight = calculateIslandTotalHeight(false);
        if (this.currentIslandTotalHeight != fCalculateIslandTotalHeight) {
            this.currentIslandTotalHeight = fCalculateIslandTotalHeight;
            onChangedIslandTotalHeight(fCalculateIslandTotalHeight);
        }
        checkUi_TopViewVisibility();
        if (measuredHeight <= 0 || anonymousClass15.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i3 < 2) {
            ImageView imageView2 = i3 == 0 ? this.aiButton : this.richButton;
            imageView2.setTranslationY((imageView2.getTranslationY() + anonymousClass15.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
            i3++;
        }
        HintView2 hintView2 = this.aiHint;
        if (hintView2 != null) {
            hintView2.setTranslationY((hintView2.getTranslationY() + anonymousClass15.getMeasuredHeight()) - measuredHeight);
            OKLCH.m(this.aiHint.animate().translationY(0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
        }
    }

    public final void onPause() {
        this.isPaused = true;
        AnonymousClass37 anonymousClass37 = this.senderSelectPopupWindow;
        if (anonymousClass37 != null) {
            anonymousClass37.pauseNotifications = false;
            anonymousClass37.dismiss();
        }
        if (this.keyboardVisible) {
            this.showKeyboardOnResume = true;
        }
        ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 10);
        this.hideKeyboardRunnable = chatActivityEnterView$$ExternalSyntheticLambda4;
        AndroidUtilities.runOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4, 500L);
    }

    public final void onResume() {
        AnonymousClass50 anonymousClass50;
        this.isPaused = false;
        ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = this.hideKeyboardRunnable;
        if (chatActivityEnterView$$ExternalSyntheticLambda4 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4);
            this.hideKeyboardRunnable = null;
        }
        if (hasBotWebView() && botCommandsMenuIsShowing()) {
            return;
        }
        getVisibility();
        if (!this.showKeyboardOnResume || BaseFragment.hasSheets(this.parentFragment)) {
            return;
        }
        this.showKeyboardOnResume = false;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onKeyboardRequested();
        }
        if (this.searchingType == 0 && (anonymousClass50 = this.messageEditText) != null) {
            anonymousClass50.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.messageEditText);
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        AnonymousClass2 anonymousClass2 = this.openKeyboardRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
        AndroidUtilities.runOnUIThread(anonymousClass2, 100L);
    }

    public final boolean onSendLongClick(View view) {
        ChatActivity chatActivity;
        int measuredHeight;
        TLRPC.User currentUser;
        boolean z;
        float f;
        AnonymousClass50 anonymousClass50;
        MessagePreviewParams messagePreviewParams;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        boolean z2;
        ChatActivity.AnonymousClass62 anonymousClass62;
        boolean z3;
        MessagePreviewParams messagePreviewParams2;
        boolean z4;
        ItemOptions itemOptionsMakeOptions;
        boolean z5;
        boolean z6;
        int i;
        AnonymousClass50 anonymousClass51;
        int i2 = 12;
        boolean z7 = true;
        int i3 = 2;
        if (!isInScheduleMode() && (((chatActivity = this.parentFragment) == null || chatActivity.chatMode != 5) && !this.animatorEphemeralMessageVisibility.value)) {
            boolean z8 = this.isStories;
            AnonymousClass27 anonymousClass27 = this.sendButton;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z8 || !(((anonymousClass50 = this.messageEditText) != null && !TextUtils.isEmpty(anonymousClass50.getText())) || chatActivity == null || (messagePreviewParams = chatActivity.messagePreviewParams) == null || (messages = messagePreviewParams.forwardMessages) == null || (arrayList = messages.messages) == null || arrayList.isEmpty())) {
                boolean z9 = chatActivity != null && UserObject.isUserSelf(chatActivity.getCurrentUser());
                if (this.sendPopupLayout == null) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, this.parentActivity, resourcesProvider);
                    this.sendPopupLayout = actionBarPopupWindowLayout;
                    actionBarPopupWindowLayout.setAnimationEnabled(false);
                    this.sendPopupLayout.setOnTouchListener(new PhotoPickerActivity.AnonymousClass14(this));
                    this.sendPopupLayout.setDispatchKeyEventListener(new ChatActivityEnterView$$ExternalSyntheticLambda30(this));
                    this.sendPopupLayout.setShownFromBottom(false);
                    boolean z10 = chatActivity != null && chatActivity.canScheduleMessage();
                    boolean z11 = !z9 && (this.slowModeTimer <= 0 || isInScheduleMode());
                    if (z10) {
                        boolean z12 = !z11;
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, z12);
                        this.actionScheduleButton = actionBarMenuSubItem;
                        if (z9) {
                            f = 196.0f;
                            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.SetReminder), R.drawable.msg_calendar2, null);
                        } else {
                            f = 196.0f;
                            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ScheduleMessage), R.drawable.msg_calendar2, null);
                        }
                        this.actionScheduleButton.setMinimumWidth(AndroidUtilities.dp(f));
                        this.actionScheduleButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 14));
                        this.sendPopupLayout.linearLayout.addView(this.actionScheduleButton, LayoutHelper.createLinear(-1, 44));
                        SharedConfig.removeScheduledHint();
                        if (z9) {
                            z = true;
                        } else {
                            z = true;
                            if (this.dialog_id > 0) {
                                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, z12);
                                this.sendWhenOnlineButton = actionBarMenuSubItem2;
                                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.SendWhenOnline), R.drawable.msg_online, null);
                                this.sendWhenOnlineButton.setMinimumWidth(AndroidUtilities.dp(f));
                                this.sendWhenOnlineButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, i2));
                                this.sendPopupLayout.linearLayout.addView(this.sendWhenOnlineButton, LayoutHelper.createLinear(-1, 44));
                            }
                        }
                    } else {
                        z = true;
                        f = 196.0f;
                    }
                    if (z11) {
                        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, !z10, true);
                        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
                        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(f));
                        actionBarMenuSubItem3.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 13));
                        this.sendPopupLayout.linearLayout.addView(actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 44));
                    }
                    this.sendPopupLayout.setupRadialSelectors(getThemedColor$6(Theme.key_dialogButtonSelector));
                    AnonymousClass44 anonymousClass44 = new AnonymousClass44(this.sendPopupLayout);
                    this.sendPopupWindow = anonymousClass44;
                    anonymousClass44.animationEnabled = false;
                    anonymousClass44.setAnimationStyle(R.style.PopupContextAnimation2);
                    this.sendPopupWindow.setOutsideTouchable(z);
                    this.sendPopupWindow.setClippingEnabled(z);
                    this.sendPopupWindow.setInputMethodMode(2);
                    this.sendPopupWindow.setSoftInputMode(0);
                    this.sendPopupWindow.getContentView().setFocusableInTouchMode(z);
                    SharedConfig.removeScheduledOrNoSoundHint();
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
                    if (chatActivityEnterViewDelegate != null) {
                        chatActivityEnterViewDelegate.onSendLongClick();
                    }
                }
                ActionBarMenuSubItem actionBarMenuSubItem4 = this.actionScheduleButton;
                if (actionBarMenuSubItem4 != null) {
                    actionBarMenuSubItem4.setVisibility(this.voiceOnce ? 8 : 0);
                }
                if (this.sendWhenOnlineButton != null) {
                    currentUser = chatActivity != null ? chatActivity.getCurrentUser() : null;
                    if (currentUser == null || currentUser.bot) {
                        this.sendWhenOnlineButton.setVisibility(8);
                    } else {
                        TLRPC.UserStatus userStatus = currentUser.status;
                        if ((userStatus instanceof TLRPC.TL_userStatusEmpty) || (userStatus instanceof TLRPC.TL_userStatusOnline) || (userStatus instanceof TLRPC.TL_userStatusRecently) || (userStatus instanceof TLRPC.TL_userStatusLastMonth) || (userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                            this.sendWhenOnlineButton.setVisibility(8);
                        } else {
                            this.sendWhenOnlineButton.setVisibility(0);
                        }
                    }
                }
                this.sendPopupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                this.sendPopupWindow.setFocusable(true);
                int[] iArr = this.location;
                view.getLocationInWindow(iArr);
                if (this.keyboardVisible) {
                    int measuredHeight2 = getMeasuredHeight();
                    FrameLayout frameLayout = this.topView;
                    if (measuredHeight2 > AndroidUtilities.dp((frameLayout == null || frameLayout.getVisibility() != 0) ? 58.0f : 102.0f)) {
                        measuredHeight = view.getMeasuredHeight() + iArr[1];
                    } else {
                        measuredHeight = (iArr[1] - this.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
                    }
                } else {
                    measuredHeight = (iArr[1] - this.sendPopupLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
                }
                this.sendPopupWindow.showAtLocation(view, 51, AndroidUtilities.dp(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.sendPopupLayout.getMeasuredWidth()), measuredHeight);
                this.sendPopupWindow.dimBehind(0.2f);
                anonymousClass27.invalidate();
                try {
                    view.performHapticFeedback(3, 2);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }
            ChatAttachAlert.AnonymousClass25 anonymousClass25 = this.messageSendPreview;
            if (anonymousClass25 != null) {
                anonymousClass25.sent = false;
                anonymousClass25.dismiss();
            }
            AndroidUtilities.cancelRunOnUIThread(this.dismissSendPreview);
            ChatAttachAlert.AnonymousClass25 anonymousClass26 = new ChatAttachAlert.AnonymousClass25(this, getContext(), resourcesProvider);
            this.messageSendPreview = anonymousClass26;
            anonymousClass26.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(this, i2));
            boolean z13 = (this.audioToSendMessageObject == null && ((anonymousClass51 = this.messageEditText) == null || TextUtils.isEmpty(anonymousClass51.getText()))) ? false : true;
            ArrayList arrayList2 = new ArrayList();
            try {
                if (this.richDraftMessage != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialog_id);
                    z2 = z13;
                    tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                    tL_message.rich_message = this.richDraftMessage;
                    MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
                    MessageObject messageObject2 = this.replyingMessageObject;
                    if (messageObject2 != null && !messageObject2.isTopicMainMessage) {
                        messageObject.replyMessageObject = messageObject2;
                    }
                    messageObject.isOutOwnerCached = Boolean.TRUE;
                    messageObject.generateLayout(null);
                    messageObject.notime = true;
                    messageObject.sendPreview = true;
                    arrayList2.add(messageObject);
                } else {
                    z2 = z13;
                    if (this.audioToSend != null) {
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        tL_message2.id = 0;
                        tL_message2.out = true;
                        tL_message2.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialog_id);
                        tL_message2.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message2.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.voice = true;
                        tL_messageMediaDocument.document = this.audioToSend;
                        tL_message2.send_state = 1;
                        tL_message2.attachPath = this.audioToSendPath;
                        MessageObject messageObject3 = new MessageObject(this.currentAccount, tL_message2, false, true);
                        MessageObject messageObject4 = this.replyingMessageObject;
                        if (messageObject4 != null && !messageObject4.isTopicMainMessage) {
                            messageObject3.replyMessageObject = messageObject4;
                        }
                        messageObject3.isOutOwnerCached = Boolean.TRUE;
                        messageObject3.generateLayout(null);
                        messageObject3.notime = true;
                        messageObject3.sendPreview = true;
                        arrayList2.add(messageObject3);
                    } else {
                        if (!z2) {
                            if (chatActivity != null && (anonymousClass62 = chatActivity.instantCameraView) != null && anonymousClass62.getTextureView() != null) {
                                ChatAttachAlert.AnonymousClass25 anonymousClass28 = this.messageSendPreview;
                                TextureView textureView = chatActivity.instantCameraView.getTextureView();
                                anonymousClass28.getClass();
                                if (textureView != null) {
                                    anonymousClass28.cameraRect = new RectF();
                                    int[] iArr2 = new int[2];
                                    textureView.getLocationOnScreen(iArr2);
                                    RectF rectF = anonymousClass28.cameraRect;
                                    int i4 = iArr2[0];
                                    rectF.set(i4, iArr2[1], textureView.getWidth() + i4, textureView.getHeight() + iArr2[1]);
                                }
                                z3 = true;
                            }
                            this.messageSendPreview.setMessageObjects(arrayList2);
                            if (z2 && this.audioToSend == null) {
                                ChatAttachAlert.AnonymousClass25 anonymousClass29 = this.messageSendPreview;
                                AnonymousClass50 anonymousClass52 = this.messageEditText;
                                CallLogActivity$$ExternalSyntheticLambda3 callLogActivity$$ExternalSyntheticLambda3 = new CallLogActivity$$ExternalSyntheticLambda3(this, 21);
                                ChatActivityEnterView$$ExternalSyntheticLambda53 chatActivityEnterView$$ExternalSyntheticLambda53 = new ChatActivityEnterView$$ExternalSyntheticLambda53(this, i3);
                                anonymousClass29.editText = anonymousClass52;
                                anonymousClass29.drawEditText = callLogActivity$$ExternalSyntheticLambda3;
                                anonymousClass29.drawEditTextBackground = chatActivityEnterView$$ExternalSyntheticLambda53;
                            }
                            z4 = z2;
                            this.messageSendPreview.setSendButton(anonymousClass27, true, new LinkEditActivity$$ExternalSyntheticLambda5(i3, this, z4));
                            if ((z4 || z3) && this.dialog_id >= 0) {
                                this.messageSendPreview.allowEffectSelector(chatActivity);
                                this.messageSendPreview.setEffectId(this.effectId);
                            }
                            itemOptionsMakeOptions = ItemOptions.makeOptions(this, resourcesProvider, anonymousClass27);
                            if (chatActivity == null && UserObject.isUserSelf(chatActivity.getCurrentUser())) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (chatActivity == null && chatActivity.canScheduleMessage()) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5 || (this.slowModeTimer > 0 && !isInScheduleMode())) {
                                z7 = false;
                            }
                            if (z6) {
                                int i5 = R.drawable.msg_calendar2;
                                if (z5) {
                                    i = R.string.SetReminder;
                                } else {
                                    i = R.string.ScheduleMessage;
                                }
                                itemOptionsMakeOptions.add(i5, LocaleController.getString(i), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 21), false);
                                if (!z5 && this.dialog_id > 0) {
                                    itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 22), false);
                                    this.sendWhenOnlineButton = itemOptionsMakeOptions.getLast();
                                }
                            }
                            if (chatActivity != null && this.delegate != null && ChatObject.isMonoForum(chatActivity.currentChat)) {
                                itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 23), false);
                            }
                            if (z7) {
                                itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatActivityEnterView$$ExternalSyntheticLambda19(this, z4, i3), false);
                            }
                            itemOptionsMakeOptions.setupSelectors();
                            if (this.sendWhenOnlineButton != null) {
                                currentUser = chatActivity != null ? chatActivity.getCurrentUser() : null;
                                if (currentUser != null || currentUser.bot) {
                                    this.sendWhenOnlineButton.setVisibility(8);
                                } else {
                                    TLRPC.UserStatus userStatus2 = currentUser.status;
                                    if ((userStatus2 instanceof TLRPC.TL_userStatusEmpty) || (userStatus2 instanceof TLRPC.TL_userStatusOnline) || (userStatus2 instanceof TLRPC.TL_userStatusRecently) || (userStatus2 instanceof TLRPC.TL_userStatusLastMonth) || (userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                        this.sendWhenOnlineButton.setVisibility(8);
                                    } else {
                                        this.sendWhenOnlineButton.setVisibility(0);
                                    }
                                }
                            }
                            this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
                            this.messageSendPreview.show();
                            view.performHapticFeedback(3, 2);
                            return false;
                        }
                        TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                        tL_message3.id = 0;
                        tL_message3.out = true;
                        tL_message3.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(this.dialog_id);
                        tL_message3.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                        AnonymousClass50 anonymousClass53 = this.messageEditText;
                        CharSequence[] charSequenceArr = {new SpannableStringBuilder(anonymousClass53 == null ? "" : anonymousClass53.getTextToUse())};
                        MessageObject.addLinks(true, charSequenceArr[0]);
                        tL_message3.entities.addAll(MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true));
                        tL_message3.message = charSequenceArr[0].toString();
                        MessageObject messageObject5 = this.replyingMessageObject;
                        if (messageObject5 != null && !messageObject5.isTopicMainMessage) {
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            MessageObject messageObject6 = this.replyingTopMessage;
                            if (messageObject6 != null) {
                                tL_messageReplyHeader.flags |= 2;
                                tL_messageReplyHeader.reply_to_top_id = messageObject6.getId();
                            }
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = this.replyingMessageObject.getId();
                            tL_message3.reply_to = tL_messageReplyHeader;
                        }
                        if (this.messageWebPage != null) {
                            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                            tL_messageMediaWebPage.webpage = this.messageWebPage;
                            if (chatActivity != null && (messagePreviewParams2 = chatActivity.messagePreviewParams) != null && messagePreviewParams2.hasMedia) {
                                boolean z14 = messagePreviewParams2.webpageSmall;
                                tL_messageMediaWebPage.force_small_media = z14;
                                tL_messageMediaWebPage.force_large_media = !z14;
                                tL_message3.invert_media = messagePreviewParams2.webpageTop;
                            }
                            tL_message3.media = tL_messageMediaWebPage;
                        }
                        MessageObject messageObject7 = new MessageObject(this.currentAccount, tL_message3, false, false);
                        MessageObject messageObject8 = this.replyingMessageObject;
                        if (messageObject8 != null && !messageObject8.isTopicMainMessage) {
                            messageObject7.replyMessageObject = messageObject8;
                        }
                        messageObject7.sendPreview = true;
                        messageObject7.isOutOwnerCached = Boolean.TRUE;
                        messageObject7.type = 0;
                        messageObject7.generateLayout(null);
                        messageObject7.notime = true;
                        arrayList2.add(messageObject7);
                    }
                }
                view.performHapticFeedback(3, 2);
                return false;
            } catch (Exception unused2) {
            }
            z3 = false;
            this.messageSendPreview.setMessageObjects(arrayList2);
            if (z2) {
                ChatAttachAlert.AnonymousClass25 anonymousClass210 = this.messageSendPreview;
                AnonymousClass50 anonymousClass54 = this.messageEditText;
                CallLogActivity$$ExternalSyntheticLambda3 callLogActivity$$ExternalSyntheticLambda4 = new CallLogActivity$$ExternalSyntheticLambda3(this, 21);
                ChatActivityEnterView$$ExternalSyntheticLambda53 chatActivityEnterView$$ExternalSyntheticLambda54 = new ChatActivityEnterView$$ExternalSyntheticLambda53(this, i3);
                anonymousClass210.editText = anonymousClass54;
                anonymousClass210.drawEditText = callLogActivity$$ExternalSyntheticLambda4;
                anonymousClass210.drawEditTextBackground = chatActivityEnterView$$ExternalSyntheticLambda54;
            }
            z4 = z2;
            this.messageSendPreview.setSendButton(anonymousClass27, true, new LinkEditActivity$$ExternalSyntheticLambda5(i3, this, z4));
            if (z4) {
                this.messageSendPreview.allowEffectSelector(chatActivity);
                this.messageSendPreview.setEffectId(this.effectId);
            } else {
                this.messageSendPreview.allowEffectSelector(chatActivity);
                this.messageSendPreview.setEffectId(this.effectId);
            }
            itemOptionsMakeOptions = ItemOptions.makeOptions(this, resourcesProvider, anonymousClass27);
            if (chatActivity == null) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (chatActivity == null) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z6) {
                int i6 = R.drawable.msg_calendar2;
                if (z5) {
                    i = R.string.SetReminder;
                } else {
                    i = R.string.ScheduleMessage;
                }
                itemOptionsMakeOptions.add(i6, LocaleController.getString(i), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 21), false);
                if (!z5) {
                    itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 22), false);
                    this.sendWhenOnlineButton = itemOptionsMakeOptions.getLast();
                }
            }
            if (chatActivity != null) {
                itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 23), false);
            }
            if (z7) {
                itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatActivityEnterView$$ExternalSyntheticLambda19(this, z4, i3), false);
            }
            itemOptionsMakeOptions.setupSelectors();
            if (this.sendWhenOnlineButton != null) {
                if (chatActivity != null) {
                }
                if (currentUser != null) {
                    this.sendWhenOnlineButton.setVisibility(8);
                } else {
                    this.sendWhenOnlineButton.setVisibility(8);
                }
            }
            this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
            this.messageSendPreview.show();
        }
        return false;
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.stickersExpanded) {
            setSearchingTypeInternal(0, false);
            this.emojiView.closeSearch(-1L, false);
            setStickersExpanded(false, false, false, true);
        }
        VideoTimelineView videoTimelineView = this.videoTimelineView;
        if (videoTimelineView != null) {
            boolean zIsEmpty = videoTimelineView.keyframes.isEmpty();
            ArrayList arrayList = videoTimelineView.frames;
            if (zIsEmpty) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            VideoTimelineView.AnonymousClass1 anonymousClass1 = videoTimelineView.currentTask;
            if (anonymousClass1 != null) {
                anonymousClass1.cancel(true);
                videoTimelineView.currentTask = null;
            }
            videoTimelineView.invalidate();
        }
    }

    @Override
    public final void onStickerSelected(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, boolean z2, int i, int i2) {
        if (this.isLiveComment) {
            return;
        }
        ChatActivity.ReplyQuote replyQuote = this.replyingQuote;
        ChatActivity chatActivity = this.parentFragment;
        if (replyQuote != null && chatActivity != null && replyQuote.outdated) {
            chatActivity.showQuoteMessageUpdate();
            return;
        }
        if (!isInScheduleMode() || i != 0) {
            AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, this.dialog_id, 1, new ChatActivityEnterView$$ExternalSyntheticLambda88(this, document, str, sendAnimationData, z2, i, i2, obj, z), 0L);
            return;
        }
        AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, chatActivity.getDialogId(), -1L, 0, new ProfileActivity$$ExternalSyntheticLambda106(this, document, str, obj, sendAnimationData, z), null, this.resourcesProvider);
    }

    public final void onWindowSizeChanged() {
        int height = this.sizeNotifierLayout.getHeight();
        if (!this.keyboardVisible) {
            height -= this.emojiPadding;
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onWindowSizeChanged(height);
        }
        if (this.topView != null) {
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(72.0f);
            BoolAnimator boolAnimator = this.animatorTopViewVisibility;
            if (height < currentActionBarHeight) {
                if (this.allowShowTopView) {
                    this.allowShowTopView = false;
                    if (this.needShowTopView) {
                        boolAnimator.setValue(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.allowShowTopView) {
                return;
            }
            this.allowShowTopView = true;
            if (this.needShowTopView) {
                boolAnimator.setValue(true, false);
            }
        }
    }

    public void openKeyboard() {
        if ((hasBotWebView() && botCommandsMenuIsShowing()) || BaseFragment.hasSheets(this.parentFragment)) {
            return;
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onKeyboardRequested();
        }
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null || AndroidUtilities.showKeyboard(anonymousClass50)) {
            return;
        }
        this.messageEditText.clearFocus();
        this.messageEditText.requestFocus();
    }

    public final void openKeyboardInternal() {
        if (hasBotWebView() && botCommandsMenuIsShowing()) {
            return;
        }
        ChatActivity chatActivity = this.parentFragment;
        if (BaseFragment.hasSheets(chatActivity)) {
            return;
        }
        showPopup((AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || (chatActivity != null && chatActivity.isInBubbleMode()) || this.isPaused) ? 0 : 2, 0, true, true);
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onKeyboardRequested();
        }
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.requestFocus();
        }
        AndroidUtilities.showKeyboard(this.messageEditText);
        if (this.isPaused) {
            this.showKeyboardOnResume = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow) {
            return;
        }
        if (chatActivity == null || !chatActivity.isInBubbleMode()) {
            this.waitingForKeyboardOpen = true;
            AnonymousClass78 anonymousClass78 = this.emojiView;
            if (anonymousClass78 != null) {
                anonymousClass78.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            AnonymousClass2 anonymousClass2 = this.openKeyboardRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
            AndroidUtilities.runOnUIThread(anonymousClass2, 100L);
        }
    }

    public final void openRichEditor() {
        ChatActivity chatActivity;
        Editable spannableStringBuilder;
        RichEditor richEditor;
        if (this.messageEditText == null || (chatActivity = this.parentFragment) == null || !MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            return;
        }
        TL_iv.RichMessage richMessage = this.richDraftMessage;
        if (richMessage != null) {
            richEditor = new RichEditor(richMessage);
        } else {
            Editable text = this.messageEditText.getText();
            if (TextUtils.isEmpty(text) || TextUtils.indexOf((CharSequence) text, '`') < 0) {
                spannableStringBuilder = text;
            } else {
                try {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(text)};
                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                    if (entities == null || entities.isEmpty()) {
                        spannableStringBuilder = text;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0]);
                        MessageObject.addEntitiesToText(spannableStringBuilder, entities, false, false, false, false);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            richEditor = new RichEditor(spannableStringBuilder);
            if (spannableStringBuilder == text) {
                int selectionStart = this.messageEditText.getSelectionStart();
                int selectionEnd = this.messageEditText.getSelectionEnd();
                if (selectionStart < 0) {
                    selectionStart = this.messageEditText.length();
                }
                if (selectionEnd < 0) {
                    selectionEnd = selectionStart;
                }
                richEditor.initialSelectionStart = selectionStart;
                richEditor.initialSelectionEnd = selectionEnd;
            }
            richEditor.onClearedCallback = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 18);
        }
        richEditor.setResourceProvider(this.resourcesProvider);
        richEditor.chatActivity = chatActivity;
        richEditor.animateInputView = chatActivity.chatInputViewsContainer;
        richEditor.animateEnterView = chatActivity.chatActivityEnterView;
        richEditor.onSentCallback = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 19);
        chatActivity.presentFragment(richEditor);
    }

    public final void openRichEditorWithHtml(CharSequence charSequence, String str, CharSequence charSequence2) {
        ChatActivity chatActivity;
        if (this.messageEditText == null || (chatActivity = this.parentFragment) == null || !MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            return;
        }
        RichEditor richEditor = new RichEditor(str);
        richEditor.initialHtmlBefore = charSequence;
        richEditor.initialHtmlAfter = charSequence2;
        richEditor.setResourceProvider(this.resourcesProvider);
        richEditor.chatActivity = chatActivity;
        richEditor.animateInputView = chatActivity.chatInputViewsContainer;
        richEditor.animateEnterView = chatActivity.chatActivityEnterView;
        richEditor.onClearedCallback = new ChatActivityEnterView$$ExternalSyntheticLambda90(this, 3);
        richEditor.onSentCallback = new ChatActivityEnterView$$ExternalSyntheticLambda90(this, 4);
        chatActivity.presentFragment(richEditor);
    }

    public final void openWebViewMenu() {
        ChatActivityEnterView$$ExternalSyntheticLambda90 chatActivityEnterView$$ExternalSyntheticLambda90 = new ChatActivityEnterView$$ExternalSyntheticLambda90(this, 0);
        if (SharedPrefsHelper.isWebViewConfirmShown(this.currentAccount, this.dialog_id) || MessagesController.getInstance(this.currentAccount).whitelistedBots.contains(Long.valueOf(this.dialog_id))) {
            chatActivityEnterView$$ExternalSyntheticLambda90.run();
            return;
        }
        AlertsCreator.createBotLaunchAlert(this.parentFragment, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialog_id)), new ChatLinkActivity$$ExternalSyntheticLambda9(23, this, chatActivityEnterView$$ExternalSyntheticLambda90), new ChatActivityEnterView$$ExternalSyntheticLambda90(this, 1));
    }

    public final boolean panelAnimationInProgress() {
        return this.panelAnimation != null;
    }

    public boolean pannelAnimationEnabled() {
        return true;
    }

    public final void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.messageEditText == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.messageEditText.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
            }
            this.messageEditText.setText(spannableStringBuilder);
            this.messageEditText.setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void reset() {
        setStickersExpanded(false, true, false, true);
        showPopup(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.recordingAudioVideo = false;
        AnonymousClass25 anonymousClass25 = this.audioVideoSendButton;
        if (anonymousClass25 != null) {
            anonymousClass25.setVisibility(0);
        }
        this.recordIsCanceled = true;
        isRecordingStateChanged();
        cancelRecordInterfaceInternal();
        hideRecordedAudioPanelInternal();
        ControlsView controlsView = this.controlsView;
        if (controlsView != null) {
            controlsView.setVisibility(8);
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.setSendButtonInvisible();
        }
    }

    public final void saveRichDraft(TL_iv.RichMessage richMessage) {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            MediaDataController.getInstance(this.currentAccount).saveDraft(chatActivity.getDialogId(), chatActivity.computeDraftThreadId(chatActivity.replyingMessageObject), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void sendConvertedRichAsSimple(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.messageEditText == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        Emoji.replaceEmoji((CharSequence) spannableStringBuilder2, this.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr != null) {
            for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                animatedEmojiSpan.applyFontMetrics(this.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
            }
        }
        QuoteSpan.normalizeQuotes(spannableStringBuilder2);
        clearRichDraft();
        setFieldText(spannableStringBuilder2);
        sendMessageInternal(i, z, i2, true, 0L);
    }

    public boolean sendMessage() {
        if (this.richDraftActive && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            RichEditor.openConversionSheet(getContext(), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 24), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 25), this.resourcesProvider);
            return true;
        }
        if (!isInScheduleMode()) {
            return sendMessageInternal(0, true, 0, true, 0L);
        }
        AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, this.parentFragment.getDialogId(), -1L, 0, new AnonymousClass22(this, 1), null, this.resourcesProvider);
        return true;
    }

    public boolean sendMessageInternal(final int r35, final boolean r36, final int r37, boolean r38, long r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.sendMessageInternal(int, boolean, int, boolean, long):boolean");
    }

    public void setAdjustPanLayoutHelper(AdjustPanLayoutHelper adjustPanLayoutHelper) {
        this.adjustPanLayoutHelper = adjustPanLayoutHelper;
    }

    public final void setAllowStickersAndGifs(boolean z, boolean z2, boolean z3) {
        if ((this.allowStickers != z || this.allowGifs != z2) && this.emojiView != null) {
            if (this.emojiViewVisible && !z3) {
                this.removeEmojiViewAfterAnimation = true;
                hidePopup(false, false, true);
            } else if (z3) {
                openKeyboardInternal();
            }
        }
        this.allowAnimatedEmoji = true;
        this.allowStickers = z;
        this.allowGifs = z2;
        AnonymousClass78 anonymousClass78 = this.emojiView;
        if (anonymousClass78 != null) {
            anonymousClass78.setAllow(true, z, z2, true);
        }
        setEmojiButtonImage(false, !this.isPaused);
    }

    public void setAnimatedTop(int i) {
        this.animatedTop = i;
    }

    public final void setBirthdayHintText() {
        HintView2 hintView2 = this.birthdayHint;
        if (hintView2 == null) {
            return;
        }
        hintView2.setText(Emoji.replaceWithRestrictedEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBirthdayHint, UserObject.getFirstName(this.parentFragment.getCurrentUser()))), this.birthdayHint.getTextPaint().getFontMetricsInt(), new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 28)));
        HintView2 hintView3 = this.birthdayHint;
        hintView3.textMaxWidth = HintView2.cutInFancyHalf(hintView3.getText(), this.birthdayHint.getTextPaint());
    }

    public void setBotInfo(LongSparseArray longSparseArray) {
        setBotInfo(longSparseArray, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        setTranslationX(f);
        if (this.messageEditText != null) {
            this.messageTextTranslationX = f;
            updateMessageTextParams();
        }
        this.attachButton.setTranslationX(this.attachLayoutPaddingTranslationX + this.attachLayoutTranslationX + f);
        setTranslationX(f);
        AnonymousClass32 anonymousClass32 = this.botButton;
        if (anonymousClass32 != null) {
            anonymousClass32.setTranslationX(f);
        }
    }

    public void setButtons(MessageObject messageObject) {
        setButtons(messageObject, true, true);
    }

    public void setCaption(String str) {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.setCaption(str);
            checkSendButton(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        AnonymousClass78 anonymousClass78 = this.emojiView;
        if (anonymousClass78 != null) {
            anonymousClass78.setChatInfo(chatFull);
        }
        SlowModeBtn slowModeBtn = this.slowModeButton;
        if (slowModeBtn != null) {
            slowModeBtn.isPremiumMode = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chatFull);
            slowModeBtn.invalidate();
        }
        if (ChatObject.isIgnoredChatRestrictionsForBoosters(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public final void setCommand(MessageObject messageObject, String str, boolean z, boolean z2) {
        AnonymousClass50 anonymousClass50;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        String string;
        if (str == null || getVisibility() != 0 || (anonymousClass50 = this.messageEditText) == null) {
            return;
        }
        Object user = null;
        if (!z) {
            if (this.slowModeTimer > 0 && !isInScheduleMode()) {
                ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    SlowModeBtn slowModeBtn = this.slowModeButton;
                    chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn.textView.getText(), slowModeBtn, true);
                    return;
                }
                return;
            }
            TLRPC.User user2 = (messageObject == null || !DialogObject.isChatDialog(this.dialog_id)) ? null : this.accountInstance.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
            if ((this.botCount != 1 || z2) && user2 != null && user2.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(zzkc.m(str, "@", UserObject.getPublicUsername(user2)), this.dialog_id, this.replyingMessageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str, this.dialog_id, this.replyingMessageObject, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            ChatActivity chatActivity = this.parentFragment;
            sendMessageParamsOf.sendMessageChatArguments = chatActivity != null ? chatActivity.getMessageChatSendParams() : null;
            sendMessageParamsOf.effect_id = this.effectId;
            this.effectId = 0L;
            setEffect(0L);
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.delegate;
            if (chatActivityEnterViewDelegate2 != null) {
                sendMessageParamsOf.replyToStoryItem = chatActivityEnterViewDelegate2.getReplyToStory();
                sendMessageParamsOf.replyQuote = this.delegate.getReplyQuote();
            }
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            return;
        }
        String string2 = anonymousClass50.getText().toString();
        if (messageObject != null && DialogObject.isChatDialog(this.dialog_id)) {
            user = this.accountInstance.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.from_id.user_id));
        }
        ?? r1 = user;
        if ((this.botCount != 1 || z2) && r1 != 0 && r1.bot && !str.contains("@")) {
            StringBuilder sb = new StringBuilder();
            Locale locale2 = Locale.US;
            sb.append(str + "@" + UserObject.getPublicUsername(r1));
            sb.append(" ");
            sb.append(string2.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            string = sb.toString();
        } else {
            StringBuilder sbM = Log.m(str, " ");
            sbM.append(string2.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            string = sbM.toString();
        }
        this.ignoreTextChange = true;
        this.messageEditText.setText(string);
        AnonymousClass50 anonymousClass51 = this.messageEditText;
        anonymousClass51.setSelection(anonymousClass51.getText().length());
        this.ignoreTextChange = false;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate3 = this.delegate;
        if (chatActivityEnterViewDelegate3 != null) {
            chatActivityEnterViewDelegate3.onTextChanged(this.messageEditText.getText(), true, false);
        }
        if (this.keyboardVisible || this.currentPopupContentType != -1) {
            return;
        }
        openKeyboard();
    }

    public void setComposeShadowAlpha(float f) {
        this.composeShadowAlpha = f;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.mCustomWindowView = view;
        this.messageEditText.setWindowView(view);
    }

    public void setDelegate(ChatActivityEnterViewDelegate chatActivityEnterViewDelegate) {
        this.delegate = chatActivityEnterViewDelegate;
    }

    public final void setDialogId(int i, long j) {
        this.dialog_id = j;
        if (this.currentAccount != i) {
            this.notificationsLocker.unlock();
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
            int i2 = NotificationCenter.recordStarted;
            notificationCenter.removeObserver(this, i2);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.currentAccount);
            int i3 = NotificationCenter.recordPaused;
            notificationCenter2.removeObserver(this, i3);
            NotificationCenter notificationCenter3 = NotificationCenter.getInstance(this.currentAccount);
            int i4 = NotificationCenter.recordResumed;
            notificationCenter3.removeObserver(this, i4);
            NotificationCenter notificationCenter4 = NotificationCenter.getInstance(this.currentAccount);
            int i5 = NotificationCenter.recordStartError;
            notificationCenter4.removeObserver(this, i5);
            NotificationCenter notificationCenter5 = NotificationCenter.getInstance(this.currentAccount);
            int i6 = NotificationCenter.recordStopped;
            notificationCenter5.removeObserver(this, i6);
            NotificationCenter notificationCenter6 = NotificationCenter.getInstance(this.currentAccount);
            int i7 = NotificationCenter.recordProgressChanged;
            notificationCenter6.removeObserver(this, i7);
            NotificationCenter notificationCenter7 = NotificationCenter.getInstance(this.currentAccount);
            int i8 = NotificationCenter.closeChats;
            notificationCenter7.removeObserver(this, i8);
            NotificationCenter notificationCenter8 = NotificationCenter.getInstance(this.currentAccount);
            int i9 = NotificationCenter.audioDidSent;
            notificationCenter8.removeObserver(this, i9);
            NotificationCenter notificationCenter9 = NotificationCenter.getInstance(this.currentAccount);
            int i10 = NotificationCenter.audioRouteChanged;
            notificationCenter9.removeObserver(this, i10);
            NotificationCenter notificationCenter10 = NotificationCenter.getInstance(this.currentAccount);
            int i11 = NotificationCenter.messagePlayingProgressDidChanged;
            notificationCenter10.removeObserver(this, i11);
            NotificationCenter notificationCenter11 = NotificationCenter.getInstance(this.currentAccount);
            int i12 = NotificationCenter.featuredStickersDidLoad;
            notificationCenter11.removeObserver(this, i12);
            NotificationCenter notificationCenter12 = NotificationCenter.getInstance(this.currentAccount);
            int i13 = NotificationCenter.messageReceivedByServer2;
            notificationCenter12.removeObserver(this, i13);
            NotificationCenter notificationCenter13 = NotificationCenter.getInstance(this.currentAccount);
            int i14 = NotificationCenter.sendingMessagesChanged;
            notificationCenter13.removeObserver(this, i14);
            this.currentAccount = i;
            this.accountInstance = AccountInstance.getInstance(i);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i2);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i3);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i4);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i5);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i6);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i7);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i8);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i9);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i10);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i11);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i12);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i13);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, i14);
        }
        this.sendPlainEnabled = true;
        if (DialogObject.isChatDialog(this.dialog_id)) {
            this.sendPlainEnabled = ChatObject.canSendPlain(this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id)));
        }
        updateScheduleButton(false);
        updateGiftButton(false);
        checkRoundVideo();
        checkChannelRights();
        updateFieldHint(false);
        if (this.messageEditText != null) {
            ChatActivity chatActivity = this.parentFragment;
            updateSendAsButton(chatActivity != null && chatActivity.getFragmentBeginToShow());
        }
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.editingBusinessLink = tL_businessChatLink;
        updateFieldHint(false);
        if (this.editingBusinessLink != null) {
            createDoneButton(true);
            this.doneButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 6));
            this.doneButton.setContentDescription(LocaleController.getString(R.string.Done));
            this.doneButton.setVisibility(0);
            this.doneButton.setScaleX(0.1f);
            this.doneButton.setScaleY(0.1f);
            this.doneButton.setAlpha(0.0f);
            this.doneButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
            this.currentLimit = this.accountInstance.getMessagesController().getMaxMessageLength();
            AnonymousClass50 anonymousClass50 = this.messageEditText;
            TextPaint paint = anonymousClass50 != null ? anonymousClass50.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(AndroidUtilities.dp(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.editingBusinessLink.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(applyMessageEntities(arrayList, str, fontMetricsInt));
            }
            this.lastSavedBusinessLinkMessage = calculateBusinessLinkPresetMessage();
            setAllowStickersAndGifs(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.cancelBotButton.setVisibility(8);
            this.audioVideoButtonContainer.setVisibility(8);
            GLIconSettingsView gLIconSettingsView = this.attachLayout;
            if (gLIconSettingsView != null) {
                gLIconSettingsView.setVisibility(8);
            }
            VoIPFragment.AnonymousClass9 anonymousClass9 = this.attachButton;
            if (anonymousClass9 != null) {
                this.attachButtonAlpha = 0.0f;
                anonymousClass9.setAlpha(0.0f);
                anonymousClass9.setScaleX(0.5f);
                anonymousClass9.setScaleY(0.5f);
            }
            setVisibility(8);
            AnonymousClass29 anonymousClass29 = this.scheduledButton;
            if (anonymousClass29 != null) {
                anonymousClass29.setVisibility(8);
            }
        }
    }

    public final void setEditingMessageObject(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z) {
        float f;
        float f2;
        int i;
        CharSequence charSequence;
        CharSequence charSequenceApplyMessageEntities;
        int i2;
        boolean z2;
        if (this.audioToSend == null && this.videoToSendMessageObject == null && this.editingMessageObject != messageObject) {
            createMessageEditText();
            boolean z3 = this.editingMessageObject != null;
            this.editingMessageObject = messageObject;
            this.editingCaption = z;
            ImageView imageView = this.cancelBotButton;
            AnonymousClass15 anonymousClass15 = this.sendButtonContainer;
            GLIconSettingsView gLIconSettingsView = this.attachLayout;
            VoIPFragment.AnonymousClass9 anonymousClass9 = this.attachButton;
            AnonymousClass24 anonymousClass24 = this.audioVideoButtonContainer;
            if (messageObject != null) {
                this.captionAbove = groupedMessages != null ? groupedMessages.captionAbove : messageObject.messageOwner.invert_media;
                createDoneButton(false);
                this.doneButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 18));
                if (this.editingMessageObject.needResendWhenEdit()) {
                    long j = this.paidMessagesPrice;
                    if (j > 0) {
                        this.doneButton.setStarsPrice(1, j, true);
                        this.doneButton.setLayoutParams(LayoutHelper.createFrame(44, 44, 85));
                        this.doneButton.requestLayout();
                    } else {
                        this.doneButton.setStarsPrice(1, 0L, true);
                        this.doneButton.setLayoutParams(LayoutHelper.createFrame(44, 44, 85));
                        this.doneButton.requestLayout();
                    }
                } else {
                    this.doneButton.setStarsPrice(1, 0L, true);
                    this.doneButton.setLayoutParams(LayoutHelper.createFrame(44, 44, 85));
                    this.doneButton.requestLayout();
                }
                this.doneButton.setOnLongClickListener(new AIEditorAlert$$ExternalSyntheticLambda12(this, messageObject, groupedMessages, 1));
                this.doneButton.setVisibility(0);
                this.doneButton.setScaleX(0.1f);
                this.doneButton.setScaleY(0.1f);
                this.doneButton.setAlpha(0.0f);
                this.doneButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                if (z) {
                    this.currentLimit = this.accountInstance.getMessagesController().maxCaptionLength;
                    charSequence = this.editingMessageObject.caption;
                } else {
                    this.currentLimit = this.accountInstance.getMessagesController().getMaxMessageLength();
                    charSequence = this.editingMessageObject.messageText;
                }
                if (charSequence != null) {
                    AnonymousClass50 anonymousClass50 = this.messageEditText;
                    TextPaint paint = anonymousClass50 != null ? anonymousClass50.getPaint() : null;
                    if (paint == null) {
                        paint = new TextPaint();
                        paint.setTextSize(AndroidUtilities.dp(18.0f));
                    }
                    charSequenceApplyMessageEntities = applyMessageEntities(this.editingMessageObject.messageOwner.entities, charSequence, paint.getFontMetricsInt());
                } else {
                    charSequenceApplyMessageEntities = "";
                }
                if (this.draftMessage == null && !z3) {
                    AnonymousClass50 anonymousClass51 = this.messageEditText;
                    this.draftMessage = (anonymousClass51 == null || anonymousClass51.length() <= 0) ? null : this.messageEditText.getText();
                    this.draftSearchWebpage = this.messageWebPageSearch;
                }
                MessageObject messageObject2 = this.editingMessageObject;
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                this.messageWebPageSearch = !((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.manual) && ((i2 = messageObject2.type) == 0 || i2 == 19);
                if (this.keyboardVisible) {
                    ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9 = this.setTextFieldRunnable;
                    if (chatLinkActivity$$ExternalSyntheticLambda9 != null) {
                        AndroidUtilities.cancelRunOnUIThread(chatLinkActivity$$ExternalSyntheticLambda9);
                        this.setTextFieldRunnable = null;
                    }
                    setFieldText(charSequenceApplyMessageEntities);
                } else {
                    ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda10 = new ChatLinkActivity$$ExternalSyntheticLambda9(22, this, charSequenceApplyMessageEntities);
                    this.setTextFieldRunnable = chatLinkActivity$$ExternalSyntheticLambda10;
                    AndroidUtilities.runOnUIThread(chatLinkActivity$$ExternalSyntheticLambda10, 200L);
                }
                AnonymousClass50 anonymousClass52 = this.messageEditText;
                if (anonymousClass52 != null) {
                    anonymousClass52.requestFocus();
                }
                openKeyboard();
                AnonymousClass50 anonymousClass53 = this.messageEditText;
                if (anonymousClass53 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass53.getLayoutParams();
                    layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                    this.messageEditText.setLayoutParams(layoutParams);
                }
                AnonymousClass35 anonymousClass35 = this.recordedAudioPanel;
                if (anonymousClass35 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anonymousClass35.getLayoutParams();
                    z2 = false;
                    layoutParams2.rightMargin = 0;
                    this.recordedAudioPanel.setLayoutParams(layoutParams2);
                } else {
                    z2 = false;
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z2);
                imageView.setVisibility(8);
                anonymousClass24.setVisibility(8);
                gLIconSettingsView.setVisibility(8);
                if (anonymousClass9 != null) {
                    this.attachButtonAlpha = 0.0f;
                    anonymousClass9.setAlpha(0.0f);
                    anonymousClass9.setScaleX(0.5f);
                    anonymousClass9.setScaleY(0.5f);
                }
                anonymousClass15.setVisibility(8);
                AnonymousClass29 anonymousClass29 = this.scheduledButton;
                if (anonymousClass29 != null) {
                    anonymousClass29.setVisibility(8);
                }
            } else {
                ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda11 = this.setTextFieldRunnable;
                if (chatLinkActivity$$ExternalSyntheticLambda11 != null) {
                    AndroidUtilities.cancelRunOnUIThread(chatLinkActivity$$ExternalSyntheticLambda11);
                    this.setTextFieldRunnable = null;
                }
                RichEditor.AnonymousClass9 anonymousClass10 = this.doneButton;
                if (anonymousClass10 != null) {
                    anonymousClass10.setVisibility(8);
                }
                this.currentLimit = -1;
                this.delegate.onMessageEditEnd();
                anonymousClass15.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i3 = this.slowModeTimer;
                SlowModeBtn slowModeBtn = this.slowModeButton;
                if (i3 <= 0 || isInScheduleMode()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    slowModeBtn.setScaleX(0.1f);
                    slowModeBtn.setScaleY(0.1f);
                    slowModeBtn.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f = 1.0f;
                    gLIconSettingsView.setScaleX(1.0f);
                    this.attachLayoutAlpha = 1.0f;
                    updateAttachLayoutParams();
                    gLIconSettingsView.setVisibility(0);
                    if (anonymousClass9 != null) {
                        this.attachButtonAlpha = 1.0f;
                        anonymousClass9.setAlpha(1.0f);
                        anonymousClass9.setScaleX(1.0f);
                        anonymousClass9.setScaleY(1.0f);
                    }
                    anonymousClass24.setScaleX(1.0f);
                    anonymousClass24.setScaleY(1.0f);
                    anonymousClass24.setAlpha(1.0f);
                    anonymousClass24.setVisibility(0);
                } else {
                    if (this.slowModeTimer == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        slowModeBtn.setScaleX(0.1f);
                        slowModeBtn.setScaleY(0.1f);
                        f2 = 0.0f;
                        slowModeBtn.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i = 8;
                    } else {
                        f2 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i = 8;
                        getSendButtonInternal().setVisibility(8);
                        slowModeBtn.setScaleX(1.0f);
                        slowModeBtn.setScaleY(1.0f);
                        slowModeBtn.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    gLIconSettingsView.setScaleX(0.01f);
                    this.attachLayoutAlpha = f2;
                    updateAttachLayoutParams();
                    gLIconSettingsView.setVisibility(i);
                    if (anonymousClass9 != null) {
                        this.attachButtonAlpha = f2;
                        anonymousClass9.setAlpha(f2);
                        anonymousClass9.setScaleX(0.5f);
                        anonymousClass9.setScaleY(0.5f);
                    }
                    anonymousClass24.setScaleX(0.1f);
                    anonymousClass24.setScaleY(0.1f);
                    anonymousClass24.setAlpha(f2);
                    anonymousClass24.setVisibility(i);
                    f = 1.0f;
                }
                createScheduledButton();
                AnonymousClass29 anonymousClass210 = this.scheduledButton;
                if (anonymousClass210 != null && anonymousClass210.getTag() != null) {
                    this.scheduledButton.setScaleX(f);
                    this.scheduledButton.setScaleY(f);
                    this.scheduledButton.setAlpha(f);
                    this.scheduledButton.setVisibility(0);
                }
                ChatActivity chatActivity = this.parentFragment;
                if (chatActivity != null) {
                    chatActivity.editingMessageObject = null;
                    chatActivity.foundWebPage = null;
                    MessagePreviewParams messagePreviewParams = chatActivity.messagePreviewParams;
                    if (messagePreviewParams != null) {
                        messagePreviewParams.updateLink(this.currentAccount, null, "", null, null, null);
                    }
                    this.messageWebPage = null;
                    this.messageWebPageSearch = true;
                    chatActivity.fallbackFieldPanel();
                }
                createMessageEditText();
                AnonymousClass50 anonymousClass54 = this.messageEditText;
                if (anonymousClass54 != null) {
                    anonymousClass54.setText(this.draftMessage);
                    AnonymousClass50 anonymousClass55 = this.messageEditText;
                    anonymousClass55.setSelection(anonymousClass55.length());
                }
                this.draftMessage = null;
                this.messageWebPageSearch = this.draftSearchWebpage;
                if (getVisibility() == 0) {
                    this.delegate.onAttachButtonShow();
                }
                updateFieldRight(1);
            }
            updateFieldHint(true);
            updateSendAsButton(true);
            updateButtons();
            updateRichDraftPreview();
        }
    }

    public void setEffectId(long j) {
        this.effectId = j;
        AnonymousClass27 anonymousClass27 = this.sendButton;
        if (anonymousClass27 != null) {
            anonymousClass27.setEffect(j);
        }
    }

    public final void setEmojiButtonImage(boolean z, boolean z2) {
        ChatActivityEnterViewAnimatedIconView.State state;
        AnonymousClass50 anonymousClass50;
        AnonymousClass35 anonymousClass35;
        AnonymousClass17 anonymousClass17 = this.emojiButton;
        if (anonymousClass17 == null) {
            return;
        }
        if (this.recordInterfaceState == 1 || ((anonymousClass35 = this.recordedAudioPanel) != null && anonymousClass35.getVisibility() == 0)) {
            this.emojiButtonScale = 0.0f;
            this.emojiButtonAlpha = 0.0f;
            updateEmojiButtonParams();
            z2 = false;
        }
        ChatActivityEnterViewAnimatedIconView.State state2 = ChatActivityEnterViewAnimatedIconView.State.GIF;
        ChatActivityEnterViewAnimatedIconView.State state3 = ChatActivityEnterViewAnimatedIconView.State.SMILE;
        if (!z || this.currentPopupContentType != 0) {
            AnonymousClass78 anonymousClass78 = this.emojiView;
            int i = anonymousClass78 == null ? MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0) : anonymousClass78.getCurrentPage();
            state = (i == 0 || !((this.allowStickers || this.allowGifs) && ((anonymousClass50 = this.messageEditText) == null || TextUtils.isEmpty(anonymousClass50.getText())))) ? state3 : i == 1 ? ChatActivityEnterViewAnimatedIconView.State.STICKER : state2;
        } else if (!this.sendPlainEnabled) {
            return;
        } else {
            state = ChatActivityEnterViewAnimatedIconView.State.KEYBOARD;
        }
        if (!this.sendPlainEnabled && state == state3) {
            state3 = state2;
        } else if (this.stickersEnabled || state == state3) {
            state3 = state;
        }
        anonymousClass17.setState(state3, z2);
        if (state3 == state2 && this.emojiView == null) {
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
            ArrayList<String> arrayList = MessagesController.getInstance(this.currentAccount).gifSearchEmojies;
            int iMin = Math.min(10, arrayList.size());
            for (int i2 = 0; i2 < iMin; i2++) {
                Emoji.preloadEmoji(arrayList.get(i2));
            }
        }
    }

    public void setExitTransition(float f) {
        this.exitTransition = f;
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public final void setFieldFocused() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.parentActivity.getSystemService("accessibility");
        if (this.messageEditText == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.messageEditText.requestFocus();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        setFieldText(charSequence, false);
    }

    public void setInAppInsetsController(WindowInsetsInAppController windowInsetsInAppController) {
        this.windowInsetsInAppController = windowInsetsInAppController;
    }

    public final void setLiveComment(boolean z) {
        if (this.isLiveComment == z) {
            return;
        }
        this.isLiveComment = z;
        this.attachButton.setVisibility(z ? 8 : 0);
        if (z) {
            AndroidUtilities.removeFromParent(this.notifyButton);
        }
        if (z) {
            setVisibility(8);
        } else {
            reset();
        }
        if (!z) {
            this.currentLimit = -1;
            NumberTextView numberTextView = this.captionLimitView;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        updateFieldRight(this.lastAttachVisible);
        checkSendButton(false);
    }

    public void setLockAnimatedTranslation(float f) {
        this.lockAnimatedTranslation = f;
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new ChatActivityEnterView$$ExternalSyntheticLambda7(this, 1);
        }
        setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        this.overrideHint = charSequence;
        this.overrideHint2 = null;
        updateFieldHint(false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.overrideKeyboardAnimation = z;
    }

    public final void setRecordVideoButtonVisible(boolean z, boolean z2) {
        AnonymousClass25 anonymousClass25 = this.audioVideoSendButton;
        if (anonymousClass25 == null) {
            return;
        }
        this.isInVideoMode = z;
        if (z2) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z3 = false;
            if (DialogObject.isChatDialog(this.dialog_id)) {
                TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    z3 = true;
                }
            }
            globalMainSettings.edit().putBoolean(z3 ? "currentModeVideoChannel" : "currentModeVideo", z).apply();
        }
        anonymousClass25.setState(this.isInVideoMode ? ChatActivityEnterViewAnimatedIconView.State.VIDEO : ChatActivityEnterViewAnimatedIconView.State.VOICE, z2);
        anonymousClass25.setContentDescription(LocaleController.getString(this.isInVideoMode ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        this.audioVideoButtonContainer.setContentDescription(LocaleController.getString(this.isInVideoMode ? R.string.AccDescrVideoMessage : R.string.AccDescrVoiceMessage));
        anonymousClass25.sendAccessibilityEvent(8);
    }

    public final void setReplyingMessageObject(MessageObject messageObject, ChatActivity.ReplyQuote replyQuote, MessageObject messageObject2) {
        MessageObject messageObject3;
        ChatActivity chatActivity = this.parentFragment;
        boolean z = (chatActivity == null || !chatActivity.isForumInViewAsMessagesMode() || this.replyingTopMessage == messageObject2) ? false : true;
        if (messageObject != null) {
            if (this.botMessageObject == null && (messageObject3 = this.botButtonsMessageObject) != this.replyingMessageObject) {
                this.botMessageObject = messageObject3;
            }
            this.replyingMessageObject = messageObject;
            this.replyingQuote = replyQuote;
            this.replyingTopMessage = messageObject2;
            if (chatActivity == null || !chatActivity.isTopic || chatActivity.threadMessageObject != messageObject) {
                setButtons(messageObject, true, true);
            }
        } else if (this.replyingMessageObject == this.botButtonsMessageObject) {
            this.replyingMessageObject = null;
            this.replyingTopMessage = null;
            this.replyingQuote = null;
            setButtons(this.botMessageObject, true, false);
            this.botMessageObject = null;
        } else {
            this.replyingMessageObject = null;
            this.replyingQuote = null;
            this.replyingTopMessage = null;
        }
        checkIsEphemeralMessage(true);
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        MediaController.getInstance().setReplyingMessage(messageObject, getThreadMessage(), chatActivityEnterViewDelegate != null ? chatActivityEnterViewDelegate.getReplyToStory() : null);
        updateFieldHint(z);
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.richDraftPreview == null) {
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAvailable()) {
            richMessage = null;
        }
        this.richDraftMessage = richMessage;
        updateRichDraftPreview();
    }

    public final void setSearchingTypeInternal(int i, boolean z) {
        int i2 = 4;
        boolean z2 = i != 0;
        if (z2 != (this.searchingType != 0)) {
            ValueAnimator valueAnimator = this.searchAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.searchAnimator.cancel();
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchToOpenProgress, z2 ? 1.0f : 0.0f);
                this.searchAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ChatActivityEnterView$$ExternalSyntheticLambda3(this, i2));
                this.searchAnimator.addListener(new AnonymousClass31(this, z2, i2));
                this.searchAnimator.setDuration(220L);
                this.searchAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.searchAnimator.start();
            } else {
                this.searchToOpenProgress = z2 ? 1.0f : 0.0f;
                AnonymousClass78 anonymousClass78 = this.emojiView;
                if (anonymousClass78 != null) {
                    anonymousClass78.updateStickerTabsPosition();
                }
            }
        }
        this.searchingType = i;
    }

    public void setSelection(int i) {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null) {
            return;
        }
        anonymousClass50.setSelection(i, anonymousClass50.length());
    }

    public void setSideButtonsForAttach(ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout) {
        this.sideButtons = chatActivitySideControlsButtonsLayout;
    }

    public void setSlideToCancelProgress(float f) {
        this.slideToCancelProgress = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > AndroidUtilities.dp(140.0f)) {
            measuredWidth = AndroidUtilities.dp(140.0f);
        }
        this.slideDelta = (int) ((1.0f - this.slideToCancelProgress) * (-measuredWidth));
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i) {
        this.slowModeTimer = i;
        updateSlowModeText();
    }

    public void setSnapAnimationProgress(float f) {
        this.snapAnimationProgress = f;
        invalidate();
    }

    public final void setStickersExpanded(boolean z, boolean z2, boolean z3, boolean z4) {
        float f;
        char c;
        final int i = 0;
        final int i2 = 1;
        AdjustPanLayoutHelper adjustPanLayoutHelper = this.adjustPanLayoutHelper;
        if ((adjustPanLayoutHelper != null && adjustPanLayoutHelper.animationInProgress) || this.waitingForKeyboardOpenAfterAnimation || this.emojiView == null) {
            return;
        }
        if (z3 || this.stickersExpanded != z) {
            this.stickersExpanded = z;
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onStickersExpandedChange();
            }
            Point point = AndroidUtilities.displaySize;
            final int i3 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            AnimatorSet animatorSet = this.stickersExpansionAnim;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.stickersExpansionAnim = null;
            }
            boolean z5 = this.stickersExpanded;
            AnimationNotificationsLocker animationNotificationsLocker = this.notificationsLocker;
            PhotoViewer.AnonymousClass13 anonymousClass13 = this.roundedTranslationYProperty;
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
            if (z5) {
                if (z4) {
                    f = 1.0f;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
                } else {
                    f = 1.0f;
                }
                int height = sizeNotifierFrameLayout.getHeight();
                this.originalViewHeight = height;
                int iDp = ((((height - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - ActionBar.getCurrentActionBarHeight()) - getHeight();
                this.stickersExpandedHeight = iDp;
                if (this.searchingType == 2) {
                    this.stickersExpandedHeight = Math.min(iDp, AndroidUtilities.dp(175.0f) + i3);
                }
                if (this.windowInsetsInAppController == null) {
                    this.emojiView.getLayoutParams().height = this.stickersExpandedHeight;
                }
                sizeNotifierFrameLayout.requestLayout();
                if (this.shouldDrawBackground) {
                    sizeNotifierFrameLayout.setForeground(new CanvasButton.AnonymousClass2(this));
                }
                AnonymousClass50 anonymousClass50 = this.messageEditText;
                if (anonymousClass50 != null) {
                    int selectionStart = anonymousClass50.getSelectionStart();
                    int selectionEnd = this.messageEditText.getSelectionEnd();
                    AnonymousClass50 anonymousClass51 = this.messageEditText;
                    c = 2;
                    anonymousClass51.setText(anonymousClass51.getText());
                    this.messageEditText.setSelection(selectionStart, selectionEnd);
                } else {
                    c = 2;
                }
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.windowInsetsInAppController != null) {
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-(this.stickersExpandedHeight - i3));
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(-(this.stickersExpandedHeight - i3));
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", f);
                        Animator[] animatorArr = new Animator[3];
                        animatorArr[0] = valueAnimatorOfInt;
                        animatorArr[1] = valueAnimatorOfInt2;
                        animatorArr[c] = objectAnimatorOfFloat;
                        animatorSet2.playTogether(animatorArr);
                    } else {
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, anonymousClass13, -(this.stickersExpandedHeight - i3));
                        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.emojiView, anonymousClass13, -(this.stickersExpandedHeight - i3));
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", f);
                        Animator[] animatorArr2 = new Animator[3];
                        animatorArr2[0] = objectAnimatorOfInt;
                        animatorArr2[1] = objectAnimatorOfInt2;
                        animatorArr2[c] = objectAnimatorOfFloat2;
                        animatorSet2.playTogether(animatorArr2);
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    if (this.windowInsetsInAppController == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ChatActivityEnterView f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView = this.f$0;
                                        chatActivityEnterView.stickersExpansionProgress = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.stickersExpandedHeight - i3)));
                                        chatActivityEnterView.sizeNotifierLayout.invalidate();
                                        break;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                                        chatActivityEnterView2.stickersExpansionProgress = chatActivityEnterView2.getTranslationY() / (-(chatActivityEnterView2.stickersExpandedHeight - i3));
                                        chatActivityEnterView2.sizeNotifierLayout.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new AnonymousClass28(this, 14));
                    this.stickersExpansionAnim = animatorSet2;
                    this.emojiView.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    this.stickersExpansionProgress = 0.0f;
                    sizeNotifierFrameLayout.invalidate();
                    animatorSet2.start();
                } else {
                    this.stickersExpansionProgress = 1.0f;
                    if (this.windowInsetsInAppController == null) {
                        setTranslationY(-(this.stickersExpandedHeight - i3));
                        this.emojiView.setTranslationY(-(this.stickersExpandedHeight - i3));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.stickersArrow;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.animProgress = 1.0f;
                        animatedArrowDrawable.animateToProgress = 1.0f;
                        animatedArrowDrawable.updatePath();
                        animatedArrowDrawable.invalidateSelf();
                    }
                }
                WindowInsetsInAppController windowInsetsInAppController = this.windowInsetsInAppController;
                if (windowInsetsInAppController != null) {
                    int i4 = this.stickersExpandedHeight;
                    if (i4 > 0) {
                        int i5 = i4 + AndroidUtilities.navigationBarHeight;
                        WindowInsetsStateHolder windowInsetsStateHolder = (WindowInsetsStateHolder) windowInsetsInAppController;
                        if (windowInsetsStateHolder.inAppKeyboardHeight != i5 || windowInsetsStateHolder.inAppKeyboardState != 0) {
                            AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder.closeInAppKeyboard);
                            windowInsetsStateHolder.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder.inAppKeyboardHeight, i5);
                            windowInsetsStateHolder.inAppKeyboardHeight = i5;
                            windowInsetsStateHolder.inAppKeyboardState = 0;
                            windowInsetsStateHolder.setInsets(windowInsetsStateHolder.lastInsets);
                        }
                    } else {
                        ((WindowInsetsStateHolder) windowInsetsInAppController).resetInAppKeyboardHeight(true);
                    }
                }
            } else {
                if (z4) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 1);
                }
                if (z2) {
                    this.closeAnimationInProgress = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.windowInsetsInAppController != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, anonymousClass13, 0), ObjectAnimator.ofInt(this.emojiView, anonymousClass13, 0), ObjectAnimator.ofFloat(this.stickersArrow, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    if (this.windowInsetsInAppController == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ChatActivityEnterView f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i2) {
                                    case 0:
                                        ChatActivityEnterView chatActivityEnterView = this.f$0;
                                        chatActivityEnterView.stickersExpansionProgress = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.stickersExpandedHeight - i3)));
                                        chatActivityEnterView.sizeNotifierLayout.invalidate();
                                        break;
                                    default:
                                        ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                                        chatActivityEnterView2.stickersExpansionProgress = chatActivityEnterView2.getTranslationY() / (-(chatActivityEnterView2.stickersExpandedHeight - i3));
                                        chatActivityEnterView2.sizeNotifierLayout.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new AnonymousClass70(this, i3, 2));
                    this.stickersExpansionProgress = 1.0f;
                    sizeNotifierFrameLayout.invalidate();
                    this.stickersExpansionAnim = animatorSet3;
                    this.emojiView.setLayerType(2, null);
                    animationNotificationsLocker.lock();
                    animatorSet3.start();
                } else {
                    this.stickersExpansionProgress = 0.0f;
                    if (this.windowInsetsInAppController == null) {
                        setTranslationY(0.0f);
                        this.emojiView.setTranslationY(0.0f);
                        this.emojiView.getLayoutParams().height = i3;
                    }
                    sizeNotifierFrameLayout.requestLayout();
                    sizeNotifierFrameLayout.setForeground(null);
                    sizeNotifierFrameLayout.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.stickersArrow;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.animProgress = 0.0f;
                        animatedArrowDrawable2.animateToProgress = 0.0f;
                        animatedArrowDrawable2.updatePath();
                        animatedArrowDrawable2.invalidateSelf();
                    }
                }
                WindowInsetsInAppController windowInsetsInAppController2 = this.windowInsetsInAppController;
                if (windowInsetsInAppController2 != null) {
                    if (i3 > 0) {
                        int i6 = i3 + AndroidUtilities.navigationBarHeight;
                        WindowInsetsStateHolder windowInsetsStateHolder2 = (WindowInsetsStateHolder) windowInsetsInAppController2;
                        if (windowInsetsStateHolder2.inAppKeyboardHeight != i6 || windowInsetsStateHolder2.inAppKeyboardState != 0) {
                            AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder2.closeInAppKeyboard);
                            windowInsetsStateHolder2.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder2.inAppKeyboardHeight, i6);
                            windowInsetsStateHolder2.inAppKeyboardHeight = i6;
                            windowInsetsStateHolder2.inAppKeyboardState = 0;
                            windowInsetsStateHolder2.setInsets(windowInsetsStateHolder2.lastInsets);
                        }
                    } else {
                        ((WindowInsetsStateHolder) windowInsetsInAppController2).resetInAppKeyboardHeight(true);
                    }
                }
            }
            AnonymousClass34 anonymousClass34 = this.expandStickersButton;
            if (anonymousClass34 != null) {
                if (this.stickersExpanded) {
                    anonymousClass34.setContentDescription(LocaleController.getString("AccDescrCollapsePanel", R.string.AccDescrCollapsePanel));
                } else {
                    anonymousClass34.setContentDescription(LocaleController.getString("AccDescrExpandPanel", R.string.AccDescrExpandPanel));
                }
            }
        }
    }

    public final void setSuggestionButtonVisible(boolean z, boolean z2) {
        int i = 0;
        if (this.suggestButtonVisible == z && z2) {
            return;
        }
        ImageView imageView = this.suggestButton;
        if (imageView == null) {
            if (!z && !this.isLiveComment) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.suggestButton = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.suggestButton.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(Theme.key_glass_defaultIcon), PorterDuff.Mode.MULTIPLY));
                this.suggestButton.setImageResource(R.drawable.input_suggest_paid_24);
                this.suggestButton.setBackground(Theme.createSelectorDrawable(getThemedColor$6(Theme.key_listSelector), 1, -1));
                if (this.isLiveComment) {
                    this.suggestButton.setTranslationX(AndroidUtilities.dp(42.0f));
                    addView(this.suggestButton, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.attachLayout.addView(this.suggestButton, 0, LayoutHelper.createLinear(44, 44));
                }
                this.suggestButton.setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 20));
                this.suggestButton.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
            }
        }
        boolean z3 = this.suggestButtonVisible != z;
        this.suggestButtonVisible = z;
        float f = z ? 1.0f : 0.6f;
        float f2 = z ? 1.0f : 0.0f;
        this.suggestButton.setEnabled(z);
        this.suggestButton.setClickable(z);
        ValueAnimator valueAnimator = this.suggestButtonAppear;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.suggestButtonAppear = null;
        }
        if (z2) {
            if (this.isLiveComment) {
                this.suggestButton.setVisibility(0);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.suggestButton.getAlpha(), f2);
            this.suggestButtonAppear = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatActivityEnterView$$ExternalSyntheticLambda3(this, 7));
            this.suggestButtonAppear.addListener(new AnonymousClass31(this, z, i));
            this.suggestButtonAppear.setDuration(220L);
            this.suggestButtonAppear.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.suggestButtonAppear.start();
        } else {
            this.suggestButton.setScaleX(f);
            this.suggestButton.setScaleY(f);
            this.suggestButton.setAlpha(f2);
            if (this.isLiveComment) {
                this.suggestButton.setVisibility(z ? 0 : 8);
            }
        }
        updateFieldRight(this.lastAttachVisible);
        if (z3) {
            checkSendButton(true);
        }
    }

    public void setTextTransitionIsRunning(boolean z) {
        this.textTransitionIsRunning = z;
        invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.viewParentForEmojiView = viewGroup;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        this.messageEditTextEnabled = z;
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.setEnabled(z);
        }
    }

    public void setVoiceDraft(MediaDataController.DraftVoice draftVoice) {
        if (draftVoice == null) {
            return;
        }
        boolean z = draftVoice.once;
        this.voiceOnce = z;
        ControlsView controlsView = this.controlsView;
        if (controlsView != null) {
            controlsView.periodDrawable.setValue(1, z, true);
        }
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        TL_stories.StoryItem replyToStory = chatActivityEnterViewDelegate != null ? chatActivityEnterViewDelegate.getReplyToStory() : null;
        MediaController mediaController = MediaController.getInstance();
        int i = this.currentAccount;
        long j = this.dialog_id;
        MessageObject messageObject = this.replyingMessageObject;
        MessageObject threadMessage = getThreadMessage();
        SendMessageChatArguments messageChatSendParams = null;
        int i2 = this.recordingGuid;
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null) {
            messageChatSendParams = chatActivity.getMessageChatSendParams();
        }
        mediaController.prepareResumedRecording(i, draftVoice, j, messageObject, threadMessage, replyToStory, i2, messageChatSendParams, getSendMonoForumPeerId(), getSendMessageSuggestionParams());
    }

    public final void showAiButton(boolean z) {
        ChatActivity chatActivity;
        boolean z2 = ((!z && !this.richDraftActive) || (chatActivity = this.parentFragment) == null || chatActivity.isSecretChat()) ? false : true;
        if (this.shownAiButton == z2) {
            return;
        }
        if (z2) {
            MessagesController.getInstance(this.currentAccount).getTonesController().load();
        }
        this.shownAiButton = z2;
        ImageView imageView = this.aiButton;
        imageView.setVisibility(0);
        imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new ChatActivityEnterView$$ExternalSyntheticLambda19(this, z2, 0)).start();
        if (!z2) {
            HintView2 hintView2 = this.aiHint;
            if (hintView2 != null) {
                hintView2.hide(true);
                this.aiHint = null;
                return;
            }
            return;
        }
        AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
        Objects.requireNonNull(aiButtonDrawable);
        imageView.postDelayed(new AiButtonDrawable$$ExternalSyntheticLambda0(aiButtonDrawable, 1), 220L);
        HintView2 hintView3 = this.aiHint;
        if (hintView3 != null) {
            hintView3.hide(true);
            this.aiHint = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            HintView2 hintView4 = new HintView2(getContext(), 3);
            this.aiHint = hintView4;
            hintView4.setMultilineText(true);
            this.aiHint.setText(LocaleController.getString(R.string.AIEditorHint));
            this.aiHint.setJointPx(0.0f, (imageView.getWidth() / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.aiHint, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            HintView2 hintView5 = this.aiHint;
            hintView5.onHidden = new ChatLinkActivity$$ExternalSyntheticLambda9(21, this, hintView4);
            hintView5.duration = 4000L;
            hintView5.show();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final void showCaptionLimitBulletin() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || !ChatObject.isChannelAndNotMegaGroup(chatActivity.currentChat)) {
            return;
        }
        BulletinFactory.of(chatActivity).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 3)).show();
    }

    public boolean showConfirmAlert(Runnable runnable) {
        return false;
    }

    public final void showPopup(int i, int i2, boolean z, boolean z2) {
        float f;
        int measuredHeight;
        View view;
        int measuredHeight2;
        int i3 = 12;
        int i4 = 1;
        boolean z3 = false;
        if (i == 2) {
            return;
        }
        AnimationNotificationsLocker animationNotificationsLocker = this.notificationsLocker;
        AnonymousClass2 anonymousClass2 = this.runEmojiPanelAnimation;
        Property property = View.TRANSLATION_Y;
        if (i == 1) {
            if (i2 == 0) {
                f = 0.0f;
                if (this.parentActivity == null && this.emojiView == null) {
                    return;
                } else {
                    createEmojiView();
                }
            } else {
                f = 0.0f;
            }
            if (i2 == 0) {
                if (this.emojiView.getParent() == null) {
                    if (this.windowInsetsInAppController == null) {
                        this.viewParentForEmojiView.addView(this.emojiView);
                    } else {
                        this.viewParentForEmojiView.addView(this.emojiView, LayoutHelper.createFrame(-1.0f, -1));
                    }
                }
                if (this.emojiViewVisible) {
                    this.emojiView.getVisibility();
                }
                this.emojiView.setVisibility(0);
                this.emojiViewVisible = true;
                AnonymousClass75 anonymousClass75 = this.botKeyboardView;
                if (anonymousClass75 == null || anonymousClass75.getVisibility() == 8) {
                    measuredHeight = 0;
                } else {
                    this.botKeyboardView.setVisibility(8);
                    this.botKeyboardViewVisible = false;
                    measuredHeight = this.botKeyboardView.getMeasuredHeight();
                }
                this.emojiView.setShowing(true);
                View view2 = this.emojiView;
                this.animatingContentType = 0;
                view = view2;
            } else if (i2 == 1) {
                if (this.botKeyboardViewVisible) {
                    this.botKeyboardView.getVisibility();
                }
                this.botKeyboardViewVisible = true;
                AnonymousClass78 anonymousClass78 = this.emojiView;
                if (anonymousClass78 == null || anonymousClass78.getVisibility() == 8) {
                    measuredHeight2 = 0;
                } else {
                    this.viewParentForEmojiView.removeView(this.emojiView);
                    this.emojiView.setVisibility(8);
                    this.emojiView.setShowing(false);
                    this.emojiViewVisible = false;
                    measuredHeight2 = this.emojiView.getMeasuredHeight();
                }
                this.botKeyboardView.setVisibility(0);
                view = this.botKeyboardView;
                this.animatingContentType = 1;
                MessagesController.getMainSettings(this.currentAccount).edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                measuredHeight = measuredHeight2;
            } else {
                measuredHeight = 0;
                view = null;
            }
            this.currentPopupContentType = i2;
            if (this.keyboardHeight <= 0) {
                this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
            if (this.keyboardHeightLand <= 0) {
                this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
            Point point = AndroidUtilities.displaySize;
            int iMin = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && chatActivity.getParentLayout() != null) {
                iMin -= ((ActionBarLayout) chatActivity.getParentLayout()).getBottomTabsHeight(false);
            }
            if (i2 == 1) {
                iMin = Math.min(this.botKeyboardView.getKeyboardHeight(), iMin);
            }
            AnonymousClass75 anonymousClass76 = this.botKeyboardView;
            if (anonymousClass76 != null) {
                anonymousClass76.setPanelHeight(iMin);
            }
            if (view != null && this.windowInsetsInAppController == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.height = iMin;
                view.setLayoutParams(layoutParams);
            }
            if (!AndroidUtilities.isInMultiwindow) {
                AndroidUtilities.hideKeyboard(this.messageEditText);
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
            if (sizeNotifierFrameLayout != null) {
                this.emojiPadding = iMin;
                sizeNotifierFrameLayout.requestLayout();
                setEmojiButtonImage(true, true);
                updateBotButton(true);
                onWindowSizeChanged();
                if (this.smoothKeyboard && !this.keyboardVisible && iMin != measuredHeight && z) {
                    ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, i3);
                    if (this.overrideKeyboardAnimation) {
                        this.animationEndRunnable = chatActivityEnterView$$ExternalSyntheticLambda4;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.panelAnimation = animatorSet;
                        if (this.windowInsetsInAppController != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(iMin - measuredHeight, f));
                        } else {
                            float f2 = iMin - measuredHeight;
                            view.setTranslationY(f2);
                            this.panelAnimation.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f2, f));
                        }
                        this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        this.panelAnimation.setDuration(250L);
                        this.panelAnimation.addListener(new ChatActivity.AnonymousClass74(this, chatActivityEnterView$$ExternalSyntheticLambda4, z3, i3));
                        AndroidUtilities.runOnUIThread(anonymousClass2, 50L);
                        animationNotificationsLocker.lock();
                    }
                    requestLayout();
                }
            }
            WindowInsetsInAppController windowInsetsInAppController = this.windowInsetsInAppController;
            if (windowInsetsInAppController != null) {
                if (iMin > 0) {
                    int i5 = iMin + AndroidUtilities.navigationBarHeight;
                    WindowInsetsStateHolder windowInsetsStateHolder = (WindowInsetsStateHolder) windowInsetsInAppController;
                    if (windowInsetsStateHolder.inAppKeyboardHeight != i5 || windowInsetsStateHolder.inAppKeyboardState != 0) {
                        AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder.closeInAppKeyboard);
                        windowInsetsStateHolder.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder.inAppKeyboardHeight, i5);
                        windowInsetsStateHolder.inAppKeyboardHeight = i5;
                        windowInsetsStateHolder.inAppKeyboardState = 0;
                        windowInsetsStateHolder.setInsets(windowInsetsStateHolder.lastInsets);
                    }
                } else {
                    ((WindowInsetsStateHolder) windowInsetsInAppController).resetInAppKeyboardHeight(true);
                }
            }
        } else {
            if (this.emojiButton != null) {
                setEmojiButtonImage(false, true);
            }
            this.currentPopupContentType = -1;
            AnonymousClass78 anonymousClass79 = this.emojiView;
            if (anonymousClass79 != null) {
                if (i == 2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    this.removeEmojiViewAfterAnimation = false;
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
                    if (chatActivityEnterViewDelegate != null) {
                        chatActivityEnterViewDelegate.bottomPanelTranslationYChanged(0.0f);
                    }
                    this.viewParentForEmojiView.removeView(this.emojiView);
                    this.emojiView = null;
                } else if (!this.smoothKeyboard || this.keyboardVisible || this.stickersExpanded) {
                    ChatActivityEnterViewDelegate chatActivityEnterViewDelegate2 = this.delegate;
                    if (chatActivityEnterViewDelegate2 != null) {
                        chatActivityEnterViewDelegate2.bottomPanelTranslationYChanged(0.0f);
                    }
                    this.emojiPadding = 0;
                    this.viewParentForEmojiView.removeView(this.emojiView);
                    this.emojiView.setVisibility(8);
                    this.emojiView.setShowing(false);
                } else {
                    this.emojiViewVisible = true;
                    this.animatingContentType = 0;
                    anonymousClass79.setShowing(false);
                    ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74 = new ArticleViewer$$ExternalSyntheticLambda74(this, i, 22);
                    if (this.overrideKeyboardAnimation) {
                        this.animationEndRunnable = articleViewer$$ExternalSyntheticLambda74;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.panelAnimation = animatorSet2;
                        if (this.windowInsetsInAppController != null) {
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.emojiView.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            AnonymousClass78 anonymousClass710 = this.emojiView;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass710, (Property<AnonymousClass78, Float>) property, anonymousClass710.getMeasuredHeight()));
                        }
                        this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        this.panelAnimation.setDuration(250L);
                        animationNotificationsLocker.lock();
                        this.panelAnimation.addListener(new ChatActivity.AnonymousClass74(this, articleViewer$$ExternalSyntheticLambda74, z3, 13));
                    }
                    AndroidUtilities.runOnUIThread(anonymousClass2, 50L);
                    requestLayout();
                }
                this.emojiViewVisible = false;
            }
            AnonymousClass75 anonymousClass77 = this.botKeyboardView;
            if (anonymousClass77 != null && anonymousClass77.getVisibility() == 0) {
                if (i != 2 || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    if (this.smoothKeyboard && !this.keyboardVisible) {
                        if (this.botKeyboardViewVisible) {
                            this.animatingContentType = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.panelAnimation = animatorSet3;
                        if (this.windowInsetsInAppController != null) {
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.botKeyboardView.getMeasuredHeight()));
                        } else {
                            AnonymousClass75 anonymousClass711 = this.botKeyboardView;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass711, (Property<AnonymousClass75, Float>) property, anonymousClass711.getMeasuredHeight()));
                        }
                        this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        this.panelAnimation.setDuration(250L);
                        this.panelAnimation.addListener(new AnonymousClass70(this, i, i4));
                        animationNotificationsLocker.lock();
                        AndroidUtilities.runOnUIThread(anonymousClass2, 50L);
                        requestLayout();
                    } else if (!this.waitingForKeyboardOpen) {
                        this.botKeyboardView.setVisibility(8);
                    }
                }
                this.botKeyboardViewVisible = false;
            }
            if (i2 == 1 && this.botButtonsMessageObject != null) {
                MessagesController.getMainSettings(this.currentAccount).edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.botButtonsMessageObject.getId()).apply();
            }
            updateBotButton(true);
            WindowInsetsInAppController windowInsetsInAppController2 = this.windowInsetsInAppController;
            if (windowInsetsInAppController2 != null) {
                ((WindowInsetsStateHolder) windowInsetsInAppController2).resetInAppKeyboardHeight(z2);
            }
        }
        if (this.stickersTabOpen || this.emojiTabOpen) {
            checkSendButton(true);
        }
        if (this.stickersExpanded && i != 1) {
            setStickersExpanded(false, false, false, true);
        }
        updateFieldHint(false);
        checkBotMenu();
    }

    public final void showPopup$1() {
        showPopup(1, 0, true, true);
    }

    public final void showRestrictedHint() {
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if ((chatActivityEnterViewDelegate == null || !chatActivityEnterViewDelegate.checkCanRemoveRestrictionsByBoosts()) && DialogObject.isChatDialog(this.dialog_id)) {
            BulletinFactory.of(this.parentFragment).createSimpleBulletin(R.raw.passcode_lock_close, 3, LocaleController.formatString("SendPlainTextRestrictionHint", R.string.SendPlainTextRestrictionHint, ChatObject.getAllowedSendString(this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id))))).show();
        }
    }

    public final void showRichButton(boolean z) {
        ChatActivity chatActivity;
        boolean z2 = (this.richDraftActive || z) && (chatActivity = this.parentFragment) != null && !chatActivity.isSecretChat() && this.editingMessageObject == null && MessagesController.getInstance(this.currentAccount).richEditorAvailable();
        if (this.shownRichButton == z2) {
            return;
        }
        this.shownRichButton = z2;
        ImageView imageView = this.richButton;
        imageView.setVisibility(0);
        imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new ChatActivityEnterView$$ExternalSyntheticLambda19(this, z2, 1)).start();
    }

    public final void showTopView() {
        showTopView(true, false);
    }

    public final boolean supportsSendingNewEntities() {
        ChatActivity chatActivity = this.parentFragment;
        TLRPC.EncryptedChat encryptedChat = chatActivity != null ? chatActivity.currentEncryptedChat : null;
        return encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101;
    }

    public final float topViewVisible() {
        return getTopViewEnterProgress();
    }

    public final void updateAttachButtonTranslationX() {
        float alpha;
        VoIPFragment.AnonymousClass9 anonymousClass9 = this.attachButton;
        if (anonymousClass9 == null) {
            return;
        }
        float f = this.attachLayoutPaddingTranslationX + this.attachLayoutTranslationX;
        AnonymousClass27 anonymousClass27 = this.sendButton;
        if (anonymousClass27 != null) {
            anonymousClass27.getMeasuredHeight();
            alpha = anonymousClass27.getAlpha() * (-BotFullscreenButtons$$ExternalSyntheticOutline1.m(anonymousClass27.width$1(), 56.0f, 0));
        } else {
            alpha = 0.0f;
        }
        anonymousClass9.setTranslationX(f + alpha);
    }

    public final void updateAttachLayoutParams() {
        updateAttachButtonTranslationX();
        GLIconSettingsView gLIconSettingsView = this.attachLayout;
        if (gLIconSettingsView != null) {
            gLIconSettingsView.setTranslationX(this.attachLayoutPaddingTranslationX + this.attachLayoutTranslationX);
            gLIconSettingsView.setAlpha(this.attachLayoutAlpha * this.attachLayoutPaddingAlpha);
            gLIconSettingsView.setVisibility(gLIconSettingsView.getAlpha() > 0.0f ? 0 : 8);
            VoIPFragment.AnonymousClass9 anonymousClass9 = this.attachButton;
            if (anonymousClass9 != null && this.isStories) {
                anonymousClass9.setAlpha(this.attachButtonAlpha * this.attachLayoutPaddingAlpha);
            }
        }
        AnonymousClass29 anonymousClass29 = this.scheduledButton;
        if (anonymousClass29 != null) {
            anonymousClass29.setTranslationX(anonymousClass29.innerTranslationX);
        }
    }

    public final void updateBotButton(boolean z) {
        int i;
        AnonymousClass32 anonymousClass32;
        if (this.isChat) {
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && !chatActivity.openAnimationEnded) {
                z = false;
            }
            boolean zHasBotWebView = hasBotWebView();
            boolean z2 = this.botMenuButtonType != 1 && this.dialog_id > 0;
            AnonymousClass32 anonymousClass33 = this.botButton;
            boolean z3 = anonymousClass33 != null && anonymousClass33.getVisibility() == 0;
            if (!zHasBotWebView && !this.hasBotCommands && this.botReplyMarkup == null) {
                AnonymousClass32 anonymousClass34 = this.botButton;
                if (anonymousClass34 != null) {
                    anonymousClass34.setVisibility(8);
                }
            } else if (this.botReplyMarkup != null) {
                if (isPopupShowing() && this.currentPopupContentType == 1 && this.botReplyMarkup.is_persistent) {
                    AnonymousClass32 anonymousClass35 = this.botButton;
                    if (anonymousClass35 != null && anonymousClass35.getVisibility() != 8) {
                        this.botButton.setVisibility(8);
                    }
                } else {
                    createBotButton();
                    if (this.botButton.getVisibility() != 0) {
                        this.botButton.setVisibility(0);
                    }
                    this.botButtonDrawable.setIcon(R.drawable.input_bot2, true);
                    this.botButton.setContentDescription(LocaleController.getString("AccDescrBotKeyboard", R.string.AccDescrBotKeyboard));
                }
            } else if (z2) {
                AnonymousClass32 anonymousClass36 = this.botButton;
                if (anonymousClass36 != null) {
                    anonymousClass36.setVisibility(8);
                }
            } else {
                createBotButton();
                this.botButtonDrawable.setIcon(R.drawable.input_bot1, true);
                this.botButton.setContentDescription(LocaleController.getString("AccDescrBotCommands", R.string.AccDescrBotCommands));
                this.botButton.setVisibility(0);
            }
            if (z2) {
                createBotCommandsMenuButton();
            }
            AnonymousClass32 anonymousClass37 = this.botButton;
            boolean z4 = (anonymousClass37 != null && anonymousClass37.getVisibility() == 0) != z3;
            BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
            if (botCommandsMenuView != null) {
                boolean z5 = botCommandsMenuView.isWebView;
                botCommandsMenuView.setWebView(this.botMenuButtonType == 3);
                BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
                String string = this.botMenuButtonType == 2 ? LocaleController.getString(R.string.BotsMenuTitle) : this.botMenuWebViewTitle;
                if (string == null) {
                    botCommandsMenuView2.getClass();
                    string = LocaleController.getString(R.string.BotsMenuTitle);
                }
                String str = botCommandsMenuView2.menuText;
                boolean z6 = str == null || !str.equals(string);
                botCommandsMenuView2.menuText = string;
                botCommandsMenuView2.menuTextLayout = null;
                botCommandsMenuView2.requestLayout();
                AndroidUtilities.updateViewVisibilityAnimated(this.botCommandsMenuButton, z2, 0.5f, z);
                z4 = z4 || z6 || z5 != this.botCommandsMenuButton.isWebView;
            }
            if (z4 && z) {
                AnonymousClass17 anonymousClass17 = this.emojiButton;
                Float fValueOf = Float.valueOf(anonymousClass17.getX());
                HashMap map = this.animationParamsX;
                map.put(anonymousClass17, fValueOf);
                AnonymousClass50 anonymousClass50 = this.messageEditText;
                if (anonymousClass50 != null) {
                    map.put(anonymousClass50, Float.valueOf(anonymousClass50.getX()));
                }
                AnonymousClass32 anonymousClass38 = this.botButton;
                boolean z7 = anonymousClass38 != null && anonymousClass38.getVisibility() == 0;
                if (z7 != z3 && (anonymousClass32 = this.botButton) != null) {
                    anonymousClass32.setVisibility(0);
                    if (z7) {
                        this.botButton.setAlpha(0.0f);
                        this.botButton.setScaleX(0.1f);
                        this.botButton.setScaleY(0.1f);
                    } else if (!z7) {
                        this.botButton.setAlpha(1.0f);
                        this.botButton.setScaleX(1.0f);
                        this.botButton.setScaleY(1.0f);
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(this.botButton, z7, 0.1f, true, 1.0f, true, new ChatActivityEnterView$$ExternalSyntheticLambda3(this, 1));
                }
            }
            AnonymousClass32 anonymousClass39 = this.botButton;
            if (anonymousClass39 != null && anonymousClass39.getVisibility() == 0) {
                AnonymousClass50 anonymousClass51 = this.messageEditText;
                i = TextUtils.isEmpty(anonymousClass51 == null ? "" : AndroidUtilities.getTrimmedString(anonymousClass51.getTextToUse())) ? 2 : this.lastAttachVisible;
            }
            updateFieldRight(i);
        }
    }

    public final void updateBotCommandsMenuContainerTopPadding() {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        AnonymousClass47 anonymousClass47 = this.botCommandsMenuContainer;
        if (anonymousClass47 == null) {
            return;
        }
        int childCount = anonymousClass47.listView.getChildCount();
        int measuredHeight = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.botCommandsMenuContainer.listView.getChildAt(i);
            if (i < 4) {
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        int iM = measuredHeight > 0 ? BotFullscreenButtons$$ExternalSyntheticOutline1.m((sizeNotifierFrameLayout.getMeasuredHeight() - measuredHeight) - AndroidUtilities.dp(8.0f), childCount > 4 ? 12.0f : 0.0f, 0) : this.botCommandsAdapter.newResult.size() > 4 ? BotFullscreenButtons$$ExternalSyntheticOutline1.m(sizeNotifierFrameLayout.getMeasuredHeight(), 162.8f, 0) : BotFullscreenButtons$$ExternalSyntheticOutline1.m(sizeNotifierFrameLayout.getMeasuredHeight(), (Math.max(1, Math.min(4, this.botCommandsAdapter.newResult.size())) * 36) + 8, 0);
        if (this.botCommandsMenuContainer.listView.getPaddingTop() != iM) {
            this.botCommandsMenuContainer.listView.setTopGlowOffset(iM);
            if (this.botCommandLastPosition == -1 && this.botCommandsMenuContainer.getVisibility() == 0 && this.botCommandsMenuContainer.listView.getLayoutManager() != null && (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) this.botCommandsMenuContainer.listView.getLayoutManager()).findFirstVisibleItemPosition()) >= 0 && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                this.botCommandLastPosition = iFindFirstVisibleItemPosition;
                this.botCommandLastTop = viewFindViewByPosition.getTop() - this.botCommandsMenuContainer.listView.getPaddingTop();
            }
            this.botCommandsMenuContainer.listView.setPadding(0, iM, 0, AndroidUtilities.dp(8.0f));
        }
    }

    public final void updateButtons() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        boolean z = false;
        showAiButton((anonymousClass50 == null || anonymousClass50.getLineCount() <= 2 || this.messageEditText.getText() == null || TextUtils.isEmpty(this.messageEditText.getText().toString().trim())) ? false : true);
        AnonymousClass50 anonymousClass51 = this.messageEditText;
        if (anonymousClass51 != null && anonymousClass51.getLineCount() > 2 && this.messageEditText.getText() != null && !TextUtils.isEmpty(this.messageEditText.getText().toString().trim())) {
            z = true;
        }
        showRichButton(z);
    }

    @Override
    public final void updateColors$1() {
        TextPaint textPaint;
        updateRecordedDeleteIconColors();
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.updateColors();
        }
        RecordDot recordDot = this.recordDot;
        if (recordDot != null) {
            recordDot.updateColors();
        }
        SlideTextView slideTextView = this.slideText;
        if (slideTextView != null) {
            slideTextView.updateColors();
        }
        TimerView timerView = this.recordTimerView;
        if (timerView != null && (textPaint = timerView.textPaint) != null) {
            textPaint.setColor(ChatActivityEnterView.this.getThemedColor$6(Theme.key_chat_recordTime));
        }
        VideoTimelineView videoTimelineView = this.videoTimelineView;
        int i = 0;
        if (videoTimelineView != null) {
            videoTimelineView.backgroundGrayPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            videoTimelineView.roundCornersSize = 0;
            VideoTimelineView.TimeHintView timeHintView = videoTimelineView.timeHintView;
            if (timeHintView != null) {
                timeHintView.updateColors();
            }
        }
        NumberTextView numberTextView = this.captionLimitView;
        if (numberTextView != null && this.messageEditText != null) {
            if (this.codePointCount - this.currentLimit < 0) {
                numberTextView.setTextColor(getThemedColor$6(Theme.key_text_RedRegular));
            } else {
                numberTextView.setTextColor(getThemedColor$6(Theme.key_windowBackgroundWhiteGrayText));
            }
        }
        Color.alpha(getThemedColor$6(Theme.key_chat_messagePanelVoicePressed));
        AnonymousClass47 anonymousClass47 = this.botCommandsMenuContainer;
        if (anonymousClass47 != null) {
            anonymousClass47.topBackground.setColor(Theme.getColor(null, Theme.key_sheet_scrollUp, false));
            BlurredBackgroundDrawable blurredBackgroundDrawable = anonymousClass47.backgroundDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.updateColors();
            }
            anonymousClass47.invalidate();
        }
        AnonymousClass75 anonymousClass75 = this.botKeyboardView;
        if (anonymousClass75 != null) {
            AndroidUtilities.setScrollViewEdgeEffectColor(anonymousClass75.scrollView, Theme.getColor(Theme.key_chat_emojiPanelBackground, anonymousClass75.resourcesProvider));
            while (true) {
                ArrayList arrayList = anonymousClass75.buttonViews;
                if (i >= arrayList.size()) {
                    break;
                }
                ((BotKeyboardView.Button) arrayList.get(i)).updateColors();
                i++;
            }
            anonymousClass75.invalidate();
        }
        int themedColor$6 = this.audioVideoButtonContainerForbidden ? getThemedColor$6(Theme.key_glass_defaultIcon) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        setColorFilter(new PorterDuffColorFilter(themedColor$6, mode));
        int i2 = Theme.key_glass_defaultIcon;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getThemedColor$6(i2), mode);
        AnonymousClass17 anonymousClass17 = this.emojiButton;
        anonymousClass17.setColorFilter(porterDuffColorFilter);
        int i3 = Theme.key_listSelector;
        anonymousClass17.setBackground(Theme.createSelectorDrawable(getThemedColor$6(i3), 1, -1));
        ImageView imageView = this.deleteRichDraftButton;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(i2), mode));
        int themedColor$7 = getThemedColor$6(i3);
        float fDp = AndroidUtilities.dp(19.0f);
        int iDp = AndroidUtilities.dp(1.0f);
        int iDp2 = AndroidUtilities.dp(3.0f);
        imageView.setBackground(Theme.createInsetRoundRectDrawable(fDp, themedColor$7, iDp, iDp2, iDp, iDp2));
        this.sendOutlineView.setColorFilter(getThemedColor$6(Theme.key_telegram_color), mode);
    }

    public final void updateEmojiButtonParams() {
        float f = this.emojiButtonPaddingScale * this.emojiButtonScale;
        AnonymousClass17 anonymousClass17 = this.emojiButton;
        anonymousClass17.setScaleX(f);
        anonymousClass17.setScaleY(this.emojiButtonPaddingScale * this.emojiButtonScale);
        anonymousClass17.setAlpha(this.emojiButtonPaddingAlpha * this.emojiButtonAlpha);
    }

    public final void updateFieldHint(boolean z) {
        boolean zIsChannelAndNotMegaGroup;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        MessageObject messageObject;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        boolean z2 = false;
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null) {
            return;
        }
        CharSequence charSequence = this.overrideHint;
        if (charSequence != null) {
            anonymousClass50.setHintText(charSequence, z);
            this.messageEditText.setHintText2(this.overrideHint2, z);
            return;
        }
        if (!this.sendPlainEnabled && !isEditingMessage()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d " + LocaleController.getString("PlainTextRestrictedHint", R.string.PlainTextRestrictedHint));
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock3), 1, 2, 0);
            this.messageEditText.setHintText(spannableStringBuilder, z);
            this.messageEditText.setText((CharSequence) null);
            this.messageEditText.setEnabled(false);
            this.messageEditText.setInputType(1);
            return;
        }
        this.messageEditText.setEnabled(true);
        int inputType = this.messageEditText.getInputType();
        int i = this.commonInputType;
        if (inputType != i) {
            this.messageEditText.setInputType(i);
        }
        updateSendButtonPaid();
        ChatActivity chatActivity = this.parentFragment;
        boolean z3 = chatActivity != null && chatActivity.chatMode == 8 && chatActivity.isSubscriberSuggestions;
        long sendPaidMessagesStars = chatActivity != null ? chatActivity.getMessagesController().getSendPaidMessagesStars(chatActivity.getDialogId()) : 0L;
        if (sendPaidMessagesStars > 0) {
            sendPaidMessagesStars *= (long) getMessagesCount();
        }
        int i2 = chatActivity != null ? chatActivity.chatMode : -1;
        if (i2 == 9) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.WelcomeMessageEnter));
            return;
        }
        if (i2 == 5) {
            if ("hello".equalsIgnoreCase(chatActivity.quickReplyShortcut)) {
                this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessGreetingEnter));
                return;
            } else if ("away".equalsIgnoreCase(chatActivity.quickReplyShortcut)) {
                this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessAwayEnter));
                return;
            } else {
                this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessRepliesEnter));
                return;
            }
        }
        ColoredImageSpan[] coloredImageSpanArr = this.spans;
        if (z3) {
            this.messageEditText.setHintText(sendPaidMessagesStars > 0 ? StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.SuggestPostForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ','), coloredImageSpanArr), 1.13f, (ColoredImageSpan[]) null) : LocaleController.formatString(R.string.SuggestPostForFree, new Object[0]));
            ColoredImageSpan coloredImageSpan = coloredImageSpanArr[0];
            if (coloredImageSpan != null) {
                coloredImageSpan.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.editingBusinessLink != null) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.BusinessLinksEnter));
            return;
        }
        MessageObject messageObject2 = this.replyingMessageObject;
        if (messageObject2 != null && (replyMarkup2 = messageObject2.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.messageEditText.setHintText(this.replyingMessageObject.messageOwner.reply_markup.placeholder, z);
            return;
        }
        if (this.editingMessageObject != null) {
            this.messageEditText.setHintText(LocaleController.getString(this.editingCaption ? R.string.Caption : R.string.TypeMessage));
            return;
        }
        if (sendPaidMessagesStars > 0) {
            this.messageEditText.setHintText(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber((int) sendPaidMessagesStars, ',')), coloredImageSpanArr));
            ColoredImageSpan coloredImageSpan2 = coloredImageSpanArr[0];
            if (coloredImageSpan2 != null) {
                coloredImageSpan2.spaceScaleX = 0.9f;
                return;
            }
            return;
        }
        if (this.botKeyboardViewVisible && (messageObject = this.botButtonsMessageObject) != null && (replyMarkup = messageObject.messageOwner.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.messageEditText.setHintText(this.botButtonsMessageObject.messageOwner.reply_markup.placeholder, z);
            return;
        }
        if (chatActivity != null && chatActivity.isForumInViewAsMessagesMode()) {
            MessageObject messageObject3 = this.replyingTopMessage;
            if (messageObject3 != null && (tL_forumTopic = messageObject3.replyToForumTopic) != null && (str2 = tL_forumTopic.title) != null) {
                this.messageEditText.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str2), z);
                return;
            }
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(chatActivity.currentChat.id, 1L);
            if (tL_forumTopicFindTopic == null || (str = tL_forumTopicFindTopic.title) == null) {
                this.messageEditText.setHintText(LocaleController.getString(R.string.TypeMessage), z);
                return;
            } else {
                this.messageEditText.setHintText(LocaleController.formatString(R.string.TypeMessageIn, str), z);
                return;
            }
        }
        if (DialogObject.isChatDialog(this.dialog_id)) {
            TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
            TLRPC.ChatFull chatFull = this.accountInstance.getMessagesController().getChatFull(-this.dialog_id);
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            if (!zIsChannelAndNotMegaGroup && ChatObject.getSendAsPeerId(chat, chatFull) == (-this.dialog_id)) {
                z2 = true;
            }
        } else {
            zIsChannelAndNotMegaGroup = false;
        }
        if (z2) {
            this.messageEditText.setHintText(LocaleController.getString("SendAnonymously", R.string.SendAnonymously));
            return;
        }
        TLRPC.User user = this.accountInstance.getMessagesController().getUser(Long.valueOf(this.dialog_id));
        if (user != null && user.bot_forum_view && !user.bot_forum_can_manage_topics && chatActivity != null && !chatActivity.isTopic) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.SendBotNoThread));
            return;
        }
        if (chatActivity != null && chatActivity.isThreadChat() && !chatActivity.isTopic) {
            if (chatActivity.threadMessageObject == null || !chatActivity.isComments) {
                this.messageEditText.setHintText(LocaleController.getString("Reply", R.string.Reply));
                return;
            } else {
                this.messageEditText.setHintText(LocaleController.getString(R.string.Comment));
                return;
            }
        }
        if (!zIsChannelAndNotMegaGroup) {
            this.messageEditText.setHintText(LocaleController.getString(R.string.TypeMessage));
        } else if (this.silent) {
            this.messageEditText.setHintText(LocaleController.getString("ChannelSilentBroadcast", R.string.ChannelSilentBroadcast), z);
        } else {
            this.messageEditText.setHintText(LocaleController.getString("ChannelBroadcast", R.string.ChannelBroadcast), z);
        }
    }

    public final void updateFieldRight(int i) {
        ImageView imageView;
        AnonymousClass29 anonymousClass29;
        AnonymousClass29 anonymousClass210;
        VoIPFragment.AnonymousClass9 anonymousClass9;
        this.lastAttachVisible = i;
        if (this.messageEditText != null) {
            MessageObject messageObject = this.editingMessageObject;
            if (messageObject == null || messageObject.needResendWhenEdit()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.messageEditText.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.isStories;
                AnonymousClass27 anonymousClass27 = this.sendButton;
                int iM = 0;
                if (z && this.isLiveComment) {
                    int iDp = AndroidUtilities.dp(this.suggestButtonVisible ? 50.0f : 2.0f);
                    anonymousClass27.getMeasuredHeight();
                    layoutParams.rightMargin = Math.max(0, anonymousClass27.width$1() - AndroidUtilities.dp(44.0f)) + iDp;
                } else if (i == 1 || i == 2) {
                    AnonymousClass32 anonymousClass32 = this.botButton;
                    if (anonymousClass32 == null || anonymousClass32.getVisibility() != 0 || (anonymousClass210 = this.scheduledButton) == null || anonymousClass210.getVisibility() != 0 || (anonymousClass9 = this.attachButton) == null || anonymousClass9.getVisibility() != 0) {
                        AnonymousClass32 anonymousClass33 = this.botButton;
                        if ((anonymousClass33 == null || anonymousClass33.getVisibility() != 0) && (((imageView = this.notifyButton) == null || imageView.getVisibility() != 0) && ((anonymousClass29 = this.scheduledButton) == null || anonymousClass29.getTag() == null))) {
                            layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(146.0f);
                    }
                } else {
                    AnonymousClass29 anonymousClass211 = this.scheduledButton;
                    if (anonymousClass211 == null || anonymousClass211.getTag() == null) {
                        layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                    } else {
                        layoutParams.rightMargin = AndroidUtilities.dp(50.0f);
                    }
                }
                int i3 = layoutParams.rightMargin;
                anonymousClass27.getMeasuredHeight();
                layoutParams.rightMargin = Math.max(i3, Math.max(0, anonymousClass27.width$1() - AndroidUtilities.dp(44.0f)));
                RichEditor.AnonymousClass9 anonymousClass10 = this.doneButton;
                if (anonymousClass10 != null && anonymousClass10.getVisibility() == 0) {
                    int i4 = layoutParams.rightMargin;
                    RichEditor.AnonymousClass9 anonymousClass11 = this.doneButton;
                    anonymousClass11.getMeasuredHeight();
                    layoutParams.rightMargin = Math.max(i4, Math.max(0, anonymousClass11.width$1() - AndroidUtilities.dp(44.0f)));
                }
                if (i2 != layoutParams.rightMargin) {
                    this.messageEditText.setLayoutParams(layoutParams);
                }
                AnonymousClass35 anonymousClass35 = this.recordedAudioPanel;
                if (anonymousClass35 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anonymousClass35.getLayoutParams();
                    if (this.editingMessageObject == null) {
                        anonymousClass27.getMeasuredHeight();
                        iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(anonymousClass27.width$1(), 44.0f, 0);
                    }
                    layoutParams2.rightMargin = iM;
                    this.recordedAudioPanel.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void updateGiftButton(boolean z) {
        boolean z2;
        HintView2 hintView2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().userInfo;
        TLRPC.UserFull userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        TLRPC.User currentUser = getParentFragment() != null ? getParentFragment().getCurrentUser() : null;
        boolean zPremiumPurchaseBlocked = MessagesController.getInstance(this.currentAccount).premiumPurchaseBlocked();
        ChatActivity chatActivity = this.parentFragment;
        if (zPremiumPurchaseBlocked || getParentFragment() == null || currentUser == null || BuildVars.IS_BILLING_UNAVAILABLE || ((UserObject.isUserSelf(currentUser) && (userFull2 == null || !userFull2.display_gifts_button)) || UserObject.isBot(currentUser) || MessagesController.isSupportUser(currentUser) || userFull == null)) {
            z2 = false;
        } else {
            if (!currentUser.premium && MessagesController.getInstance(this.currentAccount).giftAttachMenuIcon && MessagesController.getInstance(this.currentAccount).giftTextFieldIcon) {
                if (MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean("show_gift_for_" + chatActivity.getDialogId(), true)) {
                    if (chatActivity == null) {
                    }
                } else if (BirthdayController.isToday(userFull.birthday)) {
                    if (MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivity.getDialogId(), true)) {
                        if (chatActivity == null) {
                        }
                    } else if (userFull.display_gifts_button) {
                        if (chatActivity == null) {
                        }
                    } else if (chatActivity == null) {
                    }
                } else if (userFull.display_gifts_button) {
                    if (chatActivity == null) {
                    }
                } else if (chatActivity == null) {
                }
            } else if (BirthdayController.isToday(userFull.birthday)) {
                if (MessagesController.getInstance(this.currentAccount).getMainSettings().getBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivity.getDialogId(), true)) {
                    if ((userFull.display_gifts_button || (userFull2 != null && userFull2.display_gifts_button)) && ((disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts || !disallowedGiftsSettings.disallow_unique_stargifts)) {
                        if (chatActivity == null && chatActivity.chatMode == 0) {
                            z2 = true;
                        }
                    }
                } else if (chatActivity == null) {
                }
            } else if (userFull.display_gifts_button) {
                if (chatActivity == null) {
                }
            } else if (chatActivity == null) {
            }
            z2 = false;
        }
        if (!z2 && (hintView2 = this.birthdayHint) != null) {
            hintView2.hide(true);
        }
        if (z2 || this.giftButton != null) {
            if (this.giftButton == null && chatActivity != null) {
                ?? r0 = new ImageView(getContext()) {
                    @Override
                    public final void onLayout(boolean z3, int i, int i2, int i3, int i4) {
                        super.onLayout(z3, i, i2, i3, i4);
                        post(new ChatActivityEnterView$$ExternalSyntheticLambda90(ChatActivityEnterView.this, 5));
                    }

                    @Override
                    public final void setAlpha(float f) {
                        super.setAlpha(f);
                        AnonymousClass29 anonymousClass29 = ChatActivityEnterView.this.scheduledButton;
                        if (anonymousClass29 != null) {
                            anonymousClass29.setTranslationX(anonymousClass29.innerTranslationX);
                        }
                    }
                };
                this.giftButton = r0;
                r0.setImageResource(R.drawable.msg_input_gift);
                setColorFilter(new PorterDuffColorFilter(getThemedColor$6(Theme.key_glass_defaultIcon), PorterDuff.Mode.MULTIPLY));
                setVisibility(8);
                setContentDescription(LocaleController.getString(R.string.GiftPremium));
                setScaleType(ImageView.ScaleType.CENTER);
                setBackground(Theme.createSelectorDrawable(getThemedColor$6(Theme.key_listSelector), 1, -1));
                this.attachLayout.addView(this.giftButton, 0, LayoutHelper.createFrame(44, 44, 21));
                setOnClickListener(new ChatActivityEnterView$$ExternalSyntheticLambda5(this, 10));
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.giftButton, z2, 1.0f, true, 1.0f, z, new ChatActivityEnterView$$ExternalSyntheticLambda3(this, 0));
            if (z2) {
                checkBirthdayHint();
            }
        }
    }

    public final void updateMessageTextParams() {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.setTranslationX(this.messageTextPaddingTranslationX + this.messageTextTranslationX);
        }
    }

    public final void updateRecordButton(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        AnonymousClass78 anonymousClass78;
        this.emojiButtonRestricted = false;
        boolean z = true;
        this.stickersEnabled = true;
        this.sendPlainEnabled = true;
        this.sendRoundEnabled = true;
        this.sendVoiceEnabled = true;
        if (chat != null) {
            this.audioVideoButtonContainerForbidden = (ChatObject.canSendVoice(chat) || (ChatObject.canSendRoundVideo(chat) && this.hasRecordVideo)) ? false : true;
            this.stickersEnabled = ChatObject.canSendStickers(chat);
            boolean zCanSendPlain = ChatObject.canSendPlain(chat);
            this.sendPlainEnabled = zCanSendPlain;
            boolean z2 = (this.stickersEnabled || zCanSendPlain) ? false : true;
            this.emojiButtonRestricted = z2;
            this.emojiButtonAlpha = z2 ? 0.5f : 1.0f;
            updateEmojiButtonParams();
            if (!this.emojiButtonRestricted && (anonymousClass78 = this.emojiView) != null) {
                anonymousClass78.setStickersBanned(-this.dialog_id, !this.sendPlainEnabled, !this.stickersEnabled);
            }
            this.sendRoundEnabled = ChatObject.canSendRoundVideo(chat);
            this.sendVoiceEnabled = ChatObject.canSendVoice(chat);
        } else if (userFull != null) {
            this.audioVideoButtonContainerForbidden = userFull.voice_messages_forbidden;
            this.userInfo = userFull;
        }
        float f = this.audioVideoButtonContainerForbidden ? 0.5f : 1.0f;
        AnonymousClass24 anonymousClass24 = this.audioVideoButtonContainer;
        anonymousClass24.setAlpha(f);
        anonymousClass24.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.audioVideoButtonContainerForbidden ? getThemedColor$6(Theme.key_glass_defaultIcon) : -1, PorterDuff.Mode.SRC_IN);
        AnonymousClass25 anonymousClass25 = this.audioVideoSendButton;
        anonymousClass25.setColorFilter(porterDuffColorFilter);
        anonymousClass25.invalidate();
        updateFieldHint(false);
        boolean z3 = this.isInVideoMode;
        if (!this.sendRoundEnabled && z3) {
            z3 = false;
        }
        if (this.sendVoiceEnabled || z3) {
            z = z3;
        } else if (!this.hasRecordVideo) {
            z = false;
        }
        setRecordVideoButtonVisible(z, false);
    }

    public void updateRecordInterface(int i, boolean z) {
        boolean zIsRunning;
        int i2;
        char c;
        float f;
        int i3;
        boolean z2;
        boolean z3;
        ?? r6;
        int i4;
        long j;
        int i5;
        ?? r15;
        float f2;
        int i6;
        ?? r16;
        float f3;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup;
        int i7;
        char c2;
        char c3;
        int iM;
        char c4;
        float f4;
        Runnable runnable = this.moveToSendStateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.moveToSendStateRunnable = null;
        }
        RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.voiceEnterTransitionInProgress = false;
        }
        boolean z4 = this.recordingAudioVideo;
        Property property = View.TRANSLATION_X;
        Property property2 = View.SCALE_X;
        Property property3 = View.SCALE_Y;
        Property property4 = View.ALPHA;
        if (z4) {
            if (this.recordInterfaceState == 1) {
                this.lastRecordState = i;
                return;
            }
            boolean z5 = this.lastRecordState == 3;
            if (z5) {
                c4 = 2;
            } else {
                this.voiceOnce = false;
                ControlsView controlsView = this.controlsView;
                if (controlsView != null) {
                    controlsView.periodDrawable.setValue(1, false, false);
                }
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                long j2 = this.dialog_id;
                ChatActivity chatActivity = this.parentFragment;
                c4 = 2;
                mediaDataController.toggleDraftVoiceOnce(j2, (chatActivity == null || !chatActivity.isTopic) ? 0L : chatActivity.getTopicId(), this.voiceOnce);
                this.millisecondsRecorded = 0L;
            }
            createRecordAudioPanel();
            this.recordInterfaceState = 1;
            AnonymousClass78 anonymousClass78 = this.emojiView;
            if (anonymousClass78 != null) {
                anonymousClass78.setEnabled(false);
            }
            try {
                if (this.wakeLock == null) {
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.wakeLock = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.acquire();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.lockOrientation(this.parentActivity);
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.needStartRecordAudio(0);
            }
            AnimatorSet animatorSet = this.runningAnimationAudio;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.recordPannelAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            createRecordPanel();
            PhotoViewer.AnonymousClass19 anonymousClass19 = this.recordPanel;
            if (anonymousClass19 != null) {
                anonymousClass19.setVisibility(0);
            }
            createRecordCircle();
            RecordCircle recordCircle2 = this.recordCircle;
            if (recordCircle2 != null) {
                recordCircle2.voiceEnterTransitionInProgress = false;
                recordCircle2.setVisibility(0);
                this.recordCircle.setAmplitude(0.0d);
            }
            ControlsView controlsView2 = this.controlsView;
            if (controlsView2 != null) {
                controlsView2.setVisibility(0);
            }
            RecordDot recordDot = this.recordDot;
            if (recordDot != null) {
                recordDot.alpha = 1.0f;
                recordDot.lastUpdateTime = System.currentTimeMillis();
                recordDot.isIncr = false;
                recordDot.playing = false;
                RLottieDrawable rLottieDrawable = recordDot.drawable;
                rLottieDrawable.isRunning = false;
                rLottieDrawable.checkChoreographer$1();
                recordDot.invalidate();
                this.recordDot.setScaleX(0.0f);
                this.recordDot.setScaleY(0.0f);
                this.recordDot.enterAnimation = true;
            }
            this.runningAnimationAudio = new AnimatorSet();
            this.recordTimerView.setTranslationX(AndroidUtilities.dp(20.0f));
            this.recordTimerView.setAlpha(0.0f);
            if (this.lastRecordState != 3) {
                this.slideText.setTranslationX(AndroidUtilities.dp(20.0f));
                this.slideText.setAlpha(0.0f);
                SlideTextView slideTextView = this.slideText;
                slideTextView.cancelToProgress = 0.0f;
                slideTextView.slideProgress = 1.0f;
                this.slideText.setEnabled(true);
            } else {
                this.slideText.setTranslationX(0.0f);
                this.slideText.setAlpha(0.0f);
                SlideTextView slideTextView2 = this.slideText;
                slideTextView2.cancelToProgress = 1.0f;
                slideTextView2.setEnabled(true);
            }
            this.recordCircle.resetLockTranslation(this.lastRecordState == 3);
            this.recordIsCanceled = false;
            isRecordingStateChanged();
            AnimatorSet animatorSet3 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_SCALE, 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_ALPHA, 0.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 1.0f);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 1.0f);
            Animator[] animatorArr = new Animator[6];
            animatorArr[0] = objectAnimatorOfFloat;
            animatorArr[1] = objectAnimatorOfFloat2;
            animatorArr[c4] = objectAnimatorOfFloat3;
            animatorArr[3] = objectAnimatorOfFloat4;
            animatorArr[4] = objectAnimatorOfFloat5;
            animatorArr[5] = objectAnimatorOfFloat6;
            animatorSet3.playTogether(animatorArr);
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property4, 1.0f));
            ControlsView controlsView3 = this.controlsView;
            if (controlsView3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(controlsView3, (Property<ControlsView, Float>) property4, 1.0f));
            }
            if (this.audioVideoSendButton != null) {
                f4 = 0.0f;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 0.0f));
            } else {
                f4 = 0.0f;
            }
            BotCommandsMenuView botCommandsMenuView = this.botCommandsMenuButton;
            if (botCommandsMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(botCommandsMenuView, (Property<BotCommandsMenuView, Float>) property3, f4);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, f4);
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property4, f4);
                Animator[] animatorArr2 = new Animator[3];
                animatorArr2[0] = objectAnimatorOfFloat7;
                animatorArr2[1] = objectAnimatorOfFloat8;
                animatorArr2[c4] = objectAnimatorOfFloat9;
                animatorSet3.playTogether(animatorArr2);
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.messageEditText, this.MESSAGE_TEXT_TRANSLATION_X, AndroidUtilities.dp(20.0f));
            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property4, 0.0f);
            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.recordedAudioPanel, (Property<AnonymousClass35, Float>) property4, 1.0f);
            Animator[] animatorArr3 = new Animator[3];
            animatorArr3[0] = objectAnimatorOfFloat10;
            animatorArr3[1] = objectAnimatorOfFloat11;
            animatorArr3[c4] = objectAnimatorOfFloat12;
            animatorSet4.playTogether(animatorArr3);
            if (z5) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.audioTimelineView, (Property<RecordedAudioPlayerView, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property4, 0.0f));
            }
            if (this.scheduledButton != null) {
                animatorSet4.playTogether(animateScheduledTranslationX(AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.scheduledButton, (Property<AnonymousClass29, Float>) property4, 0.0f));
            }
            GLIconSettingsView gLIconSettingsView = this.attachLayout;
            if (gLIconSettingsView != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(gLIconSettingsView, this.ATTACH_LAYOUT_TRANSLATION_X, AndroidUtilities.dp(30.0f)), ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_ALPHA, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.attachButtonAnimator;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.attachButtonAnimator = null;
                }
                VoIPFragment.AnonymousClass9 anonymousClass9 = this.attachButton;
                this.attachButtonAlpha = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(anonymousClass9, (Property<VoIPFragment.AnonymousClass9, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 0.5f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 0.5f));
            }
            ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = this.sideButtons;
            if (chatActivitySideControlsButtonsLayout != null) {
                chatActivitySideControlsButtonsLayout.showButton(0, false, true);
            }
            this.runningAnimationAudio.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.recordCircle, this.recordCircleScale, 1.0f).setDuration(300L));
            if (!z5) {
                this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.recordCircle, this.recordControlsCircleScale, 1.0f).setDuration(300L));
            }
            this.runningAnimationAudio.addListener(new AnonymousClass31(this, z5, 2));
            this.runningAnimationAudio.setInterpolator(new DecelerateInterpolator());
            this.runningAnimationAudio.start();
            TimerView timerView = this.recordTimerView;
            long j3 = this.millisecondsRecorded;
            timerView.isRunning = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - j3;
            timerView.startTime = jCurrentTimeMillis;
            timerView.lastSendTypingTime = jCurrentTimeMillis;
            timerView.invalidate();
        } else {
            if (this.recordIsCanceled && i == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.wakeLock = null;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            AndroidUtilities.unlockOrientation(this.parentActivity);
            this.wasSendTyping = false;
            if (this.recordInterfaceState == 0) {
                this.lastRecordState = i;
                return;
            }
            this.accountInstance.getMessagesController().sendTyping(this.dialog_id, getThreadMessageId(), 2, 0);
            this.recordInterfaceState = 0;
            AnonymousClass78 anonymousClass79 = this.emojiView;
            if (anonymousClass79 != null) {
                anonymousClass79.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.runningAnimationAudio;
            if (animatorSet5 != null) {
                zIsRunning = animatorSet5.isRunning();
                AnonymousClass25 anonymousClass25 = this.audioVideoSendButton;
                if (anonymousClass25 != null) {
                    anonymousClass25.setScaleX(1.0f);
                    setScaleY(1.0f);
                }
                this.runningAnimationAudio.removeAllListeners();
                this.runningAnimationAudio.cancel();
            } else {
                zIsRunning = false;
            }
            AnimatorSet animatorSet6 = this.recordPannelAnimation;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            AnonymousClass50 anonymousClass50 = this.messageEditText;
            if (anonymousClass50 != null) {
                anonymousClass50.setVisibility(0);
            }
            this.runningAnimationAudio = new AnimatorSet();
            ChatActivityEnterViewAnimatedIconView.State state = ChatActivityEnterViewAnimatedIconView.State.VOICE;
            ChatActivityEnterViewAnimatedIconView.State state2 = ChatActivityEnterViewAnimatedIconView.State.VIDEO;
            if (zIsRunning || i == 4) {
                AnonymousClass25 anonymousClass26 = this.audioVideoSendButton;
                if (anonymousClass26 != null) {
                    anonymousClass26.setVisibility(0);
                }
                this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_SCALE, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.recordCircle, this.recordCircleScale, 0.0f), ObjectAnimator.ofFloat(this.recordCircle, this.recordControlsCircleScale, 0.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.messageEditText, this.MESSAGE_TEXT_TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                ControlsView controlsView4 = this.controlsView;
                if (controlsView4 != null) {
                    i2 = 1;
                    c = 0;
                    this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(controlsView4, (Property<ControlsView, Float>) property4, 0.0f));
                    this.controlsView.hideHintView();
                } else {
                    i2 = 1;
                    c = 0;
                }
                BotCommandsMenuView botCommandsMenuView2 = this.botCommandsMenuButton;
                if (botCommandsMenuView2 != null) {
                    AnimatorSet animatorSet7 = this.runningAnimationAudio;
                    float[] fArr = new float[i2];
                    f = 1.0f;
                    fArr[c] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(botCommandsMenuView2, (Property<BotCommandsMenuView, Float>) property3, fArr);
                    BotCommandsMenuView botCommandsMenuView3 = this.botCommandsMenuButton;
                    float[] fArr2 = new float[i2];
                    fArr2[c] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(botCommandsMenuView3, (Property<BotCommandsMenuView, Float>) property2, fArr2);
                    BotCommandsMenuView botCommandsMenuView4 = this.botCommandsMenuButton;
                    float[] fArr3 = new float[i2];
                    fArr3[c] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(botCommandsMenuView4, (Property<BotCommandsMenuView, Float>) property4, fArr3);
                    Animator[] animatorArr4 = new Animator[3];
                    animatorArr4[c] = objectAnimatorOfFloat13;
                    animatorArr4[i2] = objectAnimatorOfFloat14;
                    animatorArr4[2] = objectAnimatorOfFloat15;
                    animatorSet7.playTogether(animatorArr4);
                } else {
                    f = 1.0f;
                }
                AnonymousClass25 anonymousClass27 = this.audioVideoSendButton;
                if (anonymousClass27 != null) {
                    anonymousClass27.setScaleX(f);
                    setScaleY(f);
                    i3 = 1;
                    this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, f));
                    setState(isInVideoMode() ? state2 : state, true);
                } else {
                    i3 = 1;
                }
                if (this.scheduledButton != null) {
                    AnimatorSet animatorSet8 = this.runningAnimationAudio;
                    ValueAnimator valueAnimatorAnimateScheduledTranslationX = animateScheduledTranslationX(0.0f);
                    AnonymousClass29 anonymousClass29 = this.scheduledButton;
                    float[] fArr4 = new float[i3];
                    fArr4[0] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(anonymousClass29, (Property<AnonymousClass29, Float>) property4, fArr4);
                    Animator[] animatorArr5 = new Animator[2];
                    animatorArr5[0] = valueAnimatorAnimateScheduledTranslationX;
                    animatorArr5[i3] = objectAnimatorOfFloat16;
                    animatorSet8.playTogether(animatorArr5);
                }
                if (this.attachLayout != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.attachButtonAnimator;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.attachButtonAnimator = null;
                    }
                    z3 = true;
                    z2 = false;
                    this.runningAnimationAudio.playTogether(ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_ALPHA, 1.0f));
                    AnimatorSet animatorSet9 = this.runningAnimationAudio;
                    VoIPFragment.AnonymousClass9 anonymousClass10 = this.attachButton;
                    this.attachButtonAlpha = 1.0f;
                    animatorSet9.playTogether(ObjectAnimator.ofFloat(anonymousClass10, (Property<VoIPFragment.AnonymousClass9, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 1.0f));
                } else {
                    z2 = false;
                    z3 = true;
                }
                ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout2 = this.sideButtons;
                if (chatActivitySideControlsButtonsLayout2 != null) {
                    chatActivitySideControlsButtonsLayout2.showButton(z2 ? 1 : 0, z2, z3);
                }
                this.recordIsCanceled = z3;
                isRecordingStateChanged();
                this.runningAnimationAudio.setDuration(150L);
                r6 = z2;
            } else {
                if (i == 3) {
                    createRecordAudioPanel();
                    createRecordCircle();
                    SlideTextView slideTextView3 = this.slideText;
                    if (slideTextView3 != null) {
                        slideTextView3.setEnabled(false);
                    }
                    if (isInVideoMode()) {
                        RecordedAudioPlayerView recordedAudioPlayerView = this.audioTimelineView;
                        if (recordedAudioPlayerView != null) {
                            recordedAudioPlayerView.setVisibility(8);
                        }
                        AnonymousClass35 anonymousClass35 = this.recordedAudioPanel;
                        if (anonymousClass35 != null) {
                            anonymousClass35.setAlpha(1.0f);
                            this.recordedAudioPanel.setVisibility(0);
                        }
                        RLottieImageView rLottieImageView = this.recordDeleteImageView;
                        if (rLottieImageView != null) {
                            rLottieImageView.setProgress(0.0f);
                            this.recordDeleteImageView.stopAnimation();
                        }
                        f3 = 1.0f;
                    } else {
                        VideoTimelineView videoTimelineView = this.videoTimelineView;
                        if (videoTimelineView != null) {
                            videoTimelineView.setVisibility(8);
                            isRecordingStateChanged();
                        }
                        AnonymousClass35 anonymousClass36 = this.recordedAudioPanel;
                        if (anonymousClass36 != null) {
                            anonymousClass36.setVisibility(0);
                            f3 = 1.0f;
                            this.recordedAudioPanel.setAlpha(1.0f);
                        } else {
                            f3 = 1.0f;
                        }
                        RecordedAudioPlayerView recordedAudioPlayerView2 = this.audioTimelineView;
                        if (recordedAudioPlayerView2 != null) {
                            recordedAudioPlayerView2.setVisibility(0);
                            this.audioTimelineView.setAlpha(0.0f);
                        }
                    }
                    this.sendButtonVisible = true;
                    this.snapAnimationProgress = f3;
                    this.lockAnimatedTranslation = this.startTranslation;
                    this.slideToCancelProgress = f3;
                    SlideTextView slideTextView4 = this.slideText;
                    if (slideTextView4 != null) {
                        slideTextView4.cancelToProgress = f3;
                    }
                    ControlsView controlsView5 = this.controlsView;
                    if (controlsView5 != null) {
                        controlsView5.invalidate();
                    }
                    RLottieImageView rLottieImageView2 = this.recordDeleteImageView;
                    if (rLottieImageView2 != null) {
                        rLottieImageView2.setAlpha(0.0f);
                        this.recordDeleteImageView.setScaleX(0.0f);
                        this.recordDeleteImageView.setScaleY(0.0f);
                        this.recordDeleteImageView.setProgress(0.0f);
                        this.recordDeleteImageView.stopAnimation();
                    }
                    if (isInVideoMode() || this.shouldDrawRecordedAudioPanelInParent) {
                        this.videoTimelineView.setVisibility(0);
                        layoutParams = null;
                        viewGroup = null;
                    } else {
                        viewGroup = (ViewGroup) this.recordedAudioPanel.getParent();
                        layoutParams = this.recordedAudioPanel.getLayoutParams();
                        viewGroup.removeView(this.recordedAudioPanel);
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        if (this.editingMessageObject == null) {
                            AnonymousClass27 anonymousClass28 = this.sendButton;
                            anonymousClass28.getMeasuredHeight();
                            iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(anonymousClass28.width$1(), 44.0f, 0);
                        } else {
                            iM = 0;
                        }
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(measuredWidth - iM, AndroidUtilities.dp(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = AndroidUtilities.dp(7.0f);
                        layoutParams2.rightMargin = AndroidUtilities.dp(7.0f);
                        this.sizeNotifierLayout.addView(this.recordedAudioPanel, layoutParams2);
                        this.videoTimelineView.setVisibility(8);
                    }
                    isRecordingStateChanged();
                    AnimatorSet animatorSet10 = new AnimatorSet();
                    if (z) {
                        this.audioTimelineView.setAllowDraw(false);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ChatActivityEnterView$$ExternalSyntheticLambda3(this, 6));
                        valueAnimatorOfFloat.addListener(new AnonymousClass28(this, 9));
                        valueAnimatorOfFloat.setDuration(isInVideoMode() ? 490L : 580L);
                        AnimatorSet animatorSet11 = new AnimatorSet();
                        animatorSet11.playTogether(ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.recordDeleteImageView, (Property<RLottieImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_SCALE, 0.0f), ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_ALPHA, 0.0f), ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property4, 0.0f));
                        RLottieImageView rLottieImageView3 = this.recordDeleteImageView;
                        if (rLottieImageView3 != null) {
                            rLottieImageView3.setAlpha(0.0f);
                            this.recordDeleteImageView.setScaleX(0.0f);
                            this.recordDeleteImageView.setScaleY(0.0f);
                        }
                        if (this.audioVideoSendButton != null) {
                            i7 = 1;
                            animatorSet11.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property3, 1.0f));
                            setState(isInVideoMode() ? state2 : state, true);
                        } else {
                            i7 = 1;
                        }
                        BotCommandsMenuView botCommandsMenuView5 = this.botCommandsMenuButton;
                        if (botCommandsMenuView5 != null) {
                            float[] fArr5 = new float[i7];
                            fArr5[0] = 0.0f;
                            ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(botCommandsMenuView5, (Property<BotCommandsMenuView, Float>) property4, fArr5);
                            BotCommandsMenuView botCommandsMenuView6 = this.botCommandsMenuButton;
                            float[] fArr6 = new float[i7];
                            fArr6[0] = 0.0f;
                            ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(botCommandsMenuView6, (Property<BotCommandsMenuView, Float>) property2, fArr6);
                            BotCommandsMenuView botCommandsMenuView7 = this.botCommandsMenuButton;
                            float[] fArr7 = new float[i7];
                            fArr7[0] = 0.0f;
                            ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(botCommandsMenuView7, (Property<BotCommandsMenuView, Float>) property3, fArr7);
                            Animator[] animatorArr6 = new Animator[3];
                            animatorArr6[0] = objectAnimatorOfFloat17;
                            animatorArr6[i7] = objectAnimatorOfFloat18;
                            animatorArr6[2] = objectAnimatorOfFloat19;
                            animatorSet11.playTogether(animatorArr6);
                        }
                        animatorSet11.addListener(new AnonymousClass28(this, 10));
                        animatorSet11.setDuration(150L);
                        animatorSet11.setStartDelay(150L);
                        if (isInVideoMode()) {
                            this.videoTimelineView.setAlpha(0.0f);
                            c2 = 1;
                            c3 = 0;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this.videoTimelineView, (Property<VideoTimelineView, Float>) property4, 1.0f));
                            animatorSet10.setDuration(150L);
                            animatorSet10.setStartDelay(430L);
                        } else {
                            c2 = 1;
                            c3 = 0;
                        }
                        AnimatorSet animatorSet12 = this.runningAnimationAudio;
                        Animator[] animatorArr7 = new Animator[3];
                        animatorArr7[c3] = animatorSet11;
                        animatorArr7[c2] = valueAnimatorOfFloat;
                        animatorArr7[2] = animatorSet10;
                        animatorSet12.playTogether(animatorArr7);
                        this.runningAnimationAudio.addListener(new EmojiView.AnonymousClass35(this, viewGroup, layoutParams, 2));
                    } else {
                        createRecordPanel();
                        this.recordCircleScale.set(this.recordCircle, Float.valueOf(1.0f));
                        this.recordCircle.setTransformToSeekbar(1.0f);
                        if (!isInVideoMode()) {
                            float f5 = this.transformToSeekbar;
                            if (f5 != 0.0f && this.audioTimelineView != null) {
                                this.audioTimelineView.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(Math.max(0.0f, ((f5 - 0.38f) - 0.25f) / 0.37f)));
                                this.audioTimelineView.invalidate();
                            }
                        }
                        this.recordDot.setScaleY(0.0f);
                        this.recordDot.setScaleX(0.0f);
                        this.recordTimerView.setAlpha(0.0f);
                        this.recordTimerView.setTranslationX(-AndroidUtilities.dp(20.0f));
                        this.slideText.setAlpha(0.0f);
                        this.recordDeleteImageView.setAlpha(1.0f);
                        this.recordDeleteImageView.setScaleY(1.0f);
                        this.recordDeleteImageView.setScaleX(1.0f);
                        this.EMOJI_BUTTON_SCALE.set(this.emojiButton, Float.valueOf(0.0f));
                        this.EMOJI_BUTTON_ALPHA.set(this.emojiButton, Float.valueOf(0.0f));
                        this.messageEditText.setAlpha(0.0f);
                        AnonymousClass25 anonymousClass210 = this.audioVideoSendButton;
                        if (anonymousClass210 != null) {
                            if (isInVideoMode()) {
                                state = state2;
                            }
                            anonymousClass210.setState(state, z);
                            this.audioVideoButtonContainer.setAlpha(1.0f);
                            this.audioVideoButtonContainer.setScaleX(1.0f);
                            this.audioVideoButtonContainer.setScaleY(1.0f);
                        }
                        BotCommandsMenuView botCommandsMenuView8 = this.botCommandsMenuButton;
                        if (botCommandsMenuView8 != null) {
                            botCommandsMenuView8.setAlpha(0.0f);
                            this.botCommandsMenuButton.setScaleX(0.0f);
                            this.botCommandsMenuButton.setScaleY(0.0f);
                        }
                        if (isInVideoMode()) {
                            this.videoTimelineView.setAlpha(1.0f);
                        }
                        if (viewGroup != null) {
                            this.sizeNotifierLayout.removeView(this.recordedAudioPanel);
                            viewGroup.addView(this.recordedAudioPanel, layoutParams);
                        }
                        this.recordedAudioPanel.setAlpha(1.0f);
                        this.audioTimelineView.setAlpha(1.0f);
                        this.emojiButtonScale = 0.0f;
                        this.emojiButtonAlpha = 0.0f;
                        updateEmojiButtonParams();
                        isRecordingStateChanged();
                    }
                } else if (i == 2 || i == 5) {
                    AnonymousClass25 anonymousClass211 = this.audioVideoSendButton;
                    if (anonymousClass211 != null) {
                        anonymousClass211.setVisibility(0);
                    }
                    this.recordIsCanceled = true;
                    isRecordingStateChanged();
                    AnimatorSet animatorSet13 = new AnimatorSet();
                    animatorSet13.playTogether(ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_SCALE, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f));
                    ControlsView controlsView6 = this.controlsView;
                    if (controlsView6 != null) {
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(controlsView6, (Property<ControlsView, Float>) property4, 0.0f));
                        this.controlsView.hideHintView();
                    }
                    BotCommandsMenuView botCommandsMenuView9 = this.botCommandsMenuButton;
                    if (botCommandsMenuView9 != null) {
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(botCommandsMenuView9, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property4, 1.0f));
                    }
                    AnimatorSet animatorSet14 = new AnimatorSet();
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.recordTimerView, (Property<TimerView, Float>) property, -AndroidUtilities.dp(20.0f)), ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.slideText, (Property<SlideTextView, Float>) property, -AndroidUtilities.dp(20.0f)));
                    if (i != 5) {
                        this.audioVideoButtonContainer.setScaleX(0.0f);
                        this.audioVideoButtonContainer.setScaleY(0.0f);
                        VoIPFragment.AnonymousClass9 anonymousClass11 = this.attachButton;
                        if (anonymousClass11 != null && anonymousClass11.getVisibility() == 0) {
                            this.attachButton.setScaleX(0.5f);
                            this.attachButton.setScaleY(0.5f);
                        }
                        AnonymousClass32 anonymousClass32 = this.botButton;
                        if (anonymousClass32 != null && anonymousClass32.getVisibility() == 0) {
                            this.botButton.setScaleX(0.0f);
                            this.botButton.setScaleY(0.0f);
                        }
                        animatorSet13.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 1.0f));
                        if (this.attachLayout != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.attachButtonAnimator;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.attachButtonAnimator = null;
                            }
                            i5 = 1;
                            r15 = 0;
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_ALPHA, 1.0f), ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_TRANSLATION_X, 0.0f));
                            VoIPFragment.AnonymousClass9 anonymousClass12 = this.attachButton;
                            this.attachButtonAlpha = 1.0f;
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(anonymousClass12, (Property<VoIPFragment.AnonymousClass9, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 1.0f));
                        } else {
                            i5 = 1;
                            r15 = 0;
                        }
                        ?? r5 = this.sideButtons;
                        if (r5 != 0) {
                            r5.showButton(r15, r15, i5);
                        }
                        AnonymousClass32 anonymousClass33 = this.botButton;
                        if (anonymousClass33 != null) {
                            float[] fArr8 = new float[i5];
                            fArr8[r15] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(anonymousClass33, (Property<AnonymousClass32, Float>) property2, fArr8);
                            AnonymousClass32 anonymousClass34 = this.botButton;
                            float[] fArr9 = new float[i5];
                            fArr9[r15] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(anonymousClass34, (Property<AnonymousClass32, Float>) property3, fArr9);
                            Animator[] animatorArr8 = new Animator[2];
                            animatorArr8[r15] = objectAnimatorOfFloat20;
                            animatorArr8[i5] = objectAnimatorOfFloat21;
                            animatorSet13.playTogether(animatorArr8);
                        }
                        if (this.audioVideoSendButton != null) {
                            AnonymousClass24 anonymousClass24 = this.audioVideoButtonContainer;
                            float[] fArr10 = new float[i5];
                            fArr10[r15] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(anonymousClass24, (Property<AnonymousClass24, Float>) property4, fArr10);
                            Animator[] animatorArr9 = new Animator[i5];
                            animatorArr9[r15] = objectAnimatorOfFloat22;
                            animatorSet13.playTogether(animatorArr9);
                            AnonymousClass24 anonymousClass212 = this.audioVideoButtonContainer;
                            float[] fArr11 = new float[i5];
                            fArr11[r15] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat23 = ObjectAnimator.ofFloat(anonymousClass212, (Property<AnonymousClass24, Float>) property2, fArr11);
                            Animator[] animatorArr10 = new Animator[i5];
                            animatorArr10[r15] = objectAnimatorOfFloat23;
                            animatorSet13.playTogether(animatorArr10);
                            AnonymousClass24 anonymousClass213 = this.audioVideoButtonContainer;
                            float[] fArr12 = new float[i5];
                            fArr12[r15] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat24 = ObjectAnimator.ofFloat(anonymousClass213, (Property<AnonymousClass24, Float>) property3, fArr12);
                            Animator[] animatorArr11 = new Animator[i5];
                            animatorArr11[r15] = objectAnimatorOfFloat24;
                            animatorSet13.playTogether(animatorArr11);
                            setState(isInVideoMode() ? state2 : state, i5);
                        }
                        AnonymousClass29 anonymousClass214 = this.scheduledButton;
                        if (anonymousClass214 != null) {
                            float[] fArr13 = new float[i5];
                            fArr13[0] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat25 = ObjectAnimator.ofFloat(anonymousClass214, (Property<AnonymousClass29, Float>) property4, fArr13);
                            ValueAnimator valueAnimatorAnimateScheduledTranslationX2 = animateScheduledTranslationX(0.0f);
                            Animator[] animatorArr12 = new Animator[2];
                            animatorArr12[0] = objectAnimatorOfFloat25;
                            animatorArr12[i5] = valueAnimatorAnimateScheduledTranslationX2;
                            animatorSet13.playTogether(animatorArr12);
                        }
                        j = 150;
                    } else {
                        AnimatorSet animatorSet15 = new AnimatorSet();
                        animatorSet15.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 1.0f));
                        if (this.attachLayout != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.attachButtonAnimator;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.attachButtonAnimator = null;
                            }
                            i4 = 1;
                            animatorSet15.playTogether(ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_ALPHA, 1.0f));
                            VoIPFragment.AnonymousClass9 anonymousClass13 = this.attachButton;
                            this.attachButtonAlpha = 1.0f;
                            animatorSet15.playTogether(ObjectAnimator.ofFloat(anonymousClass13, (Property<VoIPFragment.AnonymousClass9, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 1.0f));
                        } else {
                            i4 = 1;
                        }
                        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout3 = this.sideButtons;
                        if (chatActivitySideControlsButtonsLayout3 != null) {
                            chatActivitySideControlsButtonsLayout3.showButton(0, false, i4);
                        }
                        AnonymousClass29 anonymousClass215 = this.scheduledButton;
                        if (anonymousClass215 != null) {
                            float[] fArr14 = new float[i4];
                            fArr14[0] = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat26 = ObjectAnimator.ofFloat(anonymousClass215, (Property<AnonymousClass29, Float>) property4, fArr14);
                            ValueAnimator valueAnimatorAnimateScheduledTranslationX3 = animateScheduledTranslationX(0.0f);
                            Animator[] animatorArr13 = new Animator[2];
                            animatorArr13[0] = objectAnimatorOfFloat26;
                            animatorArr13[i4] = valueAnimatorAnimateScheduledTranslationX3;
                            animatorSet15.playTogether(animatorArr13);
                        }
                        j = 150;
                        animatorSet15.setDuration(150L);
                        animatorSet15.setStartDelay(110L);
                        animatorSet15.addListener(new AnonymousClass28(this, 11));
                        AnimatorSet animatorSet16 = this.runningAnimationAudio;
                        Animator[] animatorArr14 = new Animator[i4];
                        animatorArr14[0] = animatorSet15;
                        animatorSet16.playTogether(animatorArr14);
                    }
                    animatorSet13.setDuration(j);
                    animatorSet13.setStartDelay(700L);
                    animatorSet14.setDuration(200L);
                    animatorSet14.setStartDelay(200L);
                    this.messageTextTranslationX = 0.0f;
                    updateMessageTextParams();
                    ObjectAnimator objectAnimatorOfFloat27 = ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property4, 1.0f);
                    objectAnimatorOfFloat27.setStartDelay(this.emojiButtonPaddingAlpha == 1.0f ? 300L : 700L);
                    objectAnimatorOfFloat27.setDuration(200L);
                    this.runningAnimationAudio.playTogether(animatorSet13, animatorSet14, objectAnimatorOfFloat27, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.startTranslation).setDuration(200L));
                    if (i == 5) {
                        ChatActivityEnterView.this.canceledByGesture = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                        duration.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                        this.runningAnimationAudio.playTogether(duration);
                    } else {
                        ObjectAnimator objectAnimatorOfFloat28 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                        objectAnimatorOfFloat28.setDuration(360L);
                        objectAnimatorOfFloat28.setStartDelay(490L);
                        this.runningAnimationAudio.playTogether(objectAnimatorOfFloat28);
                    }
                    RecordDot recordDot2 = this.recordDot;
                    if (recordDot2 != null) {
                        recordDot2.playDeleteAnimation();
                    }
                } else {
                    AnonymousClass25 anonymousClass216 = this.audioVideoSendButton;
                    if (anonymousClass216 != null) {
                        anonymousClass216.setVisibility(0);
                    }
                    AnimatorSet animatorSet17 = new AnimatorSet();
                    animatorSet17.playTogether(ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_SCALE, 1.0f), ObjectAnimator.ofFloat(this.emojiButton, this.EMOJI_BUTTON_ALPHA, this.emojiButtonRestricted ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.recordDot, (Property<RecordDot, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, 1.0f));
                    ControlsView controlsView7 = this.controlsView;
                    if (controlsView7 != null) {
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(controlsView7, (Property<ControlsView, Float>) property4, 0.0f));
                        this.controlsView.hideHintView();
                    }
                    BotCommandsMenuView botCommandsMenuView10 = this.botCommandsMenuButton;
                    if (botCommandsMenuView10 != null) {
                        f2 = 1.0f;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(botCommandsMenuView10, (Property<BotCommandsMenuView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.botCommandsMenuButton, (Property<BotCommandsMenuView, Float>) property4, 1.0f));
                    } else {
                        f2 = 1.0f;
                    }
                    AnonymousClass25 anonymousClass217 = this.audioVideoSendButton;
                    if (anonymousClass217 != null) {
                        anonymousClass217.setScaleX(f2);
                        setScaleY(f2);
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.audioVideoButtonContainer, (Property<AnonymousClass24, Float>) property4, f2));
                        setState(isInVideoMode() ? state2 : state, true);
                    }
                    if (this.attachLayout != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.attachButtonAnimator;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.attachButtonAnimator = null;
                        }
                        this.attachLayoutTranslationX = 0.0f;
                        updateAttachLayoutParams();
                        i6 = 1;
                        r16 = 0;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(this.attachLayout, this.ATTACH_LAYOUT_ALPHA, 1.0f));
                        VoIPFragment.AnonymousClass9 anonymousClass14 = this.attachButton;
                        this.attachButtonAlpha = 1.0f;
                        animatorSet17.playTogether(ObjectAnimator.ofFloat(anonymousClass14, (Property<VoIPFragment.AnonymousClass9, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.attachButton, (Property<VoIPFragment.AnonymousClass9, Float>) property3, 1.0f));
                    } else {
                        i6 = 1;
                        r16 = 0;
                    }
                    ?? r3 = this.sideButtons;
                    if (r3 != 0) {
                        r3.showButton(r16, r16, i6);
                    }
                    AnonymousClass29 anonymousClass218 = this.scheduledButton;
                    if (anonymousClass218 != null) {
                        float[] fArr15 = new float[i6];
                        fArr15[r16] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat29 = ObjectAnimator.ofFloat(anonymousClass218, (Property<AnonymousClass29, Float>) property4, fArr15);
                        ValueAnimator valueAnimatorAnimateScheduledTranslationX4 = animateScheduledTranslationX(0.0f);
                        Animator[] animatorArr15 = new Animator[2];
                        animatorArr15[r16] = objectAnimatorOfFloat29;
                        animatorArr15[i6] = valueAnimatorAnimateScheduledTranslationX4;
                        animatorSet17.playTogether(animatorArr15);
                    }
                    animatorSet17.setDuration(150L);
                    animatorSet17.setStartDelay(200L);
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    TimerView timerView2 = this.recordTimerView;
                    float[] fArr16 = new float[i6];
                    fArr16[r16] = 0.0f;
                    ObjectAnimator objectAnimatorOfFloat30 = ObjectAnimator.ofFloat(timerView2, (Property<TimerView, Float>) property4, fArr16);
                    TimerView timerView3 = this.recordTimerView;
                    float[] fArr17 = new float[i6];
                    fArr17[r16] = AndroidUtilities.dp(40.0f);
                    ObjectAnimator objectAnimatorOfFloat31 = ObjectAnimator.ofFloat(timerView3, (Property<TimerView, Float>) property, fArr17);
                    SlideTextView slideTextView5 = this.slideText;
                    float[] fArr18 = new float[i6];
                    fArr18[r16] = 0.0f;
                    ObjectAnimator objectAnimatorOfFloat32 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property4, fArr18);
                    SlideTextView slideTextView6 = this.slideText;
                    float[] fArr19 = new float[i6];
                    fArr19[r16] = AndroidUtilities.dp(40.0f);
                    ObjectAnimator objectAnimatorOfFloat33 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property, fArr19);
                    Animator[] animatorArr16 = new Animator[4];
                    animatorArr16[r16] = objectAnimatorOfFloat30;
                    animatorArr16[i6] = objectAnimatorOfFloat31;
                    animatorArr16[2] = objectAnimatorOfFloat32;
                    animatorArr16[3] = objectAnimatorOfFloat33;
                    animatorSet18.playTogether(animatorArr16);
                    animatorSet18.setDuration(150L);
                    float[] fArr20 = new float[i6];
                    fArr20[r16] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat34 = ObjectAnimator.ofFloat(this, "exitTransition", fArr20);
                    objectAnimatorOfFloat34.setDuration(this.messageTransitionIsRunning ? 220L : 360L);
                    this.messageTextTranslationX = 0.0f;
                    updateMessageTextParams();
                    ObjectAnimator objectAnimatorOfFloat35 = ObjectAnimator.ofFloat(this.messageEditText, (Property<AnonymousClass50, Float>) property4, 1.0f);
                    objectAnimatorOfFloat35.setStartDelay(this.emojiButtonPaddingAlpha == 1.0f ? 150L : 450L);
                    objectAnimatorOfFloat35.setDuration(200L);
                    this.runningAnimationAudio.playTogether(animatorSet17, animatorSet18, objectAnimatorOfFloat35, objectAnimatorOfFloat34);
                }
                r6 = 0;
            }
            this.runningAnimationAudio.addListener(new AnonymousClass70(this, i, r6));
            this.runningAnimationAudio.start();
            TimerView timerView4 = this.recordTimerView;
            if (timerView4 != null) {
                timerView4.stop();
            }
        }
        this.delegate.onAudioVideoInterfaceUpdated();
        updateSendAsButton(true);
        this.lastRecordState = i;
    }

    public final void updateRecordedDeleteIconColors() {
        int themedColor$6 = getThemedColor$6(Theme.key_chat_recordedVoiceDot);
        int themedColor$7 = getThemedColor$6(Theme.key_chat_messagePanelBackground);
        int themedColor$8 = getThemedColor$6(Theme.key_chat_messagePanelVoiceDelete);
        RLottieImageView rLottieImageView = this.recordDeleteImageView;
        if (rLottieImageView != null) {
            rLottieImageView.setLayerColor(themedColor$6, "Cup Red");
            this.recordDeleteImageView.setLayerColor(themedColor$6, "Box Red");
            this.recordDeleteImageView.setLayerColor(themedColor$8, "Cup Grey");
            this.recordDeleteImageView.setLayerColor(themedColor$8, "Box Grey");
            this.recordDeleteImageView.setLayerColor(themedColor$7, "Line 1");
            this.recordDeleteImageView.setLayerColor(themedColor$7, "Line 2");
            this.recordDeleteImageView.setLayerColor(themedColor$7, "Line 3");
        }
    }

    public final void updateRichDraftPreview() {
        RichMessageLayout.PreviewView previewView = this.richDraftPreview;
        if (previewView == null) {
            return;
        }
        boolean z = this.richDraftActive;
        boolean z2 = this.richDraftMessage != null && this.editingMessageObject == null;
        this.richDraftActive = z2;
        AnonymousClass27 anonymousClass27 = this.sendButton;
        ImageView imageView = this.deleteRichDraftButton;
        AnonymousClass17 anonymousClass17 = this.emojiButton;
        if (z2) {
            previewView.setResourcesProvider(this.resourcesProvider);
            this.richDraftPreview.set(this.richDraftMessage);
            this.richDraftPreview.setVisibility(0);
            AnonymousClass50 anonymousClass50 = this.messageEditText;
            if (anonymousClass50 != null) {
                anonymousClass50.setVisibility(8);
            }
            anonymousClass17.setVisibility(8);
            imageView.setVisibility(0);
            anonymousClass27.setLocked(!UserConfig.getInstance(this.currentAccount).isPremium());
        } else {
            previewView.setVisibility(8);
            AnonymousClass50 anonymousClass51 = this.messageEditText;
            if (anonymousClass51 != null) {
                anonymousClass51.setVisibility(0);
            }
            anonymousClass17.setVisibility(0);
            imageView.setVisibility(8);
            anonymousClass27.setLocked(false);
        }
        updateButtons();
        if (z != this.richDraftActive) {
            checkSendButton(true);
        }
    }

    public final void updateScheduleButton(boolean z) {
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i = 3;
        boolean zIsChatDialog = DialogObject.isChatDialog(this.dialog_id);
        ImageView imageView = this.notifyButton;
        if (zIsChatDialog) {
            TLRPC.Chat chat = this.accountInstance.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
            this.silent = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("silent_" + this.dialog_id, false);
            z2 = ChatObject.isChannel(chat) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages)) && !chat.megagroup;
            this.canWriteToChannel = z2;
            if (imageView != null) {
                if (this.notifySilentDrawable == null) {
                    this.notifySilentDrawable = new CrossOutDrawable(getContext(), R.drawable.input_notify_on, Theme.key_glass_defaultIcon);
                }
                this.notifySilentDrawable.setCrossOut(this.silent, false);
                imageView.setImageDrawable(this.notifySilentDrawable);
            } else {
                z2 = false;
            }
            GLIconSettingsView gLIconSettingsView = this.attachLayout;
            if (gLIconSettingsView != null) {
                updateFieldRight(gLIconSettingsView.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z2 = false;
        }
        boolean z3 = (this.delegate == null || isInScheduleMode() || !this.delegate.hasScheduledMessages()) ? false : true;
        boolean z4 = (!z3 || this.scheduleButtonHidden || this.recordingAudioVideo) ? false : true;
        if (z4) {
            createScheduledButton();
        }
        AnonymousClass29 anonymousClass29 = this.scheduledButton;
        if (anonymousClass29 != null) {
            if ((anonymousClass29.getTag() != null && z4) || (this.scheduledButton.getTag() == null && !z4)) {
                if (imageView != null) {
                    int i2 = (z3 || !z2 || this.scheduledButton.getVisibility() == 0) ? 8 : 0;
                    if (i2 != imageView.getVisibility()) {
                        imageView.setVisibility(i2);
                        return;
                    }
                    return;
                }
                return;
            }
            this.scheduledButton.setTag(z4 ? 1 : null);
        } else if (imageView != null) {
            int i3 = (z3 || !z2) ? 8 : 0;
            if (i3 != imageView.getVisibility()) {
                imageView.setVisibility(i3);
            }
        }
        AnimatorSet animatorSet = this.scheduledButtonAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.scheduledButtonAnimation = null;
        }
        if (z && !z2) {
            AnonymousClass29 anonymousClass210 = this.scheduledButton;
            if (anonymousClass210 != null) {
                if (z4) {
                    anonymousClass210.setVisibility(0);
                }
                this.scheduledButton.setPivotX(AndroidUtilities.dp(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.scheduledButtonAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.scheduledButton, (Property<AnonymousClass29, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.scheduledButton, (Property<AnonymousClass29, Float>) View.SCALE_X, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.scheduledButton, (Property<AnonymousClass29, Float>) View.SCALE_Y, z4 ? 1.0f : 0.1f));
                this.scheduledButtonAnimation.setDuration(180L);
                this.scheduledButtonAnimation.addListener(new AnonymousClass31(this, z4, i));
                this.scheduledButtonAnimation.start();
                return;
            }
            return;
        }
        AnonymousClass29 anonymousClass211 = this.scheduledButton;
        if (anonymousClass211 == null) {
            if (imageView != null) {
                imageView.setVisibility(z2 ? 0 : 8);
                return;
            }
            return;
        }
        anonymousClass211.setVisibility(z4 ? 0 : 8);
        this.scheduledButton.setAlpha(z4 ? 1.0f : 0.0f);
        this.scheduledButton.setScaleX(z4 ? 1.0f : 0.1f);
        this.scheduledButton.setScaleY(z4 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z2 || this.scheduledButton.getVisibility() == 0) ? 8 : 0);
        }
        this.scheduledButton.setTranslationX(0.0f);
    }

    public void updateSendAsButton(boolean z) {
        updateSendAsButton(false, z);
    }

    public final void updateSendButtonPaid() {
        int tierOption;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= (long) getMessagesCount();
        }
        if (this.paidMessagesPrice != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.paidMessagesPrice = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            if (starsPrice > 0 || this.isLiveComment) {
                setStarsPrice(1, starsPrice, true);
            }
            updateFieldRight(this.lastAttachVisible);
        }
        if (this.isLiveComment) {
            createCaptionLimitView();
            if (areLiveCommentsFree()) {
                int[] iArr = MessagesController.getInstance(this.currentAccount).starsGroupcallMessageLimits;
                tierOption = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                tierOption = HighlightMessageSheet.getTierOption(this.currentAccount, (int) starsPrice, 1);
            }
            if (this.currentLimit != tierOption) {
                this.currentLimit = tierOption;
                if (tierOption > 0) {
                    int i = tierOption - this.codePointCount;
                    if (i <= (this.isLiveComment ? 5 : 100)) {
                        if (i < -9999) {
                            i = -9999;
                        }
                        createCaptionLimitView();
                        NumberTextView numberTextView = this.captionLimitView;
                        numberTextView.setNumber(i, numberTextView.getVisibility() == 0);
                        if (this.captionLimitView.getVisibility() != 0) {
                            this.captionLimitView.setVisibility(0);
                            this.captionLimitView.setAlpha(0.0f);
                            this.captionLimitView.setScaleX(0.5f);
                            this.captionLimitView.setScaleY(0.5f);
                        }
                        this.captionLimitView.animate().setListener(null).cancel();
                        this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.captionLimitView.setTextColor(getThemedColor$6(i < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.captionLimitView;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnonymousClass28(this, 0));
                }
            }
        }
    }

    public final void updateSlowModeText() {
        int i;
        boolean zIsUploadingMessageIdDialog;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        AndroidUtilities.cancelRunOnUIThread(this.updateSlowModeRunnable);
        this.updateSlowModeRunnable = null;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null || chatFull.slowmode_seconds == 0 || chatFull.slowmode_next_send_date > currentTime || !((zIsUploadingMessageIdDialog = SendMessagesHelper.getInstance(this.currentAccount).isUploadingMessageIdDialog(this.dialog_id)) || SendMessagesHelper.getInstance(this.currentAccount).isSendingMessageIdDialog(this.dialog_id))) {
            int i2 = this.slowModeTimer;
            if (i2 >= 2147483646) {
                if (this.info != null) {
                    this.accountInstance.getMessagesController().loadFullChat(this.info.id, 0, true);
                }
                i = 0;
            } else {
                i = i2 - currentTime;
            }
        } else if (ChatObject.hasAdminRights(this.accountInstance.getMessagesController().getChat(Long.valueOf(this.info.id))) || ChatObject.isIgnoredChatRestrictionsForBoosters(this.info)) {
            i = 0;
        } else {
            i = this.info.slowmode_seconds;
            this.slowModeTimer = zIsUploadingMessageIdDialog ? Integer.MAX_VALUE : 2147483646;
        }
        if (this.slowModeTimer == 0 || i <= 0) {
            this.slowModeTimer = 0;
        } else {
            String durationNoHours = AndroidUtilities.formatDurationNoHours(Math.max(1, i), false);
            SlowModeBtn slowModeBtn = this.slowModeButton;
            slowModeBtn.textView.setText(durationNoHours, false);
            slowModeBtn.invalidate();
            ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
            if (chatActivityEnterViewDelegate != null) {
                chatActivityEnterViewDelegate.onUpdateSlowModeButton(slowModeBtn.textView.getText(), slowModeBtn, false);
            }
            ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 11);
            this.updateSlowModeRunnable = chatActivityEnterView$$ExternalSyntheticLambda4;
            AndroidUtilities.runOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4, 100L);
        }
        if (isInScheduleMode()) {
            return;
        }
        checkSendButton(true);
    }

    @Override
    public EditTextCaption getEditField() {
        return this.messageEditText;
    }

    @Override
    public ChatActivity getParentFragment() {
        return this.parentFragment;
    }

    public final void setBotInfo(LongSparseArray longSparseArray, boolean z) {
        this.lastBotInfo = longSparseArray;
        if (longSparseArray.size() == 1 && ((TL_bots.BotInfo) longSparseArray.valueAt(0)).user_id == this.dialog_id) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) longSparseArray.valueAt(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.botMenuWebViewTitle = tL_botMenuButton.text;
                this.botMenuWebViewUrl = tL_botMenuButton.url;
                this.botMenuButtonType = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.botMenuButtonType = 1;
            } else {
                this.botMenuButtonType = 2;
            }
        } else {
            this.botMenuButtonType = 1;
        }
        BotCommandsMenuView.BotCommandsAdapter botCommandsAdapter = this.botCommandsAdapter;
        if (botCommandsAdapter != null) {
            botCommandsAdapter.setBotInfo(longSparseArray);
        }
        updateBotButton(z);
        checkIsEphemeralMessage(z);
    }

    public final void setButtons(MessageObject messageObject, boolean z, boolean z2) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z3;
        AnonymousClass50 anonymousClass50;
        MessageObject messageObject2 = this.replyingMessageObject;
        if (messageObject2 != null && messageObject2 == this.botButtonsMessageObject && messageObject2 != messageObject) {
            this.botMessageObject = messageObject;
            return;
        }
        MessageObject messageObject3 = this.botButtonsMessageObject;
        if (messageObject3 == null || messageObject3 != messageObject) {
            if (messageObject3 == null && messageObject == null) {
                return;
            }
            if (this.botKeyboardView == null) {
                AnonymousClass75 anonymousClass75 = new AnonymousClass75(this.parentActivity, this.resourcesProvider);
                this.botKeyboardView = anonymousClass75;
                anonymousClass75.setVisibility(8);
                this.botKeyboardViewVisible = false;
                this.botKeyboardView.setDelegate(new ChatActivityEnterView$$ExternalSyntheticLambda30(this));
                this.viewParentForEmojiView.addView(this.botKeyboardView);
            }
            this.botButtonsMessageObject = messageObject;
            if (messageObject != null) {
                TLRPC.ReplyMarkup replyMarkup = messageObject.messageOwner.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                } else {
                    tL_replyKeyboardMarkup = null;
                }
            } else {
                tL_replyKeyboardMarkup = null;
            }
            this.botReplyMarkup = tL_replyKeyboardMarkup;
            AnonymousClass75 anonymousClass76 = this.botKeyboardView;
            Point point = AndroidUtilities.displaySize;
            anonymousClass76.setPanelHeight(point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight);
            if (this.botReplyMarkup != null) {
                SharedPreferences mainSettings = MessagesController.getMainSettings(this.currentAccount);
                if (this.botButtonsMessageObject != this.replyingMessageObject && messageObject != null) {
                    if (this.botReplyMarkup.single_use) {
                        if (mainSettings.getInt("answered_" + getTopicKeyString(), 0) != messageObject.getId()) {
                            if (!this.botReplyMarkup.is_persistent) {
                                StringBuilder sb = new StringBuilder("closed_botkeyboard_");
                                sb.append(getTopicKeyString());
                                if (mainSettings.getInt(sb.toString(), 0) != messageObject.getId()) {
                                }
                            }
                        }
                    } else {
                        if (!this.botReplyMarkup.is_persistent) {
                            StringBuilder sb2 = new StringBuilder("closed_botkeyboard_");
                            sb2.append(getTopicKeyString());
                            z3 = mainSettings.getInt(sb2.toString(), 0) != messageObject.getId();
                        }
                    }
                }
                boolean z4 = z ? z3 : false;
                this.botKeyboardView.setButtons(this.botReplyMarkup);
                if (z4 && (((anonymousClass50 = this.messageEditText) == null || anonymousClass50.length() == 0) && !isPopupShowing())) {
                    showPopup(1, 1, true, true);
                }
            } else if (isPopupShowing() && this.currentPopupContentType == 1) {
                if (z2) {
                    this.clearBotButtonsOnKeyboardOpen = true;
                    openKeyboardInternal();
                } else {
                    showPopup(0, 1, true, true);
                }
            }
            updateBotButton(true);
        }
    }

    public final void setFieldText(CharSequence charSequence, boolean z) {
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null) {
            return;
        }
        this.ignoreTextChange = true;
        anonymousClass50.setText(charSequence);
        this.messageEditText.invalidateQuotes(true);
        AnonymousClass50 anonymousClass51 = this.messageEditText;
        anonymousClass51.setSelection(anonymousClass51.getText().length());
        this.ignoreTextChange = false;
        ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = this.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onTextChanged(this.messageEditText.getText(), true, z);
        }
    }

    public final void showTopView(boolean z, boolean z2) {
        if (this.topView == null || this.topViewShowed || getVisibility() != 0) {
            AnonymousClass35 anonymousClass35 = this.recordedAudioPanel;
            if ((anonymousClass35 == null || anonymousClass35.getVisibility() != 0) && !this.forceShowSendButton && this.replyingQuote == null && this.replyingMessageObject == null) {
                openKeyboard();
                return;
            }
            return;
        }
        AnonymousClass35 anonymousClass36 = this.recordedAudioPanel;
        boolean z3 = (anonymousClass36 == null || anonymousClass36.getVisibility() != 0) && !this.forceShowSendButton && this.replyingQuote == null && (this.botReplyMarkup == null || this.editingMessageObject != null);
        if (!z2 && z && z3 && !this.keyboardVisible && !isPopupShowing()) {
            openKeyboard();
            ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = this.showTopViewRunnable;
            if (chatActivityEnterView$$ExternalSyntheticLambda4 != null) {
                AndroidUtilities.cancelRunOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4);
            }
            ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda5 = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 20);
            this.showTopViewRunnable = chatActivityEnterView$$ExternalSyntheticLambda5;
            AndroidUtilities.runOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda5, 200L);
            return;
        }
        this.needShowTopView = true;
        this.topViewShowed = true;
        if (this.allowShowTopView) {
            this.animatorTopViewVisibility.setValue(true, z);
            if (z3) {
                AnonymousClass50 anonymousClass50 = this.messageEditText;
                if (anonymousClass50 != null) {
                    anonymousClass50.requestFocus();
                }
                openKeyboard();
            }
        }
    }

    public final void updateSendAsButton(boolean z, boolean z2) {
        TLRPC.Chat chat;
        TLRPC.Peer defaultSendAs;
        float f;
        float f2;
        SenderSelectView senderSelectView;
        SenderSelectView senderSelectView2;
        AnonymousClass35 anonymousClass35;
        if (this.delegate == null) {
            return;
        }
        createMessageEditText();
        if (this.isLiveComment) {
            defaultSendAs = this.delegate.getDefaultSendAs();
            chat = null;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialog_id));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialog_id);
            if (chatFull != null) {
                TLRPC.Peer peer = chatFull.default_send_as;
                chat = chat2;
                defaultSendAs = peer;
            } else {
                chat = chat2;
                defaultSendAs = null;
            }
        }
        if (defaultSendAs == null && this.delegate.getSendAsPeers() != null && !this.delegate.getSendAsPeers().peers.isEmpty()) {
            defaultSendAs = this.delegate.getSendAsPeers().peers.get(0).peer;
        }
        ChatActivity chatActivity = this.parentFragment;
        boolean z3 = (z || defaultSendAs == null || (this.delegate.getSendAsPeers() != null && this.delegate.getSendAsPeers().peers.size() <= 1) || isEditingMessage() || isRecordingAudioVideo() || (((anonymousClass35 = this.recordedAudioPanel) != null && anonymousClass35.getVisibility() == 0) || ((!this.isLiveComment && ((ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canSendAsPeers(chat)) || ChatObject.isMonoForum(chat))) || (chatActivity != null && chatActivity.chatMode == 9)))) ? false : true;
        if (z3) {
            createSenderSelectView();
        }
        if (defaultSendAs != null) {
            if (defaultSendAs.channel_id != 0) {
                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(defaultSendAs.channel_id));
                if (chat3 != null && (senderSelectView2 = this.senderSelectView) != null) {
                    senderSelectView2.setAvatar(chat3);
                    this.senderSelectView.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, chat3.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(defaultSendAs.user_id));
                if (user != null && (senderSelectView = this.senderSelectView) != null) {
                    senderSelectView.setAvatar(user);
                    this.senderSelectView.setContentDescription(LocaleController.formatString(R.string.AccDescrSendAs, ContactsController.formatName(user.first_name, user.last_name)));
                }
            }
        }
        SenderSelectView senderSelectView3 = this.senderSelectView;
        boolean z4 = senderSelectView3 != null && senderSelectView3.getVisibility() == 0;
        int iDp = AndroidUtilities.dp(2.0f);
        float f3 = z3 ? 0.0f : 1.0f;
        final float f4 = z3 ? 1.0f : 0.0f;
        SenderSelectView senderSelectView4 = this.senderSelectView;
        if (senderSelectView4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) senderSelectView4.getLayoutParams();
            f2 = z3 ? ((-this.senderSelectView.getLayoutParams().width) - marginLayoutParams.leftMargin) - iDp : 0.0f;
            f = z3 ? 0.0f : ((-this.senderSelectView.getLayoutParams().width) - marginLayoutParams.leftMargin) - iDp;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (z4 == z3) {
            return;
        }
        SenderSelectView senderSelectView5 = this.senderSelectView;
        ValueAnimator valueAnimator = senderSelectView5 == null ? null : (ValueAnimator) senderSelectView5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.senderSelectView.setTag(null);
        }
        if ((this.isLiveComment || (chatActivity != null && chatActivity.getOtherSameChatsDiff() == 0 && chatActivity.fragmentOpened)) && z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            SenderSelectView senderSelectView6 = this.senderSelectView;
            if (senderSelectView6 != null) {
                senderSelectView6.setTranslationX(f2);
            }
            this.messageTextTranslationX = f2;
            updateMessageTextParams();
            final float f5 = f3;
            final float f6 = f2;
            final float f7 = f;
            duration.addUpdateListener(new ChartPickerDelegate$$ExternalSyntheticLambda0(this, f6, f, f5, f4, 2));
            final boolean z5 = z3;
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationCancel(Animator animator) {
                    float translationX;
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    boolean z6 = z5;
                    if (z6) {
                        int i = ChatActivityEnterView.$r8$clinit;
                        chatActivityEnterView.createSenderSelectView();
                    }
                    SenderSelectView senderSelectView7 = chatActivityEnterView.senderSelectView;
                    if (senderSelectView7 != null) {
                        senderSelectView7.setVisibility(z6 ? 0 : 8);
                        chatActivityEnterView.senderSelectView.setAlpha(f4);
                        chatActivityEnterView.senderSelectView.setTranslationX(f7);
                        translationX = chatActivityEnterView.senderSelectView.getTranslationX();
                    } else {
                        translationX = 0.0f;
                    }
                    chatActivityEnterView.emojiButton.setTranslationX(translationX);
                    chatActivityEnterView.messageTextTranslationX = translationX;
                    chatActivityEnterView.updateMessageTextParams();
                    chatActivityEnterView.requestLayout();
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    if (z5) {
                        return;
                    }
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    SenderSelectView senderSelectView7 = chatActivityEnterView.senderSelectView;
                    if (senderSelectView7 != null) {
                        senderSelectView7.setVisibility(8);
                    }
                    chatActivityEnterView.emojiButton.setTranslationX(0.0f);
                    chatActivityEnterView.messageTextTranslationX = 0.0f;
                    chatActivityEnterView.updateMessageTextParams();
                }

                @Override
                public final void onAnimationStart(Animator animator) {
                    float translationX;
                    boolean z6 = z5;
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    if (z6) {
                        int i = ChatActivityEnterView.$r8$clinit;
                        chatActivityEnterView.createSenderSelectView();
                        chatActivityEnterView.senderSelectView.setVisibility(0);
                    }
                    SenderSelectView senderSelectView7 = chatActivityEnterView.senderSelectView;
                    if (senderSelectView7 != null) {
                        senderSelectView7.setAlpha(f5);
                        chatActivityEnterView.senderSelectView.setTranslationX(f6);
                        translationX = chatActivityEnterView.senderSelectView.getTranslationX();
                    } else {
                        translationX = 0.0f;
                    }
                    chatActivityEnterView.emojiButton.setTranslationX(translationX);
                    chatActivityEnterView.messageTextTranslationX = translationX;
                    chatActivityEnterView.updateMessageTextParams();
                    BotCommandsMenuView botCommandsMenuView = chatActivityEnterView.botCommandsMenuButton;
                    if (botCommandsMenuView == null || botCommandsMenuView.getTag() != null) {
                        return;
                    }
                    chatActivityEnterView.animationParamsX.clear();
                }
            });
            duration.start();
            SenderSelectView senderSelectView7 = this.senderSelectView;
            if (senderSelectView7 != null) {
                senderSelectView7.setTag(duration);
                return;
            }
            return;
        }
        float f8 = f;
        boolean z6 = z3;
        if (z6) {
            createSenderSelectView();
        }
        SenderSelectView senderSelectView8 = this.senderSelectView;
        if (senderSelectView8 != null) {
            senderSelectView8.setVisibility(z6 ? 0 : 8);
            this.senderSelectView.setTranslationX(f8);
        }
        float f9 = z6 ? f8 : 0.0f;
        setTranslationX(f9);
        this.messageTextTranslationX = f9;
        updateMessageTextParams();
        SenderSelectView senderSelectView9 = this.senderSelectView;
        if (senderSelectView9 != null) {
            senderSelectView9.setAlpha(f4);
            this.senderSelectView.setTag(null);
        }
    }

    public void setFieldFocused(boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.parentActivity.getSystemService("accessibility");
        if (this.messageEditText == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z && BaseFragment.hasSheets(this.parentFragment)) {
            z = false;
        }
        if (z) {
            if (this.searchingType != 0 || this.messageEditText.isFocused()) {
                return;
            }
            ChatActivityEnterView$$ExternalSyntheticLambda4 chatActivityEnterView$$ExternalSyntheticLambda4 = new ChatActivityEnterView$$ExternalSyntheticLambda4(this, 8);
            this.focusRunnable = chatActivityEnterView$$ExternalSyntheticLambda4;
            AndroidUtilities.runOnUIThread(chatActivityEnterView$$ExternalSyntheticLambda4, 600L);
            return;
        }
        AnonymousClass50 anonymousClass50 = this.messageEditText;
        if (anonymousClass50 == null || !anonymousClass50.isFocused()) {
            return;
        }
        if (!this.keyboardVisible || this.isPaused) {
            this.messageEditText.clearFocus();
        }
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        MessageObject messageObject;
        AnonymousClass50 anonymousClass50;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z2;
        View view;
        int i2;
        int i3;
        WindowInsetsInAppController windowInsetsInAppController;
        if (this.searchingType != 0) {
            this.lastSizeChangeValue1 = i;
            this.lastSizeChangeValue2 = z;
            this.keyboardVisible = i > 0;
            checkBotMenu();
            return;
        }
        if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (this.keyboardVisible && this.emojiViewVisible && this.emojiView == null) {
            this.emojiViewVisible = false;
        }
        boolean zIsPopupShowing = isPopupShowing();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        ChatActivity chatActivity = this.parentFragment;
        if (zIsPopupShowing) {
            int iMin = z ? this.keyboardHeightLand : this.keyboardHeight;
            if (chatActivity != null && chatActivity.getParentLayout() != null) {
                iMin -= ((ActionBarLayout) chatActivity.getParentLayout()).getBottomTabsHeight(false);
            }
            if (this.currentPopupContentType == 1) {
                AnonymousClass75 anonymousClass75 = this.botKeyboardView;
                if (!anonymousClass75.isFullSize) {
                    iMin = Math.min(anonymousClass75.getKeyboardHeight(), iMin);
                }
            }
            int i4 = this.currentPopupContentType;
            if (i4 == 0) {
                view = this.emojiView;
            } else {
                view = i4 == 1 ? this.botKeyboardView : null;
            }
            AnonymousClass75 anonymousClass76 = this.botKeyboardView;
            if (anonymousClass76 != null) {
                anonymousClass76.setPanelHeight(iMin);
                WindowInsetsInAppController windowInsetsInAppController2 = this.windowInsetsInAppController;
                if (windowInsetsInAppController2 != null && iMin > 0 && this.currentPopupContentType == 1) {
                    if (iMin > 0) {
                        int i5 = AndroidUtilities.navigationBarHeight + iMin;
                        WindowInsetsStateHolder windowInsetsStateHolder = (WindowInsetsStateHolder) windowInsetsInAppController2;
                        if (windowInsetsStateHolder.inAppKeyboardHeight != i5 || windowInsetsStateHolder.inAppKeyboardState != 0) {
                            AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder.closeInAppKeyboard);
                            windowInsetsStateHolder.inAppKeyboardViewHeight = Math.max(windowInsetsStateHolder.inAppKeyboardHeight, i5);
                            windowInsetsStateHolder.inAppKeyboardHeight = i5;
                            windowInsetsStateHolder.inAppKeyboardState = 0;
                            windowInsetsStateHolder.setInsets(windowInsetsStateHolder.lastInsets);
                        }
                    } else {
                        ((WindowInsetsStateHolder) windowInsetsInAppController2).resetInAppKeyboardHeight(true);
                    }
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.closeAnimationInProgress && !this.stickersExpanded && (((i2 = layoutParams.width) != (i3 = AndroidUtilities.displaySize.x) || layoutParams.height != iMin) && ((windowInsetsInAppController = this.windowInsetsInAppController) == null || i2 != -1 || layoutParams.height != -1))) {
                    if (windowInsetsInAppController == null) {
                        layoutParams.width = i3;
                        layoutParams.height = iMin;
                        view.setLayoutParams(layoutParams);
                    }
                    if (sizeNotifierFrameLayout != null) {
                        int i6 = this.emojiPadding;
                        this.emojiPadding = layoutParams.height;
                        sizeNotifierFrameLayout.requestLayout();
                        onWindowSizeChanged();
                        if (this.smoothKeyboard && !this.keyboardVisible && i6 != this.emojiPadding && pannelAnimationEnabled()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.panelAnimation = animatorSet;
                            if (this.windowInsetsInAppController != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.emojiPadding - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.emojiPadding - i6, 0.0f));
                            }
                            this.panelAnimation.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                            this.panelAnimation.setDuration(250L);
                            this.panelAnimation.addListener(new AnonymousClass28(this, 12));
                            AndroidUtilities.runOnUIThread(this.runEmojiPanelAnimation, 50L);
                            this.notificationsLocker.lock();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            onWindowSizeChanged();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        this.keyboardVisible = i > 0;
        checkBotMenu();
        if (this.keyboardVisible && isPopupShowing() && this.stickersExpansionAnim == null) {
            showPopup(0, this.currentPopupContentType, true, true);
        } else if (!this.keyboardVisible && !isPopupShowing() && (messageObject = this.botButtonsMessageObject) != null && this.replyingMessageObject != messageObject && !hasBotWebView() && !botCommandsMenuIsShowing() && !BaseFragment.hasSheets(chatActivity) && (((anonymousClass50 = this.messageEditText) == null || TextUtils.isEmpty(anonymousClass50.getText())) && (tL_replyKeyboardMarkup = this.botReplyMarkup) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            AdjustPanLayoutHelper adjustPanLayoutHelper = sizeNotifierFrameLayout.adjustPanLayoutHelper;
            if (adjustPanLayoutHelper.animationInProgress) {
                adjustPanLayoutHelper.stopTransition();
            } else {
                adjustPanLayoutHelper.ignoreOnce = true;
            }
            showPopup(1, 1, false, true);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !isPopupShowing()) {
            this.emojiPadding = 0;
            sizeNotifierFrameLayout.requestLayout();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            if (this.clearBotButtonsOnKeyboardOpen) {
                this.clearBotButtonsOnKeyboardOpen = false;
                this.botKeyboardView.setButtons(this.botReplyMarkup);
            }
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        onWindowSizeChanged();
    }
}
