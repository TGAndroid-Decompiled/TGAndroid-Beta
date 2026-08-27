package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class io0 {

    public final xt f29453a;

    public final long f29454b;

    public final float f29455c;
    public final float d;

    public final float f29456e;

    public io0(View view) {
        xt xtVar = new xt(1, view);
        this.f29454b = System.currentTimeMillis();
        this.f29453a = xtVar;
        this.f29455c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.f29456e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        xt xtVar;
        float fCurrentTimeMillis = (System.currentTimeMillis() - this.f29454b) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(((double) (this.f29455c * fCurrentTimeMillis)) * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(((double) (this.d * fCurrentTimeMillis)) * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f10, ((float) Math.sin(((double) (fCurrentTimeMillis * this.f29456e)) * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 <= 0.0f || (xtVar = this.f29453a) == null) {
            return;
        }
        xtVar.run();
    }
}
