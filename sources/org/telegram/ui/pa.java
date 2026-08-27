package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

public final class pa implements Runnable {

    public final qb f41306a;

    public final ArrayList f41307b;

    public final ArrayList f41308c;
    public final ArrayList d;

    public final View f41309e;

    public final float f41310f;
    public final float h;

    public pa(qb qbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f41306a = qbVar;
        this.f41307b = arrayList;
        this.f41308c = arrayList2;
        this.d = arrayList3;
        this.f41309e = view;
        this.f41310f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        qb.V(this.f41306a, this.f41307b, this.f41308c, this.d, this.f41309e, this.f41310f, this.h);
    }
}
