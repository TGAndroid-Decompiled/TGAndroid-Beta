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
public final class ap0 extends org.telegram.ui.Components.ql0 {
    public final Context f32622c;
    public final int d;
    public final hp0 e;

    public ap0(hp0 hp0Var, Context context, int i10) {
        this.e = hp0Var;
        this.f32622c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f34729h0;
    }

    @Override
    public final int j(int i10) {
        hp0 hp0Var = this.e;
        if (i10 == hp0Var.O || i10 == hp0Var.f34724d0 || i10 == hp0Var.Q || i10 == hp0Var.T) {
            return 2;
        }
        if (i10 == hp0Var.N) {
            return 1;
        }
        if (i10 == hp0Var.P) {
            return 3;
        }
        if (i10 == hp0Var.R) {
            return 5;
        }
        if (i10 == hp0Var.S) {
            return 6;
        }
        if (i10 == hp0Var.f34725e0) {
            return 10;
        }
        if (i10 == hp0Var.f34727f0) {
            return 11;
        }
        if (i10 == hp0Var.U) {
            return 7;
        }
        if (i10 >= hp0Var.V && i10 < hp0Var.W) {
            if (hp0Var.H == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= hp0Var.f34719a0 && i10 < hp0Var.f34721b0) {
            return 9;
        } else {
            if (i10 != hp0Var.f34729h0 - 1 && i10 != hp0Var.f34728g0) {
                return 2;
            }
            return 4;
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String string;
        int i12;
        int i13;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z4;
        int i14;
        boolean z10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = l1Var.f5774a;
        hp0 hp0Var = this.e;
        HashMap hashMap = hp0Var.J;
        ArrayList arrayList = hp0Var.f34730i0;
        ArrayList arrayList2 = hp0Var.I;
        np0 np0Var = hp0Var.m0;
        int j10 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z11 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                ((kp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                if (i10 == hp0Var.O) {
                    if (i15 == 1) {
                        if (np0Var.f36553a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (np0Var.f36553a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    z8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.dw(this, i15, 18)), true));
                    return;
                } else if (i10 == hp0Var.T) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                } else if (i10 == hp0Var.f34724d0) {
                    z8Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                gp0 gp0Var = (gp0) view;
                np0 np0Var2 = gp0Var.d.m0;
                gp0Var.setBackgroundColor(np0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                gp0Var.f34492a.setTextColor(np0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                n8Var.v();
                n8Var.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                n8Var.v();
                if (i10 == hp0Var.S) {
                    if (np0Var.f36553a) {
                        i13 = R.string.ChannelProfileColorReset;
                    } else {
                        i13 = R.string.UserProfileColorReset;
                    }
                    n8Var.i(LocaleController.getString(i13), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == hp0Var.U) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                return;
            case 8:
                vo0 vo0Var = (vo0) view;
                int i17 = i10 - hp0Var.V;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    vo0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = hp0Var.f34735r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f19384id) || ((tL_peerColorCollectible = hp0Var.f34736s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f19384id)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    vo0Var.b(z4, false);
                    vo0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                hp0Var.C = view;
                mp0 mp0Var = hp0Var.B;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                ArrayList arrayList3 = lh.t7.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (hp0Var.H == starGift) {
                            i19 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i16);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        u5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(u5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i18++;
                    i16 = 1;
                }
                zo0 zo0Var = new zo0(this, 0);
                ArrayList arrayList4 = mp0Var.f36152f;
                if (mp0Var.H == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mp0Var.H = 0;
                mp0Var.h = zo0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                mp0Var.f36151c.l();
                mp0Var.a(i19, z10);
                hp0Var.l(mp0Var);
                view.post(new xo0(hp0Var, 3));
                return;
            case 11:
                ((fp0) view).a();
                return;
            case 12:
                kh.x1 x1Var = (kh.x1) view;
                int i20 = i10 - hp0Var.V;
                if (hp0Var.G != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = hp0Var.f34735r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f19384id) && ((tL_peerColorCollectible2 = hp0Var.f34736s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f19384id)) {
                        z11 = false;
                    }
                    x1Var.e(z11, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.Components.u00 u00Var;
        gp0 gp0Var;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        hp0 hp0Var = this.e;
        np0 np0Var = hp0Var.m0;
        switch (i10) {
            case 1:
                Context context = hp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
                kp0 kp0Var = new kp0(this.d, i11, context, f6Var);
                hp0Var.f34726f = kp0Var;
                kp0Var.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                kp0Var.a(hp0Var.h, false);
                kp0Var.setOnColorClick(new zo0(this, 1));
                gp0Var = kp0Var;
                break;
            case 2:
            default:
                gp0Var = new org.telegram.ui.Cells.z8(hp0Var.getContext(), np0Var.getResourceProvider());
                break;
            case 3:
                gp0 gp0Var2 = new gp0(hp0Var, hp0Var.getContext());
                hp0Var.f34739y = gp0Var2;
                gp0Var2.b(false);
                gp0Var = gp0Var2;
                break;
            case 4:
                View gnVar = new org.telegram.ui.Components.gn(hp0Var.getContext(), 17);
                gnVar.setTag(-33024);
                u00Var = gnVar;
                gp0Var = u00Var;
                break;
            case 5:
                View view = new View(hp0Var.getContext());
                view.setTag(-33024);
                u00Var = view;
                gp0Var = u00Var;
                break;
            case 6:
                View n8Var = new org.telegram.ui.Cells.n8(hp0Var.getContext(), np0Var.getResourceProvider());
                n8Var.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                gp0Var = n8Var;
                break;
            case 7:
                Context context2 = hp0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, f6Var2);
                l4Var.setBackgroundColor(np0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
                gp0Var = l4Var;
                break;
            case 8:
                Context context3 = hp0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
                View vo0Var = new vo0(context3, f6Var3, false);
                vo0Var.setTag(-33024);
                u00Var = vo0Var;
                gp0Var = u00Var;
                break;
            case 9:
                Context context4 = this.f32622c;
                f6Var4 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
                org.telegram.ui.Components.u00 u00Var2 = new org.telegram.ui.Components.u00(context4, f6Var4);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(35);
                u00Var2.setTag(-33024);
                u00Var = u00Var2;
                gp0Var = u00Var;
                break;
            case 10:
                View gnVar2 = new org.telegram.ui.Components.gn(hp0Var.getContext(), 18);
                gnVar2.setTag(-33024);
                u00Var = gnVar2;
                gp0Var = u00Var;
                break;
            case 11:
                gp0Var = new fp0(hp0Var, hp0Var.getContext());
                break;
            case 12:
                Context context5 = hp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) np0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.p2) np0Var).resourceProvider;
                View x1Var = new kh.x1(context5, i12, f6Var5);
                x1Var.setTag(-33024);
                u00Var = x1Var;
                gp0Var = u00Var;
                break;
        }
        return new f2.l1(gp0Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        hp0 hp0Var = this.e;
        ArrayList arrayList = hp0Var.f34730i0;
        int i10 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i10 == 10) {
            hp0Var.C = view;
            view.post(new xo0(hp0Var, 2));
            return;
        }
        boolean z4 = true;
        if (i10 == 8) {
            vo0 vo0Var = (vo0) view;
            int b10 = l1Var.b() - hp0Var.V;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                vo0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = hp0Var.f34735r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f19384id) && ((tL_peerColorCollectible2 = hp0Var.f34736s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f19384id)) {
                    z4 = false;
                }
                vo0Var.b(z4, false);
            }
        } else if (i10 == 12) {
            kh.x1 x1Var = (kh.x1) view;
            int b11 = l1Var.b() - hp0Var.V;
            if (hp0Var.G != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                x1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = hp0Var.f34735r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f19384id) && ((tL_peerColorCollectible = hp0Var.f34736s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f19384id)) {
                    z4 = false;
                }
                x1Var.e(z4, false);
            }
        }
    }
}
