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
public final class ch0 extends Path {
    public final org.telegram.ui.Cells.q1 f33996a;
    public final int f33997b;
    public final int f33998c;
    public final int d;
    public final boolean f33999e;
    public final boolean f34000f;
    public final byte[] f34001g;
    public int h;
    public final Paint f34002i;
    public final pq f34003j;
    public final c6 f34004k;
    public final ArrayList f34005l;
    public final ArrayList f34006m;
    public final float f34007n;
    public final float f34008o;
    public final float f34009p;
    public bh0 f34010q;
    public final int f34011r;
    public final org.telegram.ui.Cells.t9 f34012s;
    public final int f34013t;
    public final ArrayList f34014u;

    public ch0(final org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f34002i = paint;
        this.f34003j = new pq();
        this.f34005l = new ArrayList();
        this.f34006m = new ArrayList();
        this.f34013t = 1;
        this.f34014u = new ArrayList();
        this.f33996a = q1Var;
        this.f34004k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, lr.h);
        this.f33997b = i7;
        int i11 = -i10;
        this.f33998c = i11;
        this.d = i11;
        this.f33999e = true;
        this.f34000f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(pq pqVar, bh0 bh0Var, float f10, float f11, Rect rect, float f12) {
        org.telegram.ui.Cells.t9 t9Var;
        float f13;
        org.telegram.ui.Cells.t9 t9Var2;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (bh0Var.f33695j != null) {
            f13 = t9Var.getX() - bh0Var.f33696k;
        } else {
            f13 = 0.0f;
        }
        if (bh0Var.f33695j != null) {
            f16 = t9Var2.getY() - bh0Var.f33697l;
        }
        float T1 = org.telegram.messenger.g0.T1(rect.left - f10, bh0Var.f33688a + f13, f12);
        if (bh0Var.f33691e) {
            f14 = rect.top - f11;
        } else {
            f14 = bh0Var.f33693g + f16;
        }
        float T12 = org.telegram.messenger.g0.T1(f14, bh0Var.f33690c + f16, f12);
        float T13 = org.telegram.messenger.g0.T1(rect.right - f10, bh0Var.f33689b + f13, f12);
        if (bh0Var.f33692f) {
            f15 = rect.bottom - f11;
        } else {
            f15 = bh0Var.h + f16;
        }
        pqVar.addRect(T1, T12, T13, org.telegram.messenger.g0.T1(f15, bh0Var.d + f16, f12), Path.Direction.CW);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f34009p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f34007n;
        float f16 = max + f15;
        float f17 = this.f34008o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f33688a = f16 - org.telegram.messenger.g0.L(3.0f);
        obj.f33689b = f19 + org.telegram.messenger.g0.L(3.0f);
        obj.f33690c = f18;
        obj.d = f13 + f17;
        obj.f33694i = this.f34011r;
        org.telegram.ui.Cells.t9 t9Var = this.f34012s;
        obj.f33695j = t9Var;
        if (t9Var != null) {
            obj.f33696k = t9Var.getX();
            obj.f33697l = t9Var.getY();
        }
        bh0 bh0Var = this.f34010q;
        if (bh0Var != null) {
            float f20 = bh0Var.d;
            bh0Var.h = (f20 + f18) / 2.0f;
            obj.f33693g = (f20 + f18) / 2.0f;
        }
        this.f34005l.add(obj);
        this.f34010q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i7 = 0;
        float e10 = this.f34004k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f34000f;
        pq pqVar = this.f34003j;
        org.telegram.ui.Cells.q1 q1Var = this.f33996a;
        Paint paint = this.f34002i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            pqVar.rewind();
            int W12 = q1Var.W1(this.f34001g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.V1(W12), q1Var.getBackgroundDrawableRight(), q1Var.U1(W12));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            pqVar.addRect(rectF, Path.Direction.CW);
            pqVar.a();
        } else if (this.f33999e) {
            int W13 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W13) {
                this.h = W13;
                paint.setPathEffect(new CornerPathEffect(W13));
            }
            pqVar.rewind();
            int c22 = q1Var.c2(-this.f33998c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.V1(c22), q1Var.getBackgroundDrawableRight(), q1Var.U1(c22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            pqVar.addRect(rectF2, Path.Direction.CW);
            pqVar.a();
        } else {
            int i10 = this.f34013t;
            ArrayList arrayList2 = this.f34005l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                pq pqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f34014u;
                    if (i12 >= size) {
                        break;
                    }
                    bh0 bh0Var = (bh0) arrayList2.get(i12);
                    if (pqVar2 == null || bh0Var.f33691e) {
                        if (pqVar2 != null) {
                            pqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new pq());
                        }
                        pqVar2 = (pq) arrayList.get(i11);
                        pqVar2.rewind();
                    }
                    pq pqVar3 = pqVar2;
                    b(pqVar3, bh0Var, f10, f11, rect2, e10);
                    pqVar2 = pqVar3;
                    i12++;
                }
                if (pqVar2 != null) {
                    pqVar2.a();
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
            pqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(pqVar, (bh0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            pqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(pqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f34005l;
            if (i7 < arrayList.size()) {
                bh0 bh0Var = (bh0) arrayList.get(i7);
                if (i7 == 0 || ((bh0) arrayList.get(i7 - 1)).f33694i != bh0Var.f33694i) {
                    bh0Var.f33691e = true;
                    bh0Var.f33690c -= org.telegram.messenger.g0.L(0.66f);
                }
                if (i7 == arrayList.size() - 1 || ((bh0) arrayList.get(i7 + 1)).f33694i != bh0Var.f33694i) {
                    bh0Var.f33692f = true;
                    bh0Var.d += org.telegram.messenger.g0.L(0.66f);
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

    public ch0(final org.telegram.ui.Cells.q1 q1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f34002i = paint;
        this.f34003j = new pq();
        this.f34005l = new ArrayList();
        this.f34006m = new ArrayList();
        this.f34013t = 1;
        this.f34014u = new ArrayList();
        this.f33996a = q1Var;
        this.f34004k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, lr.h);
        this.f33997b = i7;
        this.f34001g = bArr;
        this.f33998c = 0;
        this.d = 0;
        this.f33999e = false;
        this.f34000f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public ch0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.f34002i = paint;
        this.f34003j = new pq();
        this.f34005l = new ArrayList();
        this.f34006m = new ArrayList();
        this.f34013t = 1;
        this.f34014u = new ArrayList();
        this.f33996a = null;
        this.f34004k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, lr.h);
        this.f33997b = i7;
        this.f33998c = i10;
        this.d = i11;
        this.f33999e = false;
        this.f34000f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i13);
            if (cjVar != null && i10 <= cjVar.f23367r && i11 >= (i12 = cjVar.f23366n)) {
                int max = Math.max(0, i10 - i12);
                int i14 = cjVar.f23366n;
                int min = Math.min(i11 - i14, cjVar.f23367r - i14);
                float f11 = -f10;
                this.f34007n = f11;
                if (cjVar.I && !cjVar.J) {
                    this.f34007n = f11 + (cjVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.f34008o = cjVar.o(arrayList) + cjVar.f23365f;
                this.f34009p = cjVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(cjVar.f23364e.getText());
                if (z10) {
                    cjVar.f23364e.getSelectionPath(max, min, this);
                } else {
                    e(cjVar.f23364e, max, min);
                }
                if (cjVar.K && cjVar.f()) {
                    this.f34006m.add(Integer.valueOf(cjVar.f23363c));
                }
            }
        }
        d();
    }

    public ch0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, org.telegram.messenger.ev evVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f34002i = paint;
        this.f34003j = new pq();
        this.f34005l = new ArrayList();
        this.f34006m = new ArrayList();
        this.f34013t = 1;
        this.f34014u = new ArrayList();
        this.f33996a = null;
        this.f34004k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, lr.h);
        this.f33997b = i7;
        this.f33998c = i10;
        this.d = i11;
        this.f33999e = false;
        this.f34000f = false;
        if (evVar == null) {
            return;
        }
        ArrayList arrayList = evVar.f23781n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f34009p = -3.4028235E38f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i12);
            Layout a10 = t9Var == null ? null : t9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) evVar.f23782o.get(i12)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.f34007n = t9Var.getX();
                    this.f34008o = t9Var.getY();
                    this.f34012s = t9Var;
                    this.f34010q = null;
                    int size = this.f34005l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j3, j10, this);
                    } else {
                        e(a10, j3, j10);
                    }
                    if (this.f34005l.size() > size) {
                        this.f34011r++;
                    }
                }
            }
        }
        this.f34013t = Math.max(1, this.f34011r);
        d();
    }
}
