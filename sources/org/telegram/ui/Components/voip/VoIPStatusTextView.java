package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
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
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

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

    public VoIPStatusTextView(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        this.textView = new TextView[2];
        for (int i = 0; i < 2; i++) {
            this.textView[i] = new TextView(context);
            this.textView[i].setTextSize(1, 15.0f);
            this.textView[i].setTextColor(-1);
            this.textView[i].setGravity(1);
            addView(this.textView[i]);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.badConnectionLayer = frameLayout;
        TextView textView = new TextView(context, voIPBackgroundProvider) {
            public final RectF bgRect = new RectF();
            public final VoIPBackgroundProvider val$backgroundProvider;

            {
                this.val$backgroundProvider = voIPBackgroundProvider;
                voIPBackgroundProvider.views.add(this);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                RectF rectF = this.bgRect;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x = ((View) getParent()).getX() + getX();
                VoIPStatusTextView voIPStatusTextView = VoIPStatusTextView.this;
                float x2 = ((View) voIPStatusTextView.getParent()).getX() + voIPStatusTextView.getX() + x;
                float y = ((View) voIPStatusTextView.getParent()).getY() + voIPStatusTextView.getY() + ((View) getParent()).getY() + getY();
                VoIPBackgroundProvider voIPBackgroundProvider2 = this.val$backgroundProvider;
                voIPBackgroundProvider2.setDarkTranslation(x2, y);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), voIPBackgroundProvider2.getDarkPaint());
                super.onDraw(canvas);
            }
        };
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(-1);
        textView.setGravity(1);
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
        textView.setText(LocaleController.getString(R.string.VoipWeakNetwork));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.reconnectTextView = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString(".");
        spannableString.setSpan(new VoIPEllipsizeSpan(new View[]{textView2}), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        textView2.setText(spannableStringBuilder);
        textView2.setVisibility(8);
        VoIPTimerView voIPTimerView = new VoIPTimerView(context);
        this.timerView = voIPTimerView;
        addView(voIPTimerView, LayoutHelper.createFrame(-1, -2.0f));
    }

    public final void replaceViews(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.animationInProgress = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(10, view2, view));
        this.animator.addListener(new ChatListItemAnimator.AnonymousClass3(this, view, view2, runnable));
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
            replaceViews(textViewArr[0], textViewArr[1], new GiftSheet$$ExternalSyntheticLambda9(this, 21));
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
