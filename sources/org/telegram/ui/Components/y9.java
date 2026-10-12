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
public final class y9 extends GradientDrawable {
    public final int[] f31514a;
    public final a0.f f31515b;
    public final a0.f f31516c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f31517f;
    public boolean f31518g;

    public y9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f31515b = new a0.l(0);
        this.f31516c = new a0.l(0);
        this.d = new a0.l(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f31517f = paint;
        this.f31518g = false;
        setDither(true);
        this.f31514a = iArr;
        paint.setDither(true);
    }

    public static void a(y9 y9Var, Runnable[] runnableArr, Bitmap bitmap, w60 w60Var, int i10, w7.x5[] x5VarArr) {
        a0.f fVar = y9Var.f31515b;
        ArrayList arrayList = y9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(w60Var, bitmap);
        } else {
            fVar.remove(w60Var);
            y9Var.f31516c.remove(w60Var);
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
        w7.x5 x5Var = x5VarArr[0];
        if (x5Var != null) {
            x5Var.b(w60Var.f30805a, w60Var.f30806b);
            if (!z10) {
                x5VarArr[0].a();
                x5VarArr[0] = null;
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
        switch (w9.f30825a[orientation.ordinal()]) {
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
        if (!this.f31518g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f31515b.f27c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f31515b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f31516c.clear();
            this.d.clear();
            this.f31518g = true;
        }
    }

    public final x9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f31518g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f31515b;
        int i10 = fVar.f27c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                w60 w60Var = (w60) fVar.e(i11);
                if (w60Var.f30805a == width && w60Var.f30806b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f31517f);
                    } else {
                        super.draw(canvas);
                    }
                    return (x9) fVar2.get(viewGroup);
                }
                i11++;
            } else {
                x9 x9Var = (x9) fVar2.remove(viewGroup);
                if (x9Var != null) {
                    x9Var.dispose();
                }
                w60 w60Var2 = new w60(width, height);
                fVar.put(w60Var2, null);
                this.f31516c.put(w60Var2, Boolean.TRUE);
                final t9 g10 = g(new w60[]{w60Var2}, new v9(this, viewGroup), 0L);
                x9 x9Var2 = (x9) fVar2.put(viewGroup, new x9() {
                    @Override
                    public final void dispose() {
                        y9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return x9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f31518g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f31515b;
        int i10 = fVar.f27c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            w60 w60Var = (w60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - w60Var.f30806b, 2.0d) + Math.pow(width - w60Var.f30805a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f31516c.get(w60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f31517f);
        } else {
            super.draw(canvas);
        }
    }

    public final t9 f(ji.w4 w4Var, w7.x5 x5Var, long j10) {
        w60[] w60VarArr = (w60[]) w4Var.f13592b;
        if (!this.f31518g) {
            ArrayList arrayList = new ArrayList(w60VarArr.length);
            for (w60 w60Var : w60VarArr) {
                a0.f fVar = this.f31515b;
                if (!fVar.containsKey(w60Var)) {
                    fVar.put(w60Var, null);
                    arrayList.add(w60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((w60[]) arrayList.toArray(new w60[0]), x5Var, j10);
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

    public final t9 g(w60[] w60VarArr, w7.x5 x5Var, long j10) {
        if (w60VarArr.length == 0) {
            return null;
        }
        w7.x5[] x5VarArr = {x5Var};
        Runnable[] runnableArr = new Runnable[w60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < w60VarArr.length; i10++) {
            w60 w60Var = w60VarArr[i10];
            if (w60Var.f30805a != 0 && w60Var.f30806b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                s9 s9Var = new s9(this, w60Var, runnableArr, i10, x5VarArr);
                runnableArr[i10] = s9Var;
                dispatchQueue.postRunnable(s9Var, j10);
            }
        }
        return new t9(this, x5VarArr, runnableArr, w60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f31517f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f31517f.setColorFilter(colorFilter);
    }
}
