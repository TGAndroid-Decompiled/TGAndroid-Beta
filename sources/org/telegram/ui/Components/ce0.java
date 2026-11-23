package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class ce0 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public eb0 J;
    public TextPaint f34032a;
    public TextPaint f34033b;
    public StaticLayout f34034c;
    public float d;
    public float f34035e;
    public StaticLayout f34036f;
    public float h;
    public float f34037n;
    public boolean f34038r;
    public c6 f34039s;
    public boolean f34040w;
    public de0 f34041x;
    public hi.m9 f34042y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f34039s.d(this.f34038r);
        if (d > 0.0f && this.f34034c != null && this.f34036f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f34035e, getHeight() * 0.22f);
            this.f34034c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f34037n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f34036f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f34032a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f34033b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f34034c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.gd.N0(2131751114, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f34034c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f34034c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f34034c.getLineCount() > 0) {
                f11 = this.f34034c.getLineLeft(0);
            }
            this.f34035e = f11;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.f34040w = z10;
    }

    public void setFilterView(de0 de0Var) {
        this.f34041x = de0Var;
    }
}
