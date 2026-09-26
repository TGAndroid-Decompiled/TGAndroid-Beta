package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f26026a;
    public final Object f26027b;
    public final Object f26028c;

    public la(int i10, Object obj, Object obj2) {
        this.f26026a = i10;
        this.f26028c = obj;
        this.f26027b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26026a;
        Object obj = this.f26027b;
        Object obj2 = this.f26028c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            default:
                u01 u01Var = (u01) obj2;
                u01Var.f28654k = z5.update(u01Var.f28655l, (View) obj, u01Var.f28654k, u01Var.f28648b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26026a) {
            case 0:
                na naVar = (na) this.f26028c;
                ja jaVar = (ja) this.f26027b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25366n.a();
                    }
                }
                naVar.f26735n = null;
                Paint paint = naVar.h;
                naVar.f26736o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f26027b, ((u01) this.f26028c).f28654k);
                return;
        }
    }
}
