package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f24252a;
    public final Runnable f24253b;
    public int f24254c;
    public int d;
    public boolean e;
    public final long f24255f;
    public final TimeInterpolator f24256g;
    public boolean h;
    public long f24257i;
    public int f24258j;

    public g5(View view) {
        this.f24255f = 200L;
        this.f24256g = qr.f27642f;
        this.f24252a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24255f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24258j = this.f24254c;
                this.f24257i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24254c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24257i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24257i >= 0) {
                TimeInterpolator timeInterpolator = this.f24256g;
                if (timeInterpolator == null) {
                    this.f24254c = i0.a.d(a2, this.f24258j, this.d);
                } else {
                    this.f24254c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24258j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24252a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24253b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24254c;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24255f = 200L;
        qr qrVar = qr.f27642f;
        this.f24252a = view;
        this.f24255f = j3;
        this.f24256g = timeInterpolator;
        this.e = true;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24255f = 200L;
        qr qrVar = qr.f27642f;
        this.f24252a = view;
        this.f24255f = j3;
        this.f24256g = timeInterpolator;
        this.e = true;
    }

    public g5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24255f = 200L;
        qr qrVar = qr.f27642f;
        this.f24253b = runnable;
        this.f24255f = j3;
        this.f24256g = timeInterpolator;
        this.e = true;
    }
}
