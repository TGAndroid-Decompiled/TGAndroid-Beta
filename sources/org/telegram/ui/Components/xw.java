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
public final class xw implements li.c, mm0, sn0, me.d {
    public final int f32880a;
    public final d00 f32881b;

    public xw(d00 d00Var, int i10) {
        this.f32880a = i10;
        this.f32881b = d00Var;
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        oz ozVar;
        switch (this.f32880a) {
            case 2:
                d00 d00Var = this.f32881b;
                iz izVar = d00Var.f25091i0;
                int i16 = d00Var.f25072c1;
                hz hzVar = d00Var.f25105n0;
                kz kzVar = d00Var.f25097k0;
                if (i10 != d00Var.f25122s0 || !hzVar.f26980x.isEmpty()) {
                    d00Var.f25088h0.B0();
                    d00Var.f25111p0.k(i10, 0);
                    if (i10 != d00Var.f25118r0 && i10 != d00Var.f25122s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        d00Var.f25094j0.H(arrayList.get(i10 - d00Var.f25125t0));
                        int i17 = i10 - d00Var.f25125t0;
                        if (i17 > 0) {
                            kzVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - d00Var.f25125t0 < arrayList.size() - 1) {
                            kzVar.a(arrayList.get((i10 - d00Var.f25125t0) + 1), true);
                        }
                    } else {
                        d00Var.f25108o0.d.setText("");
                        if (i10 == d00Var.f25122s0 && (i12 = hzVar.I) >= 1) {
                            izVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            dz dzVar = d00Var.f25126t1;
                            if (dzVar != null && dzVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            izVar.h1(i11, 0);
                        }
                        if (i10 == d00Var.f25122s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                kzVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    d00Var.F(2);
                    return;
                }
                return;
            default:
                d00 d00Var2 = this.f32881b;
                ox oxVar = d00Var2.G0;
                ArrayList arrayList3 = d00Var2.f25075d1;
                px pxVar = d00Var2.B0;
                tz tzVar = d00Var2.f25143y0;
                lx lxVar = d00Var2.D0;
                if (!d00Var2.S0) {
                    if (i10 == d00Var2.H1) {
                        d00Var2.f25126t1.o(new q61(d00Var2.getContext(), new xx(d00Var2), d00Var2.f25140x1, d00Var2.f25144y1, d00Var2.f25147z1, null, d00Var2.Z1));
                        return;
                    }
                    if (oxVar != null && (ozVar = oxVar.f29600r) != null && ozVar.getSelectedCategory() != null) {
                        oxVar.c(null, false);
                        ozVar.G1(null);
                    }
                    if (i10 == d00Var2.F1) {
                        lxVar.B0();
                        d00Var2.H(tzVar.E("recent"), 0);
                        d00Var2.F(0);
                        int i18 = d00Var2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = d00Var2.E1;
                        }
                        pxVar.k(i18, i15);
                        return;
                    } else if (i10 == d00Var2.G1) {
                        lxVar.B0();
                        d00Var2.H(tzVar.E("fav"), 0);
                        d00Var2.F(0);
                        int i19 = d00Var2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = d00Var2.E1;
                        }
                        pxVar.k(i19, i14);
                        return;
                    } else if (i10 == d00Var2.I1) {
                        lxVar.B0();
                        d00Var2.H(tzVar.E("premium"), 0);
                        d00Var2.F(0);
                        int i20 = d00Var2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = d00Var2.E1;
                        }
                        pxVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - d00Var2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            d00Var2.I0 = false;
                            lxVar.B0();
                            d00Var2.H(tzVar.E(arrayList3.get(i21)), 0);
                            d00Var2.F(0);
                            d00Var2.q(0);
                            int i22 = d00Var2.G1;
                            if (i22 <= 0 && (i22 = d00Var2.F1) <= 0) {
                                i22 = d00Var2.E1;
                            }
                            pxVar.k(i10, i22);
                            d00Var2.X1 = false;
                            d00Var2.Y();
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
        d00 d00Var = this.f32881b;
        ah.h hVar = d00Var.f25096j2;
        RectF rectF = d00Var.f25145y2;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hh.j.c(d00Var.f25134w, d00Var, rectF);
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
            rectF.right = d00Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, d00Var.getMeasuredHeight());
            hVar.g(!rectF.isEmpty(), d00Var.f25148z2);
            hVar.e(d00Var.f25099k2, d00Var.getWidth(), d00Var.getHeight());
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
        d00 d00Var = this.f32881b;
        int i16 = d00Var.C1;
        py pyVar = d00Var.P;
        int[] iArr = d00Var.D1;
        qv qvVar = d00Var.B1;
        if (view instanceof lz) {
            lz lzVar = (lz) view;
            String str3 = null;
            s4.d1 d1Var = null;
            if (lzVar.f28319c) {
                View F = pyVar.F(view);
                if (F != null) {
                    d1Var = pyVar.T(F);
                }
                if (d1Var != null && d1Var.b() <= d00Var.getRecentEmoji().size()) {
                    d00Var.f25126t1.n();
                }
                pyVar.y1(view);
                return true;
            } else if (lzVar.getSpan() == null && (str = (String) lzVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!lzVar.f28319c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    d00Var.R1 = lzVar;
                    d00Var.U1 = d00Var.S1;
                    d00Var.V1 = d00Var.T1;
                    if (isCompound) {
                        replace = d00.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        pv pvVar = qvVar.f29942c;
                        int[] iArr2 = pvVar.f29577n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            pvVar.invalidate();
                        }
                    }
                    qvVar.getClass();
                    pv pvVar2 = qvVar.f29942c;
                    int i17 = qvVar.f29943e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qvVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = pvVar2.f29573b;
                    int[] iArr3 = pvVar2.f29577n;
                    pvVar2.f29576f = z10;
                    pvVar2.f29575e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(pvVar2.f29575e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                pvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                pvVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            pvVar2.G = z11;
                        }
                        pvVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str2 = d00.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                            } else {
                                str2 = replace;
                            }
                            drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                        }
                    }
                    pvVar2.invalidate();
                    int i21 = i17 * 6;
                    if (qvVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    qvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (qvVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (qvVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    qvVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!qvVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (qvVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (qvVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    lzVar.getLocationOnScreen(iArr);
                    if (!qvVar.d) {
                        int i24 = pvVar2.f29577n[0];
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
                        i14 = org.telegram.messenger.am.D(5.0f, iArr[0] - i14, i14);
                    } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i27 = -i14;
                    if (lzVar.getTop() < 0) {
                        i15 = lzVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (AndroidUtilities.isTablet()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    pvVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    qvVar.setFocusable(true);
                    qvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    d00Var.h.requestDisallowInterceptTouchEvent(true);
                    pyVar.d1(true);
                    pyVar.y1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f32881b.R();
    }

    @Override
    public void C(float f7, int i10) {
    }
}
