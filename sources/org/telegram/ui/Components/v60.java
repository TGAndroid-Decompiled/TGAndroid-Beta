package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;
public final class v60 implements org.telegram.messenger.y10 {
    public final int f40695a;
    public final float f40696b;
    public final float f40697c;
    public final View d;

    public v60(float f10, float f11, int i7, View view) {
        this.f40695a = i7;
        this.d = view;
        this.f40696b = f10;
        this.f40697c = f11;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40695a) {
            case 0:
                ((w60) this.d).f41662y.addPath((Path) obj, this.f40696b, this.f40697c);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((org.telegram.ui.Cells.p7) this.d).n(this.f40696b, this.f40697c);
                return;
        }
    }
}
