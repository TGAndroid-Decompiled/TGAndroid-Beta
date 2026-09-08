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
public final class op0 extends org.telegram.ui.Components.kl0 {
    public final Context f39322c;
    public final int d;
    public final vp0 f39323e;

    public op0(vp0 vp0Var, Context context, int i10) {
        this.f39323e = vp0Var;
        this.f39322c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f39323e.f41641k0;
    }

    @Override
    public final int j(int i10) {
        vp0 vp0Var = this.f39323e;
        if (i10 == vp0Var.R || i10 == vp0Var.f41637g0 || i10 == vp0Var.T || i10 == vp0Var.W) {
            return 2;
        }
        if (i10 == vp0Var.Q) {
            return 1;
        }
        if (i10 == vp0Var.S) {
            return 3;
        }
        if (i10 == vp0Var.U) {
            return 5;
        }
        if (i10 == vp0Var.V) {
            return 6;
        }
        if (i10 == vp0Var.f41638h0) {
            return 10;
        }
        if (i10 == vp0Var.f41639i0) {
            return 11;
        }
        if (i10 == vp0Var.f41627a0) {
            return 7;
        }
        if (i10 >= vp0Var.f41629b0 && i10 < vp0Var.f41631c0) {
            if (vp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= vp0Var.f41632d0 && i10 < vp0Var.f41634e0) {
            return 9;
        } else {
            if (i10 != vp0Var.f41641k0 - 1 && i10 != vp0Var.f41640j0) {
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
        View view = c1Var.f45766a;
        vp0 vp0Var = this.f39323e;
        HashMap hashMap = vp0Var.M;
        ArrayList arrayList = vp0Var.f41642l0;
        ArrayList arrayList2 = vp0Var.L;
        bq0 bq0Var = vp0Var.f41646p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                ((yp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == vp0Var.R) {
                    if (i15 == 1) {
                        if (bq0Var.f34884a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (bq0Var.f34884a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m8(this, i15, 22)), true));
                    return;
                } else if (i10 == vp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == vp0Var.f41637g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                up0 up0Var = (up0) view;
                bq0 bq0Var2 = up0Var.d.f41646p0;
                up0Var.setBackgroundColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                up0Var.f41223a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                r8Var.v();
                if (i10 == vp0Var.V) {
                    if (bq0Var.f34884a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    r8Var.i(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == vp0Var.f41627a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                return;
            case 8:
                jp0 jp0Var = (jp0) view;
                int i17 = i10 - vp0Var.f41629b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    jp0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vp0Var.f41647r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20124id) || ((tL_peerColorCollectible = vp0Var.f41648s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20124id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jp0Var.b(z10, false);
                    jp0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                vp0Var.F = view;
                aq0 aq0Var = vp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                ArrayList arrayList3 = zh.s5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (vp0Var.K == starGift) {
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
                np0 np0Var = new np0(this, 0);
                ArrayList arrayList4 = aq0Var.f34557f;
                if (aq0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aq0Var.K = 0;
                aq0Var.h = np0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                aq0Var.f34555c.l();
                aq0Var.a(i19, z11);
                vp0Var.l(aq0Var);
                view.post(new lp0(vp0Var, 3));
                return;
            case 11:
                ((tp0) view).a();
                return;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i20 = i10 - vp0Var.f41629b0;
                if (vp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vp0Var.f41647r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20124id) && ((tL_peerColorCollectible2 = vp0Var.f41648s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20124id)) {
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
        org.telegram.ui.Components.t00 t00Var;
        up0 up0Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        vp0 vp0Var = this.f39323e;
        bq0 bq0Var = vp0Var.f41646p0;
        switch (i10) {
            case 1:
                Context context = vp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                yp0 yp0Var = new yp0(this.d, i11, context, f6Var);
                vp0Var.f41635f = yp0Var;
                yp0Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                yp0Var.a(vp0Var.h, false);
                yp0Var.setOnColorClick(new np0(this, 1));
                up0Var = yp0Var;
                break;
            case 2:
            default:
                up0Var = new org.telegram.ui.Cells.e9(vp0Var.getContext(), bq0Var.getResourceProvider());
                break;
            case 3:
                up0 up0Var2 = new up0(vp0Var, vp0Var.getContext());
                vp0Var.f41651y = up0Var2;
                up0Var2.b(false);
                up0Var = up0Var2;
                break;
            case 4:
                View jnVar = new org.telegram.ui.Components.jn(vp0Var.getContext(), 20);
                jnVar.setTag(-33024);
                t00Var = jnVar;
                up0Var = t00Var;
                break;
            case 5:
                View view = new View(vp0Var.getContext());
                view.setTag(-33024);
                t00Var = view;
                up0Var = t00Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(vp0Var.getContext(), bq0Var.getResourceProvider());
                r8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                up0Var = r8Var;
                break;
            case 7:
                Context context2 = vp0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, f6Var2);
                l4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
                up0Var = l4Var;
                break;
            case 8:
                Context context3 = vp0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                View jp0Var = new jp0(context3, f6Var3, false);
                jp0Var.setTag(-33024);
                t00Var = jp0Var;
                up0Var = t00Var;
                break;
            case 9:
                Context context4 = this.f39322c;
                f6Var4 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(context4, f6Var4);
                t00Var2.setIsSingleCell(true);
                t00Var2.setViewType(35);
                t00Var2.setTag(-33024);
                t00Var = t00Var2;
                up0Var = t00Var;
                break;
            case 10:
                View jnVar2 = new org.telegram.ui.Components.jn(vp0Var.getContext(), 21);
                jnVar2.setTag(-33024);
                t00Var = jnVar2;
                up0Var = t00Var;
                break;
            case 11:
                up0Var = new tp0(vp0Var, vp0Var.getContext());
                break;
            case 12:
                Context context5 = vp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                View h1Var = new yh.h1(context5, i12, f6Var5);
                h1Var.setTag(-33024);
                t00Var = h1Var;
                up0Var = t00Var;
                break;
        }
        return new s4.c1(up0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        vp0 vp0Var = this.f39323e;
        ArrayList arrayList = vp0Var.f41642l0;
        int i10 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i10 == 10) {
            vp0Var.F = view;
            view.post(new lp0(vp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            jp0 jp0Var = (jp0) view;
            int b10 = c1Var.b() - vp0Var.f41629b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                jp0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vp0Var.f41647r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20124id) && ((tL_peerColorCollectible2 = vp0Var.f41648s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20124id)) {
                    z10 = false;
                }
                jp0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = c1Var.b() - vp0Var.f41629b0;
            if (vp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vp0Var.f41647r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20124id) && ((tL_peerColorCollectible = vp0Var.f41648s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20124id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
