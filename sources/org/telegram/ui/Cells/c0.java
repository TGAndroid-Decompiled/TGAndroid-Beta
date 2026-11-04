package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w70;
public final class c0 {
    public final Runnable f29009a;
    public boolean f29010b;
    public float f29011c;
    public int d;
    public float f29012e;
    public int f29013f;
    public int f29014g;
    public ly0 h;
    public TL_keyboard.KeyboardInlineButton f29015i;
    public org.telegram.messenger.o2 f29016j;
    public org.telegram.messenger.m2 f29017k;
    public boolean f29018l;
    public boolean f29019m;
    public final Path f29020n = new Path();
    public final Paint f29021o = new Paint(1);
    public final RectF f29022p = new RectF();
    public final float[] f29023q = new float[8];
    public w70 f29024r;
    public y f29025s;
    public Drawable f29026t;
    public org.telegram.ui.Components.g5 f29027u;
    public boolean v;
    public float f29028w;
    public ValueAnimator f29029x;

    public c0(Runnable runnable) {
        this.f29009a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f29028w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f22609r) / 100.0f) + f10;
                this.f29028w = min;
                this.f29028w = Utilities.i(min, 1.0f, 0.0f);
                this.f29009a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.y(1.0f, this.f29028w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f29009a.run();
            if (z10 && (valueAnimator = this.f29029x) != null) {
                valueAnimator.removeAllListeners();
                this.f29029x.cancel();
            }
            if (!z10) {
                float f10 = this.f29028w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f29029x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f29029x.addListener(new ii.v3(this, 23));
                    org.telegram.messenger.camera.q.i(2.0f, this.f29029x);
                    this.f29029x.setDuration(350L);
                    this.f29029x.start();
                }
            }
        }
    }
}
