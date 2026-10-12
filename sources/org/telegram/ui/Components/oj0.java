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
public final class oj0 extends Path {
    public final org.telegram.ui.Cells.u1 f27968a;
    public final int f27969b;
    public final int f27970c;
    public final int d;
    public final boolean e;
    public final boolean f27971f;
    public final byte[] f27972g;
    public int h;
    public final Paint f27973i;
    public final hr f27974j;
    public final g6 f27975k;
    public final ArrayList f27976l;
    public final ArrayList f27977m;
    public final float f27978n;
    public final float f27979o;
    public final float f27980p;
    public nj0 f27981q;

    public oj0(final org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f27973i = paint;
        this.f27974j = new hr();
        this.f27976l = new ArrayList();
        this.f27977m = new ArrayList();
        this.f27968a = u1Var;
        this.f27975k = new g6(0.0f, new Runnable() {
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
        }, 350L, 420L, es.h);
        this.f27969b = i10;
        int i12 = -i11;
        this.f27970c = i12;
        this.d = i12;
        this.e = true;
        this.f27971f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f27980p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f27978n;
        float f15 = max + f14;
        float f16 = this.f27979o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f27676a = f15 - AndroidUtilities.dp(3.0f);
        obj.f27677b = f18 + AndroidUtilities.dp(3.0f);
        obj.f27678c = f17;
        obj.d = f12 + f16;
        nj0 nj0Var = this.f27981q;
        if (nj0Var != null) {
            float f19 = nj0Var.d;
            nj0Var.h = (f19 + f17) / 2.0f;
            obj.f27680g = (f19 + f17) / 2.0f;
        }
        this.f27976l.add(obj);
        this.f27981q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f27975k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f27971f;
        Paint paint = this.f27973i;
        org.telegram.ui.Cells.u1 u1Var = this.f27968a;
        hr hrVar = this.f27974j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            hrVar.rewind();
            int I2 = u1Var.I2(this.f27972g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(I2), u1Var.getBackgroundDrawableRight(), u1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            hrVar.addRect(rectF, Path.Direction.CW);
            hrVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            hrVar.rewind();
            int O2 = u1Var.O2(-this.f27970c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(O2), u1Var.getBackgroundDrawableRight(), u1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            hrVar.addRect(rectF2, Path.Direction.CW);
            hrVar.a();
        } else {
            canvas.translate(f7, f10);
            hrVar.rewind();
            while (true) {
                ArrayList arrayList = this.f27976l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                nj0 nj0Var = (nj0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f7, nj0Var.f27676a, d);
                if (nj0Var.e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = nj0Var.f27680g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, nj0Var.f27678c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f7, nj0Var.f27677b, d);
                if (nj0Var.f27679f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = nj0Var.h;
                }
                hrVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, nj0Var.d, d), Path.Direction.CW);
                i10++;
            }
            hrVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(hrVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public oj0(final org.telegram.ui.Cells.u1 u1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f27973i = paint;
        this.f27974j = new hr();
        this.f27976l = new ArrayList();
        this.f27977m = new ArrayList();
        this.f27968a = u1Var;
        this.f27975k = new g6(0.0f, new Runnable() {
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
        }, 350L, 420L, es.h);
        this.f27969b = i10;
        this.f27972g = bArr;
        this.f27970c = 0;
        this.d = 0;
        this.e = false;
        this.f27971f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public oj0(org.telegram.ui.Cells.u1 u1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        int i15 = 1;
        Paint paint = new Paint(1);
        this.f27973i = paint;
        this.f27974j = new hr();
        this.f27976l = new ArrayList();
        this.f27977m = new ArrayList();
        this.f27968a = null;
        this.f27975k = new g6(0.0f, new f60(14, u1Var, viewParent), 350L, 420L, es.h);
        this.f27969b = i10;
        this.f27970c = i14;
        this.d = i12;
        int i16 = 0;
        this.e = false;
        this.f27971f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i17);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i16, i14 - i13);
                int i19 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i19, textLayoutBlock.charactersEnd - i19);
                float f10 = -f7;
                this.f27978n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f27978n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f27979o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f27980p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                i18 = (i18 != 0 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText())) ? i15 : i16;
                if (i18 != 0) {
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
                        for (int i20 = lineForOffset; i20 <= lineForOffset2; i20++) {
                            int lineStart = staticLayout.getLineStart(i20);
                            int lineEnd = staticLayout.getLineEnd(i20);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i20 == lineForOffset && max > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(max);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i20);
                                }
                                if (i20 == lineForOffset2 && min < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(min);
                                } else {
                                    lineRight = staticLayout.getLineRight(i20);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i20), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i20));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f27977m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i17++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 1;
            i16 = 0;
        }
        if (this.f27976l.size() > 0) {
            nj0 nj0Var = (nj0) this.f27976l.get(0);
            nj0 nj0Var2 = (nj0) i2.d.g(1, this.f27976l);
            nj0Var.e = true;
            nj0Var.f27678c -= AndroidUtilities.dp(0.66f);
            nj0Var2.f27679f = true;
            nj0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
