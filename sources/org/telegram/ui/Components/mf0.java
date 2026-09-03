package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mf0 extends View {
    public long B;
    public float C;
    public float D;
    public float E;
    public dc0 F;
    public TextPaint f27022a;
    public TextPaint f27023b;
    public StaticLayout f27024c;
    public float d;
    public float e;
    public StaticLayout f27025f;
    public float h;
    public float f27026n;
    public boolean f27027r;
    public z5 f27028s;
    public boolean v;
    public of0 f27029w;
    public ph.g8 f27030x;
    public boolean f27031y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f27028s.e(this.f27027r);
        if (e > 0.0f && this.f27024c != null && this.f27025f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f27024c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f27026n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f27025f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f27022a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f27023b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f27024c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27024c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f27024c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f27024c.getLineCount() > 0) {
                f11 = this.f27024c.getLineLeft(0);
            }
            this.e = f11;
        }
    }

    public void setAllowTouch(boolean z4) {
        this.v = z4;
    }

    public void setFilterView(of0 of0Var) {
        this.f27029w = of0Var;
    }
}
