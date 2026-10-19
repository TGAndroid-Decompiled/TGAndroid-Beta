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
public final class mw implements ni.c, yl0, en0, ne.d {
    public final int f28617a;
    public final tz f28618b;

    public mw(tz tzVar, int i10) {
        this.f28617a = i10;
        this.f28618b = tzVar;
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
        tz tzVar = this.f28618b;
        int i16 = tzVar.C1;
        ey eyVar = tzVar.P;
        int[] iArr = tzVar.D1;
        ev evVar = tzVar.B1;
        if (view instanceof cz) {
            cz czVar = (cz) view;
            String str3 = null;
            s4.b1 b1Var = null;
            if (czVar.f25367c) {
                View F = eyVar.F(view);
                if (F != null) {
                    b1Var = eyVar.T(F);
                }
                if (b1Var != null && b1Var.b() <= tzVar.getRecentEmoji().size()) {
                    tzVar.f30823t1.n();
                }
                eyVar.y1(view);
                return true;
            } else if (czVar.getSpan() == null && (str = (String) czVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!czVar.f25367c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    tzVar.R1 = czVar;
                    tzVar.U1 = tzVar.S1;
                    tzVar.V1 = tzVar.T1;
                    if (isCompound) {
                        replace = tz.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        dv dvVar = evVar.f26031c;
                        int[] iArr2 = dvVar.f25646n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            dvVar.invalidate();
                        }
                    }
                    evVar.getClass();
                    dv dvVar2 = evVar.f26031c;
                    int i17 = evVar.e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    evVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = dvVar2.f25643b;
                    int[] iArr3 = dvVar2.f25646n;
                    dvVar2.f25645f = z10;
                    dvVar2.e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(dvVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                dvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                dvVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            dvVar2.G = z11;
                        }
                        dvVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str2 = tz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                            } else {
                                str2 = replace;
                            }
                            drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                        }
                    }
                    dvVar2.invalidate();
                    int i21 = i17 * 6;
                    if (evVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    evVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (evVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (evVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    evVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!evVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (evVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (evVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    czVar.getLocationOnScreen(iArr);
                    if (!evVar.d) {
                        int i24 = dvVar2.f25646n[0];
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
                        i14 = org.telegram.messenger.lk.D(5.0f, iArr[0] - i14, i14);
                    } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i27 = -i14;
                    if (czVar.getTop() < 0) {
                        i15 = czVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (AndroidUtilities.isTablet()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    dvVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    evVar.setFocusable(true);
                    evVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    tzVar.h.requestDisallowInterceptTouchEvent(true);
                    eyVar.d1(true);
                    eyVar.y1(view);
                    return true;
                }
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
        fz fzVar;
        switch (this.f28617a) {
            case 2:
                tz tzVar = this.f28618b;
                zy zyVar = tzVar.f30788i0;
                int i16 = tzVar.f30770c1;
                yy yyVar = tzVar.f30802n0;
                bz bzVar = tzVar.f30794k0;
                if (i10 != tzVar.f30819s0 || !yyVar.f32775x.isEmpty()) {
                    tzVar.f30785h0.B0();
                    tzVar.f30808p0.k(i10, 0);
                    if (i10 != tzVar.f30815r0 && i10 != tzVar.f30819s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        tzVar.f30791j0.H(arrayList.get(i10 - tzVar.f30822t0));
                        int i17 = i10 - tzVar.f30822t0;
                        if (i17 > 0) {
                            bzVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - tzVar.f30822t0 < arrayList.size() - 1) {
                            bzVar.a(arrayList.get((i10 - tzVar.f30822t0) + 1), true);
                        }
                    } else {
                        tzVar.f30805o0.d.setText("");
                        if (i10 == tzVar.f30819s0 && (i12 = yyVar.I) >= 1) {
                            zyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            uy uyVar = tzVar.f30823t1;
                            if (uyVar != null && uyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            zyVar.h1(i11, 0);
                        }
                        if (i10 == tzVar.f30819s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                bzVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    tzVar.E(2);
                    return;
                }
                return;
            default:
                tz tzVar2 = this.f28618b;
                dx dxVar = tzVar2.G0;
                ArrayList arrayList3 = tzVar2.f30773d1;
                ex exVar = tzVar2.B0;
                kz kzVar = tzVar2.f30840y0;
                ax axVar = tzVar2.D0;
                if (!tzVar2.S0) {
                    if (i10 == tzVar2.H1) {
                        tzVar2.f30823t1.o(new c61(tzVar2.getContext(), new mx(tzVar2), tzVar2.f30837x1, tzVar2.f30841y1, tzVar2.f30844z1, null, tzVar2.Z1));
                        return;
                    }
                    if (dxVar != null && (fzVar = dxVar.f26721r) != null && fzVar.getSelectedCategory() != null) {
                        dxVar.c(null, false);
                        fzVar.G1(null);
                    }
                    if (i10 == tzVar2.F1) {
                        axVar.B0();
                        tzVar2.G(kzVar.E("recent"), 0);
                        tzVar2.E(0);
                        int i18 = tzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = tzVar2.E1;
                        }
                        exVar.k(i18, i15);
                        return;
                    } else if (i10 == tzVar2.G1) {
                        axVar.B0();
                        tzVar2.G(kzVar.E("fav"), 0);
                        tzVar2.E(0);
                        int i19 = tzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = tzVar2.E1;
                        }
                        exVar.k(i19, i14);
                        return;
                    } else if (i10 == tzVar2.I1) {
                        axVar.B0();
                        tzVar2.G(kzVar.E("premium"), 0);
                        tzVar2.E(0);
                        int i20 = tzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = tzVar2.E1;
                        }
                        exVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - tzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            tzVar2.I0 = false;
                            axVar.B0();
                            tzVar2.G(kzVar.E(arrayList3.get(i21)), 0);
                            tzVar2.E(0);
                            tzVar2.p(0);
                            int i22 = tzVar2.G1;
                            if (i22 <= 0 && (i22 = tzVar2.F1) <= 0) {
                                i22 = tzVar2.E1;
                            }
                            exVar.k(i10, i22);
                            tzVar2.X1 = false;
                            tzVar2.Y();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void c(int i10) {
        float f7;
        tz tzVar = this.f28618b;
        bh.f fVar = tzVar.f30793j2;
        RectF rectF = tzVar.f30842y2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ih.j.c(tzVar.f30831w, tzVar, rectF);
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
            rectF.right = tzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, tzVar.getMeasuredHeight());
            fVar.g(!rectF.isEmpty(), tzVar.f30845z2);
            fVar.e(tzVar.f30796k2, tzVar.getWidth(), tzVar.getHeight());
        }
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        this.f28618b.R();
    }

    @Override
    public void H(float f7, int i10) {
    }
}
