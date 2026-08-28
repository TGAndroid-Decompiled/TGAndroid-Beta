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
    public final int f41817a = 1;
    public final String f41818b;
    public final boolean f41819c;
    public final boolean d;
    public final Object f41820e;
    public final Object f41821f;
    public final Object f41822g;
    public final Serializable h;
    public final Object f41823i;
    public final Object f41824j;
    public final Object f41825k;
    public final Object f41826l;

    public qk0(b61 b61Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.f41820e = b61Var;
        this.f41818b = str;
        this.f41819c = z10;
        this.f41821f = arrayList;
        this.f41822g = hashMap;
        this.h = arrayList2;
        this.f41823i = linkedHashSet;
        this.f41824j = linkedHashSet2;
        this.f41825k = arrayList3;
        this.f41826l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41817a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f41821f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f41822g;
                final boolean z10 = this.f41819c;
                final String str = this.f41818b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f41823i;
                final String[] strArr = (String[]) this.f41824j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f41825k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f41826l;
                final Integer num = (Integer) obj;
                if (((int[]) this.f41820e)[0] != num.intValue()) {
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
                                tk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, y0Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    f3Var2.dismiss();
                                    org.telegram.ui.Components.oc a2 = tk0.a();
                                    int i9 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i9).j();
                                    return;
                                }
                                org.telegram.ui.Cells.j2.s(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final b61 b61Var = (b61) this.f41820e;
                final String str3 = this.f41818b;
                final boolean z12 = this.f41819c;
                final ArrayList arrayList = (ArrayList) this.f41821f;
                final HashMap hashMap = (HashMap) this.f41822g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f41823i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f41824j;
                final ArrayList arrayList3 = (ArrayList) this.f41825k;
                final ArrayList arrayList4 = (ArrayList) this.f41826l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        b61 b61Var2 = b61.this;
                        f41 f41Var = b61Var2.E1;
                        if (f41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(f41Var);
                            b61Var2.E1 = null;
                        }
                        String str4 = b61Var2.f36709v1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        b61Var2.f36707u1 = true;
                        b61Var2.z(true, z12);
                        s41 s41Var = b61Var2.f36664b0;
                        if (s41Var != null) {
                            s41Var.e(true);
                        }
                        ArrayList arrayList5 = b61Var2.f36712w1;
                        if (arrayList5 == null) {
                            b61Var2.f36712w1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = b61Var2.f36720z1;
                        if (arrayList6 == null) {
                            b61Var2.f36720z1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = b61Var2.f36718y1;
                        if (arrayList7 == null) {
                            b61Var2.f36718y1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = b61Var2.f36715x1;
                        if (arrayList8 == null) {
                            b61Var2.f36715x1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i9 = 0;
                        b61Var2.f36672e0.u0(0);
                        int i10 = b61Var2.S;
                        if (i10 == 1 || i10 == 14 || i10 == 11 || i10 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                b61Var2.f36712w1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    b61Var2.f36712w1.add(hg.r0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                b61Var2.f36715x1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            ArrayList arrayList11 = b61Var2.f36712w1;
                            ?? obj2 = new Object();
                            long longValue = l10.longValue();
                            obj2.f10718g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            b61Var2.f36712w1.add(hg.r0.b((String) it2.next()));
                        }
                        b61Var2.f36720z1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i9 < size) {
                            Object obj3 = arrayList12.get(i9);
                            i9++;
                            b61Var2.f36718y1.addAll((ArrayList) obj3);
                        }
                        b61Var2.m0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public qk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.y0 y0Var, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f41820e = iArr;
        this.f41821f = tL_messages_requestUrlAuth;
        this.f41822g = f3Var;
        this.f41819c = z10;
        this.f41818b = str;
        this.f41823i = urlAuthResult;
        this.f41824j = strArr;
        this.d = z11;
        this.f41825k = y0Var;
        this.h = str2;
        this.f41826l = b6Var;
    }
}
