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
    public gb0 J;
    public TextPaint f33974a;
    public TextPaint f33975b;
    public StaticLayout f33976c;
    public float d;
    public float f33977e;
    public StaticLayout f33978f;
    public float h;
    public float f33979n;
    public boolean f33980r;
    public c6 f33981s;
    public boolean f33982w;
    public de0 f33983x;
    public hi.s8 f33984y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f33981s.d(this.f33980r);
        if (d > 0.0f && this.f33976c != null && this.f33978f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f33977e, getHeight() * 0.22f);
            this.f33976c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f33979n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f33978f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f33974a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f33975b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f33976c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.gd.M0(2131751115, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f33976c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f33976c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f33976c.getLineCount() > 0) {
                f11 = this.f33976c.getLineLeft(0);
            }
            this.f33977e = f11;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.f33982w = z10;
    }

    public void setFilterView(de0 de0Var) {
        this.f33983x = de0Var;
    }
}
