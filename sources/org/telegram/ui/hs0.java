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
public final class hs0 extends org.telegram.ui.ActionBar.j {
    public final int f48517a;
    public final Object f48518b;

    public hs0(Object obj, int i7) {
        this.f48517a = i7;
        this.f48518b = obj;
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
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i11 = this.f48517a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.f48518b;
        switch (i11) {
            case 0:
                is0 is0Var = (is0) obj;
                if (i7 == -1) {
                    if (is0Var.onBackPressed(true)) {
                        is0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    is0Var.d0();
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
                    ((st0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 != -1) {
                    kVar = ((org.telegram.ui.ActionBar.h2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.h2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i7);
                        return;
                    }
                    return;
                }
                vv0 vv0Var = profileActivity.O;
                if (vv0Var == null || !vv0Var.V(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f43548f1);
                        bundle.putLong("user_id", profileActivity.f43540e1);
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
                org.telegram.messenger.az azVar = yx0Var.K;
                if (i7 == -1) {
                    yx0Var.finishFragment();
                    return;
                } else if (i7 == 1 && yx0Var.getParentActivity() != null) {
                    n2.o0 a10 = xi.a.a();
                    a10.p(yx0Var.f54326w);
                    String obj2 = yx0Var.f54318a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f21195c = obj2;
                    if (yx0Var.f54326w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(yx0Var.f54318a[1].getText().toString()).intValue();
                    }
                    a10.f21194b = intValue;
                    if (yx0Var.f54326w != 1) {
                        str = "";
                    } else {
                        str = yx0Var.f54318a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (yx0Var.f54326w != 1) {
                        str2 = "";
                    } else {
                        str2 = yx0Var.f54318a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f21196e = str2;
                    if (yx0Var.f54326w == 1) {
                        str3 = "";
                    } else {
                        str3 = yx0Var.f54318a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f21197f = str5;
                    azVar.f22988a = a10.d();
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    SharedPreferences.Editor edit = g12.edit();
                    if (z11) {
                        org.telegram.messenger.bz.a(azVar);
                        org.telegram.messenger.bz.B1 = azVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z10 = g12.getBoolean("proxy_enabled", false);
                        org.telegram.messenger.bz.z();
                    }
                    if (z11 || org.telegram.messenger.bz.B1 == azVar) {
                        azVar.f22988a.i(edit);
                        ConnectionsManager.setProxySettings(z10, azVar.f22988a);
                    }
                    edit.commit();
                    org.telegram.messenger.ks.e().k(279, new Object[0]);
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
                    o31Var.k0(new org.telegram.ui.ActionBar.h2(null));
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
                    i10 = ((org.telegram.ui.ActionBar.h2) daVar).currentAccount;
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
                HashSet hashSet = mVar.f53241y;
                if (i7 == -1) {
                    if (org.telegram.ui.web.m.e0(mVar).y()) {
                        org.telegram.ui.web.m.f0(mVar).x();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(mVar.f33530a, new fi.e(28));
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
                        ArrayList arrayList2 = mVar.f53234e.f53158a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj3 = arrayList2.get(i12);
                                i12++;
                                fjVar = (org.telegram.messenger.fj) obj3;
                                if (fjVar == null || fjVar.e1() != intValue2) {
                                }
                            } else {
                                fjVar = null;
                            }
                        }
                        org.telegram.ui.web.i iVar = mVar.f53235f;
                        if (iVar != null && fjVar == null) {
                            ArrayList arrayList3 = iVar.f53158a;
                            int size2 = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj4 = arrayList3.get(i13);
                                    i13++;
                                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj4;
                                    if (fjVar2 != null && fjVar2.e1() == intValue2) {
                                        fjVar = fjVar2;
                                    }
                                }
                            }
                        }
                        if (fjVar != null) {
                            arrayList.add(fjVar);
                            hashSet3.add(Integer.valueOf(fjVar.e1()));
                            hashSet2.add(org.telegram.ui.web.k.a(fjVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                    String G = org.telegram.messenger.gd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    u1Var.U = org.telegram.messenger.gd.N0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new wc1(1, mVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i7 == 2131296498) {
                    mVar.i0();
                    return;
                } else {
                    return;
                }
            case 25:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (i7 == -1) {
                    kVar3 = ((org.telegram.ui.ActionBar.h2) x0Var).actionBar;
                    if (kVar3.y()) {
                        kVar4 = ((org.telegram.ui.ActionBar.h2) x0Var).actionBar;
                        kVar4.x();
                        x0Var.f53402w.clear();
                        org.telegram.messenger.g0.d0(x0Var.f33530a, new fi.e(29));
                        return;
                    }
                    x0Var.finishFragment();
                    return;
                }
                return;
            default:
                if (i7 == -1) {
                    ((ug.z0) obj).dismiss();
                    return;
                }
                return;
        }
    }
}
