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
public final class k9 extends GradientDrawable {
    public final int[] f35277a;
    public final a0.f f35278b;
    public final a0.f f35279c;
    public final a0.f d;
    public final ArrayList f35280e;
    public final Paint f35281f;
    public boolean f35282g;

    public k9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f35278b = new a0.l(0);
        this.f35279c = new a0.l(0);
        this.d = new a0.l(0);
        this.f35280e = new ArrayList();
        Paint paint = new Paint(1);
        this.f35281f = paint;
        this.f35282g = false;
        setDither(true);
        this.f35277a = iArr;
        paint.setDither(true);
    }

    public static void a(k9 k9Var, Runnable[] runnableArr, Bitmap bitmap, v40 v40Var, int i7, c8.ea[] eaVarArr) {
        a0.f fVar = k9Var.f35278b;
        ArrayList arrayList = k9Var.f35280e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(v40Var, bitmap);
        } else {
            fVar.remove(v40Var);
            k9Var.f35279c.remove(v40Var);
        }
        runnableArr[i7] = null;
        boolean z9 = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z9 = false;
        if (!z9) {
            arrayList.remove(runnableArr);
        }
        c8.ea eaVar = eaVarArr[0];
        if (eaVar != null) {
            eaVar.b(v40Var.f38914a, v40Var.f38915b);
            if (!z9) {
                eaVarArr[0].a();
                eaVarArr[0] = null;
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
        switch (i9.f34649a[orientation.ordinal()]) {
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
        if (!this.f35282g) {
            for (int size = this.f35280e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                Runnable[] runnableArr = (Runnable[]) this.f35280e.remove(size);
                p5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    p5Var.a(runnable);
                }
            }
            for (int i7 = this.f35278b.f31c - 1; i7 >= 0; i7--) {
                Bitmap bitmap = (Bitmap) this.f35278b.g(i7);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f35279c.clear();
            this.d.clear();
            this.f35282g = true;
        }
    }

    public final j9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f35282g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f35278b;
        int i7 = fVar.f31c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i7) {
                v40 v40Var = (v40) fVar.f(i10);
                if (v40Var.f38914a == width && v40Var.f38915b == height) {
                    Bitmap bitmap = (Bitmap) fVar.i(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f35281f);
                    } else {
                        super.draw(canvas);
                    }
                    return (j9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                j9 j9Var = (j9) fVar2.remove(viewGroup);
                if (j9Var != null) {
                    j9Var.dispose();
                }
                v40 v40Var2 = new v40(width, height);
                fVar.put(v40Var2, null);
                this.f35279c.put(v40Var2, Boolean.TRUE);
                final f9 g10 = g(new v40[]{v40Var2}, new h9(this, viewGroup), 0L);
                j9 j9Var2 = (j9) fVar2.put(viewGroup, new j9() {
                    @Override
                    public final void dispose() {
                        k9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return j9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f35282g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f35278b;
        int i7 = fVar.f31c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i7; i10++) {
            v40 v40Var = (v40) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - v40Var.f38915b, 2.0d) + Math.pow(width - v40Var.f38914a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.i(i10)) != null && ((bool = (Boolean) this.f35279c.get(v40Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f35281f);
        } else {
            super.draw(canvas);
        }
    }

    public final f9 f(n nVar, c8.ea eaVar, long j3) {
        v40[] v40VarArr = (v40[]) nVar.f36185a;
        if (!this.f35282g) {
            ArrayList arrayList = new ArrayList(v40VarArr.length);
            for (v40 v40Var : v40VarArr) {
                a0.f fVar = this.f35278b;
                if (!fVar.containsKey(v40Var)) {
                    fVar.put(v40Var, null);
                    arrayList.add(v40Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((v40[]) arrayList.toArray(new v40[0]), eaVar, j3);
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

    public final f9 g(v40[] v40VarArr, c8.ea eaVar, long j3) {
        if (v40VarArr.length == 0) {
            return null;
        }
        c8.ea[] eaVarArr = {eaVar};
        Runnable[] runnableArr = new Runnable[v40VarArr.length];
        this.f35280e.add(runnableArr);
        for (int i7 = 0; i7 < v40VarArr.length; i7++) {
            v40 v40Var = v40VarArr[i7];
            if (v40Var.f38914a != 0 && v40Var.f38915b != 0) {
                org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                e9 e9Var = new e9(this, v40Var, runnableArr, i7, eaVarArr);
                runnableArr[i7] = e9Var;
                p5Var.d(e9Var, j3);
            }
        }
        return new f9(this, eaVarArr, runnableArr, v40VarArr);
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        this.f35281f.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f35281f.setColorFilter(colorFilter);
    }
}
