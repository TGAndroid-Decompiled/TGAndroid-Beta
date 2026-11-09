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
public final class qg0 extends Path {
    public final org.telegram.ui.Cells.q1 f37312a;
    public final int f37313b;
    public final int f37314c;
    public final int d;
    public final boolean f37315e;
    public final boolean f37316f;
    public final byte[] f37317g;
    public int h;
    public final Paint f37318i;
    public final aq f37319j;
    public final w5 f37320k;
    public final ArrayList f37321l;
    public final ArrayList f37322m;
    public final float f37323n;
    public final float f37324o;
    public final float f37325p;
    public pg0 f37326q;
    public final int f37327r;
    public final org.telegram.ui.Cells.t9 f37328s;
    public final int f37329t;
    public final ArrayList f37330u;

    public qg0(final org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        Paint paint = new Paint(1);
        this.f37318i = paint;
        this.f37319j = new aq();
        this.f37321l = new ArrayList();
        this.f37322m = new ArrayList();
        this.f37329t = 1;
        this.f37330u = new ArrayList();
        this.f37312a = q1Var;
        this.f37320k = new w5(0.0f, new Runnable() {
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
        this.f37313b = i7;
        int i11 = -i10;
        this.f37314c = i11;
        this.d = i11;
        this.f37315e = true;
        this.f37316f = false;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public static void b(aq aqVar, pg0 pg0Var, float f10, float f11, Rect rect, float f12) {
        org.telegram.ui.Cells.t9 t9Var;
        float f13;
        org.telegram.ui.Cells.t9 t9Var2;
        float f14;
        float f15;
        float f16 = 0.0f;
        if (pg0Var.f37016j != null) {
            f13 = t9Var.getX() - pg0Var.f37017k;
        } else {
            f13 = 0.0f;
        }
        if (pg0Var.f37016j != null) {
            f16 = t9Var2.getY() - pg0Var.f37018l;
        }
        float T1 = org.telegram.messenger.g0.T1(rect.left - f10, pg0Var.f37009a + f13, f12);
        if (pg0Var.f37012e) {
            f14 = rect.top - f11;
        } else {
            f14 = pg0Var.f37014g + f16;
        }
        float T12 = org.telegram.messenger.g0.T1(f14, pg0Var.f37011c + f16, f12);
        float T13 = org.telegram.messenger.g0.T1(rect.right - f10, pg0Var.f37010b + f13, f12);
        if (pg0Var.f37013f) {
            f15 = rect.bottom - f11;
        } else {
            f15 = pg0Var.h + f16;
        }
        aqVar.addRect(T1, T12, T13, org.telegram.messenger.g0.T1(f15, pg0Var.d + f16, f12), Path.Direction.CW);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        if (f10 >= f12) {
            return;
        }
        float f14 = this.f37325p;
        float max = Math.max(f14, f10);
        float max2 = Math.max(f14, f12);
        float f15 = this.f37323n;
        float f16 = max + f15;
        float f17 = this.f37324o;
        float f18 = f11 + f17;
        float f19 = max2 + f15;
        ?? obj = new Object();
        obj.f37009a = f16 - org.telegram.messenger.g0.L(3.0f);
        obj.f37010b = f19 + org.telegram.messenger.g0.L(3.0f);
        obj.f37011c = f18;
        obj.d = f13 + f17;
        obj.f37015i = this.f37327r;
        org.telegram.ui.Cells.t9 t9Var = this.f37328s;
        obj.f37016j = t9Var;
        if (t9Var != null) {
            obj.f37017k = t9Var.getX();
            obj.f37018l = t9Var.getY();
        }
        pg0 pg0Var = this.f37326q;
        if (pg0Var != null) {
            float f20 = pg0Var.d;
            pg0Var.h = (f20 + f18) / 2.0f;
            obj.f37014g = (f20 + f18) / 2.0f;
        }
        this.f37321l.add(obj);
        this.f37326q = obj;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        a(f10, f11, f12, f13);
    }

    public final void c(Canvas canvas, float f10, float f11, Rect rect, float f12) {
        ArrayList arrayList;
        Rect rect2 = rect;
        int i7 = 0;
        float e10 = this.f37320k.e(false, 1.0f);
        canvas.save();
        boolean z9 = this.f37316f;
        aq aqVar = this.f37319j;
        org.telegram.ui.Cells.q1 q1Var = this.f37312a;
        Paint paint = this.f37318i;
        if (z9) {
            int W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W1) {
                this.h = W1;
                paint.setPathEffect(new CornerPathEffect(W1));
            }
            aqVar.rewind();
            int V1 = q1Var.V1(this.f37317g);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(V1), q1Var.getBackgroundDrawableRight(), q1Var.T1(V1));
            org.telegram.messenger.g0.Y1(rect2, rectF, e10, rectF);
            aqVar.addRect(rectF, Path.Direction.CW);
            aqVar.a();
        } else if (this.f37315e) {
            int W12 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(4.0f), 0);
            if (this.h != W12) {
                this.h = W12;
                paint.setPathEffect(new CornerPathEffect(W12));
            }
            aqVar.rewind();
            int b22 = q1Var.b2(-this.f37314c);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(q1Var.getBackgroundDrawableLeft(), q1Var.U1(b22), q1Var.getBackgroundDrawableRight(), q1Var.T1(b22));
            org.telegram.messenger.g0.Y1(rect2, rectF2, e10, rectF2);
            aqVar.addRect(rectF2, Path.Direction.CW);
            aqVar.a();
        } else {
            int i10 = this.f37329t;
            ArrayList arrayList2 = this.f37321l;
            if (i10 > 1) {
                canvas.translate(f10, f11);
                aq aqVar2 = null;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    int size = arrayList2.size();
                    arrayList = this.f37330u;
                    if (i12 >= size) {
                        break;
                    }
                    pg0 pg0Var = (pg0) arrayList2.get(i12);
                    if (aqVar2 == null || pg0Var.f37012e) {
                        if (aqVar2 != null) {
                            aqVar2.a();
                        }
                        i11++;
                        if (i11 >= arrayList.size()) {
                            arrayList.add(new aq());
                        }
                        aqVar2 = (aq) arrayList.get(i11);
                        aqVar2.rewind();
                    }
                    aq aqVar3 = aqVar2;
                    b(aqVar3, pg0Var, f10, f11, rect2, e10);
                    aqVar2 = aqVar3;
                    i12++;
                }
                if (aqVar2 != null) {
                    aqVar2.a();
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
            aqVar.rewind();
            while (i7 < arrayList2.size()) {
                b(aqVar, (pg0) arrayList2.get(i7), f10, f11, rect2, e10);
                i7++;
                rect2 = rect;
            }
            aqVar.a();
        }
        int alpha2 = paint.getAlpha();
        paint.setAlpha((int) (alpha2 * f12));
        canvas.drawPath(aqVar, paint);
        paint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f37321l;
            if (i7 < arrayList.size()) {
                pg0 pg0Var = (pg0) arrayList.get(i7);
                if (i7 == 0 || ((pg0) arrayList.get(i7 - 1)).f37015i != pg0Var.f37015i) {
                    pg0Var.f37012e = true;
                    pg0Var.f37011c -= org.telegram.messenger.g0.L(0.66f);
                }
                if (i7 == arrayList.size() - 1 || ((pg0) arrayList.get(i7 + 1)).f37015i != pg0Var.f37015i) {
                    pg0Var.f37013f = true;
                    pg0Var.d += org.telegram.messenger.g0.L(0.66f);
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

    public qg0(final org.telegram.ui.Cells.q1 q1Var, int i7, byte[] bArr) {
        Paint paint = new Paint(1);
        this.f37318i = paint;
        this.f37319j = new aq();
        this.f37321l = new ArrayList();
        this.f37322m = new ArrayList();
        this.f37329t = 1;
        this.f37330u = new ArrayList();
        this.f37312a = q1Var;
        this.f37320k = new w5(0.0f, new Runnable() {
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
        this.f37313b = i7;
        this.f37317g = bArr;
        this.f37314c = 0;
        this.d = 0;
        this.f37315e = false;
        this.f37316f = true;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
    }

    public qg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, ArrayList arrayList, int i10, int i11, float f10) {
        int i12;
        Paint paint = new Paint(1);
        this.f37318i = paint;
        this.f37319j = new aq();
        this.f37321l = new ArrayList();
        this.f37322m = new ArrayList();
        this.f37329t = 1;
        this.f37330u = new ArrayList();
        this.f37312a = null;
        this.f37320k = new w5(0.0f, new Runnable() {
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
        this.f37313b = i7;
        this.f37314c = i10;
        this.d = i11;
        this.f37315e = false;
        this.f37316f = false;
        if (arrayList == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        boolean z9 = false;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i13);
            if (fjVar != null && i10 <= fjVar.f22427r && i11 >= (i12 = fjVar.f22426n)) {
                int max = Math.max(0, i10 - i12);
                int i14 = fjVar.f22426n;
                int min = Math.min(i11 - i14, fjVar.f22427r - i14);
                float f11 = -f10;
                this.f37323n = f11;
                if (fjVar.H && !fjVar.I) {
                    this.f37323n = f11 + (fjVar.U ? org.telegram.messenger.g0.L(14.0f) : org.telegram.messenger.g0.L(10.0f));
                }
                this.f37324o = fjVar.o(arrayList) + fjVar.f22425f;
                this.f37325p = fjVar.I ? org.telegram.messenger.g0.L(10.0f) : 0.0f;
                z9 = z9 || org.telegram.messenger.g0.L1(fjVar.f22424e.getText());
                if (z9) {
                    fjVar.f22424e.getSelectionPath(max, min, this);
                } else {
                    e(fjVar.f22424e, max, min);
                }
                if (fjVar.J && fjVar.f()) {
                    this.f37322m.add(Integer.valueOf(fjVar.f22423c));
                }
            }
        }
        d();
    }

    public qg0(final org.telegram.ui.Cells.q1 q1Var, final ViewParent viewParent, int i7, org.telegram.messenger.kv kvVar, int i10, int i11) {
        Paint paint = new Paint(1);
        this.f37318i = paint;
        this.f37319j = new aq();
        this.f37321l = new ArrayList();
        this.f37322m = new ArrayList();
        this.f37329t = 1;
        this.f37330u = new ArrayList();
        this.f37312a = null;
        this.f37320k = new w5(0.0f, new Runnable() {
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
        this.f37313b = i7;
        this.f37314c = i10;
        this.d = i11;
        this.f37315e = false;
        this.f37316f = false;
        if (kvVar == null) {
            return;
        }
        ArrayList arrayList = kvVar.f23774n;
        int L = org.telegram.messenger.g0.L(4.0f);
        this.h = L;
        paint.setPathEffect(new CornerPathEffect(L));
        this.f37325p = -3.4028235E38f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i12);
            Layout a10 = t9Var == null ? null : t9Var.a();
            if (a10 != null && a10.getText() != null) {
                int intValue = ((Integer) kvVar.f23775o.get(i12)).intValue();
                int length = a10.getText().length();
                int j3 = Utilities.j(i10 - intValue, length, 0);
                int j10 = Utilities.j(i11 - intValue, length, 0);
                if (j3 < j10) {
                    this.f37323n = t9Var.getX();
                    this.f37324o = t9Var.getY();
                    this.f37328s = t9Var;
                    this.f37326q = null;
                    int size = this.f37321l.size();
                    if (org.telegram.messenger.g0.L1(a10.getText())) {
                        a10.getSelectionPath(j3, j10, this);
                    } else {
                        e(a10, j3, j10);
                    }
                    if (this.f37321l.size() > size) {
                        this.f37327r++;
                    }
                }
            }
        }
        this.f37329t = Math.max(1, this.f37327r);
        d();
    }
}
