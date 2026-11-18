package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;
public final class t60 implements org.telegram.messenger.x10 {
    public final int f39915a;
    public final float f39916b;
    public final float f39917c;
    public final View d;

    public t60(float f10, float f11, int i7, View view) {
        this.f39915a = i7;
        this.d = view;
        this.f39916b = f10;
        this.f39917c = f11;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39915a) {
            case 0:
                ((u60) this.d).f40230y.addPath((Path) obj, this.f39916b, this.f39917c);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((org.telegram.ui.Cells.p7) this.d).n(this.f39916b, this.f39917c);
                return;
        }
    }
}
