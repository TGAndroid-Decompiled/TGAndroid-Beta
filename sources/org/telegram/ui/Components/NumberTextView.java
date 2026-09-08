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
    public final ArrayList f24037a;
    public final ArrayList f24038b;
    public final TextPaint f24039c;
    public ObjectAnimator d;
    public float f24040e;
    public int f24041f;
    public boolean h;
    public boolean f24042n;
    public float f24043r;
    public float f24044s;

    public NumberTextView(Context context) {
        super(context);
        this.f24037a = new ArrayList();
        this.f24038b = new ArrayList();
        this.f24039c = new TextPaint(1);
        this.f24040e = 0.0f;
        this.f24041f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f24044s;
    }

    public float getProgress() {
        return this.f24040e;
    }

    public float getTextWidth() {
        return this.f24043r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f24037a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f7 = AndroidUtilities.dp(4.0f);
        } else {
            f7 = height;
        }
        if (this.f24042n) {
            f10 = (getMeasuredWidth() - this.f24043r) / 2.0f;
            f11 = ((getMeasuredWidth() - this.f24044s) / 2.0f) - f10;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f10, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f24038b;
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
            float f12 = this.f24040e;
            TextPaint textPaint = this.f24039c;
            if (f12 > 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f12 * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.f24040e - 1.0f) * f7);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f24040e) * 255.0f));
                        canvas.translate(0.0f, this.f24040e * f7);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f12 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f12) * 255.0f));
                    canvas.save();
                    canvas.translate(f11, (this.f24040e + 1.0f) * f7);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i10 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f24040e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f24040e * f7);
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
        this.f24042n = z10;
    }

    public void setProgress(float f7) {
        if (this.f24040e == f7) {
            return;
        }
        this.f24040e = f7;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f24039c.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f24039c.setTextSize(AndroidUtilities.dp(i10));
        this.f24038b.clear();
        this.f24037a.clear();
        a(this.f24041f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f24039c.setTypeface(typeface);
        this.f24038b.clear();
        this.f24037a.clear();
        a(this.f24041f, false);
    }

    public void setOnTextWidthProgressChangedListener(wc0 wc0Var) {
    }
}
