package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zp0 {
    public final zu f31660a;
    public final long f31661b;
    public final float f31662c;
    public final float d;
    public final float e;

    public zp0(View view) {
        zu zuVar = new zu(1, view);
        this.f31661b = System.currentTimeMillis();
        this.f31660a = zuVar;
        this.f31662c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        zu zuVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f31661b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f31662c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 > 0.0f && (zuVar = this.f31660a) != null) {
            zuVar.run();
        }
    }
}
