package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class la implements View.OnAttachStateChangeListener {
    public final int f25851a;
    public final Object f25852b;
    public final Object f25853c;

    public la(int i10, Object obj, Object obj2) {
        this.f25851a = i10;
        this.f25853c = obj;
        this.f25852b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25851a;
        Object obj = this.f25852b;
        Object obj2 = this.f25853c;
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
                f01Var.f23790k = z5.update(f01Var.f23791l, (View) obj, f01Var.f23790k, f01Var.f23784b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25851a) {
            case 0:
                na naVar = (na) this.f25853c;
                ja jaVar = (ja) this.f25852b;
                if (jaVar != null) {
                    ArrayList arrayList = jaVar.d;
                    arrayList.remove(naVar);
                    if (jaVar.e.isEmpty() && arrayList.isEmpty()) {
                        jaVar.f25238n.a();
                    }
                }
                naVar.f26396n = null;
                Paint paint = naVar.h;
                naVar.f26397o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f25852b, ((f01) this.f25853c).f23790k);
                return;
        }
    }
}
