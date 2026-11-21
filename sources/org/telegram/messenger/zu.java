package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class zu {
    public float f28388a;
    public boolean f28389b;
    public float f28390c;
    public float d;
    public float f28391e;
    public ValueAnimator f28392f;
    public final Path f28393g = new Path();

    public final void a(Canvas canvas) {
        if (this.f28388a > 0.0f) {
            Path path = this.f28393g;
            path.rewind();
            path.addCircle(this.f28390c, this.d, this.f28391e * this.f28388a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f28389b && this.f28388a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f28389b && this.f28392f == null) {
            this.f28390c = f10;
            this.d = f11;
            this.f28391e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28392f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f28391e * 0.3f, 550.0f, 250.0f));
            this.f28392f.setInterpolator(org.telegram.ui.Components.nr.f37959j);
            this.f28392f.addUpdateListener(new q(2, this, view));
            this.f28392f.addListener(new ah.l(12, this, view));
            this.f28392f.start();
        }
    }
}
