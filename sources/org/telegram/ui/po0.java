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

public final class po0 extends org.telegram.ui.Components.yk0 {

    public final Context f41404c;
    public final int d;

    public final vo0 f41405e;

    public po0(vo0 vo0Var, Context context, int i10) {
        this.f41405e = vo0Var;
        this.f41404c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override
    public final int h() {
        return this.f41405e.f43496a0;
    }

    @Override
    public final int j(int i10) {
        vo0 vo0Var = this.f41405e;
        if (i10 != vo0Var.I && i10 != vo0Var.U && i10 != vo0Var.K && i10 != vo0Var.N) {
            if (i10 == vo0Var.H) {
                return 1;
            }
            if (i10 == vo0Var.J) {
                return 3;
            }
            if (i10 == vo0Var.L) {
                return 5;
            }
            if (i10 == vo0Var.M) {
                return 6;
            }
            if (i10 == vo0Var.V) {
                return 10;
            }
            if (i10 == vo0Var.W) {
                return 11;
            }
            if (i10 == vo0Var.O) {
                return 7;
            }
            if (i10 >= vo0Var.P && i10 < vo0Var.Q) {
                return vo0Var.B == null ? 8 : 12;
            }
            if (i10 >= vo0Var.R && i10 < vo0Var.S) {
                return 9;
            }
            if (i10 == vo0Var.f43496a0 - 1) {
                return 4;
            }
        }
        return 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = o1Var.f5789a;
        vo0 vo0Var = this.f41405e;
        HashMap map = vo0Var.D;
        ArrayList arrayList = vo0Var.f43498b0;
        ArrayList arrayList2 = vo0Var.C;
        ap0 ap0Var = vo0Var.f43505f0;
        int iJ = j(i10);
        int i11 = this.d;
        int i12 = 1;
        z = true;
        boolean z10 = true;
        switch (iJ) {
            case 1:
                view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                ((yo0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                x8Var.setFixedSize(0);
                if (i10 == vo0Var.I) {
                    x8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(i11 == 1 ? LocaleController.getString(ap0Var.f36585a ? R.string.ChannelColorHint : R.string.UserColorHint) : LocaleController.getString(ap0Var.f36585a ? R.string.ChannelProfileHint : R.string.UserProfileHint2), new org.telegram.ui.Components.xl(this, i11, 19)), true));
                    x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), vo0Var.M >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                } else if (i10 == vo0Var.N) {
                    x8Var.setText("");
                    x8Var.setFixedSize(12);
                    x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), vo0Var.O >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                } else if (i10 == vo0Var.U) {
                    x8Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                }
                break;
            case 3:
                uo0 uo0Var = (uo0) view;
                ap0 ap0Var2 = uo0Var.d.f43505f0;
                uo0Var.setBackgroundColor(ap0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                uo0Var.f43266a.setTextColor(ap0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.v();
                l8Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                l8Var.v();
                if (i10 == vo0Var.M) {
                    l8Var.i(LocaleController.getString(ap0Var.f36585a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                }
                break;
            case 7:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == vo0Var.O) {
                    j4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                j4Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
            case 8:
                lo0 lo0Var = (lo0) view;
                int i13 = i10 - vo0Var.P;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i13);
                    lo0Var.a(i13, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vo0Var.f43508s;
                    lo0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f22607id) || ((tL_peerColorCollectible = vo0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f22607id), false);
                    lo0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                gh.j2 j2Var = (gh.j2) view;
                arrayList2.clear();
                map.clear();
                ArrayList arrayList3 = hh.u7.y(((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i14 = 0;
                int size = 0;
                while (i14 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i14);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (vo0Var.B == starGift) {
                            size = arrayList2.size();
                        }
                        map.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        t5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(t5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i14++;
                    i12 = 1;
                }
                j2Var.a(0, arrayList2, size, new oo0(this, 0));
                j2Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                j2Var.b();
                break;
            case 11:
                ((to0) view).a();
                break;
            case 12:
                gh.b2 b2Var = (gh.b2) view;
                int i15 = i10 - vo0Var.P;
                if (vo0Var.A != null && i15 >= 0 && i15 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i15);
                    b2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vo0Var.f43508s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22607id) && ((tL_peerColorCollectible2 = vo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f22607id)) {
                        z10 = false;
                    }
                    b2Var.e(z10, false);
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View zmVar;
        vo0 vo0Var = this.f41405e;
        ap0 ap0Var = vo0Var.f43505f0;
        switch (i10) {
            case 1:
                Context context = vo0Var.getContext();
                yo0 yo0Var = new yo0(this.d, ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount, context, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
                vo0Var.h = yo0Var;
                yo0Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                yo0Var.a(vo0Var.f43506n, false);
                yo0Var.setOnColorClick(new oo0(this, 1));
                zmVar = yo0Var;
                break;
            case 2:
            default:
                zmVar = new org.telegram.ui.Cells.x8(vo0Var.getContext(), ap0Var.getResourceProvider());
                break;
            case 3:
                uo0 uo0Var = new uo0(vo0Var, vo0Var.getContext());
                vo0Var.f43510x = uo0Var;
                uo0Var.b(false);
                zmVar = uo0Var;
                break;
            case 4:
                org.telegram.ui.Components.zm zmVar2 = new org.telegram.ui.Components.zm(vo0Var.getContext(), 20);
                zmVar2.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                zmVar = zmVar2;
                break;
            case 5:
                zmVar = new org.telegram.ui.Components.zm(vo0Var.getContext(), 19);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(vo0Var.getContext(), ap0Var.getResourceProvider());
                l8Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                zmVar = l8Var;
                break;
            case 7:
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(vo0Var.getContext(), ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
                j4Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                zmVar = j4Var;
                break;
            case 8:
                zmVar = new lo0(vo0Var.getContext(), ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider, false);
                break;
            case 9:
                org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(this.f41404c, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(35);
                zmVar = h00Var;
                break;
            case 10:
                gh.j2 j2Var = new gh.j2(vo0Var.getContext(), false);
                j2Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                zmVar = j2Var;
                break;
            case 11:
                zmVar = new to0(vo0Var, vo0Var.getContext());
                break;
            case 12:
                zmVar = new gh.b2(vo0Var.getContext(), ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
                break;
        }
        return new org.telegram.ui.Components.lk0(zmVar);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        vo0 vo0Var = this.f41405e;
        ArrayList arrayList = vo0Var.f43498b0;
        int i10 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = true;
        if (i10 == 8) {
            lo0 lo0Var = (lo0) view;
            int iB = o1Var.b() - vo0Var.P;
            if (iB < 0 || iB >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(iB);
            lo0Var.a(iB, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vo0Var.f43508s;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f22607id) && ((tL_peerColorCollectible2 = vo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f22607id)) {
                z10 = false;
            }
            lo0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            gh.b2 b2Var = (gh.b2) view;
            int iB2 = o1Var.b() - vo0Var.P;
            if (vo0Var.A != null && iB2 >= 0 && iB2 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(iB2);
                b2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vo0Var.f43508s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22607id) && ((tL_peerColorCollectible = vo0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f22607id)) {
                    z10 = false;
                }
                b2Var.e(z10, false);
            }
        }
    }
}
