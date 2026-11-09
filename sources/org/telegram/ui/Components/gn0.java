package org.telegram.ui.Components;

import android.view.View;
public final class gn0 implements r1.d {
    public final int f34017a;
    public final int[] f34018b;
    public final org.telegram.messenger.ls f34019c;
    public final View d;

    public gn0(org.telegram.messenger.ls lsVar, View view, int[] iArr, int i7) {
        this.f34017a = i7;
        this.f34019c = lsVar;
        this.d = view;
        this.f34018b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f34017a) {
            case 0:
                ((no0) this.f34019c).Q0((org.telegram.ui.Cells.d7) this.d, this.f34018b, f10 / 1000.0f);
                return;
            default:
                ((wn0) this.f34019c).d.Q0(this.d, this.f34018b, f10 / 1000.0f);
                return;
        }
    }
}
