package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class pc0 extends uf.h0 {
    public boolean f40013j0;
    public final bd0 f40014k0;

    public pc0(bd0 bd0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context, i10, j10, false, g6Var, false, z4, z10);
        this.f40014k0 = bd0Var;
        this.f40013j0 = true;
    }

    @Override
    public final void K() {
        this.f40014k0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        bd0 bd0Var = this.f40014k0;
        MessageObject messageObject = bd0Var.f35486y0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    vc0 vc0Var = (vc0) arrayList.get(i12);
                    if (vc0Var != null && !UserObject.isUserSelf(vc0Var.f42202c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.f40013j0 && i10 == 1) {
                bd0Var.f35462f0 = ((vc0) arrayList.get(0)).f42200a;
            }
            this.f40013j0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = bd0Var.W;
            if (i10 != 1) {
                i11 = 8;
            }
            w0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
