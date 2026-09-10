package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ka implements View.OnAttachStateChangeListener {
    public final int f24686a;
    public final Object f24687b;
    public final Object f24688c;

    public ka(int i10, Object obj, Object obj2) {
        this.f24686a = i10;
        this.f24688c = obj;
        this.f24687b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f24686a;
        Object obj = this.f24687b;
        Object obj2 = this.f24688c;
        switch (i10) {
            case 0:
                ia iaVar = (ia) obj;
                if (iaVar != null) {
                    iaVar.d.add((ma) obj2);
                    return;
                }
                return;
            default:
                t01 t01Var = (t01) obj2;
                t01Var.f27252k = y5.update(t01Var.f27253l, (View) obj, t01Var.f27252k, t01Var.f27246b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f24686a) {
            case 0:
                ma maVar = (ma) this.f24688c;
                ia iaVar = (ia) this.f24687b;
                if (iaVar != null) {
                    ArrayList arrayList = iaVar.d;
                    arrayList.remove(maVar);
                    if (iaVar.e.isEmpty() && arrayList.isEmpty()) {
                        iaVar.f23973n.a();
                    }
                }
                maVar.f25207n = null;
                Paint paint = maVar.h;
                maVar.f25208o = null;
                paint.setShader(null);
                return;
            default:
                y5.release((View) this.f24687b, ((t01) this.f24688c).f27252k);
                return;
        }
    }
}
