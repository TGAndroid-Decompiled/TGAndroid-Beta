package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class ff0 implements o1.f {
    public final int f26051a;
    public final ArrayList f26052b;
    public final ScaleGestureDetector.OnScaleGestureListener f26053c;

    public ff0(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f26051a = i10;
        this.f26053c = onScaleGestureListener;
        this.f26052b = arrayList;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f26051a) {
            case 0:
                ArrayList arrayList = jVar.f13955k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f26052b;
                arrayList2.add(jVar);
                if (arrayList2.size() == 2) {
                    ((eg.b) this.f26053c).b();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = jVar.f13955k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f26052b;
                arrayList4.add(jVar);
                if (arrayList4.size() == 2) {
                    ((eg.b) this.f26053c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = jVar.f13955k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f26052b;
                arrayList6.add(jVar);
                if (arrayList6.size() == 2) {
                    ((th.t0) this.f26053c).a();
                    return;
                }
                return;
        }
    }
}
