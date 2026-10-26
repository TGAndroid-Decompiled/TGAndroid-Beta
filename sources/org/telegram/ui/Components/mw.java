package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;
public final class mw implements oi.m, bm0, nn0, oe.d {
    public final int f30762a;
    public final sz f30763b;

    public mw(sz szVar, int i10) {
        this.f30762a = i10;
        this.f30763b = szVar;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f30763b.R();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ez ezVar;
        switch (this.f30762a) {
            case 2:
                sz szVar = this.f30763b;
                yy yyVar = szVar.f32737i0;
                int i16 = szVar.f32719c1;
                xy xyVar = szVar.f32751n0;
                az azVar = szVar.f32743k0;
                if (i10 != szVar.f32768s0 || !xyVar.f34854x.isEmpty()) {
                    szVar.f32734h0.C0();
                    szVar.f32757p0.k(i10, 0);
                    if (i10 != szVar.f32764r0 && i10 != szVar.f32768s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        szVar.f32740j0.H(arrayList.get(i10 - szVar.f32771t0));
                        int i17 = i10 - szVar.f32771t0;
                        if (i17 > 0) {
                            azVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - szVar.f32771t0 < arrayList.size() - 1) {
                            azVar.a(arrayList.get((i10 - szVar.f32771t0) + 1), true);
                        }
                    } else {
                        szVar.f32754o0.d.setText("");
                        if (i10 == szVar.f32768s0 && (i12 = xyVar.I) >= 1) {
                            yyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            ty tyVar = szVar.f32772t1;
                            if (tyVar != null && tyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            yyVar.h1(i11, 0);
                        }
                        if (i10 == szVar.f32768s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                azVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    szVar.F(2);
                    return;
                }
                return;
            default:
                sz szVar2 = this.f30763b;
                cx cxVar = szVar2.G0;
                ArrayList arrayList3 = szVar2.f32722d1;
                dx dxVar = szVar2.B0;
                jz jzVar = szVar2.f32789y0;
                zw zwVar = szVar2.D0;
                if (!szVar2.S0) {
                    if (i10 == szVar2.H1) {
                        szVar2.f32772t1.o(new p61(szVar2.getContext(), new kx(szVar2), szVar2.f32786x1, szVar2.f32790y1, szVar2.f32793z1, null, szVar2.Z1));
                        return;
                    }
                    if (cxVar != null && (ezVar = cxVar.f28341r) != null && ezVar.getSelectedCategory() != null) {
                        cxVar.c(null, false);
                        ezVar.L1(null);
                    }
                    if (i10 == szVar2.F1) {
                        zwVar.C0();
                        szVar2.H(jzVar.E("recent"), 0);
                        szVar2.F(0);
                        int i18 = szVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = szVar2.E1;
                        }
                        dxVar.k(i18, i15);
                        return;
                    } else if (i10 == szVar2.G1) {
                        zwVar.C0();
                        szVar2.H(jzVar.E("fav"), 0);
                        szVar2.F(0);
                        int i19 = szVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = szVar2.E1;
                        }
                        dxVar.k(i19, i14);
                        return;
                    } else if (i10 == szVar2.I1) {
                        zwVar.C0();
                        szVar2.H(jzVar.E("premium"), 0);
                        szVar2.F(0);
                        int i20 = szVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = szVar2.E1;
                        }
                        dxVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - szVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            szVar2.I0 = false;
                            zwVar.C0();
                            szVar2.H(jzVar.E(arrayList3.get(i21)), 0);
                            szVar2.F(0);
                            szVar2.p(0);
                            int i22 = szVar2.G1;
                            if (i22 <= 0 && (i22 = szVar2.F1) <= 0) {
                                i22 = szVar2.E1;
                            }
                            dxVar.k(i10, i22);
                            szVar2.X1 = false;
                            szVar2.Y();
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
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z11;
        sz szVar = this.f30763b;
        int i16 = szVar.C1;
        dy dyVar = szVar.P;
        int[] iArr = szVar.D1;
        fv fvVar = szVar.B1;
        if (view instanceof bz) {
            bz bzVar = (bz) view;
            String str3 = null;
            s4.e1 e1Var = null;
            if (bzVar.f27002c) {
                View F = dyVar.F(view);
                if (F != null) {
                    e1Var = dyVar.T(F);
                }
                if (e1Var != null && e1Var.b() <= szVar.getRecentEmoji().size()) {
                    szVar.f32772t1.n();
                }
                dyVar.D1(view);
                return true;
            } else if (bzVar.getSpan() == null && (str = (String) bzVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!bzVar.f27002c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    szVar.R1 = bzVar;
                    szVar.U1 = szVar.S1;
                    szVar.V1 = szVar.T1;
                    if (isCompound) {
                        replace = sz.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        ev evVar = fvVar.f28322c;
                        int[] iArr2 = evVar.f27991n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            evVar.invalidate();
                        }
                    }
                    fvVar.getClass();
                    ev evVar2 = fvVar.f28322c;
                    int i17 = fvVar.e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fvVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = evVar2.f27988b;
                    int[] iArr3 = evVar2.f27991n;
                    evVar2.f27990f = z10;
                    evVar2.e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(evVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                evVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                evVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            evVar2.G = z11;
                        }
                        evVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str2 = sz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                            } else {
                                str2 = replace;
                            }
                            drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                        }
                    }
                    evVar2.invalidate();
                    int i21 = i17 * 6;
                    if (fvVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    fvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (fvVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (fvVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    fvVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!fvVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (fvVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (fvVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    bzVar.getLocationOnScreen(iArr);
                    if (!fvVar.d) {
                        int i24 = evVar2.f27991n[0];
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
                        i14 = org.telegram.ui.d3.w(5.0f, iArr[0] - i14, i14);
                    } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i27 = -i14;
                    if (bzVar.getTop() < 0) {
                        i15 = bzVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (AndroidUtilities.isTablet()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    evVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    fvVar.setFocusable(true);
                    fvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    szVar.h.requestDisallowInterceptTouchEvent(true);
                    dyVar.d1(true);
                    dyVar.D1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void k(int i10) {
        sz szVar = this.f30763b;
        ch.f fVar = szVar.f32742j2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (a8.pf.a(i10, 4)) {
                fVar.h(szVar.f32753n2.e());
            }
            fVar.e(szVar.f32745k2, szVar.getWidth(), szVar.getHeight());
        }
    }

    @Override
    public void z(float f7, int i10) {
    }
}
