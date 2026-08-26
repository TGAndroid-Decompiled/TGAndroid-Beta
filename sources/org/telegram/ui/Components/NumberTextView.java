package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

public class NumberTextView extends View {
    private boolean addNumber;
    private ObjectAnimator animator;
    private boolean center;
    private int currentNumber;
    private ArrayList<StaticLayout> letters;
    private ArrayList<StaticLayout> oldLetters;
    private float oldTextWidth;
    private OnTextWidthProgressChangedListener onTextWidthProgressChangedListener;
    private float progress;
    private TextPaint textPaint;
    private float textWidth;

    public interface OnTextWidthProgressChangedListener {
        void onTextWidthProgress(float f, float f2, float f3);
    }

    public NumberTextView(Context context) {
        super(context);
        this.letters = new ArrayList<>();
        this.oldLetters = new ArrayList<>();
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
    public void onDraw(Canvas canvas) {
        float measuredWidth;
        float lineWidth;
        if (this.letters.isEmpty()) {
            return;
        }
        float height = this.letters.get(0).getHeight();
        float fDp = this.addNumber ? AndroidUtilities.dp(4.0f) : height;
        if (this.center) {
            measuredWidth = (getMeasuredWidth() - this.textWidth) / 2.0f;
            lineWidth = ((getMeasuredWidth() - this.oldTextWidth) / 2.0f) - measuredWidth;
        } else {
            measuredWidth = 0.0f;
            lineWidth = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + measuredWidth, (getMeasuredHeight() - height) / 2.0f);
        int iMax = Math.max(this.letters.size(), this.oldLetters.size());
        int i = 0;
        while (i < iMax) {
            canvas.save();
            StaticLayout staticLayout = i < this.oldLetters.size() ? this.oldLetters.get(i) : null;
            StaticLayout staticLayout2 = i < this.letters.size() ? this.letters.get(i) : null;
            float f = this.progress;
            if (f > 0.0f) {
                if (staticLayout != null) {
                    this.textPaint.setAlpha((int) (f * 255.0f));
                    canvas.save();
                    canvas.translate(lineWidth, (this.progress - 1.0f) * fDp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        this.textPaint.setAlpha((int) ((1.0f - this.progress) * 255.0f));
                        canvas.translate(0.0f, this.progress * fDp);
                    }
                } else {
                    this.textPaint.setAlpha(255);
                }
            } else if (f < 0.0f) {
                if (staticLayout != null) {
                    this.textPaint.setAlpha((int) ((-f) * 255.0f));
                    canvas.save();
                    canvas.translate(lineWidth, (this.progress + 1.0f) * fDp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i == iMax - 1 || staticLayout != null) {
                        this.textPaint.setAlpha((int) ((this.progress + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.progress * fDp);
                    } else {
                        this.textPaint.setAlpha(255);
                    }
                }
            } else if (staticLayout2 != null) {
                this.textPaint.setAlpha(255);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.translate(staticLayout2 != null ? staticLayout2.getLineWidth(0) : staticLayout.getLineWidth(0) + AndroidUtilities.dp(1.0f), 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                lineWidth = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + lineWidth;
            }
            i++;
        }
        canvas.restore();
    }

    public void setAddNumber() {
        this.addNumber = true;
    }

    public void setCenterAlign(boolean z) {
        this.center = z;
    }

    public void setNumber(int i, boolean z) {
        String string;
        String string2;
        boolean z2;
        if (this.currentNumber == i && z) {
            return;
        }
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        this.oldLetters.clear();
        this.oldLetters.addAll(this.letters);
        this.letters.clear();
        if (this.addNumber) {
            Locale locale = Locale.US;
            string = Fragment$$ExternalSyntheticOutline0.m(this.currentNumber, "#");
            string2 = Fragment$$ExternalSyntheticOutline0.m(i, "#");
            if (i < this.currentNumber) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            Locale locale2 = Locale.US;
            int i2 = this.currentNumber;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            string2 = sb2.toString();
            if (i > this.currentNumber) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.textWidth = this.textPaint.measureText(string2);
        float fMeasureText = this.textPaint.measureText(string);
        this.oldTextWidth = fMeasureText;
        boolean z3 = this.center && this.textWidth != fMeasureText;
        this.currentNumber = i;
        this.progress = 0.0f;
        int i3 = 0;
        while (i3 < string2.length()) {
            int i4 = i3 + 1;
            String strSubstring = string2.substring(i3, i4);
            String strSubstring2 = (this.oldLetters.isEmpty() || i3 >= string.length()) ? null : string.substring(i3, i4);
            if (z3 || strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                if (z3 && strSubstring2 == null) {
                    this.oldLetters.add(new StaticLayout("", this.textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                TextPaint textPaint = this.textPaint;
                this.letters.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                this.letters.add(this.oldLetters.get(i3));
                this.oldLetters.set(i3, null);
            }
            i3 = i4;
        }
        if (!z || this.oldLetters.isEmpty()) {
            OnTextWidthProgressChangedListener onTextWidthProgressChangedListener = this.onTextWidthProgressChangedListener;
            if (onTextWidthProgressChangedListener != null) {
                onTextWidthProgressChangedListener.onTextWidthProgress(this.oldTextWidth, this.textWidth, this.progress);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z2 ? -1.0f : 1.0f, 0.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(this.addNumber ? 180L : 150L);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    NumberTextView.this.animator = null;
                    NumberTextView.this.oldLetters.clear();
                }
            });
            this.animator.start();
        }
        invalidate();
    }

    public void setOnTextWidthProgressChangedListener(OnTextWidthProgressChangedListener onTextWidthProgressChangedListener) {
        this.onTextWidthProgressChangedListener = onTextWidthProgressChangedListener;
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        OnTextWidthProgressChangedListener onTextWidthProgressChangedListener = this.onTextWidthProgressChangedListener;
        if (onTextWidthProgressChangedListener != null) {
            onTextWidthProgressChangedListener.onTextWidthProgress(this.oldTextWidth, this.textWidth, f);
        }
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
