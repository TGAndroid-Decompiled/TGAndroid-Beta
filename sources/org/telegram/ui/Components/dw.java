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
public final class dw implements kl0, xd.b, nm0, vg.g {
    public final int f26365a;
    public final mz f26366b;

    public dw(mz mzVar, int i10) {
        this.f26365a = i10;
        this.f26366b = mzVar;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f26366b.T();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        xy xyVar;
        switch (this.f26365a) {
            case 2:
                mz mzVar = this.f26366b;
                ry ryVar = mzVar.f29284f0;
                int i16 = mzVar.Z0;
                qy qyVar = mzVar.f29299k0;
                ty tyVar = mzVar.f29290h0;
                if (i10 != mzVar.f29313p0 || !qyVar.f30556x.isEmpty()) {
                    mzVar.f29280e0.B0();
                    mzVar.m0.k(i10, 0);
                    if (i10 != mzVar.f29310o0 && i10 != mzVar.f29313p0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        mzVar.f29287g0.H(arrayList.get(i10 - mzVar.f29316q0));
                        int i17 = i10 - mzVar.f29316q0;
                        if (i17 > 0) {
                            tyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - mzVar.f29316q0 < arrayList.size() - 1) {
                            tyVar.a(arrayList.get((i10 - mzVar.f29316q0) + 1), true);
                        }
                    } else {
                        mzVar.f29302l0.d.setText("");
                        if (i10 == mzVar.f29313p0 && (i12 = qyVar.F) >= 1) {
                            ryVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            my myVar = mzVar.f29317q1;
                            if (myVar != null && myVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            ryVar.h1(i11, 0);
                        }
                        if (i10 == mzVar.f29313p0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                tyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    mzVar.G(2);
                    return;
                }
                return;
            default:
                mz mzVar2 = this.f26366b;
                uw uwVar = mzVar2.D0;
                ArrayList arrayList3 = mzVar2.f29267a1;
                vw vwVar = mzVar2.f29345y0;
                dz dzVar = mzVar2.f29333v0;
                rw rwVar = mzVar2.A0;
                if (!mzVar2.P0) {
                    if (i10 == mzVar2.E1) {
                        mzVar2.f29317q1.o(new d51(mzVar2.getContext(), new ex(mzVar2), mzVar2.f29331u1, mzVar2.f29334v1, mzVar2.f29338w1, null, mzVar2.W1));
                        return;
                    }
                    if (uwVar != null && (xyVar = uwVar.f33689r) != null && xyVar.getSelectedCategory() != null) {
                        uwVar.c(null, false);
                        xyVar.E1(null);
                    }
                    if (i10 == mzVar2.C1) {
                        rwVar.B0();
                        mzVar2.I(dzVar.E("recent"), 0);
                        mzVar2.G(0);
                        int i18 = mzVar2.C1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = mzVar2.B1;
                        }
                        vwVar.k(i18, i15);
                        return;
                    } else if (i10 == mzVar2.D1) {
                        rwVar.B0();
                        mzVar2.I(dzVar.E("fav"), 0);
                        mzVar2.G(0);
                        int i19 = mzVar2.D1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = mzVar2.B1;
                        }
                        vwVar.k(i19, i14);
                        return;
                    } else if (i10 == mzVar2.F1) {
                        rwVar.B0();
                        mzVar2.I(dzVar.E("premium"), 0);
                        mzVar2.G(0);
                        int i20 = mzVar2.F1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = mzVar2.B1;
                        }
                        vwVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - mzVar2.B1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            mzVar2.F0 = false;
                            rwVar.B0();
                            mzVar2.I(dzVar.E(arrayList3.get(i21)), 0);
                            mzVar2.G(0);
                            mzVar2.p(0);
                            int i22 = mzVar2.D1;
                            if (i22 <= 0 && (i22 = mzVar2.C1) <= 0) {
                                i22 = mzVar2.B1;
                            }
                            vwVar.k(i10, i22);
                            mzVar2.U1 = false;
                            mzVar2.a0();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void d(RectF rectF, View view) {
        this.f26366b.C();
    }

    @Override
    public boolean f(int i10, View view) {
        String str;
        boolean z4;
        String str2;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        boolean z10;
        mz mzVar = this.f26366b;
        int i16 = mzVar.f29349z1;
        kx kxVar = mzVar.M;
        int[] iArr = mzVar.A1;
        tu tuVar = mzVar.f29346y1;
        if (view instanceof uy) {
            uy uyVar = (uy) view;
            String str3 = null;
            f2.m1 m1Var = null;
            if (uyVar.f31707c) {
                View F = kxVar.F(view);
                if (F != null) {
                    m1Var = kxVar.T(F);
                }
                if (m1Var != null && m1Var.b() <= mzVar.getRecentEmoji().size()) {
                    mzVar.f29317q1.n();
                }
                kxVar.v1(view);
                return true;
            } else if (uyVar.getSpan() != null || (str = (String) uyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!uyVar.f31707c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                mzVar.O1 = uyVar;
                mzVar.R1 = mzVar.P1;
                mzVar.S1 = mzVar.Q1;
                if (isCompound) {
                    replace = mz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    su suVar = tuVar.f31419c;
                    int[] iArr2 = suVar.f31182n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        suVar.invalidate();
                    }
                }
                tuVar.getClass();
                su suVar2 = tuVar.f31419c;
                int i17 = tuVar.f31420e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                tuVar.d = z4;
                int i18 = 3;
                Drawable[] drawableArr = suVar2.f31178b;
                int[] iArr3 = suVar2.f31182n;
                suVar2.f31181f = z4;
                suVar2.f31180e = replace;
                int i19 = 5;
                if (z4) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(suVar2.f31180e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            suVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            suVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        suVar2.D = z10;
                    }
                    suVar2.F = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = mz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                suVar2.invalidate();
                int i21 = i17 * 6;
                if (tuVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                tuVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f12 = 15.0f;
                if (tuVar.d) {
                    f10 = 11.66f;
                } else {
                    f10 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                if (tuVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                tuVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!tuVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (tuVar.d) {
                    f12 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f12);
                if (tuVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                uyVar.getLocationOnScreen(iArr);
                if (!tuVar.d) {
                    int i24 = suVar2.f31182n[0];
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
                if (uyVar.getTop() < 0) {
                    i15 = uyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f11 = 30.0f;
                } else {
                    f11 = 22.0f;
                }
                suVar2.setArrowX((AndroidUtilities.dp(f11) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                tuVar.setFocusable(true);
                tuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                mzVar.h.requestDisallowInterceptTouchEvent(true);
                kxVar.c1(true);
                kxVar.v1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
