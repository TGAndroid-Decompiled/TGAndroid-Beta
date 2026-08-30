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
public final class bw implements kl0, xd.b, nm0, ug.g {
    public final int f23751a;
    public final kz f23752b;

    public bw(kz kzVar, int i10) {
        this.f23751a = i10;
        this.f23752b = kzVar;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f23752b.T();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        vy vyVar;
        switch (this.f23751a) {
            case 2:
                kz kzVar = this.f23752b;
                py pyVar = kzVar.f26427f0;
                int i16 = kzVar.Z0;
                oy oyVar = kzVar.f26442k0;
                ry ryVar = kzVar.f26433h0;
                if (i10 != kzVar.f26456p0 || !oyVar.f27692x.isEmpty()) {
                    kzVar.f26423e0.B0();
                    kzVar.m0.k(i10, 0);
                    if (i10 != kzVar.f26453o0 && i10 != kzVar.f26456p0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        kzVar.f26430g0.H(arrayList.get(i10 - kzVar.f26459q0));
                        int i17 = i10 - kzVar.f26459q0;
                        if (i17 > 0) {
                            ryVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - kzVar.f26459q0 < arrayList.size() - 1) {
                            ryVar.a(arrayList.get((i10 - kzVar.f26459q0) + 1), true);
                        }
                    } else {
                        kzVar.f26445l0.d.setText("");
                        if (i10 == kzVar.f26456p0 && (i12 = oyVar.F) >= 1) {
                            pyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            ky kyVar = kzVar.f26460q1;
                            if (kyVar != null && kyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            pyVar.h1(i11, 0);
                        }
                        if (i10 == kzVar.f26456p0) {
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
                kz kzVar2 = this.f23752b;
                sw swVar = kzVar2.D0;
                ArrayList arrayList3 = kzVar2.f26411a1;
                tw twVar = kzVar2.f26488y0;
                bz bzVar = kzVar2.f26476v0;
                pw pwVar = kzVar2.A0;
                if (!kzVar2.P0) {
                    if (i10 == kzVar2.E1) {
                        kzVar2.f26460q1.o(new e51(kzVar2.getContext(), new cx(kzVar2), kzVar2.f26474u1, kzVar2.f26477v1, kzVar2.f26481w1, null, kzVar2.W1));
                        return;
                    }
                    if (swVar != null && (vyVar = swVar.f30441r) != null && vyVar.getSelectedCategory() != null) {
                        swVar.c(null, false);
                        vyVar.F1(null);
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
    public void d(RectF rectF, View view) {
        this.f23752b.C();
    }

    @Override
    public boolean f(int i10, View view) {
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
        kz kzVar = this.f23752b;
        int i16 = kzVar.f26492z1;
        ix ixVar = kzVar.M;
        int[] iArr = kzVar.A1;
        ru ruVar = kzVar.f26489y1;
        if (view instanceof sy) {
            sy syVar = (sy) view;
            String str3 = null;
            f2.l1 l1Var = null;
            if (syVar.f28830c) {
                View F = ixVar.F(view);
                if (F != null) {
                    l1Var = ixVar.T(F);
                }
                if (l1Var != null && l1Var.b() <= kzVar.getRecentEmoji().size()) {
                    kzVar.f26460q1.n();
                }
                ixVar.w1(view);
                return true;
            } else if (syVar.getSpan() != null || (str = (String) syVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!syVar.f28830c) {
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
                    qu quVar = ruVar.f28540c;
                    int[] iArr2 = quVar.f28251n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        quVar.invalidate();
                    }
                }
                ruVar.getClass();
                qu quVar2 = ruVar.f28540c;
                int i17 = ruVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ruVar.d = z4;
                int i18 = 3;
                Drawable[] drawableArr = quVar2.f28248b;
                int[] iArr3 = quVar2.f28251n;
                quVar2.f28250f = z4;
                quVar2.e = replace;
                int i19 = 5;
                if (z4) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(quVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            quVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            quVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        quVar2.D = z10;
                    }
                    quVar2.F = true;
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
                quVar2.invalidate();
                int i21 = i17 * 6;
                if (ruVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                ruVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f12 = 15.0f;
                if (ruVar.d) {
                    f10 = 11.66f;
                } else {
                    f10 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                if (ruVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                ruVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!ruVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (ruVar.d) {
                    f12 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f12);
                if (ruVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                syVar.getLocationOnScreen(iArr);
                if (!ruVar.d) {
                    int i24 = quVar2.f28251n[0];
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
                quVar2.setArrowX((AndroidUtilities.dp(f11) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                ruVar.setFocusable(true);
                ruVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                kzVar.h.requestDisallowInterceptTouchEvent(true);
                ixVar.d1(true);
                ixVar.w1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
