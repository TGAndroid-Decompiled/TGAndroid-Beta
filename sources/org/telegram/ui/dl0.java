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
    public final int f35840a = 1;
    public final String f35841b;
    public final boolean f35842c;
    public final boolean d;
    public final Object f35843e;
    public final Object f35844f;
    public final Object f35845g;
    public final Serializable h;
    public final Object f35846i;
    public final Object f35847j;
    public final Object f35848k;
    public final Object f35849l;

    public dl0(a71 a71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.f35843e = a71Var;
        this.f35841b = str;
        this.f35842c = z10;
        this.f35844f = arrayList;
        this.f35845g = hashMap;
        this.h = arrayList2;
        this.f35846i = linkedHashSet;
        this.f35847j = linkedHashSet2;
        this.f35848k = arrayList3;
        this.f35849l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35840a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f35844f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f35845g;
                final boolean z10 = this.f35842c;
                final String str = this.f35841b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f35846i;
                final String[] strArr = (String[]) this.f35847j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f35848k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f35849l;
                final Integer num = (Integer) obj;
                if (((int[]) this.f35843e)[0] != num.intValue()) {
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
                final a71 a71Var = (a71) this.f35843e;
                final String str3 = this.f35841b;
                final boolean z12 = this.f35842c;
                final ArrayList arrayList = (ArrayList) this.f35844f;
                final HashMap hashMap = (HashMap) this.f35845g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f35846i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f35847j;
                final ArrayList arrayList3 = (ArrayList) this.f35848k;
                final ArrayList arrayList4 = (ArrayList) this.f35849l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        a71 a71Var2 = a71.this;
                        e51 e51Var = a71Var2.I1;
                        if (e51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(e51Var);
                            a71Var2.I1 = null;
                        }
                        String str4 = a71Var2.f34780z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        a71Var2.f34778y1 = true;
                        a71Var2.z(true, z12);
                        r51 r51Var = a71Var2.f34735f0;
                        if (r51Var != null) {
                            r51Var.d(true);
                        }
                        ArrayList arrayList5 = a71Var2.A1;
                        if (arrayList5 == null) {
                            a71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = a71Var2.D1;
                        if (arrayList6 == null) {
                            a71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = a71Var2.C1;
                        if (arrayList7 == null) {
                            a71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = a71Var2.B1;
                        if (arrayList8 == null) {
                            a71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        a71Var2.f34741i0.v0(0);
                        int i11 = a71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                a71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    a71Var2.A1.add(zg.m0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                a71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = a71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f53472g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            a71Var2.A1.add(zg.m0.b((String) it2.next()));
                        }
                        a71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            a71Var2.C1.addAll((ArrayList) obj3);
                        }
                        a71Var2.f34756q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public dl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.c1 c1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f35843e = iArr;
        this.f35844f = tL_messages_requestUrlAuth;
        this.f35845g = f3Var;
        this.f35842c = z10;
        this.f35841b = str;
        this.f35846i = urlAuthResult;
        this.f35847j = strArr;
        this.d = z11;
        this.f35848k = c1Var;
        this.h = str2;
        this.f35849l = d6Var;
    }
}
