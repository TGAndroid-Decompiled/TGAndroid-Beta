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
public final class sh0 extends Path {
    public final org.telegram.ui.Cells.q1 f30291a;
    public final int f30292b;
    public final int f30293c;
    public final int d;
    public final boolean e;
    public final boolean f30294f;
    public final byte[] f30295g;
    public int h;
    public final Paint f30296i;
    public final jq f30297j;
    public final t5 f30298k;
    public final ArrayList f30299l;
    public final ArrayList f30300m;
    public final float f30301n;
    public final float f30302o;
    public final float f30303p;
    public rh0 f30304q;
    public final int f30305r;
    public final org.telegram.ui.Cells.u9 f30306s;
    public final int f30307t;
    public final ArrayList f30308u;

    public sh0(final org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f30296i = paint;
        this.f30297j = new jq();
        this.f30299l = new ArrayList();
        this.f30300m = new ArrayList();
        this.f30307t = 1;
        this.f30308u = new ArrayList();
        this.f30291a = q1Var;
        this.f30298k = new t5(0.0f, new Runnable() {
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
        }, 350L, 420L, gr.h);
        this.f30292b = i10;
        int i12 = -i11;
        this.f30293c = i12;
        this.d = i12;
        this.e = true;
        this.f30294f = false;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(jq jqVar, rh0 rh0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.u9 u9Var;
        float f12;
        org.telegram.ui.Cells.u9 u9Var2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (rh0Var.f29996j != null) {
            f12 = u9Var.getX() - rh0Var.f29997k;
        } else {
            f12 = 0.0f;
        }
        if (rh0Var.f29996j != null) {
            f15 = u9Var2.getY() - rh0Var.f29998l;
        }
        float T1 = org.telegram.messenger.i0.T1(rect.left - f7, rh0Var.f29990a + f12, f11);
        if (rh0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = rh0Var.f29994g + f15;
        }
        float T12 = org.telegram.messenger.i0.T1(f13, rh0Var.f29992c + f15, f11);
        float T13 = org.telegram.messenger.i0.T1(rect.right - f7, rh0Var.f29991b + f12, f11);
        if (rh0Var.f29993f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = rh0Var.h + f15;
        }
        jqVar.addRect(T1, T12, T13, org.telegram.messenger.i0.T1(f14, rh0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f30303p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f30301n;
        float f15 = max + f14;
        float f16 = this.f30302o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f29990a = f15 - org.telegram.messenger.i0.L(3.0f);
        obj.f29991b = f18 + org.telegram.messenger.i0.L(3.0f);
        obj.f29992c = f17;
        obj.d = f12 + f16;
        obj.f29995i = this.f30305r;
        org.telegram.ui.Cells.u9 u9Var = this.f30306s;
        obj.f29996j = u9Var;
        if (u9Var != null) {
            obj.f29997k = u9Var.getX();
            obj.f29998l = u9Var.getY();
        }
        rh0 rh0Var = this.f30304q;
        if (rh0Var != null) {
            float f19 = rh0Var.d;
            rh0Var.h = (f19 + f17) / 2.0f;
            obj.f29994g = (f19 + f17) / 2.0f;
        }
        this.f30299l.add(obj);
        this.f30304q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float e = this.f30298k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f30294f;
        jq jqVar = this.f30297j;
        org.telegram.ui.Cells.q1 q1Var = this.f30291a;
        Paint paint = this.f30296i;
        if (z10) {
            int W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            jqVar.rewind();
            int T1 = q1Var.T1(this.f30295g);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.S1(T1), q1Var.getBackgroundDrawableRight(), q1Var.R1(T1));
            org.telegram.messenger.i0.Y1(rect2, rectF, e, rectF);
            jqVar.addRect(rectF, Path.Direction.CW);
            jqVar.a();
        } else if (this.e) {
            int W12 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(4.0f), 0);
            if (this.h != W12) {
                this.h = W12;
                paint.setPathEffect(new CornerPathEffect(W12));
            }
            jqVar.rewind();
            int Z1 = q1Var.Z1(-this.f30293c);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.S1(Z1), q1Var.getBackgroundDrawableRight(), q1Var.R1(Z1));
            org.telegram.messenger.i0.Y1(rect2, rectF2, e, rectF2);
            jqVar.addRect(rectF2, Path.Direction.CW);
            jqVar.a();
        } else {
            int i11 = this.f30307t;
            ArrayList arrayList2 = this.f30299l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                jq jqVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f30308u;
                    if (i13 >= size) {
                        break;
                    }
                    rh0 rh0Var = (rh0) arrayList2.get(i13);
                    if (jqVar2 == null || rh0Var.e) {
                        if (jqVar2 != null) {
                            jqVar2.a();
                        }
                        i12++;
                        if (i12 >= arrayList.size()) {
                            arrayList.add(new jq());
                        }
                        jqVar2 = (jq) arrayList.get(i12);
                        jqVar2.rewind();
                    }
                    jq jqVar3 = jqVar2;
                    b(jqVar3, rh0Var, f7, f10, rect2, e);
                    jqVar2 = jqVar3;
                    i13++;
                }
                if (jqVar2 != null) {
                    jqVar2.a();
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
            jqVar.rewind();
            while (i10 < arrayList2.size()) {
                b(jqVar, (rh0) arrayList2.get(i10), f7, f10, rect2, e);
                i10++;
                rect2 = rect;
            }
            jqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f11));
        canvas.drawPath(jqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f30299l;
            if (i10 < arrayList.size()) {
                rh0 rh0Var = (rh0) arrayList.get(i10);
                if (i10 == 0 || ((rh0) arrayList.get(i10 - 1)).f29995i != rh0Var.f29995i) {
                    rh0Var.e = true;
                    rh0Var.f29992c -= org.telegram.messenger.i0.L(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((rh0) arrayList.get(i10 + 1)).f29995i != rh0Var.f29995i) {
                    rh0Var.f29993f = true;
                    rh0Var.d += org.telegram.messenger.i0.L(0.66f);
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

    public sh0(final org.telegram.ui.Cells.q1 q1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f30296i = paint;
        this.f30297j = new jq();
        this.f30299l = new ArrayList();
        this.f30300m = new ArrayList();
        this.f30307t = 1;
        this.f30308u = new ArrayList();
        this.f30291a = q1Var;
        this.f30298k = new t5(0.0f, new Runnable() {
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
        }, 350L, 420L, gr.h);
        this.f30292b = i10;
        this.f30295g = bArr;
        this.f30293c = 0;
        this.d = 0;
        this.e = false;
        this.f30294f = true;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public sh0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f30296i = paint;
        this.f30297j = new jq();
        this.f30299l = new ArrayList();
        this.f30300m = new ArrayList();
        this.f30307t = 1;
        this.f30308u = new ArrayList();
        this.f30291a = null;
        this.f30298k = new t5(0.0f, new Runnable() {
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
        }, 350L, 420L, gr.h);
        this.f30292b = i10;
        this.f30293c = i11;
        this.d = i12;
        this.e = false;
        this.f30294f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            org.telegram.messenger.hj hjVar = (org.telegram.messenger.hj) arrayList.get(i14);
            if (hjVar != null && i11 <= hjVar.f16068r && i12 >= (i13 = hjVar.f16067n)) {
                int max = Math.max(0, i11 - i13);
                int i15 = hjVar.f16067n;
                int min = Math.min(i12 - i15, hjVar.f16068r - i15);
                float f10 = -f7;
                this.f30301n = f10;
                if (hjVar.H && !hjVar.I) {
                    this.f30301n = f10 + (hjVar.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(10.0f));
                }
                this.f30302o = hjVar.o(arrayList) + hjVar.f16066f;
                this.f30303p = hjVar.I ? org.telegram.messenger.i0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.i0.L1(hjVar.e.getText());
                if (z10) {
                    hjVar.e.getSelectionPath(max, min, this);
                } else {
                    e(hjVar.e, max, min);
                }
                if (hjVar.J && hjVar.f()) {
                    this.f30300m.add(Integer.valueOf(hjVar.f16065c));
                }
            }
        }
        d();
    }

    public sh0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i10, org.telegram.messenger.wv wvVar, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f30296i = paint;
        this.f30297j = new jq();
        this.f30299l = new ArrayList();
        this.f30300m = new ArrayList();
        this.f30307t = 1;
        this.f30308u = new ArrayList();
        this.f30291a = null;
        this.f30298k = new t5(0.0f, new Runnable() {
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
        }, 350L, 420L, gr.h);
        this.f30292b = i10;
        this.f30293c = i11;
        this.d = i12;
        this.e = false;
        this.f30294f = false;
        if (wvVar == null) {
            return;
        }
        ArrayList arrayList = wvVar.f19339n;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f30303p = -3.4028235E38f;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i13);
            Layout a2 = u9Var == null ? null : u9Var.a();
            if (a2 != null && a2.getText() != null) {
                int intValue = ((Integer) wvVar.f19340o.get(i13)).intValue();
                int length = a2.getText().length();
                int j10 = Utilities.j(i11 - intValue, length, 0);
                int j11 = Utilities.j(i12 - intValue, length, 0);
                if (j10 < j11) {
                    this.f30301n = u9Var.getX();
                    this.f30302o = u9Var.getY();
                    this.f30306s = u9Var;
                    this.f30304q = null;
                    int size = this.f30299l.size();
                    if (org.telegram.messenger.i0.L1(a2.getText())) {
                        a2.getSelectionPath(j10, j11, this);
                    } else {
                        e(a2, j10, j11);
                    }
                    if (this.f30299l.size() > size) {
                        this.f30305r++;
                    }
                }
            }
        }
        this.f30307t = Math.max(1, this.f30305r);
        d();
    }
}
