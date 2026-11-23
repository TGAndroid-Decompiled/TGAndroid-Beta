package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.wy0;
public final class d0 {
    public final Runnable f30584a;
    public boolean f30585b;
    public float f30586c;
    public int d;
    public float f30587e;
    public int f30588f;
    public int f30589g;
    public wy0 h;
    public TL_keyboard.KeyboardInlineButton f30590i;
    public org.telegram.messenger.p2 f30591j;
    public org.telegram.messenger.n2 f30592k;
    public boolean f30593l;
    public boolean f30594m;
    public final Path f30595n = new Path();
    public final Paint f30596o = new Paint(1);
    public final RectF f30597p = new RectF();
    public final float[] f30598q = new float[8];
    public n80 f30599r;
    public y f30600s;
    public Drawable f30601t;
    public org.telegram.ui.Components.o5 f30602u;
    public boolean v;
    public float f30603w;
    public ValueAnimator f30604x;

    public d0(Runnable runnable) {
        this.f30584a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30603w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24227r) / 100.0f) + f10;
                this.f30603w = min;
                this.f30603w = Utilities.i(min, 1.0f, 0.0f);
                this.f30584a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30603w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30584a.run();
            if (z10 && (valueAnimator = this.f30604x) != null) {
                valueAnimator.removeAllListeners();
                this.f30604x.cancel();
            }
            if (!z10) {
                float f10 = this.f30603w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30604x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30604x.addListener(new ki.n3(this, 23));
                    c0.q(2.0f, this.f30604x);
                    this.f30604x.setDuration(350L);
                    this.f30604x.start();
                }
            }
        }
    }
}
