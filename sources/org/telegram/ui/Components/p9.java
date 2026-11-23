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
public final class p9 extends GradientDrawable {
    public final int[] f38534a;
    public final a0.f f38535b;
    public final a0.f f38536c;
    public final a0.f d;
    public final ArrayList f38537e;
    public final Paint f38538f;
    public boolean f38539g;

    public p9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f38535b = new a0.l(0);
        this.f38536c = new a0.l(0);
        this.d = new a0.l(0);
        this.f38537e = new ArrayList();
        Paint paint = new Paint(1);
        this.f38538f = paint;
        this.f38539g = false;
        setDither(true);
        this.f38534a = iArr;
        paint.setDither(true);
    }

    public static void a(p9 p9Var, Runnable[] runnableArr, Bitmap bitmap, i50 i50Var, int i7, c8.ia[] iaVarArr) {
        a0.f fVar = p9Var.f38535b;
        ArrayList arrayList = p9Var.f38537e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(i50Var, bitmap);
        } else {
            fVar.remove(i50Var);
            p9Var.f38536c.remove(i50Var);
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
        c8.ia iaVar = iaVarArr[0];
        if (iaVar != null) {
            iaVar.b(i50Var.f36144a, i50Var.f36145b);
            if (!z10) {
                iaVarArr[0].a();
                iaVarArr[0] = null;
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
        switch (n9.f37849a[orientation.ordinal()]) {
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
        if (!this.f38539g) {
            for (int size = this.f38537e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.q5 q5Var = Utilities.f22810e;
                Runnable[] runnableArr = (Runnable[]) this.f38537e.remove(size);
                q5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    q5Var.a(runnable);
                }
            }
            for (int i7 = this.f38535b.f31c - 1; i7 >= 0; i7--) {
                Bitmap bitmap = (Bitmap) this.f38535b.g(i7);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f38536c.clear();
            this.d.clear();
            this.f38539g = true;
        }
    }

    public final o9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f38539g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f38535b;
        int i7 = fVar.f31c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i7) {
                i50 i50Var = (i50) fVar.f(i10);
                if (i50Var.f36144a == width && i50Var.f36145b == height) {
                    Bitmap bitmap = (Bitmap) fVar.i(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f38538f);
                    } else {
                        super.draw(canvas);
                    }
                    return (o9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                o9 o9Var = (o9) fVar2.remove(viewGroup);
                if (o9Var != null) {
                    o9Var.dispose();
                }
                i50 i50Var2 = new i50(width, height);
                fVar.put(i50Var2, null);
                this.f38536c.put(i50Var2, Boolean.TRUE);
                final k9 g10 = g(new i50[]{i50Var2}, new m9(this, viewGroup), 0L);
                o9 o9Var2 = (o9) fVar2.put(viewGroup, new o9() {
                    @Override
                    public final void dispose() {
                        p9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return o9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f38539g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f38535b;
        int i7 = fVar.f31c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i7; i10++) {
            i50 i50Var = (i50) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - i50Var.f36145b, 2.0d) + Math.pow(width - i50Var.f36144a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.i(i10)) != null && ((bool = (Boolean) this.f38536c.get(i50Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f38538f);
        } else {
            super.draw(canvas);
        }
    }

    public final k9 f(org.telegram.ui.Cells.c5 c5Var, c8.ia iaVar, long j3) {
        i50[] i50VarArr = (i50[]) c5Var.f30508a;
        if (!this.f38539g) {
            ArrayList arrayList = new ArrayList(i50VarArr.length);
            for (i50 i50Var : i50VarArr) {
                a0.f fVar = this.f38535b;
                if (!fVar.containsKey(i50Var)) {
                    fVar.put(i50Var, null);
                    arrayList.add(i50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((i50[]) arrayList.toArray(new i50[0]), iaVar, j3);
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

    public final k9 g(i50[] i50VarArr, c8.ia iaVar, long j3) {
        if (i50VarArr.length == 0) {
            return null;
        }
        c8.ia[] iaVarArr = {iaVar};
        Runnable[] runnableArr = new Runnable[i50VarArr.length];
        this.f38537e.add(runnableArr);
        for (int i7 = 0; i7 < i50VarArr.length; i7++) {
            i50 i50Var = i50VarArr[i7];
            if (i50Var.f36144a != 0 && i50Var.f36145b != 0) {
                org.telegram.messenger.q5 q5Var = Utilities.f22810e;
                j9 j9Var = new j9(this, i50Var, runnableArr, i7, iaVarArr);
                runnableArr[i7] = j9Var;
                q5Var.d(j9Var, j3);
            }
        }
        return new k9(this, iaVarArr, runnableArr, i50VarArr);
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        this.f38538f.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f38538f.setColorFilter(colorFilter);
    }
}
