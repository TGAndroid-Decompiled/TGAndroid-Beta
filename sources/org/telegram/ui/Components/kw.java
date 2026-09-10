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
public final class kw implements ll0, le.d, qm0, gh.i {
    public final int f24815a;
    public final rz f24816b;

    public kw(rz rzVar, int i10) {
        this.f24815a = i10;
        this.f24816b = rzVar;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        this.f24816b.T();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        dz dzVar;
        switch (this.f24815a) {
            case 2:
                rz rzVar = this.f24816b;
                xy xyVar = rzVar.f26823i0;
                int i16 = rzVar.f26805c1;
                wy wyVar = rzVar.f26837n0;
                zy zyVar = rzVar.f26829k0;
                if (i10 != rzVar.f26854s0 || !wyVar.f28868x.isEmpty()) {
                    rzVar.f26820h0.B0();
                    rzVar.f26843p0.k(i10, 0);
                    if (i10 != rzVar.f26850r0 && i10 != rzVar.f26854s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        rzVar.f26826j0.H(arrayList.get(i10 - rzVar.f26857t0));
                        int i17 = i10 - rzVar.f26857t0;
                        if (i17 > 0) {
                            zyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - rzVar.f26857t0 < arrayList.size() - 1) {
                            zyVar.a(arrayList.get((i10 - rzVar.f26857t0) + 1), true);
                        }
                    } else {
                        rzVar.f26840o0.d.setText("");
                        if (i10 == rzVar.f26854s0 && (i12 = wyVar.I) >= 1) {
                            xyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            sy syVar = rzVar.f26858t1;
                            if (syVar != null && syVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            xyVar.h1(i11, 0);
                        }
                        if (i10 == rzVar.f26854s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                zyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    rzVar.H(2);
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f24816b;
                bx bxVar = rzVar2.G0;
                ArrayList arrayList3 = rzVar2.f26808d1;
                cx cxVar = rzVar2.B0;
                iz izVar = rzVar2.f26875y0;
                yw ywVar = rzVar2.D0;
                if (!rzVar2.S0) {
                    if (i10 == rzVar2.H1) {
                        rzVar2.f26858t1.o(new r51(rzVar2.getContext(), new kx(rzVar2), rzVar2.f26872x1, rzVar2.f26876y1, rzVar2.f26879z1, null, rzVar2.Z1));
                        return;
                    }
                    if (bxVar != null && (dzVar = bxVar.f22784r) != null && dzVar.getSelectedCategory() != null) {
                        bxVar.c(null, false);
                        dzVar.E1(null);
                    }
                    if (i10 == rzVar2.F1) {
                        ywVar.B0();
                        rzVar2.J(izVar.E("recent"), 0);
                        rzVar2.H(0);
                        int i18 = rzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = rzVar2.E1;
                        }
                        cxVar.k(i18, i15);
                        return;
                    } else if (i10 == rzVar2.G1) {
                        ywVar.B0();
                        rzVar2.J(izVar.E("fav"), 0);
                        rzVar2.H(0);
                        int i19 = rzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = rzVar2.E1;
                        }
                        cxVar.k(i19, i14);
                        return;
                    } else if (i10 == rzVar2.I1) {
                        ywVar.B0();
                        rzVar2.J(izVar.E("premium"), 0);
                        rzVar2.H(0);
                        int i20 = rzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = rzVar2.E1;
                        }
                        cxVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - rzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            rzVar2.I0 = false;
                            ywVar.B0();
                            rzVar2.J(izVar.E(arrayList3.get(i21)), 0);
                            rzVar2.H(0);
                            rzVar2.p(0);
                            int i22 = rzVar2.G1;
                            if (i22 <= 0 && (i22 = rzVar2.F1) <= 0) {
                                i22 = rzVar2.E1;
                            }
                            cxVar.k(i10, i22);
                            rzVar2.X1 = false;
                            rzVar2.a0();
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
        rz rzVar = this.f24816b;
        int i16 = rzVar.C1;
        px pxVar = rzVar.P;
        int[] iArr = rzVar.D1;
        bv bvVar = rzVar.B1;
        if (view instanceof az) {
            az azVar = (az) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (azVar.f21660c) {
                View F = pxVar.F(view);
                if (F != null) {
                    c1Var = pxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= rzVar.getRecentEmoji().size()) {
                    rzVar.f26858t1.n();
                }
                pxVar.v1(view);
                return true;
            } else if (azVar.getSpan() != null || (str = (String) azVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!azVar.f21660c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                rzVar.R1 = azVar;
                rzVar.U1 = rzVar.S1;
                rzVar.V1 = rzVar.T1;
                if (isCompound) {
                    replace = rz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    av avVar = bvVar.f21912c;
                    int[] iArr2 = avVar.f21604n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        avVar.invalidate();
                    }
                }
                bvVar.getClass();
                av avVar2 = bvVar.f21912c;
                int i17 = bvVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bvVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = avVar2.f21601b;
                int[] iArr3 = avVar2.f21604n;
                avVar2.f21603f = z10;
                avVar2.e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            avVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            avVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        avVar2.G = z11;
                    }
                    avVar2.I = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = rz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                avVar2.invalidate();
                int i21 = i17 * 6;
                if (bvVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                bvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (bvVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (bvVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                bvVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!bvVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (bvVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (bvVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                azVar.getLocationOnScreen(iArr);
                if (!bvVar.d) {
                    int i24 = avVar2.f21604n[0];
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
                    i14 = org.telegram.messenger.em.D(5.0f, iArr[0] - i14, i14);
                } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i27 = -i14;
                if (azVar.getTop() < 0) {
                    i15 = azVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                avVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                bvVar.setFocusable(true);
                bvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                rzVar.h.requestDisallowInterceptTouchEvent(true);
                pxVar.c1(true);
                pxVar.v1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void e(RectF rectF, View view) {
        this.f24816b.C();
    }

    @Override
    public void B(float f7, int i10) {
    }
}
