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
public final class is0 extends org.telegram.ui.ActionBar.j {
    public final int f48825a;
    public final Object f48826b;

    public is0(Object obj, int i7) {
        this.f48825a = i7;
        this.f48826b = obj;
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
        int i11 = this.f48825a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.f48826b;
        switch (i11) {
            case 0:
                js0 js0Var = (js0) obj;
                if (i7 == -1) {
                    if (js0Var.onBackPressed(true)) {
                        js0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    js0Var.d0();
                    return;
                } else {
                    return;
                }
            case 1:
                if (i7 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 2:
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
            case 3:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i7 == -1) {
                    ((tt0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 != -1) {
                    kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i7);
                        return;
                    }
                    return;
                }
                wv0 wv0Var = profileActivity.O;
                if (wv0Var == null || !wv0Var.V(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f43558f1);
                        bundle.putLong("user_id", profileActivity.f43550e1);
                        profileActivity.presentFragment(new ci.j0(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 6:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                yx0 yx0Var = (yx0) obj;
                boolean z11 = yx0Var.J;
                org.telegram.messenger.bz bzVar = yx0Var.K;
                if (i7 == -1) {
                    yx0Var.finishFragment();
                    return;
                } else if (i7 == 1 && yx0Var.getParentActivity() != null) {
                    n2.o0 a10 = xi.a.a();
                    a10.p(yx0Var.f54296w);
                    String obj2 = yx0Var.f54288a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f21189c = obj2;
                    if (yx0Var.f54296w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(yx0Var.f54288a[1].getText().toString()).intValue();
                    }
                    a10.f21188b = intValue;
                    if (yx0Var.f54296w != 1) {
                        str = "";
                    } else {
                        str = yx0Var.f54288a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (yx0Var.f54296w != 1) {
                        str2 = "";
                    } else {
                        str2 = yx0Var.f54288a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f21190e = str2;
                    if (yx0Var.f54296w == 1) {
                        str3 = "";
                    } else {
                        str3 = yx0Var.f54288a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f21191f = str5;
                    bzVar.f23161a = a10.d();
                    SharedPreferences g12 = org.telegram.messenger.np.g1();
                    SharedPreferences.Editor edit = g12.edit();
                    if (z11) {
                        org.telegram.messenger.cz.a(bzVar);
                        org.telegram.messenger.cz.B1 = bzVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z10 = g12.getBoolean("proxy_enabled", false);
                        org.telegram.messenger.cz.z();
                    }
                    if (z11 || org.telegram.messenger.cz.B1 == bzVar) {
                        bzVar.f23161a.i(edit);
                        ConnectionsManager.setProxySettings(z10, bzVar.f23161a);
                    }
                    edit.commit();
                    org.telegram.messenger.ls.e().k(280, new Object[0]);
                    yx0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i7 == -1) {
                    ((ey0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i7 == -1) {
                    ((sy0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i7 == -1) {
                    ((zy0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 13:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                o31 o31Var = (o31) obj;
                if (i7 == -1) {
                    if (o31Var.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", o31Var.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        o31Var.presentFragment(new ci.j0(bundle2));
                        return;
                    }
                    o31Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    o31Var.k0(new org.telegram.ui.ActionBar.g2(null));
                    return;
                } else {
                    return;
                }
            case 15:
                if (i7 == -1) {
                    ((c51) obj).finishFragment();
                    return;
                }
                return;
            case 16:
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
            case 17:
                a81 a81Var = (a81) obj;
                if (i7 == -1) {
                    a81Var.finishFragment();
                    return;
                } else if (i7 == 1) {
                    a81.d0(a81Var);
                    return;
                } else {
                    return;
                }
            case 18:
                if (i7 == -1) {
                    ((p81) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i7 == -1) {
                    ((ea1) obj).finishFragment();
                    return;
                }
                return;
            case 20:
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
            case 21:
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
            case 22:
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
            case 23:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) obj;
                if (i7 == -1) {
                    daVar.finishFragment();
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity = daVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.g2) daVar).currentAccount;
                    org.telegram.ui.Wallet.n6.N0(i10, parentActivity, daVar.getResourceProvider());
                    return;
                } else if (i7 == 3) {
                    daVar.u0();
                    return;
                } else {
                    return;
                }
            case 24:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.f53203y;
                if (i7 == -1) {
                    if (org.telegram.ui.web.m.e0(mVar).x()) {
                        org.telegram.ui.web.m.f0(mVar).w();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(mVar.f34671a, new fi.e(28));
                        return;
                    }
                    mVar.finishFragment();
                    return;
                } else if (i7 == 2131296496) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue2 = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = mVar.f53196e.f53120a;
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
                        org.telegram.ui.web.i iVar = mVar.f53197f;
                        if (iVar != null && gjVar == null) {
                            ArrayList arrayList3 = iVar.f53120a;
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
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.S = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    t1Var.U = org.telegram.messenger.hd.O0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new wc1(1, mVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i7 == 2131296500) {
                    mVar.i0();
                    return;
                } else {
                    return;
                }
            case 25:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (i7 == -1) {
                    kVar3 = ((org.telegram.ui.ActionBar.g2) x0Var).actionBar;
                    if (kVar3.x()) {
                        kVar4 = ((org.telegram.ui.ActionBar.g2) x0Var).actionBar;
                        kVar4.w();
                        x0Var.f53364w.clear();
                        org.telegram.messenger.g0.d0(x0Var.f34671a, new fi.e(29));
                        return;
                    }
                    x0Var.finishFragment();
                    return;
                }
                return;
            default:
                if (i7 == -1) {
                    ((ug.y0) obj).dismiss();
                    return;
                }
                return;
        }
    }
}
