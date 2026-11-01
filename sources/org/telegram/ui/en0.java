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
public final class en0 extends org.telegram.ui.Components.tk0 {
    public final Context f36876c;
    public final int d;
    public final ln0 e;

    public en0(ln0 ln0Var, Context context, int i10) {
        this.e = ln0Var;
        this.f36876c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.e.f39329k0;
    }

    @Override
    public final int d(int i10) {
        ln0 ln0Var = this.e;
        if (i10 == ln0Var.R || i10 == ln0Var.f39325g0 || i10 == ln0Var.T || i10 == ln0Var.W) {
            return 2;
        }
        if (i10 == ln0Var.Q) {
            return 1;
        }
        if (i10 == ln0Var.S) {
            return 3;
        }
        if (i10 == ln0Var.U) {
            return 5;
        }
        if (i10 == ln0Var.V) {
            return 6;
        }
        if (i10 == ln0Var.f39326h0) {
            return 10;
        }
        if (i10 == ln0Var.f39327i0) {
            return 11;
        }
        if (i10 == ln0Var.f39316a0) {
            return 7;
        }
        if (i10 >= ln0Var.f39318b0 && i10 < ln0Var.f39320c0) {
            if (ln0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= ln0Var.f39321d0 && i10 < ln0Var.f39322e0) {
            return 9;
        } else {
            if (i10 != ln0Var.f39329k0 - 1 && i10 != ln0Var.f39328j0) {
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
        View view = c1Var.f47909a;
        ln0 ln0Var = this.e;
        HashMap hashMap = ln0Var.M;
        ArrayList arrayList = ln0Var.f39330l0;
        ArrayList arrayList2 = ln0Var.L;
        rn0 rn0Var = ln0Var.f39334p0;
        int d = d(i10);
        int i15 = this.d;
        int i16 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, view, rn0Var.getResourceProvider());
                ((on0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i10 == ln0Var.R) {
                    if (i15 == 1) {
                        if (rn0Var.f41110a) {
                            i12 = 2131752434;
                        } else {
                            i12 = 2131743778;
                        }
                        L0 = org.telegram.messenger.dd.L0(i12, null);
                    } else {
                        if (rn0Var.f41110a) {
                            i11 = 2131752322;
                        } else {
                            i11 = 2131743760;
                        }
                        L0 = org.telegram.messenger.dd.L0(i11, null);
                    }
                    b9Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(L0, new org.telegram.ui.Components.qq(this, i15, 16)), true));
                    return;
                } else if (i10 == ln0Var.W) {
                    b9Var.setText("");
                    b9Var.setFixedSize(12);
                    return;
                } else if (i10 == ln0Var.f39325g0) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131743766, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((kn0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.updateColors();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p8Var, rn0Var.getResourceProvider());
                p8Var.updateColors();
                if (i10 == ln0Var.V) {
                    if (rn0Var.f41110a) {
                        i13 = 2131752324;
                    } else {
                        i13 = 2131743763;
                    }
                    p8Var.k(org.telegram.messenger.dd.L0(i13, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == ln0Var.f39316a0) {
                    p4Var.c(org.telegram.messenger.dd.L0(2131743767, null), false);
                }
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, rn0Var.getResourceProvider());
                return;
            case 8:
                an0 an0Var = (an0) view;
                int i17 = i10 - ln0Var.f39318b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    an0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ln0Var.f39335r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20022id) || ((tL_peerColorCollectible = ln0Var.f39336s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20022id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    an0Var.b(z10, false);
                    an0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                ln0Var.F = view;
                qn0 qn0Var = ln0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                ArrayList arrayList3 = rh.e6.y(i14, false).I;
                arrayList2.add(org.telegram.messenger.dd.L0(2131749955, null));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (ln0Var.K == starGift) {
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
                dn0 dn0Var = new dn0(this, 0);
                ArrayList arrayList4 = qn0Var.f40857f;
                if (qn0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qn0Var.K = 0;
                qn0Var.h = dn0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                qn0Var.f40856c.f();
                qn0Var.a(i19, z11);
                ln0Var.l(qn0Var);
                view.post(new bn0(ln0Var, 3));
                return;
            case 11:
                ((jn0) view).updateColors();
                return;
            case 12:
                ph.c1 c1Var2 = (ph.c1) view;
                int i20 = i10 - ln0Var.f39318b0;
                if (ln0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ln0Var.f39335r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20022id) && ((tL_peerColorCollectible2 = ln0Var.f39336s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20022id)) {
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
        kn0 kn0Var;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var5;
        ln0 ln0Var = this.e;
        rn0 rn0Var = ln0Var.f39334p0;
        switch (i10) {
            case 1:
                Context context = ln0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                on0 on0Var = new on0(this.d, i11, context, p6Var);
                ln0Var.f39323f = on0Var;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, on0Var, rn0Var.getResourceProvider());
                on0Var.a(ln0Var.h, false);
                on0Var.setOnColorClick(new dn0(this, 1));
                kn0Var = on0Var;
                break;
            case 2:
            default:
                kn0Var = new org.telegram.ui.Cells.b9(ln0Var.getContext(), rn0Var.getResourceProvider());
                break;
            case 3:
                kn0 kn0Var2 = new kn0(ln0Var, ln0Var.getContext());
                ln0Var.D = kn0Var2;
                kn0Var2.b(false);
                kn0Var = kn0Var2;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(ln0Var.getContext(), 16);
                bnVar.setTag(-33024);
                zzVar = bnVar;
                kn0Var = zzVar;
                break;
            case 5:
                View view = new View(ln0Var.getContext());
                view.setTag(-33024);
                zzVar = view;
                kn0Var = zzVar;
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(ln0Var.getContext(), rn0Var.getResourceProvider());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p8Var, rn0Var.getResourceProvider());
                kn0Var = p8Var;
                break;
            case 7:
                Context context2 = ln0Var.getContext();
                p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                View p4Var = new org.telegram.ui.Cells.p4(context2, p6Var2);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, rn0Var.getResourceProvider());
                kn0Var = p4Var;
                break;
            case 8:
                Context context3 = ln0Var.getContext();
                p6Var3 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                View an0Var = new an0(context3, p6Var3, false);
                an0Var.setTag(-33024);
                zzVar = an0Var;
                kn0Var = zzVar;
                break;
            case 9:
                Context context4 = this.f36876c;
                p6Var4 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                org.telegram.ui.Components.zz zzVar2 = new org.telegram.ui.Components.zz(context4, p6Var4);
                zzVar2.setIsSingleCell(true);
                zzVar2.setViewType(35);
                zzVar2.setTag(-33024);
                zzVar = zzVar2;
                kn0Var = zzVar;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(ln0Var.getContext(), 17);
                bnVar2.setTag(-33024);
                zzVar = bnVar2;
                kn0Var = zzVar;
                break;
            case 11:
                kn0Var = new jn0(ln0Var, ln0Var.getContext());
                break;
            case 12:
                Context context5 = ln0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                p6Var5 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                View c1Var = new ph.c1(i12, context5, p6Var5);
                c1Var.setTag(-33024);
                zzVar = c1Var;
                kn0Var = zzVar;
                break;
        }
        return new s4.c1(kn0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        ln0 ln0Var = this.e;
        ArrayList arrayList = ln0Var.f39330l0;
        int i10 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i10 == 10) {
            ln0Var.F = view;
            view.post(new bn0(ln0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            an0 an0Var = (an0) view;
            int b10 = c1Var.b() - ln0Var.f39318b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                an0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ln0Var.f39335r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20022id) && ((tL_peerColorCollectible2 = ln0Var.f39336s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20022id)) {
                    z10 = false;
                }
                an0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            ph.c1 c1Var2 = (ph.c1) view;
            int b11 = c1Var.b() - ln0Var.f39318b0;
            if (ln0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ln0Var.f39335r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20022id) && ((tL_peerColorCollectible = ln0Var.f39336s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20022id)) {
                    z10 = false;
                }
                c1Var2.f(z10, false);
            }
        }
    }
}
