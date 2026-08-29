package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class jx extends UndoView {
    public final fy f39699b0;

    public jx(fy fyVar, Activity activity) {
        super(activity);
        this.f39699b0 = fyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ey[] eyVarArr = this.f39699b0.f38256a0;
            if (i10 < eyVarArr.length) {
                if (eyVarArr[i10].f37930x.k()) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void h(int i10, long j10) {
        if (i10 != 1 && i10 != 27) {
            return;
        }
        fy fyVar = this.f39699b0;
        fyVar.f38361u3 = 1;
        fyVar.A4(true, true);
        if (fyVar.N1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < fyVar.N1.size()) {
                    if (((TLRPC.Dialog) fyVar.N1.get(i11)).f22396id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                fyVar.f38256a0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rm(this, i11, (TLRPC.Dialog) fyVar.N1.remove(i11), 25));
            } else {
                fyVar.A4(false, true);
            }
        }
        fyVar.o3();
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        fy fyVar = this.f39699b0;
        UndoView[] undoViewArr = fyVar.f38358u0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                fyVar.f38338q1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f9);
                fyVar.X4();
            }
        }
    }
}
