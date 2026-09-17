package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28153a;
    public final Object f28154b;
    public final Object f28155c;

    public la(int i10, Object obj, Object obj2) {
        this.f28153a = i10;
        this.f28155c = obj;
        this.f28154b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28153a;
        Object obj = this.f28154b;
        Object obj2 = this.f28155c;
        switch (i10) {
            case 0:
                ja jaVar = (ja) obj;
                if (jaVar != null) {
                    jaVar.d.add((na) obj2);
                    return;
                }
                return;
            default:
                f01 f01Var = (f01) obj2;
                f01Var.f25881k = z5.update(f01Var.f25882l, (View) obj, f01Var.f25881k, f01Var.f25874b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28153a) {
            case 0:
                na naVar = (na) this.f28155c;
                ja jaVar = (ja) this.f28154b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.f27438e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27446n.a();
                    }
                }
                naVar.f28741n = null;
                Paint paint = naVar.h;
                naVar.f28742o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28154b, ((f01) this.f28155c).f25881k);
                return;
        }
    }
}
