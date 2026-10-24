package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class j1 implements Runnable {
    public final int f27528a = 0;
    public final long f27529b;
    public final int f27530c;
    public final Object d;
    public final Object e;
    public final Object f27531f;
    public final Object h;
    public final Object f27532n;

    public j1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f27530c = i10;
        this.f27529b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f27531f = g6Var;
        this.h = callback;
        this.f27532n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f27528a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f27531f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f27532n;
                int i10 = this.f27530c;
                long j10 = ai.ha.y(i10, false).p().amount;
                long j11 = this.f27529b;
                if (j10 < j11) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new ai.dd(activity, g6Var, j11, 13, DialogObject.getShortName(i10, longValue), new y1(callback, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                callback.run(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.e;
                final org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f27531f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f27532n;
                e2Var.h = false;
                if (a2Var == null) {
                    r1Var.run(null, str);
                    return;
                }
                String str2 = a2Var.e;
                if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
                    e2Var.f34435g = a2Var;
                    if ("sendTransaction".equals(str2) && a2Var.f34277f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(e2Var.f34431a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.e2.j(this.f27529b, this.f27530c) + ".transfer")) {
                            a2Var.f34283m = true;
                            e2Var.z(a2Var, i0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.f34283m = false;
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
                    if (a2Var.f34282l < 0 && !"disconnect".equals(str2)) {
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
                                    a2Var2.f34283m = false;
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

    public j1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.r1 r1Var, String str, long j10, int i10, org.telegram.ui.Wallet.i0 i0Var) {
        this.d = e2Var;
        this.e = a2Var;
        this.f27531f = r1Var;
        this.h = str;
        this.f27529b = j10;
        this.f27530c = i10;
        this.f27532n = i0Var;
    }
}
