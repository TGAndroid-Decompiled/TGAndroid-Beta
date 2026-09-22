package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f24412a;
    public final Runnable f24413b;
    public int f24414c;
    public int d;
    public boolean e;
    public final long f24415f;
    public final TimeInterpolator f24416g;
    public boolean h;
    public long f24417i;
    public int f24418j;

    public g5(View view) {
        this.f24415f = 200L;
        this.f24416g = qr.f27653f;
        this.f24412a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24415f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24418j = this.f24414c;
                this.f24417i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24414c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24417i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24417i >= 0) {
                TimeInterpolator timeInterpolator = this.f24416g;
                if (timeInterpolator == null) {
                    this.f24414c = i0.a.d(a2, this.f24418j, this.d);
                } else {
                    this.f24414c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24418j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24412a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24413b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24414c;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24415f = 200L;
        qr qrVar = qr.f27653f;
        this.f24412a = view;
        this.f24415f = j3;
        this.f24416g = timeInterpolator;
        this.e = true;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24415f = 200L;
        qr qrVar = qr.f27653f;
        this.f24412a = view;
        this.f24415f = j3;
        this.f24416g = timeInterpolator;
        this.e = true;
    }

    public g5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24415f = 200L;
        qr qrVar = qr.f27653f;
        this.f24413b = runnable;
        this.f24415f = j3;
        this.f24416g = timeInterpolator;
        this.e = true;
    }
}
