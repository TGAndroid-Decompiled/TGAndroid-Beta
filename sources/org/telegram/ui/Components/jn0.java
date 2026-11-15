package org.telegram.ui.Components;

import android.view.View;
public final class jn0 implements r1.d {
    public final int f36109a;
    public final int[] f36110b;
    public final org.telegram.messenger.is f36111c;
    public final View d;

    public jn0(org.telegram.messenger.is isVar, View view, int[] iArr, int i7) {
        this.f36109a = i7;
        this.f36111c = isVar;
        this.d = view;
        this.f36110b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36109a) {
            case 0:
                ((po0) this.f36111c).Q0((org.telegram.ui.Cells.c7) this.d, this.f36110b, f10 / 1000.0f);
                return;
            default:
                ((yn0) this.f36111c).d.Q0(this.d, this.f36110b, f10 / 1000.0f);
                return;
        }
    }
}
