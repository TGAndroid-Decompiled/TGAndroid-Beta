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
public final class fp0 extends org.telegram.ui.Components.yl0 {
    public final Context f33880c;
    public final int d;
    public final mp0 e;

    public fp0(mp0 mp0Var, Context context, int i10) {
        this.e = mp0Var;
        this.f33880c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43071f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f35746k0;
    }

    @Override
    public final int j(int i10) {
        mp0 mp0Var = this.e;
        if (i10 == mp0Var.R || i10 == mp0Var.f35742g0 || i10 == mp0Var.T || i10 == mp0Var.W) {
            return 2;
        }
        if (i10 == mp0Var.Q) {
            return 1;
        }
        if (i10 == mp0Var.S) {
            return 3;
        }
        if (i10 == mp0Var.U) {
            return 5;
        }
        if (i10 == mp0Var.V) {
            return 6;
        }
        if (i10 == mp0Var.f35743h0) {
            return 10;
        }
        if (i10 == mp0Var.f35744i0) {
            return 11;
        }
        if (i10 == mp0Var.f35733a0) {
            return 7;
        }
        if (i10 >= mp0Var.f35735b0 && i10 < mp0Var.f35737c0) {
            if (mp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= mp0Var.f35738d0 && i10 < mp0Var.f35739e0) {
            return 9;
        } else {
            if (i10 != mp0Var.f35746k0 - 1 && i10 != mp0Var.f35745j0) {
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
        View view = c1Var.f43068a;
        mp0 mp0Var = this.e;
        HashMap hashMap = mp0Var.M;
        ArrayList arrayList = mp0Var.f35747l0;
        ArrayList arrayList2 = mp0Var.L;
        sp0 sp0Var = mp0Var.f35751p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                ((pp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == mp0Var.R) {
                    if (i15 == 1) {
                        if (sp0Var.f37935a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (sp0Var.f37935a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.md(this, i15, 21)), true));
                    return;
                } else if (i10 == mp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == mp0Var.f35742g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                lp0 lp0Var = (lp0) view;
                sp0 sp0Var2 = lp0Var.d.f35751p0;
                lp0Var.setBackgroundColor(sp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                lp0Var.f35485a.setTextColor(sp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                r8Var.v();
                if (i10 == mp0Var.V) {
                    if (sp0Var.f37935a) {
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
                if (i10 == mp0Var.f35733a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                return;
            case 8:
                ap0 ap0Var = (ap0) view;
                int i17 = i10 - mp0Var.f35735b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    ap0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = mp0Var.f35752r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f18577id) || ((tL_peerColorCollectible = mp0Var.f35753s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f18577id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ap0Var.b(z10, false);
                    ap0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                mp0Var.F = view;
                rp0 rp0Var = mp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                ArrayList arrayList3 = yh.s5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (mp0Var.K == starGift) {
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
                ep0 ep0Var = new ep0(this, 0);
                ArrayList arrayList4 = rp0Var.f37532f;
                if (rp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rp0Var.K = 0;
                rp0Var.h = ep0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                rp0Var.f37531c.l();
                rp0Var.a(i19, z11);
                mp0Var.l(rp0Var);
                view.post(new cp0(mp0Var, 3));
                return;
            case 11:
                ((kp0) view).a();
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i20 = i10 - mp0Var.f35735b0;
                if (mp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = mp0Var.f35752r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18577id) && ((tL_peerColorCollectible2 = mp0Var.f35753s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f18577id)) {
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
        org.telegram.ui.Components.w00 w00Var;
        lp0 lp0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        mp0 mp0Var = this.e;
        sp0 sp0Var = mp0Var.f35751p0;
        switch (i10) {
            case 1:
                Context context = mp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                pp0 pp0Var = new pp0(this.d, i11, context, d6Var);
                mp0Var.f35740f = pp0Var;
                pp0Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                pp0Var.a(mp0Var.h, false);
                pp0Var.setOnColorClick(new ep0(this, 1));
                lp0Var = pp0Var;
                break;
            case 2:
            default:
                lp0Var = new org.telegram.ui.Cells.e9(mp0Var.getContext(), sp0Var.getResourceProvider());
                break;
            case 3:
                lp0 lp0Var2 = new lp0(mp0Var, mp0Var.getContext());
                mp0Var.f35756y = lp0Var2;
                lp0Var2.b(false);
                lp0Var = lp0Var2;
                break;
            case 4:
                View nnVar = new org.telegram.ui.Components.nn(mp0Var.getContext(), 20);
                nnVar.setTag(-33024);
                w00Var = nnVar;
                lp0Var = w00Var;
                break;
            case 5:
                View view = new View(mp0Var.getContext());
                view.setTag(-33024);
                w00Var = view;
                lp0Var = w00Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(mp0Var.getContext(), sp0Var.getResourceProvider());
                r8Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                lp0Var = r8Var;
                break;
            case 7:
                Context context2 = mp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
                lp0Var = m4Var;
                break;
            case 8:
                Context context3 = mp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                View ap0Var = new ap0(context3, d6Var3, false);
                ap0Var.setTag(-33024);
                w00Var = ap0Var;
                lp0Var = w00Var;
                break;
            case 9:
                Context context4 = this.f33880c;
                d6Var4 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                org.telegram.ui.Components.w00 w00Var2 = new org.telegram.ui.Components.w00(context4, d6Var4);
                w00Var2.setIsSingleCell(true);
                w00Var2.setViewType(35);
                w00Var2.setTag(-33024);
                w00Var = w00Var2;
                lp0Var = w00Var;
                break;
            case 10:
                View nnVar2 = new org.telegram.ui.Components.nn(mp0Var.getContext(), 21);
                nnVar2.setTag(-33024);
                w00Var = nnVar2;
                lp0Var = w00Var;
                break;
            case 11:
                lp0Var = new kp0(mp0Var, mp0Var.getContext());
                break;
            case 12:
                Context context5 = mp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) sp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.m2) sp0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, d6Var5);
                j1Var.setTag(-33024);
                w00Var = j1Var;
                lp0Var = w00Var;
                break;
        }
        return new s4.c1(lp0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        mp0 mp0Var = this.e;
        ArrayList arrayList = mp0Var.f35747l0;
        int i10 = c1Var.f43071f;
        View view = c1Var.f43068a;
        if (i10 == 10) {
            mp0Var.F = view;
            view.post(new cp0(mp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ap0 ap0Var = (ap0) view;
            int b10 = c1Var.b() - mp0Var.f35735b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ap0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = mp0Var.f35752r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f18577id) && ((tL_peerColorCollectible2 = mp0Var.f35753s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f18577id)) {
                    z10 = false;
                }
                ap0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - mp0Var.f35735b0;
            if (mp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = mp0Var.f35752r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f18577id) && ((tL_peerColorCollectible = mp0Var.f35753s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f18577id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
