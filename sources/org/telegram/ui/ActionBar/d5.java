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
import org.telegram.ui.Components.jb0;
public class d5 extends Drawable {
    public static final jb0[] Q = new jb0[3];
    public NinePatchDrawable D;
    public int E;
    public boolean G;
    public d5 H;
    public float I;
    public boolean J;
    public boolean K;
    public Bitmap L;
    public BitmapShader M;
    public m.f3 N;
    public int O;
    public float P;
    public Shader f22843a;
    public int f22844b;
    public int f22846e;
    public int f22847f;
    public int f22848g;
    public int h;
    public boolean f22849i;
    public final int f22852l;
    public final boolean f22853m;
    public b6 f22856p;
    public final boolean f22857q;
    public int f22858r;
    public boolean f22859s;
    public boolean f22860t;
    public boolean f22861u;
    public boolean v;
    public final Paint f22845c = new Paint(1);
    public final RectF f22850j = new RectF();
    public final Matrix f22851k = new Matrix();
    public final Rect f22855o = new Rect();
    public final int[] f22862w = {-1, -1, -1, -1};
    public final Bitmap[] f22863x = new Bitmap[4];
    public final Drawable[] f22864y = new Drawable[4];
    public final int[] f22865z = {-1, -1, -1, -1};
    public final int[][] A = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] B = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f22854n = new Path();
    public final Paint d = new Paint(1);
    public int F = 255;

    public d5(int i9, boolean z10, boolean z11, b6 b6Var) {
        this.f22856p = b6Var;
        this.f22857q = z10;
        this.f22852l = i9;
        this.f22853m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f22843a instanceof BitmapShader) {
            boolean z10 = this.J;
            Matrix matrix = this.f22851k;
            jb0[] jb0VarArr = Q;
            char c10 = 0;
            int i9 = this.f22852l;
            char c11 = 2;
            if (z10 && (bitmap = this.L) != null) {
                if (i9 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / jb0VarArr[c10].getBounds().width(), this.L.getHeight() / jb0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i9 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = jb0VarArr[c11].f29698k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / jb0VarArr[c11].getBounds().width(), bitmap2.getHeight() / jb0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f10) {
        if (this.f22852l == 2) {
            return (int) Math.ceil(f10 * 3.0f);
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i9;
        Paint paint2;
        Path path;
        boolean z10;
        d5 d5Var;
        Path path2;
        Drawable f10;
        Rect bounds = getBounds();
        if (paint == null && this.f22843a == null && this.O == 0 && this.P <= 0.0f && (f10 = f()) != null) {
            f10.setBounds(bounds);
            f10.draw(canvas);
            return;
        }
        int b11 = b(2.0f);
        int i10 = this.O;
        if (i10 != 0) {
            i9 = i10;
        } else {
            if (this.P > 0.0f) {
                i10 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (this.f22852l == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i9 = b10;
        }
        int b12 = b(6.0f);
        if (paint == null) {
            paint2 = this.f22845c;
        } else {
            paint2 = paint;
        }
        if (paint == null && this.f22843a != null) {
            Matrix matrix = this.f22851k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.f22858r);
            this.f22843a.setLocalMatrix(matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.N != null) {
            bounds.height();
            int i11 = this.f22844b;
        }
        m.f3 f3Var = this.N;
        boolean z11 = true;
        if (f3Var != null) {
            path = (Path) f3Var.f16946c;
            z10 = f3Var.a(bounds, true, true);
        } else {
            path = this.f22854n;
            z10 = true;
        }
        if (!z10 && this.O == 0) {
            d5Var = this;
            path2 = path;
        } else {
            if (paint == null) {
                z11 = false;
            }
            d5Var = this;
            int i12 = i10;
            path2 = path;
            d5Var.e(path2, bounds, b11, i12, b12, i9, max, true, true, z11);
        }
        canvas.drawPath(path2, paint2);
        if (d5Var.f22843a != null && d5Var.f22853m && paint == null) {
            int g10 = g(f6.f22970bc);
            int k10 = i0.a.k(g10, (int) ((Color.alpha(g10) * d5Var.F) / 255.0f));
            Paint paint3 = d5Var.d;
            paint3.setColor(k10);
            canvas.drawPath(path2, paint3);
        }
    }

    public final void d(Canvas canvas, m.f3 f3Var, Paint paint) {
        this.N = f3Var;
        d5 d5Var = this.H;
        if (d5Var != null) {
            d5Var.N = f3Var;
        }
        c(canvas, paint);
        this.N = null;
        d5 d5Var2 = this.H;
        if (d5Var2 != null) {
            d5Var2.N = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        d5 d5Var = this.H;
        if (d5Var != null) {
            d5Var.draw(canvas);
            setAlpha((int) (this.I * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Path path, Rect rect, int i9, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        int i14;
        int i15;
        int i16;
        int i17;
        path.rewind();
        int height = (rect.height() - i9) >> 1;
        int i18 = i10;
        if (i18 > height) {
            i18 = height;
        }
        boolean z13 = this.f22857q;
        int i19 = this.f22852l;
        RectF rectF = this.f22850j;
        if (z13) {
            if (!this.G && i19 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i13 - this.f22858r) + this.f22844b);
                path.lineTo(rect.left + i9, (i13 - this.f22858r) + this.f22844b);
            } else {
                if (this.f22861u) {
                    i16 = i12;
                } else {
                    i16 = i18;
                }
                if (i19 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i16, rect.bottom - i9);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i9);
                }
                path.lineTo(rect.left + i9 + i16, rect.bottom - i9);
                int i20 = rect.left + i9;
                int i21 = rect.bottom - i9;
                int i22 = i16 * 2;
                rectF.set(i20, i21 - i22, i20 + i22, i21);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            }
            if (!this.G && i19 != 2 && !z12 && !z11) {
                path.lineTo(rect.left + i9, (i13 - this.f22858r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.right - i9, (i13 - this.f22858r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.f22858r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i9, rect.top + i9 + i18);
                int i23 = rect.left + i9;
                int i24 = rect.top + i9;
                int i25 = i18 * 2;
                rectF.set(i23, i24, i23 + i25, i24 + i25);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f22859s) {
                    i17 = i12;
                } else {
                    i17 = i18;
                }
                if (i19 == 1) {
                    path.lineTo((rect.right - i9) - i17, rect.top + i9);
                    int i26 = rect.right - i9;
                    int i27 = i17 * 2;
                    int i28 = rect.top + i9;
                    rectF.set(i26 - i27, i28, i26, i28 + i27);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i17, rect.top + i9);
                    int i29 = i17 * 2;
                    rectF.set((rect.right - b(8.0f)) - i29, rect.top + i9, rect.right - b(8.0f), rect.top + i9 + i29);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            }
            if (i19 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.right - i9, (i13 - this.f22858r) + this.f22844b);
                } else {
                    if (this.f22860t) {
                        i18 = i12;
                    }
                    path.lineTo(rect.right - i9, (rect.bottom - i9) - i18);
                    int i30 = rect.right - i9;
                    int i31 = i18 * 2;
                    int i32 = rect.bottom - i9;
                    rectF.set(i30 - i31, i32 - i31, i30, i32);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.G && i19 != 2 && !z12 && !z10) {
                path.lineTo(rect.right - b(8.0f), (i13 - this.f22858r) + this.f22844b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i9) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i9) - i33) - b(9.0f), (rect.right - b(7.0f)) + i33, (rect.bottom - i9) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.G && i19 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.f22858r) + this.f22844b);
                path.lineTo(rect.right - i9, (i13 - this.f22858r) + this.f22844b);
            } else {
                if (this.f22861u) {
                    i14 = i12;
                } else {
                    i14 = i18;
                }
                if (i19 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i14, rect.bottom - i9);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i9);
                }
                path.lineTo((rect.right - i9) - i14, rect.bottom - i9);
                int i34 = rect.right - i9;
                int i35 = i14 * 2;
                int i36 = rect.bottom - i9;
                rectF.set(i34 - i35, i36 - i35, i34, i36);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            }
            if (!this.G && i19 != 2 && !z12 && !z11) {
                path.lineTo(rect.right - i9, (i13 - this.f22858r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.left + i9, (i13 - this.f22858r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.f22858r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i9, rect.top + i9 + i18);
                int i37 = rect.right - i9;
                int i38 = i18 * 2;
                int i39 = rect.top + i9;
                rectF.set(i37 - i38, i39, i37, i39 + i38);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f22859s) {
                    i15 = i12;
                } else {
                    i15 = i18;
                }
                if (i19 == 1) {
                    path.lineTo(rect.left + i9 + i15, rect.top + i9);
                    int i40 = rect.left + i9;
                    int i41 = rect.top + i9;
                    int i42 = i15 * 2;
                    rectF.set(i40, i41, i40 + i42, i41 + i42);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i15, rect.top + i9);
                    int i43 = i15 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i9, b(8.0f) + rect.left + i43, rect.top + i9 + i43);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            }
            if (i19 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.left + i9, (i13 - this.f22858r) + this.f22844b);
                } else {
                    if (this.f22860t || this.f22861u) {
                        i18 = i12;
                    }
                    path.lineTo(rect.left + i9, (rect.bottom - i9) - i18);
                    int i44 = rect.left + i9;
                    int i45 = rect.bottom - i9;
                    int i46 = i18 * 2;
                    rectF.set(i44, i45 - i46, i44 + i46, i45);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.G && i19 != 2 && !z12 && !z10) {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.f22858r) + this.f22844b);
            } else {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i9) - i11) - b(3.0f));
                int b10 = b(7.0f) + rect.left;
                int i47 = i11 * 2;
                rectF.set(b10 - i47, ((rect.bottom - i9) - i47) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i9) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            }
        }
        path.close();
    }

    public final Drawable f() {
        char c10;
        int i9;
        int g10;
        boolean z10;
        int i10;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i11;
        int i12;
        int i13;
        Rect rect = this.f22855o;
        int i14 = this.O;
        if (i14 == 0) {
            if (this.P > 0.0f) {
                i14 = 0;
            } else {
                i14 = b(SharedConfig.bubbleRadius);
            }
        }
        boolean z11 = this.f22859s;
        char c11 = 3;
        if (z11 && this.f22860t) {
            c10 = 3;
        } else if (z11) {
            c10 = 2;
        } else if (this.f22860t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z12 = this.f22853m;
        if (!z12 || !this.f22861u) {
            if (z12) {
                c11 = 1;
            } else if (this.f22861u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        boolean z13 = this.f22857q;
        if (z12) {
            if (z13) {
                i13 = f6.Ba;
            } else {
                i13 = f6.f23006dc;
            }
            g10 = g(i13);
        } else {
            if (z13) {
                i9 = f6.Aa;
            } else {
                i9 = f6.f23252ra;
            }
            g10 = g(i9);
        }
        if (this.f22843a == null && !z12 && !this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i10 = f6.Ca;
        } else {
            i10 = f6.f23289ta;
        }
        int g11 = g(i10);
        boolean z14 = this.K;
        Drawable[][] drawableArr2 = this.B;
        int[][] iArr2 = this.C;
        int[] iArr3 = this.f22865z;
        int[][] iArr4 = this.A;
        if (z14 != z10 || iArr4[c11][c10] != i14 || ((z10 && iArr3[c10] != g11) || iArr2[c11][c10] != g10)) {
            iArr4[c11][c10] = i14;
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
                        i12 = 0;
                    } else {
                        i12 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i12);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i12);
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
                i11 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, g7.z5.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.K = z10;
            iArr[c11][c10] = i11;
            return drawableArr[c11][c10];
        }
        i11 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.K = z10;
        iArr[c11][c10] = i11;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f22863x;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.f22864y, (Object) null);
        Arrays.fill(this.f22862w, -1);
    }

    public int g(int i9) {
        if (this.f22852l == 2) {
            return f6.w0(null, i9, false);
        }
        b6 b6Var = this.f22856p;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return f6.w0(null, i9, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i9) {
        if (this.f22852l == 2) {
            return f6.w0(null, i9, false);
        }
        b6 b6Var = this.f22856p;
        if (b6Var != null) {
            return b6Var.q1(i9);
        }
        return f6.rl.get(i9);
    }

    public final jb0 i() {
        char c10;
        boolean z10 = this.v;
        jb0[] jb0VarArr = Q;
        if (z10) {
            return jb0VarArr[2];
        }
        if (this.f22852l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return jb0VarArr[c10];
    }

    public final Drawable j() {
        char c10;
        int i9;
        int i10;
        if (this.J || (this.f22843a == null && !this.f22853m && this.H == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z10 = this.f22859s;
        boolean z11 = false;
        if (z10 && this.f22860t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f22860t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f22862w;
        int i11 = iArr[c10];
        Drawable[] drawableArr = this.f22864y;
        if (i11 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f22863x;
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
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, g7.z5.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f22857q) {
            i9 = f6.Ca;
        } else {
            i9 = f6.f23289ta;
        }
        int g10 = g(i9);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.f22865z;
            if (iArr2[c10] != g10 || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final Drawable[] k() {
        return this.f22864y;
    }

    public final boolean l() {
        if (this.f22843a != null && f6.tl) {
            return true;
        }
        return false;
    }

    public final Path m() {
        int b10;
        int i9;
        boolean z10;
        boolean z11;
        Path path;
        m.f3 f3Var = this.N;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.O;
        int i11 = this.f22852l;
        if (i10 != 0) {
            i9 = i10;
        } else {
            if (this.P > 0.0f) {
                i10 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i9 = b10;
        }
        int b12 = b(6.0f);
        boolean z12 = false;
        int max = Math.max(bounds.top, 0);
        boolean z13 = true;
        if (f3Var != null && bounds.height() < this.f22844b) {
            z10 = true;
            z11 = true;
        } else {
            if (i11 != 1 ? (this.f22858r + bounds.bottom) - i10 < this.f22844b : (this.f22858r + bounds.bottom) - (b12 * 2) < this.f22844b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 * 2) + this.f22858r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (f3Var != null) {
            path = (Path) f3Var.f16946c;
            z13 = f3Var.a(bounds, z10, z11);
        } else {
            path = this.f22854n;
        }
        if (!z13 && this.O == 0) {
            return path;
        }
        boolean z14 = z10;
        Path path2 = path;
        e(path2, bounds, b11, i10, b12, i9, max, z14, z11, true);
        return path2;
    }

    public void n(int i9, int i10, int i11) {
        o(i9, i10, i11, i11, 0, 0, false, false);
    }

    public void o(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d5.o(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i9) {
        int i10 = this.F;
        Paint paint = this.f22845c;
        if (i10 != i9 || paint.getAlpha() != i9) {
            this.F = i9;
            paint.setAlpha(i9);
            if (this.f22857q) {
                this.d.setAlpha((int) ((i9 / 255.0f) * Color.alpha(g(f6.f22970bc))));
            }
        }
        if (this.f22843a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i9) {
                f10.setAlpha(i9);
            }
        }
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        d5 d5Var = this.H;
        if (d5Var != null) {
            d5Var.setBounds(i9, i10, i11, i12);
        }
    }

    @Override
    public final void setColorFilter(int i9, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
