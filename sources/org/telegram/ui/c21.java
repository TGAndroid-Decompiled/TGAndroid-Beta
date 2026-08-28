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
public final class c21 implements org.telegram.ui.Components.mk0 {
    public final int f37050a;
    public final Object f37051b;

    public c21(Object obj, int i9) {
        this.f37050a = i9;
        this.f37051b = obj;
    }

    @Override
    public final void a(int i9, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.wk0 wk0Var;
        org.telegram.ui.Components.wk0 wk0Var2;
        f2.q1 K;
        int i10 = this.f37050a;
        Object obj = this.f37051b;
        switch (i10) {
            case 0:
                h21.T((h21) obj, view);
                return;
            case 1:
                b31.T((b31) obj, view, i9);
                return;
            case 2:
                l61 l61Var = (l61) obj;
                org.telegram.ui.Components.l41 G = l61Var.f40068e0.G(i9 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        l61Var.W = (TLObject) G.G;
                        l61Var.T(true);
                        l61Var.f40068e0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((o61) obj).P(i9, view);
                return;
            case 4:
                SessionsActivity.T((SessionsActivity) obj, i9);
                return;
            case 5:
                s91 s91Var = (s91) obj;
                ArrayList arrayList = s91Var.J;
                ArrayList arrayList2 = s91Var.K;
                x81 x81Var = s91Var.T;
                int i11 = x81Var.E;
                if (i9 >= i11 && i9 <= x81Var.F) {
                    p91 p91Var = (p91) s91Var.f42629r0.get(i9 - i11);
                    ti0 ti0Var = new ti0(p91Var.f41381b, true, s91Var.f42608b);
                    ti0Var.f43011a0 = p91Var;
                    s91Var.presentFragment(ti0Var);
                    return;
                }
                int i12 = x81Var.Q;
                if (i9 >= i12 && i9 <= x81Var.R) {
                    ((l91) s91Var.M.get(i9 - i12)).b(s91Var);
                    return;
                }
                int i13 = x81Var.N;
                if (i9 >= i13 && i9 <= x81Var.O) {
                    ((l91) arrayList2.get(i9 - i13)).b(s91Var);
                    return;
                }
                int i14 = x81Var.T;
                if (i9 >= i14 && i9 <= x81Var.U) {
                    ((l91) s91Var.L.get(i9 - i14)).b(s91Var);
                    return;
                } else if (i9 == x81Var.V) {
                    int size = arrayList.size() - arrayList2.size();
                    int i15 = s91Var.T.V;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    x81 x81Var2 = s91Var.T;
                    if (x81Var2 != null) {
                        x81Var2.E();
                        s91Var.O.setItemAnimator(s91Var.U);
                        s91Var.T.s(i15 + 1, size);
                        s91Var.T.u(i15);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                oc1 oc1Var = (oc1) obj;
                if (oc1Var.S0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                oc1Var.Z0(i9);
                if (oc1Var.S0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    oc1Var.M0();
                    oc1Var.l1();
                }
                oc1Var.n1();
                org.telegram.ui.Components.o71 o71Var = oc1Var.F0[1];
                if (oc1Var.S0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o71Var.a(z12, true);
                oc1Var.L0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i16 = left - dp;
                if (i16 < 0) {
                    oc1Var.L0.v0(i16, 0, null);
                    return;
                }
                int i17 = right + dp;
                if (i17 > oc1Var.L0.getMeasuredWidth()) {
                    va1 va1Var = oc1Var.L0;
                    va1Var.v0(i17 - va1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 7:
                kd1 kd1Var = (kd1) obj;
                int i18 = kd1Var.D;
                HashSet hashSet = kd1Var.f39816w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f22380id))) {
                        hashSet.remove(Long.valueOf(chat.f22380id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f22380id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && kd1Var.v != -1 && kd1Var.f39813n.getVisibility() == 0) {
                        kd1Var.v = -1;
                        kd1Var.f39813n.animate().setListener(null).cancel();
                        kd1Var.f39813n.animate().translationY(i18).setDuration(200L).setListener(new gd1(kd1Var, 0)).start();
                        if (kd1Var.f39815s.getVisibility() == 0) {
                            wk0Var2 = kd1Var.f39809b;
                        } else {
                            wk0Var2 = kd1Var.f39808a;
                        }
                        wk0Var2.d1(false);
                        int N0 = ((f2.m0) wk0Var2.getLayoutManager()).N0();
                        if ((N0 == wk0Var2.getAdapter().h() - 1 || (N0 == wk0Var2.getAdapter().h() - 2 && wk0Var2 == kd1Var.f39808a)) && (K = wk0Var2.K(N0)) != null) {
                            int bottom = K.f5501a.getBottom();
                            if (N0 == kd1Var.d.f38755c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (wk0Var2.getMeasuredHeight() - bottom <= i18) {
                                wk0Var2.setTranslationY(-(wk0Var2.getMeasuredHeight() - bottom));
                                wk0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        kd1Var.f39808a.setPadding(0, 0, 0, 0);
                        kd1Var.f39809b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && kd1Var.f39813n.getVisibility() == 8 && kd1Var.v != 1) {
                        kd1Var.v = 1;
                        kd1Var.f39813n.setVisibility(0);
                        kd1Var.f39813n.setTranslationY(i18);
                        kd1Var.f39813n.animate().setListener(null).cancel();
                        kd1Var.f39813n.animate().translationY(0.0f).setDuration(200L).setListener(new gd1(kd1Var, 1)).start();
                        kd1Var.f39808a.setPadding(0, 0, 0, i18 - AndroidUtilities.dp(12.0f));
                        kd1Var.f39809b.setPadding(0, 0, 0, i18);
                    }
                    if (!hashSet.isEmpty()) {
                        kd1Var.f39810c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (kd1Var.f39815s.getVisibility() == 0) {
                            wk0Var = kd1Var.f39809b;
                        } else {
                            wk0Var = kd1Var.f39808a;
                        }
                        int height = wk0Var.getHeight() - view.getBottom();
                        if (height < i18) {
                            wk0Var.v0(0, i18 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                we1.U((we1) obj, view);
                return;
            case 9:
                we1 we1Var = ((re1) obj).f42407p0;
                if (view instanceof org.telegram.ui.Cells.pa) {
                    vf.c.m(we1Var, we1Var.f43741a, ((org.telegram.ui.Cells.pa) view).getTopic(), 0);
                    return;
                } else if (view instanceof se1) {
                    se1 se1Var = (se1) view;
                    vf.c.m(we1Var, we1Var.f43741a, se1Var.J, se1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 10:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj, i9);
                return;
            case 11:
                WallpapersListActivity.U((WallpapersListActivity) obj, i9);
                return;
            default:
                bi1 bi1Var = (bi1) obj;
                bi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder e10 = ta.b.e(string, " ");
                String[] strArr = WallpapersListActivity.f36299j0;
                e10.append(LocaleController.getString(strArr[i9], WallpapersListActivity.f36300k0[i9]));
                SpannableString spannableString = new SpannableString(e10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bi1Var.A;
                wallpapersListActivity.H.setSearchFieldCaption(spannableString);
                wallpapersListActivity.H.setSearchFieldHint(null);
                wallpapersListActivity.H.H("", true);
                bi1Var.f36870n = strArr[i9];
                bi1Var.E("", true);
                return;
        }
    }
}
