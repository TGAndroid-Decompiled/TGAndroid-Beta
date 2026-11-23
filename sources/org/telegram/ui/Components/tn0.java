package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class tn0 {
    public final bu f39996a;
    public final long f39997b;
    public final float f39998c;
    public final float d;
    public final float f39999e;

    public tn0(View view) {
        bu buVar = new bu(1, view);
        this.f39997b = System.currentTimeMillis();
        this.f39996a = buVar;
        g5.a aVar = Utilities.f22809c;
        this.f39998c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f39999e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        bu buVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f39997b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f39998c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f39999e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (buVar = this.f39996a) != null) {
            buVar.run();
        }
    }
}
