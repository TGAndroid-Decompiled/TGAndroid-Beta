package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class en0 {
    public final nt f33300a;
    public final long f33301b;
    public final float f33302c;
    public final float d;
    public final float f33303e;

    public en0(View view) {
        nt ntVar = new nt(1, view);
        this.f33301b = System.currentTimeMillis();
        this.f33300a = ntVar;
        g5.a aVar = Utilities.f21340c;
        this.f33302c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f33303e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        nt ntVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f33301b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f33302c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f33303e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (ntVar = this.f33300a) != null) {
            ntVar.run();
        }
    }
}
