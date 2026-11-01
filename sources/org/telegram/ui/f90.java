package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class f90 implements org.telegram.messenger.r20 {
    public final int f37087a;
    public final int f37088b;
    public final String f37089c;
    public final Object d;
    public final Object e;
    public final Object f37090f;

    public f90(Object obj, Object obj2, Object obj3, int i10, String str, int i11) {
        this.f37087a = i11;
        this.d = obj;
        this.e = obj2;
        this.f37090f = obj3;
        this.f37088b = i10;
        this.f37089c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        int i10 = this.f37087a;
        Object obj2 = this.f37090f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.messenger.wp wpVar = (org.telegram.messenger.wp) obj3;
                gf.e eVar = (gf.e) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.D1;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = wpVar.Z1(l4);
                } else {
                    user = null;
                }
                int i11 = this.f37088b;
                if (user != null && !org.telegram.messenger.i20.B(user)) {
                    launchActivity.Y(i11, user, this.f37089c, eVar);
                    return;
                }
                if (eVar != null) {
                    eVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i11, user.f19943id, null);
                    return;
                }
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.messenger.m5.o(null, 2131748150, org.telegram.ui.Components.cc.a0(Q), null);
                    return;
                }
                return;
            default:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new rh.t0(context, p6Var, this.f37088b, this.f37089c, arrayList, false).show();
                    return;
                }
                return;
        }
    }
}
