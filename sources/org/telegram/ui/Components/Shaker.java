package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class Shaker {
    private final Runnable invalidate;
    private final float r;
    private final long start;
    private final float sx;
    private final float sy;

    public Shaker(View view) {
        this(new Shaker$$ExternalSyntheticLambda0(view));
        Objects.requireNonNull(view);
    }

    public Shaker(Runnable runnable) {
        this.start = System.currentTimeMillis();
        this.invalidate = runnable;
        this.r = AndroidUtilities.lerp(5.0f, 9.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.sx = AndroidUtilities.lerp(2.5f, 5.0f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
        this.sy = AndroidUtilities.lerp(2.5f, 5.2f, Utilities.clamp01(Utilities.fastRandom.nextFloat()));
    }

    public void concat(Canvas canvas, float f) {
        concat(canvas, f, 0.0f, 0.0f);
    }

    public void concat(Canvas canvas, float f, float f2, float f3) {
        Runnable runnable;
        float fCurrentTimeMillis = (System.currentTimeMillis() - this.start) / 1000.0f;
        canvas.translate(f2, f3);
        canvas.rotate(((float) Math.sin(this.r * fCurrentTimeMillis * 3.141592653589793d)) * 1.0f * f);
        canvas.translate(((float) Math.cos(this.sx * fCurrentTimeMillis * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f, ((float) Math.sin(fCurrentTimeMillis * this.sy * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f);
        canvas.translate(-f2, -f3);
        if (f <= 0.0f || (runnable = this.invalidate) == null) {
            return;
        }
        runnable.run();
    }
}
