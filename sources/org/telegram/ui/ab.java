package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ab implements Runnable {
    public final sb f35731a;
    public final ArrayList f35732b;
    public final ArrayList f35733c;
    public final ArrayList d;
    public final View e;
    public final float f35734f;
    public final float h;

    public ab(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f35731a = sbVar;
        this.f35732b = arrayList;
        this.f35733c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f35734f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        sb.a0(this.f35731a, this.f35732b, this.f35733c, this.d, this.e, this.f35734f, this.h);
    }
}
