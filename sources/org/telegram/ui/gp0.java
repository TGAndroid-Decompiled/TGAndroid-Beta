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
public final class gp0 extends org.telegram.ui.Components.wl0 {
    public final Context f34033c;
    public final int d;
    public final np0 e;

    public gp0(np0 np0Var, Context context, int i10) {
        this.e = np0Var;
        this.f34033c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f35949k0;
    }

    @Override
    public final int j(int i10) {
        np0 np0Var = this.e;
        if (i10 == np0Var.R || i10 == np0Var.f35945g0 || i10 == np0Var.T || i10 == np0Var.W) {
            return 2;
        }
        if (i10 == np0Var.Q) {
            return 1;
        }
        if (i10 == np0Var.S) {
            return 3;
        }
        if (i10 == np0Var.U) {
            return 5;
        }
        if (i10 == np0Var.V) {
            return 6;
        }
        if (i10 == np0Var.f35946h0) {
            return 10;
        }
        if (i10 == np0Var.f35947i0) {
            return 11;
        }
        if (i10 == np0Var.f35936a0) {
            return 7;
        }
        if (i10 >= np0Var.f35938b0 && i10 < np0Var.f35940c0) {
            if (np0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= np0Var.f35941d0 && i10 < np0Var.f35942e0) {
            return 9;
        } else {
            if (i10 != np0Var.f35949k0 - 1 && i10 != np0Var.f35948j0) {
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
        View view = c1Var.f42959a;
        np0 np0Var = this.e;
        HashMap hashMap = np0Var.M;
        ArrayList arrayList = np0Var.f35950l0;
        ArrayList arrayList2 = np0Var.L;
        tp0 tp0Var = np0Var.f35954p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                ((qp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == np0Var.R) {
                    if (i15 == 1) {
                        if (tp0Var.f38163a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (tp0Var.f38163a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.ld(this, i15, 21)), true));
                    return;
                } else if (i10 == np0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == np0Var.f35945g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                mp0 mp0Var = (mp0) view;
                tp0 tp0Var2 = mp0Var.d.f35954p0;
                mp0Var.setBackgroundColor(tp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                mp0Var.f35639a.setTextColor(tp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                r8Var.v();
                if (i10 == np0Var.V) {
                    if (tp0Var.f38163a) {
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
                if (i10 == np0Var.f35936a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                return;
            case 8:
                bp0 bp0Var = (bp0) view;
                int i17 = i10 - np0Var.f35938b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    bp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = np0Var.f35955r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f18560id) || ((tL_peerColorCollectible = np0Var.f35956s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f18560id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bp0Var.b(z10, false);
                    bp0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                np0Var.F = view;
                sp0 sp0Var = np0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                ArrayList arrayList3 = yh.s5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (np0Var.K == starGift) {
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
                fp0 fp0Var = new fp0(this, 0);
                ArrayList arrayList4 = sp0Var.f37840f;
                if (sp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sp0Var.K = 0;
                sp0Var.h = fp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                sp0Var.f37839c.l();
                sp0Var.a(i19, z11);
                np0Var.l(sp0Var);
                view.post(new dp0(np0Var, 3));
                return;
            case 11:
                ((lp0) view).a();
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i20 = i10 - np0Var.f35938b0;
                if (np0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.f35955r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18560id) && ((tL_peerColorCollectible2 = np0Var.f35956s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f18560id)) {
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
        org.telegram.ui.Components.v00 v00Var;
        mp0 mp0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        np0 np0Var = this.e;
        tp0 tp0Var = np0Var.f35954p0;
        switch (i10) {
            case 1:
                Context context = np0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                qp0 qp0Var = new qp0(this.d, i11, context, d6Var);
                np0Var.f35943f = qp0Var;
                qp0Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                qp0Var.a(np0Var.h, false);
                qp0Var.setOnColorClick(new fp0(this, 1));
                mp0Var = qp0Var;
                break;
            case 2:
            default:
                mp0Var = new org.telegram.ui.Cells.e9(np0Var.getContext(), tp0Var.getResourceProvider());
                break;
            case 3:
                mp0 mp0Var2 = new mp0(np0Var, np0Var.getContext());
                np0Var.f35959y = mp0Var2;
                mp0Var2.b(false);
                mp0Var = mp0Var2;
                break;
            case 4:
                View mnVar = new org.telegram.ui.Components.mn(np0Var.getContext(), 20);
                mnVar.setTag(-33024);
                v00Var = mnVar;
                mp0Var = v00Var;
                break;
            case 5:
                View view = new View(np0Var.getContext());
                view.setTag(-33024);
                v00Var = view;
                mp0Var = v00Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(np0Var.getContext(), tp0Var.getResourceProvider());
                r8Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                mp0Var = r8Var;
                break;
            case 7:
                Context context2 = np0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                mp0Var = m4Var;
                break;
            case 8:
                Context context3 = np0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                View bp0Var = new bp0(context3, d6Var3, false);
                bp0Var.setTag(-33024);
                v00Var = bp0Var;
                mp0Var = v00Var;
                break;
            case 9:
                Context context4 = this.f34033c;
                d6Var4 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                org.telegram.ui.Components.v00 v00Var2 = new org.telegram.ui.Components.v00(context4, d6Var4);
                v00Var2.setIsSingleCell(true);
                v00Var2.setViewType(35);
                v00Var2.setTag(-33024);
                v00Var = v00Var2;
                mp0Var = v00Var;
                break;
            case 10:
                View mnVar2 = new org.telegram.ui.Components.mn(np0Var.getContext(), 21);
                mnVar2.setTag(-33024);
                v00Var = mnVar2;
                mp0Var = v00Var;
                break;
            case 11:
                mp0Var = new lp0(np0Var, np0Var.getContext());
                break;
            case 12:
                Context context5 = np0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, d6Var5);
                j1Var.setTag(-33024);
                v00Var = j1Var;
                mp0Var = v00Var;
                break;
        }
        return new s4.c1(mp0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        np0 np0Var = this.e;
        ArrayList arrayList = np0Var.f35950l0;
        int i10 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i10 == 10) {
            np0Var.F = view;
            view.post(new dp0(np0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            bp0 bp0Var = (bp0) view;
            int b10 = c1Var.b() - np0Var.f35938b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                bp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = np0Var.f35955r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f18560id) && ((tL_peerColorCollectible2 = np0Var.f35956s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f18560id)) {
                    z10 = false;
                }
                bp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - np0Var.f35938b0;
            if (np0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.f35955r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18560id) && ((tL_peerColorCollectible = np0Var.f35956s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f18560id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
