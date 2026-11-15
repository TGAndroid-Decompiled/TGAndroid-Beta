package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.oy0;
public final class c0 {
    public final Runnable f30062a;
    public boolean f30063b;
    public float f30064c;
    public int d;
    public float f30065e;
    public int f30066f;
    public int f30067g;
    public oy0 h;
    public TL_keyboard.KeyboardInlineButton f30068i;
    public org.telegram.messenger.o2 f30069j;
    public org.telegram.messenger.m2 f30070k;
    public boolean f30071l;
    public boolean f30072m;
    public final Path f30073n = new Path();
    public final Paint f30074o = new Paint(1);
    public final RectF f30075p = new RectF();
    public final float[] f30076q = new float[8];
    public d80 f30077r;
    public y f30078s;
    public Drawable f30079t;
    public org.telegram.ui.Components.g5 f30080u;
    public boolean v;
    public float f30081w;
    public ValueAnimator f30082x;

    public c0(Runnable runnable) {
        this.f30062a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f30081w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.f23610r) / 100.0f) + f10;
                this.f30081w = min;
                this.f30081w = Utilities.i(min, 1.0f, 0.0f);
                this.f30062a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f30081w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f30062a.run();
            if (z10 && (valueAnimator = this.f30082x) != null) {
                valueAnimator.removeAllListeners();
                this.f30082x.cancel();
            }
            if (!z10) {
                float f10 = this.f30081w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f30082x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f30082x.addListener(new ki.s3(this, 23));
                    i20.k(2.0f, this.f30082x);
                    this.f30082x.setDuration(350L);
                    this.f30082x.start();
                }
            }
        }
    }
}
