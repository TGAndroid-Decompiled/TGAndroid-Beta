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
public final class p21 implements org.telegram.ui.Components.hl0 {
    public final int f36926a;
    public final Object f36927b;

    public p21(Object obj, int i10) {
        this.f36926a = i10;
        this.f36927b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.nq0 nq0Var;
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.rl0 rl0Var;
        org.telegram.ui.Components.rl0 rl0Var2;
        f2.l1 K;
        int i11 = this.f36926a;
        Object obj = this.f36927b;
        switch (i11) {
            case 0:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.rl0 rl0Var3 = t21Var.f38370y;
                org.telegram.ui.Components.hp hpVar = t21Var.f38362b;
                if (hpVar.d.get(i10) != t21Var.H && t21Var.L == null) {
                    t21Var.N = false;
                    t21Var.H = (org.telegram.ui.Components.ip) hpVar.d.get(i10);
                    hpVar.E(i10);
                    t21Var.h.postDelayed(new org.telegram.ui.Components.dw(t21Var, i10, 23), 100L);
                    for (int i12 = 0; i12 < rl0Var3.getChildCount(); i12++) {
                        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) rl0Var3.getChildAt(i12);
                        if (w11Var != view && (nq0Var = w11Var.G) != null) {
                            AndroidUtilities.cancelRunOnUIThread(nq0Var);
                            w11Var.G.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.ip) hpVar.d.get(i10)).f25749a.f19638a) {
                        ((org.telegram.ui.Components.w11) view).d();
                    }
                    e21 e21Var = t21Var.G;
                    if (e21Var != null) {
                        e21Var.f33596a.d0(i10, t21Var.H.f25749a, true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b31.U((b31) obj, view);
                return;
            case 2:
                t31.U((t31) obj, view, i10);
                return;
            case 3:
                i71 i71Var = (i71) obj;
                org.telegram.ui.Components.i51 G = i71Var.f34826f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).s(true, true);
                        i71Var.X = (TLObject) G.G;
                        i71Var.U(true);
                        i71Var.f34826f0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((l71) obj).Q(i10, view);
                return;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 6:
                oa1 oa1Var = (oa1) obj;
                ArrayList arrayList = oa1Var.K;
                ArrayList arrayList2 = oa1Var.L;
                t91 t91Var = oa1Var.U;
                int i13 = t91Var.F;
                if (i10 >= i13 && i10 <= t91Var.G) {
                    la1 la1Var = (la1) oa1Var.f36735s0.get(i10 - i13);
                    cj0 cj0Var = new cj0(la1Var.f35727b, true, oa1Var.f36713b);
                    cj0Var.f33170b0 = la1Var;
                    oa1Var.presentFragment(cj0Var);
                    return;
                }
                int i14 = t91Var.R;
                if (i10 >= i14 && i10 <= t91Var.S) {
                    ((ha1) oa1Var.N.get(i10 - i14)).b(oa1Var);
                    return;
                }
                int i15 = t91Var.O;
                if (i10 >= i15 && i10 <= t91Var.P) {
                    ((ha1) arrayList2.get(i10 - i15)).b(oa1Var);
                    return;
                }
                int i16 = t91Var.U;
                if (i10 >= i16 && i10 <= t91Var.V) {
                    ((ha1) oa1Var.M.get(i10 - i16)).b(oa1Var);
                    return;
                } else if (i10 == t91Var.W) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = oa1Var.U.W;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    t91 t91Var2 = oa1Var.U;
                    if (t91Var2 != null) {
                        t91Var2.E();
                        oa1Var.P.setItemAnimator(oa1Var.V);
                        oa1Var.U.s(i17 + 1, size);
                        oa1Var.U.u(i17);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 7:
                jd1 jd1Var = (jd1) obj;
                if (jd1Var.T0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jd1Var.Z0(i10);
                if (jd1Var.T0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4 == z10) {
                    jd1Var.M0();
                    jd1Var.l1();
                }
                jd1Var.n1();
                org.telegram.ui.Components.m81 m81Var = jd1Var.G0[1];
                if (jd1Var.T0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m81Var.a(z11, true);
                jd1Var.M0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    jd1Var.M0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > jd1Var.M0.getMeasuredWidth()) {
                    rb1 rb1Var = jd1Var.M0;
                    rb1Var.v0(i19 - rb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 8:
                ge1 ge1Var = (ge1) obj;
                int i20 = ge1Var.E;
                HashSet hashSet = ge1Var.f34434w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f19159id))) {
                        hashSet.remove(Long.valueOf(chat.f19159id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f19159id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ge1Var.v != -1 && ge1Var.f34431n.getVisibility() == 0) {
                        ge1Var.v = -1;
                        ge1Var.f34431n.animate().setListener(null).cancel();
                        ge1Var.f34431n.animate().translationY(i20).setDuration(200L).setListener(new ce1(ge1Var, 0)).start();
                        if (ge1Var.f34433s.getVisibility() == 0) {
                            rl0Var2 = ge1Var.f34428b;
                        } else {
                            rl0Var2 = ge1Var.f34427a;
                        }
                        rl0Var2.c1(false);
                        int N0 = ((f2.i0) rl0Var2.getLayoutManager()).N0();
                        if ((N0 == rl0Var2.getAdapter().h() - 1 || (N0 == rl0Var2.getAdapter().h() - 2 && rl0Var2 == ge1Var.f34427a)) && (K = rl0Var2.K(N0)) != null) {
                            int bottom = K.f5774a.getBottom();
                            if (N0 == ge1Var.d.f33451c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (rl0Var2.getMeasuredHeight() - bottom <= i20) {
                                rl0Var2.setTranslationY(-(rl0Var2.getMeasuredHeight() - bottom));
                                rl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ge1Var.f34427a.setPadding(0, 0, 0, 0);
                        ge1Var.f34428b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ge1Var.f34431n.getVisibility() == 8 && ge1Var.v != 1) {
                        ge1Var.v = 1;
                        ge1Var.f34431n.setVisibility(0);
                        ge1Var.f34431n.setTranslationY(i20);
                        ge1Var.f34431n.animate().setListener(null).cancel();
                        ge1Var.f34431n.animate().translationY(0.0f).setDuration(200L).setListener(new ce1(ge1Var, 1)).start();
                        ge1Var.f34427a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        ge1Var.f34428b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        ge1Var.f34429c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ge1Var.f34433s.getVisibility() == 0) {
                            rl0Var = ge1Var.f34428b;
                        } else {
                            rl0Var = ge1Var.f34427a;
                        }
                        int height = rl0Var.getHeight() - view.getBottom();
                        if (height < i20) {
                            rl0Var.v0(0, i20 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                sf1.V((sf1) obj, view);
                return;
            case 10:
                sf1 sf1Var = ((of1) obj).f36792q0;
                if (view instanceof org.telegram.ui.Cells.na) {
                    ag.f.m(sf1Var, sf1Var.f38175a, ((org.telegram.ui.Cells.na) view).getTopic(), 0);
                    return;
                } else if (view instanceof pf1) {
                    pf1 pf1Var = (pf1) view;
                    ag.f.m(sf1Var, sf1Var.f38175a, pf1Var.K, pf1Var.getMessageId());
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
                xi1 xi1Var = (xi1) obj;
                xi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = vh.w2.f(string, " ");
                String[] strArr = WallpapersListActivity.f32374k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f32375l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = xi1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                xi1Var.f39999n = strArr[i10];
                xi1Var.E("", true);
                return;
        }
    }
}
