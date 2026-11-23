package org.telegram.ui.Components;

import android.view.View;
public final class tn0 implements r1.d {
    public final int f40109a;
    public final int[] f40110b;
    public final org.telegram.messenger.fs f40111c;
    public final View d;

    public tn0(org.telegram.messenger.fs fsVar, View view, int[] iArr, int i7) {
        this.f40109a = i7;
        this.f40111c = fsVar;
        this.d = view;
        this.f40110b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f40109a) {
            case 0:
                ((zo0) this.f40111c).R0((org.telegram.ui.Cells.d7) this.d, this.f40110b, f10 / 1000.0f);
                return;
            default:
                ((io0) this.f40111c).d.R0(this.d, this.f40110b, f10 / 1000.0f);
                return;
        }
    }
}
