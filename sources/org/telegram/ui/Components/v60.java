package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;
public final class v60 implements org.telegram.messenger.y10 {
    public final int f40647a;
    public final float f40648b;
    public final float f40649c;
    public final View d;

    public v60(float f10, float f11, int i7, View view) {
        this.f40647a = i7;
        this.d = view;
        this.f40648b = f10;
        this.f40649c = f11;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40647a) {
            case 0:
                ((w60) this.d).f41636y.addPath((Path) obj, this.f40648b, this.f40649c);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((org.telegram.ui.Cells.p7) this.d).n(this.f40648b, this.f40649c);
                return;
        }
    }
}
