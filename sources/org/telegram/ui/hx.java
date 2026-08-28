package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class hx extends UndoView {
    public final dy f38949b0;

    public hx(dy dyVar, Activity activity) {
        super(activity);
        this.f38949b0 = dyVar;
    }

    @Override
    public final boolean a() {
        int i9 = 0;
        while (true) {
            cy[] cyVarArr = this.f38949b0.f37629a0;
            if (i9 < cyVarArr.length) {
                if (cyVarArr[i9].f37359x.k()) {
                    return false;
                }
                i9++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void h(int i9, long j10) {
        if (i9 != 1 && i9 != 27) {
            return;
        }
        dy dyVar = this.f38949b0;
        dyVar.f37734u3 = 1;
        dyVar.A4(true, true);
        if (dyVar.N1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < dyVar.N1.size()) {
                    if (((TLRPC.Dialog) dyVar.N1.get(i10)).f22384id == j10) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                dyVar.f37629a0[0].d.l();
                AndroidUtilities.runOnUIThread(new rl(this, i10, (TLRPC.Dialog) dyVar.N1.remove(i10), 26));
            } else {
                dyVar.A4(false, true);
            }
        }
        dyVar.o3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        dy dyVar = this.f38949b0;
        UndoView[] undoViewArr = dyVar.f37731u0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                dyVar.f37711q1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                dyVar.X4();
            }
        }
    }
}
