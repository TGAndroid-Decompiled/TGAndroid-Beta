package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class zu {
    public float f28362a;
    public boolean f28363b;
    public float f28364c;
    public float d;
    public float f28365e;
    public ValueAnimator f28366f;
    public final Path f28367g = new Path();

    public final void a(Canvas canvas) {
        if (this.f28362a > 0.0f) {
            Path path = this.f28367g;
            path.rewind();
            path.addCircle(this.f28364c, this.d, this.f28365e * this.f28362a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f28363b && this.f28362a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f28363b && this.f28366f == null) {
            this.f28364c = f10;
            this.d = f11;
            this.f28365e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28366f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f28365e * 0.3f, 550.0f, 250.0f));
            this.f28366f.setInterpolator(org.telegram.ui.Components.lr.f37211j);
            this.f28366f.addUpdateListener(new q(2, this, view));
            this.f28366f.addListener(new ah.l(12, this, view));
            this.f28366f.start();
        }
    }
}
