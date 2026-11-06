package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ly0;
public final class c0 {
    public final Runnable f28947a;
    public boolean f28948b;
    public float f28949c;
    public int d;
    public float f28950e;
    public int f28951f;
    public int f28952g;
    public ly0 h;
    public TL_keyboard.KeyboardInlineButton f28953i;
    public org.telegram.messenger.o2 f28954j;
    public org.telegram.messenger.m2 f28955k;
    public boolean f28956l;
    public boolean f28957m;
    public final Path f28958n = new Path();
    public final Paint f28959o = new Paint(1);
    public final RectF f28960p = new RectF();
    public final float[] f28961q = new float[8];
    public a80 f28962r;
    public y f28963s;
    public Drawable f28964t;
    public org.telegram.ui.Components.i5 f28965u;
    public boolean v;
    public float f28966w;
    public ValueAnimator f28967x;

    public c0(Runnable runnable) {
        this.f28947a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f28966w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22538r) / 100.0f) + f10;
                this.f28966w = min;
                this.f28966w = Utilities.i(min, 1.0f, 0.0f);
                this.f28947a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f28966w, 0.04f, 0.96f);
    }

    public final void b(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.v != z9) {
            this.v = z9;
            this.f28947a.run();
            if (z9 && (valueAnimator = this.f28967x) != null) {
                valueAnimator.removeAllListeners();
                this.f28967x.cancel();
            }
            if (!z9) {
                float f10 = this.f28966w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f28967x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f28967x.addListener(new m.a(this, 22));
                    org.telegram.messenger.camera.q.i(2.0f, this.f28967x);
                    this.f28967x.setDuration(350L);
                    this.f28967x.start();
                }
            }
        }
    }
}
