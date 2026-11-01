package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fx extends UndoView {
    public final zx f37247j0;

    public fx(zx zxVar, Activity activity) {
        super(activity);
        this.f37247j0 = zxVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            yx[] yxVarArr = this.f37247j0.f44137e0;
            if (i10 < yxVarArr.length) {
                if (yxVarArr[i10].f43742y.k()) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void g(int i10, long j10) {
        if (i10 != 1 && i10 != 27) {
            return;
        }
        zx zxVar = this.f37247j0;
        zxVar.M4(true, true);
        if (zxVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < zxVar.R1.size()) {
                    if (((TLRPC.Dialog) zxVar.R1.get(i11)).f19798id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                zxVar.f44137e0[0].d.f();
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ki0(this, i11, (TLRPC.Dialog) zxVar.R1.remove(i11), 15));
            } else {
                zxVar.M4(false, true);
            }
        }
        zxVar.z3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        zx zxVar = this.f37247j0;
        UndoView[] undoViewArr = zxVar.f44240y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                zxVar.f44219u1 = Math.max(0.0f, (org.telegram.messenger.i0.L(8.0f) + getMeasuredHeight()) - f7);
                zxVar.k5();
            }
        }
    }
}
