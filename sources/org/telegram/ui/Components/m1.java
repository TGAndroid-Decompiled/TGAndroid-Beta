package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m1 implements Runnable {
    public final int f27153a = 0;
    public final long f27154b;
    public final int f27155c;
    public final Object d;
    public final Object e;
    public final Object f27156f;
    public final Object h;
    public final Object f27157n;

    public m1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f27155c = i10;
        this.f27154b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f27156f = c6Var;
        this.h = callback;
        this.f27157n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f27153a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f27156f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f27157n;
                int i10 = this.f27155c;
                long j10 = zh.n5.y(i10, false).p().amount;
                long j11 = this.f27154b;
                if (j10 < j11) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new zh.e7(activity, c6Var, j11, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                callback.run(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                final org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.e;
                final bi.f0 f0Var = (bi.f0) this.f27156f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.f27157n;
                d2Var.h = false;
                if (z1Var == null) {
                    f0Var.run(null, str);
                    return;
                }
                String str2 = z1Var.e;
                if (d2Var.y(z1Var) && !d2Var.i(z1Var)) {
                    d2Var.f33044g = z1Var;
                    if ("sendTransaction".equals(str2) && z1Var.f33903f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(d2Var.f33040a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.d2.j(this.f27154b, this.f27155c) + ".transfer")) {
                            z1Var.f33909m = true;
                            d2Var.z(z1Var, g0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            d2 d2Var2 = d2Var;
                                            d2Var2.getClass();
                                            z1 z1Var2 = z1Var;
                                            z1Var2.f33909m = false;
                                            d2Var2.s(z1Var2);
                                            f0Var.run(null, str3);
                                            return;
                                        default:
                                            d2Var.s(z1Var);
                                            f0Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (z1Var.f33908l < 0 && !"disconnect".equals(str2)) {
                        f0Var.run(z1Var, null);
                        return;
                    }
                    g0Var.close();
                    d2Var.e(z1Var, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            String str3 = (String) obj;
                            switch (r4) {
                                case 0:
                                    d2 d2Var2 = d2Var;
                                    d2Var2.getClass();
                                    z1 z1Var2 = z1Var;
                                    z1Var2.f33909m = false;
                                    d2Var2.s(z1Var2);
                                    f0Var.run(null, str3);
                                    return;
                                default:
                                    d2Var.s(z1Var);
                                    f0Var.run(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                f0Var.run(null, "Request expired or wallet changed");
                return;
        }
    }

    public m1(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, bi.f0 f0Var, String str, long j10, int i10, org.telegram.ui.Wallet.g0 g0Var) {
        this.d = d2Var;
        this.e = z1Var;
        this.f27156f = f0Var;
        this.h = str;
        this.f27154b = j10;
        this.f27155c = i10;
        this.f27157n = g0Var;
    }
}
