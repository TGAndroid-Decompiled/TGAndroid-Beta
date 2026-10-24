package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
public final class t9 extends GradientDrawable {
    public final int[] f30758a;
    public final a0.f f30759b;
    public final a0.f f30760c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f30761f;
    public boolean f30762g;

    public t9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f30759b = new a0.l(0);
        this.f30760c = new a0.l(0);
        this.d = new a0.l(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f30761f = paint;
        this.f30762g = false;
        setDither(true);
        this.f30758a = iArr;
        paint.setDither(true);
    }

    public static void a(t9 t9Var, Runnable[] runnableArr, Bitmap bitmap, s60 s60Var, int i10, w7.w5[] w5VarArr) {
        a0.f fVar = t9Var.f30759b;
        ArrayList arrayList = t9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(s60Var, bitmap);
        } else {
            fVar.remove(s60Var);
            t9Var.f30760c.remove(s60Var);
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
            w5Var.b(s60Var.f30454a, s60Var.f30455b);
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
        switch (r9.f30104a[orientation.ordinal()]) {
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
        if (!this.f30762g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f30759b.f27c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f30759b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f30760c.clear();
            this.d.clear();
            this.f30762g = true;
        }
    }

    public final s9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f30762g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f30759b;
        int i10 = fVar.f27c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                s60 s60Var = (s60) fVar.e(i11);
                if (s60Var.f30454a == width && s60Var.f30455b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f30761f);
                    } else {
                        super.draw(canvas);
                    }
                    return (s9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                s9 s9Var = (s9) fVar2.remove(viewGroup);
                if (s9Var != null) {
                    s9Var.dispose();
                }
                s60 s60Var2 = new s60(width, height);
                fVar.put(s60Var2, null);
                this.f30760c.put(s60Var2, Boolean.TRUE);
                final o9 g10 = g(new s60[]{s60Var2}, new q9(this, viewGroup), 0L);
                s9 s9Var2 = (s9) fVar2.put(viewGroup, new s9() {
                    @Override
                    public final void dispose() {
                        t9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return s9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f30762g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f30759b;
        int i10 = fVar.f27c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            s60 s60Var = (s60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - s60Var.f30455b, 2.0d) + Math.pow(width - s60Var.f30454a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f30760c.get(s60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f30761f);
        } else {
            super.draw(canvas);
        }
    }

    public final o9 f(ki.t1 t1Var, w7.w5 w5Var, long j10) {
        s60[] s60VarArr = (s60[]) t1Var.f15585b;
        if (!this.f30762g) {
            ArrayList arrayList = new ArrayList(s60VarArr.length);
            for (s60 s60Var : s60VarArr) {
                a0.f fVar = this.f30759b;
                if (!fVar.containsKey(s60Var)) {
                    fVar.put(s60Var, null);
                    arrayList.add(s60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((s60[]) arrayList.toArray(new s60[0]), w5Var, j10);
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

    public final o9 g(s60[] s60VarArr, w7.w5 w5Var, long j10) {
        if (s60VarArr.length == 0) {
            return null;
        }
        w7.w5[] w5VarArr = {w5Var};
        Runnable[] runnableArr = new Runnable[s60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < s60VarArr.length; i10++) {
            s60 s60Var = s60VarArr[i10];
            if (s60Var.f30454a != 0 && s60Var.f30455b != 0) {
                DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
                n9 n9Var = new n9(this, s60Var, runnableArr, i10, w5VarArr);
                runnableArr[i10] = n9Var;
                dispatchQueue2.postRunnable(n9Var, j10);
            }
        }
        return new o9(this, w5VarArr, runnableArr, s60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f30761f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f30761f.setColorFilter(colorFilter);
    }
}
