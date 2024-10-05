package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public class NumberTextView extends View {
    private boolean addNumber;
    private ObjectAnimator animator;
    private boolean center;
    private int currentNumber;
    private ArrayList letters;
    private ArrayList oldLetters;
    private float oldTextWidth;
    private float progress;
    private TextPaint textPaint;
    private float textWidth;

    public interface OnTextWidthProgressChangedListener {
    }

    public NumberTextView(Context context) {
        super(context);
        this.letters = new ArrayList();
        this.oldLetters = new ArrayList();
        this.textPaint = new TextPaint(1);
        this.progress = 0.0f;
        this.currentNumber = 1;
    }

    public float getOldTextWidth() {
        return this.oldTextWidth;
    }

    public float getProgress() {
        return this.progress;
    }

    public float getTextWidth() {
        return this.textWidth;
    }

    @Override
    protected void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.onDraw(android.graphics.Canvas):void");
    }

    public void setAddNumber() {
        this.addNumber = true;
    }

    public void setCenterAlign(boolean z) {
        this.center = z;
    }

    public void setNumber(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.setNumber(int, boolean):void");
    }

    public void setOnTextWidthProgressChangedListener(OnTextWidthProgressChangedListener onTextWidthProgressChangedListener) {
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    public void setTextColor(int i) {
        this.textPaint.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        this.textPaint.setTextSize(AndroidUtilities.dp(i));
        this.oldLetters.clear();
        this.letters.clear();
        setNumber(this.currentNumber, false);
    }

    public void setTypeface(Typeface typeface) {
        this.textPaint.setTypeface(typeface);
        this.oldLetters.clear();
        this.letters.clear();
        setNumber(this.currentNumber, false);
    }
}
