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
    public final ArrayList f26423a;
    public final ArrayList f26424b;
    public final TextPaint f26425c;
    public ObjectAnimator d;
    public float f26426e;
    public int f26427f;
    public boolean h;
    public boolean f26428n;
    public float f26429r;
    public float f26430s;

    public NumberTextView(Context context) {
        super(context);
        this.f26423a = new ArrayList();
        this.f26424b = new ArrayList();
        this.f26425c = new TextPaint(1);
        this.f26426e = 0.0f;
        this.f26427f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f26430s;
    }

    public float getProgress() {
        return this.f26426e;
    }

    public float getTextWidth() {
        return this.f26429r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f26423a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f9 = AndroidUtilities.dp(4.0f);
        } else {
            f9 = height;
        }
        if (this.f26428n) {
            f10 = (getMeasuredWidth() - this.f26429r) / 2.0f;
            f11 = ((getMeasuredWidth() - this.f26430s) / 2.0f) - f10;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f10, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f26424b;
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
            float f12 = this.f26426e;
            TextPaint textPaint = this.f26425c;
            if (f12 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f12 * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.f26426e - 1.0f) * f9);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f26426e) * 255.0f));
                        canvas.translate(0.0f, this.f26426e * f9);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f12 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f12) * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.f26426e + 1.0f) * f9);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f26426e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f26426e * f9);
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
        this.f26428n = z10;
    }

    public void setProgress(float f9) {
        if (this.f26426e == f9) {
            return;
        }
        this.f26426e = f9;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f26425c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f26425c.setTextSize(AndroidUtilities.dp(i10));
        this.f26424b.clear();
        this.f26423a.clear();
        a(this.f26427f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f26425c.setTypeface(typeface);
        this.f26424b.clear();
        this.f26423a.clear();
        a(this.f26427f, false);
    }

    public void setOnTextWidthProgressChangedListener(rc0 rc0Var) {
    }
}
