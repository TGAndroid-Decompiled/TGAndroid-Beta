package org.telegram.ui.Components;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
public final class ka implements View.OnAttachStateChangeListener {
    public final int f25655a;
    public final Object f25656b;
    public final Object f25657c;

    public ka(int i10, Object obj, Object obj2) {
        this.f25655a = i10;
        this.f25657c = obj;
        this.f25656b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f25655a;
        Object obj = this.f25656b;
        Object obj2 = this.f25657c;
        switch (i10) {
            case 0:
                ia iaVar = (ia) obj;
                if (iaVar != null) {
                    iaVar.d.add((ma) obj2);
                    return;
                }
                return;
            default:
                w01 w01Var = (w01) obj2;
                w01Var.f29867k = y5.update(w01Var.f29868l, (View) obj, w01Var.f29867k, w01Var.f29861b);
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25655a) {
            case 0:
                ma maVar = (ma) this.f25657c;
                ia iaVar = (ia) this.f25656b;
                if (iaVar != null) {
                    ArrayList arrayList = iaVar.d;
                    arrayList.remove(maVar);
                    if (iaVar.e.isEmpty() && arrayList.isEmpty()) {
                        iaVar.f25069n.a();
                    }
                }
                maVar.f26397n = null;
                Paint paint = maVar.h;
                maVar.f26398o = null;
                paint.setShader(null);
                return;
            default:
                y5.release((View) this.f25656b, ((w01) this.f25657c).f29867k);
                return;
        }
    }
}
