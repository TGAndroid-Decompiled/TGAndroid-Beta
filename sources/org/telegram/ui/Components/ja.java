package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ja implements View.OnAttachStateChangeListener {
    public final int f25194a;
    public final Object f25195b;
    public final Object f25196c;

    public ja(int i10, Object obj, Object obj2) {
        this.f25194a = i10;
        this.f25196c = obj;
        this.f25195b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25194a;
        Object obj = this.f25195b;
        Object obj2 = this.f25196c;
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
                h01Var.f24444k = x5.update(h01Var.f24445l, (View) obj, h01Var.f24444k, h01Var.f24438b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25194a) {
            case 0:
                la laVar = (la) this.f25196c;
                ha haVar = (ha) this.f25195b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.f24616n.a();
                    }
                }
                laVar.f25877n = null;
                Paint paint = laVar.h;
                laVar.f25878o = null;
                paint.setShader(null);
                return;
            default:
                x5.release((View) this.f25195b, ((h01) this.f25196c).f24444k);
                return;
        }
    }
}
