package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class zu {
    public float f28360a;
    public boolean f28361b;
    public float f28362c;
    public float d;
    public float f28363e;
    public ValueAnimator f28364f;
    public final Path f28365g = new Path();

    public final void a(Canvas canvas) {
        if (this.f28360a > 0.0f) {
            Path path = this.f28365g;
            path.rewind();
            path.addCircle(this.f28362c, this.d, this.f28363e * this.f28360a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f28361b && this.f28360a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f28361b && this.f28364f == null) {
            this.f28362c = f10;
            this.d = f11;
            this.f28363e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28364f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f28363e * 0.3f, 550.0f, 250.0f));
            this.f28364f.setInterpolator(org.telegram.ui.Components.lr.f37211j);
            this.f28364f.addUpdateListener(new q(2, this, view));
            this.f28364f.addListener(new ah.l(12, this, view));
            this.f28364f.start();
        }
    }
}
