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
public final class eh0 extends Path {
    public final org.telegram.ui.Cells.r1 f34781a;
    public final int f34782b;
    public final int f34783c;
    public final int d;
    public final boolean f34784e;
    public final boolean f34785f;
    public final byte[] f34786g;
    public int h;
    public final Paint f34787i;
    public final rq f34788j;
    public final d6 f34789k;
    public final ArrayList f34790l;
    public final ArrayList f34791m;
    public final float f34792n;
    public final float f34793o;
    public final float f34794p;
    public dh0 f34795q;
    public final int f34796r;
    public final org.telegram.ui.Cells.u9 f34797s;
    public final int f34798t;
    public final ArrayList f34799u;

    public eh0(final org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f34787i = paint;
        this.f34788j = new rq();
        this.f34790l = new ArrayList();
        this.f34791m = new ArrayList();
        this.f34798t = 1;
        this.f34799u = new ArrayList();
        this.f34781a = r1Var;
        this.f34789k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Cells.r1 r1Var2 = r1Var;
                        if (r1Var2 != null) {
                            r1Var2.invalidate();
                        }
                        if (r1Var2.getParent() instanceof View) {
                            ((View) r1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.r1 r1Var3 = r1Var;
                        if (r1Var3 != null) {
                            r1Var3.invalidate();
                        }
                        if (r1Var3.getParent() instanceof View) {
                            ((View) r1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, nr.h);
        this.f34782b = i7;
        int i11 = -i10;
        this.f34783c = i11;
        this.d = i11;
        this.f34784e = true;
        this.f34785f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(rq rqVar, dh0 dh0Var, float f10, float f11, Rect rect, float f12) {
        org.telegram.ui.Cells.u9 u9Var;
        float f13;
        org.telegram.ui.Cells.u9 u9Var2;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (dh0Var.f34467j != null) {
            f13 = u9Var.getX() - dh0Var.f34468k;
        } else {
            f13 = 0.0f;
        }
        if (dh0Var.f34467j != null) {
            f16 = u9Var2.getY() - dh0Var.f34469l;
        }
        float T1 = org.telegram.messenger.g0.T1(rect.left - f10, dh0Var.f34460a + f13, f12);
        if (dh0Var.f34463e) {
            f14 = rect.top - f11;
        } else {
            f14 = dh0Var.f34465g + f16;
        }
        float T12 = org.telegram.messenger.g0.T1(f14, dh0Var.f34462c + f16, f12);
        float T13 = org.telegram.messenger.g0.T1(rect.right - f10, dh0Var.f34461b + f13, f12);
        if (dh0Var.f34464f) {
            f15 = rect.bottom - f11;
        } else {
            f15 = dh0Var.h + f16;
        }
        rqVar.addRect(T1, T12, T13, org.telegram.messenger.g0.T1(f15, dh0Var.d + f16, f12), Path.Direction.CW);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f34794p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f34792n;
        float f16 = max + f15;
        float f17 = this.f34793o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f34460a = f16 - org.telegram.messenger.g0.L(3.0f);
        obj.f34461b = f19 + org.telegram.messenger.g0.L(3.0f);
        obj.f34462c = f18;
        obj.d = f13 + f17;
        obj.f34466i = this.f34796r;
        org.telegram.ui.Cells.u9 u9Var = this.f34797s;
        obj.f34467j = u9Var;
        if (u9Var != null) {
            obj.f34468k = u9Var.getX();
            obj.f34469l = u9Var.getY();
        }
        dh0 dh0Var = this.f34795q;
        if (dh0Var != null) {
            float f20 = dh0Var.d;
            dh0Var.h = (f20 + f18) / 2.0f;
            obj.f34465g = (f20 + f18) / 2.0f;
        }
        this.f34790l.add(obj);
        this.f34795q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i7 = 0;
        float e10 = this.f34789k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f34785f;
        rq rqVar = this.f34788j;
        org.telegram.ui.Cells.r1 r1Var = this.f34781a;
        Paint paint = this.f34787i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            rqVar.rewind();
            int W12 = r1Var.W1(this.f34786g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r1Var.getBackgroundDrawableLeft(), r1Var.V1(W12), r1Var.getBackgroundDrawableRight(), r1Var.U1(W12));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            rqVar.addRect(rectF, Path.Direction.CW);
            rqVar.a();
        } else if (this.f34784e) {
            int W13 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W13) {
                this.h = W13;
                paint.setPathEffect(new CornerPathEffect(W13));
            }
            rqVar.rewind();
            int c22 = r1Var.c2(-this.f34783c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(r1Var.getBackgroundDrawableLeft(), r1Var.V1(c22), r1Var.getBackgroundDrawableRight(), r1Var.U1(c22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            rqVar.addRect(rectF2, Path.Direction.CW);
            rqVar.a();
        } else {
            int i10 = this.f34798t;
            ArrayList arrayList2 = this.f34790l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                rq rqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f34799u;
                    if (i12 >= size) {
                        break;
                    }
                    dh0 dh0Var = (dh0) arrayList2.get(i12);
                    if (rqVar2 == null || dh0Var.f34463e) {
                        if (rqVar2 != null) {
                            rqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new rq());
                        }
                        rqVar2 = (rq) arrayList.get(i11);
                        rqVar2.rewind();
                    }
                    rq rqVar3 = rqVar2;
                    b(rqVar3, dh0Var, f10, f11, rect2, e10);
                    rqVar2 = rqVar3;
                    i12++;
                }
                if (rqVar2 != null) {
                    rqVar2.a();
                }
                int alpha = paint.getAlpha();
                canvas.saveLayerAlpha(rect2.left - f10, rect2.top - f11, rect2.right - f10, rect2.bottom - f11, (int) (alpha * f12), 31);
                paint.setAlpha(255);
                while (i7 <= i11) {
                    canvas.drawPath((Path) arrayList.get(i7), paint);
                    i7++;
                }
                paint.setAlpha(alpha);
                canvas.restore();
                canvas.restore();
                return;
            }
            canvas.translate(f10, f11);
            rqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(rqVar, (dh0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            rqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(rqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f34790l;
            if (i7 < arrayList.size()) {
                dh0 dh0Var = (dh0) arrayList.get(i7);
                if (i7 == 0 || ((dh0) arrayList.get(i7 - 1)).f34466i != dh0Var.f34466i) {
                    dh0Var.f34463e = true;
                    dh0Var.f34462c -= org.telegram.messenger.g0.L(0.66f);
                }
                if (i7 == arrayList.size() - 1 || ((dh0) arrayList.get(i7 + 1)).f34466i != dh0Var.f34466i) {
                    dh0Var.f34464f = true;
                    dh0Var.d += org.telegram.messenger.g0.L(0.66f);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void e(Layout layout, int i7, int i10) {
        float lineLeft;
        float lineRight;
        if (i7 != i10) {
            if (i10 < i7) {
                i10 = i7;
                i7 = i10;
            }
            int lineForOffset = layout.getLineForOffset(i7);
            int lineForOffset2 = layout.getLineForOffset(i10);
            for (int i11 = lineForOffset; i11 <= lineForOffset2; i11++) {
                int lineStart = layout.getLineStart(i11);
                int lineEnd = layout.getLineEnd(i11);
                if (lineEnd != lineStart && (lineStart + 1 != lineEnd || !Character.isWhitespace(layout.getText().charAt(lineStart)))) {
                    if (i11 == lineForOffset && i7 > lineStart) {
                        lineLeft = layout.getPrimaryHorizontal(i7);
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

    public eh0(final org.telegram.ui.Cells.r1 r1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f34787i = paint;
        this.f34788j = new rq();
        this.f34790l = new ArrayList();
        this.f34791m = new ArrayList();
        this.f34798t = 1;
        this.f34799u = new ArrayList();
        this.f34781a = r1Var;
        this.f34789k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Cells.r1 r1Var2 = r1Var;
                        if (r1Var2 != null) {
                            r1Var2.invalidate();
                        }
                        if (r1Var2.getParent() instanceof View) {
                            ((View) r1Var2.getParent()).invalidate();
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.r1 r1Var3 = r1Var;
                        if (r1Var3 != null) {
                            r1Var3.invalidate();
                        }
                        if (r1Var3.getParent() instanceof View) {
                            ((View) r1Var3.getParent()).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, nr.h);
        this.f34782b = i7;
        this.f34786g = bArr;
        this.f34783c = 0;
        this.d = 0;
        this.f34784e = false;
        this.f34785f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public eh0(final org.telegram.ui.Cells.r1 r1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.f34787i = paint;
        this.f34788j = new rq();
        this.f34790l = new ArrayList();
        this.f34791m = new ArrayList();
        this.f34798t = 1;
        this.f34799u = new ArrayList();
        this.f34781a = null;
        this.f34789k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        r1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        r1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, nr.h);
        this.f34782b = i7;
        this.f34783c = i10;
        this.d = i11;
        this.f34784e = false;
        this.f34785f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) arrayList.get(i13);
            if (djVar != null && i10 <= djVar.f23528r && i11 >= (i12 = djVar.f23527n)) {
                int max = Math.max(0, i10 - i12);
                int i14 = djVar.f23527n;
                int min = Math.min(i11 - i14, djVar.f23528r - i14);
                float f11 = -f10;
                this.f34792n = f11;
                if (djVar.I && !djVar.J) {
                    this.f34792n = f11 + (djVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.f34793o = djVar.o(arrayList) + djVar.f23526f;
                this.f34794p = djVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(djVar.f23525e.getText());
                if (z10) {
                    djVar.f23525e.getSelectionPath(max, min, this);
                } else {
                    e(djVar.f23525e, max, min);
                }
                if (djVar.K && djVar.f()) {
                    this.f34791m.add(Integer.valueOf(djVar.f23524c));
                }
            }
        }
        d();
    }

    public eh0(final org.telegram.ui.Cells.r1 r1Var, final ViewParent viewParent, int i7, org.telegram.messenger.fv fvVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f34787i = paint;
        this.f34788j = new rq();
        this.f34790l = new ArrayList();
        this.f34791m = new ArrayList();
        this.f34798t = 1;
        this.f34799u = new ArrayList();
        this.f34781a = null;
        this.f34789k = new d6(0.0f, new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        r1Var.invalidate();
                        ViewParent viewParent2 = viewParent;
                        if (viewParent2 instanceof View) {
                            ((View) viewParent2).invalidate();
                            return;
                        }
                        return;
                    default:
                        r1Var.invalidate();
                        ViewParent viewParent3 = viewParent;
                        if (viewParent3 instanceof View) {
                            ((View) viewParent3).invalidate();
                            return;
                        }
                        return;
                }
            }
        }, 350L, 420L, nr.h);
        this.f34782b = i7;
        this.f34783c = i10;
        this.d = i11;
        this.f34784e = false;
        this.f34785f = false;
        if (fvVar == null) {
            return;
        }
        ArrayList arrayList = fvVar.f23951n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f34794p = -3.4028235E38f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i12);
            Layout a10 = u9Var == null ? null : u9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) fvVar.f23952o.get(i12)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.f34792n = u9Var.getX();
                    this.f34793o = u9Var.getY();
                    this.f34797s = u9Var;
                    this.f34795q = null;
                    int size = this.f34790l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j3, j10, this);
                    } else {
                        e(a10, j3, j10);
                    }
                    if (this.f34790l.size() > size) {
                        this.f34796r++;
                    }
                }
            }
        }
        this.f34798t = Math.max(1, this.f34796r);
        d();
    }
}
