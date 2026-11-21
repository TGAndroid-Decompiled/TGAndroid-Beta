package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;
public final class v60 implements org.telegram.messenger.x10 {
    public final int f40694a;
    public final float f40695b;
    public final float f40696c;
    public final View d;

    public v60(float f10, float f11, int i7, View view) {
        this.f40694a = i7;
        this.d = view;
        this.f40695b = f10;
        this.f40696c = f11;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40694a) {
            case 0:
                ((w60) this.d).f41669y.addPath((Path) obj, this.f40695b, this.f40696c);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((org.telegram.ui.Cells.p7) this.d).n(this.f40695b, this.f40696c);
                return;
        }
    }
}
