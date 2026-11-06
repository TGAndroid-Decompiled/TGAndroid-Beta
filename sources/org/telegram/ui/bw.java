package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class bw extends UndoView {
    public final ww f44474j0;

    public bw(ww wwVar, Activity activity) {
        super(activity);
        this.f44474j0 = wwVar;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            vw[] vwVarArr = this.f44474j0.f51534e0;
            if (i7 < vwVarArr.length) {
                if (vwVarArr[i7].f50843y.k()) {
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
        ww wwVar = this.f44474j0;
        wwVar.M4(true, true);
        if (wwVar.R1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < wwVar.R1.size()) {
                    if (((TLRPC.Dialog) wwVar.R1.get(i10)).f26956id == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                wwVar.f51534e0[0].d.f();
                org.telegram.messenger.g0.h3(new q8(this, i10, (TLRPC.Dialog) wwVar.R1.remove(i10), 28));
            } else {
                wwVar.M4(false, true);
            }
        }
        wwVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ww wwVar = this.f44474j0;
        UndoView[] undoViewArr = wwVar.f51635y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                wwVar.f51614u1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                wwVar.k5();
            }
        }
    }
}
