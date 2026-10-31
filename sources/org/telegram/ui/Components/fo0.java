package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class fo0 {
    public final zt f26111a;
    public final long f26112b;
    public final float f26113c;
    public final float d;
    public final float e;

    public fo0(View view) {
        zt ztVar = new zt(1, view);
        this.f26112b = System.currentTimeMillis();
        this.f26111a = ztVar;
        d5.a aVar = Utilities.f14520c;
        this.f26113c = org.telegram.messenger.i0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.i0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.e = org.telegram.messenger.i0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        zt ztVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f26112b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f26113c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.i0.L(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * org.telegram.messenger.i0.L(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 > 0.0f && (ztVar = this.f26111a) != null) {
            ztVar.run();
        }
    }
}
