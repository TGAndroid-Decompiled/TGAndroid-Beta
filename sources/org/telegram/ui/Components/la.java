package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f25947a;
    public final Object f25948b;
    public final Object f25949c;

    public la(int i10, Object obj, Object obj2) {
        this.f25947a = i10;
        this.f25949c = obj;
        this.f25948b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25947a;
        Object obj = this.f25948b;
        Object obj2 = this.f25949c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            default:
                v01 v01Var = (v01) obj2;
                v01Var.f28927k = z5.update(v01Var.f28928l, (View) obj, v01Var.f28927k, v01Var.f28921b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25947a) {
            case 0:
                na naVar = (na) this.f25949c;
                ja jaVar = (ja) this.f25948b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25401n.a();
                    }
                }
                naVar.f26722n = null;
                Paint paint = naVar.h;
                naVar.f26723o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f25948b, ((v01) this.f25949c).f28927k);
                return;
        }
    }
}
