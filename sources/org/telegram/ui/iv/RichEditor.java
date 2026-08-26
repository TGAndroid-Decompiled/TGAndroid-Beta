package org.telegram.ui.iv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Property;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipPopup;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.preferences.PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility;
import com.android.billingclient.api.zzbv;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController.AnonymousClass2;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.settings.SettingsRequest;
import com.google.mlkit.common.sdkinternal.TaskQueue;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.DataBlock;
import com.google.zxing.qrcode.decoder.DecodedBitStreamParser;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.FormatInformation;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.stripe.android.Stripe;
import com.stripe.android.net.RequestOptions;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.selects.SelectClause1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.view_data.ChartBottomSignatureData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.AiButtonDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.PremiumAppIconsPreviewView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorSearchCell;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GradientClip;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.SuperRipple;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.CollageLayoutView2;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.Stories.recorder.GallerySheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;

public final class RichEditor extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ImageView addButton;
    public ImageView aiButton;
    public Button aiStyleButton;
    public ChatActivityEnterView animateEnterView;
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
    public AnonymousClass6 formattingPanel;
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
    public final CharSequence initialText;
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
    public RichEditor$$ExternalSyntheticLambda13 sizeDelegate;
    public final Rect tempRect;
    public View topGradient;
    public FrameLayout topPanel;
    public boolean trashHovered;
    public FrameLayout trashPanel;
    public RLottieImageView trashPanelIcon;
    public ImageView undoButton;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$callback;

        public AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$callback = obj2;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 2:
                    ActionBar actionBar = (ActionBar) this.this$0;
                    if (actionBar.actionModeAnimation != null && actionBar.actionModeAnimation.equals(animator)) {
                        actionBar.actionModeAnimation = null;
                        break;
                    }
                    break;
                case 3:
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                    if (animator.equals(actionBarLayout.themeAnimatorSet)) {
                        actionBarLayout.themeAnimatorDescriptions.clear();
                        actionBarLayout.animateStartColors.clear();
                        actionBarLayout.animateEndColors.clear();
                        actionBarLayout.themeAnimatorDelegate.clear();
                        Theme.animatingColors = null;
                        actionBarLayout.presentingFragmentDescriptions = null;
                        actionBarLayout.animationProgressListener = null;
                        actionBarLayout.themeAnimatorSet = null;
                        ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 chatActivity$ThemeDelegate$$ExternalSyntheticLambda2 = ((INavigationLayout.ThemeAnimationSettings) this.val$callback).afterAnimationRunnable;
                        if (chatActivity$ThemeDelegate$$ExternalSyntheticLambda2 != null) {
                            chatActivity$ThemeDelegate$$ExternalSyntheticLambda2.run();
                        }
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            boolean[] zArr;
            switch (this.$r8$classId) {
                case 0:
                    RichEditor richEditor = (RichEditor) this.this$0;
                    richEditor.animatingOpen = false;
                    richEditor.animateEnterView.setAlpha(1.0f);
                    richEditor.animateEnterView.sendButtonContainer.setVisibility(0);
                    richEditor.animateInputBackground.setRadius(AndroidUtilities.dp(22.0f));
                    richEditor.animateInputBackground.setAlpha(255);
                    ChatInputViewsContainer chatInputViewsContainer = richEditor.animateInputView;
                    chatInputViewsContainer.drawInputBackground = true;
                    chatInputViewsContainer.invalidate();
                    ((Runnable) this.val$callback).run();
                    break;
                case 1:
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) this.val$callback;
                    windowInsetsAnimationCompat.mImpl.setFraction(1.0f);
                    WindowInsetsAnimationCompat.Impl21.dispatchOnEnd((View) this.this$0, windowInsetsAnimationCompat);
                    break;
                case 2:
                    ActionBar actionBar = (ActionBar) this.this$0;
                    if (actionBar.actionModeAnimation != null && actionBar.actionModeAnimation.equals(animator)) {
                        actionBar.actionModeAnimation = null;
                        if (actionBar.titleTextView[0] != null) {
                            actionBar.titleTextView[0].setVisibility(4);
                        }
                        if (actionBar.subtitleTextView != null && !TextUtils.isEmpty(actionBar.subtitle)) {
                            actionBar.subtitleTextView.setVisibility(4);
                        }
                        ActionBarMenu actionBarMenu = actionBar.menu;
                        if (actionBarMenu != null) {
                            actionBarMenu.setVisibility(4);
                        }
                        if (actionBar.actionModeHidingViews != null) {
                            for (int i = 0; i < actionBar.actionModeHidingViews.length; i++) {
                                if (actionBar.actionModeHidingViews[i] != null && ((zArr = (boolean[]) this.val$callback) == null || i >= zArr.length || zArr[i])) {
                                    actionBar.actionModeHidingViews[i].setVisibility(4);
                                }
                            }
                        }
                        break;
                    }
                    break;
                case 3:
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.this$0;
                    actionBarLayout.notificationsLocker.unlock();
                    if (animator.equals(actionBarLayout.themeAnimatorSet)) {
                        actionBarLayout.themeAnimatorDescriptions.clear();
                        actionBarLayout.animateStartColors.clear();
                        actionBarLayout.animateEndColors.clear();
                        actionBarLayout.themeAnimatorDelegate.clear();
                        Theme.animatingColors = null;
                        actionBarLayout.presentingFragmentDescriptions = null;
                        actionBarLayout.animationProgressListener = null;
                        actionBarLayout.themeAnimatorSet = null;
                        ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 chatActivity$ThemeDelegate$$ExternalSyntheticLambda2 = ((INavigationLayout.ThemeAnimationSettings) this.val$callback).afterAnimationRunnable;
                        if (chatActivity$ThemeDelegate$$ExternalSyntheticLambda2 != null) {
                            chatActivity$ThemeDelegate$$ExternalSyntheticLambda2.run();
                        }
                    }
                    break;
                case 4:
                    ((ActionBarLayout) this.this$0).previewOpenAnimationInProgress = false;
                    ((BaseFragment) this.val$callback).onPreviewOpenAnimationEnd();
                    break;
                case 5:
                    BaseChartView baseChartView = (BaseChartView) this.this$0;
                    baseChartView.horizontalLines.clear();
                    baseChartView.horizontalLines.add((ChartHorizontalLinesData) this.val$callback);
                    break;
                case 6:
                    super.onAnimationEnd(animator);
                    BaseChartView baseChartView2 = (BaseChartView) this.this$0;
                    baseChartView2.bottomSignatureDate.clear();
                    baseChartView2.bottomSignatureDate.add((ChartBottomSignatureData) this.val$callback);
                    break;
                case 7:
                    RectF rectF = (RectF) this.val$callback;
                    CropAreaView cropAreaView = (CropAreaView) this.this$0;
                    cropAreaView.setActualRect(rectF);
                    cropAreaView.animator = null;
                    break;
                case 8:
                    boolean[] zArr2 = (boolean[]) this.val$callback;
                    boolean z = zArr2[0];
                    ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) this.this$0;
                    if (!z) {
                        zArr2[0] = true;
                        reactionWidgetEntityView.storyReactionWidgetBackground.setMirror(reactionWidgetEntityView.mirror, false);
                    }
                    reactionWidgetEntityView.setRotationY(0.0f);
                    reactionWidgetEntityView.drawScale = 1.0f;
                    break;
                case 9:
                    ((PremiumFeatureBottomSheet) this.this$0).enterAnimationIsRunning = false;
                    ((PremiumAppIconsPreviewView) this.val$callback).setOffset(0.0f);
                    super.onAnimationEnd(animator);
                    break;
                case 10:
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet = (PremiumPreviewBottomSheet) this.this$0;
                    premiumPreviewBottomSheet.enterTransitionInProgress = false;
                    premiumPreviewBottomSheet.enterTransitionProgress = 1.0f;
                    premiumPreviewBottomSheet.iconContainer.invalidate();
                    Drawable drawable = (Drawable) this.val$callback;
                    if (drawable != null) {
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
                        valueAnimatorOfInt.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(7, this, drawable));
                        valueAnimatorOfInt.start();
                    }
                    super.onAnimationEnd(animator);
                    break;
                case 11:
                    GroupCreateSpan groupCreateSpan = (GroupCreateSpan) this.val$callback;
                    SelectorSearchCell.SpansContainer spansContainer = (SelectorSearchCell.SpansContainer) this.this$0;
                    spansContainer.removeView(groupCreateSpan);
                    spansContainer.removingSpans.clear();
                    spansContainer.currentAnimation = null;
                    spansContainer.animationStarted = false;
                    SelectorSearchCell.this.editText.setAllowDrawCursor(true);
                    if (SelectorSearchCell.this.updateHeight != null) {
                        SelectorSearchCell.this.updateHeight.run();
                    }
                    if (SelectorSearchCell.this.scroll) {
                        SelectorSearchCell.this.fullScroll(130);
                        SelectorSearchCell.this.scroll = false;
                    }
                    break;
                case 12:
                    VoIpSwitchLayout voIpSwitchLayout = (VoIpSwitchLayout) this.this$0;
                    voIpSwitchLayout.currentTextView.setText((String) this.val$callback);
                    voIpSwitchLayout.currentTextView.setTranslationY(0.0f);
                    voIpSwitchLayout.currentTextView.setAlpha(1.0f);
                    break;
                case 13:
                    ((VoIpSwitchLayout) this.this$0).removeView((VoIpSwitchLayout.VoIpButtonView) this.val$callback);
                    break;
                case 14:
                    SuperRipple superRipple = (SuperRipple) this.this$0;
                    superRipple.effects.remove((SuperRipple.Effect) this.val$callback);
                    superRipple.updateProperties();
                    break;
                case 15:
                    super.onAnimationEnd(animator);
                    DialogStoriesCell.this.textAnimator = null;
                    AndroidUtilities.removeFromParent((SimpleTextView) this.val$callback);
                    break;
                case 16:
                    boolean[] zArr3 = (boolean[]) this.val$callback;
                    boolean z2 = zArr3[0];
                    ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.this$0;
                    if (!z2) {
                        zArr3[0] = true;
                        profileStoriesView.vibrateNewStory();
                    }
                    profileStoriesView.newStoryBounceT = 1.0f;
                    profileStoriesView.invalidate();
                    break;
                case 17:
                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.val$callback;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.setVisibility(4);
                    }
                    GalleryListView.this.searchContainer.setVisibility(8);
                    break;
                case 18:
                    GallerySheet gallerySheet = (GallerySheet) this.this$0;
                    gallerySheet.galleryOpenCloseAnimator = null;
                    gallerySheet.galleryListViewOpening = null;
                    GallerySheet$$ExternalSyntheticLambda2 gallerySheet$$ExternalSyntheticLambda2 = (GallerySheet$$ExternalSyntheticLambda2) this.val$callback;
                    if (gallerySheet$$ExternalSyntheticLambda2 != null) {
                        gallerySheet$$ExternalSyntheticLambda2.run();
                    }
                    break;
                case 19:
                    ((RoundView) this.val$callback).setDraw(true);
                    CaptionStory.AnonymousClass1 anonymousClass1 = (CaptionStory.AnonymousClass1) this.this$0;
                    if (anonymousClass1.getParent() instanceof ViewGroup) {
                        ((ViewGroup) anonymousClass1.getParent()).removeView(anonymousClass1);
                    }
                    break;
                default:
                    StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer spansContainer2 = (StoryPrivacyBottomSheet.SearchUsersCell.SpansContainer) this.this$0;
                    spansContainer2.removeView((GroupCreateSpan) this.val$callback);
                    spansContainer2.removingSpans.clear();
                    spansContainer2.currentAnimation = null;
                    spansContainer2.animationStarted = false;
                    StoryPrivacyBottomSheet.SearchUsersCell searchUsersCell = StoryPrivacyBottomSheet.SearchUsersCell.this;
                    searchUsersCell.editText.setAllowDrawCursor(true);
                    StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = searchUsersCell.updateHeight;
                    if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                        storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                    }
                    if (searchUsersCell.scroll) {
                        searchUsersCell.fullScroll(130);
                        searchUsersCell.scroll = false;
                    }
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 2:
                    ((ActionBar) this.this$0).actionMode.setVisibility(0);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public AnonymousClass1(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            this.$r8$classId = 1;
            this.val$callback = windowInsetsAnimationCompat;
            this.this$0 = view;
        }
    }

    public final class AnonymousClass12 implements ChatAttachAlert.ChatAttachViewDelegate {
        @Override
        public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        }

        @Override
        public final void didSelectBot(TLRPC.User user) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
        }

        @Override
        public final void doOnIdle(Runnable runnable) {
            runnable.run();
        }

        @Override
        public final View getRevealView() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
        }

        @Override
        public final boolean needEnterComment() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
        }

        @Override
        public final void onCameraOpened() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
        }

        @Override
        public final void onWallpaperSelected(Object obj) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
        }

        @Override
        public final void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        @Override
        public final boolean selectItemOnClicking() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
        }

        @Override
        public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
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
                    float fDp = AndroidUtilities.dp(12.0f);
                    outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + fDp), fDp);
                    break;
                case 5:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(6.0f));
                    break;
                case 6:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                    break;
                case 7:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f / view.getScaleX()) * AndroidUtilities.dp(4.0f));
                    break;
                case 8:
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(10.0f));
                    break;
                case 9:
                    outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(29.0f) + view.getHeight(), AndroidUtilities.dp(29.0f));
                    break;
                case 10:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(18.0f));
                    break;
                case 11:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
                case 12:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
                default:
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(22.0f));
                    break;
            }
        }
    }

    public final class AnonymousClass6 extends LinearLayout {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass6(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 3:
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    PrivateVideoPreviewDialogNew privateVideoPreviewDialogNew = (PrivateVideoPreviewDialogNew) this.this$0;
                    privateVideoPreviewDialogNew.camera.save();
                    privateVideoPreviewDialogNew.camera.rotateY(7.0f);
                    privateVideoPreviewDialogNew.camera.getMatrix(privateVideoPreviewDialogNew.matrixRight);
                    privateVideoPreviewDialogNew.camera.restore();
                    float f = -width;
                    float f2 = -height;
                    privateVideoPreviewDialogNew.matrixRight.preTranslate(f, f2);
                    float f3 = width;
                    float f4 = height;
                    privateVideoPreviewDialogNew.matrixRight.postTranslate(f3, f4);
                    canvas.save();
                    canvas.clipRect(width, 0, getWidth(), getHeight());
                    canvas.concat(privateVideoPreviewDialogNew.matrixRight);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    privateVideoPreviewDialogNew.camera.save();
                    privateVideoPreviewDialogNew.camera.rotateY(-7.0f);
                    privateVideoPreviewDialogNew.camera.getMatrix(privateVideoPreviewDialogNew.matrixLeft);
                    privateVideoPreviewDialogNew.camera.restore();
                    privateVideoPreviewDialogNew.matrixLeft.preTranslate(f, f2);
                    privateVideoPreviewDialogNew.matrixLeft.postTranslate(f3, f4);
                    canvas.save();
                    canvas.clipRect(0, 0, width, getHeight());
                    canvas.concat(privateVideoPreviewDialogNew.matrixLeft);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                case 4:
                    GiftSheet.Tabs tabs = (GiftSheet.Tabs) this.this$0;
                    tabs.selectedPaint.setColor(Theme.multAlpha(0.1f, Theme.getColor(null, Theme.key_dialogGiftsTabText, false)));
                    float f5 = tabs.animatedSelected.set(tabs.selected);
                    double d = f5;
                    int iClamp = Utilities.clamp((int) Math.floor(d), tabs.tabs.size() - 1, 0);
                    int iClamp2 = Utilities.clamp((int) Math.ceil(d), tabs.tabs.size() - 1, 0);
                    if (iClamp < tabs.tabs.size()) {
                        RectF rectF = tabs.flooredRect;
                        View view = (View) tabs.tabs.get(iClamp);
                        rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    } else if (iClamp2 < tabs.tabs.size()) {
                        RectF rectF2 = tabs.flooredRect;
                        View view2 = (View) tabs.tabs.get(iClamp2);
                        rectF2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                    } else {
                        tabs.flooredRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (iClamp2 < tabs.tabs.size()) {
                        RectF rectF3 = tabs.ceiledRect;
                        View view3 = (View) tabs.tabs.get(iClamp2);
                        rectF3.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                    } else if (iClamp < tabs.tabs.size()) {
                        RectF rectF4 = tabs.ceiledRect;
                        View view4 = (View) tabs.tabs.get(iClamp);
                        rectF4.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                    } else {
                        tabs.ceiledRect.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    AndroidUtilities.lerp(tabs.flooredRect, tabs.ceiledRect, f5 - iClamp, tabs.selectedRect);
                    float fHeight = tabs.selectedRect.height() / 2.0f;
                    canvas.drawRoundRect(tabs.selectedRect, fHeight, fHeight, tabs.selectedPaint);
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 5:
                    if (((StarGiftSheet.TopView) this.this$0).currentPage.is(0)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                case 6:
                    if (((StarsIntroActivity) this.this$0).twoButtons) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                case 7:
                    if (((TONIntroActivity) this.this$0).twoButtons) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 2:
                    PremiumPreviewBottomSheet premiumPreviewBottomSheet = PremiumPreviewBottomSheet.this;
                    if (view == premiumPreviewBottomSheet.iconTextureView && premiumPreviewBottomSheet.enterTransitionInProgress) {
                        return true;
                    }
                    return super.drawChild(canvas, view, j);
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    return FloatingToolbar.FloatingToolbarPopup.access$2700((FloatingToolbar.FloatingToolbarPopup) this.this$0);
                default:
                    return super.onInterceptTouchEvent(motionEvent);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            Size size;
            switch (this.$r8$classId) {
                case 0:
                    int size2 = View.MeasureSpec.getSize(i);
                    int paddingRight = getPaddingRight() + getPaddingLeft();
                    RichEditor richEditor = (RichEditor) this.this$0;
                    LinearLayout linearLayout = richEditor.formattingLayout1;
                    if (linearLayout != null) {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) richEditor.formattingLayout1.getLayoutParams();
                        paddingRight += richEditor.formattingLayout1.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                    LinearLayout linearLayout2 = richEditor.formattingLayout2;
                    if (linearLayout2 != null) {
                        linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) richEditor.formattingLayout2.getLayoutParams();
                        paddingRight += richEditor.formattingLayout2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                    }
                    LinearLayout linearLayout3 = richEditor.formattingLayout3;
                    if (linearLayout3 != null) {
                        linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) richEditor.formattingLayout3.getLayoutParams();
                        paddingRight += richEditor.formattingLayout3.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    }
                    richEditor.formattingScrollMaxWidth = Math.max(0, size2 - paddingRight);
                    super.onMeasure(i, i2);
                    break;
                case 1:
                    FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup = (FloatingToolbar.FloatingToolbarPopup) this.this$0;
                    if (FloatingToolbar.FloatingToolbarPopup.access$2700(floatingToolbarPopup) && (size = floatingToolbarPopup.mMainPanelSize) != null) {
                        i = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                    }
                    super.onMeasure(i, i2);
                    break;
                case 8:
                    int size3 = View.MeasureSpec.getSize(i);
                    int paddingRight2 = getPaddingRight() + getPaddingLeft();
                    RichEditorToolbar richEditorToolbar = (RichEditorToolbar) this.this$0;
                    LinearLayout linearLayout4 = richEditorToolbar.formattingLayout1;
                    if (linearLayout4 != null) {
                        linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) richEditorToolbar.formattingLayout1.getLayoutParams();
                        paddingRight2 += richEditorToolbar.formattingLayout1.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                    }
                    LinearLayout linearLayout5 = richEditorToolbar.formattingLayout2;
                    if (linearLayout5 != null) {
                        linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) richEditorToolbar.formattingLayout2.getLayoutParams();
                        paddingRight2 += richEditorToolbar.formattingLayout2.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                    }
                    LinearLayout linearLayout6 = richEditorToolbar.formattingLayout3;
                    if (linearLayout6 != null) {
                        linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) richEditorToolbar.formattingLayout3.getLayoutParams();
                        paddingRight2 += richEditorToolbar.formattingLayout3.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                    }
                    richEditorToolbar.formattingScrollMaxWidth = Math.max(0, size3 - paddingRight2);
                    super.onMeasure(i, i2);
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
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
            ScaleStateListAnimator.apply(this);
            updateColors();
        }

        public int[] getColorKeys() {
            return null;
        }

        public final void setAccent() {
            if (this.accent) {
                this.accent = false;
                updateColors();
            }
        }

        public final void setBackgroundColorKey(int i) {
            if (this.backgroundColorKey == i) {
                return;
            }
            this.backgroundColorKey = i;
            updateColors();
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
            updateColors();
        }

        @Override
        public final void updateColors() {
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
            this.animatedDragging = new AnimatedFloat(new BotSensors$1$$ExternalSyntheticLambda0(this, 29), 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
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
            drawable.setBounds(zzkn.m(iCenterX, drawable), iCenterY - (drawable.getIntrinsicHeight() / 2), (drawable.getIntrinsicWidth() / 2) + iCenterX, (drawable.getIntrinsicHeight() / 2) + iCenterY);
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

    public RichEditor(CharSequence charSequence) {
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
        this.initialText = charSequence;
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
                if (animatedDrawable.getCurrentFrame() > 34) {
                    animatedDrawable.setCurrentFrame(0, false);
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
        final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, resourcesProvider);
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
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 49, 25, 16, 25, 0), context);
        textViewM.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        textViewM.setTextSize(1, 14.0f);
        textViewM.setGravity(17);
        textViewM.setTextColor(Theme.getColor(i, resourcesProvider));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 49, 25, 11, 25, 0));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 49, 14, 31, 14, 0));
        ButtonWithCounterView buttonWithCounterViewM2 = zzkg.m(context, resourcesProvider, false);
        buttonWithCounterViewM2.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(buttonWithCounterViewM2, LayoutHelper.createLinear(-1, 48, 49, 14, 2, 14, 6));
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
        buttonWithCounterViewM2.setOnClickListener(new View.OnClickListener() {
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
        button.setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i2, 0));
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
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.RichEditorDraftSaved, BulletinFactory.of(richEditor.bulletinContainer, richEditor.getResourceProvider()), R.raw.contact_check);
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
                        richEditor.hideEmojiPopup$2(true);
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
        RichEditor$$ExternalSyntheticLambda13 richEditor$$ExternalSyntheticLambda13 = new RichEditor$$ExternalSyntheticLambda13(this, 0);
        this.sizeDelegate = richEditor$$ExternalSyntheticLambda13;
        addDelegate(richEditor$$ExternalSyntheticLambda13);
        RichEditorListView richEditorListView = new RichEditorListView(context, this.currentAccount, getResourceProvider(), new AnonymousClass3(this), new RichEditorListView[1]);
        this.listView = richEditorListView;
        richEditorListView.setFileRefParentObject(this.editingMessageObject);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        addView(this.listView.getOverlayView(), LayoutHelper.createFrame(-1, -1.0f));
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
                arrayList3.addAll(richEditorListView3.resolvePastedMedia(RichHtml.parse(map, str)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    RichEditorListView.flattenBlocks(arrayList3, RichMessageConvert.blocksFromCharSequence(charSequence2), map);
                }
                richEditorListView3.normalizeNestedQuotes();
                richEditorListView3.adapter.update(false);
            } else {
                CharSequence charSequence3 = this.initialText;
                if (charSequence3 != null) {
                    this.listView.setInitialText(charSequence3);
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
        ScaleStateListAnimator.apply(this.backButton);
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
        ScaleStateListAnimator.apply(this.undoButton);
        this.undoButton.setContentDescription(LocaleController.getString(R.string.Undo));
        this.undoButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 4));
        this.historyButtons.addView(this.undoButton, LayoutHelper.createLinear(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.redoButton = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.redoButton.setScaleType(scaleType);
        this.redoButton.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.redoButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        ScaleStateListAnimator.apply(this.redoButton);
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
        ScaleStateListAnimator.apply(this.aiButton);
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
        frameLayout6.addView(this.blocksScrollView, LayoutHelper.createFrame(-1, -1.0f));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 24);
        this.emojiButton = chatActivityEnterViewAnimatedIconView;
        chatActivityEnterViewAnimatedIconView.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.emojiButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.emojiButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i2), getThemedColor(i3), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
        this.blocksLayout.addView(this.emojiButton, LayoutHelper.createLinear(38, 38, 16));
        ScaleStateListAnimator.apply(this.emojiButton);
        this.emojiButton.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.emojiButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 7));
        addBlockButton(R.drawable.iv_text, 1, false).setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(0, this, context));
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
        ScaleStateListAnimator.apply(this.addButton);
        this.addButton.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.addButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 11));
        this.bottomPanel.addView(frameLayout5, LayoutHelper.createLinear(0, 44, 1.0f));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this, context, 0);
        this.formattingPanel = anonymousClass6;
        anonymousClass6.setOrientation(0);
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
        rLottieImageView.setAnimation(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        RLottieDrawable animatedDrawable = this.trashPanelIcon.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.setPlayInDirectionOfCustomEndFrame(true);
            animatedDrawable.setAutoRepeat(0);
            animatedDrawable.setCustomEndFrame(0);
        }
        this.trashPanelIcon.setScaleType(scaleType);
        this.trashPanelIcon.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        this.trashPanelIcon.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.trashPanel.addView(this.trashPanelIcon, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(i2))));
        this.formattingPanel.addView(frameLayout8, LayoutHelper.createFrame(-2, 44.0f));
        ?? r3 = new HorizontalScrollView(context) {
            public final GradientClip clip = new GradientClip();
            public final AnimatedFloat leftGradientAlpha;
            public final AnimatedFloat rightGradientAlpha;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.leftGradientAlpha = new AnimatedFloat(this, 300L, cubicBezierInterpolator);
                this.rightGradientAlpha = new AnimatedFloat(this, 300L, cubicBezierInterpolator);
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
        setOutlineProvider(new AnonymousClass5(11));
        frameLayout8.addView(this.formattingScrollView, LayoutHelper.createFrame(-1, -1.0f));
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
        ?? r4 = new ChatActivityEnterView.SendButton(context, messageObject != null ? R.drawable.input_done : (messageObject == null && (chatActivity = this.chatActivity) != null && chatActivity.isInScheduleMode()) ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider()) {
            @Override
            public final boolean isInScheduleMode() {
                ChatActivity chatActivity2;
                RichEditor richEditor = RichEditor.this;
                return richEditor.editingMessageObject == null && (chatActivity2 = richEditor.chatActivity) != null && chatActivity2.isInScheduleMode();
            }

            @Override
            public final boolean isOpen() {
                return RichEditor.this.sendButtonLoading || super.isOpen();
            }
        };
        this.sendButton = r4;
        r4.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_chat_messagePanelSend))));
        ScaleStateListAnimator.apply(this.sendButton);
        this.bottomPanel.addView(this.sendButton, LayoutHelper.createLinear(44, 44, 0.0f, 5, 8, 0, 0, 0));
        setContentDescription(LocaleController.getString(R.string.Send));
        setOnClickListener(new RichEditor$$ExternalSyntheticLambda3(this, 2));
        setOnLongClickListener(new RichEditor$$ExternalSyntheticLambda12(this, 0));
        AnonymousClass9 anonymousClass9 = this.sendButton;
        if (anonymousClass9 != null) {
            anonymousClass9.setLocked(isSendLocked$1());
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

    public final void hideEmojiPopup$2(boolean z) {
        if (this.emojiSearchOpened) {
            this.emojiSearchOpened = false;
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.closeSearch(false);
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
        final ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions((BaseFragment) this, view, true).dontFocus();
        ItemOptions itemOptionsMakeSwipeback = itemOptionsDontFocus.makeSwipeback();
        itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new RichEditor$$ExternalSyntheticLambda30(0, itemOptionsDontFocus));
        itemOptionsMakeSwipeback.addGap();
        final int i = 0;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptionsDontFocus.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptionsDontFocus.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 2);
        final int i2 = 1;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptionsDontFocus.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptionsDontFocus.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize + 1);
        final int i3 = 2;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptionsDontFocus.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptionsDontFocus.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize);
        final int i4 = 3;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptionsDontFocus.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptionsDontFocus.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 1);
        final int i5 = 4;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptionsDontFocus.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptionsDontFocus.dismiss();
                        break;
                }
            }
        });
        itemOptionsMakeSwipeback.getLast().textView.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        itemOptionsMakeSwipeback.getLast().textView.setTextSize(1, SharedConfig.fontSize - 2);
        final int i6 = 5;
        itemOptionsMakeSwipeback.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), new Runnable(this) {
            public final RichEditor f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading1());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 1:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading2());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 2:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading3());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 3:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading4());
                        itemOptionsDontFocus.dismiss();
                        break;
                    case 4:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading5());
                        itemOptionsDontFocus.dismiss();
                        break;
                    default:
                        this.f$0.listView.turnIntoKeepList(blockRowFindFocusedRow, new TL_iv.pageBlockHeading6());
                        itemOptionsDontFocus.dismiss();
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
        itemOptionsDontFocus.addChecked(z2, requiresPremiumDrawable, LocaleController.getString(R.string.ArticleHeading), new RichEditor$$ExternalSyntheticLambda40(itemOptionsDontFocus, itemOptionsMakeSwipeback, 0));
        itemOptionsDontFocus.getLast().textView.setTypeface(AndroidUtilities.bold());
        itemOptionsDontFocus.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        itemOptionsDontFocus.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, LocaleController.getString(R.string.ArticleText), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 3));
        itemOptionsDontFocus.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, LocaleController.getString(R.string.ArticleQuote), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 4));
        boolean z3 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPullquote);
        RequiresPremiumDrawable requiresPremiumDrawable2 = new RequiresPremiumDrawable(context, R.drawable.iv_pullquote);
        requiresPremiumDrawable2.setPremium(z);
        requiresPremiumDrawable2.premiumIconCutoutColorKey = i7;
        itemOptionsDontFocus.addChecked(z3, requiresPremiumDrawable2, LocaleController.getString(R.string.ArticlePullquote), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 0));
        itemOptionsDontFocus.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        itemOptionsDontFocus.addChecked(blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, LocaleController.getString(R.string.ArticleCode), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 1));
        boolean z4 = blockRowFindFocusedRow != null && (blockRowFindFocusedRow.block instanceof TL_iv.pageBlockFooter);
        RequiresPremiumDrawable requiresPremiumDrawable3 = new RequiresPremiumDrawable(context, R.drawable.iv_footer);
        requiresPremiumDrawable3.setPremium(z);
        requiresPremiumDrawable3.premiumIconCutoutColorKey = i7;
        itemOptionsDontFocus.addChecked(z4, requiresPremiumDrawable3, LocaleController.getString(R.string.ArticleFooter), new RichEditor$$ExternalSyntheticLambda31(this, blockRowFindFocusedRow, 2));
        itemOptionsDontFocus.getLast().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        this.currentMenuVisible = itemOptionsDontFocus.show();
    }

    public final void lambda$createView$5$2$1() {
        RichEditorListView.AnonymousClass1 anonymousClass1 = this.listView.textSelectionHelper;
        if (anonymousClass1 == null || !anonymousClass1.isInSelectionMode()) {
            new RichAIComposeSheet(getContext(), this.currentAccount, getResourceProvider(), new RichEditor$$ExternalSyntheticLambda53(this, 0)).show();
        } else {
            onAiStyleSelection();
        }
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
        showDialog(new PremiumFeatureBottomSheet(this, getContext(), getCurrentAccount(), false, 43, true, null));
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
            Utilities.globalQueue.postRunnable(new RichTableCell$$ExternalSyntheticLambda3(23, richEditorListView, data));
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
        new AIEditorAlert(getContext(), getResourceProvider()).setText(richMessageExtractRichMessage).setOnUseRich(new RichEditor$$ExternalSyntheticLambda53(anonymousClass4BeginSelectionEdit, 10)).show();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        boolean z2 = this.emojiSearchOpened;
        if (z2) {
            if (z2) {
                this.emojiSearchOpened = false;
                EmojiView emojiView = this.emojiView;
                if (emojiView != null) {
                    emojiView.closeSearch(false);
                    this.emojiView.hideSearchKeyboard();
                }
                animateEmojiSearch(false);
                return false;
            }
        } else {
            if (this.emojiViewVisible) {
                hideEmojiPopup$2(true);
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
        this.animateEnterView.sendButtonContainer.setVisibility(4);
        updateAnimatingLocations();
        float f = z ? 0.0f : 1.0f;
        this.animateOpenProgress = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        this.animatingOpen = true;
        invalidate();
        valueAnimatorOfFloat.addUpdateListener(new RichEditor$$ExternalSyntheticLambda2(this, i2));
        valueAnimatorOfFloat.addListener(new AnonymousClass1(i, this, runnable));
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
        post(new VoIPFragment$8$$ExternalSyntheticLambda1(animatorSet, 23));
        return animatorSet;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        RichEditor$$ExternalSyntheticLambda13 richEditor$$ExternalSyntheticLambda13;
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
        if (anonymousClass2 == null || (richEditor$$ExternalSyntheticLambda13 = this.sizeDelegate) == null) {
            return;
        }
        anonymousClass2.removeDelegate(richEditor$$ExternalSyntheticLambda13);
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
            hideEmojiPopup$2(false);
        }
        if (!this.keyboardVisible && z && (itemOptions = this.currentMenuVisible) != null) {
            itemOptions.dismiss();
            this.currentMenuVisible = null;
        }
        onInsets(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public final boolean onSendLongClick(View view) {
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
                    messageSendPreview.dismiss(false);
                    this.messageSendPreview = null;
                }
                MessageSendPreview messageSendPreview2 = new MessageSendPreview(getContext(), getResourceProvider());
                this.messageSendPreview = messageSendPreview2;
                messageSendPreview2.setOnDismissListener(new RichEditor$$ExternalSyntheticLambda46(this, 0));
                long dialogId = this.chatActivity.getDialogId();
                MessageObject replyMessage = this.chatActivity.getReplyMessage();
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
                if (replyMessage != null && !replyMessage.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = replyMessage.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
                if (replyMessage != null && !replyMessage.isTopicMainMessage) {
                    messageObject.replyMessageObject = replyMessage;
                }
                messageObject.sendPreview = true;
                messageObject.isOutOwnerCached = Boolean.TRUE;
                messageObject.generateLayout(null);
                messageObject.notime = true;
                this.messageSendPreview.setMessageObjects(MediaController$$ExternalSyntheticOutline1.m(messageObject));
                setScaleX(1.0f);
                setScaleY(1.0f);
                ChatActivityEnterView.SendButton sendButton = this.messageSendPreview.setSendButton(this.sendButton, true, new RichEditor$$ExternalSyntheticLambda3(this, 10));
                if (sendButton != null) {
                    sendButton.setBackground(new ShadowWrapperDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), getThemedColor(Theme.key_featuredStickers_addButton))));
                    this.messageSendPreview.setSendButtonWidth(AndroidUtilities.dp(44.0f));
                }
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.sendButton);
                boolean zIsUserSelf = UserObject.isUserSelf(this.chatActivity.getCurrentUser());
                if (this.chatActivity.canScheduleMessage()) {
                    itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new RichEditor$$ExternalSyntheticLambda48(this, dialogId, 0));
                    if (!zIsUserSelf && dialogId > 0) {
                        itemOptionsMakeOptions.add(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new RichEditor$$ExternalSyntheticLambda1(this, 5));
                    }
                }
                if (!zIsUserSelf) {
                    itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new RichEditor$$ExternalSyntheticLambda1(this, 6));
                }
                itemOptionsMakeOptions.setupSelectors();
                this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
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
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), this, false, false, true, getResourceProvider());
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i3, boolean z, boolean z2, int i4, int i5, long j, boolean z3, boolean z4, long j2) {
                ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                RichEditor richEditor = RichEditor.this;
                if (i3 == 7 || i3 == 8) {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert2.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = chatAttachAlert2.getPhotoLayout().getSelectedPhotosOrder();
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
            public final void doOnIdle(Runnable runnable) {
                NotificationCenter.getInstance(RichEditor.this.getCurrentAccount()).doOnIdle(runnable);
            }

            @Override
            public final View getRevealView() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
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
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public final void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public final boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i3, i4, j, z2, j2);
            }
        });
        chatAttachAlert.getPhotoLayout().setIncludeVideosInGallery(true);
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.setMaxSelectedPhotos(1, true);
        chatAttachAlert.enablePollAttachMode(i);
        chatAttachAlert.setLocationActivityDelegate(new RichEditor$$ExternalSyntheticLambda43(this, chatAttachAlert));
        chatAttachAlert.setAudioSelectDelegate(new RichEditor$$ExternalSyntheticLambda43(this, chatAttachAlert));
        chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
            @Override
            public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i3, int i4, long j, boolean z2, long j2) {
                RichEditor richEditor = RichEditor.this;
                if (arrayList != null && !arrayList.isEmpty()) {
                    richEditor.listView.attachDocument((String) arrayList.get(0));
                } else if (arrayList3 != null && !arrayList3.isEmpty()) {
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
            public final void didSelectPhotos(ArrayList arrayList, boolean z, int i3, int i4, long j) {
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$didSelectPhotos(this, arrayList, z, i3, i4, j);
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
                ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
            }
        });
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
                    TL_iv.RichMessage richMessage2 = new TL_iv.RichMessage();
                    richMessage2.blocks = arrayListFlattenRowsToBlocks;
                    richMessage2.photos = richEditorListView.collectPhotos();
                    richMessage2.documents = richEditorListView.collectDocuments();
                    richMessage = richMessage2;
                }
            } else {
                richMessage = null;
            }
        }
        if (richMessage == null && (runnable = this.onClearedCallback) != null) {
            runnable.run();
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivity.getChatActivityEnterView();
        if (richMessage != null && !this.sent) {
            RichEditorListView richEditorListView2 = this.listView;
            if (richEditorListView2.hasAnyText() && !RichMessageConvert.isLossy(richEditorListView2.rows, richEditorListView2.quoteAuthors) && chatActivityEnterView != null) {
                chatActivityEnterView.applyConvertedSimpleDraft(RichMessageConvert.rowsToSimpleMessage(this.listView.rows));
                return true;
            }
        }
        getMediaDataController().saveDraft(this.chatActivity.getDialogId(), this.chatActivity.getDraftThreadId(), "", null, null, null, null, 0L, false, false, richMessage);
        TL_iv.RichMessage richMessage3 = richMessage;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setRichDraftPreview(richMessage3);
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
            ChatActivityEnterView chatActivityEnterView = this.chatActivity.getChatActivityEnterView();
            if (chatActivityEnterView == null) {
                return;
            }
            this.sent = true;
            Runnable runnable = this.onSentCallback;
            if (runnable != null) {
                runnable.run();
            }
            chatActivityEnterView.sendConvertedRichAsSimple(RichMessageConvert.rowsToSimpleMessage(this.listView.rows), z, i, i2);
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
        final MessageObject replyMessage = this.chatActivity.getReplyMessage();
        final MessageObject threadMessage = this.chatActivity.getThreadMessage();
        final long sendMonoForumPeerId = this.chatActivity.getSendMonoForumPeerId();
        final SendMessageChatArguments messageChatSendParams = this.chatActivity.getMessageChatSendParams();
        final MessageObject messageObject = this.editingMessageObject;
        ?? r0 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$sendMessage$49(messageObject, arrayListFlattenRowsToBlocks, arrayListCollectPhotos, arrayListCollectDocuments, arrayListCollect, dialogId, replyMessage, threadMessage, z, i, i2, messageChatSendParams, sendMonoForumPeerId);
            }
        };
        Runnable runnable2 = this.onSentCallback;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i == 0 || messageObject != null) {
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
        Context context = getContext();
        RichEditorListView richEditorListView = this.listView;
        Objects.requireNonNull(richEditorListView);
        openConversionSheet(context, new RichEditorListView$$ExternalSyntheticLambda4(richEditorListView, 1), new RichEditor$$ExternalSyntheticLambda1(this, 4), getResourceProvider());
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
        setEnabled(zIsWithinLimits);
        OKLCH.m(animate(), zIsWithinLimits ? 1.0f : 0.5f, 150L);
    }

    public final class AnonymousClass3 implements SuccessContinuation, SelectClause1, SearchAdapterHelper.SearchAdapterHelperDelegate, PaintWeightChooserView.ValueOverride, TimelineView.TimelineDelegate, RichEditorListView.Delegate, RichCaptionController.Host {
        public Object this$0;

        public AnonymousClass3(Object obj) {
            this.this$0 = obj;
        }

        public static boolean isNotification(Bundle bundle) {
            return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
        }

        public static String userFriendlyKey(String str) {
            return str.startsWith("gcm.n.") ? str.substring(6) : str;
        }

        @Override
        public boolean canApplySearchResults(int i) {
            return true;
        }

        @Override
        public TextSelectionHelper.ArticleSelectableView cell() {
            return (RichMediaCell) this.this$0;
        }

        @Override
        public BlockRow currentRow() {
            return ((RichMediaCell) this.this$0).currentRow;
        }

        public DecoderResult decode(TaskQueue taskQueue) throws ChecksumException, FormatException {
            int i;
            int bits;
            Mode mode;
            int i2;
            StringBuilder sb;
            int i3;
            ArrayList arrayList;
            int bits2;
            Version version = taskQueue.readVersion();
            ErrorCorrectionLevel errorCorrectionLevel = taskQueue.readFormatInformation().errorCorrectionLevel;
            FormatInformation formatInformation = taskQueue.readFormatInformation();
            Version version2 = taskQueue.readVersion();
            int i4 = PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility.values(8)[formatInformation.dataMask];
            BitMatrix bitMatrix = (BitMatrix) taskQueue.zza;
            int i5 = bitMatrix.height;
            for (int i6 = 0; i6 < i5; i6++) {
                for (int i7 = 0; i7 < i5; i7++) {
                    if (Theme.ResourcesProvider.CC._dispatch_isMasked(i4, i6, i7)) {
                        bitMatrix.flip(i7, i6);
                    }
                }
            }
            int i8 = version2.versionNumber * 4;
            int i9 = i8 + 17;
            BitMatrix bitMatrix2 = new BitMatrix(i9, i9);
            bitMatrix2.setRegion(0, 0, 9, 9);
            int i10 = i8 + 9;
            bitMatrix2.setRegion(i10, 0, 8, 9);
            bitMatrix2.setRegion(0, i10, 9, 8);
            int[] iArr = version2.alignmentPatternCenters;
            int bits3 = -1;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = iArr[i11] - 2;
                for (int i13 = 0; i13 < length; i13++) {
                    if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
                        bitMatrix2.setRegion(iArr[i13] - 2, i12, 5, 5);
                    }
                }
            }
            int i14 = 6;
            bitMatrix2.setRegion(6, 9, 1, i8);
            bitMatrix2.setRegion(9, 6, i8, 1);
            if (version2.versionNumber > 6) {
                int i15 = i8 + 6;
                bitMatrix2.setRegion(i15, 0, 3, 6);
                bitMatrix2.setRegion(0, i15, 6, 3);
            }
            int i16 = version2.totalCodewords;
            byte[] bArr = new byte[i16];
            int i17 = i5 - 1;
            int i18 = i17;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z = true;
            while (i18 > 0) {
                if (i18 == i14) {
                    i18--;
                }
                for (int i22 = 0; i22 < i5; i22++) {
                    int i23 = z ? i17 - i22 : i22;
                    for (int i24 = 0; i24 < 2; i24++) {
                        int i25 = i18 - i24;
                        if (!bitMatrix2.get(i25, i23)) {
                            i20++;
                            i21 <<= 1;
                            if (bitMatrix.get(i25, i23)) {
                                i21 |= 1;
                            }
                            if (i20 == 8) {
                                bArr[i19] = (byte) i21;
                                i19++;
                                i20 = 0;
                                i21 = 0;
                            }
                        }
                    }
                }
                z = !z;
                i18 -= 2;
                i14 = 6;
            }
            if (i19 != i16) {
                throw FormatException.getFormatInstance();
            }
            if (i16 != version.totalCodewords) {
                throw new IllegalArgumentException();
            }
            zzbv zzbvVar = version.ecBlocks[errorCorrectionLevel.ordinal()];
            Version.ECB[] ecbArr = (Version.ECB[]) zzbvVar.zza;
            int i26 = 0;
            for (Version.ECB ecb : ecbArr) {
                i26 += ecb.count;
            }
            DataBlock[] dataBlockArr = new DataBlock[i26];
            int length2 = ecbArr.length;
            int i27 = 0;
            int i28 = 0;
            while (true) {
                i = zzbvVar.zzb;
                if (i28 >= length2) {
                    break;
                }
                Version.ECB ecb2 = ecbArr[i28];
                int i29 = 0;
                while (i29 < ecb2.count) {
                    int i30 = ecb2.dataCodewords;
                    dataBlockArr[i27] = new DataBlock(i30, new byte[i + i30]);
                    i29++;
                    i27++;
                    zzbvVar = zzbvVar;
                }
                i28++;
            }
            int length3 = dataBlockArr[0].codewords.length;
            int i31 = i26 - 1;
            while (i31 >= 0 && dataBlockArr[i31].codewords.length != length3) {
                i31--;
            }
            int i32 = i31 + 1;
            int i33 = length3 - i;
            int i34 = 0;
            int i35 = 0;
            while (i34 < i33) {
                int i36 = i35;
                int i37 = 0;
                while (i37 < i27) {
                    dataBlockArr[i37].codewords[i34] = bArr[i36];
                    i37++;
                    i36++;
                }
                i34++;
                i35 = i36;
            }
            int i38 = i32;
            while (i38 < i27) {
                dataBlockArr[i38].codewords[i33] = bArr[i35];
                i38++;
                i35++;
            }
            boolean z2 = false;
            int length4 = dataBlockArr[0].codewords.length;
            while (i33 < length4) {
                int i39 = i35;
                int i40 = 0;
                while (i40 < i27) {
                    dataBlockArr[i40].codewords[i40 < i32 ? i33 : i33 + 1] = bArr[i39];
                    i40++;
                    i39++;
                }
                i33++;
                i35 = i39;
            }
            int i41 = 0;
            for (int i42 = 0; i42 < i26; i42++) {
                i41 += dataBlockArr[i42].numDataCodewords;
            }
            byte[] bArr2 = new byte[i41];
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            while (i43 < i26) {
                DataBlock dataBlock = dataBlockArr[i43];
                byte[] bArr3 = dataBlock.codewords;
                int i46 = dataBlock.numDataCodewords;
                int length5 = bArr3.length;
                int[] iArr2 = new int[length5];
                for (int i47 = 0; i47 < length5; i47++) {
                    iArr2[i47] = bArr3[i47] & 255;
                }
                try {
                    int iDecodeWithECCount = ((RichMapCell.AnonymousClass1) this.this$0).decodeWithECCount(bArr3.length - i46, iArr2);
                    for (int i48 = 0; i48 < i46; i48++) {
                        bArr3[i48] = (byte) iArr2[i48];
                    }
                    i44 += iDecodeWithECCount;
                    int i49 = i45;
                    int i50 = 0;
                    while (i50 < i46) {
                        bArr2[i49] = bArr3[i50];
                        i50++;
                        i49++;
                    }
                    i43++;
                    i45 = i49;
                } catch (ReedSolomonException unused) {
                    ChecksumException checksumException = ChecksumException.INSTANCE;
                    if (ReaderException.isStackTrace) {
                        throw new ChecksumException();
                    }
                    throw ChecksumException.INSTANCE;
                }
            }
            char[] cArr = DecodedBitStreamParser.ALPHANUMERIC_CHARS;
            BitSource bitSource = new BitSource(bArr2);
            StringBuilder sb2 = new StringBuilder(50);
            ArrayList arrayList2 = new ArrayList(1);
            int bits4 = -1;
            boolean z3 = false;
            CharacterSetECI characterSetECI = null;
            boolean z4 = false;
            while (true) {
                try {
                    int iAvailable = bitSource.available();
                    Mode mode2 = Mode.TERMINATOR;
                    if (iAvailable < 4 || (bits = bitSource.readBits(4)) == 0) {
                        mode = mode2;
                    } else if (bits == 1) {
                        mode = Mode.NUMERIC;
                    } else if (bits == 2) {
                        mode = Mode.ALPHANUMERIC;
                    } else if (bits == 3) {
                        mode = Mode.STRUCTURED_APPEND;
                    } else if (bits == 4) {
                        mode = Mode.BYTE;
                    } else if (bits == 5) {
                        mode = Mode.FNC1_FIRST_POSITION;
                    } else if (bits == 7) {
                        mode = Mode.ECI;
                    } else if (bits == 8) {
                        mode = Mode.KANJI;
                    } else if (bits == 9) {
                        mode = Mode.FNC1_SECOND_POSITION;
                    } else {
                        if (bits != 13) {
                            throw new IllegalArgumentException();
                        }
                        mode = Mode.HANZI;
                    }
                    int iOrdinal = mode.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 3) {
                            i2 = i44;
                            sb = sb2;
                            if (bitSource.available() < 16) {
                                throw FormatException.getFormatInstance();
                            }
                            bits3 = bitSource.readBits(8);
                            bits4 = bitSource.readBits(8);
                        } else {
                            if (iOrdinal == 5) {
                                i2 = i44;
                                int bits5 = bitSource.readBits(8);
                                if ((bits5 & 128) == 0) {
                                    bits2 = bits5 & 127;
                                    sb = sb2;
                                } else {
                                    sb = sb2;
                                    if ((bits5 & 192) == 128) {
                                        bits2 = ((bits5 & 63) << 8) | bitSource.readBits(8);
                                    } else {
                                        if ((bits5 & 224) != 192) {
                                            throw FormatException.getFormatInstance();
                                        }
                                        bits2 = ((bits5 & 31) << 16) | bitSource.readBits(16);
                                    }
                                    HashMap map = CharacterSetECI.VALUE_TO_ECI;
                                    if (bits2 >= 0 || bits2 >= 900) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    CharacterSetECI characterSetECI2 = (CharacterSetECI) CharacterSetECI.VALUE_TO_ECI.get(Integer.valueOf(bits2));
                                    if (characterSetECI2 == null) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    characterSetECI = characterSetECI2;
                                }
                                HashMap map2 = CharacterSetECI.VALUE_TO_ECI;
                                if (bits2 >= 0) {
                                }
                                throw FormatException.getFormatInstance();
                            }
                            if (iOrdinal == 7) {
                                i2 = i44;
                                sb = sb2;
                                z4 = true;
                                z2 = true;
                            } else if (iOrdinal == 8) {
                                i2 = i44;
                                sb = sb2;
                                z3 = true;
                                z4 = true;
                            } else if (iOrdinal != 9) {
                                int bits6 = bitSource.readBits(mode.getCharacterCountBits(version));
                                int iOrdinal2 = mode.ordinal();
                                i2 = i44;
                                if (iOrdinal2 == 1) {
                                    DecodedBitStreamParser.decodeNumericSegment(bitSource, sb2, bits6);
                                } else if (iOrdinal2 == 2) {
                                    DecodedBitStreamParser.decodeAlphanumericSegment(bitSource, sb2, bits6, z4);
                                } else if (iOrdinal2 == 4) {
                                    DecodedBitStreamParser.decodeByteSegment(bitSource, sb2, bits6, characterSetECI, arrayList2);
                                } else {
                                    if (iOrdinal2 != 6) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    DecodedBitStreamParser.decodeKanjiSegment(bitSource, sb2, bits6);
                                }
                            } else {
                                i2 = i44;
                                int bits7 = bitSource.readBits(4);
                                int bits8 = bitSource.readBits(mode.getCharacterCountBits(version));
                                if (bits7 == 1) {
                                    DecodedBitStreamParser.decodeHanziSegment(bitSource, sb2, bits8);
                                }
                            }
                        }
                        if (mode == mode2) {
                            if (characterSetECI != null) {
                                if (z2) {
                                    i3 = 4;
                                } else if (z3) {
                                    i3 = 6;
                                } else {
                                    i3 = 2;
                                }
                            } else if (z2) {
                                i3 = 3;
                            } else if (z3) {
                                i3 = 5;
                            } else {
                                i3 = 1;
                            }
                            String string = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            DecoderResult decoderResult = new DecoderResult(bArr2, string, arrayList, errorCorrectionLevel.toString(), bits3, bits4, i3);
                            decoderResult.errorsCorrected = Integer.valueOf(i2);
                            return decoderResult;
                        }
                        sb2 = sb;
                        i44 = i2;
                    } else {
                        i2 = i44;
                    }
                    sb = sb2;
                    if (mode == mode2) {
                        if (characterSetECI != null) {
                            if (z2) {
                                i3 = 4;
                            } else if (z3) {
                                i3 = 6;
                            } else {
                                i3 = 2;
                            }
                        } else if (z2) {
                            i3 = 3;
                        } else if (z3) {
                            i3 = 5;
                        } else {
                            i3 = 1;
                        }
                        String string2 = sb.toString();
                        if (arrayList2.isEmpty()) {
                            arrayList = null;
                        } else {
                            arrayList = arrayList2;
                        }
                        DecoderResult decoderResult2 = new DecoderResult(bArr2, string2, arrayList, errorCorrectionLevel.toString(), bits3, bits4, i3);
                        decoderResult2.errorsCorrected = Integer.valueOf(i2);
                        return decoderResult2;
                    }
                    sb2 = sb;
                    i44 = i2;
                } catch (IllegalArgumentException unused2) {
                    throw FormatException.getFormatInstance();
                }
            }
        }

        @Override
        public float get() {
            return ((StickerMakerView) this.this$0).outlineWidth;
        }

        public boolean getBoolean(String str) {
            String string = getString(str);
            return "1".equals(string) || Boolean.parseBoolean(string);
        }

        @Override
        public LongSparseArray getExcludeCallParticipants() {
            return null;
        }

        @Override
        public LongSparseArray getExcludeUsers() {
            return null;
        }

        public Integer getInteger(String str) {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(string));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + userFriendlyKey(str) + "(" + string + ") into an int");
                return null;
            }
        }

        public JSONArray getJSONArray(String str) {
            String string = getString(str);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                return new JSONArray(string);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + userFriendlyKey(str) + ": " + string + ", falling back to default");
                return null;
            }
        }

        public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
            String[] strArr;
            String string = getString(str2);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String string2 = getString(str2.concat("_loc_key"));
            if (!TextUtils.isEmpty(string2)) {
                int identifier = resources.getIdentifier(string2, "string", str);
                if (identifier == 0) {
                    Log.w("NotificationParams", userFriendlyKey(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                    return null;
                }
                JSONArray jSONArray = getJSONArray(str2.concat("_loc_args"));
                if (jSONArray == null) {
                    strArr = null;
                } else {
                    int length = jSONArray.length();
                    strArr = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr[i] = jSONArray.optString(i);
                    }
                }
                if (strArr == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, strArr);
                } catch (MissingFormatArgumentException e) {
                    Log.w("NotificationParams", "Missing format argument for " + userFriendlyKey(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
                }
            }
            return null;
        }

        public String getString(String str) {
            Bundle bundle = (Bundle) this.this$0;
            if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
                String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
                if (bundle.containsKey(strReplace)) {
                    str = strReplace;
                }
            }
            return bundle.getString(str);
        }

        @Override
        public ItemOptions makeMenu(View view) {
            return ItemOptions.makeOptions((RichEditor) this.this$0, view);
        }

        @Override
        public void onAudioLeftChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.audioLeft = f;
            storyEntry.editedMedia = true;
            previewView.updateAudioPlayer(true);
        }

        @Override
        public void onAudioOffsetChange(long j) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.audioOffset = j;
            storyEntry.editedMedia = true;
            previewView.updateAudioPlayer(true);
        }

        @Override
        public void onAudioRemove() {
            ((PreviewView) this.this$0).setupAudio(null);
        }

        @Override
        public void onAudioRightChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.audioRight = f;
            storyEntry.editedMedia = true;
            previewView.updateAudioPlayer(true);
        }

        @Override
        public void onAudioVolumeChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.audioVolume = f;
            storyEntry.editedMedia = true;
            previewView.checkVolumes();
        }

        @Override
        public void onBlockButtonEditRequested(RichEditorListView.BlockButtonEdit blockButtonEdit, View view) {
            RichEditor richEditor = (RichEditor) this.this$0;
            richEditor.currentMenuVisible = RichInlineButtonEditor.showBlock(ItemOptions.makeOptions(richEditor, view).dontFocus(), richEditor, richEditor.getContext(), richEditor.getResourceProvider(), blockButtonEdit, false);
        }

        @Override
        public void onCaptionChanged() {
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            if (anonymousClass6 != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                RichEditorHistory richEditorHistory = richEditorListView.history;
                if (richEditorHistory != null) {
                    richEditorHistory.onTyping();
                }
                richEditorListView.delegate.onContentChanged();
            }
        }

        @Override
        public void onCaptionEnter() {
            RichMediaCell richMediaCell = (RichMediaCell) this.this$0;
            RichEditorListView.AnonymousClass6 anonymousClass6 = richMediaCell.delegate;
            if (anonymousClass6 != null) {
                RichEditorListView.this.onCaptionEnter(richMediaCell.currentRow);
            }
        }

        @Override
        public void onCaptionLockedInsert(CharSequence charSequence) {
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            if (anonymousClass6 == null || charSequence == null || charSequence.length() <= 0) {
                return;
            }
            RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
        }

        @Override
        public boolean onCaptionSelectAll() {
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            return anonymousClass6 != null && RichEditorListView.this.tryEscalateSelectAll();
        }

        @Override
        public void onCaptionSpansChanged() {
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            if (anonymousClass6 != null) {
                RichEditorListView.access$3700(RichEditorListView.this);
            }
        }

        @Override
        public void onCaptionWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            if (anonymousClass6 == null || (richEditorHistory = RichEditorListView.this.history) == null) {
                return;
            }
            richEditorHistory.onBeforeChange(i, i2);
        }

        @Override
        public void onContentChanged() {
            RichEditor richEditor = (RichEditor) this.this$0;
            if (richEditor.sendButton != null) {
                boolean zHasPendingUploads = richEditor.listView.hasPendingUploads();
                richEditor.sendButtonLoading = zHasPendingUploads;
                richEditor.sendButton.setLoading(zHasPendingUploads, -3.0f);
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
        public void onDataSetChanged(int i) {
            AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0(this, 1));
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
            ItemOptions itemOptionsDontFocus = ItemOptions.makeOptions(richEditor, view).dontFocus();
            richEditor.getContext();
            richEditor.getResourceProvider();
            richEditor.currentMenuVisible = RichInlineButtonEditor.show(itemOptionsDontFocus, richEditor, inlineButtonEdit, false);
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
                ChatAttachAlert chatAttachAlert = new ChatAttachAlert(richEditor.getContext(), richEditor, false, false, false, richEditor.getResourceProvider());
                chatAttachAlert.setDelegate(new AnonymousClass12());
                chatAttachAlert.setLocationPicker();
                chatAttachAlert.setLocationActivityDelegate(new RichEditor$$ExternalSyntheticLambda60(richEditor, blockRow, chatAttachAlert, 0));
                chatAttachAlert.init();
                chatAttachAlert.show();
            }
        }

        @Override
        public void onProgressChange(long j, boolean z) {
            PreviewView previewView = (PreviewView) this.this$0;
            if (!z) {
                previewView.seekTo(j);
                return;
            }
            VideoPlayer videoPlayer = previewView.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.seekTo(j, true);
                return;
            }
            if (previewView.isCollage()) {
                previewView.collage.seekTo(j, true);
                return;
            }
            VideoPlayer videoPlayer2 = previewView.audioPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.seekTo(j, false);
            }
        }

        @Override
        public void onProgressDragChange(boolean z) {
            PreviewView previewView = (PreviewView) this.this$0;
            if (previewView.isCollage()) {
                previewView.collage.getClass();
            }
            previewView.updatePauseReason(-4, z);
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
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            if (anonymousClass6 != null) {
                RichEditorListView richEditorListView = RichEditorListView.this;
                richEditorListView.prepareEditText(richEditText);
                richEditorListView.delegate.makeEditTextFocusable(richEditText);
            }
        }

        @Override
        public void onRoundLeftChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.roundLeft = f;
            storyEntry.editedMedia = true;
            previewView.updateRoundPlayer(true);
        }

        @Override
        public void onRoundOffsetChange(long j) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.roundOffset = j;
            storyEntry.editedMedia = true;
            previewView.updateRoundPlayer(true);
        }

        @Override
        public void onRoundRemove() {
            PreviewView previewView = (PreviewView) this.this$0;
            previewView.setupRound(null, null, true);
            StoryRecorder.AnonymousClass7 anonymousClass7 = (StoryRecorder.AnonymousClass7) previewView;
            StoryRecorder.AnonymousClass7 anonymousClass8 = StoryRecorder.this.previewView;
            if (anonymousClass8 != null) {
                anonymousClass8.setupRound(null, null, true);
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 != null) {
                anonymousClass24.deleteRound();
            }
            StoryRecorder.AnonymousClass8 anonymousClass9 = storyRecorder.captionEdit;
            if (anonymousClass9 != null) {
                anonymousClass9.setHasRoundVideo(false);
            }
            StoryEntry storyEntry = storyRecorder.outputEntry;
            if (storyEntry != null) {
                File file = storyEntry.round;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    storyRecorder.outputEntry.round = null;
                }
                if (storyRecorder.outputEntry.roundThumb != null) {
                    try {
                        new File(storyRecorder.outputEntry.roundThumb).delete();
                    } catch (Exception unused2) {
                    }
                    storyRecorder.outputEntry.roundThumb = null;
                }
            }
        }

        @Override
        public void onRoundRightChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.roundRight = f;
            storyEntry.editedMedia = true;
            previewView.updateRoundPlayer(true);
        }

        @Override
        public void onRoundSelectChange(boolean z) {
            RoundView roundView;
            StoryRecorder storyRecorder = StoryRecorder.this;
            StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 == null) {
                return;
            }
            RoundView roundView2 = null;
            if (!z && (anonymousClass24.getSelectedEntity() instanceof RoundView)) {
                storyRecorder.paintView.selectEntity$1(null, true);
                return;
            }
            if (!z || (storyRecorder.paintView.getSelectedEntity() instanceof RoundView)) {
                return;
            }
            StoryRecorder.AnonymousClass24 anonymousClass25 = storyRecorder.paintView;
            int i = 0;
            while (true) {
                if (i >= anonymousClass25.entitiesView.getChildCount()) {
                    roundView = null;
                    break;
                }
                View childAt = anonymousClass25.entitiesView.getChildAt(i);
                if (childAt instanceof RoundView) {
                    roundView = (RoundView) childAt;
                    break;
                }
                i++;
            }
            if (roundView != null) {
                StoryRecorder.AnonymousClass24 anonymousClass26 = storyRecorder.paintView;
                for (int i2 = 0; i2 < anonymousClass26.entitiesView.getChildCount(); i2++) {
                    View childAt2 = anonymousClass26.entitiesView.getChildAt(i2);
                    if (childAt2 instanceof RoundView) {
                        roundView2 = (RoundView) childAt2;
                        break;
                    }
                }
                anonymousClass26.selectEntity$1(roundView2, true);
            }
        }

        @Override
        public void onRoundVolumeChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.roundVolume = f;
            storyEntry.editedMedia = true;
            previewView.checkVolumes();
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
        public void onSetHashtags(ArrayList arrayList, HashMap map) {
        }

        @Override
        public void onSlashSuggest(RichTextCell richTextCell, String str) {
            RichEditor richEditor = (RichEditor) this.this$0;
            if (richEditor.commandSuggestions == null) {
                richEditor.commandSuggestions = new TooltipPopup(new RichEditor$3$$ExternalSyntheticLambda0(this, 0), richEditor.getResourceProvider());
            }
            richEditor.commandSuggestions.update(richTextCell, str);
        }

        public void onUncaughtException(SettingsController settingsController, Thread thread, Throwable th) {
            CrashlyticsController crashlyticsController = (CrashlyticsController) this.this$0;
            synchronized (crashlyticsController) {
                try {
                    String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    try {
                        try {
                            Utils.awaitEvenIfOnMainThread(crashlyticsController.backgroundWorker.submitTask(crashlyticsController.new AnonymousClass2(System.currentTimeMillis(), th, thread, settingsController)));
                        } catch (TimeoutException unused) {
                            Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                        }
                    } catch (Exception e) {
                        Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void onVideoLeftChange(boolean z, float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.left = f;
            storyEntry.editedMedia = true;
            VideoPlayer videoPlayer = previewView.videoPlayer;
            if (videoPlayer == null || videoPlayer.getDuration() == -9223372036854775807L) {
                return;
            }
            previewView.seekTo((long) (f * previewView.videoPlayer.getDuration()));
        }

        @Override
        public void onVideoOffsetChange(int i, long j) {
            ArrayList arrayList;
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null || (arrayList = storyEntry.collageContent) == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            ((StoryEntry) previewView.entry.collageContent.get(i)).videoOffset = j;
        }

        @Override
        public void onVideoRightChange(boolean z, float f) {
            StoryEntry storyEntry = ((PreviewView) this.this$0).entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.right = f;
            storyEntry.editedMedia = true;
        }

        @Override
        public void onVideoSelected(int i) {
            CollageLayoutView2 collageLayoutView2 = ((PreviewView) this.this$0).collage;
            if (collageLayoutView2 != null) {
                ArrayList arrayList = collageLayoutView2.parts;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    CollageLayoutView2.Part part = (CollageLayoutView2.Part) obj;
                    if (part.index == i) {
                        part.highlightAnimated.set(1.0f, true);
                        collageLayoutView2.invalidate();
                        return;
                    }
                }
            }
        }

        @Override
        public void onVideoVolumeChange(float f) {
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null) {
                return;
            }
            storyEntry.videoVolume = f;
            previewView.checkVolumes();
        }

        public Bundle paramsForAnalyticsIntent() {
            Bundle bundle = (Bundle) this.this$0;
            Bundle bundle2 = new Bundle(bundle);
            for (String str : bundle.keySet()) {
                if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                    bundle2.remove(str);
                }
            }
            return bundle2;
        }

        @Override
        public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
            RichEditorListView.AnonymousClass6 anonymousClass6 = ((RichMediaCell) this.this$0).delegate;
            if (anonymousClass6 != null) {
                return RichEditorListView.this.getTextSelectionHelper();
            }
            return null;
        }

        @Override
        public void set(float f) {
            ((StickerMakerView) this.this$0).setOutlineWidth(f);
        }

        @Override
        public Task then(Object obj) throws Throwable {
            JSONObject jSONObjectHandleResponse;
            FileWriter fileWriter;
            SettingsController settingsController = (SettingsController) this.this$0;
            SettingsRequest settingsRequest = (SettingsRequest) settingsController.settingsRequest;
            RequestOptions requestOptions = (RequestOptions) settingsController.settingsSpiCall;
            String str = requestOptions.mPublishableApiKey;
            FileWriter fileWriter2 = null;
            try {
                HashMap queryParamsFor = RequestOptions.getQueryParamsFor(settingsRequest);
                Result result = new Result(queryParamsFor, str);
                result.header("User-Agent", "Crashlytics Android SDK/18.6.0");
                result.header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                RequestOptions.applyHeadersTo(result, settingsRequest);
                String str2 = "Requesting settings from " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                String str3 = "Settings query params were: " + queryParamsFor;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str3, null);
                }
                jSONObjectHandleResponse = requestOptions.handleResponse(result.execute());
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                jSONObjectHandleResponse = null;
            }
            if (jSONObjectHandleResponse != null) {
                Settings settingsJson = ((SafeFlow) settingsController.settingsJsonParser).parseSettingsJson(jSONObjectHandleResponse);
                long j = settingsJson.expiresAtMillis;
                Stripe.AnonymousClass1 anonymousClass1 = (Stripe.AnonymousClass1) settingsController.cachedSettingsIo;
                anonymousClass1.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                }
                try {
                    try {
                        jSONObjectHandleResponse.put("expires_at", j);
                        try {
                            fileWriter = new FileWriter((File) anonymousClass1.this$0);
                            try {
                                try {
                                    fileWriter.write(jSONObjectHandleResponse.toString());
                                    fileWriter.flush();
                                } catch (Exception e2) {
                                    e = e2;
                                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileWriter2 = fileWriter;
                                CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                            SettingsController.logSettings("Loaded settings: ", jSONObjectHandleResponse);
                            String str4 = settingsRequest.instanceId;
                            SharedPreferences.Editor editorEdit = ((Context) settingsController.context).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            editorEdit.putString("existing_instance_identifier", str4);
                            editorEdit.apply();
                            ((AtomicReference) settingsController.settings).set(settingsJson);
                            ((TaskCompletionSource) ((AtomicReference) settingsController.settingsTask).get()).trySetResult(settingsJson);
                            return Tasks.forResult(null);
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                    CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                    SettingsController.logSettings("Loaded settings: ", jSONObjectHandleResponse);
                    String str5 = settingsRequest.instanceId;
                    SharedPreferences.Editor editorEdit2 = ((Context) settingsController.context).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit2.putString("existing_instance_identifier", str5);
                    editorEdit2.apply();
                    ((AtomicReference) settingsController.settings).set(settingsJson);
                    ((TaskCompletionSource) ((AtomicReference) settingsController.settingsTask).get()).trySetResult(settingsJson);
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            }
            return Tasks.forResult(null);
        }

        @Override
        public void onVideoVolumeChange(int i, float f) {
            ArrayList arrayList;
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null || (arrayList = storyEntry.collageContent) == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            ((StoryEntry) previewView.entry.collageContent.get(i)).videoVolume = f;
        }

        @Override
        public void onVideoRightChange(int i, float f) {
            ArrayList arrayList;
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null || (arrayList = storyEntry.collageContent) == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            ((StoryEntry) previewView.entry.collageContent.get(i)).videoRight = f;
        }

        @Override
        public void onVideoLeftChange(int i, float f) {
            ArrayList arrayList;
            PreviewView previewView = (PreviewView) this.this$0;
            StoryEntry storyEntry = previewView.entry;
            if (storyEntry == null || (arrayList = storyEntry.collageContent) == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            ((StoryEntry) previewView.entry.collageContent.get(i)).videoLeft = f;
        }

        @Override
        public void makeEditTextFocusable(RichEditText richEditText) {
        }
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
}
