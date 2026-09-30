package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ma implements View.OnAttachStateChangeListener {
    public final int f26249a;
    public final Object f26250b;
    public final Object f26251c;

    public ma(int i10, Object obj, Object obj2) {
        this.f26249a = i10;
        this.f26251c = obj;
        this.f26250b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f26249a;
        Object obj = this.f26250b;
        Object obj2 = this.f26251c;
        switch (i10) {
            case 0:
                ka kaVar = (ka) obj;
                if (kaVar != null) {
                    kaVar.d.add((oa) obj2);
                    return;
                }
                return;
            default:
                w01 w01Var = (w01) obj2;
                w01Var.f29773k = z5.update(w01Var.f29774l, (View) obj, w01Var.f29773k, w01Var.f29767b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f26249a) {
            case 0:
                oa oaVar = (oa) this.f26251c;
                ka kaVar = (ka) this.f26250b;
                if (kaVar != null) {
                    ArrayList arrayList = kaVar.d;
                    arrayList.remove(oaVar);
                    if (kaVar.e.isEmpty() && arrayList.isEmpty()) {
                        kaVar.f25729n.a();
                    }
                }
                oaVar.f27040n = null;
                Paint paint = oaVar.h;
                oaVar.f27041o = null;
                paint.setShader(null);
                return;
            default:
                z5.release((View) this.f26250b, ((w01) this.f26251c).f29773k);
                return;
        }
    }
}
