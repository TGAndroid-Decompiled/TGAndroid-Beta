package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.xy0;
public final class d0 {
    public final Runnable f30529a;
    public boolean f30530b;
    public float f30531c;
    public int d;
    public float f30532e;
    public int f30533f;
    public int f30534g;
    public xy0 h;
    public TL_keyboard.KeyboardInlineButton f30535i;
    public org.telegram.messenger.p2 f30536j;
    public org.telegram.messenger.n2 f30537k;
    public boolean f30538l;
    public boolean f30539m;
    public final Path f30540n = new Path();
    public final Paint f30541o = new Paint(1);
    public final RectF f30542p = new RectF();
    public final float[] f30543q = new float[8];
    public q80 f30544r;
    public y f30545s;
    public Drawable f30546t;
    public org.telegram.ui.Components.p5 f30547u;
    public boolean v;
    public float f30548w;
    public ValueAnimator f30549x;

    public d0(Runnable runnable) {
        this.f30529a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30548w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24047r) / 100.0f) + f10;
                this.f30548w = min;
                this.f30548w = Utilities.i(min, 1.0f, 0.0f);
                this.f30529a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30548w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30529a.run();
            if (z10 && (valueAnimator = this.f30549x) != null) {
                valueAnimator.removeAllListeners();
                this.f30549x.cancel();
            }
            if (!z10) {
                float f10 = this.f30548w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30549x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30549x.addListener(new ki.m3(this, 23));
                    c0.q(2.0f, this.f30549x);
                    this.f30549x.setDuration(350L);
                    this.f30549x.start();
                }
            }
        }
    }
}
