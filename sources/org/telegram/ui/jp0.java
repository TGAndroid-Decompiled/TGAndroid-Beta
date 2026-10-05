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
public final class jp0 extends org.telegram.ui.Components.yl0 {
    public final Context f37750c;
    public final int d;
    public final qp0 f37751e;

    public jp0(qp0 qp0Var, Context context, int i10) {
        this.f37751e = qp0Var;
        this.f37750c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46542f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f37751e.f39844k0;
    }

    @Override
    public final int j(int i10) {
        qp0 qp0Var = this.f37751e;
        if (i10 == qp0Var.R || i10 == qp0Var.f39840g0 || i10 == qp0Var.T || i10 == qp0Var.W) {
            return 2;
        }
        if (i10 == qp0Var.Q) {
            return 1;
        }
        if (i10 == qp0Var.S) {
            return 3;
        }
        if (i10 == qp0Var.U) {
            return 5;
        }
        if (i10 == qp0Var.V) {
            return 6;
        }
        if (i10 == qp0Var.f39841h0) {
            return 10;
        }
        if (i10 == qp0Var.f39842i0) {
            return 11;
        }
        if (i10 == qp0Var.f39830a0) {
            return 7;
        }
        if (i10 >= qp0Var.f39832b0 && i10 < qp0Var.f39834c0) {
            if (qp0Var.K == null) {
                return 8;
            }
            return 12;
        } else if (i10 >= qp0Var.f39835d0 && i10 < qp0Var.f39837e0) {
            return 9;
        } else {
            if (i10 != qp0Var.f39844k0 - 1 && i10 != qp0Var.f39843j0) {
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
        View view = c1Var.f46538a;
        qp0 qp0Var = this.f37751e;
        HashMap hashMap = qp0Var.M;
        ArrayList arrayList = qp0Var.f39845l0;
        ArrayList arrayList2 = qp0Var.L;
        wp0 wp0Var = qp0Var.f39849p0;
        int j3 = j(i10);
        int i15 = this.d;
        int i16 = 1;
        r10 = true;
        boolean z12 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                ((tp0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == qp0Var.R) {
                    if (i15 == 1) {
                        if (wp0Var.f42646a) {
                            i12 = R.string.ChannelColorHint;
                        } else {
                            i12 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i12);
                    } else {
                        if (wp0Var.f42646a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.ld(this, i15, 20)), true));
                    return;
                } else if (i10 == qp0Var.W) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                } else if (i10 == qp0Var.f39840g0) {
                    e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                pp0 pp0Var = (pp0) view;
                wp0 wp0Var2 = pp0Var.d.f39849p0;
                pp0Var.setBackgroundColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                pp0Var.f39614a.setTextColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                r8Var.v();
                if (i10 == qp0Var.V) {
                    if (wp0Var.f42646a) {
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
                if (i10 == qp0Var.f39830a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                return;
            case 8:
                ep0 ep0Var = (ep0) view;
                int i17 = i10 - qp0Var.f39832b0;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    ep0Var.a(i17, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = qp0Var.f39850r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f20274id) || ((tL_peerColorCollectible = qp0Var.f39851s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f20274id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ep0Var.b(z10, false);
                    ep0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                qp0Var.F = view;
                vp0 vp0Var = qp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i14 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                ArrayList arrayList3 = yh.u5.y(i14, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i18);
                    if ((i15 == 0 || (i15 == i16 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (qp0Var.K == starGift) {
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
                ip0 ip0Var = new ip0(this, 0);
                ArrayList arrayList4 = vp0Var.f41799f;
                if (vp0Var.K == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vp0Var.K = 0;
                vp0Var.h = ip0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                vp0Var.f41797c.l();
                vp0Var.a(i19, z11);
                qp0Var.l(vp0Var);
                view.post(new gp0(qp0Var, 3));
                return;
            case 11:
                ((op0) view).a();
                return;
            case 12:
                xh.i1 i1Var = (xh.i1) view;
                int i20 = i10 - qp0Var.f39832b0;
                if (qp0Var.J != null && i20 >= 0 && i20 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i20);
                    i1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = qp0Var.f39850r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20274id) && ((tL_peerColorCollectible2 = qp0Var.f39851s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f20274id)) {
                        z12 = false;
                    }
                    i1Var.e(z12, false);
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
        pp0 pp0Var;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        qp0 qp0Var = this.f37751e;
        wp0 wp0Var = qp0Var.f39849p0;
        switch (i10) {
            case 1:
                Context context = qp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                tp0 tp0Var = new tp0(this.d, i11, context, d6Var);
                qp0Var.f39838f = tp0Var;
                tp0Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                tp0Var.a(qp0Var.h, false);
                tp0Var.setOnColorClick(new ip0(this, 1));
                pp0Var = tp0Var;
                break;
            case 2:
            default:
                pp0Var = new org.telegram.ui.Cells.e9(qp0Var.getContext(), wp0Var.getResourceProvider());
                break;
            case 3:
                pp0 pp0Var2 = new pp0(qp0Var, qp0Var.getContext());
                qp0Var.f39854y = pp0Var2;
                pp0Var2.b(false);
                pp0Var = pp0Var2;
                break;
            case 4:
                View nnVar = new org.telegram.ui.Components.nn(qp0Var.getContext(), 20);
                nnVar.setTag(-33024);
                w00Var = nnVar;
                pp0Var = w00Var;
                break;
            case 5:
                View view = new View(qp0Var.getContext());
                view.setTag(-33024);
                w00Var = view;
                pp0Var = w00Var;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(qp0Var.getContext(), wp0Var.getResourceProvider());
                r8Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                pp0Var = r8Var;
                break;
            case 7:
                Context context2 = qp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                pp0Var = m4Var;
                break;
            case 8:
                Context context3 = qp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                View ep0Var = new ep0(context3, d6Var3, false);
                ep0Var.setTag(-33024);
                w00Var = ep0Var;
                pp0Var = w00Var;
                break;
            case 9:
                Context context4 = this.f37750c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                org.telegram.ui.Components.w00 w00Var2 = new org.telegram.ui.Components.w00(context4, d6Var4);
                w00Var2.setIsSingleCell(true);
                w00Var2.setViewType(35);
                w00Var2.setTag(-33024);
                w00Var = w00Var2;
                pp0Var = w00Var;
                break;
            case 10:
                View nnVar2 = new org.telegram.ui.Components.nn(qp0Var.getContext(), 21);
                nnVar2.setTag(-33024);
                w00Var = nnVar2;
                pp0Var = w00Var;
                break;
            case 11:
                pp0Var = new op0(qp0Var, qp0Var.getContext());
                break;
            case 12:
                Context context5 = qp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                View i1Var = new xh.i1(context5, i12, d6Var5);
                i1Var.setTag(-33024);
                w00Var = i1Var;
                pp0Var = w00Var;
                break;
        }
        return new s4.c1(pp0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        qp0 qp0Var = this.f37751e;
        ArrayList arrayList = qp0Var.f39845l0;
        int i10 = c1Var.f46542f;
        View view = c1Var.f46538a;
        if (i10 == 10) {
            qp0Var.F = view;
            view.post(new gp0(qp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ep0 ep0Var = (ep0) view;
            int b10 = c1Var.b() - qp0Var.f39832b0;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ep0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = qp0Var.f39850r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f20274id) && ((tL_peerColorCollectible2 = qp0Var.f39851s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f20274id)) {
                    z10 = false;
                }
                ep0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            xh.i1 i1Var = (xh.i1) view;
            int b11 = c1Var.b() - qp0Var.f39832b0;
            if (qp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = qp0Var.f39850r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f20274id) && ((tL_peerColorCollectible = qp0Var.f39851s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f20274id)) {
                    z10 = false;
                }
                i1Var.e(z10, false);
            }
        }
    }
}
