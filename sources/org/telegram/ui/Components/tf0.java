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
    public kc0 I;
    public TextPaint f28543a;
    public TextPaint f28544b;
    public StaticLayout f28545c;
    public float d;
    public float e;
    public StaticLayout f28546f;
    public float h;
    public float f28547n;
    public boolean f28548r;
    public e6 f28549s;
    public boolean v;
    public vf0 f28550w;
    public ci.ha f28551x;
    public boolean f28552y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f28549s.e(this.f28548r);
        if (e > 0.0f && this.f28545c != null && this.f28546f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f28545c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f28547n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f28546f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f28543a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f28544b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f28545c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f28545c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f28545c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f28545c.getLineCount() > 0) {
                f10 = this.f28545c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(vf0 vf0Var) {
        this.f28550w = vf0Var;
    }
}
