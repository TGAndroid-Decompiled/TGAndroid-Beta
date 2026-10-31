package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gx extends UndoView {
    public final ay f37661j0;

    public gx(ay ayVar, Activity activity) {
        super(activity);
        this.f37661j0 = ayVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            zx[] zxVarArr = this.f37661j0.f35794e0;
            if (i10 < zxVarArr.length) {
                if (zxVarArr[i10].f44248y.k()) {
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
        ay ayVar = this.f37661j0;
        ayVar.L4(true, true);
        if (ayVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < ayVar.R1.size()) {
                    if (((TLRPC.Dialog) ayVar.R1.get(i11)).f19797id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                ayVar.f35794e0[0].d.f();
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ji0(this, i11, (TLRPC.Dialog) ayVar.R1.remove(i11), 15));
            } else {
                ayVar.L4(false, true);
            }
        }
        ayVar.y3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ay ayVar = this.f37661j0;
        UndoView[] undoViewArr = ayVar.f35897y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ayVar.f35876u1 = Math.max(0.0f, (org.telegram.messenger.i0.L(8.0f) + getMeasuredHeight()) - f7);
                ayVar.j5();
            }
        }
    }
}
