package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class zu {
    public float f28452a;
    public boolean f28453b;
    public float f28454c;
    public float d;
    public float f28455e;
    public ValueAnimator f28456f;
    public final Path f28457g = new Path();

    public final void a(Canvas canvas) {
        if (this.f28452a > 0.0f) {
            Path path = this.f28457g;
            path.rewind();
            path.addCircle(this.f28454c, this.d, this.f28455e * this.f28452a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f28453b && this.f28452a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f28453b && this.f28456f == null) {
            this.f28454c = f10;
            this.d = f11;
            this.f28455e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f28456f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f28455e * 0.3f, 550.0f, 250.0f));
            this.f28456f.setInterpolator(org.telegram.ui.Components.kr.f36861j);
            this.f28456f.addUpdateListener(new q(2, this, view));
            this.f28456f.addListener(new ah.l(12, this, view));
            this.f28456f.start();
        }
    }
}
