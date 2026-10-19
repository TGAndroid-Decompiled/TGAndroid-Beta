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
    public final ArrayList f24246a;
    public final ArrayList f24247b;
    public final TextPaint f24248c;
    public ObjectAnimator d;
    public float e;
    public int f24249f;
    public boolean h;
    public boolean f24250n;
    public float f24251r;
    public float f24252s;

    public NumberTextView(Context context) {
        super(context);
        this.f24246a = new ArrayList();
        this.f24247b = new ArrayList();
        this.f24248c = new TextPaint(1);
        this.e = 0.0f;
        this.f24249f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f24252s;
    }

    public float getProgress() {
        return this.e;
    }

    public float getTextWidth() {
        return this.f24251r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f24246a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f7 = AndroidUtilities.dp(4.0f);
        } else {
            f7 = height;
        }
        if (this.f24250n) {
            f10 = (getMeasuredWidth() - this.f24251r) / 2.0f;
            f11 = ((getMeasuredWidth() - this.f24252s) / 2.0f) - f10;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f10, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f24247b;
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
            float f12 = this.e;
            int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.f24248c;
            if (i11 > 0) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f12 * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.e - 1.0f) * f7);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.e) * 255.0f));
                        canvas.translate(0.0f, this.e * f7);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f12 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f12) * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.e + 1.0f) * f7);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.e * f7);
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
                f11 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f11;
            }
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z10) {
        this.f24250n = z10;
    }

    public void setProgress(float f7) {
        if (this.e == f7) {
            return;
        }
        this.e = f7;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f24248c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f24248c.setTextSize(AndroidUtilities.dp(i10));
        this.f24247b.clear();
        this.f24246a.clear();
        a(this.f24249f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f24248c.setTypeface(typeface);
        this.f24247b.clear();
        this.f24246a.clear();
        a(this.f24249f, false);
    }

    public void setOnTextWidthProgressChangedListener(pd0 pd0Var) {
    }
}
