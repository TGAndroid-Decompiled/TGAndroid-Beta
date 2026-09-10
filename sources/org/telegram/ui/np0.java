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
public final class np0 extends org.telegram.ui.Components.ul0 {
    public final Context f35320c;
    public final int d;
    public final up0 e;

    public np0(up0 up0Var, Context context, int i10) {
        this.e = up0Var;
        this.f35320c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f37319k0;
    }

    @Override
    public final int j(int i10) {
        up0 up0Var = this.e;
        if (i10 == up0Var.R || i10 == up0Var.f37315g0 || i10 == up0Var.T || i10 == up0Var.W) {
            return 2;
        }
        if (i10 == up0Var.Q) {
            return 1;
        }
        if (i10 == up0Var.S) {
            return 3;
        }
        if (i10 == up0Var.U) {
            return 5;
        }
        if (i10 == up0Var.V) {
            return 6;
        }
        if (i10 == up0Var.f37316h0) {
            return 10;
        }
        if (i10 == up0Var.f37317i0) {
            return 11;
        }
        if (i10 == up0Var.f37306a0) {
            return 7;
        }
        if (i10 >= up0Var.f37308b0 && i10 < up0Var.f37310c0) {
            if (up0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= up0Var.f37311d0 && i10 < up0Var.f37312e0) {
            return 9;
        } else {
            if (i10 != up0Var.f37319k0 - 1 && i10 != up0Var.f37318j0) {
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
        View view = c1Var.f41610a;
        up0 up0Var = this.e;
        HashMap hashMap = up0Var.M;
        ArrayList arrayList = up0Var.f37320l0;
        ArrayList arrayList2 = up0Var.L;
        bq0 bq0Var = up0Var.f37324p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                ((xp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 == up0Var.R) {
                    if (i15 == 1) {
                        if (bq0Var.f31337a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (bq0Var.f31337a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    f9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.zd(this, i15, 20)), true));
                    return;
                } else if (i10 == up0Var.W) {
                    f9Var.setText("");
                    f9Var.setFixedSize(12);
                    return;
                } else if (i10 == up0Var.f37315g0) {
                    f9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                tp0 tp0Var = (tp0) view;
                bq0 bq0Var2 = tp0Var.d.f37324p0;
                tp0Var.setBackgroundColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                tp0Var.f36984a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.v();
                s8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                s8Var.v();
                if (i10 == up0Var.V) {
                    if (bq0Var.f31337a) {
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
                if (i10 == up0Var.f37306a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                return;
            case 8:
                ip0 ip0Var = (ip0) view;
                int i17 = i10 - up0Var.f37308b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    ip0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = up0Var.f37325r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f17425id) || ((tL_peerColorCollectible = up0Var.f37326s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f17425id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ip0Var.b(z10, false);
                    ip0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                up0Var.F = view;
                aq0 aq0Var = up0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                ArrayList arrayList3 = xh.v5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (up0Var.K == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        y5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                mp0 mp0Var = new mp0(this, 0);
                ArrayList arrayList4 = aq0Var.f31054f;
                if (aq0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aq0Var.K = 0;
                aq0Var.h = mp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                aq0Var.f31053c.l();
                aq0Var.a(i19, z11);
                up0Var.l(aq0Var);
                view.post(new kp0(up0Var, 3));
                return;
            case 11:
                ((sp0) view).a();
                return;
            case 12:
                wh.h1 h1Var = (wh.h1) view;
                int i20 = i10 - up0Var.f37308b0;
                if (up0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.f37325r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f17425id) && ((tL_peerColorCollectible2 = up0Var.f37326s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f17425id)) {
                        z12 = false;
                    }
                    h1Var.e(z12, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.Components.a10 a10Var;
        tp0 tp0Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        up0 up0Var = this.e;
        bq0 bq0Var = up0Var.f37324p0;
        switch (i10) {
            case 1:
                Context context = up0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                xp0 xp0Var = new xp0(this.d, i11, context, f6Var);
                up0Var.f37313f = xp0Var;
                xp0Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                xp0Var.a(up0Var.h, false);
                xp0Var.setOnColorClick(new mp0(this, 1));
                tp0Var = xp0Var;
                break;
            case 2:
            default:
                tp0Var = new org.telegram.ui.Cells.f9(up0Var.getContext(), bq0Var.getResourceProvider());
                break;
            case 3:
                tp0 tp0Var2 = new tp0(up0Var, up0Var.getContext());
                up0Var.f37329y = tp0Var2;
                tp0Var2.b(false);
                tp0Var = tp0Var2;
                break;
            case 4:
                View qnVar = new org.telegram.ui.Components.qn(up0Var.getContext(), 19);
                qnVar.setTag(-33024);
                a10Var = qnVar;
                tp0Var = a10Var;
                break;
            case 5:
                View view = new View(up0Var.getContext());
                view.setTag(-33024);
                a10Var = view;
                tp0Var = a10Var;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(up0Var.getContext(), bq0Var.getResourceProvider());
                s8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                tp0Var = s8Var;
                break;
            case 7:
                Context context2 = up0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, f6Var2);
                m4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                tp0Var = m4Var;
                break;
            case 8:
                Context context3 = up0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                View ip0Var = new ip0(context3, f6Var3, false);
                ip0Var.setTag(-33024);
                a10Var = ip0Var;
                tp0Var = a10Var;
                break;
            case 9:
                Context context4 = this.f35320c;
                f6Var4 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                org.telegram.ui.Components.a10 a10Var2 = new org.telegram.ui.Components.a10(context4, f6Var4);
                a10Var2.setIsSingleCell(true);
                a10Var2.setViewType(35);
                a10Var2.setTag(-33024);
                a10Var = a10Var2;
                tp0Var = a10Var;
                break;
            case 10:
                View qnVar2 = new org.telegram.ui.Components.qn(up0Var.getContext(), 20);
                qnVar2.setTag(-33024);
                a10Var = qnVar2;
                tp0Var = a10Var;
                break;
            case 11:
                tp0Var = new sp0(up0Var, up0Var.getContext());
                break;
            case 12:
                Context context5 = up0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                View h1Var = new wh.h1(context5, i12, f6Var5);
                h1Var.setTag(-33024);
                a10Var = h1Var;
                tp0Var = a10Var;
                break;
        }
        return new s4.c1(tp0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        up0 up0Var = this.e;
        ArrayList arrayList = up0Var.f37320l0;
        int i10 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i10 == 10) {
            up0Var.F = view;
            view.post(new kp0(up0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ip0 ip0Var = (ip0) view;
            int b10 = c1Var.b() - up0Var.f37308b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ip0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = up0Var.f37325r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f17425id) && ((tL_peerColorCollectible2 = up0Var.f37326s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f17425id)) {
                    z10 = false;
                }
                ip0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            wh.h1 h1Var = (wh.h1) view;
            int b11 = c1Var.b() - up0Var.f37308b0;
            if (up0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.f37325r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f17425id) && ((tL_peerColorCollectible = up0Var.f37326s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f17425id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
