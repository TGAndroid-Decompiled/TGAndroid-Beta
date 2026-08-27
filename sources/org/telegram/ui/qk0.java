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

public final class qk0 implements Utilities.Callback {

    public final int f41688a = 1;

    public final String f41689b;

    public final boolean f41690c;
    public final boolean d;

    public final Object f41691e;

    public final Object f41692f;

    public final Object f41693g;
    public final Serializable h;

    public final Object f41694i;

    public final Object f41695j;

    public final Object f41696k;

    public final Object f41697l;

    public qk0(a61 a61Var, String str, boolean z10, ArrayList arrayList, HashMap map, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.f41691e = a61Var;
        this.f41689b = str;
        this.f41690c = z10;
        this.f41692f = arrayList;
        this.f41693g = map;
        this.h = arrayList2;
        this.f41694i = linkedHashSet;
        this.f41695j = linkedHashSet2;
        this.f41696k = arrayList3;
        this.f41697l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41688a) {
            case 0:
                int[] iArr = (int[]) this.f41691e;
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f41692f;
                final org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f41693g;
                final boolean z10 = this.f41690c;
                final String str = this.f41689b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f41694i;
                final String[] strArr = (String[]) this.f41695j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f41696k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f41697l;
                final Integer num = (Integer) obj;
                if (iArr[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
                    b2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            b2Var.dismiss();
                            org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                            if (urlAuthResult2 != null) {
                                e3Var2.dismiss();
                                tk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, z0Var);
                                return;
                            }
                            if (tL_error != null) {
                                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.ui.Cells.pa.t(e3Var2.topBulletinContainer, e3Var2.getResourcesProvider(), tL_error, false);
                                    return;
                                }
                                e3Var2.dismiss();
                                org.telegram.ui.Components.mc mcVarA = tk0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str3 = str2;
                                mcVarA.M(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), i10).j();
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                final a61 a61Var = (a61) this.f41691e;
                final String str3 = this.f41689b;
                final boolean z12 = this.f41690c;
                final ArrayList arrayList = (ArrayList) this.f41692f;
                final HashMap map = (HashMap) this.f41693g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f41694i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f41695j;
                final ArrayList arrayList3 = (ArrayList) this.f41696k;
                final ArrayList arrayList4 = (ArrayList) this.f41697l;
                final boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        a61 a61Var2 = a61Var;
                        e41 e41Var = a61Var2.E1;
                        if (e41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(e41Var);
                            a61Var2.E1 = null;
                        }
                        String str4 = a61Var2.f36432v1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        a61Var2.f36430u1 = true;
                        a61Var2.z(true, z12);
                        r41 r41Var = a61Var2.f36387b0;
                        if (r41Var != null) {
                            r41Var.e(true);
                        }
                        ArrayList arrayList5 = a61Var2.f36435w1;
                        if (arrayList5 == null) {
                            a61Var2.f36435w1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = a61Var2.f36443z1;
                        if (arrayList6 == null) {
                            a61Var2.f36443z1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = a61Var2.f36441y1;
                        if (arrayList7 == null) {
                            a61Var2.f36441y1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = a61Var2.f36438x1;
                        if (arrayList8 == null) {
                            a61Var2.f36438x1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        a61Var2.f36395e0.u0(0);
                        int i11 = a61Var2.S;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (arrayList9.isEmpty()) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) map.get(str5);
                                if (tL_availableReaction != null) {
                                    a61Var2.f36435w1.add(ig.q0.c(tL_availableReaction));
                                }
                            } else {
                                a61Var2.f36435w1.addAll(arrayList9);
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                a61Var2.f36438x1.addAll(arrayList10);
                            }
                        }
                        for (Long l10 : linkedHashSet) {
                            l10.getClass();
                            ArrayList arrayList11 = a61Var2.f36435w1;
                            ig.q0 q0Var = new ig.q0();
                            long jLongValue = l10.longValue();
                            q0Var.f11413g = jLongValue;
                            q0Var.h = jLongValue;
                            arrayList11.add(q0Var);
                        }
                        Iterator it = linkedHashSet2.iterator();
                        while (it.hasNext()) {
                            a61Var2.f36435w1.add(ig.q0.b((String) it.next()));
                        }
                        a61Var2.f36443z1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj2 = arrayList12.get(i10);
                            i10++;
                            a61Var2.f36441y1.addAll((ArrayList) obj2);
                        }
                        a61Var2.m0.E(true ^ z13);
                    }
                });
                break;
        }
    }

    public qk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.z0 z0Var, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41691e = iArr;
        this.f41692f = tL_messages_requestUrlAuth;
        this.f41693g = e3Var;
        this.f41690c = z10;
        this.f41689b = str;
        this.f41694i = urlAuthResult;
        this.f41695j = strArr;
        this.d = z11;
        this.f41696k = z0Var;
        this.h = str2;
        this.f41697l = c6Var;
    }
}
