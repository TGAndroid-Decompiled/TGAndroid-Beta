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
public final class aw implements jl0, xd.b, mm0, ug.g {
    public final int f23484a;
    public final kz f23485b;

    public aw(kz kzVar, int i10) {
        this.f23484a = i10;
        this.f23485b = kzVar;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f23485b.T();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        vy vyVar;
        switch (this.f23484a) {
            case 2:
                kz kzVar = this.f23485b;
                py pyVar = kzVar.f26439f0;
                int i16 = kzVar.Z0;
                oy oyVar = kzVar.f26454k0;
                ry ryVar = kzVar.f26445h0;
                if (i10 != kzVar.f26468p0 || !oyVar.f27688x.isEmpty()) {
                    kzVar.f26435e0.B0();
                    kzVar.m0.k(i10, 0);
                    if (i10 != kzVar.f26465o0 && i10 != kzVar.f26468p0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        kzVar.f26442g0.H(arrayList.get(i10 - kzVar.f26471q0));
                        int i17 = i10 - kzVar.f26471q0;
                        if (i17 > 0) {
                            ryVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - kzVar.f26471q0 < arrayList.size() - 1) {
                            ryVar.a(arrayList.get((i10 - kzVar.f26471q0) + 1), true);
                        }
                    } else {
                        kzVar.f26457l0.d.setText("");
                        if (i10 == kzVar.f26468p0 && (i12 = oyVar.F) >= 1) {
                            pyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            ky kyVar = kzVar.f26472q1;
                            if (kyVar != null && kyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            pyVar.h1(i11, 0);
                        }
                        if (i10 == kzVar.f26468p0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                ryVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    kzVar.G(2);
                    return;
                }
                return;
            default:
                kz kzVar2 = this.f23485b;
                sw swVar = kzVar2.D0;
                ArrayList arrayList3 = kzVar2.f26423a1;
                tw twVar = kzVar2.f26500y0;
                bz bzVar = kzVar2.f26488v0;
                pw pwVar = kzVar2.A0;
                if (!kzVar2.P0) {
                    if (i10 == kzVar2.E1) {
                        kzVar2.f26472q1.o(new e51(kzVar2.getContext(), new cx(kzVar2), kzVar2.f26486u1, kzVar2.f26489v1, kzVar2.f26493w1, null, kzVar2.W1));
                        return;
                    }
                    if (swVar != null && (vyVar = swVar.f30372r) != null && vyVar.getSelectedCategory() != null) {
                        swVar.c(null, false);
                        vyVar.E1(null);
                    }
                    if (i10 == kzVar2.C1) {
                        pwVar.B0();
                        kzVar2.I(bzVar.E("recent"), 0);
                        kzVar2.G(0);
                        int i18 = kzVar2.C1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = kzVar2.B1;
                        }
                        twVar.k(i18, i15);
                        return;
                    } else if (i10 == kzVar2.D1) {
                        pwVar.B0();
                        kzVar2.I(bzVar.E("fav"), 0);
                        kzVar2.G(0);
                        int i19 = kzVar2.D1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = kzVar2.B1;
                        }
                        twVar.k(i19, i14);
                        return;
                    } else if (i10 == kzVar2.F1) {
                        pwVar.B0();
                        kzVar2.I(bzVar.E("premium"), 0);
                        kzVar2.G(0);
                        int i20 = kzVar2.F1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = kzVar2.B1;
                        }
                        twVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - kzVar2.B1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            kzVar2.F0 = false;
                            pwVar.B0();
                            kzVar2.I(bzVar.E(arrayList3.get(i21)), 0);
                            kzVar2.G(0);
                            kzVar2.p(0);
                            int i22 = kzVar2.D1;
                            if (i22 <= 0 && (i22 = kzVar2.C1) <= 0) {
                                i22 = kzVar2.B1;
                            }
                            twVar.k(i10, i22);
                            kzVar2.U1 = false;
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
    public boolean d(int i10, View view) {
        String str;
        boolean z4;
        String str2;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        boolean z10;
        kz kzVar = this.f23485b;
        int i16 = kzVar.f26504z1;
        ix ixVar = kzVar.M;
        int[] iArr = kzVar.A1;
        qu quVar = kzVar.f26501y1;
        if (view instanceof sy) {
            sy syVar = (sy) view;
            String str3 = null;
            f2.l1 l1Var = null;
            if (syVar.f28833c) {
                View F = ixVar.F(view);
                if (F != null) {
                    l1Var = ixVar.T(F);
                }
                if (l1Var != null && l1Var.b() <= kzVar.getRecentEmoji().size()) {
                    kzVar.f26472q1.n();
                }
                ixVar.v1(view);
                return true;
            } else if (syVar.getSpan() != null || (str = (String) syVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!syVar.f28833c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                kzVar.O1 = syVar;
                kzVar.R1 = kzVar.P1;
                kzVar.S1 = kzVar.Q1;
                if (isCompound) {
                    replace = kz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    pu puVar = quVar.f28270c;
                    int[] iArr2 = puVar.f28005n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        puVar.invalidate();
                    }
                }
                quVar.getClass();
                pu puVar2 = quVar.f28270c;
                int i17 = quVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                quVar.d = z4;
                int i18 = 3;
                Drawable[] drawableArr = puVar2.f28002b;
                int[] iArr3 = puVar2.f28005n;
                puVar2.f28004f = z4;
                puVar2.e = replace;
                int i19 = 5;
                if (z4) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(puVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            puVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            puVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        puVar2.D = z10;
                    }
                    puVar2.F = true;
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
                puVar2.invalidate();
                int i21 = i17 * 6;
                if (quVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                quVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f12 = 15.0f;
                if (quVar.d) {
                    f10 = 11.66f;
                } else {
                    f10 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                if (quVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                quVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!quVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (quVar.d) {
                    f12 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f12);
                if (quVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                syVar.getLocationOnScreen(iArr);
                if (!quVar.d) {
                    int i24 = puVar2.f28005n[0];
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
                    i14 = org.telegram.ui.b.C(5.0f, iArr[0] - i14, i14);
                } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i27 = -i14;
                if (syVar.getTop() < 0) {
                    i15 = syVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f11 = 30.0f;
                } else {
                    f11 = 22.0f;
                }
                puVar2.setArrowX((AndroidUtilities.dp(f11) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                quVar.setFocusable(true);
                quVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                kzVar.h.requestDisallowInterceptTouchEvent(true);
                ixVar.c1(true);
                ixVar.v1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void e(RectF rectF, View view) {
        this.f23485b.C();
    }

    @Override
    public void z(float f10, int i10) {
    }
}
