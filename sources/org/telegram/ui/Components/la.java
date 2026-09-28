package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f25959a;
    public final Object f25960b;
    public final Object f25961c;

    public la(int i10, Object obj, Object obj2) {
        this.f25959a = i10;
        this.f25961c = obj;
        this.f25960b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25959a;
        Object obj = this.f25960b;
        Object obj2 = this.f25961c;
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
                v01Var.f28933k = z5.update(v01Var.f28934l, (View) obj, v01Var.f28933k, v01Var.f28927b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25959a) {
            case 0:
                na naVar = (na) this.f25961c;
                ja jaVar = (ja) this.f25960b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25421n.a();
                    }
                }
                naVar.f26723n = null;
                Paint paint = naVar.h;
                naVar.f26724o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f25960b, ((v01) this.f25961c).f28933k);
                return;
        }
    }
}
