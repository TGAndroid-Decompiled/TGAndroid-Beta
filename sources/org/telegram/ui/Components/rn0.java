package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class rn0 {
    public final zt f39254a;
    public final long f39255b;
    public final float f39256c;
    public final float d;
    public final float f39257e;

    public rn0(View view) {
        zt ztVar = new zt(1, view);
        this.f39255b = System.currentTimeMillis();
        this.f39254a = ztVar;
        g5.a aVar = Utilities.f22778c;
        this.f39256c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f39257e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        zt ztVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f39255b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f39256c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f39257e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (ztVar = this.f39254a) != null) {
            ztVar.run();
        }
    }
}
