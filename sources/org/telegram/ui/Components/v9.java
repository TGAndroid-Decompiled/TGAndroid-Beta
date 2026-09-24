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
    public final int[] f29101a;
    public final a0.f f29102b;
    public final a0.f f29103c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f29104f;
    public boolean f29105g;

    public v9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f29102b = new a0.m(0);
        this.f29103c = new a0.m(0);
        this.d = new a0.m(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f29104f = paint;
        this.f29105g = false;
        setDither(true);
        this.f29101a = iArr;
        paint.setDither(true);
    }

    public static void a(v9 v9Var, Runnable[] runnableArr, Bitmap bitmap, j60 j60Var, int i10, w7.j0[] j0VarArr) {
        a0.f fVar = v9Var.f29102b;
        ArrayList arrayList = v9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(j60Var, bitmap);
        } else {
            fVar.remove(j60Var);
            v9Var.f29103c.remove(j60Var);
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
            j0Var.b(j60Var.f25261a, j60Var.f25262b);
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
        switch (t9.f28448a[orientation.ordinal()]) {
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
        if (!this.f29105g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f29102b.f30c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f29102b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f29103c.clear();
            this.d.clear();
            this.f29105g = true;
        }
    }

    public final u9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f29105g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f29102b;
        int i10 = fVar.f30c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                j60 j60Var = (j60) fVar.e(i11);
                if (j60Var.f25261a == width && j60Var.f25262b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f29104f);
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
                j60 j60Var2 = new j60(width, height);
                fVar.put(j60Var2, null);
                this.f29103c.put(j60Var2, Boolean.TRUE);
                final q9 g10 = g(new j60[]{j60Var2}, new s9(this, viewGroup), 0L);
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
        if (this.f29105g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f29102b;
        int i10 = fVar.f30c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            j60 j60Var = (j60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - j60Var.f25262b, 2.0d) + Math.pow(width - j60Var.f25261a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f29103c.get(j60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f29104f);
        } else {
            super.draw(canvas);
        }
    }

    public final q9 f(n2.e eVar, w7.j0 j0Var, long j3) {
        j60[] j60VarArr = (j60[]) eVar.f15101b;
        if (!this.f29105g) {
            ArrayList arrayList = new ArrayList(j60VarArr.length);
            for (j60 j60Var : j60VarArr) {
                a0.f fVar = this.f29102b;
                if (!fVar.containsKey(j60Var)) {
                    fVar.put(j60Var, null);
                    arrayList.add(j60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((j60[]) arrayList.toArray(new j60[0]), j0Var, j3);
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

    public final q9 g(j60[] j60VarArr, w7.j0 j0Var, long j3) {
        if (j60VarArr.length == 0) {
            return null;
        }
        w7.j0[] j0VarArr = {j0Var};
        Runnable[] runnableArr = new Runnable[j60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < j60VarArr.length; i10++) {
            j60 j60Var = j60VarArr[i10];
            if (j60Var.f25261a != 0 && j60Var.f25262b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                p9 p9Var = new p9(this, j60Var, runnableArr, i10, j0VarArr);
                runnableArr[i10] = p9Var;
                dispatchQueue.postRunnable(p9Var, j3);
            }
        }
        return new q9(this, j0VarArr, runnableArr, j60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f29104f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f29104f.setColorFilter(colorFilter);
    }
}
