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
    public final Runnable f30495a;
    public boolean f30496b;
    public float f30497c;
    public int d;
    public float f30498e;
    public int f30499f;
    public int f30500g;
    public xy0 h;
    public TL_keyboard.KeyboardInlineButton f30501i;
    public org.telegram.messenger.p2 f30502j;
    public org.telegram.messenger.n2 f30503k;
    public boolean f30504l;
    public boolean f30505m;
    public final Path f30506n = new Path();
    public final Paint f30507o = new Paint(1);
    public final RectF f30508p = new RectF();
    public final float[] f30509q = new float[8];
    public q80 f30510r;
    public y f30511s;
    public Drawable f30512t;
    public org.telegram.ui.Components.p5 f30513u;
    public boolean v;
    public float f30514w;
    public ValueAnimator f30515x;

    public d0(Runnable runnable) {
        this.f30495a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30514w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24011r) / 100.0f) + f10;
                this.f30514w = min;
                this.f30514w = Utilities.i(min, 1.0f, 0.0f);
                this.f30495a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30514w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30495a.run();
            if (z10 && (valueAnimator = this.f30515x) != null) {
                valueAnimator.removeAllListeners();
                this.f30515x.cancel();
            }
            if (!z10) {
                float f10 = this.f30514w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30515x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30515x.addListener(new ki.m3(this, 23));
                    c0.q(2.0f, this.f30515x);
                    this.f30515x.setDuration(350L);
                    this.f30515x.start();
                }
            }
        }
    }
}
