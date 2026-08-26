package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;

public class LoadingAnimatedTextView extends View {
    private State currentState;
    private RectOld loadingRect;
    private State nextState;
    private TextPaint paint;
    private float stateTransition;
    private ValueAnimator stateTransitionAnimator;

    public static class State {
        private int[] hashCodes;
        private int[] lengths;
        private StaticLayout[] words;

        private State() {
        }
    }

    public LoadingAnimatedTextView(Context context, TextPaint textPaint) {
        super(context);
        this.stateTransition = 0.0f;
        this.paint = textPaint;
    }

    public void lambda$setText$0(ValueAnimator valueAnimator) {
        this.stateTransition = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private static State makeState(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        State state = new State();
        splitToWords(charSequence);
        if (charSequence2 != null) {
            splitToWords(charSequence2);
        }
        splitToWords(charSequence3);
        return state;
    }

    private static CharSequence[] splitToWords(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == ' ') {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        int size = arrayList.size() + 1;
        CharSequence[] charSequenceArr = new CharSequence[size];
        int i3 = -1;
        while (i < size) {
            int i4 = i3 + 1;
            int length = i >= arrayList.size() ? charSequence.length() : ((Integer) arrayList.get(i)).intValue();
            charSequenceArr[i] = charSequence.subSequence(i4, length);
            i++;
            i3 = length;
        }
        return charSequenceArr;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        setText(charSequence, null, charSequence2);
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        ValueAnimator valueAnimator = this.stateTransitionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.stateTransition, charSequence2 == null ? 1.0f : 0.0f);
        this.stateTransitionAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 15));
        this.stateTransitionAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                LoadingAnimatedTextView loadingAnimatedTextView = LoadingAnimatedTextView.this;
                loadingAnimatedTextView.stateTransition = ((Float) loadingAnimatedTextView.stateTransitionAnimator.getAnimatedValue()).floatValue();
                LoadingAnimatedTextView.this.invalidate();
                LoadingAnimatedTextView.this.stateTransitionAnimator = null;
            }
        });
        this.stateTransitionAnimator.start();
    }
}
