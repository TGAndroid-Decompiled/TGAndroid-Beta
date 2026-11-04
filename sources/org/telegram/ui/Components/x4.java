package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class x4 {
    public final View f40215a;
    public final Runnable f40216b;
    public int f40217c;
    public int d;
    public boolean f40218e;
    public final long f40219f;
    public final TimeInterpolator f40220g;
    public boolean h;
    public long f40221i;
    public int f40222j;

    public x4(View view) {
        this.f40219f = 200L;
        this.f40220g = xq.f40452f;
        this.f40215a = view;
        this.f40218e = true;
    }

    public final int a(int i3, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f40219f;
        if (!z10 && j10 > 0 && !this.f40218e) {
            if (this.d != i3) {
                this.h = true;
                this.d = i3;
                this.f40222j = this.f40217c;
                this.f40221i = elapsedRealtime;
            }
        } else {
            this.d = i3;
            this.f40217c = i3;
            this.h = false;
            this.f40218e = false;
        }
        if (this.h) {
            float a10 = b8.be.a(((float) (elapsedRealtime - this.f40221i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f40221i >= 0) {
                TimeInterpolator timeInterpolator = this.f40220g;
                if (timeInterpolator == null) {
                    this.f40217c = i0.a.f(a10, this.f40222j, this.d);
                } else {
                    this.f40217c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f40222j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f40215a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f40216b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f40217c;
    }

    public x4(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f40219f = 200L;
        xq xqVar = xq.f40452f;
        this.f40215a = view;
        this.f40219f = j10;
        this.f40220g = timeInterpolator;
        this.f40218e = true;
    }

    public x4(View view, long j10, TimeInterpolator timeInterpolator, int i3) {
        this.f40219f = 200L;
        xq xqVar = xq.f40452f;
        this.f40215a = view;
        this.f40219f = j10;
        this.f40220g = timeInterpolator;
        this.f40218e = true;
    }

    public x4(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f40219f = 200L;
        xq xqVar = xq.f40452f;
        this.f40216b = runnable;
        this.f40219f = j10;
        this.f40220g = timeInterpolator;
        this.f40218e = true;
    }
}
