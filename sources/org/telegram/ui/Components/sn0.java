package org.telegram.ui.Components;

import android.view.View;
public final class sn0 implements r1.d {
    public final int f39793a;
    public final int[] f39794b;
    public final org.telegram.messenger.fs f39795c;
    public final View d;

    public sn0(org.telegram.messenger.fs fsVar, View view, int[] iArr, int i7) {
        this.f39793a = i7;
        this.f39795c = fsVar;
        this.d = view;
        this.f39794b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f39793a) {
            case 0:
                ((yo0) this.f39795c).R0((org.telegram.ui.Cells.d7) this.d, this.f39794b, f10 / 1000.0f);
                return;
            default:
                ((ho0) this.f39795c).d.R0(this.d, this.f39794b, f10 / 1000.0f);
                return;
        }
    }
}
