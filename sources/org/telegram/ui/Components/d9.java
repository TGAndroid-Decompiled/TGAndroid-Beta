package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class d9 extends View {
    public final c9 f26228a;
    public fg.p1 f26229b;
    public k01 f26230c;
    public Paint d;

    public d9(Context context, boolean z4) {
        super(context);
        this.f26228a = new c9(this, z4);
    }

    public final void a(boolean z4) {
        this.f26228a.b(z4, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f26228a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26228a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26228a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f26228a.i(canvas);
        if (this.f26230c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f26229b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f26229b.f6490f);
            this.f26230c.c(rectF.centerX() - (this.f26230c.f28227c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        c9 c9Var = this.f26228a;
        c9Var.f25853p = measuredWidth;
        c9Var.f25852o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f26228a.j(i10);
    }

    public void setCentered(boolean z4) {
        this.f26228a.f25849l = z4;
    }

    public void setCount(int i10) {
        this.f26228a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f26228a.f25847j = runnable;
    }

    public void setSize(int i10) {
        this.f26228a.f25856s = i10;
    }

    public void setStepFactor(float f10) {
        this.f26228a.f25857t = f10;
    }

    public void setStyle(int i10) {
        c9 c9Var = this.f26228a;
        c9Var.f25848k = i10;
        c9Var.f();
    }
}
