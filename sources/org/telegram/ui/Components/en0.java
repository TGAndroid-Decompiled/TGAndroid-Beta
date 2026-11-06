package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class en0 {
    public final nt f33291a;
    public final long f33292b;
    public final float f33293c;
    public final float d;
    public final float f33294e;

    public en0(View view) {
        nt ntVar = new nt(1, view);
        this.f33292b = System.currentTimeMillis();
        this.f33291a = ntVar;
        g5.a aVar = Utilities.f21332c;
        this.f33293c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f33294e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        nt ntVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f33292b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f33293c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f33294e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (ntVar = this.f33291a) != null) {
            ntVar.run();
        }
    }
}
