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
public final class uw implements li.c, gm0, mn0, me.d {
    public final int f31631a;
    public final a00 f31632b;

    public uw(a00 a00Var, int i10) {
        this.f31631a = i10;
        this.f31632b = a00Var;
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        lz lzVar;
        switch (this.f31631a) {
            case 2:
                a00 a00Var = this.f31632b;
                fz fzVar = a00Var.f24420i0;
                int i16 = a00Var.f24401c1;
                ez ezVar = a00Var.f24434n0;
                hz hzVar = a00Var.f24426k0;
                if (i10 != a00Var.f24451s0 || !ezVar.f26187x.isEmpty()) {
                    a00Var.f24417h0.B0();
                    a00Var.f24440p0.k(i10, 0);
                    if (i10 != a00Var.f24447r0 && i10 != a00Var.f24451s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        a00Var.f24423j0.H(arrayList.get(i10 - a00Var.f24454t0));
                        int i17 = i10 - a00Var.f24454t0;
                        if (i17 > 0) {
                            hzVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - a00Var.f24454t0 < arrayList.size() - 1) {
                            hzVar.a(arrayList.get((i10 - a00Var.f24454t0) + 1), true);
                        }
                    } else {
                        a00Var.f24437o0.d.setText("");
                        if (i10 == a00Var.f24451s0 && (i12 = ezVar.I) >= 1) {
                            fzVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            az azVar = a00Var.f24455t1;
                            if (azVar != null && azVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            fzVar.h1(i11, 0);
                        }
                        if (i10 == a00Var.f24451s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                hzVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    a00Var.F(2);
                    return;
                }
                return;
            default:
                a00 a00Var2 = this.f31632b;
                lx lxVar = a00Var2.G0;
                ArrayList arrayList3 = a00Var2.f24404d1;
                mx mxVar = a00Var2.B0;
                qz qzVar = a00Var2.f24472y0;
                ix ixVar = a00Var2.D0;
                if (!a00Var2.S0) {
                    if (i10 == a00Var2.H1) {
                        a00Var2.f24455t1.o(new l61(a00Var2.getContext(), new ux(a00Var2), a00Var2.f24469x1, a00Var2.f24473y1, a00Var2.f24476z1, null, a00Var2.Z1));
                        return;
                    }
                    if (lxVar != null && (lzVar = lxVar.f28978r) != null && lzVar.getSelectedCategory() != null) {
                        lxVar.c(null, false);
                        lzVar.G1(null);
                    }
                    if (i10 == a00Var2.F1) {
                        ixVar.B0();
                        a00Var2.H(qzVar.E("recent"), 0);
                        a00Var2.F(0);
                        int i18 = a00Var2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = a00Var2.E1;
                        }
                        mxVar.k(i18, i15);
                        return;
                    } else if (i10 == a00Var2.G1) {
                        ixVar.B0();
                        a00Var2.H(qzVar.E("fav"), 0);
                        a00Var2.F(0);
                        int i19 = a00Var2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = a00Var2.E1;
                        }
                        mxVar.k(i19, i14);
                        return;
                    } else if (i10 == a00Var2.I1) {
                        ixVar.B0();
                        a00Var2.H(qzVar.E("premium"), 0);
                        a00Var2.F(0);
                        int i20 = a00Var2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = a00Var2.E1;
                        }
                        mxVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - a00Var2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            a00Var2.I0 = false;
                            ixVar.B0();
                            a00Var2.H(qzVar.E(arrayList3.get(i21)), 0);
                            a00Var2.F(0);
                            a00Var2.q(0);
                            int i22 = a00Var2.G1;
                            if (i22 <= 0 && (i22 = a00Var2.F1) <= 0) {
                                i22 = a00Var2.E1;
                            }
                            mxVar.k(i10, i22);
                            a00Var2.X1 = false;
                            a00Var2.Y();
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
        a00 a00Var = this.f31632b;
        ah.h hVar = a00Var.f24425j2;
        RectF rectF = a00Var.f24474y2;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hh.j.c(a00Var.f24463w, a00Var, rectF);
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
            rectF.right = a00Var.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, a00Var.getMeasuredHeight());
            hVar.g(!rectF.isEmpty(), a00Var.f24477z2);
            hVar.e(a00Var.f24428k2, a00Var.getWidth(), a00Var.getHeight());
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
        a00 a00Var = this.f31632b;
        int i16 = a00Var.C1;
        my myVar = a00Var.P;
        int[] iArr = a00Var.D1;
        nv nvVar = a00Var.B1;
        if (view instanceof iz) {
            iz izVar = (iz) view;
            String str3 = null;
            s4.d1 d1Var = null;
            if (izVar.f27519c) {
                View F = myVar.F(view);
                if (F != null) {
                    d1Var = myVar.T(F);
                }
                if (d1Var != null && d1Var.b() <= a00Var.getRecentEmoji().size()) {
                    a00Var.f24455t1.n();
                }
                myVar.y1(view);
                return true;
            } else if (izVar.getSpan() == null && (str = (String) izVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!izVar.f27519c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (isCompound || EmojiData.emojiColoredMap.contains(replace)) {
                    a00Var.R1 = izVar;
                    a00Var.U1 = a00Var.S1;
                    a00Var.V1 = a00Var.T1;
                    if (isCompound) {
                        replace = a00.g(replace, str3);
                    } else {
                        int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                        mv mvVar = nvVar.f29288c;
                        int[] iArr2 = mvVar.f28948n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            mvVar.invalidate();
                        }
                    }
                    nvVar.getClass();
                    mv mvVar2 = nvVar.f29288c;
                    int i17 = nvVar.f29289e;
                    if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nvVar.d = z10;
                    int i18 = 3;
                    Drawable[] drawableArr = mvVar2.f28944b;
                    int[] iArr3 = mvVar2.f28948n;
                    mvVar2.f28947f = z10;
                    mvVar2.f28946e = replace;
                    int i19 = 5;
                    if (z10) {
                        drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                        drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, 0, -2);
                        drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, 1, -2);
                        drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, 2, -2);
                        drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, 3, -2);
                        drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, 4, -2);
                        drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, -2, 0);
                        drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, -2, 1);
                        drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, -2, 2);
                        drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, -2, 3);
                        drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(mvVar2.f28946e, -2, 4);
                        Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                        if (isHandshake != null) {
                            int intValue = ((Integer) isHandshake.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                mvVar2.invalidate();
                            }
                            int intValue2 = ((Integer) isHandshake.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                mvVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            mvVar2.G = z11;
                        }
                        mvVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str2 = a00.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                            } else {
                                str2 = replace;
                            }
                            drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                        }
                    }
                    mvVar2.invalidate();
                    int i21 = i17 * 6;
                    if (nvVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    nvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (nvVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int dp = AndroidUtilities.dp(f7);
                    if (nvVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    nvVar.setHeight((i12 * i17) + dp);
                    int i22 = i17 * 6;
                    if (!nvVar.d) {
                        i18 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                    if (nvVar.d) {
                        f11 = 11.66f;
                    }
                    int dp3 = AndroidUtilities.dp(f11);
                    if (nvVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + dp3;
                    izVar.getLocationOnScreen(iArr);
                    if (!nvVar.d) {
                        int i24 = mvVar2.f28948n[0];
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
                    if (izVar.getTop() < 0) {
                        i15 = izVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (AndroidUtilities.isTablet()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    mvVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                    nvVar.setFocusable(true);
                    nvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    a00Var.h.requestDisallowInterceptTouchEvent(true);
                    myVar.d1(true);
                    myVar.y1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f31632b.R();
    }

    @Override
    public void A(float f7, int i10) {
    }
}
