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
public final class fl0 implements Utilities.Callback {
    public final int f33607a = 1;
    public final String f33608b;
    public final boolean f33609c;
    public final boolean d;
    public final Object e;
    public final Object f33610f;
    public final Object f33611g;
    public final Serializable h;
    public final Object f33612i;
    public final Object f33613j;
    public final Object f33614k;
    public final Object f33615l;

    public fl0(g71 g71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = g71Var;
        this.f33608b = str;
        this.f33609c = z10;
        this.f33610f = arrayList;
        this.f33611g = hashMap;
        this.h = arrayList2;
        this.f33612i = linkedHashSet;
        this.f33613j = linkedHashSet2;
        this.f33614k = arrayList3;
        this.f33615l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33607a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f33610f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f33611g;
                final boolean z10 = this.f33609c;
                final String str = this.f33608b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f33612i;
                final String[] strArr = (String[]) this.f33613j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f33614k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f33615l;
                final Integer num = (Integer) obj;
                if (((int[]) this.e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
                    b2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.b2.this.dismiss();
                            org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                            if (urlAuthResult2 != null) {
                                f3Var2.dismiss();
                                il0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, d1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    f3Var2.dismiss();
                                    org.telegram.ui.Components.vc a2 = il0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, e6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                org.telegram.ui.Cells.p6.q(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final g71 g71Var = (g71) this.e;
                final String str3 = this.f33608b;
                final boolean z12 = this.f33609c;
                final ArrayList arrayList = (ArrayList) this.f33610f;
                final HashMap hashMap = (HashMap) this.f33611g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f33612i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f33613j;
                final ArrayList arrayList3 = (ArrayList) this.f33614k;
                final ArrayList arrayList4 = (ArrayList) this.f33615l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        g71 g71Var2 = g71.this;
                        j51 j51Var = g71Var2.I1;
                        if (j51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(j51Var);
                            g71Var2.I1 = null;
                        }
                        String str4 = g71Var2.f33837z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        g71Var2.f33835y1 = true;
                        g71Var2.z(true, z12);
                        x51 x51Var = g71Var2.f33792f0;
                        if (x51Var != null) {
                            x51Var.d(true);
                        }
                        ArrayList arrayList5 = g71Var2.A1;
                        if (arrayList5 == null) {
                            g71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = g71Var2.D1;
                        if (arrayList6 == null) {
                            g71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = g71Var2.C1;
                        if (arrayList7 == null) {
                            g71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = g71Var2.B1;
                        if (arrayList8 == null) {
                            g71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        g71Var2.f33798i0.u0(0);
                        int i11 = g71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                g71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    g71Var2.A1.add(zg.p0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                g71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = g71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f49128g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            g71Var2.A1.add(zg.p0.b((String) it2.next()));
                        }
                        g71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            g71Var2.C1.addAll((ArrayList) obj3);
                        }
                        g71Var2.f33813q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public fl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.d1 d1Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = iArr;
        this.f33610f = tL_messages_requestUrlAuth;
        this.f33611g = f3Var;
        this.f33609c = z10;
        this.f33608b = str;
        this.f33612i = urlAuthResult;
        this.f33613j = strArr;
        this.d = z11;
        this.f33614k = d1Var;
        this.h = str2;
        this.f33615l = e6Var;
    }
}
