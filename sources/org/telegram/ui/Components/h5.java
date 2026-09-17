package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f26604a;
    public final Runnable f26605b;
    public int f26606c;
    public int d;
    public boolean f26607e;
    public final long f26608f;
    public final TimeInterpolator f26609g;
    public boolean h;
    public long f26610i;
    public int f26611j;

    public h5(View view) {
        this.f26608f = 200L;
        this.f26609g = pr.f29494f;
        this.f26604a = view;
        this.f26607e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f26608f;
        if (!z10 && j3 > 0 && !this.f26607e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f26611j = this.f26606c;
                this.f26610i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f26606c = i10;
            this.h = false;
            this.f26607e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f26610i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26610i >= 0) {
                TimeInterpolator timeInterpolator = this.f26609g;
                if (timeInterpolator == null) {
                    this.f26606c = i0.a.d(a2, this.f26611j, this.d);
                } else {
                    this.f26606c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f26611j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26604a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26605b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26606c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26608f = 200L;
        pr prVar = pr.f29494f;
        this.f26604a = view;
        this.f26608f = j3;
        this.f26609g = timeInterpolator;
        this.f26607e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26608f = 200L;
        pr prVar = pr.f29494f;
        this.f26604a = view;
        this.f26608f = j3;
        this.f26609g = timeInterpolator;
        this.f26607e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26608f = 200L;
        pr prVar = pr.f29494f;
        this.f26605b = runnable;
        this.f26608f = j3;
        this.f26609g = timeInterpolator;
        this.f26607e = true;
    }
}
