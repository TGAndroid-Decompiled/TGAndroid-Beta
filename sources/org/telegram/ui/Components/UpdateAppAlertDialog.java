package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class UpdateAppAlertDialog extends BottomSheet {
    private int accountNum;
    private boolean animationInProgress;
    private BetaUpdate appUpdate;
    private boolean ignoreLayout;
    private LinearLayout linearLayout;
    private int[] location;
    private TextView messageTextView;
    private AnimatorSet progressAnimation;
    private RadialProgress radialProgress;
    private FrameLayout radialProgressView;
    private int scrollOffsetY;
    private NestedScrollView scrollView;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private Drawable shadowDrawable;
    private TextView textView;

    public class BottomSheetCell extends FrameLayout {
        private View background;
        private boolean hasBackground;
        private TextView[] textView;

        public BottomSheetCell(Context context, boolean z) {
            super(context);
            this.textView = new TextView[2];
            this.hasBackground = !z;
            setBackground(null);
            View view = new View(context);
            this.background = view;
            if (this.hasBackground) {
                view.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, new float[]{4.0f}));
            }
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, z ? 0.0f : 16.0f, 16.0f, 16.0f));
            for (int i = 0; i < 2; i++) {
                this.textView[i] = new TextView(context);
                this.textView[i].setLines(1);
                this.textView[i].setSingleLine(true);
                this.textView[i].setGravity(1);
                this.textView[i].setEllipsize(TextUtils.TruncateAt.END);
                this.textView[i].setGravity(17);
                if (this.hasBackground) {
                    this.textView[i].setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                    this.textView[i].setTypeface(AndroidUtilities.bold());
                } else {
                    this.textView[i].setTextColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                }
                this.textView[i].setTextSize(1, 14.0f);
                this.textView[i].setPadding(0, 0, 0, this.hasBackground ? 0 : AndroidUtilities.dp(13.0f));
                addView(this.textView[i], LayoutHelper.createFrame(-2, -2, 17));
                if (i == 1) {
                    this.textView[i].setAlpha(0.0f);
                }
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.hasBackground ? 80.0f : 50.0f), 1073741824));
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (!z) {
                this.textView[0].setText(charSequence);
                return;
            }
            this.textView[1].setText(charSequence);
            UpdateAppAlertDialog.this.animationInProgress = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.textView[0], (Property<TextView, Float>) property, 1.0f, 0.0f);
            TextView textView = this.textView[0];
            float[] fArr = {0.0f, -AndroidUtilities.dp(10.0f)};
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr), ObjectAnimator.ofFloat(this.textView[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.textView[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    UpdateAppAlertDialog.this.animationInProgress = false;
                    TextView textView2 = BottomSheetCell.this.textView[0];
                    BottomSheetCell.this.textView[0] = BottomSheetCell.this.textView[1];
                    BottomSheetCell.this.textView[1] = textView2;
                }
            });
            animatorSet.start();
        }
    }

    public UpdateAppAlertDialog(Context context, BetaUpdate betaUpdate, int i) {
        super(context, false);
        final int i2 = 1;
        final int i3 = 0;
        this.location = new int[2];
        this.appUpdate = betaUpdate;
        this.accountNum = i;
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable drawableMutate = context.getResources().getDrawable(2131232591).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackground, false), PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onDraw(Canvas canvas) {
                UpdateAppAlertDialog.this.shadowDrawable.setBounds(0, (int) ((UpdateAppAlertDialog.this.scrollOffsetY - ((BottomSheet) UpdateAppAlertDialog.this).backgroundPaddingTop) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                UpdateAppAlertDialog.this.shadowDrawable.draw(canvas);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || UpdateAppAlertDialog.this.scrollOffsetY == 0 || motionEvent.getY() >= UpdateAppAlertDialog.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                UpdateAppAlertDialog.this.lambda$showGiftOfferSheet$15();
                return true;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !UpdateAppAlertDialog.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                UpdateAppAlertDialog.this.updateLayout();
            }
        };
        frameLayout.setWillNotDraw(false);
        this.containerView = frameLayout;
        NestedScrollView nestedScrollView = new NestedScrollView(context) {
            private boolean ignoreLayout;

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                super.onLayout(z, i4, i5, i6, i7);
                UpdateAppAlertDialog.this.updateLayout();
            }

            @Override
            public void onMeasure(int i4, int i5) {
                int size = View.MeasureSpec.getSize(i5);
                measureChildWithMargins(UpdateAppAlertDialog.this.linearLayout, i4, 0, i5, 0);
                int measuredHeight = UpdateAppAlertDialog.this.linearLayout.getMeasuredHeight();
                int i6 = (size / 5) * 2;
                if (measuredHeight - (size - i6) >= AndroidUtilities.dp(90.0f)) {
                    if (measuredHeight < AndroidUtilities.dp(90.0f) + (size / 2)) {
                        i6 = size - measuredHeight;
                    }
                } else {
                    i6 = size - measuredHeight;
                }
                if (i6 < 0) {
                    i6 = 0;
                }
                if (getPaddingTop() != i6) {
                    this.ignoreLayout = true;
                    setPadding(0, i6, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            public void onScrollChanged(int i4, int i5, int i6, int i7) {
                super.onScrollChanged(i4, i5, i6, i7);
                UpdateAppAlertDialog.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.scrollView = nestedScrollView;
        nestedScrollView.setFillViewport(true);
        this.scrollView.setWillNotDraw(false);
        this.scrollView.setClipToPadding(false);
        this.scrollView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.linearLayout, LayoutHelper.createScroll(-1, -2, 51));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        int i4 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i4, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(2131690208));
        this.linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i5 = Theme.key_dialogTextLink;
        textView2.setLinkTextColor(Theme.getColor(null, i5, false));
        BetaUpdate betaUpdate2 = this.appUpdate;
        textView2.setText(LocaleController.formatString(2131690193, betaUpdate2.version, Integer.valueOf(betaUpdate2.versionCode)));
        textView2.setGravity(49);
        this.linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(this.appUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(null, i4, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(Theme.getColor(null, i5, false));
            textView3.setText(Emoji.replaceEmoji(this.appUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            this.linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        this.shadow.setAlpha(0.0f);
        this.shadow.setTag(1);
        frameLayout.addView(this.shadow, layoutParams);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            buttonWithCounterView.setText(LocaleController.formatString(2131690212, new Object[0]), false);
            buttonWithCounterView.setOnClickListener(new UndoView$$ExternalSyntheticLambda6(12, this, downloadedUpdateFile));
        } else {
            buttonWithCounterView.setText(LocaleController.formatString(2131690210, new Object[0]), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                public final UpdateAppAlertDialog f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$1(view2);
                            break;
                        default:
                            this.f$0.lambda$new$2(view2);
                            break;
                    }
                }
            });
        }
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, null);
        buttonWithCounterView2.setText(LocaleController.getString(2131690213), false);
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener(this) {
            public final UpdateAppAlertDialog f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$1(view2);
                        break;
                    default:
                        this.f$0.lambda$new$2(view2);
                        break;
                }
            }
        });
        frameLayout.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public void lambda$new$0(File file, View view) {
        Activity activityFindActivity;
        if (file == null || (activityFindActivity = AndroidUtilities.findActivity(getContext())) == null) {
            return;
        }
        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", activityFindActivity, null, false);
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1(View view) {
        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$2(View view) {
        lambda$showGiftOfferSheet$15();
    }

    private void runShadowAnimation(int i, final boolean z) {
        if ((!z || this.shadow.getTag() == null) && (z || this.shadow.getTag() != null)) {
            return;
        }
        this.shadow.setTag(z ? null : 1);
        if (z) {
            this.shadow.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.shadow, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (UpdateAppAlertDialog.this.shadowAnimation == null || !UpdateAppAlertDialog.this.shadowAnimation.equals(animator)) {
                    return;
                }
                UpdateAppAlertDialog.this.shadowAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (UpdateAppAlertDialog.this.shadowAnimation == null || !UpdateAppAlertDialog.this.shadowAnimation.equals(animator)) {
                    return;
                }
                if (!z) {
                    UpdateAppAlertDialog.this.shadow.setVisibility(4);
                }
                UpdateAppAlertDialog.this.shadowAnimation = null;
            }
        });
        this.shadowAnimation.start();
    }

    public void updateLayout() {
        this.linearLayout.getChildAt(0).getLocationInWindow(this.location);
        int iMax = Math.max(this.location[1] - AndroidUtilities.dp(24.0f), 0);
        if (this.linearLayout.getMeasuredHeight() + this.location[1] <= this.containerView.getTranslationY() + (this.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            runShadowAnimation(0, false);
        } else {
            runShadowAnimation(0, true);
        }
        if (this.scrollOffsetY != iMax) {
            this.scrollOffsetY = iMax;
            this.scrollView.invalidate();
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
