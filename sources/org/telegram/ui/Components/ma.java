package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ma implements View.OnAttachStateChangeListener {
    public final int f28564a;
    public final Object f28565b;
    public final Object f28566c;

    public ma(int i10, Object obj, Object obj2) {
        this.f28564a = i10;
        this.f28566c = obj;
        this.f28565b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28564a;
        Object obj = this.f28565b;
        Object obj2 = this.f28566c;
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
                e11Var.f25890k = z5.update(e11Var.f25891l, (View) obj, e11Var.f25890k, e11Var.f25883b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28564a) {
            case 0:
                oa oaVar = (oa) this.f28566c;
                ka kaVar = (ka) this.f28565b;
                if (kaVar != null) {
                    ArrayList arrayList = kaVar.d;
                    arrayList.remove(oaVar);
                    if (kaVar.f28053e.isEmpty() && arrayList.isEmpty()) {
                        kaVar.f28061n.a();
                    }
                }
                oaVar.f29320n = null;
                Paint paint = oaVar.h;
                oaVar.f29321o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28565b, ((e11) this.f28566c).f25890k);
                return;
        }
    }
}
