package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class da implements View.OnAttachStateChangeListener {
    public final int f27693a;
    public final Object f27694b;
    public final Object f27695c;

    public da(int i9, Object obj, Object obj2) {
        this.f27693a = i9;
        this.f27695c = obj;
        this.f27694b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i9 = this.f27693a;
        Object obj = this.f27694b;
        Object obj2 = this.f27695c;
        switch (i9) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    return;
                }
                return;
            default:
                nz0 nz0Var = (nz0) obj2;
                nz0Var.f31229k = t5.update(nz0Var.f31230l, (View) obj, nz0Var.f31229k, nz0Var.f31222b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f27693a) {
            case 0:
                fa faVar = (fa) this.f27695c;
                ba baVar = (ba) this.f27694b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.f27123e.isEmpty() && arrayList.isEmpty()) {
                        baVar.f27131n.a();
                    }
                }
                faVar.f28362n = null;
                Paint paint = faVar.h;
                faVar.f28363o = null;
                paint.setShader(null);
                return;
            default:
                t5.release((View) this.f27694b, ((nz0) this.f27695c).f31229k);
                return;
        }
    }
}
