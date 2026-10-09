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
public final class np0 extends org.telegram.ui.Components.pm0 {
    public final Context f40309c;
    public final int d;
    public final up0 f40310e;

    public np0(up0 up0Var, Context context, int i10) {
        this.f40310e = up0Var;
        this.f40309c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47662f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f40310e.f42527k0;
    }

    @Override
    public final int j(int i10) {
        up0 up0Var = this.f40310e;
        if (i10 == up0Var.R || i10 == up0Var.f42523g0 || i10 == up0Var.T || i10 == up0Var.W) {
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
        if (i10 == up0Var.f42524h0) {
            return 10;
        }
        if (i10 == up0Var.f42525i0) {
            return 11;
        }
        if (i10 == up0Var.f42513a0) {
            return 7;
        }
        if (i10 >= up0Var.f42515b0 && i10 < up0Var.f42517c0) {
            if (up0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= up0Var.f42518d0 && i10 < up0Var.f42520e0) {
            return 9;
        } else {
            if (i10 != up0Var.f42527k0 - 1 && i10 != up0Var.f42526j0) {
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
        View view = d1Var.f47658a;
        up0 up0Var = this.f40310e;
        HashMap hashMap = up0Var.M;
        ArrayList arrayList = up0Var.f42528l0;
        ArrayList arrayList2 = up0Var.L;
        aq0 aq0Var = up0Var.f42532p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                ((xp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == up0Var.R) {
                    if (i15 == 1) {
                        if (aq0Var.f35979a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (aq0Var.f35979a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.nd(this, i15, 21)), true));
                    return;
                } else if (i10 == up0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == up0Var.f42523g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                tp0 tp0Var = (tp0) view;
                aq0 aq0Var2 = tp0Var.d.f42532p0;
                tp0Var.setBackgroundColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                tp0Var.f42040a.setTextColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                r8Var.v();
                if (i10 == up0Var.V) {
                    if (aq0Var.f35979a) {
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
                if (i10 == up0Var.f42513a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                return;
            case 8:
                ip0 ip0Var = (ip0) view;
                int i17 = i10 - up0Var.f42515b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    ip0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = up0Var.f42533r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20265id) || ((tL_peerColorCollectible = up0Var.f42534s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20265id)) {
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
                zp0 zp0Var = up0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                ArrayList arrayList3 = yh.m5.y(i14, false).I;
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
                        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        b6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(b6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                mp0 mp0Var = new mp0(this, 0);
                ArrayList arrayList4 = zp0Var.f45037f;
                if (zp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zp0Var.K = 0;
                zp0Var.h = mp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                zp0Var.f45035c.l();
                zp0Var.a(i19, z11);
                up0Var.l(zp0Var);
                view.post(new kp0(up0Var, 3));
                return;
            case 11:
                ((sp0) view).a();
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i20 = i10 - up0Var.f42515b0;
                if (up0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.f42533r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20265id) && ((tL_peerColorCollectible2 = up0Var.f42534s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20265id)) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.Components.j10 j10Var;
        tp0 tp0Var;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var5;
        up0 up0Var = this.f40310e;
        aq0 aq0Var = up0Var.f42532p0;
        switch (i10) {
            case 1:
                Context context = up0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                xp0 xp0Var = new xp0(this.d, i11, context, e6Var);
                up0Var.f42521f = xp0Var;
                xp0Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                xp0Var.a(up0Var.h, false);
                xp0Var.setOnColorClick(new mp0(this, 1));
                tp0Var = xp0Var;
                break;
            case 2:
            default:
                tp0Var = new org.telegram.ui.Cells.e9(up0Var.getContext(), aq0Var.getResourceProvider());
                break;
            case 3:
                tp0 tp0Var2 = new tp0(up0Var, up0Var.getContext());
                up0Var.f42537y = tp0Var2;
                tp0Var2.b(false);
                tp0Var = tp0Var2;
                break;
            case 4:
                View aoVar = new org.telegram.ui.Components.ao(up0Var.getContext(), 20);
                aoVar.setTag(-33024);
                j10Var = aoVar;
                tp0Var = j10Var;
                break;
            case 5:
                View view = new View(up0Var.getContext());
                view.setTag(-33024);
                j10Var = view;
                tp0Var = j10Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(up0Var.getContext(), aq0Var.getResourceProvider());
                r8Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                tp0Var = r8Var;
                break;
            case 7:
                Context context2 = up0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, e6Var2);
                m4Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                tp0Var = m4Var;
                break;
            case 8:
                Context context3 = up0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                View ip0Var = new ip0(context3, e6Var3, false);
                ip0Var.setTag(-33024);
                j10Var = ip0Var;
                tp0Var = j10Var;
                break;
            case 9:
                Context context4 = this.f40309c;
                e6Var4 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                org.telegram.ui.Components.j10 j10Var2 = new org.telegram.ui.Components.j10(context4, e6Var4);
                j10Var2.setIsSingleCell(true);
                j10Var2.setViewType(35);
                j10Var2.setTag(-33024);
                j10Var = j10Var2;
                tp0Var = j10Var;
                break;
            case 10:
                View aoVar2 = new org.telegram.ui.Components.ao(up0Var.getContext(), 21);
                aoVar2.setTag(-33024);
                j10Var = aoVar2;
                tp0Var = j10Var;
                break;
            case 11:
                tp0Var = new sp0(up0Var, up0Var.getContext());
                break;
            case 12:
                Context context5 = up0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, e6Var5);
                j1Var.setTag(-33024);
                j10Var = j1Var;
                tp0Var = j10Var;
                break;
        }
        return new s4.d1(tp0Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        up0 up0Var = this.f40310e;
        ArrayList arrayList = up0Var.f42528l0;
        int i10 = d1Var.f47662f;
        View view = d1Var.f47658a;
        if (i10 == 10) {
            up0Var.F = view;
            view.post(new kp0(up0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ip0 ip0Var = (ip0) view;
            int b10 = d1Var.b() - up0Var.f42515b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ip0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = up0Var.f42533r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20265id) && ((tL_peerColorCollectible2 = up0Var.f42534s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20265id)) {
                    z10 = false;
                }
                ip0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = d1Var.b() - up0Var.f42515b0;
            if (up0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.f42533r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20265id) && ((tL_peerColorCollectible = up0Var.f42534s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20265id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
