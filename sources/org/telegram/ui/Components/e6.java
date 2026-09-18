package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f23792a;
    public final Runnable f23793b;
    public float f23794c;
    public float d;
    public boolean e;
    public long f23795f;
    public long f23796g;
    public TimeInterpolator h;
    public boolean f23797i;
    public long f23798j;
    public float f23799k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23792a = null;
        this.f23796g = j3;
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
        if (!this.f23797i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23798j) - this.f23795f)) / ((float) this.f23796g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23797i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23798j) - this.f23795f)) / ((float) this.f23796g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23798j >= this.f23795f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23794c = AndroidUtilities.lerp(this.f23799k, this.d, a2);
                } else {
                    this.f23794c = AndroidUtilities.lerp(this.f23799k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23797i = false;
            } else {
                View view = this.f23792a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23793b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23794c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23796g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23797i = true;
                this.d = f7;
                this.f23799k = this.f23794c;
                this.f23798j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23794c = f7;
            this.f23797i = false;
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

    public e6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23792a = null;
        this.f23795f = j3;
        this.f23796g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        this.h = qr.f27715f;
        this.f23792a = view;
        this.e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23792a = view;
        this.f23796g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23792a = view;
        this.f23795f = j3;
        this.f23796g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        this.h = qr.f27715f;
        this.f23793b = runnable;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23793b = runnable;
        this.f23796g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23793b = runnable;
        this.f23795f = 0L;
        this.f23796g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23792a = view;
        this.d = f7;
        this.f23794c = f7;
        this.f23795f = j3;
        this.f23796g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23795f = 0L;
        this.f23796g = 200L;
        qr qrVar = qr.f27715f;
        this.f23793b = runnable;
        this.d = f7;
        this.f23794c = f7;
        this.f23795f = j3;
        this.f23796g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
