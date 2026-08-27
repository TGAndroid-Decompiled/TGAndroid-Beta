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

public final class m9 extends GradientDrawable {

    public final int[] f30623a;

    public final a0.f f30624b;

    public final a0.f f30625c;
    public final a0.f d;

    public final ArrayList f30626e;

    public final Paint f30627f;

    public boolean f30628g;

    public m9(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.f30624b = new a0.f(0);
        this.f30625c = new a0.f(0);
        this.d = new a0.f(0);
        this.f30626e = new ArrayList();
        Paint paint = new Paint(1);
        this.f30627f = paint;
        this.f30628g = false;
        setDither(true);
        this.f30623a = iArr;
        paint.setDither(true);
    }

    public static void a(m9 m9Var, Runnable[] runnableArr, Bitmap bitmap, m50 m50Var, int i10, h7.w5[] w5VarArr) {
        a0.f fVar = m9Var.f30624b;
        ArrayList arrayList = m9Var.f30626e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            fVar.put(m50Var, bitmap);
        } else {
            fVar.remove(m50Var);
            m9Var.f30625c.remove(m50Var);
        }
        runnableArr[i10] = null;
        boolean z10 = true;
        if (runnableArr.length <= 1) {
            z10 = false;
            break;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= runnableArr.length) {
                z10 = false;
                break;
            } else if (runnableArr[i11] != null) {
                break;
            } else {
                i11++;
            }
        }
        if (!z10) {
            arrayList.remove(runnableArr);
        }
        h7.w5 w5Var = w5VarArr[0];
        if (w5Var != null) {
            w5Var.b(m50Var.f30565a, m50Var.f30566b);
            if (z10) {
                return;
            }
            w5VarArr[0].a();
            w5VarArr[0] = null;
        }
    }

    public static GradientDrawable.Orientation d(int i10) {
        if (i10 == 0) {
            return GradientDrawable.Orientation.BOTTOM_TOP;
        }
        if (i10 == 90) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if (i10 == 135) {
            return GradientDrawable.Orientation.TL_BR;
        }
        if (i10 == 180) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (i10 == 225) {
            return GradientDrawable.Orientation.TR_BL;
        }
        if (i10 != 270) {
            return i10 != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL;
        }
        return GradientDrawable.Orientation.RIGHT_LEFT;
    }

    public static Rect e(GradientDrawable.Orientation orientation, int i10, int i11) {
        Rect rect = new Rect();
        switch (k9.f30048a[orientation.ordinal()]) {
            case 1:
                int i12 = i10 / 2;
                rect.left = i12;
                rect.top = 0;
                rect.right = i12;
                rect.bottom = i11;
                break;
            case 2:
                rect.left = i10;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i11;
                break;
            case 3:
                rect.left = i10;
                int i13 = i11 / 2;
                rect.top = i13;
                rect.right = 0;
                rect.bottom = i13;
                break;
            case 4:
                rect.left = i10;
                rect.top = i11;
                rect.right = 0;
                rect.bottom = 0;
                break;
            case 5:
                int i14 = i10 / 2;
                rect.left = i14;
                rect.top = i11;
                rect.right = i14;
                rect.bottom = 0;
                break;
            case 6:
                rect.left = 0;
                rect.top = i11;
                rect.right = i10;
                rect.bottom = 0;
                break;
            case 7:
                rect.left = 0;
                int i15 = i11 / 2;
                rect.top = i15;
                rect.right = i10;
                rect.bottom = i15;
                break;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i10;
                rect.bottom = i11;
                break;
        }
        return rect;
    }

    public final void b() {
        if (this.f30628g) {
            return;
        }
        for (int size = this.f30626e.size() - 1; size >= 0; size--) {
            Utilities.globalQueue.cancelRunnables((Runnable[]) this.f30626e.remove(size));
        }
        for (int i10 = this.f30624b.f28c - 1; i10 >= 0; i10--) {
            Bitmap bitmap = (Bitmap) this.f30624b.f(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.f30625c.clear();
        this.d.clear();
        this.f30628g = true;
    }

    public final l9 c(Canvas canvas, final ViewGroup viewGroup) {
        if (this.f30628g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int iWidth = (int) (bounds.width() * 0.5f);
        int iHeight = (int) (bounds.height() * 0.5f);
        a0.f fVar = this.f30624b;
        int i10 = fVar.f28c;
        int i11 = 0;
        while (true) {
            a0.f fVar2 = this.d;
            if (i11 >= i10) {
                l9 l9Var = (l9) fVar2.remove(viewGroup);
                if (l9Var != null) {
                    l9Var.dispose();
                }
                m50 m50Var = new m50(iWidth, iHeight);
                fVar.put(m50Var, null);
                this.f30625c.put(m50Var, Boolean.TRUE);
                final h9 h9VarG = g(new m50[]{m50Var}, new j9(this, viewGroup), 0L);
                l9 l9Var2 = (l9) fVar2.put(viewGroup, new l9() {
                    @Override
                    public final void dispose() {
                        this.f29313a.d.remove(viewGroup);
                        h9VarG.dispose();
                    }
                });
                super.draw(canvas);
                return l9Var2;
            }
            m50 m50Var2 = (m50) fVar.e(i11);
            if (m50Var2.f30565a == iWidth && m50Var2.f30566b == iHeight) {
                Bitmap bitmap = (Bitmap) fVar.h(i11);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f30627f);
                } else {
                    super.draw(canvas);
                }
                return (l9) fVar2.get(viewGroup);
            }
            i11++;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.f30628g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        a0.f fVar = this.f30624b;
        int i10 = fVar.f28c;
        float f10 = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            m50 m50Var = (m50) fVar.e(i11);
            float f11 = f10;
            float fSqrt = (float) Math.sqrt(Math.pow(iHeight - m50Var.f30566b, 2.0d) + Math.pow(iWidth - m50Var.f30565a, 2.0d));
            if (fSqrt >= f11 || (bitmap = (Bitmap) fVar.h(i11)) == null || ((bool = (Boolean) this.f30625c.get(m50Var)) != null && bool.booleanValue())) {
                f10 = f11;
            } else {
                bitmap2 = bitmap;
                f10 = fSqrt;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f30627f);
        } else {
            super.draw(canvas);
        }
    }

    public final h9 f(o0.b bVar, h7.w5 w5Var, long j10) {
        m50[] m50VarArr = (m50[]) bVar.f19088b;
        if (!this.f30628g) {
            ArrayList arrayList = new ArrayList(m50VarArr.length);
            for (m50 m50Var : m50VarArr) {
                a0.f fVar = this.f30624b;
                if (!fVar.containsKey(m50Var)) {
                    fVar.put(m50Var, null);
                    arrayList.add(m50Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((m50[]) arrayList.toArray(new m50[0]), w5Var, j10);
            }
        }
        return null;
    }

    public final void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    public final h9 g(m50[] m50VarArr, h7.w5 w5Var, long j10) {
        if (m50VarArr.length == 0) {
            return null;
        }
        h7.w5[] w5VarArr = {w5Var};
        Runnable[] runnableArr = new Runnable[m50VarArr.length];
        this.f30626e.add(runnableArr);
        for (int i10 = 0; i10 < m50VarArr.length; i10++) {
            m50 m50Var = m50VarArr[i10];
            if (m50Var.f30565a != 0 && m50Var.f30566b != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                g9 g9Var = new g9(this, m50Var, runnableArr, i10, w5VarArr);
                runnableArr[i10] = g9Var;
                dispatchQueue.postRunnable(g9Var, j10);
            }
        }
        return new h9(this, w5VarArr, runnableArr, m50VarArr);
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        this.f30627f.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f30627f.setColorFilter(colorFilter);
    }
}
