package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f9 extends GradientDrawable {
    public final int[] f26014a;
    public final a0.f f26015b;
    public final a0.f f26016c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f26017f;
    public boolean f26018g;

    public f9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f26015b = new a0.l(0);
        this.f26016c = new a0.l(0);
        this.d = new a0.l(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f26017f = paint;
        this.f26018g = false;
        setDither(true);
        this.f26014a = iArr;
        paint.setDither(true);
    }

    public static void a(f9 f9Var, Runnable[] runnableArr, Bitmap bitmap, k50 k50Var, int i10, w7.y5[] y5VarArr) {
        a0.f fVar = f9Var.f26015b;
        ArrayList arrayList = f9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(k50Var, bitmap);
        } else {
            fVar.remove(k50Var);
            f9Var.f26016c.remove(k50Var);
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
        w7.y5 y5Var = y5VarArr[0];
        if (y5Var != null) {
            y5Var.b(k50Var.f27639a, k50Var.f27640b);
            if (!z10) {
                y5VarArr[0].a();
                y5VarArr[0] = null;
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
        switch (d9.f25369a[orientation.ordinal()]) {
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
        if (!this.f26018g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.r5 r5Var = Utilities.e;
                Runnable[] runnableArr = (Runnable[]) this.e.remove(size);
                r5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    r5Var.a(runnable);
                }
            }
            for (int i10 = this.f26015b.f27c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f26015b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f26016c.clear();
            this.d.clear();
            this.f26018g = true;
        }
    }

    public final e9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f26018g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f26015b;
        int i10 = fVar.f27c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                k50 k50Var = (k50) fVar.e(i11);
                if (k50Var.f27639a == width && k50Var.f27640b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f26017f);
                    } else {
                        super.draw(canvas);
                    }
                    return (e9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                e9 e9Var = (e9) fVar2.remove(viewGroup);
                if (e9Var != null) {
                    e9Var.dispose();
                }
                k50 k50Var2 = new k50(width, height);
                fVar.put(k50Var2, null);
                this.f26016c.put(k50Var2, Boolean.TRUE);
                final a9 g10 = g(new k50[]{k50Var2}, new c9(this, viewGroup), 0L);
                e9 e9Var2 = (e9) fVar2.put(viewGroup, new e9() {
                    @Override
                    public final void dispose() {
                        f9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return e9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f26018g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f26015b;
        int i10 = fVar.f27c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            k50 k50Var = (k50) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - k50Var.f27640b, 2.0d) + Math.pow(width - k50Var.f27639a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f26016c.get(k50Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f26017f);
        } else {
            super.draw(canvas);
        }
    }

    public final a9 f(k2.m0 m0Var, w7.y5 y5Var, long j10) {
        k50[] k50VarArr = (k50[]) m0Var.f10700a;
        if (!this.f26018g) {
            ArrayList arrayList = new ArrayList(k50VarArr.length);
            for (k50 k50Var : k50VarArr) {
                a0.f fVar = this.f26015b;
                if (!fVar.containsKey(k50Var)) {
                    fVar.put(k50Var, null);
                    arrayList.add(k50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((k50[]) arrayList.toArray(new k50[0]), y5Var, j10);
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

    public final a9 g(k50[] k50VarArr, w7.y5 y5Var, long j10) {
        if (k50VarArr.length == 0) {
            return null;
        }
        w7.y5[] y5VarArr = {y5Var};
        Runnable[] runnableArr = new Runnable[k50VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < k50VarArr.length; i10++) {
            k50 k50Var = k50VarArr[i10];
            if (k50Var.f27639a != 0 && k50Var.f27640b != 0) {
                org.telegram.messenger.r5 r5Var = Utilities.e;
                z8 z8Var = new z8(this, k50Var, runnableArr, i10, y5VarArr);
                runnableArr[i10] = z8Var;
                r5Var.d(z8Var, j10);
            }
        }
        return new a9(this, y5VarArr, runnableArr, k50VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f26017f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f26017f.setColorFilter(colorFilter);
    }
}
