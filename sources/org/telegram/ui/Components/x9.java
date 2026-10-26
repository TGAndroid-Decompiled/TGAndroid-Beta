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
public final class x9 extends GradientDrawable {
    public final int[] f34667a;
    public final a0.f f34668b;
    public final a0.f f34669c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f34670f;
    public boolean f34671g;

    public x9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f34668b = new a0.l(0);
        this.f34669c = new a0.l(0);
        this.d = new a0.l(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f34670f = paint;
        this.f34671g = false;
        setDither(true);
        this.f34667a = iArr;
        paint.setDither(true);
    }

    public static void a(x9 x9Var, Runnable[] runnableArr, Bitmap bitmap, v60 v60Var, int i10, gb1[] gb1VarArr) {
        a0.f fVar = x9Var.f34668b;
        ArrayList arrayList = x9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(v60Var, bitmap);
        } else {
            fVar.remove(v60Var);
            x9Var.f34669c.remove(v60Var);
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
        gb1 gb1Var = gb1VarArr[0];
        if (gb1Var != null) {
            gb1Var.P(v60Var.f33584a, v60Var.f33585b);
            if (!z10) {
                gb1VarArr[0].M();
                gb1VarArr[0] = null;
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
        switch (v9.f33602a[orientation.ordinal()]) {
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
        if (!this.f34671g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f34668b.f27c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f34668b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f34669c.clear();
            this.d.clear();
            this.f34671g = true;
        }
    }

    public final w9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f34671g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f34668b;
        int i10 = fVar.f27c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                v60 v60Var = (v60) fVar.e(i11);
                if (v60Var.f33584a == width && v60Var.f33585b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f34670f);
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
                v60 v60Var2 = new v60(width, height);
                fVar.put(v60Var2, null);
                this.f34669c.put(v60Var2, Boolean.TRUE);
                final s9 g7 = g(new v60[]{v60Var2}, new u9(this, viewGroup), 0L);
                w9 w9Var2 = (w9) fVar2.put(viewGroup, new w9() {
                    @Override
                    public final void dispose() {
                        x9.this.d.remove(viewGroup);
                        g7.dispose();
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
        if (this.f34671g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f34668b;
        int i10 = fVar.f27c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            v60 v60Var = (v60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - v60Var.f33585b, 2.0d) + Math.pow(width - v60Var.f33584a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f34669c.get(v60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f34670f);
        } else {
            super.draw(canvas);
        }
    }

    public final s9 f(jg.s0 s0Var, gb1 gb1Var, long j10) {
        v60[] v60VarArr = (v60[]) s0Var.f15828b;
        if (!this.f34671g) {
            ArrayList arrayList = new ArrayList(v60VarArr.length);
            for (v60 v60Var : v60VarArr) {
                a0.f fVar = this.f34668b;
                if (!fVar.containsKey(v60Var)) {
                    fVar.put(v60Var, null);
                    arrayList.add(v60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((v60[]) arrayList.toArray(new v60[0]), gb1Var, j10);
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

    public final s9 g(v60[] v60VarArr, gb1 gb1Var, long j10) {
        if (v60VarArr.length == 0) {
            return null;
        }
        gb1[] gb1VarArr = {gb1Var};
        Runnable[] runnableArr = new Runnable[v60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < v60VarArr.length; i10++) {
            v60 v60Var = v60VarArr[i10];
            if (v60Var.f33584a != 0 && v60Var.f33585b != 0) {
                DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
                r9 r9Var = new r9(this, v60Var, runnableArr, i10, gb1VarArr);
                runnableArr[i10] = r9Var;
                dispatchQueue2.postRunnable(r9Var, j10);
            }
        }
        return new s9(this, gb1VarArr, runnableArr, v60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f34670f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f34670f.setColorFilter(colorFilter);
    }
}
