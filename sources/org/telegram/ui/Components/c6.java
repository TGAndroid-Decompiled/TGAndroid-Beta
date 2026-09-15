package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c6 {
    public View f22951a;
    public final Runnable f22952b;
    public float f22953c;
    public float d;
    public boolean e;
    public long f22954f;
    public long f22955g;
    public TimeInterpolator h;
    public boolean f22956i;
    public long f22957j;
    public float f22958k;

    public c6(long j3, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22951a = null;
        this.f22955g = j3;
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
        if (!this.f22956i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f22957j) - this.f22954f)) / ((float) this.f22955g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f22956i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f22957j) - this.f22954f)) / ((float) this.f22955g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f22957j >= this.f22954f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f22953c = AndroidUtilities.lerp(this.f22958k, this.d, a2);
                } else {
                    this.f22953c = AndroidUtilities.lerp(this.f22958k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f22956i = false;
            } else {
                View view = this.f22951a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f22952b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f22953c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f22955g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f22956i = true;
                this.d = f7;
                this.f22958k = this.f22953c;
                this.f22957j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f22953c = f7;
            this.f22956i = false;
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

    public c6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22951a = null;
        this.f22954f = j3;
        this.f22955g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(View view) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        this.h = qr.f27423f;
        this.f22951a = view;
        this.e = true;
    }

    public c6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22951a = view;
        this.f22955g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22951a = view;
        this.f22954f = j3;
        this.f22955g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(Runnable runnable) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        this.h = qr.f27423f;
        this.f22952b = runnable;
        this.e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22952b = runnable;
        this.f22955g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22952b = runnable;
        this.f22954f = 0L;
        this.f22955g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22951a = view;
        this.d = f7;
        this.f22953c = f7;
        this.f22954f = j3;
        this.f22955g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public c6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22954f = 0L;
        this.f22955g = 200L;
        qr qrVar = qr.f27423f;
        this.f22952b = runnable;
        this.d = f7;
        this.f22953c = f7;
        this.f22954f = j3;
        this.f22955g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
