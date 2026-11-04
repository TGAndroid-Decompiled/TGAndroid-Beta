package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class lz0 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.ui0 {
    public final g11 f47471a;

    public lz0(g11 g11Var) {
        this.f47471a = g11Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        g11 g11Var = this.f47471a;
        int i10 = g11Var.W;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i10);
        ArrayList[] arrayListArr = b02.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        b02.E0[0] = 0;
        b02.getMessagesStorage().f24934a.c(new org.telegram.messenger.xf(b02, 8));
        ArrayList arrayList2 = arrayListArr[0];
        g11Var.B(false, true, true);
    }

    @Override
    public void h() {
        this.f47471a.m();
    }
}
