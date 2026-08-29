package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ia implements View.OnAttachStateChangeListener {
    public final int f29359a;
    public final Object f29360b;
    public final Object f29361c;

    public ia(int i10, Object obj, Object obj2) {
        this.f29359a = i10;
        this.f29361c = obj;
        this.f29360b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f29359a;
        Object obj = this.f29360b;
        Object obj2 = this.f29361c;
        switch (i10) {
            case 0:
                ga gaVar = (ga) obj;
                if (gaVar != null) {
                    gaVar.d.add((ka) obj2);
                    return;
                }
                return;
            default:
                zz0 zz0Var = (zz0) obj2;
                zz0Var.f35468k = y5.update(zz0Var.f35469l, (View) obj, zz0Var.f35468k, zz0Var.f35461b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29359a) {
            case 0:
                ka kaVar = (ka) this.f29361c;
                ga gaVar = (ga) this.f29360b;
                if (gaVar != null) {
                    ArrayList arrayList = gaVar.d;
                    arrayList.remove(kaVar);
                    if (gaVar.f28851e.isEmpty() && arrayList.isEmpty()) {
                        gaVar.f28859n.a();
                    }
                }
                kaVar.f29987n = null;
                Paint paint = kaVar.h;
                kaVar.f29988o = null;
                paint.setShader(null);
                return;
            default:
                y5.release((View) this.f29360b, ((zz0) this.f29361c).f35468k);
                return;
        }
    }
}
