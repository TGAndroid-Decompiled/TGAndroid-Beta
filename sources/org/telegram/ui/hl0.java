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
    public final int f34293a = 1;
    public final String f34294b;
    public final boolean f34295c;
    public final boolean d;
    public final Object e;
    public final Object f34296f;
    public final Object f34297g;
    public final Serializable h;
    public final Object f34298i;
    public final Object f34299j;
    public final Object f34300k;
    public final Object f34301l;

    public hl0(i71 i71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = i71Var;
        this.f34294b = str;
        this.f34295c = z10;
        this.f34296f = arrayList;
        this.f34297g = hashMap;
        this.h = arrayList2;
        this.f34298i = linkedHashSet;
        this.f34299j = linkedHashSet2;
        this.f34300k = arrayList3;
        this.f34301l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34293a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f34296f;
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f34297g;
                final boolean z10 = this.f34295c;
                final String str = this.f34294b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f34298i;
                final String[] strArr = (String[]) this.f34299j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f34300k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f34301l;
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
                                kl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, d1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    g3Var2.dismiss();
                                    org.telegram.ui.Components.vc a2 = kl0.a();
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
                                org.telegram.ui.Cells.p6.q(g3Var2.topBulletinContainer, g3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final i71 i71Var = (i71) this.e;
                final String str3 = this.f34294b;
                final boolean z12 = this.f34295c;
                final ArrayList arrayList = (ArrayList) this.f34296f;
                final HashMap hashMap = (HashMap) this.f34297g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f34298i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f34299j;
                final ArrayList arrayList3 = (ArrayList) this.f34300k;
                final ArrayList arrayList4 = (ArrayList) this.f34301l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        i71 i71Var2 = i71.this;
                        m51 m51Var = i71Var2.I1;
                        if (m51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(m51Var);
                            i71Var2.I1 = null;
                        }
                        String str4 = i71Var2.f34502z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        i71Var2.f34500y1 = true;
                        i71Var2.z(true, z12);
                        z51 z51Var = i71Var2.f34457f0;
                        if (z51Var != null) {
                            z51Var.d(true);
                        }
                        ArrayList arrayList5 = i71Var2.A1;
                        if (arrayList5 == null) {
                            i71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = i71Var2.D1;
                        if (arrayList6 == null) {
                            i71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = i71Var2.C1;
                        if (arrayList7 == null) {
                            i71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = i71Var2.B1;
                        if (arrayList8 == null) {
                            i71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        i71Var2.f34463i0.v0(0);
                        int i11 = i71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                i71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    i71Var2.A1.add(zg.p0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                i71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = i71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f49151g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            i71Var2.A1.add(zg.p0.b((String) it2.next()));
                        }
                        i71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            i71Var2.C1.addAll((ArrayList) obj3);
                        }
                        i71Var2.f34478q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public hl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.g3 g3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.d1 d1Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = iArr;
        this.f34296f = tL_messages_requestUrlAuth;
        this.f34297g = g3Var;
        this.f34295c = z10;
        this.f34294b = str;
        this.f34298i = urlAuthResult;
        this.f34299j = strArr;
        this.d = z11;
        this.f34300k = d1Var;
        this.h = str2;
        this.f34301l = f6Var;
    }
}
