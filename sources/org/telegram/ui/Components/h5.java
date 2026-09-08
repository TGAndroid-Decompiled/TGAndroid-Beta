package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f26603a;
    public final Runnable f26604b;
    public int f26605c;
    public int d;
    public boolean f26606e;
    public final long f26607f;
    public final TimeInterpolator f26608g;
    public boolean h;
    public long f26609i;
    public int f26610j;

    public h5(View view) {
        this.f26607f = 200L;
        this.f26608g = pr.f29493f;
        this.f26603a = view;
        this.f26606e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f26607f;
        if (!z10 && j3 > 0 && !this.f26606e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f26610j = this.f26605c;
                this.f26609i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f26605c = i10;
            this.h = false;
            this.f26606e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f26609i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26609i >= 0) {
                TimeInterpolator timeInterpolator = this.f26608g;
                if (timeInterpolator == null) {
                    this.f26605c = i0.a.d(a2, this.f26610j, this.d);
                } else {
                    this.f26605c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f26610j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26603a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26604b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26605c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26607f = 200L;
        pr prVar = pr.f29493f;
        this.f26603a = view;
        this.f26607f = j3;
        this.f26608g = timeInterpolator;
        this.f26606e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26607f = 200L;
        pr prVar = pr.f29493f;
        this.f26603a = view;
        this.f26607f = j3;
        this.f26608g = timeInterpolator;
        this.f26606e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26607f = 200L;
        pr prVar = pr.f29493f;
        this.f26604b = runnable;
        this.f26607f = j3;
        this.f26608g = timeInterpolator;
        this.f26606e = true;
    }
}
