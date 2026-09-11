package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25563a;
    public final Runnable f25564b;
    public float f25565c;
    public float d;
    public boolean f25566e;
    public long f25567f;
    public long f25568g;
    public TimeInterpolator h;
    public boolean f25569i;
    public long f25570j;
    public float f25571k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25563a = null;
        this.f25568g = j3;
        this.h = timeInterpolator;
        this.f25566e = true;
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
        if (!this.f25569i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f25570j) - this.f25567f)) / ((float) this.f25568g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25569i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f25570j) - this.f25567f)) / ((float) this.f25568g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25570j >= this.f25567f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25565c = AndroidUtilities.lerp(this.f25571k, this.d, a2);
                } else {
                    this.f25565c = AndroidUtilities.lerp(this.f25571k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25569i = false;
            } else {
                View view = this.f25563a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25564b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25565c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25568g > 0 && !this.f25566e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25569i = true;
                this.d = f7;
                this.f25571k = this.f25565c;
                this.f25570j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25565c = f7;
            this.f25569i = false;
            this.f25566e = false;
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
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25563a = null;
        this.f25567f = j3;
        this.f25568g = j10;
        this.h = timeInterpolator;
        this.f25566e = true;
    }

    public e6(View view) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        this.h = pr.f29466f;
        this.f25563a = view;
        this.f25566e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25563a = view;
        this.f25568g = j3;
        this.h = timeInterpolator;
        this.f25566e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25563a = view;
        this.f25567f = j3;
        this.f25568g = j10;
        this.h = timeInterpolator;
        this.f25566e = true;
    }

    public e6(Runnable runnable) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        this.h = pr.f29466f;
        this.f25564b = runnable;
        this.f25566e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25564b = runnable;
        this.f25568g = j3;
        this.h = timeInterpolator;
        this.f25566e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25564b = runnable;
        this.f25567f = 0L;
        this.f25568g = j3;
        this.h = timeInterpolator;
        this.f25566e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25563a = view;
        this.d = f7;
        this.f25565c = f7;
        this.f25567f = j3;
        this.f25568g = j10;
        this.h = timeInterpolator;
        this.f25566e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25567f = 0L;
        this.f25568g = 200L;
        pr prVar = pr.f29466f;
        this.f25564b = runnable;
        this.d = f7;
        this.f25565c = f7;
        this.f25567f = j3;
        this.f25568g = j10;
        this.h = timeInterpolator;
        this.f25566e = false;
    }
}
