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
public final class f31 implements org.telegram.ui.Components.jl0 {
    public final int f32675a;
    public final Object f32676b;

    public f31(Object obj, int i10) {
        this.f32675a = i10;
        this.f32676b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.uq0 uq0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.vl0 vl0Var;
        org.telegram.ui.Components.vl0 vl0Var2;
        s4.c1 K;
        int i11 = this.f32675a;
        Object obj = this.f32676b;
        switch (i11) {
            case 0:
                j31 j31Var = (j31) obj;
                org.telegram.ui.Components.vl0 vl0Var3 = j31Var.f33875y;
                org.telegram.ui.Components.qp qpVar = j31Var.f33867b;
                if (qpVar.d.get(i10) != j31Var.K && j31Var.O == null) {
                    j31Var.Q = false;
                    j31Var.K = (org.telegram.ui.Components.rp) qpVar.d.get(i10);
                    qpVar.E(i10);
                    j31Var.h.postDelayed(new org.telegram.ui.Components.zd(j31Var, i10, 25), 100L);
                    for (int i12 = 0; i12 < vl0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) vl0Var3.getChildAt(i12);
                        if (i21Var != view && (uq0Var = i21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(uq0Var);
                            i21Var.J.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.rp) qpVar.d.get(i10)).f26733a.f17714a) {
                        ((org.telegram.ui.Components.i21) view).d();
                    }
                    v21 v21Var = j31Var.J;
                    if (v21Var != null) {
                        v21Var.f37399a.d0(i10, j31Var.K.f26733a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r31.U((r31) obj, view);
                return;
            case 2:
                k41.U((k41) obj, view, i10);
                return;
            case 3:
                v71 v71Var = (v71) obj;
                org.telegram.ui.Components.v51 G = v71Var.f37442i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.j6) view).s(true, true);
                        v71Var.f37434a0 = (TLObject) G.G;
                        v71Var.U(true);
                        v71Var.f37442i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((z71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                fb1 fb1Var = (fb1) obj;
                ArrayList arrayList = fb1Var.N;
                ArrayList arrayList2 = fb1Var.O;
                ka1 ka1Var = fb1Var.X;
                int i13 = ka1Var.I;
                if (i10 >= i13 && i10 <= ka1Var.J) {
                    cb1 cb1Var = (cb1) fb1Var.f32767v0.get(i10 - i13);
                    kj0 kj0Var = new kj0(cb1Var.f31603b, true, fb1Var.f32742b);
                    kj0Var.f34391e0 = cb1Var;
                    fb1Var.presentFragment(kj0Var);
                    return;
                }
                int i14 = ka1Var.U;
                if (i10 >= i14 && i10 <= ka1Var.V) {
                    ((ya1) fb1Var.Q.get(i10 - i14)).b(fb1Var);
                    return;
                }
                int i15 = ka1Var.R;
                if (i10 >= i15 && i10 <= ka1Var.S) {
                    ((ya1) arrayList2.get(i10 - i15)).b(fb1Var);
                    return;
                }
                int i16 = ka1Var.X;
                if (i10 >= i16 && i10 <= ka1Var.Y) {
                    ((ya1) fb1Var.P.get(i10 - i16)).b(fb1Var);
                    return;
                } else if (i10 == ka1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = fb1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ka1 ka1Var2 = fb1Var.X;
                    if (ka1Var2 != null) {
                        ka1Var2.E();
                        fb1Var.S.setItemAnimator(fb1Var.Y);
                        fb1Var.X.s(i17 + 1, size);
                        fb1Var.X.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                ae1 ae1Var = (ae1) obj;
                if (ae1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ae1Var.Z0(i10);
                if (ae1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    ae1Var.M0();
                    ae1Var.l1();
                }
                ae1Var.n1();
                org.telegram.ui.Components.w81 w81Var = ae1Var.J0[1];
                if (ae1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w81Var.a(z12, true);
                ae1Var.P0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    ae1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > ae1Var.P0.getMeasuredWidth()) {
                    ic1 ic1Var = ae1Var.P0;
                    ic1Var.v0(i19 - ic1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                xe1 xe1Var = (xe1) obj;
                int i20 = xe1Var.H;
                HashSet hashSet = xe1Var.f38701w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f17195id))) {
                        hashSet.remove(Long.valueOf(chat.f17195id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f17195id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && xe1Var.v != -1 && xe1Var.f38698n.getVisibility() == 0) {
                        xe1Var.v = -1;
                        xe1Var.f38698n.animate().setListener(null).cancel();
                        xe1Var.f38698n.animate().translationY(i20).setDuration(200L).setListener(new te1(xe1Var, 0)).start();
                        if (xe1Var.f38700s.getVisibility() == 0) {
                            vl0Var2 = xe1Var.f38695b;
                        } else {
                            vl0Var2 = xe1Var.f38694a;
                        }
                        vl0Var2.c1(false);
                        int N0 = ((s4.c0) vl0Var2.getLayoutManager()).N0();
                        if ((N0 == vl0Var2.getAdapter().h() - 1 || (N0 == vl0Var2.getAdapter().h() - 2 && vl0Var2 == xe1Var.f38694a)) && (K = vl0Var2.K(N0)) != null) {
                            int bottom = K.f41610a.getBottom();
                            if (N0 == xe1Var.d.f37249c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (vl0Var2.getMeasuredHeight() - bottom <= i20) {
                                vl0Var2.setTranslationY(-(vl0Var2.getMeasuredHeight() - bottom));
                                vl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        xe1Var.f38694a.setPadding(0, 0, 0, 0);
                        xe1Var.f38695b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && xe1Var.f38698n.getVisibility() == 8 && xe1Var.v != 1) {
                        xe1Var.v = 1;
                        xe1Var.f38698n.setVisibility(0);
                        xe1Var.f38698n.setTranslationY(i20);
                        xe1Var.f38698n.animate().setListener(null).cancel();
                        xe1Var.f38698n.animate().translationY(0.0f).setDuration(200L).setListener(new te1(xe1Var, 1)).start();
                        xe1Var.f38694a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        xe1Var.f38695b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        xe1Var.f38696c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (xe1Var.f38700s.getVisibility() == 0) {
                            vl0Var = xe1Var.f38695b;
                        } else {
                            vl0Var = xe1Var.f38694a;
                        }
                        int height = vl0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            vl0Var.v0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ig1.V((ig1) obj, view);
                return;
            case 10:
                ig1 ig1Var = ((eg1) obj).f32205t0;
                if (view instanceof org.telegram.ui.Cells.ua) {
                    mg.d.m(ig1Var, ig1Var.f33681a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
                    return;
                } else if (view instanceof fg1) {
                    fg1 fg1Var = (fg1) view;
                    mg.d.m(ig1Var, ig1Var.f33681a, fg1Var.N, fg1Var.getMessageId());
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
                nj1 nj1Var = (nj1) obj;
                nj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.f30732n0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f30733o0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = nj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                nj1Var.f35295n = strArr[i10];
                nj1Var.E("", true);
                return;
        }
    }
}
