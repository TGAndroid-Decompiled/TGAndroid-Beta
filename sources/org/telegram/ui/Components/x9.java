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
public final class x9 extends GradientDrawable {
    public final int[] f32851a;
    public final a0.f f32852b;
    public final a0.f f32853c;
    public final a0.f d;
    public final ArrayList f32854e;
    public final Paint f32855f;
    public boolean f32856g;

    public x9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f32852b = new a0.m(0);
        this.f32853c = new a0.m(0);
        this.d = new a0.m(0);
        this.f32854e = new ArrayList();
        Paint paint = new Paint(1);
        this.f32855f = paint;
        this.f32856g = false;
        setDither(true);
        this.f32851a = iArr;
        paint.setDither(true);
    }

    public static void a(x9 x9Var, Runnable[] runnableArr, Bitmap bitmap, b70 b70Var, int i10, w7.i0[] i0VarArr) {
        a0.f fVar = x9Var.f32852b;
        ArrayList arrayList = x9Var.f32854e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(b70Var, bitmap);
        } else {
            fVar.remove(b70Var);
            x9Var.f32853c.remove(b70Var);
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
        w7.i0 i0Var = i0VarArr[0];
        if (i0Var != null) {
            i0Var.b(b70Var.f24871a, b70Var.f24872b);
            if (!z10) {
                i0VarArr[0].a();
                i0VarArr[0] = null;
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
        switch (v9.f31708a[orientation.ordinal()]) {
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
        if (!this.f32856g) {
            for (int size = this.f32854e.size() - 1; size >= 0; size--) {
                Utilities.globalQueue.cancelRunnables((Runnable[]) this.f32854e.remove(size));
            }
            for (int i10 = this.f32852b.f33c - 1; i10 >= 0; i10--) {
                Bitmap bitmap = (Bitmap) this.f32852b.f(i10);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f32853c.clear();
            this.d.clear();
            this.f32856g = true;
        }
    }

    public final w9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f32856g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f32852b;
        int i10 = fVar.f33c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 < i10) {
                b70 b70Var = (b70) fVar.e(i11);
                if (b70Var.f24871a == width && b70Var.f24872b == height) {
                    Bitmap bitmap = (Bitmap) fVar.h(i11);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f32855f);
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
                b70 b70Var2 = new b70(width, height);
                fVar.put(b70Var2, null);
                this.f32853c.put(b70Var2, Boolean.TRUE);
                final s9 g10 = g(new b70[]{b70Var2}, new u9(this, viewGroup), 0L);
                w9 w9Var2 = (w9) fVar2.put(viewGroup, new w9() {
                    @Override
                    public final void dispose() {
                        x9.this.d.remove(viewGroup);
                        g10.dispose();
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
        if (this.f32856g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f32852b;
        int i10 = fVar.f33c;
        float f7 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            b70 b70Var = (b70) fVar.e(i11);
            float f10 = f7;
            float sqrt = (float) Math.sqrt(Math.pow(height - b70Var.f24872b, 2.0d) + Math.pow(width - b70Var.f24871a, 2.0d));
            if (sqrt < f10 && (bitmap = (Bitmap) fVar.h(i11)) != null && ((bool = (Boolean) this.f32853c.get(b70Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f7 = sqrt;
            } else {
                f7 = f10;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f32855f);
        } else {
            super.draw(canvas);
        }
    }

    public final s9 f(l2.f fVar, w7.i0 i0Var, long j3) {
        b70[] b70VarArr = (b70[]) fVar.f15334b;
        if (!this.f32856g) {
            ArrayList arrayList = new ArrayList(b70VarArr.length);
            for (b70 b70Var : b70VarArr) {
                a0.f fVar2 = this.f32852b;
                if (!fVar2.containsKey(b70Var)) {
                    fVar2.put(b70Var, null);
                    arrayList.add(b70Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((b70[]) arrayList.toArray(new b70[0]), i0Var, j3);
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

    public final s9 g(b70[] b70VarArr, w7.i0 i0Var, long j3) {
        if (b70VarArr.length == 0) {
            return null;
        }
        w7.i0[] i0VarArr = {i0Var};
        Runnable[] runnableArr = new Runnable[b70VarArr.length];
        this.f32854e.add(runnableArr);
        for (int i10 = 0; i10 < b70VarArr.length; i10++) {
            b70 b70Var = b70VarArr[i10];
            if (b70Var.f24871a != 0 && b70Var.f24872b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                r9 r9Var = new r9(this, b70Var, runnableArr, i10, i0VarArr);
                runnableArr[i10] = r9Var;
                dispatchQueue.postRunnable(r9Var, j3);
            }
        }
        return new s9(this, i0VarArr, runnableArr, b70VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f32855f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f32855f.setColorFilter(colorFilter);
    }
}
