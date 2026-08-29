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
public final class no0 extends org.telegram.ui.Components.il0 {
    public final Context f40854c;
    public final int d;
    public final to0 f40855e;

    public no0(to0 to0Var, Context context, int i10) {
        this.f40855e = to0Var;
        this.f40854c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 6 && i10 != 8 && i10 != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f40855e.f43068a0;
    }

    @Override
    public final int j(int i10) {
        to0 to0Var = this.f40855e;
        if (i10 != to0Var.I && i10 != to0Var.U && i10 != to0Var.K && i10 != to0Var.N) {
            if (i10 == to0Var.H) {
                return 1;
            }
            if (i10 == to0Var.J) {
                return 3;
            }
            if (i10 == to0Var.L) {
                return 5;
            }
            if (i10 == to0Var.M) {
                return 6;
            }
            if (i10 == to0Var.V) {
                return 10;
            }
            if (i10 == to0Var.W) {
                return 11;
            }
            if (i10 == to0Var.O) {
                return 7;
            }
            if (i10 >= to0Var.P && i10 < to0Var.Q) {
                if (to0Var.B == null) {
                    return 8;
                }
                return 12;
            } else if (i10 >= to0Var.R && i10 < to0Var.S) {
                return 9;
            } else {
                if (i10 == to0Var.f43068a0 - 1) {
                    return 4;
                }
            }
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        String string;
        int i13;
        int i14;
        int i15;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z10;
        int i16;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = n1Var.f6432a;
        to0 to0Var = this.f40855e;
        HashMap hashMap = to0Var.D;
        ArrayList arrayList = to0Var.f43070b0;
        ArrayList arrayList2 = to0Var.C;
        yo0 yo0Var = to0Var.f43077f0;
        int j10 = j(i10);
        int i17 = this.d;
        int i18 = 1;
        r10 = true;
        boolean z11 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                ((wo0) view).b();
                return;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i10 == to0Var.I) {
                    if (i17 == 1) {
                        if (yo0Var.f44941a) {
                            i14 = R.string.ChannelColorHint;
                        } else {
                            i14 = R.string.UserColorHint;
                        }
                        string = LocaleController.getString(i14);
                    } else {
                        if (yo0Var.f44941a) {
                            i12 = R.string.ChannelProfileHint;
                        } else {
                            i12 = R.string.UserProfileHint2;
                        }
                        string = LocaleController.getString(i12);
                    }
                    y8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.i8(this, i17, 22)), true));
                    Context context = to0Var.getContext();
                    if (to0Var.M >= 0) {
                        i13 = R.drawable.greydivider;
                    } else {
                        i13 = R.drawable.greydivider_bottom;
                    }
                    y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, i13, org.telegram.ui.ActionBar.g6.f23028b7));
                    return;
                } else if (i10 == to0Var.N) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    Context context2 = to0Var.getContext();
                    if (to0Var.O >= 0) {
                        i11 = R.drawable.greydivider;
                    } else {
                        i11 = R.drawable.greydivider_bottom;
                    }
                    y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context2, i11, org.telegram.ui.ActionBar.g6.f23028b7));
                    return;
                } else if (i10 == to0Var.U) {
                    y8Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                    y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(to0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                    return;
                } else {
                    return;
                }
            case 3:
                so0 so0Var = (so0) view;
                yo0 yo0Var2 = so0Var.d.f43077f0;
                so0Var.setBackgroundColor(yo0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                so0Var.f42437a.setTextColor(yo0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.v();
                m8Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                m8Var.v();
                if (i10 == to0Var.M) {
                    if (yo0Var.f44941a) {
                        i15 = R.string.ChannelProfileColorReset;
                    } else {
                        i15 = R.string.UserProfileColorReset;
                    }
                    m8Var.i(LocaleController.getString(i15), false);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == to0Var.O) {
                    k4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                k4Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                return;
            case 8:
                jo0 jo0Var = (jo0) view;
                int i19 = i10 - to0Var.P;
                if (i19 >= 0 && i19 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i19);
                    jo0Var.a(i19, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = to0Var.f43080s;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.f22619id) || ((tL_peerColorCollectible = to0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.f22619id)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jo0Var.b(z10, false);
                    jo0Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                ih.g2 g2Var = (ih.g2) view;
                arrayList2.clear();
                hashMap.clear();
                i16 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                ArrayList arrayList3 = jh.s7.y(i16, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i20 = 0;
                int i21 = 0;
                while (i20 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i20);
                    if ((i17 == 0 || (i17 == i18 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (to0Var.B == starGift) {
                            i21 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i18);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        y5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i20++;
                    i18 = 1;
                }
                g2Var.a(0, arrayList2, i21, new mo0(this, 0));
                g2Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                g2Var.b();
                return;
            case 11:
                ((ro0) view).a();
                return;
            case 12:
                ih.y1 y1Var = (ih.y1) view;
                int i22 = i10 - to0Var.P;
                if (to0Var.A != null && i22 >= 0 && i22 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i22);
                    y1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = to0Var.f43080s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22619id) && ((tL_peerColorCollectible2 = to0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.f22619id)) {
                        z11 = false;
                    }
                    y1Var.e(z11, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        so0 so0Var;
        to0 to0Var = this.f40855e;
        yo0 yo0Var = to0Var.f43077f0;
        switch (i10) {
            case 1:
                Context context = to0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                wo0 wo0Var = new wo0(this.d, i11, context, c6Var);
                to0Var.h = wo0Var;
                wo0Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                wo0Var.a(to0Var.f43078n, false);
                wo0Var.setOnColorClick(new mo0(this, 1));
                so0Var = wo0Var;
                break;
            case 2:
            default:
                so0Var = new org.telegram.ui.Cells.y8(to0Var.getContext(), yo0Var.getResourceProvider());
                break;
            case 3:
                so0 so0Var2 = new so0(to0Var, to0Var.getContext());
                to0Var.f43082x = so0Var2;
                so0Var2.b(false);
                so0Var = so0Var2;
                break;
            case 4:
                View fnVar = new org.telegram.ui.Components.fn(to0Var.getContext(), 19);
                fnVar.setBackground(org.telegram.ui.ActionBar.g6.V0(to0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                so0Var = fnVar;
                break;
            case 5:
                so0Var = new org.telegram.ui.Components.fn(to0Var.getContext(), 18);
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(to0Var.getContext(), yo0Var.getResourceProvider());
                m8Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                so0Var = m8Var;
                break;
            case 7:
                Context context2 = to0Var.getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                View k4Var = new org.telegram.ui.Cells.k4(context2, c6Var2);
                k4Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                so0Var = k4Var;
                break;
            case 8:
                Context context3 = to0Var.getContext();
                c6Var3 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                so0Var = new jo0(context3, c6Var3, false);
                break;
            case 9:
                Context context4 = this.f40854c;
                c6Var4 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context4, c6Var4);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(35);
                so0Var = p00Var;
                break;
            case 10:
                View g2Var = new ih.g2(to0Var.getContext(), false);
                g2Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                so0Var = g2Var;
                break;
            case 11:
                so0Var = new ro0(to0Var, to0Var.getContext());
                break;
            case 12:
                Context context5 = to0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                c6Var5 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                so0Var = new ih.y1(context5, i12, c6Var5);
                break;
        }
        return new f2.n1(so0Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        to0 to0Var = this.f40855e;
        ArrayList arrayList = to0Var.f43070b0;
        int i10 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        if (i10 == 8) {
            jo0 jo0Var = (jo0) view;
            int b10 = n1Var.b() - to0Var.P;
            if (b10 >= 0 && b10 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
                jo0Var.a(b10, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = to0Var.f43080s;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.f22619id) && ((tL_peerColorCollectible2 = to0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.f22619id)) {
                    z10 = false;
                }
                jo0Var.b(z10, false);
            }
        } else if (i10 == 12) {
            ih.y1 y1Var = (ih.y1) view;
            int b11 = n1Var.b() - to0Var.P;
            if (to0Var.A != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                y1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = to0Var.f43080s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.f22619id) && ((tL_peerColorCollectible = to0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.f22619id)) {
                    z10 = false;
                }
                y1Var.e(z10, false);
            }
        }
    }
}
