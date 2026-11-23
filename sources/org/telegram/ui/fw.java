package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fw extends UndoView {
    public final bx f47988k0;

    public fw(bx bxVar, Activity activity) {
        super(activity);
        this.f47988k0 = bxVar;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ax[] axVarArr = this.f47988k0.f46549f0;
            if (i7 < axVarArr.length) {
                if (axVarArr[i7].f45832y.k()) {
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
        bx bxVar = this.f47988k0;
        bxVar.U4(true, true);
        if (bxVar.T1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < bxVar.T1.size()) {
                    if (((TLRPC.Dialog) bxVar.T1.get(i10)).f28496id == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                bxVar.f46549f0[0].d.f();
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.e21(this, i10, (TLRPC.Dialog) bxVar.T1.remove(i10), 1));
            } else {
                bxVar.U4(false, true);
            }
        }
        bxVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        bx bxVar = this.f47988k0;
        UndoView[] undoViewArr = bxVar.f46650z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                bxVar.f46634w1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                bxVar.s5();
            }
        }
    }
}
