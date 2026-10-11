package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mp0 extends org.telegram.ui.Components.rm0 {
    public final Context f40047c;
    public final int d;
    public final tp0 f40048e;

    public mp0(tp0 tp0Var, Context context, int i10) {
        this.f40048e = tp0Var;
        this.f40047c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f40048e.f42236k0;
    }

    @Override
    public final int j(int i10) {
        tp0 tp0Var = this.f40048e;
        if (i10 == tp0Var.R || i10 == tp0Var.f42232g0 || i10 == tp0Var.T || i10 == tp0Var.W) {
            return 2;
        }
        if (i10 == tp0Var.Q) {
            return 1;
        }
        if (i10 == tp0Var.S) {
            return 3;
        }
        if (i10 == tp0Var.U) {
            return 5;
        }
        if (i10 == tp0Var.V) {
            return 6;
        }
        if (i10 == tp0Var.f42233h0) {
            return 10;
        }
        if (i10 == tp0Var.f42234i0) {
            return 11;
        }
        if (i10 == tp0Var.f42222a0) {
            return 7;
        }
        if (i10 >= tp0Var.f42224b0 && i10 < tp0Var.f42226c0) {
            if (tp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= tp0Var.f42227d0 && i10 < tp0Var.f42229e0) {
            return 9;
        } else {
            if (i10 != tp0Var.f42236k0 - 1 && i10 != tp0Var.f42235j0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        String string;
        int i12;
        int i13;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i14;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = d1Var.f47748a;
        tp0 tp0Var = this.f40048e;
        HashMap hashMap = tp0Var.M;
        ArrayList arrayList = tp0Var.f42237l0;
        ArrayList arrayList2 = tp0Var.L;
        zp0 zp0Var = tp0Var.f42241p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                ((wp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == tp0Var.R) {
                    if (i15 == 1) {
                        if (zp0Var.f45036a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (zp0Var.f45036a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.nd(this, i15, 22)), true));
                    return;
                } else if (i10 == tp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == tp0Var.f42232g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                sp0 sp0Var = (sp0) view;
                zp0 zp0Var2 = sp0Var.d.f42241p0;
                sp0Var.setBackgroundColor(zp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                sp0Var.f41774a.setTextColor(zp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                r8Var.v();
                if (i10 == tp0Var.V) {
                    if (zp0Var.f45036a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    r8Var.i(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == tp0Var.f42222a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                return;
            case 8:
                hp0 hp0Var = (hp0) view;
                int i17 = i10 - tp0Var.f42224b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    hp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = tp0Var.f42242r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20259id) || ((tL_peerColorCollectible = tp0Var.f42243s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20259id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hp0Var.b(z10, false);
                    hp0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                tp0Var.F = view;
                yp0 yp0Var = tp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                ArrayList arrayList3 = yh.n5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (tp0Var.K == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        b6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(b6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                lp0 lp0Var = new lp0(this, 0);
                ArrayList arrayList4 = yp0Var.f44471f;
                if (yp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yp0Var.K = 0;
                yp0Var.h = lp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                yp0Var.f44469c.l();
                yp0Var.a(i19, z11);
                tp0Var.l(yp0Var);
                view.post(new jp0(tp0Var, 3));
                return;
            case 11:
                ((rp0) view).a();
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i20 = i10 - tp0Var.f42224b0;
                if (tp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = tp0Var.f42242r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20259id) && ((tL_peerColorCollectible2 = tp0Var.f42243s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20259id)) {
                        z12 = false;
                    }
                    j1Var.e(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.Components.k10 k10Var;
        sp0 sp0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        tp0 tp0Var = this.f40048e;
        zp0 zp0Var = tp0Var.f42241p0;
        switch (i10) {
            case 1:
                Context context = tp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                wp0 wp0Var = new wp0(this.d, i11, context, d6Var);
                tp0Var.f42230f = wp0Var;
                wp0Var.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                wp0Var.a(tp0Var.h, false);
                wp0Var.setOnColorClick(new lp0(this, 1));
                sp0Var = wp0Var;
                break;
            case 2:
            default:
                sp0Var = new org.telegram.ui.Cells.e9(tp0Var.getContext(), zp0Var.getResourceProvider());
                break;
            case 3:
                sp0 sp0Var2 = new sp0(tp0Var, tp0Var.getContext());
                tp0Var.f42246y = sp0Var2;
                sp0Var2.b(false);
                sp0Var = sp0Var2;
                break;
            case 4:
                View aoVar = new org.telegram.ui.Components.ao(tp0Var.getContext(), 20);
                aoVar.setTag(-33024);
                k10Var = aoVar;
                sp0Var = k10Var;
                break;
            case 5:
                View view = new View(tp0Var.getContext());
                view.setTag(-33024);
                k10Var = view;
                sp0Var = k10Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(tp0Var.getContext(), zp0Var.getResourceProvider());
                r8Var.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                sp0Var = r8Var;
                break;
            case 7:
                Context context2 = tp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                sp0Var = m4Var;
                break;
            case 8:
                Context context3 = tp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                View hp0Var = new hp0(context3, d6Var3, false);
                hp0Var.setTag(-33024);
                k10Var = hp0Var;
                sp0Var = k10Var;
                break;
            case 9:
                Context context4 = this.f40047c;
                d6Var4 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                org.telegram.ui.Components.k10 k10Var2 = new org.telegram.ui.Components.k10(context4, d6Var4);
                k10Var2.setIsSingleCell(true);
                k10Var2.setViewType(35);
                k10Var2.setTag(-33024);
                k10Var = k10Var2;
                sp0Var = k10Var;
                break;
            case 10:
                View aoVar2 = new org.telegram.ui.Components.ao(tp0Var.getContext(), 21);
                aoVar2.setTag(-33024);
                k10Var = aoVar2;
                sp0Var = k10Var;
                break;
            case 11:
                sp0Var = new rp0(tp0Var, tp0Var.getContext());
                break;
            case 12:
                Context context5 = tp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, d6Var5);
                j1Var.setTag(-33024);
                k10Var = j1Var;
                sp0Var = k10Var;
                break;
        }
        return new s4.d1(sp0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        tp0 tp0Var = this.f40048e;
        ArrayList arrayList = tp0Var.f42237l0;
        int i10 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i10 == 10) {
            tp0Var.F = view;
            view.post(new jp0(tp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            hp0 hp0Var = (hp0) view;
            int b10 = d1Var.b() - tp0Var.f42224b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                hp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = tp0Var.f42242r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20259id) && ((tL_peerColorCollectible2 = tp0Var.f42243s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20259id)) {
                    z10 = false;
                }
                hp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = d1Var.b() - tp0Var.f42224b0;
            if (tp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = tp0Var.f42242r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20259id) && ((tL_peerColorCollectible = tp0Var.f42243s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20259id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
