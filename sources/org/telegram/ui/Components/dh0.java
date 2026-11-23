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
public final class dh0 extends Path {
    public final org.telegram.ui.Cells.r1 f34331a;
    public final int f34332b;
    public final int f34333c;
    public final int d;
    public final boolean f34334e;
    public final boolean f34335f;
    public final byte[] f34336g;
    public int h;
    public final Paint f34337i;
    public final oq f34338j;
    public final c6 f34339k;
    public final ArrayList f34340l;
    public final ArrayList f34341m;
    public final float f34342n;
    public final float f34343o;
    public final float f34344p;
    public ch0 f34345q;
    public final int f34346r;
    public final org.telegram.ui.Cells.t9 f34347s;
    public final int f34348t;
    public final ArrayList f34349u;

    public dh0(final org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f34337i = paint;
        this.f34338j = new oq();
        this.f34340l = new ArrayList();
        this.f34341m = new ArrayList();
        this.f34348t = 1;
        this.f34349u = new ArrayList();
        this.f34331a = r1Var;
        this.f34339k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, kr.h);
        this.f34332b = i7;
        int i11 = -i10;
        this.f34333c = i11;
        this.d = i11;
        this.f34334e = true;
        this.f34335f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(oq oqVar, ch0 ch0Var, float f10, float f11, Rect rect, float f12) {
        org.telegram.ui.Cells.t9 t9Var;
        float f13;
        org.telegram.ui.Cells.t9 t9Var2;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (ch0Var.f34063j != null) {
            f13 = t9Var.getX() - ch0Var.f34064k;
        } else {
            f13 = 0.0f;
        }
        if (ch0Var.f34063j != null) {
            f16 = t9Var2.getY() - ch0Var.f34065l;
        }
        float T1 = org.telegram.messenger.g0.T1(rect.left - f10, ch0Var.f34056a + f13, f12);
        if (ch0Var.f34059e) {
            f14 = rect.top - f11;
        } else {
            f14 = ch0Var.f34061g + f16;
        }
        float T12 = org.telegram.messenger.g0.T1(f14, ch0Var.f34058c + f16, f12);
        float T13 = org.telegram.messenger.g0.T1(rect.right - f10, ch0Var.f34057b + f13, f12);
        if (ch0Var.f34060f) {
            f15 = rect.bottom - f11;
        } else {
            f15 = ch0Var.h + f16;
        }
        oqVar.addRect(T1, T12, T13, org.telegram.messenger.g0.T1(f15, ch0Var.d + f16, f12), Path.Direction.CW);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f34344p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f34342n;
        float f16 = max + f15;
        float f17 = this.f34343o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f34056a = f16 - org.telegram.messenger.g0.L(3.0f);
        obj.f34057b = f19 + org.telegram.messenger.g0.L(3.0f);
        obj.f34058c = f18;
        obj.d = f13 + f17;
        obj.f34062i = this.f34346r;
        org.telegram.ui.Cells.t9 t9Var = this.f34347s;
        obj.f34063j = t9Var;
        if (t9Var != null) {
            obj.f34064k = t9Var.getX();
            obj.f34065l = t9Var.getY();
        }
        ch0 ch0Var = this.f34345q;
        if (ch0Var != null) {
            float f20 = ch0Var.d;
            ch0Var.h = (f20 + f18) / 2.0f;
            obj.f34061g = (f20 + f18) / 2.0f;
        }
        this.f34340l.add(obj);
        this.f34345q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i7 = 0;
        float e10 = this.f34339k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f34335f;
        oq oqVar = this.f34338j;
        org.telegram.ui.Cells.r1 r1Var = this.f34331a;
        Paint paint = this.f34337i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            oqVar.rewind();
            int W12 = r1Var.W1(this.f34336g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r1Var.getBackgroundDrawableLeft(), r1Var.V1(W12), r1Var.getBackgroundDrawableRight(), r1Var.U1(W12));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            oqVar.addRect(rectF, Path.Direction.CW);
            oqVar.a();
        } else if (this.f34334e) {
            int W13 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W13) {
                this.h = W13;
                paint.setPathEffect(new CornerPathEffect(W13));
            }
            oqVar.rewind();
            int c22 = r1Var.c2(-this.f34333c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(r1Var.getBackgroundDrawableLeft(), r1Var.V1(c22), r1Var.getBackgroundDrawableRight(), r1Var.U1(c22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            oqVar.addRect(rectF2, Path.Direction.CW);
            oqVar.a();
        } else {
            int i10 = this.f34348t;
            ArrayList arrayList2 = this.f34340l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                oq oqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f34349u;
                    if (i12 >= size) {
                        break;
                    }
                    ch0 ch0Var = (ch0) arrayList2.get(i12);
                    if (oqVar2 == null || ch0Var.f34059e) {
                        if (oqVar2 != null) {
                            oqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new oq());
                        }
                        oqVar2 = (oq) arrayList.get(i11);
                        oqVar2.rewind();
                    }
                    oq oqVar3 = oqVar2;
                    b(oqVar3, ch0Var, f10, f11, rect2, e10);
                    oqVar2 = oqVar3;
                    i12++;
                }
                if (oqVar2 != null) {
                    oqVar2.a();
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
            oqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(oqVar, (ch0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            oqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(oqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f34340l;
            if (i7 < arrayList.size()) {
                ch0 ch0Var = (ch0) arrayList.get(i7);
                if (i7 == 0 || ((ch0) arrayList.get(i7 - 1)).f34062i != ch0Var.f34062i) {
                    ch0Var.f34059e = true;
                    ch0Var.f34058c -= org.telegram.messenger.g0.L(0.66f);
                }
                if (i7 == arrayList.size() - 1 || ((ch0) arrayList.get(i7 + 1)).f34062i != ch0Var.f34062i) {
                    ch0Var.f34060f = true;
                    ch0Var.d += org.telegram.messenger.g0.L(0.66f);
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

    public dh0(final org.telegram.ui.Cells.r1 r1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f34337i = paint;
        this.f34338j = new oq();
        this.f34340l = new ArrayList();
        this.f34341m = new ArrayList();
        this.f34348t = 1;
        this.f34349u = new ArrayList();
        this.f34331a = r1Var;
        this.f34339k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, kr.h);
        this.f34332b = i7;
        this.f34336g = bArr;
        this.f34333c = 0;
        this.d = 0;
        this.f34334e = false;
        this.f34335f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public dh0(final org.telegram.ui.Cells.r1 r1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.f34337i = paint;
        this.f34338j = new oq();
        this.f34340l = new ArrayList();
        this.f34341m = new ArrayList();
        this.f34348t = 1;
        this.f34349u = new ArrayList();
        this.f34331a = null;
        this.f34339k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, kr.h);
        this.f34332b = i7;
        this.f34333c = i10;
        this.d = i11;
        this.f34334e = false;
        this.f34335f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i13);
            if (cjVar != null && i10 <= cjVar.f23479r && i11 >= (i12 = cjVar.f23478n)) {
                int max = Math.max(0, i10 - i12);
                int i14 = cjVar.f23478n;
                int min = Math.min(i11 - i14, cjVar.f23479r - i14);
                float f11 = -f10;
                this.f34342n = f11;
                if (cjVar.I && !cjVar.J) {
                    this.f34342n = f11 + (cjVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.f34343o = cjVar.o(arrayList) + cjVar.f23477f;
                this.f34344p = cjVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(cjVar.f23476e.getText());
                if (z10) {
                    cjVar.f23476e.getSelectionPath(max, min, this);
                } else {
                    e(cjVar.f23476e, max, min);
                }
                if (cjVar.K && cjVar.f()) {
                    this.f34341m.add(Integer.valueOf(cjVar.f23475c));
                }
            }
        }
        d();
    }

    public dh0(final org.telegram.ui.Cells.r1 r1Var, final ViewParent viewParent, int i7, org.telegram.messenger.ev evVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f34337i = paint;
        this.f34338j = new oq();
        this.f34340l = new ArrayList();
        this.f34341m = new ArrayList();
        this.f34348t = 1;
        this.f34349u = new ArrayList();
        this.f34331a = null;
        this.f34339k = new c6(0.0f, new Runnable() {
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
        }, 350L, 420L, kr.h);
        this.f34332b = i7;
        this.f34333c = i10;
        this.d = i11;
        this.f34334e = false;
        this.f34335f = false;
        if (evVar == null) {
            return;
        }
        ArrayList arrayList = evVar.f23883n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f34344p = -3.4028235E38f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i12);
            Layout a10 = t9Var == null ? null : t9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) evVar.f23884o.get(i12)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.f34342n = t9Var.getX();
                    this.f34343o = t9Var.getY();
                    this.f34347s = t9Var;
                    this.f34345q = null;
                    int size = this.f34340l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j3, j10, this);
                    } else {
                        e(a10, j3, j10);
                    }
                    if (this.f34340l.size() > size) {
                        this.f34346r++;
                    }
                }
            }
        }
        this.f34348t = Math.max(1, this.f34346r);
        d();
    }
}
