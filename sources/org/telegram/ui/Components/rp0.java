package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rp0 {
    public final qu f30492a;
    public final long f30493b;
    public final float f30494c;
    public final float d;
    public final float f30495e;

    public rp0(View view) {
        qu quVar = new qu(1, view);
        this.f30493b = System.currentTimeMillis();
        this.f30492a = quVar;
        this.f30494c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.f30495e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f7) {
        qu quVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f30493b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f30494c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f7);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7, ((float) Math.sin(currentTimeMillis * this.f30495e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f7);
        canvas.translate(-0.0f, -0.0f);
        if (f7 > 0.0f && (quVar = this.f30492a) != null) {
            quVar.run();
        }
    }
}
