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
    private BetaUpdate appUpdate;
    private LinearLayout linearLayout;
    private int[] location;
    private int scrollOffsetY;
    private NestedScrollView scrollView;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private Drawable shadowDrawable;

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public UpdateAppAlertDialog(Context context, BetaUpdate betaUpdate, int i) {
        super(context, false);
        this.location = new int[2];
        this.appUpdate = betaUpdate;
        this.accountNum = i;
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable drawableMutate = context.getResources().getDrawable(2131232547).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                UpdateAppAlertDialog.this.updateLayout();
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && UpdateAppAlertDialog.this.scrollOffsetY != 0 && motionEvent.getY() < UpdateAppAlertDialog.this.scrollOffsetY) {
                    UpdateAppAlertDialog.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !UpdateAppAlertDialog.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                UpdateAppAlertDialog.this.shadowDrawable.setBounds(0, (int) ((UpdateAppAlertDialog.this.scrollOffsetY - ((BottomSheet) UpdateAppAlertDialog.this).backgroundPaddingTop) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                UpdateAppAlertDialog.this.shadowDrawable.draw(canvas);
            }
        };
        frameLayout.setWillNotDraw(false);
        this.containerView = frameLayout;
        NestedScrollView nestedScrollView = new NestedScrollView(context) {
            private boolean ignoreLayout;

            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i3);
                measureChildWithMargins(UpdateAppAlertDialog.this.linearLayout, i2, 0, i3, 0);
                int measuredHeight = UpdateAppAlertDialog.this.linearLayout.getMeasuredHeight();
                int i4 = (size / 5) * 2;
                if (measuredHeight - (size - i4) < AndroidUtilities.dp(90.0f) || measuredHeight < (size / 2) + AndroidUtilities.dp(90.0f)) {
                    i4 = size - measuredHeight;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                if (getPaddingTop() != i4) {
                    this.ignoreLayout = true;
                    setPadding(0, i4, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                UpdateAppAlertDialog.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onScrollChanged(int i2, int i3, int i4, int i5) {
                super.onScrollChanged(i2, i3, i4, i5);
                UpdateAppAlertDialog.this.updateLayout();
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
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(2131690126));
        this.linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray3));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i3 = Theme.key_dialogTextLink;
        textView2.setLinkTextColor(Theme.getColor(i3));
        BetaUpdate betaUpdate2 = this.appUpdate;
        textView2.setText(LocaleController.formatString(2131690111, betaUpdate2.version, Integer.valueOf(betaUpdate2.versionCode)));
        textView2.setGravity(49);
        this.linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(this.appUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(i2));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(Theme.getColor(i3));
            textView3.setText(Emoji.replaceEmoji(this.appUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            this.linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        this.shadow.setAlpha(0.0f);
        this.shadow.setTag(1);
        frameLayout.addView(this.shadow, layoutParams);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        final File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            buttonWithCounterView.setText(LocaleController.formatString(2131690130, new Object[0]), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$0(downloadedUpdateFile, view2);
                }
            });
        } else {
            buttonWithCounterView.setText(LocaleController.formatString(2131690128, new Object[0]), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$1(view2);
                }
            });
        }
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, null);
        buttonWithCounterView2.setText(LocaleController.getString(2131690131), false);
        buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$2(view2);
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
        dismiss();
    }

    public void lambda$new$1(View view) {
        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
        dismiss();
    }

    public void lambda$new$2(View view) {
        dismiss();
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
            public void onAnimationEnd(Animator animator) {
                if (UpdateAppAlertDialog.this.shadowAnimation == null || !UpdateAppAlertDialog.this.shadowAnimation.equals(animator)) {
                    return;
                }
                if (!z) {
                    UpdateAppAlertDialog.this.shadow.setVisibility(4);
                }
                UpdateAppAlertDialog.this.shadowAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (UpdateAppAlertDialog.this.shadowAnimation == null || !UpdateAppAlertDialog.this.shadowAnimation.equals(animator)) {
                    return;
                }
                UpdateAppAlertDialog.this.shadowAnimation = null;
            }
        });
        this.shadowAnimation.start();
    }

    public void updateLayout() {
        this.linearLayout.getChildAt(0).getLocationInWindow(this.location);
        int iMax = Math.max(this.location[1] - AndroidUtilities.dp(24.0f), 0);
        if (this.location[1] + this.linearLayout.getMeasuredHeight() <= (this.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f)) + this.containerView.getTranslationY()) {
            runShadowAnimation(0, false);
        } else {
            runShadowAnimation(0, true);
        }
        if (this.scrollOffsetY != iMax) {
            this.scrollOffsetY = iMax;
            this.scrollView.invalidate();
        }
    }
}
