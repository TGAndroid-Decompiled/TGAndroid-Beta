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
public final class n9 extends GradientDrawable {
    public final int[] f31049a;
    public final a0.f f31050b;
    public final a0.f f31051c;
    public final a0.f d;
    public final ArrayList f31052e;
    public final Paint f31053f;
    public boolean f31054g;

    public n9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f31050b = new a0.k(0);
        this.f31051c = new a0.k(0);
        this.d = new a0.k(0);
        this.f31052e = new ArrayList();
        Paint paint = new Paint(1);
        this.f31053f = paint;
        this.f31054g = false;
        setDither(true);
        this.f31049a = iArr;
        paint.setDither(true);
    }

    public static void a(n9 n9Var, Runnable[] runnableArr, Bitmap bitmap, h50 h50Var, int i9, g7.b6[] b6VarArr) {
        a0.f fVar = n9Var.f31050b;
        ArrayList arrayList = n9Var.f31052e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(h50Var, bitmap);
        } else {
            fVar.remove(h50Var);
            n9Var.f31051c.remove(h50Var);
        }
        runnableArr[i9] = null;
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
        g7.b6 b6Var = b6VarArr[0];
        if (b6Var != null) {
            b6Var.b(h50Var.f28978a, h50Var.f28979b);
            if (!z10) {
                b6VarArr[0].a();
                b6VarArr[0] = null;
            }
        }
    }

    public static GradientDrawable.Orientation d(int i9) {
        if (i9 != 0) {
            if (i9 != 90) {
                if (i9 != 135) {
                    if (i9 != 180) {
                        if (i9 != 225) {
                            if (i9 != 270) {
                                if (i9 != 315) {
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

    public static Rect e(GradientDrawable.Orientation orientation, int i9, int i10) {
        Rect rect = new Rect();
        switch (l9.f30407a[orientation.ordinal()]) {
            case 1:
                int i11 = i9 / 2;
                rect.left = i11;
                rect.top = 0;
                rect.right = i11;
                rect.bottom = i10;
                return rect;
            case 2:
                rect.left = i9;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i10;
                return rect;
            case 3:
                rect.left = i9;
                int i12 = i10 / 2;
                rect.top = i12;
                rect.right = 0;
                rect.bottom = i12;
                return rect;
            case 4:
                rect.left = i9;
                rect.top = i10;
                rect.right = 0;
                rect.bottom = 0;
                return rect;
            case 5:
                int i13 = i9 / 2;
                rect.left = i13;
                rect.top = i10;
                rect.right = i13;
                rect.bottom = 0;
                return rect;
            case 6:
                rect.left = 0;
                rect.top = i10;
                rect.right = i9;
                rect.bottom = 0;
                return rect;
            case 7:
                rect.left = 0;
                int i14 = i10 / 2;
                rect.top = i14;
                rect.right = i9;
                rect.bottom = i14;
                return rect;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i9;
                rect.bottom = i10;
                return rect;
        }
    }

    public final void b() {
        if (!this.f31054g) {
            for (int size = this.f31052e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.f31052e.remove(size));
            }
            for (int i9 = this.f31050b.f28c - 1; i9 >= 0; i9--) {
                Bitmap bitmap = (Bitmap) this.f31050b.f(i9);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f31051c.clear();
            this.d.clear();
            this.f31054g = true;
        }
    }

    public final m9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f31054g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f31050b;
        int i9 = fVar.f28c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i9) {
                h50 h50Var = (h50) fVar.e(i10);
                if (h50Var.f28978a == width && h50Var.f28979b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f31053f);
                    } else {
                        super.draw(canvas);
                    }
                    return (m9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                m9 m9Var = (m9) fVar2.remove(viewGroup);
                if (m9Var != null) {
                    m9Var.dispose();
                }
                h50 h50Var2 = new h50(width, height);
                fVar.put(h50Var2, null);
                this.f31051c.put(h50Var2, Boolean.TRUE);
                final i9 g10 = g(new h50[]{h50Var2}, new k9(this, viewGroup), 0L);
                m9 m9Var2 = (m9) fVar2.put(viewGroup, new m9() {
                    @Override
                    public final void dispose() {
                        n9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return m9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f31054g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f31050b;
        int i9 = fVar.f28c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i9; i10++) {
            h50 h50Var = (h50) fVar.e(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - h50Var.f28979b, 2.0d) + Math.pow(width - h50Var.f28978a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.h(i10)) != null && ((bool = (Boolean) this.f31051c.get(h50Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f31053f);
        } else {
            super.draw(canvas);
        }
    }

    public final i9 f(m5.c0 c0Var, g7.b6 b6Var, long j10) {
        h50[] h50VarArr = (h50[]) c0Var.f17378b;
        if (!this.f31054g) {
            ArrayList arrayList = new ArrayList(h50VarArr.length);
            for (h50 h50Var : h50VarArr) {
                a0.f fVar = this.f31050b;
                if (!fVar.containsKey(h50Var)) {
                    fVar.put(h50Var, null);
                    arrayList.add(h50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((h50[]) arrayList.toArray(new h50[0]), b6Var, j10);
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

    public final i9 g(h50[] h50VarArr, g7.b6 b6Var, long j10) {
        if (h50VarArr.length == 0) {
            return null;
        }
        g7.b6[] b6VarArr = {b6Var};
        Runnable[] runnableArr = new Runnable[h50VarArr.length];
        this.f31052e.add(runnableArr);
        for (int i9 = 0; i9 < h50VarArr.length; i9++) {
            h50 h50Var = h50VarArr[i9];
            if (h50Var.f28978a != 0 && h50Var.f28979b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                h9 h9Var = new h9(this, h50Var, runnableArr, i9, b6VarArr);
                runnableArr[i9] = h9Var;
                dispatchQueue.postRunnable(h9Var, j10);
            }
        }
        return new i9(this, b6VarArr, runnableArr, h50VarArr);
    }

    @Override
    public final void setAlpha(int i9) {
        super.setAlpha(i9);
        this.f31053f.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f31053f.setColorFilter(colorFilter);
    }
}
