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
public final class il0 implements Utilities.Callback {
    public final int f37419a = 1;
    public final String f37420b;
    public final boolean f37421c;
    public final boolean d;
    public final Object f37422e;
    public final Object f37423f;
    public final Object f37424g;
    public final Serializable h;
    public final Object f37425i;
    public final Object f37426j;
    public final Object f37427k;
    public final Object f37428l;

    public il0(j71 j71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.f37422e = j71Var;
        this.f37420b = str;
        this.f37421c = z10;
        this.f37423f = arrayList;
        this.f37424g = hashMap;
        this.h = arrayList2;
        this.f37425i = linkedHashSet;
        this.f37426j = linkedHashSet2;
        this.f37427k = arrayList3;
        this.f37428l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37419a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f37423f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f37424g;
                final boolean z10 = this.f37421c;
                final String str = this.f37420b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f37425i;
                final String[] strArr = (String[]) this.f37426j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f37427k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f37428l;
                final Integer num = (Integer) obj;
                if (((int[]) this.f37422e)[0] != num.intValue()) {
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
                                ll0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, d1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    f3Var2.dismiss();
                                    org.telegram.ui.Components.yc a2 = ll0.a();
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
                                org.telegram.ui.Cells.p6.q(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final j71 j71Var = (j71) this.f37422e;
                final String str3 = this.f37420b;
                final boolean z12 = this.f37421c;
                final ArrayList arrayList = (ArrayList) this.f37423f;
                final HashMap hashMap = (HashMap) this.f37424g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f37425i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f37426j;
                final ArrayList arrayList3 = (ArrayList) this.f37427k;
                final ArrayList arrayList4 = (ArrayList) this.f37428l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        j71 j71Var2 = j71.this;
                        m51 m51Var = j71Var2.I1;
                        if (m51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(m51Var);
                            j71Var2.I1 = null;
                        }
                        String str4 = j71Var2.f37714z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        j71Var2.f37712y1 = true;
                        j71Var2.z(true, z12);
                        a61 a61Var = j71Var2.f37669f0;
                        if (a61Var != null) {
                            a61Var.e(true);
                        }
                        ArrayList arrayList5 = j71Var2.A1;
                        if (arrayList5 == null) {
                            j71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = j71Var2.D1;
                        if (arrayList6 == null) {
                            j71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = j71Var2.C1;
                        if (arrayList7 == null) {
                            j71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = j71Var2.B1;
                        if (arrayList8 == null) {
                            j71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        j71Var2.f37675i0.u0(0);
                        int i11 = j71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                j71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    j71Var2.A1.add(ah.j1.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                j71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = j71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f610g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            j71Var2.A1.add(ah.j1.b((String) it2.next()));
                        }
                        j71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            j71Var2.C1.addAll((ArrayList) obj3);
                        }
                        j71Var2.f37690q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public il0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.d1 d1Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f37422e = iArr;
        this.f37423f = tL_messages_requestUrlAuth;
        this.f37424g = f3Var;
        this.f37421c = z10;
        this.f37420b = str;
        this.f37425i = urlAuthResult;
        this.f37426j = strArr;
        this.d = z11;
        this.f37427k = d1Var;
        this.h = str2;
        this.f37428l = f6Var;
    }
}
