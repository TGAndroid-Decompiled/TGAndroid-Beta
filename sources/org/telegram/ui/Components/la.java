package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f26050a;
    public final Object f26051b;
    public final Object f26052c;

    public la(int i10, Object obj, Object obj2) {
        this.f26050a = i10;
        this.f26052c = obj;
        this.f26051b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26050a;
        Object obj = this.f26051b;
        Object obj2 = this.f26052c;
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
                t01Var.f28369k = z5.update(t01Var.f28370l, (View) obj, t01Var.f28369k, t01Var.f28363b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26050a) {
            case 0:
                na naVar = (na) this.f26052c;
                ja jaVar = (ja) this.f26051b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25376n.a();
                    }
                }
                naVar.f26698n = null;
                Paint paint = naVar.h;
                naVar.f26699o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f26051b, ((t01) this.f26052c).f28369k);
                return;
        }
    }
}
