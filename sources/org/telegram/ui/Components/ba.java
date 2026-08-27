package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

public final class ba implements View.OnAttachStateChangeListener {

    public final int f27053a;

    public final Object f27054b;

    public final Object f27055c;

    public ba(int i10, Object obj, Object obj2) {
        this.f27053a = i10;
        this.f27055c = obj;
        this.f27054b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f27053a;
        Object obj = this.f27054b;
        Object obj2 = this.f27055c;
        switch (i10) {
            case 0:
                z9 z9Var = (z9) obj;
                if (z9Var != null) {
                    z9Var.d.add((da) obj2);
                }
                break;
            default:
                pz0 pz0Var = (pz0) obj2;
                pz0Var.f31703k = t5.update(pz0Var.f31704l, (View) obj, pz0Var.f31703k, pz0Var.f31696b);
                break;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f27053a) {
            case 0:
                da daVar = (da) this.f27055c;
                z9 z9Var = (z9) this.f27054b;
                if (z9Var != null) {
                    ArrayList arrayList = z9Var.d;
                    arrayList.remove(daVar);
                    if (z9Var.f35205e.isEmpty() && arrayList.isEmpty()) {
                        z9Var.f35213n.a();
                    }
                }
                daVar.f27694n = null;
                Paint paint = daVar.h;
                daVar.f27695o = null;
                paint.setShader(null);
                break;
            default:
                t5.release((View) this.f27054b, ((pz0) this.f27055c).f31703k);
                break;
        }
    }
}
