package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class dc0 extends of.p0 {
    public boolean f37498i0;
    public final pc0 f37499j0;

    public dc0(pc0 pc0Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context, i9, j10, false, b6Var, false, z10, z11);
        this.f37499j0 = pc0Var;
        this.f37498i0 = true;
    }

    @Override
    public final void K() {
        this.f37499j0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i9;
        pc0 pc0Var = this.f37499j0;
        MessageObject messageObject = pc0Var.f41473x0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i10 = 0;
            if (arrayList != null) {
                i9 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    jc0 jc0Var = (jc0) arrayList.get(i11);
                    if (jc0Var != null && !UserObject.isUserSelf(jc0Var.f39438c)) {
                        i9++;
                    }
                }
            } else {
                i9 = 0;
            }
            if (this.f37498i0 && i9 == 1) {
                pc0Var.f41449e0 = ((jc0) arrayList.get(0)).f39436a;
            }
            this.f37498i0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = pc0Var.V;
            if (i9 != 1) {
                i10 = 8;
            }
            w0Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
