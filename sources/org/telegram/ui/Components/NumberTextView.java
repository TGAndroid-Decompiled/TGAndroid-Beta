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
    public final ArrayList f24196a;
    public final ArrayList f24197b;
    public final TextPaint f24198c;
    public ObjectAnimator d;
    public float f24199e;
    public int f24200f;
    public boolean h;
    public boolean f24201n;
    public float f24202r;
    public float f24203s;

    public NumberTextView(Context context) {
        super(context);
        this.f24196a = new ArrayList();
        this.f24197b = new ArrayList();
        this.f24198c = new TextPaint(1);
        this.f24199e = 0.0f;
        this.f24200f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f24203s;
    }

    public float getProgress() {
        return this.f24199e;
    }

    public float getTextWidth() {
        return this.f24202r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f24196a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f7 = AndroidUtilities.dp(4.0f);
        } else {
            f7 = height;
        }
        if (this.f24201n) {
            f10 = (getMeasuredWidth() - this.f24202r) / 2.0f;
            f11 = ((getMeasuredWidth() - this.f24203s) / 2.0f) - f10;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f10, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f24197b;
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
            float f12 = this.f24199e;
            TextPaint textPaint = this.f24198c;
            if (f12 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f12 * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.f24199e - 1.0f) * f7);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f24199e) * 255.0f));
                        canvas.translate(0.0f, this.f24199e * f7);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f12 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f12) * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.f24199e + 1.0f) * f7);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f24199e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f24199e * f7);
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
        this.f24201n = z10;
    }

    public void setProgress(float f7) {
        if (this.f24199e == f7) {
            return;
        }
        this.f24199e = f7;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f24198c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f24198c.setTextSize(AndroidUtilities.dp(i10));
        this.f24197b.clear();
        this.f24196a.clear();
        a(this.f24200f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f24198c.setTypeface(typeface);
        this.f24197b.clear();
        this.f24196a.clear();
        a(this.f24200f, false);
    }

    public void setOnTextWidthProgressChangedListener(id0 id0Var) {
    }
}
