package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m1 implements Runnable {
    public final int f28591a = 0;
    public final long f28592b;
    public final int f28593c;
    public final Object d;
    public final Object f28594e;
    public final Object f28595f;
    public final Object h;
    public final Object f28596n;

    public m1(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28593c = i10;
        this.f28592b = j3;
        this.d = activity;
        this.f28594e = arrayList;
        this.f28595f = e6Var;
        this.h = callback;
        this.f28596n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f28591a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.f28594e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f28595f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f28596n;
                int i10 = this.f28593c;
                long j3 = yh.m5.y(i10, false).p().amount;
                long j10 = this.f28592b;
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
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f28594e;
                final ai.m0 m0Var = (ai.m0) this.f28595f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f28596n;
                e2Var.h = false;
                if (a2Var == null) {
                    m0Var.run(null, str);
                    return;
                }
                String str2 = a2Var.f34651e;
                if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
                    e2Var.f34863g = a2Var;
                    if ("sendTransaction".equals(str2) && a2Var.f34652f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(e2Var.f34858a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.e2.j(this.f28592b, this.f28593c) + ".transfer")) {
                            a2Var.f34658m = true;
                            e2Var.z(a2Var, h0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.f34658m = false;
                                            e2Var2.s(a2Var2);
                                            m0Var.run(null, str3);
                                            return;
                                        default:
                                            e2Var.s(a2Var);
                                            m0Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (a2Var.f34657l < 0 && !"disconnect".equals(str2)) {
                        m0Var.run(a2Var, null);
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
                                    a2Var2.f34658m = false;
                                    e2Var2.s(a2Var2);
                                    m0Var.run(null, str3);
                                    return;
                                default:
                                    e2Var.s(a2Var);
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

    public m1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, ai.m0 m0Var, String str, long j3, int i10, org.telegram.ui.Wallet.h0 h0Var) {
        this.d = e2Var;
        this.f28594e = a2Var;
        this.f28595f = m0Var;
        this.h = str;
        this.f28592b = j3;
        this.f28593c = i10;
        this.f28596n = h0Var;
    }
}
