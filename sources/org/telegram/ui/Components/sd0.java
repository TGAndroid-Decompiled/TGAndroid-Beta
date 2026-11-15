package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class sd0 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public wa0 J;
    public TextPaint f39279a;
    public TextPaint f39280b;
    public StaticLayout f39281c;
    public float d;
    public float f39282e;
    public StaticLayout f39283f;
    public float h;
    public float f39284n;
    public boolean f39285r;
    public u5 f39286s;
    public boolean f39287w;
    public td0 f39288x;
    public hi.s8 f39289y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f39286s.d(this.f39285r);
        if (d > 0.0f && this.f39281c != null && this.f39283f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f39282e, getHeight() * 0.22f);
            this.f39281c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f39284n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f39283f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f39279a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f39280b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f39281c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.hd.M0(2131751126, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f39281c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f39281c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f39281c.getLineCount() > 0) {
                f11 = this.f39281c.getLineLeft(0);
            }
            this.f39282e = f11;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.f39287w = z10;
    }

    public void setFilterView(td0 td0Var) {
        this.f39288x = td0Var;
    }
}
