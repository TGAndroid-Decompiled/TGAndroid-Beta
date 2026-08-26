package org.telegram.ui.Stories.recorder;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.Property;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EditTextSuggestionsFix;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.iv.RichEditor;

public abstract class CaptionContainerView extends FrameLayout {
    public ImageView applyButton;
    private Drawable applyButtonCheck;
    private CombinedDrawable applyButtonDrawable;
    protected final BlurringShader.StoryBlurDrawer backgroundBlur;
    private BlurredBackgroundDrawable backgroundForCaptionField;
    protected final Paint backgroundPaint;
    int beforeScrollY;
    private Bitmap blurBitmap;
    private Matrix blurBitmapMatrix;
    private BitmapShader blurBitmapShader;
    private final BlurringShader.BlurManager blurManager;
    private Paint blurPaint;
    private final ButtonBounce bounce;
    public final RectF bounds;
    protected final BlurringShader.StoryBlurDrawer captionBlur;
    private final RectF clickBounds;
    private final Path clipPath;
    private int codePointCount;
    private RadialGradient collapseGradient;
    private Matrix collapseGradientMatrix;
    private RadialGradient collapseOutGradient;
    private Paint collapseOutPaint;
    private Paint collapsePaint;
    public boolean collapsed;
    public int collapsedFromX;
    public final AnimatedFloat collapsedT;
    private final FrameLayout containerView;
    protected int currentAccount;
    private long dialogId;
    public final EditTextEmoji editText;
    protected BlurredBackgroundDrawableViewFactory factoryForMentions;
    private final LinearGradient fadeGradient;
    private final Paint fadePaint;
    private Utilities.CallbackVoidReturn<Bitmap> getUiBlurBitmap;
    int goingToScrollY;
    private boolean hasReply;
    private final AnimatedFloat heightAnimated;
    private Bitmap hintTextBitmap;
    private final Paint hintTextBitmapPaint;
    private final TextPaint hintTextPaint;
    private boolean ignoreDraw;
    private boolean ignoreTextChange;
    public boolean ignoreTouches;
    private ValueAnimator keyboardAnimator;
    public final KeyboardNotifier keyboardNotifier;
    public boolean keyboardShown;
    public float keyboardT;
    private int lastHeight;
    private float lastHeightTranslation;
    public FrameLayout limitTextContainer;
    public AnimatedTextView limitTextView;
    private final Matrix matrix;
    private BlurringShader.StoryBlurDrawer mentionBackgroundBlur;
    public MentionsContainerView mentionContainer;
    private Utilities.Callback<Integer> onHeightUpdate;
    private Utilities.Callback<Boolean> onKeyboardOpen;
    ObjectAnimator parentKeyboardAnimator;
    private final RectF rectF;
    protected final BlurringShader.StoryBlurDrawer replyBackgroundBlur;
    private Path replyClipPath;
    private Paint replyLinePaint;
    private Path replyLinePath;
    private float[] replyLinePathRadii;
    private Text replyText;
    protected final BlurringShader.StoryBlurDrawer replyTextBlur;
    private Text replyTitle;
    protected Theme.ResourcesProvider resourcesProvider;
    private final FrameLayout rootView;
    private ObjectAnimator scrollAnimator;
    private int shiftDp;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    protected final StrokeDrawable strokeDrawable;
    protected final StrokeDrawable strokeDrawableEmoji;
    private final Runnable textChangeRunnable;
    public boolean toKeyboardShow;
    private Runnable updateShowKeyboard;
    boolean waitingForScrollYChange;

    public final class AnonymousClass1 extends BlurredBackgroundColorProviderThemed {
        @Override
        public final boolean isDark() {
            return true;
        }
    }

    public final class AnonymousClass2 extends BlurredBackgroundColorProviderThemed {
        @Override
        public final boolean isDark() {
            return true;
        }
    }

    public final class AnonymousClass3 extends EditTextEmoji {
        public BlurringShader.StoryBlurDrawer blurDrawer;
        public BlurredBackgroundDrawable blurredBackgroundDrawable;
        public final BlurringShader.BlurManager val$blurManager;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass3(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, int i, DarkThemeResourceProvider darkThemeResourceProvider, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
            super(context, sizeNotifierFrameLayout, null, i, true, darkThemeResourceProvider);
            this.val$resourcesProvider = resourcesProvider;
            this.val$blurManager = blurManager;
        }

        @Override
        public final boolean allowSearch() {
            return true;
        }

