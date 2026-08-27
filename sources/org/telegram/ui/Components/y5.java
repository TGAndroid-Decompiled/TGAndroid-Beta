package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class y5 {

    public View f34810a;

    public final Runnable f34811b;

    public float f34812c;
    public float d;

    public boolean f34813e;

    public long f34814f;

    public long f34815g;
    public TimeInterpolator h;

    public boolean f34816i;

    public long f34817j;

    public float f34818k;

    public y5(long j10, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34810a = null;
        this.f34815g = j10;
        this.h = timeInterpolator;
        this.f34813e = true;
    }

    public final void a(boolean z10) {
        d(z10 ? 1.0f : 0.0f, true);
    }

    public final float b() {
        if (this.f34816i) {
            return h7.n.a(((SystemClock.elapsedRealtime() - this.f34817j) - this.f34814f) / this.f34815g, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final float c() {
        if (this.f34816i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            float fA = h7.n.a(((jElapsedRealtime - this.f34817j) - this.f34814f) / this.f34815g, 0.0f, 1.0f);
            if (jElapsedRealtime - this.f34817j >= this.f34814f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f34812c = AndroidUtilities.lerp(this.f34818k, this.d, fA);
                } else {
                    this.f34812c = AndroidUtilities.lerp(this.f34818k, this.d, timeInterpolator.getInterpolation(fA));
                }
            }
            if (fA >= 1.0f) {
                this.f34816i = false;
            } else {
                View view = this.f34810a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f34811b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f34812c;
    }

    public final float d(float f10, boolean z10) {
        if (z10 || this.f34815g <= 0 || this.f34813e) {
            this.d = f10;
            this.f34812c = f10;
            this.f34816i = false;
            this.f34813e = false;
        } else if (Math.abs(this.d - f10) > 1.0E-4f) {
            this.f34816i = true;
            this.d = f10;
            this.f34818k = this.f34812c;
            this.f34817j = SystemClock.elapsedRealtime();
        }
        return c();
    }

    public final float e(boolean z10) {
        return d(z10 ? 1.0f : 0.0f, false);
    }

    public final float f(boolean z10, boolean z11) {
        return d(z10 ? 1.0f : 0.0f, z11);
    }

    public y5(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34810a = null;
        this.f34814f = j10;
        this.f34815g = j11;
        this.h = timeInterpolator;
        this.f34813e = true;
    }

    public y5(View view) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        this.h = er.f28122f;
        this.f34810a = view;
        this.f34813e = true;
    }

    public y5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34810a = view;
        this.f34815g = j10;
        this.h = timeInterpolator;
        this.f34813e = true;
    }

    public y5(View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34810a = view;
        this.f34814f = j10;
        this.f34815g = j11;
        this.h = timeInterpolator;
        this.f34813e = true;
    }

    public y5(Runnable runnable) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        this.h = er.f28122f;
        this.f34811b = runnable;
        this.f34813e = true;
    }

    public y5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34811b = runnable;
        this.f34815g = j10;
        this.h = timeInterpolator;
        this.f34813e = true;
    }

    public y5(Runnable runnable, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34811b = runnable;
        this.f34814f = 0L;
        this.f34815g = j10;
        this.h = timeInterpolator;
        this.f34813e = true;
    }

    public y5(float f10, View view, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34810a = view;
        this.d = f10;
        this.f34812c = f10;
        this.f34814f = j10;
        this.f34815g = j11;
        this.h = timeInterpolator;
        this.f34813e = false;
    }

    public y5(float f10, Runnable runnable, long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f34814f = 0L;
        this.f34815g = 200L;
        er erVar = er.f28122f;
        this.f34811b = runnable;
        this.d = f10;
        this.f34812c = f10;
        this.f34814f = j10;
        this.f34815g = j11;
        this.h = timeInterpolator;
        this.f34813e = false;
    }
}
