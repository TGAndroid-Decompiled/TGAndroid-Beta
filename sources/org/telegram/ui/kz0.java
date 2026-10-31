package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kz0 implements org.telegram.ui.Components.gk0 {
    public final int f39000a;
    public final Object f39001b;

    public kz0(Object obj, int i10) {
        this.f39000a = i10;
        this.f39001b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.tk0 tk0Var;
        org.telegram.ui.Components.tk0 tk0Var2;
        s4.c1 K;
        int i11 = this.f39000a;
        Object obj = this.f39001b;
        switch (i11) {
            case 0:
                pz0.Y((pz0) obj, view);
                return;
            case 1:
                e01.Y((e01) obj, view, i10);
                return;
            case 2:
                l01.Z((l01) obj, i10);
                return;
            case 3:
                s31 s31Var = (s31) obj;
                org.telegram.ui.Components.a51 G = s31Var.a2.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.k6) view).y(true, true);
                        s31Var.S1 = (TLObject) G.G;
                        s31Var.f1(true);
                        s31Var.a2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((t31) obj).e1(i10, view);
                return;
            case 5:
                SessionsActivity.Y((SessionsActivity) obj, i10);
                return;
            case 6:
                u61 u61Var = (u61) obj;
                ArrayList arrayList = u61Var.N;
                ArrayList arrayList2 = u61Var.O;
                z51 z51Var = u61Var.W;
                int i12 = z51Var.I;
                if (i10 >= i12 && i10 <= z51Var.J) {
                    r61 r61Var = (r61) u61Var.f42056y0.get(i10 - i12);
                    sh0 sh0Var = new sh0(u61Var.f42025b, r61Var.f41150b, true);
                    sh0Var.f41519e0 = r61Var;
                    u61Var.presentFragment(sh0Var);
                    return;
                }
                int i13 = z51Var.U;
                if (i10 >= i13 && i10 <= z51Var.V) {
                    ((n61) u61Var.Q.get(i10 - i13)).b(u61Var);
                    return;
                }
                int i14 = z51Var.R;
                if (i10 >= i14 && i10 <= z51Var.S) {
                    ((n61) arrayList2.get(i10 - i14)).b(u61Var);
                    return;
                }
                int i15 = z51Var.X;
                if (i10 >= i15 && i10 <= z51Var.Y) {
                    ((n61) u61Var.P.get(i10 - i15)).b(u61Var);
                    return;
                } else if (i10 == z51Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = u61Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    z51 z51Var2 = u61Var.W;
                    if (z51Var2 != null) {
                        z51Var2.E();
                        u61Var.S.setItemAnimator(u61Var.X);
                        u61Var.W.o(i16 + 1, size);
                        u61Var.W.s(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                m91 m91Var = (m91) obj;
                if (m91Var.X0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m91Var.d1(i10);
                if (m91Var.X0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    m91Var.P0();
                    m91Var.p1();
                }
                m91Var.r1();
                org.telegram.ui.Components.x71 x71Var = m91Var.K0[1];
                if (m91Var.X0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                x71Var.a(z12, true);
                m91Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i17 = left - L;
                if (i17 < 0) {
                    m91Var.Q0.w0(i17, 0, null);
                    return;
                }
                int i18 = right + L;
                if (i18 > m91Var.Q0.getMeasuredWidth()) {
                    w71 w71Var = m91Var.Q0;
                    w71Var.w0(i18 - w71Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                ea1 ea1Var = (ea1) obj;
                int i19 = ea1Var.H;
                HashSet hashSet = ea1Var.f37007x;
                if (view instanceof org.telegram.ui.Cells.j4) {
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) j4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f19793id))) {
                        hashSet.remove(Long.valueOf(chat.f19793id));
                        j4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f19793id));
                        j4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ea1Var.f37006w != -1 && ea1Var.f37003n.getVisibility() == 0) {
                        ea1Var.f37006w = -1;
                        ea1Var.f37003n.animate().setListener(null).cancel();
                        ea1Var.f37003n.animate().translationY(i19).setDuration(200L).setListener(new aa1(ea1Var, 0)).start();
                        if (ea1Var.f37005s.getVisibility() == 0) {
                            tk0Var2 = ea1Var.f37000b;
                        } else {
                            tk0Var2 = ea1Var.f36999a;
                        }
                        tk0Var2.d1(false);
                        int N0 = ((s4.a0) tk0Var2.getLayoutManager()).N0();
                        if ((N0 == tk0Var2.getAdapter().b() - 1 || (N0 == tk0Var2.getAdapter().b() - 2 && tk0Var2 == ea1Var.f36999a)) && (K = tk0Var2.K(N0)) != null) {
                            int bottom = K.f47898a.getBottom();
                            if (N0 == ea1Var.d.f36151c - 2) {
                                bottom += org.telegram.messenger.i0.L(12.0f);
                            }
                            if (tk0Var2.getMeasuredHeight() - bottom <= i19) {
                                tk0Var2.setTranslationY(-(tk0Var2.getMeasuredHeight() - bottom));
                                tk0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ea1Var.f36999a.setPadding(0, 0, 0, 0);
                        ea1Var.f37000b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ea1Var.f37003n.getVisibility() == 8 && ea1Var.f37006w != 1) {
                        ea1Var.f37006w = 1;
                        ea1Var.f37003n.setVisibility(0);
                        ea1Var.f37003n.setTranslationY(i19);
                        ea1Var.f37003n.animate().setListener(null).cancel();
                        ea1Var.f37003n.animate().translationY(0.0f).setDuration(200L).setListener(new aa1(ea1Var, 1)).start();
                        ea1Var.f36999a.setPadding(0, 0, 0, i19 - org.telegram.messenger.i0.L(12.0f));
                        ea1Var.f37000b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        ea1Var.f37001c.setText(org.telegram.messenger.cd.a0("LeaveChats", null, 2131749009, org.telegram.messenger.cd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ea1Var.f37005s.getVisibility() == 0) {
                            tk0Var = ea1Var.f37000b;
                        } else {
                            tk0Var = ea1Var.f36999a;
                        }
                        int height = tk0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            tk0Var.w0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                pb1.Z((pb1) obj, view);
                return;
            case 10:
                pb1 pb1Var = ((lb1) obj).f39169v0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    gg.e.m(pb1Var, pb1Var.f40566a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof mb1) {
                    mb1 mb1Var = (mb1) view;
                    gg.e.m(pb1Var, pb1Var.f40566a, mb1Var.N, mb1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.g0((TwoStepVerificationActivity) obj, i10);
                return;
            case 12:
                WallpapersListActivity.Y((WallpapersListActivity) obj, i10);
                return;
            default:
                pe1 pe1Var = (pe1) obj;
                String L0 = org.telegram.messenger.cd.L0(2131753738, null);
                StringBuilder i20 = sc.e.i(L0, " ");
                String[] strArr = WallpapersListActivity.f35472j0;
                SpannableString spannableString = new SpannableString(a1.g.m(strArr[i10], WallpapersListActivity.f35473k0[i10], i20));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B8, false)), L0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = pe1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                pe1Var.f40653n = strArr[i10];
                pe1Var.E("", true);
                return;
        }
    }
}
