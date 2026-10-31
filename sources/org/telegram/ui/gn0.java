package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gn0 extends org.telegram.ui.Components.sk0 {
    public final Context f37602c;
    public final int d;
    public final nn0 e;

    public gn0(nn0 nn0Var, Context context, int i10) {
        this.e = nn0Var;
        this.f37602c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.e.f39996k0;
    }

    @Override
    public final int d(int i10) {
        nn0 nn0Var = this.e;
        if (i10 == nn0Var.R || i10 == nn0Var.f39992g0 || i10 == nn0Var.T || i10 == nn0Var.W) {
            return 2;
        }
        if (i10 == nn0Var.Q) {
            return 1;
        }
        if (i10 == nn0Var.S) {
            return 3;
        }
        if (i10 == nn0Var.U) {
            return 5;
        }
        if (i10 == nn0Var.V) {
            return 6;
        }
        if (i10 == nn0Var.f39993h0) {
            return 10;
        }
        if (i10 == nn0Var.f39994i0) {
            return 11;
        }
        if (i10 == nn0Var.f39983a0) {
            return 7;
        }
        if (i10 >= nn0Var.f39985b0 && i10 < nn0Var.f39987c0) {
            if (nn0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= nn0Var.f39988d0 && i10 < nn0Var.f39989e0) {
            return 9;
        } else {
            if (i10 != nn0Var.f39996k0 - 1 && i10 != nn0Var.f39995j0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String L0;
        int i12;
        int i13;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i14;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = c1Var.f47898a;
        nn0 nn0Var = this.e;
        HashMap hashMap = nn0Var.M;
        ArrayList arrayList = nn0Var.f39997l0;
        ArrayList arrayList2 = nn0Var.L;
        tn0 tn0Var = nn0Var.f40001p0;
        int d = d(i10);
        int i15 = this.d;
        int i16 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, view, tn0Var.getResourceProvider());
                ((qn0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i10 == nn0Var.R) {
                    if (i15 == 1) {
                        if (tn0Var.f41868a) {
                            i12 = 2131752434;
                        } else {
                            i12 = 2131743778;
                        }
                        L0 = org.telegram.messenger.cd.L0(i12, null);
                    } else {
                        if (tn0Var.f41868a) {
                            i11 = 2131752322;
                        } else {
                            i11 = 2131743760;
                        }
                        L0 = org.telegram.messenger.cd.L0(i11, null);
                    }
                    b9Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(L0, new org.telegram.ui.Components.qq(this, i15, 16)), true));
                    return;
                } else if (i10 == nn0Var.W) {
                    b9Var.setText("");
                    b9Var.setFixedSize(12);
                    return;
                } else if (i10 == nn0Var.f39992g0) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131743766, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((mn0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.updateColors();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var, tn0Var.getResourceProvider());
                p8Var.updateColors();
                if (i10 == nn0Var.V) {
                    if (tn0Var.f41868a) {
                        i13 = 2131752324;
                    } else {
                        i13 = 2131743763;
                    }
                    p8Var.k(org.telegram.messenger.cd.L0(i13, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == nn0Var.f39983a0) {
                    p4Var.c(org.telegram.messenger.cd.L0(2131743767, null), false);
                }
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, tn0Var.getResourceProvider());
                return;
            case 8:
                cn0 cn0Var = (cn0) view;
                int i17 = i10 - nn0Var.f39985b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    cn0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = nn0Var.f40002r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20021id) || ((tL_peerColorCollectible = nn0Var.f40003s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20021id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cn0Var.b(z10, false);
                    cn0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                nn0Var.F = view;
                sn0 sn0Var = nn0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                ArrayList arrayList3 = rh.e6.y(i14, false).I;
                arrayList2.add(org.telegram.messenger.cd.L0(2131749955, null));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (nn0Var.K == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        o5Var.size = org.telegram.messenger.i0.L(14.0f);
                        spannableStringBuilder.setSpan(o5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                fn0 fn0Var = new fn0(this, 0);
                ArrayList arrayList4 = sn0Var.f41612f;
                if (sn0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sn0Var.K = 0;
                sn0Var.h = fn0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                sn0Var.f41611c.f();
                sn0Var.a(i19, z11);
                nn0Var.l(sn0Var);
                view.post(new dn0(nn0Var, 3));
                return;
            case 11:
                ((ln0) view).updateColors();
                return;
            case 12:
                ph.c1 c1Var2 = (ph.c1) view;
                int i20 = i10 - nn0Var.f39985b0;
                if (nn0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = nn0Var.f40002r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20021id) && ((tL_peerColorCollectible2 = nn0Var.f40003s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20021id)) {
                        z12 = false;
                    }
                    c1Var2.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        org.telegram.ui.Components.zz zzVar;
        mn0 mn0Var;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var5;
        nn0 nn0Var = this.e;
        tn0 tn0Var = nn0Var.f40001p0;
        switch (i10) {
            case 1:
                Context context = nn0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                qn0 qn0Var = new qn0(this.d, i11, context, p6Var);
                nn0Var.f39990f = qn0Var;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, qn0Var, tn0Var.getResourceProvider());
                qn0Var.a(nn0Var.h, false);
                qn0Var.setOnColorClick(new fn0(this, 1));
                mn0Var = qn0Var;
                break;
            case 2:
            default:
                mn0Var = new org.telegram.ui.Cells.b9(nn0Var.getContext(), tn0Var.getResourceProvider());
                break;
            case 3:
                mn0 mn0Var2 = new mn0(nn0Var, nn0Var.getContext());
                nn0Var.D = mn0Var2;
                mn0Var2.b(false);
                mn0Var = mn0Var2;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(nn0Var.getContext(), 16);
                bnVar.setTag(-33024);
                zzVar = bnVar;
                mn0Var = zzVar;
                break;
            case 5:
                View view = new View(nn0Var.getContext());
                view.setTag(-33024);
                zzVar = view;
                mn0Var = zzVar;
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(nn0Var.getContext(), tn0Var.getResourceProvider());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p8Var, tn0Var.getResourceProvider());
                mn0Var = p8Var;
                break;
            case 7:
                Context context2 = nn0Var.getContext();
                p6Var2 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                View p4Var = new org.telegram.ui.Cells.p4(context2, p6Var2);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, tn0Var.getResourceProvider());
                mn0Var = p4Var;
                break;
            case 8:
                Context context3 = nn0Var.getContext();
                p6Var3 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                View cn0Var = new cn0(context3, p6Var3, false);
                cn0Var.setTag(-33024);
                zzVar = cn0Var;
                mn0Var = zzVar;
                break;
            case 9:
                Context context4 = this.f37602c;
                p6Var4 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                org.telegram.ui.Components.zz zzVar2 = new org.telegram.ui.Components.zz(context4, p6Var4);
                zzVar2.setIsSingleCell(true);
                zzVar2.setViewType(35);
                zzVar2.setTag(-33024);
                zzVar = zzVar2;
                mn0Var = zzVar;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(nn0Var.getContext(), 17);
                bnVar2.setTag(-33024);
                zzVar = bnVar2;
                mn0Var = zzVar;
                break;
            case 11:
                mn0Var = new ln0(nn0Var, nn0Var.getContext());
                break;
            case 12:
                Context context5 = nn0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                p6Var5 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                View c1Var = new ph.c1(i12, context5, p6Var5);
                c1Var.setTag(-33024);
                zzVar = c1Var;
                mn0Var = zzVar;
                break;
        }
        return new s4.c1(mn0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        nn0 nn0Var = this.e;
        ArrayList arrayList = nn0Var.f39997l0;
        int i10 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i10 == 10) {
            nn0Var.F = view;
            view.post(new dn0(nn0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            cn0 cn0Var = (cn0) view;
            int b10 = c1Var.b() - nn0Var.f39985b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                cn0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = nn0Var.f40002r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20021id) && ((tL_peerColorCollectible2 = nn0Var.f40003s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20021id)) {
                    z10 = false;
                }
                cn0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            ph.c1 c1Var2 = (ph.c1) view;
            int b11 = c1Var.b() - nn0Var.f39985b0;
            if (nn0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = nn0Var.f40002r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20021id) && ((tL_peerColorCollectible = nn0Var.f40003s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20021id)) {
                    z10 = false;
                }
                c1Var2.f(z10, false);
            }
        }
    }
}
