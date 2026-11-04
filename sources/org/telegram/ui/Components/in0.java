package org.telegram.ui.Components;

import android.view.View;
public final class in0 implements q1.d {
    public final int f34774a;
    public final int[] f34775b;
    public final org.telegram.messenger.cs f34776c;
    public final View d;

    public in0(org.telegram.messenger.cs csVar, View view, int[] iArr, int i3) {
        this.f34774a = i3;
        this.f34776c = csVar;
        this.d = view;
        this.f34775b = iArr;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.f34774a) {
            case 0:
                ((oo0) this.f34776c).Q0((org.telegram.ui.Cells.c7) this.d, this.f34775b, f10 / 1000.0f);
                return;
            default:
                ((xn0) this.f34776c).d.Q0(this.d, this.f34775b, f10 / 1000.0f);
                return;
        }
    }
}
