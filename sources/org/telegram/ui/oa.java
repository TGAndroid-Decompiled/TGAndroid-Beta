package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class oa implements Runnable {
    public final pb f41031a;
    public final ArrayList f41032b;
    public final ArrayList f41033c;
    public final ArrayList d;
    public final View f41034e;
    public final float f41035f;
    public final float h;

    public oa(pb pbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f41031a = pbVar;
        this.f41032b = arrayList;
        this.f41033c = arrayList2;
        this.d = arrayList3;
        this.f41034e = view;
        this.f41035f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        pb.U(this.f41031a, this.f41032b, this.f41033c, this.d, this.f41034e, this.f41035f, this.h);
    }
}
