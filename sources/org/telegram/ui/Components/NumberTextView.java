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
    public final ArrayList f26412a;
    public final ArrayList f26413b;
    public final TextPaint f26414c;
    public ObjectAnimator d;
    public float f26415e;
    public int f26416f;
    public boolean h;
    public boolean f26417n;
    public float f26418r;
    public float f26419s;

    public NumberTextView(Context context) {
        super(context);
        this.f26412a = new ArrayList();
        this.f26413b = new ArrayList();
        this.f26414c = new TextPaint(1);
        this.f26415e = 0.0f;
        this.f26416f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f26419s;
    }

    public float getProgress() {
        return this.f26415e;
    }

    public float getTextWidth() {
        return this.f26418r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f26412a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = height;
        }
        if (this.f26417n) {
            f11 = (getMeasuredWidth() - this.f26418r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f26419s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f26413b;
        int max = Math.max(size, arrayList2.size());
        for (int i9 = 0; i9 < max; i9++) {
            canvas.save();
            StaticLayout staticLayout2 = null;
            if (i9 < arrayList2.size()) {
                staticLayout = (StaticLayout) arrayList2.get(i9);
            } else {
                staticLayout = null;
            }
            if (i9 < arrayList.size()) {
                staticLayout2 = (StaticLayout) arrayList.get(i9);
            }
            float f13 = this.f26415e;
            TextPaint textPaint = this.f26414c;
            if (f13 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f26415e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f26415e) * 255.0f));
                        canvas.translate(0.0f, this.f26415e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f26415e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i9 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f26415e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f26415e * f10);
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

    public void setCenterAlign(boolean z10) {
        this.f26417n = z10;
    }

    public void setProgress(float f10) {
        if (this.f26415e == f10) {
            return;
        }
        this.f26415e = f10;
        invalidate();
    }

    public void setTextColor(int i9) {
        this.f26414c.setColor(i9);
        invalidate();
    }

    public void setTextSize(int i9) {
        this.f26414c.setTextSize(AndroidUtilities.dp(i9));
        this.f26413b.clear();
        this.f26412a.clear();
        a(this.f26416f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f26414c.setTypeface(typeface);
        this.f26413b.clear();
        this.f26412a.clear();
        a(this.f26416f, false);
    }

    public void setOnTextWidthProgressChangedListener(cc0 cc0Var) {
    }
}
