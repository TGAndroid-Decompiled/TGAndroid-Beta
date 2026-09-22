package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ja implements View.OnAttachStateChangeListener {
    public final int f25269a;
    public final Object f25270b;
    public final Object f25271c;

    public ja(int i10, Object obj, Object obj2) {
        this.f25269a = i10;
        this.f25271c = obj;
        this.f25270b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25269a;
        Object obj = this.f25270b;
        Object obj2 = this.f25271c;
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
                g01Var.f24151k = x5.update(g01Var.f24152l, (View) obj, g01Var.f24151k, g01Var.f24145b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25269a) {
            case 0:
                la laVar = (la) this.f25271c;
                ha haVar = (ha) this.f25270b;
                if (haVar != null) {
                    ArrayList arrayList = haVar.d;
                    arrayList.remove(laVar);
                    if (haVar.e.isEmpty() && arrayList.isEmpty()) {
                        haVar.f24655n.a();
                    }
                }
                laVar.f25895n = null;
                Paint paint = laVar.h;
                laVar.f25896o = null;
                paint.setShader(null);
                return;
            default:
                x5.release((View) this.f25270b, ((g01) this.f25271c).f24151k);
                return;
        }
    }
}
