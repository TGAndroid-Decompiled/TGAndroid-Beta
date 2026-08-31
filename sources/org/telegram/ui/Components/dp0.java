package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dp0 {
    public final ju f26305a;
    public final long f26306b;
    public final float f26307c;
    public final float d;
    public final float f26308e;

    public dp0(View view) {
        ju juVar = new ju(1, view);
        this.f26306b = System.currentTimeMillis();
        this.f26305a = juVar;
        this.f26307c = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.d = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.f26308e = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void a(Canvas canvas, float f10) {
        ju juVar;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f26306b)) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(this.f26307c * currentTimeMillis * 3.141592653589793d)) * 1.0f * f10);
        canvas.translate(((float) Math.cos(this.d * currentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f10, ((float) Math.sin(currentTimeMillis * this.f26308e * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f10);
        canvas.translate(-0.0f, -0.0f);
        if (f10 > 0.0f && (juVar = this.f26305a) != null) {
            juVar.run();
        }
    }
}
