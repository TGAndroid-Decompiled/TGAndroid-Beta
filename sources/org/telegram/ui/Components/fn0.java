package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class fn0 {
    public final ot f33714a;
    public final long f33715b;
    public final float f33716c;
    public final float d;
    public final float f33717e;

    public fn0(View view) {
        ot otVar = new ot(1, view);
        this.f33715b = System.currentTimeMillis();
        this.f33714a = otVar;
        g5.a aVar = Utilities.f21335c;
        this.f33716c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f33717e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        ot otVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f33715b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f33716c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f33717e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (otVar = this.f33714a) != null) {
            otVar.run();
        }
    }
}
