package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n61 {
    public TLRPC.User f39841a;
    public String f39842b;

    public static TLRPC.User a(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f19942id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.k2 k2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f39841a.f19942id);
        org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).U3(this.f39841a, false, false);
        k2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final org.telegram.ui.u61 r18, final org.telegram.ui.ActionBar.x1[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n61.c(org.telegram.tgnet.TLRPC$ChatFull, org.telegram.ui.u61, org.telegram.ui.ActionBar.x1[], boolean):void");
    }
}
