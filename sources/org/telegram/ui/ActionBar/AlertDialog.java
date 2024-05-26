package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticLambda8;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.EffectsTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
public class AlertDialog extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    private View aboveMessageView;
    private int additioanalHorizontalPadding;
    private float aspectRatio;
    private int backgroundColor;
    private Rect backgroundPaddings;
    float blurAlpha;
    private boolean blurBehind;
    private Bitmap blurBitmap;
    private Matrix blurMatrix;
    private float blurOpacity;
    private Paint blurPaint;
    private BitmapShader blurShader;
    private boolean blurredBackground;
    private boolean blurredNativeBackground;
    private View bottomView;
    protected ViewGroup buttonsLayout;
    private boolean canCacnel;
    private AlertDialog cancelDialog;
    private boolean checkFocusable;
    private int[] containerViewLocation;
    private ScrollView contentScrollView;
    private int currentProgress;
    private boolean customMaxHeight;
    private View customView;
    private int customViewHeight;
    private int customViewOffset;
    private int customWidth;
    private int dialogButtonColorKey;
    private float dimAlpha;
    private Paint dimBlurPaint;
    private boolean dimCustom;
    private boolean dimEnabled;
    private boolean dismissDialogByButtons;
    private Runnable dismissRunnable;
    private boolean drawBackground;
    private boolean focusable;
    private int[] itemIcons;
    private ArrayList<AlertDialogCell> itemViews;
    private CharSequence[] items;
    private int lastScreenWidth;
    private LineProgressView lineProgressView;
    private TextView lineProgressViewPercent;
    private CharSequence message;
    private TextView messageTextView;
    private boolean messageTextViewClickable;
    private DialogInterface.OnClickListener negativeButtonListener;
    private CharSequence negativeButtonText;
    private DialogInterface.OnClickListener neutralButtonListener;
    private CharSequence neutralButtonText;
    private boolean notDrawBackgroundOnTopView;
    private DialogInterface.OnClickListener onBackButtonListener;
    private DialogInterface.OnCancelListener onCancelListener;
    private DialogInterface.OnClickListener onClickListener;
    private DialogInterface.OnDismissListener onDismissListener;
    private ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private Utilities.Callback<Runnable> overridenDissmissListener;
    private DialogInterface.OnClickListener positiveButtonListener;
    private CharSequence positiveButtonText;
    private FrameLayout progressViewContainer;
    private int progressViewStyle;
    private final Theme.ResourcesProvider resourcesProvider;
    private LinearLayout scrollContainer;
    private CharSequence secondTitle;
    private TextView secondTitleTextView;
    private BitmapDrawable[] shadow;
    private AnimatorSet[] shadowAnimation;
    private Drawable shadowDrawable;
    private boolean[] shadowVisibility;
    private Runnable showRunnable;
    private long shownAt;
    private CharSequence subtitle;
    private TextView subtitleTextView;
    private CharSequence title;
    private FrameLayout titleContainer;
    private SpoilersTextView titleTextView;
    private boolean topAnimationAutoRepeat;
    private int topAnimationId;
    private boolean topAnimationIsNew;
    private Map<String, Integer> topAnimationLayerColors;
    private int topAnimationSize;
    private int topBackgroundColor;
    private Drawable topDrawable;
    private int topHeight;
    private RLottieImageView topImageView;
    private int topResId;
    private View topView;
    private boolean verticalButtons;

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return null;
    }

    protected boolean supportsNativeBlur() {
        return false;
    }

    public void lambda$new$0() {
        if (isShowing()) {
            return;
        }
        try {
            show();
        } catch (Exception unused) {
        }
    }

    public void setBlurParams(float f, boolean z, boolean z2) {
        this.blurAlpha = f;
        this.blurBehind = z;
        this.blurredBackground = z2;
    }

    public void redPositive() {
        TextView textView = (TextView) getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    public static class AlertDialogCell extends FrameLayout {
        private ImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public AlertDialogCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_dialogButtonSelector), 2));
            setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogIcon), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createFrame(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            this.textView.setTextSize(1, 16.0f);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
        }

        public void setTextAndIcon(CharSequence charSequence, int i) {
            this.textView.setText(charSequence);
            if (i != 0) {
                this.imageView.setImageResource(i);
                this.imageView.setVisibility(0);
                this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(56.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(56.0f) : 0, 0);
                return;
            }
            this.imageView.setVisibility(4);
            this.textView.setPadding(0, 0, 0, 0);
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }
    }

    public AlertDialog(Context context, int i) {
        this(context, i, null);
    }

    public AlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.customWidth = -1;
        this.customViewHeight = -2;
        this.shadow = new BitmapDrawable[2];
        this.shadowVisibility = new boolean[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.customViewOffset = 12;
        this.dialogButtonColorKey = Theme.key_dialogButton;
        this.topHeight = 132;
        this.messageTextViewClickable = true;
        this.canCacnel = true;
        this.dismissDialogByButtons = true;
        this.containerViewLocation = new int[2];
        this.checkFocusable = true;
        this.dismissRunnable = new BillingController$$ExternalSyntheticLambda8(this);
        this.showRunnable = new Runnable() {
            @Override
            public final void run() {
                AlertDialog.this.lambda$new$0();
            }
        };
        this.itemViews = new ArrayList<>();
        this.dimEnabled = true;
        this.dimAlpha = 0.5f;
        this.dimCustom = false;
        this.topAnimationAutoRepeat = true;
        float f = 0.8f;
        this.blurAlpha = 0.8f;
        this.resourcesProvider = resourcesProvider;
        int themedColor = getThemedColor(Theme.key_dialogBackground);
        this.backgroundColor = themedColor;
        boolean z = AndroidUtilities.computePerceivedBrightness(themedColor) < 0.721f;
        boolean z2 = supportsNativeBlur() && this.progressViewStyle == 0;
        this.blurredNativeBackground = z2;
        this.blurredBackground = (z2 || (!supportsNativeBlur() && SharedConfig.getDevicePerformanceClass() >= 2 && LiteMode.isEnabled(LiteMode.FLAG_CHAT_BLUR))) && z;
        this.backgroundPaddings = new Rect();
        if (i != 3 || this.blurredBackground) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
            this.shadowDrawable = mutate;
            if (i == 3) {
                f = 0.55f;
            } else if (!z) {
                f = 0.985f;
            }
            this.blurOpacity = f;
            mutate.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
            this.shadowDrawable.getPadding(this.backgroundPaddings);
        }
        this.progressViewStyle = i;
    }

    @Override
    public void show() {
        super.show();
        FrameLayout frameLayout = this.progressViewContainer;
        if (frameLayout != null && this.progressViewStyle == 3) {
            frameLayout.setScaleX(0.0f);
            this.progressViewContainer.setScaleY(0.0f);
            this.progressViewContainer.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.shownAt = System.currentTimeMillis();
    }

    public class AnonymousClass1 extends LinearLayout {
        private Paint backgroundPaint;
        private AnimatedFloat blurPaintAlpha;
        private boolean inLayout;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        AnonymousClass1(Context context) {
            super(context);
            this.blurPaintAlpha = new AnimatedFloat(0.0f, this);
            this.backgroundPaint = new Paint(1);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (AlertDialog.this.progressViewStyle == 3) {
                AlertDialog.this.showCancelAlert();
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (AlertDialog.this.progressViewStyle == 3) {
                AlertDialog.this.showCancelAlert();
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int r13, int r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.AlertDialog.AnonymousClass1.onMeasure(int, int):void");
        }

        public void lambda$onMeasure$0() {
            int dp;
            AlertDialog.this.lastScreenWidth = AndroidUtilities.displaySize.x;
            int dp2 = AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f);
            if (AndroidUtilities.isTablet()) {
                if (AndroidUtilities.isSmallTablet()) {
                    dp = AndroidUtilities.dp(446.0f);
                } else {
                    dp = AndroidUtilities.dp(496.0f);
                }
            } else {
                dp = AndroidUtilities.dp(356.0f);
            }
            Window window = AlertDialog.this.getWindow();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = Math.min(dp, dp2) + AlertDialog.this.backgroundPaddings.left + AlertDialog.this.backgroundPaddings.right;
            try {
                window.setAttributes(layoutParams);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (AlertDialog.this.progressViewStyle == 3) {
                int measuredWidth = ((i3 - i) - AlertDialog.this.progressViewContainer.getMeasuredWidth()) / 2;
                int measuredHeight = ((i4 - i2) - AlertDialog.this.progressViewContainer.getMeasuredHeight()) / 2;
                AlertDialog.this.progressViewContainer.layout(measuredWidth, measuredHeight, AlertDialog.this.progressViewContainer.getMeasuredWidth() + measuredWidth, AlertDialog.this.progressViewContainer.getMeasuredHeight() + measuredHeight);
            } else if (AlertDialog.this.contentScrollView != null) {
                if (AlertDialog.this.onScrollChangedListener == null) {
                    AlertDialog.this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            AlertDialog.AnonymousClass1.this.lambda$onLayout$1();
                        }
                    };
                    AlertDialog.this.contentScrollView.getViewTreeObserver().addOnScrollChangedListener(AlertDialog.this.onScrollChangedListener);
                }
                AlertDialog.this.onScrollChangedListener.onScrollChanged();
            }
            getLocationOnScreen(AlertDialog.this.containerViewLocation);
            if (AlertDialog.this.blurMatrix == null || AlertDialog.this.blurShader == null) {
                return;
            }
            AlertDialog.this.blurMatrix.reset();
            AlertDialog.this.blurMatrix.postScale(8.0f, 8.0f);
            AlertDialog.this.blurMatrix.postTranslate(-AlertDialog.this.containerViewLocation[0], -AlertDialog.this.containerViewLocation[1]);
            AlertDialog.this.blurShader.setLocalMatrix(AlertDialog.this.blurMatrix);
        }

        public void lambda$onLayout$1() {
            AlertDialog alertDialog = AlertDialog.this;
            boolean z = false;
            alertDialog.runShadowAnimation(0, alertDialog.titleTextView != null && AlertDialog.this.contentScrollView.getScrollY() > AlertDialog.this.scrollContainer.getTop());
            AlertDialog alertDialog2 = AlertDialog.this;
            if (alertDialog2.buttonsLayout != null && alertDialog2.contentScrollView.getScrollY() + AlertDialog.this.contentScrollView.getHeight() < AlertDialog.this.scrollContainer.getBottom()) {
                z = true;
            }
            alertDialog2.runShadowAnimation(1, z);
            AlertDialog.this.contentScrollView.invalidate();
        }

        @Override
        public void requestLayout() {
            if (this.inLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public void draw(Canvas canvas) {
            float dp;
            Paint paint;
            if (AlertDialog.this.blurredBackground && !AlertDialog.this.blurredNativeBackground) {
                if (AlertDialog.this.progressViewStyle == 3 && AlertDialog.this.progressViewContainer != null) {
                    dp = AndroidUtilities.dp(18.0f);
                    float width = AlertDialog.this.progressViewContainer.getWidth() * AlertDialog.this.progressViewContainer.getScaleX();
                    float height = AlertDialog.this.progressViewContainer.getHeight() * AlertDialog.this.progressViewContainer.getScaleY();
                    AndroidUtilities.rectTmp.set((getWidth() - width) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + width) / 2.0f, (getHeight() + height) / 2.0f);
                } else {
                    dp = AndroidUtilities.dp(10.0f);
                    AndroidUtilities.rectTmp.set(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
                }
                float f = this.blurPaintAlpha.set(AlertDialog.this.blurPaint != null ? 1.0f : 0.0f);
                if (AlertDialog.this.blurPaint != null) {
                    AlertDialog.this.blurPaint.setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, dp, dp, AlertDialog.this.blurPaint);
                }
                if (AlertDialog.this.dimBlurPaint == null) {
                    AlertDialog.this.dimBlurPaint = new Paint(1);
                    AlertDialog.this.dimBlurPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (AlertDialog.this.dimAlpha * 255.0f)));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                canvas.drawRoundRect(rectF, dp, dp, AlertDialog.this.dimBlurPaint);
                this.backgroundPaint.setColor(AlertDialog.this.backgroundColor);
                this.backgroundPaint.setAlpha((int) (paint.getAlpha() * ((f * (AlertDialog.this.blurOpacity - 1.0f)) + 1.0f)));
                canvas.drawRoundRect(rectF, dp, dp, this.backgroundPaint);
            }
            super.draw(canvas);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (AlertDialog.this.drawBackground && !AlertDialog.this.blurredBackground) {
                AlertDialog.this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                if (AlertDialog.this.topView == null || !AlertDialog.this.notDrawBackgroundOnTopView) {
                    AlertDialog.this.shadowDrawable.draw(canvas);
                } else {
                    int bottom = AlertDialog.this.topView.getBottom();
                    canvas.save();
                    canvas.clipRect(0, bottom, getMeasuredWidth(), getMeasuredHeight());
                    AlertDialog.this.shadowDrawable.draw(canvas);
                    canvas.restore();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    public View inflateContent(boolean z) {
        int dp;
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext());
        anonymousClass1.setOrientation(1);
        if ((this.blurredBackground || this.progressViewStyle == 3) && this.progressViewStyle != 2) {
            anonymousClass1.setBackgroundDrawable(null);
            anonymousClass1.setPadding(0, 0, 0, 0);
            if (this.blurredBackground && !this.blurredNativeBackground) {
                anonymousClass1.setWillNotDraw(false);
            }
            this.drawBackground = false;
        } else if (this.notDrawBackgroundOnTopView) {
            Rect rect = new Rect();
            this.shadowDrawable.getPadding(rect);
            anonymousClass1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            this.drawBackground = true;
        } else {
            anonymousClass1.setBackgroundDrawable(null);
            anonymousClass1.setPadding(0, 0, 0, 0);
            anonymousClass1.setBackgroundDrawable(this.shadowDrawable);
            this.drawBackground = false;
        }
        anonymousClass1.setFitsSystemWindows(Build.VERSION.SDK_INT >= 21);
        if (z) {
            if (this.customWidth > 0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                setContentView(anonymousClass1, layoutParams);
            } else {
                setContentView(anonymousClass1);
            }
        }
        boolean z2 = (this.positiveButtonText == null && this.negativeButtonText == null && this.neutralButtonText == null) ? false : true;
        if (this.topResId != 0 || this.topAnimationId != 0 || this.topDrawable != null) {
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            this.topImageView = rLottieImageView;
            Drawable drawable = this.topDrawable;
            if (drawable != null) {
                rLottieImageView.setImageDrawable(drawable);
            } else {
                int i = this.topResId;
                if (i != 0) {
                    rLottieImageView.setImageResource(i);
                } else {
                    rLottieImageView.setAutoRepeat(this.topAnimationAutoRepeat);
                    RLottieImageView rLottieImageView2 = this.topImageView;
                    int i2 = this.topAnimationId;
                    int i3 = this.topAnimationSize;
                    rLottieImageView2.setAnimation(i2, i3, i3);
                    if (this.topAnimationLayerColors != null) {
                        RLottieDrawable animatedDrawable = this.topImageView.getAnimatedDrawable();
                        for (Map.Entry<String, Integer> entry : this.topAnimationLayerColors.entrySet()) {
                            animatedDrawable.setLayerColor(entry.getKey(), entry.getValue().intValue());
                        }
                    }
                    this.topImageView.playAnimation();
                }
            }
            this.topImageView.setScaleType(ImageView.ScaleType.CENTER);
            if (this.topAnimationIsNew) {
                final GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.topBackgroundColor);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
                this.topImageView.setBackground(new Drawable() {
                    int size;

                    {
                        this.size = AlertDialog.this.topAnimationSize + AndroidUtilities.dp(52.0f);
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        gradientDrawable.setBounds((int) ((AlertDialog.this.topImageView.getWidth() - this.size) / 2.0f), (int) ((AlertDialog.this.topImageView.getHeight() - this.size) / 2.0f), (int) ((AlertDialog.this.topImageView.getWidth() + this.size) / 2.0f), (int) ((AlertDialog.this.topImageView.getHeight() + this.size) / 2.0f));
                        gradientDrawable.draw(canvas);
                    }

                    @Override
                    public void setAlpha(int i4) {
                        gradientDrawable.setAlpha(i4);
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                        gradientDrawable.setColorFilter(colorFilter);
                    }

                    @Override
                    public int getOpacity() {
                        return gradientDrawable.getOpacity();
                    }
                });
                this.topHeight = 92;
            } else {
                this.topImageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), 0, this.topBackgroundColor));
            }
            if (this.topAnimationIsNew) {
                this.topImageView.setTranslationY(AndroidUtilities.dp(16.0f));
            } else {
                this.topImageView.setTranslationY(0.0f);
            }
            this.topImageView.setPadding(0, 0, 0, 0);
            anonymousClass1.addView(this.topImageView, LayoutHelper.createLinear(-1, this.topHeight, 51, 0, 0, 0, 0));
        } else {
            View view = this.topView;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                anonymousClass1.addView(this.topView, LayoutHelper.createLinear(-1, this.topHeight, 51, 0, 0, 0, 0));
            }
        }
        if (this.title != null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.titleContainer = frameLayout;
            anonymousClass1.addView(frameLayout, LayoutHelper.createLinear(-2, -2, this.topAnimationIsNew ? 1 : 0, 24, 0, 24, 0));
            SpoilersTextView spoilersTextView = new SpoilersTextView(getContext(), false);
            this.titleTextView = spoilersTextView;
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            SpoilersTextView spoilersTextView2 = this.titleTextView;
            spoilersTextView2.cacheType = 3;
            spoilersTextView2.setText(this.title);
            this.titleTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleTextView.setGravity((this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout2 = this.titleContainer;
            SpoilersTextView spoilersTextView3 = this.titleTextView;
            boolean z3 = this.topAnimationIsNew;
            frameLayout2.addView(spoilersTextView3, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z3 ? 4.0f : this.subtitle != null ? 2 : this.items != null ? 14 : 10));
        }
        if (this.secondTitle != null && this.title != null) {
            TextView textView = new TextView(getContext());
            this.secondTitleTextView = textView;
            textView.setText(this.secondTitle);
            this.secondTitleTextView.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            this.secondTitleTextView.setTextSize(1, 18.0f);
            this.secondTitleTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            this.titleContainer.addView(this.secondTitleTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 0.0f, 21.0f, 0.0f, 0.0f));
        }
        if (this.subtitle != null) {
            TextView textView2 = new TextView(getContext());
            this.subtitleTextView = textView2;
            textView2.setText(this.subtitle);
            this.subtitleTextView.setTextColor(getThemedColor(Theme.key_dialogIcon));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            anonymousClass1.addView(this.subtitleTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.items != null ? 14 : 10));
        }
        if (this.progressViewStyle == 0) {
            this.shadow[0] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow).mutate();
            this.shadow[1] = (BitmapDrawable) getContext().getResources().getDrawable(R.drawable.header_shadow_reverse).mutate();
            this.shadow[0].setAlpha(0);
            this.shadow[1].setAlpha(0);
            this.shadow[0].setCallback(this);
            this.shadow[1].setCallback(this);
            ScrollView scrollView = new ScrollView(getContext()) {
                @Override
                protected boolean drawChild(Canvas canvas, View view2, long j) {
                    boolean drawChild = super.drawChild(canvas, view2, j);
                    if (AlertDialog.this.shadow[0].getPaint().getAlpha() != 0) {
                        AlertDialog.this.shadow[0].setBounds(0, getScrollY(), getMeasuredWidth(), getScrollY() + AndroidUtilities.dp(3.0f));
                        AlertDialog.this.shadow[0].draw(canvas);
                    }
                    if (AlertDialog.this.shadow[1].getPaint().getAlpha() != 0) {
                        AlertDialog.this.shadow[1].setBounds(0, (getScrollY() + getMeasuredHeight()) - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getScrollY() + getMeasuredHeight());
                        AlertDialog.this.shadow[1].draw(canvas);
                    }
                    return drawChild;
                }
            };
            this.contentScrollView = scrollView;
            scrollView.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.contentScrollView, getThemedColor(Theme.key_dialogScrollGlow));
            anonymousClass1.addView(this.contentScrollView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.scrollContainer = linearLayout;
            linearLayout.setOrientation(1);
            this.contentScrollView.addView(this.scrollContainer, new FrameLayout.LayoutParams(-1, -2));
        }
        EffectsTextView effectsTextView = new EffectsTextView(getContext());
        this.messageTextView = effectsTextView;
        NotificationCenter.listenEmojiLoading(effectsTextView);
        this.messageTextView.setTextColor(getThemedColor(this.topAnimationIsNew ? Theme.key_windowBackgroundWhiteGrayText : Theme.key_dialogTextBlack));
        this.messageTextView.setTextSize(1, 16.0f);
        this.messageTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.messageTextView.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
        if (!this.messageTextViewClickable) {
            this.messageTextView.setClickable(false);
            this.messageTextView.setEnabled(false);
        }
        this.messageTextView.setGravity((this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        int i4 = this.progressViewStyle;
        if (i4 == 2) {
            anonymousClass1.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.title == null ? 19 : 0, 24, 20));
            LineProgressView lineProgressView = new LineProgressView(getContext());
            this.lineProgressView = lineProgressView;
            lineProgressView.setProgress(this.currentProgress / 100.0f, false);
            this.lineProgressView.setProgressColor(getThemedColor(Theme.key_dialogLineProgress));
            this.lineProgressView.setBackColor(getThemedColor(Theme.key_dialogLineProgressBackground));
            anonymousClass1.addView(this.lineProgressView, LayoutHelper.createLinear(-1, 4, 19, 24, 0, 24, 0));
            TextView textView3 = new TextView(getContext());
            this.lineProgressViewPercent = textView3;
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.lineProgressViewPercent.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.lineProgressViewPercent.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
            this.lineProgressViewPercent.setTextSize(1, 14.0f);
            anonymousClass1.addView(this.lineProgressViewPercent, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            updateLineProgressTextView();
        } else if (i4 == 3) {
            setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.progressViewContainer = new FrameLayout(getContext());
            this.backgroundColor = getThemedColor(Theme.key_dialog_inlineProgressBackground);
            if (!this.blurredBackground || this.blurredNativeBackground) {
                this.progressViewContainer.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), this.backgroundColor));
            }
            anonymousClass1.addView(this.progressViewContainer, LayoutHelper.createLinear(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), this.resourcesProvider);
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setProgressColor(getThemedColor(Theme.key_dialog_inlineProgress));
            this.progressViewContainer.addView(radialProgressView, LayoutHelper.createFrame(86, 86, 17));
        } else {
            View view2 = this.aboveMessageView;
            if (view2 != null) {
                this.scrollContainer.addView(view2, LayoutHelper.createLinear(-1, -2, 22.0f, 4.0f, 22.0f, 12.0f));
            }
            this.scrollContainer.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.customView == null && this.items == null) ? 0 : this.customViewOffset));
            View view3 = this.bottomView;
            if (view3 != null) {
                this.scrollContainer.addView(view3, LayoutHelper.createLinear(-1, -2, 22.0f, 12.0f, 22.0f, 0.0f));
            }
        }
        if (!TextUtils.isEmpty(this.message)) {
            this.messageTextView.setText(this.message);
            this.messageTextView.setVisibility(0);
        } else {
            this.messageTextView.setVisibility(8);
        }
        if (this.items != null) {
            int i5 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i5 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i5] != null) {
                    AlertDialogCell alertDialogCell = new AlertDialogCell(getContext(), this.resourcesProvider);
                    CharSequence charSequence = this.items[i5];
                    int[] iArr = this.itemIcons;
                    alertDialogCell.setTextAndIcon(charSequence, iArr != null ? iArr[i5] : 0);
                    alertDialogCell.setTag(Integer.valueOf(i5));
                    this.itemViews.add(alertDialogCell);
                    this.scrollContainer.addView(alertDialogCell, LayoutHelper.createLinear(-1, 50));
                    alertDialogCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view4) {
                            AlertDialog.this.lambda$inflateContent$1(view4);
                        }
                    });
                }
                i5++;
            }
        }
        View view4 = this.customView;
        if (view4 != null) {
            if (view4.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            this.scrollContainer.addView(this.customView, LayoutHelper.createLinear(-1, this.customViewHeight));
        }
        if (z2) {
            if (!this.verticalButtons) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                CharSequence charSequence2 = this.positiveButtonText;
                int measureText = charSequence2 != null ? (int) (0 + textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.dp(10.0f)) : 0;
                CharSequence charSequence3 = this.negativeButtonText;
                if (charSequence3 != null) {
                    measureText = (int) (measureText + textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.dp(10.0f));
                }
                CharSequence charSequence4 = this.neutralButtonText;
                if (charSequence4 != null) {
                    measureText = (int) (measureText + textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.dp(10.0f));
                }
                if (measureText > AndroidUtilities.displaySize.x - AndroidUtilities.dp(110.0f)) {
                    this.verticalButtons = true;
                }
            }
            if (this.verticalButtons) {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(1);
                this.buttonsLayout = linearLayout2;
            } else {
                this.buttonsLayout = new FrameLayout(this, getContext()) {
                    @Override
                    protected void onLayout(boolean z4, int i6, int i7, int i8, int i9) {
                        int i10;
                        int i11;
                        int childCount = getChildCount();
                        int i12 = i8 - i6;
                        View view5 = null;
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = getChildAt(i13);
                            Integer num = (Integer) childAt.getTag();
                            if (num != null) {
                                if (num.intValue() == -1) {
                                    if (LocaleController.isRTL) {
                                        childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
                                    } else {
                                        childAt.layout((i12 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i12 - getPaddingRight(), getPaddingTop() + childAt.getMeasuredHeight());
                                    }
                                    view5 = childAt;
                                } else if (num.intValue() == -2) {
                                    if (LocaleController.isRTL) {
                                        int paddingLeft = getPaddingLeft();
                                        if (view5 != null) {
                                            paddingLeft += view5.getMeasuredWidth() + AndroidUtilities.dp(8.0f);
                                        }
                                        childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                                    } else {
                                        int paddingRight = (i12 - getPaddingRight()) - childAt.getMeasuredWidth();
                                        if (view5 != null) {
                                            paddingRight -= view5.getMeasuredWidth() + AndroidUtilities.dp(8.0f);
                                        }
                                        childAt.layout(paddingRight, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight, getPaddingTop() + childAt.getMeasuredHeight());
                                    }
                                } else if (num.intValue() == -3) {
                                    if (LocaleController.isRTL) {
                                        childAt.layout((i12 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i12 - getPaddingRight(), getPaddingTop() + childAt.getMeasuredHeight());
                                    } else {
                                        childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
                                    }
                                }
                            } else {
                                int measuredWidth = childAt.getMeasuredWidth();
                                int measuredHeight = childAt.getMeasuredHeight();
                                if (view5 != null) {
                                    i10 = view5.getLeft() + ((view5.getMeasuredWidth() - measuredWidth) / 2);
                                    i11 = view5.getTop() + ((view5.getMeasuredHeight() - measuredHeight) / 2);
                                } else {
                                    i10 = 0;
                                    i11 = 0;
                                }
                                childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
                            }
                        }
                    }

                    @Override
                    protected void onMeasure(int i6, int i7) {
                        super.onMeasure(i6, i7);
                        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                        int childCount = getChildCount();
                        int i8 = 0;
                        for (int i9 = 0; i9 < childCount; i9++) {
                            View childAt = getChildAt(i9);
                            if ((childAt instanceof TextView) && childAt.getTag() != null) {
                                i8 += childAt.getMeasuredWidth();
                            }
                        }
                        if (i8 > measuredWidth) {
                            View findViewWithTag = findViewWithTag(-2);
                            View findViewWithTag2 = findViewWithTag(-3);
                            if (findViewWithTag == null || findViewWithTag2 == null) {
                                return;
                            }
                            if (findViewWithTag.getMeasuredWidth() < findViewWithTag2.getMeasuredWidth()) {
                                findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i8 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                            } else {
                                findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i8 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                };
            }
            if (this.bottomView != null) {
                this.buttonsLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
                this.buttonsLayout.setTranslationY(-AndroidUtilities.dp(6.0f));
            } else {
                this.buttonsLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            anonymousClass1.addView(this.buttonsLayout, LayoutHelper.createLinear(-1, 52));
            if (this.topAnimationIsNew) {
                this.buttonsLayout.setTranslationY(-AndroidUtilities.dp(8.0f));
            }
            if (this.positiveButtonText != null) {
                TextView textView4 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z4) {
                        super.setEnabled(z4);
                        setAlpha(z4 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), i6));
                    }
                };
                textView4.setMinWidth(AndroidUtilities.dp(64.0f));
                textView4.setTag(-1);
                textView4.setTextSize(1, 16.0f);
                textView4.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView4.setGravity(17);
                textView4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView4.setText(this.positiveButtonText.toString());
                textView4.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), getThemedColor(this.dialogButtonColorKey)));
                textView4.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView4, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView4, LayoutHelper.createFrame(-2, 36, 53));
                }
                textView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view5) {
                        AlertDialog.this.lambda$inflateContent$2(view5);
                    }
                });
            }
            if (this.negativeButtonText != null) {
                TextView textView5 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z4) {
                        super.setEnabled(z4);
                        setAlpha(z4 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), i6));
                    }
                };
                textView5.setMinWidth(AndroidUtilities.dp(64.0f));
                textView5.setTag(-2);
                textView5.setTextSize(1, 16.0f);
                textView5.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView5.setGravity(17);
                textView5.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                textView5.setSingleLine(true);
                textView5.setText(this.negativeButtonText.toString());
                textView5.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), getThemedColor(this.dialogButtonColorKey)));
                textView5.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView5, 0, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView5, LayoutHelper.createFrame(-2, 36, 53));
                }
                textView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view5) {
                        AlertDialog.this.lambda$inflateContent$3(view5);
                    }
                });
            }
            if (this.neutralButtonText != null) {
                TextView textView6 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z4) {
                        super.setEnabled(z4);
                        setAlpha(z4 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), i6));
                    }
                };
                textView6.setMinWidth(AndroidUtilities.dp(64.0f));
                textView6.setTag(-3);
                textView6.setTextSize(1, 16.0f);
                textView6.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView6.setGravity(17);
                textView6.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView6.setEllipsize(TextUtils.TruncateAt.END);
                textView6.setSingleLine(true);
                textView6.setText(this.neutralButtonText.toString());
                textView6.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), getThemedColor(this.dialogButtonColorKey)));
                textView6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView6, 1, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView6, LayoutHelper.createFrame(-2, 36, 51));
                }
                textView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view5) {
                        AlertDialog.this.lambda$inflateContent$4(view5);
                    }
                });
            }
            if (this.verticalButtons) {
                for (int i6 = 1; i6 < this.buttonsLayout.getChildCount(); i6++) {
                    ((ViewGroup.MarginLayoutParams) this.buttonsLayout.getChildAt(i6).getLayoutParams()).topMargin = AndroidUtilities.dp(6.0f);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        layoutParams2.copyFrom(window.getAttributes());
        if (this.progressViewStyle == 3) {
            layoutParams2.width = -1;
        } else {
            if (this.dimEnabled && !this.dimCustom) {
                layoutParams2.dimAmount = this.dimAlpha;
                layoutParams2.flags |= 2;
            } else {
                layoutParams2.dimAmount = 0.0f;
                layoutParams2.flags ^= 2;
            }
            int i7 = AndroidUtilities.displaySize.x;
            this.lastScreenWidth = i7;
            int dp2 = (i7 - AndroidUtilities.dp(48.0f)) - (this.additioanalHorizontalPadding * 2);
            if (AndroidUtilities.isTablet()) {
                if (AndroidUtilities.isSmallTablet()) {
                    dp = AndroidUtilities.dp(446.0f);
                } else {
                    dp = AndroidUtilities.dp(496.0f);
                }
            } else {
                dp = AndroidUtilities.dp(356.0f);
            }
            int min = Math.min(dp, dp2);
            Rect rect2 = this.backgroundPaddings;
            layoutParams2.width = min + rect2.left + rect2.right;
        }
        View view5 = this.customView;
        if (view5 != null && this.checkFocusable && canTextInput(view5)) {
            layoutParams2.softInputMode = 4;
        } else {
            layoutParams2.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 0;
        }
        if (this.blurredBackground) {
            if (supportsNativeBlur()) {
                if (this.progressViewStyle == 0) {
                    this.blurredNativeBackground = true;
                    window.setBackgroundBlurRadius(50);
                    float dp3 = AndroidUtilities.dp(12.0f);
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dp3, dp3, dp3, dp3, dp3, dp3, dp3, dp3}, null, null));
                    shapeDrawable.getPaint().setColor(ColorUtils.setAlphaComponent(this.backgroundColor, (int) (this.blurAlpha * 255.0f)));
                    window.setBackgroundDrawable(shapeDrawable);
                    if (this.blurBehind) {
                        layoutParams2.flags |= 4;
                        layoutParams2.setBlurBehindRadius(20);
                    }
                }
            } else {
                AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        AlertDialog.this.lambda$inflateContent$5(anonymousClass1, (Bitmap) obj);
                    }
                }, 8.0f);
            }
        }
        window.setAttributes(layoutParams2);
        return anonymousClass1;
    }

    public void lambda$inflateContent$1(View view) {
        DialogInterface.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, ((Integer) view.getTag()).intValue());
        }
        dismiss();
    }

    public void lambda$inflateContent$2(View view) {
        DialogInterface.OnClickListener onClickListener = this.positiveButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -1);
        }
        if (this.dismissDialogByButtons) {
            dismiss();
        }
    }

    public void lambda$inflateContent$3(View view) {
        DialogInterface.OnClickListener onClickListener = this.negativeButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
        if (this.dismissDialogByButtons) {
            cancel();
        }
    }

    public void lambda$inflateContent$4(View view) {
        DialogInterface.OnClickListener onClickListener = this.neutralButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
        if (this.dismissDialogByButtons) {
            dismiss();
        }
    }

    public void lambda$inflateContent$5(LinearLayout linearLayout, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        if (this.blurPaint == null) {
            this.blurPaint = new Paint(1);
        }
        this.blurBitmap = bitmap;
        Bitmap bitmap2 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.blurShader = bitmapShader;
        this.blurPaint.setShader(bitmapShader);
        Matrix matrix = new Matrix();
        this.blurMatrix = matrix;
        matrix.postScale(8.0f, 8.0f);
        Matrix matrix2 = this.blurMatrix;
        int[] iArr = this.containerViewLocation;
        matrix2.postTranslate(-iArr[0], -iArr[1]);
        this.blurShader.setLocalMatrix(this.blurMatrix);
        linearLayout.invalidate();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        inflateContent(true);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        DialogInterface.OnClickListener onClickListener = this.onBackButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
    }

    public void setFocusable(boolean z) {
        if (this.focusable == z) {
            return;
        }
        this.focusable = z;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.focusable) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.backgroundColor, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setTextColor(int i) {
        SpoilersTextView spoilersTextView = this.titleTextView;
        if (spoilersTextView != null) {
            spoilersTextView.setTextColor(i);
        }
        TextView textView = this.messageTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTextSize(int i, int i2) {
        SpoilersTextView spoilersTextView = this.titleTextView;
        if (spoilersTextView != null) {
            spoilersTextView.setTextSize(1, i);
        }
        TextView textView = this.messageTextView;
        if (textView != null) {
            textView.setTextSize(1, i2);
        }
    }

    public void setMessageLineSpacing(float f) {
        TextView textView = this.messageTextView;
        if (textView != null) {
            textView.setLineSpacing(AndroidUtilities.dp(f), 1.0f);
        }
    }

    public void showCancelAlert() {
        if (this.canCacnel && this.cancelDialog == null) {
            Builder builder = new Builder(getContext(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle));
            builder.setMessage(LocaleController.getString("StopLoading", R.string.StopLoading));
            builder.setPositiveButton(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertDialog.this.lambda$showCancelAlert$6(dialogInterface, i);
                }
            });
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertDialog.this.lambda$showCancelAlert$7(dialogInterface);
                }
            });
            try {
                this.cancelDialog = builder.show();
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$showCancelAlert$6(DialogInterface dialogInterface, int i) {
        DialogInterface.OnCancelListener onCancelListener = this.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
        dismiss();
    }

    public void lambda$showCancelAlert$7(DialogInterface dialogInterface) {
        this.cancelDialog = null;
    }

    public void runShadowAnimation(final int i, boolean z) {
        if ((!z || this.shadowVisibility[i]) && (z || !this.shadowVisibility[i])) {
            return;
        }
        this.shadowVisibility[i] = z;
        AnimatorSet[] animatorSetArr = this.shadowAnimation;
        if (animatorSetArr[i] != null) {
            animatorSetArr[i].cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        BitmapDrawable[] bitmapDrawableArr = this.shadow;
        if (bitmapDrawableArr[i] != null) {
            AnimatorSet animatorSet = this.shadowAnimation[i];
            Animator[] animatorArr = new Animator[1];
            BitmapDrawable bitmapDrawable = bitmapDrawableArr[i];
            int[] iArr = new int[1];
            iArr[0] = z ? 255 : 0;
            animatorArr[0] = ObjectAnimator.ofInt(bitmapDrawable, "alpha", iArr);
            animatorSet.playTogether(animatorArr);
        }
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (AlertDialog.this.shadowAnimation[i] == null || !AlertDialog.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                AlertDialog.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (AlertDialog.this.shadowAnimation[i] == null || !AlertDialog.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                AlertDialog.this.shadowAnimation[i] = null;
            }
        });
        try {
            this.shadowAnimation[i].start();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setDismissDialogByButtons(boolean z) {
        this.dismissDialogByButtons = z;
    }

    public void setProgress(int i) {
        this.currentProgress = i;
        LineProgressView lineProgressView = this.lineProgressView;
        if (lineProgressView != null) {
            lineProgressView.setProgress(i / 100.0f, true);
            updateLineProgressTextView();
        }
    }

    private void updateLineProgressTextView() {
        this.lineProgressViewPercent.setText(String.format("%d%%", Integer.valueOf(this.currentProgress)));
    }

    public void setCanCancel(boolean z) {
        this.canCacnel = z;
    }

    private boolean canTextInput(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (canTextInput(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        if (i != NotificationCenter.emojiLoaded || (textView = this.messageTextView) == null) {
            return;
        }
        textView.invalidate();
    }

    public void dismissUnless(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.shownAt;
        if (currentTimeMillis < j) {
            AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda8(this), currentTimeMillis - j);
        } else {
            dismiss();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        Utilities.Callback<Runnable> callback = this.overridenDissmissListener;
        if (callback != null) {
            this.overridenDissmissListener = null;
            callback.run(new BillingController$$ExternalSyntheticLambda8(this));
            return;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        AlertDialog alertDialog = this.cancelDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        if (this.blurShader == null || (bitmap = this.blurBitmap) == null) {
            return;
        }
        bitmap.recycle();
        this.blurShader = null;
        this.blurPaint = null;
        this.blurBitmap = null;
    }

    @Override
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
        SpoilersTextView spoilersTextView = this.titleTextView;
        if (spoilersTextView != null) {
            spoilersTextView.setText(charSequence);
        }
    }

    public void setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.positiveButtonText = charSequence;
        this.positiveButtonListener = onClickListener;
    }

    public void setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.negativeButtonText = charSequence;
        this.negativeButtonListener = onClickListener;
    }

    public void setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.neutralButtonText = charSequence;
        this.neutralButtonListener = onClickListener;
    }

    public void setItemColor(int i, int i2, int i3) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        AlertDialogCell alertDialogCell = this.itemViews.get(i);
        alertDialogCell.textView.setTextColor(i2);
        alertDialogCell.imageView.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
    }

    public int getItemsCount() {
        return this.itemViews.size();
    }

    public void setMessage(CharSequence charSequence) {
        this.message = charSequence;
        if (this.messageTextView != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                this.messageTextView.setText(this.message);
                this.messageTextView.setVisibility(0);
                return;
            }
            this.messageTextView.setVisibility(8);
        }
    }

    public View getButton(int i) {
        ViewGroup viewGroup = this.buttonsLayout;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i));
        }
        return null;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        this.contentScrollView.invalidate();
        this.scrollContainer.invalidate();
    }

    @Override
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ScrollView scrollView = this.contentScrollView;
        if (scrollView != null) {
            scrollView.postDelayed(runnable, j);
        }
    }

    @Override
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        ScrollView scrollView = this.contentScrollView;
        if (scrollView != null) {
            scrollView.removeCallbacks(runnable);
        }
    }

    @Override
    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    public void setPositiveButtonListener(DialogInterface.OnClickListener onClickListener) {
        this.positiveButtonListener = onClickListener;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void showDelayed(long j) {
        AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
        AndroidUtilities.runOnUIThread(this.showRunnable, j);
    }

    public ViewGroup getButtonsLayout() {
        return this.buttonsLayout;
    }

    public static class Builder {
        private AlertDialog alertDialog;

        public Builder(AlertDialog alertDialog) {
            this.alertDialog = alertDialog;
        }

        public Builder(Context context) {
            this(context, null);
        }

        public Builder(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, 0, resourcesProvider);
        }

        public Builder(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            this.alertDialog = createAlertDialog(context, i, resourcesProvider);
        }

        protected AlertDialog createAlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            return new AlertDialog(context, i, resourcesProvider);
        }

        public Context getContext() {
            return this.alertDialog.getContext();
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.alertDialog.items = charSequenceArr;
            this.alertDialog.onClickListener = onClickListener;
            return this;
        }

        public Builder setCheckFocusable(boolean z) {
            this.alertDialog.checkFocusable = z;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
            this.alertDialog.items = charSequenceArr;
            this.alertDialog.itemIcons = iArr;
            this.alertDialog.onClickListener = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            return setView(view, -2);
        }

        public Builder setView(View view, int i) {
            this.alertDialog.customView = view;
            this.alertDialog.customViewHeight = i;
            return this;
        }

        public Builder setWidth(int i) {
            this.alertDialog.customWidth = i;
            return this;
        }

        public Builder aboveMessageView(View view) {
            this.alertDialog.aboveMessageView = view;
            return this;
        }

        public Builder addBottomView(View view) {
            this.alertDialog.bottomView = view;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.alertDialog.title = charSequence;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.alertDialog.subtitle = charSequence;
            return this;
        }

        public Builder setTopView(View view) {
            this.alertDialog.topView = view;
            return this;
        }

        public Builder setDialogButtonColorKey(int i) {
            this.alertDialog.dialogButtonColorKey = i;
            return this;
        }

        public Builder setTopAnimation(int i, int i2, boolean z, int i3) {
            return setTopAnimation(i, i2, z, i3, null);
        }

        public Builder setTopAnimation(int i, int i2, boolean z, int i3, Map<String, Integer> map) {
            this.alertDialog.topAnimationId = i;
            this.alertDialog.topAnimationSize = i2;
            this.alertDialog.topAnimationAutoRepeat = z;
            this.alertDialog.topBackgroundColor = i3;
            this.alertDialog.topAnimationLayerColors = map;
            return this;
        }

        public Builder setTopAnimationIsNew(boolean z) {
            this.alertDialog.topAnimationIsNew = z;
            return this;
        }

        public Builder setTopImage(Drawable drawable, int i) {
            this.alertDialog.topDrawable = drawable;
            this.alertDialog.topBackgroundColor = i;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.alertDialog.message = charSequence;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.alertDialog.positiveButtonText = charSequence;
            this.alertDialog.positiveButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.alertDialog.negativeButtonText = charSequence;
            this.alertDialog.negativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.alertDialog.neutralButtonText = charSequence;
            this.alertDialog.neutralButtonListener = onClickListener;
            return this;
        }

        public Builder setOnBackButtonListener(DialogInterface.OnClickListener onClickListener) {
            this.alertDialog.onBackButtonListener = onClickListener;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.alertDialog.setOnCancelListener(onCancelListener);
            return this;
        }

        public Builder setCustomViewOffset(int i) {
            this.alertDialog.customViewOffset = i;
            return this;
        }

        public Builder setMessageTextViewClickable(boolean z) {
            this.alertDialog.messageTextViewClickable = z;
            return this;
        }

        public AlertDialog create() {
            return this.alertDialog;
        }

        public AlertDialog show() {
            this.alertDialog.show();
            return this.alertDialog;
        }

        public Runnable getDismissRunnable() {
            return this.alertDialog.dismissRunnable;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.alertDialog.setOnDismissListener(onDismissListener);
            return this;
        }

        public void setTopViewAspectRatio(float f) {
            this.alertDialog.aspectRatio = f;
        }

        public Builder setDimEnabled(boolean z) {
            this.alertDialog.dimEnabled = z;
            return this;
        }

        public Builder setDimAlpha(float f) {
            this.alertDialog.dimAlpha = f;
            return this;
        }

        public void notDrawBackgroundOnTopView(boolean z) {
            this.alertDialog.notDrawBackgroundOnTopView = z;
            this.alertDialog.blurredBackground = false;
        }

        public void setButtonsVertical(boolean z) {
            this.alertDialog.verticalButtons = z;
        }

        public Builder setOnPreDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.alertDialog.onDismissListener = onDismissListener;
            return this;
        }

        public Builder overrideDismissListener(Utilities.Callback<Runnable> callback) {
            this.alertDialog.overridenDissmissListener = callback;
            return this;
        }

        public Builder setAdditionalHorizontalPadding(int i) {
            this.alertDialog.additioanalHorizontalPadding = i;
            return this;
        }

        public Builder makeCustomMaxHeight() {
            this.alertDialog.customMaxHeight = true;
            return this;
        }
    }
}
