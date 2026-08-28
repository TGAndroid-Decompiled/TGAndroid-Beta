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
public final class ai0 extends Path {
    public final org.telegram.ui.Cells.t1 f26821a;
    public final int f26822b;
    public final int f26823c;
    public final int d;
    public final boolean f26824e;
    public final boolean f26825f;
    public final byte[] f26826g;
    public int h;
    public final Paint f26827i;
    public final kq f26828j;
    public final y5 f26829k;
    public final ArrayList f26830l;
    public final ArrayList f26831m;
    public final float f26832n;
    public final float f26833o;
    public final float f26834p;
    public zh0 f26835q;

    public ai0(final org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
        Paint paint = new Paint(1);
        this.f26827i = paint;
        this.f26828j = new kq();
        this.f26830l = new ArrayList();
        this.f26831m = new ArrayList();
        this.f26821a = t1Var;
        this.f26829k = new y5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, gr.h);
        this.f26822b = i9;
        int i11 = -i10;
        this.f26823c = i11;
        this.d = i11;
        this.f26824e = true;
        this.f26825f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f26834p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f26832n;
        float f16 = max + f15;
        float f17 = this.f26833o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f35310a = f16 - AndroidUtilities.dp(3.0f);
        obj.f35311b = f19 + AndroidUtilities.dp(3.0f);
        obj.f35312c = f18;
        obj.d = f13 + f17;
        zh0 zh0Var = this.f26835q;
        if (zh0Var != null) {
            float f20 = zh0Var.d;
            zh0Var.h = (f20 + f18) / 2.0f;
            obj.f35315g = (f20 + f18) / 2.0f;
        }
        this.f26830l.add(obj);
        this.f26835q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        int i9 = 0;
        float d = this.f26829k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f26825f;
        Paint paint = this.f26827i;
        org.telegram.ui.Cells.t1 t1Var = this.f26821a;
        kq kqVar = this.f26828j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            kqVar.rewind();
            int I2 = t1Var.I2(this.f26826g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            kqVar.addRect(rectF, Path.Direction.CW);
            kqVar.a();
        } else if (this.f26824e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            kqVar.rewind();
            int O2 = t1Var.O2(-this.f26823c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            kqVar.addRect(rectF2, Path.Direction.CW);
            kqVar.a();
        } else {
            canvas.translate(f10, f11);
            kqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f26830l;
                if (i9 >= arrayList.size()) {
                    break;
                }
                zh0 zh0Var = (zh0) arrayList.get(i9);
                float lerp3 = AndroidUtilities.lerp(rect.left - f10, zh0Var.f35310a, d);
                if (zh0Var.f35313e) {
                    f13 = rect.top - f11;
                } else {
                    f13 = zh0Var.f35315g;
                }
                float lerp4 = AndroidUtilities.lerp(f13, zh0Var.f35312c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f10, zh0Var.f35311b, d);
                if (zh0Var.f35314f) {
                    f14 = rect.bottom - f11;
                } else {
                    f14 = zh0Var.h;
                }
                kqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f14, zh0Var.d, d), Path.Direction.CW);
                i9++;
            }
            kqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(kqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ai0(final org.telegram.ui.Cells.t1 t1Var, int i9, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f26827i = paint;
        this.f26828j = new kq();
        this.f26830l = new ArrayList();
        this.f26831m = new ArrayList();
        this.f26821a = t1Var;
        this.f26829k = new y5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.t1 t1Var2 = t1Var;
                        if (t1Var2 != null) {
                            t1Var2.invalidate();
                        }
                        if (t1Var2.getParent() instanceof View) {
                            ((View) t1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.t1 t1Var3 = t1Var;
                        if (t1Var3 != null) {
                            t1Var3.invalidate();
                        }
                        if (t1Var3.getParent() instanceof View) {
                            ((View) t1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, gr.h);
        this.f26822b = i9;
        this.f26826g = bArr;
        this.f26823c = 0;
        this.d = 0;
        this.f26824e = false;
        this.f26825f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public ai0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i9, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i13 = i10;
        Paint paint = new Paint(1);
        this.f26827i = paint;
        this.f26828j = new kq();
        this.f26830l = new ArrayList();
        this.f26831m = new ArrayList();
        this.f26821a = null;
        this.f26829k = new y5(0.0f, new jg0(3, t1Var, viewParent), 350L, 420L, gr.h);
        this.f26822b = i9;
        this.f26823c = i13;
        this.d = i11;
        int i14 = 0;
        this.f26824e = false;
        this.f26825f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i15 = 0;
        boolean z10 = false;
        while (i15 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i15);
            if (textLayoutBlock != 0 && i13 <= textLayoutBlock.charactersEnd && i11 >= (i12 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i14, i13 - i12);
                int i16 = textLayoutBlock.charactersOffset;
                int min = Math.min(i11 - i16, textLayoutBlock.charactersEnd - i16);
                float f11 = -f10;
                this.f26832n = f11;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f26832n = f11 + AndroidUtilities.dp(10.0f);
                }
                this.f26833o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f26834p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
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
                        for (int i17 = lineForOffset; i17 <= lineForOffset2; i17++) {
                            int lineStart = staticLayout.getLineStart(i17);
                            int lineEnd = staticLayout.getLineEnd(i17);
                            if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(staticLayout.getText().charAt(lineStart)))) {
                                if (i17 == lineForOffset && max > lineStart) {
                                    lineLeft = staticLayout.getPrimaryHorizontal(max);
                                } else {
                                    lineLeft = staticLayout.getLineLeft(i17);
                                }
                                if (i17 == lineForOffset2 && min < lineEnd) {
                                    lineRight = staticLayout.getPrimaryHorizontal(min);
                                } else {
                                    lineRight = staticLayout.getLineRight(i17);
                                }
                                a(Math.min(lineLeft, lineRight), staticLayout.getLineTop(i17), Math.max(lineLeft, lineRight), staticLayout.getLineBottom(i17));
                            }
                        }
                    }
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f26831m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i15++;
            arrayList2 = arrayList;
            i13 = i10;
            i14 = 0;
        }
        if (this.f26830l.size() > 0) {
            zh0 zh0Var = (zh0) this.f26830l.get(0);
            zh0 zh0Var2 = (zh0) j3.r0.j(1, this.f26830l);
            zh0Var.f35313e = true;
            zh0Var.f35312c -= AndroidUtilities.dp(0.66f);
            zh0Var2.f35314f = true;
            zh0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
