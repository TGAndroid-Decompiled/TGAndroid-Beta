package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25564a;
    public final Runnable f25565b;
    public float f25566c;
    public float d;
    public boolean f25567e;
    public long f25568f;
    public long f25569g;
    public TimeInterpolator h;
    public boolean f25570i;
    public long f25571j;
    public float f25572k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25564a = null;
        this.f25569g = j3;
        this.h = timeInterpolator;
        this.f25567e = true;
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
        if (!this.f25570i) {
            return 0.0f;
        }
        return w7.p.a(((float) ((SystemClock.elapsedRealtime() - this.f25571j) - this.f25568f)) / ((float) this.f25569g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25570i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.p.a(((float) ((elapsedRealtime - this.f25571j) - this.f25568f)) / ((float) this.f25569g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25571j >= this.f25568f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25566c = AndroidUtilities.lerp(this.f25572k, this.d, a2);
                } else {
                    this.f25566c = AndroidUtilities.lerp(this.f25572k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25570i = false;
            } else {
                View view = this.f25564a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25565b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25566c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25569g > 0 && !this.f25567e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25570i = true;
                this.d = f7;
                this.f25572k = this.f25566c;
                this.f25571j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25566c = f7;
            this.f25570i = false;
            this.f25567e = false;
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
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25564a = null;
        this.f25568f = j3;
        this.f25569g = j10;
        this.h = timeInterpolator;
        this.f25567e = true;
    }

    public e6(View view) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        this.h = pr.f29467f;
        this.f25564a = view;
        this.f25567e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25564a = view;
        this.f25569g = j3;
        this.h = timeInterpolator;
        this.f25567e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25564a = view;
        this.f25568f = j3;
        this.f25569g = j10;
        this.h = timeInterpolator;
        this.f25567e = true;
    }

    public e6(Runnable runnable) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        this.h = pr.f29467f;
        this.f25565b = runnable;
        this.f25567e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25565b = runnable;
        this.f25569g = j3;
        this.h = timeInterpolator;
        this.f25567e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25565b = runnable;
        this.f25568f = 0L;
        this.f25569g = j3;
        this.h = timeInterpolator;
        this.f25567e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25564a = view;
        this.d = f7;
        this.f25566c = f7;
        this.f25568f = j3;
        this.f25569g = j10;
        this.h = timeInterpolator;
        this.f25567e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25568f = 0L;
        this.f25569g = 200L;
        pr prVar = pr.f29467f;
        this.f25565b = runnable;
        this.d = f7;
        this.f25566c = f7;
        this.f25568f = j3;
        this.f25569g = j10;
        this.h = timeInterpolator;
        this.f25567e = false;
    }
}
