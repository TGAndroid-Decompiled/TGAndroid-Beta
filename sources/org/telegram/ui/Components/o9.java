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
public final class o9 extends GradientDrawable {
    public final int[] f38069a;
    public final a0.f f38070b;
    public final a0.f f38071c;
    public final a0.f d;
    public final ArrayList f38072e;
    public final Paint f38073f;
    public boolean f38074g;

    public o9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f38070b = new a0.l(0);
        this.f38071c = new a0.l(0);
        this.d = new a0.l(0);
        this.f38072e = new ArrayList();
        Paint paint = new Paint(1);
        this.f38073f = paint;
        this.f38074g = false;
        setDither(true);
        this.f38069a = iArr;
        paint.setDither(true);
    }

    public static void a(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, f50 f50Var, int i7, c8.ja[] jaVarArr) {
        a0.f fVar = o9Var.f38070b;
        ArrayList arrayList = o9Var.f38072e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(f50Var, bitmap);
        } else {
            fVar.remove(f50Var);
            o9Var.f38071c.remove(f50Var);
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
        c8.ja jaVar = jaVarArr[0];
        if (jaVar != null) {
            jaVar.b(f50Var.f35010a, f50Var.f35011b);
            if (!z10) {
                jaVarArr[0].a();
                jaVarArr[0] = null;
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
        switch (m9.f37429a[orientation.ordinal()]) {
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
        if (!this.f38074g) {
            for (int size = this.f38072e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.q5 q5Var = Utilities.f22877e;
                Runnable[] runnableArr = (Runnable[]) this.f38072e.remove(size);
                q5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    q5Var.a(runnable);
                }
            }
            for (int i7 = this.f38070b.f31c - 1; i7 >= 0; i7--) {
                Bitmap bitmap = (Bitmap) this.f38070b.g(i7);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f38071c.clear();
            this.d.clear();
            this.f38074g = true;
        }
    }

    public final n9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f38074g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f38070b;
        int i7 = fVar.f31c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i7) {
                f50 f50Var = (f50) fVar.f(i10);
                if (f50Var.f35010a == width && f50Var.f35011b == height) {
                    Bitmap bitmap = (Bitmap) fVar.i(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f38073f);
                    } else {
                        super.draw(canvas);
                    }
                    return (n9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                n9 n9Var = (n9) fVar2.remove(viewGroup);
                if (n9Var != null) {
                    n9Var.dispose();
                }
                f50 f50Var2 = new f50(width, height);
                fVar.put(f50Var2, null);
                this.f38071c.put(f50Var2, Boolean.TRUE);
                final j9 g10 = g(new f50[]{f50Var2}, new l9(this, viewGroup), 0L);
                n9 n9Var2 = (n9) fVar2.put(viewGroup, new n9() {
                    @Override
                    public final void dispose() {
                        o9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return n9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f38074g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f38070b;
        int i7 = fVar.f31c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i7; i10++) {
            f50 f50Var = (f50) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - f50Var.f35011b, 2.0d) + Math.pow(width - f50Var.f35010a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.i(i10)) != null && ((bool = (Boolean) this.f38071c.get(f50Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f38073f);
        } else {
            super.draw(canvas);
        }
    }

    public final j9 f(org.telegram.ui.ActionBar.i5 i5Var, c8.ja jaVar, long j3) {
        f50[] f50VarArr = (f50[]) i5Var.f29095a;
        if (!this.f38074g) {
            ArrayList arrayList = new ArrayList(f50VarArr.length);
            for (f50 f50Var : f50VarArr) {
                a0.f fVar = this.f38070b;
                if (!fVar.containsKey(f50Var)) {
                    fVar.put(f50Var, null);
                    arrayList.add(f50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((f50[]) arrayList.toArray(new f50[0]), jaVar, j3);
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

    public final j9 g(f50[] f50VarArr, c8.ja jaVar, long j3) {
        if (f50VarArr.length == 0) {
            return null;
        }
        c8.ja[] jaVarArr = {jaVar};
        Runnable[] runnableArr = new Runnable[f50VarArr.length];
        this.f38072e.add(runnableArr);
        for (int i7 = 0; i7 < f50VarArr.length; i7++) {
            f50 f50Var = f50VarArr[i7];
            if (f50Var.f35010a != 0 && f50Var.f35011b != 0) {
                org.telegram.messenger.q5 q5Var = Utilities.f22877e;
                i9 i9Var = new i9(this, f50Var, runnableArr, i7, jaVarArr);
                runnableArr[i7] = i9Var;
                q5Var.d(i9Var, j3);
            }
        }
        return new j9(this, jaVarArr, runnableArr, f50VarArr);
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        this.f38073f.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f38073f.setColorFilter(colorFilter);
    }
}
