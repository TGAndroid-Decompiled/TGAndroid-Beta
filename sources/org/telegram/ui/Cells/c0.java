package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ny0;
public final class c0 {
    public final Runnable f28955a;
    public boolean f28956b;
    public float f28957c;
    public int d;
    public float f28958e;
    public int f28959f;
    public int f28960g;
    public ny0 h;
    public TL_keyboard.KeyboardInlineButton f28961i;
    public org.telegram.messenger.o2 f28962j;
    public org.telegram.messenger.m2 f28963k;
    public boolean f28964l;
    public boolean f28965m;
    public final Path f28966n = new Path();
    public final Paint f28967o = new Paint(1);
    public final RectF f28968p = new RectF();
    public final float[] f28969q = new float[8];
    public b80 f28970r;
    public y f28971s;
    public Drawable f28972t;
    public org.telegram.ui.Components.i5 f28973u;
    public boolean v;
    public float f28974w;
    public ValueAnimator f28975x;

    public c0(Runnable runnable) {
        this.f28955a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f28974w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22564r) / 100.0f) + f10;
                this.f28974w = min;
                this.f28974w = Utilities.i(min, 1.0f, 0.0f);
                this.f28955a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f28974w, 0.04f, 0.96f);
    }

    public final void b(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.v != z9) {
            this.v = z9;
            this.f28955a.run();
            if (z9 && (valueAnimator = this.f28975x) != null) {
                valueAnimator.removeAllListeners();
                this.f28975x.cancel();
            }
            if (!z9) {
                float f10 = this.f28974w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f28975x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f28975x.addListener(new m.a(this, 22));
                    org.telegram.messenger.camera.q.i(2.0f, this.f28975x);
                    this.f28975x.setDuration(350L);
                    this.f28975x.start();
                }
            }
        }
    }
}
