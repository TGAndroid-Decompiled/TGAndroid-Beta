package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f26049a;
    public final Object f26050b;
    public final Object f26051c;

    public la(int i10, Object obj, Object obj2) {
        this.f26049a = i10;
        this.f26051c = obj;
        this.f26050b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26049a;
        Object obj = this.f26050b;
        Object obj2 = this.f26051c;
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
                t01Var.f28368k = z5.update(t01Var.f28369l, (View) obj, t01Var.f28368k, t01Var.f28362b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26049a) {
            case 0:
                na naVar = (na) this.f26051c;
                ja jaVar = (ja) this.f26050b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25375n.a();
                    }
                }
                naVar.f26697n = null;
                Paint paint = naVar.h;
                naVar.f26698o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f26050b, ((t01) this.f26051c).f28368k);
                return;
        }
    }
}
