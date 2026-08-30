package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lf0 extends View {
    public long B;
    public float C;
    public float D;
    public float E;
    public cc0 F;
    public TextPaint f26628a;
    public TextPaint f26629b;
    public StaticLayout f26630c;
    public float d;
    public float e;
    public StaticLayout f26631f;
    public float h;
    public float f26632n;
    public boolean f26633r;
    public z5 f26634s;
    public boolean v;
    public nf0 f26635w;
    public ph.h8 f26636x;
    public boolean f26637y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f26634s.e(this.f26633r);
        if (e > 0.0f && this.f26630c != null && this.f26631f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f26630c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f26632n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f26631f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f26628a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f26629b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f26630c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f26630c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f26630c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f26630c.getLineCount() > 0) {
                f11 = this.f26630c.getLineLeft(0);
            }
            this.e = f11;
        }
    }

    public void setAllowTouch(boolean z4) {
        this.v = z4;
    }

    public void setFilterView(nf0 nf0Var) {
        this.f26635w = nf0Var;
    }
}
