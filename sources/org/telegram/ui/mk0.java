package org.telegram.ui;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mk0 implements Utilities.Callback {
    public final int f40585a = 1;
    public final String f40586b;
    public final boolean f40587c;
    public final boolean d;
    public final Object f40588e;
    public final Object f40589f;
    public final Object f40590g;
    public final Serializable h;
    public final Object f40591i;
    public final Object f40592j;
    public final Object f40593k;
    public final Object f40594l;

    public mk0(d61 d61Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.f40588e = d61Var;
        this.f40586b = str;
        this.f40587c = z10;
        this.f40589f = arrayList;
        this.f40590g = hashMap;
        this.h = arrayList2;
        this.f40591i = linkedHashSet;
        this.f40592j = linkedHashSet2;
        this.f40593k = arrayList3;
        this.f40594l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40585a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f40589f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f40590g;
                final boolean z10 = this.f40587c;
                final String str = this.f40586b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f40591i;
                final String[] strArr = (String[]) this.f40592j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f40593k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f40594l;
                final Integer num = (Integer) obj;
                if (((int[]) this.f40588e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
                    c2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.c2.this.dismiss();
                            org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                            if (urlAuthResult2 != null) {
                                f3Var2.dismiss();
                                pk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, z0Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    f3Var2.dismiss();
                                    org.telegram.ui.Components.tc a2 = pk0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                th.t(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final d61 d61Var = (d61) this.f40588e;
                final String str3 = this.f40586b;
                final boolean z12 = this.f40587c;
                final ArrayList arrayList = (ArrayList) this.f40589f;
                final HashMap hashMap = (HashMap) this.f40590g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40591i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f40592j;
                final ArrayList arrayList3 = (ArrayList) this.f40593k;
                final ArrayList arrayList4 = (ArrayList) this.f40594l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        d61 d61Var2 = d61.this;
                        h41 h41Var = d61Var2.E1;
                        if (h41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(h41Var);
                            d61Var2.E1 = null;
                        }
                        String str4 = d61Var2.f37366v1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        d61Var2.f37364u1 = true;
                        d61Var2.z(true, z12);
                        u41 u41Var = d61Var2.f37321b0;
                        if (u41Var != null) {
                            u41Var.d(true);
                        }
                        ArrayList arrayList5 = d61Var2.f37369w1;
                        if (arrayList5 == null) {
                            d61Var2.f37369w1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = d61Var2.f37377z1;
                        if (arrayList6 == null) {
                            d61Var2.f37377z1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = d61Var2.f37375y1;
                        if (arrayList7 == null) {
                            d61Var2.f37375y1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = d61Var2.f37372x1;
                        if (arrayList8 == null) {
                            d61Var2.f37372x1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        d61Var2.f37329e0.u0(0);
                        int i11 = d61Var2.S;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                d61Var2.f37369w1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    d61Var2.f37369w1.add(kg.q0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                d61Var2.f37372x1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            ArrayList arrayList11 = d61Var2.f37369w1;
                            ?? obj2 = new Object();
                            long longValue = l10.longValue();
                            obj2.f13826g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            d61Var2.f37369w1.add(kg.q0.b((String) it2.next()));
                        }
                        d61Var2.f37377z1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            d61Var2.f37375y1.addAll((ArrayList) obj3);
                        }
                        d61Var2.m0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public mk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.z0 z0Var, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40588e = iArr;
        this.f40589f = tL_messages_requestUrlAuth;
        this.f40590g = f3Var;
        this.f40587c = z10;
        this.f40586b = str;
        this.f40591i = urlAuthResult;
        this.f40592j = strArr;
        this.d = z11;
        this.f40593k = z0Var;
        this.h = str2;
        this.f40594l = c6Var;
    }
}
