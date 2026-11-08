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
public final class nt0 extends org.telegram.ui.ActionBar.j {
    public final int f48133a;
    public final Object f48134b;

    public nt0(Object obj, int i7) {
        this.f48133a = i7;
        this.f48134b = obj;
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
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int i11 = this.f48133a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z9 = true;
        Object obj = this.f48134b;
        switch (i11) {
            case 0:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i7 == -1) {
                    ((st0) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 != -1) {
                    kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i7);
                        return;
                    }
                    return;
                }
                vv0 vv0Var = profileActivity.N;
                if (vv0Var == null || !vv0Var.V(true)) {
                    if (profileActivity.I0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f41723e1);
                        bundle.putLong("user_id", profileActivity.f41716d1);
                        profileActivity.presentFragment(new ai.s0(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 3:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                ux0 ux0Var = (ux0) obj;
                boolean z10 = ux0Var.I;
                org.telegram.messenger.hz hzVar = ux0Var.J;
                if (i7 == -1) {
                    ux0Var.finishFragment();
                    return;
                } else if (i7 == 1 && ux0Var.getParentActivity() != null) {
                    n2.n0 a10 = ui.a.a();
                    a10.p(ux0Var.f50449w);
                    String obj2 = ux0Var.f50441a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f20256c = obj2;
                    if (ux0Var.f50449w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(ux0Var.f50441a[1].getText().toString()).intValue();
                    }
                    a10.f20255b = intValue;
                    if (ux0Var.f50449w != 1) {
                        str = "";
                    } else {
                        str = ux0Var.f50441a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (ux0Var.f50449w != 1) {
                        str2 = "";
                    } else {
                        str2 = ux0Var.f50441a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f20257e = str2;
                    if (ux0Var.f50449w == 1) {
                        str3 = "";
                    } else {
                        str3 = ux0Var.f50441a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f20258f = str5;
                    hzVar.f22994a = a10.d();
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    SharedPreferences.Editor edit = e12.edit();
                    if (z10) {
                        org.telegram.messenger.iz.a(hzVar);
                        org.telegram.messenger.iz.B1 = hzVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z9 = e12.getBoolean("proxy_enabled", false);
                        org.telegram.messenger.iz.z();
                    }
                    if (z10 || org.telegram.messenger.iz.B1 == hzVar) {
                        hzVar.f22994a.i(edit);
                        ConnectionsManager.setProxySettings(z9, hzVar.f22994a);
                    }
                    edit.commit();
                    org.telegram.messenger.qs.e().k(277, new Object[0]);
                    ux0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 5:
                if (i7 == -1) {
                    ((ay0) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i7 == -1) {
                    ((qy0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i7 == -1) {
                    ((xy0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 10:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                m31 m31Var = (m31) obj;
                if (i7 == -1) {
                    if (m31Var.N) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", m31Var.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        m31Var.presentFragment(new ai.s0(bundle2));
                        return;
                    }
                    m31Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    m31Var.k0(new org.telegram.ui.ActionBar.f2(null));
                    return;
                } else {
                    return;
                }
            case 12:
                if (i7 == -1) {
                    ((c51) obj).finishFragment();
                    return;
                }
                return;
            case 13:
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
            case 14:
                y71 y71Var = (y71) obj;
                if (i7 == -1) {
                    y71Var.finishFragment();
                    return;
                } else if (i7 == 1) {
                    y71.d0(y71Var);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i7 == -1) {
                    ((n81) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i7 == -1) {
                    ((ca1) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.C0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 18:
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
            case 19:
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
            case 20:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) obj;
                if (i7 == -1) {
                    m9Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity = m9Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) m9Var).currentAccount;
                    org.telegram.ui.Wallet.x5.J0(i10, parentActivity, m9Var.getResourceProvider());
                    return;
                } else if (i7 == 3) {
                    m9Var.u0();
                    return;
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                HashSet hashSet = lVar.f51229y;
                if (i7 == -1) {
                    kVar3 = ((org.telegram.ui.ActionBar.f2) lVar).actionBar;
                    if (kVar3.v()) {
                        kVar4 = ((org.telegram.ui.ActionBar.f2) lVar).actionBar;
                        kVar4.u();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(lVar.f36243a, new di.e(28));
                        return;
                    }
                    lVar.finishFragment();
                    return;
                } else if (i7 == 2131296494) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue2 = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = lVar.f51222e.f51148a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj3 = arrayList2.get(i12);
                                i12++;
                                ijVar = (org.telegram.messenger.ij) obj3;
                                if (ijVar == null || ijVar.f1() != intValue2) {
                                }
                            } else {
                                ijVar = null;
                            }
                        }
                        org.telegram.ui.web.h hVar = lVar.f51223f;
                        if (hVar != null && ijVar == null) {
                            ArrayList arrayList3 = hVar.f51148a;
                            int size2 = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj4 = arrayList3.get(i13);
                                    i13++;
                                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj4;
                                    if (ijVar2 != null && ijVar2.f1() == intValue2) {
                                        ijVar = ijVar2;
                                    }
                                }
                            }
                        }
                        if (ijVar != null) {
                            arrayList.add(ijVar);
                            hashSet3.add(Integer.valueOf(ijVar.f1()));
                            hashSet2.add(org.telegram.ui.web.j.a(ijVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lVar.getParentActivity(), lVar.getResourceProvider());
                    String G = org.telegram.messenger.id.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    u1Var.T = org.telegram.messenger.id.N0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new lk0(29, lVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i7 == 2131296498) {
                    lVar.i0();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                if (i7 == -1) {
                    kVar5 = ((org.telegram.ui.ActionBar.f2) z0Var).actionBar;
                    if (kVar5.v()) {
                        kVar6 = ((org.telegram.ui.ActionBar.f2) z0Var).actionBar;
                        kVar6.u();
                        z0Var.f51416w.clear();
                        org.telegram.messenger.g0.d0(z0Var.f36243a, new di.e(29));
                        return;
                    }
                    z0Var.finishFragment();
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((ug.w0) obj).dismiss();
                    return;
                }
                return;
            default:
                if (i7 == -1) {
                    ((zh.l3) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
