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
public final class j9 extends GradientDrawable {
    public final int[] f34998a;
    public final a0.f f34999b;
    public final a0.f f35000c;
    public final a0.f d;
    public final ArrayList f35001e;
    public final Paint f35002f;
    public boolean f35003g;

    public j9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f34999b = new a0.l(0);
        this.f35000c = new a0.l(0);
        this.d = new a0.l(0);
        this.f35001e = new ArrayList();
        Paint paint = new Paint(1);
        this.f35002f = paint;
        this.f35003g = false;
        setDither(true);
        this.f34998a = iArr;
        paint.setDither(true);
    }

    public static void a(j9 j9Var, Runnable[] runnableArr, Bitmap bitmap, q40 q40Var, int i3, b8.jf[] jfVarArr) {
        a0.f fVar = j9Var.f34999b;
        ArrayList arrayList = j9Var.f35001e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(q40Var, bitmap);
        } else {
            fVar.remove(q40Var);
            j9Var.f35000c.remove(q40Var);
        }
        runnableArr[i3] = null;
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
        b8.jf jfVar = jfVarArr[0];
        if (jfVar != null) {
            jfVar.b(q40Var.f37341a, q40Var.f37342b);
            if (!z10) {
                jfVarArr[0].a();
                jfVarArr[0] = null;
            }
        }
    }

    public static GradientDrawable.Orientation d(int i3) {
        if (i3 != 0) {
            if (i3 != 90) {
                if (i3 != 135) {
                    if (i3 != 180) {
                        if (i3 != 225) {
                            if (i3 != 270) {
                                if (i3 != 315) {
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

    public static Rect e(GradientDrawable.Orientation orientation, int i3, int i10) {
        Rect rect = new Rect();
        switch (g9.f34026a[orientation.ordinal()]) {
            case 1:
                int i11 = i3 / 2;
                rect.left = i11;
                rect.top = 0;
                rect.right = i11;
                rect.bottom = i10;
                return rect;
            case 2:
                rect.left = i3;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i10;
                return rect;
            case 3:
                rect.left = i3;
                int i12 = i10 / 2;
                rect.top = i12;
                rect.right = 0;
                rect.bottom = i12;
                return rect;
            case 4:
                rect.left = i3;
                rect.top = i10;
                rect.right = 0;
                rect.bottom = 0;
                return rect;
            case 5:
                int i13 = i3 / 2;
                rect.left = i13;
                rect.top = i10;
                rect.right = i13;
                rect.bottom = 0;
                return rect;
            case 6:
                rect.left = 0;
                rect.top = i10;
                rect.right = i3;
                rect.bottom = 0;
                return rect;
            case 7:
                rect.left = 0;
                int i14 = i10 / 2;
                rect.top = i14;
                rect.right = i3;
                rect.bottom = i14;
                return rect;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i3;
                rect.bottom = i10;
                return rect;
        }
    }

    public final void b() {
        if (!this.f35003g) {
            for (int size = this.f35001e.size() - 1; size >= 0; size--) {
                org.telegram.messenger.p5 p5Var = Utilities.f21387e;
                Runnable[] runnableArr = (Runnable[]) this.f35001e.remove(size);
                p5Var.getClass();
                for (Runnable runnable : runnableArr) {
                    p5Var.a(runnable);
                }
            }
            for (int i3 = this.f34999b.f31c - 1; i3 >= 0; i3--) {
                Bitmap bitmap = (Bitmap) this.f34999b.g(i3);
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.f35000c.clear();
            this.d.clear();
            this.f35003g = true;
        }
    }

    public final h9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f35003g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f34999b;
        int i3 = fVar.f31c;
        int i10 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i10 < i3) {
                q40 q40Var = (q40) fVar.f(i10);
                if (q40Var.f37341a == width && q40Var.f37342b == height) {
                    Bitmap bitmap = (Bitmap) fVar.i(i10);
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f35002f);
                    } else {
                        super.draw(canvas);
                    }
                    return (h9) fVar2.get(viewGroup);
                }
                i10++;
            } else {
                h9 h9Var = (h9) fVar2.remove(viewGroup);
                if (h9Var != null) {
                    h9Var.dispose();
                }
                q40 q40Var2 = new q40(width, height);
                fVar.put(q40Var2, null);
                this.f35000c.put(q40Var2, Boolean.TRUE);
                final d9 g7 = g(new q40[]{q40Var2}, new f9(this, viewGroup), 0L);
                h9 h9Var2 = (h9) fVar2.put(viewGroup, new h9() {
                    @Override
                    public final void dispose() {
                        j9.this.d.remove(viewGroup);
                        g7.dispose();
                    }
                });
                super.draw(canvas);
                return h9Var2;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f35003g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        a0.f fVar = this.f34999b;
        int i3 = fVar.f31c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i10 = 0; i10 < i3; i10++) {
            q40 q40Var = (q40) fVar.f(i10);
            float f11 = f10;
            float sqrt = (float) Math.sqrt(Math.pow(height - q40Var.f37342b, 2.0d) + Math.pow(width - q40Var.f37341a, 2.0d));
            if (sqrt < f11 && (bitmap = (Bitmap) fVar.i(i10)) != null && ((bool = (Boolean) this.f35000c.get(q40Var)) == null || !bool.booleanValue())) {
                bitmap2 = bitmap;
                f10 = sqrt;
            } else {
                f10 = f11;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f35002f);
        } else {
            super.draw(canvas);
        }
    }

    public final d9 f(i9 i9Var, b8.jf jfVar, long j10) {
        q40[] q40VarArr = (q40[]) i9Var.f34636b;
        if (!this.f35003g) {
            ArrayList arrayList = new ArrayList(q40VarArr.length);
            for (q40 q40Var : q40VarArr) {
                a0.f fVar = this.f34999b;
                if (!fVar.containsKey(q40Var)) {
                    fVar.put(q40Var, null);
                    arrayList.add(q40Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((q40[]) arrayList.toArray(new q40[0]), jfVar, j10);
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

    public final d9 g(q40[] q40VarArr, b8.jf jfVar, long j10) {
        if (q40VarArr.length == 0) {
            return null;
        }
        b8.jf[] jfVarArr = {jfVar};
        Runnable[] runnableArr = new Runnable[q40VarArr.length];
        this.f35001e.add(runnableArr);
        for (int i3 = 0; i3 < q40VarArr.length; i3++) {
            q40 q40Var = q40VarArr[i3];
            if (q40Var.f37341a != 0 && q40Var.f37342b != 0) {
                org.telegram.messenger.p5 p5Var = Utilities.f21387e;
                c9 c9Var = new c9(this, q40Var, runnableArr, i3, jfVarArr);
                runnableArr[i3] = c9Var;
                p5Var.e(c9Var, j10);
            }
        }
        return new d9(this, jfVarArr, runnableArr, q40VarArr);
    }

    @Override
    public final void setAlpha(int i3) {
        super.setAlpha(i3);
        this.f35002f.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f35002f.setColorFilter(colorFilter);
    }
}
