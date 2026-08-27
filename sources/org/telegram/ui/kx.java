package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

public final class kx extends UndoView {

    public final gy f39895b0;

    public kx(gy gyVar, Activity activity) {
        super(activity);
        this.f39895b0 = gyVar;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            fy[] fyVarArr = this.f39895b0.f38498a0;
            if (i10 >= fyVarArr.length) {
                return true;
            }
            if (fyVarArr[i10].f38234x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            gy gyVar = this.f39895b0;
            gyVar.f38603u3 = 1;
            gyVar.A4(true, true);
            if (gyVar.N1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= gyVar.N1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) gyVar.N1.get(i11)).f22384id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.N1.remove(i11);
                    gyVar.f38498a0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.km(this, i11, dialog, 25));
                } else {
                    gyVar.A4(false, true);
                }
            }
            gyVar.o3();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        gy gyVar = this.f39895b0;
        UndoView[] undoViewArr = gyVar.f38600u0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                gyVar.f38580q1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                gyVar.X4();
            }
        }
    }
}
