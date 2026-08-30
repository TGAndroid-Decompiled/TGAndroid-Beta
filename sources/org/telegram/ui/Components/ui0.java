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
public final class ui0 extends Path {
    public final org.telegram.ui.Cells.t1 f29226a;
    public final int f29227b;
    public final int f29228c;
    public final int d;
    public final boolean e;
    public final boolean f29229f;
    public final byte[] f29230g;
    public int h;
    public final Paint f29231i;
    public final sq f29232j;
    public final z5 f29233k;
    public final ArrayList f29234l;
    public final ArrayList f29235m;
    public final float f29236n;
    public final float f29237o;
    public final float f29238p;
    public ti0 f29239q;

    public ui0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f29231i = paint;
        this.f29232j = new sq();
        this.f29234l = new ArrayList();
        this.f29235m = new ArrayList();
        this.f29226a = t1Var;
        this.f29233k = new z5(0.0f, new Runnable() {
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
        }, 350L, 420L, nr.h);
        this.f29227b = i10;
        int i12 = -i11;
        this.f29228c = i12;
        this.d = i12;
        this.e = true;
        this.f29229f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f29238p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f29236n;
        float f16 = max + f15;
        float f17 = this.f29237o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f28980a = f16 - AndroidUtilities.dp(3.0f);
        obj.f28981b = f19 + AndroidUtilities.dp(3.0f);
        obj.f28982c = f18;
        obj.d = f13 + f17;
        ti0 ti0Var = this.f29239q;
        if (ti0Var != null) {
            float f20 = ti0Var.d;
            ti0Var.h = (f20 + f18) / 2.0f;
            obj.f28984g = (f20 + f18) / 2.0f;
        }
        this.f29234l.add(obj);
        this.f29239q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void b(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        float f13;
        float f14;
        int i10 = 0;
        float d = this.f29233k.d(1.0f, false);
        canvas.save();
        boolean z4 = this.f29229f;
        Paint paint = this.f29231i;
        org.telegram.ui.Cells.t1 t1Var = this.f29226a;
        sq sqVar = this.f29232j;
        if (z4) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            sqVar.rewind();
            int I2 = t1Var.I2(this.f29230g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            sqVar.addRect(rectF, Path.Direction.CW);
            sqVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            sqVar.rewind();
            int O2 = t1Var.O2(-this.f29228c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            sqVar.addRect(rectF2, Path.Direction.CW);
            sqVar.a();
        } else {
            canvas.translate(f10, f11);
            sqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f29234l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ti0 ti0Var = (ti0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f10, ti0Var.f28980a, d);
                if (ti0Var.e) {
                    f13 = rect.top - f11;
                } else {
                    f13 = ti0Var.f28984g;
                }
                float lerp4 = AndroidUtilities.lerp(f13, ti0Var.f28982c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f10, ti0Var.f28981b, d);
                if (ti0Var.f28983f) {
                    f14 = rect.bottom - f11;
                } else {
                    f14 = ti0Var.h;
                }
                sqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f14, ti0Var.d, d), Path.Direction.CW);
                i10++;
            }
            sqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f12));
        canvas.drawPath(sqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public ui0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f29231i = paint;
        this.f29232j = new sq();
        this.f29234l = new ArrayList();
        this.f29235m = new ArrayList();
        this.f29226a = t1Var;
        this.f29233k = new z5(0.0f, new Runnable() {
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
        }, 350L, 420L, nr.h);
        this.f29227b = i10;
        this.f29230g = bArr;
        this.f29228c = 0;
        this.d = 0;
        this.e = false;
        this.f29229f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public ui0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f10) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f29231i = paint;
        this.f29232j = new sq();
        this.f29234l = new ArrayList();
        this.f29235m = new ArrayList();
        this.f29226a = null;
        this.f29233k = new z5(0.0f, new i80(9, t1Var, viewParent), 350L, 420L, nr.h);
        this.f29227b = i10;
        this.f29228c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f29229f = false;
        if (arrayList2 == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        int i16 = 0;
        boolean z4 = false;
        while (i16 < arrayList2.size()) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList2.get(i16);
            if (textLayoutBlock != 0 && i14 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(i15, i14 - i13);
                int i17 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i17, textLayoutBlock.charactersEnd - i17);
                float f11 = -f10;
                this.f29236n = f11;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f29236n = f11 + AndroidUtilities.dp(10.0f);
                }
                this.f29237o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f29238p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z4 = z4 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z4) {
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
                    this.f29235m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f29234l.size() > 0) {
            ti0 ti0Var = (ti0) this.f29234l.get(0);
            ti0 ti0Var2 = (ti0) kh.a2.i(1, this.f29234l);
            ti0Var.e = true;
            ti0Var.f28982c -= AndroidUtilities.dp(0.66f);
            ti0Var2.f28983f = true;
            ti0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
