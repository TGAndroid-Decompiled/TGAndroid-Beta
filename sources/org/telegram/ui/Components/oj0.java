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
public final class oj0 extends Path {
    public final org.telegram.ui.Cells.t1 f29205a;
    public final int f29206b;
    public final int f29207c;
    public final int d;
    public final boolean e;
    public final boolean f29208f;
    public final byte[] f29209g;
    public int h;
    public final Paint f29210i;
    public final dr f29211j;
    public final f6 f29212k;
    public final ArrayList f29213l;
    public final ArrayList f29214m;
    public final float f29215n;
    public final float f29216o;
    public final float f29217p;
    public nj0 f29218q;
    public final int f29219r;
    public final org.telegram.ui.Cells.z9 f29220s;
    public final int f29221t;
    public final ArrayList f29222u;

    public oj0(final org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f29210i = paint;
        this.f29211j = new dr();
        this.f29213l = new ArrayList();
        this.f29214m = new ArrayList();
        this.f29221t = 1;
        this.f29222u = new ArrayList();
        this.f29205a = t1Var;
        this.f29212k = new f6(0.0f, new Runnable() {
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
        }, 350L, 420L, bs.h);
        this.f29206b = i10;
        int i12 = -i11;
        this.f29207c = i12;
        this.d = i12;
        this.e = true;
        this.f29208f = false;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public static void b(dr drVar, nj0 nj0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.z9 z9Var;
        float f12;
        org.telegram.ui.Cells.z9 z9Var2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (nj0Var.f28966j != null) {
            f12 = z9Var.getX() - nj0Var.f28967k;
        } else {
            f12 = 0.0f;
        }
        if (nj0Var.f28966j != null) {
            f15 = z9Var2.getY() - nj0Var.f28968l;
        }
        float lerp = AndroidUtilities.lerp(rect.left - f7, nj0Var.f28960a + f12, f11);
        if (nj0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = nj0Var.f28964g + f15;
        }
        float lerp2 = AndroidUtilities.lerp(f13, nj0Var.f28962c + f15, f11);
        float lerp3 = AndroidUtilities.lerp(rect.right - f7, nj0Var.f28961b + f12, f11);
        if (nj0Var.f28963f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = nj0Var.h + f15;
        }
        drVar.addRect(lerp, lerp2, lerp3, AndroidUtilities.lerp(f14, nj0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f29217p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f29215n;
        float f15 = max + f14;
        float f16 = this.f29216o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f28960a = f15 - AndroidUtilities.dp(3.0f);
        obj.f28961b = f18 + AndroidUtilities.dp(3.0f);
        obj.f28962c = f17;
        obj.d = f12 + f16;
        obj.f28965i = this.f29219r;
        org.telegram.ui.Cells.z9 z9Var = this.f29220s;
        obj.f28966j = z9Var;
        if (z9Var != null) {
            obj.f28967k = z9Var.getX();
            obj.f28968l = z9Var.getY();
        }
        nj0 nj0Var = this.f29218q;
        if (nj0Var != null) {
            float f19 = nj0Var.d;
            nj0Var.h = (f19 + f17) / 2.0f;
            obj.f28964g = (f19 + f17) / 2.0f;
        }
        this.f29213l.add(obj);
        this.f29218q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float d = this.f29212k.d(1.0f, false);
        canvas.save();
        boolean z10 = this.f29208f;
        org.telegram.ui.Cells.t1 t1Var = this.f29205a;
        dr drVar = this.f29211j;
        Paint paint = this.f29210i;
        if (z10) {
            int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp) {
                this.h = lerp;
                paint.setPathEffect(new CornerPathEffect(lerp));
            }
            drVar.rewind();
            int H2 = t1Var.H2(this.f29209g);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t1Var.getBackgroundDrawableLeft(), t1Var.G2(H2), t1Var.getBackgroundDrawableRight(), t1Var.F2(H2));
            AndroidUtilities.lerp(rect2, rectF, d, rectF);
            drVar.addRect(rectF, Path.Direction.CW);
            drVar.a();
        } else if (this.e) {
            int lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), 0, d);
            if (this.h != lerp2) {
                this.h = lerp2;
                paint.setPathEffect(new CornerPathEffect(lerp2));
            }
            drVar.rewind();
            int N2 = t1Var.N2(-this.f29207c);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(t1Var.getBackgroundDrawableLeft(), t1Var.G2(N2), t1Var.getBackgroundDrawableRight(), t1Var.F2(N2));
            AndroidUtilities.lerp(rect2, rectF2, d, rectF2);
            drVar.addRect(rectF2, Path.Direction.CW);
            drVar.a();
        } else {
            int i11 = this.f29221t;
            ArrayList arrayList2 = this.f29213l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                dr drVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f29222u;
                    if (i13 >= size) {
                        break;
                    }
                    nj0 nj0Var = (nj0) arrayList2.get(i13);
                    if (drVar2 == null || nj0Var.e) {
                        if (drVar2 != null) {
                            drVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new dr());
                        }
                        drVar2 = (dr) arrayList.get(i12);
                        drVar2.rewind();
                    }
                    dr drVar3 = drVar2;
                    b(drVar3, nj0Var, f7, f10, rect2, d);
                    drVar2 = drVar3;
                    i13++;
                }
                if (drVar2 != null) {
                    drVar2.a();
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
            drVar.rewind();
            while (i10 < arrayList2.size()) {
                b(drVar, (nj0) arrayList2.get(i10), f7, f10, rect2, d);
                i10++;
                rect2 = rect;
            }
            drVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(drVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29213l;
            if (i10 < arrayList.size()) {
                nj0 nj0Var = (nj0) arrayList.get(i10);
                if (i10 == 0 || ((nj0) arrayList.get(i10 - 1)).f28965i != nj0Var.f28965i) {
                    nj0Var.e = true;
                    nj0Var.f28962c -= AndroidUtilities.dp(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((nj0) arrayList.get(i10 + 1)).f28965i != nj0Var.f28965i) {
                    nj0Var.f28963f = true;
                    nj0Var.d += AndroidUtilities.dp(0.66f);
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

    public oj0(final org.telegram.ui.Cells.t1 t1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f29210i = paint;
        this.f29211j = new dr();
        this.f29213l = new ArrayList();
        this.f29214m = new ArrayList();
        this.f29221t = 1;
        this.f29222u = new ArrayList();
        this.f29205a = t1Var;
        this.f29212k = new f6(0.0f, new Runnable() {
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
        }, 350L, 420L, bs.h);
        this.f29206b = i10;
        this.f29209g = bArr;
        this.f29207c = 0;
        this.d = 0;
        this.e = false;
        this.f29208f = true;
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
    }

    public oj0(final org.telegram.ui.Cells.t1 t1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f29210i = paint;
        this.f29211j = new dr();
        this.f29213l = new ArrayList();
        this.f29214m = new ArrayList();
        this.f29221t = 1;
        this.f29222u = new ArrayList();
        this.f29205a = null;
        this.f29212k = new f6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        t1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        t1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, bs.h);
        this.f29206b = i10;
        this.f29207c = i11;
        this.d = i12;
        this.e = false;
        this.f29208f = false;
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
                this.f29215n = f10;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    this.f29215n = f10 + AndroidUtilities.dp(10.0f);
                }
                this.f29216o = textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop;
                this.f29217p = textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0.0f;
                z10 = z10 || AndroidUtilities.isRTL(textLayoutBlock.textLayout.getText());
                if (z10) {
                    textLayoutBlock.textLayout.getSelectionPath(max, min, this);
                } else {
                    e(textLayoutBlock.textLayout, max, min);
                }
                if (textLayoutBlock.quoteCollapse && textLayoutBlock.collapsed()) {
                    this.f29214m.add(Integer.valueOf(textLayoutBlock.index));
                }
            }
        }
        d();
    }

    public oj0(final org.telegram.ui.Cells.t1 t1Var, final ViewParent viewParent, int i10, RichMessageLayout richMessageLayout, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29210i = paint;
        this.f29211j = new dr();
        this.f29213l = new ArrayList();
        this.f29214m = new ArrayList();
        this.f29221t = 1;
        this.f29222u = new ArrayList();
        this.f29205a = null;
        this.f29212k = new f6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        t1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        t1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, bs.h);
        this.f29206b = i10;
        this.f29207c = i11;
        this.d = i12;
        this.e = false;
        this.f29208f = false;
        if (richMessageLayout == null) {
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        this.h = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        this.f29217p = -3.4028235E38f;
        for (int i13 = 0; i13 < richMessageLayout.textBlocks.size(); i13++) {
            org.telegram.ui.Cells.z9 z9Var = richMessageLayout.textBlocks.get(i13);
            Layout layout = z9Var == null ? null : z9Var.getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i13).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(i11 - intValue, length, 0);
                int clamp2 = Utilities.clamp(i12 - intValue, length, 0);
                if (clamp < clamp2) {
                    this.f29215n = z9Var.getX();
                    this.f29216o = z9Var.getY();
                    this.f29220s = z9Var;
                    this.f29218q = null;
                    int size = this.f29213l.size();
                    if (AndroidUtilities.isRTL(layout.getText())) {
                        layout.getSelectionPath(clamp, clamp2, this);
                    } else {
                        e(layout, clamp, clamp2);
                    }
                    if (this.f29213l.size() > size) {
                        this.f29219r++;
                    }
                }
            }
        }
        this.f29221t = Math.max(1, this.f29219r);
        d();
    }
}
