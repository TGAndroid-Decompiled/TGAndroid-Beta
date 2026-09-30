package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class op0 {
    public final qu f27163a;
    public final long f27164b;
    public final float f27165c;
    public final float d;
    public final float e;

    public op0(View view) {
        qu quVar = new qu(1, view);
        this.f27164b = System.currentTimeMillis();
        this.f27163a = quVar;
        this.f27165c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        qu quVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f27164b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f27165c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 > 0.0f && (quVar = this.f27163a) != null) {
            quVar.run();
        }
    }
}
