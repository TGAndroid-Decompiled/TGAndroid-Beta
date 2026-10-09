package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m1 implements Runnable {
    public final int f28641a = 0;
    public final long f28642b;
    public final int f28643c;
    public final Object d;
    public final Object f28644e;
    public final Object f28645f;
    public final Object h;
    public final Object f28646n;

    public m1(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28643c = i10;
        this.f28642b = j3;
        this.d = activity;
        this.f28644e = arrayList;
        this.f28645f = e6Var;
        this.h = callback;
        this.f28646n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f28641a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.f28644e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f28645f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f28646n;
                int i10 = this.f28643c;
                long j3 = yh.m5.y(i10, false).p().amount;
                long j10 = this.f28642b;
                if (j3 < j10) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new yh.e7(activity, e6Var, j10, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                callback.run(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                final org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f28644e;
                final ai.m0 m0Var = (ai.m0) this.f28645f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f28646n;
                d2Var.h = false;
                if (z1Var == null) {
                    m0Var.run(null, str);
                    return;
                }
                String str2 = z1Var.f35696e;
                if (d2Var.y(z1Var) && !d2Var.i(z1Var)) {
                    d2Var.f34792g = z1Var;
                    if ("sendTransaction".equals(str2) && z1Var.f35697f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(d2Var.f34787a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.d2.j(this.f28642b, this.f28643c) + ".transfer")) {
                            z1Var.f35703m = true;
                            d2Var.z(z1Var, h0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            d2 d2Var2 = d2Var;
                                            d2Var2.getClass();
                                            z1 z1Var2 = z1Var;
                                            z1Var2.f35703m = false;
                                            d2Var2.s(z1Var2);
                                            m0Var.run(null, str3);
                                            return;
                                        default:
                                            d2Var.s(z1Var);
                                            m0Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (z1Var.f35702l < 0 && !"disconnect".equals(str2)) {
                        m0Var.run(z1Var, null);
                        return;
                    }
                    h0Var.close();
                    d2Var.e(z1Var, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            String str3 = (String) obj;
                            switch (r4) {
                                case 0:
                                    d2 d2Var2 = d2Var;
                                    d2Var2.getClass();
                                    z1 z1Var2 = z1Var;
                                    z1Var2.f35703m = false;
                                    d2Var2.s(z1Var2);
                                    m0Var.run(null, str3);
                                    return;
                                default:
                                    d2Var.s(z1Var);
                                    m0Var.run(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                m0Var.run(null, "Request expired or wallet changed");
                return;
        }
    }

    public m1(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, ai.m0 m0Var, String str, long j3, int i10, org.telegram.ui.Wallet.h0 h0Var) {
        this.d = d2Var;
        this.f28644e = z1Var;
        this.f28645f = m0Var;
        this.h = str;
        this.f28642b = j3;
        this.f28643c = i10;
        this.f28646n = h0Var;
    }
}
