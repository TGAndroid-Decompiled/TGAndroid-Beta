package org.telegram.ui.Components;

import android.view.View;
public final class jn0 implements r1.d {
    public final int f36119a;
    public final int[] f36120b;
    public final org.telegram.messenger.is f36121c;
    public final View d;

    public jn0(org.telegram.messenger.is isVar, View view, int[] iArr, int i7) {
        this.f36119a = i7;
        this.f36121c = isVar;
        this.d = view;
        this.f36120b = iArr;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f36119a) {
            case 0:
                ((po0) this.f36121c).Q0((org.telegram.ui.Cells.c7) this.d, this.f36120b, f10 / 1000.0f);
                return;
            default:
                ((yn0) this.f36121c).d.Q0(this.d, this.f36120b, f10 / 1000.0f);
                return;
        }
    }
}
