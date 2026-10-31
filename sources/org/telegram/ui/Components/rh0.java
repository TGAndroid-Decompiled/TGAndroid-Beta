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
public final class rh0 extends Path {
    public final org.telegram.ui.Cells.q1 f29915a;
    public final int f29916b;
    public final int f29917c;
    public final int d;
    public final boolean e;
    public final boolean f29918f;
    public final byte[] f29919g;
    public int h;
    public final Paint f29920i;
    public final jq f29921j;
    public final t5 f29922k;
    public final ArrayList f29923l;
    public final ArrayList f29924m;
    public final float f29925n;
    public final float f29926o;
    public final float f29927p;
    public qh0 f29928q;
    public final int f29929r;
    public final org.telegram.ui.Cells.u9 f29930s;
    public final int f29931t;
    public final ArrayList f29932u;

    public rh0(final org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f29920i = paint;
        this.f29921j = new jq();
        this.f29923l = new ArrayList();
        this.f29924m = new ArrayList();
        this.f29931t = 1;
        this.f29932u = new ArrayList();
        this.f29915a = q1Var;
        this.f29922k = new t5(0.0f, new Runnable() {
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
        this.f29916b = i10;
        int i12 = -i11;
        this.f29917c = i12;
        this.d = i12;
        this.e = true;
        this.f29918f = false;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(jq jqVar, qh0 qh0Var, float f7, float f10, Rect rect, float f11) {
        org.telegram.ui.Cells.u9 u9Var;
        float f12;
        org.telegram.ui.Cells.u9 u9Var2;
        float f13;
        float f14;
        float f15 = 0.0f;
        if (qh0Var.f29656j != null) {
            f12 = u9Var.getX() - qh0Var.f29657k;
        } else {
            f12 = 0.0f;
        }
        if (qh0Var.f29656j != null) {
            f15 = u9Var2.getY() - qh0Var.f29658l;
        }
        float T1 = org.telegram.messenger.i0.T1(rect.left - f7, qh0Var.f29650a + f12, f11);
        if (qh0Var.e) {
            f13 = rect.top - f10;
        } else {
            f13 = qh0Var.f29654g + f15;
        }
        float T12 = org.telegram.messenger.i0.T1(f13, qh0Var.f29652c + f15, f11);
        float T13 = org.telegram.messenger.i0.T1(rect.right - f7, qh0Var.f29651b + f12, f11);
        if (qh0Var.f29653f) {
            f14 = rect.bottom - f10;
        } else {
            f14 = qh0Var.h + f15;
        }
        jqVar.addRect(T1, T12, T13, org.telegram.messenger.i0.T1(f14, qh0Var.d + f15, f11), Path.Direction.CW);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        if (f7 >= f11) {
            return;
        }
        float f13 = this.f29927p;
        float max = Math.max(f13, f7);
        float max2 = Math.max(f13, f11);
        float f14 = this.f29925n;
        float f15 = max + f14;
        float f16 = this.f29926o;
        float f17 = f10 + f16;
        float f18 = max2 + f14;
        ?? obj = new Object();
        obj.f29650a = f15 - org.telegram.messenger.i0.L(3.0f);
        obj.f29651b = f18 + org.telegram.messenger.i0.L(3.0f);
        obj.f29652c = f17;
        obj.d = f12 + f16;
        obj.f29655i = this.f29929r;
        org.telegram.ui.Cells.u9 u9Var = this.f29930s;
        obj.f29656j = u9Var;
        if (u9Var != null) {
            obj.f29657k = u9Var.getX();
            obj.f29658l = u9Var.getY();
        }
        qh0 qh0Var = this.f29928q;
        if (qh0Var != null) {
            float f19 = qh0Var.d;
            qh0Var.h = (f19 + f17) / 2.0f;
            obj.f29654g = (f19 + f17) / 2.0f;
        }
        this.f29923l.add(obj);
        this.f29928q = obj;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        a(f7, f10, f11, f12);
    }

    public final void c(Canvas canvas, float f7, float f10, Rect rect, float f11) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i10 = 0;
        float e = this.f29922k.e(false, 1.0f);
        canvas.save();
        boolean z10 = this.f29918f;
        jq jqVar = this.f29921j;
        org.telegram.ui.Cells.q1 q1Var = this.f29915a;
        Paint paint = this.f29920i;
        if (z10) {
            int W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            jqVar.rewind();
            int T1 = q1Var.T1(this.f29919g);
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
            int Z1 = q1Var.Z1(-this.f29917c);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.S1(Z1), q1Var.getBackgroundDrawableRight(), q1Var.R1(Z1));
            org.telegram.messenger.i0.Y1(rect2, rectF2, e, rectF2);
            jqVar.addRect(rectF2, Path.Direction.CW);
            jqVar.a();
        } else {
            int i11 = this.f29931t;
            ArrayList arrayList2 = this.f29923l;
            if (i11 > 1) {
                canvas.translate(f7, f10);
                jq jqVar2 = null;
                int i12 = -1;
                int i13 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f29932u;
                    if (i13 >= size) {
                        break;
                    }
                    qh0 qh0Var = (qh0) arrayList2.get(i13);
                    if (jqVar2 == null || qh0Var.e) {
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
                    b(jqVar3, qh0Var, f7, f10, rect2, e);
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
                b(jqVar, (qh0) arrayList2.get(i10), f7, f10, rect2, e);
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
            ArrayList arrayList = this.f29923l;
            if (i10 < arrayList.size()) {
                qh0 qh0Var = (qh0) arrayList.get(i10);
                if (i10 == 0 || ((qh0) arrayList.get(i10 - 1)).f29655i != qh0Var.f29655i) {
                    qh0Var.e = true;
                    qh0Var.f29652c -= org.telegram.messenger.i0.L(0.66f);
                }
                if (i10 == arrayList.size() - 1 || ((qh0) arrayList.get(i10 + 1)).f29655i != qh0Var.f29655i) {
                    qh0Var.f29653f = true;
                    qh0Var.d += org.telegram.messenger.i0.L(0.66f);
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

    public rh0(final org.telegram.ui.Cells.q1 q1Var, int i10, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f29920i = paint;
        this.f29921j = new jq();
        this.f29923l = new ArrayList();
        this.f29924m = new ArrayList();
        this.f29931t = 1;
        this.f29932u = new ArrayList();
        this.f29915a = q1Var;
        this.f29922k = new t5(0.0f, new Runnable() {
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
        this.f29916b = i10;
        this.f29919g = bArr;
        this.f29917c = 0;
        this.d = 0;
        this.e = false;
        this.f29918f = true;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public rh0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i10, ArrayList arrayList, int i11, int i12, float f7) {
        int i13;
        Paint paint = new Paint(1);
        this.f29920i = paint;
        this.f29921j = new jq();
        this.f29923l = new ArrayList();
        this.f29924m = new ArrayList();
        this.f29931t = 1;
        this.f29932u = new ArrayList();
        this.f29915a = null;
        this.f29922k = new t5(0.0f, new Runnable() {
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
        this.f29916b = i10;
        this.f29917c = i11;
        this.d = i12;
        this.e = false;
        this.f29918f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z10 = false;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i14);
            if (gjVar != null && i11 <= gjVar.f15719r && i12 >= (i13 = gjVar.f15718n)) {
                int max = Math.max(0, i11 - i13);
                int i15 = gjVar.f15718n;
                int min = Math.min(i12 - i15, gjVar.f15719r - i15);
                float f10 = -f7;
                this.f29925n = f10;
                if (gjVar.H && !gjVar.I) {
                    this.f29925n = f10 + (gjVar.U ? org.telegram.messenger.i0.L(14.0f) : org.telegram.messenger.i0.L(10.0f));
                }
                this.f29926o = gjVar.o(arrayList) + gjVar.f15717f;
                this.f29927p = gjVar.I ? org.telegram.messenger.i0.L(10.0f) : 0.0f;
                z10 = z10 || org.telegram.messenger.i0.L1(gjVar.e.getText());
                if (z10) {
                    gjVar.e.getSelectionPath(max, min, this);
                } else {
                    e(gjVar.e, max, min);
                }
                if (gjVar.J && gjVar.f()) {
                    this.f29924m.add(Integer.valueOf(gjVar.f15716c));
                }
            }
        }
        d();
    }

    public rh0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i10, org.telegram.messenger.vv vvVar, int i11, int i12) {
        Paint paint = new Paint(1);
        this.f29920i = paint;
        this.f29921j = new jq();
        this.f29923l = new ArrayList();
        this.f29924m = new ArrayList();
        this.f29931t = 1;
        this.f29932u = new ArrayList();
        this.f29915a = null;
        this.f29922k = new t5(0.0f, new Runnable() {
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
        this.f29916b = i10;
        this.f29917c = i11;
        this.d = i12;
        this.e = false;
        this.f29918f = false;
        if (vvVar == null) {
            return;
        }
        ArrayList arrayList = vvVar.f18996n;
        int L = org.telegram.messenger.i0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f29927p = -3.4028235E38f;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i13);
            Layout a2 = u9Var == null ? null : u9Var.a();
            if (a2 != null && a2.getText() != null) {
                int intValue = ((Integer) vvVar.f18997o.get(i13)).intValue();
                int length = a2.getText().length();
                int j10 = Utilities.j(i11 - intValue, length, 0);
                int j11 = Utilities.j(i12 - intValue, length, 0);
                if (j10 < j11) {
                    this.f29925n = u9Var.getX();
                    this.f29926o = u9Var.getY();
                    this.f29930s = u9Var;
                    this.f29928q = null;
                    int size = this.f29923l.size();
                    if (org.telegram.messenger.i0.L1(a2.getText())) {
                        a2.getSelectionPath(j10, j11, this);
                    } else {
                        e(a2, j10, j11);
                    }
                    if (this.f29923l.size() > size) {
                        this.f29929r++;
                    }
                }
            }
        }
        this.f29931t = Math.max(1, this.f29929r);
        d();
    }
}
