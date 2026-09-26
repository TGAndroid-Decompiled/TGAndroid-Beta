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
public final class gw implements li.c, nl0, tm0, le.e {
    public final int f24593a;
    public final mz f24594b;

    public gw(mz mzVar, int i10) {
        this.f24593a = i10;
        this.f24594b = mzVar;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f24594b.R();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        yy yyVar;
        switch (this.f24593a) {
            case 2:
                mz mzVar = this.f24594b;
                sy syVar = mzVar.f26566i0;
                int i16 = mzVar.f26548c1;
                ry ryVar = mzVar.f26580n0;
                uy uyVar = mzVar.f26572k0;
                if (i10 != mzVar.f26597s0 || !ryVar.f28086x.isEmpty()) {
                    mzVar.f26563h0.B0();
                    mzVar.f26586p0.k(i10, 0);
                    if (i10 != mzVar.f26593r0 && i10 != mzVar.f26597s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        mzVar.f26569j0.H(arrayList.get(i10 - mzVar.f26600t0));
                        int i17 = i10 - mzVar.f26600t0;
                        if (i17 > 0) {
                            uyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - mzVar.f26600t0 < arrayList.size() - 1) {
                            uyVar.a(arrayList.get((i10 - mzVar.f26600t0) + 1), true);
                        }
                    } else {
                        mzVar.f26583o0.d.setText("");
                        if (i10 == mzVar.f26597s0 && (i12 = ryVar.I) >= 1) {
                            syVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            ny nyVar = mzVar.f26601t1;
                            if (nyVar != null && nyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            syVar.h1(i11, 0);
                        }
                        if (i10 == mzVar.f26597s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                uyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    mzVar.F(2);
                    return;
                }
                return;
            default:
                mz mzVar2 = this.f24594b;
                yw ywVar = mzVar2.G0;
                ArrayList arrayList3 = mzVar2.f26551d1;
                zw zwVar = mzVar2.B0;
                dz dzVar = mzVar2.f26618y0;
                uw uwVar = mzVar2.D0;
                if (!mzVar2.S0) {
                    if (i10 == mzVar2.H1) {
                        mzVar2.f26601t1.o(new s51(mzVar2.getContext(), new hx(mzVar2), mzVar2.f26615x1, mzVar2.f26619y1, mzVar2.f26622z1, null, mzVar2.Z1));
                        return;
                    }
                    if (ywVar != null && (yyVar = ywVar.f31004r) != null && yyVar.getSelectedCategory() != null) {
                        ywVar.c(null, false);
                        yyVar.F1(null);
                    }
                    if (i10 == mzVar2.F1) {
                        uwVar.B0();
                        mzVar2.H(dzVar.E("recent"), 0);
                        mzVar2.F(0);
                        int i18 = mzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = mzVar2.E1;
                        }
                        zwVar.k(i18, i15);
                        return;
                    } else if (i10 == mzVar2.G1) {
                        uwVar.B0();
                        mzVar2.H(dzVar.E("fav"), 0);
                        mzVar2.F(0);
                        int i19 = mzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = mzVar2.E1;
                        }
                        zwVar.k(i19, i14);
                        return;
                    } else if (i10 == mzVar2.I1) {
                        uwVar.B0();
                        mzVar2.H(dzVar.E("premium"), 0);
                        mzVar2.F(0);
                        int i20 = mzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = mzVar2.E1;
                        }
                        zwVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - mzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            mzVar2.I0 = false;
                            uwVar.B0();
                            mzVar2.H(dzVar.E(arrayList3.get(i21)), 0);
                            mzVar2.F(0);
                            mzVar2.p(0);
                            int i22 = mzVar2.G1;
                            if (i22 <= 0 && (i22 = mzVar2.F1) <= 0) {
                                i22 = mzVar2.E1;
                            }
                            zwVar.k(i10, i22);
                            mzVar2.X1 = false;
                            mzVar2.Y();
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
        mz mzVar = this.f24594b;
        ah.h hVar = mzVar.f26571j2;
        RectF rectF = mzVar.f26620y2;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hh.k.c(mzVar.f26609w, mzVar, rectF);
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
            rectF.right = mzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, mzVar.getMeasuredHeight());
            hVar.g(!rectF.isEmpty(), mzVar.f26623z2);
            hVar.e(mzVar.f26574k2, mzVar.getWidth(), mzVar.getHeight());
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
        mz mzVar = this.f24594b;
        int i16 = mzVar.C1;
        yx yxVar = mzVar.P;
        int[] iArr = mzVar.D1;
        zu zuVar = mzVar.B1;
        if (view instanceof vy) {
            vy vyVar = (vy) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (vyVar.f29789c) {
                View F = yxVar.F(view);
                if (F != null) {
                    c1Var = yxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= mzVar.getRecentEmoji().size()) {
                    mzVar.f26601t1.n();
                }
                yxVar.x1(view);
                return true;
            } else if (vyVar.getSpan() != null || (str = (String) vyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!vyVar.f29789c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                mzVar.R1 = vyVar;
                mzVar.U1 = mzVar.S1;
                mzVar.V1 = mzVar.T1;
                if (isCompound) {
                    replace = mz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    yu yuVar = zuVar.f30968c;
                    int[] iArr2 = yuVar.f30708n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        yuVar.invalidate();
                    }
                }
                zuVar.getClass();
                yu yuVar2 = zuVar.f30968c;
                int i17 = zuVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zuVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = yuVar2.f30705b;
                int[] iArr3 = yuVar2.f30708n;
                yuVar2.f30707f = z10;
                yuVar2.e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(yuVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            yuVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            yuVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        yuVar2.G = z11;
                    }
                    yuVar2.I = true;
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
                yuVar2.invalidate();
                int i21 = i17 * 6;
                if (zuVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                zuVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (zuVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (zuVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                zuVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!zuVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (zuVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (zuVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                vyVar.getLocationOnScreen(iArr);
                if (!zuVar.d) {
                    int i24 = yuVar2.f30708n[0];
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
                    i14 = org.telegram.messenger.ok.D(5.0f, iArr[0] - i14, i14);
                } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i27 = -i14;
                if (vyVar.getTop() < 0) {
                    i15 = vyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                yuVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                zuVar.setFocusable(true);
                zuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                mzVar.h.requestDisallowInterceptTouchEvent(true);
                yxVar.d1(true);
                yxVar.x1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
