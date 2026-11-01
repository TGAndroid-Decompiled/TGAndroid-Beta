package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class ff0 implements o1.f {
    public final int f26150a;
    public final ArrayList f26151b;
    public final ScaleGestureDetector.OnScaleGestureListener f26152c;

    public ff0(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f26150a = i10;
        this.f26152c = onScaleGestureListener;
        this.f26151b = arrayList;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f26150a) {
            case 0:
                ArrayList arrayList = jVar.f13956k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f26151b;
                arrayList2.add(jVar);
                if (arrayList2.size() == 2) {
                    ((eg.b) this.f26152c).b();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = jVar.f13956k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f26151b;
                arrayList4.add(jVar);
                if (arrayList4.size() == 2) {
                    ((eg.b) this.f26152c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = jVar.f13956k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f26151b;
                arrayList6.add(jVar);
                if (arrayList6.size() == 2) {
                    ((th.t0) this.f26152c).a();
                    return;
                }
                return;
        }
    }
}
