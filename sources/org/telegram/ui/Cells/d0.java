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
    public final Runnable f30526a;
    public boolean f30527b;
    public float f30528c;
    public int d;
    public float f30529e;
    public int f30530f;
    public int f30531g;
    public xy0 h;
    public TL_keyboard.KeyboardInlineButton f30532i;
    public org.telegram.messenger.p2 f30533j;
    public org.telegram.messenger.n2 f30534k;
    public boolean f30535l;
    public boolean f30536m;
    public final Path f30537n = new Path();
    public final Paint f30538o = new Paint(1);
    public final RectF f30539p = new RectF();
    public final float[] f30540q = new float[8];
    public q80 f30541r;
    public y f30542s;
    public Drawable f30543t;
    public org.telegram.ui.Components.p5 f30544u;
    public boolean v;
    public float f30545w;
    public ValueAnimator f30546x;

    public d0(Runnable runnable) {
        this.f30526a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30545w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24147r) / 100.0f) + f10;
                this.f30545w = min;
                this.f30545w = Utilities.i(min, 1.0f, 0.0f);
                this.f30526a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30545w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30526a.run();
            if (z10 && (valueAnimator = this.f30546x) != null) {
                valueAnimator.removeAllListeners();
                this.f30546x.cancel();
            }
            if (!z10) {
                float f10 = this.f30545w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30546x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30546x.addListener(new ki.m3(this, 23));
                    c0.q(2.0f, this.f30546x);
                    this.f30546x.setDuration(350L);
                    this.f30546x.start();
                }
            }
        }
    }
}
