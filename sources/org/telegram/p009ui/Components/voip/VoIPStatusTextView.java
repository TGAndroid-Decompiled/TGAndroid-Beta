package org.telegram.p009ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EllipsizeSpanAnimator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.voip.VoIPStatusTextView;

public class VoIPStatusTextView extends FrameLayout {
    boolean animationInProgress;
    ValueAnimator animator;
    EllipsizeSpanAnimator ellipsizeAnimator;
    CharSequence nextTextToSet;
    TextView reconnectTextView;
    TextView[] textView;
    boolean timerShowing;
    VoIPTimerView timerView;

    public VoIPStatusTextView(Context context) {
        super(context);
        this.textView = new TextView[2];
        for (int i = 0; i < 2; i++) {
            this.textView[i] = new TextView(context);
            this.textView[i].setTextSize(1, 15.0f);
            this.textView[i].setShadowLayer(AndroidUtilities.m35dp(3.0f), 0.0f, AndroidUtilities.m35dp(0.6666667f), 1275068416);
            this.textView[i].setTextColor(-1);
            this.textView[i].setGravity(1);
            addView(this.textView[i]);
        }
        TextView textView = new TextView(context);
        this.reconnectTextView = textView;
        textView.setTextSize(1, 15.0f);
        this.reconnectTextView.setShadowLayer(AndroidUtilities.m35dp(3.0f), 0.0f, AndroidUtilities.m35dp(0.6666667f), 1275068416);
        this.reconnectTextView.setTextColor(-1);
        this.reconnectTextView.setGravity(1);
        addView(this.reconnectTextView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        this.ellipsizeAnimator = new EllipsizeSpanAnimator(this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString("VoipReconnecting", C1072R.string.VoipReconnecting));
        SpannableString spannableString = new SpannableString("...");
        this.ellipsizeAnimator.wrap(spannableString, 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        this.reconnectTextView.setText(spannableStringBuilder);
        this.reconnectTextView.setVisibility(8);
        VoIPTimerView voIPTimerView = new VoIPTimerView(context);
        this.timerView = voIPTimerView;
        addView(voIPTimerView, LayoutHelper.createFrame(-1, -2.0f));
    }

    public void setText(String str, boolean z, boolean z2) {
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            this.ellipsizeAnimator.reset();
            SpannableString spannableString = new SpannableString("...");
            this.ellipsizeAnimator.wrap(spannableString, 0);
            spannableStringBuilder.append((CharSequence) spannableString);
            this.ellipsizeAnimator.addView(this.textView[0]);
            this.ellipsizeAnimator.addView(this.textView[1]);
            str = spannableStringBuilder;
        } else {
            this.ellipsizeAnimator.removeView(this.textView[0]);
            this.ellipsizeAnimator.removeView(this.textView[1]);
        }
        if (TextUtils.isEmpty(this.textView[0].getText())) {
            z2 = false;
        }
        if (!z2) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.animationInProgress = false;
            this.textView[0].setText(str);
            this.textView[0].setVisibility(0);
            this.textView[1].setVisibility(8);
            this.timerView.setVisibility(8);
        } else if (this.animationInProgress) {
            this.nextTextToSet = str;
        } else if (this.timerShowing) {
            this.textView[0].setText(str);
            replaceViews(this.timerView, this.textView[0], null);
        } else if (this.textView[0].getText().equals(str)) {
        } else {
            this.textView[1].setText(str);
            TextView[] textViewArr = this.textView;
            replaceViews(textViewArr[0], textViewArr[1], new Runnable() {
                @Override
                public final void run() {
                    VoIPStatusTextView.this.lambda$setText$0();
                }
            });
        }
    }

    public void lambda$setText$0() {
        TextView[] textViewArr = this.textView;
        TextView textView = textViewArr[0];
        textViewArr[0] = textViewArr[1];
        textViewArr[1] = textView;
    }

    public void showTimer(boolean z) {
        if (TextUtils.isEmpty(this.textView[0].getText())) {
            z = false;
        }
        if (this.timerShowing) {
            return;
        }
        this.timerView.updateTimer();
        if (!z) {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.timerShowing = true;
            this.animationInProgress = false;
            this.textView[0].setVisibility(8);
            this.textView[1].setVisibility(8);
            this.timerView.setVisibility(0);
        } else if (this.animationInProgress) {
            this.nextTextToSet = "timer";
            return;
        } else {
            this.timerShowing = true;
            replaceViews(this.textView[0], this.timerView, null);
        }
        this.ellipsizeAnimator.removeView(this.textView[0]);
        this.ellipsizeAnimator.removeView(this.textView[1]);
    }

