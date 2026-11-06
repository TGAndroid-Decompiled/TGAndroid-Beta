package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.my0;
public final class c0 {
    public final Runnable f28948a;
    public boolean f28949b;
    public float f28950c;
    public int d;
    public float f28951e;
    public int f28952f;
    public int f28953g;
    public my0 h;
    public TL_keyboard.KeyboardInlineButton f28954i;
    public org.telegram.messenger.o2 f28955j;
    public org.telegram.messenger.m2 f28956k;
    public boolean f28957l;
    public boolean f28958m;
    public final Path f28959n = new Path();
    public final Paint f28960o = new Paint(1);
    public final RectF f28961p = new RectF();
    public final float[] f28962q = new float[8];
    public a80 f28963r;
    public y f28964s;
    public Drawable f28965t;
    public org.telegram.ui.Components.i5 f28966u;
    public boolean v;
    public float f28967w;
    public ValueAnimator f28968x;

    public c0(Runnable runnable) {
        this.f28948a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f28967w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22545r) / 100.0f) + f10;
                this.f28967w = min;
                this.f28967w = Utilities.i(min, 1.0f, 0.0f);
                this.f28948a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f28967w, 0.04f, 0.96f);
    }

    public final void b(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.v != z9) {
            this.v = z9;
            this.f28948a.run();
            if (z9 && (valueAnimator = this.f28968x) != null) {
                valueAnimator.removeAllListeners();
                this.f28968x.cancel();
            }
            if (!z9) {
                float f10 = this.f28967w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f28968x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f28968x.addListener(new m.a(this, 22));
                    org.telegram.messenger.camera.q.i(2.0f, this.f28968x);
                    this.f28968x.setDuration(350L);
                    this.f28968x.start();
                }
            }
        }
    }
}
