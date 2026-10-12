package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gg0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public yc0 I;
    public TextPaint f25266a;
    public TextPaint f25267b;
    public StaticLayout f25268c;
    public float d;
    public float e;
    public StaticLayout f25269f;
    public float h;
    public float f25270n;
    public boolean f25271r;
    public g6 f25272s;
    public boolean v;
    public ig0 f25273w;
    public di.ga f25274x;
    public boolean f25275y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25272s.e(this.f25271r);
        if (e > 0.0f && this.f25268c != null && this.f25269f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f25268c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f25270n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f25269f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f25266a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f25267b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f25268c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f25268c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f25268c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f25268c.getLineCount() > 0) {
                f10 = this.f25268c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(ig0 ig0Var) {
        this.f25273w = ig0Var;
    }
}
