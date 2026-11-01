package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t80;
public final class c0 {
    public final Runnable f21754a;
    public boolean f21755b;
    public float f21756c;
    public int d;
    public float e;
    public int f21757f;
    public int f21758g;
    public rz0 h;
    public TL_keyboard.KeyboardInlineButton f21759i;
    public org.telegram.messenger.s2 f21760j;
    public org.telegram.messenger.q2 f21761k;
    public boolean f21762l;
    public boolean f21763m;
    public final Path f21764n = new Path();
    public final Paint f21765o = new Paint(1);
    public final RectF f21766p = new RectF();
    public final float[] f21767q = new float[8];
    public t80 f21768r;
    public y f21769s;
    public Drawable f21770t;
    public org.telegram.ui.Components.f5 f21771u;
    public boolean v;
    public float f21772w;
    public ValueAnimator f21773x;

    public c0(Runnable runnable) {
        this.f21754a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21772w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.i0.f16173r) / 100.0f) + f7;
                this.f21772w = min;
                this.f21772w = Utilities.i(min, 1.0f, 0.0f);
                this.f21754a.run();
            }
        }
        return c3.i0.z(1.0f, this.f21772w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21754a.run();
            if (z10 && (valueAnimator = this.f21773x) != null) {
                valueAnimator.removeAllListeners();
                this.f21773x.cancel();
            }
            if (!z10) {
                float f7 = this.f21772w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21773x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21773x.addListener(new org.telegram.ui.s9(this, 3));
                    a30.j(2.0f, this.f21773x);
                    this.f21773x.setDuration(350L);
                    this.f21773x.start();
                }
            }
        }
    }
}
