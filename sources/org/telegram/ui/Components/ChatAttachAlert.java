package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.ObjectsCompat$$ExternalSyntheticBackport0;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIconColor;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageMediaPoll;
import org.telegram.tgnet.TLRPC$TL_messages_toggleBotInAttachMenu;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.BotWebViewContainer;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.PhotoPickerSearchActivity;

public class ChatAttachAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, BottomSheet.BottomSheetDelegateInterface {
    public final Property<AttachAlertLayout, Float> ATTACH_ALERT_LAYOUT_TRANSLATION;
    private final Property<ChatAttachAlert, Float> ATTACH_ALERT_PROGRESS;
    protected ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarShadow;
    protected boolean allowOrder;
    protected boolean allowPassConfirmationAlert;
    private SpringAnimation appearSpringAnimation;
    private final Paint attachButtonPaint;
    private int attachItemSize;
    private ChatAttachAlertAudioLayout audioLayout;
    protected int avatarPicker;
    protected boolean avatarSearch;
    protected BaseFragment baseFragment;
    private float baseSelectedTextViewTranslationY;
    private LongSparseArray<ChatAttachAlertBotWebViewLayout> botAttachLayouts;
    private boolean botButtonProgressWasVisible;
    private boolean botButtonWasVisible;
    private float botMainButtonOffsetY;
    private TextView botMainButtonTextView;
    private RadialProgressView botProgressView;
    private float bottomPannelTranslation;
    private boolean buttonPressed;
    private ButtonsAdapter buttonsAdapter;
    private AnimatorSet buttonsAnimation;
    private LinearLayoutManager buttonsLayoutManager;
    protected RecyclerListView buttonsRecyclerView;
    public boolean canOpenPreview;
    private float captionEditTextTopOffset;
    private final NumberTextView captionLimitView;
    private float chatActivityEnterViewAnimateFromTop;
    private int codepointCount;
    protected EditTextEmoji commentTextView;
    private AnimatorSet commentsAnimator;
    private boolean confirmationAlertShown;
    private ChatAttachAlertContactsLayout contactsLayout;
    protected float cornerRadius;
    protected int currentAccount;
    private AttachAlertLayout currentAttachLayout;
    private final int currentLimit;
    float currentPanTranslationY;
    protected ChatAttachViewDelegate delegate;
    private ChatAttachAlertDocumentLayout documentLayout;
    protected ActionBarMenuItem doneItem;
    protected MessageObject editingMessageObject;
    private boolean enterCommentEventSent;
    private ArrayList<Rect> exclusionRects;
    private Rect exclustionRect;
    private final boolean forceDarkTheme;
    private FrameLayout frameLayout2;
    private float fromScrollY;
    protected FrameLayout headerView;
    protected boolean inBubbleMode;
    private boolean isSoundPicker;
    private ActionBarMenuSubItem[] itemCells;
    private AttachAlertLayout[] layouts;
    private ChatAttachAlertLocationLayout locationLayout;
    protected int maxSelectedPhotos;
    private boolean mediaEnabled;
    protected TextView mediaPreviewTextView;
    protected LinearLayout mediaPreviewView;
    private AnimatorSet menuAnimator;
    private boolean menuShowed;
    private AttachAlertLayout nextAttachLayout;
    private boolean openTransitionFinished;
    protected boolean openWithFrontFaceCamera;
    private Paint paint;
    public ChatActivity.ThemeDelegate parentThemeDelegate;
    protected boolean paused;
    private ChatAttachAlertPhotoLayout photoLayout;
    private ChatAttachAlertPhotoLayoutPreview photoPreviewLayout;
    private ChatAttachAlertPollLayout pollLayout;
    private boolean pollsEnabled;
    private int previousScrollOffsetY;
    private RectF rect;
    protected int[] scrollOffsetY;
    protected ActionBarMenuItem searchItem;
    protected ImageView selectedArrowImageView;
    private View selectedCountView;
    private long selectedId;
    protected ActionBarMenuItem selectedMenuItem;
    protected TextView selectedTextView;
    protected LinearLayout selectedView;
    private ValueAnimator sendButtonColorAnimator;
    boolean sendButtonEnabled;
    private float sendButtonEnabledProgress;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    private ActionBarPopupWindow sendPopupWindow;
    private View shadow;
    protected SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private TextPaint textPaint;
    private float toScrollY;
    private ValueAnimator topBackgroundAnimator;
    public float translationProgress;
    protected boolean typeButtonsAvailable;
    private Object viewChangeAnimator;
    private ImageView writeButton;
    private FrameLayout writeButtonContainer;
    private Drawable writeButtonDrawable;

