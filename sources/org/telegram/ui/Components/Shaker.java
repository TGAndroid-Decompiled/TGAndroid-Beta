package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.Objects;
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
        Runnable runnable;
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.start)) / 1000.0f;
        double d = this.r * currentTimeMillis;
        Double.isNaN(d);
        canvas.rotate(((float) Math.sin(d * 3.141592653589793d)) * 1.0f * f);
        double d2 = this.sx * currentTimeMillis;
        Double.isNaN(d2);
        float cos = ((float) Math.cos(d2 * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f;
        double d3 = currentTimeMillis * this.sy;
        Double.isNaN(d3);
        canvas.translate(cos, ((float) Math.sin(d3 * 3.141592653589793d)) * AndroidUtilities.dp(0.5f) * f);
        if (f <= 0.0f || (runnable = this.invalidate) == null) {
            return;
        }
        runnable.run();
    }
}
