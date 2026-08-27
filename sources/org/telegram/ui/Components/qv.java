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

public final class qv implements rk0, ud.b, tl0, qg.h {

    public final int f31982a;

    public final yy f31983b;

    public qv(yy yyVar, int i10) {
        this.f31982a = i10;
        this.f31983b = yyVar;
    }

    @Override
    public boolean a(int i10, View view) {
        String str;
        int iDp;
        yy yyVar = this.f31983b;
        int i11 = yyVar.f35057y1;
        ww wwVar = yyVar.L;
        int[] iArr = yyVar.f35060z1;
        hu huVar = yyVar.f35053x1;
        if (!(view instanceof gy)) {
            return false;
        }
        gy gyVar = (gy) view;
        if (gyVar.f28868c) {
            View viewF = wwVar.F(view);
            f2.o1 o1VarT = viewF != null ? wwVar.T(viewF) : null;
            if (o1VarT != null && o1VarT.b() <= yyVar.getRecentEmoji().size()) {
                yyVar.f35025p1.n();
            }
            wwVar.w1(view);
            return true;
        }
        if (gyVar.getSpan() != null || (str = (String) gyVar.getTag()) == null) {
            return false;
        }
        String strReplace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
        String str2 = gyVar.f28868c ? null : Emoji.emojiColor.get(strReplace);
        boolean zIsCompound = CompoundEmoji.isCompound(strReplace);
        if (!zIsCompound && !EmojiData.emojiColoredMap.contains(strReplace)) {
            return false;
        }
        yyVar.N1 = gyVar;
        yyVar.Q1 = yyVar.O1;
        yyVar.R1 = yyVar.P1;
        if (zIsCompound) {
            strReplace = yy.g(strReplace, str2);
        } else {
            int iIndexOf = CompoundEmoji.skinTones.indexOf(str2) + 1;
            gu guVar = huVar.f29103c;
            int[] iArr2 = guVar.f28819n;
            if (iArr2[0] != iIndexOf) {
                iArr2[0] = iIndexOf;
                guVar.invalidate();
            }
        }
        huVar.getClass();
        gu guVar2 = huVar.f29103c;
        int i12 = huVar.f29104e;
        boolean z10 = CompoundEmoji.getCompoundEmojiDrawable(strReplace) != null;
        huVar.d = z10;
        Drawable[] drawableArr = guVar2.f28815b;
        int[] iArr3 = guVar2.f28819n;
        guVar2.f28818f = z10;
        guVar2.f28817e = strReplace;
        if (z10) {
            drawableArr[0] = CompoundEmoji.getCompoundEmojiDrawable(strReplace, -1, -1);
            drawableArr[1] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, 0, -2);
            drawableArr[2] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, 1, -2);
            drawableArr[3] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, 2, -2);
            drawableArr[4] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, 3, -2);
            drawableArr[5] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, 4, -2);
            drawableArr[6] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, -2, 0);
            drawableArr[7] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, -2, 1);
            drawableArr[8] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, -2, 2);
            drawableArr[9] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, -2, 3);
            drawableArr[10] = CompoundEmoji.getCompoundEmojiDrawable(guVar2.f28817e, -2, 4);
            Pair<Integer, Integer> pairIsHandshake = CompoundEmoji.isHandshake(strReplace);
            if (pairIsHandshake != null) {
                int iIntValue = ((Integer) pairIsHandshake.first).intValue();
                if (iArr3[0] != iIntValue) {
                    iArr3[0] = iIntValue;
                    guVar2.invalidate();
                }
                int iIntValue2 = ((Integer) pairIsHandshake.second).intValue();
                if (iArr3[1] != iIntValue2) {
                    iArr3[1] = iIntValue2;
                    guVar2.invalidate();
                }
                guVar2.C = iArr3[0] == iArr3[1];
            }
            guVar2.E = true;
        } else {
            int i13 = 0;
            while (i13 < 6) {
                drawableArr[i13] = Emoji.getEmojiBigDrawable(i13 != 0 ? yy.g(strReplace, CompoundEmoji.skinTones.get(i13 - 1)) : strReplace);
                i13++;
            }
        }
        guVar2.invalidate();
        huVar.setWidth(AndroidUtilities.dp((huVar.d ? 3 : 0) + 30) + (i12 * 6));
        huVar.setHeight(((huVar.d ? 2 : 1) * i12) + AndroidUtilities.dp(huVar.d ? 11.66f : 15.0f));
        int iDp2 = AndroidUtilities.dp((huVar.d ? 3 : 0) + 30) + (i12 * 6);
        int iDp3 = ((huVar.d ? 2 : 1) * i12) + AndroidUtilities.dp(huVar.d ? 11.66f : 15.0f);
        gyVar.getLocationOnScreen(iArr);
        if (huVar.d) {
            iDp = 0;
        } else {
            int i14 = guVar2.f28819n[0];
            iDp = AndroidUtilities.dp((i14 * 4) - (AndroidUtilities.isTablet() ? 5 : 1)) + (i14 * i11);
        }
        if (iArr[0] - iDp < AndroidUtilities.dp(5.0f)) {
            iDp = org.telegram.messenger.rl.C(5.0f, iArr[0] - iDp, iDp);
        } else if ((iArr[0] - iDp) + iDp2 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
            iDp += ((iArr[0] - iDp) + iDp2) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
        }
        int i15 = -iDp;
        int top = gyVar.getTop() < 0 ? gyVar.getTop() : 0;
        guVar2.setArrowX((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i15) + ((int) AndroidUtilities.dpf2(0.5f)));
        huVar.setFocusable(true);
        huVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - iDp3)) - top);
        yyVar.h.requestDisallowInterceptTouchEvent(true);
        wwVar.d1(true);
        wwVar.w1(view);
        return true;
    }

    @Override
    public void b(int i10) {
        int i11;
        jy jyVar;
        switch (this.f31982a) {
            case 2:
                yy yyVar = this.f31983b;
                dy dyVar = yyVar.f34991e0;
                int i12 = yyVar.Y0;
                cy cyVar = yyVar.f35007j0;
                fy fyVar = yyVar.f34998g0;
                if (i10 != yyVar.f35021o0 || !cyVar.f27569x.isEmpty()) {
                    yyVar.f34987d0.B0();
                    yyVar.f35013l0.k(i10, 0);
                    if (i10 == yyVar.f35018n0 || i10 == yyVar.f35021o0) {
                        yyVar.f35010k0.d.setText("");
                        if (i10 != yyVar.f35021o0 || (i11 = cyVar.E) < 1) {
                            xx xxVar = yyVar.f35025p1;
                            dyVar.h1((xxVar == null || !xxVar.A()) ? 1 : 0, 0);
                        } else {
                            dyVar.h1(i11, -AndroidUtilities.dp(4.0f));
                        }
                        if (i10 == yyVar.f35021o0) {
                            ArrayList<String> arrayList = MessagesController.getInstance(i12).gifSearchEmojies;
                            if (!arrayList.isEmpty()) {
                                fyVar.a(arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList<String> arrayList2 = MessagesController.getInstance(i12).gifSearchEmojies;
                        yyVar.f34995f0.H(arrayList2.get(i10 - yyVar.f35024p0));
                        int i13 = i10 - yyVar.f35024p0;
                        if (i13 > 0) {
                            fyVar.a(arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - yyVar.f35024p0 < arrayList2.size() - 1) {
                            fyVar.a(arrayList2.get((i10 - yyVar.f35024p0) + 1), true);
                        }
                    }
                    yyVar.H(2);
                }
                break;
            default:
                yy yyVar2 = this.f31983b;
                hw hwVar = yyVar2.C0;
                ArrayList arrayList3 = yyVar2.Z0;
                iw iwVar = yyVar2.f35052x0;
                py pyVar = yyVar2.f35041u0;
                ew ewVar = yyVar2.f35059z0;
                if (!yyVar2.O0) {
                    if (i10 == yyVar2.D1) {
                        yyVar2.f35025p1.o(new j41(yyVar2.getContext(), new rw(yyVar2), yyVar2.f35039t1, yyVar2.f35042u1, yyVar2.f35045v1, null, yyVar2.V1));
                        break;
                    } else {
                        if (hwVar != null && (jyVar = hwVar.f30218r) != null && jyVar.getSelectedCategory() != null) {
                            hwVar.c(null, false);
                            jyVar.F1(null);
                        }
                        if (i10 == yyVar2.B1) {
                            ewVar.B0();
                            yyVar2.J(pyVar.E("recent"), 0);
                            yyVar2.H(0);
                            int i14 = yyVar2.B1;
                            iwVar.k(i14, i14 > 0 ? i14 : yyVar2.A1);
                            break;
                        } else if (i10 == yyVar2.C1) {
                            ewVar.B0();
                            yyVar2.J(pyVar.E("fav"), 0);
                            yyVar2.H(0);
                            int i15 = yyVar2.C1;
                            iwVar.k(i15, i15 > 0 ? i15 : yyVar2.A1);
                            break;
                        } else if (i10 == yyVar2.E1) {
                            ewVar.B0();
                            yyVar2.J(pyVar.E("premium"), 0);
                            yyVar2.H(0);
                            int i16 = yyVar2.E1;
                            iwVar.k(i16, i16 > 0 ? i16 : yyVar2.A1);
                            break;
                        } else {
                            int size = i10 - yyVar2.A1;
                            if (size < arrayList3.size()) {
                                if (size >= arrayList3.size()) {
                                    size = arrayList3.size() - 1;
                                }
                                yyVar2.E0 = false;
                                ewVar.B0();
                                yyVar2.J(pyVar.E(arrayList3.get(size)), 0);
                                yyVar2.H(0);
                                yyVar2.q(0);
                                int i17 = yyVar2.C1;
                                if (i17 <= 0 && (i17 = yyVar2.B1) <= 0) {
                                    i17 = yyVar2.A1;
                                }
                                iwVar.k(i10, i17);
                                yyVar2.T1 = false;
                                yyVar2.a0();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override
    public void g(RectF rectF, View view) {
        this.f31983b.D();
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.f31983b.T();
    }

    @Override
    public void A(float f10, int i10) {
    }
}
