package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class da implements View.OnAttachStateChangeListener {
    public final int f26240a;
    public final Object f26241b;
    public final Object f26242c;

    public da(int i10, Object obj, Object obj2) {
        this.f26240a = i10;
        this.f26242c = obj;
        this.f26241b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26240a;
        Object obj = this.f26241b;
        Object obj2 = this.f26242c;
        switch (i10) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    return;
                }
                return;
            default:
                k01 k01Var = (k01) obj2;
                k01Var.f28233k = u5.update(k01Var.f28234l, (View) obj, k01Var.f28233k, k01Var.f28226b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26240a) {
            case 0:
                fa faVar = (fa) this.f26242c;
                ba baVar = (ba) this.f26241b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.f25554e.isEmpty() && arrayList.isEmpty()) {
                        baVar.f25562n.a();
                    }
                }
                faVar.f26841n = null;
                Paint paint = faVar.h;
                faVar.f26842o = null;
                paint.setShader(null);
                return;
            default:
                u5.release((View) this.f26241b, ((k01) this.f26242c).f28233k);
                return;
        }
    }
}