    public void replaceViews(final View view, final View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.m35dp(15.0f));
        view2.setAlpha(0.0f);
        this.animationInProgress = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoIPStatusTextView.lambda$replaceViews$1(view2, view, valueAnimator);
            }
        });
        this.animator.addListener(new C30921(view, view2, runnable));
        this.animator.setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animator.start();
    }

    public static void lambda$replaceViews$1(View view, View view2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (floatValue * 0.6f) + 0.4f;
        float f2 = 1.0f - floatValue;
        float f3 = (0.6f * f2) + 0.4f;
        view.setTranslationY(AndroidUtilities.m35dp(10.0f) * f2);
        view.setAlpha(floatValue);
        view.setScaleX(f);
        view.setScaleY(f);
        view2.setTranslationY((-AndroidUtilities.m35dp(10.0f)) * floatValue);
        view2.setAlpha(f2);
        view2.setScaleX(f3);
        view2.setScaleY(f3);
    }

    public class C30921 extends AnimatorListenerAdapter {
        final View val$in;
        final Runnable val$onEnd;
        final View val$out;

        C30921(View view, View view2, Runnable runnable) {
            VoIPStatusTextView.this = r1;
            this.val$out = view;
            this.val$in = view2;
            this.val$onEnd = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.val$out.setVisibility(8);
            this.val$out.setAlpha(1.0f);
            this.val$out.setTranslationY(0.0f);
            this.val$out.setScaleY(1.0f);
            this.val$out.setScaleX(1.0f);
            this.val$in.setAlpha(1.0f);
            this.val$in.setTranslationY(0.0f);
            this.val$in.setVisibility(0);
            this.val$in.setScaleY(1.0f);
            this.val$in.setScaleX(1.0f);
            Runnable runnable = this.val$onEnd;
            if (runnable != null) {
                runnable.run();
            }
            VoIPStatusTextView voIPStatusTextView = VoIPStatusTextView.this;
            voIPStatusTextView.animationInProgress = false;
            CharSequence charSequence = voIPStatusTextView.nextTextToSet;
            if (charSequence != null) {
                if (charSequence.equals("timer")) {
                    VoIPStatusTextView.this.showTimer(true);
                } else {
                    VoIPStatusTextView voIPStatusTextView2 = VoIPStatusTextView.this;
                    voIPStatusTextView2.textView[1].setText(voIPStatusTextView2.nextTextToSet);
                    VoIPStatusTextView voIPStatusTextView3 = VoIPStatusTextView.this;
                    TextView[] textViewArr = voIPStatusTextView3.textView;
                    voIPStatusTextView3.replaceViews(textViewArr[0], textViewArr[1], new Runnable() {
                        @Override
                        public final void run() {
                            VoIPStatusTextView.C30921.this.lambda$onAnimationEnd$0();
                        }
                    });
                }
                VoIPStatusTextView.this.nextTextToSet = null;
            }
        }

        public void lambda$onAnimationEnd$0() {
            TextView[] textViewArr = VoIPStatusTextView.this.textView;
            TextView textView = textViewArr[0];
            textViewArr[0] = textViewArr[1];
            textViewArr[1] = textView;
        }
    }

    public void setSignalBarCount(int i) {
        this.timerView.setSignalBarCount(i);
    }

    public void showReconnect(boolean z, boolean z2) {
        if (!z2) {
            this.reconnectTextView.animate().setListener(null).cancel();
            this.reconnectTextView.setVisibility(z ? 0 : 8);
        } else if (z) {
            if (this.reconnectTextView.getVisibility() != 0) {
                this.reconnectTextView.setVisibility(0);
                this.reconnectTextView.setAlpha(0.0f);
            }
            this.reconnectTextView.animate().setListener(null).cancel();
            this.reconnectTextView.animate().alpha(1.0f).setDuration(150L).start();
        } else {
            this.reconnectTextView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIPStatusTextView.this.reconnectTextView.setVisibility(8);
                }
            }).setDuration(150L).start();
        }
        if (z) {
            this.ellipsizeAnimator.addView(this.reconnectTextView);
        } else {
            this.ellipsizeAnimator.removeView(this.reconnectTextView);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ellipsizeAnimator.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ellipsizeAnimator.onDetachedFromWindow();
    }
}
