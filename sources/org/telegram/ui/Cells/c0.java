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
    public final Runnable f28951a;
    public boolean f28952b;
    public float f28953c;
    public int d;
    public float f28954e;
    public int f28955f;
    public int f28956g;
    public my0 h;
    public TL_keyboard.KeyboardInlineButton f28957i;
    public org.telegram.messenger.o2 f28958j;
    public org.telegram.messenger.m2 f28959k;
    public boolean f28960l;
    public boolean f28961m;
    public final Path f28962n = new Path();
    public final Paint f28963o = new Paint(1);
    public final RectF f28964p = new RectF();
    public final float[] f28965q = new float[8];
    public a80 f28966r;
    public y f28967s;
    public Drawable f28968t;
    public org.telegram.ui.Components.i5 f28969u;
    public boolean v;
    public float f28970w;
    public ValueAnimator f28971x;

    public c0(Runnable runnable) {
        this.f28951a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f28970w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22564r) / 100.0f) + f10;
                this.f28970w = min;
                this.f28970w = Utilities.i(min, 1.0f, 0.0f);
                this.f28951a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f28970w, 0.04f, 0.96f);
    }

    public final void b(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.v != z9) {
            this.v = z9;
            this.f28951a.run();
            if (z9 && (valueAnimator = this.f28971x) != null) {
                valueAnimator.removeAllListeners();
                this.f28971x.cancel();
            }
            if (!z9) {
                float f10 = this.f28970w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f28971x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f28971x.addListener(new m.a(this, 22));
                    org.telegram.messenger.camera.q.i(2.0f, this.f28971x);
                    this.f28971x.setDuration(350L);
                    this.f28971x.start();
                }
            }
        }
    }
}
