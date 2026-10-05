package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tf0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public lc0 I;
    public TextPaint f31126a;
    public TextPaint f31127b;
    public StaticLayout f31128c;
    public float d;
    public float f31129e;
    public StaticLayout f31130f;
    public float h;
    public float f31131n;
    public boolean f31132r;
    public e6 f31133s;
    public boolean v;
    public vf0 f31134w;
    public ci.ga f31135x;
    public boolean f31136y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f31133s.e(this.f31132r);
        if (e7 > 0.0f && this.f31128c != null && this.f31130f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e7 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f31129e, getHeight() * 0.22f);
            this.f31128c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f31131n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f31130f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f31126a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f31127b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f31128c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f31128c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f31128c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f31128c.getLineCount() > 0) {
                f10 = this.f31128c.getLineLeft(0);
            }
            this.f31129e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(vf0 vf0Var) {
        this.f31134w = vf0Var;
    }
}
