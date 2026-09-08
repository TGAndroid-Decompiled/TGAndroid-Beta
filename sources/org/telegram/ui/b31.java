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
public final class b31 implements org.telegram.ui.Components.zk0 {
    public final int f34651a;
    public final Object f34652b;

    public b31(Object obj, int i10) {
        this.f34651a = i10;
        this.f34652b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ll0 ll0Var;
        org.telegram.ui.Components.ll0 ll0Var2;
        s4.c1 K;
        int i11 = this.f34651a;
        Object obj = this.f34652b;
        switch (i11) {
            case 0:
                f31 f31Var = (f31) obj;
                org.telegram.ui.Components.ll0 ll0Var3 = f31Var.f36287y;
                org.telegram.ui.Components.jp jpVar = f31Var.f36278b;
                if (jpVar.d.get(i10) != f31Var.K && f31Var.O == null) {
                    f31Var.Q = false;
                    f31Var.K = (org.telegram.ui.Components.kp) jpVar.d.get(i10);
                    jpVar.E(i10);
                    f31Var.h.postDelayed(new org.telegram.ui.Components.m8(f31Var, i10, 27), 100L);
                    for (int i12 = 0; i12 < ll0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) ll0Var3.getChildAt(i12);
                        if (t11Var != view && (jq0Var = t11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            t11Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.kp) jpVar.d.get(i10)).f27909a.f20388a) {
                        ((org.telegram.ui.Components.t11) view).d();
                    }
                    r21 r21Var = f31Var.J;
                    if (r21Var != null) {
                        r21Var.f40077a.d0(i10, f31Var.K.f27909a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n31.U((n31) obj, view);
                return;
            case 2:
                h41.U((h41) obj, view, i10);
                return;
            case 3:
                t71 t71Var = (t71) obj;
                org.telegram.ui.Components.h51 G = t71Var.f40683i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        t71Var.f40675a0 = (TLObject) G.G;
                        t71Var.U(true);
                        t71Var.f40683i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((w71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                bb1 bb1Var = (bb1) obj;
                ArrayList arrayList = bb1Var.N;
                ArrayList arrayList2 = bb1Var.O;
                ga1 ga1Var = bb1Var.X;
                int i13 = ga1Var.I;
                if (i10 >= i13 && i10 <= ga1Var.J) {
                    ya1 ya1Var = (ya1) bb1Var.f34745v0.get(i10 - i13);
                    lj0 lj0Var = new lj0(ya1Var.f43094b, true, bb1Var.f34719b);
                    lj0Var.f38414e0 = ya1Var;
                    bb1Var.presentFragment(lj0Var);
                    return;
                }
                int i14 = ga1Var.U;
                if (i10 >= i14 && i10 <= ga1Var.V) {
                    ((ua1) bb1Var.Q.get(i10 - i14)).b(bb1Var);
                    return;
                }
                int i15 = ga1Var.R;
                if (i10 >= i15 && i10 <= ga1Var.S) {
                    ((ua1) arrayList2.get(i10 - i15)).b(bb1Var);
                    return;
                }
                int i16 = ga1Var.X;
                if (i10 >= i16 && i10 <= ga1Var.Y) {
                    ((ua1) bb1Var.P.get(i10 - i16)).b(bb1Var);
                    return;
                } else if (i10 == ga1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = bb1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ga1 ga1Var2 = bb1Var.X;
                    if (ga1Var2 != null) {
                        ga1Var2.E();
                        bb1Var.S.setItemAnimator(bb1Var.Y);
                        bb1Var.X.s(i17 + 1, size);
                        bb1Var.X.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                wd1 wd1Var = (wd1) obj;
                if (wd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wd1Var.Z0(i10);
                if (wd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    wd1Var.M0();
                    wd1Var.l1();
                }
                wd1Var.n1();
                org.telegram.ui.Components.j81 j81Var = wd1Var.J0[1];
                if (wd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j81Var.a(z12, true);
                wd1Var.P0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    wd1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > wd1Var.P0.getMeasuredWidth()) {
                    ec1 ec1Var = wd1Var.P0;
                    ec1Var.v0(i19 - ec1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                te1 te1Var = (te1) obj;
                int i20 = te1Var.H;
                HashSet hashSet = te1Var.f40763w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f19896id))) {
                        hashSet.remove(Long.valueOf(chat.f19896id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f19896id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && te1Var.v != -1 && te1Var.f40760n.getVisibility() == 0) {
                        te1Var.v = -1;
                        te1Var.f40760n.animate().setListener(null).cancel();
                        te1Var.f40760n.animate().translationY(i20).setDuration(200L).setListener(new pe1(te1Var, 0)).start();
                        if (te1Var.f40762s.getVisibility() == 0) {
                            ll0Var2 = te1Var.f40756b;
                        } else {
                            ll0Var2 = te1Var.f40755a;
                        }
                        ll0Var2.c1(false);
                        int N0 = ((s4.c0) ll0Var2.getLayoutManager()).N0();
                        if ((N0 == ll0Var2.getAdapter().h() - 1 || (N0 == ll0Var2.getAdapter().h() - 2 && ll0Var2 == te1Var.f40755a)) && (K = ll0Var2.K(N0)) != null) {
                            int bottom = K.f45766a.getBottom();
                            if (N0 == te1Var.d.f39880c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ll0Var2.getMeasuredHeight() - bottom <= i20) {
                                ll0Var2.setTranslationY(-(ll0Var2.getMeasuredHeight() - bottom));
                                ll0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        te1Var.f40755a.setPadding(0, 0, 0, 0);
                        te1Var.f40756b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && te1Var.f40760n.getVisibility() == 8 && te1Var.v != 1) {
                        te1Var.v = 1;
                        te1Var.f40760n.setVisibility(0);
                        te1Var.f40760n.setTranslationY(i20);
                        te1Var.f40760n.animate().setListener(null).cancel();
                        te1Var.f40760n.animate().translationY(0.0f).setDuration(200L).setListener(new pe1(te1Var, 1)).start();
                        te1Var.f40755a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        te1Var.f40756b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        te1Var.f40757c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (te1Var.f40762s.getVisibility() == 0) {
                            ll0Var = te1Var.f40756b;
                        } else {
                            ll0Var = te1Var.f40755a;
                        }
                        int height = ll0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            ll0Var.v0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                eg1.V((eg1) obj, view);
                return;
            case 10:
                eg1 eg1Var = ((ag1) obj).f34472t0;
                if (view instanceof org.telegram.ui.Cells.sa) {
                    og.d.m(eg1Var, eg1Var.f36052a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    return;
                } else if (view instanceof bg1) {
                    bg1 bg1Var = (bg1) view;
                    og.d.m(eg1Var, eg1Var.f36052a, bg1Var.N, bg1Var.getMessageId());
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
                jj1 jj1Var = (jj1) obj;
                jj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.f34277n0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f34278o0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = jj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                jj1Var.f37816n = strArr[i10];
                jj1Var.E("", true);
                return;
        }
    }
}
