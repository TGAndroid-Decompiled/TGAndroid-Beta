package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
public final class nj0 extends Path {
    public final org.telegram.ui.Cells.s1 f31006a;
    public final int f31007b;
    public final int f31008c;
    public final int d;
    public final boolean e;
    public final boolean f31009f;
    public final byte[] f31010g;
    public int h;
    public final Paint f31011i;
    public final fr f31012j;
    public final h6 f31013k;
    public final ArrayList f31014l;
    public final ArrayList f31015m;
    public final float f31016n;
    public final float f31017o;
    public final float f31018p;
    public mj0 f31019q;
    public final int f31020r;
    public final org.telegram.ui.Cells.da f31021s;
    public final int f31022t;
    public final ArrayList f31023u;

    public nj0(final org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f31011i = paint;
        this.f31012j = new fr();
        this.f31014l = new ArrayList();
        this.f31015m = new ArrayList();
        this.f31022t = 1;
        this.f31023u = new ArrayList();
        this.f31006a = s1Var;
        this.f31013k = new h6(0.0f, new Runnable() {
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
        }, 350L, 420L, ds.h);
        this.f31007b = i10;
        int i12 = -i11;
        this.f31008c = i12;
        this.d = i12;
        this.e = true;
        this.f31009f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public static void b(fr frVar, mj0 mj0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.da daVar;
        float f12;
        org.telegram.ui.Cells.da daVar2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (mj0Var.f30600j != null) {
            f12 = daVar.getX() - mj0Var.f30601k;
        } else {
            f12 = 0.0f;
        }
        if (mj0Var.f30600j != null) {
            f15 = daVar2.getY() - mj0Var.f30602l;
        }
        float lerp = AndroidUtilities.lerp(rect.left - f7, mj0Var.f30594a + f12, f11);
        if (mj0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = mj0Var.f30598g + f15;
        }
        float lerp2 = AndroidUtilities.lerp(f13, mj0Var.f30596c + f15, f11);
        float lerp3 = AndroidUtilities.lerp(rect.right - f7, mj0Var.f30595b + f12, f11);
        if (mj0Var.f30597f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = mj0Var.h + f15;
        }
        frVar.addRect(lerp, lerp2, lerp3, AndroidUtilities.lerp(f14, mj0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f31018p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f31016n;
        float f15 = max + f14;
        float f16 = this.f31017o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f30594a = f15 - AndroidUtilities.dp(3.0f);
        obj.f30595b = f18 + AndroidUtilities.dp(3.0f);
        obj.f30596c = f17;
        obj.d = f12 + f16;
        obj.f30599i = this.f31020r;
        org.telegram.ui.Cells.da daVar = this.f31021s;
        obj.f30600j = daVar;
        if (daVar != null) {
            obj.f30601k = daVar.getX();
            obj.f30602l = daVar.getY();
        }
        mj0 mj0Var = this.f31019q;
        if (mj0Var != null) {
            float f19 = mj0Var.d;
            mj0Var.h = (f19 + f17) / 2.0f;
            obj.f30598g = (f19 + f17) / 2.0f;
        }
        this.f31014l.add(obj);
        this.f31019q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float d = this.f31013k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f31009f;
        fr frVar = this.f31012j;
        org.telegram.ui.Cells.s1 s1Var = this.f31006a;
        Paint paint = this.f31011i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            frVar.rewind();
            int I2 = s1Var.I2(this.f31010g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(I2), s1Var.getBackgroundDrawableRight(), s1Var.G2(I2));
            AndroidUtilities.lerp(rect2, rectF, d, rectF);
            frVar.addRect(rectF, Path.Direction.CW);
            frVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            frVar.rewind();
            int O2 = s1Var.O2(-this.f31008c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(s1Var.getBackgroundDrawableLeft(), s1Var.H2(O2), s1Var.getBackgroundDrawableRight(), s1Var.G2(O2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            frVar.addRect(rectF2, Path.Direction.CW);
            frVar.a();
        } else {
            int i11 = this.f31022t;
            ArrayList arrayList2 = this.f31014l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                fr frVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f31023u;
                    if (i13 >= size) {
                        break;
                    }
                    mj0 mj0Var = (mj0) arrayList2.get(i13);
                    if (frVar2 == null || mj0Var.e) {
                        if (frVar2 != null) {
                            frVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new fr());
                        }
                        frVar2 = (fr) arrayList.get(i12);
                        frVar2.rewind();
                    }
                    fr frVar3 = frVar2;
                    b(frVar3, mj0Var, f7, f10, rect2, d);
                    frVar2 = frVar3;
                    i13++;
                }
                if (frVar2 != null) {
                    frVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f7, rect2.top - f10, rect2.right - f7, rect2.bottom - f10, (int) (alpha * f11), 31);
                paint.setAlpha(255);
                while (i10 <= i12) {
                    canvas.drawPath((Path) arrayList.get(i10), paint);
                    i10++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f7, f10);
            frVar.rewind();
            while (i10 < arrayList2.size()) {
                b(frVar, (mj0) arrayList2.get(i10), f7, f10, rect2, d);
                i10++;
                rect2 = rect;
            }
            frVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(frVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31014l;
            if (i10 < arrayList.size()) {
                mj0 mj0Var = (mj0) arrayList.get(i10);
                if (i10 == 0 || ((mj0) arrayList.get(i10 - 1)).f30599i != mj0Var.f30599i) {
                    mj0Var.e = true;
                    mj0Var.f30596c -= AndroidUtilities.dp(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((mj0) arrayList.get(i10 + 1)).f30599i != mj0Var.f30599i) {
                    mj0Var.f30597f = true;
                    mj0Var.d += AndroidUtilities.dp(0.66f);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e(Layout layout, int i10, int i11) {
        float lineLeft;
        float lineRight;
        if (i10 != i11) {
            if (i11 < i10) {
                i11 = i10;
                i10 = i11;
            }
            int lineForOffset = layout.getLineForOffset(i10);
            int lineForOffset2 = layout.getLineForOffset(i11);
            for (int i12 = lineForOffset; i12 <= lineForOffset2; i12++) {
                int lineStart = layout.getLineStart(i12);
                int lineEnd = layout.getLineEnd(i12);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    if (i12 == lineForOffset && i10 > lineStart) {
                        lineLeft = layout.getPrimaryHorizontal(i10);
                    } else {
                        lineLeft = layout.getLineLeft(i12);
                    }
                    if (i12 == lineForOffset2 && i11 < lineEnd) {
                        lineRight = layout.getPrimaryHorizontal(i11);
                    } else {
                        lineRight = layout.getLineRight(i12);
                    }
                    a(Math.min(lineLeft, lineRight), layout.getLineTop(i12), Math.max(lineLeft, lineRight), layout.getLineBottom(i12));
                }
            }
        }
    }

    public nj0(final org.telegram.ui.Cells.s1 s1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f31011i = paint;
        this.f31012j = new fr();
        this.f31014l = new ArrayList();
        this.f31015m = new ArrayList();
        this.f31022t = 1;
        this.f31023u = new ArrayList();
        this.f31006a = s1Var;
        this.f31013k = new h6(0.0f, new Runnable() {
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
        }, 350L, 420L, ds.h);
        this.f31007b = i10;
        this.f31010g = bArr;
        this.f31008c = 0;
        this.d = 0;
        this.e = false;
        this.f31009f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public nj0(final org.telegram.ui.Cells.s1 s1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f31011i = paint;
        this.f31012j = new fr();
        this.f31014l = new ArrayList();
        this.f31015m = new ArrayList();
        this.f31022t = 1;
        this.f31023u = new ArrayList();
        this.f31006a = null;
        this.f31013k = new h6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        s1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        s1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, ds.h);
        this.f31007b = i10;
        this.f31008c = i11;
        this.d = i12;
        this.e = false;
        this.f31009f = false;
        if (arrayList == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        boolean z10 = false;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) arrayList.get(i14);
            if (textLayoutBlock != null && i11 <= textLayoutBlock.charactersEnd && i12 >= (i13 = textLayoutBlock.charactersOffset)) {
                int max = Math.max(0, i11 - i13);
                int i15 = textLayoutBlock.charactersOffset;
                int min = Math.min(i12 - i15, textLayoutBlock.charactersEnd - i15);
                float f10 = -f7;
                this.f31016n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f31016n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f31017o = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.f31018p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    e(textLayoutBlock.textLayout, max, min);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f31015m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        d();
    }

    public nj0(final org.telegram.ui.Cells.s1 s1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f31011i = paint;
        this.f31012j = new fr();
        this.f31014l = new ArrayList();
        this.f31015m = new ArrayList();
        this.f31022t = 1;
        this.f31023u = new ArrayList();
        this.f31006a = null;
        this.f31013k = new h6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        s1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        s1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, ds.h);
        this.f31007b = i10;
        this.f31008c = i11;
        this.d = i12;
        this.e = false;
        this.f31009f = false;
        if (richMessageLayout == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        this.f31018p = -3.4028235E38f;
        for (int i13 = 0; i13 < richMessageLayout.textBlocks.size(); i13++) {
            org.telegram.ui.Cells.da daVar = richMessageLayout.textBlocks.get(i13);
            Layout layout = daVar == null ? null : daVar.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i13).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.f31016n = daVar.getX();
                    this.f31017o = daVar.getY();
                    this.f31021s = daVar;
                    this.f31019q = null;
                    int size = this.f31014l.size();
                    if (AndroidUtilities.isRTL(layout.getText())) {
                        layout.getSelectionPath(clamp, clamp2, this);
                    } else {
                        e(layout, clamp, clamp2);
                    }
                    if (this.f31014l.size() > size) {
                        this.f31020r++;
                    }
                }
            }
        }
        this.f31022t = Math.max(1, this.f31020r);
        d();
    }
}
