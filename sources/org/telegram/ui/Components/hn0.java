package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class hn0 {
    public final nt f34458a;
    public final long f34459b;
    public final float f34460c;
    public final float d;
    public final float f34461e;

    public hn0(View view) {
        nt ntVar = new nt(1, view);
        this.f34459b = System.currentTimeMillis();
        this.f34458a = ntVar;
        f5.a aVar = Utilities.f21386c;
        this.f34460c = org.telegram.messenger.g0.T1(5.0f, 9.0f, Utilities.l(aVar.nextFloat()));
        this.d = org.telegram.messenger.g0.T1(2.5f, 5.0f, Utilities.l(aVar.nextFloat()));
        this.f34461e = org.telegram.messenger.g0.T1(2.5f, 5.2f, Utilities.l(aVar.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        nt ntVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f34459b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f34460c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f34461e * 3.141592653589793d)) * org.telegram.messenger.g0.L(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (ntVar = this.f34458a) != null) {
            ntVar.run();
        }
    }
}
