package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;
public final class v60 implements org.telegram.messenger.y10 {
    public final int f40696a;
    public final float f40697b;
    public final float f40698c;
    public final View d;

    public v60(float f10, float f11, int i7, View view) {
        this.f40696a = i7;
        this.d = view;
        this.f40697b = f10;
        this.f40698c = f11;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f40696a) {
            case 0:
                ((w60) this.d).f41663y.addPath((Path) obj, this.f40697b, this.f40698c);
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((org.telegram.ui.Cells.p7) this.d).n(this.f40697b, this.f40698c);
                return;
        }
    }
}
