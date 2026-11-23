package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class sn0 {
    public final zt f39656a;
    public final long f39657b;
    public final float f39658c;
    public final float d;
    public final float f39659e;

    public sn0(View view) {
        zt ztVar = new zt(1, view);
        this.f39657b = System.currentTimeMillis();
        this.f39656a = ztVar;
        g5.a aVar = Utilities.f22876c;
        this.f39658c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f39659e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        zt ztVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f39657b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f39658c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f39659e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (ztVar = this.f39656a) != null) {
            ztVar.run();
        }
    }
}
