package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class md0 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public jb0 J;
    public TextPaint f36129a;
    public TextPaint f36130b;
    public StaticLayout f36131c;
    public float d;
    public float f36132e;
    public StaticLayout f36133f;
    public float h;
    public float f36134n;
    public boolean f36135r;
    public u5 f36136s;
    public boolean f36137w;
    public nd0 f36138x;
    public gi.v8 f36139y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f36136s.d(this.f36135r);
        if (d > 0.0f && this.f36131c != null && this.f36133f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f36132e, getHeight() * 0.22f);
            this.f36131c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f36134n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f36133f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f36129a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f36130b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f36131c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.bd.M0(2131751127, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f36131c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f36131c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f36131c.getLineCount() > 0) {
                f11 = this.f36131c.getLineLeft(0);
            }
            this.f36132e = f11;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.f36137w = z10;
    }

    public void setFilterView(nd0 nd0Var) {
        this.f36138x = nd0Var;
    }
}
