package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

public final class NumberTextView extends View {
    public boolean addNumber;
    public ObjectAnimator animator;
    public boolean center;
    public int currentNumber;
    public final ArrayList letters;
    public final ArrayList oldLetters;
    public float oldTextWidth;
    public float progress;
    public final TextPaint textPaint;
    public float textWidth;

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
    public final void onDraw(Canvas canvas) {
        float measuredWidth;
        float lineWidth;
        ArrayList arrayList = this.letters;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
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
        int size = arrayList.size();
        ArrayList arrayList2 = this.oldLetters;
        int iMax = Math.max(size, arrayList2.size());
        int i = 0;
        while (i < iMax) {
            canvas.save();
            StaticLayout staticLayout = i < arrayList2.size() ? (StaticLayout) arrayList2.get(i) : null;
            StaticLayout staticLayout2 = i < arrayList.size() ? (StaticLayout) arrayList.get(i) : null;
            float f = this.progress;
            TextPaint textPaint = this.textPaint;
            if (f > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f * 255.0f));
                    canvas.save();
                    canvas.translate(lineWidth, (this.progress - 1.0f) * fDp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.progress) * 255.0f));
                        canvas.translate(0.0f, this.progress * fDp);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f) * 255.0f));
                    canvas.save();
                    canvas.translate(lineWidth, (this.progress + 1.0f) * fDp);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i == iMax - 1 || staticLayout != null) {
                        textPaint.setAlpha((int) ((this.progress + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.progress * fDp);
                    } else {
                        textPaint.setAlpha(255);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(255);
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

    public void setCenterAlign(boolean z) {
        this.center = z;
    }

    public final void setNumber(int i, boolean z) {
        String string;
        String string2;
        boolean z2;
        int i2;
        String str;
        if (this.currentNumber == i && z) {
            return;
        }
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        ArrayList arrayList = this.oldLetters;
        arrayList.clear();
        ArrayList arrayList2 = this.letters;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.addNumber) {
            Locale locale = Locale.US;
            string = SurfaceContainer$$ExternalSyntheticOutline0.m(this.currentNumber, "#");
            string2 = SurfaceContainer$$ExternalSyntheticOutline0.m(i, "#");
            if (i < this.currentNumber) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            Locale locale2 = Locale.US;
            int i3 = this.currentNumber;
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
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
        TextPaint textPaint = this.textPaint;
        this.textWidth = textPaint.measureText(string2);
        float fMeasureText = textPaint.measureText(string);
        this.oldTextWidth = fMeasureText;
        boolean z3 = this.center && this.textWidth != fMeasureText;
        this.currentNumber = i;
        this.progress = 0.0f;
        int i4 = 0;
        while (i4 < string2.length()) {
            int i5 = i4 + 1;
            String strSubstring = string2.substring(i4, i5);
            String strSubstring2 = (arrayList.isEmpty() || i4 >= string.length()) ? null : string.substring(i4, i5);
            if (z3 || strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                if (z3 && strSubstring2 == null) {
                    i2 = i5;
                    str = strSubstring;
                    arrayList.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    i2 = i5;
                    str = strSubstring;
                }
                arrayList2.add(new StaticLayout(str, textPaint, (int) Math.ceil(textPaint.measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList2.add((StaticLayout) arrayList.get(i4));
                arrayList.set(i4, null);
                i2 = i5;
            }
            i4 = i2;
        }
        if (z && !arrayList.isEmpty()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z2 ? -1.0f : 1.0f, 0.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(this.addNumber ? 180L : 150L);
            this.animator.addListener(new ItemOptions.AnonymousClass3(this, 8));
            this.animator.start();
        }
        invalidate();
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
