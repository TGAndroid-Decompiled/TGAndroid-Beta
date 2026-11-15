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
import org.telegram.messenger.gz;
import org.telegram.ui.Components.ra0;
public class r4 extends Drawable {
    public static final ra0[] T = new ra0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public r4 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.b3 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader f29554a;
    public int f29555b;
    public int f29557e;
    public int f29558f;
    public int f29559g;
    public int h;
    public boolean f29560i;
    public final int f29563l;
    public final boolean f29564m;
    public e6 f29567p;
    public final boolean f29568q;
    public int f29569r;
    public boolean f29570s;
    public boolean f29571t;
    public boolean f29572u;
    public boolean v;
    public final Paint f29556c = new Paint(1);
    public final RectF f29561j = new RectF();
    public final Matrix f29562k = new Matrix();
    public final Rect f29566o = new Rect();
    public Integer f29573w = null;
    public boolean f29574x = true;
    public final int[] f29575y = {-1, -1, -1, -1};
    public final Bitmap[] f29576z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f29565n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public r4(int i7, boolean z10, boolean z11, e6 e6Var) {
        this.f29567p = e6Var;
        this.f29568q = z10;
        this.f29563l = i7;
        this.f29564m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f29554a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.f29562k;
            ra0[] ra0VarArr = T;
            char c10 = 0;
            int i7 = this.f29563l;
            char c11 = 2;
            if (z10 && (bitmap = this.N) != null) {
                if (i7 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / ra0VarArr[c10].getBounds().width(), this.N.getHeight() / ra0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i7 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = ra0VarArr[c11].f38926k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / ra0VarArr[c11].getBounds().width(), bitmap2.getHeight() / ra0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f10) {
        if (this.f29563l == 2) {
            return (int) Math.ceil(f10 * 3.0f);
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i7;
        Path path;
        boolean z10;
        r4 r4Var;
        Path path2;
        int g10;
        Drawable f10;
        if (this.f29568q || !m() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.f29556c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.f29554a == null && this.Q == 0 && this.R <= 0.0f && (f10 = f()) != null) {
                f10.setBounds(bounds);
                f10.draw(canvas);
                return;
            }
            int b11 = b(2.0f);
            int i10 = this.Q;
            if (i10 != 0) {
                i7 = i10;
            } else {
                if (this.R > 0.0f) {
                    i10 = org.telegram.messenger.g0.W1(this.R, b(gz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, gz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.f29563l == 2) {
                    i10 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i10 = b(gz.Y0);
                    b10 = b(Math.min(6, gz.Y0));
                }
                i7 = b10;
            }
            int b12 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.f29554a != null) {
                Matrix matrix = this.f29562k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.f29569r);
                this.f29554a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i11 = this.f29555b;
            }
            m.b3 b3Var = this.P;
            boolean z11 = true;
            if (b3Var != null) {
                path = (Path) b3Var.f19659c;
                z10 = b3Var.b(bounds, true, true);
            } else {
                path = this.f29565n;
                z10 = true;
            }
            if (!z10 && this.Q == 0) {
                r4Var = this;
                path2 = path;
            } else {
                if (paint == null) {
                    z11 = false;
                }
                r4Var = this;
                int i12 = i10;
                path2 = path;
                r4Var.e(path2, bounds, b11, i12, b12, i7, max, true, true, z11);
            }
            canvas.drawPath(path2, paint2);
            if (r4Var.f29554a != null && r4Var.f29564m && paint == null) {
                int o4 = i0.a.o(g(j6.Sc), (int) ((Color.alpha(g10) * r4Var.H) / 255.0f));
                Paint paint3 = r4Var.d;
                paint3.setColor(o4);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.b3 b3Var, Paint paint) {
        this.P = b3Var;
        r4 r4Var = this.J;
        if (r4Var != null) {
            r4Var.P = b3Var;
        }
        c(canvas, paint);
        this.P = null;
        r4 r4Var2 = this.J;
        if (r4Var2 != null) {
            r4Var2.P = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        r4 r4Var = this.J;
        if (r4Var != null) {
            r4Var.draw(canvas);
            setAlpha((int) (this.K * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Path path, Rect rect, int i7, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        int i14;
        int i15;
        int i16;
        int i17;
        path.rewind();
        int height = (rect.height() - i7) >> 1;
        int i18 = i10;
        if (i18 > height) {
            i18 = height;
        }
        boolean z13 = this.f29568q;
        int i19 = this.f29563l;
        RectF rectF = this.f29561j;
        if (z13) {
            if (!this.I && i19 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i13 - this.f29569r) + this.f29555b);
                path.lineTo(rect.left + i7, (i13 - this.f29569r) + this.f29555b);
            } else {
                if (this.f29572u) {
                    i16 = i12;
                } else {
                    i16 = i18;
                }
                if (i19 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i16, rect.bottom - i7);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i7);
                }
                path.lineTo(rect.left + i7 + i16, rect.bottom - i7);
                int i20 = rect.left + i7;
                int i21 = rect.bottom - i7;
                int i22 = i16 * 2;
                rectF.set(i20, i21 - i22, i20 + i22, i21);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            }
            if (!this.I && i19 != 2 && !z12 && !z11) {
                path.lineTo(rect.left + i7, (i13 - this.f29569r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.right - i7, (i13 - this.f29569r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.f29569r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i7, rect.top + i7 + i18);
                int i23 = rect.left + i7;
                int i24 = rect.top + i7;
                int i25 = i18 * 2;
                rectF.set(i23, i24, i23 + i25, i24 + i25);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f29570s) {
                    i17 = i12;
                } else {
                    i17 = i18;
                }
                if (i19 == 1) {
                    path.lineTo((rect.right - i7) - i17, rect.top + i7);
                    int i26 = rect.right - i7;
                    int i27 = i17 * 2;
                    int i28 = rect.top + i7;
                    rectF.set(i26 - i27, i28, i26, i28 + i27);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i17, rect.top + i7);
                    int i29 = i17 * 2;
                    rectF.set((rect.right - b(8.0f)) - i29, rect.top + i7, rect.right - b(8.0f), rect.top + i7 + i29);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            }
            if (i19 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.right - i7, (i13 - this.f29569r) + this.f29555b);
                } else {
                    if (this.f29571t) {
                        i18 = i12;
                    }
                    path.lineTo(rect.right - i7, (rect.bottom - i7) - i18);
                    int i30 = rect.right - i7;
                    int i31 = i18 * 2;
                    int i32 = rect.bottom - i7;
                    rectF.set(i30 - i31, i32 - i31, i30, i32);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.I && i19 != 2 && !z12 && !z10) {
                path.lineTo(rect.right - b(8.0f), (i13 - this.f29569r) + this.f29555b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i7) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i7) - i33) - b(9.0f), (rect.right - b(7.0f)) + i33, (rect.bottom - i7) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i19 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.f29569r) + this.f29555b);
                path.lineTo(rect.right - i7, (i13 - this.f29569r) + this.f29555b);
            } else {
                if (this.f29572u) {
                    i14 = i12;
                } else {
                    i14 = i18;
                }
                if (i19 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i14, rect.bottom - i7);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i7);
                }
                path.lineTo((rect.right - i7) - i14, rect.bottom - i7);
                int i34 = rect.right - i7;
                int i35 = i14 * 2;
                int i36 = rect.bottom - i7;
                rectF.set(i34 - i35, i36 - i35, i34, i36);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            }
            if (!this.I && i19 != 2 && !z12 && !z11) {
                path.lineTo(rect.right - i7, (i13 - this.f29569r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.left + i7, (i13 - this.f29569r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.f29569r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i7, rect.top + i7 + i18);
                int i37 = rect.right - i7;
                int i38 = i18 * 2;
                int i39 = rect.top + i7;
                rectF.set(i37 - i38, i39, i37, i39 + i38);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f29570s) {
                    i15 = i12;
                } else {
                    i15 = i18;
                }
                if (i19 == 1) {
                    path.lineTo(rect.left + i7 + i15, rect.top + i7);
                    int i40 = rect.left + i7;
                    int i41 = rect.top + i7;
                    int i42 = i15 * 2;
                    rectF.set(i40, i41, i40 + i42, i41 + i42);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i15, rect.top + i7);
                    int i43 = i15 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i7, b(8.0f) + rect.left + i43, rect.top + i7 + i43);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            }
            if (i19 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.left + i7, (i13 - this.f29569r) + this.f29555b);
                } else {
                    if (this.f29571t || this.f29572u) {
                        i18 = i12;
                    }
                    path.lineTo(rect.left + i7, (rect.bottom - i7) - i18);
                    int i44 = rect.left + i7;
                    int i45 = rect.bottom - i7;
                    int i46 = i18 * 2;
                    rectF.set(i44, i45 - i46, i44 + i46, i45);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.I && i19 != 2 && !z12 && !z10) {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.f29569r) + this.f29555b);
            } else {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i7) - i11) - b(3.0f));
                int b10 = b(7.0f) + rect.left;
                int i47 = i11 * 2;
                rectF.set(b10 - i47, ((rect.bottom - i7) - i47) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i7) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            }
        }
        path.close();
    }

    public final Drawable f() {
        char c10;
        int i7;
        int g10;
        int i10;
        boolean z10;
        int i11;
        int i12;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i13;
        int i14;
        Rect rect = this.f29566o;
        int i15 = this.Q;
        if (i15 == 0) {
            if (this.R > 0.0f) {
                i15 = 0;
            } else {
                i15 = b(gz.Y0);
            }
        }
        boolean z11 = this.f29570s;
        char c11 = 3;
        if (z11 && this.f29571t) {
            c10 = 3;
        } else if (z11) {
            c10 = 2;
        } else if (this.f29571t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z12 = this.f29564m;
        if (!z12 || !this.f29572u) {
            if (z12) {
                c11 = 1;
            } else if (this.f29572u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        Integer num = this.f29573w;
        boolean z13 = this.f29568q;
        if (num != null) {
            g10 = num.intValue();
        } else if (z13 && m()) {
            g10 = h();
        } else if (z12) {
            if (z13) {
                i10 = j6.f29131sb;
            } else {
                i10 = j6.Uc;
            }
            g10 = g(i10);
        } else {
            if (z13) {
                i7 = j6.f29113rb;
            } else {
                i7 = j6.f29112ra;
            }
            g10 = g(i7);
        }
        if (this.f29574x && this.f29554a == null && !z12 && !this.L && !m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i11 = j6.f29150tb;
        } else {
            i11 = j6.f29149ta;
        }
        int g11 = g(i11);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 == z10 && iArr4[c11][c10] == i15 && ((!z10 || iArr3[c10] == g11) && iArr2[c11][c10] == g10)) {
            i12 = g10;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c11][c10] = i15;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z10) {
                    iArr3[c10] = g11;
                    Paint paint = new Paint(1);
                    i13 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.g0.f23608p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i14 = 0;
                    } else {
                        i14 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.g0.f23608p > 1.0f) {
                        paint.setColor(i14);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i14);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                } else {
                    i13 = 1;
                }
                Paint paint2 = new Paint(i13);
                paint2.setColor(g10);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i12 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, c8.o0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i12).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i12 = g10;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z10;
        iArr[c11][c10] = i12;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f29576z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f29575y, -1);
    }

    public int g(int i7) {
        if (this.f29563l == 2) {
            return j6.x0(null, i7, false);
        }
        e6 e6Var = this.f29567p;
        if (e6Var != null) {
            return e6Var.h(i7);
        }
        return j6.x0(null, i7, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final int h() {
        int g10 = g(j6.La);
        if (this.f29564m) {
            g10 = i0.a.o(g10, Math.min(255, Color.alpha(g10) * 2));
        }
        return i0.a.k(g10, g(j6.f29169ua));
    }

    public int i(int i7) {
        if (this.f29563l == 2) {
            return j6.x0(null, i7, false);
        }
        e6 e6Var = this.f29567p;
        if (e6Var != null) {
            return e6Var.j(i7);
        }
        return j6.lm.get(i7);
    }

    public final ra0 j() {
        char c10;
        boolean z10 = this.v;
        ra0[] ra0VarArr = T;
        if (z10) {
            return ra0VarArr[2];
        }
        if (this.f29563l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return ra0VarArr[c10];
    }

    public final Drawable k() {
        char c10;
        int i7;
        int i10;
        if (this.L || m() || (this.f29554a == null && !this.f29564m && this.J == null)) {
            return null;
        }
        int b10 = b(gz.Y0);
        boolean z10 = this.f29570s;
        boolean z11 = false;
        if (z10 && this.f29571t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f29571t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f29575y;
        int i11 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i11 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f29576z;
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
                if (org.telegram.messenger.g0.f23608p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.g0.f23608p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, c8.o0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f29568q) {
            i7 = j6.f29150tb;
        } else {
            i7 = j6.f29149ta;
        }
        int g10 = g(i7);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != g10 || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final boolean l() {
        if (this.f29554a != null && j6.nm) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (j6.i1(this.f29567p) && this.f29563l != 2 && this.f29573w == null) {
            return true;
        }
        return false;
    }

    public final Path n() {
        int b10;
        int i7;
        boolean z10;
        boolean z11;
        Path path;
        m.b3 b3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.Q;
        int i11 = this.f29563l;
        if (i10 != 0) {
            i7 = i10;
        } else {
            if (this.R > 0.0f) {
                i10 = org.telegram.messenger.g0.W1(this.R, b(gz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, gz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(gz.Y0);
                b10 = b(Math.min(6, gz.Y0));
            }
            i7 = b10;
        }
        int b12 = b(6.0f);
        boolean z12 = false;
        int max = Math.max(bounds.top, 0);
        boolean z13 = true;
        if (b3Var != null && bounds.height() < this.f29555b) {
            z10 = true;
            z11 = true;
        } else {
            if (i11 != 1 ? (this.f29569r + bounds.bottom) - i10 < this.f29555b : (this.f29569r + bounds.bottom) - (b12 * 2) < this.f29555b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 * 2) + this.f29569r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (b3Var != null) {
            path = (Path) b3Var.f19659c;
            z13 = b3Var.b(bounds, z10, z11);
        } else {
            path = this.f29565n;
        }
        if (!z13 && this.Q == 0) {
            return path;
        }
        boolean z14 = z10;
        Path path2 = path;
        e(path2, bounds, b11, i10, b12, i7, max, z14, z11, true);
        return path2;
    }

    public void o(int i7, int i10, int i11) {
        p(i7, i10, i11, i11, 0, 0, false, false);
    }

    public void p(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.r4.p(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.H;
        Paint paint = this.f29556c;
        if (i10 != i7 || paint.getAlpha() != i7) {
            this.H = i7;
            paint.setAlpha(i7);
            if (this.f29568q) {
                this.d.setAlpha((int) ((i7 / 255.0f) * Color.alpha(g(j6.Sc))));
            }
        }
        if (this.f29554a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i7) {
                f10.setAlpha(i7);
            }
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        r4 r4Var = this.J;
        if (r4Var != null) {
            r4Var.setBounds(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setColorFilter(int i7, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
