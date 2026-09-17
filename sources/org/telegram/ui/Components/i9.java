package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class i9 extends View {
    public final h9 f24897a;
    public rg.z0 f24898b;
    public h01 f24899c;
    public Paint d;

    public i9(Context context, boolean z10) {
        super(context);
        this.f24897a = new h9(this, z10);
    }

    public final void a(boolean z10) {
        this.f24897a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f24897a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24897a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24897a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24897a.i(canvas);
        if (this.f24899c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f24898b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24898b.f42578f);
            this.f24899c.c(rectF.centerX() - (this.f24899c.f24439c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        h9 h9Var = this.f24897a;
        h9Var.f24591p = measuredWidth;
        h9Var.f24590o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f24897a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f24897a.f24587l = z10;
    }

    public void setCount(int i10) {
        this.f24897a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f24897a.f24585j = runnable;
    }

    public void setSize(int i10) {
        this.f24897a.f24594s = i10;
    }

    public void setStepFactor(float f7) {
        this.f24897a.f24595t = f7;
    }

    public void setStyle(int i10) {
        h9 h9Var = this.f24897a;
        h9Var.f24586k = i10;
        h9Var.f();
    }
}
