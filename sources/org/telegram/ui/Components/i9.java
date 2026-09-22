package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class i9 extends View {
    public final h9 f24972a;
    public rg.z0 f24973b;
    public g01 f24974c;
    public Paint d;

    public i9(Context context, boolean z10) {
        super(context);
        this.f24972a = new h9(this, z10);
    }

    public final void a(boolean z10) {
        this.f24972a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f24972a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24972a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24972a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24972a.i(canvas);
        if (this.f24974c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f24973b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24973b.f42552f);
            this.f24974c.c(rectF.centerX() - (this.f24974c.f24146c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        h9 h9Var = this.f24972a;
        h9Var.f24630p = measuredWidth;
        h9Var.f24629o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f24972a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f24972a.f24626l = z10;
    }

    public void setCount(int i10) {
        this.f24972a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f24972a.f24624j = runnable;
    }

    public void setSize(int i10) {
        this.f24972a.f24633s = i10;
    }

    public void setStepFactor(float f7) {
        this.f24972a.f24634t = f7;
    }

    public void setStyle(int i10) {
        h9 h9Var = this.f24972a;
        h9Var.f24625k = i10;
        h9Var.f();
    }
}
