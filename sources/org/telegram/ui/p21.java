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
public final class p21 implements org.telegram.ui.Components.il0 {
    public final int f37156a;
    public final Object f37157b;

    public p21(Object obj, int i10) {
        this.f37156a = i10;
        this.f37157b = obj;
    }

    @Override
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.sl0 sl0Var;
        org.telegram.ui.Components.sl0 sl0Var2;
        f2.l1 K;
        int i11 = this.f37156a;
        Object obj = this.f37157b;
        switch (i11) {
            case 0:
                u21.U((u21) obj, view);
                return;
            case 1:
                n31.U((n31) obj, view, i10);
                return;
            case 2:
                b71 b71Var = (b71) obj;
                org.telegram.ui.Components.i51 G = b71Var.f32834f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        b71Var.X = (TLObject) G.G;
                        b71Var.U(true);
                        b71Var.f32834f0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((e71) obj).Q(i10, view);
                return;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                return;
            case 5:
                ga1 ga1Var = (ga1) obj;
                ArrayList arrayList = ga1Var.K;
                ArrayList arrayList2 = ga1Var.L;
                l91 l91Var = ga1Var.U;
                int i12 = l91Var.F;
                if (i10 >= i12 && i10 <= l91Var.G) {
                    da1 da1Var = (da1) ga1Var.f34551s0.get(i10 - i12);
                    aj0 aj0Var = new aj0(da1Var.f33569b, true, ga1Var.f34529b);
                    aj0Var.f32649b0 = da1Var;
                    ga1Var.presentFragment(aj0Var);
                    return;
                }
                int i13 = l91Var.R;
                if (i10 >= i13 && i10 <= l91Var.S) {
                    ((z91) ga1Var.N.get(i10 - i13)).b(ga1Var);
                    return;
                }
                int i14 = l91Var.O;
                if (i10 >= i14 && i10 <= l91Var.P) {
                    ((z91) arrayList2.get(i10 - i14)).b(ga1Var);
                    return;
                }
                int i15 = l91Var.U;
                if (i10 >= i15 && i10 <= l91Var.V) {
                    ((z91) ga1Var.M.get(i10 - i15)).b(ga1Var);
                    return;
                } else if (i10 == l91Var.W) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = ga1Var.U.W;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    l91 l91Var2 = ga1Var.U;
                    if (l91Var2 != null) {
                        l91Var2.E();
                        ga1Var.P.setItemAnimator(ga1Var.V);
                        ga1Var.U.s(i16 + 1, size);
                        ga1Var.U.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                cd1 cd1Var = (cd1) obj;
                if (cd1Var.T0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cd1Var.Z0(i10);
                if (cd1Var.T0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4 == z10) {
                    cd1Var.M0();
                    cd1Var.l1();
                }
                cd1Var.n1();
                org.telegram.ui.Components.m81 m81Var = cd1Var.G0[1];
                if (cd1Var.T0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m81Var.a(z11, true);
                cd1Var.M0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    cd1Var.M0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > cd1Var.M0.getMeasuredWidth()) {
                    jb1 jb1Var = cd1Var.M0;
                    jb1Var.v0(i18 - jb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 7:
                yd1 yd1Var = (yd1) obj;
                int i19 = yd1Var.E;
                HashSet hashSet = yd1Var.f40499w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f19184id))) {
                        hashSet.remove(Long.valueOf(chat.f19184id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f19184id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && yd1Var.v != -1 && yd1Var.f40496n.getVisibility() == 0) {
                        yd1Var.v = -1;
                        yd1Var.f40496n.animate().setListener(null).cancel();
                        yd1Var.f40496n.animate().translationY(i19).setDuration(200L).setListener(new ud1(yd1Var, 0)).start();
                        if (yd1Var.f40498s.getVisibility() == 0) {
                            sl0Var2 = yd1Var.f40493b;
                        } else {
                            sl0Var2 = yd1Var.f40492a;
                        }
                        sl0Var2.d1(false);
                        int N0 = ((f2.i0) sl0Var2.getLayoutManager()).N0();
                        if ((N0 == sl0Var2.getAdapter().h() - 1 || (N0 == sl0Var2.getAdapter().h() - 2 && sl0Var2 == yd1Var.f40492a)) && (K = sl0Var2.K(N0)) != null) {
                            int bottom = K.f5785a.getBottom();
                            if (N0 == yd1Var.d.f39147c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (sl0Var2.getMeasuredHeight() - bottom <= i19) {
                                sl0Var2.setTranslationY(-(sl0Var2.getMeasuredHeight() - bottom));
                                sl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        yd1Var.f40492a.setPadding(0, 0, 0, 0);
                        yd1Var.f40493b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && yd1Var.f40496n.getVisibility() == 8 && yd1Var.v != 1) {
                        yd1Var.v = 1;
                        yd1Var.f40496n.setVisibility(0);
                        yd1Var.f40496n.setTranslationY(i19);
                        yd1Var.f40496n.animate().setListener(null).cancel();
                        yd1Var.f40496n.animate().translationY(0.0f).setDuration(200L).setListener(new ud1(yd1Var, 1)).start();
                        yd1Var.f40492a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(12.0f));
                        yd1Var.f40493b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        yd1Var.f40494c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (yd1Var.f40498s.getVisibility() == 0) {
                            sl0Var = yd1Var.f40493b;
                        } else {
                            sl0Var = yd1Var.f40492a;
                        }
                        int height = sl0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            sl0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                kf1.V((kf1) obj, view);
                return;
            case 9:
                kf1 kf1Var = ((gf1) obj).f34610q0;
                if (view instanceof org.telegram.ui.Cells.oa) {
                    ag.f.m(kf1Var, kf1Var.f35668a, ((org.telegram.ui.Cells.oa) view).getTopic(), 0);
                    return;
                } else if (view instanceof hf1) {
                    hf1 hf1Var = (hf1) view;
                    ag.f.m(kf1Var, kf1Var.f35668a, hf1Var.K, hf1Var.getMessageId());
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
                pi1 pi1Var = (pi1) obj;
                pi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = vh.v2.f(string, " ");
                String[] strArr = WallpapersListActivity.f32400k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f32401l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = pi1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                pi1Var.f37347n = strArr[i10];
                pi1Var.E("", true);
                return;
        }
    }
}
