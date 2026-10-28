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
    public final int[] f34702a;
    public final a0.f f34703b;
    public final a0.f f34704c;
    public final a0.f d;
    public final ArrayList e;
    public final Paint f34705f;
    public boolean f34706g;

    public x9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f34703b = new a0.l(0);
        this.f34704c = new a0.l(0);
        this.d = new a0.l(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f34705f = paint;
        this.f34706g = false;
        setDither(true);
        this.f34702a = iArr;
        paint.setDither(true);
    }

    public static void a(x9 x9Var, Runnable[] runnableArr, Bitmap bitmap, w60 w60Var, int i10, kb1[] kb1VarArr) {
        a0.f fVar = x9Var.f34703b;
        ArrayList arrayList = x9Var.e;
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
            x9Var.f34704c.remove(w60Var);
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
        kb1 kb1Var = kb1VarArr[0];
        if (kb1Var != null) {
            kb1Var.P(w60Var.f34460a, w60Var.f34461b);
            if (!z10) {
                kb1VarArr[0].M();
                kb1VarArr[0] = null;
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
        switch (v9.f33630a[orientation.ordinal()]) {
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
        if (!this.f34706g) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.e.remove(size));
            }
            for (int i10 = this.f34703b.f27c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f34703b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f34704c.clear();
            this.d.clear();
            this.f34706g = true;
        }
    }

    public final w9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f34706g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f34703b;
        int i10 = fVar.f27c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                w60 w60Var = (w60) fVar.e(i11);
                if (w60Var.f34460a == width && w60Var.f34461b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f34705f);
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
                w60 w60Var2 = new w60(width, height);
                fVar.put(w60Var2, null);
                this.f34704c.put(w60Var2, Boolean.TRUE);
                final s9 g7 = g(new w60[]{w60Var2}, new u9(this, viewGroup), 0L);
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
        if (this.f34706g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f34703b;
        int i10 = fVar.f27c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            w60 w60Var = (w60) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - w60Var.f34461b, 2.0d) + Math.pow(width - w60Var.f34460a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f34704c.get(w60Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f34705f);
        } else {
            super.draw(canvas);
        }
    }

    public final s9 f(jg.s0 s0Var, kb1 kb1Var, long j10) {
        w60[] w60VarArr = (w60[]) s0Var.f15827b;
        if (!this.f34706g) {
            ArrayList arrayList = new ArrayList(w60VarArr.length);
            for (w60 w60Var : w60VarArr) {
                a0.f fVar = this.f34703b;
                if (!fVar.containsKey(w60Var)) {
                    fVar.put(w60Var, null);
                    arrayList.add(w60Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((w60[]) arrayList.toArray(new w60[0]), kb1Var, j10);
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

    public final s9 g(w60[] w60VarArr, kb1 kb1Var, long j10) {
        if (w60VarArr.length == 0) {
            return null;
        }
        kb1[] kb1VarArr = {kb1Var};
        Runnable[] runnableArr = new Runnable[w60VarArr.length];
        this.e.add(runnableArr);
        for (int i10 = 0; i10 < w60VarArr.length; i10++) {
            w60 w60Var = w60VarArr[i10];
            if (w60Var.f34460a != 0 && w60Var.f34461b != 0) {
                DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
                r9 r9Var = new r9(this, w60Var, runnableArr, i10, kb1VarArr);
                runnableArr[i10] = r9Var;
                dispatchQueue2.postRunnable(r9Var, j10);
            }
        }
        return new s9(this, kb1VarArr, runnableArr, w60VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f34705f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f34705f.setColorFilter(colorFilter);
    }
}
