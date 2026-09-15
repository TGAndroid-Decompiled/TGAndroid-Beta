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
public final class ni0 extends Path {
    public final org.telegram.ui.Cells.t1 f26465a;
    public final int f26466b;
    public final int f26467c;
    public final int d;
    public final boolean e;
    public final boolean f26468f;
    public final byte[] f26469g;
    public int h;
    public final Paint f26470i;
    public final uq f26471j;
    public final c6 f26472k;
    public final ArrayList f26473l;
    public final ArrayList f26474m;
    public final float f26475n;
    public final float f26476o;
    public final float f26477p;
    public mi0 f26478q;

    public ni0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f26470i = paint;
        this.f26471j = new uq();
        this.f26473l = new ArrayList();
        this.f26474m = new ArrayList();
        this.f26465a = t1Var;
        this.f26472k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, qr.h);
        this.f26466b = i10;
        int i12 = -i11;
        this.f26467c = i12;
        this.d = i12;
        this.e = true;
        this.f26468f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f26477p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f26475n;
        float f15 = max + f14;
        float f16 = this.f26476o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f26164a = f15 - AndroidUtilities.dp(3.0f);
        obj.f26165b = f18 + AndroidUtilities.dp(3.0f);
        obj.f26166c = f17;
        obj.d = f12 + f16;
        mi0 mi0Var = this.f26478q;
        if (mi0Var != null) {
            float f19 = mi0Var.d;
            mi0Var.h = (f19 + f17) / 2.0f;
            obj.f26168g = (f19 + f17) / 2.0f;
        }
        this.f26473l.add(obj);
        this.f26478q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void b(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        float f12;
        float f13;
        int i10 = 0;
        float d = this.f26472k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f26468f;
        Paint paint = this.f26470i;
        org.telegram.ui.Cells.t1 t1Var = this.f26465a;
        uq uqVar = this.f26471j;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            uqVar.rewind();
            int I2 = t1Var.I2(this.f26469g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(I2), t1Var.getBackgroundDrawableRight(), t1Var.G2(I2));
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
            int O2 = t1Var.O2(-this.f26467c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.H2(O2), t1Var.getBackgroundDrawableRight(), t1Var.G2(O2));
            AndroidUtilities.lerp(rect, rectF2, d, rectF2);
            uqVar.addRect(rectF2, Path.Direction.CW);
            uqVar.a();
        } else {
            canvas.translate(f7, f10);
            uqVar.rewind();
            while (true) {
                ArrayList arrayList = this.f26473l;
                if (i10 >= arrayList.size()) {
                    break;
                }
                mi0 mi0Var = (mi0) arrayList.get(i10);
                float lerp3 = AndroidUtilities.lerp(rect.left - f7, mi0Var.f26164a, d);
                if (mi0Var.e) {
                    f12 = rect.top - f10;
                } else {
                    f12 = mi0Var.f26168g;
                }
                float lerp4 = AndroidUtilities.lerp(f12, mi0Var.f26166c, d);
                float lerp5 = AndroidUtilities.lerp(rect.right - f7, mi0Var.f26165b, d);
                if (mi0Var.f26167f) {
                    f13 = rect.bottom - f10;
                } else {
                    f13 = mi0Var.h;
                }
                uqVar.addRect(lerp3, lerp4, lerp5, AndroidUtilities.lerp(f13, mi0Var.d, d), Path.Direction.CW);
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

    public ni0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f26470i = paint;
        this.f26471j = new uq();
        this.f26473l = new ArrayList();
        this.f26474m = new ArrayList();
        this.f26465a = t1Var;
        this.f26472k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, qr.h);
        this.f26466b = i10;
        this.f26469g = bArr;
        this.f26467c = 0;
        this.d = 0;
        this.e = false;
        this.f26468f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public ni0(org.telegram.ui.Cells.t1 t1Var, ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        float lineLeft;
        float lineRight;
        ArrayList arrayList2 = arrayList;
        int i14 = i11;
        Paint paint = new Paint(1);
        this.f26470i = paint;
        this.f26471j = new uq();
        this.f26473l = new ArrayList();
        this.f26474m = new ArrayList();
        this.f26465a = null;
        this.f26472k = new c6(0.0f, new ny(21, t1Var, viewParent), 350L, 420L, qr.h);
        this.f26466b = i10;
        this.f26467c = i14;
        this.d = i12;
        int i15 = 0;
        this.e = false;
        this.f26468f = false;
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
                this.f26475n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f26475n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f26476o = textLayoutBlock.textYOffset(arrayList2) + textLayoutBlock.padTop;
                this.f26477p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
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
                    this.f26474m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
            i16++;
            arrayList2 = arrayList;
            i14 = i11;
            i15 = 0;
        }
        if (this.f26473l.size() > 0) {
            mi0 mi0Var = (mi0) this.f26473l.get(0);
            mi0 mi0Var2 = (mi0) hg.k0.h(1, this.f26473l);
            mi0Var.e = true;
            mi0Var.f26166c -= AndroidUtilities.dp(0.66f);
            mi0Var2.f26167f = true;
            mi0Var2.d += AndroidUtilities.dp(0.66f);
        }
    }
}
