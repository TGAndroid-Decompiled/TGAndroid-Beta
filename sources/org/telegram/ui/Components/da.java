package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class da implements View.OnAttachStateChangeListener {
    public final int f24237a;
    public final Object f24238b;
    public final Object f24239c;

    public da(int i10, Object obj, Object obj2) {
        this.f24237a = i10;
        this.f24239c = obj;
        this.f24238b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f24237a;
        Object obj = this.f24238b;
        Object obj2 = this.f24239c;
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
                k01Var.f26129k = u5.update(k01Var.f26130l, (View) obj, k01Var.f26129k, k01Var.f26123b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f24237a) {
            case 0:
                fa faVar = (fa) this.f24239c;
                ba baVar = (ba) this.f24238b;
                if (baVar != null) {
                    ArrayList arrayList = baVar.d;
                    arrayList.remove(faVar);
                    if (baVar.e.isEmpty() && arrayList.isEmpty()) {
                        baVar.f23603n.a();
                    }
                }
                faVar.f24849n = null;
                Paint paint = faVar.h;
                faVar.f24850o = null;
                paint.setShader(null);
                return;
            default:
                u5.release((View) this.f24238b, ((k01) this.f24239c).f26129k);
                return;
        }
    }
}
