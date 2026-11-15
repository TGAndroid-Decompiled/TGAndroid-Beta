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
public final class h9 extends GradientDrawable {
    public final int[] f35195a;
    public final a0.f f35196b;
    public final a0.f f35197c;
    public final a0.f d;
    public final ArrayList f35198e;
    public final Paint f35199f;
    public boolean f35200g;

    public h9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f35196b = new a0.l(0);
        this.f35197c = new a0.l(0);
        this.d = new a0.l(0);
        this.f35198e = new ArrayList();
        Paint paint = new Paint(1);
        this.f35199f = paint;
        this.f35200g = false;
        setDither(true);
        this.f35195a = iArr;
        paint.setDither(true);
    }

    public static void a(h9 h9Var, Runnable[] runnableArr, Bitmap bitmap, x40 x40Var, int i7, c8.ga[] gaVarArr) {
        a0.f fVar = h9Var.f35196b;
        ArrayList arrayList = h9Var.f35198e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(x40Var, bitmap);
        } else {
            fVar.remove(x40Var);
            h9Var.f35197c.remove(x40Var);
        }
        runnableArr[i7] = null;
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
        c8.ga gaVar = gaVarArr[0];
        if (gaVar != null) {
            gaVar.b(x40Var.f41566a, x40Var.f41567b);
            if (!z10) {
                gaVarArr[0].a();
                gaVarArr[0] = null;
            }
        }
    }

    public static GradientDrawable.Orientation d(int i7) {
        if (i7 != 0) {
            if (i7 != 90) {
                if (i7 != 135) {
                    if (i7 != 180) {
                        if (i7 != 225) {
                            if (i7 != 270) {
                                if (i7 != 315) {
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

    public static Rect e(GradientDrawable.Orientation orientation, int i7, int i10) {
        Rect rect = new Rect();
        switch (f9.f34549a[orientation.ordinal()]) {
            case 1:
                int i11 = i7 / 2;
                rect.left = i11;
                rect.top = 0;
                rect.right = i11;
                rect.bottom = i10;
                return rect;
            case 2:
                rect.left = i7;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i10;
                return rect;
            case 3:
                rect.left = i7;
                int i12 = i10 / 2;
                rect.top = i12;
                rect.right = 0;
                rect.bottom = i12;
                return rect;
            case 4:
                rect.left = i7;
                rect.top = i10;
                rect.right = 0;
                rect.bottom = 0;
                return rect;
            case 5:
                int i13 = i7 / 2;
                rect.left = i13;
                rect.top = i10;
                rect.right = i13;
                rect.bottom = 0;
                return rect;
            case 6:
                rect.left = 0;
                rect.top = i10;
                rect.right = i7;
                rect.bottom = 0;
                return rect;
            case 7:
                rect.left = 0;
                int i14 = i10 / 2;
                rect.top = i14;
                rect.right = i7;
                rect.bottom = i14;
                return rect;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i7;
                rect.bottom = i10;
                return rect;
        }
    }

    public final void b() {
        if (!this.f35200g) {
            for (int size = this.f35198e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.p5 p5Var = Utilities.f22416e;
                Runnable[] runnableArr = (Runnable[]) this.f35198e.remove(size);
                p5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    p5Var.a(runnable);
                }
            }
            for (int i7 = this.f35196b.f31c - 1; i7 >= 0; i7--) {
                Bitmap bitmap = (Bitmap) this.f35196b.g(i7);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f35197c.clear();
            this.d.clear();
            this.f35200g = true;
        }
    }

    public final g9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f35200g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f35196b;
        int i7 = fVar.f31c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i7) {
                x40 x40Var = (x40) fVar.f(i10);
                if (x40Var.f41566a == width && x40Var.f41567b == height) {
                    Bitmap bitmap = (Bitmap) fVar.i(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f35199f);
                    } else {
                        super.draw(canvas);
                    }
                    return (g9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                g9 g9Var = (g9) fVar2.remove(viewGroup);
                if (g9Var != null) {
                    g9Var.dispose();
                }
                x40 x40Var2 = new x40(width, height);
                fVar.put(x40Var2, null);
                this.f35197c.put(x40Var2, Boolean.TRUE);
                final c9 g10 = g(new x40[]{x40Var2}, new e9(this, viewGroup), 0L);
                g9 g9Var2 = (g9) fVar2.put(viewGroup, new g9() {
                    @Override
                    public final void dispose() {
                        h9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return g9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f35200g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f35196b;
        int i7 = fVar.f31c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i7; i10++) {
            x40 x40Var = (x40) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - x40Var.f41567b, 2.0d) + Math.pow(width - x40Var.f41566a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.i(i10)) != null && ((bool = (Boolean) this.f35197c.get(x40Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f35199f);
        } else {
            super.draw(canvas);
        }
    }

    public final c9 f(ia.d dVar, c8.ga gaVar, long j3) {
        x40[] x40VarArr = (x40[]) dVar.f15881b;
        if (!this.f35200g) {
            ArrayList arrayList = new ArrayList(x40VarArr.length);
            for (x40 x40Var : x40VarArr) {
                a0.f fVar = this.f35196b;
                if (!fVar.containsKey(x40Var)) {
                    fVar.put(x40Var, null);
                    arrayList.add(x40Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((x40[]) arrayList.toArray(new x40[0]), gaVar, j3);
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

    public final c9 g(x40[] x40VarArr, c8.ga gaVar, long j3) {
        if (x40VarArr.length == 0) {
            return null;
        }
        c8.ga[] gaVarArr = {gaVar};
        Runnable[] runnableArr = new Runnable[x40VarArr.length];
        this.f35198e.add(runnableArr);
        for (int i7 = 0; i7 < x40VarArr.length; i7++) {
            x40 x40Var = x40VarArr[i7];
            if (x40Var.f41566a != 0 && x40Var.f41567b != 0) {
                org.telegram.messenger.p5 p5Var = Utilities.f22416e;
                b9 b9Var = new b9(this, x40Var, runnableArr, i7, gaVarArr);
                runnableArr[i7] = b9Var;
                p5Var.d(b9Var, j3);
            }
        }
        return new c9(this, gaVarArr, runnableArr, x40VarArr);
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        this.f35199f.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f35199f.setColorFilter(colorFilter);
    }
}
