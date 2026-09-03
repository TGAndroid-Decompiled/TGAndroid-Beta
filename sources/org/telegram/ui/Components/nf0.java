package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nf0 extends View {
    public long B;
    public float C;
    public float D;
    public float E;
    public ec0 F;
    public TextPaint f29439a;
    public TextPaint f29440b;
    public StaticLayout f29441c;
    public float d;
    public float f29442e;
    public StaticLayout f29443f;
    public float h;
    public float f29444n;
    public boolean f29445r;
    public z5 f29446s;
    public boolean v;
    public pf0 f29447w;
    public qh.f8 f29448x;
    public boolean f29449y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e6 = this.f29446s.e(this.f29445r);
        if (e6 > 0.0f && this.f29441c != null && this.f29443f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e6 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f29442e, getHeight() * 0.22f);
            this.f29441c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f29444n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f29443f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f29439a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f29440b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f29441c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f29441c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f29441c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f29441c.getLineCount() > 0) {
                f11 = this.f29441c.getLineLeft(0);
            }
            this.f29442e = f11;
        }
    }

    public void setAllowTouch(boolean z4) {
        this.v = z4;
    }

    public void setFilterView(pf0 pf0Var) {
        this.f29447w = pf0Var;
    }
}
