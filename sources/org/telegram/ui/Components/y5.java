package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y5 {
    public View f34852a;
    public final Runnable f34853b;
    public float f34854c;
    public float d;
    public boolean f34855e;
    public long f34856f;
    public long f34857g;
    public TimeInterpolator h;
    public boolean f34858i;
    public long f34859j;
    public float f34860k;

    public y5(long j10, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34852a = null;
        this.f34857g = j10;
        this.h = timeInterpolator;
        this.f34855e = true;
    }

    public final void a(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d(f10, true);
    }

    public final float b() {
        if (!this.f34858i) {
            return 0.0f;
        }
        return g7.n.a(((float) ((SystemClock.elapsedRealtime() - this.f34859j) - this.f34856f)) / ((float) this.f34857g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f34858i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = g7.n.a(((float) ((elapsedRealtime - this.f34859j) - this.f34856f)) / ((float) this.f34857g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f34859j >= this.f34856f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f34854c = AndroidUtilities.lerp(this.f34860k, this.d, a2);
                } else {
                    this.f34854c = AndroidUtilities.lerp(this.f34860k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f34858i = false;
            } else {
                View view = this.f34852a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f34853b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f34854c;
    }

    public final float d(float f10, boolean z10) {
        if (!z10 && this.f34857g > 0 && !this.f34855e) {
            if (Math.abs(this.d - f10) > 1.0E-4f) {
                this.f34858i = true;
                this.d = f10;
                this.f34860k = this.f34854c;
                this.f34859j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f10;
            this.f34854c = f10;
            this.f34858i = false;
            this.f34855e = false;
        }
        return c();
    }

    public final float e(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return d(f10, false);
    }

    public final float f(boolean z10, boolean z11) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return d(f10, z11);
    }

    public y5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34852a = null;
        this.f34856f = j10;
        this.f34857g = j11;
        this.h = timeInterpolator;
        this.f34855e = true;
    }

    public y5(View view) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        this.h = gr.f28844f;
        this.f34852a = view;
        this.f34855e = true;
    }

    public y5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34852a = view;
        this.f34857g = j10;
        this.h = timeInterpolator;
        this.f34855e = true;
    }

    public y5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34852a = view;
        this.f34856f = j10;
        this.f34857g = j11;
        this.h = timeInterpolator;
        this.f34855e = true;
    }

    public y5(Runnable runnable) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        this.h = gr.f28844f;
        this.f34853b = runnable;
        this.f34855e = true;
    }

    public y5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34853b = runnable;
        this.f34857g = j10;
        this.h = timeInterpolator;
        this.f34855e = true;
    }

    public y5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i9) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34853b = runnable;
        this.f34856f = 0L;
        this.f34857g = j10;
        this.h = timeInterpolator;
        this.f34855e = true;
    }

    public y5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34852a = view;
        this.d = f10;
        this.f34854c = f10;
        this.f34856f = j10;
        this.f34857g = j11;
        this.h = timeInterpolator;
        this.f34855e = false;
    }

    public y5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34856f = 0L;
        this.f34857g = 200L;
        gr grVar = gr.f28844f;
        this.f34853b = runnable;
        this.d = f10;
        this.f34854c = f10;
        this.f34856f = j10;
        this.f34857g = j11;
        this.h = timeInterpolator;
        this.f34855e = false;
    }
}
