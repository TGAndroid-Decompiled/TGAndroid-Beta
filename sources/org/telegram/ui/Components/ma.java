package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ma implements View.OnAttachStateChangeListener {
    public final int f28643a;
    public final Object f28644b;
    public final Object f28645c;

    public ma(int i10, Object obj, Object obj2) {
        this.f28643a = i10;
        this.f28645c = obj;
        this.f28644b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f28643a;
        Object obj = this.f28644b;
        Object obj2 = this.f28645c;
        switch (i10) {
            case 0:
                ka kaVar = (ka) obj;
                if (kaVar != null) {
                    kaVar.d.add((oa) obj2);
                    return;
                }
                return;
            default:
                f11 f11Var = (f11) obj2;
                f11Var.f26272k = z5.update(f11Var.f26273l, (View) obj, f11Var.f26272k, f11Var.f26265b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f28643a) {
            case 0:
                oa oaVar = (oa) this.f28645c;
                ka kaVar = (ka) this.f28644b;
                if (kaVar != null) {
                    ArrayList arrayList = kaVar.d;
                    arrayList.remove(oaVar);
                    if (kaVar.f28139e.isEmpty() && arrayList.isEmpty()) {
                        kaVar.f28147n.a();
                    }
                }
                oaVar.f29420n = null;
                Paint paint = oaVar.h;
                oaVar.f29421o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f28644b, ((f11) this.f28645c).f26272k);
                return;
        }
    }
}
