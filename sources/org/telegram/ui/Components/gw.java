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
public final class gw implements li.c, ml0, sm0, le.e {
    public final int f24534a;
    public final lz f24535b;

    public gw(lz lzVar, int i10) {
        this.f24534a = i10;
        this.f24535b = lzVar;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f24535b.R();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        xy xyVar;
        switch (this.f24534a) {
            case 2:
                lz lzVar = this.f24535b;
                ry ryVar = lzVar.f26247i0;
                int i16 = lzVar.f26229c1;
                qy qyVar = lzVar.f26261n0;
                ty tyVar = lzVar.f26253k0;
                if (i10 != lzVar.f26278s0 || !qyVar.f27782x.isEmpty()) {
                    lzVar.f26244h0.B0();
                    lzVar.f26267p0.k(i10, 0);
                    if (i10 != lzVar.f26274r0 && i10 != lzVar.f26278s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        lzVar.f26250j0.H(arrayList.get(i10 - lzVar.f26281t0));
                        int i17 = i10 - lzVar.f26281t0;
                        if (i17 > 0) {
                            tyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - lzVar.f26281t0 < arrayList.size() - 1) {
                            tyVar.a(arrayList.get((i10 - lzVar.f26281t0) + 1), true);
                        }
                    } else {
                        lzVar.f26264o0.d.setText("");
                        if (i10 == lzVar.f26278s0 && (i12 = qyVar.I) >= 1) {
                            ryVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            my myVar = lzVar.f26282t1;
                            if (myVar != null && myVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            ryVar.h1(i11, 0);
                        }
                        if (i10 == lzVar.f26278s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                tyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    lzVar.F(2);
                    return;
                }
                return;
            default:
                lz lzVar2 = this.f24535b;
                xw xwVar = lzVar2.G0;
                ArrayList arrayList3 = lzVar2.f26232d1;
                yw ywVar = lzVar2.B0;
                cz czVar = lzVar2.f26299y0;
                uw uwVar = lzVar2.D0;
                if (!lzVar2.S0) {
                    if (i10 == lzVar2.H1) {
                        lzVar2.f26282t1.o(new r51(lzVar2.getContext(), new gx(lzVar2), lzVar2.f26296x1, lzVar2.f26300y1, lzVar2.f26303z1, null, lzVar2.Z1));
                        return;
                    }
                    if (xwVar != null && (xyVar = xwVar.f30717r) != null && xyVar.getSelectedCategory() != null) {
                        xwVar.c(null, false);
                        xyVar.F1(null);
                    }
                    if (i10 == lzVar2.F1) {
                        uwVar.B0();
                        lzVar2.H(czVar.E("recent"), 0);
                        lzVar2.F(0);
                        int i18 = lzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = lzVar2.E1;
                        }
                        ywVar.k(i18, i15);
                        return;
                    } else if (i10 == lzVar2.G1) {
                        uwVar.B0();
                        lzVar2.H(czVar.E("fav"), 0);
                        lzVar2.F(0);
                        int i19 = lzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = lzVar2.E1;
                        }
                        ywVar.k(i19, i14);
                        return;
                    } else if (i10 == lzVar2.I1) {
                        uwVar.B0();
                        lzVar2.H(czVar.E("premium"), 0);
                        lzVar2.F(0);
                        int i20 = lzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = lzVar2.E1;
                        }
                        ywVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - lzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            lzVar2.I0 = false;
                            uwVar.B0();
                            lzVar2.H(czVar.E(arrayList3.get(i21)), 0);
                            lzVar2.F(0);
                            lzVar2.p(0);
                            int i22 = lzVar2.G1;
                            if (i22 <= 0 && (i22 = lzVar2.F1) <= 0) {
                                i22 = lzVar2.E1;
                            }
                            ywVar.k(i10, i22);
                            lzVar2.X1 = false;
                            lzVar2.Y();
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
        lz lzVar = this.f24535b;
        ah.h hVar = lzVar.f26252j2;
        RectF rectF = lzVar.f26301y2;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hh.k.c(lzVar.f26290w, lzVar, rectF);
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
            rectF.right = lzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, lzVar.getMeasuredHeight());
            hVar.g(!rectF.isEmpty(), lzVar.f26304z2);
            hVar.e(lzVar.f26255k2, lzVar.getWidth(), lzVar.getHeight());
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
        lz lzVar = this.f24535b;
        int i16 = lzVar.C1;
        xx xxVar = lzVar.P;
        int[] iArr = lzVar.D1;
        yu yuVar = lzVar.B1;
        if (view instanceof uy) {
            uy uyVar = (uy) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (uyVar.f28941c) {
                View F = xxVar.F(view);
                if (F != null) {
                    c1Var = xxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= lzVar.getRecentEmoji().size()) {
                    lzVar.f26282t1.n();
                }
                xxVar.x1(view);
                return true;
            } else if (uyVar.getSpan() != null || (str = (String) uyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!uyVar.f28941c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                lzVar.R1 = uyVar;
                lzVar.U1 = lzVar.S1;
                lzVar.V1 = lzVar.T1;
                if (isCompound) {
                    replace = lz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    xu xuVar = yuVar.f30681c;
                    int[] iArr2 = xuVar.f30399n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        xuVar.invalidate();
                    }
                }
                yuVar.getClass();
                xu xuVar2 = yuVar.f30681c;
                int i17 = yuVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yuVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = xuVar2.f30396b;
                int[] iArr3 = xuVar2.f30399n;
                xuVar2.f30398f = z10;
                xuVar2.e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(xuVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            xuVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            xuVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        xuVar2.G = z11;
                    }
                    xuVar2.I = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = lz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                xuVar2.invalidate();
                int i21 = i17 * 6;
                if (yuVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                yuVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (yuVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (yuVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                yuVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!yuVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (yuVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (yuVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                uyVar.getLocationOnScreen(iArr);
                if (!yuVar.d) {
                    int i24 = xuVar2.f30399n[0];
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
                if (uyVar.getTop() < 0) {
                    i15 = uyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                xuVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                yuVar.setFocusable(true);
                yuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                lzVar.h.requestDisallowInterceptTouchEvent(true);
                xxVar.d1(true);
                xxVar.x1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
