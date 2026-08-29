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
public final class d21 implements org.telegram.ui.Components.zk0 {
    public final int f37282a;
    public final Object f37283b;

    public d21(Object obj, int i10) {
        this.f37282a = i10;
        this.f37283b = obj;
    }

    @Override
    public final void c(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.jl0 jl0Var;
        org.telegram.ui.Components.jl0 jl0Var2;
        f2.n1 K;
        int i11 = this.f37282a;
        Object obj = this.f37283b;
        switch (i11) {
            case 0:
                i21.U((i21) obj, view);
                return;
            case 1:
                b31.U((b31) obj, view, i10);
                return;
            case 2:
                n61 n61Var = (n61) obj;
                org.telegram.ui.Components.w41 G = n61Var.f40730e0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.f6) view).s(true, true);
                        n61Var.W = (TLObject) G.G;
                        n61Var.U(true);
                        n61Var.f40730e0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((q61) obj).Q(i10, view);
                return;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 5:
                t91 t91Var = (t91) obj;
                ArrayList arrayList = t91Var.J;
                ArrayList arrayList2 = t91Var.K;
                y81 y81Var = t91Var.T;
                int i12 = y81Var.E;
                if (i10 >= i12 && i10 <= y81Var.F) {
                    q91 q91Var = (q91) t91Var.f42611r0.get(i10 - i12);
                    si0 si0Var = new si0(q91Var.f41602b, true, t91Var.f42590b);
                    si0Var.f42402a0 = q91Var;
                    t91Var.presentFragment(si0Var);
                    return;
                }
                int i13 = y81Var.Q;
                if (i10 >= i13 && i10 <= y81Var.R) {
                    ((m91) t91Var.M.get(i10 - i13)).b(t91Var);
                    return;
                }
                int i14 = y81Var.N;
                if (i10 >= i14 && i10 <= y81Var.O) {
                    ((m91) arrayList2.get(i10 - i14)).b(t91Var);
                    return;
                }
                int i15 = y81Var.T;
                if (i10 >= i15 && i10 <= y81Var.U) {
                    ((m91) t91Var.L.get(i10 - i15)).b(t91Var);
                    return;
                } else if (i10 == y81Var.V) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = t91Var.T.V;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    y81 y81Var2 = t91Var.T;
                    if (y81Var2 != null) {
                        y81Var2.E();
                        t91Var.O.setItemAnimator(t91Var.U);
                        t91Var.T.s(i16 + 1, size);
                        t91Var.T.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                qc1 qc1Var = (qc1) obj;
                if (qc1Var.S0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qc1Var.Z0(i10);
                if (qc1Var.S0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    qc1Var.M0();
                    qc1Var.l1();
                }
                qc1Var.n1();
                org.telegram.ui.Components.a81 a81Var = qc1Var.F0[1];
                if (qc1Var.S0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                a81Var.a(z12, true);
                qc1Var.L0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    qc1Var.L0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > qc1Var.L0.getMeasuredWidth()) {
                    wa1 wa1Var = qc1Var.L0;
                    wa1Var.v0(i18 - wa1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 7:
                md1 md1Var = (md1) obj;
                int i19 = md1Var.D;
                HashSet hashSet = md1Var.f40537w;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) e4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f22392id))) {
                        hashSet.remove(Long.valueOf(chat.f22392id));
                        e4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f22392id));
                        e4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && md1Var.v != -1 && md1Var.f40534n.getVisibility() == 0) {
                        md1Var.v = -1;
                        md1Var.f40534n.animate().setListener(null).cancel();
                        md1Var.f40534n.animate().translationY(i19).setDuration(200L).setListener(new id1(md1Var, 0)).start();
                        if (md1Var.f40536s.getVisibility() == 0) {
                            jl0Var2 = md1Var.f40530b;
                        } else {
                            jl0Var2 = md1Var.f40529a;
                        }
                        jl0Var2.d1(false);
                        int N0 = ((f2.j0) jl0Var2.getLayoutManager()).N0();
                        if ((N0 == jl0Var2.getAdapter().h() - 1 || (N0 == jl0Var2.getAdapter().h() - 2 && jl0Var2 == md1Var.f40529a)) && (K = jl0Var2.K(N0)) != null) {
                            int bottom = K.f6432a.getBottom();
                            if (N0 == md1Var.d.f39516c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (jl0Var2.getMeasuredHeight() - bottom <= i19) {
                                jl0Var2.setTranslationY(-(jl0Var2.getMeasuredHeight() - bottom));
                                jl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        md1Var.f40529a.setPadding(0, 0, 0, 0);
                        md1Var.f40530b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && md1Var.f40534n.getVisibility() == 8 && md1Var.v != 1) {
                        md1Var.v = 1;
                        md1Var.f40534n.setVisibility(0);
                        md1Var.f40534n.setTranslationY(i19);
                        md1Var.f40534n.animate().setListener(null).cancel();
                        md1Var.f40534n.animate().translationY(0.0f).setDuration(200L).setListener(new id1(md1Var, 1)).start();
                        md1Var.f40529a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(12.0f));
                        md1Var.f40530b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        md1Var.f40531c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (md1Var.f40536s.getVisibility() == 0) {
                            jl0Var = md1Var.f40530b;
                        } else {
                            jl0Var = md1Var.f40529a;
                        }
                        int height = jl0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            jl0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ze1.V((ze1) obj, view);
                return;
            case 9:
                ze1 ze1Var = ((ve1) obj).f43574p0;
                if (view instanceof org.telegram.ui.Cells.ma) {
                    yf.d.m(ze1Var, ze1Var.f45155a, ((org.telegram.ui.Cells.ma) view).getTopic(), 0);
                    return;
                } else if (view instanceof we1) {
                    we1 we1Var = (we1) view;
                    yf.d.m(ze1Var, ze1Var.f45155a, we1Var.J, we1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 10:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                return;
            case 11:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                return;
            default:
                ci1 ci1Var = (ci1) obj;
                ci1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f9 = u3.c.f(string, " ");
                String[] strArr = WallpapersListActivity.f36364j0;
                f9.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f36365k0[i10]));
                SpannableString spannableString = new SpannableString(f9.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ci1Var.A;
                wallpapersListActivity.H.setSearchFieldCaption(spannableString);
                wallpapersListActivity.H.setSearchFieldHint(null);
                wallpapersListActivity.H.H("", true);
                ci1Var.f37146n = strArr[i10];
                ci1Var.E("", true);
                return;
        }
    }
}
