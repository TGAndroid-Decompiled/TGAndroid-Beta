package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f26042a;
    public final Object f26043b;
    public final Object f26044c;

    public la(int i10, Object obj, Object obj2) {
        this.f26042a = i10;
        this.f26044c = obj;
        this.f26043b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26042a;
        Object obj = this.f26043b;
        Object obj2 = this.f26044c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            default:
                t01 t01Var = (t01) obj2;
                t01Var.f28362k = z5.update(t01Var.f28363l, (View) obj, t01Var.f28362k, t01Var.f28356b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26042a) {
            case 0:
                na naVar = (na) this.f26044c;
                ja jaVar = (ja) this.f26043b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25350n.a();
                    }
                }
                naVar.f26690n = null;
                Paint paint = naVar.h;
                naVar.f26691o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f26043b, ((t01) this.f26044c).f28362k);
                return;
        }
    }
}
