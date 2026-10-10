package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f27550a;
    public final Runnable f27551b;
    public int f27552c;
    public int d;
    public boolean f27553e;
    public final long f27554f;
    public final TimeInterpolator f27555g;
    public boolean h;
    public long f27556i;
    public int f27557j;

    public j5(View view) {
        this.f27554f = 200L;
        this.f27555g = is.f27443f;
        this.f27550a = view;
        this.f27553e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27554f;
        if (!z10 && j3 > 0 && !this.f27553e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27557j = this.f27552c;
                this.f27556i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27552c = i10;
            this.h = false;
            this.f27553e = false;
        }
        if (this.h) {
            float a2 = w7.o.a(((float) (elapsedRealtime - this.f27556i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27556i >= 0) {
                TimeInterpolator timeInterpolator = this.f27555g;
                if (timeInterpolator == null) {
                    this.f27552c = i0.a.d(a2, this.f27557j, this.d);
                } else {
                    this.f27552c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27557j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27550a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27551b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27552c;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27554f = 200L;
        is isVar = is.f27443f;
        this.f27550a = view;
        this.f27554f = j3;
        this.f27555g = timeInterpolator;
        this.f27553e = true;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27554f = 200L;
        is isVar = is.f27443f;
        this.f27550a = view;
        this.f27554f = j3;
        this.f27555g = timeInterpolator;
        this.f27553e = true;
    }

    public j5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27554f = 200L;
        is isVar = is.f27443f;
        this.f27551b = runnable;
        this.f27554f = j3;
        this.f27555g = timeInterpolator;
        this.f27553e = true;
    }
}
