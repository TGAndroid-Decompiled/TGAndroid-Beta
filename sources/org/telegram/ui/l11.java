package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class l11 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.uj0 {
    public final i31 f39025a;

    public l11(i31 i31Var) {
        this.f39025a = i31Var;
    }

    @Override
    public void g() {
        this.f39025a.m();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        i31 i31Var = this.f39025a;
        int i11 = i31Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
        ArrayList[] arrayListArr = b02.E0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.D0[0] = 0;
        b02.getMessagesStorage().f15938a.c(new org.telegram.messenger.eg(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        i31Var.B(false, true, true);
    }
}
