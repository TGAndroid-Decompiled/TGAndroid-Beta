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
public final class qw implements ni.c, cm0, in0, ne.d {
    public final int f28686a;
    public final wz f28687b;

    public qw(wz wzVar, int i10) {
        this.f28686a = i10;
        this.f28687b = wzVar;
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
        wz wzVar = this.f28687b;
        int i16 = wzVar.C1;
        iy iyVar = wzVar.P;
        int[] iArr = wzVar.D1;
        jv jvVar = wzVar.B1;
        if (view instanceof ez) {
            ez ezVar = (ez) view;
            String str3 = null;
            s4.b1 b1Var = null;
            if (ezVar.f24824c) {
                View F = iyVar.F(view);
                if (F != null) {
                    b1Var = iyVar.T(F);
                }
                if (b1Var != null && b1Var.b() <= wzVar.getRecentEmoji().size()) {
                    wzVar.f31067t1.n();
                }
                iyVar.y1(view);
                return true;
            } else if (ezVar.getSpan() == null && (str = (String) ezVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!ezVar.f24824c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    wzVar.R1 = ezVar;
                    wzVar.U1 = wzVar.S1;
                    wzVar.V1 = wzVar.T1;
                    if (isCompound) {
                        replace = wz.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        iv ivVar = jvVar.f26502c;
                        int[] iArr2 = ivVar.f26102n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            ivVar.invalidate();
                        }
                    }
                    jvVar.getClass();
                    iv ivVar2 = jvVar.f26502c;
                    int i17 = jvVar.e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jvVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = ivVar2.f26099b;
                    int[] iArr3 = ivVar2.f26102n;
                    ivVar2.f26101f = z10;
                    ivVar2.e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(ivVar2.e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                ivVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                ivVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ivVar2.G = z11;
                        }
                        ivVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str2 = wz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                            } else {
                                str2 = replace;
                            }
                            drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                        }
                    }
                    ivVar2.invalidate();
                    int i21 = i17 * 6;
                    if (jvVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    jvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (jvVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (jvVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    jvVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!jvVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (jvVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (jvVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    ezVar.getLocationOnScreen(iArr);
                    if (!jvVar.d) {
                        int i24 = ivVar2.f26102n[0];
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
                        i14 = org.telegram.ui.Cells.d0.b(5.0f, iArr[0] - i14, i14);
                    } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i27 = -i14;
                    if (ezVar.getTop() < 0) {
                        i15 = ezVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (AndroidUtilities.isTablet()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    ivVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    jvVar.setFocusable(true);
                    jvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    wzVar.h.requestDisallowInterceptTouchEvent(true);
                    iyVar.d1(true);
                    iyVar.y1(view);
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
        hz hzVar;
        switch (this.f28686a) {
            case 2:
                wz wzVar = this.f28687b;
                bz bzVar = wzVar.f31032i0;
                int i16 = wzVar.f31014c1;
                az azVar = wzVar.f31046n0;
                dz dzVar = wzVar.f31038k0;
                if (i10 != wzVar.f31063s0 || !azVar.f23645x.isEmpty()) {
                    wzVar.f31029h0.B0();
                    wzVar.f31052p0.k(i10, 0);
                    if (i10 != wzVar.f31059r0 && i10 != wzVar.f31063s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        wzVar.f31035j0.H(arrayList.get(i10 - wzVar.f31066t0));
                        int i17 = i10 - wzVar.f31066t0;
                        if (i17 > 0) {
                            dzVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - wzVar.f31066t0 < arrayList.size() - 1) {
                            dzVar.a(arrayList.get((i10 - wzVar.f31066t0) + 1), true);
                        }
                    } else {
                        wzVar.f31049o0.d.setText("");
                        if (i10 == wzVar.f31063s0 && (i12 = azVar.I) >= 1) {
                            bzVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            wy wyVar = wzVar.f31067t1;
                            if (wyVar != null && wyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            bzVar.h1(i11, 0);
                        }
                        if (i10 == wzVar.f31063s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                dzVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    wzVar.F(2);
                    return;
                }
                return;
            default:
                wz wzVar2 = this.f28687b;
                hx hxVar = wzVar2.G0;
                ArrayList arrayList3 = wzVar2.f31017d1;
                ix ixVar = wzVar2.B0;
                mz mzVar = wzVar2.f31084y0;
                ex exVar = wzVar2.D0;
                if (!wzVar2.S0) {
                    if (i10 == wzVar2.H1) {
                        wzVar2.f31067t1.o(new h61(wzVar2.getContext(), new qx(wzVar2), wzVar2.f31081x1, wzVar2.f31085y1, wzVar2.f31088z1, null, wzVar2.Z1));
                        return;
                    }
                    if (hxVar != null && (hzVar = hxVar.f26130r) != null && hzVar.getSelectedCategory() != null) {
                        hxVar.c(null, false);
                        hzVar.G1(null);
                    }
                    if (i10 == wzVar2.F1) {
                        exVar.B0();
                        wzVar2.H(mzVar.E("recent"), 0);
                        wzVar2.F(0);
                        int i18 = wzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = wzVar2.E1;
                        }
                        ixVar.k(i18, i15);
                        return;
                    } else if (i10 == wzVar2.G1) {
                        exVar.B0();
                        wzVar2.H(mzVar.E("fav"), 0);
                        wzVar2.F(0);
                        int i19 = wzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = wzVar2.E1;
                        }
                        ixVar.k(i19, i14);
                        return;
                    } else if (i10 == wzVar2.I1) {
                        exVar.B0();
                        wzVar2.H(mzVar.E("premium"), 0);
                        wzVar2.F(0);
                        int i20 = wzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = wzVar2.E1;
                        }
                        ixVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - wzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            wzVar2.I0 = false;
                            exVar.B0();
                            wzVar2.H(mzVar.E(arrayList3.get(i21)), 0);
                            wzVar2.F(0);
                            wzVar2.q(0);
                            int i22 = wzVar2.G1;
                            if (i22 <= 0 && (i22 = wzVar2.F1) <= 0) {
                                i22 = wzVar2.E1;
                            }
                            ixVar.k(i10, i22);
                            wzVar2.X1 = false;
                            wzVar2.Y();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void d(int i10) {
        float f7;
        wz wzVar = this.f28687b;
        bh.f fVar = wzVar.f31037j2;
        RectF rectF = wzVar.f31086y2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            ih.j.c(wzVar.f31075w, wzVar, rectF);
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
            rectF.right = wzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, wzVar.getMeasuredHeight());
            fVar.g(!rectF.isEmpty(), wzVar.f31089z2);
            fVar.e(wzVar.f31040k2, wzVar.getWidth(), wzVar.getHeight());
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        this.f28687b.R();
    }

    @Override
    public void C(float f7, int i10) {
    }
}
