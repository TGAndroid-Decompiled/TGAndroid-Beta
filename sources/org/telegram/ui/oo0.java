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
public final class oo0 extends org.telegram.ui.Components.vk0 {
    public final Context f41215c;
    public final int d;
    public final uo0 f41216e;

    public oo0(uo0 uo0Var, Context context, int i9) {
        this.f41216e = uo0Var;
        this.f41215c = context;
        this.d = i9;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 6 && i9 != 8 && i9 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f41216e.f43278a0;
    }

    @Override
    public final int j(int i9) {
        uo0 uo0Var = this.f41216e;
        if (i9 != uo0Var.I && i9 != uo0Var.U && i9 != uo0Var.K && i9 != uo0Var.N) {
            if (i9 == uo0Var.H) {
                return 1;
            }
            if (i9 == uo0Var.J) {
                return 3;
            }
            if (i9 == uo0Var.L) {
                return 5;
            }
            if (i9 == uo0Var.M) {
                return 6;
            }
            if (i9 == uo0Var.V) {
                return 10;
            }
            if (i9 == uo0Var.W) {
                return 11;
            }
            if (i9 == uo0Var.O) {
                return 7;
            }
            if (i9 >= uo0Var.P && i9 < uo0Var.Q) {
                if (uo0Var.B == null) {
                    return 8;
                }
                return 12;
            } else if (i9 >= uo0Var.R && i9 < uo0Var.S) {
                return 9;
            } else {
                if (i9 == uo0Var.f43278a0 - 1) {
                    return 4;
                }
            }
        }
        return 2;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        String string;
        int i12;
        int i13;
        int i14;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i15;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = q1Var.f5501a;
        uo0 uo0Var = this.f41216e;
        HashMap hashMap = uo0Var.D;
        ArrayList arrayList = uo0Var.f43280b0;
        ArrayList arrayList2 = uo0Var.C;
        zo0 zo0Var = uo0Var.f43287f0;
        int j10 = j(i9);
        int i16 = this.d;
        int i17 = 1;
        r10 = true;
        boolean z11 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                ((xo0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i9 == uo0Var.I) {
                    if (i16 == 1) {
                        if (zo0Var.f45192a) {
                            i13 = R.string.ChannelColorHint;
                        } else {
                            i13 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i13);
                    } else {
                        if (zo0Var.f45192a) {
                            i11 = R.string.ChannelProfileHint;
                        } else {
                            i11 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i11);
                    }
                    b9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.qd(this, i16, 20)), true));
                    Context context = uo0Var.getContext();
                    if (uo0Var.M >= 0) {
                        i12 = R.drawable.greydivider;
                    } else {
                        i12 = R.drawable.greydivider_bottom;
                    }
                    b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(context, i12, org.telegram.ui.ActionBar.f6.f22966b7));
                    return;
                } else if (i9 == uo0Var.N) {
                    b9Var.setText("");
                    b9Var.setFixedSize(12);
                    Context context2 = uo0Var.getContext();
                    if (uo0Var.O >= 0) {
                        i10 = R.drawable.greydivider;
                    } else {
                        i10 = R.drawable.greydivider_bottom;
                    }
                    b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(context2, i10, org.telegram.ui.ActionBar.f6.f22966b7));
                    return;
                } else if (i9 == uo0Var.U) {
                    b9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(uo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                    return;
                } else {
                    return;
                }
            case 3:
                to0 to0Var = (to0) view;
                zo0 zo0Var2 = to0Var.d.f43287f0;
                to0Var.setBackgroundColor(zo0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                to0Var.f43046a.setTextColor(zo0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.v();
                p8Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                p8Var.v();
                if (i9 == uo0Var.M) {
                    if (zo0Var.f45192a) {
                        i14 = R.string.ChannelProfileColorReset;
                    } else {
                        i14 = R.string.UserProfileColorReset;
                    }
                    p8Var.i(LocaleController.getString(i14), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == uo0Var.O) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                return;
            case 8:
                ko0 ko0Var = (ko0) view;
                int i18 = i9 - uo0Var.P;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i18);
                    ko0Var.a(i18, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = uo0Var.f43290s;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f22607id) || ((tL_peerColorCollectible = uo0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f22607id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ko0Var.b(z10, false);
                    ko0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                fh.o2 o2Var = (fh.o2) view;
                arrayList2.clear();
                hashMap.clear();
                i15 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                ArrayList arrayList3 = gh.v7.y(i15, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i19 = 0;
                int i20 = 0;
                while (i19 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i19);
                    if ((i16 == 0 || (i16 == i17 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (uo0Var.B == starGift) {
                            i20 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i17);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        t5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(t5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i19++;
                    i17 = 1;
                }
                o2Var.a(0, arrayList2, i20, new no0(this, 0));
                o2Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                o2Var.b();
                return;
            case 11:
                ((so0) view).a();
                return;
            case 12:
                fh.f2 f2Var = (fh.f2) view;
                int i21 = i9 - uo0Var.P;
                if (uo0Var.A != null && i21 >= 0 && i21 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i21);
                    f2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = uo0Var.f43290s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22607id) && ((tL_peerColorCollectible2 = uo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f22607id)) {
                        z11 = false;
                    }
                    f2Var.e(z11, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var5;
        to0 to0Var;
        uo0 uo0Var = this.f41216e;
        zo0 zo0Var = uo0Var.f43287f0;
        switch (i9) {
            case 1:
                Context context = uo0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                b6Var = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                xo0 xo0Var = new xo0(this.d, i10, context, b6Var);
                uo0Var.h = xo0Var;
                xo0Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                xo0Var.a(uo0Var.f43288n, false);
                xo0Var.setOnColorClick(new no0(this, 1));
                to0Var = xo0Var;
                break;
            case 2:
            default:
                to0Var = new org.telegram.ui.Cells.b9(uo0Var.getContext(), zo0Var.getResourceProvider());
                break;
            case 3:
                to0 to0Var2 = new to0(uo0Var, uo0Var.getContext());
                uo0Var.f43292x = to0Var2;
                to0Var2.b(false);
                to0Var = to0Var2;
                break;
            case 4:
                View anVar = new org.telegram.ui.Components.an(uo0Var.getContext(), 22);
                anVar.setBackground(org.telegram.ui.ActionBar.f6.V0(uo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                to0Var = anVar;
                break;
            case 5:
                to0Var = new org.telegram.ui.Components.an(uo0Var.getContext(), 21);
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(uo0Var.getContext(), zo0Var.getResourceProvider());
                p8Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                to0Var = p8Var;
                break;
            case 7:
                Context context2 = uo0Var.getContext();
                b6Var2 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, b6Var2);
                m4Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                to0Var = m4Var;
                break;
            case 8:
                Context context3 = uo0Var.getContext();
                b6Var3 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                to0Var = new ko0(context3, b6Var3, false);
                break;
            case 9:
                Context context4 = this.f41215c;
                b6Var4 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context4, b6Var4);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(35);
                to0Var = e00Var;
                break;
            case 10:
                View o2Var = new fh.o2(uo0Var.getContext(), false);
                o2Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                to0Var = o2Var;
                break;
            case 11:
                to0Var = new so0(uo0Var, uo0Var.getContext());
                break;
            case 12:
                Context context5 = uo0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                b6Var5 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                to0Var = new fh.f2(context5, i11, b6Var5);
                break;
        }
        return new f2.q1(to0Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        uo0 uo0Var = this.f41216e;
        ArrayList arrayList = uo0Var.f43280b0;
        int i9 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = true;
        if (i9 == 8) {
            ko0 ko0Var = (ko0) view;
            int b10 = q1Var.b() - uo0Var.P;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                ko0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = uo0Var.f43290s;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f22607id) && ((tL_peerColorCollectible2 = uo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f22607id)) {
                    z10 = false;
                }
                ko0Var.b(z10, false);
            }
        } else if (i9 == 12) {
            fh.f2 f2Var = (fh.f2) view;
            int b11 = q1Var.b() - uo0Var.P;
            if (uo0Var.A != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                f2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = uo0Var.f43290s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22607id) && ((tL_peerColorCollectible = uo0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f22607id)) {
                    z10 = false;
                }
                f2Var.e(z10, false);
            }
        }
    }
}
