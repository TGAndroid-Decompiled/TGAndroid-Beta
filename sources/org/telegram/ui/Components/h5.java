package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24740a;
    public final Runnable f24741b;
    public int f24742c;
    public int d;
    public boolean e;
    public final long f24743f;
    public final TimeInterpolator f24744g;
    public boolean h;
    public long f24745i;
    public int f24746j;

    public h5(View view) {
        this.f24743f = 200L;
        this.f24744g = tr.f28636f;
        this.f24740a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24743f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24746j = this.f24742c;
                this.f24745i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24742c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24745i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24745i >= 0) {
                TimeInterpolator timeInterpolator = this.f24744g;
                if (timeInterpolator == null) {
                    this.f24742c = i0.a.d(a2, this.f24746j, this.d);
                } else {
                    this.f24742c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24746j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24740a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24741b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24742c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24743f = 200L;
        tr trVar = tr.f28636f;
        this.f24740a = view;
        this.f24743f = j3;
        this.f24744g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24743f = 200L;
        tr trVar = tr.f28636f;
        this.f24740a = view;
        this.f24743f = j3;
        this.f24744g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24743f = 200L;
        tr trVar = tr.f28636f;
        this.f24741b = runnable;
        this.f24743f = j3;
        this.f24744g = timeInterpolator;
        this.e = true;
    }
}
