package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class d9 extends View {
    public final c9 f24231a;
    public eg.q1 f24232b;
    public k01 f24233c;
    public Paint d;

    public d9(Context context, boolean z4) {
        super(context);
        this.f24231a = new c9(this, z4);
    }

    public final void a(boolean z4) {
        this.f24231a.b(z4, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f24231a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24231a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24231a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24231a.i(canvas);
        if (this.f24233c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f24232b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24232b.f5446f);
            this.f24233c.c(rectF.centerX() - (this.f24233c.f26124c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        c9 c9Var = this.f24231a;
        c9Var.f23887p = measuredWidth;
        c9Var.f23886o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f24231a.j(i10);
    }

    public void setCentered(boolean z4) {
        this.f24231a.f23883l = z4;
    }

    public void setCount(int i10) {
        this.f24231a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f24231a.f23881j = runnable;
    }

    public void setSize(int i10) {
        this.f24231a.f23890s = i10;
    }

    public void setStepFactor(float f10) {
        this.f24231a.f23891t = f10;
    }

    public void setStyle(int i10) {
        c9 c9Var = this.f24231a;
        c9Var.f23882k = i10;
        c9Var.f();
    }
}
