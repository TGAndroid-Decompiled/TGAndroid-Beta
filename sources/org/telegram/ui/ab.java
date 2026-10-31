package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ab implements Runnable {
    public final sb f35601a;
    public final ArrayList f35602b;
    public final ArrayList f35603c;
    public final ArrayList d;
    public final View e;
    public final float f35604f;
    public final float h;

    public ab(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f35601a = sbVar;
        this.f35602b = arrayList;
        this.f35603c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f35604f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        sb.Z(this.f35601a, this.f35602b, this.f35603c, this.d, this.e, this.f35604f, this.h);
    }
}
