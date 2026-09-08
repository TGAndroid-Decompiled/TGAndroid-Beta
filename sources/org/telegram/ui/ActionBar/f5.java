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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.dc0;
import v7.e8;
public class f5 extends Drawable {
    public static final dc0[] Q = new dc0[3];
    public NinePatchDrawable D;
    public int E;
    public boolean G;
    public f5 H;
    public float I;
    public boolean J;
    public boolean K;
    public Bitmap L;
    public BitmapShader M;
    public m.c3 N;
    public int O;
    public float P;
    public Shader f20451a;
    public int f20452b;
    public int f20454e;
    public int f20455f;
    public int f20456g;
    public int h;
    public boolean f20457i;
    public final int f20460l;
    public final boolean f20461m;
    public f6 f20464p;
    public final boolean f20465q;
    public int f20466r;
    public boolean f20467s;
    public boolean f20468t;
    public boolean f20469u;
    public boolean v;
    public final Paint f20453c = new Paint(1);
    public final RectF f20458j = new RectF();
    public final Matrix f20459k = new Matrix();
    public final Rect f20463o = new Rect();
    public final int[] f20470w = {-1, -1, -1, -1};
    public final Bitmap[] f20471x = new Bitmap[4];
    public final Drawable[] f20472y = new Drawable[4];
    public final int[] f20473z = {-1, -1, -1, -1};
    public final int[][] A = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] B = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f20462n = new Path();
    public final Paint d = new Paint(1);
    public int F = 255;

    public f5(int i10, boolean z10, boolean z11, f6 f6Var) {
        this.f20464p = f6Var;
        this.f20465q = z10;
        this.f20460l = i10;
        this.f20461m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f20451a instanceof BitmapShader) {
            boolean z10 = this.J;
            Matrix matrix = this.f20459k;
            dc0[] dc0VarArr = Q;
            char c10 = 0;
            int i10 = this.f20460l;
            char c11 = 2;
            if (z10 && (bitmap = this.L) != null) {
                if (i10 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / dc0VarArr[c10].getBounds().width(), this.L.getHeight() / dc0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i10 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = dc0VarArr[c11].f25380k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / dc0VarArr[c11].getBounds().width(), bitmap2.getHeight() / dc0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f7) {
        if (this.f20460l == 2) {
            return (int) Math.ceil(f7 * 3.0f);
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i10;
        Paint paint2;
        Path path;
        boolean z10;
        f5 f5Var;
        Path path2;
        Drawable f7;
        Rect bounds = getBounds();
        if (paint == null && this.f20451a == null && this.O == 0 && this.P <= 0.0f && (f7 = f()) != null) {
            f7.setBounds(bounds);
            f7.draw(canvas);
            return;
        }
        int b11 = b(2.0f);
        int i11 = this.O;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.P > 0.0f) {
                i11 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (this.f20460l == 2) {
                i11 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i11 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i10 = b10;
        }
        int b12 = b(6.0f);
        if (paint == null) {
            paint2 = this.f20453c;
        } else {
            paint2 = paint;
        }
        if (paint == null && this.f20451a != null) {
            Matrix matrix = this.f20459k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.f20466r);
            this.f20451a.setLocalMatrix(matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.N != null) {
            bounds.height();
            int i12 = this.f20452b;
        }
        m.c3 c3Var = this.N;
        boolean z11 = true;
        if (c3Var != null) {
            path = (Path) c3Var.f15516c;
            z10 = c3Var.a(bounds, true, true);
        } else {
            path = this.f20462n;
            z10 = true;
        }
        if (!z10 && this.O == 0) {
            f5Var = this;
            path2 = path;
        } else {
            if (paint == null) {
                z11 = false;
            }
            f5Var = this;
            int i13 = i11;
            path2 = path;
            f5Var.e(path2, bounds, b11, i13, b12, i10, max, true, true, z11);
        }
        canvas.drawPath(path2, paint2);
        if (f5Var.f20451a != null && f5Var.f20461m && paint == null) {
            int g10 = g(j6.f20659bc);
            int k10 = i0.a.k(g10, (int) ((Color.alpha(g10) * f5Var.F) / 255.0f));
            Paint paint3 = f5Var.d;
            paint3.setColor(k10);
            canvas.drawPath(path2, paint3);
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.N = c3Var;
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.N = c3Var;
        }
        c(canvas, paint);
        this.N = null;
        f5 f5Var2 = this.H;
        if (f5Var2 != null) {
            f5Var2.N = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.draw(canvas);
            setAlpha((int) (this.I * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12) {
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
        boolean z13 = this.f20465q;
        int i20 = this.f20460l;
        RectF rectF = this.f20458j;
        if (z13) {
            if (!this.G && i20 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i14 - this.f20466r) + this.f20452b);
                path.lineTo(rect.left + i10, (i14 - this.f20466r) + this.f20452b);
            } else {
                if (this.f20469u) {
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
            if (!this.G && i20 != 2 && !z12 && !z11) {
                path.lineTo(rect.left + i10, (i14 - this.f20466r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.f20466r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.f20466r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i10, rect.top + i10 + i19);
                int i24 = rect.left + i10;
                int i25 = rect.top + i10;
                int i26 = i19 * 2;
                rectF.set(i24, i25, i24 + i26, i25 + i26);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f20467s) {
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
                    path.lineTo(rect.right - i10, (i14 - this.f20466r) + this.f20452b);
                } else {
                    if (this.f20468t) {
                        i19 = i13;
                    }
                    path.lineTo(rect.right - i10, (rect.bottom - i10) - i19);
                    int i31 = rect.right - i10;
                    int i32 = i19 * 2;
                    int i33 = rect.bottom - i10;
                    rectF.set(i31 - i32, i33 - i32, i31, i33);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.G && i20 != 2 && !z12 && !z10) {
                path.lineTo(rect.right - b(8.0f), (i14 - this.f20466r) + this.f20452b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i34 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i34) - b(9.0f), (rect.right - b(7.0f)) + i34, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.G && i20 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.f20466r) + this.f20452b);
                path.lineTo(rect.right - i10, (i14 - this.f20466r) + this.f20452b);
            } else {
                if (this.f20469u) {
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
            if (!this.G && i20 != 2 && !z12 && !z11) {
                path.lineTo(rect.right - i10, (i14 - this.f20466r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.f20466r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.f20466r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i10, rect.top + i10 + i19);
                int i38 = rect.right - i10;
                int i39 = i19 * 2;
                int i40 = rect.top + i10;
                rectF.set(i38 - i39, i40, i38, i40 + i39);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f20467s) {
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
                    path.lineTo(rect.left + i10, (i14 - this.f20466r) + this.f20452b);
                } else {
                    if (this.f20468t || this.f20469u) {
                        i19 = i13;
                    }
                    path.lineTo(rect.left + i10, (rect.bottom - i10) - i19);
                    int i45 = rect.left + i10;
                    int i46 = rect.bottom - i10;
                    int i47 = i19 * 2;
                    rectF.set(i45, i46 - i47, i45 + i47, i46);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.G && i20 != 2 && !z12 && !z10) {
                path.lineTo(b(8.0f) + rect.left, (i14 - this.f20466r) + this.f20452b);
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

    public final Drawable f() {
        char c10;
        int i10;
        int g10;
        boolean z10;
        int i11;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i12;
        int i13;
        int i14;
        Rect rect = this.f20463o;
        int i15 = this.O;
        if (i15 == 0) {
            if (this.P > 0.0f) {
                i15 = 0;
            } else {
                i15 = b(SharedConfig.bubbleRadius);
            }
        }
        boolean z11 = this.f20467s;
        char c11 = 3;
        if (z11 && this.f20468t) {
            c10 = 3;
        } else if (z11) {
            c10 = 2;
        } else if (this.f20468t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z12 = this.f20461m;
        if (!z12 || !this.f20469u) {
            if (z12) {
                c11 = 1;
            } else if (this.f20469u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        boolean z13 = this.f20465q;
        if (z12) {
            if (z13) {
                i14 = j6.Ba;
            } else {
                i14 = j6.f20696dc;
            }
            g10 = g(i14);
        } else {
            if (z13) {
                i10 = j6.Aa;
            } else {
                i10 = j6.f20947ra;
            }
            g10 = g(i10);
        }
        if (this.f20451a == null && !z12 && !this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i11 = j6.Ca;
        } else {
            i11 = j6.ta;
        }
        int g11 = g(i11);
        boolean z14 = this.K;
        Drawable[][] drawableArr2 = this.B;
        int[][] iArr2 = this.C;
        int[] iArr3 = this.f20473z;
        int[][] iArr4 = this.A;
        if (z14 != z10 || iArr4[c11][c10] != i15 || ((z10 && iArr3[c10] != g11) || iArr2[c11][c10] != g10)) {
            iArr4[c11][c10] = i15;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z10) {
                    iArr3[c10] = g11;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i13 = 0;
                    } else {
                        i13 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i13);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i13);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(g10);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i12 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, e8.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i12).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.K = z10;
            iArr[c11][c10] = i12;
            return drawableArr[c11][c10];
        }
        i12 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.K = z10;
        iArr[c11][c10] = i12;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f20471x;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.f20472y, (Object) null);
        Arrays.fill(this.f20470w, -1);
    }

    public int g(int i10) {
        if (this.f20460l == 2) {
            return j6.w0(null, i10, false);
        }
        f6 f6Var = this.f20464p;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return j6.w0(null, i10, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.f20460l == 2) {
            return j6.w0(null, i10, false);
        }
        f6 f6Var = this.f20464p;
        if (f6Var != null) {
            return f6Var.h1(i10);
        }
        return j6.rl.get(i10);
    }

    public final dc0 i() {
        char c10;
        boolean z10 = this.v;
        dc0[] dc0VarArr = Q;
        if (z10) {
            return dc0VarArr[2];
        }
        if (this.f20460l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return dc0VarArr[c10];
    }

    public final Drawable j() {
        char c10;
        int i10;
        int i11;
        if (this.J || (this.f20451a == null && !this.f20461m && this.H == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z10 = this.f20467s;
        boolean z11 = false;
        if (z10 && this.f20468t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f20468t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f20470w;
        int i12 = iArr[c10];
        Drawable[] drawableArr = this.f20472y;
        if (i12 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f20471x;
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
                if (AndroidUtilities.density > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (AndroidUtilities.density > 1.0f) {
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
                drawableArr[c10] = new NinePatchDrawable(createBitmap, e8.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f20465q) {
            i10 = j6.Ca;
        } else {
            i10 = j6.ta;
        }
        int g10 = g(i10);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.f20473z;
            if (iArr2[c10] != g10 || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final Drawable[] k() {
        return this.f20472y;
    }

    public final boolean l() {
        if (this.f20451a != null && j6.tl) {
            return true;
        }
        return false;
    }

    public final Path m() {
        int b10;
        int i10;
        boolean z10;
        boolean z11;
        Path path;
        m.c3 c3Var = this.N;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.O;
        int i12 = this.f20460l;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.P > 0.0f) {
                i11 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (i12 == 2) {
                i11 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i11 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i10 = b10;
        }
        int b12 = b(6.0f);
        boolean z12 = false;
        int max = Math.max(bounds.top, 0);
        boolean z13 = true;
        if (c3Var != null && bounds.height() < this.f20452b) {
            z10 = true;
            z11 = true;
        } else {
            if (i12 != 1 ? (this.f20466r + bounds.bottom) - i11 < this.f20452b : (this.f20466r + bounds.bottom) - (b12 * 2) < this.f20452b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 * 2) + this.f20466r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (c3Var != null) {
            path = (Path) c3Var.f15516c;
            z13 = c3Var.a(bounds, z10, z11);
        } else {
            path = this.f20462n;
        }
        if (!z13 && this.O == 0) {
            return path;
        }
        boolean z14 = z10;
        Path path2 = path;
        e(path2, bounds, b11, i11, b12, i10, max, z14, z11, true);
        return path2;
    }

    public void n(int i10, int i11, int i12) {
        o(i10, i11, i12, i12, 0, 0, false, false);
    }

    public void o(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f5.o(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.F;
        Paint paint = this.f20453c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.F = i10;
            paint.setAlpha(i10);
            if (this.f20465q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(j6.f20659bc))));
            }
        }
        if (this.f20451a == null) {
            Drawable f7 = f();
            if (f7.getAlpha() != i10) {
                f7.setAlpha(i10);
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
