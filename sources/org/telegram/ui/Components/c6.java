package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c6 {
    public View f22935a;
    public final Runnable f22936b;
    public float f22937c;
    public float d;
    public boolean e;
    public long f22938f;
    public long f22939g;
    public TimeInterpolator h;
    public boolean f22940i;
    public long f22941j;
    public float f22942k;

    public c6(long j3, TimeInterpolator timeInterpolator) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22935a = null;
        this.f22939g = j3;
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
        if (!this.f22940i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f22941j) - this.f22938f)) / ((float) this.f22939g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f22940i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f22941j) - this.f22938f)) / ((float) this.f22939g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f22941j >= this.f22938f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f22937c = AndroidUtilities.lerp(this.f22942k, this.d, a2);
                } else {
                    this.f22937c = AndroidUtilities.lerp(this.f22942k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f22940i = false;
            } else {
                View view = this.f22935a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f22936b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f22937c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f22939g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f22940i = true;
                this.d = f7;
                this.f22942k = this.f22937c;
                this.f22941j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f22937c = f7;
            this.f22940i = false;
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
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22935a = null;
        this.f22938f = j3;
        this.f22939g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(View view) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        this.h = qr.f27380f;
        this.f22935a = view;
        this.e = true;
    }

    public c6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22935a = view;
        this.f22939g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22935a = view;
        this.f22938f = j3;
        this.f22939g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(Runnable runnable) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        this.h = qr.f27380f;
        this.f22936b = runnable;
        this.e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22936b = runnable;
        this.f22939g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22936b = runnable;
        this.f22938f = 0L;
        this.f22939g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public c6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22935a = view;
        this.d = f7;
        this.f22937c = f7;
        this.f22938f = j3;
        this.f22939g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public c6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f22938f = 0L;
        this.f22939g = 200L;
        qr qrVar = qr.f27380f;
        this.f22936b = runnable;
        this.d = f7;
        this.f22937c = f7;
        this.f22938f = j3;
        this.f22939g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