    public static boolean lambda$new$10(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean canDismiss() {
        return true;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public void setCanOpenPreview(boolean z) {
        this.canOpenPreview = z;
        this.selectedArrowImageView.setVisibility((!z || this.avatarPicker == 2) ? 8 : 0);
    }

    public float getClipLayoutBottom() {
        return this.frameLayout2.getMeasuredHeight() - ((this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f)) * (1.0f - this.frameLayout2.getAlpha()));
    }

    public void showBotLayout(long j) {
        showBotLayout(j, null);
    }

    public void showBotLayout(long j, String str) {
        if (this.botAttachLayouts.get(j) == null || !ObjectsCompat$$ExternalSyntheticBackport0.m(str, this.botAttachLayouts.get(j).getStartCommand()) || this.botAttachLayouts.get(j).needReload()) {
            BaseFragment baseFragment = this.baseFragment;
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getCurrentUser() != null) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = new ChatAttachAlertBotWebViewLayout(this, getContext(), this.resourcesProvider);
                this.botAttachLayouts.put(j, chatAttachAlertBotWebViewLayout);
                this.botAttachLayouts.get(j).setDelegate(new AnonymousClass1(chatAttachAlertBotWebViewLayout));
                MessageObject replyingMessageObject = ((ChatActivity) this.baseFragment).getChatActivityEnterView().getReplyingMessageObject();
                this.botAttachLayouts.get(j).requestWebView(this.currentAccount, ((ChatActivity) this.baseFragment).getCurrentUser().id, j, false, replyingMessageObject != null ? replyingMessageObject.messageOwner.id : 0, str);
            }
        }
        if (this.botAttachLayouts.get(j) != null) {
            this.botAttachLayouts.get(j).disallowSwipeOffsetAnimation();
            showLayout(this.botAttachLayouts.get(j), -j);
        }
    }

    public class AnonymousClass1 implements BotWebViewContainer.Delegate {
        private ValueAnimator botButtonAnimator;
        final ChatAttachAlertBotWebViewLayout val$webViewLayout;

        @Override
        public void onSendWebViewData(String str) {
            BotWebViewContainer.Delegate.CC.$default$onSendWebViewData(this, str);
        }

        @Override
        public void onWebAppReady() {
            BotWebViewContainer.Delegate.CC.$default$onWebAppReady(this);
        }

        AnonymousClass1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout) {
            ChatAttachAlert.this = r1;
            this.val$webViewLayout = chatAttachAlertBotWebViewLayout;
        }

        @Override
        public void onCloseRequested(final Runnable runnable) {
            if (ChatAttachAlert.this.currentAttachLayout == this.val$webViewLayout) {
                ChatAttachAlert.this.setFocusable(false);
                ChatAttachAlert.this.getWindow().setSoftInputMode(48);
                ChatAttachAlert.this.dismiss();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlert.AnonymousClass1.lambda$onCloseRequested$0(runnable);
                    }
                }, 150L);
            }
        }

        public static void lambda$onCloseRequested$0(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onWebAppExpand() {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout && chatAttachAlertBotWebViewLayout.canExpandByRequest()) {
                this.val$webViewLayout.scrollToTop();
            }
        }

        @Override
        public void onSetupMainButton(final boolean z, boolean z2, String str, int i, int i2, final boolean z3) {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout && chatAttachAlertBotWebViewLayout.isBotButtonAvailable()) {
                ChatAttachAlert.this.botMainButtonTextView.setClickable(z2);
                ChatAttachAlert.this.botMainButtonTextView.setText(str);
                ChatAttachAlert.this.botMainButtonTextView.setTextColor(i2);
                ChatAttachAlert.this.botMainButtonTextView.setBackground(BotWebViewContainer.getMainButtonRippleDrawable(i));
                float f = 0.0f;
                float f2 = 1.0f;
                if (ChatAttachAlert.this.botButtonWasVisible != z) {
                    ChatAttachAlert.this.botButtonWasVisible = z;
                    ValueAnimator valueAnimator = this.botButtonAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float[] fArr = new float[2];
                    fArr[0] = z ? 0.0f : 1.0f;
                    fArr[1] = z ? 1.0f : 0.0f;
                    ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(250L);
                    this.botButtonAnimator = duration;
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            ChatAttachAlert.AnonymousClass1.this.lambda$onSetupMainButton$1(valueAnimator2);
                        }
                    });
                    this.botButtonAnimator.addListener(new AnimatorListenerAdapter() {
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override
                        public void onAnimationStart(Animator animator) {
                            if (z) {
                                ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                int dp = AndroidUtilities.dp(36.0f);
                                for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                    ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(dp);
                                }
                                return;
                            }
                            ChatAttachAlert.this.buttonsRecyclerView.setAlpha(0.0f);
                            ChatAttachAlert.this.buttonsRecyclerView.setVisibility(0);
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (!z) {
                                ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                            } else {
                                ChatAttachAlert.this.buttonsRecyclerView.setVisibility(8);
                            }
                            int dp = z ? AndroidUtilities.dp(36.0f) : 0;
                            for (int i3 = 0; i3 < ChatAttachAlert.this.botAttachLayouts.size(); i3++) {
                                ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i3)).setMeasureOffsetY(dp);
                            }
                            if (AnonymousClass1.this.botButtonAnimator == animator) {
                                AnonymousClass1.this.botButtonAnimator = null;
                            }
                        }
                    });
                    this.botButtonAnimator.start();
                }
                ChatAttachAlert.this.botProgressView.setProgressColor(i2);
                if (ChatAttachAlert.this.botButtonProgressWasVisible != z3) {
                    ChatAttachAlert.this.botProgressView.animate().cancel();
                    if (z3) {
                        ChatAttachAlert.this.botProgressView.setAlpha(0.0f);
                        ChatAttachAlert.this.botProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = ChatAttachAlert.this.botProgressView.animate();
                    if (z3) {
                        f = 1.0f;
                    }
                    ViewPropertyAnimator scaleX = animate.alpha(f).scaleX(z3 ? 1.0f : 0.1f);
                    if (!z3) {
                        f2 = 0.1f;
                    }
                    scaleX.scaleY(f2).setDuration(250L).setListener(new AnimatorListenerAdapter() {
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ChatAttachAlert.this.botButtonProgressWasVisible = z3;
                            if (!z3) {
                                ChatAttachAlert.this.botProgressView.setVisibility(8);
                            }
                        }
                    }).start();
                }
            }
        }

        public void lambda$onSetupMainButton$1(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.buttonsRecyclerView.setAlpha(1.0f - floatValue);
            ChatAttachAlert.this.botMainButtonTextView.setAlpha(floatValue);
            ChatAttachAlert.this.botMainButtonOffsetY = floatValue * AndroidUtilities.dp(36.0f);
            ChatAttachAlert.this.shadow.setTranslationY(ChatAttachAlert.this.botMainButtonOffsetY);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.buttonsRecyclerView.setTranslationY(chatAttachAlert.botMainButtonOffsetY);
        }
    }

    public interface ChatAttachViewDelegate {
        void didPressedButton(int i, boolean z, boolean z2, int i2, boolean z3);

        void didSelectBot(TLRPC$User tLRPC$User);

        void doOnIdle(Runnable runnable);

        boolean needEnterComment();

        void onCameraOpened();

        void openAvatarsSearch();

        public final class CC {
            public static void $default$didSelectBot(ChatAttachViewDelegate chatAttachViewDelegate, TLRPC$User tLRPC$User) {
            }

            public static boolean $default$needEnterComment(ChatAttachViewDelegate chatAttachViewDelegate) {
                return false;
            }

            public static void $default$openAvatarsSearch(ChatAttachViewDelegate chatAttachViewDelegate) {
            }
        }
    }

    public static class AttachAlertLayout extends FrameLayout {
        protected ChatAttachAlert parentAlert;
        protected final Theme.ResourcesProvider resourcesProvider;

        void applyCaption(CharSequence charSequence) {
        }

        boolean canDismissWithTouchOutside() {
            return true;
        }

        boolean canScheduleMessages() {
            return true;
        }

        void checkColors() {
        }

        public int getCurrentItemTop() {
            return 0;
        }

        int getFirstOffset() {
            return 0;
        }

        public int getListTopPadding() {
            return 0;
        }

        int getSelectedItemsCount() {
            return 0;
        }

        ArrayList<ThemeDescription> getThemeDescriptions() {
            return null;
        }

        int needsActionBar() {
            return 0;
        }

        public boolean onBackPressed() {
            return false;
        }

        void onButtonsTranslationYUpdated() {
        }

        public void onContainerTranslationUpdated(float f) {
        }

        boolean onContainerViewTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        void onDestroy() {
        }

        public boolean onDismiss() {
            return false;
        }

        void onDismissWithButtonClick(int i) {
        }

        public void onHidden() {
        }

        public void onHide() {
        }

        void onHideShowProgress(float f) {
        }

        void onMenuItemClick(int i) {
        }

        void onOpenAnimationEnd() {
        }

        public void onPanTransitionEnd() {
        }

        public void onPanTransitionStart(boolean z, int i) {
        }

        void onPause() {
        }

        void onPreMeasure(int i, int i2) {
        }

        public void onResume() {
        }

        void onSelectedItemsCountChanged(int i) {
        }

        boolean onSheetKeyDown(int i, KeyEvent keyEvent) {
            return false;
        }

        void onShow(AttachAlertLayout attachAlertLayout) {
        }

        void onShown() {
        }

        void scrollToTop() {
        }

        void sendSelectedItems(boolean z, int i) {
        }

        boolean shouldHideBottomButtons() {
            return true;
        }

        public AttachAlertLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.parentAlert = chatAttachAlert;
        }

        int getButtonsHideOffset() {
            return AndroidUtilities.dp(needsActionBar() != 0 ? 12.0f : 17.0f);
        }

        public int getThemedColor(String str) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
            return color != null ? color.intValue() : Theme.getColor(str);
        }
    }

    public class AttachButton extends FrameLayout {
        private String backgroundKey;
        private Animator checkAnimator;
        private boolean checked;
        private float checkedState;
        private int currentId;
        private RLottieImageView imageView;
        private String textKey;
        private TextView textView;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public AttachButton(Context context) {
            super(context);
            ChatAttachAlert.this = r10;
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            RLottieImageView rLottieImageView = new RLottieImageView(context, r10) {
                {
                    AttachButton.this = this;
                }

                @Override
                public void setScaleX(float f) {
                    super.setScaleX(f);
                    AttachButton.this.invalidate();
                }
            };
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(32, 32.0f, 49, 0.0f, 18.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setMaxLines(2);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(r10.getThemedColor("dialogTextGray2"));
            this.textView.setTextSize(1, 12.0f);
            this.textView.setLineSpacing(-AndroidUtilities.dp(2.0f), 1.0f);
            this.textView.setImportantForAccessibility(2);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 62.0f, 0.0f, 0.0f));
        }

        void updateCheckedState(boolean z) {
            if (this.checked != (((long) this.currentId) == ChatAttachAlert.this.selectedId)) {
                this.checked = ((long) this.currentId) == ChatAttachAlert.this.selectedId;
                Animator animator = this.checkAnimator;
                if (animator != null) {
                    animator.cancel();
                }
                float f = 1.0f;
                if (z) {
                    if (this.checked) {
                        this.imageView.setProgress(0.0f);
                        this.imageView.playAnimation();
                    }
                    float[] fArr = new float[1];
                    if (!this.checked) {
                        f = 0.0f;
                    }
                    fArr[0] = f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "checkedState", fArr);
                    this.checkAnimator = ofFloat;
                    ofFloat.setDuration(200L);
                    this.checkAnimator.start();
                    return;
                }
                this.imageView.stopAnimation();
                this.imageView.setProgress(0.0f);
                if (!this.checked) {
                    f = 0.0f;
                }
                setCheckedState(f);
            }
        }

        @Keep
        public void setCheckedState(float f) {
            this.checkedState = f;
            float f2 = 1.0f - (f * 0.06f);
            this.imageView.setScaleX(f2);
            this.imageView.setScaleY(f2);
            this.textView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor("dialogTextGray2"), ChatAttachAlert.this.getThemedColor(this.textKey), this.checkedState));
            invalidate();
        }

        @Keep
        public float getCheckedState() {
            return this.checkedState;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ChatAttachAlert.this.attachItemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(84.0f), 1073741824));
        }

        public void setTextAndIcon(int i, CharSequence charSequence, RLottieDrawable rLottieDrawable, String str, String str2) {
            this.currentId = i;
            this.textView.setText(charSequence);
            this.imageView.setAnimation(rLottieDrawable);
            this.backgroundKey = str;
            this.textKey = str2;
            this.textView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor("dialogTextGray2"), ChatAttachAlert.this.getThemedColor(this.textKey), this.checkedState));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float scaleX = this.imageView.getScaleX() + (this.checkedState * 0.06f);
            float dp = AndroidUtilities.dp(23.0f) * scaleX;
            float left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2.0f);
            float top = this.imageView.getTop() + (this.imageView.getMeasuredWidth() / 2.0f);
            ChatAttachAlert.this.attachButtonPaint.setColor(ChatAttachAlert.this.getThemedColor(this.backgroundKey));
            ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.STROKE);
            ChatAttachAlert.this.attachButtonPaint.setStrokeWidth(AndroidUtilities.dp(3.0f) * scaleX);
            ChatAttachAlert.this.attachButtonPaint.setAlpha(Math.round(this.checkedState * 255.0f));
            canvas.drawCircle(left, top, dp - (ChatAttachAlert.this.attachButtonPaint.getStrokeWidth() * 0.5f), ChatAttachAlert.this.attachButtonPaint);
            ChatAttachAlert.this.attachButtonPaint.setAlpha(255);
            ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(left, top, dp - (AndroidUtilities.dp(5.0f) * this.checkedState), ChatAttachAlert.this.attachButtonPaint);
        }
    }

    public class AttachBotButton extends FrameLayout {
        private TLRPC$TL_attachMenuBot attachMenuBot;
        private AvatarDrawable avatarDrawable = new AvatarDrawable();
        private ValueAnimator checkAnimator;
        private Boolean checked;
        private float checkedState;
        private TLRPC$User currentUser;
        private int iconBackgroundColor;
        private BackupImageView imageView;
        private TextView nameTextView;
        private View selector;
        private int textColor;

        public AttachBotButton(Context context) {
            super(context);
            ChatAttachAlert.this = r10;
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            AnonymousClass1 r1 = new AnonymousClass1(context, r10);
            this.imageView = r1;
            r1.setRoundRadius(AndroidUtilities.dp(25.0f));
            addView(this.imageView, LayoutHelper.createFrame(46, 46.0f, 49, 0.0f, 9.0f, 0.0f, 0.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                View view = new View(context);
                this.selector = view;
                view.setBackground(Theme.createSelectorDrawable(r10.getThemedColor("dialogButtonSelector"), 1, AndroidUtilities.dp(23.0f)));
                addView(this.selector, LayoutHelper.createFrame(46, 46.0f, 49, 0.0f, 9.0f, 0.0f, 0.0f));
            }
            TextView textView = new TextView(context);
            this.nameTextView = textView;
            textView.setTextSize(1, 12.0f);
            this.nameTextView.setGravity(49);
            this.nameTextView.setLines(1);
            this.nameTextView.setSingleLine(true);
            this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.nameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 6.0f, 60.0f, 6.0f, 0.0f));
        }

        public class AnonymousClass1 extends BackupImageView {
            AnonymousClass1(Context context, ChatAttachAlert chatAttachAlert) {
                super(context);
                AttachBotButton.this = r1;
                this.imageReceiver.setDelegate(ChatAttachAlert$AttachBotButton$1$$ExternalSyntheticLambda0.INSTANCE);
            }

            public static void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof RLottieDrawable) {
                    RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                    rLottieDrawable.setCustomEndFrame(0);
                    rLottieDrawable.stop();
                    rLottieDrawable.setProgress(0.0f, false);
                }
            }

            @Override
            public void setScaleX(float f) {
                super.setScaleX(f);
                AttachBotButton.this.invalidate();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ChatAttachAlert.this.attachItemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
        }

        public void setCheckedState(float f) {
            this.checkedState = f;
            float f2 = 1.0f - (f * 0.06f);
            this.imageView.setScaleX(f2);
            this.imageView.setScaleY(f2);
            this.nameTextView.setTextColor(ColorUtils.blendARGB(ChatAttachAlert.this.getThemedColor("dialogTextGray2"), this.textColor, this.checkedState));
            invalidate();
        }

        private void updateMargins() {
            ((ViewGroup.MarginLayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.attachMenuBot != null ? 62.0f : 60.0f);
            ((ViewGroup.MarginLayoutParams) this.imageView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.attachMenuBot != null ? 11.0f : 9.0f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.attachMenuBot != null) {
                float scaleX = this.imageView.getScaleX() + (this.checkedState * 0.06f);
                float dp = AndroidUtilities.dp(23.0f) * scaleX;
                float left = this.imageView.getLeft() + (this.imageView.getMeasuredWidth() / 2.0f);
                float top = this.imageView.getTop() + (this.imageView.getMeasuredWidth() / 2.0f);
                ChatAttachAlert.this.attachButtonPaint.setColor(this.iconBackgroundColor);
                ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.STROKE);
                ChatAttachAlert.this.attachButtonPaint.setStrokeWidth(AndroidUtilities.dp(3.0f) * scaleX);
                ChatAttachAlert.this.attachButtonPaint.setAlpha(Math.round(this.checkedState * 255.0f));
                canvas.drawCircle(left, top, dp - (ChatAttachAlert.this.attachButtonPaint.getStrokeWidth() * 0.5f), ChatAttachAlert.this.attachButtonPaint);
                ChatAttachAlert.this.attachButtonPaint.setAlpha(255);
                ChatAttachAlert.this.attachButtonPaint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(left, top, dp - (AndroidUtilities.dp(5.0f) * this.checkedState), ChatAttachAlert.this.attachButtonPaint);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        void updateCheckedState(boolean z) {
            boolean z2 = this.attachMenuBot != null && (-this.currentUser.id) == ChatAttachAlert.this.selectedId;
            Boolean bool = this.checked;
            if (bool == null || bool.booleanValue() != z2 || !z) {
                this.checked = Boolean.valueOf(z2);
                ValueAnimator valueAnimator = this.checkAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                RLottieDrawable lottieAnimation = this.imageView.getImageReceiver().getLottieAnimation();
                float f = 1.0f;
                if (z) {
                    if (this.checked.booleanValue() && lottieAnimation != null) {
                        lottieAnimation.setAutoRepeat(0);
                        lottieAnimation.setCustomEndFrame(-1);
                        lottieAnimation.setProgress(0.0f, false);
                        lottieAnimation.start();
                    }
                    float[] fArr = new float[2];
                    fArr[0] = this.checked.booleanValue() ? 0.0f : 1.0f;
                    if (!this.checked.booleanValue()) {
                        f = 0.0f;
                    }
                    fArr[1] = f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.checkAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            ChatAttachAlert.AttachBotButton.this.lambda$updateCheckedState$0(valueAnimator2);
                        }
                    });
                    this.checkAnimator.setDuration(200L);
                    this.checkAnimator.start();
                    return;
                }
                if (lottieAnimation != null) {
                    lottieAnimation.stop();
                    lottieAnimation.setProgress(0.0f, false);
                }
                if (!this.checked.booleanValue()) {
                    f = 0.0f;
                }
                setCheckedState(f);
            }
        }

        public void lambda$updateCheckedState$0(ValueAnimator valueAnimator) {
            setCheckedState(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public void setUser(TLRPC$User tLRPC$User) {
            if (tLRPC$User != null) {
                this.nameTextView.setTextColor(ChatAttachAlert.this.getThemedColor("dialogTextGray2"));
                this.currentUser = tLRPC$User;
                this.nameTextView.setText(ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name));
                this.avatarDrawable.setInfo(tLRPC$User);
                this.imageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
                this.imageView.setSize(-1, -1);
                this.imageView.setColorFilter(null);
                this.attachMenuBot = null;
                this.selector.setVisibility(0);
                updateMargins();
                setCheckedState(0.0f);
                invalidate();
            }
        }

        public void setAttachBot(TLRPC$User tLRPC$User, TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
            boolean z;
            if (tLRPC$User != null && tLRPC$TL_attachMenuBot != null) {
                this.nameTextView.setTextColor(ChatAttachAlert.this.getThemedColor("dialogTextGray2"));
                this.currentUser = tLRPC$User;
                this.nameTextView.setText(tLRPC$TL_attachMenuBot.short_name);
                this.avatarDrawable.setInfo(tLRPC$User);
                TLRPC$TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
                if (animatedAttachMenuBotIcon == null) {
                    animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
                    z = false;
                } else {
                    z = true;
                }
                if (animatedAttachMenuBotIcon != null) {
                    this.textColor = ChatAttachAlert.this.getThemedColor("chat_attachContactText");
                    this.iconBackgroundColor = ChatAttachAlert.this.getThemedColor("chat_attachContactBackground");
                    Iterator<TLRPC$TL_attachMenuBotIconColor> it = animatedAttachMenuBotIcon.colors.iterator();
                    while (it.hasNext()) {
                        TLRPC$TL_attachMenuBotIconColor next = it.next();
                        String str = next.name;
                        str.hashCode();
                        char c = 65535;
                        switch (str.hashCode()) {
                            case -1852424286:
                                if (str.equals(MediaDataController.ATTACH_MENU_BOT_COLOR_DARK_ICON)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1852094378:
                                if (str.equals(MediaDataController.ATTACH_MENU_BOT_COLOR_DARK_TEXT)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -208896510:
                                if (str.equals(MediaDataController.ATTACH_MENU_BOT_COLOR_LIGHT_ICON)) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -208566602:
                                if (str.equals(MediaDataController.ATTACH_MENU_BOT_COLOR_LIGHT_TEXT)) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                if (!Theme.getCurrentTheme().isDark()) {
                                    break;
                                } else {
                                    this.iconBackgroundColor = next.color;
                                    break;
                                }
                            case 1:
                                if (!Theme.getCurrentTheme().isDark()) {
                                    break;
                                } else {
                                    this.textColor = next.color;
                                    break;
                                }
                            case 2:
                                if (Theme.getCurrentTheme().isDark()) {
                                    break;
                                } else {
                                    this.iconBackgroundColor = next.color;
                                    break;
                                }
                            case 3:
                                if (Theme.getCurrentTheme().isDark()) {
                                    break;
                                } else {
                                    this.textColor = next.color;
                                    break;
                                }
                        }
                    }
                    this.textColor = ColorUtils.setAlphaComponent(this.textColor, 255);
                    this.iconBackgroundColor = ColorUtils.setAlphaComponent(this.iconBackgroundColor, 255);
                    TLRPC$Document tLRPC$Document = animatedAttachMenuBotIcon.icon;
                    this.imageView.getImageReceiver().setAllowStartLottieAnimation(false);
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), String.valueOf(tLRPC$TL_attachMenuBot.bot_id), z ? "tgs" : "svg", (Drawable) null, tLRPC$TL_attachMenuBot);
                }
                this.imageView.setSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
                this.imageView.setColorFilter(new PorterDuffColorFilter(ChatAttachAlert.this.getThemedColor("chat_attachContactIcon"), PorterDuff.Mode.SRC_IN));
                this.attachMenuBot = tLRPC$TL_attachMenuBot;
                this.selector.setVisibility(8);
                updateMargins();
                setCheckedState(0.0f);
                invalidate();
            }
        }
    }

    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, boolean z2) {
        this(context, baseFragment, z, z2, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, final boolean z2, final Theme.ResourcesProvider resourcesProvider) {
        super(context, false, resourcesProvider);
        this.canOpenPreview = false;
        this.isSoundPicker = false;
        this.translationProgress = 0.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION = new AnimationProperties.FloatProperty<AttachAlertLayout>("translation") {
            {
                ChatAttachAlert.this = this;
            }

            public void setValue(AttachAlertLayout attachAlertLayout, float f) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.translationProgress = f;
                if ((chatAttachAlert.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (ChatAttachAlert.this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                    int max = Math.max(ChatAttachAlert.this.nextAttachLayout.getWidth(), ChatAttachAlert.this.currentAttachLayout.getWidth());
                    if (ChatAttachAlert.this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX((-max) * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((1.0f - f) * max);
                    } else {
                        ChatAttachAlert.this.currentAttachLayout.setTranslationX(max * f);
                        ChatAttachAlert.this.nextAttachLayout.setTranslationX((-max) * (1.0f - f));
                    }
                } else {
                    if (f > 0.7f) {
                        float f2 = 1.0f - ((1.0f - f) / 0.3f);
                        if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.locationLayout) {
                            ChatAttachAlert.this.currentAttachLayout.setAlpha(1.0f - f2);
                            ChatAttachAlert.this.nextAttachLayout.setAlpha(1.0f);
                        } else {
                            ChatAttachAlert.this.nextAttachLayout.setAlpha(f2);
                            ChatAttachAlert.this.nextAttachLayout.onHideShowProgress(f2);
                        }
                    } else if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.locationLayout) {
                        ChatAttachAlert.this.nextAttachLayout.setAlpha(0.0f);
                    }
                    if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout || ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.pollLayout) {
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.updateSelectedPosition(chatAttachAlert2.nextAttachLayout == ChatAttachAlert.this.pollLayout ? 1 : 0);
                    }
                    ChatAttachAlert.this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) * f);
                    ChatAttachAlert.this.currentAttachLayout.onHideShowProgress(1.0f - Math.min(1.0f, f / 0.7f));
                    ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            public Float get(AttachAlertLayout attachAlertLayout) {
                return Float.valueOf(ChatAttachAlert.this.translationProgress);
            }
        };
        this.layouts = new AttachAlertLayout[7];
        this.botAttachLayouts = new LongSparseArray<>();
        this.textPaint = new TextPaint(1);
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.sendButtonEnabled = true;
        this.sendButtonEnabledProgress = 1.0f;
        this.cornerRadius = 1.0f;
        this.botButtonProgressWasVisible = false;
        this.botButtonWasVisible = false;
        this.currentAccount = UserConfig.selectedAccount;
        this.mediaEnabled = true;
        this.pollsEnabled = true;
        this.maxSelectedPhotos = -1;
        this.allowOrder = true;
        this.attachItemSize = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.scrollOffsetY = new int[2];
        this.attachButtonPaint = new Paint(1);
        this.exclusionRects = new ArrayList<>();
        this.exclustionRect = new Rect();
        this.ATTACH_ALERT_PROGRESS = new AnimationProperties.FloatProperty<ChatAttachAlert>("openProgress") {
            private float openProgress;

            {
                ChatAttachAlert.this = this;
            }

            public void setValue(ChatAttachAlert chatAttachAlert, float f) {
                float f2;
                int childCount = ChatAttachAlert.this.buttonsRecyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    float f3 = (3 - i) * 32.0f;
                    View childAt = ChatAttachAlert.this.buttonsRecyclerView.getChildAt(i);
                    if (f > f3) {
                        float f4 = f - f3;
                        f2 = 1.0f;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            f2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            if (f6 <= 100.0f) {
                                f2 = 1.1f - (CubicBezierInterpolator.EASE_IN.getInterpolation(f6 / 100.0f) * 0.1f);
                            }
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (childAt instanceof AttachButton) {
                        AttachButton attachButton = (AttachButton) childAt;
                        attachButton.textView.setScaleX(f2);
                        attachButton.textView.setScaleY(f2);
                        attachButton.imageView.setScaleX(f2);
                        attachButton.imageView.setScaleY(f2);
                    } else if (childAt instanceof AttachBotButton) {
                        AttachBotButton attachBotButton = (AttachBotButton) childAt;
                        attachBotButton.nameTextView.setScaleX(f2);
                        attachBotButton.nameTextView.setScaleY(f2);
                        attachBotButton.imageView.setScaleX(f2);
                        attachBotButton.imageView.setScaleY(f2);
                    }
                }
            }

            public Float get(ChatAttachAlert chatAttachAlert) {
                return Float.valueOf(this.openProgress);
            }
        };
        this.confirmationAlertShown = false;
        this.allowPassConfirmationAlert = false;
        this.forceDarkTheme = z;
        this.drawNavigationBar = true;
        this.inBubbleMode = (baseFragment instanceof ChatActivity) && baseFragment.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.baseFragment = baseFragment;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        this.exclusionRects.add(this.exclustionRect);
        AnonymousClass3 r0 = new AnonymousClass3(context, z);
        this.sizeNotifierFrameLayout = r0;
        r0.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onSizeChanged(int i, boolean z3) {
                if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout) {
                    ChatAttachAlert.this.currentAttachLayout.invalidate();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        ActionBar actionBar = new ActionBar(context, resourcesProvider) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setAlpha(float f) {
                float alpha = getAlpha();
                super.setAlpha(f);
                if (alpha != f) {
                    ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
                    if (ChatAttachAlert.this.frameLayout2 != null) {
                        ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                        if (chatAttachAlert.buttonsRecyclerView != null) {
                            float f2 = 1.0f;
                            if (chatAttachAlert.frameLayout2.getTag() == null) {
                                if (ChatAttachAlert.this.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons()) {
                                    float f3 = 1.0f - f;
                                    ChatAttachAlert.this.buttonsRecyclerView.setAlpha(f3);
                                    ChatAttachAlert.this.shadow.setAlpha(f3);
                                    ChatAttachAlert.this.buttonsRecyclerView.setTranslationY(AndroidUtilities.dp(44.0f) * f);
                                }
                                ChatAttachAlert.this.frameLayout2.setTranslationY(AndroidUtilities.dp(48.0f) * f);
                                ChatAttachAlert.this.shadow.setTranslationY((AndroidUtilities.dp(84.0f) * f) + ChatAttachAlert.this.botMainButtonOffsetY);
                            } else if (ChatAttachAlert.this.currentAttachLayout == null) {
                                if (f != 0.0f) {
                                    f2 = 0.0f;
                                }
                                if (ChatAttachAlert.this.buttonsRecyclerView.getAlpha() != f2) {
                                    ChatAttachAlert.this.buttonsRecyclerView.setAlpha(f2);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(getThemedColor("dialogBackground"));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setItemsColor(getThemedColor("dialogTextBlack"), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor("dialogButtonSelector"), false);
        this.actionBar.setTitleColor(getThemedColor("dialogTextBlack"));
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onItemClick(int i2) {
                if (i2 != -1) {
                    ChatAttachAlert.this.currentAttachLayout.onMenuItemClick(i2);
                } else if (!ChatAttachAlert.this.currentAttachLayout.onBackPressed()) {
                    ChatAttachAlert.this.dismiss();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor("dialogTextBlack"), false, resourcesProvider);
        this.selectedMenuItem = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.selectedMenuItem.setIcon(R.drawable.ic_ab_other);
        this.selectedMenuItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.selectedMenuItem.setVisibility(4);
        this.selectedMenuItem.setAlpha(0.0f);
        this.selectedMenuItem.setSubMenuOpenSide(2);
        this.selectedMenuItem.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i2) {
                ChatAttachAlert.this.lambda$new$0(i2);
            }
        });
        this.selectedMenuItem.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        this.selectedMenuItem.setTranslationX(AndroidUtilities.dp(6.0f));
        this.selectedMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor("dialogButtonSelector"), 6));
        this.selectedMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$1(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context, null, 0, getThemedColor("windowBackgroundWhiteBlueHeader"), true, resourcesProvider);
        this.doneItem = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        this.doneItem.setText(LocaleController.getString("Create", R.string.Create).toUpperCase());
        this.doneItem.setVisibility(4);
        this.doneItem.setAlpha(0.0f);
        this.doneItem.setTranslationX(-AndroidUtilities.dp(12.0f));
        this.doneItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor("dialogButtonSelector"), 3));
        this.doneItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$2(view);
            }
        });
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, null, 0, getThemedColor("dialogTextBlack"), false, resourcesProvider);
        this.searchItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        this.searchItem.setIcon(R.drawable.ic_ab_search);
        this.searchItem.setContentDescription(LocaleController.getString("Search", R.string.Search));
        this.searchItem.setVisibility(4);
        this.searchItem.setAlpha(0.0f);
        this.searchItem.setTranslationX(-AndroidUtilities.dp(42.0f));
        this.searchItem.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor("dialogButtonSelector"), 6));
        this.searchItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$3(z2, view);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ChatAttachAlert.this.updateSelectedPosition(0);
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.headerView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatAttachAlert.this.lambda$new$4(view);
            }
        });
        this.headerView.setAlpha(0.0f);
        this.headerView.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.selectedView = linearLayout;
        linearLayout.setOrientation(0);
        this.selectedView.setGravity(16);
        TextView textView = new TextView(context);
        this.selectedTextView = textView;
        textView.setTextColor(getThemedColor("dialogTextBlack"));
        this.selectedTextView.setTextSize(1, 16.0f);
        this.selectedTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.selectedTextView.setGravity(19);
        this.selectedView.addView(this.selectedTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.selectedArrowImageView = new ImageView(context);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogTextBlack"), PorterDuff.Mode.MULTIPLY));
        this.selectedArrowImageView.setImageDrawable(mutate);
        this.selectedArrowImageView.setVisibility(8);
        this.selectedView.addView(this.selectedArrowImageView, LayoutHelper.createLinear(-2, -2, 16, 4, 1, 0, 0));
        this.headerView.addView(this.selectedView, LayoutHelper.createFrame(-2, -1.0f));
        LinearLayout linearLayout2 = new LinearLayout(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setAlpha(float f) {
                float f2 = 1.0f - f;
                ChatAttachAlert.this.selectedView.setAlpha(f2);
                ChatAttachAlert.this.selectedView.setTranslationX((-AndroidUtilities.dp(16.0f)) * f);
                ChatAttachAlert.this.mediaPreviewView.setTranslationX(f2 * AndroidUtilities.dp(16.0f));
                super.setAlpha(f);
            }
        };
        this.mediaPreviewView = linearLayout2;
        linearLayout2.setOrientation(0);
        this.mediaPreviewView.setGravity(16);
        ImageView imageView = new ImageView(context);
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogTextBlack"), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate2);
        this.mediaPreviewView.addView(imageView, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.mediaPreviewTextView = textView2;
        textView2.setTextColor(getThemedColor("dialogTextBlack"));
        this.mediaPreviewTextView.setTextSize(1, 16.0f);
        this.mediaPreviewTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.mediaPreviewTextView.setGravity(19);
        this.mediaPreviewTextView.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        this.mediaPreviewView.setAlpha(0.0f);
        this.mediaPreviewView.addView(this.mediaPreviewTextView, LayoutHelper.createLinear(-2, -2, 16));
        this.headerView.addView(this.mediaPreviewView, LayoutHelper.createFrame(-2, -1.0f));
        AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z, resourcesProvider);
        this.photoLayout = chatAttachAlertPhotoLayout;
        attachAlertLayoutArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.photoLayout;
        this.currentAttachLayout = chatAttachAlertPhotoLayout2;
        this.selectedId = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout2, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.containerView.addView(this.selectedMenuItem, LayoutHelper.createFrame(48, 48, 53));
        this.containerView.addView(this.searchItem, LayoutHelper.createFrame(48, 48, 53));
        this.containerView.addView(this.doneItem, LayoutHelper.createFrame(-2, 48, 53));
        View view = new View(context);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundColor(getThemedColor("dialogShadowLine"));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
        View view2 = new View(context);
        this.shadow = view2;
        view2.setBackgroundResource(R.drawable.attach_shadow);
        this.shadow.getBackground().setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        this.containerView.addView(this.shadow, LayoutHelper.createFrame(-1, 2.0f, 83, 0.0f, 0.0f, 0.0f, 84.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                ChatAttachAlert.this.currentAttachLayout.onButtonsTranslationYUpdated();
            }
        };
        this.buttonsRecyclerView = recyclerListView;
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(context);
        this.buttonsAdapter = buttonsAdapter;
        recyclerListView.setAdapter(buttonsAdapter);
        RecyclerListView recyclerListView2 = this.buttonsRecyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.buttonsLayoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.buttonsRecyclerView.setVerticalScrollBarEnabled(false);
        this.buttonsRecyclerView.setHorizontalScrollBarEnabled(false);
        this.buttonsRecyclerView.setItemAnimator(null);
        this.buttonsRecyclerView.setLayoutAnimation(null);
        this.buttonsRecyclerView.setGlowColor(getThemedColor("dialogScrollGlow"));
        this.buttonsRecyclerView.setBackgroundColor(getThemedColor("dialogBackground"));
        this.containerView.addView(this.buttonsRecyclerView, LayoutHelper.createFrame(-1, 84, 83));
        this.buttonsRecyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i2) {
                ChatAttachAlert.this.lambda$new$7(resourcesProvider, view3, i2);
            }
        });
        this.buttonsRecyclerView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view3, int i2) {
                boolean lambda$new$8;
                lambda$new$8 = ChatAttachAlert.this.lambda$new$8(view3, i2);
                return lambda$new$8;
            }
        });
        TextView textView3 = new TextView(context);
        this.botMainButtonTextView = textView3;
        textView3.setVisibility(8);
        this.botMainButtonTextView.setAlpha(0.0f);
        this.botMainButtonTextView.setSingleLine();
        this.botMainButtonTextView.setGravity(17);
        this.botMainButtonTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        int dp = AndroidUtilities.dp(16.0f);
        this.botMainButtonTextView.setPadding(dp, 0, dp, 0);
        this.botMainButtonTextView.setTextSize(1, 14.0f);
        this.botMainButtonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ChatAttachAlert.this.lambda$new$9(view3);
            }
        });
        this.containerView.addView(this.botMainButtonTextView, LayoutHelper.createFrame(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.botProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        this.botProgressView.setAlpha(0.0f);
        this.botProgressView.setScaleX(0.1f);
        this.botProgressView.setScaleY(0.1f);
        this.botProgressView.setVisibility(8);
        this.containerView.addView(this.botProgressView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        AnonymousClass11 r02 = new AnonymousClass11(context, z);
        this.frameLayout2 = r02;
        r02.setWillNotDraw(false);
        this.frameLayout2.setVisibility(4);
        this.frameLayout2.setAlpha(0.0f);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        this.frameLayout2.setOnTouchListener(ChatAttachAlert$$ExternalSyntheticLambda12.INSTANCE);
        NumberTextView numberTextView = new NumberTextView(context);
        this.captionLimitView = numberTextView;
        numberTextView.setVisibility(8);
        numberTextView.setTextSize(15);
        numberTextView.setTextColor(getThemedColor("windowBackgroundWhiteGrayText"));
        numberTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        numberTextView.setCenterAlign(true);
        this.frameLayout2.addView(numberTextView, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 14.0f, 78.0f));
        this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength;
        AnonymousClass12 r14 = new AnonymousClass12(context, this.sizeNotifierFrameLayout, null, 1, resourcesProvider);
        this.commentTextView = r14;
        r14.setHint(LocaleController.getString("AddCaption", R.string.AddCaption));
        this.commentTextView.onResume();
        this.commentTextView.getEditText().addTextChangedListener(new AnonymousClass13());
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        this.frameLayout2.setClipChildren(false);
        this.commentTextView.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ChatAttachAlert.this.photoLayout.getSelectedItemsCount()));
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.documentLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", ChatAttachAlert.this.documentLayout.getSelectedItemsCount()));
                } else if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.audioLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", ChatAttachAlert.this.audioLayout.getSelectedItemsCount()));
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout2;
        frameLayout2.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 6.0f, 10.0f));
        this.writeButton = new ImageView(context);
        int dp2 = AndroidUtilities.dp(56.0f);
        int themedColor = getThemedColor("dialogFloatingButton");
        int i2 = Build.VERSION.SDK_INT;
        this.writeButtonDrawable = Theme.createSimpleSelectorCircleDrawable(dp2, themedColor, getThemedColor(i2 >= 21 ? "dialogFloatingButtonPressed" : "dialogFloatingButton"));
        if (i2 < 21) {
            Drawable mutate3 = context.getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate3, this.writeButtonDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            this.writeButtonDrawable = combinedDrawable;
        }
        this.writeButton.setBackgroundDrawable(this.writeButtonDrawable);
        this.writeButton.setImageResource(R.drawable.attach_send);
        this.writeButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingIcon"), PorterDuff.Mode.MULTIPLY));
        this.writeButton.setImportantForAccessibility(2);
        this.writeButton.setScaleType(ImageView.ScaleType.CENTER);
        if (i2 >= 21) {
            this.writeButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view3, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
        }
        this.writeButtonContainer.addView(this.writeButton, LayoutHelper.createFrame(i2 >= 21 ? 56 : 60, i2 >= 21 ? 56.0f : 60.0f, 51, i2 >= 21 ? 2.0f : 0.0f, 0.0f, 0.0f, 0.0f));
        this.writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ChatAttachAlert.this.lambda$new$12(resourcesProvider, view3);
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view3) {
                boolean lambda$new$16;
                lambda$new$16 = ChatAttachAlert.this.lambda$new$16(resourcesProvider, view3);
                return lambda$new$16;
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        View view3 = new View(context) {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int ceil;
                int i3;
                int i4;
                String format = String.format("%d", Integer.valueOf(Math.max(1, ChatAttachAlert.this.currentAttachLayout.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(ChatAttachAlert.this.textPaint.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor2 = ChatAttachAlert.this.getThemedColor("dialogRoundCheckBoxCheck");
                TextPaint textPaint = ChatAttachAlert.this.textPaint;
                double alpha = Color.alpha(themedColor2);
                double d = ChatAttachAlert.this.sendButtonEnabledProgress;
                Double.isNaN(d);
                Double.isNaN(alpha);
                textPaint.setColor(ColorUtils.setAlphaComponent(themedColor2, (int) (alpha * ((d * 0.42d) + 0.58d))));
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor("dialogBackground"));
                int i5 = max / 2;
                ChatAttachAlert.this.rect.set(measuredWidth - i5, 0.0f, i5 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ChatAttachAlert.this.paint);
                ChatAttachAlert.this.paint.setColor(ChatAttachAlert.this.getThemedColor("dialogRoundCheckBox"));
                ChatAttachAlert.this.rect.set(i3 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), i4 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ChatAttachAlert.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ChatAttachAlert.this.paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), ChatAttachAlert.this.textPaint);
            }
        };
        this.selectedCountView = view3;
        view3.setAlpha(0.0f);
        this.selectedCountView.setScaleX(0.2f);
        this.selectedCountView.setScaleY(0.2f);
        this.containerView.addView(this.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -8.0f, 9.0f));
        if (z) {
            checkColors();
            this.navBarColorKey = null;
        }
    }

    public class AnonymousClass3 extends SizeNotifierFrameLayout {
        private boolean ignoreLayout;
        private float initialTranslationY;
        private int lastNotifyWidth;
        final boolean val$forceDarkTheme;
        private RectF rect = new RectF();
        AdjustPanLayoutHelper adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
            {
                AnonymousClass3.this = this;
            }

            @Override
            public void onTransitionStart(boolean z, int i) {
                super.onTransitionStart(z, i);
                if (ChatAttachAlert.this.previousScrollOffsetY > 0) {
                    int i2 = ChatAttachAlert.this.previousScrollOffsetY;
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    if (i2 != chatAttachAlert.scrollOffsetY[0] && z) {
                        chatAttachAlert.fromScrollY = chatAttachAlert.previousScrollOffsetY;
                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                        chatAttachAlert2.toScrollY = chatAttachAlert2.scrollOffsetY[0];
                        AnonymousClass3.this.invalidate();
                        ChatAttachAlert.this.currentAttachLayout.onPanTransitionStart(z, i);
                    }
                }
                ChatAttachAlert.this.fromScrollY = -1.0f;
                AnonymousClass3.this.invalidate();
                ChatAttachAlert.this.currentAttachLayout.onPanTransitionStart(z, i);
            }

            @Override
            public void onTransitionEnd() {
                super.onTransitionEnd();
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                chatAttachAlert2.previousScrollOffsetY = chatAttachAlert2.scrollOffsetY[0];
                ChatAttachAlert.this.currentAttachLayout.onPanTransitionEnd();
            }

            @Override
            public void onPanTranslationUpdate(float f, float f2, boolean z) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.currentPanTranslationY = f;
                if (chatAttachAlert.fromScrollY > 0.0f) {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.currentPanTranslationY += (chatAttachAlert2.fromScrollY - ChatAttachAlert.this.toScrollY) * (1.0f - f2);
                }
                ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                chatAttachAlert3.actionBar.setTranslationY(chatAttachAlert3.currentPanTranslationY);
                ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
                chatAttachAlert4.selectedMenuItem.setTranslationY(chatAttachAlert4.currentPanTranslationY);
                ChatAttachAlert chatAttachAlert5 = ChatAttachAlert.this;
                chatAttachAlert5.searchItem.setTranslationY(chatAttachAlert5.currentPanTranslationY);
                ChatAttachAlert chatAttachAlert6 = ChatAttachAlert.this;
                chatAttachAlert6.doneItem.setTranslationY(chatAttachAlert6.currentPanTranslationY);
                ChatAttachAlert.this.actionBarShadow.setTranslationY(ChatAttachAlert.this.currentPanTranslationY);
                ChatAttachAlert.this.updateSelectedPosition(0);
                ChatAttachAlert chatAttachAlert7 = ChatAttachAlert.this;
                chatAttachAlert7.setCurrentPanTranslationY(chatAttachAlert7.currentPanTranslationY);
                AnonymousClass3.this.invalidate();
                ChatAttachAlert.this.frameLayout2.invalidate();
                if (ChatAttachAlert.this.currentAttachLayout != null) {
                    ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
                }
            }

            @Override
            protected boolean heightAnimationEnabled() {
                if (ChatAttachAlert.this.isDismissed() || !ChatAttachAlert.this.openTransitionFinished) {
                    return false;
                }
                return !ChatAttachAlert.this.commentTextView.isPopupVisible();
            }
        };

        AnonymousClass3(Context context, boolean z) {
            super(context);
            ChatAttachAlert.this = r1;
            this.val$forceDarkTheme = z;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() != 0 || ChatAttachAlert.this.scrollOffsetY[0] == 0 || motionEvent.getY() >= getCurrentTop() || ChatAttachAlert.this.actionBar.getAlpha() != 0.0f) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            ChatAttachAlert.this.dismiss();
            return true;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            return !ChatAttachAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            if (getLayoutParams().height > 0) {
                i3 = getLayoutParams().height;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (!chatAttachAlert.inBubbleMode) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
            }
            getPaddingTop();
            int size = View.MeasureSpec.getSize(i) - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            if (AndroidUtilities.isTablet()) {
                ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(0);
                } else {
                    ChatAttachAlert.this.selectedMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
                }
            }
            ((FrameLayout.LayoutParams) ChatAttachAlert.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
            ((FrameLayout.LayoutParams) ChatAttachAlert.this.doneItem.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
            this.ignoreLayout = true;
            int min = (int) (size / Math.min(4.5f, ChatAttachAlert.this.buttonsAdapter.getItemCount()));
            if (ChatAttachAlert.this.attachItemSize != min) {
                ChatAttachAlert.this.attachItemSize = min;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlert.AnonymousClass3.this.lambda$onMeasure$0();
                    }
                });
            }
            this.ignoreLayout = false;
            onMeasureInternal(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }

        public void lambda$onMeasure$0() {
            ChatAttachAlert.this.buttonsAdapter.notifyDataSetChanged();
        }

        private void onMeasureInternal(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            int i3 = size - (((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft * 2);
            int measureKeyboardHeight = SharedConfig.smoothKeyboard ? 0 : measureKeyboardHeight();
            if (!ChatAttachAlert.this.commentTextView.isWaitingForKeyboardOpen() && measureKeyboardHeight <= AndroidUtilities.dp(20.0f) && !ChatAttachAlert.this.commentTextView.isPopupShowing() && !ChatAttachAlert.this.commentTextView.isAnimatePopupClosing()) {
                this.ignoreLayout = true;
                ChatAttachAlert.this.commentTextView.hideEmojiView();
                this.ignoreLayout = false;
            }
            if (measureKeyboardHeight <= AndroidUtilities.dp(20.0f)) {
                int emojiPadding = (!SharedConfig.smoothKeyboard || !((BottomSheet) ChatAttachAlert.this).keyboardVisible) ? ChatAttachAlert.this.commentTextView.getEmojiPadding() : 0;
                if (!AndroidUtilities.isInMultiwindow) {
                    size2 -= emojiPadding;
                    i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
                this.ignoreLayout = true;
                ChatAttachAlert.this.currentAttachLayout.onPreMeasure(i3, size2);
                if (ChatAttachAlert.this.nextAttachLayout != null) {
                    ChatAttachAlert.this.nextAttachLayout.onPreMeasure(i3, size2);
                }
                this.ignoreLayout = false;
            }
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt.getVisibility() == 8)) {
                    EditTextEmoji editTextEmoji = ChatAttachAlert.this.commentTextView;
                    if (editTextEmoji == null || !editTextEmoji.isPopupView(childAt)) {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    } else if (ChatAttachAlert.this.inBubbleMode) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size2, 1073741824));
                    } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                    }
                }
            }
        }

        @Override
        public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass3.onLayout(boolean, int, int, int, int):void");
        }

        @Override
        public void requestLayout() {
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
        }

        private void drawChildBackground(android.graphics.Canvas r19, android.view.View r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass3.drawChildBackground(android.graphics.Canvas, android.view.View):void");
        }

        @Override
        protected boolean drawChild(android.graphics.Canvas r21, android.view.View r22, long r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass3.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.inBubbleMode) {
                int themedColor = chatAttachAlert.getThemedColor(this.val$forceDarkTheme ? "voipgroup_listViewBackground" : "dialogBackground");
                Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (ChatAttachAlert.this.actionBar.getAlpha() * 255.0f), Color.red(themedColor), Color.green(themedColor), Color.blue(themedColor)));
                canvas.drawRect(((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, ChatAttachAlert.this.currentPanTranslationY, getMeasuredWidth() - ((BottomSheet) ChatAttachAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight + ChatAttachAlert.this.currentPanTranslationY, Theme.dialogs_onlineCirclePaint);
            }
        }

        private int getCurrentTop() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            int i = 0;
            int i2 = chatAttachAlert.scrollOffsetY[0] - (((BottomSheet) chatAttachAlert).backgroundPaddingTop * 2);
            int dp = AndroidUtilities.dp(13.0f);
            FrameLayout frameLayout = ChatAttachAlert.this.headerView;
            if (frameLayout != null) {
                i = AndroidUtilities.dp(frameLayout.getAlpha() * 26.0f);
            }
            int dp2 = (i2 - (dp + i)) + AndroidUtilities.dp(20.0f);
            return (Build.VERSION.SDK_INT < 21 || ChatAttachAlert.this.inBubbleMode) ? dp2 : dp2 + AndroidUtilities.statusBarHeight;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, getPaddingTop() + ChatAttachAlert.this.currentPanTranslationY, getMeasuredWidth(), (getMeasuredHeight() + ChatAttachAlert.this.currentPanTranslationY) - getPaddingBottom());
            if (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoPreviewLayout || ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.photoPreviewLayout || (ChatAttachAlert.this.currentAttachLayout == ChatAttachAlert.this.photoLayout && ChatAttachAlert.this.nextAttachLayout == null)) {
                drawChildBackground(canvas, ChatAttachAlert.this.currentAttachLayout);
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public void setTranslationY(float f) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            float f2 = f + chatAttachAlert.currentPanTranslationY;
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 0) {
                this.initialTranslationY = f2;
            }
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType == 1) {
                if (f2 < 0.0f) {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(f2);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    if (chatAttachAlert2.avatarPicker != 0) {
                        chatAttachAlert2.headerView.setTranslationY((chatAttachAlert2.baseSelectedTextViewTranslationY + f2) - ChatAttachAlert.this.currentPanTranslationY);
                    }
                    ChatAttachAlert.this.buttonsRecyclerView.setTranslationY(0.0f);
                    f2 = 0.0f;
                } else {
                    ChatAttachAlert.this.currentAttachLayout.setTranslationY(0.0f);
                    RecyclerListView recyclerListView = ChatAttachAlert.this.buttonsRecyclerView;
                    recyclerListView.setTranslationY((-f2) + (recyclerListView.getMeasuredHeight() * (f2 / this.initialTranslationY)));
                }
                ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
            }
            super.setTranslationY(f2 - ChatAttachAlert.this.currentPanTranslationY);
            if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType != 1) {
                ChatAttachAlert.this.currentAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.adjustPanLayoutHelper.setResizableView(this);
            this.adjustPanLayoutHelper.onAttach();
            ChatAttachAlert.this.commentTextView.setAdjustPanLayoutHelper(this.adjustPanLayoutHelper);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
        }
    }

    public void lambda$new$0(int i) {
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(i);
    }

    public void lambda$new$1(View view) {
        this.selectedMenuItem.toggleSubMenu();
    }

    public void lambda$new$2(View view) {
        this.currentAttachLayout.onMenuItemClick(40);
    }

    public void lambda$new$3(boolean z, View view) {
        if (this.avatarPicker != 0) {
            this.delegate.openAvatarsSearch();
            dismiss();
            return;
        }
        final HashMap hashMap = new HashMap();
        final ArrayList arrayList = new ArrayList();
        PhotoPickerSearchActivity photoPickerSearchActivity = new PhotoPickerSearchActivity(hashMap, arrayList, 0, true, (ChatActivity) this.baseFragment);
        photoPickerSearchActivity.setDelegate(new PhotoPickerActivity.PhotoPickerActivityDelegate() {
            private boolean sendPressed;

            @Override
            public void onCaptionChanged(CharSequence charSequence) {
            }

            @Override
            public void onOpenInPressed() {
                PhotoPickerActivity.PhotoPickerActivityDelegate.CC.$default$onOpenInPressed(this);
            }

            @Override
            public void selectedPhotosChanged() {
            }

            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void actionButtonPressed(boolean z2, boolean z3, int i) {
                if (!z2 && !hashMap.isEmpty() && !this.sendPressed) {
                    this.sendPressed = true;
                    ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList2 = new ArrayList<>();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Object obj = hashMap.get(arrayList.get(i2));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        arrayList2.add(sendingMediaInfo);
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        String str = searchImage.imagePath;
                        if (str != null) {
                            sendingMediaInfo.path = str;
                        } else {
                            sendingMediaInfo.searchImage = searchImage;
                        }
                        sendingMediaInfo.thumbPath = searchImage.thumbPath;
                        sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                        CharSequence charSequence = searchImage.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = searchImage.entities;
                        sendingMediaInfo.masks = searchImage.stickers;
                        sendingMediaInfo.ttl = searchImage.ttl;
                        TLRPC$BotInlineResult tLRPC$BotInlineResult = searchImage.inlineResult;
                        if (tLRPC$BotInlineResult != null && searchImage.type == 1) {
                            sendingMediaInfo.inlineResult = tLRPC$BotInlineResult;
                            sendingMediaInfo.params = searchImage.params;
                        }
                        searchImage.date = (int) (System.currentTimeMillis() / 1000);
                    }
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).didSelectSearchPhotos(arrayList2, z3, i);
                }
            }
        });
        photoPickerSearchActivity.setMaxSelectedPhotos(this.maxSelectedPhotos, this.allowOrder);
        if (z) {
            this.baseFragment.showAsSheet(photoPickerSearchActivity);
        } else {
            this.baseFragment.presentFragment(photoPickerSearchActivity);
        }
        dismiss();
    }

    public void lambda$new$4(View view) {
        updatePhotoPreview(this.currentAttachLayout != this.photoPreviewLayout);
    }

    public void lambda$new$7(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        if (this.baseFragment.getParentActivity() != null) {
            if (view instanceof AttachButton) {
                int intValue = ((Integer) view.getTag()).intValue();
                if (intValue == 1) {
                    showLayout(this.photoLayout);
                } else if (intValue == 3) {
                    if (Build.VERSION.SDK_INT < 23 || this.baseFragment.getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                        openAudioLayout(true);
                    } else {
                        this.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                } else if (intValue == 4) {
                    if (Build.VERSION.SDK_INT < 23 || this.baseFragment.getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                        openDocumentsLayout(true);
                    } else {
                        this.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                        return;
                    }
                } else if (intValue == 5) {
                    if (Build.VERSION.SDK_INT < 23 || this.baseFragment.getParentActivity().checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
                        openContactsLayout();
                    } else {
                        this.baseFragment.getParentActivity().requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                        return;
                    }
                } else if (intValue == 6) {
                    if (AndroidUtilities.isGoogleMapsInstalled(this.baseFragment)) {
                        if (this.locationLayout == null) {
                            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                            ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), resourcesProvider);
                            this.locationLayout = chatAttachAlertLocationLayout;
                            attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                            chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlertLocationLayout.LocationActivityDelegate() {
                                @Override
                                public final void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i2, boolean z, int i3) {
                                    ChatAttachAlert.this.lambda$new$5(tLRPC$MessageMedia, i2, z, i3);
                                }
                            });
                        }
                        showLayout(this.locationLayout);
                    } else {
                        return;
                    }
                } else if (intValue == 9) {
                    if (this.pollLayout == null) {
                        AttachAlertLayout[] attachAlertLayoutArr2 = this.layouts;
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(this, getContext(), resourcesProvider);
                        this.pollLayout = chatAttachAlertPollLayout;
                        attachAlertLayoutArr2[1] = chatAttachAlertPollLayout;
                        chatAttachAlertPollLayout.setDelegate(new ChatAttachAlertPollLayout.PollCreateActivityDelegate() {
                            @Override
                            public final void sendPoll(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap hashMap, boolean z, int i2) {
                                ChatAttachAlert.this.lambda$new$6(tLRPC$TL_messageMediaPoll, hashMap, z, i2);
                            }
                        });
                    }
                    showLayout(this.pollLayout);
                } else {
                    this.delegate.didPressedButton(((Integer) view.getTag()).intValue(), true, true, 0, false);
                }
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(10.0f);
                int i2 = left - dp;
                if (i2 < 0) {
                    this.buttonsRecyclerView.smoothScrollBy(i2, 0);
                } else {
                    int i3 = right + dp;
                    if (i3 > this.buttonsRecyclerView.getMeasuredWidth()) {
                        RecyclerListView recyclerListView = this.buttonsRecyclerView;
                        recyclerListView.smoothScrollBy(i3 - recyclerListView.getMeasuredWidth(), 0);
                    }
                }
            } else if (view instanceof AttachBotButton) {
                AttachBotButton attachBotButton = (AttachBotButton) view;
                if (attachBotButton.attachMenuBot != null) {
                    showBotLayout(attachBotButton.attachMenuBot.bot_id);
                } else {
                    this.delegate.didSelectBot(attachBotButton.currentUser);
                    dismiss();
                }
            }
            if (view.getX() + view.getWidth() >= this.buttonsRecyclerView.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) {
                this.buttonsRecyclerView.smoothScrollBy((int) (view.getWidth() * 1.5f), 0);
            }
        }
    }

    public void lambda$new$5(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
        ((ChatActivity) this.baseFragment).didSelectLocation(tLRPC$MessageMedia, i, z, i2);
    }

    public void lambda$new$6(TLRPC$TL_messageMediaPoll tLRPC$TL_messageMediaPoll, HashMap hashMap, boolean z, int i) {
        ((ChatActivity) this.baseFragment).sendPoll(tLRPC$TL_messageMediaPoll, hashMap, z, i);
    }

    public boolean lambda$new$8(View view, int i) {
        if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            if (!(this.baseFragment == null || attachBotButton.currentUser == null)) {
                onLongClickBotButton(attachBotButton.attachMenuBot, attachBotButton.currentUser);
                return true;
            }
        }
        return false;
    }

    public void lambda$new$9(View view) {
        ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
        long j = this.selectedId;
        if (j < 0 && (chatAttachAlertBotWebViewLayout = this.botAttachLayouts.get(-j)) != null) {
            chatAttachAlertBotWebViewLayout.getWebViewContainer().onMainButtonPressed();
        }
    }

    public class AnonymousClass11 extends FrameLayout {
        private int color;
        private final Paint p = new Paint();
        final boolean val$forceDarkTheme;

        AnonymousClass11(Context context, boolean z) {
            super(context);
            ChatAttachAlert.this = r1;
            this.val$forceDarkTheme = z;
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (!(ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == 0.0f || ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop == ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop)) {
                if (ChatAttachAlert.this.topBackgroundAnimator != null) {
                    ChatAttachAlert.this.topBackgroundAnimator.cancel();
                }
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.captionEditTextTopOffset = chatAttachAlert.chatActivityEnterViewAnimateFromTop - (ChatAttachAlert.this.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset);
                ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                chatAttachAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(chatAttachAlert2.captionEditTextTopOffset, 0.0f);
                ChatAttachAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.AnonymousClass11.this.lambda$onDraw$0(valueAnimator);
                    }
                });
                ChatAttachAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ChatAttachAlert.this.topBackgroundAnimator.setDuration(200L);
                ChatAttachAlert.this.topBackgroundAnimator.start();
                ChatAttachAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            float measuredHeight = (ChatAttachAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f)) * (1.0f - getAlpha());
            View view = ChatAttachAlert.this.shadow;
            float f = (-(ChatAttachAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(84.0f))) + ChatAttachAlert.this.captionEditTextTopOffset;
            ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
            view.setTranslationY(f + chatAttachAlert3.currentPanTranslationY + chatAttachAlert3.bottomPannelTranslation + measuredHeight + ChatAttachAlert.this.botMainButtonOffsetY);
            int themedColor = ChatAttachAlert.this.getThemedColor(this.val$forceDarkTheme ? "voipgroup_listViewBackground" : "dialogBackground");
            if (this.color != themedColor) {
                this.color = themedColor;
                this.p.setColor(themedColor);
            }
            canvas.drawRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight(), this.p);
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ChatAttachAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChatAttachAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public class AnonymousClass12 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        AnonymousClass12(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, resourcesProvider);
            ChatAttachAlert.this = r7;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ChatAttachAlert.this.enterCommentEventSent) {
                if (motionEvent.getX() <= ChatAttachAlert.this.commentTextView.getEditText().getLeft() || motionEvent.getX() >= ChatAttachAlert.this.commentTextView.getEditText().getRight() || motionEvent.getY() <= ChatAttachAlert.this.commentTextView.getEditText().getTop() || motionEvent.getY() >= ChatAttachAlert.this.commentTextView.getEditText().getBottom()) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.makeFocusable(chatAttachAlert.commentTextView.getEditText(), false);
                } else {
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.makeFocusable(chatAttachAlert2.commentTextView.getEditText(), true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ChatAttachAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatAttachAlert.AnonymousClass12.lambda$dispatchDraw$0(EditTextCaption.this, valueAnimator);
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = ofFloat;
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        public static void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.chatActivityEnterViewAnimateFromTop = chatAttachAlert.frameLayout2.getTop() + ChatAttachAlert.this.captionEditTextTopOffset;
            ChatAttachAlert.this.frameLayout2.invalidate();
        }

        @Override
        protected void bottomPanelTranslationY(float f) {
            ChatAttachAlert.this.bottomPannelTranslation = f;
            ChatAttachAlert.this.frameLayout2.setTranslationY(f);
            ChatAttachAlert.this.writeButtonContainer.setTranslationY(f);
            ChatAttachAlert.this.selectedCountView.setTranslationY(f);
            ChatAttachAlert.this.frameLayout2.invalidate();
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, true, 0);
        }
    }

    public class AnonymousClass13 implements TextWatcher {
        private boolean processChange;

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass13() {
            ChatAttachAlert.this = r1;
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 - i2 >= 1) {
                this.processChange = true;
            }
        }

        @Override
        public void afterTextChanged(android.text.Editable r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.AnonymousClass13.afterTextChanged(android.text.Editable):void");
        }

        public void lambda$afterTextChanged$0(ValueAnimator valueAnimator) {
            ChatAttachAlert.this.sendButtonEnabledProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int themedColor = ChatAttachAlert.this.getThemedColor("dialogFloatingIcon");
            ChatAttachAlert.this.writeButton.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(themedColor, (int) (Color.alpha(themedColor) * ((ChatAttachAlert.this.sendButtonEnabledProgress * 0.42f) + 0.58f))), PorterDuff.Mode.MULTIPLY));
            ChatAttachAlert.this.selectedCountView.invalidate();
        }
    }

    public void lambda$new$12(Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView, 2.0f, 0);
            Vibrator vibrator = (Vibrator) this.captionLimitView.getContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
                return;
            }
            return;
        }
        if (this.editingMessageObject == null) {
            BaseFragment baseFragment = this.baseFragment;
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), ((ChatActivity) this.baseFragment).getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i) {
                        ChatAttachAlert.this.lambda$new$11(z, i);
                    }
                }, resourcesProvider);
                return;
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(true, 0);
            return;
        }
        attachAlertLayout.sendSelectedItems(true, 0);
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public void lambda$new$11(boolean z, int i) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i);
            return;
        }
        attachAlertLayout.sendSelectedItems(z, i);
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public boolean lambda$new$16(final org.telegram.ui.ActionBar.Theme.ResourcesProvider r12, android.view.View r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.lambda$new$16(org.telegram.ui.ActionBar.Theme$ResourcesProvider, android.view.View):boolean");
    }

    public void lambda$new$13(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$new$15(int i, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider, View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        if (i == 0) {
            AlertsCreator.createScheduleDatePickerDialog(getContext(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2) {
                    ChatAttachAlert.this.lambda$new$14(z, i2);
                }
            }, resourcesProvider);
        } else if (i == 1) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
                sendPressed(false, 0);
                return;
            }
            attachAlertLayout.sendSelectedItems(false, 0);
            dismiss();
        }
    }

    public void lambda$new$14(boolean z, int i) {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(z, i);
            return;
        }
        attachAlertLayout.sendSelectedItems(z, i);
        dismiss();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(this.forceDarkTheme ? "voipgroup_listViewBackground" : "dialogBackground")) > 0.699999988079071d;
    }

    public void onLongClickBotButton(final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, final TLRPC$User tLRPC$User) {
        String userName = tLRPC$TL_attachMenuBot != null ? tLRPC$TL_attachMenuBot.short_name : UserObject.getUserName(tLRPC$User);
        new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString((int) R.string.BotRemoveFromMenuTitle)).setMessage(AndroidUtilities.replaceTags(tLRPC$TL_attachMenuBot != null ? LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName) : LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName))).setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChatAttachAlert.this.lambda$onLongClickBotButton$19(tLRPC$TL_attachMenuBot, tLRPC$User, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).show();
    }

    public void lambda$onLongClickBotButton$19(final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        if (tLRPC$TL_attachMenuBot != null) {
            TLRPC$TL_messages_toggleBotInAttachMenu tLRPC$TL_messages_toggleBotInAttachMenu = new TLRPC$TL_messages_toggleBotInAttachMenu();
            tLRPC$TL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tLRPC$User);
            tLRPC$TL_messages_toggleBotInAttachMenu.enabled = false;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_toggleBotInAttachMenu, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChatAttachAlert.this.lambda$onLongClickBotButton$18(tLRPC$TL_attachMenuBot, tLObject, tLRPC$TL_error);
                }
            }, 66);
            return;
        }
        MediaDataController.getInstance(this.currentAccount).removeInline(tLRPC$User.id);
    }

    public void lambda$onLongClickBotButton$18(final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.this.lambda$onLongClickBotButton$17(tLRPC$TL_attachMenuBot);
            }
        });
    }

    public void lambda$onLongClickBotButton$17(TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        MediaDataController.getInstance(this.currentAccount).loadAttachMenuBots(false, true);
        if (this.currentAttachLayout == this.botAttachLayouts.get(tLRPC$TL_attachMenuBot.bot_id)) {
            showLayout(this.photoLayout);
        }
    }

    @Override
    protected boolean shouldOverlayCameraViewOverNavBar() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        return attachAlertLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.cameraExpanded;
    }

    @Override
    public void show() {
        super.show();
        boolean z = false;
        this.buttonPressed = false;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            this.calcMandatoryInsets = ((ChatActivity) baseFragment).isKeyboardVisible();
        }
        this.openTransitionFinished = false;
        if (Build.VERSION.SDK_INT >= 30) {
            int themedColor = getThemedColor("windowBackgroundGray");
            AndroidUtilities.setNavigationBarColor(getWindow(), themedColor, false, new AndroidUtilities.IntColorCallback() {
                @Override
                public final void run(int i) {
                    ChatAttachAlert.this.lambda$show$20(i);
                }
            });
            Window window = getWindow();
            if (AndroidUtilities.computePerceivedBrightness(themedColor) > 0.721d) {
                z = true;
            }
            AndroidUtilities.setLightNavigationBar(window, z);
        }
    }

    public void lambda$show$20(int i) {
        this.navBarColorKey = null;
        this.navBarColor = i;
        this.containerView.invalidate();
    }

    public void setEditingMessageObject(MessageObject messageObject) {
        if (this.editingMessageObject != messageObject) {
            this.editingMessageObject = messageObject;
            if (messageObject != null) {
                this.maxSelectedPhotos = 1;
                this.allowOrder = false;
            } else {
                this.maxSelectedPhotos = -1;
                this.allowOrder = true;
            }
            this.buttonsAdapter.notifyDataSetChanged();
        }
    }

    public MessageObject getEditingMessageObject() {
        return this.editingMessageObject;
    }

    public void applyCaption() {
        if (this.commentTextView.length() > 0) {
            this.currentAttachLayout.applyCaption(this.commentTextView.getText());
        }
    }

    private void sendPressed(boolean z, int i) {
        if (!this.buttonPressed) {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                TLRPC$Chat currentChat = chatActivity.getCurrentChat();
                if (chatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                    edit.putBoolean("silent_" + chatActivity.getDialogId(), !z).commit();
                }
            }
            applyCaption();
            this.buttonPressed = true;
            this.delegate.didPressedButton(7, true, z, i, false);
        }
    }

    private void showLayout(AttachAlertLayout attachAlertLayout) {
        long j = this.selectedId;
        if (attachAlertLayout == this.photoLayout) {
            j = 1;
        } else if (attachAlertLayout == this.audioLayout) {
            j = 3;
        } else if (attachAlertLayout == this.documentLayout) {
            j = 4;
        } else if (attachAlertLayout == this.contactsLayout) {
            j = 5;
        } else if (attachAlertLayout == this.locationLayout) {
            j = 6;
        } else if (attachAlertLayout == this.pollLayout) {
            j = 9;
        }
        showLayout(attachAlertLayout, j);
    }

    private void showLayout(AttachAlertLayout attachAlertLayout, long j) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        CameraView cameraView;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        CameraView cameraView2;
        if (this.viewChangeAnimator == null && this.commentsAnimator == null) {
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            if (attachAlertLayout2 == attachAlertLayout) {
                attachAlertLayout2.scrollToTop();
                return;
            }
            this.botButtonWasVisible = false;
            this.botButtonProgressWasVisible = false;
            this.botMainButtonOffsetY = 0.0f;
            this.botMainButtonTextView.setVisibility(8);
            this.botProgressView.setAlpha(0.0f);
            this.botProgressView.setScaleX(0.1f);
            this.botProgressView.setScaleY(0.1f);
            this.botProgressView.setVisibility(8);
            this.buttonsRecyclerView.setAlpha(1.0f);
            this.buttonsRecyclerView.setTranslationY(this.botMainButtonOffsetY);
            for (int i = 0; i < this.botAttachLayouts.size(); i++) {
                this.botAttachLayouts.valueAt(i).setMeasureOffsetY(0);
            }
            this.selectedId = j;
            int childCount = this.buttonsRecyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.buttonsRecyclerView.getChildAt(i2);
                if (childAt instanceof AttachButton) {
                    ((AttachButton) childAt).updateCheckedState(true);
                } else if (childAt instanceof AttachBotButton) {
                    ((AttachBotButton) childAt).updateCheckedState(true);
                }
            }
            int firstOffset = (this.currentAttachLayout.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.scrollOffsetY[0];
            this.nextAttachLayout = attachAlertLayout;
            if (Build.VERSION.SDK_INT >= 20) {
                this.container.setLayerType(2, null);
            }
            this.actionBar.setVisibility(this.nextAttachLayout.needsActionBar() != 0 ? 0 : 4);
            this.actionBarShadow.setVisibility(this.actionBar.getVisibility());
            if (this.actionBar.isSearchFieldVisible()) {
                this.actionBar.closeSearchField();
            }
            this.currentAttachLayout.onHide();
            AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = this.photoLayout;
            if (attachAlertLayout3 == chatAttachAlertPhotoLayout3) {
                chatAttachAlertPhotoLayout3.setCheckCameraWhenShown(true);
            }
            this.nextAttachLayout.onShow(this.currentAttachLayout);
            this.nextAttachLayout.setVisibility(0);
            if (attachAlertLayout.getParent() != null) {
                this.containerView.removeView(this.nextAttachLayout);
            }
            int indexOfChild = this.containerView.indexOfChild(this.currentAttachLayout);
            ViewParent parent = this.nextAttachLayout.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                AttachAlertLayout attachAlertLayout4 = this.nextAttachLayout;
                if (attachAlertLayout4 != this.locationLayout) {
                    indexOfChild++;
                }
                viewGroup.addView(attachAlertLayout4, indexOfChild, LayoutHelper.createFrame(-1, -1.0f));
            }
            final Runnable chatAttachAlert$$ExternalSyntheticLambda17 = new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.this.lambda$showLayout$21();
                }
            };
            if ((this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                int max = Math.max(this.nextAttachLayout.getWidth(), this.currentAttachLayout.getWidth());
                AttachAlertLayout attachAlertLayout5 = this.nextAttachLayout;
                if (attachAlertLayout5 instanceof ChatAttachAlertPhotoLayoutPreview) {
                    attachAlertLayout5.setTranslationX(max);
                    AttachAlertLayout attachAlertLayout6 = this.currentAttachLayout;
                    if ((attachAlertLayout6 instanceof ChatAttachAlertPhotoLayout) && (cameraView2 = (chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) attachAlertLayout6).cameraView) != null) {
                        cameraView2.setVisibility(4);
                        chatAttachAlertPhotoLayout2.cameraIcon.setVisibility(4);
                        chatAttachAlertPhotoLayout2.cameraCell.setVisibility(0);
                    }
                } else {
                    this.currentAttachLayout.setTranslationX(-max);
                    AttachAlertLayout attachAlertLayout7 = this.nextAttachLayout;
                    if (attachAlertLayout7 == this.photoLayout && (cameraView = (chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) attachAlertLayout7).cameraView) != null) {
                        cameraView.setVisibility(0);
                        chatAttachAlertPhotoLayout.cameraIcon.setVisibility(0);
                    }
                }
                this.nextAttachLayout.setAlpha(1.0f);
                this.currentAttachLayout.setAlpha(1.0f);
                this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(0.0f));
                final float alpha = this.actionBar.getAlpha();
                SpringAnimation springAnimation = new SpringAnimation(new FloatValueHolder(0.0f));
                springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                        ChatAttachAlert.this.lambda$showLayout$22(alpha, dynamicAnimation, f, f2);
                    }
                });
                springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                        ChatAttachAlert.this.lambda$showLayout$23(chatAttachAlert$$ExternalSyntheticLambda17, dynamicAnimation, z, f, f2);
                    }
                });
                springAnimation.setSpring(new SpringForce(500.0f));
                springAnimation.getSpring().setDampingRatio(1.0f);
                springAnimation.getSpring().setStiffness(1000.0f);
                springAnimation.start();
                this.viewChangeAnimator = springAnimation;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.nextAttachLayout.setAlpha(0.0f);
            this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f));
            AttachAlertLayout attachAlertLayout8 = this.currentAttachLayout;
            Property property = View.TRANSLATION_Y;
            float[] fArr = {AndroidUtilities.dp(78.0f) + firstOffset};
            ActionBar actionBar = this.actionBar;
            animatorSet.playTogether(ObjectAnimator.ofFloat(attachAlertLayout8, property, fArr), ObjectAnimator.ofFloat(this.currentAttachLayout, this.ATTACH_ALERT_LAYOUT_TRANSLATION, 0.0f, 1.0f), ObjectAnimator.ofFloat(actionBar, View.ALPHA, actionBar.getAlpha(), 0.0f));
            animatorSet.setDuration(180L);
            animatorSet.setStartDelay(20L);
            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
            animatorSet.addListener(new AnonymousClass18(chatAttachAlert$$ExternalSyntheticLambda17));
            this.viewChangeAnimator = animatorSet;
            animatorSet.start();
        }
    }

    public void lambda$showLayout$21() {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview;
        if (Build.VERSION.SDK_INT >= 20) {
            this.container.setLayerType(0, null);
        }
        this.viewChangeAnimator = null;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (!(attachAlertLayout2 == this.photoLayout || (attachAlertLayout = this.nextAttachLayout) == (chatAttachAlertPhotoLayoutPreview = this.photoPreviewLayout) || attachAlertLayout2 == attachAlertLayout || attachAlertLayout2 == chatAttachAlertPhotoLayoutPreview)) {
            this.containerView.removeView(attachAlertLayout2);
        }
        this.currentAttachLayout.setVisibility(8);
        this.currentAttachLayout.onHidden();
        this.nextAttachLayout.onShown();
        this.currentAttachLayout = this.nextAttachLayout;
        this.nextAttachLayout = null;
        int[] iArr = this.scrollOffsetY;
        iArr[0] = iArr[1];
    }

    public class AnonymousClass18 extends AnimatorListenerAdapter {
        final Runnable val$onEnd;

        AnonymousClass18(Runnable runnable) {
            ChatAttachAlert.this = r1;
            this.val$onEnd = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ChatAttachAlert.this.currentAttachLayout.setAlpha(0.0f);
            SpringAnimation springAnimation = new SpringAnimation(ChatAttachAlert.this.nextAttachLayout, DynamicAnimation.TRANSLATION_Y, 0.0f);
            springAnimation.getSpring().setDampingRatio(0.75f);
            springAnimation.getSpring().setStiffness(500.0f);
            springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    ChatAttachAlert.AnonymousClass18.this.lambda$onAnimationEnd$0(dynamicAnimation, f, f2);
                }
            });
            final Runnable runnable = this.val$onEnd;
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    runnable.run();
                }
            });
            ChatAttachAlert.this.viewChangeAnimator = springAnimation;
            springAnimation.start();
        }

        public void lambda$onAnimationEnd$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            if (ChatAttachAlert.this.nextAttachLayout == ChatAttachAlert.this.pollLayout) {
                ChatAttachAlert.this.updateSelectedPosition(1);
            }
            ChatAttachAlert.this.nextAttachLayout.onContainerTranslationUpdated(ChatAttachAlert.this.currentPanTranslationY);
            ((BottomSheet) ChatAttachAlert.this).containerView.invalidate();
        }
    }

    public void lambda$showLayout$22(float f, DynamicAnimation dynamicAnimation, float f2, float f3) {
        float f4 = f2 / 500.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION.set(this.currentAttachLayout, Float.valueOf(f4));
        this.actionBar.setAlpha(AndroidUtilities.lerp(f, 0.0f, f4));
        LinearLayout linearLayout = this.mediaPreviewView;
        if (!(this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
            f4 = 1.0f - f4;
        }
        linearLayout.setAlpha(f4);
    }

    public void lambda$showLayout$23(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.currentAttachLayout.onHideShowProgress(1.0f);
        this.nextAttachLayout.onHideShowProgress(1.0f);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.containerView.invalidate();
        runnable.run();
    }

    public void updatePhotoPreview(boolean z) {
        if (!z) {
            showLayout(this.photoLayout);
        } else if (this.canOpenPreview) {
            if (this.photoPreviewLayout == null) {
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = new ChatAttachAlertPhotoLayoutPreview(this, getContext(), this.parentThemeDelegate);
                this.photoPreviewLayout = chatAttachAlertPhotoLayoutPreview;
                chatAttachAlertPhotoLayoutPreview.bringToFront();
            }
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            AttachAlertLayout attachAlertLayout2 = this.photoPreviewLayout;
            if (attachAlertLayout == attachAlertLayout2) {
                attachAlertLayout2 = this.photoLayout;
            }
            showLayout(attachAlertLayout2);
        }
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout;
        if (i == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            openContactsLayout();
        } else if (i == 30 && (chatAttachAlertLocationLayout = this.locationLayout) != null && this.currentAttachLayout == chatAttachAlertLocationLayout && isShowing()) {
            this.locationLayout.openShareLiveLocation();
        }
    }

    private void openContactsLayout() {
        if (this.contactsLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = new ChatAttachAlertContactsLayout(this, getContext(), this.resourcesProvider);
            this.contactsLayout = chatAttachAlertContactsLayout;
            attachAlertLayoutArr[2] = chatAttachAlertContactsLayout;
            chatAttachAlertContactsLayout.setDelegate(new ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate() {
                @Override
                public final void didSelectContact(TLRPC$User tLRPC$User, boolean z, int i) {
                    ChatAttachAlert.this.lambda$openContactsLayout$24(tLRPC$User, z, i);
                }
            });
        }
        showLayout(this.contactsLayout);
    }

    public void lambda$openContactsLayout$24(TLRPC$User tLRPC$User, boolean z, int i) {
        ((ChatActivity) this.baseFragment).sendContact(tLRPC$User, z, i);
    }

    public void openAudioLayout(boolean z) {
        if (this.audioLayout == null) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = new ChatAttachAlertAudioLayout(this, getContext(), this.resourcesProvider);
            this.audioLayout = chatAttachAlertAudioLayout;
            attachAlertLayoutArr[3] = chatAttachAlertAudioLayout;
            chatAttachAlertAudioLayout.setDelegate(new ChatAttachAlertAudioLayout.AudioSelectDelegate() {
                @Override
                public final void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i) {
                    ChatAttachAlert.this.lambda$openAudioLayout$25(arrayList, charSequence, z2, i);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            this.audioLayout.setMaxSelectedFiles(((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) ? -1 : 1);
        }
        if (z) {
            showLayout(this.audioLayout);
        }
    }

    public void lambda$openAudioLayout$25(ArrayList arrayList, CharSequence charSequence, boolean z, int i) {
        ((ChatActivity) this.baseFragment).sendAudio(arrayList, charSequence, z, i);
    }

    private void openDocumentsLayout(boolean z) {
        if (this.documentLayout == null) {
            int i = this.isSoundPicker ? 2 : 0;
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = new ChatAttachAlertDocumentLayout(this, getContext(), i, this.resourcesProvider);
            this.documentLayout = chatAttachAlertDocumentLayout;
            attachAlertLayoutArr[4] = chatAttachAlertDocumentLayout;
            chatAttachAlertDocumentLayout.setDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
                {
                    ChatAttachAlert.this = this;
                }

                @Override
                public void didSelectFiles(ArrayList<String> arrayList, String str, ArrayList<MessageObject> arrayList2, boolean z2, int i2) {
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) baseFragment).didSelectFiles(arrayList, str, arrayList2, z2, i2);
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).didSelectFiles(arrayList, str, z2, i2);
                    }
                }

                @Override
                public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z2, int i2) {
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).didSelectPhotos(arrayList, z2, i2);
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).didSelectPhotos(arrayList, z2, i2);
                    }
                }

                @Override
                public void startDocumentSelectActivity() {
                    BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                    if (baseFragment instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) baseFragment).startDocumentSelectActivity();
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).startDocumentSelectActivity();
                    }
                }

                @Override
                public void startMusicSelectActivity() {
                    ChatAttachAlert.this.openAudioLayout(true);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        int i2 = 1;
        if (baseFragment instanceof ChatActivity) {
            TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = this.documentLayout;
            if ((currentChat == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) && this.editingMessageObject == null) {
                i2 = -1;
            }
            chatAttachAlertDocumentLayout2.setMaxSelectedFiles(i2);
        } else {
            this.documentLayout.setMaxSelectedFiles(this.maxSelectedPhotos);
            this.documentLayout.setCanSelectOnlyImageFiles(!this.isSoundPicker);
        }
        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout3 = this.documentLayout;
        chatAttachAlertDocumentLayout3.isSoundPicker = this.isSoundPicker;
        if (z) {
            showLayout(chatAttachAlertDocumentLayout3);
        }
    }

    private boolean showCommentTextView(final boolean z, boolean z2) {
        int i = 0;
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.commentsAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            if (!this.isSoundPicker) {
                this.frameLayout2.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
            if (!this.typeButtonsAvailable && !this.isSoundPicker) {
                this.shadow.setVisibility(0);
            }
        } else if (this.typeButtonsAvailable) {
            this.buttonsRecyclerView.setVisibility(0);
        }
        float f = 0.2f;
        float f2 = 0.0f;
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = this.frameLayout2;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, fArr));
            FrameLayout frameLayout2 = this.writeButtonContainer;
            Property property2 = View.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property2, fArr2));
            FrameLayout frameLayout3 = this.writeButtonContainer;
            Property property3 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property3, fArr3));
            FrameLayout frameLayout4 = this.writeButtonContainer;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout4, property4, fArr4));
            View view = this.selectedCountView;
            Property property5 = View.SCALE_X;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.2f;
            arrayList.add(ObjectAnimator.ofFloat(view, property5, fArr5));
            View view2 = this.selectedCountView;
            Property property6 = View.SCALE_Y;
            float[] fArr6 = new float[1];
            if (z) {
                f = 1.0f;
            }
            fArr6[0] = f;
            arrayList.add(ObjectAnimator.ofFloat(view2, property6, fArr6));
            View view3 = this.selectedCountView;
            Property property7 = View.ALPHA;
            float[] fArr7 = new float[1];
            fArr7[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(view3, property7, fArr7));
            if (this.actionBar.getTag() != null) {
                FrameLayout frameLayout5 = this.frameLayout2;
                Property property8 = View.TRANSLATION_Y;
                float[] fArr8 = new float[1];
                fArr8[0] = z ? 0.0f : AndroidUtilities.dp(48.0f);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout5, property8, fArr8));
                View view4 = this.shadow;
                Property property9 = View.TRANSLATION_Y;
                float[] fArr9 = new float[1];
                fArr9[0] = z ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(84.0f);
                arrayList.add(ObjectAnimator.ofFloat(view4, property9, fArr9));
                View view5 = this.shadow;
                Property property10 = View.ALPHA;
                float[] fArr10 = new float[1];
                if (z) {
                    f2 = 1.0f;
                }
                fArr10[0] = f2;
                arrayList.add(ObjectAnimator.ofFloat(view5, property10, fArr10));
            } else if (this.typeButtonsAvailable) {
                RecyclerListView recyclerListView = this.buttonsRecyclerView;
                Property property11 = View.TRANSLATION_Y;
                float[] fArr11 = new float[1];
                fArr11[0] = z ? AndroidUtilities.dp(36.0f) : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(recyclerListView, property11, fArr11));
                View view6 = this.shadow;
                Property property12 = View.TRANSLATION_Y;
                float[] fArr12 = new float[1];
                if (z) {
                    f2 = AndroidUtilities.dp(36.0f);
                }
                fArr12[0] = f2;
                arrayList.add(ObjectAnimator.ofFloat(view6, property12, fArr12));
            } else if (!this.isSoundPicker) {
                this.shadow.setTranslationY(AndroidUtilities.dp(36.0f) + this.botMainButtonOffsetY);
                View view7 = this.shadow;
                Property property13 = View.ALPHA;
                float[] fArr13 = new float[1];
                if (z) {
                    f2 = 1.0f;
                }
                fArr13[0] = f2;
                arrayList.add(ObjectAnimator.ofFloat(view7, property13, fArr13));
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    ChatAttachAlert.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        if (!z) {
                            if (!ChatAttachAlert.this.isSoundPicker) {
                                ChatAttachAlert.this.frameLayout2.setVisibility(4);
                            }
                            ChatAttachAlert.this.writeButtonContainer.setVisibility(4);
                            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                            if (!chatAttachAlert.typeButtonsAvailable && !chatAttachAlert.isSoundPicker) {
                                ChatAttachAlert.this.shadow.setVisibility(4);
                            }
                        } else {
                            ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                            if (chatAttachAlert2.typeButtonsAvailable && (chatAttachAlert2.currentAttachLayout == null || ChatAttachAlert.this.currentAttachLayout.shouldHideBottomButtons())) {
                                ChatAttachAlert.this.buttonsRecyclerView.setVisibility(4);
                            }
                        }
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (animator.equals(ChatAttachAlert.this.commentsAnimator)) {
                        ChatAttachAlert.this.commentsAnimator = null;
                    }
                }
            });
            this.commentsAnimator.start();
        } else {
            this.frameLayout2.setAlpha(z ? 1.0f : 0.0f);
            this.writeButtonContainer.setScaleX(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setScaleY(z ? 1.0f : 0.2f);
            this.writeButtonContainer.setAlpha(z ? 1.0f : 0.0f);
            this.selectedCountView.setScaleX(z ? 1.0f : 0.2f);
            View view8 = this.selectedCountView;
            if (z) {
                f = 1.0f;
            }
            view8.setScaleY(f);
            this.selectedCountView.setAlpha(z ? 1.0f : 0.0f);
            if (this.actionBar.getTag() != null) {
                this.frameLayout2.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
                this.shadow.setTranslationY((z ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(84.0f)) + this.botMainButtonOffsetY);
                View view9 = this.shadow;
                if (z) {
                    f2 = 1.0f;
                }
                view9.setAlpha(f2);
            } else if (this.typeButtonsAvailable) {
                AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
                if (attachAlertLayout == null || attachAlertLayout.shouldHideBottomButtons()) {
                    RecyclerListView recyclerListView2 = this.buttonsRecyclerView;
                    if (z) {
                        f2 = AndroidUtilities.dp(36.0f);
                    }
                    recyclerListView2.setTranslationY(f2);
                }
                View view10 = this.shadow;
                if (z) {
                    i = AndroidUtilities.dp(36.0f);
                }
                view10.setTranslationY(i + this.botMainButtonOffsetY);
            } else {
                this.shadow.setTranslationY(AndroidUtilities.dp(36.0f) + this.botMainButtonOffsetY);
                View view11 = this.shadow;
                if (z) {
                    f2 = 1.0f;
                }
                view11.setAlpha(f2);
            }
            if (!z) {
                this.frameLayout2.setVisibility(4);
                this.writeButtonContainer.setVisibility(4);
                if (!this.typeButtonsAvailable) {
                    this.shadow.setVisibility(4);
                }
            }
        }
        return true;
    }

    @Override
    protected void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            SpringAnimation springAnimation = this.appearSpringAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            AnimatorSet animatorSet2 = this.buttonsAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    @Override
    public boolean onCustomOpenAnimation() {
        this.photoLayout.setTranslationX(0.0f);
        this.mediaPreviewView.setAlpha(0.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.buttonsAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.ATTACH_ALERT_PROGRESS, 0.0f, 400.0f));
        this.buttonsAnimation.setDuration(400L);
        this.buttonsAnimation.setStartDelay(20L);
        this.ATTACH_ALERT_PROGRESS.set(this, Float.valueOf(0.0f));
        this.buttonsAnimation.start();
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.getSpring().setDampingRatio(0.75f);
        this.appearSpringAnimation.getSpring().setStiffness(350.0f);
        this.appearSpringAnimation.start();
        if (Build.VERSION.SDK_INT >= 20 && this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        Animator[] animatorArr = new Animator[1];
        ColorDrawable colorDrawable = this.backDrawable;
        Property<ColorDrawable, Integer> property = AnimationProperties.COLOR_DRAWABLE_ALPHA;
        int[] iArr = new int[1];
        iArr[0] = this.dimBehind ? this.dimBehindAlpha : 0;
        animatorArr[0] = ObjectAnimator.ofInt(colorDrawable, property, iArr);
        animatorSet2.playTogether(animatorArr);
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        final BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface = super.delegate;
        final Runnable chatAttachAlert$$ExternalSyntheticLambda19 = new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$26(bottomSheetDelegateInterface);
            }
        };
        this.appearSpringAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ChatAttachAlert.this.lambda$onCustomOpenAnimation$27(chatAttachAlert$$ExternalSyntheticLambda19, dynamicAnimation, z, f, f2);
            }
        });
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() {
            {
                ChatAttachAlert.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation != null && ((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator) && ChatAttachAlert.this.appearSpringAnimation != null && !ChatAttachAlert.this.appearSpringAnimation.isRunning()) {
                    chatAttachAlert$$ExternalSyntheticLambda19.run();
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (((BottomSheet) ChatAttachAlert.this).currentSheetAnimation != null && ((BottomSheet) ChatAttachAlert.this).currentSheetAnimation.equals(animator)) {
                    ((BottomSheet) ChatAttachAlert.this).currentSheetAnimation = null;
                    ((BottomSheet) ChatAttachAlert.this).currentSheetAnimationType = 0;
                }
            }
        });
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        return true;
    }

    public void lambda$onCustomOpenAnimation$26(BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.currentSheetAnimation = null;
        this.appearSpringAnimation = null;
        this.currentSheetAnimationType = 0;
        if (bottomSheetDelegateInterface != null) {
            bottomSheetDelegateInterface.onOpenAnimationEnd();
        }
        if (this.useHardwareLayer) {
            this.container.setLayerType(0, null);
        }
        if (this.isFullscreen) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags &= -1025;
            getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
    }

    public void lambda$onCustomOpenAnimation$27(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null && !animatorSet.isRunning()) {
            runnable.run();
        }
    }

    @Override
    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.currentAttachLayout.onContainerViewTouchEvent(motionEvent);
    }

    public void makeFocusable(final EditTextBoldCursor editTextBoldCursor, final boolean z) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null && !this.enterCommentEventSent) {
            boolean needEnterComment = chatAttachViewDelegate.needEnterComment();
            this.enterCommentEventSent = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.this.lambda$makeFocusable$29(editTextBoldCursor, z);
                }
            }, needEnterComment ? 200L : 0L);
        }
    }

    public void lambda$makeFocusable$29(final EditTextBoldCursor editTextBoldCursor, boolean z) {
        setFocusable(true);
        editTextBoldCursor.requestFocus();
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.showKeyboard(EditTextBoldCursor.this);
                }
            });
        }
    }

    public void applyAttachButtonColors(View view) {
        if (view instanceof AttachButton) {
            AttachButton attachButton = (AttachButton) view;
            attachButton.textView.setTextColor(ColorUtils.blendARGB(getThemedColor("dialogTextGray2"), getThemedColor(attachButton.textKey), attachButton.checkedState));
        } else if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            attachBotButton.nameTextView.setTextColor(ColorUtils.blendARGB(getThemedColor("dialogTextGray2"), attachBotButton.textColor, attachBotButton.checkedState));
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions;
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                if (!(attachAlertLayoutArr[i] == null || (themeDescriptions = attachAlertLayoutArr[i].getThemeDescriptions()) == null)) {
                    arrayList.addAll(themeDescriptions);
                }
                i++;
            } else {
                arrayList.add(new ThemeDescription(this.container, 0, null, null, null, null, "dialogBackgroundGray"));
                return arrayList;
            }
        }
    }

    public void checkColors() {
        RecyclerListView recyclerListView = this.buttonsRecyclerView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                applyAttachButtonColors(this.buttonsRecyclerView.getChildAt(i2));
            }
            this.selectedTextView.setTextColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItems") : getThemedColor("dialogTextBlack"));
            this.mediaPreviewTextView.setTextColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItems") : getThemedColor("dialogTextBlack"));
            this.doneItem.getTextView().setTextColor(getThemedColor("windowBackgroundWhiteBlueHeader"));
            this.selectedMenuItem.setIconColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItems") : getThemedColor("dialogTextBlack"));
            Theme.setDrawableColor(this.selectedMenuItem.getBackground(), this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItemsSelector") : getThemedColor("dialogButtonSelector"));
            this.selectedMenuItem.setPopupItemsColor(getThemedColor("actionBarDefaultSubmenuItem"), false);
            this.selectedMenuItem.setPopupItemsColor(getThemedColor("actionBarDefaultSubmenuItem"), true);
            this.selectedMenuItem.redrawPopup(getThemedColor("actionBarDefaultSubmenuBackground"));
            this.searchItem.setIconColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItems") : getThemedColor("dialogTextBlack"));
            Theme.setDrawableColor(this.searchItem.getBackground(), this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItemsSelector") : getThemedColor("dialogButtonSelector"));
            this.commentTextView.updateColors();
            if (this.sendPopupLayout != null) {
                int i3 = 0;
                while (true) {
                    ActionBarMenuSubItem[] actionBarMenuSubItemArr = this.itemCells;
                    if (i3 >= actionBarMenuSubItemArr.length) {
                        break;
                    }
                    if (actionBarMenuSubItemArr[i3] != null) {
                        actionBarMenuSubItemArr[i3].setColors(getThemedColor("actionBarDefaultSubmenuItem"), getThemedColor("actionBarDefaultSubmenuItemIcon"));
                        this.itemCells[i3].setSelectorColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItemsSelector") : getThemedColor("dialogButtonSelector"));
                    }
                    i3++;
                }
                this.sendPopupLayout.setBackgroundColor(getThemedColor("actionBarDefaultSubmenuBackground"));
                ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    this.sendPopupLayout.invalidate();
                }
            }
            String str = "dialogFloatingButton";
            Theme.setSelectorDrawableColor(this.writeButtonDrawable, getThemedColor(str), false);
            Drawable drawable = this.writeButtonDrawable;
            if (Build.VERSION.SDK_INT >= 21) {
                str = "dialogFloatingButtonPressed";
            }
            Theme.setSelectorDrawableColor(drawable, getThemedColor(str), true);
            this.writeButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingIcon"), PorterDuff.Mode.MULTIPLY));
            this.actionBarShadow.setBackgroundColor(getThemedColor("dialogShadowLine"));
            this.buttonsRecyclerView.setGlowColor(getThemedColor("dialogScrollGlow"));
            String str2 = "voipgroup_listViewBackground";
            this.buttonsRecyclerView.setBackgroundColor(getThemedColor(this.forceDarkTheme ? str2 : "dialogBackground"));
            this.frameLayout2.setBackgroundColor(getThemedColor(this.forceDarkTheme ? str2 : "dialogBackground"));
            this.selectedCountView.invalidate();
            this.actionBar.setBackgroundColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBar") : getThemedColor("dialogBackground"));
            this.actionBar.setItemsColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItems") : getThemedColor("dialogTextBlack"), false);
            this.actionBar.setItemsBackgroundColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItemsSelector") : getThemedColor("dialogButtonSelector"), false);
            this.actionBar.setTitleColor(this.forceDarkTheme ? getThemedColor("voipgroup_actionBarItems") : getThemedColor("dialogTextBlack"));
            Drawable drawable2 = this.shadowDrawable;
            if (!this.forceDarkTheme) {
                str2 = "dialogBackground";
            }
            Theme.setDrawableColor(drawable2, getThemedColor(str2));
            this.containerView.invalidate();
            while (true) {
                AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                if (i < attachAlertLayoutArr.length) {
                    if (attachAlertLayoutArr[i] != null) {
                        attachAlertLayoutArr[i].checkColors();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    protected boolean onCustomMeasure(View view, int i, int i2) {
        return this.photoLayout.onCustomMeasure(view, i, i2);
    }

    @Override
    protected boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return this.photoLayout.onCustomLayout(view, i, i2, i3, i4);
    }

    public void onPause() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                if (attachAlertLayoutArr[i] != null) {
                    attachAlertLayoutArr[i].onPause();
                }
                i++;
            } else {
                this.paused = true;
                return;
            }
        }
    }

    public void onResume() {
        int i = 0;
        this.paused = false;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            if (attachAlertLayoutArr[i] != null) {
                attachAlertLayoutArr[i].onResume();
            }
            i++;
        }
        if (isShowing()) {
            this.delegate.needEnterComment();
        }
    }

    public void onActivityResultFragment(int i, Intent intent, String str) {
        this.photoLayout.onActivityResultFragment(i, intent, str);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ButtonsAdapter buttonsAdapter;
        if ((i == NotificationCenter.reloadInlineHints || i == NotificationCenter.attachMenuBotsDidLoad) && (buttonsAdapter = this.buttonsAdapter) != null) {
            buttonsAdapter.notifyDataSetChanged();
        }
    }

    public int getScrollOffsetY(int i) {
        AttachAlertLayout attachAlertLayout = this.nextAttachLayout;
        if (attachAlertLayout == null || (!(this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) && !(attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview))) {
            return this.scrollOffsetY[i];
        }
        int[] iArr = this.scrollOffsetY;
        return AndroidUtilities.lerp(iArr[0], iArr[1], this.translationProgress);
    }

    public void updateSelectedPosition(int i) {
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        AttachAlertLayout attachAlertLayout = i == 0 ? this.currentAttachLayout : this.nextAttachLayout;
        int scrollOffsetY = getScrollOffsetY(i);
        int i6 = scrollOffsetY - this.backgroundPaddingTop;
        if (attachAlertLayout == this.pollLayout) {
            i3 = i6 - AndroidUtilities.dp(13.0f);
            i2 = AndroidUtilities.dp(11.0f);
        } else {
            i3 = i6 - AndroidUtilities.dp(39.0f);
            i2 = AndroidUtilities.dp(43.0f);
        }
        float f2 = i2;
        if (this.backgroundPaddingTop + i3 < ActionBar.getCurrentActionBarHeight()) {
            f = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - i3) - this.backgroundPaddingTop) / f2);
            this.cornerRadius = 1.0f - f;
        } else {
            this.cornerRadius = 1.0f;
            f = 0.0f;
        }
        if (AndroidUtilities.isTablet()) {
            i4 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i4 = point.x > point.y ? 6 : 12;
        }
        float dp = this.actionBar.getAlpha() != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - this.headerView.getAlpha()) * 26.0f);
        if (!this.menuShowed || this.avatarPicker != 0) {
            this.selectedMenuItem.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i4 + 37)) + this.currentPanTranslationY);
        } else {
            this.selectedMenuItem.setTranslationY((scrollOffsetY - AndroidUtilities.dp((i4 * f) + 37.0f)) + dp + this.currentPanTranslationY);
        }
        this.searchItem.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i4 + 37)) + this.currentPanTranslationY);
        FrameLayout frameLayout = this.headerView;
        float dp2 = (scrollOffsetY - AndroidUtilities.dp((i4 * f) + 25.0f)) + dp + this.currentPanTranslationY;
        this.baseSelectedTextViewTranslationY = dp2;
        frameLayout.setTranslationY(dp2);
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (chatAttachAlertPollLayout != null && attachAlertLayout == chatAttachAlertPollLayout) {
            if (AndroidUtilities.isTablet()) {
                i5 = 63;
            } else {
                Point point2 = AndroidUtilities.displaySize;
                i5 = point2.x > point2.y ? 53 : 59;
            }
            this.doneItem.setTranslationY(Math.max(0.0f, (this.pollLayout.getTranslationY() + scrollOffsetY) - AndroidUtilities.dp((i5 * f) + 7.0f)) + this.currentPanTranslationY);
        }
    }

    private void updateActionBarVisibility(final boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.updateActionBarVisibility(boolean, boolean):void");
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void updateLayout(org.telegram.ui.Components.ChatAttachAlert.AttachAlertLayout r7, boolean r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.updateLayout(org.telegram.ui.Components.ChatAttachAlert$AttachAlertLayout, boolean, int):void");
    }

    public void updateCountButton(int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlert.updateCountButton(int):void");
    }

    public void setDelegate(ChatAttachViewDelegate chatAttachViewDelegate) {
        this.delegate = chatAttachViewDelegate;
    }

    public void init() {
        AttachAlertLayout attachAlertLayout;
        if (this.baseFragment != null) {
            this.botButtonWasVisible = false;
            this.botButtonProgressWasVisible = false;
            this.botMainButtonOffsetY = 0.0f;
            this.botMainButtonTextView.setVisibility(8);
            this.botProgressView.setAlpha(0.0f);
            this.botProgressView.setScaleX(0.1f);
            this.botProgressView.setScaleY(0.1f);
            this.botProgressView.setVisibility(8);
            this.buttonsRecyclerView.setAlpha(1.0f);
            this.buttonsRecyclerView.setTranslationY(0.0f);
            for (int i = 0; i < this.botAttachLayouts.size(); i++) {
                this.botAttachLayouts.valueAt(i).setMeasureOffsetY(0);
            }
            BaseFragment baseFragment = this.baseFragment;
            int i2 = 4;
            if (!(baseFragment instanceof ChatActivity) || this.avatarPicker == 2) {
                this.commentTextView.setVisibility(4);
            } else {
                TLRPC$Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
                TLRPC$User currentUser = ((ChatActivity) this.baseFragment).getCurrentUser();
                if (currentChat != null) {
                    this.mediaEnabled = ChatObject.canSendMedia(currentChat);
                    this.pollsEnabled = ChatObject.canSendPolls(currentChat);
                } else {
                    this.pollsEnabled = currentUser != null && currentUser.bot;
                }
            }
            this.photoLayout.onInit(this.mediaEnabled);
            this.commentTextView.hidePopup(true);
            this.enterCommentEventSent = false;
            setFocusable(false);
            if (this.isSoundPicker) {
                openDocumentsLayout(false);
                attachAlertLayout = this.documentLayout;
                this.selectedId = 4L;
            } else {
                MessageObject messageObject = this.editingMessageObject;
                if (messageObject == null || (!messageObject.isMusic() && (!this.editingMessageObject.isDocument() || this.editingMessageObject.isGif()))) {
                    attachAlertLayout = this.photoLayout;
                    this.typeButtonsAvailable = this.avatarPicker == 0;
                    this.selectedId = 1L;
                } else {
                    if (this.editingMessageObject.isMusic()) {
                        openAudioLayout(false);
                        attachAlertLayout = this.audioLayout;
                        this.selectedId = 3L;
                    } else {
                        openDocumentsLayout(false);
                        attachAlertLayout = this.documentLayout;
                        this.selectedId = 4L;
                    }
                    this.typeButtonsAvailable = !this.editingMessageObject.hasValidGroupId();
                }
            }
            this.buttonsRecyclerView.setVisibility(this.typeButtonsAvailable ? 0 : 8);
            this.shadow.setVisibility(this.typeButtonsAvailable ? 0 : 4);
            if (this.currentAttachLayout != attachAlertLayout) {
                if (this.actionBar.isSearchFieldVisible()) {
                    this.actionBar.closeSearchField();
                }
                this.containerView.removeView(this.currentAttachLayout);
                this.currentAttachLayout.onHide();
                this.currentAttachLayout.setVisibility(8);
                this.currentAttachLayout.onHidden();
                this.currentAttachLayout = attachAlertLayout;
                setAllowNestedScroll(true);
                if (this.currentAttachLayout.getParent() == null) {
                    this.containerView.addView(this.currentAttachLayout, 0, LayoutHelper.createFrame(-1, -1.0f));
                }
                attachAlertLayout.setAlpha(1.0f);
                attachAlertLayout.setVisibility(0);
                attachAlertLayout.onShow(null);
                attachAlertLayout.onShown();
                ActionBar actionBar = this.actionBar;
                if (attachAlertLayout.needsActionBar() != 0) {
                    i2 = 0;
                }
                actionBar.setVisibility(i2);
                this.actionBarShadow.setVisibility(this.actionBar.getVisibility());
            }
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout2 != chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            updateCountButton(0);
            this.buttonsAdapter.notifyDataSetChanged();
            this.commentTextView.setText("");
            this.buttonsLayoutManager.scrollToPositionWithOffset(0, MediaController.VIDEO_BITRATE_480);
        }
    }

    public void onDestroy() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            if (attachAlertLayoutArr[i] != null) {
                attachAlertLayoutArr[i].onDestroy();
            }
            i++;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        this.baseFragment = null;
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void onOpenAnimationEnd() {
        MediaController.AlbumEntry albumEntry;
        if (this.baseFragment instanceof ChatActivity) {
            albumEntry = MediaController.allMediaAlbumEntry;
        } else {
            albumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (Build.VERSION.SDK_INT <= 19 && albumEntry == null) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
        this.currentAttachLayout.onOpenAnimationEnd();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.openTransitionFinished = true;
    }

    @Override
    public void setAllowDrawContent(boolean z) {
        super.setAllowDrawContent(z);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
    }

    public void setAvatarPicker(int i, boolean z) {
        this.avatarPicker = i;
        this.avatarSearch = z;
        if (i != 0) {
            this.typeButtonsAvailable = false;
            if (this.currentAttachLayout == null) {
                this.buttonsRecyclerView.setVisibility(8);
                this.shadow.setVisibility(8);
            }
            if (this.avatarPicker == 2) {
                this.selectedTextView.setText(LocaleController.getString("ChoosePhotoOrVideo", R.string.ChoosePhotoOrVideo));
            } else {
                this.selectedTextView.setText(LocaleController.getString("ChoosePhoto", R.string.ChoosePhoto));
            }
        } else {
            this.typeButtonsAvailable = true;
        }
    }

    public void setSoundPicker() {
        this.isSoundPicker = true;
        this.buttonsRecyclerView.setVisibility(8);
        this.shadow.setVisibility(8);
        this.selectedTextView.setText(LocaleController.getString("ChoosePhotoOrVideo", R.string.ChoosePhotoOrVideo));
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        if (this.editingMessageObject == null) {
            this.maxSelectedPhotos = i;
            this.allowOrder = z;
        }
    }

    public void setOpenWithFrontFaceCamera(boolean z) {
        this.openWithFrontFaceCamera = z;
    }

    public ChatAttachAlertPhotoLayout getPhotoLayout() {
        return this.photoLayout;
    }

    public class ButtonsAdapter extends RecyclerListView.SelectionAdapter {
        private int attachBotsEndRow;
        private int attachBotsStartRow;
        private int buttonsCount;
        private int contactButton;
        private int documentButton;
        private int galleryButton;
        private int locationButton;
        private Context mContext;
        private int musicButton;
        private int pollButton;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public ButtonsAdapter(Context context) {
            ChatAttachAlert.this = r1;
            this.mContext = context;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                view = new AttachBotButton(this.mContext);
            } else {
                view = new AttachButton(this.mContext);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                AttachButton attachButton = (AttachButton) viewHolder.itemView;
                if (i == this.galleryButton) {
                    attachButton.setTextAndIcon(1, LocaleController.getString("ChatGallery", R.string.ChatGallery), Theme.chat_attachButtonDrawables[0], "chat_attachGalleryBackground", "chat_attachGalleryText");
                    attachButton.setTag(1);
                } else if (i == this.documentButton) {
                    attachButton.setTextAndIcon(4, LocaleController.getString("ChatDocument", R.string.ChatDocument), Theme.chat_attachButtonDrawables[2], "chat_attachFileBackground", "chat_attachFileText");
                    attachButton.setTag(4);
                } else if (i == this.locationButton) {
                    attachButton.setTextAndIcon(6, LocaleController.getString("ChatLocation", R.string.ChatLocation), Theme.chat_attachButtonDrawables[4], "chat_attachLocationBackground", "chat_attachLocationText");
                    attachButton.setTag(6);
                } else if (i == this.musicButton) {
                    attachButton.setTextAndIcon(3, LocaleController.getString("AttachMusic", R.string.AttachMusic), Theme.chat_attachButtonDrawables[1], "chat_attachAudioBackground", "chat_attachAudioText");
                    attachButton.setTag(3);
                } else if (i == this.pollButton) {
                    attachButton.setTextAndIcon(9, LocaleController.getString("Poll", R.string.Poll), Theme.chat_attachButtonDrawables[5], "chat_attachPollBackground", "chat_attachPollText");
                    attachButton.setTag(9);
                } else if (i == this.contactButton) {
                    attachButton.setTextAndIcon(5, LocaleController.getString("AttachContact", R.string.AttachContact), Theme.chat_attachButtonDrawables[3], "chat_attachContactBackground", "chat_attachContactText");
                    attachButton.setTag(5);
                }
            } else if (itemViewType == 1) {
                AttachBotButton attachBotButton = (AttachBotButton) viewHolder.itemView;
                int i2 = this.attachBotsStartRow;
                if (i < i2 || i >= this.attachBotsEndRow) {
                    int i3 = i - this.buttonsCount;
                    attachBotButton.setTag(Integer.valueOf(i3));
                    attachBotButton.setUser(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).inlineBots.get(i3).peer.user_id)));
                    return;
                }
                int i4 = i - i2;
                attachBotButton.setTag(Integer.valueOf(i4));
                TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).getAttachMenuBots().bots.get(i4);
                attachBotButton.setAttachBot(MessagesController.getInstance(ChatAttachAlert.this.currentAccount).getUser(Long.valueOf(tLRPC$TL_attachMenuBot.bot_id)), tLRPC$TL_attachMenuBot);
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            ChatAttachAlert.this.applyAttachButtonColors(viewHolder.itemView);
        }

        @Override
        public int getItemCount() {
            int i = this.buttonsCount;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            return (chatAttachAlert.editingMessageObject != null || !(chatAttachAlert.baseFragment instanceof ChatActivity)) ? i : i + MediaDataController.getInstance(chatAttachAlert.currentAccount).inlineBots.size();
        }

        @Override
        public void notifyDataSetChanged() {
            this.buttonsCount = 0;
            this.galleryButton = -1;
            this.documentButton = -1;
            this.musicButton = -1;
            this.pollButton = -1;
            this.contactButton = -1;
            this.locationButton = -1;
            this.attachBotsStartRow = -1;
            this.attachBotsEndRow = -1;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!(chatAttachAlert.baseFragment instanceof ChatActivity)) {
                int i = 0 + 1;
                this.buttonsCount = i;
                this.galleryButton = 0;
                this.buttonsCount = i + 1;
                this.documentButton = i;
            } else {
                MessageObject messageObject = chatAttachAlert.editingMessageObject;
                if (messageObject == null) {
                    if (chatAttachAlert.mediaEnabled) {
                        int i2 = this.buttonsCount;
                        this.buttonsCount = i2 + 1;
                        this.galleryButton = i2;
                        BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
                        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getCurrentUser() != null && !((ChatActivity) ChatAttachAlert.this.baseFragment).isInScheduleMode() && !((ChatActivity) ChatAttachAlert.this.baseFragment).isSecretChat()) {
                            int i3 = this.buttonsCount;
                            this.attachBotsStartRow = i3;
                            int size = i3 + MediaDataController.getInstance(ChatAttachAlert.this.currentAccount).getAttachMenuBots().bots.size();
                            this.buttonsCount = size;
                            this.attachBotsEndRow = size;
                        }
                        int i4 = this.buttonsCount;
                        this.buttonsCount = i4 + 1;
                        this.documentButton = i4;
                    }
                    int i5 = this.buttonsCount;
                    this.buttonsCount = i5 + 1;
                    this.locationButton = i5;
                    if (ChatAttachAlert.this.pollsEnabled) {
                        int i6 = this.buttonsCount;
                        this.buttonsCount = i6 + 1;
                        this.pollButton = i6;
                    } else {
                        int i7 = this.buttonsCount;
                        this.buttonsCount = i7 + 1;
                        this.contactButton = i7;
                    }
                    if (ChatAttachAlert.this.mediaEnabled) {
                        int i8 = this.buttonsCount;
                        this.buttonsCount = i8 + 1;
                        this.musicButton = i8;
                    }
                    BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                    TLRPC$User currentUser = baseFragment2 instanceof ChatActivity ? ((ChatActivity) baseFragment2).getCurrentUser() : null;
                    if (currentUser != null && currentUser.bot) {
                        int i9 = this.buttonsCount;
                        this.buttonsCount = i9 + 1;
                        this.contactButton = i9;
                    }
                } else if ((!messageObject.isMusic() && !ChatAttachAlert.this.editingMessageObject.isDocument()) || !ChatAttachAlert.this.editingMessageObject.hasValidGroupId()) {
                    int i10 = this.buttonsCount;
                    int i11 = i10 + 1;
                    this.buttonsCount = i11;
                    this.galleryButton = i10;
                    int i12 = i11 + 1;
                    this.buttonsCount = i12;
                    this.documentButton = i11;
                    this.buttonsCount = i12 + 1;
                    this.musicButton = i12;
                } else if (ChatAttachAlert.this.editingMessageObject.isMusic()) {
                    int i13 = this.buttonsCount;
                    this.buttonsCount = i13 + 1;
                    this.musicButton = i13;
                } else {
                    int i14 = this.buttonsCount;
                    this.buttonsCount = i14 + 1;
                    this.documentButton = i14;
                }
            }
            super.notifyDataSetChanged();
        }

        @Override
        public int getItemViewType(int i) {
            if (i < this.buttonsCount) {
                return (i < this.attachBotsStartRow || i >= this.attachBotsEndRow) ? 0 : 1;
            }
            return 1;
        }
    }

    @Override
    public void dismissInternal() {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.doOnIdle(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlert.this.removeFromRoot();
                }
            });
        } else {
            removeFromRoot();
        }
    }

    public void removeFromRoot() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        if (this.actionBar.isSearchFieldVisible()) {
            this.actionBar.closeSearchField();
        }
        this.contactsLayout = null;
        this.audioLayout = null;
        this.pollLayout = null;
        this.locationLayout = null;
        this.documentLayout = null;
        int i = 1;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i < attachAlertLayoutArr.length) {
                if (attachAlertLayoutArr[i] != null) {
                    attachAlertLayoutArr[i].onDestroy();
                    this.containerView.removeView(this.layouts[i]);
                    this.layouts[i] = null;
                }
                i++;
            } else {
                updateActionBarVisibility(false, false);
                super.dismissInternal();
                return;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (this.actionBar.isSearchFieldVisible()) {
            this.actionBar.closeSearchField();
        } else if (!this.currentAttachLayout.onBackPressed()) {
            EditTextEmoji editTextEmoji = this.commentTextView;
            if (editTextEmoji == null || !editTextEmoji.isPopupShowing()) {
                super.onBackPressed();
            } else {
                this.commentTextView.hidePopup(true);
            }
        }
    }

    @Override
    public void dismissWithButtonClick(int i) {
        super.dismissWithButtonClick(i);
        this.currentAttachLayout.onDismissWithButtonClick(i);
    }

    @Override
    protected boolean canDismissWithTouchOutside() {
        return this.currentAttachLayout.canDismissWithTouchOutside();
    }

    public void dismiss(boolean z) {
        if (z) {
            this.allowPassConfirmationAlert = z;
        }
        dismiss();
    }

    @Override
    public void dismiss() {
        if (!this.currentAttachLayout.onDismiss()) {
            EditTextEmoji editTextEmoji = this.commentTextView;
            if (editTextEmoji != null) {
                AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
            }
            this.botAttachLayouts.clear();
            if (this.allowPassConfirmationAlert || this.baseFragment == null || this.currentAttachLayout.getSelectedItemsCount() <= 0) {
                int i = 0;
                while (true) {
                    AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
                    if (i < attachAlertLayoutArr.length) {
                        if (!(attachAlertLayoutArr[i] == null || this.currentAttachLayout == attachAlertLayoutArr[i])) {
                            attachAlertLayoutArr[i].onDismiss();
                        }
                        i++;
                    } else {
                        AndroidUtilities.setNavigationBarColor(getWindow(), ColorUtils.setAlphaComponent(this.navBarColor, 0), true, new AndroidUtilities.IntColorCallback() {
                            @Override
                            public final void run(int i2) {
                                ChatAttachAlert.this.lambda$dismiss$33(i2);
                            }
                        });
                        super.dismiss();
                        this.allowPassConfirmationAlert = false;
                        return;
                    }
                }
            } else if (!this.confirmationAlertShown) {
                this.confirmationAlertShown = true;
                AlertDialog create = new AlertDialog.Builder(this.baseFragment.getParentActivity(), this.parentThemeDelegate).setTitle(LocaleController.getString("DiscardSelectionAlertTitle", R.string.DiscardSelectionAlertTitle)).setMessage(LocaleController.getString("DiscardSelectionAlertMessage", R.string.DiscardSelectionAlertMessage)).setPositiveButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ChatAttachAlert.this.lambda$dismiss$30(dialogInterface, i2);
                    }
                }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        ChatAttachAlert.this.lambda$dismiss$31(dialogInterface);
                    }
                }).setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ChatAttachAlert.this.lambda$dismiss$32(dialogInterface);
                    }
                }).create();
                create.show();
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(getThemedColor("dialogTextRed2"));
                }
            }
        }
    }

    public void lambda$dismiss$30(DialogInterface dialogInterface, int i) {
        this.allowPassConfirmationAlert = true;
        dismiss();
    }

    public void lambda$dismiss$31(DialogInterface dialogInterface) {
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.getSpring().setDampingRatio(1.5f);
        this.appearSpringAnimation.getSpring().setStiffness(1500.0f);
        this.appearSpringAnimation.start();
    }

    public void lambda$dismiss$32(DialogInterface dialogInterface) {
        this.confirmationAlertShown = false;
    }

    public void lambda$dismiss$33(int i) {
        this.navBarColorKey = null;
        this.navBarColor = i;
        this.containerView.invalidate();
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.currentAttachLayout.onSheetKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    public BaseFragment getBaseFragment() {
        return this.baseFragment;
    }

    public EditTextEmoji getCommentTextView() {
        return this.commentTextView;
    }

    public ChatAttachAlertDocumentLayout getDocumentLayout() {
        return this.documentLayout;
    }
}
