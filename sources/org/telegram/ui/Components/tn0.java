package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class tn0 {
    public final bu f40003a;
    public final long f40004b;
    public final float f40005c;
    public final float d;
    public final float f40006e;

    public tn0(View view) {
        bu buVar = new bu(1, view);
        this.f40004b = System.currentTimeMillis();
        this.f40003a = buVar;
        g5.a aVar = Utilities.f22806c;
        this.f40005c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f40006e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        bu buVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f40004b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f40005c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f40006e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (buVar = this.f40003a) != null) {
            buVar.run();
        }
    }
}
