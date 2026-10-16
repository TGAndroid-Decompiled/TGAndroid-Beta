package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class n9 extends View {
    public final m9 f27318a;
    public sg.a1 f27319b;
    public i11 f27320c;
    public Paint d;

    public n9(Context context, boolean z10) {
        super(context);
        this.f27318a = new m9(this, z10);
    }

    public final void a(boolean z10) {
        this.f27318a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f27318a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27318a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27318a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f27318a.i(canvas);
        if (this.f27320c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f27319b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f27319b.f45117f);
            this.f27320c.c(rectF.centerX() - (this.f27320c.f25455c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        m9 m9Var = this.f27318a;
        m9Var.f27020p = measuredWidth;
        m9Var.f27019o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f27318a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f27318a.f27016l = z10;
    }

    public void setCount(int i10) {
        this.f27318a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f27318a.f27014j = runnable;
    }

    public void setSize(int i10) {
        this.f27318a.f27023s = i10;
    }

    public void setStepFactor(float f7) {
        this.f27318a.f27024t = f7;
    }

    public void setStyle(int i10) {
        m9 m9Var = this.f27318a;
        m9Var.f27015k = i10;
        m9Var.f();
    }
}
