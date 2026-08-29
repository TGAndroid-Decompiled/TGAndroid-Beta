package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class na implements Runnable {
    public final ob f40760a;
    public final ArrayList f40761b;
    public final ArrayList f40762c;
    public final ArrayList d;
    public final View f40763e;
    public final float f40764f;
    public final float h;

    public na(ob obVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f9, float f10) {
        this.f40760a = obVar;
        this.f40761b = arrayList;
        this.f40762c = arrayList2;
        this.d = arrayList3;
        this.f40763e = view;
        this.f40764f = f9;
        this.h = f10;
    }

    @Override
    public final void run() {
        ob.V(this.f40760a, this.f40761b, this.f40762c, this.d, this.f40763e, this.f40764f, this.h);
    }
}
