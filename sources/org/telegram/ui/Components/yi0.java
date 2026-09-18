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
public final class yi0 extends Path {
    public final org.telegram.ui.Cells.u1 f30587a;
    public final int f30588b;
    public final int f30589c;
    public final int d;
    public final boolean e;
    public final boolean f30590f;
    public final byte[] f30591g;
    public int h;
    public final Paint f30592i;
    public final uq f30593j;
    public final e6 f30594k;
    public final ArrayList f30595l;
    public final ArrayList f30596m;
    public final float f30597n;
    public final float f30598o;
    public final float f30599p;
    public xi0 f30600q;

    public yi0(final org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f30592i = paint;
        this.f30593j = new uq();
        this.f30595l = new ArrayList();
        this.f30596m = new ArrayList();
        this.f30587a = u1Var;
        this.f30594k = new e6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
                        if (u1Var2 != null) {
                            u1Var2.invalidate();
                        }
                        if (u1Var2.getParent() instanceof View) {
                            ((View) u1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.u1 u1Var3 = u1Var;
                        if (u1Var3 != null) {
                            u1Var3.invalidate();
                        }
                        if (u1Var3.getParent() instanceof View) {
                            ((View) u1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, qr.h);
        this.f30588b = i10;
        int i12 = -i11;
        this.f30589c = i12;
        this.d = i12;
        this.e = true;
        this.f30590f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f30599p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f30597n;
        float f15 = max + f14;
        float f16 = this.f30598o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f30324a = f15 - AndroidUtilities.dp(3.0f);
        obj.f30325b = f18 + AndroidUtilities.dp(3.0f);
        obj.f30326c = f17;
        obj.d = f12 + f16;
        xi0 xi0Var = this.f30600q;
        if (xi0Var != null) {
            float f19 = xi0Var.d;
            xi0Var.h = (f19 + f17) / 2.0f;
            obj.f30328g = (f19 + f17) / 2.0f;
        }
        this.f30595l.add(obj);
        this.f30600q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f30594k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f30590f;
        Paint paint = this.f30592i;
        org.telegram.ui.Cells.u1 u1Var = this.f30587a;
        uq uqVar = this.f30593j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            uqVar.rewind();
            int I2 = u1Var.I2(this.f30591g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(I2), u1Var.getBackgroundDrawableRight(), u1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            uqVar.addRect(rectF, Path.Direction.CW);
            uqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            uqVar.rewind();
            int O2 = u1Var.O2(-this.f30589c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(O2), u1Var.getBackgroundDrawableRight(), u1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            uqVar.addRect(rectF2, Path.Direction.CW);
            uqVar.a();
        } else {
            canvas.translate(f7, f10);
            uqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f30595l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                xi0 xi0Var = (xi0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f7, xi0Var.f30324a, d);
                if (xi0Var.e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = xi0Var.f30328g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, xi0Var.f30326c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f7, xi0Var.f30325b, d);
                if (xi0Var.f30327f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = xi0Var.h;
                }
                uqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, xi0Var.d, d), Path.Direction.CW);
                i10++;
            }
            uqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(uqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public yi0(final org.telegram.ui.Cells.u1 u1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f30592i = paint;
        this.f30593j = new uq();
        this.f30595l = new ArrayList();
        this.f30596m = new ArrayList();
        this.f30587a = u1Var;
        this.f30594k = new e6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
                        if (u1Var2 != null) {
                            u1Var2.invalidate();
                        }
                        if (u1Var2.getParent() instanceof View) {
                            ((View) u1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.u1 u1Var3 = u1Var;
                        if (u1Var3 != null) {
                            u1Var3.invalidate();
                        }
                        if (u1Var3.getParent() instanceof View) {
                            ((View) u1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, qr.h);
        this.f30588b = i10;
        this.f30591g = bArr;
        this.f30589c = 0;
        this.d = 0;
        this.e = false;
        this.f30590f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public yi0(org.telegram.ui.Cells.u1 u1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f30592i = paint;
        this.f30593j = new uq();
        this.f30595l = new ArrayList();
        this.f30596m = new ArrayList();
        this.f30587a = null;
        this.f30594k = new e6(0.0f, new uw(25, u1Var, viewParent), 350L, 420L, qr.h);
        this.f30588b = i10;
        this.f30589c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f30590f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i16 = 0;
        boolean z10 = false;
        while (i16 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i16);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i15, i14 - i13);
                int i17 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i17, textLayoutBlock.charactersEnd - i17);
                float f10 = -f7;
                this.f30597n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f30597n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f30598o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f30599p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    StaticLayout staticLayout = textLayoutBlock.textLayout;
                    if (max != min) {
                        if (min < max) {
                            min = max;
                            max = min;
                        }
                        int lineForOffset = staticLayout.getLineForOffset(max);
                        int lineForOffset2 = staticLayout.getLineForOffset(min);
                        for (int i18 = lineForOffset; i18 <= lineForOffset2; i18++) {
                            int lineStart = staticLayout.getLineStart(i18);
                            int lineEnd = staticLayout.getLineEnd(i18);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i18 == lineForOffset && max > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(max);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i18);
                                }
                                if (i18 == lineForOffset2 && min < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(min);
                                } else {
                                    lineRight = staticLayout.getLineRight(i18);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i18), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i18));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f30596m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f30595l.size() > 0) {
            xi0 xi0Var = (xi0) this.f30595l.get(0);
            xi0 xi0Var2 = (xi0) hg.k0.g(1, this.f30595l);
            xi0Var.e = true;
            xi0Var.f30326c -= AndroidUtilities.dp(0.66f);
            xi0Var2.f30327f = true;
            xi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
