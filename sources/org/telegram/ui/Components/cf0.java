package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cf0 extends View {
    public long A;
    public float B;
    public float C;
    public float D;
    public xb0 E;
    public TextPaint f27466a;
    public TextPaint f27467b;
    public StaticLayout f27468c;
    public float d;
    public float f27469e;
    public StaticLayout f27470f;
    public float h;
    public float f27471n;
    public boolean f27472r;
    public d6 f27473s;
    public boolean v;
    public ef0 f27474w;
    public nh.g9 f27475x;
    public boolean f27476y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f27473s.e(this.f27472r);
        if (e10 > 0.0f && this.f27468c != null && this.f27470f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e10 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f27469e, getHeight() * 0.22f);
            this.f27468c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f27471n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f27470f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f27466a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f27467b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f27468c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27468c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f9 = this.f27468c.getLineWidth(0);
            } else {
                f9 = 0.0f;
            }
            this.d = f9;
            if (this.f27468c.getLineCount() > 0) {
                f10 = this.f27468c.getLineLeft(0);
            }
            this.f27469e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(ef0 ef0Var) {
        this.f27474w = ef0Var;
    }
}
