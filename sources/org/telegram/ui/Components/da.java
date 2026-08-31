package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class da implements View.OnAttachStateChangeListener {
    public final int f26237a;
    public final Object f26238b;
    public final Object f26239c;

    public da(int i10, Object obj, Object obj2) {
        this.f26237a = i10;
        this.f26239c = obj;
        this.f26238b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26237a;
        Object obj = this.f26238b;
        Object obj2 = this.f26239c;
        switch (i10) {
            case 0:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    baVar.d.add((fa) obj2);
                    return;
                }
                return;
            default:
                l01 l01Var = (l01) obj2;
                l01Var.f28527k = u5.update(l01Var.f28528l, (View) obj, l01Var.f28527k, l01Var.f28520b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26237a) {
            case 0:
                fa faVar = (fa) this.f26239c;
                ba baVar = (ba) this.f26238b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.f25543e.isEmpty() && arrayList.isEmpty()) {
                        baVar.f25551n.a();
                    }
                }
                faVar.f26842n = null;
                Paint paint = faVar.h;
                faVar.f26843o = null;
                paint.setShader(null);
                return;
            default:
                u5.release((View) this.f26238b, ((l01) this.f26239c).f28527k);
                return;
        }
    }
}
