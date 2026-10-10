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
public final class vw implements li.c, hm0, nn0, me.d {
    public final int f32525a;
    public final b00 f32526b;

    public vw(b00 b00Var, int i10) {
        this.f32525a = i10;
        this.f32526b = b00Var;
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        mz mzVar;
        switch (this.f32525a) {
            case 2:
                b00 b00Var = this.f32526b;
                gz gzVar = b00Var.f24708i0;
                int i16 = b00Var.f24689c1;
                fz fzVar = b00Var.f24722n0;
                iz izVar = b00Var.f24714k0;
                if (i10 != b00Var.f24739s0 || !fzVar.f26543x.isEmpty()) {
                    b00Var.f24705h0.B0();
                    b00Var.f24728p0.k(i10, 0);
                    if (i10 != b00Var.f24735r0 && i10 != b00Var.f24739s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        b00Var.f24711j0.H(arrayList.get(i10 - b00Var.f24742t0));
                        int i17 = i10 - b00Var.f24742t0;
                        if (i17 > 0) {
                            izVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - b00Var.f24742t0 < arrayList.size() - 1) {
                            izVar.a(arrayList.get((i10 - b00Var.f24742t0) + 1), true);
                        }
                    } else {
                        b00Var.f24725o0.d.setText("");
                        if (i10 == b00Var.f24739s0 && (i12 = fzVar.I) >= 1) {
                            gzVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            bz bzVar = b00Var.f24743t1;
                            if (bzVar != null && bzVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            gzVar.h1(i11, 0);
                        }
                        if (i10 == b00Var.f24739s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                izVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    b00Var.F(2);
                    return;
                }
                return;
            default:
                b00 b00Var2 = this.f32526b;
                mx mxVar = b00Var2.G0;
                ArrayList arrayList3 = b00Var2.f24692d1;
                nx nxVar = b00Var2.B0;
                rz rzVar = b00Var2.f24760y0;
                jx jxVar = b00Var2.D0;
                if (!b00Var2.S0) {
                    if (i10 == b00Var2.H1) {
                        b00Var2.f24743t1.o(new m61(b00Var2.getContext(), new vx(b00Var2), b00Var2.f24757x1, b00Var2.f24761y1, b00Var2.f24764z1, null, b00Var2.Z1));
                        return;
                    }
                    if (mxVar != null && (mzVar = mxVar.f29275r) != null && mzVar.getSelectedCategory() != null) {
                        mxVar.c(null, false);
                        mzVar.G1(null);
                    }
                    if (i10 == b00Var2.F1) {
                        jxVar.B0();
                        b00Var2.H(rzVar.E("recent"), 0);
                        b00Var2.F(0);
                        int i18 = b00Var2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = b00Var2.E1;
                        }
                        nxVar.k(i18, i15);
                        return;
                    } else if (i10 == b00Var2.G1) {
                        jxVar.B0();
                        b00Var2.H(rzVar.E("fav"), 0);
                        b00Var2.F(0);
                        int i19 = b00Var2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = b00Var2.E1;
                        }
                        nxVar.k(i19, i14);
                        return;
                    } else if (i10 == b00Var2.I1) {
                        jxVar.B0();
                        b00Var2.H(rzVar.E("premium"), 0);
                        b00Var2.F(0);
                        int i20 = b00Var2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = b00Var2.E1;
                        }
                        nxVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - b00Var2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            b00Var2.I0 = false;
                            jxVar.B0();
                            b00Var2.H(rzVar.E(arrayList3.get(i21)), 0);
                            b00Var2.F(0);
                            b00Var2.q(0);
                            int i22 = b00Var2.G1;
                            if (i22 <= 0 && (i22 = b00Var2.F1) <= 0) {
                                i22 = b00Var2.E1;
                            }
                            nxVar.k(i10, i22);
                            b00Var2.X1 = false;
                            b00Var2.Y();
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
        b00 b00Var = this.f32526b;
        ah.h hVar = b00Var.f24713j2;
        RectF rectF = b00Var.f24762y2;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hh.j.c(b00Var.f24751w, b00Var, rectF);
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
            rectF.right = b00Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, b00Var.getMeasuredHeight());
            hVar.g(!rectF.isEmpty(), b00Var.f24765z2);
            hVar.e(b00Var.f24716k2, b00Var.getWidth(), b00Var.getHeight());
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
        b00 b00Var = this.f32526b;
        int i16 = b00Var.C1;
        ny nyVar = b00Var.P;
        int[] iArr = b00Var.D1;
        ov ovVar = b00Var.B1;
        if (view instanceof jz) {
            jz jzVar = (jz) view;
            String str3 = null;
            s4.d1 d1Var = null;
            if (jzVar.f27822c) {
                View F = nyVar.F(view);
                if (F != null) {
                    d1Var = nyVar.T(F);
                }
                if (d1Var != null && d1Var.b() <= b00Var.getRecentEmoji().size()) {
                    b00Var.f24743t1.n();
                }
                nyVar.y1(view);
                return true;
            } else if (jzVar.getSpan() == null && (str = (String) jzVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!jzVar.f27822c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    b00Var.R1 = jzVar;
                    b00Var.U1 = b00Var.S1;
                    b00Var.V1 = b00Var.T1;
                    if (isCompound) {
                        replace = b00.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        nv nvVar = ovVar.f29606c;
                        int[] iArr2 = nvVar.f29245n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            nvVar.invalidate();
                        }
                    }
                    ovVar.getClass();
                    nv nvVar2 = ovVar.f29606c;
                    int i17 = ovVar.f29607e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ovVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = nvVar2.f29241b;
                    int[] iArr3 = nvVar2.f29245n;
                    nvVar2.f29244f = z10;
                    nvVar2.f29243e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(nvVar2.f29243e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                nvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                nvVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            nvVar2.G = z11;
                        }
                        nvVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str2 = b00.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                            } else {
                                str2 = replace;
                            }
                            drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                        }
                    }
                    nvVar2.invalidate();
                    int i21 = i17 * 6;
                    if (ovVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    ovVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (ovVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (ovVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    ovVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!ovVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (ovVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (ovVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    jzVar.getLocationOnScreen(iArr);
                    if (!ovVar.d) {
                        int i24 = nvVar2.f29245n[0];
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
                        i14 = org.telegram.messenger.bi.D(5.0f, iArr[0] - i14, i14);
                    } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                        i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                    }
                    int i27 = -i14;
                    if (jzVar.getTop() < 0) {
                        i15 = jzVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (AndroidUtilities.isTablet()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    nvVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    ovVar.setFocusable(true);
                    ovVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    b00Var.h.requestDisallowInterceptTouchEvent(true);
                    nyVar.d1(true);
                    nyVar.y1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f32526b.R();
    }

    @Override
    public void A(float f7, int i10) {
    }
}
