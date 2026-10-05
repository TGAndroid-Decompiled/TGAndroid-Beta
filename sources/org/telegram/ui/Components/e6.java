package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f25985a;
    public final Runnable f25986b;
    public float f25987c;
    public float d;
    public boolean f25988e;
    public long f25989f;
    public long f25990g;
    public TimeInterpolator h;
    public boolean f25991i;
    public long f25992j;
    public float f25993k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25985a = null;
        this.f25990g = j3;
        this.h = timeInterpolator;
        this.f25988e = true;
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
        if (!this.f25991i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f25992j) - this.f25989f)) / ((float) this.f25990g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f25991i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f25992j) - this.f25989f)) / ((float) this.f25990g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25992j >= this.f25989f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f25987c = AndroidUtilities.lerp(this.f25993k, this.d, a2);
                } else {
                    this.f25987c = AndroidUtilities.lerp(this.f25993k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f25991i = false;
            } else {
                View view = this.f25985a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25986b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25987c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f25990g > 0 && !this.f25988e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f25991i = true;
                this.d = f7;
                this.f25993k = this.f25987c;
                this.f25992j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f25987c = f7;
            this.f25991i = false;
            this.f25988e = false;
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
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25985a = null;
        this.f25989f = j3;
        this.f25990g = j10;
        this.h = timeInterpolator;
        this.f25988e = true;
    }

    public e6(View view) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        this.h = tr.f31215f;
        this.f25985a = view;
        this.f25988e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25985a = view;
        this.f25990g = j3;
        this.h = timeInterpolator;
        this.f25988e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25985a = view;
        this.f25989f = j3;
        this.f25990g = j10;
        this.h = timeInterpolator;
        this.f25988e = true;
    }

    public e6(Runnable runnable) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        this.h = tr.f31215f;
        this.f25986b = runnable;
        this.f25988e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25986b = runnable;
        this.f25990g = j3;
        this.h = timeInterpolator;
        this.f25988e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25986b = runnable;
        this.f25989f = 0L;
        this.f25990g = j3;
        this.h = timeInterpolator;
        this.f25988e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25985a = view;
        this.d = f7;
        this.f25987c = f7;
        this.f25989f = j3;
        this.f25990g = j10;
        this.h = timeInterpolator;
        this.f25988e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f25989f = 0L;
        this.f25990g = 200L;
        tr trVar = tr.f31215f;
        this.f25986b = runnable;
        this.d = f7;
        this.f25987c = f7;
        this.f25989f = j3;
        this.f25990g = j10;
        this.h = timeInterpolator;
        this.f25988e = false;
    }
}
