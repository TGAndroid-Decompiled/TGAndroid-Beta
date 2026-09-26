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
    public final int[] f29045a;
    public final a0.f f29046b;
    public final a0.f f29047c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f29048f;
    public boolean f29049g;

    public v9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f29046b = new a0.m(0);
        this.f29047c = new a0.m(0);
        this.d = new a0.m(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f29048f = paint;
        this.f29049g = false;
        setDither(true);
        this.f29045a = iArr;
        paint.setDither(true);
    }

    public static void a(v9 v9Var, Runnable[] runnableArr, Bitmap bitmap, k60 k60Var, int i10, w7.j0[] j0VarArr) {
        a0.f fVar = v9Var.f29046b;
        ArrayList arrayList = v9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(k60Var, bitmap);
        } else {
            fVar.remove(k60Var);
            v9Var.f29047c.remove(k60Var);
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
        w7.j0 j0Var = j0VarArr[0];
        if (j0Var != null) {
            j0Var.b(k60Var.f25640a, k60Var.f25641b);
            if (!z10) {
                j0VarArr[0].a();
                j0VarArr[0] = null;
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
        switch (t9.f28510a[orientation.ordinal()]) {
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
        if (!this.f29049g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f29046b.f30c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f29046b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f29047c.clear();
            this.d.clear();
            this.f29049g = true;
        }
    }

    public final u9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f29049g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f29046b;
        int i10 = fVar.f30c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                k60 k60Var = (k60) fVar.e(i11);
                if (k60Var.f25640a == width && k60Var.f25641b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f29048f);
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
                k60 k60Var2 = new k60(width, height);
                fVar.put(k60Var2, null);
                this.f29047c.put(k60Var2, Boolean.TRUE);
                final q9 g10 = g(new k60[]{k60Var2}, new s9(this, viewGroup), 0L);
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
        if (this.f29049g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f29046b;
        int i10 = fVar.f30c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            k60 k60Var = (k60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - k60Var.f25641b, 2.0d) + Math.pow(width - k60Var.f25640a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f29047c.get(k60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f29048f);
        } else {
            super.draw(canvas);
        }
    }

    public final q9 f(n2.e eVar, w7.j0 j0Var, long j3) {
        k60[] k60VarArr = (k60[]) eVar.f15116b;
        if (!this.f29049g) {
            ArrayList arrayList = new ArrayList(k60VarArr.length);
            for (k60 k60Var : k60VarArr) {
                a0.f fVar = this.f29046b;
                if (!fVar.containsKey(k60Var)) {
                    fVar.put(k60Var, null);
                    arrayList.add(k60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((k60[]) arrayList.toArray(new k60[0]), j0Var, j3);
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

    public final q9 g(k60[] k60VarArr, w7.j0 j0Var, long j3) {
        if (k60VarArr.length == 0) {
            return null;
        }
        w7.j0[] j0VarArr = {j0Var};
        Runnable[] runnableArr = new Runnable[k60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < k60VarArr.length; i10++) {
            k60 k60Var = k60VarArr[i10];
            if (k60Var.f25640a != 0 && k60Var.f25641b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                p9 p9Var = new p9(this, k60Var, runnableArr, i10, j0VarArr);
                runnableArr[i10] = p9Var;
                dispatchQueue.postRunnable(p9Var, j3);
            }
        }
        return new q9(this, j0VarArr, runnableArr, k60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f29048f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f29048f.setColorFilter(colorFilter);
    }
}
