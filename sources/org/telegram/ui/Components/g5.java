package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f35382a;
    public final Runnable f35383b;
    public int f35384c;
    public int d;
    public boolean f35385e;
    public final long f35386f;
    public final TimeInterpolator f35387g;
    public boolean h;
    public long f35388i;
    public int f35389j;

    public g5(View view) {
        this.f35386f = 200L;
        this.f35387g = nr.f37917f;
        this.f35382a = view;
        this.f35385e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f35386f;
        if (!z10 && j3 > 0 && !this.f35385e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f35389j = this.f35384c;
                this.f35388i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f35384c = i7;
            this.h = false;
            this.f35385e = false;
        }
        if (this.h) {
            float a10 = c8.m9.a(((float) (elapsedRealtime - this.f35388i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f35388i >= 0) {
                TimeInterpolator timeInterpolator = this.f35387g;
                if (timeInterpolator == null) {
                    this.f35384c = i0.a.f(a10, this.f35389j, this.d);
                } else {
                    this.f35384c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f35389j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f35382a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f35383b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f35384c;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f35386f = 200L;
        nr nrVar = nr.f37917f;
        this.f35382a = view;
        this.f35386f = j3;
        this.f35387g = timeInterpolator;
        this.f35385e = true;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f35386f = 200L;
        nr nrVar = nr.f37917f;
        this.f35382a = view;
        this.f35386f = j3;
        this.f35387g = timeInterpolator;
        this.f35385e = true;
    }

    public g5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f35386f = 200L;
        nr nrVar = nr.f37917f;
        this.f35383b = runnable;
        this.f35386f = j3;
        this.f35387g = timeInterpolator;
        this.f35385e = true;
    }
}
