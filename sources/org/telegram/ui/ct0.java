package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ct0 extends org.telegram.ui.ActionBar.j {
    public final int f46214a;
    public final Object f46215b;

    public ct0(Object obj, int i7) {
        this.f46214a = i7;
        this.f46215b = obj;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int intValue;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i11 = this.f46214a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.f46215b;
        switch (i11) {
            case 0:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i7 == -1) {
                    if (privacyControlActivity.G0(true)) {
                        privacyControlActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    privacyControlActivity.K0();
                    return;
                } else {
                    return;
                }
            case 1:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i7 == -1) {
                    ((pt0) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 != -1) {
                    kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i7);
                        return;
                    }
                    return;
                }
                uv0 uv0Var = profileActivity.O;
                if (uv0Var == null || !uv0Var.V(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f43102f1);
                        bundle.putLong("user_id", profileActivity.f43094e1);
                        profileActivity.presentFragment(new ci.i0(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 4:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                tx0 tx0Var = (tx0) obj;
                boolean z11 = tx0Var.J;
                org.telegram.messenger.fz fzVar = tx0Var.K;
                if (i7 == -1) {
                    tx0Var.finishFragment();
                    return;
                } else if (i7 == 1 && tx0Var.getParentActivity() != null) {
                    n2.o0 a10 = xi.a.a();
                    a10.q(tx0Var.f51694w);
                    String obj2 = tx0Var.f51686a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f20831c = obj2;
                    if (tx0Var.f51694w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(tx0Var.f51686a[1].getText().toString()).intValue();
                    }
                    a10.f20830b = intValue;
                    if (tx0Var.f51694w != 1) {
                        str = "";
                    } else {
                        str = tx0Var.f51686a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (tx0Var.f51694w != 1) {
                        str2 = "";
                    } else {
                        str2 = tx0Var.f51686a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f20832e = str2;
                    if (tx0Var.f51694w == 1) {
                        str3 = "";
                    } else {
                        str3 = tx0Var.f51686a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f20833f = str5;
                    fzVar.f23577a = a10.d();
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
                    SharedPreferences.Editor edit = e12.edit();
                    if (z11) {
                        org.telegram.messenger.gz.a(fzVar);
                        org.telegram.messenger.gz.B1 = fzVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z10 = e12.getBoolean("proxy_enabled", false);
                        org.telegram.messenger.gz.z();
                    }
                    if (z11 || org.telegram.messenger.gz.B1 == fzVar) {
                        fzVar.f23577a.i(edit);
                        ConnectionsManager.setProxySettings(z10, fzVar.f23577a);
                    }
                    edit.commit();
                    org.telegram.messenger.ns.e().k(277, new Object[0]);
                    tx0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i7 == -1) {
                    ((zx0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i7 == -1) {
                    ((oy0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i7 == -1) {
                    ((vy0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 11:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                k31 k31Var = (k31) obj;
                if (i7 == -1) {
                    if (k31Var.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", k31Var.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        k31Var.presentFragment(new ci.i0(bundle2));
                        return;
                    }
                    k31Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    k31Var.k0(new org.telegram.ui.ActionBar.e2(null));
                    return;
                } else {
                    return;
                }
            case 13:
                if (i7 == -1) {
                    ((z41) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i7 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.i0(stickersActivity, i7);
                return;
            case 15:
                w71 w71Var = (w71) obj;
                if (i7 == -1) {
                    w71Var.finishFragment();
                    return;
                } else if (i7 == 1) {
                    w71.d0(w71Var);
                    return;
                } else {
                    return;
                }
            case 16:
                if (i7 == -1) {
                    ((l81) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
                    ((aa1) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i7 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y >= 0) {
                        twoStepVerificationActivity.C0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 19:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i7 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    userInfoActivity.h0(true);
                    return;
                } else {
                    return;
                }
            case 20:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i7 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i7 == 1) {
                    usersSelectActivity.c0();
                    return;
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Wallet.p9 p9Var = (org.telegram.ui.Wallet.p9) obj;
                if (i7 == -1) {
                    p9Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity = p9Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.e2) p9Var).currentAccount;
                    org.telegram.ui.Wallet.y5.J0(i10, parentActivity, p9Var.getResourceProvider());
                    return;
                } else if (i7 == 3) {
                    p9Var.u0();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.f52712y;
                if (i7 == -1) {
                    if (org.telegram.ui.web.m.e0(mVar).x()) {
                        org.telegram.ui.web.m.f0(mVar).w();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(mVar.f38880a, new fi.e(28));
                        return;
                    }
                    mVar.finishFragment();
                    return;
                } else if (i7 == 2131296494) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue2 = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = mVar.f52705e.f52629a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj3 = arrayList2.get(i12);
                                i12++;
                                gjVar = (org.telegram.messenger.gj) obj3;
                                if (gjVar == null || gjVar.e1() != intValue2) {
                                }
                            } else {
                                gjVar = null;
                            }
                        }
                        org.telegram.ui.web.i iVar = mVar.f52706f;
                        if (iVar != null && gjVar == null) {
                            ArrayList arrayList3 = iVar.f52629a;
                            int size2 = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj4 = arrayList3.get(i13);
                                    i13++;
                                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj4;
                                    if (gjVar2 != null && gjVar2.e1() == intValue2) {
                                        gjVar = gjVar2;
                                    }
                                }
                            }
                        }
                        if (gjVar != null) {
                            arrayList.add(gjVar);
                            hashSet3.add(Integer.valueOf(gjVar.e1()));
                            hashSet2.add(org.telegram.ui.web.k.a(gjVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                    String G = org.telegram.messenger.hd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    t1Var.U = org.telegram.messenger.hd.N0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.Wallet.k8(3, mVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i7 == 2131296498) {
                    mVar.i0();
                    return;
                } else {
                    return;
                }
            case 23:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (i7 == -1) {
                    kVar3 = ((org.telegram.ui.ActionBar.e2) x0Var).actionBar;
                    if (kVar3.x()) {
                        kVar4 = ((org.telegram.ui.ActionBar.e2) x0Var).actionBar;
                        kVar4.w();
                        x0Var.f52873w.clear();
                        org.telegram.messenger.g0.d0(x0Var.f38880a, new fi.e(29));
                        return;
                    }
                    x0Var.finishFragment();
                    return;
                }
                return;
            default:
                if (i7 == -1) {
                    ((ug.x0) obj).dismiss();
                    return;
                }
                return;
        }
    }
}
