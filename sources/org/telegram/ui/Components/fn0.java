package org.telegram.ui.Components;

import android.view.View;
public final class fn0 implements r1.d {
    public final int f33612a;
    public final int[] f33613b;
    public final org.telegram.messenger.ls f33614c;
    public final View d;

    public fn0(org.telegram.messenger.ls lsVar, View view, int[] iArr, int i7) {
        this.f33612a = i7;
        this.f33614c = lsVar;
        this.d = view;
        this.f33613b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f33612a) {
            case 0:
                ((mo0) this.f33614c).Q0((org.telegram.ui.Cells.d7) this.d, this.f33613b, f10 / 1000.0f);
                return;
            default:
                ((vn0) this.f33614c).d.Q0(this.d, this.f33613b, f10 / 1000.0f);
                return;
        }
    }
}
