package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z20;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
public final class c0 {
    public final Runnable f21753a;
    public boolean f21754b;
    public float f21755c;
    public int d;
    public float e;
    public int f21756f;
    public int f21757g;
    public qz0 h;
    public TL_keyboard.KeyboardInlineButton f21758i;
    public org.telegram.messenger.s2 f21759j;
    public org.telegram.messenger.q2 f21760k;
    public boolean f21761l;
    public boolean f21762m;
    public final Path f21763n = new Path();
    public final Paint f21764o = new Paint(1);
    public final RectF f21765p = new RectF();
    public final float[] f21766q = new float[8];
    public t80 f21767r;
    public y f21768s;
    public Drawable f21769t;
    public org.telegram.ui.Components.f5 f21770u;
    public boolean v;
    public float f21771w;
    public ValueAnimator f21772x;

    public c0(Runnable runnable) {
        this.f21753a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21771w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.i0.f16027r) / 100.0f) + f7;
                this.f21771w = min;
                this.f21771w = Utilities.i(min, 1.0f, 0.0f);
                this.f21753a.run();
            }
        }
        return c3.i0.z(1.0f, this.f21771w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21753a.run();
            if (z10 && (valueAnimator = this.f21772x) != null) {
                valueAnimator.removeAllListeners();
                this.f21772x.cancel();
            }
            if (!z10) {
                float f7 = this.f21771w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21772x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21772x.addListener(new org.telegram.ui.s9(this, 3));
                    z20.j(2.0f, this.f21772x);
                    this.f21772x.setDuration(350L);
                    this.f21772x.start();
                }
            }
        }
    }
}
