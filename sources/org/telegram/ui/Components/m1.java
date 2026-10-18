package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m1 implements Runnable {
    public final int f28359a = 0;
    public final long f28360b;
    public final int f28361c;
    public final Object d;
    public final Object e;
    public final Object f28362f;
    public final Object h;
    public final Object f28363n;

    public m1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28361c = i10;
        this.f28360b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f28362f = d6Var;
        this.h = callback;
        this.f28363n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f28359a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f28362f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f28363n;
                int i10 = this.f28361c;
                long j10 = ai.ga.y(i10, false).p().amount;
                long j11 = this.f28360b;
                if (j10 < j11) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new ai.cd(activity, d6Var, j11, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                callback.run(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                final org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.e;
                final org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f28362f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f28363n;
                f2Var.h = false;
                if (b2Var == null) {
                    s1Var.run(null, str);
                    return;
                }
                String str2 = b2Var.e;
                if (f2Var.y(b2Var) && !f2Var.i(b2Var)) {
                    f2Var.f34172g = b2Var;
                    if ("sendTransaction".equals(str2) && b2Var.f34000f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(f2Var.f34168a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.f2.j(this.f28360b, this.f28361c) + ".transfer")) {
                            b2Var.f34006m = true;
                            f2Var.z(b2Var, j0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            f2 f2Var2 = f2Var;
                                            f2Var2.getClass();
                                            b2 b2Var2 = b2Var;
                                            b2Var2.f34006m = false;
                                            f2Var2.s(b2Var2);
                                            s1Var.run(null, str3);
                                            return;
                                        default:
                                            f2Var.s(b2Var);
                                            s1Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (b2Var.f34005l < 0 && !"disconnect".equals(str2)) {
                        s1Var.run(b2Var, null);
                        return;
                    }
                    j0Var.close();
                    f2Var.e(b2Var, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            String str3 = (String) obj;
                            switch (r4) {
                                case 0:
                                    f2 f2Var2 = f2Var;
                                    f2Var2.getClass();
                                    b2 b2Var2 = b2Var;
                                    b2Var2.f34006m = false;
                                    f2Var2.s(b2Var2);
                                    s1Var.run(null, str3);
                                    return;
                                default:
                                    f2Var.s(b2Var);
                                    s1Var.run(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                s1Var.run(null, "Request expired or wallet changed");
                return;
        }
    }

    public m1(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.s1 s1Var, String str, long j10, int i10, org.telegram.ui.Wallet.j0 j0Var) {
        this.d = f2Var;
        this.e = b2Var;
        this.f28362f = s1Var;
        this.h = str;
        this.f28360b = j10;
        this.f28361c = i10;
        this.f28363n = j0Var;
    }
}
