package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.ComposeDrawable$$ExternalSyntheticLambda0;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;

public final class VoIPStatusTextView extends FrameLayout {
    public boolean animationInProgress;
    public ValueAnimator animator;
    public final FrameLayout badConnectionLayer;
    public CharSequence nextTextToSet;
    public final TextView reconnectTextView;
    public final TextView[] textView;
    public boolean timerShowing;
    public final VoIPTimerView timerView;

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final VoIPStatusTextView this$0;

        public AnonymousClass3(VoIPStatusTextView voIPStatusTextView, int i) {
            this.$r8$classId = i;
            this.this$0 = voIPStatusTextView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.reconnectTextView.setVisibility(8);
                    break;
                default:
                    this.this$0.badConnectionLayer.setVisibility(8);
                    break;
            }
        }
    }

    public VoIPStatusTextView(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(activity);
        this.textView = new TextView[2];
        for (int i = 0; i < 2; i++) {
            this.textView[i] = new TextView(activity);
            this.textView[i].setTextSize(1, 15.0f);
            this.textView[i].setTextColor(-1);
            this.textView[i].setGravity(1);
            addView(this.textView[i]);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        this.badConnectionLayer = frameLayout;
        LoginActivity.LoadingTextView loadingTextView = new LoginActivity.LoadingTextView(this, activity, voIPBackgroundProvider);
        loadingTextView.setTextSize(1, 15.0f);
        loadingTextView.setTextColor(-1);
        loadingTextView.setGravity(1);
        loadingTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        loadingTextView.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout.addView(loadingTextView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.reconnectTextView = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(-1);
        textView.setGravity(1);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new VoIPEllipsizeSpan(new View[]{textView}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(8);
        VoIPTimerView voIPTimerView = new VoIPTimerView(activity);
        this.timerView = voIPTimerView;
        addView(voIPTimerView, LayoutHelper.createFrame(-2.0f, -1));
    }

    public final void replaceViews(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.animationInProgress = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(19, view2, view));
        this.animator.addListener(new ProfileActivity.AnonymousClass47(this, view, view2, runnable, 4));
        this.animator.setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animator.start();
    }

    public void setSignalBarCount(int i) {
        this.timerView.setSignalBarCount(i);
    }

    public final void setText(String str, boolean z, boolean z2) {
        TextView[] textViewArr = this.textView;
        CharSequence charSequence = str;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new VoIPEllipsizeSpan(textViewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            charSequence = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z2 = false;
        }
        View view = this.timerView;
        if (!z2) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.animationInProgress = false;
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[1].setVisibility(8);
            view.setVisibility(8);
            return;
        }
        if (this.animationInProgress) {
            this.nextTextToSet = charSequence;
            return;
        }
        if (this.timerShowing) {
            textViewArr[0].setText(charSequence);
            replaceViews(view, textViewArr[0], null);
        } else {
            if (textViewArr[0].getText().equals(charSequence)) {
                return;
            }
            textViewArr[1].setText(charSequence);
            replaceViews(textViewArr[0], textViewArr[1], new ComposeDrawable$$ExternalSyntheticLambda0(this, 1));
        }
    }

    public final void showBadConnection(boolean z) {
        FrameLayout frameLayout = this.badConnectionLayer;
        if (!z) {
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(CubicBezierInterpolator.DEFAULT).setListener(new AnonymousClass3(this, 1)).setDuration(300L).start();
        } else {
            if (frameLayout.getVisibility() == 0) {
                return;
            }
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleY(0.6f);
            frameLayout.setScaleX(0.6f);
            frameLayout.animate().setListener(null).cancel();
            OKLCH.m(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), CubicBezierInterpolator.EASE_OUT_BACK, 300L);
        }
    }

    public final void showReconnect(boolean z, boolean z2) {
        TextView textView = this.reconnectTextView;
        if (!z2) {
            textView.animate().setListener(null).cancel();
            textView.setVisibility(z ? 0 : 8);
        } else {
            if (!z) {
                textView.animate().alpha(0.0f).setListener(new AnonymousClass3(this, 0)).setDuration(150L).start();
                return;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void showTimer(boolean z) {
        TextView[] textViewArr = this.textView;
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z = false;
        }
        if (this.timerShowing) {
            return;
        }
        VoIPTimerView voIPTimerView = this.timerView;
        voIPTimerView.updateTimer();
        if (z) {
            if (this.animationInProgress) {
                this.nextTextToSet = "timer";
                return;
            } else {
                this.timerShowing = true;
                replaceViews(textViewArr[0], voIPTimerView, null);
                return;
            }
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.timerShowing = true;
        this.animationInProgress = false;
        textViewArr[0].setVisibility(8);
        textViewArr[1].setVisibility(8);
        voIPTimerView.setVisibility(0);
    }
}
