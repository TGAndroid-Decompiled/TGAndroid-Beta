package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
public final class v9 extends GradientDrawable {
    public final int[] f31685a;
    public final a0.f f31686b;
    public final a0.f f31687c;
    public final a0.f d;
    public final ArrayList f31688e;
    public final Paint f31689f;
    public boolean f31690g;

    public v9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f31686b = new a0.m(0);
        this.f31687c = new a0.m(0);
        this.d = new a0.m(0);
        this.f31688e = new ArrayList();
        Paint paint = new Paint(1);
        this.f31689f = paint;
        this.f31690g = false;
        setDither(true);
        this.f31685a = iArr;
        paint.setDither(true);
    }

    public static void a(v9 v9Var, Runnable[] runnableArr, Bitmap bitmap, m60 m60Var, int i10, w7.w5[] w5VarArr) {
        a0.f fVar = v9Var.f31686b;
        ArrayList arrayList = v9Var.f31688e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(m60Var, bitmap);
        } else {
            fVar.remove(m60Var);
            v9Var.f31687c.remove(m60Var);
        }
        runnableArr[i10] = null;
        boolean z10 = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            arrayList.remove(runnableArr);
        }
        w7.w5 w5Var = w5VarArr[0];
        if (w5Var != null) {
            w5Var.b(m60Var.f28615a, m60Var.f28616b);
            if (!z10) {
                w5VarArr[0].a();
                w5VarArr[0] = null;
            }
        }
    }

    public static GradientDrawable.Orientation d(int i10) {
        if (i10 != 0) {
            if (i10 != 90) {
                if (i10 != 135) {
                    if (i10 != 180) {
                        if (i10 != 225) {
                            if (i10 != 270) {
                                if (i10 != 315) {
                                    return GradientDrawable.Orientation.BL_TR;
                                }
                                return GradientDrawable.Orientation.BR_TL;
                            }
                            return GradientDrawable.Orientation.RIGHT_LEFT;
                        }
                        return GradientDrawable.Orientation.TR_BL;
                    }
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                return GradientDrawable.Orientation.TL_BR;
            }
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        return GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i10, int i11) {
        Rect rect = new Rect();
        switch (t9.f31089a[orientation.ordinal()]) {
            case 1:
                int i12 = i10 / 2;
                rect.left = i12;
                rect.top = 0;
                rect.right = i12;
                rect.bottom = i11;
                return rect;
            case 2:
                rect.left = i10;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i11;
                return rect;
            case 3:
                rect.left = i10;
                int i13 = i11 / 2;
                rect.top = i13;
                rect.right = 0;
                rect.bottom = i13;
                return rect;
            case 4:
                rect.left = i10;
                rect.top = i11;
                rect.right = 0;
                rect.bottom = 0;
                return rect;
            case 5:
                int i14 = i10 / 2;
                rect.left = i14;
                rect.top = i11;
                rect.right = i14;
                rect.bottom = 0;
                return rect;
            case 6:
                rect.left = 0;
                rect.top = i11;
                rect.right = i10;
                rect.bottom = 0;
                return rect;
            case 7:
                rect.left = 0;
                int i15 = i11 / 2;
                rect.top = i15;
                rect.right = i10;
                rect.bottom = i15;
                return rect;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i10;
                rect.bottom = i11;
                return rect;
        }
    }

    public final void b() {
        if (!this.f31690g) {
            for (int size = this.f31688e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.f31688e.remove(size));
            }
            for (int i10 = this.f31686b.f33c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f31686b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f31687c.clear();
            this.d.clear();
            this.f31690g = true;
        }
    }

    public final u9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f31690g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f31686b;
        int i10 = fVar.f33c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                m60 m60Var = (m60) fVar.e(i11);
                if (m60Var.f28615a == width && m60Var.f28616b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f31689f);
                    } else {
                        super.draw(canvas);
                    }
                    return (u9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                u9 u9Var = (u9) fVar2.remove(viewGroup);
                if (u9Var != null) {
                    u9Var.dispose();
                }
                m60 m60Var2 = new m60(width, height);
                fVar.put(m60Var2, null);
                this.f31687c.put(m60Var2, Boolean.TRUE);
                final q9 g10 = g(new m60[]{m60Var2}, new s9(this, viewGroup), 0L);
                u9 u9Var2 = (u9) fVar2.put(viewGroup, new u9() {
                    @Override
                    public final void dispose() {
                        v9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return u9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f31690g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f31686b;
        int i10 = fVar.f33c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            m60 m60Var = (m60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - m60Var.f28616b, 2.0d) + Math.pow(width - m60Var.f28615a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f31687c.get(m60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f31689f);
        } else {
            super.draw(canvas);
        }
    }

    public final q9 f(n2.c cVar, w7.w5 w5Var, long j3) {
        m60[] m60VarArr = (m60[]) cVar.f16532b;
        if (!this.f31690g) {
            ArrayList arrayList = new ArrayList(m60VarArr.length);
            for (m60 m60Var : m60VarArr) {
                a0.f fVar = this.f31686b;
                if (!fVar.containsKey(m60Var)) {
                    fVar.put(m60Var, null);
                    arrayList.add(m60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((m60[]) arrayList.toArray(new m60[0]), w5Var, j3);
            }
        }
        return null;
    }

    public final void finalize() {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    public final q9 g(m60[] m60VarArr, w7.w5 w5Var, long j3) {
        if (m60VarArr.length == 0) {
            return null;
        }
        w7.w5[] w5VarArr = {w5Var};
        Runnable[] runnableArr = new Runnable[m60VarArr.length];
        this.f31688e.add(runnableArr);
        for (int i10 = 0; i10 < m60VarArr.length; i10++) {
            m60 m60Var = m60VarArr[i10];
            if (m60Var.f28615a != 0 && m60Var.f28616b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                p9 p9Var = new p9(this, m60Var, runnableArr, i10, w5VarArr);
                runnableArr[i10] = p9Var;
                dispatchQueue.postRunnable(p9Var, j3);
            }
        }
        return new q9(this, w5VarArr, runnableArr, m60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f31689f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f31689f.setColorFilter(colorFilter);
    }
}
