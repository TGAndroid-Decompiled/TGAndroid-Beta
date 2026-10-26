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
public final class ep0 extends org.telegram.ui.Components.lm0 {
    public final Context f39155c;
    public final int d;
    public final lp0 e;

    public ep0(lp0 lp0Var, Context context, int i10) {
        this.e = lp0Var;
        this.f39155c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f41328k0;
    }

    @Override
    public final int j(int i10) {
        lp0 lp0Var = this.e;
        if (i10 == lp0Var.R || i10 == lp0Var.f41324g0 || i10 == lp0Var.T || i10 == lp0Var.W) {
            return 2;
        }
        if (i10 == lp0Var.Q) {
            return 1;
        }
        if (i10 == lp0Var.S) {
            return 3;
        }
        if (i10 == lp0Var.U) {
            return 5;
        }
        if (i10 == lp0Var.V) {
            return 6;
        }
        if (i10 == lp0Var.f41325h0) {
            return 10;
        }
        if (i10 == lp0Var.f41326i0) {
            return 11;
        }
        if (i10 == lp0Var.f41315a0) {
            return 7;
        }
        if (i10 >= lp0Var.f41317b0 && i10 < lp0Var.f41319c0) {
            if (lp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= lp0Var.f41320d0 && i10 < lp0Var.f41321e0) {
            return 9;
        } else {
            if (i10 != lp0Var.f41328k0 - 1 && i10 != lp0Var.f41327j0) {
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
        View view = e1Var.f47738a;
        lp0 lp0Var = this.e;
        HashMap hashMap = lp0Var.M;
        ArrayList arrayList = lp0Var.f41329l0;
        ArrayList arrayList2 = lp0Var.L;
        rp0 rp0Var = lp0Var.f41333p0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j10) {
            case 1:
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, view, rp0Var.getResourceProvider());
                ((op0) view).updateColors();
                return;
            case 2:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                if (i10 == lp0Var.R) {
                    if (i15 == 1) {
                        if (rp0Var.f43225a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (rp0Var.f43225a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    i9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.h2(this, i15, 24)), true));
                    return;
                } else if (i10 == lp0Var.W) {
                    i9Var.setText("");
                    i9Var.setFixedSize(12);
                    return;
                } else if (i10 == lp0Var.f41324g0) {
                    i9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                ((kp0) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                v8Var.updateColors();
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var, rp0Var.getResourceProvider());
                v8Var.updateColors();
                if (i10 == lp0Var.V) {
                    if (rp0Var.f43225a) {
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
                if (i10 == lp0Var.f41315a0) {
                    q4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, rp0Var.getResourceProvider());
                return;
            case 8:
                zo0 zo0Var = (zo0) view;
                int i17 = i10 - lp0Var.f41317b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    zo0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = lp0Var.f41334r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f22256id) || ((tL_peerColorCollectible = lp0Var.f41335s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f22256id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zo0Var.b(z10, false);
                    zo0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                lp0Var.F = view;
                qp0 qp0Var = lp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                ArrayList arrayList3 = bi.ca.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (lp0Var.K == starGift) {
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
                dp0 dp0Var = new dp0(this, 0);
                ArrayList arrayList4 = qp0Var.f42889f;
                if (qp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qp0Var.K = 0;
                qp0Var.h = dp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                qp0Var.f42888c.l();
                qp0Var.a(i19, z11);
                lp0Var.l(qp0Var);
                view.post(new bp0(lp0Var, 3));
                return;
            case 11:
                ((jp0) view).updateColors();
                return;
            case 12:
                zh.g1 g1Var = (zh.g1) view;
                int i20 = i10 - lp0Var.f41317b0;
                if (lp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = lp0Var.f41334r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22256id) && ((tL_peerColorCollectible2 = lp0Var.f41335s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f22256id)) {
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
        kp0 kp0Var;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var5;
        lp0 lp0Var = this.e;
        rp0 rp0Var = lp0Var.f41333p0;
        switch (i10) {
            case 1:
                Context context = lp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                op0 op0Var = new op0(this.d, i11, context, u6Var);
                lp0Var.f41322f = op0Var;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, op0Var, rp0Var.getResourceProvider());
                op0Var.a(lp0Var.h, false);
                op0Var.setOnColorClick(new dp0(this, 1));
                kp0Var = op0Var;
                break;
            case 2:
            default:
                kp0Var = new org.telegram.ui.Cells.i9(lp0Var.getContext(), rp0Var.getResourceProvider());
                break;
            case 3:
                kp0 kp0Var2 = new kp0(lp0Var, lp0Var.getContext());
                lp0Var.f41338y = kp0Var2;
                kp0Var2.b(false);
                kp0Var = kp0Var2;
                break;
            case 4:
                View vnVar = new org.telegram.ui.Components.vn(lp0Var.getContext(), 20);
                vnVar.setTag(-33024);
                c10Var = vnVar;
                kp0Var = c10Var;
                break;
            case 5:
                View view = new View(lp0Var.getContext());
                view.setTag(-33024);
                c10Var = view;
                kp0Var = c10Var;
                break;
            case 6:
                View v8Var = new org.telegram.ui.Cells.v8(lp0Var.getContext(), rp0Var.getResourceProvider());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var, rp0Var.getResourceProvider());
                kp0Var = v8Var;
                break;
            case 7:
                Context context2 = lp0Var.getContext();
                u6Var2 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                View q4Var = new org.telegram.ui.Cells.q4(context2, u6Var2);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var, rp0Var.getResourceProvider());
                kp0Var = q4Var;
                break;
            case 8:
                Context context3 = lp0Var.getContext();
                u6Var3 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                View zo0Var = new zo0(context3, u6Var3, false);
                zo0Var.setTag(-33024);
                c10Var = zo0Var;
                kp0Var = c10Var;
                break;
            case 9:
                Context context4 = this.f39155c;
                u6Var4 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(context4, u6Var4);
                c10Var2.setIsSingleCell(true);
                c10Var2.setViewType(35);
                c10Var2.setTag(-33024);
                c10Var = c10Var2;
                kp0Var = c10Var;
                break;
            case 10:
                View vnVar2 = new org.telegram.ui.Components.vn(lp0Var.getContext(), 21);
                vnVar2.setTag(-33024);
                c10Var = vnVar2;
                kp0Var = c10Var;
                break;
            case 11:
                kp0Var = new jp0(lp0Var, lp0Var.getContext());
                break;
            case 12:
                Context context5 = lp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                u6Var5 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
                View g1Var = new zh.g1(context5, i12, u6Var5);
                g1Var.setTag(-33024);
                c10Var = g1Var;
                kp0Var = c10Var;
                break;
        }
        return new s4.e1(kp0Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        lp0 lp0Var = this.e;
        ArrayList arrayList = lp0Var.f41329l0;
        int i10 = e1Var.f47741f;
        View view = e1Var.f47738a;
        if (i10 == 10) {
            lp0Var.F = view;
            view.post(new bp0(lp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            zo0 zo0Var = (zo0) view;
            int b10 = e1Var.b() - lp0Var.f41317b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                zo0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = lp0Var.f41334r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f22256id) && ((tL_peerColorCollectible2 = lp0Var.f41335s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f22256id)) {
                    z10 = false;
                }
                zo0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            zh.g1 g1Var = (zh.g1) view;
            int b11 = e1Var.b() - lp0Var.f41317b0;
            if (lp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = lp0Var.f41334r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22256id) && ((tL_peerColorCollectible = lp0Var.f41335s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f22256id)) {
                    z10 = false;
                }
                g1Var.f(z10, false);
            }
        }
    }
}
