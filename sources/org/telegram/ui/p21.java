package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p21 implements org.telegram.ui.Components.il0 {
    public final int f39859a;
    public final Object f39860b;

    public p21(Object obj, int i10) {
        this.f39859a = i10;
        this.f39860b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        org.telegram.ui.Components.nq0 nq0Var;
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.sl0 sl0Var;
        org.telegram.ui.Components.sl0 sl0Var2;
        f2.m1 K;
        int i11 = this.f39859a;
        Object obj = this.f39860b;
        switch (i11) {
            case 0:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.sl0 sl0Var3 = t21Var.f41399y;
                org.telegram.ui.Components.kp kpVar = t21Var.f41390b;
                if (kpVar.d.get(i10) != t21Var.H && t21Var.L == null) {
                    t21Var.N = false;
                    t21Var.H = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    t21Var.h.postDelayed(new org.telegram.ui.Components.im(t21Var, i10, 24), 100L);
                    for (int i12 = 0; i12 < sl0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) sl0Var3.getChildAt(i12);
                        if (w11Var != view && (nq0Var = w11Var.G) != null) {
                            AndroidUtilities.cancelRunOnUIThread(nq0Var);
                            w11Var.G.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f28819a.f21360a) {
                        ((org.telegram.ui.Components.w11) view).d();
                    }
                    e21 e21Var = t21Var.G;
                    if (e21Var != null) {
                        e21Var.f36347a.d0(i10, t21Var.H.f28819a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b31.U((b31) obj, view);
                return;
            case 2:
                t31.U((t31) obj, view, i10);
                return;
            case 3:
                h71 h71Var = (h71) obj;
                org.telegram.ui.Components.h51 G = h71Var.f37247f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        h71Var.X = (TLObject) G.G;
                        h71Var.U(true);
                        h71Var.f37247f0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((k71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                na1 na1Var = (na1) obj;
                ArrayList arrayList = na1Var.K;
                ArrayList arrayList2 = na1Var.L;
                s91 s91Var = na1Var.U;
                int i13 = s91Var.F;
                if (i10 >= i13 && i10 <= s91Var.G) {
                    ka1 ka1Var = (ka1) na1Var.f39273s0.get(i10 - i13);
                    bj0 bj0Var = new bj0(ka1Var.f38242b, true, na1Var.f39250b);
                    bj0Var.f35547b0 = ka1Var;
                    na1Var.presentFragment(bj0Var);
                    return;
                }
                int i14 = s91Var.R;
                if (i10 >= i14 && i10 <= s91Var.S) {
                    ((ga1) na1Var.N.get(i10 - i14)).b(na1Var);
                    return;
                }
                int i15 = s91Var.O;
                if (i10 >= i15 && i10 <= s91Var.P) {
                    ((ga1) arrayList2.get(i10 - i15)).b(na1Var);
                    return;
                }
                int i16 = s91Var.U;
                if (i10 >= i16 && i10 <= s91Var.V) {
                    ((ga1) na1Var.M.get(i10 - i16)).b(na1Var);
                    return;
                } else if (i10 == s91Var.W) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = na1Var.U.W;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    s91 s91Var2 = na1Var.U;
                    if (s91Var2 != null) {
                        s91Var2.E();
                        na1Var.P.setItemAnimator(na1Var.V);
                        na1Var.U.s(i17 + 1, size);
                        na1Var.U.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                jd1 jd1Var = (jd1) obj;
                if (jd1Var.T0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jd1Var.Z0(i10);
                if (jd1Var.T0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4 == z10) {
                    jd1Var.M0();
                    jd1Var.l1();
                }
                jd1Var.n1();
                org.telegram.ui.Components.m81 m81Var = jd1Var.G0[1];
                if (jd1Var.T0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m81Var.a(z11, true);
                jd1Var.M0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    jd1Var.M0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > jd1Var.M0.getMeasuredWidth()) {
                    qb1 qb1Var = jd1Var.M0;
                    qb1Var.v0(i19 - qb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                he1 he1Var = (he1) obj;
                int i20 = he1Var.E;
                HashSet hashSet = he1Var.f37362w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20845id))) {
                        hashSet.remove(Long.valueOf(chat.f20845id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20845id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && he1Var.v != -1 && he1Var.f37359n.getVisibility() == 0) {
                        he1Var.v = -1;
                        he1Var.f37359n.animate().setListener(null).cancel();
                        he1Var.f37359n.animate().translationY(i20).setDuration(200L).setListener(new de1(he1Var, 0)).start();
                        if (he1Var.f37361s.getVisibility() == 0) {
                            sl0Var2 = he1Var.f37355b;
                        } else {
                            sl0Var2 = he1Var.f37354a;
                        }
                        sl0Var2.c1(false);
                        int N0 = ((f2.j0) sl0Var2.getLayoutManager()).N0();
                        if ((N0 == sl0Var2.getAdapter().h() - 1 || (N0 == sl0Var2.getAdapter().h() - 2 && sl0Var2 == he1Var.f37354a)) && (K = sl0Var2.K(N0)) != null) {
                            int bottom = K.f5875a.getBottom();
                            if (N0 == he1Var.d.f36466c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (sl0Var2.getMeasuredHeight() - bottom <= i20) {
                                sl0Var2.setTranslationY(-(sl0Var2.getMeasuredHeight() - bottom));
                                sl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        he1Var.f37354a.setPadding(0, 0, 0, 0);
                        he1Var.f37355b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && he1Var.f37359n.getVisibility() == 8 && he1Var.v != 1) {
                        he1Var.v = 1;
                        he1Var.f37359n.setVisibility(0);
                        he1Var.f37359n.setTranslationY(i20);
                        he1Var.f37359n.animate().setListener(null).cancel();
                        he1Var.f37359n.animate().translationY(0.0f).setDuration(200L).setListener(new de1(he1Var, 1)).start();
                        he1Var.f37354a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        he1Var.f37355b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        he1Var.f37356c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (he1Var.f37361s.getVisibility() == 0) {
                            sl0Var = he1Var.f37355b;
                        } else {
                            sl0Var = he1Var.f37354a;
                        }
                        int height = sl0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            sl0Var.v0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                sf1.V((sf1) obj, view);
                return;
            case 10:
                sf1 sf1Var = ((of1) obj).f39706q0;
                if (view instanceof org.telegram.ui.Cells.oa) {
                    bg.e.m(sf1Var, sf1Var.f41188a, ((org.telegram.ui.Cells.oa) view).getTopic(), 0);
                    return;
                } else if (view instanceof pf1) {
                    pf1 pf1Var = (pf1) view;
                    bg.e.m(sf1Var, sf1Var.f41188a, pf1Var.K, pf1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                return;
            case 12:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                return;
            default:
                yi1 yi1Var = (yi1) obj;
                yi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = w.c.f(string, " ");
                String[] strArr = WallpapersListActivity.f34944k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f34945l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = yi1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                yi1Var.f43636n = strArr[i10];
                yi1Var.E("", true);
                return;
        }
    }
}
