package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class ci0 extends Path {

    public final org.telegram.ui.Cells.s1 f27452a;

    public final int f27453b;

    public final int f27454c;
    public final int d;

    public final boolean f27455e;

    public final boolean f27456f;

    public final byte[] f27457g;
    public int h;

    public final Paint f27458i;

    public final iq f27459j;

    public final y5 f27460k;

    public final ArrayList f27461l;

    public final ArrayList f27462m;

    public final float f27463n;

    public final float f27464o;

    public final float f27465p;

    public bi0 f27466q;

    public ci0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f27458i = paint;
        this.f27459j = new iq();
        this.f27461l = new ArrayList();
        this.f27462m = new ArrayList();
        this.f27452a = s1Var;
        final int i12 = 0;
        this.f27460k = new y5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                        }
                        break;
                }
            }
        }, 350L, 420L, er.h);
        this.f27453b = i10;
        int i13 = -i11;
        this.f27454c = i13;
        this.d = i13;
        this.f27455e = true;
        this.f27456f = false;
        int iDp = AndroidUtilities.dp(4.0f);
        this.h = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f27465p;
        float fMax = Math.max(f14, f10);
        float fMax2 = Math.max(f14, f12);
        float f15 = this.f27463n;
        float f16 = fMax + f15;
        float f17 = this.f27464o;
        float f18 = f11 + f17;
        float f19 = fMax2 + f15;
        bi0 bi0Var = new bi0();
        bi0Var.f27105a = f16 - AndroidUtilities.dp(3.0f);
        bi0Var.f27106b = f19 + AndroidUtilities.dp(3.0f);
        bi0Var.f27107c = f18;
        bi0Var.d = f13 + f17;
        bi0 bi0Var2 = this.f27466q;
        if (bi0Var2 != null) {
            float f20 = bi0Var2.d;
            bi0Var2.h = (f20 + f18) / 2.0f;
            bi0Var.f27110g = (f20 + f18) / 2.0f;
        }
        this.f27461l.add(bi0Var);
        this.f27466q = bi0Var;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        int i10 = 0;
        float fD = this.f27460k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f27456f;
        Paint paint = this.f27458i;
        org.telegram.ui.Cells.s1 s1Var = this.f27452a;
        iq iqVar = this.f27459j;
        if (z10) {
            int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, fD);
            if (this.h != iLerp) {
                this.h = iLerp;
                paint.setPathEffect(new CornerPathEffect(iLerp));
            }
            iqVar.rewind();
            int iH2 = s1Var.H2(this.f27457g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.G2(iH2), s1Var.getBackgroundDrawableRight(), s1Var.F2(iH2));
            AndroidUtilities.lerp(rect, rectF, fD, rectF);
            iqVar.addRect(rectF, Path.Direction.CW);
            iqVar.a();
        } else if (this.f27455e) {
            int iLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, fD);
            if (this.h != iLerp2) {
                this.h = iLerp2;
                paint.setPathEffect(new CornerPathEffect(iLerp2));
            }
            iqVar.rewind();
            int iN2 = s1Var.N2(-this.f27454c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.G2(iN2), s1Var.getBackgroundDrawableRight(), s1Var.F2(iN2));
            AndroidUtilities.lerp(rect, rectF2, fD, rectF2);
            iqVar.addRect(rectF2, Path.Direction.CW);
            iqVar.a();
        } else {
            canvas.translate(f10, f11);
            iqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f27461l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                bi0 bi0Var = (bi0) arrayList.get(i10);
                iqVar.addRect(AndroidUtilities.lerp(rect.left - f10, bi0Var.f27105a, fD), AndroidUtilities.lerp(bi0Var.f27108e ? rect.top - f11 : bi0Var.f27110g, bi0Var.f27107c, fD), AndroidUtilities.lerp(rect.right - f10, bi0Var.f27106b, fD), AndroidUtilities.lerp(bi0Var.f27109f ? rect.bottom - f11 : bi0Var.h, bi0Var.d, fD), Path.Direction.CW);
                i10++;
            }
            iqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(iqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ci0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f27458i = paint;
        this.f27459j = new iq();
        this.f27461l = new ArrayList();
        this.f27462m = new ArrayList();
        this.f27452a = s1Var;
        final int i11 = 1;
        this.f27460k = new y5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                        }
                        break;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                        }
                        break;
                }
            }
        }, 350L, 420L, er.h);
        this.f27453b = i10;
        this.f27457g = bArr;
        this.f27454c = 0;
        this.d = 0;
        this.f27455e = false;
        this.f27456f = true;
        int iDp = AndroidUtilities.dp(4.0f);
        this.h = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
    }

    public ci0(org.telegram.ui.Cells.s1 s1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f10) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f27458i = paint;
        this.f27459j = new iq();
        this.f27461l = new ArrayList();
        this.f27462m = new ArrayList();
        this.f27452a = null;
        this.f27460k = new y5(0.0f, new lg0(3, s1Var, viewParent), 350L, 420L, er.h);
        this.f27453b = i10;
        this.f27454c = i14;
        this.d = i12;
        int i15 = 0;
        this.f27455e = false;
        this.f27456f = false;
        if (arrayList2 == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(4.0f);
        this.h = iDp;
        paint.setPathEffect(new CornerPathEffect(iDp));
        int i16 = 0;
        boolean z10 = false;
        while (i16 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i16);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int iMax = Math.max(i15, i14 - i13);
                int i17 = textLayoutBlock.charactersOffset;
                int iMin = Math.min(i12 - i17, textLayoutBlock.charactersEnd - i17);
                float f11 = -f10;
                this.f27463n = f11;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f27463n = f11 + AndroidUtilities.dp(10.0f);
                }
                this.f27464o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f27465p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(iMax, iMin, this);
                } else {
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    if (iMax != iMin) {
                        if (iMin < iMax) {
                            iMin = iMax;
                            iMax = iMin;
                        }
                        int lineForOffset = staticLayout.getLineForOffset(iMax);
                        int lineForOffset2 = staticLayout.getLineForOffset(iMin);
                        for (int i18 = lineForOffset; i18 <= lineForOffset2; i18++) {
                            int lineStart = staticLayout.getLineStart(i18);
                            int lineEnd = staticLayout.getLineEnd(i18);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i18 == lineForOffset && iMax > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(iMax);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i18);
                                }
                                if (i18 == lineForOffset2 && iMin < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(iMin);
                                } else {
                                    lineRight = staticLayout.getLineRight(i18);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i18), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i18));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f27462m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f27461l.size() > 0) {
            bi0 bi0Var = (bi0) this.f27461l.get(0);
            bi0 bi0Var2 = (bi0) i0.a.i(1, this.f27461l);
            bi0Var.f27108e = true;
            bi0Var.f27107c -= AndroidUtilities.dp(0.66f);
            bi0Var2.f27109f = true;
            bi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
