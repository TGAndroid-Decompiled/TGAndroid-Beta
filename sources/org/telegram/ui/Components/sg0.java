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
    public final org.telegram.ui.Cells.q1 f39303a;
    public final int f39304b;
    public final int f39305c;
    public final int d;
    public final boolean f39306e;
    public final boolean f39307f;
    public final byte[] f39308g;
    public int h;
    public final Paint f39309i;
    public final iq f39310j;
    public final u5 f39311k;
    public final ArrayList f39312l;
    public final ArrayList f39313m;
    public final float f39314n;
    public final float f39315o;
    public final float f39316p;
    public rg0 f39317q;
    public final int f39318r;
    public final org.telegram.ui.Cells.s9 f39319s;
    public final int f39320t;
    public final ArrayList f39321u;

    public sg0(final org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f39309i = paint;
        this.f39310j = new iq();
        this.f39312l = new ArrayList();
        this.f39313m = new ArrayList();
        this.f39320t = 1;
        this.f39321u = new ArrayList();
        this.f39303a = q1Var;
        this.f39311k = new u5(0.0f, new Runnable() {
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
        }, 350L, 420L, er.h);
        this.f39304b = i7;
        int i11 = -i10;
        this.f39305c = i11;
        this.d = i11;
        this.f39306e = true;
        this.f39307f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(iq iqVar, rg0 rg0Var, float f10, float f11, Rect rect, float f12) {
        org.telegram.ui.Cells.s9 s9Var;
        float f13;
        org.telegram.ui.Cells.s9 s9Var2;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (rg0Var.f38976j != null) {
            f13 = s9Var.getX() - rg0Var.f38977k;
        } else {
            f13 = 0.0f;
        }
        if (rg0Var.f38976j != null) {
            f16 = s9Var2.getY() - rg0Var.f38978l;
        }
        float T1 = org.telegram.messenger.g0.T1(rect.left - f10, rg0Var.f38969a + f13, f12);
        if (rg0Var.f38972e) {
            f14 = rect.top - f11;
        } else {
            f14 = rg0Var.f38974g + f16;
        }
        float T12 = org.telegram.messenger.g0.T1(f14, rg0Var.f38971c + f16, f12);
        float T13 = org.telegram.messenger.g0.T1(rect.right - f10, rg0Var.f38970b + f13, f12);
        if (rg0Var.f38973f) {
            f15 = rect.bottom - f11;
        } else {
            f15 = rg0Var.h + f16;
        }
        iqVar.addRect(T1, T12, T13, org.telegram.messenger.g0.T1(f15, rg0Var.d + f16, f12), Path.Direction.CW);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f39316p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f39314n;
        float f16 = max + f15;
        float f17 = this.f39315o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f38969a = f16 - org.telegram.messenger.g0.L(3.0f);
        obj.f38970b = f19 + org.telegram.messenger.g0.L(3.0f);
        obj.f38971c = f18;
        obj.d = f13 + f17;
        obj.f38975i = this.f39318r;
        org.telegram.ui.Cells.s9 s9Var = this.f39319s;
        obj.f38976j = s9Var;
        if (s9Var != null) {
            obj.f38977k = s9Var.getX();
            obj.f38978l = s9Var.getY();
        }
        rg0 rg0Var = this.f39317q;
        if (rg0Var != null) {
            float f20 = rg0Var.d;
            rg0Var.h = (f20 + f18) / 2.0f;
            obj.f38974g = (f20 + f18) / 2.0f;
        }
        this.f39312l.add(obj);
        this.f39317q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i7 = 0;
        float e10 = this.f39311k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f39307f;
        iq iqVar = this.f39310j;
        org.telegram.ui.Cells.q1 q1Var = this.f39303a;
        Paint paint = this.f39309i;
        if (z10) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            iqVar.rewind();
            int W12 = q1Var.W1(this.f39308g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.V1(W12), q1Var.getBackgroundDrawableRight(), q1Var.U1(W12));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            iqVar.addRect(rectF, Path.Direction.CW);
            iqVar.a();
        } else if (this.f39306e) {
            int W13 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W13) {
                this.h = W13;
                paint.setPathEffect(new CornerPathEffect(W13));
            }
            iqVar.rewind();
            int c22 = q1Var.c2(-this.f39305c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.V1(c22), q1Var.getBackgroundDrawableRight(), q1Var.U1(c22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            iqVar.addRect(rectF2, Path.Direction.CW);
            iqVar.a();
        } else {
            int i10 = this.f39320t;
            ArrayList arrayList2 = this.f39312l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                iq iqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f39321u;
                    if (i12 >= size) {
                        break;
                    }
                    rg0 rg0Var = (rg0) arrayList2.get(i12);
                    if (iqVar2 == null || rg0Var.f38972e) {
                        if (iqVar2 != null) {
                            iqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new iq());
                        }
                        iqVar2 = (iq) arrayList.get(i11);
                        iqVar2.rewind();
                    }
                    iq iqVar3 = iqVar2;
                    b(iqVar3, rg0Var, f10, f11, rect2, e10);
                    iqVar2 = iqVar3;
                    i12++;
                }
                if (iqVar2 != null) {
                    iqVar2.a();
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
            iqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(iqVar, (rg0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            iqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(iqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f39312l;
            if (i7 < arrayList.size()) {
                rg0 rg0Var = (rg0) arrayList.get(i7);
                if (i7 == 0 || ((rg0) arrayList.get(i7 - 1)).f38975i != rg0Var.f38975i) {
                    rg0Var.f38972e = true;
                    rg0Var.f38971c -= org.telegram.messenger.g0.L(0.66f);
                }
                if (i7 == arrayList.size() - 1 || ((rg0) arrayList.get(i7 + 1)).f38975i != rg0Var.f38975i) {
                    rg0Var.f38973f = true;
                    rg0Var.d += org.telegram.messenger.g0.L(0.66f);
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

    public sg0(final org.telegram.ui.Cells.q1 q1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f39309i = paint;
        this.f39310j = new iq();
        this.f39312l = new ArrayList();
        this.f39313m = new ArrayList();
        this.f39320t = 1;
        this.f39321u = new ArrayList();
        this.f39303a = q1Var;
        this.f39311k = new u5(0.0f, new Runnable() {
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
        }, 350L, 420L, er.h);
        this.f39304b = i7;
        this.f39308g = bArr;
        this.f39305c = 0;
        this.d = 0;
        this.f39306e = false;
        this.f39307f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.f39309i = paint;
        this.f39310j = new iq();
        this.f39312l = new ArrayList();
        this.f39313m = new ArrayList();
        this.f39320t = 1;
        this.f39321u = new ArrayList();
        this.f39303a = null;
        this.f39311k = new u5(0.0f, new Runnable() {
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
        }, 350L, 420L, er.h);
        this.f39304b = i7;
        this.f39305c = i10;
        this.d = i11;
        this.f39306e = false;
        this.f39307f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) arrayList.get(i13);
            if (djVar != null && i10 <= djVar.f23096r && i11 >= (i12 = djVar.f23095n)) {
                int max = Math.max(0, i10 - i12);
                int i14 = djVar.f23095n;
                int min = Math.min(i11 - i14, djVar.f23096r - i14);
                float f11 = -f10;
                this.f39314n = f11;
                if (djVar.I && !djVar.J) {
                    this.f39314n = f11 + (djVar.V ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.f39315o = djVar.o(arrayList) + djVar.f23094f;
                this.f39316p = djVar.J ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.g0.L1(djVar.f23093e.getText());
                if (z10) {
                    djVar.f23093e.getSelectionPath(max, min, this);
                } else {
                    e(djVar.f23093e, max, min);
                }
                if (djVar.K && djVar.f()) {
                    this.f39313m.add(Integer.valueOf(djVar.f23092c));
                }
            }
        }
        d();
    }

    public sg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, org.telegram.messenger.iv ivVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f39309i = paint;
        this.f39310j = new iq();
        this.f39312l = new ArrayList();
        this.f39313m = new ArrayList();
        this.f39320t = 1;
        this.f39321u = new ArrayList();
        this.f39303a = null;
        this.f39311k = new u5(0.0f, new Runnable() {
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
        }, 350L, 420L, er.h);
        this.f39304b = i7;
        this.f39305c = i10;
        this.d = i11;
        this.f39306e = false;
        this.f39307f = false;
        if (ivVar == null) {
            return;
        }
        ArrayList arrayList = ivVar.f24451n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f39316p = -3.4028235E38f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i12);
            Layout a10 = s9Var == null ? null : s9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) ivVar.f24452o.get(i12)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.f39314n = s9Var.getX();
                    this.f39315o = s9Var.getY();
                    this.f39319s = s9Var;
                    this.f39317q = null;
                    int size = this.f39312l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j3, j10, this);
                    } else {
                        e(a10, j3, j10);
                    }
                    if (this.f39312l.size() > size) {
                        this.f39318r++;
                    }
                }
            }
        }
        this.f39320t = Math.max(1, this.f39318r);
        d();
    }
}
