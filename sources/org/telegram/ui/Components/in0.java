package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class in0 {
    public final ut f35670a;
    public final long f35671b;
    public final float f35672c;
    public final float d;
    public final float f35673e;

    public in0(View view) {
        ut utVar = new ut(1, view);
        this.f35671b = System.currentTimeMillis();
        this.f35670a = utVar;
        g5.a aVar = Utilities.f22415c;
        this.f35672c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f35673e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        ut utVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f35671b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f35672c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f35673e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (utVar = this.f35670a) != null) {
            utVar.run();
        }
    }
}
