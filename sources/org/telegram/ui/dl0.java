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
public final class dl0 implements Utilities.Callback {
    public final int f35796a = 1;
    public final String f35797b;
    public final boolean f35798c;
    public final boolean d;
    public final Object f35799e;
    public final Object f35800f;
    public final Object f35801g;
    public final Serializable h;
    public final Object f35802i;
    public final Object f35803j;
    public final Object f35804k;
    public final Object f35805l;

    public dl0(c71 c71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.f35799e = c71Var;
        this.f35797b = str;
        this.f35798c = z10;
        this.f35800f = arrayList;
        this.f35801g = hashMap;
        this.h = arrayList2;
        this.f35802i = linkedHashSet;
        this.f35803j = linkedHashSet2;
        this.f35804k = arrayList3;
        this.f35805l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35796a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f35800f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f35801g;
                final boolean z10 = this.f35798c;
                final String str = this.f35797b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f35802i;
                final String[] strArr = (String[]) this.f35803j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f35804k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f35805l;
                final Integer num = (Integer) obj;
                if (((int[]) this.f35799e)[0] != num.intValue()) {
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
                                gl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, c1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    f3Var2.dismiss();
                                    org.telegram.ui.Components.yc a2 = gl0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, d6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                org.telegram.ui.Cells.c1.r(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final c71 c71Var = (c71) this.f35799e;
                final String str3 = this.f35797b;
                final boolean z12 = this.f35798c;
                final ArrayList arrayList = (ArrayList) this.f35800f;
                final HashMap hashMap = (HashMap) this.f35801g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f35802i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f35803j;
                final ArrayList arrayList3 = (ArrayList) this.f35804k;
                final ArrayList arrayList4 = (ArrayList) this.f35805l;
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
                        String str4 = c71Var2.f35356z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        c71Var2.f35354y1 = true;
                        c71Var2.z(true, z12);
                        t51 t51Var = c71Var2.f35311f0;
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
                        c71Var2.f35317i0.v0(0);
                        int i11 = c71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                c71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    c71Var2.A1.add(zg.o0.c(tL_availableReaction));
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
                            obj2.f53481g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            c71Var2.A1.add(zg.o0.b((String) it2.next()));
                        }
                        c71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            c71Var2.C1.addAll((ArrayList) obj3);
                        }
                        c71Var2.f35332q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public dl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.c1 c1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f35799e = iArr;
        this.f35800f = tL_messages_requestUrlAuth;
        this.f35801g = f3Var;
        this.f35798c = z10;
        this.f35797b = str;
        this.f35802i = urlAuthResult;
        this.f35803j = strArr;
        this.d = z11;
        this.f35804k = c1Var;
        this.h = str2;
        this.f35805l = d6Var;
    }
}
