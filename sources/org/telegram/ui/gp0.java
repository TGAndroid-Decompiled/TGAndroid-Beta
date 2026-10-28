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
public final class gp0 extends org.telegram.ui.Components.mm0 {
    public final Context f39665c;
    public final int d;
    public final np0 e;

    public gp0(np0 np0Var, Context context, int i10) {
        this.e = np0Var;
        this.f39665c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f41851k0;
    }

    @Override
    public final int j(int i10) {
        np0 np0Var = this.e;
        if (i10 == np0Var.R || i10 == np0Var.f41847g0 || i10 == np0Var.T || i10 == np0Var.W) {
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
        if (i10 == np0Var.f41848h0) {
            return 10;
        }
        if (i10 == np0Var.f41849i0) {
            return 11;
        }
        if (i10 == np0Var.f41838a0) {
            return 7;
        }
        if (i10 >= np0Var.f41840b0 && i10 < np0Var.f41842c0) {
            if (np0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= np0Var.f41843d0 && i10 < np0Var.f41844e0) {
            return 9;
        } else {
            if (i10 != np0Var.f41851k0 - 1 && i10 != np0Var.f41850j0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        String string;
        int i12;
        int i13;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i14;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = e1Var.f47773a;
        np0 np0Var = this.e;
        HashMap hashMap = np0Var.M;
        ArrayList arrayList = np0Var.f41852l0;
        ArrayList arrayList2 = np0Var.L;
        tp0 tp0Var = np0Var.f41856p0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j10) {
            case 1:
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, view, tp0Var.getResourceProvider());
                ((qp0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                if (i10 == np0Var.R) {
                    if (i15 == 1) {
                        if (tp0Var.f43711a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (tp0Var.f43711a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    i9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.h2(this, i15, 24)), true));
                    return;
                } else if (i10 == np0Var.W) {
                    i9Var.setText("");
                    i9Var.setFixedSize(12);
                    return;
                } else if (i10 == np0Var.f41847g0) {
                    i9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                ((mp0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                v8Var.updateColors();
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, v8Var, tp0Var.getResourceProvider());
                v8Var.updateColors();
                if (i10 == np0Var.V) {
                    if (tp0Var.f43711a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    v8Var.k(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 == np0Var.f41838a0) {
                    q4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, q4Var, tp0Var.getResourceProvider());
                return;
            case 8:
                bp0 bp0Var = (bp0) view;
                int i17 = i10 - np0Var.f41840b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    bp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = np0Var.f41857r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f22257id) || ((tL_peerColorCollectible = np0Var.f41858s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f22257id)) {
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
                i14 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                ArrayList arrayList3 = bi.ca.y(i14, false).I;
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
                        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        c6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(c6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                fp0 fp0Var = new fp0(this, 0);
                ArrayList arrayList4 = sp0Var.f43376f;
                if (sp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sp0Var.K = 0;
                sp0Var.h = fp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                sp0Var.f43375c.l();
                sp0Var.a(i19, z11);
                np0Var.l(sp0Var);
                view.post(new dp0(np0Var, 3));
                return;
            case 11:
                ((lp0) view).updateColors();
                return;
            case 12:
                zh.g1 g1Var = (zh.g1) view;
                int i20 = i10 - np0Var.f41840b0;
                if (np0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.f41857r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22257id) && ((tL_peerColorCollectible2 = np0Var.f41858s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f22257id)) {
                        z12 = false;
                    }
                    g1Var.f(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.Components.c10 c10Var;
        mp0 mp0Var;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var5;
        np0 np0Var = this.e;
        tp0 tp0Var = np0Var.f41856p0;
        switch (i10) {
            case 1:
                Context context = np0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                qp0 qp0Var = new qp0(this.d, i11, context, u6Var);
                np0Var.f41845f = qp0Var;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, qp0Var, tp0Var.getResourceProvider());
                qp0Var.a(np0Var.h, false);
                qp0Var.setOnColorClick(new fp0(this, 1));
                mp0Var = qp0Var;
                break;
            case 2:
            default:
                mp0Var = new org.telegram.ui.Cells.i9(np0Var.getContext(), tp0Var.getResourceProvider());
                break;
            case 3:
                mp0 mp0Var2 = new mp0(np0Var, np0Var.getContext());
                np0Var.f41861y = mp0Var2;
                mp0Var2.b(false);
                mp0Var = mp0Var2;
                break;
            case 4:
                View vnVar = new org.telegram.ui.Components.vn(np0Var.getContext(), 20);
                vnVar.setTag(-33024);
                c10Var = vnVar;
                mp0Var = c10Var;
                break;
            case 5:
                View view = new View(np0Var.getContext());
                view.setTag(-33024);
                c10Var = view;
                mp0Var = c10Var;
                break;
            case 6:
                View v8Var = new org.telegram.ui.Cells.v8(np0Var.getContext(), tp0Var.getResourceProvider());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, v8Var, tp0Var.getResourceProvider());
                mp0Var = v8Var;
                break;
            case 7:
                Context context2 = np0Var.getContext();
                u6Var2 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                View q4Var = new org.telegram.ui.Cells.q4(context2, u6Var2);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, q4Var, tp0Var.getResourceProvider());
                mp0Var = q4Var;
                break;
            case 8:
                Context context3 = np0Var.getContext();
                u6Var3 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                View bp0Var = new bp0(context3, u6Var3, false);
                bp0Var.setTag(-33024);
                c10Var = bp0Var;
                mp0Var = c10Var;
                break;
            case 9:
                Context context4 = this.f39665c;
                u6Var4 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(context4, u6Var4);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(35);
                c10Var2.setTag(-33024);
                c10Var = c10Var2;
                mp0Var = c10Var;
                break;
            case 10:
                View vnVar2 = new org.telegram.ui.Components.vn(np0Var.getContext(), 21);
                vnVar2.setTag(-33024);
                c10Var = vnVar2;
                mp0Var = c10Var;
                break;
            case 11:
                mp0Var = new lp0(np0Var, np0Var.getContext());
                break;
            case 12:
                Context context5 = np0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                u6Var5 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                View g1Var = new zh.g1(context5, i12, u6Var5);
                g1Var.setTag(-33024);
                c10Var = g1Var;
                mp0Var = c10Var;
                break;
        }
        return new s4.e1(mp0Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        np0 np0Var = this.e;
        ArrayList arrayList = np0Var.f41852l0;
        int i10 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i10 == 10) {
            np0Var.F = view;
            view.post(new dp0(np0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            bp0 bp0Var = (bp0) view;
            int b10 = e1Var.b() - np0Var.f41840b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                bp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = np0Var.f41857r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f22257id) && ((tL_peerColorCollectible2 = np0Var.f41858s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f22257id)) {
                    z10 = false;
                }
                bp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            zh.g1 g1Var = (zh.g1) view;
            int b11 = e1Var.b() - np0Var.f41840b0;
            if (np0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.f41857r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22257id) && ((tL_peerColorCollectible = np0Var.f41858s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f22257id)) {
                    z10 = false;
                }
                g1Var.f(z10, false);
            }
        }
    }
}
