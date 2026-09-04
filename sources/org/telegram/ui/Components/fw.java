package org.telegram.ui.Components;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;
public final class fw implements bl0, le.d, gm0, ih.i {
    public final int f26185a;
    public final kz f26186b;

    public fw(kz kzVar, int i10) {
        this.f26185a = i10;
        this.f26186b = kzVar;
    }

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.f26186b.T();
    }

    @Override
    public boolean a(int i10, View view) {
        String str;
        boolean z10;
        String str2;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z11;
        kz kzVar = this.f26186b;
        int i16 = kzVar.C1;
        kx kxVar = kzVar.P;
        int[] iArr = kzVar.D1;
        vu vuVar = kzVar.B1;
        if (view instanceof ty) {
            ty tyVar = (ty) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (tyVar.f30738c) {
                View F = kxVar.F(view);
                if (F != null) {
                    c1Var = kxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= kzVar.getRecentEmoji().size()) {
                    kzVar.f27986t1.n();
                }
                kxVar.v1(view);
                return true;
            } else if (tyVar.getSpan() != null || (str = (String) tyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!tyVar.f30738c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                kzVar.R1 = tyVar;
                kzVar.U1 = kzVar.S1;
                kzVar.V1 = kzVar.T1;
                if (isCompound) {
                    replace = kz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    uu uuVar = vuVar.f31985c;
                    int[] iArr2 = uuVar.f30976n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        uuVar.invalidate();
                    }
                }
                vuVar.getClass();
                uu uuVar2 = vuVar.f31985c;
                int i17 = vuVar.f31986e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vuVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = uuVar2.f30972b;
                int[] iArr3 = uuVar2.f30976n;
                uuVar2.f30975f = z10;
                uuVar2.f30974e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(uuVar2.f30974e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            uuVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            uuVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        uuVar2.G = z11;
                    }
                    uuVar2.I = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = kz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                uuVar2.invalidate();
                int i21 = i17 * 6;
                if (vuVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                vuVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (vuVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (vuVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                vuVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!vuVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (vuVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (vuVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                tyVar.getLocationOnScreen(iArr);
                if (!vuVar.d) {
                    int i24 = uuVar2.f30976n[0];
                    int i25 = i24 * i16;
                    int i26 = i24 * 4;
                    if (!AndroidUtilities.isTablet()) {
                        i19 = 1;
                    }
                    i14 = AndroidUtilities.dp(i26 - i19) + i25;
                } else {
                    i14 = 0;
                }
                if (iArr[0] - i14 < AndroidUtilities.dp(5.0f)) {
                    i14 = org.telegram.messenger.wl.D(5.0f, iArr[0] - i14, i14);
                } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i27 = -i14;
                if (tyVar.getTop() < 0) {
                    i15 = tyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                uuVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                vuVar.setFocusable(true);
                vuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                kzVar.h.requestDisallowInterceptTouchEvent(true);
                kxVar.c1(true);
                kxVar.v1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        wy wyVar;
        switch (this.f26185a) {
            case 2:
                kz kzVar = this.f26186b;
                qy qyVar = kzVar.f27951i0;
                int i16 = kzVar.f27932c1;
                py pyVar = kzVar.f27965n0;
                sy syVar = kzVar.f27957k0;
                if (i10 != kzVar.f27982s0 || !pyVar.f29518x.isEmpty()) {
                    kzVar.f27948h0.B0();
                    kzVar.f27971p0.k(i10, 0);
                    if (i10 != kzVar.f27978r0 && i10 != kzVar.f27982s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        kzVar.f27954j0.H(arrayList.get(i10 - kzVar.f27985t0));
                        int i17 = i10 - kzVar.f27985t0;
                        if (i17 > 0) {
                            syVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - kzVar.f27985t0 < arrayList.size() - 1) {
                            syVar.a(arrayList.get((i10 - kzVar.f27985t0) + 1), true);
                        }
                    } else {
                        kzVar.f27968o0.d.setText("");
                        if (i10 == kzVar.f27982s0 && (i12 = pyVar.I) >= 1) {
                            qyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            ly lyVar = kzVar.f27986t1;
                            if (lyVar != null && lyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            qyVar.h1(i11, 0);
                        }
                        if (i10 == kzVar.f27982s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                syVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    kzVar.H(2);
                    return;
                }
                return;
            default:
                kz kzVar2 = this.f26186b;
                ww wwVar = kzVar2.G0;
                ArrayList arrayList3 = kzVar2.f27935d1;
                xw xwVar = kzVar2.B0;
                bz bzVar = kzVar2.f28003y0;
                tw twVar = kzVar2.D0;
                if (!kzVar2.S0) {
                    if (i10 == kzVar2.H1) {
                        kzVar2.f27986t1.o(new d51(kzVar2.getContext(), new fx(kzVar2), kzVar2.f28000x1, kzVar2.f28004y1, kzVar2.f28007z1, null, kzVar2.Z1));
                        return;
                    }
                    if (wwVar != null && (wyVar = wwVar.f32778r) != null && wyVar.getSelectedCategory() != null) {
                        wwVar.c(null, false);
                        wyVar.E1(null);
                    }
                    if (i10 == kzVar2.F1) {
                        twVar.B0();
                        kzVar2.J(bzVar.E("recent"), 0);
                        kzVar2.H(0);
                        int i18 = kzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = kzVar2.E1;
                        }
                        xwVar.k(i18, i15);
                        return;
                    } else if (i10 == kzVar2.G1) {
                        twVar.B0();
                        kzVar2.J(bzVar.E("fav"), 0);
                        kzVar2.H(0);
                        int i19 = kzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = kzVar2.E1;
                        }
                        xwVar.k(i19, i14);
                        return;
                    } else if (i10 == kzVar2.I1) {
                        twVar.B0();
                        kzVar2.J(bzVar.E("premium"), 0);
                        kzVar2.H(0);
                        int i20 = kzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = kzVar2.E1;
                        }
                        xwVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - kzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            kzVar2.I0 = false;
                            twVar.B0();
                            kzVar2.J(bzVar.E(arrayList3.get(i21)), 0);
                            kzVar2.H(0);
                            kzVar2.p(0);
                            int i22 = kzVar2.G1;
                            if (i22 <= 0 && (i22 = kzVar2.F1) <= 0) {
                                i22 = kzVar2.E1;
                            }
                            xwVar.k(i10, i22);
                            kzVar2.X1 = false;
                            kzVar2.a0();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void k(RectF rectF, View view) {
        this.f26186b.C();
    }

    @Override
    public void z(float f7, int i10) {
    }
}
