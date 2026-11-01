package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jz0 implements org.telegram.ui.Components.hk0 {
    public final int f38606a;
    public final Object f38607b;

    public jz0(Object obj, int i10) {
        this.f38606a = i10;
        this.f38607b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.uk0 uk0Var;
        org.telegram.ui.Components.uk0 uk0Var2;
        s4.c1 K;
        int i11 = this.f38606a;
        Object obj = this.f38607b;
        switch (i11) {
            case 0:
                oz0.Z((oz0) obj, view);
                return;
            case 1:
                e01.Z((e01) obj, view, i10);
                return;
            case 2:
                l01.a0((l01) obj, i10);
                return;
            case 3:
                q31 q31Var = (q31) obj;
                org.telegram.ui.Components.b51 G = q31Var.a2.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.k6) view).y(true, true);
                        q31Var.S1 = (TLObject) G.G;
                        q31Var.f1(true);
                        q31Var.a2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((r31) obj).e1(i10, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i10);
                return;
            case 6:
                s61 s61Var = (s61) obj;
                ArrayList arrayList = s61Var.N;
                ArrayList arrayList2 = s61Var.O;
                x51 x51Var = s61Var.W;
                int i12 = x51Var.I;
                if (i10 >= i12 && i10 <= x51Var.J) {
                    p61 p61Var = (p61) s61Var.f41269y0.get(i10 - i12);
                    qh0 qh0Var = new qh0(s61Var.f41238b, p61Var.f40379b, true);
                    qh0Var.f40787e0 = p61Var;
                    s61Var.presentFragment(qh0Var);
                    return;
                }
                int i13 = x51Var.U;
                if (i10 >= i13 && i10 <= x51Var.V) {
                    ((l61) s61Var.Q.get(i10 - i13)).b(s61Var);
                    return;
                }
                int i14 = x51Var.R;
                if (i10 >= i14 && i10 <= x51Var.S) {
                    ((l61) arrayList2.get(i10 - i14)).b(s61Var);
                    return;
                }
                int i15 = x51Var.X;
                if (i10 >= i15 && i10 <= x51Var.Y) {
                    ((l61) s61Var.P.get(i10 - i15)).b(s61Var);
                    return;
                } else if (i10 == x51Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = s61Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    x51 x51Var2 = s61Var.W;
                    if (x51Var2 != null) {
                        x51Var2.E();
                        s61Var.S.setItemAnimator(s61Var.X);
                        s61Var.W.o(i16 + 1, size);
                        s61Var.W.s(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                k91 k91Var = (k91) obj;
                if (k91Var.X0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k91Var.e1(i10);
                if (k91Var.X0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    k91Var.Q0();
                    k91Var.q1();
                }
                k91Var.s1();
                org.telegram.ui.Components.y71 y71Var = k91Var.K0[1];
                if (k91Var.X0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                y71Var.a(z12, true);
                k91Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i17 = left - L;
                if (i17 < 0) {
                    k91Var.Q0.w0(i17, 0, null);
                    return;
                }
                int i18 = right + L;
                if (i18 > k91Var.Q0.getMeasuredWidth()) {
                    u71 u71Var = k91Var.Q0;
                    u71Var.w0(i18 - u71Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                ca1 ca1Var = (ca1) obj;
                int i19 = ca1Var.H;
                HashSet hashSet = ca1Var.f36278x;
                if (view instanceof org.telegram.ui.Cells.j4) {
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) j4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f19794id))) {
                        hashSet.remove(Long.valueOf(chat.f19794id));
                        j4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f19794id));
                        j4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ca1Var.f36277w != -1 && ca1Var.f36274n.getVisibility() == 0) {
                        ca1Var.f36277w = -1;
                        ca1Var.f36274n.animate().setListener(null).cancel();
                        ca1Var.f36274n.animate().translationY(i19).setDuration(200L).setListener(new y91(ca1Var, 0)).start();
                        if (ca1Var.f36276s.getVisibility() == 0) {
                            uk0Var2 = ca1Var.f36271b;
                        } else {
                            uk0Var2 = ca1Var.f36270a;
                        }
                        uk0Var2.d1(false);
                        int N0 = ((s4.a0) uk0Var2.getLayoutManager()).N0();
                        if ((N0 == uk0Var2.getAdapter().b() - 1 || (N0 == uk0Var2.getAdapter().b() - 2 && uk0Var2 == ca1Var.f36270a)) && (K = uk0Var2.K(N0)) != null) {
                            int bottom = K.f47909a.getBottom();
                            if (N0 == ca1Var.d.f43856c - 2) {
                                bottom += org.telegram.messenger.i0.L(12.0f);
                            }
                            if (uk0Var2.getMeasuredHeight() - bottom <= i19) {
                                uk0Var2.setTranslationY(-(uk0Var2.getMeasuredHeight() - bottom));
                                uk0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ca1Var.f36270a.setPadding(0, 0, 0, 0);
                        ca1Var.f36271b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ca1Var.f36274n.getVisibility() == 8 && ca1Var.f36277w != 1) {
                        ca1Var.f36277w = 1;
                        ca1Var.f36274n.setVisibility(0);
                        ca1Var.f36274n.setTranslationY(i19);
                        ca1Var.f36274n.animate().setListener(null).cancel();
                        ca1Var.f36274n.animate().translationY(0.0f).setDuration(200L).setListener(new y91(ca1Var, 1)).start();
                        ca1Var.f36270a.setPadding(0, 0, 0, i19 - org.telegram.messenger.i0.L(12.0f));
                        ca1Var.f36271b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        ca1Var.f36272c.setText(org.telegram.messenger.dd.a0("LeaveChats", null, 2131749009, org.telegram.messenger.dd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ca1Var.f36276s.getVisibility() == 0) {
                            uk0Var = ca1Var.f36271b;
                        } else {
                            uk0Var = ca1Var.f36270a;
                        }
                        int height = uk0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            uk0Var.w0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                nb1.a0((nb1) obj, view);
                return;
            case 10:
                nb1 nb1Var = ((jb1) obj).f38356v0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    gg.e.m(nb1Var, nb1Var.f39797a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof kb1) {
                    kb1 kb1Var = (kb1) view;
                    gg.e.m(nb1Var, nb1Var.f39797a, kb1Var.N, kb1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i10);
                return;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i10);
                return;
            default:
                ne1 ne1Var = (ne1) obj;
                String L0 = org.telegram.messenger.dd.L0(2131753738, null);
                StringBuilder i20 = sc.e.i(L0, " ");
                String[] strArr = WallpapersListActivity.f35479j0;
                SpannableString spannableString = new SpannableString(a1.g.m(strArr[i10], WallpapersListActivity.f35480k0[i10], i20));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B8, false)), L0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ne1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                ne1Var.f39889n = strArr[i10];
                ne1Var.E("", true);
                return;
        }
    }
}
