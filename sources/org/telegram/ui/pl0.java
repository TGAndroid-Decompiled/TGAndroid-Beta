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
public final class pl0 extends org.telegram.ui.Components.sj0 {
    public final Context f48605c;
    public final int d;
    public final wl0 f48606e;

    public pl0(wl0 wl0Var, Context context, int i3) {
        this.f48606e = wl0Var;
        this.f48605c = context;
        this.d = i3;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 6 && i3 != 8 && i3 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.f48606e.f51216l0;
    }

    @Override
    public final int d(int i3) {
        wl0 wl0Var = this.f48606e;
        if (i3 == wl0Var.S || i3 == wl0Var.f51212h0 || i3 == wl0Var.U || i3 == wl0Var.f51201a0) {
            return 2;
        }
        if (i3 == wl0Var.R) {
            return 1;
        }
        if (i3 == wl0Var.T) {
            return 3;
        }
        if (i3 == wl0Var.V) {
            return 5;
        }
        if (i3 == wl0Var.W) {
            return 6;
        }
        if (i3 == wl0Var.f51213i0) {
            return 10;
        }
        if (i3 == wl0Var.f51214j0) {
            return 11;
        }
        if (i3 == wl0Var.f51203b0) {
            return 7;
        }
        if (i3 >= wl0Var.f51205c0 && i3 < wl0Var.f51206d0) {
            if (wl0Var.L == null) {
                return 8;
            }
            return 12;
        } else if (i3 >= wl0Var.f51208e0 && i3 < wl0Var.f51210f0) {
            return 9;
        } else {
            if (i3 != wl0Var.f51216l0 - 1 && i3 != wl0Var.f51215k0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String M0;
        int i11;
        int i12;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i13;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = d1Var.f55540a;
        wl0 wl0Var = this.f48606e;
        HashMap hashMap = wl0Var.N;
        ArrayList arrayList = wl0Var.m0;
        ArrayList arrayList2 = wl0Var.M;
        cm0 cm0Var = wl0Var.f51221q0;
        int d = d(i3);
        int i14 = this.d;
        int i15 = 1;
        r11 = true;
        boolean z12 = true;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, view, cm0Var.getResourceProvider());
                ((zl0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i3 == wl0Var.S) {
                    if (i14 == 1) {
                        if (cm0Var.f44388a) {
                            i11 = 2131752434;
                        } else {
                            i11 = 2131743762;
                        }
                        M0 = org.telegram.messenger.bd.M0(i11, null);
                    } else {
                        if (cm0Var.f44388a) {
                            i10 = 2131752322;
                        } else {
                            i10 = 2131743744;
                        }
                        M0 = org.telegram.messenger.bd.M0(i10, null);
                    }
                    y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.o2(this, i14, 21)), true));
                    return;
                } else if (i3 == wl0Var.f51201a0) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                } else if (i3 == wl0Var.f51212h0) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131743750, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((vl0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.updateColors();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var, cm0Var.getResourceProvider());
                l8Var.updateColors();
                if (i3 == wl0Var.W) {
                    if (cm0Var.f44388a) {
                        i12 = 2131752324;
                    } else {
                        i12 = 2131743747;
                    }
                    l8Var.k(org.telegram.messenger.bd.M0(i12, null), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 == wl0Var.f51203b0) {
                    n4Var.c(org.telegram.messenger.bd.M0(2131743751, null), false);
                }
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, cm0Var.getResourceProvider());
                return;
            case 8:
                ll0 ll0Var = (ll0) view;
                int i16 = i3 - wl0Var.f51205c0;
                if (i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    ll0Var.a(i16, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wl0Var.f51222r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f27230id) || ((tL_peerColorCollectible = wl0Var.f51223s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f27230id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ll0Var.b(z10, false);
                    ll0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                wl0Var.G = view;
                bm0 bm0Var = wl0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i13 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                ArrayList arrayList3 = ci.e9.y(i13, false).I;
                arrayList2.add(org.telegram.messenger.bd.M0(2131749954, null));
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i17);
                    if ((i14 == 0 || (i14 == i15 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (wl0Var.L == starGift) {
                            i18 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i15);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        p5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i17++;
                    i15 = 1;
                }
                ol0 ol0Var = new ol0(this, 0);
                ArrayList arrayList4 = bm0Var.f44075f;
                if (bm0Var.L == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bm0Var.L = 0;
                bm0Var.h = ol0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                bm0Var.f44073c.f();
                bm0Var.a(i18, z11);
                wl0Var.l(bm0Var);
                view.post(new ml0(wl0Var, 3));
                return;
            case 11:
                ((ul0) view).updateColors();
                return;
            case 12:
                ai.q2 q2Var = (ai.q2) view;
                int i19 = i3 - wl0Var.f51205c0;
                if (wl0Var.K != null && i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    q2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wl0Var.f51222r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27230id) && ((tL_peerColorCollectible2 = wl0Var.f51223s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f27230id)) {
                        z12 = false;
                    }
                    q2Var.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.Components.iz izVar;
        vl0 vl0Var;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        wl0 wl0Var = this.f48606e;
        cm0 cm0Var = wl0Var.f51221q0;
        switch (i3) {
            case 1:
                Context context = wl0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                zl0 zl0Var = new zl0(this.d, i10, context, e6Var);
                wl0Var.f51209f = zl0Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, zl0Var, cm0Var.getResourceProvider());
                zl0Var.a(wl0Var.h, false);
                zl0Var.setOnColorClick(new ol0(this, 1));
                vl0Var = zl0Var;
                break;
            case 2:
            default:
                vl0Var = new org.telegram.ui.Cells.y8(wl0Var.getContext(), cm0Var.getResourceProvider());
                break;
            case 3:
                vl0 vl0Var2 = new vl0(wl0Var, wl0Var.getContext());
                wl0Var.E = vl0Var2;
                vl0Var2.b(false);
                vl0Var = vl0Var2;
                break;
            case 4:
                View smVar = new org.telegram.ui.Components.sm(wl0Var.getContext(), 20);
                smVar.setTag(-33024);
                izVar = smVar;
                vl0Var = izVar;
                break;
            case 5:
                View view = new View(wl0Var.getContext());
                view.setTag(-33024);
                izVar = view;
                vl0Var = izVar;
                break;
            case 6:
                View l8Var = new org.telegram.ui.Cells.l8(wl0Var.getContext(), cm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var, cm0Var.getResourceProvider());
                vl0Var = l8Var;
                break;
            case 7:
                Context context2 = wl0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, e6Var2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, cm0Var.getResourceProvider());
                vl0Var = n4Var;
                break;
            case 8:
                Context context3 = wl0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                View ll0Var = new ll0(context3, e6Var3, false);
                ll0Var.setTag(-33024);
                izVar = ll0Var;
                vl0Var = izVar;
                break;
            case 9:
                Context context4 = this.f48605c;
                e6Var4 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                org.telegram.ui.Components.iz izVar2 = new org.telegram.ui.Components.iz(context4, e6Var4);
                izVar2.setIsSingleCell(true);
                izVar2.setViewType(35);
                izVar2.setTag(-33024);
                izVar = izVar2;
                vl0Var = izVar;
                break;
            case 10:
                View smVar2 = new org.telegram.ui.Components.sm(wl0Var.getContext(), 21);
                smVar2.setTag(-33024);
                izVar = smVar2;
                vl0Var = izVar;
                break;
            case 11:
                vl0Var = new ul0(wl0Var, wl0Var.getContext());
                break;
            case 12:
                Context context5 = wl0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                View q2Var = new ai.q2(i11, context5, e6Var5);
                q2Var.setTag(-33024);
                izVar = q2Var;
                vl0Var = izVar;
                break;
        }
        return new u4.d1(vl0Var);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        wl0 wl0Var = this.f48606e;
        ArrayList arrayList = wl0Var.m0;
        int i3 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i3 == 10) {
            wl0Var.G = view;
            view.post(new ml0(wl0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i3 == 8) {
            ll0 ll0Var = (ll0) view;
            int b10 = d1Var.b() - wl0Var.f51205c0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ll0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wl0Var.f51222r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f27230id) && ((tL_peerColorCollectible2 = wl0Var.f51223s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f27230id)) {
                    z10 = false;
                }
                ll0Var.b(z10, false);
            }
        } else if (i3 == 12) {
            ai.q2 q2Var = (ai.q2) view;
            int b11 = d1Var.b() - wl0Var.f51205c0;
            if (wl0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                q2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wl0Var.f51222r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f27230id) && ((tL_peerColorCollectible = wl0Var.f51223s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f27230id)) {
                    z10 = false;
                }
                q2Var.f(z10, false);
            }
        }
    }
}
