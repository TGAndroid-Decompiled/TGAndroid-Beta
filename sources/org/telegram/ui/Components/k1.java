package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class k1 implements Runnable {
    public final int f29769a = 0;
    public final long f29770b;
    public final int f29771c;
    public final Object d;
    public final Object e;
    public final Object f29772f;
    public final Object h;
    public final Object f29773n;

    public k1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f29771c = i10;
        this.f29770b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f29772f = u6Var;
        this.h = callback;
        this.f29773n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f29769a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f29772f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f29773n;
                int i10 = this.f29771c;
                long j10 = bi.ca.y(i10, false).p().amount;
                long j11 = this.f29770b;
                if (j10 < j11) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new bi.tc(activity, u6Var, j11, 13, DialogObject.getShortName(i10, longValue), new c2(callback, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                callback.run(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.e;
                final org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f29772f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f29773n;
                e2Var.h = false;
                if (a2Var == null) {
                    r1Var.run(null, str);
                    return;
                }
                String str2 = a2Var.e;
                if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
                    e2Var.f36510g = a2Var;
                    if ("sendTransaction".equals(str2) && a2Var.f36340f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(e2Var.f36506a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.e2.j(this.f29770b, this.f29771c) + ".transfer")) {
                            a2Var.f36346m = true;
                            e2Var.z(a2Var, i0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.f36346m = false;
                                            e2Var2.s(a2Var2);
                                            r1Var.run(null, str3);
                                            return;
                                        default:
                                            e2Var.s(a2Var);
                                            r1Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (a2Var.f36345l < 0 && !"disconnect".equals(str2)) {
                        r1Var.run(a2Var, null);
                        return;
                    }
                    i0Var.close();
                    e2Var.e(a2Var, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            String str3 = (String) obj;
                            switch (r4) {
                                case 0:
                                    e2 e2Var2 = e2Var;
                                    e2Var2.getClass();
                                    a2 a2Var2 = a2Var;
                                    a2Var2.f36346m = false;
                                    e2Var2.s(a2Var2);
                                    r1Var.run(null, str3);
                                    return;
                                default:
                                    e2Var.s(a2Var);
                                    r1Var.run(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                r1Var.run(null, "Request expired or wallet changed");
                return;
        }
    }

    public k1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.r1 r1Var, String str, long j10, int i10, org.telegram.ui.Wallet.i0 i0Var) {
        this.d = e2Var;
        this.e = a2Var;
        this.f29772f = r1Var;
        this.h = str;
        this.f29770b = j10;
        this.f29771c = i10;
        this.f29773n = i0Var;
    }
}
