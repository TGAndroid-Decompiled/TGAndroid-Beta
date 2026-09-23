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
public final class hp0 extends org.telegram.ui.Components.ll0 {
    public final Context f33900c;
    public final int d;
    public final op0 e;

    public hp0(op0 op0Var, Context context, int i10) {
        this.e = op0Var;
        this.f33900c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f35933k0;
    }

    @Override
    public final int j(int i10) {
        op0 op0Var = this.e;
        if (i10 == op0Var.R || i10 == op0Var.f35929g0 || i10 == op0Var.T || i10 == op0Var.W) {
            return 2;
        }
        if (i10 == op0Var.Q) {
            return 1;
        }
        if (i10 == op0Var.S) {
            return 3;
        }
        if (i10 == op0Var.U) {
            return 5;
        }
        if (i10 == op0Var.V) {
            return 6;
        }
        if (i10 == op0Var.f35930h0) {
            return 10;
        }
        if (i10 == op0Var.f35931i0) {
            return 11;
        }
        if (i10 == op0Var.f35920a0) {
            return 7;
        }
        if (i10 >= op0Var.f35922b0 && i10 < op0Var.f35924c0) {
            if (op0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= op0Var.f35925d0 && i10 < op0Var.f35926e0) {
            return 9;
        } else {
            if (i10 != op0Var.f35933k0 - 1 && i10 != op0Var.f35932j0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String string;
        int i12;
        int i13;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i14;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = c1Var.f42627a;
        op0 op0Var = this.e;
        HashMap hashMap = op0Var.M;
        ArrayList arrayList = op0Var.f35934l0;
        ArrayList arrayList2 = op0Var.L;
        up0 up0Var = op0Var.f35938p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                ((rp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 == op0Var.R) {
                    if (i15 == 1) {
                        if (up0Var.f38143a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (up0Var.f38143a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    f9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.kd(this, i15, 21)), true));
                    return;
                } else if (i10 == op0Var.W) {
                    f9Var.setText("");
                    f9Var.setFixedSize(12);
                    return;
                } else if (i10 == op0Var.f35929g0) {
                    f9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                np0 np0Var = (np0) view;
                up0 up0Var2 = np0Var.d.f35938p0;
                np0Var.setBackgroundColor(up0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                np0Var.f35574a.setTextColor(up0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.v();
                s8Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                s8Var.v();
                if (i10 == op0Var.V) {
                    if (up0Var.f38143a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    s8Var.i(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == op0Var.f35920a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                return;
            case 8:
                cp0 cp0Var = (cp0) view;
                int i17 = i10 - op0Var.f35922b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    cp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = op0Var.f35939r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f18308id) || ((tL_peerColorCollectible = op0Var.f35940s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f18308id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cp0Var.b(z10, false);
                    cp0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                op0Var.F = view;
                tp0 tp0Var = op0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                ArrayList arrayList3 = yh.t5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (op0Var.K == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        z5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(z5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                gp0 gp0Var = new gp0(this, 0);
                ArrayList arrayList4 = tp0Var.f37734f;
                if (tp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tp0Var.K = 0;
                tp0Var.h = gp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                tp0Var.f37733c.l();
                tp0Var.a(i19, z11);
                op0Var.l(tp0Var);
                view.post(new ep0(op0Var, 3));
                return;
            case 11:
                ((mp0) view).a();
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i20 = i10 - op0Var.f35922b0;
                if (op0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = op0Var.f35939r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18308id) && ((tL_peerColorCollectible2 = op0Var.f35940s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f18308id)) {
                        z12 = false;
                    }
                    j1Var.e(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.Components.u00 u00Var;
        np0 np0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        op0 op0Var = this.e;
        up0 up0Var = op0Var.f35938p0;
        switch (i10) {
            case 1:
                Context context = op0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                rp0 rp0Var = new rp0(this.d, i11, context, d6Var);
                op0Var.f35927f = rp0Var;
                rp0Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                rp0Var.a(op0Var.h, false);
                rp0Var.setOnColorClick(new gp0(this, 1));
                np0Var = rp0Var;
                break;
            case 2:
            default:
                np0Var = new org.telegram.ui.Cells.f9(op0Var.getContext(), up0Var.getResourceProvider());
                break;
            case 3:
                np0 np0Var2 = new np0(op0Var, op0Var.getContext());
                op0Var.f35943y = np0Var2;
                np0Var2.b(false);
                np0Var = np0Var2;
                break;
            case 4:
                View lnVar = new org.telegram.ui.Components.ln(op0Var.getContext(), 20);
                lnVar.setTag(-33024);
                u00Var = lnVar;
                np0Var = u00Var;
                break;
            case 5:
                View view = new View(op0Var.getContext());
                view.setTag(-33024);
                u00Var = view;
                np0Var = u00Var;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(op0Var.getContext(), up0Var.getResourceProvider());
                s8Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                np0Var = s8Var;
                break;
            case 7:
                Context context2 = op0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                np0Var = m4Var;
                break;
            case 8:
                Context context3 = op0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                View cp0Var = new cp0(context3, d6Var3, false);
                cp0Var.setTag(-33024);
                u00Var = cp0Var;
                np0Var = u00Var;
                break;
            case 9:
                Context context4 = this.f33900c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                org.telegram.ui.Components.u00 u00Var2 = new org.telegram.ui.Components.u00(context4, d6Var4);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(35);
                u00Var2.setTag(-33024);
                u00Var = u00Var2;
                np0Var = u00Var;
                break;
            case 10:
                View lnVar2 = new org.telegram.ui.Components.ln(op0Var.getContext(), 21);
                lnVar2.setTag(-33024);
                u00Var = lnVar2;
                np0Var = u00Var;
                break;
            case 11:
                np0Var = new mp0(op0Var, op0Var.getContext());
                break;
            case 12:
                Context context5 = op0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, d6Var5);
                j1Var.setTag(-33024);
                u00Var = j1Var;
                np0Var = u00Var;
                break;
        }
        return new s4.c1(np0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        op0 op0Var = this.e;
        ArrayList arrayList = op0Var.f35934l0;
        int i10 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i10 == 10) {
            op0Var.F = view;
            view.post(new ep0(op0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            cp0 cp0Var = (cp0) view;
            int b10 = c1Var.b() - op0Var.f35922b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                cp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = op0Var.f35939r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f18308id) && ((tL_peerColorCollectible2 = op0Var.f35940s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f18308id)) {
                    z10 = false;
                }
                cp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - op0Var.f35922b0;
            if (op0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = op0Var.f35939r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18308id) && ((tL_peerColorCollectible = op0Var.f35940s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f18308id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
