package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nx0 implements org.telegram.ui.Components.fj0 {
    public final int f48140a;
    public final Object f48141b;

    public nx0(Object obj, int i3) {
        this.f48140a = i3;
        this.f48141b = obj;
    }

    @Override
    public final void f(int i3, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.tj0 tj0Var;
        org.telegram.ui.Components.tj0 tj0Var2;
        u4.d1 K;
        int i10 = this.f48140a;
        Object obj = this.f48141b;
        switch (i10) {
            case 0:
                sx0.Z((sx0) obj, view);
                return;
            case 1:
                gy0.Z((gy0) obj, view, i3);
                return;
            case 2:
                ny0.a0((ny0) obj, i3);
                return;
            case 3:
                q11 q11Var = (q11) obj;
                org.telegram.ui.Components.r31 G = q11Var.f48731b2.G(i3 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.f6) view).w(true, true);
                        q11Var.T1 = (TLObject) G.G;
                        q11Var.f1(true);
                        q11Var.f48731b2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((s11) obj).e1(i3, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i3);
                return;
            case 6:
                r41 r41Var = (r41) obj;
                ArrayList arrayList = r41Var.O;
                ArrayList arrayList2 = r41Var.P;
                w31 w31Var = r41Var.X;
                int i11 = w31Var.J;
                if (i3 >= i11 && i3 <= w31Var.K) {
                    o41 o41Var = (o41) r41Var.f49098z0.get(i3 - i11);
                    dg0 dg0Var = new dg0(r41Var.f49065b, o41Var.f48186b, true);
                    dg0Var.f44701f0 = o41Var;
                    r41Var.presentFragment(dg0Var);
                    return;
                }
                int i12 = w31Var.V;
                if (i3 >= i12 && i3 <= w31Var.W) {
                    ((k41) r41Var.R.get(i3 - i12)).b(r41Var);
                    return;
                }
                int i13 = w31Var.S;
                if (i3 >= i13 && i3 <= w31Var.T) {
                    ((k41) arrayList2.get(i3 - i13)).b(r41Var);
                    return;
                }
                int i14 = w31Var.Y;
                if (i3 >= i14 && i3 <= w31Var.Z) {
                    ((k41) r41Var.Q.get(i3 - i14)).b(r41Var);
                    return;
                } else if (i3 == w31Var.f50690a0) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = r41Var.X.f50690a0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    w31 w31Var2 = r41Var.X;
                    if (w31Var2 != null) {
                        w31Var2.E();
                        r41Var.T.setItemAnimator(r41Var.Y);
                        r41Var.X.o(i15 + 1, size);
                        r41Var.X.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                l71 l71Var = (l71) obj;
                if (l71Var.Y0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l71Var.e1(i3);
                if (l71Var.Y0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    l71Var.Q0();
                    l71Var.q1();
                }
                l71Var.s1();
                org.telegram.ui.Components.o61 o61Var = l71Var.L0[1];
                if (l71Var.Y0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o61Var.a(z12, true);
                l71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    l71Var.R0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > l71Var.R0.getMeasuredWidth()) {
                    u51 u51Var = l71Var.R0;
                    u51Var.w0(i17 - u51Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                d81 d81Var = (d81) obj;
                int i18 = d81Var.I;
                HashSet hashSet = d81Var.f44602x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f27001id))) {
                        hashSet.remove(Long.valueOf(chat.f27001id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f27001id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && d81Var.f44601w != -1 && d81Var.f44598n.getVisibility() == 0) {
                        d81Var.f44601w = -1;
                        d81Var.f44598n.animate().setListener(null).cancel();
                        d81Var.f44598n.animate().translationY(i18).setDuration(200L).setListener(new z71(d81Var, 0)).start();
                        if (d81Var.f44600s.getVisibility() == 0) {
                            tj0Var2 = d81Var.f44594b;
                        } else {
                            tj0Var2 = d81Var.f44593a;
                        }
                        tj0Var2.d1(false);
                        int N0 = ((u4.b0) tj0Var2.getLayoutManager()).N0();
                        if ((N0 == tj0Var2.getAdapter().b() - 1 || (N0 == tj0Var2.getAdapter().b() - 2 && tj0Var2 == d81Var.f44593a)) && (K = tj0Var2.K(N0)) != null) {
                            int bottom = K.f55540a.getBottom();
                            if (N0 == d81Var.d.f43684c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (tj0Var2.getMeasuredHeight() - bottom <= i18) {
                                tj0Var2.setTranslationY(-(tj0Var2.getMeasuredHeight() - bottom));
                                tj0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        d81Var.f44593a.setPadding(0, 0, 0, 0);
                        d81Var.f44594b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && d81Var.f44598n.getVisibility() == 8 && d81Var.f44601w != 1) {
                        d81Var.f44601w = 1;
                        d81Var.f44598n.setVisibility(0);
                        d81Var.f44598n.setTranslationY(i18);
                        d81Var.f44598n.animate().setListener(null).cancel();
                        d81Var.f44598n.animate().translationY(0.0f).setDuration(200L).setListener(new z71(d81Var, 1)).start();
                        d81Var.f44593a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        d81Var.f44594b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        d81Var.f44595c.setText(org.telegram.messenger.bd.a0("LeaveChats", null, 2131749007, org.telegram.messenger.bd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (d81Var.f44600s.getVisibility() == 0) {
                            tj0Var = d81Var.f44594b;
                        } else {
                            tj0Var = d81Var.f44593a;
                        }
                        int height = tj0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            tj0Var.w0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                m91.a0((m91) obj, view);
                return;
            case 10:
                m91 m91Var = ((i91) obj).f46222w0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    rg.c.m(m91Var, m91Var.f47575a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof j91) {
                    j91 j91Var = (j91) view;
                    rg.c.m(m91Var, m91Var.f47575a, j91Var.O, j91Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i3);
                return;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i3);
                return;
            default:
                nc1 nc1Var = (nc1) obj;
                String M0 = org.telegram.messenger.bd.M0(2131753738, null);
                StringBuilder h = t4.c.h(M0, " ");
                String[] strArr = WallpapersListActivity.f43522k0;
                SpannableString spannableString = new SpannableString(k2.p1.k(WallpapersListActivity.f43523l0[i3], strArr[i3], h));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = nc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.P("", true);
                nc1Var.f47970n = strArr[i3];
                nc1Var.E("", true);
                return;
        }
    }
}
