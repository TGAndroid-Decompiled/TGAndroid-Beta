package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.StaticLayout;

public final class SubstringLayoutAnimator {
    public StaticLayout animateInLayout;
    public StaticLayout animateOutLayout;
    public StaticLayout animateStableLayout;
    public boolean animateTextChange;
    public boolean animateTextChangeOut;
    public float hintProgress;
    public final EditTextBoldCursor parentView;
    public boolean replaceAnimation;
    public ValueAnimator valueAnimator;
    public float xOffset;

    public SubstringLayoutAnimator(EditTextBoldCursor editTextBoldCursor) {
        this.parentView = editTextBoldCursor;
    }
}
