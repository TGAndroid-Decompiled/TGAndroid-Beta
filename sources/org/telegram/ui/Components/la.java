package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f28126a;
    public final Object f28127b;
    public final Object f28128c;

    public la(int i10, Object obj, Object obj2) {
        this.f28126a = i10;
        this.f28128c = obj;
        this.f28127b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28126a;
        Object obj = this.f28127b;
        Object obj2 = this.f28128c;
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
                f01Var.f25854k = z5.update(f01Var.f25855l, (View) obj, f01Var.f25854k, f01Var.f25847b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28126a) {
            case 0:
                na naVar = (na) this.f28128c;
                ja jaVar = (ja) this.f28127b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.f27411e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f27419n.a();
                    }
                }
                naVar.f28714n = null;
                Paint paint = naVar.h;
                naVar.f28715o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28127b, ((f01) this.f28128c).f25854k);
                return;
        }
    }
}
