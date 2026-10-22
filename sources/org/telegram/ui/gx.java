package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gx extends UndoView {
    public final cy f37433f0;

    public gx(cy cyVar, Activity activity) {
        super(activity);
        this.f37433f0 = cyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ay[] ayVarArr = this.f37433f0.f36095e0;
            if (i10 < ayVarArr.length) {
                if (ayVarArr[i10].f35454x.k()) {
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
        cy cyVar = this.f37433f0;
        cyVar.f36204z3 = 1;
        cyVar.y4(true, true);
        if (cyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < cyVar.R1.size()) {
                    if (((TLRPC.Dialog) cyVar.R1.get(i11)).f20283id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                cyVar.f36095e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y31(this, i11, (TLRPC.Dialog) cyVar.R1.remove(i11), 1));
            } else {
                cyVar.y4(false, true);
            }
        }
        cyVar.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        cy cyVar = this.f37433f0;
        UndoView[] undoViewArr = cyVar.f36198y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                cyVar.f36177u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                cyVar.V4();
            }
        }
    }
}
