package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ma implements View.OnAttachStateChangeListener {
    public final int f28558a;
    public final Object f28559b;
    public final Object f28560c;

    public ma(int i10, Object obj, Object obj2) {
        this.f28558a = i10;
        this.f28560c = obj;
        this.f28559b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28558a;
        Object obj = this.f28559b;
        Object obj2 = this.f28560c;
        switch (i10) {
            case 0:
                ka kaVar = (ka) obj;
                if (kaVar != null) {
                    kaVar.d.add((oa) obj2);
                    return;
                }
                return;
            default:
                e11 e11Var = (e11) obj2;
                e11Var.f25884k = z5.update(e11Var.f25885l, (View) obj, e11Var.f25884k, e11Var.f25877b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28558a) {
            case 0:
                oa oaVar = (oa) this.f28560c;
                ka kaVar = (ka) this.f28559b;
                if (kaVar != null) {
                    ArrayList arrayList = kaVar.d;
                    arrayList.remove(oaVar);
                    if (kaVar.f28047e.isEmpty() && arrayList.isEmpty()) {
                        kaVar.f28055n.a();
                    }
                }
                oaVar.f29314n = null;
                Paint paint = oaVar.h;
                oaVar.f29315o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28559b, ((e11) this.f28560c).f25884k);
                return;
        }
    }
}
