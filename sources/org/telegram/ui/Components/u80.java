package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class u80 implements Runnable {
    public final int f39962a;
    public final Object f39963b;
    public final Object f39964c;
    public final Object d;
    public final Object f39965e;

    public u80(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f39962a = i7;
        this.f39963b = obj;
        this.f39964c = obj2;
        this.d = obj3;
        this.f39965e = obj4;
    }

    private final void a() {
        org.telegram.ui.be0 be0Var = (org.telegram.ui.be0) this.f39963b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f39964c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.f39965e;
        be0Var.N = false;
        org.telegram.ui.ce0 ce0Var = be0Var.f45693h0;
        ce0Var.N1(false, true);
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.n0(password, true)) {
                t4.u0(ce0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.f(serializedData.toByteArray()));
            bundle.putString("phoneFormated", str);
            ce0Var.M1(6, true, bundle, false);
            return;
        }
        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error.text);
    }

    private final void b() {
        int i7;
        org.telegram.ui.gg0 gg0Var = (org.telegram.ui.gg0) this.f39963b;
        mg.b bVar = (mg.b) this.f39964c;
        String str = (String) this.d;
        org.telegram.ui.y41 y41Var = (org.telegram.ui.y41) this.f39965e;
        org.telegram.ui.jg0 jg0Var = gg0Var.f47440w.d;
        if (bVar != null) {
            jg0Var.f48331w.l(str, bVar);
        }
        if (bVar != null && !y41Var.f53416b && (i7 = y41Var.f53415a) >= 0) {
            View m10 = jg0Var.h.m(i7);
            if (m10 instanceof org.telegram.ui.j41) {
                gg0Var.f48206r.f48829e = bVar;
                org.telegram.ui.j41 j41Var = (org.telegram.ui.j41) m10;
                j41Var.f48201b.f19456u0.d(false, false);
                j41Var.g(false);
            }
        }
        gg0Var.f();
    }

    private final void c() {
        org.telegram.ui.oh0 oh0Var = (org.telegram.ui.oh0) this.f39963b;
        ArrayList arrayList = (ArrayList) this.f39965e;
        ArrayList arrayList2 = (ArrayList) this.f39964c;
        ArrayList arrayList3 = (ArrayList) this.d;
        jg.z1 z1Var = oh0Var.h;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = oh0Var.f49963n;
        if (!notificationsCustomSettingsActivity.f42675f) {
            return;
        }
        oh0Var.f49962f = null;
        oh0Var.d = arrayList;
        oh0Var.f49961e = arrayList2;
        z1Var.f(arrayList3, null);
        if (notificationsCustomSettingsActivity.f42675f && !z1Var.e()) {
            notificationsCustomSettingsActivity.f42673c.c();
        }
        oh0Var.f();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u80.run():void");
    }

    public u80(Object obj, ArrayList arrayList, ArrayList arrayList2, Object obj2, int i7) {
        this.f39962a = i7;
        this.f39963b = obj;
        this.f39965e = arrayList;
        this.f39964c = arrayList2;
        this.d = obj2;
    }

    public u80(y80 y80Var, boolean[] zArr, ArrayList arrayList, boolean[] zArr2) {
        this.f39962a = 0;
        this.f39963b = y80Var;
        this.f39964c = zArr;
        this.f39965e = arrayList;
        this.d = zArr2;
    }
}
