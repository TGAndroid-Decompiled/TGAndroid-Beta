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
public final class fw implements li.f, ll0, sm0, le.d {
    public final int f24194a;
    public final kz f24195b;

    public fw(kz kzVar, int i10) {
        this.f24194a = i10;
        this.f24195b = kzVar;
    }

    @Override
    public void D(int i10, float f7, float f10, le.e eVar) {
        this.f24195b.R();
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        wy wyVar;
        switch (this.f24194a) {
            case 2:
                kz kzVar = this.f24195b;
                qy qyVar = kzVar.f25916i0;
                int i16 = kzVar.f25898c1;
                py pyVar = kzVar.f25930n0;
                sy syVar = kzVar.f25922k0;
                if (i10 != kzVar.f25947s0 || !pyVar.f27465x.isEmpty()) {
                    kzVar.f25913h0.C0();
                    kzVar.f25936p0.k(i10, 0);
                    if (i10 != kzVar.f25943r0 && i10 != kzVar.f25947s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        kzVar.f25919j0.H(arrayList.get(i10 - kzVar.f25950t0));
                        int i17 = i10 - kzVar.f25950t0;
                        if (i17 > 0) {
                            syVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - kzVar.f25950t0 < arrayList.size() - 1) {
                            syVar.a(arrayList.get((i10 - kzVar.f25950t0) + 1), true);
                        }
                    } else {
                        kzVar.f25933o0.d.setText("");
                        if (i10 == kzVar.f25947s0 && (i12 = pyVar.I) >= 1) {
                            qyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            ly lyVar = kzVar.f25951t1;
                            if (lyVar != null && lyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            qyVar.h1(i11, 0);
                        }
                        if (i10 == kzVar.f25947s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                syVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    kzVar.F(2);
                    return;
                }
                return;
            default:
                kz kzVar2 = this.f24195b;
                ww wwVar = kzVar2.G0;
                ArrayList arrayList3 = kzVar2.f25901d1;
                xw xwVar = kzVar2.B0;
                bz bzVar = kzVar2.f25968y0;
                tw twVar = kzVar2.D0;
                if (!kzVar2.S0) {
                    if (i10 == kzVar2.H1) {
                        kzVar2.f25951t1.o(new s51(kzVar2.getContext(), new fx(kzVar2), kzVar2.f25965x1, kzVar2.f25969y1, kzVar2.f25972z1, null, kzVar2.Z1));
                        return;
                    }
                    if (wwVar != null && (wyVar = wwVar.f30383r) != null && wyVar.getSelectedCategory() != null) {
                        wwVar.c(null, false);
                        wyVar.G1(null);
                    }
                    if (i10 == kzVar2.F1) {
                        twVar.C0();
                        kzVar2.H(bzVar.E("recent"), 0);
                        kzVar2.F(0);
                        int i18 = kzVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = kzVar2.E1;
                        }
                        xwVar.k(i18, i15);
                        return;
                    } else if (i10 == kzVar2.G1) {
                        twVar.C0();
                        kzVar2.H(bzVar.E("fav"), 0);
                        kzVar2.F(0);
                        int i19 = kzVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = kzVar2.E1;
                        }
                        xwVar.k(i19, i14);
                        return;
                    } else if (i10 == kzVar2.I1) {
                        twVar.C0();
                        kzVar2.H(bzVar.E("premium"), 0);
                        kzVar2.F(0);
                        int i20 = kzVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = kzVar2.E1;
                        }
                        xwVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - kzVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            kzVar2.I0 = false;
                            twVar.C0();
                            kzVar2.H(bzVar.E(arrayList3.get(i21)), 0);
                            kzVar2.F(0);
                            kzVar2.p(0);
                            int i22 = kzVar2.G1;
                            if (i22 <= 0 && (i22 = kzVar2.F1) <= 0) {
                                i22 = kzVar2.E1;
                            }
                            xwVar.k(i10, i22);
                            kzVar2.X1 = false;
                            kzVar2.Y();
                            return;
                        }
                        return;
                    }
                }
                return;
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
        kz kzVar = this.f24195b;
        int i16 = kzVar.C1;
        wx wxVar = kzVar.P;
        int[] iArr = kzVar.D1;
        xu xuVar = kzVar.B1;
        if (view instanceof ty) {
            ty tyVar = (ty) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (tyVar.f28477c) {
                View G = wxVar.G(view);
                if (G != null) {
                    c1Var = wxVar.U(G);
                }
                if (c1Var != null && c1Var.b() <= kzVar.getRecentEmoji().size()) {
                    kzVar.f25951t1.n();
                }
                wxVar.y1(view);
                return true;
            } else if (tyVar.getSpan() != null || (str = (String) tyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!tyVar.f28477c) {
                    str3 = Emoji.emojiColor.get(replace);
                }
                boolean isCompound = CompoundEmoji.isCompound(replace);
                if (!isCompound && !EmojiData.emojiColoredMap.contains(replace)) {
                    return false;
                }
                kzVar.R1 = tyVar;
                kzVar.U1 = kzVar.S1;
                kzVar.V1 = kzVar.T1;
                if (isCompound) {
                    replace = kz.g(replace, str3);
                } else {
                    int indexOf = CompoundEmoji.skinTones.indexOf(str3) + 1;
                    wu wuVar = xuVar.f30367c;
                    int[] iArr2 = wuVar.f30095n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        wuVar.invalidate();
                    }
                }
                xuVar.getClass();
                wu wuVar2 = xuVar.f30367c;
                int i17 = xuVar.e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xuVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = wuVar2.f30092b;
                int[] iArr3 = wuVar2.f30095n;
                wuVar2.f30094f = z10;
                wuVar2.e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(wuVar2.e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            wuVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            wuVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        wuVar2.G = z11;
                    }
                    wuVar2.I = true;
                } else {
                    for (int i20 = 0; i20 < 6; i20++) {
                        if (i20 != 0) {
                            str2 = kz.g(replace, CompoundEmoji.skinTones.get(i20 - 1));
                        } else {
                            str2 = replace;
                        }
                        drawableArr[i20] = Emoji.getEmojiBigDrawable(str2);
                    }
                }
                wuVar2.invalidate();
                int i21 = i17 * 6;
                if (xuVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                xuVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (xuVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (xuVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                xuVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!xuVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (xuVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (xuVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                tyVar.getLocationOnScreen(iArr);
                if (!xuVar.d) {
                    int i24 = wuVar2.f30095n[0];
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
                    i14 = org.telegram.messenger.rk.D(5.0f, iArr[0] - i14, i14);
                } else if ((iArr[0] - i14) + dp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    i14 += ((iArr[0] - i14) + dp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i27 = -i14;
                if (tyVar.getTop() < 0) {
                    i15 = tyVar.getTop();
                } else {
                    i15 = 0;
                }
                if (AndroidUtilities.isTablet()) {
                    f10 = 30.0f;
                } else {
                    f10 = 22.0f;
                }
                wuVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                xuVar.setFocusable(true);
                xuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                kzVar.h.requestDisallowInterceptTouchEvent(true);
                wxVar.e1(true);
                wxVar.y1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void g(int i10) {
        float f7;
        kz kzVar = this.f24195b;
        ah.i iVar = kzVar.f25921j2;
        RectF rectF = kzVar.f25970y2;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            hh.k.c(kzVar.f25959w, kzVar, rectF);
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
            rectF.right = kzVar.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.bottom, kzVar.getMeasuredHeight());
            iVar.g(!rectF.isEmpty(), kzVar.f25973z2);
            iVar.e(kzVar.f25924k2, kzVar.getWidth(), kzVar.getHeight());
        }
    }

    @Override
    public void C(float f7, int i10) {
    }
}
