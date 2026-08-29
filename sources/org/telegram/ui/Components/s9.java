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
public final class s9 extends GradientDrawable {
    public final int[] f32587a;
    public final a0.f f32588b;
    public final a0.f f32589c;
    public final a0.f d;
    public final ArrayList f32590e;
    public final Paint f32591f;
    public boolean f32592g;

    public s9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f32588b = new a0.k(0);
        this.f32589c = new a0.k(0);
        this.d = new a0.k(0);
        this.f32590e = new ArrayList();
        Paint paint = new Paint(1);
        this.f32591f = paint;
        this.f32592g = false;
        setDither(true);
        this.f32587a = iArr;
        paint.setDither(true);
    }

    public static void a(s9 s9Var, Runnable[] runnableArr, Bitmap bitmap, u50 u50Var, int i10, i7.c6[] c6VarArr) {
        a0.f fVar = s9Var.f32588b;
        ArrayList arrayList = s9Var.f32590e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(u50Var, bitmap);
        } else {
            fVar.remove(u50Var);
            s9Var.f32589c.remove(u50Var);
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
        i7.c6 c6Var = c6VarArr[0];
        if (c6Var != null) {
            c6Var.b(u50Var.f33142a, u50Var.f33143b);
            if (!z10) {
                c6VarArr[0].a();
                c6VarArr[0] = null;
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
        switch (q9.f31871a[orientation.ordinal()]) {
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
        if (!this.f32592g) {
            for (int size = this.f32590e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.f32590e.remove(size));
            }
            for (int i10 = this.f32588b.f28c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f32588b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f32589c.clear();
            this.d.clear();
            this.f32592g = true;
        }
    }

    public final r9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f32592g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f32588b;
        int i10 = fVar.f28c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                u50 u50Var = (u50) fVar.e(i11);
                if (u50Var.f33142a == width && u50Var.f33143b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f32591f);
                    } else {
                        super.draw(canvas);
                    }
                    return (r9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                r9 r9Var = (r9) fVar2.remove(viewGroup);
                if (r9Var != null) {
                    r9Var.dispose();
                }
                u50 u50Var2 = new u50(width, height);
                fVar.put(u50Var2, null);
                this.f32589c.put(u50Var2, Boolean.TRUE);
                final n9 g10 = g(new u50[]{u50Var2}, new p9(this, viewGroup), 0L);
                r9 r9Var2 = (r9) fVar2.put(viewGroup, new r9() {
                    @Override
                    public final void dispose() {
                        s9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return r9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f32592g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f32588b;
        int i10 = fVar.f28c;
        float f9 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            u50 u50Var = (u50) fVar.e(i11);
            float f10 = f9;
            float sqrt = (float) Math.sqrt(Math.pow(height - u50Var.f33143b, 2.0d) + Math.pow(width - u50Var.f33142a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f32589c.get(u50Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f9 = sqrt;
            } else {
                f9 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f32591f);
        } else {
            super.draw(canvas);
        }
    }

    public final n9 f(o1.a aVar, i7.c6 c6Var, long j10) {
        u50[] u50VarArr = (u50[]) aVar.f19014b;
        if (!this.f32592g) {
            ArrayList arrayList = new ArrayList(u50VarArr.length);
            for (u50 u50Var : u50VarArr) {
                a0.f fVar = this.f32588b;
                if (!fVar.containsKey(u50Var)) {
                    fVar.put(u50Var, null);
                    arrayList.add(u50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((u50[]) arrayList.toArray(new u50[0]), c6Var, j10);
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

    public final n9 g(u50[] u50VarArr, i7.c6 c6Var, long j10) {
        if (u50VarArr.length == 0) {
            return null;
        }
        i7.c6[] c6VarArr = {c6Var};
        Runnable[] runnableArr = new Runnable[u50VarArr.length];
        this.f32590e.add(runnableArr);
        for (int i10 = 0; i10 < u50VarArr.length; i10++) {
            u50 u50Var = u50VarArr[i10];
            if (u50Var.f33142a != 0 && u50Var.f33143b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                m9 m9Var = new m9(this, u50Var, runnableArr, i10, c6VarArr);
                runnableArr[i10] = m9Var;
                dispatchQueue.postRunnable(m9Var, j10);
            }
        }
        return new n9(this, c6VarArr, runnableArr, u50VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f32591f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f32591f.setColorFilter(colorFilter);
    }
}
