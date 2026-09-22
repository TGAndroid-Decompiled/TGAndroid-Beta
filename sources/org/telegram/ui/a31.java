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
public final class a31 implements org.telegram.ui.Components.zk0 {
    public final int f31675a;
    public final Object f31676b;

    public a31(Object obj, int i10) {
        this.f31675a = i10;
        this.f31676b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ll0 ll0Var;
        org.telegram.ui.Components.ll0 ll0Var2;
        s4.c1 K;
        int i11 = this.f31675a;
        Object obj = this.f31676b;
        switch (i11) {
            case 0:
                e31 e31Var = (e31) obj;
                org.telegram.ui.Components.ll0 ll0Var3 = e31Var.f33165y;
                org.telegram.ui.Components.kp kpVar = e31Var.f33157b;
                if (kpVar.d.get(i10) != e31Var.K && e31Var.O == null) {
                    e31Var.Q = false;
                    e31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    e31Var.h.postDelayed(new org.telegram.ui.Components.id(e31Var, i10, 26), 100L);
                    for (int i12 = 0; i12 < ll0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) ll0Var3.getChildAt(i12);
                        if (u11Var != view && (jq0Var = u11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            u11Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).f25997a.f18587a) {
                        ((org.telegram.ui.Components.u11) view).d();
                    }
                    q21 q21Var = e31Var.J;
                    if (q21Var != null) {
                        q21Var.f36737a.d0(i10, e31Var.K.f25997a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m31.U((m31) obj, view);
                return;
            case 2:
                f41.U((f41) obj, view, i10);
                return;
            case 3:
                r71 r71Var = (r71) obj;
                org.telegram.ui.Components.i51 G = r71Var.f37059i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        r71Var.f37051a0 = (TLObject) G.G;
                        r71Var.U(true);
                        r71Var.f37059i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((u71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                za1 za1Var = (za1) obj;
                ArrayList arrayList = za1Var.N;
                ArrayList arrayList2 = za1Var.O;
                ea1 ea1Var = za1Var.X;
                int i13 = ea1Var.I;
                if (i10 >= i13 && i10 <= ea1Var.J) {
                    wa1 wa1Var = (wa1) za1Var.f40135v0.get(i10 - i13);
                    jj0 jj0Var = new jj0(wa1Var.f38764b, true, za1Var.f40110b);
                    jj0Var.f34929e0 = wa1Var;
                    za1Var.presentFragment(jj0Var);
                    return;
                }
                int i14 = ea1Var.U;
                if (i10 >= i14 && i10 <= ea1Var.V) {
                    ((sa1) za1Var.Q.get(i10 - i14)).b(za1Var);
                    return;
                }
                int i15 = ea1Var.R;
                if (i10 >= i15 && i10 <= ea1Var.S) {
                    ((sa1) arrayList2.get(i10 - i15)).b(za1Var);
                    return;
                }
                int i16 = ea1Var.X;
                if (i10 >= i16 && i10 <= ea1Var.Y) {
                    ((sa1) za1Var.P.get(i10 - i16)).b(za1Var);
                    return;
                } else if (i10 == ea1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = za1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ea1 ea1Var2 = za1Var.X;
                    if (ea1Var2 != null) {
                        ea1Var2.E();
                        za1Var.S.setItemAnimator(za1Var.Y);
                        za1Var.X.s(i17 + 1, size);
                        za1Var.X.u(i17);
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
                wd1Var.P0.f1();
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
                HashSet hashSet = te1Var.f37655w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18109id))) {
                        hashSet.remove(Long.valueOf(chat.f18109id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18109id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && te1Var.v != -1 && te1Var.f37652n.getVisibility() == 0) {
                        te1Var.v = -1;
                        te1Var.f37652n.animate().setListener(null).cancel();
                        te1Var.f37652n.animate().translationY(i20).setDuration(200L).setListener(new pe1(te1Var, 0)).start();
                        if (te1Var.f37654s.getVisibility() == 0) {
                            ll0Var2 = te1Var.f37649b;
                        } else {
                            ll0Var2 = te1Var.f37648a;
                        }
                        ll0Var2.d1(false);
                        int N0 = ((s4.c0) ll0Var2.getLayoutManager()).N0();
                        if ((N0 == ll0Var2.getAdapter().h() - 1 || (N0 == ll0Var2.getAdapter().h() - 2 && ll0Var2 == te1Var.f37648a)) && (K = ll0Var2.K(N0)) != null) {
                            int bottom = K.f42671a.getBottom();
                            if (N0 == te1Var.d.f36859c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ll0Var2.getMeasuredHeight() - bottom <= i20) {
                                ll0Var2.setTranslationY(-(ll0Var2.getMeasuredHeight() - bottom));
                                ll0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        te1Var.f37648a.setPadding(0, 0, 0, 0);
                        te1Var.f37649b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && te1Var.f37652n.getVisibility() == 8 && te1Var.v != 1) {
                        te1Var.v = 1;
                        te1Var.f37652n.setVisibility(0);
                        te1Var.f37652n.setTranslationY(i20);
                        te1Var.f37652n.animate().setListener(null).cancel();
                        te1Var.f37652n.animate().translationY(0.0f).setDuration(200L).setListener(new pe1(te1Var, 1)).start();
                        te1Var.f37648a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        te1Var.f37649b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        te1Var.f37650c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (te1Var.f37654s.getVisibility() == 0) {
                            ll0Var = te1Var.f37649b;
                        } else {
                            ll0Var = te1Var.f37648a;
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
                eg1 eg1Var = ((ag1) obj).f31823t0;
                if (view instanceof org.telegram.ui.Cells.ta) {
                    ng.d.m(eg1Var, eg1Var.f33291a, ((org.telegram.ui.Cells.ta) view).getTopic(), 0);
                    return;
                } else if (view instanceof bg1) {
                    bg1 bg1Var = (bg1) view;
                    ng.d.m(eg1Var, eg1Var.f33291a, bg1Var.N, bg1Var.getMessageId());
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
                StringBuilder h = w.c.h(string, " ");
                String[] strArr = WallpapersListActivity.f31617n0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f31618o0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = jj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                jj1Var.f34939n = strArr[i10];
                jj1Var.E("", true);
                return;
        }
    }
}
