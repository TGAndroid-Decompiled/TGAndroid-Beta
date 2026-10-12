package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class dy extends UndoView {
    public final yy f35402f0;

    public dy(yy yyVar, Activity activity) {
        super(activity);
        this.f35402f0 = yyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            xy[] xyVarArr = this.f35402f0.f42325e0;
            if (i10 < xyVarArr.length) {
                if (xyVarArr[i10].f41988x.k()) {
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
        yy yyVar = this.f35402f0;
        yyVar.y3 = 1;
        yyVar.x4(true, true);
        if (yyVar.R1 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < yyVar.R1.size()) {
                    if (((TLRPC.Dialog) yyVar.R1.get(i11)).f19220id == j10) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                yyVar.f42325e0[0].d.l();
                AndroidUtilities.runOnUIThread(new gm(this, i11, (TLRPC.Dialog) yyVar.R1.remove(i11), 27));
            } else {
                yyVar.x4(false, true);
            }
        }
        yyVar.l3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        yy yyVar = this.f35402f0;
        UndoView[] undoViewArr = yyVar.f42427y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                yyVar.f42407u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                yyVar.U4();
            }
        }
    }
}
