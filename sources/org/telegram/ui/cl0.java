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
public final class cl0 implements Utilities.Callback {
    public final int f32746a = 1;
    public final String f32747b;
    public final boolean f32748c;
    public final boolean d;
    public final Object e;
    public final Object f32749f;
    public final Object f32750g;
    public final Serializable h;
    public final Object f32751i;
    public final Object f32752j;
    public final Object f32753k;
    public final Object f32754l;

    public cl0(c71 c71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = c71Var;
        this.f32747b = str;
        this.f32748c = z10;
        this.f32749f = arrayList;
        this.f32750g = hashMap;
        this.h = arrayList2;
        this.f32751i = linkedHashSet;
        this.f32752j = linkedHashSet2;
        this.f32753k = arrayList3;
        this.f32754l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32746a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f32749f;
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f32750g;
                final boolean z10 = this.f32748c;
                final String str = this.f32747b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f32751i;
                final String[] strArr = (String[]) this.f32752j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f32753k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f32754l;
                final Integer num = (Integer) obj;
                if (((int[]) this.e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
                    c2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.c2.this.dismiss();
                            org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                            if (urlAuthResult2 != null) {
                                g3Var2.dismiss();
                                fl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, c1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    g3Var2.dismiss();
                                    org.telegram.ui.Components.xc a2 = fl0.a();
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
                                org.telegram.ui.Cells.c1.s(g3Var2.topBulletinContainer, g3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final c71 c71Var = (c71) this.e;
                final String str3 = this.f32747b;
                final boolean z12 = this.f32748c;
                final ArrayList arrayList = (ArrayList) this.f32749f;
                final HashMap hashMap = (HashMap) this.f32750g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f32751i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f32752j;
                final ArrayList arrayList3 = (ArrayList) this.f32753k;
                final ArrayList arrayList4 = (ArrayList) this.f32754l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        c71 c71Var2 = c71.this;
                        g51 g51Var = c71Var2.I1;
                        if (g51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(g51Var);
                            c71Var2.I1 = null;
                        }
                        String str4 = c71Var2.f32626z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        c71Var2.f32624y1 = true;
                        c71Var2.z(true, z12);
                        t51 t51Var = c71Var2.f32581f0;
                        if (t51Var != null) {
                            t51Var.d(true);
                        }
                        ArrayList arrayList5 = c71Var2.A1;
                        if (arrayList5 == null) {
                            c71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = c71Var2.D1;
                        if (arrayList6 == null) {
                            c71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = c71Var2.C1;
                        if (arrayList7 == null) {
                            c71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = c71Var2.B1;
                        if (arrayList8 == null) {
                            c71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        c71Var2.f32587i0.v0(0);
                        int i11 = c71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                c71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    c71Var2.A1.add(zg.p0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                c71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = c71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f49445g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            c71Var2.A1.add(zg.p0.b((String) it2.next()));
                        }
                        c71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            c71Var2.C1.addAll((ArrayList) obj3);
                        }
                        c71Var2.f32602q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public cl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.g3 g3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.c1 c1Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = iArr;
        this.f32749f = tL_messages_requestUrlAuth;
        this.f32750g = g3Var;
        this.f32748c = z10;
        this.f32747b = str;
        this.f32751i = urlAuthResult;
        this.f32752j = strArr;
        this.d = z11;
        this.f32753k = c1Var;
        this.h = str2;
        this.f32754l = e6Var;
    }
}
