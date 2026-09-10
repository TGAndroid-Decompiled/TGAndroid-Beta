package org.telegram.ui.Components;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class lg0 implements o1.f {
    public final int f24978a;
    public final ArrayList f24979b;
    public final ScaleGestureDetector.OnScaleGestureListener f24980c;

    public lg0(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f24978a = i10;
        this.f24980c = onScaleGestureListener;
        this.f24979b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24978a) {
            case 0:
                ArrayList arrayList = hVar.f14131k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f24979b;
                arrayList2.add((o1.k) hVar);
                if (arrayList2.size() == 2) {
                    ((kg.b) this.f24980c).b();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f14131k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f24979b;
                arrayList4.add((o1.k) hVar);
                if (arrayList4.size() == 2) {
                    ((kg.b) this.f24980c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f14131k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f24979b;
                arrayList6.add((o1.k) hVar);
                if (arrayList6.size() == 2) {
                    ((zh.u0) this.f24980c).a();
                    return;
                }
                return;
        }
    }
}
