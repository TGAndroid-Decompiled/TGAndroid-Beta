package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28152a;
    public final Object f28153b;
    public final Object f28154c;

    public la(int i10, Object obj, Object obj2) {
        this.f28152a = i10;
        this.f28154c = obj;
        this.f28153b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28152a;
        Object obj = this.f28153b;
        Object obj2 = this.f28154c;
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
                f01Var.f25880k = z5.update(f01Var.f25881l, (View) obj, f01Var.f25880k, f01Var.f25873b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28152a) {
            case 0:
                na naVar = (na) this.f28154c;
                ja jaVar = (ja) this.f28153b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.f27437e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27445n.a();
                    }
                }
                naVar.f28740n = null;
                Paint paint = naVar.h;
                naVar.f28741o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28153b, ((f01) this.f28154c).f25880k);
                return;
        }
    }
}
