package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ja implements View.OnAttachStateChangeListener {
    public final int f25272a;
    public final Object f25273b;
    public final Object f25274c;

    public ja(int i10, Object obj, Object obj2) {
        this.f25272a = i10;
        this.f25274c = obj;
        this.f25273b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25272a;
        Object obj = this.f25273b;
        Object obj2 = this.f25274c;
        switch (i10) {
            case 0:
                ha haVar = (ha) obj;
                if (haVar != null) {
                    haVar.d.add((la) obj2);
                    return;
                }
                return;
            default:
                g01 g01Var = (g01) obj2;
                g01Var.f24154k = x5.update(g01Var.f24155l, (View) obj, g01Var.f24154k, g01Var.f24148b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25272a) {
            case 0:
                la laVar = (la) this.f25274c;
                ha haVar = (ha) this.f25273b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.f24652n.a();
                    }
                }
                laVar.f25892n = null;
                Paint paint = laVar.h;
                laVar.f25893o = null;
                paint.setShader(null);
                return;
            default:
                x5.release((View) this.f25273b, ((g01) this.f25274c).f24154k);
                return;
        }
    }
}
