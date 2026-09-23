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
public final class oi0 extends Path {
    public final org.telegram.ui.Cells.t1 f26747a;
    public final int f26748b;
    public final int f26749c;
    public final int d;
    public final boolean e;
    public final boolean f26750f;
    public final byte[] f26751g;
    public int h;
    public final Paint f26752i;
    public final vq f26753j;
    public final e6 f26754k;
    public final ArrayList f26755l;
    public final ArrayList f26756m;
    public final float f26757n;
    public final float f26758o;
    public final float f26759p;
    public ni0 f26760q;

    public oi0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f26752i = paint;
        this.f26753j = new vq();
        this.f26755l = new ArrayList();
        this.f26756m = new ArrayList();
        this.f26747a = t1Var;
        this.f26754k = new e6(0.0f, new Runnable() {
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
        }, 350L, 420L, rr.h);
        this.f26748b = i10;
        int i12 = -i11;
        this.f26749c = i12;
        this.d = i12;
        this.e = true;
        this.f26750f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f26759p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f26757n;
        float f15 = max + f14;
        float f16 = this.f26758o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f26427a = f15 - AndroidUtilities.dp(3.0f);
        obj.f26428b = f18 + AndroidUtilities.dp(3.0f);
        obj.f26429c = f17;
        obj.d = f12 + f16;
        ni0 ni0Var = this.f26760q;
        if (ni0Var != null) {
            float f19 = ni0Var.d;
            ni0Var.h = (f19 + f17) / 2.0f;
            obj.f26431g = (f19 + f17) / 2.0f;
        }
        this.f26755l.add(obj);
        this.f26760q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f26754k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f26750f;
        Paint paint = this.f26752i;
        org.telegram.ui.Cells.t1 t1Var = this.f26747a;
        vq vqVar = this.f26753j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            vqVar.rewind();
            int I2 = t1Var.I2(this.f26751g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            vqVar.addRect(rectF, Path.Direction.CW);
            vqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            vqVar.rewind();
            int O2 = t1Var.O2(-this.f26749c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            vqVar.addRect(rectF2, Path.Direction.CW);
            vqVar.a();
        } else {
            canvas.translate(f7, f10);
            vqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f26755l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ni0 ni0Var = (ni0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f7, ni0Var.f26427a, d);
                if (ni0Var.e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = ni0Var.f26431g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, ni0Var.f26429c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f7, ni0Var.f26428b, d);
                if (ni0Var.f26430f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = ni0Var.h;
                }
                vqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, ni0Var.d, d), Path.Direction.CW);
                i10++;
            }
            vqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(vqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public oi0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f26752i = paint;
        this.f26753j = new vq();
        this.f26755l = new ArrayList();
        this.f26756m = new ArrayList();
        this.f26747a = t1Var;
        this.f26754k = new e6(0.0f, new Runnable() {
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
        }, 350L, 420L, rr.h);
        this.f26748b = i10;
        this.f26751g = bArr;
        this.f26749c = 0;
        this.d = 0;
        this.e = false;
        this.f26750f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public oi0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f26752i = paint;
        this.f26753j = new vq();
        this.f26755l = new ArrayList();
        this.f26756m = new ArrayList();
        this.f26747a = null;
        this.f26754k = new e6(0.0f, new oy(21, t1Var, viewParent), 350L, 420L, rr.h);
        this.f26748b = i10;
        this.f26749c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f26750f = false;
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
                this.f26757n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f26757n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f26758o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f26759p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
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
                    this.f26756m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f26755l.size() > 0) {
            ni0 ni0Var = (ni0) this.f26755l.get(0);
            ni0 ni0Var2 = (ni0) hg.c.h(1, this.f26755l);
            ni0Var.e = true;
            ni0Var.f26429c -= AndroidUtilities.dp(0.66f);
            ni0Var2.f26430f = true;
            ni0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
