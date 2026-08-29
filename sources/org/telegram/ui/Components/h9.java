package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class h9 extends View {
    public final g9 f29141a;
    public cg.r1 f29142b;
    public zz0 f29143c;
    public Paint d;

    public h9(Context context, boolean z10) {
        super(context);
        this.f29141a = new g9(this, z10);
    }

    public final void a(boolean z10) {
        this.f29141a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f29141a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29141a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29141a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f29141a.i(canvas);
        if (this.f29143c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f29142b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f29142b.f3319f);
            this.f29143c.c(rectF.centerX() - (this.f29143c.f35462c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        g9 g9Var = this.f29141a;
        g9Var.f28836p = measuredWidth;
        g9Var.f28835o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f29141a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f29141a.f28832l = z10;
    }

    public void setCount(int i10) {
        this.f29141a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f29141a.f28830j = runnable;
    }

    public void setSize(int i10) {
        this.f29141a.f28839s = i10;
    }

    public void setStepFactor(float f9) {
        this.f29141a.f28840t = f9;
    }

    public void setStyle(int i10) {
        g9 g9Var = this.f29141a;
        g9Var.f28831k = i10;
        g9Var.f();
    }
}
