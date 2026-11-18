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
    public final Runnable f30498a;
    public boolean f30499b;
    public float f30500c;
    public int d;
    public float f30501e;
    public int f30502f;
    public int f30503g;
    public vy0 h;
    public TL_keyboard.KeyboardInlineButton f30504i;
    public org.telegram.messenger.p2 f30505j;
    public org.telegram.messenger.n2 f30506k;
    public boolean f30507l;
    public boolean f30508m;
    public final Path f30509n = new Path();
    public final Paint f30510o = new Paint(1);
    public final RectF f30511p = new RectF();
    public final float[] f30512q = new float[8];
    public o80 f30513r;
    public y f30514s;
    public Drawable f30515t;
    public org.telegram.ui.Components.o5 f30516u;
    public boolean v;
    public float f30517w;
    public ValueAnimator f30518x;

    public d0(Runnable runnable) {
        this.f30498a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30517w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f24119r) / 100.0f) + f10;
                this.f30517w = min;
                this.f30517w = Utilities.i(min, 1.0f, 0.0f);
                this.f30498a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30517w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30498a.run();
            if (z10 && (valueAnimator = this.f30518x) != null) {
                valueAnimator.removeAllListeners();
                this.f30518x.cancel();
            }
            if (!z10) {
                float f10 = this.f30517w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30518x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30518x.addListener(new ki.n3(this, 23));
                    c0.q(2.0f, this.f30518x);
                    this.f30518x.setDuration(350L);
                    this.f30518x.start();
                }
            }
        }
    }
}
