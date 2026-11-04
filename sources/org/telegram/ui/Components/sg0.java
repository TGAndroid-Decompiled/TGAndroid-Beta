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
import org.telegram.messenger.Utilities;
public final class sg0 extends Path {
    public final org.telegram.ui.Cells.q1 f38012a;
    public final int f38013b;
    public final int f38014c;
    public final int d;
    public final boolean f38015e;
    public final boolean f38016f;
    public final byte[] f38017g;
    public int h;
    public final Paint f38018i;
    public final bq f38019j;
    public final u5 f38020k;
    public final ArrayList f38021l;
    public final ArrayList f38022m;
    public final float f38023n;
    public final float f38024o;
    public final float f38025p;
    public rg0 f38026q;
    public final int f38027r;
    public final org.telegram.ui.Cells.s9 f38028s;
    public final int f38029t;
    public final ArrayList f38030u;

    public sg0(final org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
        Paint paint = new Paint(1);
        this.f38018i = paint;
        this.f38019j = new bq();
        this.f38021l = new ArrayList();
        this.f38022m = new ArrayList();
        this.f38029t = 1;
        this.f38030u = new ArrayList();
        this.f38012a = q1Var;
        this.f38020k = new u5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
                        if (q1Var2 != null) {
                            q1Var2.invalidate();
                        }
                        if (q1Var2.getParent() instanceof View) {
                            ((View) q1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q1 q1Var3 = q1Var;
                        if (q1Var3 != null) {
                            q1Var3.invalidate();
                        }
                        if (q1Var3.getParent() instanceof View) {
                            ((View) q1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, xq.h);
        this.f38013b = i3;
        int i11 = -i10;
        this.f38014c = i11;
        this.d = i11;
        this.f38015e = true;
        this.f38016f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(bq bqVar, rg0 rg0Var, float f10, float f11, Rect rect, float f12) {
        org.telegram.ui.Cells.s9 s9Var;
        float f13;
        org.telegram.ui.Cells.s9 s9Var2;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (rg0Var.f37728j != null) {
            f13 = s9Var.getX() - rg0Var.f37729k;
        } else {
            f13 = 0.0f;
        }
        if (rg0Var.f37728j != null) {
            f16 = s9Var2.getY() - rg0Var.f37730l;
        }
        float T1 = org.telegram.messenger.g0.T1(rect.left - f10, rg0Var.f37721a + f13, f12);
        if (rg0Var.f37724e) {
            f14 = rect.top - f11;
        } else {
            f14 = rg0Var.f37726g + f16;
        }
        float T12 = org.telegram.messenger.g0.T1(f14, rg0Var.f37723c + f16, f12);
        float T13 = org.telegram.messenger.g0.T1(rect.right - f10, rg0Var.f37722b + f13, f12);
        if (rg0Var.f37725f) {
            f15 = rect.bottom - f11;
        } else {
            f15 = rg0Var.h + f16;
        }
        bqVar.addRect(T1, T12, T13, org.telegram.messenger.g0.T1(f15, rg0Var.d + f16, f12), Path.Direction.CW);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f38025p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f38023n;
        float f16 = max + f15;
        float f17 = this.f38024o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f37721a = f16 - org.telegram.messenger.g0.L(3.0f);
        obj.f37722b = f19 + org.telegram.messenger.g0.L(3.0f);
        obj.f37723c = f18;
        obj.d = f13 + f17;
        obj.f37727i = this.f38027r;
        org.telegram.ui.Cells.s9 s9Var = this.f38028s;
        obj.f37728j = s9Var;
        if (s9Var != null) {
            obj.f37729k = s9Var.getX();
            obj.f37730l = s9Var.getY();
        }
        rg0 rg0Var = this.f38026q;
        if (rg0Var != null) {
            float f20 = rg0Var.d;
            rg0Var.h = (f20 + f18) / 2.0f;
            obj.f37726g = (f20 + f18) / 2.0f;
        }
        this.f38021l.add(obj);
        this.f38026q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i3 = 0;
        float e10 = this.f38020k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f38016f;
        bq bqVar = this.f38019j;
        org.telegram.ui.Cells.q1 q1Var = this.f38012a;
        Paint paint = this.f38018i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            bqVar.rewind();
            int V1 = q1Var.V1(this.f38017g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(V1), q1Var.getBackgroundDrawableRight(), q1Var.T1(V1));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            bqVar.addRect(rectF, Path.Direction.CW);
            bqVar.a();
        } else if (this.f38015e) {
            int W12 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W12) {
                this.h = W12;
                paint.setPathEffect(new CornerPathEffect(W12));
            }
            bqVar.rewind();
            int b22 = q1Var.b2(-this.f38014c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(b22), q1Var.getBackgroundDrawableRight(), q1Var.T1(b22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            bqVar.addRect(rectF2, Path.Direction.CW);
            bqVar.a();
        } else {
            int i10 = this.f38029t;
            ArrayList arrayList2 = this.f38021l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                bq bqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f38030u;
                    if (i12 >= size) {
                        break;
                    }
                    rg0 rg0Var = (rg0) arrayList2.get(i12);
                    if (bqVar2 == null || rg0Var.f37724e) {
                        if (bqVar2 != null) {
                            bqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new bq());
                        }
                        bqVar2 = (bq) arrayList.get(i11);
                        bqVar2.rewind();
                    }
                    bq bqVar3 = bqVar2;
                    b(bqVar3, rg0Var, f10, f11, rect2, e10);
                    bqVar2 = bqVar3;
                    i12++;
                }
                if (bqVar2 != null) {
                    bqVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f10, rect2.top - f11, rect2.right - f10, rect2.bottom - f11, (int) (alpha * f12), 31);
                paint.setAlpha(255);
                while (i3 <= i11) {
                    canvas.drawPath((Path) arrayList.get(i3), paint);
                    i3++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f10, f11);
            bqVar.rewind();
            while (i3 < arrayList2.size()) {
                b(bqVar, (rg0) arrayList2.get(i3), f10, f11, rect2, e10);
                i3++;
                rect2 = rect;
            }
            bqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(bqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f38021l;
            if (i3 < arrayList.size()) {
                rg0 rg0Var = (rg0) arrayList.get(i3);
                if (i3 == 0 || ((rg0) arrayList.get(i3 - 1)).f37727i != rg0Var.f37727i) {
                    rg0Var.f37724e = true;
                    rg0Var.f37723c -= org.telegram.messenger.g0.L(0.66f);
                }
                if (i3 == arrayList.size() - 1 || ((rg0) arrayList.get(i3 + 1)).f37727i != rg0Var.f37727i) {
                    rg0Var.f37725f = true;
                    rg0Var.d += org.telegram.messenger.g0.L(0.66f);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void e(Layout layout, int i3, int i10) {
        float lineLeft;
        float lineRight;
        if (i3 != i10) {
            if (i10 < i3) {
                i10 = i3;
                i3 = i10;
            }
            int lineForOffset = layout.getLineForOffset(i3);
            int lineForOffset2 = layout.getLineForOffset(i10);
            for (int i11 = lineForOffset; i11 <= lineForOffset2; i11++) {
                int lineStart = layout.getLineStart(i11);
                int lineEnd = layout.getLineEnd(i11);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    if (i11 == lineForOffset && i3 > lineStart) {
                        lineLeft = layout.getPrimaryHorizontal(i3);
                    } else {
                        lineLeft = layout.getLineLeft(i11);
                    }
                    if (i11 == lineForOffset2 && i10 < lineEnd) {
                        lineRight = layout.getPrimaryHorizontal(i10);
                    } else {
                        lineRight = layout.getLineRight(i11);
                    }
                    a(Math.min(lineLeft, lineRight), layout.getLineTop(i11), Math.max(lineLeft, lineRight), layout.getLineBottom(i11));
                }
            }
        }
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, int i3, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f38018i = paint;
        this.f38019j = new bq();
        this.f38021l = new ArrayList();
        this.f38022m = new ArrayList();
        this.f38029t = 1;
        this.f38030u = new ArrayList();
        this.f38012a = q1Var;
        this.f38020k = new u5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
                        if (q1Var2 != null) {
                            q1Var2.invalidate();
                        }
                        if (q1Var2.getParent() instanceof View) {
                            ((View) q1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q1 q1Var3 = q1Var;
                        if (q1Var3 != null) {
                            q1Var3.invalidate();
                        }
                        if (q1Var3.getParent() instanceof View) {
                            ((View) q1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, xq.h);
        this.f38013b = i3;
        this.f38017g = bArr;
        this.f38014c = 0;
        this.d = 0;
        this.f38015e = false;
        this.f38016f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i3, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.f38018i = paint;
        this.f38019j = new bq();
        this.f38021l = new ArrayList();
        this.f38022m = new ArrayList();
        this.f38029t = 1;
        this.f38030u = new ArrayList();
        this.f38012a = null;
        this.f38020k = new u5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        q1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        q1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, xq.h);
        this.f38013b = i3;
        this.f38014c = i10;
        this.d = i11;
        this.f38015e = false;
        this.f38016f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i13);
            if (wiVar != null && i10 <= wiVar.f26213r && i11 >= (i12 = wiVar.f26212n)) {
                int max = Math.max(0, i10 - i12);
                int i14 = wiVar.f26212n;
                int min = Math.min(i11 - i14, wiVar.f26213r - i14);
                float f11 = -f10;
                this.f38023n = f11;
                if (wiVar.I && !wiVar.J) {
                    this.f38023n = f11 + (wiVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.f38024o = wiVar.o(arrayList) + wiVar.f26211f;
                this.f38025p = wiVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(wiVar.f26210e.getText());
                if (z10) {
                    wiVar.f26210e.getSelectionPath(max, min, this);
                } else {
                    e(wiVar.f26210e, max, min);
                }
                if (wiVar.K && wiVar.f()) {
                    this.f38022m.add(Integer.valueOf(wiVar.f26209c));
                }
            }
        }
        d();
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i3, org.telegram.messenger.cv cvVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f38018i = paint;
        this.f38019j = new bq();
        this.f38021l = new ArrayList();
        this.f38022m = new ArrayList();
        this.f38029t = 1;
        this.f38030u = new ArrayList();
        this.f38012a = null;
        this.f38020k = new u5(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        q1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        q1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, xq.h);
        this.f38013b = i3;
        this.f38014c = i10;
        this.d = i11;
        this.f38015e = false;
        this.f38016f = false;
        if (cvVar == null) {
            return;
        }
        ArrayList arrayList = cvVar.f22076n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f38025p = -3.4028235E38f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i12);
            Layout a10 = s9Var == null ? null : s9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) cvVar.f22077o.get(i12)).intValue();
                int length = a10.getText().length();
                int j10 = Utilities.j(i10 - intValue, length, 0);
                int j11 = Utilities.j(i11 - intValue, length, 0);
                if (j10 < j11) {
                    this.f38023n = s9Var.getX();
                    this.f38024o = s9Var.getY();
                    this.f38028s = s9Var;
                    this.f38026q = null;
                    int size = this.f38021l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j10, j11, this);
                    } else {
                        e(a10, j10, j11);
                    }
                    if (this.f38021l.size() > size) {
                        this.f38027r++;
                    }
                }
            }
        }
        this.f38029t = Math.max(1, this.f38027r);
        d();
    }
}
