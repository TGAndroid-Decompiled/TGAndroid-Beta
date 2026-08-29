package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class so0 {
    public final eu f32697a;
    public final long f32698b;
    public final float f32699c;
    public final float d;
    public final float f32700e;

    public so0(View view) {
        eu euVar = new eu(1, view);
        this.f32698b = System.currentTimeMillis();
        this.f32697a = euVar;
        this.f32699c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.f32700e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f9) {
        eu euVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f32698b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f32699c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f9);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f9, ((float) Math.sin(currentTimeMillis * this.f32700e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f9);
        canvas.translate(-0.0f, -0.0f);
        if (f9 > 0.0f && (euVar = this.f32697a) != null) {
            euVar.run();
        }
    }
}
