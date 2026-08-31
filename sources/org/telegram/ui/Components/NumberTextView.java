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
    public final ArrayList f24909a;
    public final ArrayList f24910b;
    public final TextPaint f24911c;
    public ObjectAnimator d;
    public float f24912e;
    public int f24913f;
    public boolean h;
    public boolean f24914n;
    public float f24915r;
    public float f24916s;

    public NumberTextView(Context context) {
        super(context);
        this.f24909a = new ArrayList();
        this.f24910b = new ArrayList();
        this.f24911c = new TextPaint(1);
        this.f24912e = 0.0f;
        this.f24913f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f24916s;
    }

    public float getProgress() {
        return this.f24912e;
    }

    public float getTextWidth() {
        return this.f24915r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f24909a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = height;
        }
        if (this.f24914n) {
            f11 = (getMeasuredWidth() - this.f24915r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f24916s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f24910b;
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
            float f13 = this.f24912e;
            TextPaint textPaint = this.f24911c;
            if (f13 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f24912e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f24912e) * 255.0f));
                        canvas.translate(0.0f, this.f24912e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f24912e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f24912e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f24912e * f10);
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
        this.f24914n = z4;
    }

    public void setProgress(float f10) {
        if (this.f24912e == f10) {
            return;
        }
        this.f24912e = f10;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f24911c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f24911c.setTextSize(AndroidUtilities.dp(i10));
        this.f24910b.clear();
        this.f24909a.clear();
        a(this.f24913f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f24911c.setTypeface(typeface);
        this.f24910b.clear();
        this.f24909a.clear();
        a(this.f24913f, false);
    }

    public void setOnTextWidthProgressChangedListener(zc0 zc0Var) {
    }
}
