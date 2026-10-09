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
public final class x9 extends GradientDrawable {
    public final int[] f32774a;
    public final a0.f f32775b;
    public final a0.f f32776c;
    public final a0.f d;
    public final ArrayList f32777e;
    public final Paint f32778f;
    public boolean f32779g;

    public x9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f32775b = new a0.m(0);
        this.f32776c = new a0.m(0);
        this.d = new a0.m(0);
        this.f32777e = new ArrayList();
        Paint paint = new Paint(1);
        this.f32778f = paint;
        this.f32779g = false;
        setDither(true);
        this.f32774a = iArr;
        paint.setDither(true);
    }

    public static void a(x9 x9Var, Runnable[] runnableArr, Bitmap bitmap, a70 a70Var, int i10, w7.i0[] i0VarArr) {
        a0.f fVar = x9Var.f32775b;
        ArrayList arrayList = x9Var.f32777e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(a70Var, bitmap);
        } else {
            fVar.remove(a70Var);
            x9Var.f32776c.remove(a70Var);
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
        w7.i0 i0Var = i0VarArr[0];
        if (i0Var != null) {
            i0Var.b(a70Var.f24617a, a70Var.f24618b);
            if (!z10) {
                i0VarArr[0].a();
                i0VarArr[0] = null;
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
        switch (v9.f31715a[orientation.ordinal()]) {
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
        if (!this.f32779g) {
            for (int size = this.f32777e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.f32777e.remove(size));
            }
            for (int i10 = this.f32775b.f33c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f32775b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f32776c.clear();
            this.d.clear();
            this.f32779g = true;
        }
    }

    public final w9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f32779g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f32775b;
        int i10 = fVar.f33c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                a70 a70Var = (a70) fVar.e(i11);
                if (a70Var.f24617a == width && a70Var.f24618b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f32778f);
                    } else {
                        super.draw(canvas);
                    }
                    return (w9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                w9 w9Var = (w9) fVar2.remove(viewGroup);
                if (w9Var != null) {
                    w9Var.dispose();
                }
                a70 a70Var2 = new a70(width, height);
                fVar.put(a70Var2, null);
                this.f32776c.put(a70Var2, Boolean.TRUE);
                final s9 g10 = g(new a70[]{a70Var2}, new u9(this, viewGroup), 0L);
                w9 w9Var2 = (w9) fVar2.put(viewGroup, new w9() {
                    @Override
                    public final void dispose() {
                        x9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return w9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f32779g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f32775b;
        int i10 = fVar.f33c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            a70 a70Var = (a70) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - a70Var.f24618b, 2.0d) + Math.pow(width - a70Var.f24617a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f32776c.get(a70Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f32778f);
        } else {
            super.draw(canvas);
        }
    }

    public final s9 f(l2.f fVar, w7.i0 i0Var, long j3) {
        a70[] a70VarArr = (a70[]) fVar.f15331b;
        if (!this.f32779g) {
            ArrayList arrayList = new ArrayList(a70VarArr.length);
            for (a70 a70Var : a70VarArr) {
                a0.f fVar2 = this.f32775b;
                if (!fVar2.containsKey(a70Var)) {
                    fVar2.put(a70Var, null);
                    arrayList.add(a70Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((a70[]) arrayList.toArray(new a70[0]), i0Var, j3);
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

    public final s9 g(a70[] a70VarArr, w7.i0 i0Var, long j3) {
        if (a70VarArr.length == 0) {
            return null;
        }
        w7.i0[] i0VarArr = {i0Var};
        Runnable[] runnableArr = new Runnable[a70VarArr.length];
        this.f32777e.add(runnableArr);
        for (int i10 = 0; i10 < a70VarArr.length; i10++) {
            a70 a70Var = a70VarArr[i10];
            if (a70Var.f24617a != 0 && a70Var.f24618b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                r9 r9Var = new r9(this, a70Var, runnableArr, i10, i0VarArr);
                runnableArr[i10] = r9Var;
                dispatchQueue.postRunnable(r9Var, j3);
            }
        }
        return new s9(this, i0VarArr, runnableArr, a70VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f32778f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f32778f.setColorFilter(colorFilter);
    }
}
