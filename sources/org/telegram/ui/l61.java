package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l61 {
    public TLRPC.User f39105a;
    public String f39106b;

    public static TLRPC.User a(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f19943id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.k2 k2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f39105a.f19943id);
        org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).U3(this.f39105a, false, false);
        k2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final org.telegram.ui.s61 r18, final org.telegram.ui.ActionBar.x1[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l61.c(org.telegram.tgnet.TLRPC$ChatFull, org.telegram.ui.s61, org.telegram.ui.ActionBar.x1[], boolean):void");
    }
}
