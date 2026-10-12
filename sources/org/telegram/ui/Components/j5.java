package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f27364a;
    public final Runnable f27365b;
    public int f27366c;
    public int d;
    public boolean f27367e;
    public final long f27368f;
    public final TimeInterpolator f27369g;
    public boolean h;
    public long f27370i;
    public int f27371j;

    public j5(View view) {
        this.f27368f = 200L;
        this.f27369g = js.f27627f;
        this.f27364a = view;
        this.f27367e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f27368f;
        if (!z10 && j3 > 0 && !this.f27367e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27371j = this.f27366c;
                this.f27370i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27366c = i10;
            this.h = false;
            this.f27367e = false;
        }
        if (this.h) {
            float a2 = w7.n.a(((float) (elapsedRealtime - this.f27370i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27370i >= 0) {
                TimeInterpolator timeInterpolator = this.f27369g;
                if (timeInterpolator == null) {
                    this.f27366c = i0.a.d(a2, this.f27371j, this.d);
                } else {
                    this.f27366c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f27371j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27364a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27365b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27366c;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f27368f = 200L;
        js jsVar = js.f27627f;
        this.f27364a = view;
        this.f27368f = j3;
        this.f27369g = timeInterpolator;
        this.f27367e = true;
    }

    public j5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f27368f = 200L;
        js jsVar = js.f27627f;
        this.f27364a = view;
        this.f27368f = j3;
        this.f27369g = timeInterpolator;
        this.f27367e = true;
    }

    public j5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f27368f = 200L;
        js jsVar = js.f27627f;
        this.f27365b = runnable;
        this.f27368f = j3;
        this.f27369g = timeInterpolator;
        this.f27367e = true;
    }
}
