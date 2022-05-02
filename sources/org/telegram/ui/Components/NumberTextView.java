package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.Keep;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public class NumberTextView extends View {
    private boolean addNumber;
    private ObjectAnimator animator;
    private boolean center;
    private float oldTextWidth;
    private OnTextWidthProgressChangedListener onTextWidthProgressChangedListener;
    private float textWidth;
    private ArrayList<StaticLayout> letters = new ArrayList<>();
    private ArrayList<StaticLayout> oldLetters = new ArrayList<>();
    private TextPaint textPaint = new TextPaint(1);
    private float progress = 0.0f;
    private int currentNumber = 1;

    public interface OnTextWidthProgressChangedListener {
        void onTextWidthProgress(float f, float f2, float f3);
    }

    public NumberTextView(Context context) {
        super(context);
    }

    public void setOnTextWidthProgressChangedListener(OnTextWidthProgressChangedListener onTextWidthProgressChangedListener) {
        this.onTextWidthProgressChangedListener = onTextWidthProgressChangedListener;
    }

    @Keep
    public void setProgress(float f) {
        if (this.progress != f) {
            this.progress = f;
            OnTextWidthProgressChangedListener onTextWidthProgressChangedListener = this.onTextWidthProgressChangedListener;
            if (onTextWidthProgressChangedListener != null) {
                onTextWidthProgressChangedListener.onTextWidthProgress(this.oldTextWidth, this.textWidth, f);
            }
            invalidate();
        }
    }

    @Keep
    public float getProgress() {
        return this.progress;
    }

    public void setAddNumber() {
        this.addNumber = true;
    }

    public void setNumber(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.setNumber(int, boolean):void");
    }

    public void setTextSize(int i) {
        this.textPaint.setTextSize(AndroidUtilities.dp(i));
        this.oldLetters.clear();
        this.letters.clear();
        setNumber(this.currentNumber, false);
    }

    public void setTextColor(int i) {
        this.textPaint.setColor(i);
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.textPaint.setTypeface(typeface);
        this.oldLetters.clear();
        this.letters.clear();
        setNumber(this.currentNumber, false);
    }

    public void setCenterAlign(boolean z) {
        this.center = z;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        if (!this.letters.isEmpty()) {
            float height = this.letters.get(0).getHeight();
            float dp = this.addNumber ? AndroidUtilities.dp(4.0f) : height;
            if (this.center) {
                f2 = (getMeasuredWidth() - this.textWidth) / 2.0f;
                f = ((getMeasuredWidth() - this.oldTextWidth) / 2.0f) - f2;
            } else {
                f2 = 0.0f;
                f = 0.0f;
            }
            canvas.save();
            canvas.translate(getPaddingLeft() + f2, (getMeasuredHeight() - height) / 2.0f);
            int max = Math.max(this.letters.size(), this.oldLetters.size());
            int i = 0;
            while (i < max) {
                canvas.save();
                StaticLayout staticLayout = null;
                StaticLayout staticLayout2 = i < this.oldLetters.size() ? this.oldLetters.get(i) : null;
                if (i < this.letters.size()) {
                    staticLayout = this.letters.get(i);
                }
                float f3 = this.progress;
                if (f3 > 0.0f) {
                    if (staticLayout2 != null) {
                        this.textPaint.setAlpha((int) (f3 * 255.0f));
                        canvas.save();
                        canvas.translate(f, (this.progress - 1.0f) * dp);
                        staticLayout2.draw(canvas);
                        canvas.restore();
                        if (staticLayout != null) {
                            this.textPaint.setAlpha((int) ((1.0f - this.progress) * 255.0f));
                            canvas.translate(0.0f, this.progress * dp);
                        }
                    } else {
                        this.textPaint.setAlpha(255);
                    }
                } else if (f3 < 0.0f) {
                    if (staticLayout2 != null) {
                        this.textPaint.setAlpha((int) ((-f3) * 255.0f));
                        canvas.save();
                        canvas.translate(f, (this.progress + 1.0f) * dp);
                        staticLayout2.draw(canvas);
                        canvas.restore();
                    }
                    if (staticLayout != null) {
                        if (i == max - 1 || staticLayout2 != null) {
                            this.textPaint.setAlpha((int) ((this.progress + 1.0f) * 255.0f));
                            canvas.translate(0.0f, this.progress * dp);
                        } else {
                            this.textPaint.setAlpha(255);
                        }
                    }
                } else if (staticLayout != null) {
                    this.textPaint.setAlpha(255);
                }
                if (staticLayout != null) {
                    staticLayout.draw(canvas);
                }
                canvas.restore();
                canvas.translate(staticLayout != null ? staticLayout.getLineWidth(0) : staticLayout2.getLineWidth(0) + AndroidUtilities.dp(1.0f), 0.0f);
                if (!(staticLayout == null || staticLayout2 == null)) {
                    f += staticLayout2.getLineWidth(0) - staticLayout.getLineWidth(0);
                }
                i++;
            }
            canvas.restore();
        }
    }

    public float getOldTextWidth() {
        return this.oldTextWidth;
    }

    public float getTextWidth() {
        return this.textWidth;
    }
}
