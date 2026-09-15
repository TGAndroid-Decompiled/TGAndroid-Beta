package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class i9 extends View {
    public final h9 f24966a;
    public rg.z0 f24967b;
    public g01 f24968c;
    public Paint d;

    public i9(Context context, boolean z10) {
        super(context);
        this.f24966a = new h9(this, z10);
    }

    public final void a(boolean z10) {
        this.f24966a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f24966a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24966a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24966a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24966a.i(canvas);
        if (this.f24968c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f24967b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24967b.f42556f);
            this.f24968c.c(rectF.centerX() - (this.f24968c.f24149c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        h9 h9Var = this.f24966a;
        h9Var.f24627p = measuredWidth;
        h9Var.f24626o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f24966a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f24966a.f24623l = z10;
    }

    public void setCount(int i10) {
        this.f24966a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f24966a.f24621j = runnable;
    }

    public void setSize(int i10) {
        this.f24966a.f24630s = i10;
    }

    public void setStepFactor(float f7) {
        this.f24966a.f24631t = f7;
    }

    public void setStyle(int i10) {
        h9 h9Var = this.f24966a;
        h9Var.f24622k = i10;
        h9Var.f();
    }
}
