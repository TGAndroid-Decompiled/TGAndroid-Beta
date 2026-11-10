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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.qa0;
public class u4 extends Drawable {
    public static final qa0[] T = new qa0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public u4 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.c3 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader f28584a;
    public int f28585b;
    public int f28587e;
    public int f28588f;
    public int f28589g;
    public int h;
    public boolean f28590i;
    public final int f28593l;
    public final boolean f28594m;
    public h6 f28597p;
    public final boolean f28598q;
    public int f28599r;
    public boolean f28600s;
    public boolean f28601t;
    public boolean f28602u;
    public boolean v;
    public final Paint f28586c = new Paint(1);
    public final RectF f28591j = new RectF();
    public final Matrix f28592k = new Matrix();
    public final Rect f28596o = new Rect();
    public Integer f28603w = null;
    public boolean f28604x = true;
    public final int[] f28605y = {-1, -1, -1, -1};
    public final Bitmap[] f28606z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f28595n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public u4(int i7, boolean z9, boolean z10, h6 h6Var) {
        this.f28597p = h6Var;
        this.f28598q = z9;
        this.f28593l = i7;
        this.f28594m = z10;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f28584a instanceof BitmapShader) {
            boolean z9 = this.L;
            Matrix matrix = this.f28592k;
            qa0[] qa0VarArr = T;
            char c10 = 0;
            int i7 = this.f28593l;
            char c11 = 2;
            if (z9 && (bitmap = this.N) != null) {
                if (i7 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / qa0VarArr[c10].getBounds().width(), this.N.getHeight() / qa0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i7 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = qa0VarArr[c11].f37215k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / qa0VarArr[c11].getBounds().width(), bitmap2.getHeight() / qa0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f10) {
        if (this.f28593l == 2) {
            return (int) Math.ceil(f10 * 3.0f);
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i7;
        Path path;
        boolean z9;
        u4 u4Var;
        Path path2;
        int g10;
        Drawable f10;
        if (this.f28598q || !m() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.f28586c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.f28584a == null && this.Q == 0 && this.R <= 0.0f && (f10 = f()) != null) {
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
                    i10 = org.telegram.messenger.g0.W1(this.R, b(iz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, iz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.f28593l == 2) {
                    i10 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i10 = b(iz.Y0);
                    b10 = b(Math.min(6, iz.Y0));
                }
                i7 = b10;
            }
            int b12 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.f28584a != null) {
                Matrix matrix = this.f28592k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.f28599r);
                this.f28584a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i11 = this.f28585b;
            }
            m.c3 c3Var = this.P;
            boolean z10 = true;
            if (c3Var != null) {
                path = (Path) c3Var.f19082c;
                z9 = c3Var.b(bounds, true, true);
            } else {
                path = this.f28595n;
                z9 = true;
            }
            if (!z9 && this.Q == 0) {
                u4Var = this;
                path2 = path;
            } else {
                if (paint == null) {
                    z10 = false;
                }
                u4Var = this;
                int i12 = i10;
                path2 = path;
                u4Var.e(path2, bounds, b11, i12, b12, i7, max, true, true, z10);
            }
            canvas.drawPath(path2, paint2);
            if (u4Var.f28584a != null && u4Var.f28594m && paint == null) {
                int o4 = i0.a.o(g(m6.Pc), (int) ((Color.alpha(g10) * u4Var.H) / 255.0f));
                Paint paint3 = u4Var.d;
                paint3.setColor(o4);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.P = c3Var;
        u4 u4Var = this.J;
        if (u4Var != null) {
            u4Var.P = c3Var;
        }
        c(canvas, paint);
        this.P = null;
        u4 u4Var2 = this.J;
        if (u4Var2 != null) {
            u4Var2.P = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        u4 u4Var = this.J;
        if (u4Var != null) {
            u4Var.draw(canvas);
            setAlpha((int) (this.K * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Path path, Rect rect, int i7, int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11) {
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
        boolean z12 = this.f28598q;
        int i19 = this.f28593l;
        RectF rectF = this.f28591j;
        if (z12) {
            if (!this.I && i19 != 2 && !z11 && !z9) {
                path.moveTo(rect.right - b(8.0f), (i13 - this.f28599r) + this.f28585b);
                path.lineTo(rect.left + i7, (i13 - this.f28599r) + this.f28585b);
            } else {
                if (this.f28602u) {
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
            if (!this.I && i19 != 2 && !z11 && !z10) {
                path.lineTo(rect.left + i7, (i13 - this.f28599r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.right - i7, (i13 - this.f28599r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.f28599r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i7, rect.top + i7 + i18);
                int i23 = rect.left + i7;
                int i24 = rect.top + i7;
                int i25 = i18 * 2;
                rectF.set(i23, i24, i23 + i25, i24 + i25);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f28600s) {
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
                if (!z11 && !z9) {
                    path.lineTo(rect.right - i7, (i13 - this.f28599r) + this.f28585b);
                } else {
                    if (this.f28601t) {
                        i18 = i12;
                    }
                    path.lineTo(rect.right - i7, (rect.bottom - i7) - i18);
                    int i30 = rect.right - i7;
                    int i31 = i18 * 2;
                    int i32 = rect.bottom - i7;
                    rectF.set(i30 - i31, i32 - i31, i30, i32);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.I && i19 != 2 && !z11 && !z9) {
                path.lineTo(rect.right - b(8.0f), (i13 - this.f28599r) + this.f28585b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i7) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i7) - i33) - b(9.0f), (rect.right - b(7.0f)) + i33, (rect.bottom - i7) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i19 != 2 && !z11 && !z9) {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.f28599r) + this.f28585b);
                path.lineTo(rect.right - i7, (i13 - this.f28599r) + this.f28585b);
            } else {
                if (this.f28602u) {
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
            if (!this.I && i19 != 2 && !z11 && !z10) {
                path.lineTo(rect.right - i7, (i13 - this.f28599r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.left + i7, (i13 - this.f28599r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.f28599r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i7, rect.top + i7 + i18);
                int i37 = rect.right - i7;
                int i38 = i18 * 2;
                int i39 = rect.top + i7;
                rectF.set(i37 - i38, i39, i37, i39 + i38);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f28600s) {
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
                if (!z11 && !z9) {
                    path.lineTo(rect.left + i7, (i13 - this.f28599r) + this.f28585b);
                } else {
                    if (this.f28601t || this.f28602u) {
                        i18 = i12;
                    }
                    path.lineTo(rect.left + i7, (rect.bottom - i7) - i18);
                    int i44 = rect.left + i7;
                    int i45 = rect.bottom - i7;
                    int i46 = i18 * 2;
                    rectF.set(i44, i45 - i46, i44 + i46, i45);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.I && i19 != 2 && !z11 && !z9) {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.f28599r) + this.f28585b);
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
        boolean z9;
        int i11;
        int i12;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i13;
        int i14;
        Rect rect = this.f28596o;
        int i15 = this.Q;
        if (i15 == 0) {
            if (this.R > 0.0f) {
                i15 = 0;
            } else {
                i15 = b(iz.Y0);
            }
        }
        boolean z10 = this.f28600s;
        char c11 = 3;
        if (z10 && this.f28601t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f28601t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z11 = this.f28594m;
        if (!z11 || !this.f28602u) {
            if (z11) {
                c11 = 1;
            } else if (this.f28602u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        Integer num = this.f28603w;
        boolean z12 = this.f28598q;
        if (num != null) {
            g10 = num.intValue();
        } else if (z12 && m()) {
            g10 = h();
        } else if (z11) {
            if (z12) {
                i10 = m6.f28115pb;
            } else {
                i10 = m6.Rc;
            }
            g10 = g(i10);
        } else {
            if (z12) {
                i7 = m6.f28095ob;
            } else {
                i7 = m6.f28153ra;
            }
            g10 = g(i7);
        }
        if (this.f28604x && this.f28584a == null && !z11 && !this.L && !m()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z12) {
            i11 = m6.f28135qb;
        } else {
            i11 = m6.f28190ta;
        }
        int g11 = g(i11);
        boolean z13 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z13 == z9 && iArr4[c11][c10] == i15 && ((!z9 || iArr3[c10] == g11) && iArr2[c11][c10] == g10)) {
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
                if (z9) {
                    iArr3[c10] = g11;
                    Paint paint = new Paint(1);
                    i13 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.g0.f22566p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i14 = 0;
                    } else {
                        i14 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.g0.f22566p > 1.0f) {
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
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i12).array(), new Rect(), null);
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
        this.M = z9;
        iArr[c11][c10] = i12;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f28606z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f28605y, -1);
    }

    public int g(int i7) {
        if (this.f28593l == 2) {
            return m6.x0(null, i7, false);
        }
        h6 h6Var = this.f28597p;
        if (h6Var != null) {
            return h6Var.h(i7);
        }
        return m6.x0(null, i7, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final int h() {
        int g10 = g(m6.La);
        if (this.f28594m) {
            g10 = i0.a.o(g10, Math.min(255, Color.alpha(g10) * 2));
        }
        return i0.a.k(g10, g(m6.f28210ua));
    }

    public int i(int i7) {
        if (this.f28593l == 2) {
            return m6.x0(null, i7, false);
        }
        h6 h6Var = this.f28597p;
        if (h6Var != null) {
            return h6Var.j(i7);
        }
        return m6.im.get(i7);
    }

    public final qa0 j() {
        char c10;
        boolean z9 = this.v;
        qa0[] qa0VarArr = T;
        if (z9) {
            return qa0VarArr[2];
        }
        if (this.f28593l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return qa0VarArr[c10];
    }

    public final Drawable k() {
        char c10;
        int i7;
        int i10;
        if (this.L || m() || (this.f28584a == null && !this.f28594m && this.J == null)) {
            return null;
        }
        int b10 = b(iz.Y0);
        boolean z9 = this.f28600s;
        boolean z10 = false;
        if (z9 && this.f28601t) {
            c10 = 3;
        } else if (z9) {
            c10 = 2;
        } else if (this.f28601t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f28605y;
        int i11 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i11 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f28606z;
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
                if (org.telegram.messenger.g0.f22566p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.g0.f22566p > 1.0f) {
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
                drawableArr[c10] = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z10 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f28598q) {
            i7 = m6.f28135qb;
        } else {
            i7 = m6.f28190ta;
        }
        int g10 = g(i7);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != g10 || z10) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final boolean l() {
        if (this.f28584a != null && m6.km) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (m6.i1(this.f28597p) && this.f28593l != 2 && this.f28603w == null) {
            return true;
        }
        return false;
    }

    public final Path n() {
        int b10;
        int i7;
        boolean z9;
        boolean z10;
        Path path;
        m.c3 c3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.Q;
        int i11 = this.f28593l;
        if (i10 != 0) {
            i7 = i10;
        } else {
            if (this.R > 0.0f) {
                i10 = org.telegram.messenger.g0.W1(this.R, b(iz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, iz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(iz.Y0);
                b10 = b(Math.min(6, iz.Y0));
            }
            i7 = b10;
        }
        int b12 = b(6.0f);
        boolean z11 = false;
        int max = Math.max(bounds.top, 0);
        boolean z12 = true;
        if (c3Var != null && bounds.height() < this.f28585b) {
            z9 = true;
            z10 = true;
        } else {
            if (i11 != 1 ? (this.f28599r + bounds.bottom) - i10 < this.f28585b : (this.f28599r + bounds.bottom) - (b12 * 2) < this.f28585b) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i10 * 2) + this.f28599r >= 0) {
                z11 = true;
            }
            z10 = z11;
        }
        if (c3Var != null) {
            path = (Path) c3Var.f19082c;
            z12 = c3Var.b(bounds, z9, z10);
        } else {
            path = this.f28595n;
        }
        if (!z12 && this.Q == 0) {
            return path;
        }
        boolean z13 = z9;
        Path path2 = path;
        e(path2, bounds, b11, i10, b12, i7, max, z13, z10, true);
        return path2;
    }

    public void o(int i7, int i10, int i11) {
        p(i7, i10, i11, i11, 0, 0, false, false);
    }

    public void p(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.u4.p(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.H;
        Paint paint = this.f28586c;
        if (i10 != i7 || paint.getAlpha() != i7) {
            this.H = i7;
            paint.setAlpha(i7);
            if (this.f28598q) {
                this.d.setAlpha((int) ((i7 / 255.0f) * Color.alpha(g(m6.Pc))));
            }
        }
        if (this.f28584a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i7) {
                f10.setAlpha(i7);
            }
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        u4 u4Var = this.J;
        if (u4Var != null) {
            u4Var.setBounds(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setColorFilter(int i7, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
