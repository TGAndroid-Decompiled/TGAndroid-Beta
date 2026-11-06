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
public class t4 extends Drawable {
    public static final qa0[] T = new qa0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public t4 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.c3 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader f28507a;
    public int f28508b;
    public int f28510e;
    public int f28511f;
    public int f28512g;
    public int h;
    public boolean f28513i;
    public final int f28516l;
    public final boolean f28517m;
    public f6 f28520p;
    public final boolean f28521q;
    public int f28522r;
    public boolean f28523s;
    public boolean f28524t;
    public boolean f28525u;
    public boolean v;
    public final Paint f28509c = new Paint(1);
    public final RectF f28514j = new RectF();
    public final Matrix f28515k = new Matrix();
    public final Rect f28519o = new Rect();
    public Integer f28526w = null;
    public boolean f28527x = true;
    public final int[] f28528y = {-1, -1, -1, -1};
    public final Bitmap[] f28529z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f28518n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public t4(int i7, boolean z9, boolean z10, f6 f6Var) {
        this.f28520p = f6Var;
        this.f28521q = z9;
        this.f28516l = i7;
        this.f28517m = z10;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f28507a instanceof BitmapShader) {
            boolean z9 = this.L;
            Matrix matrix = this.f28515k;
            qa0[] qa0VarArr = T;
            char c10 = 0;
            int i7 = this.f28516l;
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
            Bitmap bitmap2 = qa0VarArr[c11].f37230k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / qa0VarArr[c11].getBounds().width(), bitmap2.getHeight() / qa0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f10) {
        if (this.f28516l == 2) {
            return (int) Math.ceil(f10 * 3.0f);
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i7;
        Path path;
        boolean z9;
        t4 t4Var;
        Path path2;
        int h;
        Drawable g10;
        if (this.f28521q || !n() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.f28509c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.f28507a == null && this.Q == 0 && this.R <= 0.0f && (g10 = g()) != null) {
                g10.setBounds(bounds);
                g10.draw(canvas);
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
                } else if (this.f28516l == 2) {
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
            if (paint == null && this.f28507a != null) {
                Matrix matrix = this.f28515k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.f28522r);
                this.f28507a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i11 = this.f28508b;
            }
            m.c3 c3Var = this.P;
            boolean z10 = true;
            if (c3Var != null) {
                path = (Path) c3Var.f19074c;
                z9 = c3Var.b(bounds, true, true);
            } else {
                path = this.f28518n;
                z9 = true;
            }
            if (!z9 && this.Q == 0) {
                t4Var = this;
                path2 = path;
            } else {
                if (paint == null) {
                    z10 = false;
                }
                t4Var = this;
                int i12 = i10;
                path2 = path;
                t4Var.f(path2, bounds, b11, i12, b12, i7, max, true, true, z10);
            }
            canvas.drawPath(path2, paint2);
            if (t4Var.f28507a != null && t4Var.f28517m && paint == null) {
                int o4 = i0.a.o(h(k6.Pc), (int) ((Color.alpha(h) * t4Var.H) / 255.0f));
                Paint paint3 = t4Var.d;
                paint3.setColor(o4);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var) {
        e(canvas, c3Var, null);
    }

    @Override
    public final void draw(Canvas canvas) {
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.draw(canvas);
            setAlpha((int) (this.K * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.P = c3Var;
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.P = c3Var;
        }
        c(canvas, paint);
        this.P = null;
        t4 t4Var2 = this.J;
        if (t4Var2 != null) {
            t4Var2.P = null;
        }
    }

    public final void f(Path path, Rect rect, int i7, int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11) {
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
        boolean z12 = this.f28521q;
        int i19 = this.f28516l;
        RectF rectF = this.f28514j;
        if (z12) {
            if (!this.I && i19 != 2 && !z11 && !z9) {
                path.moveTo(rect.right - b(8.0f), (i13 - this.f28522r) + this.f28508b);
                path.lineTo(rect.left + i7, (i13 - this.f28522r) + this.f28508b);
            } else {
                if (this.f28525u) {
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
                path.lineTo(rect.left + i7, (i13 - this.f28522r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.right - i7, (i13 - this.f28522r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.f28522r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i7, rect.top + i7 + i18);
                int i23 = rect.left + i7;
                int i24 = rect.top + i7;
                int i25 = i18 * 2;
                rectF.set(i23, i24, i23 + i25, i24 + i25);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f28523s) {
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
                    path.lineTo(rect.right - i7, (i13 - this.f28522r) + this.f28508b);
                } else {
                    if (this.f28524t) {
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
                path.lineTo(rect.right - b(8.0f), (i13 - this.f28522r) + this.f28508b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i7) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i7) - i33) - b(9.0f), (rect.right - b(7.0f)) + i33, (rect.bottom - i7) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i19 != 2 && !z11 && !z9) {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.f28522r) + this.f28508b);
                path.lineTo(rect.right - i7, (i13 - this.f28522r) + this.f28508b);
            } else {
                if (this.f28525u) {
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
                path.lineTo(rect.right - i7, (i13 - this.f28522r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.left + i7, (i13 - this.f28522r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.f28522r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i7, rect.top + i7 + i18);
                int i37 = rect.right - i7;
                int i38 = i18 * 2;
                int i39 = rect.top + i7;
                rectF.set(i37 - i38, i39, i37, i39 + i38);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f28523s) {
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
                    path.lineTo(rect.left + i7, (i13 - this.f28522r) + this.f28508b);
                } else {
                    if (this.f28524t || this.f28525u) {
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
                path.lineTo(b(8.0f) + rect.left, (i13 - this.f28522r) + this.f28508b);
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

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f28529z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f28528y, -1);
    }

    public final Drawable g() {
        char c10;
        int i7;
        int h;
        int i10;
        boolean z9;
        int i11;
        int i12;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i13;
        int i14;
        Rect rect = this.f28519o;
        int i15 = this.Q;
        if (i15 == 0) {
            if (this.R > 0.0f) {
                i15 = 0;
            } else {
                i15 = b(iz.Y0);
            }
        }
        boolean z10 = this.f28523s;
        char c11 = 3;
        if (z10 && this.f28524t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f28524t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z11 = this.f28517m;
        if (!z11 || !this.f28525u) {
            if (z11) {
                c11 = 1;
            } else if (this.f28525u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        Integer num = this.f28526w;
        boolean z12 = this.f28521q;
        if (num != null) {
            h = num.intValue();
        } else if (z12 && n()) {
            h = i();
        } else if (z11) {
            if (z12) {
                i10 = k6.f28074pb;
            } else {
                i10 = k6.Rc;
            }
            h = h(i10);
        } else {
            if (z12) {
                i7 = k6.f28054ob;
            } else {
                i7 = k6.f28112ra;
            }
            h = h(i7);
        }
        if (this.f28527x && this.f28507a == null && !z11 && !this.L && !n()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z12) {
            i11 = k6.f28094qb;
        } else {
            i11 = k6.f28149ta;
        }
        int h7 = h(i11);
        boolean z13 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z13 == z9 && iArr4[c11][c10] == i15 && ((!z9 || iArr3[c10] == h7) && iArr2[c11][c10] == h)) {
            i12 = h;
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
                    iArr3[c10] = h7;
                    Paint paint = new Paint(1);
                    i13 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(h7, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.g0.f22543p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i14 = 0;
                    } else {
                        i14 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.g0.f22543p > 1.0f) {
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
                paint2.setColor(h);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i12 = h;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i12).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i12 = h;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z9;
        iArr[c11][c10] = i12;
        return drawableArr[c11][c10];
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i7) {
        if (this.f28516l == 2) {
            return k6.x0(null, i7, false);
        }
        f6 f6Var = this.f28520p;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return k6.x0(null, i7, false);
    }

    public final int i() {
        int h = h(k6.La);
        if (this.f28517m) {
            h = i0.a.o(h, Math.min(255, Color.alpha(h) * 2));
        }
        return i0.a.k(h, h(k6.f28169ua));
    }

    public int j(int i7) {
        if (this.f28516l == 2) {
            return k6.x0(null, i7, false);
        }
        f6 f6Var = this.f28520p;
        if (f6Var != null) {
            return f6Var.j(i7);
        }
        return k6.im.get(i7);
    }

    public final qa0 k() {
        char c10;
        boolean z9 = this.v;
        qa0[] qa0VarArr = T;
        if (z9) {
            return qa0VarArr[2];
        }
        if (this.f28516l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return qa0VarArr[c10];
    }

    public final Drawable l() {
        char c10;
        int i7;
        int i10;
        if (this.L || n() || (this.f28507a == null && !this.f28517m && this.J == null)) {
            return null;
        }
        int b10 = b(iz.Y0);
        boolean z9 = this.f28523s;
        boolean z10 = false;
        if (z9 && this.f28524t) {
            c10 = 3;
        } else if (z9) {
            c10 = 2;
        } else if (this.f28524t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f28528y;
        int i11 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i11 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f28529z;
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
                if (org.telegram.messenger.g0.f22543p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.g0.f22543p > 1.0f) {
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
        if (this.f28521q) {
            i7 = k6.f28094qb;
        } else {
            i7 = k6.f28149ta;
        }
        int h = h(i7);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != h || z10) {
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = h;
            }
        }
        return drawableArr[c10];
    }

    public final boolean m() {
        if (this.f28507a != null && k6.km) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (k6.i1(this.f28520p) && this.f28516l != 2 && this.f28526w == null) {
            return true;
        }
        return false;
    }

    public final Path o() {
        int b10;
        int i7;
        boolean z9;
        boolean z10;
        Path path;
        m.c3 c3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.Q;
        int i11 = this.f28516l;
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
        if (c3Var != null && bounds.height() < this.f28508b) {
            z9 = true;
            z10 = true;
        } else {
            if (i11 != 1 ? (this.f28522r + bounds.bottom) - i10 < this.f28508b : (this.f28522r + bounds.bottom) - (b12 * 2) < this.f28508b) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i10 * 2) + this.f28522r >= 0) {
                z11 = true;
            }
            z10 = z11;
        }
        if (c3Var != null) {
            path = (Path) c3Var.f19074c;
            z12 = c3Var.b(bounds, z9, z10);
        } else {
            path = this.f28518n;
        }
        if (!z12 && this.Q == 0) {
            return path;
        }
        boolean z13 = z9;
        Path path2 = path;
        f(path2, bounds, b11, i10, b12, i7, max, z13, z10, true);
        return path2;
    }

    public void p(int i7, int i10, int i11) {
        q(i7, i10, i11, i11, 0, 0, false, false);
    }

    public void q(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t4.q(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i7) {
        int i10 = this.H;
        Paint paint = this.f28509c;
        if (i10 != i7 || paint.getAlpha() != i7) {
            this.H = i7;
            paint.setAlpha(i7);
            if (this.f28521q) {
                this.d.setAlpha((int) ((i7 / 255.0f) * Color.alpha(h(k6.Pc))));
            }
        }
        if (this.f28507a == null) {
            Drawable g10 = g();
            if (g10.getAlpha() != i7) {
                g10.setAlpha(i7);
            }
        }
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.setBounds(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setColorFilter(int i7, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
