package org.telegram.ui.iv;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.appcompat.widget.TooltipPopup;
import androidx.core.graphics.Insets;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.ScrollFeedbackProviderCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManagerViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.ogg.OggSeeker;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzru;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.gson.internal.ObjectConstructor;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.nl.languageid.bundled.internal.zbb;
import com.stripe.android.time.Clock;
import io.noties.markwon.html.HtmlTagImpl;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedConfig$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.fingerprint.FingerprintManagerCompat;
import org.telegram.messenger.video.remix.AudioRemixer;
import org.telegram.messenger.video.resample.AudioResampler;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AiButtonDrawable;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GLIconSettingsView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda133;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.QrActivity;
import org.telegram.ui.ShareActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda28;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.web.MHTML;

public final class RichEditor extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ImageView addButton;
    public ImageView aiButton;
    public Button aiStyleButton;
    public ChatActivity.AnonymousClass39 animateEnterView;
    public int[] animateEnterViewFrom;
    public int[] animateEnterViewTo;
    public RectF animateFromRect;
    public BlurredBackgroundDrawable animateInputBackground;
    public ChatInputViewsContainer animateInputView;
    public float animateOpenProgress;
    public boolean animatingOpen;
    public ImageView backButton;
    public final ArrayList blockButtons;
    public LinearLayout blocksLayout;
    public AnonymousClass4 blocksScrollView;
    public FrameLayout bottomContainer;
    public View bottomGradient;
    public FrameLayout bottomInnerContainer;
    public int bottomInset;
    public LinearLayout bottomPanel;
    public int bottomPanelType;
    public FrameLayout bulletinContainer;
    public ChatActivity chatActivity;
    public TooltipPopup commandSuggestions;
    public AnonymousClass2 container;
    public boolean convertToSimpleOnOpen;
    public ItemOptions currentMenuVisible;
    public Button dateButton;
    public MessageObject editingMessageObject;
    public ChatActivityEnterViewAnimatedIconView emojiButton;
    public int emojiPadding;
    public ValueAnimator emojiSearchAnimator;
    public boolean emojiSearchOpened;
    public float emojiSearchProgress;
    public RichEditText emojiTargetEditText;
    public int emojiTargetSelection;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public final ArrayList formattingButtons;
    public LinearLayout formattingLayout1;
    public LinearLayout formattingLayout2;
    public LinearLayout formattingLayout3;
    public PhotoViewer.AnonymousClass35 formattingPanel;
    public LinearLayout formattingPanelLayout;
    public int formattingScrollMaxWidth;
    public AnonymousClass7 formattingScrollView;
    public LinearLayout historyButtons;
    public int imeInset;
    public final String initialHtml;
    public CharSequence initialHtmlAfter;
    public CharSequence initialHtmlBefore;
    public final TL_iv.RichMessage initialRichMessage;
    public int initialSelectionEnd;
    public int initialSelectionStart;
    public final Editable initialText;
    public Button inlineButton;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public boolean keyboardVisible;
    public final Runnable limitCheckRunnable;
    public Button linkButton;
    public RichEditorListView listView;
    public final int[] location;
    public Button mathButton;
    public MessageSendPreview messageSendPreview;
    public Runnable onClearedCallback;
    public Runnable onSentCallback;
    public RichEditor$$ExternalSyntheticLambda52 pendingSend;
    public boolean persistedDraftOnEnd;
    public final ArrayList premiumButtons;
    public Button quoteButton;
    public ImageView redoButton;
    public int reorderSavedPanelType;
    public AnonymousClass9 sendButton;
    public boolean sendButtonLoading;
    public boolean sent;
    public LoginActivity$$ExternalSyntheticLambda10 sizeDelegate;
    public final Rect tempRect;
    public View topGradient;
    public FrameLayout topPanel;
    public boolean trashHovered;
    public FrameLayout trashPanel;
    public RLottieImageView trashPanelIcon;
    public ImageView undoButton;

    public class AnonymousClass12 implements MenuPresenter.Callback, ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl, ViewModelProvider$Factory, Factory, OggSeeker, MediaChunkIterator, DynamiteModule.VersionPolicy, Continuation, StackTraceTrimmingStrategy, ObjectConstructor, ComponentFactory, FingerprintManagerCompat.FingerprintManagerCompatImpl, AudioRemixer, AudioResampler, SeekBarView.SeekBarViewDelegate, ChatMessageCell.ChatMessageCellDelegate, ChatAttachAlert.ChatAttachViewDelegate {
        public static AnonymousClass12 zza;
        public final int $r8$classId;

        public AnonymousClass12(int i) {
            this.$r8$classId = i;
        }

        public static String replace(HtmlTagImpl htmlTagImpl) {
            String str = htmlTagImpl.name;
            if ("br".equals(str)) {
                return "\n";
            }
            if ("img".equals(str)) {
                String str2 = (String) htmlTagImpl.attributes().get("alt");
                return (str2 == null || str2.length() == 0) ? "￼" : str2;
            }
            if ("iframe".equals(str)) {
                return " ";
            }
            return null;
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
            return false;
        }

        @Override
        public boolean canPerformReply() {
            return false;
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
        public Object construct() {
            switch (this.$r8$classId) {
                case 17:
                    return new LinkedHashSet();
                default:
                    return new TreeMap();
            }
        }

        @Override
        public Object create(MHTML mhtml) {
            switch (this.$r8$classId) {
                case 19:
                    return new MlKitThreadPool();
                case 20:
                    synchronized (AppCompatHintHelper.class) {
                        byte b = (byte) (((byte) 1) | 2);
                        try {
                            if (b != 3) {
                                StringBuilder sb = new StringBuilder();
                                if ((b & 1) == 0) {
                                    sb.append(" enableFirelog");
                                }
                                if ((b & 2) == 0) {
                                    sb.append(" firelogEventType");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            AppCompatHintHelper.zza(new zzru());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return new Clock(1);
                default:
                    return new zbb();
            }
        }

        @Override
        public SeekMap createSeekMap() {
            return new SeekMap.Unseekable(-9223372036854775807L, 0L);
        }

        @Override
        public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        @Override
        public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat) {
            return false;
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
        public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user) {
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
        public boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
            return false;
        }

        @Override
        public void didPressAppUpdateButton() {
        }

        @Override
        public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        }

        @Override
        public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        }

        @Override
        public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
        }

        @Override
        public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
        }

        @Override
        public void didPressCommentButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
        }

        @Override
        public void didPressEffect(ChatMessageCell chatMessageCell) {
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
        public void didPressGiveawayChatButton(int i, ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressGroupImage(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        }

        @Override
        public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressHint(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
        }

        @Override
        public void didPressInstantButton(int i, ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressMoreChannelRecommendations() {
        }

        @Override
        public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public void didPressPollMedia(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        }

        @Override
        public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        }

        @Override
        public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i, float f, float f2, boolean z) {
        }

        @Override
        public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document) {
        }

        @Override
        public void didPressShowMore(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressSideButton(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public void didPressSummarize(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didPressTime() {
        }

        @Override
        public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
            return false;
        }

        @Override
        public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
        }

        @Override
        public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
        }

        @Override
        public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
        }

        @Override
        public void didPressViaBot(String str) {
        }

        @Override
        public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
        }

        @Override
        public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i, int i2, int i3) {
        }

        @Override
        public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
            ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell, str);
        }

        @Override
        public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        }

        @Override
        public void didQuickShareEnd(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
        }

        @Override
        public void didQuickShareStart(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didSelectBot(TLRPC.User user) {
        }

        @Override
        public void didStartVideoStream(MessageObject messageObject) {
        }

        @Override
        public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
        }

        @Override
        public boolean doNotShowLoadingReply(MessageObject messageObject) {
            return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
        }

        @Override
        public void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
            chatAttachAlert$$ExternalSyntheticLambda7.run();
        }

        @Override
        public void drawPollMode(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void forceUpdate(ChatMessageCell chatMessageCell) {
        }

        @Override
        public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell) {
        }

        @Override
        public Object get() {
            Clock clock = new Clock(7);
            HashMap map = new HashMap();
            Priority priority = Priority.DEFAULT;
            Set set = Collections.EMPTY_SET;
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            map.put(priority, new AutoValue_SchedulerConfig_ConfigValue(30000L, 86400000L, set));
            Priority priority2 = Priority.HIGHEST;
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            map.put(priority2, new AutoValue_SchedulerConfig_ConfigValue(1000L, 86400000L, set));
            Priority priority3 = Priority.VERY_LOW;
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig$Flag.DEVICE_IDLE)));
            if (setUnmodifiableSet == null) {
                throw new NullPointerException("Null flags");
            }
            map.put(priority3, new AutoValue_SchedulerConfig_ConfigValue(86400000L, 86400000L, setUnmodifiableSet));
            if (map.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            new HashMap();
            return new AutoValue_SchedulerConfig(clock, map);
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
        public long getChunkEndTimeUs() {
            throw new NoSuchElementException();
        }

        @Override
        public long getChunkStartTimeUs() {
            throw new NoSuchElementException();
        }

        @Override
        public CharSequence getContentDescription() {
            return null;
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
        public int getStepsCount() {
            return 0;
        }

        @Override
        public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
            return null;
        }

        @Override
        public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
            if (stackTraceElementArr.length <= 1024) {
                return stackTraceElementArr;
            }
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
            System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
            System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
            return stackTraceElementArr2;
        }

        @Override
        public boolean hasEnrolledFingerprints(Context context) {
            try {
                FingerprintManager fingerprintManagerM = SharedConfig$$ExternalSyntheticApiModelOutline0.m(context.getSystemService("fingerprint"));
                if (fingerprintManagerM == null) {
                    return false;
                }
                return fingerprintManagerM.hasEnrolledFingerprints();
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
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
        public boolean isHardwareDetected(Context context) {
            try {
                FingerprintManager fingerprintManagerM = SharedConfig$$ExternalSyntheticApiModelOutline0.m(context.getSystemService("fingerprint"));
                if (fingerprintManagerM == null) {
                    return false;
                }
                return fingerprintManagerM.isHardwareDetected();
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public boolean isLandscape() {
            return false;
        }

        @Override
        public boolean isOwner(long j) {
            return false;
        }

        public boolean isPrecomputedText(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }

        @Override
        public boolean isProgressLoading(int i, ChatMessageCell chatMessageCell) {
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
        public boolean needEnterComment() {
            return false;
        }

        @Override
        public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
        }

        @Override
        public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject) {
            return false;
        }

        @Override
        public void needReloadPolls() {
        }

        @Override
        public void needShowPremiumBulletin(int i) {
        }

        @Override
        public boolean next() {
            return false;
        }

        @Override
        public boolean onAccessibilityAction(int i) {
            return false;
        }

        @Override
        public void onCameraOpened() {
        }

        @Override
        public void onDiceFinished() {
        }

        @Override
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            return false;
        }

        @Override
        public void onSeekBarDrag(float f, boolean z) {
            GLIconSettingsView.smallStarsSize = f * 2.0f;
        }

        @Override
        public void onWallpaperSelected(Object obj) {
        }

        @Override
        public void openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
        }

        @Override
        public void openAvatarsSearch() {
        }

        @Override
        public long read(DefaultExtractorInput defaultExtractorInput) {
            return -1L;
        }

        @Override
        public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
            shortBuffer2.put(shortBuffer);
        }

        @Override
        public void resample(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
            if (i > i2) {
                throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
            }
            if (i3 != 1 && i3 != 2) {
                throw new IllegalArgumentException(DiffUtil.m(i3, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int iRemaining = shortBuffer.remaining() / i3;
            int iCeil = ((int) Math.ceil((((double) i2) / ((double) i)) * ((double) iRemaining))) - iRemaining;
            float f = iRemaining;
            float f2 = f / f;
            float f3 = iCeil;
            float f4 = f3 / f3;
            while (iRemaining > 0 && iCeil > 0) {
                if (f2 >= f4) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    iRemaining--;
                    f2 = iRemaining / f;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i3));
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i3));
                    }
                    iCeil--;
                    f4 = iCeil / f3;
                }
            }
        }

        @Override
        public boolean selectItemOnClicking() {
            return false;
        }

        @Override
        public Frame$Metadata selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
            Frame$Metadata frame$Metadata = new Frame$Metadata();
            frame$Metadata.zza = iVersions.zza(context, str);
            int i = 1;
            int iZzb = iVersions.zzb(context, str, true);
            frame$Metadata.zzb = iZzb;
            int i2 = frame$Metadata.zza;
            if (i2 == 0) {
                i2 = 0;
                if (iZzb == 0) {
                    i = 0;
                } else if (iZzb < i2) {
                    i = -1;
                }
            } else if (iZzb < i2) {
                i = -1;
            }
            frame$Metadata.zze = i;
            return frame$Metadata;
        }

        @Override
        public void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
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

        @Override
        public Object then(Task task) {
            if (task.isSuccessful()) {
                return null;
            }
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }

        @Override
        public void videoTimerReached() {
        }

        @Override
        public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
        }

        @Override
        public ViewModel create(Class cls) {
            return new FragmentManagerViewModel(true);
        }

        @Override
        public ViewModel create(Class cls, MutableCreationExtras mutableCreationExtras) {
            return create(cls);
        }

        @Override
        public void onSeekBarPressed() {
        }

        @Override
        public void startSeek(long j) {
        }

        @Override
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        @Override
        public int getRemixedSize(int i, int i2, int i3) {
            return i;
        }

        @Override
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override
        public void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }

    public final class AnonymousClass4 extends HorizontalScrollView {
        public final int $r8$classId;

        public AnonymousClass4(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int mode = View.MeasureSpec.getMode(i);
                    int size = View.MeasureSpec.getSize(i);
                    if (mode != 1073741824) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i2);
                        int measuredWidth = getMeasuredWidth();
                        if (mode == Integer.MIN_VALUE) {
                            measuredWidth = Math.min(measuredWidth, size);
                        }
                        setMeasuredDimension(measuredWidth, getMeasuredHeight());
                    } else {
                        super.onMeasure(i, i2);
                    }
                    break;
                default:
                    int mode2 = View.MeasureSpec.getMode(i);
                    int size2 = View.MeasureSpec.getSize(i);
                    if (mode2 != 1073741824) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i2);
                        int measuredWidth2 = getMeasuredWidth();
                        if (mode2 == Integer.MIN_VALUE) {
                            measuredWidth2 = Math.min(measuredWidth2, size2);
                        }
                        setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                    } else {
                        super.onMeasure(i, i2);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends ViewOutlineProvider {
        public final int $r8$classId;

        public AnonymousClass5(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void getOutline(View view, Outline outline) {
            switch (this.$r8$classId) {
                case 0:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
                case 1:
                    outline.setOval(0, 0, view.getWidth(), view.getHeight());
                    break;
                case 2:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min(view.getWidth(), view.getHeight()) / 2.0f);
                    break;
                case 3:
                    outline.setRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), view.getMeasuredWidth() - AndroidUtilities.dp(1.0f), view.getMeasuredHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
                    break;
                case 4:
                    int i = AndroidUtilities.roundMessageSize;
                    outline.setOval(0, 0, i, i);
                    break;
                case 5:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                    break;
                case 6:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                    break;
                case 7:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + view.getMeasuredHeight(), AndroidUtilities.dpf2(6.0f));
                    break;
                case 8:
                    outline.setOval(0, 0, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
                    break;
                case 9:
                    float fDp = AndroidUtilities.dp(12.0f);
                    outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + fDp), fDp);
                    break;
                case 10:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                    break;
                case 11:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                    break;
                case 12:
                    outline.setRoundRect(0, AndroidUtilities.dp(50.0f), view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
                    break;
                case 13:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                    break;
                case 14:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * AndroidUtilities.dp(4.0f));
                    break;
                case 15:
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    break;
                case 16:
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    break;
                case 17:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                    break;
                case 18:
                    outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(29.0f) + view.getHeight(), AndroidUtilities.dp(29.0f));
                    break;
                case 19:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                    break;
                case 20:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
                case 21:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
                default:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
            }
        }
    }

    public final class AnonymousClass9 extends ChatActivityEnterView.SendButton {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass9(Object obj, Context context, int i, Theme.ResourcesProvider resourcesProvider, int i2) {
            super(i, context, resourcesProvider, true);
            this.$r8$classId = i2;
            this.this$0 = obj;
        }

        @Override
        public boolean isInScheduleMode() {
            ChatActivity chatActivity;
            switch (this.$r8$classId) {
                case 0:
                    RichEditor richEditor = (RichEditor) this.this$0;
                    return richEditor.editingMessageObject == null && (chatActivity = richEditor.chatActivity) != null && chatActivity.isInScheduleMode();
                default:
                    return super.isInScheduleMode();
            }
        }

        @Override
        public boolean isInactive() {
            switch (this.$r8$classId) {
                case 1:
                    return !((ChatActivityEnterView) this.this$0).doneButtonEnabled;
                default:
                    return super.isInactive();
            }
        }

        @Override
        public final boolean isOpen() {
            switch (this.$r8$classId) {
                case 0:
                    return ((RichEditor) this.this$0).sendButtonLoading || this.starsPrice > 0;
                case 1:
                    return true;
                case 2:
                    return true;
                default:
                    return ((RichEditorToolbar) this.this$0).sendLoading || this.starsPrice > 0;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 2:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((DialogsActivity) this.this$0).selectedDialogs.size(), new Object[0]));
                    accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
                    accessibilityNodeInfo.setLongClickable(true);
                    accessibilityNodeInfo.setClickable(true);
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }

        @Override
        public boolean shouldDrawBackground() {
            switch (this.$r8$classId) {
                case 2:
                    return true;
                default:
                    return super.shouldDrawBackground();
            }
        }

        public AnonymousClass9(DialogsActivity dialogsActivity, Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(i, context, resourcesProvider, false);
            this.$r8$classId = 2;
            this.this$0 = dialogsActivity;
        }
    }

    public final class Button extends ImageView implements Theme.Colorable {
        public boolean accent;
        public int backgroundColorKey;
        public int currentIcon;
        public boolean enabled;
        public boolean premium;
        public boolean premiumLocked;
        public final Theme.ResourcesProvider resourcesProvider;
        public int roundRadius;
        public boolean selected;
        public final int startIcon;

        public Button(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.roundRadius = 20;
            this.backgroundColorKey = Theme.key_windowBackgroundWhite;
            this.enabled = true;
            this.accent = true;
            this.currentIcon = i;
            this.startIcon = i;
            this.resourcesProvider = resourcesProvider;
            if (i != 0) {
                setImageResource(i);
            }
            setScaleType(ImageView.ScaleType.CENTER);
            ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
            updateColors$1();
        }

        public int[] getColorKeys() {
            return null;
        }

        public final void setAccent() {
            if (this.accent) {
                this.accent = false;
                updateColors$1();
            }
        }

        public final void setBackgroundColorKey(int i) {
            if (this.backgroundColorKey == i) {
                return;
            }
            this.backgroundColorKey = i;
            updateColors$1();
        }

        @Override
        public void setEnabled(boolean z) {
            if (this.enabled == z) {
                return;
            }
            setClickable(z);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            this.enabled = z;
            viewPropertyAnimatorAnimate.alpha(z ? 1.0f : 0.5f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        }

        public final void setPremium() {
            this.premium = true;
            RequiresPremiumDrawable requiresPremiumDrawable = new RequiresPremiumDrawable(getContext(), this.currentIcon);
            requiresPremiumDrawable.premiumIconCutoutColorKey = this.backgroundColorKey;
            requiresPremiumDrawable.setPremium(this.premiumLocked);
            setImageDrawable(requiresPremiumDrawable);
        }

        public void setPremiumLocked(boolean z) {
            this.premiumLocked = z;
            if (getDrawable() instanceof RequiresPremiumDrawable) {
                ((RequiresPremiumDrawable) getDrawable()).setPremium(z);
            }
        }

        @Override
        public void setSelected(boolean z) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            updateColors$1();
        }

        @Override
        public final void updateColors$1() {
            boolean z = this.selected;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (!z) {
                setBackground(Theme.createRadSelectorDrawable(Theme.getColor(this.backgroundColorKey, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider), AndroidUtilities.dp(this.roundRadius), AndroidUtilities.dp(this.roundRadius)));
                setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), PorterDuff.Mode.SRC_IN));
            } else {
                int color = Theme.getColor(null, this.accent ? Theme.key_featuredStickers_addButton : Theme.key_windowBackgroundWhiteBlackText, false);
                setBackground(Theme.createRadSelectorDrawable(Theme.blendOver(Theme.getColor(this.backgroundColorKey, resourcesProvider), Theme.multAlpha(0.1f, color)), Theme.multAlpha(0.1f, color), AndroidUtilities.dp(this.roundRadius), AndroidUtilities.dp(this.roundRadius)));
                setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
        }

        public final void updateIcon(int i) {
            if (this.currentIcon == i) {
                return;
            }
            this.currentIcon = i;
            if (!this.premium) {
                AndroidUtilities.updateImageViewImageAnimated(this, i);
                return;
            }
            RequiresPremiumDrawable requiresPremiumDrawable = new RequiresPremiumDrawable(getContext(), i);
            requiresPremiumDrawable.premiumIconCutoutColorKey = this.backgroundColorKey;
            requiresPremiumDrawable.setPremium(this.premiumLocked);
            AndroidUtilities.updateImageViewImageAnimated(this, requiresPremiumDrawable);
        }
    }

    public final class DraggingDrawable extends Drawable {
        public int alpha;
        public final AnimatedFloat animatedDragging;
        public boolean dragging;
        public final Paint paint;

        public DraggingDrawable(int i) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.animatedDragging = new AnimatedFloat(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 17), 420L, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
            this.alpha = 255;
            paint.setColor(i);
        }

        @Override
        public final void draw(Canvas canvas) {
            float f = this.animatedDragging.set(this.dragging);
            if (f <= 0.0f) {
                return;
            }
            Paint paint = this.paint;
            paint.setAlpha((int) (this.alpha * f));
            paint.setShadowLayer(AndroidUtilities.dp(12.0f) * f, 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(f, 805306368));
            Rect bounds = getBounds();
            float fDp = AndroidUtilities.dp(8.0f) * f;
            float fDp2 = AndroidUtilities.dp(0.0f) * f;
            float fDp3 = AndroidUtilities.dp(12.0f) * f;
            canvas.drawRoundRect(bounds.left + fDp, bounds.top + fDp2, bounds.right - fDp, (AndroidUtilities.dp(6.0f) * f) + (bounds.bottom - fDp2), fDp3, fDp3, paint);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }
    }

    public final class RequiresPremiumDrawable extends Drawable {
        public final Context context;
        public final Drawable icon;
        public Drawable premiumIcon;
        public Drawable premiumIconCutout;
        public int premiumIconCutoutColor;
        public int premiumIconCutoutColorKey;
        public boolean showPremiumIcon;

        public RequiresPremiumDrawable(Context context, int i) {
            Drawable drawableMutate = context.getResources().getDrawable(i).mutate();
            this.premiumIconCutoutColorKey = Theme.key_windowBackgroundWhite;
            this.showPremiumIcon = true;
            this.context = context;
            this.icon = drawableMutate;
        }

        @Override
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int iCenterX = bounds.centerX();
            int iCenterY = bounds.centerY();
            Drawable drawable = this.icon;
            drawable.setBounds(zzle.m(iCenterX, drawable), iCenterY - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + iCenterX, (drawable.getIntrinsicHeight() / 2) + iCenterY);
            drawable.draw(canvas);
            if (this.showPremiumIcon) {
                int iDp = AndroidUtilities.dp(9.0f) + iCenterX;
                int iDp2 = AndroidUtilities.dp(9.0f) + iCenterY;
                int color = Theme.getColor(null, this.premiumIconCutoutColorKey, false);
                Drawable drawable2 = this.premiumIconCutout;
                Context context = this.context;
                if (drawable2 == null) {
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_premium_cutout).mutate();
                    this.premiumIconCutout = drawableMutate;
                    this.premiumIconCutoutColor = color;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                if (color != this.premiumIconCutoutColor) {
                    Drawable drawable3 = this.premiumIconCutout;
                    this.premiumIconCutoutColor = color;
                    drawable3.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
                if (this.premiumIcon == null) {
                    this.premiumIcon = context.getResources().getDrawable(R.drawable.star_premium).mutate();
                }
                this.premiumIconCutout.setBounds(iDp - AndroidUtilities.dp(9.0f), iDp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + iDp, AndroidUtilities.dp(9.0f) + iDp2);
                this.premiumIconCutout.draw(canvas);
                this.premiumIcon.setBounds(iDp - AndroidUtilities.dp(9.0f), iDp2 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f) + iDp, AndroidUtilities.dp(9.0f) + iDp2);
                this.premiumIcon.draw(canvas);
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return Math.max(AndroidUtilities.dp(38.0f), this.icon.getIntrinsicHeight());
        }

        @Override
        public final int getIntrinsicWidth() {
            return Math.max(AndroidUtilities.dp(38.0f), this.icon.getIntrinsicWidth());
        }

        @Override
        public final int getOpacity() {
            return this.icon.getOpacity();
        }

        @Override
        public final void setAlpha(int i) {
            this.icon.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.icon.setColorFilter(colorFilter);
        }

        public final void setPremium(boolean z) {
            if (this.showPremiumIcon == z) {
                return;
            }
            this.showPremiumIcon = z;
            invalidateSelf();
        }
    }

    public final class ShadowWrapperDrawable extends Drawable implements Drawable.Callback {
        public final Drawable inner;
        public final Outline outline;
        public boolean pathDirty;
        public final RectF rectF;
        public final Paint shadowPaint;
        public final Path shadowPath;

        public ShadowWrapperDrawable(Drawable drawable) {
            Paint paint = new Paint(1);
            this.shadowPaint = paint;
            this.shadowPath = new Path();
            this.rectF = new RectF();
            this.outline = new Outline();
            this.pathDirty = true;
            this.inner = drawable;
            drawable.setCallback(this);
            paint.setColor(0);
            if (Theme.currentTheme.isDark()) {
                paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), Theme.multAlpha(0.3f, -16777216));
            } else {
                paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), Theme.multAlpha(0.1f, -16777216));
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            float radius;
            Outline outline = this.outline;
            boolean z = this.pathDirty;
            Path path = this.shadowPath;
            Drawable drawable = this.inner;
            if (z) {
                path.reset();
                RectF rectF = this.rectF;
                rectF.set(getBounds());
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        drawable.getOutline(outline);
                        radius = outline.getRadius();
                    } catch (Throwable unused) {
                        radius = -1.0f;
                    }
                } else {
                    radius = -1.0f;
                }
                if (radius > 0.0f) {
                    path.addRoundRect(rectF, radius, radius, Path.Direction.CW);
                } else {
                    path.addRect(rectF, Path.Direction.CW);
                }
                this.pathDirty = false;
            }
            canvas.drawPath(path, this.shadowPaint);
            drawable.draw(canvas);
        }

        @Override
        public final int getOpacity() {
            return -3;
        }

        @Override
        public final void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override
        public final boolean isStateful() {
            return this.inner.isStateful();
        }

        @Override
        public final void jumpToCurrentState() {
            this.inner.jumpToCurrentState();
        }

        @Override
        public final void onBoundsChange(Rect rect) {
            this.inner.setBounds(rect);
            this.pathDirty = true;
        }

        @Override
        public final boolean onStateChange(int[] iArr) {
            return this.inner.setState(iArr);
        }

        @Override
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        @Override
        public final void setAlpha(int i) {
            this.inner.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.inner.setColorFilter(colorFilter);
        }

        @Override
        public final void setHotspot(float f, float f2) {
            this.inner.setHotspot(f, f2);
        }

        @Override
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            this.inner.setHotspotBounds(i, i2, i3, i4);
        }

        @Override
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    public RichEditor(Editable editable) {
        super(null);
        this.initialSelectionStart = -1;
        this.initialSelectionEnd = -1;
        this.tempRect = new Rect();
        this.location = new int[2];
        this.animateOpenProgress = 1.0f;
        this.premiumButtons = new ArrayList();
        this.blockButtons = new ArrayList();
        this.formattingScrollMaxWidth = Integer.MAX_VALUE;
        this.formattingButtons = new ArrayList();
        this.reorderSavedPanelType = 0;
        this.bottomPanelType = -1;
        this.limitCheckRunnable = new RichEditor$$ExternalSyntheticLambda1(this, 0);
        this.initialText = editable;
    }

    public static void access$3500(RichEditor richEditor, boolean z, boolean z2) {
        if (richEditor.trashHovered == z && z2) {
            return;
        }
        richEditor.trashHovered = z;
        float f = z ? 1.15f : 1.0f;
        if (z2) {
            richEditor.trashPanelIcon.animate().scaleX(f).scaleY(f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            richEditor.trashPanelIcon.animate().cancel();
            richEditor.trashPanelIcon.setScaleX(f);
            richEditor.trashPanelIcon.setScaleY(f);
        }
        richEditor.trashPanelIcon.setColorFilter(new PorterDuffColorFilter(richEditor.getThemedColor(z ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN));
        RLottieDrawable animatedDrawable = richEditor.trashPanelIcon.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z) {
                if (animatedDrawable.currentFrame > 34) {
                    animatedDrawable.setCurrentFrame(0, false, false);
                }
                animatedDrawable.setCustomEndFrame(33);
            } else {
                animatedDrawable.setCustomEndFrame(0);
            }
            animatedDrawable.start();
        }
    }

    public static String formattingButtonContentDescription(int i) {
        if (i == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void openConversionSheet(Context context, final Runnable runnable, final Runnable runnable2, Theme.ResourcesProvider resourcesProvider) {
        final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bottomSheetM.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(imageView, LayoutHelper.createLinear(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 49, 25, 16, 25, 0), context);
        textViewM.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(17);
        textViewM.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 49, 25, 11, 25, 0));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 49, 14, 31, 14, 0));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, false);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 49, 14, 2, 14, 6));
        bottomSheetM.show();
        final int i2 = 0;
        buttonWithCounterViewM.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        bottomSheetM.lambda$showGiftOfferSheet$15();
                        runnable2.run();
                        break;
                    default:
                        bottomSheetM.lambda$showGiftOfferSheet$15();
                        runnable2.run();
                        break;
                }
            }
        });
        final int i3 = 1;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        bottomSheetM.lambda$showGiftOfferSheet$15();
                        runnable.run();
                        break;
                    default:
                        bottomSheetM.lambda$showGiftOfferSheet$15();
                        runnable.run();
                        break;
                }
            }
        });
    }

    public final Button addBlockButton(int i, int i2, boolean z) {
        String string;
        Button button = new Button(this.blocksLayout.getContext(), i, getResourceProvider());
        if (z) {
            button.setPremium();
            this.premiumButtons.add(button);
        }
        button.setTag(Integer.valueOf(i2));
        if (i2 == 1) {
            string = LocaleController.getString(R.string.AccDescrIVTextStyle);
        } else if (i2 == 2) {
            string = LocaleController.getString(R.string.AccDescrIVListStyle);
        } else if (i2 == 4) {
            string = LocaleController.getString(R.string.AccDescrIVTable);
        } else if (i2 != 7) {
            string = i2 != 9 ? null : LocaleController.getString(R.string.AccDescrIVDetails);
        } else {
            string = LocaleController.getString(R.string.AccDescrIVFormula);
        }
        button.setContentDescription(string);
        this.blockButtons.add(button);
        LinearLayout linearLayout = this.blocksLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return button;
    }

    public final void addFormattingButton(Context context, int i, int i2, boolean z) {
        Button button = new Button(context, i, getResourceProvider());
        if (z) {
            button.setPremium();
            this.premiumButtons.add(button);
        }
        button.setTag(Integer.valueOf(i2));
        button.setContentDescription(formattingButtonContentDescription(i2));
        button.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i2, 27));
        this.formattingButtons.add(button);
        LinearLayout linearLayout = this.formattingPanelLayout;
        linearLayout.addView(button, LayoutHelper.createLinear(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    public final void animateEmojiSearch(boolean z) {
        int i = 0;
        ValueAnimator valueAnimator = this.emojiSearchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.emojiSearchAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiSearchProgress, z ? 1.0f : 0.0f);
        this.emojiSearchAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new RichEditor$$ExternalSyntheticLambda2(this, i));
        this.emojiSearchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.emojiSearchAnimator.setDuration(250L);
        this.emojiSearchAnimator.start();
    }

    public final void applyEmojiSearchOffset() {
        FrameLayout.LayoutParams layoutParams;
        EmojiView emojiView = this.emojiView;
        if (emojiView == null || (layoutParams = (FrameLayout.LayoutParams) emojiView.getLayoutParams()) == null) {
            return;
        }
        int emojiPanelHeight = getEmojiPanelHeight();
        AnonymousClass2 anonymousClass2 = this.container;
        int iRound = Math.round((((anonymousClass2 == null ? getEmojiPanelHeight() : Math.max(getEmojiPanelHeight(), ((anonymousClass2.getMeasuredHeight() - getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.bottomInset)) - emojiPanelHeight) * this.emojiSearchProgress) + emojiPanelHeight);
        if (layoutParams.height != iRound) {
            layoutParams.height = iRound;
            this.emojiView.setLayoutParams(layoutParams);
        }
    }

    public final void checkUI_listViewPadding() {
        FrameLayout.LayoutParams layoutParams;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && (layoutParams = (FrameLayout.LayoutParams) emojiView.getLayoutParams()) != null) {
            int i = layoutParams.bottomMargin;
            int i2 = this.bottomInset;
            if (i != i2) {
                layoutParams.bottomMargin = i2;
                this.emojiView.setLayoutParams(layoutParams);
            }
        }
        applyEmojiSearchOffset();
        int iMax = Math.max(Math.max(this.emojiPadding, this.bottomInset), this.imeInset);
        this.listView.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + iMax);
        RichEditorListView richEditorListView = this.listView;
        int i3 = this.bottomInset;
        int i4 = this.imeInset;
        int i5 = this.emojiPadding;
        richEditorListView.bottomInset = i3;
        richEditorListView.imeInset = i4;
        richEditorListView.emojiPadding = i5;
        int i6 = -iMax;
        this.bottomContainer.setTranslationY(i6);
        this.bottomGradient.setTranslationY(i6 + this.bottomInset);
    }

    @Override
    public final View createView(Context context) {
        ChatActivity chatActivity;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.premiumButtons;
        arrayList.clear();
        this.container = new SizeNotifierFrameLayout(context) {
            public final Paint bgPaint = new Paint(1);
            public final RectF rect;
            public boolean touchStartedInBottomPanel;

            {
                new Path();
                this.rect = new RectF();
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Paint paint = this.bgPaint;
                int i = Theme.key_windowBackgroundWhite;
                RichEditor richEditor = RichEditor.this;
                paint.setColor(Theme.multAlpha(richEditor.animateOpenProgress, richEditor.getThemedColor(i)));
                if (!richEditor.animatingOpen || richEditor.animateInputBackground == null) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                    super.dispatchDraw(canvas);
                    return;
                }
                RectF rectF = this.rect;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, richEditor.animateOpenProgress);
                AndroidUtilities.lerp(richEditor.animateFromRect, rectF, richEditor.animateOpenProgress, rectF);
                Rect bounds = richEditor.animateInputBackground.getBounds();
                Rect rect = richEditor.tempRect;
                rect.set(bounds);
                richEditor.animateInputBackground.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                richEditor.animateInputBackground.setRadius(fLerp);
                richEditor.animateInputBackground.setAlpha((int) ((1.0f - richEditor.animateOpenProgress) * 255.0f));
                richEditor.animateInputBackground.draw(canvas);
                richEditor.animateInputBackground.setBounds(rect);
                rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
                if (richEditor.animateEnterView != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.lerp(richEditor.animateEnterViewFrom[0], richEditor.animateEnterViewTo[0], richEditor.animateOpenProgress), AndroidUtilities.lerp(richEditor.animateEnterViewFrom[1], richEditor.animateEnterViewTo[1], richEditor.animateOpenProgress));
                    canvas.saveLayerAlpha(0.0f, 0.0f, richEditor.animateEnterView.getWidth(), richEditor.animateEnterView.getHeight(), (int) ((1.0f - richEditor.animateOpenProgress) * 255.0f), 31);
                    richEditor.animateEnterView.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    canvas.save();
                    canvas.translate(AndroidUtilities.lerp(rectF.right, (richEditor.sendButton.getX() + (richEditor.bottomPanel.getX() + (richEditor.bottomInnerContainer.getX() + richEditor.bottomContainer.getX()))) + richEditor.sendButton.getWidth(), richEditor.animateOpenProgress) - richEditor.animateEnterView.sendButtonContainer.getWidth(), AndroidUtilities.lerp(rectF.bottom, (richEditor.sendButton.getY() + (richEditor.bottomPanel.getY() + (richEditor.bottomInnerContainer.getY() + richEditor.bottomContainer.getY()))) + richEditor.sendButton.getHeight(), richEditor.animateOpenProgress) - richEditor.animateEnterView.sendButtonContainer.getHeight());
                    canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), richEditor.animateEnterView.sendButtonContainer.getWidth(), richEditor.animateEnterView.sendButtonContainer.getHeight(), (int) ((1.0f - richEditor.animateOpenProgress) * 255.0f), 31);
                    richEditor.animateEnterView.sendButtonContainer.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                }
                canvas.save();
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                int action = keyEvent.getAction();
                RichEditor richEditor = RichEditor.this;
                if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
                    if (richEditor.persistDraft$1()) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.RichEditorDraftSaved, new BulletinFactory(richEditor.bulletinContainer, richEditor.getResourceProvider()), R.raw.contact_check, 36);
                        return true;
                    }
                } else if (!richEditor.listView.handleKeyEvent(keyEvent)) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                return true;
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                EmojiView emojiView;
                RichEditor richEditor = RichEditor.this;
                if (!richEditor.listView.textSelectionHelper.isInSelectionMode() || !richEditor.listView.textSelectionOverlay.onTouchEvent(motionEvent)) {
                    int height = (!richEditor.emojiSearchOpened || (emojiView = richEditor.emojiView) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(richEditor.emojiPadding, richEditor.bottomInset), richEditor.imeInset) : (int) emojiView.getY();
                    if (motionEvent.getAction() == 0 && richEditor.emojiViewVisible && motionEvent.getY() < height) {
                        richEditor.hideEmojiPopup$4(true);
                    }
                    if (motionEvent.getAction() == 0) {
                        if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop() && motionEvent.getY() < height) {
                            if (richEditor.listView.textSelectionOverlay.checkOnTap(motionEvent)) {
                                motionEvent.setAction(3);
                            }
                        }
                    } else if (richEditor.listView.textSelectionOverlay.checkOnTap(motionEvent)) {
                        motionEvent.setAction(3);
                    }
                    if (motionEvent.getAction() == 0) {
                        this.touchStartedInBottomPanel = richEditor.bottomPanel.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(richEditor.emojiPadding, richEditor.bottomInset), richEditor.imeInset)));
                    }
                    if (this.touchStartedInBottomPanel || !richEditor.listView.handleSelectionTouch(motionEvent)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return true;
            }
        };
        setHasOwnBackground(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        LoginActivity$$ExternalSyntheticLambda10 loginActivity$$ExternalSyntheticLambda10 = new LoginActivity$$ExternalSyntheticLambda10(this, 3);
        this.sizeDelegate = loginActivity$$ExternalSyntheticLambda10;
        this.container.delegates.add(loginActivity$$ExternalSyntheticLambda10);
        RichEditorListView richEditorListView = new RichEditorListView(context, this.currentAccount, getResourceProvider(), new AnonymousClass3(this, 0), new RichEditorListView[1]);
        this.listView = richEditorListView;
        richEditorListView.setFileRefParentObject(this.editingMessageObject);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        addView(this.listView.getOverlayView(), LayoutHelper.createFrame(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.initialRichMessage;
        if (richMessage != null) {
            RichEditorListView richEditorListView2 = this.listView;
            richEditorListView2.loadedRichMessage = richMessage;
            ArrayList arrayList2 = richEditorListView2.rows;
            RichEditorListView.flattenBlocks(arrayList2, richMessage.blocks, richEditorListView2.quoteAuthors);
            richEditorListView2.normalizeNestedQuotes();
            for (int i = 0; i < arrayList2.size(); i++) {
                richEditorListView2.resolveLoadedMedia((BlockRow) arrayList2.get(i));
            }
            richEditorListView2.adapter.update(false);
        } else {
            String str = this.initialHtml;
            if (str != null) {
                RichEditorListView richEditorListView3 = this.listView;
                CharSequence charSequence = this.initialHtmlBefore;
                CharSequence charSequence2 = this.initialHtmlAfter;
                richEditorListView3.getClass();
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                HashMap map = richEditorListView3.quoteAuthors;
                ArrayList arrayList3 = richEditorListView3.rows;
                if (!zIsEmpty) {
                    RichEditorListView.flattenBlocks(arrayList3, RichMessageConvert.blocksFromCharSequence(charSequence), map);
                }
                arrayList3.addAll(richEditorListView3.resolvePastedMedia(RichHtml.parse(str, map)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    RichEditorListView.flattenBlocks(arrayList3, RichMessageConvert.blocksFromCharSequence(charSequence2), map);
                }
                richEditorListView3.normalizeNestedQuotes();
                richEditorListView3.adapter.update(false);
            } else {
                Editable editable = this.initialText;
                if (editable != null) {
                    this.listView.setInitialText(editable);
                }
            }
        }
        RichEditorHistory richEditorHistory = this.listView.history;
        if (richEditorHistory != null) {
            richEditorHistory.resetBaseline();
        }
        View view = new View(context);
        this.topGradient = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i2 = Theme.key_windowBackgroundWhite;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i2), Theme.multAlpha(0.0f, getThemedColor(i2))}));
        addView(this.topGradient, LayoutHelper.createFrame(-1, 68, 55));
        View view2 = new View(context);
        this.bottomGradient = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(0.0f, getThemedColor(i2)), getThemedColor(i2)}));
        addView(this.bottomGradient, LayoutHelper.createFrame(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.topPanel = frameLayout;
        frameLayout.setClipChildren(false);
        this.topPanel.setClipToPadding(false);
        addView(this.topPanel, LayoutHelper.createFrame(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.backButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.backButton;
        int themedColor = getThemedColor(i2);
        int themedColor2 = getThemedColor(i2);
        int i3 = Theme.key_listSelector;
        imageView3.setBackground(new ShadowWrapperDrawable(Theme.createRadSelectorDrawable(themedColor, Theme.blendOver(themedColor2, getThemedColor(i3)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.backButton;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        int themedColor3 = getThemedColor(i4);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        ScaleStateListAnimator.apply(this.backButton, 0.1f, 1.5f);
        this.backButton.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.backButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 3));
        this.topPanel.addView(this.backButton, LayoutHelper.createFrame(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.historyButtons = linearLayout;
        linearLayout.setOrientation(0);
        this.historyButtons.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.topPanel.addView(this.historyButtons, LayoutHelper.createFrame(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.undoButton = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.undoButton.setScaleType(scaleType);
        this.undoButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.undoButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        ScaleStateListAnimator.apply(this.undoButton, 0.1f, 1.5f);
        this.undoButton.setContentDescription(LocaleController.getString(R.string.Undo));
        this.undoButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 4));
        this.historyButtons.addView(this.undoButton, LayoutHelper.createLinear(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.redoButton = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.redoButton.setScaleType(scaleType);
        this.redoButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.redoButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        ScaleStateListAnimator.apply(this.redoButton, 0.1f, 1.5f);
        this.redoButton.setContentDescription(LocaleController.getString(R.string.Redo));
        this.redoButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 5));
        this.historyButtons.addView(this.redoButton, LayoutHelper.createLinear(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bottomContainer = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.bottomContainer.setClipToPadding(false);
        addView(this.bottomContainer, LayoutHelper.createFrame(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bottomInnerContainer = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.bottomInnerContainer.setClipToPadding(false);
        this.bottomContainer.addView(this.bottomInnerContainer, LayoutHelper.createFrame(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.bottomPanel = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.bottomPanel.setClipChildren(false);
        this.bottomPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomInnerContainer.addView(this.bottomPanel, LayoutHelper.createFrame(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.bulletinContainer = frameLayout4;
        this.bottomInnerContainer.addView(frameLayout4, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.aiButton = imageView7;
        imageView7.setImageDrawable(new AiButtonDrawable(context));
        this.aiButton.setScaleType(scaleType);
        this.aiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.aiButton.setBackground(new ShadowWrapperDrawable(Theme.createRadSelectorDrawable(getThemedColor(i2), Theme.blendOver(getThemedColor(i2), getThemedColor(i3)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.bottomPanel.addView(this.aiButton, LayoutHelper.createLinear(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ScaleStateListAnimator.apply(this.aiButton, 0.1f, 1.5f);
        ImageView imageView8 = this.aiButton;
        int i5 = R.string.AIEditor;
        imageView8.setContentDescription(LocaleController.getString(i5));
        this.aiButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 6));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        frameLayout5.addView(frameLayout6, LayoutHelper.createFrame(-2, 44, 81));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, 0);
        this.blocksScrollView = anonymousClass4;
        anonymousClass4.setClipToOutline(true);
        this.blocksScrollView.setOutlineProvider(new AnonymousClass5(0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.blocksLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.blocksLayout.setOrientation(0);
        this.blocksScrollView.addView(this.blocksLayout);
        frameLayout6.addView(this.blocksScrollView, LayoutHelper.createFrame(-1.0f, -1));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 24);
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.emojiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.emojiButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i2), getThemedColor(i3), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
        this.blocksLayout.addView(this.emojiButton, LayoutHelper.createLinear(38, 38, 16));
        ScaleStateListAnimator.apply(this.emojiButton, 0.1f, 1.5f);
        this.emojiButton.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.emojiButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 7));
        addBlockButton(R.drawable.iv_text, 1, false).setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(8, this, context));
        addBlockButton(R.drawable.iv_lists, 2, true).setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 8));
        addBlockButton(R.drawable.iv_table, 4, true).setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 9));
        int i6 = R.drawable.iv_math;
        addBlockButton(i6, 7, true).setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 0));
        ImageView imageView9 = new ImageView(context);
        this.addButton = imageView9;
        imageView9.setImageResource(R.drawable.outline_poll_attach_24);
        this.addButton.setScaleType(scaleType);
        this.addButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.addButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i2), getThemedColor(i3), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.blocksLayout.addView(this.addButton, LayoutHelper.createLinear(38, 38, 16, 2, 0, 0, 0));
        ScaleStateListAnimator.apply(this.addButton, 0.1f, 1.5f);
        this.addButton.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.addButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 10));
        this.bottomPanel.addView(frameLayout5, LayoutHelper.createLinear(1.0f, 0, 44));
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 17);
        this.formattingPanel = anonymousClass35;
        anonymousClass35.setOrientation(0);
        this.formattingPanel.setClipToPadding(false);
        this.formattingPanel.setClipChildren(false);
        this.formattingPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomContainer.addView(this.formattingPanel, LayoutHelper.createFrame(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.trashPanel = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.trashPanel.setClipToPadding(false);
        this.trashPanel.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.bottomContainer.addView(this.trashPanel, LayoutHelper.createFrame(80, 60, 81));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.trashPanelIcon = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        RLottieDrawable animatedDrawable = this.trashPanelIcon.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.playInDirectionOfCustomEndFrame = true;
            animatedDrawable.setAutoRepeat(0);
            animatedDrawable.setCustomEndFrame(0);
        }
        this.trashPanelIcon.setScaleType(scaleType);
        this.trashPanelIcon.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.trashPanelIcon.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.trashPanel.addView(this.trashPanelIcon, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.formattingPanel.addView(frameLayout8, LayoutHelper.createFrame(44.0f, -2));
        ?? r3 = new HorizontalScrollView(context) {
            public final GradientClip clip = new GradientClip();
            public final AnimatedFloat leftGradientAlpha;
            public final AnimatedFloat rightGradientAlpha;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.leftGradientAlpha = new AnimatedFloat(300L, this, cubicBezierInterpolator);
                this.rightGradientAlpha = new AnimatedFloat(300L, this, cubicBezierInterpolator);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float f = this.leftGradientAlpha.set(canScrollHorizontally(-1));
                float f2 = this.rightGradientAlpha.set(canScrollHorizontally(1));
                if (f > 0.0f || f2 > 0.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                if (f > 0.0f || f2 > 0.0f) {
                    canvas2.save();
                    GradientClip gradientClip = this.clip;
                    if (f > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
                        gradientClip.draw(canvas2, rectF, 0, f);
                    }
                    if (f2 > 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                        gradientClip.draw(canvas2, rectF2, 2, f2);
                    }
                    canvas2.restore();
                }
            }

            @Override
            public final void onMeasure(int i7, int i8) {
                int mode2 = View.MeasureSpec.getMode(i7);
                if (mode2 == 1073741824) {
                    super.onMeasure(i7, i8);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i8);
                int measuredWidth = getMeasuredWidth();
                int iMin = RichEditor.this.formattingScrollMaxWidth;
                if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, View.MeasureSpec.getSize(i7));
                }
                setMeasuredDimension(Math.min(measuredWidth, iMin), getMeasuredHeight());
            }
        };
        this.formattingScrollView = r3;
        r3.setHorizontalScrollBarEnabled(false);
        setClipToOutline(true);
        setOutlineProvider(new AnonymousClass5(20));
        frameLayout8.addView(this.formattingScrollView, LayoutHelper.createFrame(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.formattingPanelLayout = linearLayout4;
        linearLayout4.setOrientation(0);
        this.formattingPanelLayout.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.formattingPanelLayout, new FrameLayout.LayoutParams(-2, -1));
        addFormattingButton(context, R.drawable.formatting_bold, 1, false);
        addFormattingButton(context, R.drawable.formatting_italic, 2, false);
        addFormattingButton(context, R.drawable.formatting_underline, 16, false);
        addFormattingButton(context, R.drawable.formatting_strikethrough, 8, false);
        addFormattingButton(context, R.drawable.formatting_spoiler, 256, false);
        addFormattingButton(context, R.drawable.iv_code, 4, false);
        addFormattingButton(context, R.drawable.formatting_marked, 65536, true);
        addFormattingButton(context, R.drawable.iv_sub, 16384, true);
        addFormattingButton(context, R.drawable.iv_super, 32768, true);
        Button button = new Button(context, R.drawable.iv_quote, getResourceProvider());
        this.quoteButton = button;
        button.setContentDescription(LocaleController.getString(R.string.Quote));
        this.quoteButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 12));
        LinearLayout linearLayout5 = this.formattingPanelLayout;
        linearLayout5.addView(this.quoteButton, LayoutHelper.createLinear(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        Button button2 = new Button(context, R.drawable.iv_button, getResourceProvider());
        this.inlineButton = button2;
        button2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.inlineButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 13));
        LinearLayout linearLayout6 = this.formattingPanelLayout;
        linearLayout6.addView(this.inlineButton, LayoutHelper.createLinear(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.formattingLayout2 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.formattingLayout2.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingLayout2.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.formattingPanel.addView(this.formattingLayout2, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        Button button3 = new Button(context, R.drawable.media_link_24, getResourceProvider());
        this.linkButton = button3;
        button3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.linkButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 14));
        this.formattingLayout2.addView(this.linkButton, LayoutHelper.createLinear(38, 38, 16));
        Button button4 = new Button(context, R.drawable.msg_calendar2, getResourceProvider());
        this.dateButton = button4;
        button4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.dateButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 15));
        this.formattingLayout2.addView(this.dateButton, LayoutHelper.createLinear(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.formattingLayout3 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.formattingLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingLayout3.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.formattingPanel.addView(this.formattingLayout3, LayoutHelper.createFrame(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        Button button5 = new Button(context, i6, getResourceProvider());
        this.mathButton = button5;
        button5.setPremium();
        arrayList.add(this.mathButton);
        this.mathButton.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.mathButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 16));
        this.formattingLayout3.addView(this.mathButton, LayoutHelper.createLinear(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.formattingLayout1 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.formattingLayout1.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.formattingLayout1.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.formattingPanel.addView(this.formattingLayout1, 0, LayoutHelper.createFrame(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        Button button6 = new Button(context, 0, getResourceProvider());
        this.aiStyleButton = button6;
        button6.setImageDrawable(new AiButtonDrawable(context));
        this.aiStyleButton.setContentDescription(LocaleController.getString(i5));
        this.aiStyleButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 1));
        this.formattingLayout1.addView(this.aiStyleButton, LayoutHelper.createLinear(38, 38, 16));
        MessageObject messageObject = this.editingMessageObject;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(this, context, messageObject != null ? R.drawable.input_done : (messageObject == null && (chatActivity = this.chatActivity) != null && chatActivity.isInScheduleMode()) ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), 0);
        this.sendButton = anonymousClass9;
        anonymousClass9.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_chat_messagePanelSend))));
        ScaleStateListAnimator.apply(this.sendButton, 0.1f, 1.5f);
        this.bottomPanel.addView(this.sendButton, LayoutHelper.createLinear(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.sendButton.setContentDescription(LocaleController.getString(R.string.Send));
        this.sendButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 2));
        this.sendButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 17));
        AnonymousClass9 anonymousClass10 = this.sendButton;
        if (anonymousClass10 != null) {
            anonymousClass10.setLocked(isSendLocked$1());
        }
        setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        checkUI_listViewPadding();
        updateBottomPanel(0, false);
        updateHistoryButtons$1();
        getViewTreeObserver().addOnGlobalFocusChangeListener(new RichEditor$$ExternalSyntheticLambda14(this, 0));
        boolean z = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Button) obj).setPremiumLocked(z);
        }
        if (this.convertToSimpleOnOpen) {
            this.listView.convertToSimple();
            this.convertToSimpleOnOpen = false;
        }
        AnonymousClass2 anonymousClass2 = this.container;
        this.fragmentView = anonymousClass2;
        return anonymousClass2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            AnonymousClass9 anonymousClass9 = this.sendButton;
            if (anonymousClass9 != null) {
                anonymousClass9.setLocked(isSendLocked$1());
            }
            int i3 = 0;
            boolean z = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
            ArrayList arrayList = this.premiumButtons;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((Button) obj).setPremiumLocked(z);
            }
        }
    }

    public final int getEmojiPanelHeight() {
        Point point = AndroidUtilities.displaySize;
        int i = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
        return i <= 0 ? AndroidUtilities.dp(200.0f) : i;
    }

    public final void hideEmojiPopup$4(boolean z) {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(-1L, false);
                this.emojiView.hideSearchKeyboard();
            }
        }
        ValueAnimator valueAnimator = this.emojiSearchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.emojiSearchAnimator = null;
        }
        this.emojiSearchProgress = 0.0f;
        this.emojiTargetEditText = null;
        EmojiView emojiView2 = this.emojiView;
        if (emojiView2 != null) {
            emojiView2.setTranslationY(0.0f);
            this.emojiView.setVisibility(8);
        }
        if (this.emojiViewVisible || this.emojiPadding != 0) {
            this.emojiViewVisible = false;
            this.emojiPadding = 0;
            checkUI_listViewPadding();
        }
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            chatActivityEnterViewAnimatedIconView.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, z);
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final boolean isSendLocked$1() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        RichEditorListView richEditorListView = this.listView;
        return RichMessageConvert.isLossy(richEditorListView.rows, richEditorListView.quoteAuthors);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView == null || !richEditorListView.textSelectionHelper.isInSelectionMode()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void lambda$createView$20(Context context, View view) {
        ItemOptions itemOptions = this.currentMenuVisible;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        boolean z = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        final BlockRow blockRowFindFocusedRow = this.listView.findFocusedRow();
        final ItemOptions itemOptions2 = new ItemOptions(this, view, true, true);
        itemOptions2.dontFocus = true;
        ItemOptions itemOptionsMakeSwipeback = itemOptions2.makeSwipeback();
        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(10, itemOptions2), false);
        itemOptionsMakeSwipeback.addGap();
        final int i = 0;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptions2.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptions2.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptions2.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptions2.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptions2.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptions2.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 2);
        final int i2 = 1;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptions2.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptions2.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptions2.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptions2.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptions2.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptions2.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 1);
        final int i3 = 2;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptions2.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptions2.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptions2.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptions2.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptions2.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptions2.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize);
        final int i4 = 3;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptions2.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptions2.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptions2.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptions2.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptions2.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptions2.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 1);
        final int i5 = 4;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptions2.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptions2.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptions2.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptions2.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptions2.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptions2.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 2);
        final int i6 = 5;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptions2.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptions2.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptions2.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptions2.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptions2.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptions2.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 3);
        boolean z2 = blockRowFindFocusedRow != null && RichEditorListView.isHeading(blockRowFindFocusedRow.block);
        RequiresPremiumDrawable requiresPremiumDrawable = new RequiresPremiumDrawable(context, R.drawable.iv_h);
        requiresPremiumDrawable.setPremium(z);
        int i7 = Theme.key_actionBarDefaultSubmenuBackground;
        requiresPremiumDrawable.premiumIconCutoutColorKey = i7;
        itemOptions2.addChecked(z2, 0, requiresPremiumDrawable, LocaleController.getString(R.string.ArticleHeading), new PhotoViewer$$ExternalSyntheticLambda133(itemOptions2, itemOptionsMakeSwipeback, 11));
        itemOptions2.getLast().textView.setTypeface(AndroidUtilities.bold());
        itemOptions2.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        itemOptions2.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 3));
        itemOptions2.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 4));
        boolean z3 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPullquote);
        RequiresPremiumDrawable requiresPremiumDrawable2 = new RequiresPremiumDrawable(context, R.drawable.iv_pullquote);
        requiresPremiumDrawable2.setPremium(z);
        requiresPremiumDrawable2.premiumIconCutoutColorKey = i7;
        itemOptions2.addChecked(z3, 0, requiresPremiumDrawable2, LocaleController.getString(R.string.ArticlePullquote), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 0));
        itemOptions2.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        itemOptions2.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 1));
        boolean z4 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockFooter);
        RequiresPremiumDrawable requiresPremiumDrawable3 = new RequiresPremiumDrawable(context, R.drawable.iv_footer);
        requiresPremiumDrawable3.setPremium(z);
        requiresPremiumDrawable3.premiumIconCutoutColorKey = i7;
        itemOptions2.addChecked(z4, 0, requiresPremiumDrawable3, LocaleController.getString(R.string.ArticleFooter), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 2));
        itemOptions2.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        itemOptions2.show();
        this.currentMenuVisible = itemOptions2;
    }

    public final void lambda$createView$5$12$1() {
        RichEditorListView.AnonymousClass1 anonymousClass1 = this.listView.textSelectionHelper;
        if (anonymousClass1 != null && anonymousClass1.isInSelectionMode()) {
            onAiStyleSelection();
            return;
        }
        Activity parentActivity = getParentActivity();
        new RichAIComposeSheet(this.currentAccount, parentActivity, new VoIPFragment$$ExternalSyntheticLambda7(this, 28), getResourceProvider()).show();
    }

    public final void lambda$sendMessage$49(MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j, MessageObject messageObject2, MessageObject messageObject3, boolean z, int i, int i2, SendMessageChatArguments sendMessageChatArguments, long j2) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(this.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, this.chatActivity);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(this.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j, messageObject2, messageObject3, z, i, i2, sendMessageChatArguments, 0L, j2, 0L);
        }
    }

    public final void lambda$showConversionSheet$46() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 43, true, null));
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 21) {
            if (i2 != -1 || (i != 1 && i != 14)) {
                super.onActivityResultFragment(i, i2, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.listView.attachExternalMedia(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        RichEditorListView richEditorListView = this.listView;
        Uri data = intent.getData();
        if (data == null) {
            richEditorListView.getClass();
        } else {
            if (richEditorListView.getContext() == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new RichTableCell$$ExternalSyntheticLambda3(12, richEditorListView, data));
        }
    }

    public final void onAiStyleSelection() {
        RichEditorListView.AnonymousClass4 anonymousClass4BeginSelectionEdit = this.listView.beginSelectionEdit();
        if (anonymousClass4BeginSelectionEdit == null) {
            return;
        }
        TL_iv.RichMessage richMessageExtractRichMessage = anonymousClass4BeginSelectionEdit.extractRichMessage();
        if (richMessageExtractRichMessage.blocks.isEmpty()) {
            return;
        }
        AIEditorAlert aIEditorAlert = new AIEditorAlert(getParentActivity(), getResourceProvider());
        aIEditorAlert.setText(richMessageExtractRichMessage);
        aIEditorAlert.onUseRichListener = new VoIPFragment$$ExternalSyntheticLambda7(anonymousClass4BeginSelectionEdit, 26);
        aIEditorAlert.show();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.emojiSearchOpened;
        if (z2) {
            if (z2) {
                this.emojiSearchOpened = false;
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.closeSearch(-1L, false);
                    this.emojiView.hideSearchKeyboard();
                }
                animateEmojiSearch(false);
                return false;
            }
        } else {
            if (this.emojiViewVisible) {
                hideEmojiPopup$4(true);
                return false;
            }
            if (!this.listView.deselectIfAny()) {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        int i = 0;
        int i2 = 1;
        if (!z && !this.persistedDraftOnEnd) {
            persistDraft$1();
            this.persistedDraftOnEnd = true;
        }
        if (AndroidUtilities.isTablet() || this.animateInputView == null || this.animateEnterView == null) {
            return super.onCustomTransitionAnimation(z, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ChatInputViewsContainer chatInputViewsContainer = this.animateInputView;
        this.animateInputBackground = chatInputViewsContainer.blurredBackgroundDrawable;
        chatInputViewsContainer.drawInputBackground = false;
        chatInputViewsContainer.invalidate();
        this.animateEnterView.setAlpha(0.0f);
        setVisibility(4);
        updateAnimatingLocations();
        float f = z ? 0.0f : 1.0f;
        this.animateOpenProgress = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        this.animatingOpen = true;
        invalidate();
        valueAnimatorOfFloat.addUpdateListener(new RichEditor$$ExternalSyntheticLambda2(this, i2));
        valueAnimatorOfFloat.addListener(new QrActivity.AnonymousClass4(23, this, runnable));
        if (z) {
            FrameLayout frameLayout = this.topPanel;
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.topPanel;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.listView, (Property<RichEditorListView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.topGradient, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.bottomGradient, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.topPanel;
            Property property3 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.topPanel;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.bottomInnerContainer, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.listView, (Property<RichEditorListView, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.topGradient, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.bottomGradient, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        post(new ArticleViewer$$ExternalSyntheticLambda3(animatorSet, i));
        return animatorSet;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        LoginActivity$$ExternalSyntheticLambda10 loginActivity$$ExternalSyntheticLambda10;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.persistedDraftOnEnd) {
            persistDraft$1();
            this.persistedDraftOnEnd = true;
        }
        RichEditor$$ExternalSyntheticLambda52 richEditor$$ExternalSyntheticLambda52 = this.pendingSend;
        if (richEditor$$ExternalSyntheticLambda52 != null) {
            this.pendingSend = null;
            AndroidUtilities.runOnUIThread(richEditor$$ExternalSyntheticLambda52);
        }
        MessageSendPreview messageSendPreview = this.messageSendPreview;
        if (messageSendPreview != null) {
            messageSendPreview.dismissInstant();
            this.messageSendPreview = null;
        }
        RichEditorListView richEditorListView = this.listView;
        if (richEditorListView != null) {
            richEditorListView.destroy();
        }
        TooltipPopup tooltipPopup = this.commandSuggestions;
        if (tooltipPopup != null) {
            tooltipPopup.hide();
        }
        super.onFragmentDestroy();
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
        AnonymousClass2 anonymousClass2 = this.container;
        if (anonymousClass2 == null || (loginActivity$$ExternalSyntheticLambda10 = this.sizeDelegate) == null) {
            return;
        }
        anonymousClass2.delegates.remove(loginActivity$$ExternalSyntheticLambda10);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.bottomInset = i4;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.bottomGradient.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.bottomInset;
        this.bottomGradient.setLayoutParams(layoutParams);
        checkUI_listViewPadding();
    }

    @Override
    public final WindowInsetsCompat onInsetsInternal(View view, WindowInsetsCompat windowInsetsCompat) {
        ItemOptions itemOptions;
        Insets insets = windowInsetsCompat.mImpl.getInsets(3);
        int i = windowInsetsCompat.mImpl.getInsets(8).bottom;
        this.imeInset = i;
        int i2 = i - insets.bottom;
        boolean z = this.keyboardVisible;
        boolean z2 = i2 > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z2;
        if (z2 && i2 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.keyboardHeightLand = i2;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i2;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (this.keyboardVisible && !z && this.emojiViewVisible && !this.emojiSearchOpened) {
            hideEmojiPopup$4(false);
        }
        if (!this.keyboardVisible && z && (itemOptions = this.currentMenuVisible) != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        onInsets(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public final boolean onSendLongClick$3(View view) {
        ChatActivity chatActivity = this.chatActivity;
        if (chatActivity != null && this.editingMessageObject == null && !chatActivity.isInScheduleMode() && this.listView.hasAnyText() && !this.listView.hasPendingUploads()) {
            if (!this.listView.isWithinLimits()) {
                updateSendButtonEnabled$1();
                return false;
            }
            ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = this.listView.flattenRowsToBlocks();
            if (!arrayListFlattenRowsToBlocks.isEmpty()) {
                MessageSendPreview messageSendPreview = this.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.sent = false;
                    messageSendPreview.dismiss();
                    this.messageSendPreview = null;
                }
                MessageSendPreview messageSendPreview2 = new MessageSendPreview(getParentActivity(), getResourceProvider());
                this.messageSendPreview = messageSendPreview2;
                messageSendPreview2.setOnDismissListener(new ShareActivity$$ExternalSyntheticLambda0(this, 9));
                long dialogId = this.chatActivity.getDialogId();
                MessageObject messageObject = this.chatActivity.replyingMessageObject;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(dialogId);
                tL_message.from_id = MessagesController.getInstance(this.currentAccount).getPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = arrayListFlattenRowsToBlocks;
                richMessage.photos = this.listView.collectPhotos();
                tL_message.rich_message.documents = this.listView.collectDocuments();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                this.messageSendPreview.setMessageObjects(MediaController$$ExternalSyntheticOutline1.m(messageObject2));
                this.sendButton.setScaleX(1.0f);
                this.sendButton.setScaleY(1.0f);
                MessageSendPreview.AnonymousClass13 sendButton = this.messageSendPreview.setSendButton(this.sendButton, true, new RichEditor$$ExternalSyntheticLambda3(this, 11));
                if (sendButton != null) {
                    sendButton.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
                    MessageSendPreview messageSendPreview3 = this.messageSendPreview;
                    int iDp = AndroidUtilities.dp(44.0f);
                    messageSendPreview3.customSendButtonWidth = true;
                    messageSendPreview3.sendButtonWidth = iDp;
                }
                ItemOptions itemOptions = new ItemOptions(this, this.sendButton, false, true);
                boolean zIsUserSelf = UserObject.isUserSelf(this.chatActivity.getCurrentUser());
                if (this.chatActivity.canScheduleMessage()) {
                    itemOptions.add(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new RichEditor$$ExternalSyntheticLambda57(this, dialogId, 0), false);
                    if (!zIsUserSelf && dialogId > 0) {
                        itemOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new RichEditor$$ExternalSyntheticLambda1(this, 5), false);
                    }
                }
                if (!zIsUserSelf) {
                    itemOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new RichEditor$$ExternalSyntheticLambda1(this, 6), false);
                }
                itemOptions.setupSelectors();
                this.messageSendPreview.setItemOptions(itemOptions);
                this.messageSendPreview.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        RichEditorListView richEditorListView;
        int i;
        RichEditorListView richEditorListView2;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (i = this.initialSelectionStart) >= 0 && (richEditorListView2 = this.listView) != null) {
            int i2 = this.initialSelectionEnd;
            this.initialSelectionEnd = -1;
            this.initialSelectionStart = -1;
            if (richEditorListView2.applyInitialSelectionInternal(i, i2)) {
                return;
            }
            richEditorListView2.post(new RichEditorListView$$ExternalSyntheticLambda0(richEditorListView2, i, i2, 0));
            return;
        }
        if (!z || z2) {
            return;
        }
        if ((this.initialRichMessage == null && this.initialHtml == null) || (richEditorListView = this.listView) == null || richEditorListView.focusForDraftInternal()) {
            return;
        }
        richEditorListView.post(new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 0));
    }

    public final void openAttach$1(int i, int i2) {
        RichEditorListView richEditorListView = this.listView;
        richEditorListView.pendingInsertRow = richEditorListView.findFocusedRow();
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getParentActivity(), this, false, false, true, getResourceProvider());
        chatAttachAlert.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                RichEditor richEditor = RichEditor.this;
                if (i3 == 7 || i3 == 8) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert2.photoLayout;
                    HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
                    RichEditorListView richEditorListView2 = richEditor.listView;
                    BlockRow blockRow = richEditorListView2.pendingMediaRow;
                    richEditorListView2.pendingMediaRow = null;
                    for (int i6 = 0; i6 < selectedPhotosOrder.size(); i6++) {
                        Object obj = selectedPhotos.get(selectedPhotosOrder.get(i6));
                        if (obj instanceof MediaController.PhotoEntry) {
                            if (blockRow != null) {
                                richEditor.listView.addMediaToRow(blockRow, (MediaController.PhotoEntry) obj);
                                break;
                            } else {
                                richEditor.listView.attachMedia((MediaController.PhotoEntry) obj);
                                break;
                            }
                        }
                    }
                }
                richEditor.listView.pendingMediaRow = null;
                chatAttachAlert2.dismiss(true);
            }

            @Override
            public final void didSelectBot(TLRPC.User user) {
            }

            @Override
            public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                NotificationCenter.getInstance(RichEditor.this.getCurrentAccount()).doOnIdle(chatAttachAlert$$ExternalSyntheticLambda7);
            }

            @Override
            public final boolean needEnterComment() {
                return false;
            }

            @Override
            public final void onCameraOpened() {
            }

            @Override
            public final void onWallpaperSelected(Object obj) {
            }

            @Override
            public final void openAvatarsSearch() {
            }

            @Override
            public final boolean selectItemOnClicking() {
                return false;
            }

            @Override
            public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i3, int i4, long j, boolean z2, long j2) {
            }
        };
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
        chatAttachAlertPhotoLayout.setIncludeVideosInGallery(true);
        chatAttachAlertPhotoLayout.loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.locationActivityDelegate = new RichEditor$$ExternalSyntheticLambda43(this, chatAttachAlert);
        chatAttachAlert.audioSelectDelegate = new RichEditor$$ExternalSyntheticLambda43(this, chatAttachAlert);
        chatAttachAlert.documentsDelegate = new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i3, long j, boolean z2, long j2) {
                boolean zIsEmpty = arrayList.isEmpty();
                RichEditor richEditor = RichEditor.this;
                if (!zIsEmpty) {
                    richEditor.listView.attachDocument((String) arrayList.get(0));
                } else if (!arrayList3.isEmpty()) {
                    RichEditorListView richEditorListView2 = richEditor.listView;
                    MessageObject messageObject = (MessageObject) arrayList3.get(0);
                    richEditorListView2.getClass();
                    if (messageObject != null && messageObject.getDocument() != null) {
                        TLRPC.Document document = messageObject.getDocument();
                        TLRPC.Message message = messageObject.messageOwner;
                        richEditorListView2.attachDocument(document, message != null ? message.attachPath : null);
                    }
                }
                chatAttachAlert.dismiss(true);
            }

            @Override
            public final void didSelectPhotos(long j, ArrayList arrayList, boolean z, int i3) {
            }

            @Override
            public final void startDocumentSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    RichEditor.this.startActivityForResult(intent, 21);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public final void startMusicSelectActivity() {
            }
        };
        chatAttachAlert.init();
        if (i2 != 0) {
            chatAttachAlert.openAttachLayoutForType(i2);
        }
        chatAttachAlert.setFocusable(true);
        chatAttachAlert.show();
    }

    public final boolean persistDraft$1() {
        RichEditorHistory richEditorHistory;
        TL_iv.RichMessage richMessage;
        TL_iv.RichMessage richMessage2;
        Runnable runnable;
        if (this.chatActivity == null || this.editingMessageObject != null || (richEditorHistory = this.listView.history) == null || !richEditorHistory.canUndo()) {
            return false;
        }
        if (this.sent) {
            richMessage = null;
        } else {
            RichEditorListView richEditorListView = this.listView;
            if (richEditorListView.hasAnyText()) {
                ArrayList<TL_iv.PageBlock> arrayListFlattenRowsToBlocks = richEditorListView.flattenRowsToBlocks();
                if (arrayListFlattenRowsToBlocks.isEmpty()) {
                    richMessage = null;
                } else {
                    TL_iv.RichMessage richMessage3 = new TL_iv.RichMessage();
                    richMessage3.blocks = arrayListFlattenRowsToBlocks;
                    richMessage3.photos = richEditorListView.collectPhotos();
                    richMessage3.documents = richEditorListView.collectDocuments();
                    richMessage = richMessage3;
                }
            } else {
                richMessage = null;
            }
        }
        if (richMessage == null && (runnable = this.onClearedCallback) != null) {
            runnable.run();
        }
        ChatActivity.AnonymousClass39 anonymousClass39 = this.chatActivity.chatActivityEnterView;
        if (richMessage == null || this.sent) {
            MediaDataController mediaDataController = getMediaDataController();
            long dialogId = this.chatActivity.getDialogId();
            ChatActivity chatActivity = this.chatActivity;
            mediaDataController.saveDraft(dialogId, chatActivity.computeDraftThreadId(chatActivity.replyingMessageObject), "", null, null, null, null, 0L, false, false, richMessage);
            richMessage2 = richMessage;
            if (anonymousClass39 != null) {
                anonymousClass39.setRichDraftPreview(richMessage2);
            }
        } else {
            RichEditorListView richEditorListView2 = this.listView;
            if (!richEditorListView2.hasAnyText() || RichMessageConvert.isLossy(richEditorListView2.rows, richEditorListView2.quoteAuthors) || anonymousClass39 == null) {
                MediaDataController mediaDataController2 = getMediaDataController();
                long dialogId2 = this.chatActivity.getDialogId();
                ChatActivity chatActivity2 = this.chatActivity;
                mediaDataController2.saveDraft(dialogId2, chatActivity2.computeDraftThreadId(chatActivity2.replyingMessageObject), "", null, null, null, null, 0L, false, false, richMessage);
                richMessage2 = richMessage;
                if (anonymousClass39 != null) {
                    anonymousClass39.setRichDraftPreview(richMessage2);
                }
            } else {
                SpannableStringBuilder spannableStringBuilderRowsToSimpleMessage = RichMessageConvert.rowsToSimpleMessage(this.listView.rows);
                if (anonymousClass39.messageEditText != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilderRowsToSimpleMessage);
                    Emoji.replaceEmoji((CharSequence) spannableStringBuilder, anonymousClass39.messageEditText.getPaint().getFontMetricsInt(), false, (int[]) null);
                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class);
                    if (animatedEmojiSpanArr != null) {
                        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                            animatedEmojiSpan.applyFontMetrics(anonymousClass39.messageEditText.getPaint().getFontMetricsInt(), AnimatedEmojiDrawable.getCacheTypeForEnterView());
                        }
                    }
                    QuoteSpan.normalizeQuotes(spannableStringBuilder);
                    ChatActivity chatActivity3 = anonymousClass39.parentFragment;
                    if (chatActivity3 != null) {
                        CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                        MediaDataController.getInstance(anonymousClass39.currentAccount).saveDraft(chatActivity3.getDialogId(), chatActivity3.computeDraftThreadId(chatActivity3.replyingMessageObject), charSequenceArr[0], MediaDataController.getInstance(anonymousClass39.currentAccount).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                    }
                    anonymousClass39.setRichDraftPreview(null);
                    if (anonymousClass39.messageEditText.getText() != null) {
                        anonymousClass39.messageEditText.getText().clear();
                    }
                    anonymousClass39.setFieldText(spannableStringBuilder);
                    return true;
                }
            }
        }
        return true;
    }

    public final void sendMessage(final int i, final int i2, final boolean z) {
        if (isSendLocked$1()) {
            showConversionSheet$1();
            return;
        }
        if (this.chatActivity == null || !this.listView.hasAnyText() || this.listView.hasPendingUploads()) {
            return;
        }
        if (!this.listView.isWithinLimits()) {
            updateSendButtonEnabled$1();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            ChatActivity.AnonymousClass39 anonymousClass39 = this.chatActivity.chatActivityEnterView;
            if (anonymousClass39 == null) {
                return;
            }
            this.sent = true;
            Runnable runnable = this.onSentCallback;
            if (runnable != null) {
                runnable.run();
            }
            anonymousClass39.sendConvertedRichAsSimple(RichMessageConvert.rowsToSimpleMessage(this.listView.rows), z, i, i2);
            finishFragment();
            return;
        }
        this.sent = true;
        final ArrayList arrayListFlattenRowsToBlocks = this.listView.flattenRowsToBlocks();
        if (arrayListFlattenRowsToBlocks.isEmpty()) {
            return;
        }
        final ArrayList arrayListCollectPhotos = this.listView.collectPhotos();
        final ArrayList arrayListCollectDocuments = this.listView.collectDocuments();
        final ArrayList arrayListCollect = RichMessageButtonUsers.collect(this.currentAccount, arrayListFlattenRowsToBlocks);
        final long dialogId = this.chatActivity.getDialogId();
        ChatActivity chatActivity = this.chatActivity;
        final MessageObject messageObject = chatActivity.replyingMessageObject;
        final MessageObject messageObject2 = chatActivity.threadMessageObject;
        final long sendMonoForumPeerId = chatActivity.getSendMonoForumPeerId();
        final SendMessageChatArguments messageChatSendParams = this.chatActivity.getMessageChatSendParams();
        final MessageObject messageObject3 = this.editingMessageObject;
        ?? r0 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendMessage$49(messageObject3, arrayListFlattenRowsToBlocks, arrayListCollectPhotos, arrayListCollectDocuments, arrayListCollect, dialogId, messageObject, messageObject2, z, i, i2, messageChatSendParams, sendMonoForumPeerId);
            }
        };
        Runnable runnable2 = this.onSentCallback;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i == 0 || messageObject3 != null) {
            r0.run();
            finishFragment();
        } else {
            this.pendingSend = r0;
            finishFragment();
        }
    }

    public final void setBoldEnabled(boolean z) {
        ArrayList arrayList = this.formattingButtons;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Button button = (Button) obj;
            if (((Integer) button.getTag()).intValue() == 1) {
                button.setEnabled(z);
            }
        }
    }

    public final void setInlineButtonsEnabled(boolean z, boolean z2) {
        Button button = this.linkButton;
        if (button != null) {
            button.setEnabled(z);
        }
        Button button2 = this.inlineButton;
        if (button2 != null) {
            button2.setEnabled(z2);
        }
        Button button3 = this.dateButton;
        if (button3 != null) {
            button3.setEnabled(z);
        }
        Button button4 = this.mathButton;
        if (button4 != null) {
            button4.setEnabled(z);
        }
    }

    public final void showConversionSheet$1() {
        Activity parentActivity = getParentActivity();
        RichEditorListView richEditorListView = this.listView;
        Objects.requireNonNull(richEditorListView);
        openConversionSheet(parentActivity, new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 1), new RichEditor$$ExternalSyntheticLambda1(this, 4), getResourceProvider());
    }

    public final void updateAnimatingLocations() {
        ChatInputViewsContainer chatInputViewsContainer = this.animateInputView;
        int[] iArr = this.location;
        chatInputViewsContainer.getLocationInWindow(iArr);
        if (this.animateFromRect == null) {
            this.animateFromRect = new RectF();
        }
        RectF rectF = new RectF(this.animateInputBackground.getBounds());
        this.animateFromRect = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.animateEnterViewFrom == null) {
            this.animateEnterViewFrom = new int[2];
        }
        this.animateEnterView.getLocationInWindow(this.animateEnterViewFrom);
        if (this.animateEnterViewTo == null) {
            this.animateEnterViewTo = new int[2];
        }
        this.animateEnterViewTo[0] = this.listView.getPaddingLeft();
        this.animateEnterViewTo[1] = this.listView.getPaddingTop();
        int[] iArr2 = this.animateEnterViewTo;
        iArr2[0] = (int) (iArr2[0] - (this.animateEnterView.messageEditText.getX() - AndroidUtilities.dp(16.0f)));
    }

    public final void updateBlockButtons() {
        BlockRow blockRowFindFocusedRow;
        int i;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            blockRowFindFocusedRow = this.listView.findFocusedRow();
        } else {
            int i2 = textSelectionHelper.startViewPosition;
            blockRowFindFocusedRow = i2 == textSelectionHelper.endViewPosition ? this.listView.rowForCell(i2) : null;
        }
        View viewFindFocus = this.listView.findFocus();
        if ((viewFindFocus instanceof RichEditText ? RichEditorListView.findTableCellAncestor((RichEditText) viewFindFocus) : null) != null) {
            i = 4;
        } else if (blockRowFindFocusedRow == null) {
            i = 0;
        } else if (blockRowFindFocusedRow.isChecklist() || blockRowFindFocusedRow.isInList() || blockRowFindFocusedRow.isOrdered()) {
            i = 2;
        } else {
            TL_iv.PageBlock pageBlock = blockRowFindFocusedRow.block;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                i = 2;
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                i = 4;
            } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                i = 8;
            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                i = 1;
            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                i = 3;
            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                i = 5;
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                i = 6;
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                i = 7;
            } else {
                i = 0;
            }
        }
        ArrayList arrayList = this.blockButtons;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Button button = (Button) obj;
            int iIntValue = ((Integer) button.getTag()).intValue();
            button.setSelected(i == iIntValue);
            int i4 = button.startIcon;
            if (i == iIntValue) {
                button.setEnabled(true);
                if (blockRowFindFocusedRow == null) {
                    button.updateIcon(i4);
                } else if (i == 1) {
                    TL_iv.PageBlock pageBlock2 = blockRowFindFocusedRow.block;
                    if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                        button.updateIcon(R.drawable.iv_h1);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        button.updateIcon(R.drawable.iv_h2);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        button.updateIcon(R.drawable.iv_h3);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        button.updateIcon(R.drawable.iv_h4);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        button.updateIcon(R.drawable.iv_h5);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        button.updateIcon(R.drawable.iv_h6);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                        button.updateIcon(R.drawable.iv_code);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                        button.updateIcon(R.drawable.iv_quote);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                        button.updateIcon(R.drawable.iv_pullquote);
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        button.updateIcon(R.drawable.iv_footer);
                    } else {
                        button.updateIcon(i4);
                    }
                } else if (i == 2) {
                    if (blockRowFindFocusedRow.isChecklist()) {
                        button.updateIcon(R.drawable.iv_todo);
                    } else if (blockRowFindFocusedRow.isOrdered()) {
                        button.updateIcon(R.drawable.iv_ordered_list);
                    } else {
                        button.updateIcon(i4);
                    }
                } else if (i == 8) {
                    button.updateIcon(R.drawable.iv_details);
                } else {
                    button.updateIcon(i4);
                }
            } else {
                button.setEnabled(i != 4);
                button.updateIcon(i4);
            }
        }
    }

    public final void updateBottomPanel(int i, boolean z) {
        if (this.bottomPanelType == i) {
            return;
        }
        this.bottomPanelType = i;
        if (z) {
            this.bottomPanel.setVisibility(0);
            ViewPropertyAnimator duration = this.bottomPanel.animate().alpha(this.bottomPanelType == 0 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 0 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 0 ? 1.0f : 0.8f).translationY(this.bottomPanelType == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new RichEditor$$ExternalSyntheticLambda1(this, 1)).start();
            this.formattingPanel.setVisibility(0);
            this.formattingPanel.animate().alpha(this.bottomPanelType == 1 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 1 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 1 ? 1.0f : 0.8f).translationY(this.bottomPanelType == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new RichEditor$$ExternalSyntheticLambda1(this, 2)).start();
            this.trashPanel.setVisibility(0);
            this.trashPanel.animate().alpha(this.bottomPanelType == 2 ? 1.0f : 0.0f).scaleX(this.bottomPanelType == 2 ? 1.0f : 0.8f).scaleY(this.bottomPanelType == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(cubicBezierInterpolator).withEndAction(new RichEditor$$ExternalSyntheticLambda1(this, 3)).start();
            return;
        }
        this.bottomPanel.setVisibility(i == 0 ? 0 : 8);
        this.bottomPanel.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.bottomPanel.setScaleX(i == 0 ? 1.0f : 0.8f);
        this.bottomPanel.setScaleY(i == 0 ? 1.0f : 0.8f);
        this.bottomPanel.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.formattingPanel.setVisibility(i == 1 ? 0 : 8);
        this.formattingPanel.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.formattingPanel.setScaleX(i == 1 ? 1.0f : 0.8f);
        this.formattingPanel.setScaleY(i == 1 ? 1.0f : 0.8f);
        this.formattingPanel.setTranslationY(i == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.trashPanel.setVisibility(i != 2 ? 8 : 0);
        this.trashPanel.setAlpha(i == 2 ? 1.0f : 0.0f);
        this.trashPanel.setScaleX(i == 2 ? 1.0f : 0.8f);
        this.trashPanel.setScaleY(i == 2 ? 1.0f : 0.8f);
    }

    public final void updateFormattingButtons$1() {
        boolean z;
        boolean z2;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = this.listView.getTextSelectionHelper();
        ArrayList arrayList = this.formattingButtons;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
            return;
        }
        Button button = this.quoteButton;
        boolean z3 = false;
        if (button != null) {
            RichEditorListView richEditorListView = this.listView;
            int[] iArrSelectedRowRange = richEditorListView.selectedRowRange();
            button.setSelected(iArrSelectedRowRange != null && richEditorListView.isRangeQuoted(iArrSelectedRowRange[0], iArrSelectedRowRange[1]));
        }
        if (this.listView.isTableSelection()) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper2 = this.listView.getTextSelectionHelper();
            int i = textSelectionHelper2.startViewPosition;
            int i2 = textSelectionHelper2.startViewChildPosition;
            int i3 = textSelectionHelper2.endViewChildPosition;
            int i4 = textSelectionHelper2.startViewOffset;
            int i5 = textSelectionHelper2.endViewOffset;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                Button button2 = (Button) obj;
                button2.setSelected(this.listView.isStyleFullyAppliedTable(((Integer) button2.getTag()).intValue(), i, i2, i4, i3, i5));
            }
            boolean z4 = i2 == i3;
            RichEditText richEditTextTableEditText = z4 ? this.listView.tableEditText(i, i2) : null;
            int iMax = Math.max(0, Math.min(i4, i5));
            int iMax2 = richEditTextTableEditText == null ? 0 : Math.max(0, Math.min(Math.max(i4, i5), richEditTextTableEditText.length()));
            Button button3 = this.linkButton;
            if (button3 != null) {
                button3.setSelected(richEditTextTableEditText != null && iMax < iMax2 && RichTextStyle.hasLink(richEditTextTableEditText.getText(), iMax, iMax2));
            }
            Button button4 = this.dateButton;
            if (button4 != null) {
                if (richEditTextTableEditText != null && iMax < iMax2 && RichTextStyle.hasDate(richEditTextTableEditText.getText(), iMax, iMax2)) {
                    z3 = true;
                }
                button4.setSelected(z3);
            }
            setBoldEnabled(true);
            setInlineButtonsEnabled(z4, this.listView.canCreateInlineButtonOnSelection());
            return;
        }
        if (this.listView.isCaptionSelection()) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper3 = this.listView.getTextSelectionHelper();
            RichEditText richEditTextCaptionEditText = this.listView.captionEditText(textSelectionHelper3.startViewPosition);
            int i7 = textSelectionHelper3.startViewOffset;
            int i8 = textSelectionHelper3.endViewOffset;
            int iMax3 = richEditTextCaptionEditText == null ? 0 : Math.max(0, Math.min(Math.min(i7, i8), richEditTextCaptionEditText.length()));
            int iMax4 = richEditTextCaptionEditText == null ? 0 : Math.max(0, Math.min(Math.max(i7, i8), richEditTextCaptionEditText.length()));
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                Button button5 = (Button) obj2;
                button5.setSelected((richEditTextCaptionEditText == null || iMax3 >= iMax4 || (((Integer) button5.getTag()).intValue() & richEditTextCaptionEditText.getCurrentStyle(iMax3, iMax4)) == 0) ? false : true);
            }
            Button button6 = this.linkButton;
            if (button6 != null) {
                button6.setSelected(richEditTextCaptionEditText != null && iMax3 < iMax4 && RichTextStyle.hasLink(richEditTextCaptionEditText.getText(), iMax3, iMax4));
            }
            Button button7 = this.dateButton;
            if (button7 != null) {
                if (richEditTextCaptionEditText != null && iMax3 < iMax4 && RichTextStyle.hasDate(richEditTextCaptionEditText.getText(), iMax3, iMax4)) {
                    z3 = true;
                }
                button7.setSelected(z3);
            }
            setBoldEnabled(true);
            setInlineButtonsEnabled(true, this.listView.canCreateInlineButtonOnSelection());
            return;
        }
        int i10 = textSelectionHelper.startViewPosition;
        int i11 = textSelectionHelper.endViewPosition;
        int i12 = textSelectionHelper.startViewOffset;
        int i13 = textSelectionHelper.endViewOffset;
        boolean z5 = i10 >= 0 && i11 >= 0 && i11 >= i10 && i11 < this.listView.itemRows.size();
        int size3 = arrayList.size();
        int i14 = 0;
        while (i14 < size3) {
            int i15 = i14 + 1;
            Button button8 = (Button) arrayList.get(i14);
            button8.setSelected(z5 && this.listView.isStyleFullyApplied(((Integer) button8.getTag()).intValue(), i10, i12, i11, i13));
            i14 = i15;
        }
        setBoldEnabled(!this.listView.isSelectionAllHeadings());
        Button button9 = this.linkButton;
        if (button9 != null) {
            if (z5) {
                Editable editableSingleSelectionText = this.listView.singleSelectionText(i10, i12, i11, i13);
                if (editableSingleSelectionText == null ? false : RichTextStyle.hasLink(editableSingleSelectionText, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            button9.setSelected(z2);
        }
        Button button10 = this.dateButton;
        if (button10 != null) {
            if (z5) {
                Editable editableSingleSelectionText2 = this.listView.singleSelectionText(i10, i12, i11, i13);
                if (editableSingleSelectionText2 == null ? false : RichTextStyle.hasDate(editableSingleSelectionText2, Math.max(0, Math.min(i12, i13)), Math.max(i12, i13))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            button10.setSelected(z);
        }
        setInlineButtonsEnabled(z5 && i10 == i11, this.listView.canCreateInlineButtonOnSelection());
    }

    public final void updateHistoryButtons$1() {
        RichEditorHistory richEditorHistory = this.listView.history;
        boolean z = false;
        boolean z2 = richEditorHistory != null && richEditorHistory.canUndo();
        RichEditorHistory richEditorHistory2 = this.listView.history;
        if (richEditorHistory2 != null && !richEditorHistory2.redoStack.isEmpty()) {
            z = true;
        }
        ImageView imageView = this.undoButton;
        if (imageView != null) {
            imageView.setEnabled(z2);
            this.undoButton.setAlpha(z2 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.redoButton;
        if (imageView2 != null) {
            imageView2.setEnabled(z);
            this.redoButton.setAlpha(z ? 1.0f : 0.35f);
        }
    }

    public final void updateSendButtonEnabled$1() {
        if (this.sendButton == null) {
            return;
        }
        boolean zIsWithinLimits = this.listView.isWithinLimits();
        this.sendButton.setEnabled(zIsWithinLimits);
        OKLCH.m(this.sendButton.animate(), zIsWithinLimits ? 1.0f : 0.5f, 150L);
    }

    public RichEditor(String str) {
        super(null);
        this.initialSelectionStart = -1;
        this.initialSelectionEnd = -1;
        this.tempRect = new Rect();
        this.location = new int[2];
        this.animateOpenProgress = 1.0f;
        this.premiumButtons = new ArrayList();
        this.blockButtons = new ArrayList();
        this.formattingScrollMaxWidth = Integer.MAX_VALUE;
        this.formattingButtons = new ArrayList();
        this.reorderSavedPanelType = 0;
        this.bottomPanelType = -1;
        this.limitCheckRunnable = new RichEditor$$ExternalSyntheticLambda1(this, 0);
        this.initialHtml = str;
    }

    public RichEditor(TL_iv.RichMessage richMessage) {
        super(null);
        this.initialSelectionStart = -1;
        this.initialSelectionEnd = -1;
        this.tempRect = new Rect();
        this.location = new int[2];
        this.animateOpenProgress = 1.0f;
        this.premiumButtons = new ArrayList();
        this.blockButtons = new ArrayList();
        this.formattingScrollMaxWidth = Integer.MAX_VALUE;
        this.formattingButtons = new ArrayList();
        this.reorderSavedPanelType = 0;
        this.bottomPanelType = -1;
        this.limitCheckRunnable = new RichEditor$$ExternalSyntheticLambda1(this, 0);
        this.initialRichMessage = richMessage;
    }

    public final class AnonymousClass3 implements SearchViewPager.ChatPreviewDelegate, RichCaptionController.Host, RichEditorListView.Delegate {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public TextSelectionHelper.ArticleSelectableView cell() {
            switch (this.$r8$classId) {
                case 2:
                    return (RichAudioCell) this.this$0;
                default:
                    return (RichMediaCell) this.this$0;
            }
        }

        @Override
        public BlockRow currentRow() {
            switch (this.$r8$classId) {
                case 2:
                    return ((RichAudioCell) this.this$0).currentRow;
                default:
                    return ((RichMediaCell) this.this$0).currentRow;
            }
        }

        @Override
        public void finish() {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                TopicsFragment.this.finishPreviewFragment();
            }
        }

        @Override
        public ItemOptions makeMenu(View view) {
            return new ItemOptions((RichEditor) this.this$0, view, false, true);
        }

        @Override
        public void move(float f) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                TopicsFragment.this.movePreviewFragment(f);
            }
        }

        @Override
        public void onBlockButtonEditRequested(RichEditorListView.BlockButtonEdit blockButtonEdit, View view) {
            RichEditor richEditor = (RichEditor) this.this$0;
            ItemOptions itemOptions = new ItemOptions(richEditor, view, false, true);
            itemOptions.dontFocus = true;
            richEditor.currentMenuVisible = RichInlineButtonEditor.showBlock(itemOptions, richEditor, richEditor.getParentActivity(), richEditor.getResourceProvider(), blockButtonEdit, false);
        }

        @Override
        public void onCaptionChanged() {
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    if (anonymousClass7 != null) {
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.onTyping();
                        }
                        richEditorListView.delegate.onContentChanged();
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    if (anonymousClass6 != null) {
                        RichEditorListView richEditorListView2 = RichEditorListView.this;
                        RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.onTyping();
                        }
                        richEditorListView2.delegate.onContentChanged();
                    }
                    break;
            }
        }

        @Override
        public void onCaptionEnter() {
            switch (this.$r8$classId) {
                case 2:
                    RichAudioCell richAudioCell = (RichAudioCell) this.this$0;
                    RichEditorListView.AnonymousClass7 anonymousClass7 = richAudioCell.delegate;
                    if (anonymousClass7 != null) {
                        RichEditorListView.this.onCaptionEnter(richAudioCell.currentRow);
                    }
                    break;
                default:
                    RichMediaCell richMediaCell = (RichMediaCell) this.this$0;
                    RichEditorListView.AnonymousClass6 anonymousClass6 = richMediaCell.delegate;
                    if (anonymousClass6 != null) {
                        RichEditorListView.this.onCaptionEnter(richMediaCell.currentRow);
                    }
                    break;
            }
        }

        @Override
        public void onCaptionLockedInsert(CharSequence charSequence) {
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    if (anonymousClass7 != null && charSequence != null && charSequence.length() > 0) {
                        RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
                        break;
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    if (anonymousClass6 != null && charSequence != null && charSequence.length() > 0) {
                        RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
                        break;
                    }
                    break;
            }
        }

        @Override
        public boolean onCaptionSelectAll() {
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    return anonymousClass7 != null && RichEditorListView.this.tryEscalateSelectAll();
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    return anonymousClass6 != null && RichEditorListView.this.tryEscalateSelectAll();
            }
        }

        @Override
        public void onCaptionSpansChanged() {
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    if (anonymousClass7 != null) {
                        RichEditorListView.access$3700(RichEditorListView.this);
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    if (anonymousClass6 != null) {
                        RichEditorListView.access$3700(RichEditorListView.this);
                    }
                    break;
            }
        }

        @Override
        public void onCaptionWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichEditorHistory richEditorHistory2;
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    if (anonymousClass7 != null && (richEditorHistory = RichEditorListView.this.history) != null) {
                        richEditorHistory.onBeforeChange(i, i2);
                        break;
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    if (anonymousClass6 != null && (richEditorHistory2 = RichEditorListView.this.history) != null) {
                        richEditorHistory2.onBeforeChange(i, i2);
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onContentChanged() {
            RichEditor richEditor = (RichEditor) this.this$0;
            if (richEditor.sendButton != null) {
                boolean zHasPendingUploads = richEditor.listView.hasPendingUploads();
                richEditor.sendButtonLoading = zHasPendingUploads;
                richEditor.sendButton.setLoading(zHasPendingUploads);
                richEditor.sendButton.invalidate();
            }
            AnonymousClass9 anonymousClass9 = richEditor.sendButton;
            if (anonymousClass9 != null) {
                anonymousClass9.setLocked(richEditor.isSendLocked$1());
            }
            AndroidUtilities.cancelRunOnUIThread(richEditor.limitCheckRunnable);
            AndroidUtilities.runOnUIThread(richEditor.limitCheckRunnable, 1000L);
        }

        @Override
        public void onHistoryChanged() {
            RichEditor richEditor = (RichEditor) this.this$0;
            richEditor.updateHistoryButtons$1();
            AnonymousClass9 anonymousClass9 = richEditor.sendButton;
            if (anonymousClass9 == null) {
                return;
            }
            anonymousClass9.setLocked(richEditor.isSendLocked$1());
        }

        @Override
        public void onInlineButtonEditRequested(RichEditorListView.InlineButtonEdit inlineButtonEdit, View view) {
            RichEditor richEditor = (RichEditor) this.this$0;
            ItemOptions itemOptions = new ItemOptions(richEditor, view, false, true);
            itemOptions.dontFocus = true;
            richEditor.getParentActivity();
            richEditor.getResourceProvider();
            richEditor.currentMenuVisible = RichInlineButtonEditor.show(itemOptions, richEditor, inlineButtonEdit, false);
        }

        @Override
        public void onListLayoutUpdated() {
        }

        @Override
        public void onListScrolled(int i) {
        }

        @Override
        public void onOpenAttachRequest(int i) {
            ((RichEditor) this.this$0).openAttach$1(74, i);
        }

        @Override
        public void onOpenLocationRequest(BlockRow blockRow) {
            RichEditor richEditor = (RichEditor) this.this$0;
            if (blockRow != null && (blockRow.block instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(richEditor)) {
                ChatAttachAlert chatAttachAlert = new ChatAttachAlert(richEditor.getParentActivity(), richEditor, false, false, false, richEditor.getResourceProvider());
                chatAttachAlert.delegate = new AnonymousClass12(0);
                chatAttachAlert.isLocationPicker = true;
                chatAttachAlert.buttonsRecyclerViewWrapper.setVisibility(8);
                chatAttachAlert.locationActivityDelegate = new VoIPFragment$$ExternalSyntheticLambda42(richEditor, blockRow, chatAttachAlert, 29);
                chatAttachAlert.init();
                chatAttachAlert.show();
            }
        }

        @Override
        public void onReorderEnd() {
            RichEditor richEditor = (RichEditor) this.this$0;
            RichEditor.access$3500(richEditor, false, true);
            int i = richEditor.reorderSavedPanelType;
            richEditor.updateBottomPanel(i != 2 ? i : 0, true);
        }

        @Override
        public boolean onReorderMove(float f) {
            boolean z;
            RichEditor richEditor = (RichEditor) this.this$0;
            FrameLayout frameLayout = richEditor.trashPanel;
            if (frameLayout == null) {
                z = false;
            } else {
                int[] iArr = new int[2];
                frameLayout.getLocationOnScreen(iArr);
                if (f >= iArr[1]) {
                    z = true;
                } else {
                    z = false;
                }
            }
            RichEditor.access$3500(richEditor, z, true);
            return z;
        }

        @Override
        public void onReorderStart() {
            RichEditor richEditor = (RichEditor) this.this$0;
            richEditor.reorderSavedPanelType = richEditor.bottomPanelType;
            RichEditor.access$3500(richEditor, false, false);
            richEditor.updateBottomPanel(2, true);
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText) {
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    if (anonymousClass7 != null) {
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        richEditorListView.prepareEditText(richEditText);
                        richEditorListView.delegate.makeEditTextFocusable(richEditText);
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    if (anonymousClass6 != null) {
                        RichEditorListView richEditorListView2 = RichEditorListView.this;
                        richEditorListView2.prepareEditText(richEditText);
                        richEditorListView2.delegate.makeEditTextFocusable(richEditText);
                    }
                    break;
            }
        }

        @Override
        public void onSelectionChanged() {
            RichEditor richEditor = (RichEditor) this.this$0;
            RichEditorListView.AnonymousClass1 anonymousClass1 = richEditor.listView.textSelectionHelper;
            richEditor.updateBottomPanel((anonymousClass1 != null && anonymousClass1.isInSelectionMode() && richEditor.listView.selectionHasInlineFormattable()) ? 1 : 0, true);
            richEditor.updateFormattingButtons$1();
            richEditor.updateBlockButtons();
        }

        @Override
        public void onSlashSuggest(RichTextCell richTextCell, String str) {
            RichEditor richEditor = (RichEditor) this.this$0;
            if (richEditor.commandSuggestions == null) {
                richEditor.commandSuggestions = new TooltipPopup(new TodoItemMenu$$ExternalSyntheticLambda3(this, 11), richEditor.getResourceProvider());
            }
            richEditor.commandSuggestions.update(richTextCell, str);
        }

        @Override
        public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
            switch (this.$r8$classId) {
                case 2:
                    RichEditorListView.AnonymousClass7 anonymousClass7 = ((RichAudioCell) this.this$0).delegate;
                    if (anonymousClass7 != null) {
                        return RichEditorListView.this.getTextSelectionHelper();
                    }
                    return null;
                default:
                    RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
                    if (anonymousClass6 != null) {
                        return RichEditorListView.this.getTextSelectionHelper();
                    }
                    return null;
            }
        }

        @Override
        public void startChatPreview(DialogCell dialogCell) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            HashSet hashSet = TopicsFragment.settingsPreloaded;
            topicsFragment.showChatPreview$1(dialogCell);
        }

        @Override
        public void makeEditTextFocusable(RichEditText richEditText) {
        }
    }
}
