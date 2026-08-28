package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class c9 extends View {
    public final b9 f27425a;
    public zf.z0 f27426b;
    public nz0 f27427c;
    public Paint d;

    public c9(Context context, boolean z10) {
        super(context);
        this.f27425a = new b9(this, z10);
    }

    public final void a(boolean z10) {
        this.f27425a.b(z10, true);
    }

    public final void b(int i9, TLObject tLObject, int i10) {
        this.f27425a.l(i9, tLObject, i10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27425a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27425a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f27425a.i(canvas);
        if (this.f27427c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f27426b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f27426b.f50792f);
            this.f27427c.c(rectF.centerX() - (this.f27427c.f31223c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredWidth = getMeasuredWidth();
        b9 b9Var = this.f27425a;
        b9Var.f27087p = measuredWidth;
        b9Var.f27086o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i9) {
        this.f27425a.j(i9);
    }

    public void setCentered(boolean z10) {
        this.f27425a.f27083l = z10;
    }

    public void setCount(int i9) {
        this.f27425a.k(i9);
    }

    public void setDelegate(Runnable runnable) {
        this.f27425a.f27081j = runnable;
    }

    public void setSize(int i9) {
        this.f27425a.f27090s = i9;
    }

    public void setStepFactor(float f10) {
        this.f27425a.f27091t = f10;
    }

    public void setStyle(int i9) {
        b9 b9Var = this.f27425a;
        b9Var.f27082k = i9;
        b9Var.f();
    }
}
