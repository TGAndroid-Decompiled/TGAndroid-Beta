package org.telegram.ui.Components;

import android.view.View;
public final class un0 implements r1.d {
    public final int f40536a;
    public final int[] f40537b;
    public final org.telegram.messenger.fs f40538c;
    public final View d;

    public un0(org.telegram.messenger.fs fsVar, View view, int[] iArr, int i7) {
        this.f40536a = i7;
        this.f40538c = fsVar;
        this.d = view;
        this.f40537b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f40536a) {
            case 0:
                ((ap0) this.f40538c).R0((org.telegram.ui.Cells.e7) this.d, this.f40537b, f10 / 1000.0f);
                return;
            default:
                ((jo0) this.f40538c).d.R0(this.d, this.f40537b, f10 / 1000.0f);
                return;
        }
    }
}
