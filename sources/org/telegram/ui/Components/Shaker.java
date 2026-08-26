package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class Shaker {
    public final Shaker$$ExternalSyntheticLambda0 invalidate;
    public final float r;
    public final long start;
    public final float sx;
    public final float sy;

    public Shaker(View view) {
        Shaker$$ExternalSyntheticLambda0 shaker$$ExternalSyntheticLambda0 = new Shaker$$ExternalSyntheticLambda0(0, view);
        this.start = System.currentTimeMillis();
        this.invalidate = shaker$$ExternalSyntheticLambda0;
        this.r = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.sx = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.sy = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public final void concat(Canvas canvas, float f) {
        Shaker$$ExternalSyntheticLambda0 shaker$$ExternalSyntheticLambda0;
        float fCurrentTimeMillis = (System.currentTimeMillis() - this.start) / 1000.0f;
        canvas.translate(0.0f, 0.0f);
        canvas.rotate(((float) Math.sin(((double) (this.r * fCurrentTimeMillis)) * 3.141592653589793d)) * 1.0f * f);
        canvas.translate(((float) Math.cos(((double) (this.sx * fCurrentTimeMillis)) * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f, ((float) Math.sin(((double) (fCurrentTimeMillis * this.sy)) * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f);
        canvas.translate(-0.0f, -0.0f);
        if (f <= 0.0f || (shaker$$ExternalSyntheticLambda0 = this.invalidate) == null) {
            return;
        }
        shaker$$ExternalSyntheticLambda0.run();
    }
}
