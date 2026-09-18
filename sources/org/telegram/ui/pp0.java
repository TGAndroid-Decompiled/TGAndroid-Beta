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
public final class pp0 extends org.telegram.ui.Components.vl0 {
    public final Context f36587c;
    public final int d;
    public final wp0 e;

    public pp0(wp0 wp0Var, Context context, int i10) {
        this.e = wp0Var;
        this.f36587c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f39216k0;
    }

    @Override
    public final int j(int i10) {
        wp0 wp0Var = this.e;
        if (i10 == wp0Var.R || i10 == wp0Var.f39212g0 || i10 == wp0Var.T || i10 == wp0Var.W) {
            return 2;
        }
        if (i10 == wp0Var.Q) {
            return 1;
        }
        if (i10 == wp0Var.S) {
            return 3;
        }
        if (i10 == wp0Var.U) {
            return 5;
        }
        if (i10 == wp0Var.V) {
            return 6;
        }
        if (i10 == wp0Var.f39213h0) {
            return 10;
        }
        if (i10 == wp0Var.f39214i0) {
            return 11;
        }
        if (i10 == wp0Var.f39203a0) {
            return 7;
        }
        if (i10 >= wp0Var.f39205b0 && i10 < wp0Var.f39207c0) {
            if (wp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= wp0Var.f39208d0 && i10 < wp0Var.f39209e0) {
            return 9;
        } else {
            if (i10 != wp0Var.f39216k0 - 1 && i10 != wp0Var.f39215j0) {
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
        View view = c1Var.f42929a;
        wp0 wp0Var = this.e;
        HashMap hashMap = wp0Var.M;
        ArrayList arrayList = wp0Var.f39217l0;
        ArrayList arrayList2 = wp0Var.L;
        cq0 cq0Var = wp0Var.f39221p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                ((zp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == wp0Var.R) {
                    if (i15 == 1) {
                        if (cq0Var.f32736a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (cq0Var.f32736a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.x2(this, i15, 23)), true));
                    return;
                } else if (i10 == wp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == wp0Var.f39212g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                vp0 vp0Var = (vp0) view;
                cq0 cq0Var2 = vp0Var.d.f39221p0;
                vp0Var.setBackgroundColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                vp0Var.f38605a.setTextColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                r8Var.v();
                if (i10 == wp0Var.V) {
                    if (cq0Var.f32736a) {
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
                if (i10 == wp0Var.f39203a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                return;
            case 8:
                kp0 kp0Var = (kp0) view;
                int i17 = i10 - wp0Var.f39205b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    kp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wp0Var.f39222r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f18521id) || ((tL_peerColorCollectible = wp0Var.f39223s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f18521id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kp0Var.b(z10, false);
                    kp0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                wp0Var.F = view;
                bq0 bq0Var = wp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                ArrayList arrayList3 = yh.t5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (wp0Var.K == starGift) {
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
                op0 op0Var = new op0(this, 0);
                ArrayList arrayList4 = bq0Var.f32438f;
                if (bq0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bq0Var.K = 0;
                bq0Var.h = op0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                bq0Var.f32437c.l();
                bq0Var.a(i19, z11);
                wp0Var.l(bq0Var);
                view.post(new mp0(wp0Var, 3));
                return;
            case 11:
                ((up0) view).a();
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i20 = i10 - wp0Var.f39205b0;
                if (wp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wp0Var.f39222r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18521id) && ((tL_peerColorCollectible2 = wp0Var.f39223s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f18521id)) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.Components.t00 t00Var;
        vp0 vp0Var;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var5;
        wp0 wp0Var = this.e;
        cq0 cq0Var = wp0Var.f39221p0;
        switch (i10) {
            case 1:
                Context context = wp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                zp0 zp0Var = new zp0(this.d, i11, context, e6Var);
                wp0Var.f39210f = zp0Var;
                zp0Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                zp0Var.a(wp0Var.h, false);
                zp0Var.setOnColorClick(new op0(this, 1));
                vp0Var = zp0Var;
                break;
            case 2:
            default:
                vp0Var = new org.telegram.ui.Cells.e9(wp0Var.getContext(), cq0Var.getResourceProvider());
                break;
            case 3:
                vp0 vp0Var2 = new vp0(wp0Var, wp0Var.getContext());
                wp0Var.f39226y = vp0Var2;
                vp0Var2.b(false);
                vp0Var = vp0Var2;
                break;
            case 4:
                View knVar = new org.telegram.ui.Components.kn(wp0Var.getContext(), 20);
                knVar.setTag(-33024);
                t00Var = knVar;
                vp0Var = t00Var;
                break;
            case 5:
                View view = new View(wp0Var.getContext());
                view.setTag(-33024);
                t00Var = view;
                vp0Var = t00Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(wp0Var.getContext(), cq0Var.getResourceProvider());
                r8Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                vp0Var = r8Var;
                break;
            case 7:
                Context context2 = wp0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, e6Var2);
                m4Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
                vp0Var = m4Var;
                break;
            case 8:
                Context context3 = wp0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                View kp0Var = new kp0(context3, e6Var3, false);
                kp0Var.setTag(-33024);
                t00Var = kp0Var;
                vp0Var = t00Var;
                break;
            case 9:
                Context context4 = this.f36587c;
                e6Var4 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(context4, e6Var4);
                t00Var2.setIsSingleCell(true);
                t00Var2.setViewType(35);
                t00Var2.setTag(-33024);
                t00Var = t00Var2;
                vp0Var = t00Var;
                break;
            case 10:
                View knVar2 = new org.telegram.ui.Components.kn(wp0Var.getContext(), 21);
                knVar2.setTag(-33024);
                t00Var = knVar2;
                vp0Var = t00Var;
                break;
            case 11:
                vp0Var = new up0(wp0Var, wp0Var.getContext());
                break;
            case 12:
                Context context5 = wp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, e6Var5);
                j1Var.setTag(-33024);
                t00Var = j1Var;
                vp0Var = t00Var;
                break;
        }
        return new s4.c1(vp0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        wp0 wp0Var = this.e;
        ArrayList arrayList = wp0Var.f39217l0;
        int i10 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i10 == 10) {
            wp0Var.F = view;
            view.post(new mp0(wp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            kp0 kp0Var = (kp0) view;
            int b10 = c1Var.b() - wp0Var.f39205b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                kp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wp0Var.f39222r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f18521id) && ((tL_peerColorCollectible2 = wp0Var.f39223s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f18521id)) {
                    z10 = false;
                }
                kp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - wp0Var.f39205b0;
            if (wp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wp0Var.f39222r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18521id) && ((tL_peerColorCollectible = wp0Var.f39223s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f18521id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
