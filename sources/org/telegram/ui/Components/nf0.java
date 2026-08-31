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
    public TextPaint f29461a;
    public TextPaint f29462b;
    public StaticLayout f29463c;
    public float d;
    public float f29464e;
    public StaticLayout f29465f;
    public float h;
    public float f29466n;
    public boolean f29467r;
    public z5 f29468s;
    public boolean v;
    public pf0 f29469w;
    public qh.g8 f29470x;
    public boolean f29471y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e6 = this.f29468s.e(this.f29467r);
        if (e6 > 0.0f && this.f29463c != null && this.f29465f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e6 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f29464e, getHeight() * 0.22f);
            this.f29463c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f29466n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f29465f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f29461a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f29462b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f29463c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f29463c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f29463c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f29463c.getLineCount() > 0) {
                f11 = this.f29463c.getLineLeft(0);
            }
            this.f29464e = f11;
        }
    }

    public void setAllowTouch(boolean z4) {
        this.v = z4;
    }

    public void setFilterView(pf0 pf0Var) {
        this.f29469w = pf0Var;
    }
}
