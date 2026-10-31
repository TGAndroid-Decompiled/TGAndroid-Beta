package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.jb0;
import w7.k9;
public class c5 extends Drawable {
    public static final jb0[] T = new jb0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public c5 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.c3 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader f20210a;
    public int f20211b;
    public int e;
    public int f20213f;
    public int f20214g;
    public int h;
    public boolean f20215i;
    public final int f20218l;
    public final boolean f20219m;
    public p6 f20222p;
    public final boolean f20223q;
    public int f20224r;
    public boolean f20225s;
    public boolean f20226t;
    public boolean f20227u;
    public boolean v;
    public final Paint f20212c = new Paint(1);
    public final RectF f20216j = new RectF();
    public final Matrix f20217k = new Matrix();
    public final Rect f20221o = new Rect();
    public Integer f20228w = null;
    public boolean f20229x = true;
    public final int[] f20230y = {-1, -1, -1, -1};
    public final Bitmap[] f20231z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f20220n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public c5(int i10, boolean z10, boolean z11, p6 p6Var) {
        this.f20222p = p6Var;
        this.f20223q = z10;
        this.f20218l = i10;
        this.f20219m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f20210a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.f20217k;
            jb0[] jb0VarArr = T;
            char c10 = 0;
            int i10 = this.f20218l;
            char c11 = 2;
            if (z10 && (bitmap = this.N) != null) {
                if (i10 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / jb0VarArr[c10].getBounds().width(), this.N.getHeight() / jb0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i10 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = jb0VarArr[c11].f27287k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / jb0VarArr[c11].getBounds().width(), bitmap2.getHeight() / jb0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f7) {
        if (this.f20218l == 2) {
            return (int) Math.ceil(f7 * 3.0f);
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i10;
        Path path;
        boolean z10;
        c5 c5Var;
        Path path2;
        int h;
        Drawable g10;
        if (this.f20223q || !n() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.f20212c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.f20210a == null && this.Q == 0 && this.R <= 0.0f && (g10 = g()) != null) {
                g10.setBounds(bounds);
                g10.draw(canvas);
                return;
            }
            int b11 = b(2.0f);
            int i11 = this.Q;
            if (i11 != 0) {
                i10 = i11;
            } else {
                if (this.R > 0.0f) {
                    i11 = org.telegram.messenger.i0.W1(this.R, b(tz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.i0.W1(this.R, b(Math.min(6, tz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.f20218l == 2) {
                    i11 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i11 = b(tz.Y0);
                    b10 = b(Math.min(6, tz.Y0));
                }
                i10 = b10;
            }
            int b12 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.f20210a != null) {
                Matrix matrix = this.f20217k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.f20224r);
                this.f20210a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i12 = this.f20211b;
            }
            m.c3 c3Var = this.P;
            boolean z11 = true;
            if (c3Var != null) {
                path = (Path) c3Var.f12383c;
                z10 = c3Var.b(bounds, true, true);
            } else {
                path = this.f20220n;
                z10 = true;
            }
            if (!z10 && this.Q == 0) {
                c5Var = this;
                path2 = path;
            } else {
                if (paint == null) {
                    z11 = false;
                }
                c5Var = this;
                int i13 = i11;
                path2 = path;
                c5Var.f(path2, bounds, b11, i13, b12, i10, max, true, true, z11);
            }
            canvas.drawPath(path2, paint2);
            if (c5Var.f20210a != null && c5Var.f20219m && paint == null) {
                int o10 = i0.b.o(h(t6.Pc), (int) ((Color.alpha(h) * c5Var.H) / 255.0f));
                Paint paint3 = c5Var.d;
                paint3.setColor(o10);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var) {
        e(canvas, c3Var, null);
    }

    @Override
    public final void draw(Canvas canvas) {
        c5 c5Var = this.J;
        if (c5Var != null) {
            c5Var.draw(canvas);
            setAlpha((int) (this.K * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.P = c3Var;
        c5 c5Var = this.J;
        if (c5Var != null) {
            c5Var.P = c3Var;
        }
        c(canvas, paint);
        this.P = null;
        c5 c5Var2 = this.J;
        if (c5Var2 != null) {
            c5Var2.P = null;
        }
    }

    public final void f(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        int i17;
        int i18;
        path.rewind();
        int height = (rect.height() - i10) >> 1;
        int i19 = i11;
        if (i19 > height) {
            i19 = height;
        }
        boolean z13 = this.f20223q;
        int i20 = this.f20218l;
        RectF rectF = this.f20216j;
        if (z13) {
            if (!this.I && i20 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i14 - this.f20224r) + this.f20211b);
                path.lineTo(rect.left + i10, (i14 - this.f20224r) + this.f20211b);
            } else {
                if (this.f20227u) {
                    i17 = i13;
                } else {
                    i17 = i19;
                }
                if (i20 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i17, rect.bottom - i10);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i10);
                }
                path.lineTo(rect.left + i10 + i17, rect.bottom - i10);
                int i21 = rect.left + i10;
                int i22 = rect.bottom - i10;
                int i23 = i17 * 2;
                rectF.set(i21, i22 - i23, i21 + i23, i22);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            }
            if (!this.I && i20 != 2 && !z12 && !z11) {
                path.lineTo(rect.left + i10, (i14 - this.f20224r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.f20224r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.f20224r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i10, rect.top + i10 + i19);
                int i24 = rect.left + i10;
                int i25 = rect.top + i10;
                int i26 = i19 * 2;
                rectF.set(i24, i25, i24 + i26, i25 + i26);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f20225s) {
                    i18 = i13;
                } else {
                    i18 = i19;
                }
                if (i20 == 1) {
                    path.lineTo((rect.right - i10) - i18, rect.top + i10);
                    int i27 = rect.right - i10;
                    int i28 = i18 * 2;
                    int i29 = rect.top + i10;
                    rectF.set(i27 - i28, i29, i27, i29 + i28);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i18, rect.top + i10);
                    int i30 = i18 * 2;
                    rectF.set((rect.right - b(8.0f)) - i30, rect.top + i10, rect.right - b(8.0f), rect.top + i10 + i30);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            }
            if (i20 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.right - i10, (i14 - this.f20224r) + this.f20211b);
                } else {
                    if (this.f20226t) {
                        i19 = i13;
                    }
                    path.lineTo(rect.right - i10, (rect.bottom - i10) - i19);
                    int i31 = rect.right - i10;
                    int i32 = i19 * 2;
                    int i33 = rect.bottom - i10;
                    rectF.set(i31 - i32, i33 - i32, i31, i33);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.I && i20 != 2 && !z12 && !z10) {
                path.lineTo(rect.right - b(8.0f), (i14 - this.f20224r) + this.f20211b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i34 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i34) - b(9.0f), (rect.right - b(7.0f)) + i34, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i20 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.f20224r) + this.f20211b);
                path.lineTo(rect.right - i10, (i14 - this.f20224r) + this.f20211b);
            } else {
                if (this.f20227u) {
                    i15 = i13;
                } else {
                    i15 = i19;
                }
                if (i20 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i15, rect.bottom - i10);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i10);
                }
                path.lineTo((rect.right - i10) - i15, rect.bottom - i10);
                int i35 = rect.right - i10;
                int i36 = i15 * 2;
                int i37 = rect.bottom - i10;
                rectF.set(i35 - i36, i37 - i36, i35, i37);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            }
            if (!this.I && i20 != 2 && !z12 && !z11) {
                path.lineTo(rect.right - i10, (i14 - this.f20224r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.f20224r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.f20224r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i10, rect.top + i10 + i19);
                int i38 = rect.right - i10;
                int i39 = i19 * 2;
                int i40 = rect.top + i10;
                rectF.set(i38 - i39, i40, i38, i40 + i39);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f20225s) {
                    i16 = i13;
                } else {
                    i16 = i19;
                }
                if (i20 == 1) {
                    path.lineTo(rect.left + i10 + i16, rect.top + i10);
                    int i41 = rect.left + i10;
                    int i42 = rect.top + i10;
                    int i43 = i16 * 2;
                    rectF.set(i41, i42, i41 + i43, i42 + i43);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i16, rect.top + i10);
                    int i44 = i16 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i10, b(8.0f) + rect.left + i44, rect.top + i10 + i44);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            }
            if (i20 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.left + i10, (i14 - this.f20224r) + this.f20211b);
                } else {
                    if (this.f20226t || this.f20227u) {
                        i19 = i13;
                    }
                    path.lineTo(rect.left + i10, (rect.bottom - i10) - i19);
                    int i45 = rect.left + i10;
                    int i46 = rect.bottom - i10;
                    int i47 = i19 * 2;
                    rectF.set(i45, i46 - i47, i45 + i47, i46);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.I && i20 != 2 && !z12 && !z10) {
                path.lineTo(b(8.0f) + rect.left, (i14 - this.f20224r) + this.f20211b);
            } else {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i10) - i12) - b(3.0f));
                int b10 = b(7.0f) + rect.left;
                int i48 = i12 * 2;
                rectF.set(b10 - i48, ((rect.bottom - i10) - i48) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            }
        }
        path.close();
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f20231z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f20230y, -1);
    }

    public final Drawable g() {
        char c10;
        int i10;
        int h;
        int i11;
        boolean z10;
        int i12;
        int i13;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i14;
        int i15;
        Rect rect = this.f20221o;
        int i16 = this.Q;
        if (i16 == 0) {
            if (this.R > 0.0f) {
                i16 = 0;
            } else {
                i16 = b(tz.Y0);
            }
        }
        boolean z11 = this.f20225s;
        char c11 = 3;
        if (z11 && this.f20226t) {
            c10 = 3;
        } else if (z11) {
            c10 = 2;
        } else if (this.f20226t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z12 = this.f20219m;
        if (!z12 || !this.f20227u) {
            if (z12) {
                c11 = 1;
            } else if (this.f20227u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        Integer num = this.f20228w;
        boolean z13 = this.f20223q;
        if (num != null) {
            h = num.intValue();
        } else if (z13 && n()) {
            h = i();
        } else if (z12) {
            if (z13) {
                i11 = t6.f21156pb;
            } else {
                i11 = t6.Rc;
            }
            h = h(i11);
        } else {
            if (z13) {
                i10 = t6.f21139ob;
            } else {
                i10 = t6.f21190ra;
            }
            h = h(i10);
        }
        if (this.f20229x && this.f20210a == null && !z12 && !this.L && !n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i12 = t6.f21174qb;
        } else {
            i12 = t6.f21227ta;
        }
        int h10 = h(i12);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 == z10 && iArr4[c11][c10] == i16 && ((!z10 || iArr3[c10] == h10) && iArr2[c11][c10] == h)) {
            i13 = h;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c11][c10] = i16;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z10) {
                    iArr3[c10] = h10;
                    Paint paint = new Paint(1);
                    i14 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(h10, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.i0.f16025p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i15 = 0;
                    } else {
                        i15 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.i0.f16025p > 1.0f) {
                        paint.setColor(i15);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i15);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                } else {
                    i14 = 1;
                }
                Paint paint2 = new Paint(i14);
                paint2.setColor(h);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i13 = h;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, k9.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i13).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i13 = h;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z10;
        iArr[c11][c10] = i13;
        return drawableArr[c11][c10];
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.f20218l == 2) {
            return t6.x0(null, i10, false);
        }
        p6 p6Var = this.f20222p;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return t6.x0(null, i10, false);
    }

    public final int i() {
        int h = h(t6.La);
        if (this.f20219m) {
            h = i0.b.o(h, Math.min(255, Color.alpha(h) * 2));
        }
        return i0.b.k(h, h(t6.ua));
    }

    public int j(int i10) {
        if (this.f20218l == 2) {
            return t6.x0(null, i10, false);
        }
        p6 p6Var = this.f20222p;
        if (p6Var != null) {
            return p6Var.j(i10);
        }
        return t6.im.get(i10);
    }

    public final jb0 k() {
        char c10;
        boolean z10 = this.v;
        jb0[] jb0VarArr = T;
        if (z10) {
            return jb0VarArr[2];
        }
        if (this.f20218l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return jb0VarArr[c10];
    }

    public final Drawable l() {
        char c10;
        int i10;
        int i11;
        if (this.L || n() || (this.f20210a == null && !this.f20219m && this.J == null)) {
            return null;
        }
        int b10 = b(tz.Y0);
        boolean z10 = this.f20225s;
        boolean z11 = false;
        if (z10 && this.f20226t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f20226t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f20230y;
        int i12 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i12 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f20231z;
            Bitmap bitmap = bitmapArr[c10];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (org.telegram.messenger.i0.f16025p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.i0.f16025p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, k9.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f20223q) {
            i10 = t6.f21174qb;
        } else {
            i10 = t6.f21227ta;
        }
        int h = h(i10);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != h || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = h;
            }
        }
        return drawableArr[c10];
    }

    public final boolean m() {
        if (this.f20210a != null && t6.km) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (t6.i1(this.f20222p) && this.f20218l != 2 && this.f20228w == null) {
            return true;
        }
        return false;
    }

    public final Path o() {
        int b10;
        int i10;
        boolean z10;
        boolean z11;
        Path path;
        m.c3 c3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.Q;
        int i12 = this.f20218l;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.R > 0.0f) {
                i11 = org.telegram.messenger.i0.W1(this.R, b(tz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.i0.W1(this.R, b(Math.min(6, tz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i12 == 2) {
                i11 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i11 = b(tz.Y0);
                b10 = b(Math.min(6, tz.Y0));
            }
            i10 = b10;
        }
        int b12 = b(6.0f);
        boolean z12 = false;
        int max = Math.max(bounds.top, 0);
        boolean z13 = true;
        if (c3Var != null && bounds.height() < this.f20211b) {
            z10 = true;
            z11 = true;
        } else {
            if (i12 != 1 ? (this.f20224r + bounds.bottom) - i11 < this.f20211b : (this.f20224r + bounds.bottom) - (b12 * 2) < this.f20211b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 * 2) + this.f20224r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (c3Var != null) {
            path = (Path) c3Var.f12383c;
            z13 = c3Var.b(bounds, z10, z11);
        } else {
            path = this.f20220n;
        }
        if (!z13 && this.Q == 0) {
            return path;
        }
        boolean z14 = z10;
        Path path2 = path;
        f(path2, bounds, b11, i11, b12, i10, max, z14, z11, true);
        return path2;
    }

    public void p(int i10, int i11, int i12) {
        q(i10, i11, i12, i12, 0, 0, false, false);
    }

    public void q(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.c5.q(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.H;
        Paint paint = this.f20212c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.H = i10;
            paint.setAlpha(i10);
            if (this.f20223q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(h(t6.Pc))));
            }
        }
        if (this.f20210a == null) {
            Drawable g10 = g();
            if (g10.getAlpha() != i10) {
                g10.setAlpha(i10);
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        c5 c5Var = this.J;
        if (c5Var != null) {
            c5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
