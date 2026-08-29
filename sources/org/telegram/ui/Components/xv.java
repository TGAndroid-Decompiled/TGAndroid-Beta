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
public final class xv implements bl0, vd.b, dm0, sg.g {
    public final int f34835a;
    public final fz f34836b;

    public xv(fz fzVar, int i10) {
        this.f34835a = i10;
        this.f34836b = fzVar;
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.f34836b.T();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        qy qyVar;
        switch (this.f34835a) {
            case 2:
                fz fzVar = this.f34836b;
                ky kyVar = fzVar.f28589e0;
                int i16 = fzVar.Y0;
                jy jyVar = fzVar.f28605j0;
                my myVar = fzVar.f28596g0;
                if (i10 != fzVar.f28619o0 || !jyVar.f29852x.isEmpty()) {
                    fzVar.f28585d0.B0();
                    fzVar.f28611l0.k(i10, 0);
                    if (i10 != fzVar.f28616n0 && i10 != fzVar.f28619o0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        fzVar.f28593f0.H(arrayList.get(i10 - fzVar.f28622p0));
                        int i17 = i10 - fzVar.f28622p0;
                        if (i17 > 0) {
                            myVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - fzVar.f28622p0 < arrayList.size() - 1) {
                            myVar.a(arrayList.get((i10 - fzVar.f28622p0) + 1), true);
                        }
                    } else {
                        fzVar.f28608k0.d.setText("");
                        if (i10 == fzVar.f28619o0 && (i12 = jyVar.E) >= 1) {
                            kyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            fy fyVar = fzVar.f28623p1;
                            if (fyVar != null && fyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            kyVar.h1(i11, 0);
                        }
                        if (i10 == fzVar.f28619o0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                myVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    fzVar.G(2);
                    return;
                }
                return;
            default:
                fz fzVar2 = this.f34836b;
                ow owVar = fzVar2.C0;
                ArrayList arrayList3 = fzVar2.Z0;
                pw pwVar = fzVar2.f28650x0;
                wy wyVar = fzVar2.f28639u0;
                lw lwVar = fzVar2.f28657z0;
                if (!fzVar2.O0) {
                    if (i10 == fzVar2.D1) {
                        fzVar2.f28623p1.o(new s41(fzVar2.getContext(), new yw(fzVar2), fzVar2.f28637t1, fzVar2.f28640u1, fzVar2.f28643v1, null, fzVar2.V1));
                        return;
                    }
                    if (owVar != null && (qyVar = owVar.f32415r) != null && qyVar.getSelectedCategory() != null) {
                        owVar.c(null, false);
                        qyVar.F1(null);
                    }
                    if (i10 == fzVar2.B1) {
                        lwVar.B0();
                        fzVar2.I(wyVar.E("recent"), 0);
                        fzVar2.G(0);
                        int i18 = fzVar2.B1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = fzVar2.A1;
                        }
                        pwVar.k(i18, i15);
                        return;
                    } else if (i10 == fzVar2.C1) {
                        lwVar.B0();
                        fzVar2.I(wyVar.E("fav"), 0);
                        fzVar2.G(0);
                        int i19 = fzVar2.C1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = fzVar2.A1;
                        }
                        pwVar.k(i19, i14);
                        return;
                    } else if (i10 == fzVar2.E1) {
                        lwVar.B0();
                        fzVar2.I(wyVar.E("premium"), 0);
                        fzVar2.G(0);
                        int i20 = fzVar2.E1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = fzVar2.A1;
                        }
                        pwVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - fzVar2.A1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            fzVar2.E0 = false;
                            lwVar.B0();
                            fzVar2.I(wyVar.E(arrayList3.get(i21)), 0);
                            fzVar2.G(0);
                            fzVar2.p(0);
                            int i22 = fzVar2.C1;
                            if (i22 <= 0 && (i22 = fzVar2.B1) <= 0) {
                                i22 = fzVar2.A1;
                            }
                            pwVar.k(i10, i22);
                            fzVar2.T1 = false;
                            fzVar2.a0();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        String str;
        boolean z10;
        String str2;
        int i11;
        float f9;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z11;
        fz fzVar = this.f34836b;
        int i16 = fzVar.f28655y1;
        dx dxVar = fzVar.L;
        int[] iArr = fzVar.f28658z1;
        ou ouVar = fzVar.f28651x1;
        if (view instanceof ny) {
            ny nyVar = (ny) view;
            String str3 = null;
            f2.n1 n1Var = null;
            if (nyVar.f31195c) {
                View F = dxVar.F(view);
                if (F != null) {
                    n1Var = dxVar.T(F);
                }
                if (n1Var != null && n1Var.b() <= fzVar.getRecentEmoji().size()) {
                    fzVar.f28623p1.n();
                }
                dxVar.w1(view);
                return true;
            } else if (nyVar.getSpan() != null || (str = (String) nyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!nyVar.f31195c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                fzVar.N1 = nyVar;
                fzVar.Q1 = fzVar.O1;
                fzVar.R1 = fzVar.P1;
                if (isCompound) {
                    replace = fz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    nu nuVar = ouVar.f31481c;
                    int[] iArr2 = nuVar.f31143n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        nuVar.invalidate();
                    }
                }
                ouVar.getClass();
                nu nuVar2 = ouVar.f31481c;
                int i17 = ouVar.f31482e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ouVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = nuVar2.f31139b;
                int[] iArr3 = nuVar2.f31143n;
                nuVar2.f31142f = z10;
                nuVar2.f31141e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(nuVar2.f31141e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            nuVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            nuVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        nuVar2.C = z11;
                    }
                    nuVar2.E = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = fz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                nuVar2.invalidate();
                int i21 = i17 * 6;
                if (ouVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                ouVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (ouVar.d) {
                    f9 = 11.66f;
                } else {
                    f9 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f9);
                if (ouVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                ouVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!ouVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (ouVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (ouVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                nyVar.getLocationOnScreen(iArr);
                if (!ouVar.d) {
                    int i24 = nuVar2.f31143n[0];
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
                if (nyVar.getTop() < 0) {
                    i15 = nyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                nuVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                ouVar.setFocusable(true);
                ouVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                fzVar.h.requestDisallowInterceptTouchEvent(true);
                dxVar.d1(true);
                dxVar.w1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void d(RectF rectF, View view) {
        this.f34836b.C();
    }

    @Override
    public void z(float f9, int i10) {
    }
}
