package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f25960a;
    public final Object f25961b;
    public final Object f25962c;

    public la(int i10, Object obj, Object obj2) {
        this.f25960a = i10;
        this.f25962c = obj;
        this.f25961b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25960a;
        Object obj = this.f25961b;
        Object obj2 = this.f25962c;
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
                v01Var.f28934k = z5.update(v01Var.f28935l, (View) obj, v01Var.f28934k, v01Var.f28928b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25960a) {
            case 0:
                na naVar = (na) this.f25962c;
                ja jaVar = (ja) this.f25961b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25422n.a();
                    }
                }
                naVar.f26724n = null;
                Paint paint = naVar.h;
                naVar.f26725o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f25961b, ((v01) this.f25962c).f28934k);
                return;
        }
    }
}
