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
public final class b31 implements org.telegram.ui.Components.al0 {
    public final int f32042a;
    public final Object f32043b;

    public b31(Object obj, int i10) {
        this.f32042a = i10;
        this.f32043b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.kq0 kq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ml0 ml0Var;
        org.telegram.ui.Components.ml0 ml0Var2;
        s4.c1 L;
        int i11 = this.f32042a;
        Object obj = this.f32043b;
        switch (i11) {
            case 0:
                f31 f31Var = (f31) obj;
                org.telegram.ui.Components.ml0 ml0Var3 = f31Var.f33536y;
                org.telegram.ui.Components.kp kpVar = f31Var.f33528b;
                if (kpVar.d.get(i10) != f31Var.K && f31Var.O == null) {
                    f31Var.Q = false;
                    f31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    f31Var.h.postDelayed(new org.telegram.ui.Components.id(f31Var, i10, 26), 100L);
                    for (int i12 = 0; i12 < ml0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) ml0Var3.getChildAt(i12);
                        if (v11Var != view && (kq0Var = v11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(kq0Var);
                            v11Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25954a.f18617a) {
                        ((org.telegram.ui.Components.v11) view).d();
                    }
                    r21 r21Var = f31Var.J;
                    if (r21Var != null) {
                        r21Var.f37068a.d0(i10, f31Var.K.f25954a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n31.U((n31) obj, view);
                return;
            case 2:
                g41.U((g41) obj, view, i10);
                return;
            case 3:
                s71 s71Var = (s71) obj;
                org.telegram.ui.Components.j51 G = s71Var.f37409i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        s71Var.f37401a0 = (TLObject) G.G;
                        s71Var.U(true);
                        s71Var.f37409i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((v71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                ab1 ab1Var = (ab1) obj;
                ArrayList arrayList = ab1Var.N;
                ArrayList arrayList2 = ab1Var.O;
                fa1 fa1Var = ab1Var.X;
                int i13 = fa1Var.I;
                if (i10 >= i13 && i10 <= fa1Var.J) {
                    xa1 xa1Var = (xa1) ab1Var.f31809v0.get(i10 - i13);
                    lj0 lj0Var = new lj0(xa1Var.f39506b, true, ab1Var.f31784b);
                    lj0Var.f35568e0 = xa1Var;
                    ab1Var.presentFragment(lj0Var);
                    return;
                }
                int i14 = fa1Var.U;
                if (i10 >= i14 && i10 <= fa1Var.V) {
                    ((ta1) ab1Var.Q.get(i10 - i14)).b(ab1Var);
                    return;
                }
                int i15 = fa1Var.R;
                if (i10 >= i15 && i10 <= fa1Var.S) {
                    ((ta1) arrayList2.get(i10 - i15)).b(ab1Var);
                    return;
                }
                int i16 = fa1Var.X;
                if (i10 >= i16 && i10 <= fa1Var.Y) {
                    ((ta1) ab1Var.P.get(i10 - i16)).b(ab1Var);
                    return;
                } else if (i10 == fa1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = ab1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    fa1 fa1Var2 = ab1Var.X;
                    if (fa1Var2 != null) {
                        fa1Var2.E();
                        ab1Var.S.setItemAnimator(ab1Var.Y);
                        ab1Var.X.s(i17 + 1, size);
                        ab1Var.X.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                xd1 xd1Var = (xd1) obj;
                if (xd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xd1Var.Z0(i10);
                if (xd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    xd1Var.M0();
                    xd1Var.l1();
                }
                xd1Var.n1();
                org.telegram.ui.Components.k81 k81Var = xd1Var.J0[1];
                if (xd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k81Var.a(z12, true);
                xd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    xd1Var.P0.w0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > xd1Var.P0.getMeasuredWidth()) {
                    fc1 fc1Var = xd1Var.P0;
                    fc1Var.w0(i19 - fc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                ue1 ue1Var = (ue1) obj;
                int i20 = ue1Var.H;
                HashSet hashSet = ue1Var.f38059w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18121id))) {
                        hashSet.remove(Long.valueOf(chat.f18121id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18121id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ue1Var.v != -1 && ue1Var.f38056n.getVisibility() == 0) {
                        ue1Var.v = -1;
                        ue1Var.f38056n.animate().setListener(null).cancel();
                        ue1Var.f38056n.animate().translationY(i20).setDuration(200L).setListener(new qe1(ue1Var, 0)).start();
                        if (ue1Var.f38058s.getVisibility() == 0) {
                            ml0Var2 = ue1Var.f38053b;
                        } else {
                            ml0Var2 = ue1Var.f38052a;
                        }
                        ml0Var2.e1(false);
                        int N0 = ((s4.c0) ml0Var2.getLayoutManager()).N0();
                        if ((N0 == ml0Var2.getAdapter().h() - 1 || (N0 == ml0Var2.getAdapter().h() - 2 && ml0Var2 == ue1Var.f38052a)) && (L = ml0Var2.L(N0)) != null) {
                            int bottom = L.f42697a.getBottom();
                            if (N0 == ue1Var.d.f37209c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ml0Var2.getMeasuredHeight() - bottom <= i20) {
                                ml0Var2.setTranslationY(-(ml0Var2.getMeasuredHeight() - bottom));
                                ml0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ue1Var.f38052a.setPadding(0, 0, 0, 0);
                        ue1Var.f38053b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ue1Var.f38056n.getVisibility() == 8 && ue1Var.v != 1) {
                        ue1Var.v = 1;
                        ue1Var.f38056n.setVisibility(0);
                        ue1Var.f38056n.setTranslationY(i20);
                        ue1Var.f38056n.animate().setListener(null).cancel();
                        ue1Var.f38056n.animate().translationY(0.0f).setDuration(200L).setListener(new qe1(ue1Var, 1)).start();
                        ue1Var.f38052a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        ue1Var.f38053b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        ue1Var.f38054c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ue1Var.f38058s.getVisibility() == 0) {
                            ml0Var = ue1Var.f38053b;
                        } else {
                            ml0Var = ue1Var.f38052a;
                        }
                        int height = ml0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            ml0Var.w0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fg1.V((fg1) obj, view);
                return;
            case 10:
                fg1 fg1Var = ((bg1) obj).f32176u0;
                if (view instanceof org.telegram.ui.Cells.ta) {
                    ng.d.m(fg1Var, fg1Var.f33636a, ((org.telegram.ui.Cells.ta) view).getTopic(), 0);
                    return;
                } else if (view instanceof cg1) {
                    cg1 cg1Var = (cg1) view;
                    ng.d.m(fg1Var, fg1Var.f33636a, cg1Var.N, cg1Var.getMessageId());
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
                ij1 ij1Var = (ij1) obj;
                ij1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.f31634l0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ij1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                ij1Var.f34608n = strArr[i10];
                ij1Var.E("", true);
                return;
        }
    }
}
