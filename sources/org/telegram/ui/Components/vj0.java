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
public final class vj0 extends Path {
    public final org.telegram.ui.Cells.u1 f31530a;
    public final int f31531b;
    public final int f31532c;
    public final int d;
    public final boolean f31533e;
    public final boolean f31534f;
    public final byte[] f31535g;
    public int h;
    public final Paint f31536i;
    public final mr f31537j;
    public final g6 f31538k;
    public final ArrayList f31539l;
    public final ArrayList f31540m;
    public final float f31541n;
    public final float f31542o;
    public final float f31543p;
    public uj0 f31544q;

    public vj0(final org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f31536i = paint;
        this.f31537j = new mr();
        this.f31539l = new ArrayList();
        this.f31540m = new ArrayList();
        this.f31530a = u1Var;
        this.f31538k = new g6(0.0f, new Runnable() {
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
        }, 350L, 420L, js.h);
        this.f31531b = i10;
        int i12 = -i11;
        this.f31532c = i12;
        this.d = i12;
        this.f31533e = true;
        this.f31534f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f31543p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f31541n;
        float f15 = max + f14;
        float f16 = this.f31542o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f31172a = f15 - AndroidUtilities.dp(3.0f);
        obj.f31173b = f18 + AndroidUtilities.dp(3.0f);
        obj.f31174c = f17;
        obj.d = f12 + f16;
        uj0 uj0Var = this.f31544q;
        if (uj0Var != null) {
            float f19 = uj0Var.d;
            uj0Var.h = (f19 + f17) / 2.0f;
            obj.f31177g = (f19 + f17) / 2.0f;
        }
        this.f31539l.add(obj);
        this.f31544q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f31538k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f31534f;
        Paint paint = this.f31536i;
        org.telegram.ui.Cells.u1 u1Var = this.f31530a;
        mr mrVar = this.f31537j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            mrVar.rewind();
            int I2 = u1Var.I2(this.f31535g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(I2), u1Var.getBackgroundDrawableRight(), u1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            mrVar.addRect(rectF, Path.Direction.CW);
            mrVar.a();
        } else if (this.f31533e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            mrVar.rewind();
            int O2 = u1Var.O2(-this.f31532c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(u1Var.getBackgroundDrawableLeft(), u1Var.H2(O2), u1Var.getBackgroundDrawableRight(), u1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            mrVar.addRect(rectF2, Path.Direction.CW);
            mrVar.a();
        } else {
            canvas.translate(f7, f10);
            mrVar.rewind();
            while (true) {
                ArrayList arrayList = this.f31539l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                uj0 uj0Var = (uj0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f7, uj0Var.f31172a, d);
                if (uj0Var.f31175e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = uj0Var.f31177g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, uj0Var.f31174c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f7, uj0Var.f31173b, d);
                if (uj0Var.f31176f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = uj0Var.h;
                }
                mrVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, uj0Var.d, d), Path.Direction.CW);
                i10++;
            }
            mrVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(mrVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public vj0(final org.telegram.ui.Cells.u1 u1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f31536i = paint;
        this.f31537j = new mr();
        this.f31539l = new ArrayList();
        this.f31540m = new ArrayList();
        this.f31530a = u1Var;
        this.f31538k = new g6(0.0f, new Runnable() {
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
        }, 350L, 420L, js.h);
        this.f31531b = i10;
        this.f31535g = bArr;
        this.f31532c = 0;
        this.d = 0;
        this.f31533e = false;
        this.f31534f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public vj0(org.telegram.ui.Cells.u1 u1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        int i15 = 1;
        Paint paint = new Paint(1);
        this.f31536i = paint;
        this.f31537j = new mr();
        this.f31539l = new ArrayList();
        this.f31540m = new ArrayList();
        this.f31530a = null;
        this.f31538k = new g6(0.0f, new gi0(1, u1Var, viewParent), 350L, 420L, js.h);
        this.f31531b = i10;
        this.f31532c = i14;
        this.d = i12;
        int i16 = 0;
        this.f31533e = false;
        this.f31534f = false;
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
                this.f31541n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f31541n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f31542o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f31543p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
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
                    this.f31540m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i17++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 1;
            i16 = 0;
        }
        if (this.f31539l.size() > 0) {
            uj0 uj0Var = (uj0) this.f31539l.get(0);
            uj0 uj0Var2 = (uj0) hg.c.h(1, this.f31539l);
            uj0Var.f31175e = true;
            uj0Var.f31174c -= AndroidUtilities.dp(0.66f);
            uj0Var2.f31176f = true;
            uj0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
