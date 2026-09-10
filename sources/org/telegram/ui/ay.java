package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ay extends UndoView {
    public final wy f31103f0;

    public ay(wy wyVar, Activity activity) {
        super(activity);
        this.f31103f0 = wyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            vy[] vyVarArr = this.f31103f0.f38431e0;
            if (i10 < vyVarArr.length) {
                if (vyVarArr[i10].f37653x.k()) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    @Override
    public final void h(int i10, long j3) {
        if (i10 != 1 && i10 != 27) {
            return;
        }
        wy wyVar = this.f31103f0;
        wyVar.y3 = 1;
        wyVar.A4(true, true);
        if (wyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < wyVar.R1.size()) {
                    if (((TLRPC.Dialog) wyVar.R1.get(i11)).f17199id == j3) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                wyVar.f38431e0[0].d.l();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.my(this, i11, (TLRPC.Dialog) wyVar.R1.remove(i11), 23));
            } else {
                wyVar.A4(false, true);
            }
        }
        wyVar.o3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        wy wyVar = this.f31103f0;
        UndoView[] undoViewArr = wyVar.f38533y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                wyVar.f38512u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                wyVar.X4();
            }
        }
    }
}
