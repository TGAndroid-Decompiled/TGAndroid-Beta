package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f25879a;
    public final Runnable f25880b;
    public int f25881c;
    public int d;
    public boolean e;
    public final long f25882f;
    public final TimeInterpolator f25883g;
    public boolean h;
    public long f25884i;
    public int f25885j;

    public j5(View view) {
        this.f25882f = 200L;
        this.f25883g = es.f24465f;
        this.f25879a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f25882f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f25885j = this.f25881c;
                this.f25884i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f25881c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f25884i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f25884i >= 0) {
                TimeInterpolator timeInterpolator = this.f25883g;
                if (timeInterpolator == null) {
                    this.f25881c = i0.a.d(a2, this.f25885j, this.d);
                } else {
                    this.f25881c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f25885j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f25879a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f25880b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f25881c;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f25882f = 200L;
        es esVar = es.f24465f;
        this.f25879a = view;
        this.f25882f = j10;
        this.f25883g = timeInterpolator;
        this.e = true;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f25882f = 200L;
        es esVar = es.f24465f;
        this.f25879a = view;
        this.f25882f = j10;
        this.f25883g = timeInterpolator;
        this.e = true;
    }

    public j5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f25882f = 200L;
        es esVar = es.f24465f;
        this.f25880b = runnable;
        this.f25882f = j10;
        this.f25883g = timeInterpolator;
        this.e = true;
    }
}
