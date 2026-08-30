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
public final class o9 extends GradientDrawable {
    public final int[] f27519a;
    public final a0.f f27520b;
    public final a0.f f27521c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f27522f;
    public boolean f27523g;

    public o9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f27520b = new a0.k(0);
        this.f27521c = new a0.k(0);
        this.d = new a0.k(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f27522f = paint;
        this.f27523g = false;
        setDither(true);
        this.f27519a = iArr;
        paint.setDither(true);
    }

    public static void a(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, z50 z50Var, int i10, k7.y5[] y5VarArr) {
        a0.f fVar = o9Var.f27520b;
        ArrayList arrayList = o9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(z50Var, bitmap);
        } else {
            fVar.remove(z50Var);
            o9Var.f27521c.remove(z50Var);
        }
        runnableArr[i10] = null;
        boolean z4 = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z4 = false;
        if (!z4) {
            arrayList.remove(runnableArr);
        }
        k7.y5 y5Var = y5VarArr[0];
        if (y5Var != null) {
            y5Var.b(z50Var.f31247a, z50Var.f31248b);
            if (!z4) {
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
        switch (m9.f26991a[orientation.ordinal()]) {
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
        if (!this.f27523g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f27520b.f25c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f27520b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f27521c.clear();
            this.d.clear();
            this.f27523g = true;
        }
    }

    public final n9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f27523g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f27520b;
        int i10 = fVar.f25c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                z50 z50Var = (z50) fVar.e(i11);
                if (z50Var.f31247a == width && z50Var.f31248b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f27522f);
                    } else {
                        super.draw(canvas);
                    }
                    return (n9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                n9 n9Var = (n9) fVar2.remove(viewGroup);
                if (n9Var != null) {
                    n9Var.dispose();
                }
                z50 z50Var2 = new z50(width, height);
                fVar.put(z50Var2, null);
                this.f27521c.put(z50Var2, Boolean.TRUE);
                final j9 g10 = g(new z50[]{z50Var2}, new l9(this, viewGroup), 0L);
                n9 n9Var2 = (n9) fVar2.put(viewGroup, new n9() {
                    @Override
                    public final void dispose() {
                        o9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return n9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f27523g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f27520b;
        int i10 = fVar.f25c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            z50 z50Var = (z50) fVar.e(i11);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - z50Var.f31248b, 2.0d) + Math.pow(width - z50Var.f31247a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f27521c.get(z50Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f27522f);
        } else {
            super.draw(canvas);
        }
    }

    public final j9 f(org.telegram.ui.Cells.f1 f1Var, k7.y5 y5Var, long j10) {
        z50[] z50VarArr = (z50[]) f1Var.f21045b;
        if (!this.f27523g) {
            ArrayList arrayList = new ArrayList(z50VarArr.length);
            for (z50 z50Var : z50VarArr) {
                a0.f fVar = this.f27520b;
                if (!fVar.containsKey(z50Var)) {
                    fVar.put(z50Var, null);
                    arrayList.add(z50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((z50[]) arrayList.toArray(new z50[0]), y5Var, j10);
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

    public final j9 g(z50[] z50VarArr, k7.y5 y5Var, long j10) {
        if (z50VarArr.length == 0) {
            return null;
        }
        k7.y5[] y5VarArr = {y5Var};
        Runnable[] runnableArr = new Runnable[z50VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < z50VarArr.length; i10++) {
            z50 z50Var = z50VarArr[i10];
            if (z50Var.f31247a != 0 && z50Var.f31248b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                i9 i9Var = new i9(this, z50Var, runnableArr, i10, y5VarArr);
                runnableArr[i10] = i9Var;
                dispatchQueue.postRunnable(i9Var, j10);
            }
        }
        return new j9(this, y5VarArr, runnableArr, z50VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f27522f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f27522f.setColorFilter(colorFilter);
    }
}
