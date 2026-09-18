package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class k9 extends View {
    public final j9 f25645a;
    public rg.z0 f25646b;
    public v01 f25647c;
    public Paint d;

    public k9(Context context, boolean z10) {
        super(context);
        this.f25645a = new j9(this, z10);
    }

    public final void a(boolean z10) {
        this.f25645a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f25645a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25645a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25645a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25645a.i(canvas);
        if (this.f25647c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f25646b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f25646b.f42810f);
            this.f25647c.c(rectF.centerX() - (this.f25647c.f28868c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        j9 j9Var = this.f25645a;
        j9Var.f25259p = measuredWidth;
        j9Var.f25258o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f25645a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f25645a.f25255l = z10;
    }

    public void setCount(int i10) {
        this.f25645a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f25645a.f25253j = runnable;
    }

    public void setSize(int i10) {
        this.f25645a.f25262s = i10;
    }

    public void setStepFactor(float f7) {
        this.f25645a.f25263t = f7;
    }

    public void setStyle(int i10) {
        j9 j9Var = this.f25645a;
        j9Var.f25254k = i10;
        j9Var.f();
    }
}
