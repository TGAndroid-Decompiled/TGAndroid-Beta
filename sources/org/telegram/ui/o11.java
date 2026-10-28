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
public final class o11 implements org.telegram.ui.Components.am0 {
    public final int f41954a;
    public final Object f41955b;

    public o11(Object obj, int i10) {
        this.f41954a = i10;
        this.f41955b = obj;
    }

    @Override
    public final void c(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.nm0 nm0Var;
        org.telegram.ui.Components.nm0 nm0Var2;
        s4.e1 K;
        int i11 = this.f41954a;
        Object obj = this.f41955b;
        switch (i11) {
            case 0:
                ProxyListActivity.V((ProxyListActivity) obj, view, i10);
                return;
            case 1:
                i21.V((i21) obj, view);
                return;
            case 2:
                a31.V((a31) obj, view, i10);
                return;
            case 3:
                i31.V((i31) obj, i10);
                return;
            case 4:
                p61 p61Var = (p61) obj;
                org.telegram.ui.Components.u61 G = p61Var.f42324i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.m6) view).r(true, true);
                        p61Var.f42316a0 = (TLObject) G.G;
                        p61Var.U(true);
                        p61Var.f42324i0.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((s61) obj).Q(i10, view);
                return;
            case 6:
                SessionsActivity.V((SessionsActivity) obj, i10);
                return;
            case 7:
                y91 y91Var = (y91) obj;
                ArrayList arrayList = y91Var.N;
                ArrayList arrayList2 = y91Var.O;
                d91 d91Var = y91Var.W;
                int i12 = d91Var.I;
                if (i10 >= i12 && i10 <= d91Var.J) {
                    v91 v91Var = (v91) y91Var.f45941y0.get(i10 - i12);
                    xi0 xi0Var = new xi0(v91Var.f44217b, true, y91Var.f45910b);
                    xi0Var.f45702e0 = v91Var;
                    y91Var.presentFragment(xi0Var);
                    return;
                }
                int i13 = d91Var.U;
                if (i10 >= i13 && i10 <= d91Var.V) {
                    ((r91) y91Var.Q.get(i10 - i13)).b(y91Var);
                    return;
                }
                int i14 = d91Var.R;
                if (i10 >= i14 && i10 <= d91Var.S) {
                    ((r91) arrayList2.get(i10 - i14)).b(y91Var);
                    return;
                }
                int i15 = d91Var.X;
                if (i10 >= i15 && i10 <= d91Var.Y) {
                    ((r91) y91Var.P.get(i10 - i15)).b(y91Var);
                    return;
                } else if (i10 == d91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = y91Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    d91 d91Var2 = y91Var.W;
                    if (d91Var2 != null) {
                        d91Var2.E();
                        y91Var.S.setItemAnimator(y91Var.X);
                        y91Var.W.s(i16 + 1, size);
                        y91Var.W.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                vc1 vc1Var = (vc1) obj;
                if (vc1Var.X0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vc1Var.a1(i10);
                if (vc1Var.X0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    vc1Var.M0();
                    vc1Var.m1();
                }
                vc1Var.o1();
                org.telegram.ui.Components.w91 w91Var = vc1Var.K0[1];
                if (vc1Var.X0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w91Var.a(z12, true);
                vc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    vc1Var.Q0.w0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > vc1Var.Q0.getMeasuredWidth()) {
                    bb1 bb1Var = vc1Var.Q0;
                    bb1Var.w0(i18 - bb1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                rd1 rd1Var = (rd1) obj;
                int i19 = rd1Var.H;
                HashSet hashSet = rd1Var.f42971w;
                if (view instanceof org.telegram.ui.Cells.k4) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) k4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f22028id))) {
                        hashSet.remove(Long.valueOf(chat.f22028id));
                        k4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f22028id));
                        k4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && rd1Var.v != -1 && rd1Var.f42968n.getVisibility() == 0) {
                        rd1Var.v = -1;
                        rd1Var.f42968n.animate().setListener(null).cancel();
                        rd1Var.f42968n.animate().translationY(i19).setDuration(200L).setListener(new nd1(rd1Var, 0)).start();
                        if (rd1Var.f42970s.getVisibility() == 0) {
                            nm0Var2 = rd1Var.f42965b;
                        } else {
                            nm0Var2 = rd1Var.f42964a;
                        }
                        nm0Var2.d1(false);
                        int N0 = ((s4.c0) nm0Var2.getLayoutManager()).N0();
                        if ((N0 == nm0Var2.getAdapter().h() - 1 || (N0 == nm0Var2.getAdapter().h() - 2 && nm0Var2 == rd1Var.f42964a)) && (K = nm0Var2.K(N0)) != null) {
                            int bottom = K.f47773a.getBottom();
                            if (N0 == rd1Var.d.f42065c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (nm0Var2.getMeasuredHeight() - bottom <= i19) {
                                nm0Var2.setTranslationY(-(nm0Var2.getMeasuredHeight() - bottom));
                                nm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        rd1Var.f42964a.setPadding(0, 0, 0, 0);
                        rd1Var.f42965b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && rd1Var.f42968n.getVisibility() == 8 && rd1Var.v != 1) {
                        rd1Var.v = 1;
                        rd1Var.f42968n.setVisibility(0);
                        rd1Var.f42968n.setTranslationY(i19);
                        rd1Var.f42968n.animate().setListener(null).cancel();
                        rd1Var.f42968n.animate().translationY(0.0f).setDuration(200L).setListener(new nd1(rd1Var, 1)).start();
                        rd1Var.f42964a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(12.0f));
                        rd1Var.f42965b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        rd1Var.f42966c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (rd1Var.f42970s.getVisibility() == 0) {
                            nm0Var = rd1Var.f42965b;
                        } else {
                            nm0Var = rd1Var.f42964a;
                        }
                        int height = nm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            nm0Var.w0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                cf1.W((cf1) obj, view);
                return;
            case 11:
                cf1 cf1Var = ((ye1) obj).f46003v0;
                if (view instanceof org.telegram.ui.Cells.ua) {
                    pg.d.m(cf1Var, cf1Var.f38288a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
                    return;
                } else if (view instanceof ze1) {
                    ze1 ze1Var = (ze1) view;
                    pg.d.m(cf1Var, cf1Var.f38288a, ze1Var.N, ze1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                return;
            default:
                gi1 gi1Var = (gi1) obj;
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder l4 = org.telegram.ui.Components.b10.l(string, " ");
                String[] strArr = WallpapersListActivity.f37609j0;
                l4.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f37610k0[i10]));
                SpannableString spannableString = new SpannableString(l4.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = gi1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                gi1Var.f39630n = strArr[i10];
                gi1Var.E("", true);
                return;
        }
    }
}
