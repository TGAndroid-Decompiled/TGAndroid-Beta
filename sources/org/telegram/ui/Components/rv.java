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
public final class rv implements ok0, td.b, ql0, pg.g {
    public final int f32292a;
    public final wy f32293b;

    public rv(wy wyVar, int i9) {
        this.f32292a = i9;
        this.f32293b = wyVar;
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.f32293b.S();
    }

    @Override
    public boolean a(int i9, View view) {
        String str;
        boolean z10;
        String str2;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        boolean z11;
        wy wyVar = this.f32293b;
        int i15 = wyVar.f34464y1;
        ww wwVar = wyVar.L;
        int[] iArr = wyVar.f34467z1;
        iu iuVar = wyVar.f34460x1;
        if (view instanceof fy) {
            fy fyVar = (fy) view;
            String str3 = null;
            f2.q1 q1Var = null;
            if (fyVar.f28600c) {
                View F = wwVar.F(view);
                if (F != null) {
                    q1Var = wwVar.T(F);
                }
                if (q1Var != null && q1Var.b() <= wyVar.getRecentEmoji().size()) {
                    wyVar.f34432p1.n();
                }
                wwVar.w1(view);
                return true;
            } else if (fyVar.getSpan() != null || (str = (String) fyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!fyVar.f28600c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                wyVar.N1 = fyVar;
                wyVar.Q1 = wyVar.O1;
                wyVar.R1 = wyVar.P1;
                if (isCompound) {
                    replace = wy.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    hu huVar = iuVar.f29522c;
                    int[] iArr2 = huVar.f29190n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        huVar.invalidate();
                    }
                }
                iuVar.getClass();
                hu huVar2 = iuVar.f29522c;
                int i16 = iuVar.f29523e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                iuVar.d = z10;
                int i17 = 3;
                Drawable[] drawableArr = huVar2.f29186b;
                int[] iArr3 = huVar2.f29190n;
                huVar2.f29189f = z10;
                huVar2.f29188e = replace;
                int i18 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(huVar2.f29188e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            huVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            huVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        huVar2.C = z11;
                    }
                    huVar2.E = true;
                } else {
                    for (int i19 = 0; i19 < 6; i19++) {
                        if (i19 != 0) {
                            str2 = wy.g(replace, CompoundEmoji.skinTones.get(i19 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i19] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                huVar2.invalidate();
                int i20 = i16 * 6;
                if (iuVar.d) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
                iuVar.setWidth(AndroidUtilities.dp(i10 + 30) + i20);
                float f12 = 15.0f;
                if (iuVar.d) {
                    f10 = 11.66f;
                } else {
                    f10 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                if (iuVar.d) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                iuVar.setHeight((i11 * i16) + dp);
                int i21 = i16 * 6;
                if (!iuVar.d) {
                    i17 = 0;
                }
                int dp2 = AndroidUtilities.dp(i17 + 30) + i21;
                if (iuVar.d) {
                    f12 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f12);
                if (iuVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                int i22 = (i12 * i16) + dp3;
                fyVar.getLocationOnScreen(iArr);
                if (!iuVar.d) {
                    int i23 = huVar2.f29190n[0];
                    int i24 = i23 * i15;
                    int i25 = i23 * 4;
                    if (!AndroidUtilities.isTablet()) {
                        i18 = 1;
                    }
                    i13 = AndroidUtilities.dp(i25 - i18) + i24;
                } else {
                    i13 = 0;
                }
                if (iArr[0] - i13 < AndroidUtilities.dp(5.0f)) {
                    i13 = org.telegram.messenger.ll.D(5.0f, iArr[0] - i13, i13);
                } else if ((iArr[0] - i13) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    i13 += ((iArr[0] - i13) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i26 = -i13;
                if (fyVar.getTop() < 0) {
                    i14 = fyVar.getTop();
                } else {
                    i14 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f11 = 30.0f;
                } else {
                    f11 = 22.0f;
                }
                huVar2.setArrowX((AndroidUtilities.dp(f11) - i26) + ((int) AndroidUtilities.dpf2(0.5f)));
                iuVar.setFocusable(true);
                iuVar.showAsDropDown(view, i26, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                wyVar.h.requestDisallowInterceptTouchEvent(true);
                wwVar.d1(true);
                wwVar.w1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        iy iyVar;
        switch (this.f32292a) {
            case 2:
                wy wyVar = this.f32293b;
                cy cyVar = wyVar.f34398e0;
                int i15 = wyVar.Y0;
                ay ayVar = wyVar.f34414j0;
                ey eyVar = wyVar.f34405g0;
                if (i9 != wyVar.f34428o0 || !ayVar.f26924x.isEmpty()) {
                    wyVar.f34394d0.B0();
                    wyVar.f34420l0.k(i9, 0);
                    if (i9 != wyVar.f34425n0 && i9 != wyVar.f34428o0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i15).gifSearchEmojies;
                        wyVar.f34402f0.H(arrayList.get(i9 - wyVar.f34431p0));
                        int i16 = i9 - wyVar.f34431p0;
                        if (i16 > 0) {
                            eyVar.a(arrayList.get(i16 - 1), true);
                        }
                        if (i9 - wyVar.f34431p0 < arrayList.size() - 1) {
                            eyVar.a(arrayList.get((i9 - wyVar.f34431p0) + 1), true);
                        }
                    } else {
                        wyVar.f34417k0.d.setText("");
                        if (i9 == wyVar.f34428o0 && (i11 = ayVar.E) >= 1) {
                            cyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        } else {
                            wx wxVar = wyVar.f34432p1;
                            if (wxVar != null && wxVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            cyVar.h1(i10, 0);
                        }
                        if (i9 == wyVar.f34428o0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i15).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                eyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    wyVar.G(2);
                    return;
                }
                return;
            default:
                wy wyVar2 = this.f32293b;
                iw iwVar = wyVar2.C0;
                ArrayList arrayList3 = wyVar2.Z0;
                jw jwVar = wyVar2.f34459x0;
                ny nyVar = wyVar2.f34448u0;
                fw fwVar = wyVar2.f34466z0;
                if (!wyVar2.O0) {
                    if (i9 == wyVar2.D1) {
                        wyVar2.f34432p1.o(new h41(wyVar2.getContext(), new rw(wyVar2), wyVar2.f34446t1, wyVar2.f34449u1, wyVar2.f34452v1, null, wyVar2.V1));
                        return;
                    }
                    if (iwVar != null && (iyVar = iwVar.f29882r) != null && iyVar.getSelectedCategory() != null) {
                        iwVar.c(null, false);
                        iyVar.F1(null);
                    }
                    if (i9 == wyVar2.B1) {
                        fwVar.B0();
                        wyVar2.I(nyVar.E("recent"), 0);
                        wyVar2.G(0);
                        int i17 = wyVar2.B1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = wyVar2.A1;
                        }
                        jwVar.k(i17, i14);
                        return;
                    } else if (i9 == wyVar2.C1) {
                        fwVar.B0();
                        wyVar2.I(nyVar.E("fav"), 0);
                        wyVar2.G(0);
                        int i18 = wyVar2.C1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = wyVar2.A1;
                        }
                        jwVar.k(i18, i13);
                        return;
                    } else if (i9 == wyVar2.E1) {
                        fwVar.B0();
                        wyVar2.I(nyVar.E("premium"), 0);
                        wyVar2.G(0);
                        int i19 = wyVar2.E1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = wyVar2.A1;
                        }
                        jwVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i9 - wyVar2.A1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            wyVar2.E0 = false;
                            fwVar.B0();
                            wyVar2.I(nyVar.E(arrayList3.get(i20)), 0);
                            wyVar2.G(0);
                            wyVar2.p(0);
                            int i21 = wyVar2.C1;
                            if (i21 <= 0 && (i21 = wyVar2.B1) <= 0) {
                                i21 = wyVar2.A1;
                            }
                            jwVar.k(i9, i21);
                            wyVar2.T1 = false;
                            wyVar2.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void i(RectF rectF, View view) {
        this.f32293b.C();
    }

    @Override
    public void B(float f10, int i9) {
    }
}
