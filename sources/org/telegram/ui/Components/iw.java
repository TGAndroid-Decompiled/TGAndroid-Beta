package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.MessagesController;
public final class iw implements li.l, ol0, ym0, le.d {
    public final int f27612a;
    public final nz f27613b;

    public iw(nz nzVar, int i10) {
        this.f27612a = i10;
        this.f27613b = nzVar;
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zy zyVar;
        switch (this.f27612a) {
            case 2:
                nz nzVar = this.f27613b;
                ty tyVar = nzVar.f29213i0;
                int i16 = nzVar.f29194c1;
                sy syVar = nzVar.f29227n0;
                vy vyVar = nzVar.f29219k0;
                if (i10 != nzVar.f29244s0 || !syVar.f30985x.isEmpty()) {
                    nzVar.f29210h0.C0();
                    nzVar.f29233p0.k(i10, 0);
                    if (i10 != nzVar.f29240r0 && i10 != nzVar.f29244s0) {
                        ArrayList<String> arrayList = MessagesController.getInstance(i16).gifSearchEmojies;
                        nzVar.f29216j0.H(arrayList.get(i10 - nzVar.f29247t0));
                        int i17 = i10 - nzVar.f29247t0;
                        if (i17 > 0) {
                            vyVar.a(arrayList.get(i17 - 1), true);
                        }
                        if (i10 - nzVar.f29247t0 < arrayList.size() - 1) {
                            vyVar.a(arrayList.get((i10 - nzVar.f29247t0) + 1), true);
                        }
                    } else {
                        nzVar.f29230o0.d.setText("");
                        if (i10 == nzVar.f29244s0 && (i12 = syVar.I) >= 1) {
                            tyVar.h1(i12, -AndroidUtilities.dp(4.0f));
                        } else {
                            oy oyVar = nzVar.f29248t1;
                            if (oyVar != null && oyVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            tyVar.h1(i11, 0);
                        }
                        if (i10 == nzVar.f29244s0) {
                            ArrayList<String> arrayList2 = MessagesController.getInstance(i16).gifSearchEmojies;
                            if (!arrayList2.isEmpty()) {
                                vyVar.a(arrayList2.get(0), true);
                            }
                        }
                    }
                    nzVar.D(2);
                    return;
                }
                return;
            default:
                nz nzVar2 = this.f27613b;
                zw zwVar = nzVar2.G0;
                ArrayList arrayList3 = nzVar2.f29197d1;
                ax axVar = nzVar2.B0;
                ez ezVar = nzVar2.f29265y0;
                vw vwVar = nzVar2.D0;
                if (!nzVar2.S0) {
                    if (i10 == nzVar2.H1) {
                        nzVar2.f29248t1.o(new d61(nzVar2.getContext(), new hx(nzVar2), nzVar2.f29262x1, nzVar2.f29266y1, nzVar2.f29269z1, null, nzVar2.Z1));
                        return;
                    }
                    if (zwVar != null && (zyVar = zwVar.f24775r) != null && zyVar.getSelectedCategory() != null) {
                        zwVar.c(null, false);
                        zyVar.G1(null);
                    }
                    if (i10 == nzVar2.F1) {
                        vwVar.C0();
                        nzVar2.F(ezVar.E("recent"), 0);
                        nzVar2.D(0);
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
                        nzVar2.F(ezVar.E("fav"), 0);
                        nzVar2.D(0);
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
                        nzVar2.F(ezVar.E("premium"), 0);
                        nzVar2.D(0);
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
                            nzVar2.F(ezVar.E(arrayList3.get(i21)), 0);
                            nzVar2.D(0);
                            nzVar2.p(0);
                            int i22 = nzVar2.G1;
                            if (i22 <= 0 && (i22 = nzVar2.F1) <= 0) {
                                i22 = nzVar2.E1;
                            }
                            axVar.k(i10, i22);
                            nzVar2.X1 = false;
                            nzVar2.X();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f27613b.P();
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
        nz nzVar = this.f27613b;
        int i16 = nzVar.C1;
        zx zxVar = nzVar.P;
        int[] iArr = nzVar.D1;
        bv bvVar = nzVar.B1;
        if (view instanceof wy) {
            wy wyVar = (wy) view;
            String str3 = null;
            s4.c1 c1Var = null;
            if (wyVar.f32743c) {
                View F = zxVar.F(view);
                if (F != null) {
                    c1Var = zxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= nzVar.getRecentEmoji().size()) {
                    nzVar.f29248t1.n();
                }
                zxVar.y1(view);
                return true;
            } else if (wyVar.getSpan() != null || (str = (String) wyVar.getTag()) == null) {
                return false;
            } else {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!wyVar.f32743c) {
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
                    av avVar = bvVar.f25105c;
                    int[] iArr2 = avVar.f24741n;
                    if (iArr2[0] != indexOf) {
                        iArr2[0] = indexOf;
                        avVar.invalidate();
                    }
                }
                bvVar.getClass();
                av avVar2 = bvVar.f25105c;
                int i17 = bvVar.f25106e;
                if (CompoundEmoji.getCompoundEmojiDrawable(replace) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bvVar.d = z10;
                int i18 = 3;
                Drawable[] drawableArr = avVar2.f24737b;
                int[] iArr3 = avVar2.f24741n;
                avVar2.f24740f = z10;
                avVar2.f24739e = replace;
                int i19 = 5;
                if (z10) {
                    drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(replace, -1, -1);
                    drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, 0, -2);
                    drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, 1, -2);
                    drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, 2, -2);
                    drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, 3, -2);
                    drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, 4, -2);
                    drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, -2, 0);
                    drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, -2, 1);
                    drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, -2, 2);
                    drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, -2, 3);
                    drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(avVar2.f24739e, -2, 4);
                    Pair<Integer, Integer> isHandshake = CompoundEmoji.isHandshake(replace);
                    if (isHandshake != null) {
                        int intValue = ((Integer) isHandshake.first).intValue();
                        if (iArr3[0] != intValue) {
                            iArr3[0] = intValue;
                            avVar2.invalidate();
                        }
                        int intValue2 = ((Integer) isHandshake.second).intValue();
                        if (iArr3[1] != intValue2) {
                            iArr3[1] = intValue2;
                            avVar2.invalidate();
                        }
                        if (iArr3[0] == iArr3[1]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        avVar2.G = z11;
                    }
                    avVar2.I = true;
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
                avVar2.invalidate();
                int i21 = i17 * 6;
                if (bvVar.d) {
                    i11 = 3;
                } else {
                    i11 = 0;
                }
                bvVar.setWidth(AndroidUtilities.dp(i11 + 30) + i21);
                float f11 = 15.0f;
                if (bvVar.d) {
                    f7 = 11.66f;
                } else {
                    f7 = 15.0f;
                }
                int dp = AndroidUtilities.dp(f7);
                if (bvVar.d) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                bvVar.setHeight((i12 * i17) + dp);
                int i22 = i17 * 6;
                if (!bvVar.d) {
                    i18 = 0;
                }
                int dp2 = AndroidUtilities.dp(i18 + 30) + i22;
                if (bvVar.d) {
                    f11 = 11.66f;
                }
                int dp3 = AndroidUtilities.dp(f11);
                if (bvVar.d) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                int i23 = (i13 * i17) + dp3;
                wyVar.getLocationOnScreen(iArr);
                if (!bvVar.d) {
                    int i24 = avVar2.f24741n[0];
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
                avVar2.setArrowX((AndroidUtilities.dp(f10) - i27) + ((int) AndroidUtilities.dpf2(0.5f)));
                bvVar.setFocusable(true);
                bvVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                nzVar.h.requestDisallowInterceptTouchEvent(true);
                zxVar.d1(true);
                zxVar.y1(view);
                return true;
            }
        }
        return false;
    }

    @Override
    public void k(int i10) {
        nz nzVar = this.f27613b;
        ah.i iVar = nzVar.f29218j2;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                iVar.h(nzVar.f29225m2.e());
            }
            iVar.e(nzVar.f29221k2, nzVar.getWidth(), nzVar.getHeight());
        }
    }

    @Override
    public void V(float f7, int i10) {
    }
}
