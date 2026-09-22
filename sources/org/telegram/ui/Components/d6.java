package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d6 {
    public View f23568a;
    public final Runnable f23569b;
    public float f23570c;
    public float d;
    public boolean e;
    public long f23571f;
    public long f23572g;
    public TimeInterpolator h;
    public boolean f23573i;
    public long f23574j;
    public float f23575k;

    public d6(long j3, TimeInterpolator timeInterpolator) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23568a = null;
        this.f23572g = j3;
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
        if (!this.f23573i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23574j) - this.f23571f)) / ((float) this.f23572g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23573i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23574j) - this.f23571f)) / ((float) this.f23572g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23574j >= this.f23571f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23570c = AndroidUtilities.lerp(this.f23575k, this.d, a2);
                } else {
                    this.f23570c = AndroidUtilities.lerp(this.f23575k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23573i = false;
            } else {
                View view = this.f23568a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23569b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23570c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23572g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23573i = true;
                this.d = f7;
                this.f23575k = this.f23570c;
                this.f23574j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23570c = f7;
            this.f23573i = false;
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
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23568a = null;
        this.f23571f = j3;
        this.f23572g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        this.h = qr.f27653f;
        this.f23568a = view;
        this.e = true;
    }

    public d6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23568a = view;
        this.f23572g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23568a = view;
        this.f23571f = j3;
        this.f23572g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        this.h = qr.f27653f;
        this.f23569b = runnable;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23569b = runnable;
        this.f23572g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23569b = runnable;
        this.f23571f = 0L;
        this.f23572g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public d6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23568a = view;
        this.d = f7;
        this.f23570c = f7;
        this.f23571f = j3;
        this.f23572g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public d6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23571f = 0L;
        this.f23572g = 200L;
        qr qrVar = qr.f27653f;
        this.f23569b = runnable;
        this.d = f7;
        this.f23570c = f7;
        this.f23571f = j3;
        this.f23572g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
