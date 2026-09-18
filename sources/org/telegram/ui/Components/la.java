package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f26088a;
    public final Object f26089b;
    public final Object f26090c;

    public la(int i10, Object obj, Object obj2) {
        this.f26088a = i10;
        this.f26090c = obj;
        this.f26089b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26088a;
        Object obj = this.f26089b;
        Object obj2 = this.f26090c;
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
                v01Var.f28873k = z5.update(v01Var.f28874l, (View) obj, v01Var.f28873k, v01Var.f28867b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26088a) {
            case 0:
                na naVar = (na) this.f26090c;
                ja jaVar = (ja) this.f26089b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25281n.a();
                    }
                }
                naVar.f26645n = null;
                Paint paint = naVar.h;
                naVar.f26646o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f26089b, ((v01) this.f26090c).f28873k);
                return;
        }
    }
}
