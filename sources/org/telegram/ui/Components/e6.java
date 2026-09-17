package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25591a;
    public final Runnable f25592b;
    public float f25593c;
    public float d;
    public boolean f25594e;
    public long f25595f;
    public long f25596g;
    public TimeInterpolator h;
    public boolean f25597i;
    public long f25598j;
    public float f25599k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25591a = null;
        this.f25596g = j3;
        this.h = timeInterpolator;
        this.f25594e = true;
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
        if (!this.f25597i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f25598j) - this.f25595f)) / ((float) this.f25596g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25597i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f25598j) - this.f25595f)) / ((float) this.f25596g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25598j >= this.f25595f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25593c = AndroidUtilities.lerp(this.f25599k, this.d, a2);
                } else {
                    this.f25593c = AndroidUtilities.lerp(this.f25599k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25597i = false;
            } else {
                View view = this.f25591a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25592b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25593c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25596g > 0 && !this.f25594e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25597i = true;
                this.d = f7;
                this.f25599k = this.f25593c;
                this.f25598j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25593c = f7;
            this.f25597i = false;
            this.f25594e = false;
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
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25591a = null;
        this.f25595f = j3;
        this.f25596g = j10;
        this.h = timeInterpolator;
        this.f25594e = true;
    }

    public e6(View view) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        this.h = pr.f29494f;
        this.f25591a = view;
        this.f25594e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25591a = view;
        this.f25596g = j3;
        this.h = timeInterpolator;
        this.f25594e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25591a = view;
        this.f25595f = j3;
        this.f25596g = j10;
        this.h = timeInterpolator;
        this.f25594e = true;
    }

    public e6(Runnable runnable) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        this.h = pr.f29494f;
        this.f25592b = runnable;
        this.f25594e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25592b = runnable;
        this.f25596g = j3;
        this.h = timeInterpolator;
        this.f25594e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25592b = runnable;
        this.f25595f = 0L;
        this.f25596g = j3;
        this.h = timeInterpolator;
        this.f25594e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25591a = view;
        this.d = f7;
        this.f25593c = f7;
        this.f25595f = j3;
        this.f25596g = j10;
        this.h = timeInterpolator;
        this.f25594e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25595f = 0L;
        this.f25596g = 200L;
        pr prVar = pr.f29494f;
        this.f25592b = runnable;
        this.d = f7;
        this.f25593c = f7;
        this.f25595f = j3;
        this.f25596g = j10;
        this.h = timeInterpolator;
        this.f25594e = false;
    }
}
