package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.vy0;
public final class d0 {
    public final Runnable f30491a;
    public boolean f30492b;
    public float f30493c;
    public int d;
    public float f30494e;
    public int f30495f;
    public int f30496g;
    public vy0 h;
    public TL_keyboard.KeyboardInlineButton f30497i;
    public org.telegram.messenger.p2 f30498j;
    public org.telegram.messenger.n2 f30499k;
    public boolean f30500l;
    public boolean f30501m;
    public final Path f30502n = new Path();
    public final Paint f30503o = new Paint(1);
    public final RectF f30504p = new RectF();
    public final float[] f30505q = new float[8];
    public o80 f30506r;
    public y f30507s;
    public Drawable f30508t;
    public org.telegram.ui.Components.o5 f30509u;
    public boolean v;
    public float f30510w;
    public ValueAnimator f30511x;

    public d0(Runnable runnable) {
        this.f30491a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30510w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24122r) / 100.0f) + f10;
                this.f30510w = min;
                this.f30510w = Utilities.i(min, 1.0f, 0.0f);
                this.f30491a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30510w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30491a.run();
            if (z10 && (valueAnimator = this.f30511x) != null) {
                valueAnimator.removeAllListeners();
                this.f30511x.cancel();
            }
            if (!z10) {
                float f10 = this.f30510w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30511x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30511x.addListener(new ki.n3(this, 23));
                    c0.q(2.0f, this.f30511x);
                    this.f30511x.setDuration(350L);
                    this.f30511x.start();
                }
            }
        }
    }
}
