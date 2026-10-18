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
    public final int[] f31226a;
    public final a0.f f31227b;
    public final a0.f f31228c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f31229f;
    public boolean f31230g;

    public v9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f31227b = new a0.l(0);
        this.f31228c = new a0.l(0);
        this.d = new a0.l(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f31229f = paint;
        this.f31230g = false;
        setDither(true);
        this.f31226a = iArr;
        paint.setDither(true);
    }

    public static void a(v9 v9Var, Runnable[] runnableArr, Bitmap bitmap, t60 t60Var, int i10, w7.w5[] w5VarArr) {
        a0.f fVar = v9Var.f31227b;
        ArrayList arrayList = v9Var.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(t60Var, bitmap);
        } else {
            fVar.remove(t60Var);
            v9Var.f31228c.remove(t60Var);
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
        w7.w5 w5Var = w5VarArr[0];
        if (w5Var != null) {
            w5Var.b(t60Var.f30476a, t60Var.f30477b);
            if (!z10) {
                w5VarArr[0].a();
                w5VarArr[0] = null;
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
        switch (t9.f30492a[orientation.ordinal()]) {
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
        if (!this.f31230g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f31227b.f27c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f31227b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f31228c.clear();
            this.d.clear();
            this.f31230g = true;
        }
    }

    public final u9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f31230g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f31227b;
        int i10 = fVar.f27c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                t60 t60Var = (t60) fVar.e(i11);
                if (t60Var.f30476a == width && t60Var.f30477b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f31229f);
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
                t60 t60Var2 = new t60(width, height);
                fVar.put(t60Var2, null);
                this.f31228c.put(t60Var2, Boolean.TRUE);
                final q9 g10 = g(new t60[]{t60Var2}, new s9(this, viewGroup), 0L);
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
        if (this.f31230g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f31227b;
        int i10 = fVar.f27c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            t60 t60Var = (t60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - t60Var.f30477b, 2.0d) + Math.pow(width - t60Var.f30476a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f31228c.get(t60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f31229f);
        } else {
            super.draw(canvas);
        }
    }

    public final q9 f(ki.t1 t1Var, w7.w5 w5Var, long j10) {
        t60[] t60VarArr = (t60[]) t1Var.f15524b;
        if (!this.f31230g) {
            ArrayList arrayList = new ArrayList(t60VarArr.length);
            for (t60 t60Var : t60VarArr) {
                a0.f fVar = this.f31227b;
                if (!fVar.containsKey(t60Var)) {
                    fVar.put(t60Var, null);
                    arrayList.add(t60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((t60[]) arrayList.toArray(new t60[0]), w5Var, j10);
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

    public final q9 g(t60[] t60VarArr, w7.w5 w5Var, long j10) {
        if (t60VarArr.length == 0) {
            return null;
        }
        w7.w5[] w5VarArr = {w5Var};
        Runnable[] runnableArr = new Runnable[t60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < t60VarArr.length; i10++) {
            t60 t60Var = t60VarArr[i10];
            if (t60Var.f30476a != 0 && t60Var.f30477b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                p9 p9Var = new p9(this, t60Var, runnableArr, i10, w5VarArr);
                runnableArr[i10] = p9Var;
                dispatchQueue.postRunnable(p9Var, j10);
            }
        }
        return new q9(this, w5VarArr, runnableArr, t60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f31229f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f31229f.setColorFilter(colorFilter);
    }
}
