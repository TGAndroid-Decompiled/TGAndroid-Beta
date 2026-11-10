package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ew extends UndoView {
    public final zw f45452j0;

    public ew(zw zwVar, Activity activity) {
        super(activity);
        this.f45452j0 = zwVar;
    }

    @Override
    public final boolean a() {
        int i7 = 0;
        while (true) {
            yw[] ywVarArr = this.f45452j0.f52577e0;
            if (i7 < ywVarArr.length) {
                if (ywVarArr[i7].f52135y.k()) {
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
        zw zwVar = this.f45452j0;
        zwVar.M4(true, true);
        if (zwVar.S1 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < zwVar.S1.size()) {
                    if (((TLRPC.Dialog) zwVar.S1.get(i10)).f26964id == j3) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                zwVar.f52577e0[0].d.f();
                org.telegram.messenger.g0.h3(new q8(this, i10, (TLRPC.Dialog) zwVar.S1.remove(i10), 28));
            } else {
                zwVar.M4(false, true);
            }
        }
        zwVar.z3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        zw zwVar = this.f45452j0;
        UndoView[] undoViewArr = zwVar.f52679y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                zwVar.f52662v1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                zwVar.k5();
            }
        }
    }
}
