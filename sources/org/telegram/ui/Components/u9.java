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
public final class u9 extends GradientDrawable {
    public final int[] f28628a;
    public final a0.f f28629b;
    public final a0.f f28630c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f28631f;
    public boolean f28632g;

    public u9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f28629b = new a0.m(0);
        this.f28630c = new a0.m(0);
        this.d = new a0.m(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f28631f = paint;
        this.f28632g = false;
        setDither(true);
        this.f28628a = iArr;
        paint.setDither(true);
    }

    public static void a(u9 u9Var, Runnable[] runnableArr, Bitmap bitmap, g60 g60Var, int i10, w7.j0[] j0VarArr) {
        a0.f fVar = u9Var.f28629b;
        ArrayList arrayList = u9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(g60Var, bitmap);
        } else {
            fVar.remove(g60Var);
            u9Var.f28630c.remove(g60Var);
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
            j0Var.b(g60Var.f24266a, g60Var.f24267b);
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
        switch (s9.f28083a[orientation.ordinal()]) {
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
        if (!this.f28632g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f28629b.f30c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f28629b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f28630c.clear();
            this.d.clear();
            this.f28632g = true;
        }
    }

    public final t9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f28632g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f28629b;
        int i10 = fVar.f30c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                g60 g60Var = (g60) fVar.e(i11);
                if (g60Var.f24266a == width && g60Var.f24267b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f28631f);
                    } else {
                        super.draw(canvas);
                    }
                    return (t9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                t9 t9Var = (t9) fVar2.remove(viewGroup);
                if (t9Var != null) {
                    t9Var.dispose();
                }
                g60 g60Var2 = new g60(width, height);
                fVar.put(g60Var2, null);
                this.f28630c.put(g60Var2, Boolean.TRUE);
                final p9 g10 = g(new g60[]{g60Var2}, new r9(this, viewGroup), 0L);
                t9 t9Var2 = (t9) fVar2.put(viewGroup, new t9() {
                    @Override
                    public final void dispose() {
                        u9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return t9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f28632g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f28629b;
        int i10 = fVar.f30c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            g60 g60Var = (g60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - g60Var.f24267b, 2.0d) + Math.pow(width - g60Var.f24266a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f28630c.get(g60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f28631f);
        } else {
            super.draw(canvas);
        }
    }

    public final p9 f(n2.e eVar, w7.j0 j0Var, long j3) {
        g60[] g60VarArr = (g60[]) eVar.f15112b;
        if (!this.f28632g) {
            ArrayList arrayList = new ArrayList(g60VarArr.length);
            for (g60 g60Var : g60VarArr) {
                a0.f fVar = this.f28629b;
                if (!fVar.containsKey(g60Var)) {
                    fVar.put(g60Var, null);
                    arrayList.add(g60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((g60[]) arrayList.toArray(new g60[0]), j0Var, j3);
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

    public final p9 g(g60[] g60VarArr, w7.j0 j0Var, long j3) {
        if (g60VarArr.length == 0) {
            return null;
        }
        w7.j0[] j0VarArr = {j0Var};
        Runnable[] runnableArr = new Runnable[g60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < g60VarArr.length; i10++) {
            g60 g60Var = g60VarArr[i10];
            if (g60Var.f24266a != 0 && g60Var.f24267b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                o9 o9Var = new o9(this, g60Var, runnableArr, i10, j0VarArr);
                runnableArr[i10] = o9Var;
                dispatchQueue.postRunnable(o9Var, j3);
            }
        }
        return new p9(this, j0VarArr, runnableArr, g60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f28631f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f28631f.setColorFilter(colorFilter);
    }
}
