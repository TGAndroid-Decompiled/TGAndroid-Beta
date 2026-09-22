package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class j9 extends View {
    public final i9 f25325a;
    public rg.z0 f25326b;
    public w01 f25327c;
    public Paint d;

    public j9(Context context, boolean z10) {
        super(context);
        this.f25325a = new i9(this, z10);
    }

    public final void a(boolean z10) {
        this.f25325a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f25325a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25325a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25325a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25325a.i(canvas);
        if (this.f25327c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f25326b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f25326b.f42875f);
            this.f25327c.c(rectF.centerX() - (this.f25327c.f29862c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        i9 i9Var = this.f25325a;
        i9Var.f25047p = measuredWidth;
        i9Var.f25046o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f25325a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f25325a.f25043l = z10;
    }

    public void setCount(int i10) {
        this.f25325a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f25325a.f25041j = runnable;
    }

    public void setSize(int i10) {
        this.f25325a.f25050s = i10;
    }

    public void setStepFactor(float f7) {
        this.f25325a.f25051t = f7;
    }

    public void setStyle(int i10) {
        i9 i9Var = this.f25325a;
        i9Var.f25042k = i10;
        i9Var.f();
    }
}
