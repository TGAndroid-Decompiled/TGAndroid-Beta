package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m1 implements Runnable {
    public final int f26869a = 0;
    public final long f26870b;
    public final int f26871c;
    public final Object d;
    public final Object e;
    public final Object f26872f;
    public final Object h;
    public final Object f26873n;

    public m1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26871c = i10;
        this.f26870b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f26872f = c6Var;
        this.h = callback;
        this.f26873n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f26869a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f26872f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f26873n;
                int i10 = this.f26871c;
                long j10 = zh.n5.y(i10, false).p().amount;
                long j11 = this.f26870b;
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
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.e;
                final bi.f0 f0Var = (bi.f0) this.f26872f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f26873n;
                e2Var.h = false;
                if (a2Var == null) {
                    f0Var.run(null, str);
                    return;
                }
                String str2 = a2Var.e;
                if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
                    e2Var.f32821g = a2Var;
                    if ("sendTransaction".equals(str2) && a2Var.f32620f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(e2Var.f32817a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.e2.j(this.f26870b, this.f26871c) + ".transfer")) {
                            a2Var.f32626m = true;
                            e2Var.z(a2Var, h0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.f32626m = false;
                                            e2Var2.s(a2Var2);
                                            f0Var.run(null, str3);
                                            return;
                                        default:
                                            e2Var.s(a2Var);
                                            f0Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (a2Var.f32625l < 0 && !"disconnect".equals(str2)) {
                        f0Var.run(a2Var, null);
                        return;
                    }
                    h0Var.close();
                    e2Var.e(a2Var, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            String str3 = (String) obj;
                            switch (r4) {
                                case 0:
                                    e2 e2Var2 = e2Var;
                                    e2Var2.getClass();
                                    a2 a2Var2 = a2Var;
                                    a2Var2.f32626m = false;
                                    e2Var2.s(a2Var2);
                                    f0Var.run(null, str3);
                                    return;
                                default:
                                    e2Var.s(a2Var);
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

    public m1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, bi.f0 f0Var, String str, long j10, int i10, org.telegram.ui.Wallet.h0 h0Var) {
        this.d = e2Var;
        this.e = a2Var;
        this.f26872f = f0Var;
        this.h = str;
        this.f26870b = j10;
        this.f26871c = i10;
        this.f26873n = h0Var;
    }
}
