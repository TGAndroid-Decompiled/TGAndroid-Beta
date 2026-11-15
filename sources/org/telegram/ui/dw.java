package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class dw extends UndoView {
    public final yw f46495k0;

    public dw(yw ywVar, Activity activity) {
        super(activity);
        this.f46495k0 = ywVar;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = this.f46495k0.f53673f0;
            if (i7 < xwVarArr.length) {
                if (xwVarArr[i7].f53341y.k()) {
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
        yw ywVar = this.f46495k0;
        ywVar.M4(true, true);
        if (ywVar.T1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < ywVar.T1.size()) {
                    if (((TLRPC.Dialog) ywVar.T1.get(i10)).f28055id == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                ywVar.f53673f0[0].d.f();
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u11(this, i10, (TLRPC.Dialog) ywVar.T1.remove(i10), 1));
            } else {
                ywVar.M4(false, true);
            }
        }
        ywVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        yw ywVar = this.f46495k0;
        UndoView[] undoViewArr = ywVar.f53774z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ywVar.f53758w1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                ywVar.k5();
            }
        }
    }
}
