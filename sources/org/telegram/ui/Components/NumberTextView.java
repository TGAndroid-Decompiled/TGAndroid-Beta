package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class NumberTextView extends View {
    public final ArrayList f23033a;
    public final ArrayList f23034b;
    public final TextPaint f23035c;
    public ObjectAnimator d;
    public float e;
    public int f23036f;
    public boolean h;
    public boolean f23037n;
    public float f23038r;
    public float f23039s;

    public NumberTextView(Context context) {
        super(context);
        this.f23033a = new ArrayList();
        this.f23034b = new ArrayList();
        this.f23035c = new TextPaint(1);
        this.e = 0.0f;
        this.f23036f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f23039s;
    }

    public float getProgress() {
        return this.e;
    }

    public float getTextWidth() {
        return this.f23038r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f23033a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = height;
        }
        if (this.f23037n) {
            f11 = (getMeasuredWidth() - this.f23038r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f23039s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f23034b;
        int max = Math.max(size, arrayList2.size());
        for (int i10 = 0; i10 < max; i10++) {
            canvas.save();
            StaticLayout staticLayout2 = null;
            if (i10 < arrayList2.size()) {
                staticLayout = (StaticLayout) arrayList2.get(i10);
            } else {
                staticLayout = null;
            }
            if (i10 < arrayList.size()) {
                staticLayout2 = (StaticLayout) arrayList.get(i10);
            }
            float f13 = this.e;
            TextPaint textPaint = this.f23035c;
            if (f13 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.e) * 255.0f));
                        canvas.translate(0.0f, this.e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.e * f10);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(255);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            if (staticLayout2 != null) {
                lineWidth = staticLayout2.getLineWidth(0);
            } else {
                lineWidth = staticLayout.getLineWidth(0) + AndroidUtilities.dp(1.0f);
            }
            canvas.translate(lineWidth, 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                f12 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f12;
            }
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z4) {
        this.f23037n = z4;
    }

    public void setProgress(float f10) {
        if (this.e == f10) {
            return;
        }
        this.e = f10;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f23035c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f23035c.setTextSize(AndroidUtilities.dp(i10));
        this.f23034b.clear();
        this.f23033a.clear();
        a(this.f23036f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f23035c.setTypeface(typeface);
        this.f23034b.clear();
        this.f23033a.clear();
        a(this.f23036f, false);
    }

    public void setOnTextWidthProgressChangedListener(yc0 yc0Var) {
    }
}
