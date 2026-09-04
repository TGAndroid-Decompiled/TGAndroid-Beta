package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28125a;
    public final Object f28126b;
    public final Object f28127c;

    public la(int i10, Object obj, Object obj2) {
        this.f28125a = i10;
        this.f28127c = obj;
        this.f28126b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28125a;
        Object obj = this.f28126b;
        Object obj2 = this.f28127c;
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
                f01Var.f25853k = z5.update(f01Var.f25854l, (View) obj, f01Var.f25853k, f01Var.f25846b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28125a) {
            case 0:
                na naVar = (na) this.f28127c;
                ja jaVar = (ja) this.f28126b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.f27410e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27418n.a();
                    }
                }
                naVar.f28713n = null;
                Paint paint = naVar.h;
                naVar.f28714o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28126b, ((f01) this.f28127c).f25853k);
                return;
        }
    }
}
