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
    public final Runnable f28966a;
    public boolean f28967b;
    public float f28968c;
    public int d;
    public float f28969e;
    public int f28970f;
    public int f28971g;
    public my0 h;
    public TL_keyboard.KeyboardInlineButton f28972i;
    public org.telegram.messenger.o2 f28973j;
    public org.telegram.messenger.m2 f28974k;
    public boolean f28975l;
    public boolean f28976m;
    public final Path f28977n = new Path();
    public final Paint f28978o = new Paint(1);
    public final RectF f28979p = new RectF();
    public final float[] f28980q = new float[8];
    public a80 f28981r;
    public y f28982s;
    public Drawable f28983t;
    public org.telegram.ui.Components.h5 f28984u;
    public boolean v;
    public float f28985w;
    public ValueAnimator f28986x;

    public c0(Runnable runnable) {
        this.f28966a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f28985w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22568r) / 100.0f) + f10;
                this.f28985w = min;
                this.f28985w = Utilities.i(min, 1.0f, 0.0f);
                this.f28966a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f28985w, 0.04f, 0.96f);
    }

    public final void b(boolean z9) {
        ValueAnimator valueAnimator;
        if (this.v != z9) {
            this.v = z9;
            this.f28966a.run();
            if (z9 && (valueAnimator = this.f28986x) != null) {
                valueAnimator.removeAllListeners();
                this.f28986x.cancel();
            }
            if (!z9) {
                float f10 = this.f28985w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f28986x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f28986x.addListener(new m.a(this, 22));
                    org.telegram.messenger.camera.q.i(2.0f, this.f28986x);
                    this.f28986x.setDuration(350L);
                    this.f28986x.start();
                }
            }
        }
    }
}
