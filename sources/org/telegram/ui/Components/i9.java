package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class i9 extends View {
    public final h9 f24900a;
    public rg.z0 f24901b;
    public h01 f24902c;
    public Paint d;

    public i9(Context context, boolean z10) {
        super(context);
        this.f24900a = new h9(this, z10);
    }

    public final void a(boolean z10) {
        this.f24900a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f24900a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24900a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24900a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24900a.i(canvas);
        if (this.f24902c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f24901b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24901b.f42583f);
            this.f24902c.c(rectF.centerX() - (this.f24902c.f24442c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        h9 h9Var = this.f24900a;
        h9Var.f24594p = measuredWidth;
        h9Var.f24593o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f24900a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f24900a.f24590l = z10;
    }

    public void setCount(int i10) {
        this.f24900a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f24900a.f24588j = runnable;
    }

    public void setSize(int i10) {
        this.f24900a.f24597s = i10;
    }

    public void setStepFactor(float f7) {
        this.f24900a.f24598t = f7;
    }

    public void setStyle(int i10) {
        h9 h9Var = this.f24900a;
        h9Var.f24589k = i10;
        h9Var.f();
    }
}
