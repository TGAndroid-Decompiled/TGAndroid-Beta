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
public final class hl0 implements Utilities.Callback {
    public final int f33407a = 1;
    public final String f33408b;
    public final boolean f33409c;
    public final boolean d;
    public final Object e;
    public final Object f33410f;
    public final Object f33411g;
    public final Serializable h;
    public final Object f33412i;
    public final Object f33413j;
    public final Object f33414k;
    public final Object f33415l;

    public hl0(l71 l71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = l71Var;
        this.f33408b = str;
        this.f33409c = z10;
        this.f33410f = arrayList;
        this.f33411g = hashMap;
        this.h = arrayList2;
        this.f33412i = linkedHashSet;
        this.f33413j = linkedHashSet2;
        this.f33414k = arrayList3;
        this.f33415l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33407a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f33410f;
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f33411g;
                final boolean z10 = this.f33409c;
                final String str = this.f33408b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f33412i;
                final String[] strArr = (String[]) this.f33413j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f33414k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f33415l;
                final Integer num = (Integer) obj;
                if (((int[]) this.e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
                    d2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.d2.this.dismiss();
                            org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                            if (urlAuthResult2 != null) {
                                h3Var2.dismiss();
                                kl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, c1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    h3Var2.dismiss();
                                    org.telegram.ui.Components.wc a2 = kl0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                org.telegram.ui.Cells.r6.q(h3Var2.topBulletinContainer, h3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final l71 l71Var = (l71) this.e;
                final String str3 = this.f33408b;
                final boolean z12 = this.f33409c;
                final ArrayList arrayList = (ArrayList) this.f33410f;
                final HashMap hashMap = (HashMap) this.f33411g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f33412i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f33413j;
                final ArrayList arrayList3 = (ArrayList) this.f33414k;
                final ArrayList arrayList4 = (ArrayList) this.f33415l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        l71 l71Var2 = l71.this;
                        p51 p51Var = l71Var2.I1;
                        if (p51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(p51Var);
                            l71Var2.I1 = null;
                        }
                        String str4 = l71Var2.f34611z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        l71Var2.f34609y1 = true;
                        l71Var2.z(true, z12);
                        c61 c61Var = l71Var2.f34566f0;
                        if (c61Var != null) {
                            c61Var.d(true);
                        }
                        ArrayList arrayList5 = l71Var2.A1;
                        if (arrayList5 == null) {
                            l71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = l71Var2.D1;
                        if (arrayList6 == null) {
                            l71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = l71Var2.C1;
                        if (arrayList7 == null) {
                            l71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = l71Var2.B1;
                        if (arrayList8 == null) {
                            l71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        l71Var2.f34572i0.u0(0);
                        int i11 = l71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                l71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    l71Var2.A1.add(yg.p0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                l71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = l71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f47102g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            l71Var2.A1.add(yg.p0.b((String) it2.next()));
                        }
                        l71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            l71Var2.C1.addAll((ArrayList) obj3);
                        }
                        l71Var2.f34587q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public hl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.h3 h3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.c1 c1Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = iArr;
        this.f33410f = tL_messages_requestUrlAuth;
        this.f33411g = h3Var;
        this.f33409c = z10;
        this.f33408b = str;
        this.f33412i = urlAuthResult;
        this.f33413j = strArr;
        this.d = z11;
        this.f33414k = c1Var;
        this.h = str2;
        this.f33415l = f6Var;
    }
}
