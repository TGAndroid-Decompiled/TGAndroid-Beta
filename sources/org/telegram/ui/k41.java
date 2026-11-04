package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k41 {
    public TLRPC.User f46766a;
    public String f46767b;

    public static TLRPC.User a(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f27150id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.d2 d2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f46766a.f27150id);
        org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).X3(this.f46766a, false, false);
        d2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final org.telegram.ui.r41 r18, final org.telegram.ui.ActionBar.s1[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k41.c(org.telegram.tgnet.TLRPC$ChatFull, org.telegram.ui.r41, org.telegram.ui.ActionBar.s1[], boolean):void");
    }
}
