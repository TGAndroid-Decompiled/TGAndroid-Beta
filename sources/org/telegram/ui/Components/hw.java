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
public final class hw implements li.c, pl0, vm0, le.e {
    public final int f24946a;
    public final nz f24947b;

    public hw(nz nzVar, int i10) {
        this.f24946a = i10;
        this.f24947b = nzVar;
    }

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f24947b.R();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zy zyVar;
        switch (this.f24946a) {
            case 2:
                nz nzVar = this.f24947b;
                ty tyVar = nzVar.f26836i0;
                int i16 = nzVar.f26818c1;
                sy syVar = nzVar.f26850n0;
                vy vyVar = nzVar.f26842k0;
                if (i10 != nzVar.f26867s0 || !syVar.f28368x.isEmpty()) {
                    nzVar.f26833h0.C0();
                    nzVar.f26856p0.k(i10, 0);
                    if (i10 != nzVar.f26863r0 && i10 != nzVar.f26867s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        nzVar.f26839j0.H(arrayList.get(i10 - nzVar.f26870t0));
                        int i17 = i10 - nzVar.f26870t0;
                        if (i17 > 0) {
                            vyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - nzVar.f26870t0 < arrayList.size() - 1) {
                            vyVar.a(arrayList.get((i10 - nzVar.f26870t0) + 1), true);
                        }
                    } else {
                        nzVar.f26853o0.d.setText("");
                        if (i10 == nzVar.f26867s0 && (i12 = syVar.I) >= 1) {
                            tyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            oy oyVar = nzVar.f26871t1;
                            if (oyVar != null && oyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            tyVar.h1(i11, 0);
                        }
                        if (i10 == nzVar.f26867s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                vyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    nzVar.F(2);
                    return;
                }
                return;
            default:
                nz nzVar2 = this.f24947b;
                zw zwVar = nzVar2.G0;
                ArrayList arrayList3 = nzVar2.f26821d1;
                ax axVar = nzVar2.B0;
                ez ezVar = nzVar2.f26888y0;
                vw vwVar = nzVar2.D0;
                if (!nzVar2.S0) {
                    if (i10 == nzVar2.H1) {
                        nzVar2.f26871t1.o(new u51(nzVar2.getContext(), new ix(nzVar2), nzVar2.f26885x1, nzVar2.f26889y1, nzVar2.f26892z1, null, nzVar2.Z1));
                        return;
                    }
                    if (zwVar != null && (zyVar = zwVar.f22739r) != null && zyVar.getSelectedCategory() != null) {
                        zwVar.c(null, false);
                        zyVar.H1(null);
                    }
                    if (i10 == nzVar2.F1) {
                        vwVar.C0();
                        nzVar2.H(ezVar.E("recent"), 0);
                        nzVar2.F(0);
                        int i18 = nzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = nzVar2.E1;
                        }
                        axVar.k(i18, i15);
                        return;
                    } else if (i10 == nzVar2.G1) {
                        vwVar.C0();
                        nzVar2.H(ezVar.E("fav"), 0);
                        nzVar2.F(0);
                        int i19 = nzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = nzVar2.E1;
                        }
                        axVar.k(i19, i14);
                        return;
                    } else if (i10 == nzVar2.I1) {
                        vwVar.C0();
                        nzVar2.H(ezVar.E("premium"), 0);
                        nzVar2.F(0);
                        int i20 = nzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = nzVar2.E1;
                        }
                        axVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - nzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            nzVar2.I0 = false;
                            vwVar.C0();
                            nzVar2.H(ezVar.E(arrayList3.get(i21)), 0);
                            nzVar2.F(0);
                            nzVar2.p(0);
                            int i22 = nzVar2.G1;
                            if (i22 <= 0 && (i22 = nzVar2.F1) <= 0) {
                                i22 = nzVar2.E1;
                            }
                            axVar.k(i10, i22);
                            nzVar2.X1 = false;
                            nzVar2.Y();
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
        nz nzVar = this.f24947b;
        ah.h hVar = nzVar.f26841j2;
        RectF rectF = nzVar.f26890y2;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
            hh.k.c(nzVar.f26879w, nzVar, rectF);
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
            rectF.right = nzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, nzVar.getMeasuredHeight());
            hVar.g(!rectF.isEmpty(), nzVar.f26893z2);
            hVar.e(nzVar.f26844k2, nzVar.getWidth(), nzVar.getHeight());
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
        nz nzVar = this.f24947b;
        int i16 = nzVar.C1;
        zx zxVar = nzVar.P;
        int[] iArr = nzVar.D1;
        av avVar = nzVar.B1;
        if (view instanceof wy) {
            wy wyVar = (wy) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (wyVar.f30088c) {
                View F = zxVar.F(view);
                if (F != null) {
                    c1Var = zxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= nzVar.getRecentEmoji().size()) {
                    nzVar.f26871t1.n();
                }
                zxVar.z1(view);
                return true;
            } else if (wyVar.getSpan() != null || (str = (String) wyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!wyVar.f30088c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                nzVar.R1 = wyVar;
                nzVar.U1 = nzVar.S1;
                nzVar.V1 = nzVar.T1;
                if (isCompound) {
                    replace = nz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    zu zuVar = avVar.f22720c;
                    int[] iArr2 = zuVar.f31067n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        zuVar.invalidate();
                    }
                }
                avVar.getClass();
                zu zuVar2 = avVar.f22720c;
                int i17 = avVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                avVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = zuVar2.f31064b;
                int[] iArr3 = zuVar2.f31067n;
                zuVar2.f31066f = z10;
                zuVar2.e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(zuVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            zuVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            zuVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zuVar2.G = z11;
                    }
                    zuVar2.I = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = nz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                zuVar2.invalidate();
                int i21 = i17 * 6;
                if (avVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                avVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (avVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (avVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                avVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!avVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (avVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (avVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                wyVar.getLocationOnScreen(iArr);
                if (!avVar.d) {
                    int i24 = zuVar2.f31067n[0];
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
                if (wyVar.getTop() < 0) {
                    i15 = wyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                zuVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                avVar.setFocusable(true);
                avVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                nzVar.h.requestDisallowInterceptTouchEvent(true);
                zxVar.e1(true);
                zxVar.z1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
