package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class qc0 extends tf.h0 {
    public boolean f37383j0;
    public final cd0 f37384k0;

    public qc0(cd0 cd0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context, i10, j10, false, f6Var, false, z4, z10);
        this.f37384k0 = cd0Var;
        this.f37383j0 = true;
    }

    @Override
    public final void K() {
        this.f37384k0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        cd0 cd0Var = this.f37384k0;
        MessageObject messageObject = cd0Var.f33116y0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    wc0 wc0Var = (wc0) arrayList.get(i12);
                    if (wc0Var != null && !UserObject.isUserSelf(wc0Var.f39340c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.f37383j0 && i10 == 1) {
                cd0Var.f33092f0 = ((wc0) arrayList.get(0)).f39338a;
            }
            this.f37383j0 = false;
            org.telegram.ui.ActionBar.w0 w0Var = cd0Var.W;
            if (i10 != 1) {
                i11 = 8;
            }
            w0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