        @Override
        public final void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                CaptionContainerView captionContainerView = CaptionContainerView.this;
                if (captionContainerView.getEditTextStyle() == 2 || captionContainerView.getEditTextStyle() == 3) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    if (captionContainerView instanceof CaptionPhotoViewer) {
                        emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                        emojiView.emojiCacheType = 3;
                    }
                    emojiView.updateColors();
                }
            }
            if (emojiView != null) {
                emojiView.customOutline = true;
                emojiView.setClipToOutline(true);
                emojiView.setOutlineProvider(new RichEditor.AnonymousClass5(9));
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            if ((captionContainerView instanceof CaptionStory) && ((CaptionStory) captionContainerView).recording) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void drawEmojiBackground(Canvas canvas, View view) {
            int radius;
            int radius2;
            WindowInsets rootWindowInsets;
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            captionContainerView.rectF.set(0.0f, 0.0f, view.getWidth(), AndroidUtilities.dp(29.0f) + view.getHeight());
            if (captionContainerView.factoryForMentions == null) {
                if (!captionContainerView.customBlur()) {
                    CaptionContainerView.access$100(captionContainerView, canvas, captionContainerView.rectF, 0.0f, 0.95f, view);
                    return;
                }
                if (this.blurDrawer == null) {
                    this.blurDrawer = new BlurringShader.StoryBlurDrawer(this.val$blurManager, view, 7);
                }
                captionContainerView.drawBlur(this.blurDrawer, canvas, captionContainerView.rectF, AndroidUtilities.dp(29.0f), false, 0.0f, -view.getY(), false, 1.0f);
                captionContainerView.strokeDrawableEmoji.radius = AndroidUtilities.dp(29.0f);
                captionContainerView.strokeDrawableEmoji.setBounds((int) captionContainerView.rectF.left, (int) captionContainerView.rectF.top, (int) captionContainerView.rectF.right, AndroidUtilities.dp(29.0f) + ((int) captionContainerView.rectF.bottom));
                captionContainerView.strokeDrawableEmoji.draw(canvas);
                return;
            }
            if (this.blurredBackgroundDrawable == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    radius = 0;
                    radius2 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    radius = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = captionContainerView.factoryForMentions.create(view, null, false);
                blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.val$resourcesProvider));
                this.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
                blurredBackgroundDrawableCreate.setRadius$1(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, radius2);
                BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
                blurredBackgroundDrawable.inAppKeyboardOptimization = true;
                blurredBackgroundDrawable.boundProps.liquidThickness = AndroidUtilities.dp(32.0f);
                blurredBackgroundDrawable.onBoundPropsChanged();
                BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.blurredBackgroundDrawable;
                blurredBackgroundDrawable2.boundProps.liquidIntensity = 0.4f;
                blurredBackgroundDrawable2.onBoundPropsChanged();
            }
            RectF rectF = captionContainerView.rectF;
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.blurredBackgroundDrawable.setBounds(rect);
            this.blurredBackgroundDrawable.draw(canvas);
        }

        @Override
        public final void onEmojiKeyboardUpdate() {
            CaptionContainerView.this.keyboardNotifier.fire();
        }

        @Override
        public final void onLineCountChanged(int i, int i2) {
            CaptionContainerView.this.onLineCountChanged(i, i2);
        }

        @Override
        public final boolean onScrollYChange(int i) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            if (captionContainerView.scrollAnimator != null && captionContainerView.scrollAnimator.isRunning() && i == captionContainerView.goingToScrollY) {
                return false;
            }
            captionContainerView.invalidate();
            if (!captionContainerView.waitingForScrollYChange) {
                return true;
            }
            captionContainerView.waitingForScrollYChange = false;
            if (captionContainerView.beforeScrollY == i) {
                return true;
            }
            if (captionContainerView.scrollAnimator != null && captionContainerView.scrollAnimator.isRunning() && i == captionContainerView.goingToScrollY) {
                return true;
            }
            if (captionContainerView.scrollAnimator != null) {
                captionContainerView.scrollAnimator.cancel();
            }
            captionContainerView.editText.getEditText().setScrollY(captionContainerView.beforeScrollY);
            EditTextCaption editText = captionContainerView.editText.getEditText();
            int i2 = captionContainerView.beforeScrollY;
            captionContainerView.goingToScrollY = i;
            captionContainerView.scrollAnimator = ObjectAnimator.ofInt(editText, "scrollY", i2, i);
            captionContainerView.scrollAnimator.setDuration(240L);
            captionContainerView.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            captionContainerView.scrollAnimator.addListener(new HintView2.AnonymousClass2(this, 1));
            captionContainerView.scrollAnimator.start();
            return false;
        }

        @Override
        public final void onWaitingForKeyboard() {
            CaptionContainerView.this.keyboardNotifier.awaitingKeyboard = true;
        }

        @Override
        public final void updatedEmojiExpanded() {
            CaptionContainerView.this.keyboardNotifier.fire();
        }
    }

    public final class AnonymousClass4 implements TextWatcher {
        public int lastLength;
        public boolean lastOverLimit;

        public AnonymousClass4() {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            String str;
            int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            captionContainerView.codePointCount = iCodePointCount;
            int captionLimit = captionContainerView.getCaptionLimit();
            if (captionContainerView.codePointCount + 25 > captionLimit) {
                str = "" + (captionLimit - captionContainerView.codePointCount);
            } else {
                str = null;
            }
            captionContainerView.limitTextView.cancelAnimation();
            captionContainerView.limitTextView.setText(str);
            captionContainerView.limitTextView.setTextColor(captionContainerView.codePointCount >= captionLimit ? -1280137 : -1);
            if (captionContainerView.codePointCount > captionLimit && !UserConfig.getInstance(captionContainerView.currentAccount).isPremium() && captionContainerView.codePointCount < captionContainerView.getCaptionPremiumLimit() && captionContainerView.codePointCount > this.lastLength && (captionContainerView.captionLimitToast() || MessagesController.getInstance(captionContainerView.currentAccount).premiumFeaturesBlocked())) {
                AndroidUtilities.shakeViewSpring(captionContainerView.limitTextView, captionContainerView.shiftDp = -captionContainerView.shiftDp);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.lastLength = captionContainerView.codePointCount;
            boolean z = captionContainerView.codePointCount > captionLimit;
            if (z != this.lastOverLimit) {
                captionContainerView.onCaptionLimitUpdate(z);
            }
            this.lastOverLimit = z;
            if (!captionContainerView.ignoreTextChange) {
                AndroidUtilities.cancelRunOnUIThread(captionContainerView.textChangeRunnable);
                AndroidUtilities.runOnUIThread(captionContainerView.textChangeRunnable, 1500L);
            }
            captionContainerView.ignoreTextChange = false;
            AndroidUtilities.runOnUIThread(new PreviewView$$ExternalSyntheticLambda12(this, 1));
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            if (captionContainerView.scrollAnimator == null || !captionContainerView.scrollAnimator.isRunning()) {
                captionContainerView.beforeScrollY = captionContainerView.editText.getEditText().getScrollY();
                captionContainerView.waitingForScrollYChange = true;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            if (captionContainerView.editText.getEditText().suppressOnTextChanged) {
                return;
            }
            if (captionContainerView.mentionContainer == null) {
                CaptionContainerView.access$300(captionContainerView);
            }
            if (captionContainerView.mentionContainer.getAdapter() != null) {
                MentionsAdapter adapter = captionContainerView.mentionContainer.getAdapter();
                MessagesController.getInstance(captionContainerView.currentAccount).getUser(Long.valueOf(captionContainerView.dialogId));
                TLRPC.Chat chat = MessagesController.getInstance(captionContainerView.currentAccount).getChat(Long.valueOf(-captionContainerView.dialogId));
                adapter.getClass();
                adapter.chat = chat;
                captionContainerView.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, captionContainerView.editText.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }

    public final class BounceableImageView extends ImageView {
        public final ButtonBounce bounce;
        public final float scale;

        public BounceableImageView(Context context) {
            super(context);
            this.bounce = new ButtonBounce(this);
            this.scale = 0.2f;
        }

        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            float scale = this.bounce.getScale(this.scale);
            canvas.scale(scale, scale, getWidth() / 2.0f, getHeight() / 2.0f);
            super.draw(canvas);
            canvas.restore();
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            this.bounce.setPressed(z);
        }
    }

    public final class PeriodDrawable extends Drawable {
        public final Path activePath;
        public final AnonymousClass2 activeTextDrawable;
        public boolean clear;
        public float cx;
        public float cy;
        public final int dashes;
        public float diameterDp;
        public final Paint fillPaint;
        public final AnimatedFloat fillT;
        public boolean filled;
        public int strokeColor;
        public final Paint strokePaint;
        public final AnonymousClass1 textDrawable;
        public float textOffsetX;
        public float textOffsetY;

        public PeriodDrawable(int i) {
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            Paint paint2 = new Paint(1);
            this.fillPaint = paint2;
            ?? r3 = new AnimatedTextView.AnimatedTextDrawable() {
                @Override
                public final void invalidateSelf() {
                    PeriodDrawable.this.invalidateSelf();
                }
            };
            this.textDrawable = r3;
            ?? r1 = new AnimatedTextView.AnimatedTextDrawable() {
                @Override
                public final void invalidateSelf() {
                    PeriodDrawable.this.invalidateSelf();
                }
            };
            this.activeTextDrawable = r1;
            this.filled = false;
            PreviewView$$ExternalSyntheticLambda12 previewView$$ExternalSyntheticLambda12 = new PreviewView$$ExternalSyntheticLambda12(this, 2);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.fillT = new AnimatedFloat(previewView$$ExternalSyntheticLambda12, 0L, 350L, cubicBezierInterpolator);
            this.activePath = new Path();
            this.diameterDp = 21.0f;
            this.dashes = i;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            r3.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
            r3.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            r3.setTextSize(AndroidUtilities.dpf2(12.0f));
            r3.setGravity(17);
            r1.setAnimationProperties(0.3f, 0L, 250L, cubicBezierInterpolator);
            r1.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            r1.setTextSize(AndroidUtilities.dpf2(12.0f));
            r1.setGravity(17);
            this.strokeColor = -1;
            paint.setColor(-1);
            r3.setTextColor(-1);
            r1.setTextColor(-1);
            paint2.setColor(-15033089);
        }

        @Override
        public final void draw(Canvas canvas) {
            draw(canvas, 1.0f);
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setBounds(Rect rect) {
            super.setBounds(rect);
            this.cx = getBounds().centerX();
            this.cy = getBounds().centerY();
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void setValue(int i, boolean z, boolean z2) {
            setText(Fragment$$ExternalSyntheticOutline0.m(i, ""), z2);
            setText("" + i, z2);
            this.filled = z;
            if (!z2) {
                this.fillT.set(z, true);
            }
            invalidateSelf();
        }

        public final void draw(Canvas canvas, float f) {
            float fDpf2 = AndroidUtilities.dpf2(this.diameterDp) / 2.0f;
            float f2 = this.fillT.set(this.filled);
            if (f2 > 0.0f) {
                Paint paint = this.fillPaint;
                paint.setAlpha((int) (f * 255.0f * f2));
                canvas.drawCircle(this.cx, this.cy, AndroidUtilities.dpf2(11.33f) * f2, paint);
            }
            Paint paint2 = this.strokePaint;
            paint2.setAlpha((int) ((1.0f - f2) * Color.alpha(this.strokeColor) * f));
            RectF rectF = AndroidUtilities.rectTmp;
            float f3 = this.cx;
            float f4 = this.cy;
            rectF.set(f3 - fDpf2, f4 - fDpf2, f3 + fDpf2, f4 + fDpf2);
            canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
            int i = this.dashes;
            float f5 = ((i + 1) * 1.5f) + (i * 1.0f);
            float f6 = (1.0f / f5) * 180.0f;
            float f7 = (1.5f / f5) * 180.0f;
            float f8 = f7;
            int i2 = 0;
            while (i2 < i) {
                float f9 = f6;
                canvas.drawArc(AndroidUtilities.rectTmp, f8 + 270.0f, f9, false, paint2);
                f8 = f9 + f7 + f8;
                i2++;
                f6 = f9;
            }
            canvas.save();
            canvas.translate(this.textOffsetX + 0.0f, this.textOffsetY);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (this.cx - AndroidUtilities.dp(20.0f)), (int) (this.cy - AndroidUtilities.dp(20.0f)), (int) (this.cx + AndroidUtilities.dp(20.0f)), (int) (this.cy + AndroidUtilities.dp(20.0f)));
            AnonymousClass1 anonymousClass1 = this.textDrawable;
            anonymousClass1.setBounds(rect);
            anonymousClass1.setAlpha((int) (Color.alpha(this.strokeColor) * f));
            anonymousClass1.draw(canvas);
            if (f2 > 0.0f) {
                Path path = this.activePath;
                path.rewind();
                path.addCircle(this.cx, this.cy + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * f2, Path.Direction.CW);
                canvas.clipPath(path);
                AnonymousClass2 anonymousClass2 = this.activeTextDrawable;
                anonymousClass2.setBounds(rect);
                anonymousClass2.setAlpha((int) (f * 255.0f));
                anonymousClass2.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.cx = getBounds().centerX();
            this.cy = getBounds().centerY();
        }
    }

    public CaptionContainerView(Context context, FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context);
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        this.strokeDrawable = strokeDrawable;
        StrokeDrawable strokeDrawable2 = new StrokeDrawable();
        this.strokeDrawableEmoji = strokeDrawable2;
        final int i = 1;
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.fadePaint = paint2;
        final int i2 = 0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.fadeGradient = linearGradient;
        this.matrix = new Matrix();
        this.hintTextPaint = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.hintTextBitmapPaint = paint3;
        this.shiftDp = -4;
        this.currentAccount = UserConfig.selectedAccount;
        this.textChangeRunnable = new Runnable(this) {
            public final CaptionContainerView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$1();
                        break;
                    default:
                        this.f$0.lambda$new$2();
                        break;
                }
            }
        };
        this.bounce = new ButtonBounce(this, 1.0f, 3.0f);
        this.updateShowKeyboard = new Runnable(this) {
            public final CaptionContainerView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$1();
                        break;
                    default:
                        this.f$0.lambda$new$2();
                        break;
                }
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.heightAnimated = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        this.ignoreDraw = false;
        this.rectF = new RectF();
        this.bounds = new RectF();
        this.clickBounds = new RectF();
        this.clipPath = new Path();
        this.collapsedT = new AnimatedFloat(this, 500L, cubicBezierInterpolator);
        this.resourcesProvider = resourcesProvider;
        this.rootView = frameLayout;
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = frameLayout2;
        this.blurManager = blurManager;
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0, !customBlur());
        this.replyBackgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 8);
        this.replyTextBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 9);
        strokeDrawable.nonRound = true;
        int i3 = Theme.key_windowBackgroundWhite;
        strokeDrawable.colorProvider = new AnonymousClass1(resourcesProvider, i3, 0.0f);
        Paint paint4 = strokeDrawable.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint paint5 = strokeDrawable.paintStrokeBottom;
        paint5.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = strokeDrawable.colorProvider;
        if (blurredBackgroundColorProviderThemed != null) {
            strokeDrawable.strokeColorTop = Theme.multAlpha(strokeDrawable.alpha, blurredBackgroundColorProviderThemed.getStrokeColorTop());
            strokeDrawable.strokeColorBottom = Theme.multAlpha(strokeDrawable.alpha, strokeDrawable.colorProvider.getStrokeColorBottom());
            paint4.setColor(strokeDrawable.strokeColorTop);
            paint4.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint5.setColor(strokeDrawable.strokeColorBottom);
            paint5.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable.paintFill.setColor(0);
        strokeDrawable.invalidateSelf();
        strokeDrawable2.nonRound = true;
        strokeDrawable2.colorProvider = new AnonymousClass2(resourcesProvider, i3, 0.0f);
        Paint paint6 = strokeDrawable2.paintStrokeTop;
        paint6.setStyle(style);
        Paint paint7 = strokeDrawable2.paintStrokeBottom;
        paint7.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed2 = strokeDrawable2.colorProvider;
        if (blurredBackgroundColorProviderThemed2 != null) {
            strokeDrawable2.strokeColorTop = Theme.multAlpha(strokeDrawable2.alpha, blurredBackgroundColorProviderThemed2.getStrokeColorTop());
            strokeDrawable2.strokeColorBottom = Theme.multAlpha(strokeDrawable2.alpha, strokeDrawable2.colorProvider.getStrokeColorBottom());
            paint6.setColor(strokeDrawable2.strokeColorTop);
            paint6.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint7.setColor(strokeDrawable2.strokeColorBottom);
            paint7.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable2.paintFill.setColor(0);
        strokeDrawable2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        int i4 = 1;
        this.keyboardNotifier = new KeyboardNotifier(frameLayout, false, new HintView2$$ExternalSyntheticLambda0(this, i4));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, sizeNotifierFrameLayout, getEditTextStyle(), new DarkThemeResourceProvider(), resourcesProvider, blurManager);
        this.editText = anonymousClass3;
        anonymousClass3.glassDesignForEmojiView = true;
        anonymousClass3.getEditText().addTextChangedListener(new EditTextSuggestionsFix());
        anonymousClass3.setFocusable(true);
        anonymousClass3.setFocusableInTouchMode(true);
        anonymousClass3.getEditText().hintLayoutYFix = true;
        anonymousClass3.getEditText().drawHint = new PaintView$$ExternalSyntheticLambda4(this, i4);
        anonymousClass3.getEditText().setSupportRtlHint(true);
        this.captionBlur = new BlurringShader.StoryBlurDrawer(blurManager, anonymousClass3.getEditText(), customBlur() ? 1 : 2);
        anonymousClass3.getEditText().setHintColor(-1);
        anonymousClass3.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        anonymousClass3.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        if (isAtTop()) {
            anonymousClass3.getEditText().setGravity(48);
        }
        anonymousClass3.getEmojiButton().setAlpha(0.0f);
        anonymousClass3.getEmojiButton().setTranslationY(AndroidUtilities.dp(isAtTop() ? 1.0f : -1.0f));
        anonymousClass3.setTranslationY(AndroidUtilities.dp(isAtTop() ? 1.0f : -1.0f));
        anonymousClass3.getEditText().addTextChangedListener(new AnonymousClass4());
        anonymousClass3.getEditText().setLinkTextColor(-1);
        addView(anonymousClass3, LayoutHelper.createFrame(-1, -2.0f, (isAtTop() ? 48 : 80) | 7, 12.0f, 8.0f, additionalRightMargin() + 12, 8.0f));
        BounceableImageView bounceableImageView = new BounceableImageView(context);
        this.applyButton = bounceableImageView;
        ScaleStateListAnimator.apply(bounceableImageView, 0.05f, 1.25f);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.applyButtonCheck = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogFloatingIcon, false), PorterDuff.Mode.SRC_IN));
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(18.0f), Theme.getColor(Theme.key_chat_editMediaButton, resourcesProvider)), this.applyButtonCheck, 0, AndroidUtilities.dp(1.0f));
        this.applyButtonDrawable = combinedDrawable;
        combinedDrawable.setCustomSize(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        this.applyButton.setImageDrawable(this.applyButtonDrawable);
        this.applyButton.setScaleType(ImageView.ScaleType.CENTER);
        this.applyButton.setContentDescription(LocaleController.getString(R.string.Done));
        this.applyButton.setAlpha(0.0f);
        this.applyButton.setVisibility(8);
        this.applyButton.setOnClickListener(new PaintView$$ExternalSyntheticLambda63(this, 1));
        addView(this.applyButton, LayoutHelper.createFrame(44, 44.0f, (isAtTop() ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.limitTextView = animatedTextView;
        animatedTextView.setGravity(17);
        this.limitTextView.setTextSize(AndroidUtilities.dp(15.0f));
        this.limitTextView.setTextColor(-1);
        this.limitTextView.setAnimationProperties(0.4f, 0L, 320L, cubicBezierInterpolator);
        this.limitTextView.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.limitTextContainer = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        this.limitTextContainer.addView(this.limitTextView, LayoutHelper.createFrame(52, 16, (isAtTop() ? 48 : 80) | 5));
        addView(this.limitTextContainer, LayoutHelper.createFrame(52, 16.0f, (isAtTop() ? 48 : 80) | 5, 0.0f, isAtTop() ? 50 : 0, 0.0f, isAtTop() ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public static void access$100(CaptionContainerView captionContainerView, Canvas canvas, RectF rectF, float f, float f2, View view) {
        Bitmap bitmap;
        float x = 0.0f;
        if (captionContainerView.keyboardT > 0.0f && captionContainerView.blurPaint != null && captionContainerView.blurBitmapShader != null && (bitmap = captionContainerView.blurBitmap) != null && !bitmap.isRecycled()) {
            captionContainerView.blurBitmapMatrix.reset();
            captionContainerView.blurBitmapMatrix.postScale(captionContainerView.rootView.getWidth() / captionContainerView.blurBitmap.getWidth(), captionContainerView.rootView.getHeight() / captionContainerView.blurBitmap.getHeight());
            float y = 0.0f;
            for (int i = 0; i < 8 && view != null; i++) {
                x += view.getX();
                y += view.getY();
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            captionContainerView.blurBitmapMatrix.postTranslate(-x, -y);
            captionContainerView.blurBitmapShader.setLocalMatrix(captionContainerView.blurBitmapMatrix);
            captionContainerView.blurPaint.setAlpha((int) (captionContainerView.keyboardT * 255.0f * f2));
            canvas.drawRoundRect(rectF, f, f, captionContainerView.blurPaint);
        }
        captionContainerView.backgroundPaint.setAlpha((int) (captionContainerView.blurPaint == null ? 128.0f : f2 * AndroidUtilities.lerp(128, 153, captionContainerView.keyboardT)));
        canvas.drawRoundRect(rectF, f, f, captionContainerView.backgroundPaint);
    }

    public static void access$1000(CaptionContainerView captionContainerView, int i, int i2, CharSequence charSequence, boolean z) {
        if (captionContainerView.editText == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(captionContainerView.editText.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji(spannableStringBuilder, captionContainerView.editText.getEditText().getPaint().getFontMetricsInt(), false);
            }
            captionContainerView.editText.setText(spannableStringBuilder);
            captionContainerView.editText.setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void access$300(CaptionContainerView captionContainerView) {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(captionContainerView.getContext(), captionContainerView.dialogId, LaunchActivity.getLastFragment(), new DarkThemeResourceProvider()) {
            @Override
            public final void drawRoundRect(Canvas canvas, Rect rect, float f) {
                CaptionContainerView captionContainerView2 = CaptionContainerView.this;
                captionContainerView2.rectF.set(rect);
                if (captionContainerView2.customBlur()) {
                    CaptionContainerView captionContainerView3 = CaptionContainerView.this;
                    captionContainerView3.drawBlur(captionContainerView3.mentionBackgroundBlur, canvas, captionContainerView2.rectF, f, false, -captionContainerView2.mentionContainer.getX(), -captionContainerView2.mentionContainer.getY(), false, 1.0f);
                    return;
                }
                Paint paint = captionContainerView2.mentionBackgroundBlur.getPaint(1.0f);
                if (paint == null) {
                    captionContainerView2.backgroundPaint.setAlpha(128);
                    canvas.drawRoundRect(captionContainerView2.rectF, f, f, captionContainerView2.backgroundPaint);
                } else {
                    canvas.drawRoundRect(captionContainerView2.rectF, f, f, paint);
                    captionContainerView2.backgroundPaint.setAlpha(80);
                    canvas.drawRoundRect(captionContainerView2.rectF, f, f, captionContainerView2.backgroundPaint);
                }
            }

            @Override
            public final boolean isStories() {
                return true;
            }
        };
        captionContainerView.mentionContainer = mentionsContainerView;
        captionContainerView.mentionBackgroundBlur = new BlurringShader.StoryBlurDrawer(captionContainerView.blurManager, mentionsContainerView, 0);
        captionContainerView.mentionContainer.withDelegate(new MentionsContainerView.Delegate() {
            @Override
            public final void addEmojiToRecent(String str) {
                MentionsContainerView.Delegate.CC.$default$addEmojiToRecent(this, str);
            }

            @Override
            public final Paint.FontMetricsInt getFontMetrics() {
                return CaptionContainerView.this.editText.getEditText().getPaint().getFontMetricsInt();
            }

            @Override
            public final void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj) {
                MentionsContainerView.Delegate.CC.$default$onStickerSelected(this, tL_document, str, obj);
            }

            @Override
            public final void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
                CaptionContainerView.access$1000(CaptionContainerView.this, i, i2, charSequence, z);
            }

            @Override
            public final void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
                MentionsContainerView.Delegate.CC.$default$sendBotInlineResult(this, botInlineResult, z, i);
            }
        });
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = captionContainerView.factoryForMentions;
        if (blurredBackgroundDrawableViewFactory != null) {
            MentionsContainerView mentionsContainerView2 = captionContainerView.mentionContainer;
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(mentionsContainerView2, null, false);
            blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(captionContainerView.resourcesProvider));
            mentionsContainerView2.setBackgroundDrawable(blurredBackgroundDrawableCreate);
        }
        captionContainerView.containerView.addView(captionContainerView.mentionContainer, LayoutHelper.createFrame(-1, -1, 83));
        captionContainerView.setupMentionContainer();
    }

    public int additionalKeyboardHeight() {
        return AndroidUtilities.navigationBarHeight;
    }

    public int additionalRightMargin() {
        return 0;
    }

    public abstract void afterUpdateShownKeyboard(boolean z);

    public abstract void beforeUpdateShownKeyboard(boolean z);

    public boolean captionLimitToast() {
        return false;
    }

    public void clear() {
        this.ignoreTextChange = true;
        this.editText.setText("");
    }

    @Override
    public void clearFocus() {
        this.editText.clearFocus();
    }

    public boolean clipChild(View view) {
        return true;
    }

    public void closeKeyboard() {
        this.editText.closeKeyboard();
        this.editText.hidePopup(true);
    }

    public boolean customBlur() {
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int iMax;
        CaptionContainerView captionContainerView;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        int i3;
        float fDp;
        float fDp2;
        float f4;
        float f5;
        Paint paint;
        float f6;
        int iMin;
        Canvas canvas2 = canvas;
        if (this.ignoreDraw) {
            return;
        }
        int height = this.editText.getHeight();
        if (this.collapsed) {
            iMax = AndroidUtilities.dp(44.0f);
        } else {
            iMax = this.keyboardShown ? Math.max(AndroidUtilities.dp(44.0f), height) : Math.min(AndroidUtilities.dp(82.0f), height);
        }
        if (!this.collapsed && this.hasReply) {
            iMax += AndroidUtilities.dp(50.0f);
        }
        float f7 = iMax;
        int i4 = (int) this.heightAnimated.set(f7);
        if (i4 != this.lastHeight) {
            onEditHeightChange(i4);
            Utilities.Callback<Integer> callback = this.onHeightUpdate;
            if (callback != null) {
                callback.run(Integer.valueOf(i4));
            }
            this.lastHeight = iMax;
        }
        updateMentionsLayoutPosition();
        int iDp = AndroidUtilities.dp(7.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        if (isAtTop()) {
            if (!this.collapsed) {
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(-1.0f), AndroidUtilities.dpf2(1.0f), this.keyboardT);
                EditTextCaption editText = this.editText.getEditText();
                this.lastHeightTranslation = fLerp;
                editText.setTranslationY(fLerp);
            }
            float f8 = iDp;
            float f9 = iDp2;
            int i5 = iDp2 + i4;
            this.bounds.set(f8, f9, getWidth() - iDp, i5);
            this.clickBounds.set(f8, f9, getWidth() - iDp, AndroidUtilities.dp(24.0f) + i5);
        } else {
            float fLerp2 = (AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(-1.0f), this.keyboardT) + f7) - i4;
            if (Math.abs(this.lastHeightTranslation - fLerp2) >= 1.0f && !this.collapsed) {
                EditTextCaption editText2 = this.editText.getEditText();
                this.lastHeightTranslation = fLerp2;
                editText2.setTranslationY(fLerp2);
            }
            this.bounds.set(iDp, (getHeight() - iDp2) - i4, getWidth() - iDp, getHeight() - iDp2);
            this.clickBounds.set(0.0f, (getHeight() - i4) - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float scale = this.bounce.getScale(0.018f);
        canvas2.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, (1.0f - forceRound()) * this.keyboardT);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.factoryForMentions;
        if (blurredBackgroundDrawableViewFactory != null) {
            if (this.backgroundForCaptionField == null) {
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
                blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.resourcesProvider));
                blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(5.0f));
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(22.0f));
                this.backgroundForCaptionField = blurredBackgroundDrawableCreate;
            }
            RectF rectF = this.bounds;
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            rect.inset(-AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), this.keyboardT), -AndroidUtilities.dp(5.0f));
            this.backgroundForCaptionField.setBounds(rect);
            this.backgroundForCaptionField.draw(canvas2);
            captionContainerView = this;
            f = fLerp3;
            i = 0;
            i2 = 1;
            f2 = 50.0f;
            f3 = 82.0f;
        } else if (customBlur()) {
            i = 0;
            i2 = 1;
            f2 = 50.0f;
            f3 = 82.0f;
            drawBlur(this.backgroundBlur, canvas, this.bounds, fLerp3, false, 0.0f, 0.0f, true, 1.0f);
            captionContainerView = this;
            canvas2 = canvas;
            f = fLerp3;
            captionContainerView.backgroundPaint.setAlpha(AndroidUtilities.lerp(38, 64, captionContainerView.keyboardT));
            canvas2.drawRoundRect(captionContainerView.bounds, f, f, captionContainerView.backgroundPaint);
        } else {
            captionContainerView = this;
            f = fLerp3;
            i = 0;
            i2 = 1;
            f2 = 50.0f;
            f3 = 82.0f;
            Paint[] paints = captionContainerView.backgroundBlur.getPaints(1.0f, 0.0f, 0.0f);
            if (paints == null || paints[1] == null) {
                captionContainerView.backgroundPaint.setAlpha(128);
                canvas2.drawRoundRect(captionContainerView.bounds, f, f, captionContainerView.backgroundPaint);
            } else {
                Paint paint2 = paints[0];
                if (paint2 != null) {
                    canvas2.drawRoundRect(captionContainerView.bounds, f, f, paint2);
                }
                Paint paint3 = paints[1];
                if (paint3 != null) {
                    canvas2.drawRoundRect(captionContainerView.bounds, f, f, paint3);
                }
                captionContainerView.backgroundPaint.setAlpha(51);
                canvas2.drawRoundRect(captionContainerView.bounds, f, f, captionContainerView.backgroundPaint);
            }
        }
        float f10 = captionContainerView.collapsedT.get();
        float f11 = captionContainerView.collapsedT.set(captionContainerView.collapsed);
        if (Math.abs(f10 - f11) > 0.001f) {
            captionContainerView.invalidateDrawOver2();
        } else {
            if ((f10 <= 0.0f) != (f11 <= 0.0f)) {
                captionContainerView.invalidateDrawOver2();
            }
        }
        if (f11 > 0.0f) {
            canvas2.saveLayerAlpha(captionContainerView.bounds, 255, 31);
        }
        if (!captionContainerView.hasReply || captionContainerView.replyBackgroundBlur == null || captionContainerView.replyTextBlur == null) {
            i3 = -1;
        } else {
            if (captionContainerView.collapsed) {
                if (captionContainerView.keyboardShown) {
                    f6 = captionContainerView.bounds.bottom;
                    iMin = Math.max(AndroidUtilities.dp(46.0f), captionContainerView.editText.getHeight());
                } else {
                    f6 = captionContainerView.bounds.bottom;
                    iMin = Math.min(AndroidUtilities.dp(f3), captionContainerView.editText.getHeight());
                }
                float f12 = f6 - iMin;
                float f13 = 1.0f - captionContainerView.collapsedT.get();
                fDp2 = f12 - AndroidUtilities.dp(f2);
                f4 = f13;
            } else {
                fDp2 = captionContainerView.bounds.top;
                f4 = 1.0f;
            }
            Paint paint4 = captionContainerView.replyBackgroundBlur.getPaint(f4);
            Paint paint5 = captionContainerView.replyTextBlur.getPaint(f4);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(captionContainerView.bounds.left + AndroidUtilities.dp(10.0f), fDp2 + AndroidUtilities.dp(10.0f), captionContainerView.bounds.right - AndroidUtilities.dp(10.0f), fDp2 + AndroidUtilities.dp(52.0f));
            if (paint4 != null) {
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint4);
            }
            if (paint5 != null) {
                RectF rectF3 = captionContainerView.bounds;
                f5 = f4;
                paint = paint5;
                i3 = -1;
                canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, 255, 31);
                canvas2 = canvas;
            } else {
                f5 = f4;
                paint = paint5;
                i3 = -1;
            }
            Path path = captionContainerView.replyClipPath;
            if (path == null) {
                captionContainerView.replyClipPath = new Path();
            } else {
                path.rewind();
            }
            float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), i, captionContainerView.keyboardT);
            Path path2 = captionContainerView.replyClipPath;
            RectF rectF4 = captionContainerView.bounds;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF4, fLerp4, fLerp4, direction);
            canvas2.clipPath(captionContainerView.replyClipPath);
            Text text = captionContainerView.replyTitle;
            if (text != null) {
                text.ellipsize((int) (captionContainerView.bounds.width() - AndroidUtilities.dp(40.0f))).draw(canvas2, captionContainerView.bounds.left + AndroidUtilities.dp(20.0f), fDp2 + AndroidUtilities.dp(22.0f), -1, 1.0f);
            }
            Path path3 = captionContainerView.replyLinePath;
            if (path3 == null) {
                captionContainerView.replyLinePath = new Path();
                float[] fArr = new float[8];
                captionContainerView.replyLinePathRadii = fArr;
                float fDp3 = AndroidUtilities.dp(5.0f);
                fArr[i2] = fDp3;
                fArr[i] = fDp3;
                float[] fArr2 = captionContainerView.replyLinePathRadii;
                fArr2[3] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                float fDp4 = AndroidUtilities.dp(5.0f);
                fArr2[7] = fDp4;
                fArr2[6] = fDp4;
            } else {
                path3.rewind();
            }
            float f14 = rectF2.left;
            rectF2.set(f14, rectF2.top, AndroidUtilities.dp(3.0f) + f14, rectF2.bottom);
            captionContainerView.replyLinePath.addRoundRect(rectF2, captionContainerView.replyLinePathRadii, direction);
            if (captionContainerView.replyLinePaint == null) {
                Paint paint6 = new Paint();
                captionContainerView.replyLinePaint = paint6;
                paint6.setColor(i3);
            }
            captionContainerView.replyLinePaint.setAlpha((int) (f5 * 255.0f));
            canvas2.drawPath(captionContainerView.replyLinePath, captionContainerView.replyLinePaint);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(captionContainerView.bounds, paint);
                canvas2.restore();
                canvas2.restore();
            }
            Text text2 = captionContainerView.replyText;
            if (text2 != null) {
                text2.ellipsize((int) (captionContainerView.bounds.width() - AndroidUtilities.dp(40.0f))).draw(canvas2, captionContainerView.bounds.left + AndroidUtilities.dp(20.0f), fDp2 + AndroidUtilities.dp(40.0f), -1, 1.0f);
            }
        }
        super.dispatchDraw(canvas);
        if (f11 > 0.0f) {
            int i6 = captionContainerView.collapsedFromX;
            if (i6 == Integer.MAX_VALUE) {
                fDp = captionContainerView.bounds.right - AndroidUtilities.dp(20.0f);
            } else {
                fDp = i6 == Integer.MIN_VALUE ? captionContainerView.bounds.left + AndroidUtilities.dp(20.0f) : i6;
            }
            float fDp5 = captionContainerView.bounds.bottom - AndroidUtilities.dp(20.0f);
            RectF rectF5 = captionContainerView.bounds;
            float fDistance = MathUtils.distance(rectF5.left, rectF5.top, fDp, fDp5);
            RectF rectF6 = captionContainerView.bounds;
            float fMax = Math.max(fDistance, MathUtils.distance(rectF6.left, rectF6.bottom, fDp, fDp5));
            RectF rectF7 = captionContainerView.bounds;
            float fDistance2 = MathUtils.distance(rectF7.right, rectF7.top, fDp, fDp5);
            RectF rectF8 = captionContainerView.bounds;
            float fMax2 = Math.max(fMax, Math.max(fDistance2, MathUtils.distance(rectF8.right, rectF8.bottom, fDp, fDp5))) * f11;
            if (captionContainerView.collapsePaint == null) {
                Paint paint7 = new Paint(i2);
                captionContainerView.collapsePaint = paint7;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{i3, i3, i}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                captionContainerView.collapseGradient = radialGradient;
                captionContainerView.collapsePaint.setShader(radialGradient);
                captionContainerView.collapseGradientMatrix = new Matrix();
                Paint paint8 = new Paint(i2);
                captionContainerView.collapseOutPaint = paint8;
                paint8.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{i, i, i3}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                captionContainerView.collapseOutGradient = radialGradient2;
                captionContainerView.collapseOutPaint.setShader(radialGradient2);
            }
            captionContainerView.collapseGradientMatrix.reset();
            captionContainerView.collapseGradientMatrix.postTranslate(fDp, fDp5);
            captionContainerView.collapseGradientMatrix.preScale(Math.max(1.0f, fMax2) / 16.0f, Math.max(1.0f, fMax2) / 16.0f);
            captionContainerView.collapseGradient.setLocalMatrix(captionContainerView.collapseGradientMatrix);
            canvas2.save();
            canvas2.drawRoundRect(captionContainerView.bounds, f, f, captionContainerView.collapsePaint);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(captionContainerView.bounds, 255, 31);
            captionContainerView.drawOver(canvas2, captionContainerView.bounds);
            captionContainerView.collapseGradientMatrix.reset();
            captionContainerView.collapseGradientMatrix.postTranslate(fDp, fDp5);
            captionContainerView.collapseGradientMatrix.preScale(Math.max(1.0f, fMax2) / 16.0f, Math.max(1.0f, fMax2) / 16.0f);
            captionContainerView.collapseOutGradient.setLocalMatrix(captionContainerView.collapseGradientMatrix);
            canvas2.save();
            canvas2.drawRoundRect(captionContainerView.bounds, f, f, captionContainerView.collapseOutPaint);
            canvas2.restore();
            canvas2.restore();
            if (!captionContainerView.drawOver2FromParent()) {
                captionContainerView.drawOver2(canvas2, captionContainerView.bounds, f11);
            }
        }
        canvas2.restore();
        if (captionContainerView.factoryForMentions == null) {
            captionContainerView.clipPath.rewind();
            captionContainerView.clipPath.addRoundRect(captionContainerView.bounds, f, f, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(captionContainerView.clipPath);
            StrokeDrawable strokeDrawable = captionContainerView.strokeDrawable;
            strokeDrawable.radius = f;
            RectF rectF9 = captionContainerView.bounds;
            strokeDrawable.setBounds((int) rectF9.left, (int) rectF9.top, (int) rectF9.right, (int) rectF9.bottom);
            captionContainerView.strokeDrawable.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ignoreTouches || ((motionEvent.getAction() == 0 && ignoreTouches(motionEvent.getX(), motionEvent.getY())) || !(this.clickBounds.contains(motionEvent.getX(), motionEvent.getY()) || this.keyboardShown))) {
            return false;
        }
        if (motionEvent.getAction() != 0 || this.keyboardShown) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.bounce.setPressed(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if ((this instanceof CaptionStory) && ((CaptionStory) this).recording) {
            return super.dispatchTouchEvent(motionEvent);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && this.editText != childAt) {
                this.rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getWidth(), childAt.getY() + childAt.getHeight());
                if (this.rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        this.keyboardNotifier.ignore(false);
        this.editText.getEditText().setForceCursorEnd(true);
        this.editText.getEditText().requestFocus();
        this.editText.openKeyboard();
        this.editText.getEditText().setScrollY(0);
        this.bounce.setPressed(true);
        return true;
    }

    public void done() {
        closeKeyboard();
        AndroidUtilities.cancelRunOnUIThread(this.textChangeRunnable);
        this.textChangeRunnable.run();
    }

    public void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2, float f4) {
    }

    public void drawBlurBitmap(Bitmap bitmap, float f) {
        Utilities.stackBlurBitmap(bitmap, (int) f);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        float fMax;
        if (view != this.editText) {
            if (!clipChild(view)) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(this.bounds);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        if (isAtTop()) {
            fMax = 0.0f;
        } else {
            fMax = (1.0f - this.keyboardT) * Math.max(0, (this.editText.getHeight() - AndroidUtilities.dp(82.0f)) - this.editText.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        canvas.save();
        canvas.clipRect(this.bounds);
        canvas.translate(0.0f, fMax);
        boolean zDrawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        canvas.save();
        this.matrix.reset();
        this.matrix.postTranslate(0.0f, this.bounds.top - 1.0f);
        this.fadeGradient.setLocalMatrix(this.matrix);
        RectF rectF = this.bounds;
        float f = rectF.left;
        float f2 = rectF.top;
        canvas.drawRect(f, f2, rectF.right, AndroidUtilities.dp(10.0f) + f2, this.fadePaint);
        this.matrix.reset();
        this.matrix.postRotate(180.0f);
        this.matrix.postTranslate(0.0f, this.bounds.bottom);
        this.fadeGradient.setLocalMatrix(this.matrix);
        RectF rectF2 = this.bounds;
        float f3 = rectF2.left;
        float fDp = rectF2.bottom - AndroidUtilities.dp(10.0f);
        RectF rectF3 = this.bounds;
        canvas.drawRect(f3, fDp, rectF3.right, rectF3.bottom, this.fadePaint);
        canvas.restore();
        canvas.restore();
        return zDrawChild2;
    }

    public final void drawHint(Canvas canvas, Runnable runnable) {
        if (!customBlur()) {
            Paint paint = this.captionBlur.getPaint(1.0f);
            this.editText.getEditText().setHintColor(paint != null ? -1 : -2130706433);
            if (paint == null) {
                runnable.run();
                return;
            }
            EditTextCaption editText = this.editText.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), paint);
            canvas.restore();
            return;
        }
        if (this.hintTextBitmap == null) {
            runnable.run();
            return;
        }
        EditTextCaption editText2 = this.editText.getEditText();
        canvas.translate(-editText2.hintLayoutX, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.hintTextBitmap.getWidth(), this.hintTextBitmap.getHeight(), 255, 31);
        this.rectF.set(0.0f, 1.0f, this.hintTextBitmap.getWidth(), this.hintTextBitmap.getHeight() - 1);
        drawBlur(this.captionBlur, canvas, this.rectF, 0.0f, true, (-this.editText.getX()) - editText2.getPaddingLeft(), ((-this.editText.getY()) - editText2.getPaddingTop()) - editText2.getExtendedPaddingTop(), true, 1.0f);
        canvas.save();
        this.hintTextBitmapPaint.setAlpha(165);
        canvas.drawBitmap(this.hintTextBitmap, 0.0f, 0.0f, this.hintTextBitmapPaint);
        canvas.restore();
        canvas.restore();
    }

    public void drawOver(Canvas canvas, RectF rectF) {
    }

    public void drawOver2(Canvas canvas, RectF rectF, float f) {
    }

    public boolean drawOver2FromParent() {
        return false;
    }

    public float forceRound() {
        return 1.0f;
    }

    public RectF getBounds() {
        return this.bounds;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return UserConfig.getInstance(this.currentAccount).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.codePointCount;
    }

    public int getEditTextHeight() {
        return (int) this.heightAnimated.get();
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.editText.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.collapsedT.get();
    }

    public int getSelectionLength() {
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji != null && editTextEmoji.getEditText() != null) {
            try {
                return this.editText.getEditText().getSelectionEnd() - this.editText.getEditText().getSelectionStart();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.editText.getText();
    }

    public boolean ignoreTouches(float f, float f2) {
        return false;
    }

    public void invalidateBlur() {
        invalidate();
        this.editText.getEditText().invalidate();
        this.editText.getEmojiButton().invalidate();
        MentionsContainerView mentionsContainerView = this.mentionContainer;
        if (mentionsContainerView != null) {
            mentionsContainerView.invalidate();
        }
        if (this.editText.getEmojiView() == null || !customBlur()) {
            return;
        }
        this.editText.getEmojiView().invalidate();
    }

    public void invalidateDrawOver2() {
    }

    public boolean isAtTop() {
        return false;
    }

    public boolean isCaptionOverLimit() {
        return getCodePointCount() > getCaptionLimit();
    }

    public final void lambda$new$0$1(View view) {
        done();
    }

    public final void lambda$new$2() {
        updateShowKeyboard(this.toKeyboardShow);
    }

    public final void lambda$updateShowKeyboard$3(ValueAnimator valueAnimator) {
        this.keyboardT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.editText.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.keyboardT));
        this.limitTextContainer.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), this.keyboardT));
        this.limitTextContainer.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, this.keyboardT));
        this.editText.getEmojiButton().setAlpha(this.keyboardT);
        this.applyButton.setAlpha((float) Math.pow(this.keyboardT, 16.0d));
        onUpdateShowKeyboard(this.keyboardT);
        MentionsContainerView mentionsContainerView = this.mentionContainer;
        if (mentionsContainerView != null) {
            mentionsContainerView.setAlpha((float) Math.pow(this.keyboardT, 4.0d));
        }
        this.editText.getEditText().invalidate();
        invalidate();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (customBlur()) {
            Bitmap bitmap = this.hintTextBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.hintTextBitmap = null;
            }
            this.hintTextPaint.setColor(-16777216);
            this.hintTextPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.hintTextBitmap = Bitmap.createBitmap((int) Math.ceil(this.hintTextPaint.measureText(string)), (int) Math.ceil(this.hintTextPaint.getFontMetrics().descent - this.hintTextPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.hintTextBitmap).drawText(string, 0.0f, -((int) this.hintTextPaint.getFontMetrics().ascent), this.hintTextPaint);
        }
    }

    public boolean onBackPressed() {
        EditTextEmoji editTextEmoji = this.editText;
        if (editTextEmoji.emojiExpanded && editTextEmoji.getEmojiView() != null) {
            if (this.keyboardNotifier.keyboardVisible()) {
                this.editText.getEmojiView().hideSearchKeyboard();
            } else {
                this.editText.collapseEmojiView();
            }
            return true;
        }
        if (this.editText.isPopupShowing()) {
            this.editText.hidePopup(true);
            return true;
        }
        if ((!this.editText.isKeyboardVisible() && !this.keyboardNotifier.keyboardVisible()) || this.keyboardNotifier.ignoring) {
            return false;
        }
        closeKeyboard();
        return true;
    }

    public void onCaptionLimitUpdate(boolean z) {
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.blurBitmapShader = null;
        this.blurPaint = null;
        Bitmap bitmap2 = this.hintTextBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.hintTextBitmap = null;
        }
    }

    public void onEditHeightChange(int i) {
    }

    public void onLineCountChanged(int i, int i2) {
    }

    public void onPause() {
        this.editText.onPause();
    }

    public void onResume() {
        this.editText.onResume();
    }

    public void lambda$new$1() {
    }

    public abstract void onUpdateShowKeyboard(float f);

    public void setAccount(int i) {
        this.currentAccount = i;
    }

    public void setBlurredBackgroundDrawableForMentions(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.factoryForMentions = blurredBackgroundDrawableViewFactory;
    }

    public void setCollapsed(boolean z, int i) {
        this.collapsed = z;
        this.collapsedFromX = i;
        invalidate();
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        MentionsContainerView mentionsContainerView = this.mentionContainer;
        if (mentionsContainerView != null) {
            mentionsContainerView.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.onHeightUpdate = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.onKeyboardOpen = callback;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.bounce.setPressed(z && !this.keyboardShown);
    }

    public void setReply(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null && charSequence2 == null) {
            this.hasReply = false;
            invalidate();
            return;
        }
        this.hasReply = true;
        if (charSequence == null) {
            charSequence = "";
        }
        this.replyTitle = new Text(charSequence, 14.0f, AndroidUtilities.bold());
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        this.replyText = new Text(charSequence2, 14.0f);
    }

    public void setText(CharSequence charSequence) {
        this.ignoreTextChange = true;
        this.editText.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.getUiBlurBitmap = callbackVoidReturn;
    }

    public void setupMentionContainer() {
        this.mentionContainer.getAdapter().allowStickers = false;
        this.mentionContainer.getAdapter().allowBots = false;
        this.mentionContainer.getAdapter().allowChats = false;
        this.mentionContainer.getAdapter().searchInDialogs = this instanceof CaptionStory;
    }

    public void updateColors(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.applyButtonCheck.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogFloatingIcon, false), PorterDuff.Mode.SRC_IN));
        this.applyButtonDrawable.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(16.0f), Theme.getColor(Theme.key_chat_editMediaButton, resourcesProvider)));
    }

    public void updateEditTextLeft() {
        this.editText.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.keyboardT));
    }

    public void updateKeyboard(int i) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.notifyHeightChanged();
        }
        if (this.editText.isPopupShowing()) {
            i = Math.max(0, this.editText.getEmojiPadding() + additionalKeyboardHeight());
        } else if (this.editText.isWaitingForKeyboardOpen()) {
            i = Math.max(0, this.editText.getKeyboardHeight() + additionalKeyboardHeight());
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.sizeNotifierFrameLayout;
        int iMax = Math.max(0, i - (sizeNotifierFrameLayout2 == null ? 0 : sizeNotifierFrameLayout2.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!isAtTop()) {
            ObjectAnimator objectAnimator = this.parentKeyboardAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.parentKeyboardAnimator.cancel();
                this.parentKeyboardAnimator = null;
            }
            this.parentKeyboardAnimator = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -iMax);
            if (iMax > AndroidUtilities.dp(20.0f)) {
                this.parentKeyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                this.parentKeyboardAnimator.setDuration(250L);
            } else {
                this.parentKeyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.parentKeyboardAnimator.setDuration(640L);
            }
            this.parentKeyboardAnimator.start();
        }
        this.toKeyboardShow = iMax > AndroidUtilities.dp(20.0f);
        AndroidUtilities.cancelRunOnUIThread(this.updateShowKeyboard);
        AndroidUtilities.runOnUIThread(this.updateShowKeyboard);
        if (iMax < AndroidUtilities.dp(20.0f)) {
            this.editText.getEditText().clearFocus();
            this.editText.hidePopup(true);
        }
    }

    public void updateMentionsLayoutPosition() {
        if (this.mentionContainer != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.heightAnimated.get();
            if (this.mentionContainer.getY() != translationY) {
                this.mentionContainer.setTranslationY(translationY);
                this.mentionContainer.invalidate();
            }
        }
    }

    public final void updateShowKeyboard(boolean z) {
        int i = 1;
        if (this.keyboardShown == z) {
            return;
        }
        this.keyboardShown = z;
        ValueAnimator valueAnimator = this.keyboardAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.keyboardAnimator = null;
        }
        Utilities.Callback<Boolean> callback = this.onKeyboardOpen;
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
        beforeUpdateShownKeyboard(z);
        if (z) {
            MentionsContainerView mentionsContainerView = this.mentionContainer;
            if (mentionsContainerView != null) {
                mentionsContainerView.setVisibility(0);
            }
            this.applyButton.setVisibility(0);
        } else {
            this.editText.getEditText().scrollBy(0, -this.editText.getEditText().getScrollY());
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.keyboardT, z ? 1.0f : 0.0f);
        this.keyboardAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, i));
        if (!z) {
            this.editText.getEditText().setAllowDrawCursor(false);
        }
        this.keyboardAnimator.addListener(new StoryViewer.AnonymousClass7(this, z, 12));
        if (z) {
            this.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            this.keyboardAnimator.setDuration(250L);
        } else {
            this.keyboardAnimator.setInterpolator(new FastOutSlowInInterpolator());
            this.keyboardAnimator.setDuration(420L);
        }
        this.keyboardAnimator.start();
        EditTextCaption editText = this.editText.getEditText();
        if (editText != null && editText.getLayout() != null) {
            ObjectAnimator objectAnimator = this.scrollAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            int scrollY = editText.getScrollY();
            EditTextEmoji editTextEmoji = this.editText;
            editTextEmoji.setSelection(z ? editTextEmoji.length() : 0);
            this.editText.getEditText().setForceCursorEnd(false);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
            this.scrollAnimator = objectAnimatorOfInt;
            objectAnimatorOfInt.setDuration(360L);
            this.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.scrollAnimator.start();
        }
        this.editText.setSuggestionsEnabled(z);
        if (!z) {
            this.editText.getEditText().setSpoilersRevealed(false, true);
        }
        if (!z || SharedConfig.getDevicePerformanceClass() < 1 || LiteMode.isPowerSaverApplied()) {
            return;
        }
        if (this.blurBitmap == null) {
            this.blurBitmap = Bitmap.createBitmap((int) (this.rootView.getWidth() / 12.0f), (int) (this.rootView.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
        }
        this.ignoreDraw = true;
        drawBlurBitmap(this.blurBitmap, 12.0f);
        this.ignoreDraw = false;
        Bitmap bitmap = this.blurBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            this.blurBitmap = null;
            return;
        }
        Bitmap bitmap2 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.blurBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        Matrix matrix = this.blurBitmapMatrix;
        if (matrix == null) {
            this.blurBitmapMatrix = new Matrix();
        } else {
            matrix.reset();
        }
        this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
        if (this.blurPaint == null) {
            Paint paint = new Paint(3);
            this.blurPaint = paint;
            paint.setColor(-1);
        }
        this.blurPaint.setShader(this.blurBitmapShader);
    }
}
