package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class t5 {
    public View f30443a;
    public final Runnable f30444b;
    public float f30445c;
    public float d;
    public boolean e;
    public long f30446f;
    public long f30447g;
    public TimeInterpolator h;
    public boolean f30448i;
    public long f30449j;
    public float f30450k;

    public t5(long j10, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30443a = null;
        this.f30447g = j10;
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
        e(true, f7);
    }

    public final float b() {
        if (!this.f30448i) {
            return 0.0f;
        }
        return w7.u.a(((float) ((SystemClock.elapsedRealtime() - this.f30449j) - this.f30446f)) / ((float) this.f30447g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f30448i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.u.a(((float) ((elapsedRealtime - this.f30449j) - this.f30446f)) / ((float) this.f30447g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f30449j >= this.f30446f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f30445c = org.telegram.messenger.i0.T1(this.f30450k, this.d, a2);
                } else {
                    this.f30445c = org.telegram.messenger.i0.T1(this.f30450k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f30448i = false;
            } else {
                View view = this.f30443a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f30444b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f30445c;
    }

    public final float d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return e(false, f7);
    }

    public final float e(boolean z10, float f7) {
        if (!z10 && this.f30447g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f30448i = true;
                this.d = f7;
                this.f30450k = this.f30445c;
                this.f30449j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f30445c = f7;
            this.f30448i = false;
            this.e = false;
        }
        return c();
    }

    public final float f(boolean z10, boolean z11) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return e(z11, f7);
    }

    public t5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30443a = null;
        this.f30446f = j10;
        this.f30447g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(View view) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        this.h = gr.f26495f;
        this.f30443a = view;
        this.e = true;
    }

    public t5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30443a = view;
        this.f30447g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30443a = view;
        this.f30446f = j10;
        this.f30447g = j11;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(Runnable runnable) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        this.h = gr.f26495f;
        this.f30444b = runnable;
        this.e = true;
    }

    public t5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30444b = runnable;
        this.f30447g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30444b = runnable;
        this.f30446f = 0L;
        this.f30447g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public t5(float f7, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30443a = view;
        this.d = f7;
        this.f30445c = f7;
        this.f30446f = j10;
        this.f30447g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }

    public t5(float f7, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f30446f = 0L;
        this.f30447g = 200L;
        gr grVar = gr.f26495f;
        this.f30444b = runnable;
        this.d = f7;
        this.f30445c = f7;
        this.f30446f = j10;
        this.f30447g = j11;
        this.h = timeInterpolator;
        this.e = false;
    }
}
