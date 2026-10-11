package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class m1 implements Runnable {
    public final int f28500a = 0;
    public final long f28501b;
    public final int f28502c;
    public final Object d;
    public final Object f28503e;
    public final Object f28504f;
    public final Object h;
    public final Object f28505n;

    public m1(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28502c = i10;
        this.f28501b = j3;
        this.d = activity;
        this.f28503e = arrayList;
        this.f28504f = d6Var;
        this.h = callback;
        this.f28505n = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f28500a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.f28503e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f28504f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.f28505n;
                int i10 = this.f28502c;
                long j3 = yh.n5.y(i10, false).p().amount;
                long j10 = this.f28501b;
                if (j3 < j10) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new yh.e7(activity, d6Var, j10, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                callback.run(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                final org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.f28503e;
                final ai.m0 m0Var = (ai.m0) this.f28504f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f28505n;
                f2Var.h = false;
                if (b2Var == null) {
                    m0Var.run(null, str);
                    return;
                }
                String str2 = b2Var.f34679e;
                if (f2Var.y(b2Var) && !f2Var.i(b2Var)) {
                    f2Var.f34895g = b2Var;
                    if ("sendTransaction".equals(str2) && b2Var.f34680f != null) {
                        SharedPreferences mainSettings = MessagesController.getMainSettings(f2Var.f34890a);
                        if (mainSettings.contains(org.telegram.ui.Wallet.f2.j(this.f28501b, this.f28502c) + ".transfer")) {
                            b2Var.f34686m = true;
                            f2Var.z(b2Var, i0Var, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (r4) {
                                        case 0:
                                            f2 f2Var2 = f2Var;
                                            f2Var2.getClass();
                                            b2 b2Var2 = b2Var;
                                            b2Var2.f34686m = false;
                                            f2Var2.s(b2Var2);
                                            m0Var.run(null, str3);
                                            return;
                                        default:
                                            f2Var.s(b2Var);
                                            m0Var.run(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (b2Var.f34685l < 0 && !"disconnect".equals(str2)) {
                        m0Var.run(b2Var, null);
                        return;
                    }
                    i0Var.close();
                    f2Var.e(b2Var, false, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            String str3 = (String) obj;
                            switch (r4) {
                                case 0:
                                    f2 f2Var2 = f2Var;
                                    f2Var2.getClass();
                                    b2 b2Var2 = b2Var;
                                    b2Var2.f34686m = false;
                                    f2Var2.s(b2Var2);
                                    m0Var.run(null, str3);
                                    return;
                                default:
                                    f2Var.s(b2Var);
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

    public m1(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, ai.m0 m0Var, String str, long j3, int i10, org.telegram.ui.Wallet.i0 i0Var) {
        this.d = f2Var;
        this.f28503e = b2Var;
        this.f28504f = m0Var;
        this.h = str;
        this.f28501b = j3;
        this.f28502c = i10;
        this.f28505n = i0Var;
    }
}
