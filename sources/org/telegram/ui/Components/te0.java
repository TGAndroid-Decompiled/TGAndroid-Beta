package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class te0 extends View {
    public long A;
    public float B;
    public float C;
    public float D;
    public mb0 E;

    public TextPaint f32750a;

    public TextPaint f32751b;

    public StaticLayout f32752c;
    public float d;

    public float f32753e;

    public StaticLayout f32754f;
    public float h;

    public float f32755n;

    public boolean f32756r;

    public y5 f32757s;
    public boolean v;

    public ve0 f32758w;

    public lh.s9 f32759x;

    public boolean f32760y;

    @Override
    public final void onDraw(Canvas canvas) {
        float fE = this.f32757s.e(this.f32756r);
        if (fE <= 0.0f || this.f32752c == null || this.f32754f == null) {
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (fE * 255.0f), 31);
        canvas.save();
        canvas.translate(((getWidth() - this.d) / 2.0f) - this.f32753e, getHeight() * 0.22f);
        this.f32752c.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((getWidth() - this.h) / 2.0f) - this.f32755n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
        this.f32754f.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f32750a;
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f32751b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f32752c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f32752c = staticLayout;
            this.d = staticLayout.getLineCount() > 0 ? this.f32752c.getLineWidth(0) : 0.0f;
            this.f32753e = this.f32752c.getLineCount() > 0 ? this.f32752c.getLineLeft(0) : 0.0f;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(ve0 ve0Var) {
        this.f32758w = ve0Var;
    }
}
