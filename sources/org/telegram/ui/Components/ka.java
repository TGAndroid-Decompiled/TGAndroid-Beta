package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ka implements View.OnAttachStateChangeListener {
    public final int f25724a;
    public final Object f25725b;
    public final Object f25726c;

    public ka(int i10, Object obj, Object obj2) {
        this.f25724a = i10;
        this.f25726c = obj;
        this.f25725b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25724a;
        Object obj = this.f25725b;
        Object obj2 = this.f25726c;
        switch (i10) {
            case 0:
                ia iaVar = (ia) obj;
                if (iaVar != null) {
                    iaVar.d.add((ma) obj2);
                    return;
                }
                return;
            default:
                u01 u01Var = (u01) obj2;
                u01Var.f28498k = y5.update(u01Var.f28499l, (View) obj, u01Var.f28498k, u01Var.f28492b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25724a) {
            case 0:
                ma maVar = (ma) this.f25726c;
                ia iaVar = (ia) this.f25725b;
                if (iaVar != null) {
                    ArrayList arrayList = iaVar.d;
                    arrayList.remove(maVar);
                    if (iaVar.e.isEmpty() && arrayList.isEmpty()) {
                        iaVar.f24980n.a();
                    }
                }
                maVar.f26366n = null;
                Paint paint = maVar.h;
                maVar.f26367o = null;
                paint.setShader(null);
                return;
            default:
                y5.release((View) this.f25725b, ((u01) this.f25726c).f28498k);
                return;
        }
    }
}
