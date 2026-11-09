package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class dw extends UndoView {
    public final yw f45124j0;

    public dw(yw ywVar, Activity activity) {
        super(activity);
        this.f45124j0 = ywVar;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = this.f45124j0.f52231e0;
            if (i7 < xwVarArr.length) {
                if (xwVarArr[i7].f51782y.k()) {
                    return false;
                }
                i7++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void g(int i7, long j3) {
        if (i7 != 1 && i7 != 27) {
            return;
        }
        yw ywVar = this.f45124j0;
        ywVar.M4(true, true);
        if (ywVar.S1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < ywVar.S1.size()) {
                    if (((TLRPC.Dialog) ywVar.S1.get(i10)).f26960id == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                ywVar.f52231e0[0].d.f();
                org.telegram.messenger.g0.h3(new q8(this, i10, (TLRPC.Dialog) ywVar.S1.remove(i10), 28));
            } else {
                ywVar.M4(false, true);
            }
        }
        ywVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        yw ywVar = this.f45124j0;
        UndoView[] undoViewArr = ywVar.f52333y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ywVar.f52316v1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                ywVar.k5();
            }
        }
    }
}
