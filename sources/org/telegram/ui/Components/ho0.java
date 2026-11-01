package org.telegram.ui.Components;

import android.view.View;
public final class ho0 implements o1.g {
    public final int f26896a;
    public final int[] f26897b;
    public final org.telegram.messenger.vs f26898c;
    public final View d;

    public ho0(org.telegram.messenger.vs vsVar, View view, int[] iArr, int i10) {
        this.f26896a = i10;
        this.f26898c = vsVar;
        this.d = view;
        this.f26897b = iArr;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f26896a) {
            case 0:
                ((pp0) this.f26898c).Q0((org.telegram.ui.Cells.h7) this.d, this.f26897b, f7 / 1000.0f);
                return;
            default:
                ((yo0) this.f26898c).d.Q0(this.d, this.f26897b, f7 / 1000.0f);
                return;
        }
    }
}
