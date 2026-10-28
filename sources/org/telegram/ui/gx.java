package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gx extends UndoView {
    public final ey f39703j0;

    public gx(ey eyVar, Activity activity) {
        super(activity);
        this.f39703j0 = eyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            dy[] dyVarArr = this.f39703j0.f38998e0;
            if (i10 < dyVarArr.length) {
                if (dyVarArr[i10].f38710x.k()) {
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
        ey eyVar = this.f39703j0;
        eyVar.f39108z3 = 1;
        eyVar.I4(true, true);
        if (eyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < eyVar.R1.size()) {
                    if (((TLRPC.Dialog) eyVar.R1.get(i11)).f22032id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                eyVar.f38998e0[0].d.l();
                AndroidUtilities.runOnUIThread(new fx(this, i11, (TLRPC.Dialog) eyVar.R1.remove(i11), 0));
            } else {
                eyVar.I4(false, true);
            }
        }
        eyVar.w3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ey eyVar = this.f39703j0;
        UndoView[] undoViewArr = eyVar.f39102y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                eyVar.f39080u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                eyVar.g5();
            }
        }
    }
}
