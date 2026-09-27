package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class np0 {
    public final pu f26880a;
    public final long f26881b;
    public final float f26882c;
    public final float d;
    public final float e;

    public np0(View view) {
        pu puVar = new pu(1, view);
        this.f26881b = System.currentTimeMillis();
        this.f26880a = puVar;
        this.f26882c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        pu puVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f26881b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f26882c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 > 0.0f && (puVar = this.f26880a) != null) {
            puVar.run();
        }
    }
}
