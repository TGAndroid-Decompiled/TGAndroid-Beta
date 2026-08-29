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
public final class li0 extends Path {
    public final org.telegram.ui.Cells.s1 f30335a;
    public final int f30336b;
    public final int f30337c;
    public final int d;
    public final boolean f30338e;
    public final boolean f30339f;
    public final byte[] f30340g;
    public int h;
    public final Paint f30341i;
    public final oq f30342j;
    public final d6 f30343k;
    public final ArrayList f30344l;
    public final ArrayList f30345m;
    public final float f30346n;
    public final float f30347o;
    public final float f30348p;
    public ki0 f30349q;

    public li0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f30341i = paint;
        this.f30342j = new oq();
        this.f30344l = new ArrayList();
        this.f30345m = new ArrayList();
        this.f30335a = s1Var;
        this.f30343k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, jr.h);
        this.f30336b = i10;
        int i12 = -i11;
        this.f30337c = i12;
        this.d = i12;
        this.f30338e = true;
        this.f30339f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f9, float f10, float f11, float f12) {
        if (f9 >= f11) {
            return;
        }
        float f13 = this.f30348p;
        float max = Math.max(f13, f9);
        float max2 = Math.max(f13, f11);
        float f14 = this.f30346n;
        float f15 = max + f14;
        float f16 = this.f30347o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f30075a = f15 - AndroidUtilities.dp(3.0f);
        obj.f30076b = f18 + AndroidUtilities.dp(3.0f);
        obj.f30077c = f17;
        obj.d = f12 + f16;
        ki0 ki0Var = this.f30349q;
        if (ki0Var != null) {
            float f19 = ki0Var.d;
            ki0Var.h = (f19 + f17) / 2.0f;
            obj.f30080g = (f19 + f17) / 2.0f;
        }
        this.f30344l.add(obj);
        this.f30349q = obj;
    }

    @Override
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        a(f9, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f9, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f30343k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f30339f;
        Paint paint = this.f30341i;
        org.telegram.ui.Cells.s1 s1Var = this.f30335a;
        oq oqVar = this.f30342j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            oqVar.rewind();
            int I2 = s1Var.I2(this.f30340g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(I2), s1Var.getBackgroundDrawableRight(), s1Var.G2(I2));
            AndroidUtilities.lerp(rect, rectF, d, rectF);
            oqVar.addRect(rectF, Path.Direction.CW);
            oqVar.a();
        } else if (this.f30338e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            oqVar.rewind();
            int O2 = s1Var.O2(-this.f30337c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(O2), s1Var.getBackgroundDrawableRight(), s1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            oqVar.addRect(rectF2, Path.Direction.CW);
            oqVar.a();
        } else {
            canvas.translate(f9, f10);
            oqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f30344l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ki0 ki0Var = (ki0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f9, ki0Var.f30075a, d);
                if (ki0Var.f30078e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = ki0Var.f30080g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, ki0Var.f30077c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f9, ki0Var.f30076b, d);
                if (ki0Var.f30079f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = ki0Var.h;
                }
                oqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, ki0Var.d, d), Path.Direction.CW);
                i10++;
            }
            oqVar.a();
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f11));
        canvas.drawPath(oqVar, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public li0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f30341i = paint;
        this.f30342j = new oq();
        this.f30344l = new ArrayList();
        this.f30345m = new ArrayList();
        this.f30335a = s1Var;
        this.f30343k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
                        if (s1Var2 != null) {
                            s1Var2.invalidate();
                        }
                        if (s1Var2.getParent() instanceof View) {
                            ((View) s1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
                        if (s1Var3 != null) {
                            s1Var3.invalidate();
                        }
                        if (s1Var3.getParent() instanceof View) {
                            ((View) s1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, jr.h);
        this.f30336b = i10;
        this.f30340g = bArr;
        this.f30337c = 0;
        this.d = 0;
        this.f30338e = false;
        this.f30339f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public li0(org.telegram.ui.Cells.s1 s1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f9) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f30341i = paint;
        this.f30342j = new oq();
        this.f30344l = new ArrayList();
        this.f30345m = new ArrayList();
        this.f30335a = null;
        this.f30343k = new d6(0.0f, new ii0(0, s1Var, viewParent), 350L, 420L, jr.h);
        this.f30336b = i10;
        this.f30337c = i14;
        this.d = i12;
        int i15 = 0;
        this.f30338e = false;
        this.f30339f = false;
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
                float f10 = -f9;
                this.f30346n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f30346n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f30347o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f30348p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
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
                    this.f30345m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f30344l.size() > 0) {
            ki0 ki0Var = (ki0) this.f30344l.get(0);
            ki0 ki0Var2 = (ki0) j7.l1.i(1, this.f30344l);
            ki0Var.f30078e = true;
            ki0Var.f30077c -= AndroidUtilities.dp(0.66f);
            ki0Var2.f30079f = true;
            ki0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
