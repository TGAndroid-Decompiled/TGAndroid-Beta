package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;
public final class s60 implements org.telegram.messenger.w10 {
    public final int f39513a;
    public final float f39514b;
    public final float f39515c;
    public final View d;

    public s60(float f10, float f11, int i7, View view) {
        this.f39513a = i7;
        this.d = view;
        this.f39514b = f10;
        this.f39515c = f11;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39513a) {
            case 0:
                ((t60) this.d).f39817y.addPath((Path) obj, this.f39514b, this.f39515c);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((org.telegram.ui.Cells.o7) this.d).n(this.f39514b, this.f39515c);
                return;
        }
    }
}
