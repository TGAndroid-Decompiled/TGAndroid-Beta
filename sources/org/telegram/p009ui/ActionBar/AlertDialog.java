package org.telegram.p009ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LineProgressView;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.RadialProgressView;
import org.telegram.p009ui.Components.spoilers.SpoilersTextView;

public class AlertDialog extends Dialog implements Drawable.Callback, NotificationCenter.NotificationCenterDelegate {
    private float aspectRatio;
    private Rect backgroundPaddings;
    protected ViewGroup buttonsLayout;
    private boolean canCacnel;
    private AlertDialog cancelDialog;
    private boolean checkFocusable;
    private ScrollView contentScrollView;
    private int currentProgress;
    private View customView;
    private int customViewHeight;
    private int customViewOffset;
    private String dialogButtonColorKey;
    private float dimAlpha;
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
    private CharSequence subtitle;
    private TextView subtitleTextView;
    private CharSequence title;
    private FrameLayout titleContainer;
    private TextView titleTextView;
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

    public void lambda$new$0() {
        if (isShowing()) {
            return;
        }
        try {
            show();
        } catch (Exception unused) {
        }
    }

    public static class AlertDialogCell extends FrameLayout {
        private ImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private TextView textView;

        public AlertDialogCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor("dialogButtonSelector"), 2));
            setPadding(AndroidUtilities.m35dp(23.0f), 0, AndroidUtilities.m35dp(23.0f), 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogIcon"), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createFrame(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(getThemedColor("dialogTextBlack"));
            this.textView.setTextSize(1, 16.0f);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(48.0f), 1073741824));
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
                this.textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.m35dp(56.0f), 0, LocaleController.isRTL ? AndroidUtilities.m35dp(56.0f) : 0, 0);
                return;
            }
            this.imageView.setVisibility(4);
            this.textView.setPadding(0, 0, 0, 0);
        }

        private int getThemedColor(String str) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
            return color != null ? color.intValue() : Theme.getColor(str);
        }
    }

    public AlertDialog(Context context, int i) {
        this(context, i, null);
    }

    public AlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, C1010R.style.TransparentDialog);
        this.customViewHeight = -2;
        this.shadow = new BitmapDrawable[2];
        this.shadowVisibility = new boolean[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.customViewOffset = 20;
        this.dialogButtonColorKey = "dialogButton";
        this.topHeight = 132;
        this.messageTextViewClickable = true;
        this.canCacnel = true;
        this.dismissDialogByButtons = true;
        this.checkFocusable = true;
        this.dismissRunnable = new Runnable() {
            @Override
            public final void run() {
                AlertDialog.this.dismiss();
            }
        };
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
        this.resourcesProvider = resourcesProvider;
        this.backgroundPaddings = new Rect();
        if (i != 3) {
            Drawable mutate = context.getResources().getDrawable(C1010R.C1011drawable.popup_fixed_alert3).mutate();
            this.shadowDrawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
            this.shadowDrawable.getPadding(this.backgroundPaddings);
        }
        this.progressViewStyle = i;
    }

    @Override
    protected void onCreate(Bundle bundle) {
        int m35dp;
        super.onCreate(bundle);
        C11151 c11151 = new C11151(getContext());
        c11151.setOrientation(1);
        if (this.progressViewStyle == 3) {
            c11151.setBackgroundDrawable(null);
            c11151.setPadding(0, 0, 0, 0);
            this.drawBackground = false;
        } else if (this.notDrawBackgroundOnTopView) {
            Rect rect = new Rect();
            this.shadowDrawable.getPadding(rect);
            c11151.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            this.drawBackground = true;
        } else {
            c11151.setBackgroundDrawable(null);
            c11151.setPadding(0, 0, 0, 0);
            c11151.setBackgroundDrawable(this.shadowDrawable);
            this.drawBackground = false;
        }
        c11151.setFitsSystemWindows(Build.VERSION.SDK_INT >= 21);
        setContentView(c11151);
        boolean z = (this.positiveButtonText == null && this.negativeButtonText == null && this.neutralButtonText == null) ? false : true;
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
                gradientDrawable.setCornerRadius(AndroidUtilities.m35dp(128.0f));
                this.topImageView.setBackground(new Drawable() {
                    int size;

                    {
                        this.size = AlertDialog.this.topAnimationSize + AndroidUtilities.m35dp(52.0f);
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
                this.topImageView.setBackgroundDrawable(getContext().getResources().getDrawable(C1010R.C1011drawable.popup_fixed_top));
                this.topImageView.getBackground().setColorFilter(new PorterDuffColorFilter(this.topBackgroundColor, PorterDuff.Mode.MULTIPLY));
            }
            if (this.topAnimationIsNew) {
                this.topImageView.setTranslationY(AndroidUtilities.m35dp(16.0f));
            } else {
                this.topImageView.setTranslationY(0.0f);
            }
            this.topImageView.setPadding(0, 0, 0, 0);
            c11151.addView(this.topImageView, LayoutHelper.createLinear(-1, this.topHeight, 51, -8, -8, 0, 0));
        } else {
            View view = this.topView;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                c11151.addView(this.topView, LayoutHelper.createLinear(-1, this.topHeight, 51, 0, 0, 0, 0));
            }
        }
        if (this.title != null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.titleContainer = frameLayout;
            c11151.addView(frameLayout, LayoutHelper.createLinear(-2, -2, this.topAnimationIsNew ? 1 : 0, 24, 0, 24, 0));
            SpoilersTextView spoilersTextView = new SpoilersTextView(getContext(), false);
            this.titleTextView = spoilersTextView;
            spoilersTextView.setText(this.title);
            this.titleTextView.setTextColor(getThemedColor("dialogTextBlack"));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleTextView.setGravity((this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout2 = this.titleContainer;
            TextView textView = this.titleTextView;
            boolean z2 = this.topAnimationIsNew;
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 19.0f, 0.0f, z2 ? 4.0f : this.subtitle != null ? 2 : this.items != null ? 14 : 10));
        }
        if (this.secondTitle != null && this.title != null) {
            TextView textView2 = new TextView(getContext());
            this.secondTitleTextView = textView2;
            textView2.setText(this.secondTitle);
            this.secondTitleTextView.setTextColor(getThemedColor("dialogTextGray3"));
            this.secondTitleTextView.setTextSize(1, 18.0f);
            this.secondTitleTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            this.titleContainer.addView(this.secondTitleTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 0.0f, 21.0f, 0.0f, 0.0f));
        }
        if (this.subtitle != null) {
            TextView textView3 = new TextView(getContext());
            this.subtitleTextView = textView3;
            textView3.setText(this.subtitle);
            this.subtitleTextView.setTextColor(getThemedColor("dialogIcon"));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            c11151.addView(this.subtitleTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.items != null ? 14 : 10));
        }
        if (this.progressViewStyle == 0) {
            this.shadow[0] = (BitmapDrawable) getContext().getResources().getDrawable(C1010R.C1011drawable.header_shadow).mutate();
            this.shadow[1] = (BitmapDrawable) getContext().getResources().getDrawable(C1010R.C1011drawable.header_shadow_reverse).mutate();
            this.shadow[0].setAlpha(0);
            this.shadow[1].setAlpha(0);
            this.shadow[0].setCallback(this);
            this.shadow[1].setCallback(this);
            ScrollView scrollView = new ScrollView(getContext()) {
                @Override
                protected boolean drawChild(Canvas canvas, View view2, long j) {
                    boolean drawChild = super.drawChild(canvas, view2, j);
                    if (AlertDialog.this.shadow[0].getPaint().getAlpha() != 0) {
                        AlertDialog.this.shadow[0].setBounds(0, getScrollY(), getMeasuredWidth(), getScrollY() + AndroidUtilities.m35dp(3.0f));
                        AlertDialog.this.shadow[0].draw(canvas);
                    }
                    if (AlertDialog.this.shadow[1].getPaint().getAlpha() != 0) {
                        AlertDialog.this.shadow[1].setBounds(0, (getScrollY() + getMeasuredHeight()) - AndroidUtilities.m35dp(3.0f), getMeasuredWidth(), getScrollY() + getMeasuredHeight());
                        AlertDialog.this.shadow[1].draw(canvas);
                    }
                    return drawChild;
                }
            };
            this.contentScrollView = scrollView;
            scrollView.setVerticalScrollBarEnabled(false);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.contentScrollView, getThemedColor("dialogScrollGlow"));
            c11151.addView(this.contentScrollView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.scrollContainer = linearLayout;
            linearLayout.setOrientation(1);
            this.contentScrollView.addView(this.scrollContainer, new FrameLayout.LayoutParams(-1, -2));
        }
        SpoilersTextView spoilersTextView2 = new SpoilersTextView(this, getContext(), false) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(14.0f), false), bufferType);
            }
        };
        this.messageTextView = spoilersTextView2;
        NotificationCenter.listenEmojiLoading(spoilersTextView2);
        this.messageTextView.setTextColor(getThemedColor(this.topAnimationIsNew ? "windowBackgroundWhiteGrayText" : "dialogTextBlack"));
        this.messageTextView.setTextSize(1, 16.0f);
        this.messageTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.messageTextView.setLinkTextColor(getThemedColor("dialogTextLink"));
        if (!this.messageTextViewClickable) {
            this.messageTextView.setClickable(false);
            this.messageTextView.setEnabled(false);
        }
        this.messageTextView.setGravity((this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48);
        int i4 = this.progressViewStyle;
        if (i4 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(getContext());
            this.progressViewContainer = frameLayout3;
            c11151.addView(frameLayout3, LayoutHelper.createLinear(-1, 44, 51, 23, this.title == null ? 24 : 0, 23, 24));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), this.resourcesProvider);
            radialProgressView.setProgressColor(getThemedColor("dialogProgressCircle"));
            this.progressViewContainer.addView(radialProgressView, LayoutHelper.createFrame(44, 44, (LocaleController.isRTL ? 5 : 3) | 48));
            this.messageTextView.setLines(1);
            this.messageTextView.setEllipsize(TextUtils.TruncateAt.END);
            FrameLayout frameLayout4 = this.progressViewContainer;
            TextView textView4 = this.messageTextView;
            boolean z3 = LocaleController.isRTL;
            frameLayout4.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 0 : 62, 0.0f, z3 ? 62 : 0, 0.0f));
        } else if (i4 == 2) {
            c11151.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.title == null ? 19 : 0, 24, 20));
            LineProgressView lineProgressView = new LineProgressView(getContext());
            this.lineProgressView = lineProgressView;
            lineProgressView.setProgress(this.currentProgress / 100.0f, false);
            this.lineProgressView.setProgressColor(getThemedColor("dialogLineProgress"));
            this.lineProgressView.setBackColor(getThemedColor("dialogLineProgressBackground"));
            c11151.addView(this.lineProgressView, LayoutHelper.createLinear(-1, 4, 19, 24, 0, 24, 0));
            TextView textView5 = new TextView(getContext());
            this.lineProgressViewPercent = textView5;
            textView5.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.lineProgressViewPercent.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.lineProgressViewPercent.setTextColor(getThemedColor("dialogTextGray2"));
            this.lineProgressViewPercent.setTextSize(1, 14.0f);
            c11151.addView(this.lineProgressViewPercent, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            updateLineProgressTextView();
        } else if (i4 == 3) {
            setCanceledOnTouchOutside(false);
            setCancelable(false);
            FrameLayout frameLayout5 = new FrameLayout(getContext());
            this.progressViewContainer = frameLayout5;
            frameLayout5.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(18.0f), getThemedColor("dialog_inlineProgressBackground")));
            c11151.addView(this.progressViewContainer, LayoutHelper.createLinear(86, 86, 17));
            RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), this.resourcesProvider);
            radialProgressView2.setProgressColor(getThemedColor("dialog_inlineProgress"));
            this.progressViewContainer.addView(radialProgressView2, LayoutHelper.createLinear(86, 86));
        } else {
            this.scrollContainer.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (this.topAnimationIsNew ? 1 : LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.customView == null && this.items == null) ? 0 : this.customViewOffset));
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
                        public final void onClick(View view2) {
                            AlertDialog.this.lambda$onCreate$1(view2);
                        }
                    });
                }
                i5++;
            }
        }
        View view2 = this.customView;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            this.scrollContainer.addView(this.customView, LayoutHelper.createLinear(-1, this.customViewHeight));
        }
        if (z) {
            if (!this.verticalButtons) {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(AndroidUtilities.m35dp(14.0f));
                CharSequence charSequence2 = this.positiveButtonText;
                int measureText = charSequence2 != null ? (int) (0 + textPaint.measureText(charSequence2, 0, charSequence2.length()) + AndroidUtilities.m35dp(10.0f)) : 0;
                CharSequence charSequence3 = this.negativeButtonText;
                if (charSequence3 != null) {
                    measureText = (int) (measureText + textPaint.measureText(charSequence3, 0, charSequence3.length()) + AndroidUtilities.m35dp(10.0f));
                }
                CharSequence charSequence4 = this.neutralButtonText;
                if (charSequence4 != null) {
                    measureText = (int) (measureText + textPaint.measureText(charSequence4, 0, charSequence4.length()) + AndroidUtilities.m35dp(10.0f));
                }
                if (measureText > AndroidUtilities.displaySize.x - AndroidUtilities.m35dp(110.0f)) {
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
                        View view3 = null;
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
                                    view3 = childAt;
                                } else if (num.intValue() == -2) {
                                    if (LocaleController.isRTL) {
                                        int paddingLeft = getPaddingLeft();
                                        if (view3 != null) {
                                            paddingLeft += view3.getMeasuredWidth() + AndroidUtilities.m35dp(8.0f);
                                        }
                                        childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                                    } else {
                                        int paddingRight = (i12 - getPaddingRight()) - childAt.getMeasuredWidth();
                                        if (view3 != null) {
                                            paddingRight -= view3.getMeasuredWidth() + AndroidUtilities.m35dp(8.0f);
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
                                if (view3 != null) {
                                    i10 = view3.getLeft() + ((view3.getMeasuredWidth() - measuredWidth) / 2);
                                    i11 = view3.getTop() + ((view3.getMeasuredHeight() - measuredHeight) / 2);
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
            this.buttonsLayout.setPadding(AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f));
            c11151.addView(this.buttonsLayout, LayoutHelper.createLinear(-1, 52));
            if (this.topAnimationIsNew) {
                this.buttonsLayout.setTranslationY(-AndroidUtilities.m35dp(8.0f));
            }
            if (this.positiveButtonText != null) {
                TextView textView6 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z4) {
                        super.setEnabled(z4);
                        setAlpha(z4 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.m35dp(6.0f), i6));
                    }
                };
                textView6.setMinWidth(AndroidUtilities.m35dp(64.0f));
                textView6.setTag(-1);
                textView6.setTextSize(1, 16.0f);
                textView6.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView6.setGravity(17);
                textView6.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView6.setText(this.positiveButtonText.toString());
                textView6.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.m35dp(6.0f), getThemedColor(this.dialogButtonColorKey)));
                textView6.setPadding(AndroidUtilities.m35dp(12.0f), 0, AndroidUtilities.m35dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView6, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView6, LayoutHelper.createFrame(-2, 36, 53));
                }
                textView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AlertDialog.this.lambda$onCreate$2(view3);
                    }
                });
            }
            if (this.negativeButtonText != null) {
                TextView textView7 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z4) {
                        super.setEnabled(z4);
                        setAlpha(z4 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.m35dp(6.0f), i6));
                    }
                };
                textView7.setMinWidth(AndroidUtilities.m35dp(64.0f));
                textView7.setTag(-2);
                textView7.setTextSize(1, 16.0f);
                textView7.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView7.setGravity(17);
                textView7.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView7.setEllipsize(TextUtils.TruncateAt.END);
                textView7.setSingleLine(true);
                textView7.setText(this.negativeButtonText.toString());
                textView7.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.m35dp(6.0f), getThemedColor(this.dialogButtonColorKey)));
                textView7.setPadding(AndroidUtilities.m35dp(12.0f), 0, AndroidUtilities.m35dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView7, 0, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView7, LayoutHelper.createFrame(-2, 36, 53));
                }
                textView7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AlertDialog.this.lambda$onCreate$3(view3);
                    }
                });
            }
            if (this.neutralButtonText != null) {
                TextView textView8 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z4) {
                        super.setEnabled(z4);
                        setAlpha(z4 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(AndroidUtilities.m35dp(6.0f), i6));
                    }
                };
                textView8.setMinWidth(AndroidUtilities.m35dp(64.0f));
                textView8.setTag(-3);
                textView8.setTextSize(1, 16.0f);
                textView8.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView8.setGravity(17);
                textView8.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView8.setEllipsize(TextUtils.TruncateAt.END);
                textView8.setSingleLine(true);
                textView8.setText(this.neutralButtonText.toString());
                textView8.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.m35dp(6.0f), getThemedColor(this.dialogButtonColorKey)));
                textView8.setPadding(AndroidUtilities.m35dp(12.0f), 0, AndroidUtilities.m35dp(12.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView8, 1, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView8, LayoutHelper.createFrame(-2, 36, 51));
                }
                textView8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AlertDialog.this.lambda$onCreate$4(view3);
                    }
                });
            }
            if (this.verticalButtons) {
                for (int i6 = 1; i6 < this.buttonsLayout.getChildCount(); i6++) {
                    ((ViewGroup.MarginLayoutParams) this.buttonsLayout.getChildAt(i6).getLayoutParams()).topMargin = AndroidUtilities.m35dp(6.0f);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        if (this.progressViewStyle == 3) {
            layoutParams.width = -1;
        } else {
            if (this.dimEnabled && !this.dimCustom) {
                layoutParams.dimAmount = this.dimAlpha;
                layoutParams.flags |= 2;
            } else {
                layoutParams.dimAmount = 0.0f;
                layoutParams.flags ^= 2;
            }
            int i7 = AndroidUtilities.displaySize.x;
            this.lastScreenWidth = i7;
            int m35dp2 = i7 - AndroidUtilities.m35dp(48.0f);
            if (AndroidUtilities.isTablet()) {
                if (AndroidUtilities.isSmallTablet()) {
                    m35dp = AndroidUtilities.m35dp(446.0f);
                } else {
                    m35dp = AndroidUtilities.m35dp(496.0f);
                }
            } else {
                m35dp = AndroidUtilities.m35dp(356.0f);
            }
            int min = Math.min(m35dp, m35dp2);
            Rect rect2 = this.backgroundPaddings;
            layoutParams.width = min + rect2.left + rect2.right;
        }
        View view3 = this.customView;
        if (view3 != null && this.checkFocusable && canTextInput(view3)) {
            layoutParams.softInputMode = 4;
        } else {
            layoutParams.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 0;
        }
        window.setAttributes(layoutParams);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public class C11151 extends LinearLayout {
        private boolean inLayout;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        C11151(Context context) {
            super(context);
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ActionBar.AlertDialog.C11151.onMeasure(int, int):void");
        }

        public void lambda$onMeasure$0() {
            int m35dp;
            AlertDialog.this.lastScreenWidth = AndroidUtilities.displaySize.x;
            int m35dp2 = AndroidUtilities.displaySize.x - AndroidUtilities.m35dp(56.0f);
            if (AndroidUtilities.isTablet()) {
                if (AndroidUtilities.isSmallTablet()) {
                    m35dp = AndroidUtilities.m35dp(446.0f);
                } else {
                    m35dp = AndroidUtilities.m35dp(496.0f);
                }
            } else {
                m35dp = AndroidUtilities.m35dp(356.0f);
            }
            Window window = AlertDialog.this.getWindow();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = Math.min(m35dp, m35dp2) + AlertDialog.this.backgroundPaddings.left + AlertDialog.this.backgroundPaddings.right;
            try {
                window.setAttributes(layoutParams);
            } catch (Throwable th) {
                FileLog.m31e(th);
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
                            AlertDialog.C11151.this.lambda$onLayout$1();
                        }
                    };
                    AlertDialog.this.contentScrollView.getViewTreeObserver().addOnScrollChangedListener(AlertDialog.this.onScrollChangedListener);
                }
                AlertDialog.this.onScrollChangedListener.onScrollChanged();
            }
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
        protected void dispatchDraw(Canvas canvas) {
            if (AlertDialog.this.drawBackground) {
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

    public void lambda$onCreate$1(View view) {
        DialogInterface.OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, ((Integer) view.getTag()).intValue());
        }
        dismiss();
    }

    public void lambda$onCreate$2(View view) {
        DialogInterface.OnClickListener onClickListener = this.positiveButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -1);
        }
        if (this.dismissDialogByButtons) {
            dismiss();
        }
    }

    public void lambda$onCreate$3(View view) {
        DialogInterface.OnClickListener onClickListener = this.negativeButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
        if (this.dismissDialogByButtons) {
            cancel();
        }
    }

    public void lambda$onCreate$4(View view) {
        DialogInterface.OnClickListener onClickListener = this.neutralButtonListener;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        }
        if (this.dismissDialogByButtons) {
            dismiss();
        }
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
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i) {
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.messageTextView;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public void showCancelAlert() {
        if (this.canCacnel && this.cancelDialog == null) {
            Builder builder = new Builder(getContext());
            builder.setTitle(LocaleController.getString("AppName", C1010R.string.AppName));
            builder.setMessage(LocaleController.getString("StopLoading", C1010R.string.StopLoading));
            builder.setPositiveButton(LocaleController.getString("WaitMore", C1010R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString("Stop", C1010R.string.Stop), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AlertDialog.this.lambda$showCancelAlert$5(dialogInterface, i);
                }
            });
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AlertDialog.this.lambda$showCancelAlert$6(dialogInterface);
                }
            });
            try {
                this.cancelDialog = builder.show();
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$showCancelAlert$5(DialogInterface dialogInterface, int i) {
        DialogInterface.OnCancelListener onCancelListener = this.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
        dismiss();
    }

    public void lambda$showCancelAlert$6(DialogInterface dialogInterface) {
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
            FileLog.m31e(e);
        }
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

    @Override
    public void dismiss() {
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
    }

    @Override
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.title = charSequence;
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
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

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
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
            this.alertDialog = new AlertDialog(context, i, resourcesProvider);
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

        public Builder setDialogButtonColorKey(String str) {
            this.alertDialog.dialogButtonColorKey = str;
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
        }

        public void setButtonsVertical(boolean z) {
            this.alertDialog.verticalButtons = z;
        }

        public Builder setOnPreDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.alertDialog.onDismissListener = onDismissListener;
            return this;
        }
    }
}
