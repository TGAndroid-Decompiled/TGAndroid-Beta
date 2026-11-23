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
public final class gs0 extends org.telegram.ui.ActionBar.j {
    public final int f48350a;
    public final Object f48351b;

    public gs0(Object obj, int i7) {
        this.f48350a = i7;
        this.f48351b = obj;
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
        int i11 = this.f48350a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.f48351b;
        switch (i11) {
            case 0:
                hs0 hs0Var = (hs0) obj;
                if (i7 == -1) {
                    if (hs0Var.onBackPressed(true)) {
                        hs0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    hs0Var.d0();
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
                    ((rt0) obj).finishFragment();
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
                uv0 uv0Var = profileActivity.O;
                if (uv0Var == null || !uv0Var.V(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f43674f1);
                        bundle.putLong("user_id", profileActivity.f43666e1);
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
                wx0 wx0Var = (wx0) obj;
                boolean z11 = wx0Var.J;
                org.telegram.messenger.az azVar = wx0Var.K;
                if (i7 == -1) {
                    wx0Var.finishFragment();
                    return;
                } else if (i7 == 1 && wx0Var.getParentActivity() != null) {
                    n2.p0 a10 = xi.a.a();
                    a10.p(wx0Var.f53790w);
                    String obj2 = wx0Var.f53782a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f21292c = obj2;
                    if (wx0Var.f53790w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(wx0Var.f53782a[1].getText().toString()).intValue();
                    }
                    a10.f21291b = intValue;
                    if (wx0Var.f53790w != 1) {
                        str = "";
                    } else {
                        str = wx0Var.f53782a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (wx0Var.f53790w != 1) {
                        str2 = "";
                    } else {
                        str2 = wx0Var.f53782a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f21293e = str2;
                    if (wx0Var.f53790w == 1) {
                        str3 = "";
                    } else {
                        str3 = wx0Var.f53782a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f21294f = str5;
                    azVar.f23096a = a10.d();
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
                        azVar.f23096a.i(edit);
                        ConnectionsManager.setProxySettings(z10, azVar.f23096a);
                    }
                    edit.commit();
                    org.telegram.messenger.ks.e().k(280, new Object[0]);
                    wx0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 8:
                if (i7 == -1) {
                    ((cy0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i7 == -1) {
                    ((ry0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i7 == -1) {
                    ((yy0) obj).finishFragment();
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
                n31 n31Var = (n31) obj;
                if (i7 == -1) {
                    if (n31Var.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", n31Var.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        n31Var.presentFragment(new ci.j0(bundle2));
                        return;
                    }
                    n31Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    n31Var.k0(new org.telegram.ui.ActionBar.g2(null));
                    return;
                } else {
                    return;
                }
            case 15:
                if (i7 == -1) {
                    ((b51) obj).finishFragment();
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
            case 18:
                if (i7 == -1) {
                    ((n81) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i7 == -1) {
                    ((ca1) obj).finishFragment();
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
                org.telegram.ui.Wallet.ea eaVar = (org.telegram.ui.Wallet.ea) obj;
                if (i7 == -1) {
                    eaVar.finishFragment();
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity = eaVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.g2) eaVar).currentAccount;
                    org.telegram.ui.Wallet.o6.N0(i10, parentActivity, eaVar.getResourceProvider());
                    return;
                } else if (i7 == 3) {
                    eaVar.u0();
                    return;
                } else {
                    return;
                }
            case 24:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.f53474y;
                if (i7 == -1) {
                    if (org.telegram.ui.web.m.e0(mVar).x()) {
                        org.telegram.ui.web.m.f0(mVar).w();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(mVar.f34213a, new fi.e(28));
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
                        ArrayList arrayList2 = mVar.f53467e.f53391a;
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
                        org.telegram.ui.web.i iVar = mVar.f53468f;
                        if (iVar != null && fjVar == null) {
                            ArrayList arrayList3 = iVar.f53391a;
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
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    t1Var.U = org.telegram.messenger.gd.O0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new uc1(1, mVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
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
                        x0Var.f53636w.clear();
                        org.telegram.messenger.g0.d0(x0Var.f34213a, new fi.e(29));
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
