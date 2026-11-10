package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ay0 implements org.telegram.ui.Components.bj0 {
    public final int f43841a;
    public final Object f43842b;

    public ay0(Object obj, int i7) {
        this.f43841a = i7;
        this.f43842b = obj;
    }

    @Override
    public final void c(int i7, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.pj0 pj0Var;
        org.telegram.ui.Components.pj0 pj0Var2;
        v4.d1 K;
        int i10 = this.f43841a;
        Object obj = this.f43842b;
        switch (i10) {
            case 0:
                fy0.Z((fy0) obj, view);
                return;
            case 1:
                uy0.Z((uy0) obj, view, i7);
                return;
            case 2:
                bz0.a0((bz0) obj, i7);
                return;
            case 3:
                d21 d21Var = (d21) obj;
                org.telegram.ui.Components.x31 G = d21Var.d2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        d21Var.V1 = (TLObject) G.G;
                        d21Var.f1(true);
                        d21Var.d2.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((f21) obj).e1(i7, view);
                return;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                return;
            case 6:
                e51 e51Var = (e51) obj;
                ArrayList arrayList = e51Var.N;
                ArrayList arrayList2 = e51Var.O;
                i41 i41Var = e51Var.W;
                int i11 = i41Var.I;
                if (i7 >= i11 && i7 <= i41Var.J) {
                    b51 b51Var = (b51) e51Var.f45172y0.get(i7 - i11);
                    mg0 mg0Var = new mg0(e51Var.f45140b, b51Var.f43931b, true);
                    mg0Var.f47961e0 = b51Var;
                    e51Var.presentFragment(mg0Var);
                    return;
                }
                int i12 = i41Var.U;
                if (i7 >= i12 && i7 <= i41Var.V) {
                    ((x41) e51Var.Q.get(i7 - i12)).b(e51Var);
                    return;
                }
                int i13 = i41Var.R;
                if (i7 >= i13 && i7 <= i41Var.S) {
                    ((x41) arrayList2.get(i7 - i13)).b(e51Var);
                    return;
                }
                int i14 = i41Var.X;
                if (i7 >= i14 && i7 <= i41Var.Y) {
                    ((x41) e51Var.P.get(i7 - i14)).b(e51Var);
                    return;
                } else if (i7 == i41Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = e51Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    i41 i41Var2 = e51Var.W;
                    if (i41Var2 != null) {
                        i41Var2.E();
                        e51Var.S.setItemAnimator(e51Var.X);
                        e51Var.W.o(i15 + 1, size);
                        e51Var.W.s(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                x71 x71Var = (x71) obj;
                if (x71Var.X0 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                x71Var.e1(i7);
                if (x71Var.X0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10) {
                    x71Var.Q0();
                    x71Var.q1();
                }
                x71Var.s1();
                org.telegram.ui.Components.w61 w61Var = x71Var.K0[1];
                if (x71Var.X0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w61Var.a(z11, true);
                x71Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i16 = left - L;
                if (i16 < 0) {
                    x71Var.Q0.w0(i16, 0, null);
                    return;
                }
                int i17 = right + L;
                if (i17 > x71Var.Q0.getMeasuredWidth()) {
                    g61 g61Var = x71Var.Q0;
                    g61Var.w0(i17 - g61Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                p81 p81Var = (p81) obj;
                int i18 = p81Var.H;
                HashSet hashSet = p81Var.f48723x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f26960id))) {
                        hashSet.remove(Long.valueOf(chat.f26960id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f26960id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && p81Var.f48722w != -1 && p81Var.f48719n.getVisibility() == 0) {
                        p81Var.f48722w = -1;
                        p81Var.f48719n.animate().setListener(null).cancel();
                        p81Var.f48719n.animate().translationY(i18).setDuration(200L).setListener(new l81(p81Var, 0)).start();
                        if (p81Var.f48721s.getVisibility() == 0) {
                            pj0Var2 = p81Var.f48715b;
                        } else {
                            pj0Var2 = p81Var.f48714a;
                        }
                        pj0Var2.d1(false);
                        int N0 = ((v4.b0) pj0Var2.getLayoutManager()).N0();
                        if ((N0 == pj0Var2.getAdapter().b() - 1 || (N0 == pj0Var2.getAdapter().b() - 2 && pj0Var2 == p81Var.f48714a)) && (K = pj0Var2.K(N0)) != null) {
                            int bottom = K.f57052a.getBottom();
                            if (N0 == p81Var.d.f47857c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (pj0Var2.getMeasuredHeight() - bottom <= i18) {
                                pj0Var2.setTranslationY(-(pj0Var2.getMeasuredHeight() - bottom));
                                pj0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        p81Var.f48714a.setPadding(0, 0, 0, 0);
                        p81Var.f48715b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && p81Var.f48719n.getVisibility() == 8 && p81Var.f48722w != 1) {
                        p81Var.f48722w = 1;
                        p81Var.f48719n.setVisibility(0);
                        p81Var.f48719n.setTranslationY(i18);
                        p81Var.f48719n.animate().setListener(null).cancel();
                        p81Var.f48719n.animate().translationY(0.0f).setDuration(200L).setListener(new l81(p81Var, 1)).start();
                        p81Var.f48714a.setPadding(0, 0, 0, i18 - org.telegram.messenger.g0.L(12.0f));
                        p81Var.f48715b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        p81Var.f48716c.setText(org.telegram.messenger.id.a0("LeaveChats", null, 2131748999, org.telegram.messenger.id.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (p81Var.f48721s.getVisibility() == 0) {
                            pj0Var = p81Var.f48715b;
                        } else {
                            pj0Var = p81Var.f48714a;
                        }
                        int height = pj0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            pj0Var.w0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                z91.a0((z91) obj, view);
                return;
            case 10:
                z91 z91Var = ((v91) obj).f50682v0;
                if (view instanceof org.telegram.ui.Cells.ja) {
                    qg.d.m(z91Var, z91Var.f52343a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    return;
                } else if (view instanceof w91) {
                    w91 w91Var = (w91) view;
                    qg.d.m(z91Var, z91Var.f52343a, w91Var.N, w91Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i7);
                return;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i7);
                return;
            default:
                wc1 wc1Var = (wc1) obj;
                String M0 = org.telegram.messenger.id.M0(2131753738, null);
                StringBuilder j3 = rf.b.j(M0, " ");
                String[] strArr = WallpapersListActivity.f43488j0;
                SpannableString spannableString = new SpannableString(jg.g.l(WallpapersListActivity.f43489k0[i7], strArr[i7], j3));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = wc1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                wc1Var.f50994n = strArr[i7];
                wc1Var.E("", true);
                return;
        }
    }
}
