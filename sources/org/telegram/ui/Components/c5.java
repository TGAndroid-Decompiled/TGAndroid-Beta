package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class c5 {
    public final View f25764a;
    public final Runnable f25765b;
    public int f25766c;
    public int d;
    public boolean f25767e;
    public final long f25768f;
    public final TimeInterpolator f25769g;
    public boolean h;
    public long f25770i;
    public int f25771j;

    public c5(View view) {
        this.f25768f = 200L;
        this.f25769g = pr.f30168f;
        this.f25764a = view;
        this.f25767e = true;
    }

    public final int a(int i10, boolean z4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f25768f;
        if (!z4 && j10 > 0 && !this.f25767e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f25771j = this.f25766c;
                this.f25770i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f25766c = i10;
            this.h = false;
            this.f25767e = false;
        }
        if (this.h) {
            float a2 = k7.o.a(((float) (elapsedRealtime - this.f25770i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25770i >= 0) {
                TimeInterpolator timeInterpolator = this.f25769g;
                if (timeInterpolator == null) {
                    this.f25766c = i0.a.d(a2, this.f25771j, this.d);
                } else {
                    this.f25766c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f25771j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f25764a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25765b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25766c;
    }

    public c5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f25768f = 200L;
        pr prVar = pr.f30168f;
        this.f25764a = view;
        this.f25768f = j10;
        this.f25769g = timeInterpolator;
        this.f25767e = true;
    }

    public c5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f25768f = 200L;
        pr prVar = pr.f30168f;
        this.f25764a = view;
        this.f25768f = j10;
        this.f25769g = timeInterpolator;
        this.f25767e = true;
    }

    public c5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f25768f = 200L;
        pr prVar = pr.f30168f;
        this.f25765b = runnable;
        this.f25768f = j10;
        this.f25769g = timeInterpolator;
        this.f25767e = true;
    }
}
