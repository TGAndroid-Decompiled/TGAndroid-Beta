package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f25982a;
    public final Object f25983b;
    public final Object f25984c;

    public la(int i10, Object obj, Object obj2) {
        this.f25982a = i10;
        this.f25984c = obj;
        this.f25983b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25982a;
        Object obj = this.f25983b;
        Object obj2 = this.f25984c;
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
                v01Var.f28992k = z5.update(v01Var.f28993l, (View) obj, v01Var.f28992k, v01Var.f28986b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25982a) {
            case 0:
                na naVar = (na) this.f25984c;
                ja jaVar = (ja) this.f25983b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25436n.a();
                    }
                }
                naVar.f26765n = null;
                Paint paint = naVar.h;
                naVar.f26766o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f25983b, ((v01) this.f25984c).f28992k);
                return;
        }
    }
}
