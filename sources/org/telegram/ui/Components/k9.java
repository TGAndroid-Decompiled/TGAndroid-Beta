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
public final class k9 extends GradientDrawable {
    public final int[] f35256a;
    public final a0.f f35257b;
    public final a0.f f35258c;
    public final a0.f d;
    public final ArrayList f35259e;
    public final Paint f35260f;
    public boolean f35261g;

    public k9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f35257b = new a0.l(0);
        this.f35258c = new a0.l(0);
        this.d = new a0.l(0);
        this.f35259e = new ArrayList();
        Paint paint = new Paint(1);
        this.f35260f = paint;
        this.f35261g = false;
        setDither(true);
        this.f35256a = iArr;
        paint.setDither(true);
    }

    public static void a(k9 k9Var, Runnable[] runnableArr, Bitmap bitmap, u40 u40Var, int i7, c8.ea[] eaVarArr) {
        a0.f fVar = k9Var.f35257b;
        ArrayList arrayList = k9Var.f35259e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(u40Var, bitmap);
        } else {
            fVar.remove(u40Var);
            k9Var.f35258c.remove(u40Var);
        }
        runnableArr[i7] = null;
        boolean z9 = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z9 = false;
        if (!z9) {
            arrayList.remove(runnableArr);
        }
        c8.ea eaVar = eaVarArr[0];
        if (eaVar != null) {
            eaVar.b(u40Var.f38512a, u40Var.f38513b);
            if (!z9) {
                eaVarArr[0].a();
                eaVarArr[0] = null;
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
        switch (i9.f34597a[orientation.ordinal()]) {
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
        if (!this.f35261g) {
            for (int size = this.f35259e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                Runnable[] runnableArr = (Runnable[]) this.f35259e.remove(size);
                p5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    p5Var.a(runnable);
                }
            }
            for (int i7 = this.f35257b.f31c - 1; i7 >= 0; i7--) {
                Bitmap bitmap = (Bitmap) this.f35257b.g(i7);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f35258c.clear();
            this.d.clear();
            this.f35261g = true;
        }
    }

    public final j9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f35261g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f35257b;
        int i7 = fVar.f31c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i7) {
                u40 u40Var = (u40) fVar.f(i10);
                if (u40Var.f38512a == width && u40Var.f38513b == height) {
                    Bitmap bitmap = (Bitmap) fVar.i(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f35260f);
                    } else {
                        super.draw(canvas);
                    }
                    return (j9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                j9 j9Var = (j9) fVar2.remove(viewGroup);
                if (j9Var != null) {
                    j9Var.dispose();
                }
                u40 u40Var2 = new u40(width, height);
                fVar.put(u40Var2, null);
                this.f35258c.put(u40Var2, Boolean.TRUE);
                final f9 g10 = g(new u40[]{u40Var2}, new h9(this, viewGroup), 0L);
                j9 j9Var2 = (j9) fVar2.put(viewGroup, new j9() {
                    @Override
                    public final void dispose() {
                        k9.this.d.remove(viewGroup);
                        g10.dispose();
                    }
                });
                super.draw(canvas);
                return j9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f35261g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f35257b;
        int i7 = fVar.f31c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i7; i10++) {
            u40 u40Var = (u40) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - u40Var.f38513b, 2.0d) + Math.pow(width - u40Var.f38512a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.i(i10)) != null && ((bool = (Boolean) this.f35258c.get(u40Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f35260f);
        } else {
            super.draw(canvas);
        }
    }

    public final f9 f(n nVar, c8.ea eaVar, long j3) {
        u40[] u40VarArr = (u40[]) nVar.f36175a;
        if (!this.f35261g) {
            ArrayList arrayList = new ArrayList(u40VarArr.length);
            for (u40 u40Var : u40VarArr) {
                a0.f fVar = this.f35257b;
                if (!fVar.containsKey(u40Var)) {
                    fVar.put(u40Var, null);
                    arrayList.add(u40Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((u40[]) arrayList.toArray(new u40[0]), eaVar, j3);
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

    public final f9 g(u40[] u40VarArr, c8.ea eaVar, long j3) {
        if (u40VarArr.length == 0) {
            return null;
        }
        c8.ea[] eaVarArr = {eaVar};
        Runnable[] runnableArr = new Runnable[u40VarArr.length];
        this.f35259e.add(runnableArr);
        for (int i7 = 0; i7 < u40VarArr.length; i7++) {
            u40 u40Var = u40VarArr[i7];
            if (u40Var.f38512a != 0 && u40Var.f38513b != 0) {
                org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                e9 e9Var = new e9(this, u40Var, runnableArr, i7, eaVarArr);
                runnableArr[i7] = e9Var;
                p5Var.d(e9Var, j3);
            }
        }
        return new f9(this, eaVarArr, runnableArr, u40VarArr);
    }

    @Override
    public final void setAlpha(int i7) {
        super.setAlpha(i7);
        this.f35260f.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f35260f.setColorFilter(colorFilter);
    }
}
