package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class AlertDialog extends Dialog implements Drawable.Callback {
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
        if (!isShowing()) {
            try {
                show();
            } catch (Exception unused) {
            }
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
            setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogIcon"), PorterDuff.Mode.MULTIPLY));
            int i = 5;
            addView(this.imageView, LayoutHelper.createFrame(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setTextColor(getThemedColor("dialogTextBlack"));
            this.textView.setTextSize(1, 16.0f);
            addView(this.textView, LayoutHelper.createFrame(-2, -2, (!LocaleController.isRTL ? 3 : i) | 16));
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
        super(context, R.style.TransparentDialog);
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
        this.dimAlpha = 0.6f;
        this.topAnimationAutoRepeat = true;
        this.resourcesProvider = resourcesProvider;
        this.backgroundPaddings = new Rect();
        if (i != 3) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
            this.shadowDrawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
            this.shadowDrawable.getPadding(this.backgroundPaddings);
        }
        this.progressViewStyle = i;
    }

    @Override
    protected void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        super.onCreate(bundle);
        AnonymousClass1 r1 = new AnonymousClass1(getContext());
        r1.setOrientation(1);
        if (this.progressViewStyle == 3) {
            r1.setBackgroundDrawable(null);
            r1.setPadding(0, 0, 0, 0);
            this.drawBackground = false;
        } else if (this.notDrawBackgroundOnTopView) {
            Rect rect = new Rect();
            this.shadowDrawable.getPadding(rect);
            r1.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            this.drawBackground = true;
        } else {
            r1.setBackgroundDrawable(null);
            r1.setPadding(0, 0, 0, 0);
            r1.setBackgroundDrawable(this.shadowDrawable);
            this.drawBackground = false;
        }
        r1.setFitsSystemWindows(Build.VERSION.SDK_INT >= 21);
        setContentView(r1);
        boolean z = (this.positiveButtonText == null && this.negativeButtonText == null && this.neutralButtonText == null) ? false : true;
        if (this.topResId == 0 && this.topAnimationId == 0 && this.topDrawable == null) {
            View view = this.topView;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                r1.addView(this.topView, LayoutHelper.createLinear(-1, this.topHeight, 51, 0, 0, 0, 0));
            }
        } else {
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            this.topImageView = rLottieImageView;
            Drawable drawable = this.topDrawable;
            if (drawable != null) {
                rLottieImageView.setImageDrawable(drawable);
            } else {
                int i5 = this.topResId;
                if (i5 != 0) {
                    rLottieImageView.setImageResource(i5);
                } else {
                    rLottieImageView.setAutoRepeat(this.topAnimationAutoRepeat);
                    RLottieImageView rLottieImageView2 = this.topImageView;
                    int i6 = this.topAnimationId;
                    int i7 = this.topAnimationSize;
                    rLottieImageView2.setAnimation(i6, i7, i7);
                    this.topImageView.playAnimation();
                }
            }
            this.topImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.topImageView.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.popup_fixed_top));
            this.topImageView.getBackground().setColorFilter(new PorterDuffColorFilter(this.topBackgroundColor, PorterDuff.Mode.MULTIPLY));
            this.topImageView.setPadding(0, 0, 0, 0);
            r1.addView(this.topImageView, LayoutHelper.createLinear(-1, this.topHeight, 51, -8, -8, 0, 0));
        }
        if (this.title != null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.titleContainer = frameLayout;
            r1.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.titleTextView = textView;
            textView.setText(this.title);
            this.titleTextView.setTextColor(getThemedColor("dialogTextBlack"));
            this.titleTextView.setTextSize(1, 20.0f);
            this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout2 = this.titleContainer;
            TextView textView2 = this.titleTextView;
            int i8 = (LocaleController.isRTL ? 5 : 3) | 48;
            if (this.subtitle != null) {
                i4 = 2;
            } else {
                i4 = this.items != null ? 14 : 10;
            }
            frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, i8, 0.0f, 19.0f, 0.0f, i4));
        }
        if (!(this.secondTitle == null || this.title == null)) {
            TextView textView3 = new TextView(getContext());
            this.secondTitleTextView = textView3;
            textView3.setText(this.secondTitle);
            this.secondTitleTextView.setTextColor(getThemedColor("dialogTextGray3"));
            this.secondTitleTextView.setTextSize(1, 18.0f);
            this.secondTitleTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            this.titleContainer.addView(this.secondTitleTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 0.0f, 21.0f, 0.0f, 0.0f));
        }
        if (this.subtitle != null) {
            TextView textView4 = new TextView(getContext());
            this.subtitleTextView = textView4;
            textView4.setText(this.subtitle);
            this.subtitleTextView.setTextColor(getThemedColor("dialogIcon"));
            this.subtitleTextView.setTextSize(1, 14.0f);
            this.subtitleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            r1.addView(this.subtitleTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, this.items != null ? 14 : 10));
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
            AndroidUtilities.setScrollViewEdgeEffectColor(this.contentScrollView, getThemedColor("dialogScrollGlow"));
            r1.addView(this.contentScrollView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.scrollContainer = linearLayout;
            linearLayout.setOrientation(1);
            this.contentScrollView.addView(this.scrollContainer, new FrameLayout.LayoutParams(-1, -2));
        }
        SpoilersTextView spoilersTextView = new SpoilersTextView(getContext());
        this.messageTextView = spoilersTextView;
        spoilersTextView.setTextColor(getThemedColor("dialogTextBlack"));
        this.messageTextView.setTextSize(1, 16.0f);
        this.messageTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        this.messageTextView.setLinkTextColor(getThemedColor("dialogTextLink"));
        if (!this.messageTextViewClickable) {
            this.messageTextView.setClickable(false);
            this.messageTextView.setEnabled(false);
        }
        this.messageTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        int i9 = this.progressViewStyle;
        if (i9 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(getContext());
            this.progressViewContainer = frameLayout3;
            r1.addView(frameLayout3, LayoutHelper.createLinear(-1, 44, 51, 23, this.title == null ? 24 : 0, 23, 24));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), this.resourcesProvider);
            radialProgressView.setProgressColor(getThemedColor("dialogProgressCircle"));
            this.progressViewContainer.addView(radialProgressView, LayoutHelper.createFrame(44, 44, (LocaleController.isRTL ? 5 : 3) | 48));
            this.messageTextView.setLines(1);
            this.messageTextView.setEllipsize(TextUtils.TruncateAt.END);
            FrameLayout frameLayout4 = this.progressViewContainer;
            TextView textView5 = this.messageTextView;
            boolean z2 = LocaleController.isRTL;
            frameLayout4.addView(textView5, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 0 : 62, 0.0f, z2 ? 62 : 0, 0.0f));
        } else if (i9 == 2) {
            r1.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, this.title == null ? 19 : 0, 24, 20));
            LineProgressView lineProgressView = new LineProgressView(getContext());
            this.lineProgressView = lineProgressView;
            lineProgressView.setProgress(this.currentProgress / 100.0f, false);
            this.lineProgressView.setProgressColor(getThemedColor("dialogLineProgress"));
            this.lineProgressView.setBackColor(getThemedColor("dialogLineProgressBackground"));
            r1.addView(this.lineProgressView, LayoutHelper.createLinear(-1, 4, 19, 24, 0, 24, 0));
            TextView textView6 = new TextView(getContext());
            this.lineProgressViewPercent = textView6;
            textView6.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.lineProgressViewPercent.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            this.lineProgressViewPercent.setTextColor(getThemedColor("dialogTextGray2"));
            this.lineProgressViewPercent.setTextSize(1, 14.0f);
            r1.addView(this.lineProgressViewPercent, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 23, 4, 23, 24));
            updateLineProgressTextView();
        } else if (i9 == 3) {
            setCanceledOnTouchOutside(false);
            setCancelable(false);
            FrameLayout frameLayout5 = new FrameLayout(getContext());
            this.progressViewContainer = frameLayout5;
            frameLayout5.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), getThemedColor("dialog_inlineProgressBackground")));
            r1.addView(this.progressViewContainer, LayoutHelper.createLinear(86, 86, 17));
            RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), this.resourcesProvider);
            radialProgressView2.setProgressColor(getThemedColor("dialog_inlineProgress"));
            this.progressViewContainer.addView(radialProgressView2, LayoutHelper.createLinear(86, 86));
        } else {
            this.scrollContainer.addView(this.messageTextView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 24, 0, 24, (this.customView == null && this.items == null) ? 0 : this.customViewOffset));
        }
        if (!TextUtils.isEmpty(this.message)) {
            this.messageTextView.setText(this.message);
            this.messageTextView.setVisibility(0);
        } else {
            this.messageTextView.setVisibility(8);
        }
        if (this.items != null) {
            int i10 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i10 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i10] != null) {
                    AlertDialogCell alertDialogCell = new AlertDialogCell(getContext(), this.resourcesProvider);
                    CharSequence charSequence = this.items[i10];
                    int[] iArr = this.itemIcons;
                    alertDialogCell.setTextAndIcon(charSequence, iArr != null ? iArr[i10] : 0);
                    alertDialogCell.setTag(Integer.valueOf(i10));
                    this.itemViews.add(alertDialogCell);
                    this.scrollContainer.addView(alertDialogCell, LayoutHelper.createLinear(-1, 50));
                    alertDialogCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            AlertDialog.this.lambda$onCreate$1(view2);
                        }
                    });
                }
                i10++;
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
                    protected void onLayout(boolean z3, int i11, int i12, int i13, int i14) {
                        int i15;
                        int i16;
                        int childCount = getChildCount();
                        int i17 = i13 - i11;
                        View view3 = null;
                        for (int i18 = 0; i18 < childCount; i18++) {
                            View childAt = getChildAt(i18);
                            Integer num = (Integer) childAt.getTag();
                            if (num == null) {
                                int measuredWidth = childAt.getMeasuredWidth();
                                int measuredHeight = childAt.getMeasuredHeight();
                                if (view3 != null) {
                                    i16 = view3.getLeft() + ((view3.getMeasuredWidth() - measuredWidth) / 2);
                                    i15 = view3.getTop() + ((view3.getMeasuredHeight() - measuredHeight) / 2);
                                } else {
                                    i16 = 0;
                                    i15 = 0;
                                }
                                childAt.layout(i16, i15, measuredWidth + i16, measuredHeight + i15);
                            } else if (num.intValue() == -1) {
                                if (LocaleController.isRTL) {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
                                } else {
                                    childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), getPaddingTop() + childAt.getMeasuredHeight());
                                }
                                view3 = childAt;
                            } else if (num.intValue() == -2) {
                                if (LocaleController.isRTL) {
                                    int paddingLeft = getPaddingLeft();
                                    if (view3 != null) {
                                        paddingLeft += view3.getMeasuredWidth() + AndroidUtilities.dp(8.0f);
                                    }
                                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                                } else {
                                    int paddingRight = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                    if (view3 != null) {
                                        paddingRight -= view3.getMeasuredWidth() + AndroidUtilities.dp(8.0f);
                                    }
                                    childAt.layout(paddingRight, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight, getPaddingTop() + childAt.getMeasuredHeight());
                                }
                            } else if (num.intValue() == -3) {
                                if (LocaleController.isRTL) {
                                    childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), getPaddingTop() + childAt.getMeasuredHeight());
                                } else {
                                    childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
                                }
                            }
                        }
                    }

                    @Override
                    protected void onMeasure(int i11, int i12) {
                        super.onMeasure(i11, i12);
                        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                        int childCount = getChildCount();
                        int i13 = 0;
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = getChildAt(i14);
                            if ((childAt instanceof TextView) && childAt.getTag() != null) {
                                i13 += childAt.getMeasuredWidth();
                            }
                        }
                        if (i13 > measuredWidth) {
                            View findViewWithTag = findViewWithTag(-2);
                            View findViewWithTag2 = findViewWithTag(-3);
                            if (findViewWithTag != null && findViewWithTag2 != null) {
                                if (findViewWithTag.getMeasuredWidth() < findViewWithTag2.getMeasuredWidth()) {
                                    findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i13 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                                } else {
                                    findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i13 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                                }
                            }
                        }
                    }
                };
            }
            this.buttonsLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            r1.addView(this.buttonsLayout, LayoutHelper.createLinear(-1, 52));
            if (this.positiveButtonText != null) {
                TextView textView7 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z3) {
                        super.setEnabled(z3);
                        setAlpha(z3 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i11) {
                        super.setTextColor(i11);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(i11));
                    }
                };
                textView7.setMinWidth(AndroidUtilities.dp(64.0f));
                textView7.setTag(-1);
                textView7.setTextSize(1, 14.0f);
                textView7.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView7.setGravity(17);
                textView7.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView7.setText(this.positiveButtonText.toString().toUpperCase());
                textView7.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(getThemedColor(this.dialogButtonColorKey)));
                textView7.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView7, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView7, LayoutHelper.createFrame(-2, 36, 53));
                }
                textView7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AlertDialog.this.lambda$onCreate$2(view3);
                    }
                });
            }
            if (this.negativeButtonText != null) {
                TextView textView8 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z3) {
                        super.setEnabled(z3);
                        setAlpha(z3 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i11) {
                        super.setTextColor(i11);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(i11));
                    }
                };
                textView8.setMinWidth(AndroidUtilities.dp(64.0f));
                textView8.setTag(-2);
                textView8.setTextSize(1, 14.0f);
                textView8.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView8.setGravity(17);
                textView8.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView8.setEllipsize(TextUtils.TruncateAt.END);
                textView8.setSingleLine(true);
                textView8.setText(this.negativeButtonText.toString().toUpperCase());
                textView8.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(getThemedColor(this.dialogButtonColorKey)));
                textView8.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                if (this.verticalButtons) {
                    this.buttonsLayout.addView(textView8, 0, LayoutHelper.createLinear(-2, 36, LocaleController.isRTL ? 3 : 5));
                } else {
                    this.buttonsLayout.addView(textView8, LayoutHelper.createFrame(-2, 36, 53));
                }
                textView8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AlertDialog.this.lambda$onCreate$3(view3);
                    }
                });
            }
            if (this.neutralButtonText != null) {
                TextView textView9 = new TextView(this, getContext()) {
                    @Override
                    public void setEnabled(boolean z3) {
                        super.setEnabled(z3);
                        setAlpha(z3 ? 1.0f : 0.5f);
                    }

                    @Override
                    public void setTextColor(int i11) {
                        super.setTextColor(i11);
                        setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(i11));
                    }
                };
                textView9.setMinWidth(AndroidUtilities.dp(64.0f));
                textView9.setTag(-3);
                textView9.setTextSize(1, 14.0f);
                textView9.setTextColor(getThemedColor(this.dialogButtonColorKey));
                textView9.setGravity(17);
                textView9.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView9.setEllipsize(TextUtils.TruncateAt.END);
                textView9.setSingleLine(true);
                textView9.setText(this.neutralButtonText.toString().toUpperCase());
                textView9.setBackground(Theme.getRoundRectSelectorDrawable(getThemedColor(this.dialogButtonColorKey)));
                textView9.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
                if (this.verticalButtons) {
                    ViewGroup viewGroup = this.buttonsLayout;
                    if (LocaleController.isRTL) {
                        i3 = -2;
                        i2 = 3;
                    } else {
                        i3 = -2;
                        i2 = 5;
                    }
                    viewGroup.addView(textView9, 1, LayoutHelper.createLinear(i3, 36, i2));
                } else {
                    this.buttonsLayout.addView(textView9, LayoutHelper.createFrame(-2, 36, 51));
                }
                textView9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        AlertDialog.this.lambda$onCreate$4(view3);
                    }
                });
            }
            if (this.verticalButtons) {
                for (int i11 = 1; i11 < this.buttonsLayout.getChildCount(); i11++) {
                    ((ViewGroup.MarginLayoutParams) this.buttonsLayout.getChildAt(i11).getLayoutParams()).topMargin = AndroidUtilities.dp(6.0f);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        if (this.progressViewStyle == 3) {
            layoutParams.width = -1;
        } else {
            if (this.dimEnabled) {
                layoutParams.dimAmount = this.dimAlpha;
                layoutParams.flags |= 2;
            } else {
                layoutParams.dimAmount = 0.0f;
                layoutParams.flags ^= 2;
            }
            int i12 = AndroidUtilities.displaySize.x;
            this.lastScreenWidth = i12;
            int dp = i12 - AndroidUtilities.dp(48.0f);
            if (!AndroidUtilities.isTablet()) {
                i = AndroidUtilities.dp(356.0f);
            } else if (AndroidUtilities.isSmallTablet()) {
                i = AndroidUtilities.dp(446.0f);
            } else {
                i = AndroidUtilities.dp(496.0f);
            }
            int min = Math.min(i, dp);
            Rect rect2 = this.backgroundPaddings;
            layoutParams.width = min + rect2.left + rect2.right;
        }
        View view3 = this.customView;
        if (view3 == null || !this.checkFocusable || !canTextInput(view3)) {
            layoutParams.flags |= 131072;
        } else {
            layoutParams.softInputMode = 4;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 0;
        }
        window.setAttributes(layoutParams);
    }

    public class AnonymousClass1 extends LinearLayout {
        private boolean inLayout;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        AnonymousClass1(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (AlertDialog.this.progressViewStyle != 3) {
                return super.onTouchEvent(motionEvent);
            }
            AlertDialog.this.showCancelAlert();
            return false;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (AlertDialog.this.progressViewStyle != 3) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AlertDialog.this.showCancelAlert();
            return false;
        }

        @Override
        protected void onMeasure(int r13, int r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.AlertDialog.AnonymousClass1.onMeasure(int, int):void");
        }

        public void lambda$onMeasure$0() {
            int i;
            AlertDialog.this.lastScreenWidth = AndroidUtilities.displaySize.x;
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(56.0f);
            if (!AndroidUtilities.isTablet()) {
                i = AndroidUtilities.dp(356.0f);
            } else if (AndroidUtilities.isSmallTablet()) {
                i = AndroidUtilities.dp(446.0f);
            } else {
                i = AndroidUtilities.dp(496.0f);
            }
            Window window = AlertDialog.this.getWindow();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = Math.min(i, dp) + AlertDialog.this.backgroundPaddings.left + AlertDialog.this.backgroundPaddings.right;
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
            if (!this.inLayout) {
                super.requestLayout();
            }
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
        if (this.focusable != z) {
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
            builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
            builder.setMessage(LocaleController.getString("StopLoading", R.string.StopLoading));
            builder.setPositiveButton(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new DialogInterface.OnClickListener() {
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
        if ((z && !this.shadowVisibility[i]) || (!z && this.shadowVisibility[i])) {
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
                    if (AlertDialog.this.shadowAnimation[i] != null && AlertDialog.this.shadowAnimation[i].equals(animator)) {
                        AlertDialog.this.shadowAnimation[i] = null;
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (AlertDialog.this.shadowAnimation[i] != null && AlertDialog.this.shadowAnimation[i].equals(animator)) {
                        AlertDialog.this.shadowAnimation[i] = null;
                    }
                }
            });
            try {
                this.shadowAnimation[i].start();
            } catch (Exception e) {
                FileLog.e(e);
            }
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
        if (!(view instanceof ViewGroup)) {
            return false;
        }
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

    @Override
    public void dismiss() {
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
        if (i >= 0 && i < this.itemViews.size()) {
            AlertDialogCell alertDialogCell = this.itemViews.get(i);
            alertDialogCell.textView.setTextColor(i2);
            alertDialogCell.imageView.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        }
    }

    public int getItemsCount() {
        return this.itemViews.size();
    }

    public void setMessage(CharSequence charSequence) {
        this.message = charSequence;
        if (this.messageTextView == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.messageTextView.setText(this.message);
            this.messageTextView.setVisibility(0);
            return;
        }
        this.messageTextView.setVisibility(8);
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
            this.alertDialog.topAnimationId = i;
            this.alertDialog.topAnimationSize = i2;
            this.alertDialog.topAnimationAutoRepeat = z;
            this.alertDialog.topBackgroundColor = i3;
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
