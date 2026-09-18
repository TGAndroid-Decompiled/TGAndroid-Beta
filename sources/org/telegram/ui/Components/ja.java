package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ja implements View.OnAttachStateChangeListener {
    public final int f25197a;
    public final Object f25198b;
    public final Object f25199c;

    public ja(int i10, Object obj, Object obj2) {
        this.f25197a = i10;
        this.f25199c = obj;
        this.f25198b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25197a;
        Object obj = this.f25198b;
        Object obj2 = this.f25199c;
        switch (i10) {
            case 0:
                ha haVar = (ha) obj;
                if (haVar != null) {
                    haVar.d.add((la) obj2);
                    return;
                }
                return;
            default:
                h01 h01Var = (h01) obj2;
                h01Var.f24447k = x5.update(h01Var.f24448l, (View) obj, h01Var.f24447k, h01Var.f24441b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25197a) {
            case 0:
                la laVar = (la) this.f25199c;
                ha haVar = (ha) this.f25198b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.f24619n.a();
                    }
                }
                laVar.f25880n = null;
                Paint paint = laVar.h;
                laVar.f25881o = null;
                paint.setShader(null);
                return;
            default:
                x5.release((View) this.f25198b, ((h01) this.f25199c).f24447k);
                return;
        }
    }
}
