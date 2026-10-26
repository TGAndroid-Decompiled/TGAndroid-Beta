package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class eq0 {
    public final vu f27963a;
    public final long f27964b;
    public final float f27965c;
    public final float d;
    public final float e;

    public eq0(View view) {
        vu vuVar = new vu(1, view);
        this.f27964b = System.currentTimeMillis();
        this.f27963a = vuVar;
        this.f27965c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        vu vuVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f27964b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f27965c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 > 0.0f && (vuVar = this.f27963a) != null) {
            vuVar.run();
        }
    }
}
