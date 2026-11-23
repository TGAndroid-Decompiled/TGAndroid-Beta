package org.telegram.ui.Components;

import android.view.View;
public final class un0 implements r1.d {
    public final int f40486a;
    public final int[] f40487b;
    public final org.telegram.messenger.gs f40488c;
    public final View d;

    public un0(org.telegram.messenger.gs gsVar, View view, int[] iArr, int i7) {
        this.f40486a = i7;
        this.f40488c = gsVar;
        this.d = view;
        this.f40487b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f40486a) {
            case 0:
                ((ap0) this.f40488c).R0((org.telegram.ui.Cells.e7) this.d, this.f40487b, f10 / 1000.0f);
                return;
            default:
                ((jo0) this.f40488c).d.R0(this.d, this.f40487b, f10 / 1000.0f);
                return;
        }
    }
}
