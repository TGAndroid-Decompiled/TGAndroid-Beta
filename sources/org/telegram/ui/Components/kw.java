package org.telegram.ui.Components;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesController;
public final class kw implements ni.c, bm0, hn0, ne.d {
    public final int f28090a;
    public final rz f28091b;

    public kw(rz rzVar, int i10) {
        this.f28090a = i10;
        this.f28091b = rzVar;
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        dz dzVar;
        switch (this.f28090a) {
            case 2:
                rz rzVar = this.f28091b;
                xy xyVar = rzVar.f30328i0;
                int i16 = rzVar.f30310c1;
                wy wyVar = rzVar.f30342n0;
                zy zyVar = rzVar.f30334k0;
                if (i10 != rzVar.f30359s0 || !wyVar.f32439x.isEmpty()) {
                    rzVar.f30325h0.B0();
                    rzVar.f30348p0.k(i10, 0);
                    if (i10 != rzVar.f30355r0 && i10 != rzVar.f30359s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        rzVar.f30331j0.H(arrayList.get(i10 - rzVar.f30362t0));
                        int i17 = i10 - rzVar.f30362t0;
                        if (i17 > 0) {
                            zyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - rzVar.f30362t0 < arrayList.size() - 1) {
                            zyVar.a(arrayList.get((i10 - rzVar.f30362t0) + 1), true);
                        }
                    } else {
                        rzVar.f30345o0.d.setText("");
                        if (i10 == rzVar.f30359s0 && (i12 = wyVar.I) >= 1) {
                            xyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            sy syVar = rzVar.f30363t1;
                            if (syVar != null && syVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            xyVar.h1(i11, 0);
                        }
                        if (i10 == rzVar.f30359s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                zyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    rzVar.E(2);
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f28091b;
                bx bxVar = rzVar2.G0;
                ArrayList arrayList3 = rzVar2.f30313d1;
                cx cxVar = rzVar2.B0;
                iz izVar = rzVar2.f30380y0;
                yw ywVar = rzVar2.D0;
                if (!rzVar2.S0) {
                    if (i10 == rzVar2.H1) {
                        rzVar2.f30363t1.o(new h61(rzVar2.getContext(), new kx(rzVar2), rzVar2.f30377x1, rzVar2.f30381y1, rzVar2.f30384z1, null, rzVar2.Z1));
                        return;
                    }
                    if (bxVar != null && (dzVar = bxVar.f26147r) != null && dzVar.getSelectedCategory() != null) {
                        bxVar.c(null, false);
                        dzVar.L1(null);
                    }
                    if (i10 == rzVar2.F1) {
                        ywVar.B0();
                        rzVar2.G(izVar.E("recent"), 0);
                        rzVar2.E(0);
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
                        rzVar2.G(izVar.E("fav"), 0);
                        rzVar2.E(0);
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
                        rzVar2.G(izVar.E("premium"), 0);
                        rzVar2.E(0);
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
                            rzVar2.G(izVar.E(arrayList3.get(i21)), 0);
                            rzVar2.E(0);
                            rzVar2.q(0);
                            int i22 = rzVar2.G1;
                            if (i22 <= 0 && (i22 = rzVar2.F1) <= 0) {
                                i22 = rzVar2.E1;
                            }
                            cxVar.k(i10, i22);
                            rzVar2.X1 = false;
                            rzVar2.Y();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void b(int i10) {
        float f7;
        rz rzVar = this.f28091b;
        bh.f fVar = rzVar.f30333j2;
        RectF rectF = rzVar.f30385z2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ih.k.c(rzVar.f30371w, rzVar, rectF);
            float f10 = 0.0f;
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            if (!LiteMode.isEnabled(262144)) {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(f7, f10);
            rectF.right = rzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, rzVar.getMeasuredHeight());
            fVar.g(!rectF.isEmpty(), rzVar.A2);
            fVar.e(rzVar.f30336k2, rzVar.getWidth(), rzVar.getHeight());
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
        rz rzVar = this.f28091b;
        int i16 = rzVar.C1;
        cy cyVar = rzVar.P;
        int[] iArr = rzVar.D1;
        cv cvVar = rzVar.B1;
        if (view instanceof az) {
            az azVar = (az) view;
            String str3 = null;
            s4.b1 b1Var = null;
            if (azVar.f24848c) {
                View F = cyVar.F(view);
                if (F != null) {
                    b1Var = cyVar.T(F);
                }
                if (b1Var != null && b1Var.b() <= rzVar.getRecentEmoji().size()) {
                    rzVar.f30363t1.n();
                }
                cyVar.D1(view);
                return true;
            } else if (azVar.getSpan() == null && (str = (String) azVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!azVar.f24848c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    rzVar.R1 = azVar;
                    rzVar.U1 = rzVar.S1;
                    rzVar.V1 = rzVar.T1;
                    if (isCompound) {
                        replace = rz.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        bv bvVar = cvVar.f25478c;
                        int[] iArr2 = bvVar.f25100n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            bvVar.invalidate();
                        }
                    }
                    cvVar.getClass();
                    bv bvVar2 = cvVar.f25478c;
                    int i17 = cvVar.e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cvVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = bvVar2.f25097b;
                    int[] iArr3 = bvVar2.f25100n;
                    bvVar2.f25099f = z10;
                    bvVar2.e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(bvVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                bvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                bvVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bvVar2.G = z11;
                        }
                        bvVar2.I = true;
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
                    bvVar2.invalidate();
                    int i21 = i17 * 6;
                    if (cvVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    cvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (cvVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (cvVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    cvVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!cvVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (cvVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (cvVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    azVar.getLocationOnScreen(iArr);
                    if (!cvVar.d) {
                        int i24 = bvVar2.f25100n[0];
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
                        i14 = org.telegram.messenger.tl.D(5.0f, iArr[0] - i14, i14);
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
                    bvVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    cvVar.setFocusable(true);
                    cvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    rzVar.h.requestDisallowInterceptTouchEvent(true);
                    cyVar.e1(true);
                    cyVar.D1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.f28091b.R();
    }

    @Override
    public void H(float f7, int i10) {
    }
}
