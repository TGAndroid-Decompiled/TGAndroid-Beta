package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d6 {
    public View f27664a;
    public final Runnable f27665b;
    public float f27666c;
    public float d;
    public boolean f27667e;
    public long f27668f;
    public long f27669g;
    public TimeInterpolator h;
    public boolean f27670i;
    public long f27671j;
    public float f27672k;

    public d6(long j10, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27664a = null;
        this.f27669g = j10;
        this.h = timeInterpolator;
        this.f27667e = true;
    }

    public final void a(boolean z10) {
        float f9;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        d(f9, true);
    }

    public final float b() {
        if (!this.f27670i) {
            return 0.0f;
        }
        return i7.w.a(((float) ((SystemClock.elapsedRealtime() - this.f27671j) - this.f27668f)) / ((float) this.f27669g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f27670i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = i7.w.a(((float) ((elapsedRealtime - this.f27671j) - this.f27668f)) / ((float) this.f27669g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27671j >= this.f27668f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f27666c = AndroidUtilities.lerp(this.f27672k, this.d, a2);
                } else {
                    this.f27666c = AndroidUtilities.lerp(this.f27672k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f27670i = false;
            } else {
                View view = this.f27664a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27665b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27666c;
    }

    public final float d(float f9, boolean z10) {
        if (!z10 && this.f27669g > 0 && !this.f27667e) {
            if (Math.abs(this.d - f9) > 1.0E-4f) {
                this.f27670i = true;
                this.d = f9;
                this.f27672k = this.f27666c;
                this.f27671j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f9;
            this.f27666c = f9;
            this.f27670i = false;
            this.f27667e = false;
        }
        return c();
    }

    public final float e(boolean z10) {
        float f9;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        return d(f9, false);
    }

    public final float f(boolean z10, boolean z11) {
        float f9;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        return d(f9, z11);
    }

    public d6(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27664a = null;
        this.f27668f = j10;
        this.f27669g = j11;
        this.h = timeInterpolator;
        this.f27667e = true;
    }

    public d6(View view) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        this.h = jr.f29800f;
        this.f27664a = view;
        this.f27667e = true;
    }

    public d6(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27664a = view;
        this.f27669g = j10;
        this.h = timeInterpolator;
        this.f27667e = true;
    }

    public d6(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27664a = view;
        this.f27668f = j10;
        this.f27669g = j11;
        this.h = timeInterpolator;
        this.f27667e = true;
    }

    public d6(Runnable runnable) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        this.h = jr.f29800f;
        this.f27665b = runnable;
        this.f27667e = true;
    }

    public d6(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27665b = runnable;
        this.f27669g = j10;
        this.h = timeInterpolator;
        this.f27667e = true;
    }

    public d6(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27665b = runnable;
        this.f27668f = 0L;
        this.f27669g = j10;
        this.h = timeInterpolator;
        this.f27667e = true;
    }

    public d6(float f9, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27664a = view;
        this.d = f9;
        this.f27666c = f9;
        this.f27668f = j10;
        this.f27669g = j11;
        this.h = timeInterpolator;
        this.f27667e = false;
    }

    public d6(float f9, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f27668f = 0L;
        this.f27669g = 200L;
        jr jrVar = jr.f29800f;
        this.f27665b = runnable;
        this.d = f9;
        this.f27666c = f9;
        this.f27668f = j10;
        this.f27669g = j11;
        this.h = timeInterpolator;
        this.f27667e = false;
    }
}
