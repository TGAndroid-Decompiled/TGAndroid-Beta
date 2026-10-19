package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27070a;
    public final Runnable f27071b;
    public int f27072c;
    public int d;
    public boolean e;
    public final long f27073f;
    public final TimeInterpolator f27074g;
    public boolean h;
    public long f27075i;
    public int f27076j;

    public i5(View view) {
        this.f27073f = 200L;
        this.f27074g = bs.f25012f;
        this.f27070a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27073f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27076j = this.f27072c;
                this.f27075i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27072c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27075i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27075i >= 0) {
                TimeInterpolator timeInterpolator = this.f27074g;
                if (timeInterpolator == null) {
                    this.f27072c = i0.a.f(a2, this.f27076j, this.d);
                } else {
                    this.f27072c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27076j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27070a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27071b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27072c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27073f = 200L;
        bs bsVar = bs.f25012f;
        this.f27070a = view;
        this.f27073f = j10;
        this.f27074g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27073f = 200L;
        bs bsVar = bs.f25012f;
        this.f27070a = view;
        this.f27073f = j10;
        this.f27074g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27073f = 200L;
        bs bsVar = bs.f25012f;
        this.f27071b = runnable;
        this.f27073f = j10;
        this.f27074g = timeInterpolator;
        this.e = true;
    }
}
