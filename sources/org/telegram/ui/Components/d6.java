package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d6 {
    public View f23499a;
    public final Runnable f23500b;
    public float f23501c;
    public float d;
    public boolean e;
    public long f23502f;
    public long f23503g;
    public TimeInterpolator h;
    public boolean f23504i;
    public long f23505j;
    public float f23506k;

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23499a = null;
        this.f23503g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        d(f7, true);
    }

    public final float b() {
        if (!this.f23504i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23505j) - this.f23502f)) / ((float) this.f23503g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23504i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23505j) - this.f23502f)) / ((float) this.f23503g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23505j >= this.f23502f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23501c = AndroidUtilities.lerp(this.f23506k, this.d, a2);
                } else {
                    this.f23501c = AndroidUtilities.lerp(this.f23506k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23504i = false;
            } else {
                View view = this.f23499a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23500b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23501c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23503g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23504i = true;
                this.d = f7;
                this.f23506k = this.f23501c;
                this.f23505j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23501c = f7;
            this.f23504i = false;
            this.e = false;
        }
        return c();
    }

    public final float e(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, false);
    }

    public final float f(boolean z10, boolean z11) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, z11);
    }

    public d6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23499a = null;
        this.f23502f = j3;
        this.f23503g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        this.h = qr.f27642f;
        this.f23499a = view;
        this.e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23499a = view;
        this.f23503g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23499a = view;
        this.f23502f = j3;
        this.f23503g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        this.h = qr.f27642f;
        this.f23500b = runnable;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23500b = runnable;
        this.f23503g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23500b = runnable;
        this.f23502f = 0L;
        this.f23503g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23499a = view;
        this.d = f7;
        this.f23501c = f7;
        this.f23502f = j3;
        this.f23503g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public d6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23502f = 0L;
        this.f23503g = 200L;
        qr qrVar = qr.f27642f;
        this.f23500b = runnable;
        this.d = f7;
        this.f23501c = f7;
        this.f23502f = j3;
        this.f23503g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
