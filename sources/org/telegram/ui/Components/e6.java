package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25590a;
    public final Runnable f25591b;
    public float f25592c;
    public float d;
    public boolean f25593e;
    public long f25594f;
    public long f25595g;
    public TimeInterpolator h;
    public boolean f25596i;
    public long f25597j;
    public float f25598k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25590a = null;
        this.f25595g = j3;
        this.h = timeInterpolator;
        this.f25593e = true;
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
        if (!this.f25596i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f25597j) - this.f25594f)) / ((float) this.f25595g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25596i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f25597j) - this.f25594f)) / ((float) this.f25595g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25597j >= this.f25594f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25592c = AndroidUtilities.lerp(this.f25598k, this.d, a2);
                } else {
                    this.f25592c = AndroidUtilities.lerp(this.f25598k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25596i = false;
            } else {
                View view = this.f25590a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25591b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25592c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25595g > 0 && !this.f25593e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25596i = true;
                this.d = f7;
                this.f25598k = this.f25592c;
                this.f25597j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25592c = f7;
            this.f25596i = false;
            this.f25593e = false;
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
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25590a = null;
        this.f25594f = j3;
        this.f25595g = j10;
        this.h = timeInterpolator;
        this.f25593e = true;
    }

    public e6(View view) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        this.h = pr.f29493f;
        this.f25590a = view;
        this.f25593e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25590a = view;
        this.f25595g = j3;
        this.h = timeInterpolator;
        this.f25593e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25590a = view;
        this.f25594f = j3;
        this.f25595g = j10;
        this.h = timeInterpolator;
        this.f25593e = true;
    }

    public e6(Runnable runnable) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        this.h = pr.f29493f;
        this.f25591b = runnable;
        this.f25593e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25591b = runnable;
        this.f25595g = j3;
        this.h = timeInterpolator;
        this.f25593e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25591b = runnable;
        this.f25594f = 0L;
        this.f25595g = j3;
        this.h = timeInterpolator;
        this.f25593e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25590a = view;
        this.d = f7;
        this.f25592c = f7;
        this.f25594f = j3;
        this.f25595g = j10;
        this.h = timeInterpolator;
        this.f25593e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25594f = 0L;
        this.f25595g = 200L;
        pr prVar = pr.f29493f;
        this.f25591b = runnable;
        this.d = f7;
        this.f25592c = f7;
        this.f25594f = j3;
        this.f25595g = j10;
        this.h = timeInterpolator;
        this.f25593e = false;
    }
}
