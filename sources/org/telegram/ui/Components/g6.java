package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f26663a;
    public final Runnable f26664b;
    public float f26665c;
    public float d;
    public boolean f26666e;
    public long f26667f;
    public long f26668g;
    public TimeInterpolator h;
    public boolean f26669i;
    public long f26670j;
    public float f26671k;

    public g6(long j3, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26663a = null;
        this.f26668g = j3;
        this.h = timeInterpolator;
        this.f26666e = true;
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
        if (!this.f26669i) {
            return 0.0f;
        }
        return w7.o.a(((float) ((SystemClock.elapsedRealtime() - this.f26670j) - this.f26667f)) / ((float) this.f26668g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26669i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.o.a(((float) ((elapsedRealtime - this.f26670j) - this.f26667f)) / ((float) this.f26668g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26670j >= this.f26667f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26665c = AndroidUtilities.lerp(this.f26671k, this.d, a2);
                } else {
                    this.f26665c = AndroidUtilities.lerp(this.f26671k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26669i = false;
            } else {
                View view = this.f26663a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26664b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26665c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26668g > 0 && !this.f26666e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26669i = true;
                this.d = f7;
                this.f26671k = this.f26665c;
                this.f26670j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26665c = f7;
            this.f26669i = false;
            this.f26666e = false;
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

    public g6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26663a = null;
        this.f26667f = j3;
        this.f26668g = j10;
        this.h = timeInterpolator;
        this.f26666e = true;
    }

    public g6(View view) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        this.h = is.f27500f;
        this.f26663a = view;
        this.f26666e = true;
    }

    public g6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26663a = view;
        this.f26668g = j3;
        this.h = timeInterpolator;
        this.f26666e = true;
    }

    public g6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26663a = view;
        this.f26667f = j3;
        this.f26668g = j10;
        this.h = timeInterpolator;
        this.f26666e = true;
    }

    public g6(Runnable runnable) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        this.h = is.f27500f;
        this.f26664b = runnable;
        this.f26666e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26664b = runnable;
        this.f26668g = j3;
        this.h = timeInterpolator;
        this.f26666e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26664b = runnable;
        this.f26667f = 0L;
        this.f26668g = j3;
        this.h = timeInterpolator;
        this.f26666e = true;
    }

    public g6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26663a = view;
        this.d = f7;
        this.f26665c = f7;
        this.f26667f = j3;
        this.f26668g = j10;
        this.h = timeInterpolator;
        this.f26666e = false;
    }

    public g6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26667f = 0L;
        this.f26668g = 200L;
        is isVar = is.f27500f;
        this.f26664b = runnable;
        this.d = f7;
        this.f26665c = f7;
        this.f26667f = j3;
        this.f26668g = j10;
        this.h = timeInterpolator;
        this.f26666e = false;
    }
}
