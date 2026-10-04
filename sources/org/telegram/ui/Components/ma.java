package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ma implements View.OnAttachStateChangeListener {
    public final int f28559a;
    public final Object f28560b;
    public final Object f28561c;

    public ma(int i10, Object obj, Object obj2) {
        this.f28559a = i10;
        this.f28561c = obj;
        this.f28560b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28559a;
        Object obj = this.f28560b;
        Object obj2 = this.f28561c;
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
                e11Var.f25885k = z5.update(e11Var.f25886l, (View) obj, e11Var.f25885k, e11Var.f25878b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28559a) {
            case 0:
                oa oaVar = (oa) this.f28561c;
                ka kaVar = (ka) this.f28560b;
                if (kaVar != null) {
                    ArrayList arrayList = kaVar.d;
                    arrayList.remove(oaVar);
                    if (kaVar.f28048e.isEmpty() && arrayList.isEmpty()) {
                        kaVar.f28056n.a();
                    }
                }
                oaVar.f29315n = null;
                Paint paint = oaVar.h;
                oaVar.f29316o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28560b, ((e11) this.f28561c).f25885k);
                return;
        }
    }
}
