package org.telegram.ui.Components;

import android.view.View;
public final class fn0 implements r1.d {
    public final int f33615a;
    public final int[] f33616b;
    public final org.telegram.messenger.ls f33617c;
    public final View d;

    public fn0(org.telegram.messenger.ls lsVar, View view, int[] iArr, int i7) {
        this.f33615a = i7;
        this.f33617c = lsVar;
        this.d = view;
        this.f33616b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33615a) {
            case 0:
                ((mo0) this.f33617c).Q0((org.telegram.ui.Cells.d7) this.d, this.f33616b, f10 / 1000.0f);
                return;
            default:
                ((vn0) this.f33617c).d.Q0(this.d, this.f33616b, f10 / 1000.0f);
                return;
        }
    }
}
