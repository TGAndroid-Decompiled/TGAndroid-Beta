package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gw extends UndoView {
    public final cx f48174k0;

    public gw(cx cxVar, Activity activity) {
        super(activity);
        this.f48174k0 = cxVar;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            bx[] bxVarArr = this.f48174k0.f46719f0;
            if (i7 < bxVarArr.length) {
                if (bxVarArr[i7].f46331y.k()) {
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
        cx cxVar = this.f48174k0;
        cxVar.U4(true, true);
        if (cxVar.T1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < cxVar.T1.size()) {
                    if (((TLRPC.Dialog) cxVar.T1.get(i10)).f28435id == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                cxVar.f46719f0[0].d.f();
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.j01(this, i10, (TLRPC.Dialog) cxVar.T1.remove(i10), 2));
            } else {
                cxVar.U4(false, true);
            }
        }
        cxVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cx cxVar = this.f48174k0;
        UndoView[] undoViewArr = cxVar.f46820z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                cxVar.f46804w1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                cxVar.s5();
            }
        }
    }
}
