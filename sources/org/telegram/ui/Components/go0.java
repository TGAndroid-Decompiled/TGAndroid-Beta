package org.telegram.ui.Components;

import android.view.View;
public final class go0 implements o1.g {
    public final int f26485a;
    public final int[] f26486b;
    public final org.telegram.messenger.us f26487c;
    public final View d;

    public go0(org.telegram.messenger.us usVar, View view, int[] iArr, int i10) {
        this.f26485a = i10;
        this.f26487c = usVar;
        this.d = view;
        this.f26486b = iArr;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f26485a) {
            case 0:
                ((op0) this.f26487c).Q0((org.telegram.ui.Cells.h7) this.d, this.f26486b, f7 / 1000.0f);
                return;
            default:
                ((xo0) this.f26487c).d.Q0(this.d, this.f26486b, f7 / 1000.0f);
                return;
        }
    }
}
