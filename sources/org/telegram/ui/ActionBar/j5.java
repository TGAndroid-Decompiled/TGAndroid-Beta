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
import org.telegram.ui.Components.wc0;
import v7.v7;
public class j5 extends Drawable {
    public static final wc0[] S = new wc0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public j5 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.e3 P;
    public int Q;
    public float R;
    public Shader f20998a;
    public int f20999b;
    public int e;
    public int f21001f;
    public int f21002g;
    public int h;
    public boolean f21003i;
    public final int f21006l;
    public final boolean f21007m;
    public g6 f21010p;
    public final boolean f21011q;
    public int f21012r;
    public boolean f21013s;
    public boolean f21014t;
    public boolean f21015u;
    public boolean v;
    public final Paint f21000c = new Paint(1);
    public final RectF f21004j = new RectF();
    public final Matrix f21005k = new Matrix();
    public final Rect f21009o = new Rect();
    public Integer f21016w = null;
    public boolean f21017x = true;
    public final int[] f21018y = {-1, -1, -1, -1};
    public final Bitmap[] f21019z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f21008n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public j5(int i10, boolean z10, boolean z11, g6 g6Var) {
        this.f21010p = g6Var;
        this.f21011q = z10;
        this.f21006l = i10;
        this.f21007m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f20998a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.f21005k;
            wc0[] wc0VarArr = S;
            char c10 = 0;
            int i10 = this.f21006l;
            char c11 = 2;
            if (z10 && (bitmap = this.N) != null) {
                if (i10 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / wc0VarArr[c10].getBounds().width(), this.N.getHeight() / wc0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i10 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = wc0VarArr[c11].f32200k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / wc0VarArr[c11].getBounds().width(), bitmap2.getHeight() / wc0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f7) {
        if (this.f21006l == 2) {
            return (int) Math.ceil(f7 * 3.0f);
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        Paint paint2;
        Path path;
        boolean z10;
        j5 j5Var;
        Path path2;
        int g10;
        Drawable f7;
        Rect bounds = getBounds();
        Paint paint3 = this.f21000c;
        if (paint == null && paint3.getStyle() == Paint.Style.FILL && this.f20998a == null && this.Q == 0 && this.R <= 0.0f && (f7 = f()) != null) {
            f7.setBounds(bounds);
            f7.draw(canvas);
            return;
        }
        int b11 = b(2.0f);
        int i10 = this.Q;
        if (i10 != 0) {
            b10 = i10;
        } else if (this.R > 0.0f) {
            i10 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.R);
            b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.R);
        } else if (this.f21006l == 2) {
            i10 = b(6.0f);
            b10 = b(6.0f);
        } else {
            i10 = b(SharedConfig.bubbleRadius);
            b10 = b(Math.min(6, SharedConfig.bubbleRadius));
        }
        int b12 = b(6.0f);
        if (paint == null) {
            paint2 = paint3;
        } else {
            paint2 = paint;
        }
        if (paint == null && this.f20998a != null) {
            Matrix matrix = this.f21005k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.f21012r);
            this.f20998a.setLocalMatrix(matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.P != null) {
            bounds.height();
            int i11 = this.f20999b;
        }
        m.e3 e3Var = this.P;
        boolean z11 = true;
        if (e3Var != null) {
            path = (Path) e3Var.f16259c;
            z10 = e3Var.a(bounds, true, true);
        } else {
            path = this.f21008n;
            z10 = true;
        }
        if (!z10 && this.Q == 0) {
            j5Var = this;
            path2 = path;
        } else {
            if (paint == null) {
                z11 = false;
            }
            j5Var = this;
            path2 = path;
            j5Var.e(path2, bounds, b11, i10, b12, b10, max, true, true, z11);
        }
        canvas.drawPath(path2, paint2);
        if (j5Var.f20998a != null && j5Var.f21007m && paint == null) {
            int o10 = i0.a.o(g(k6.f21151bc), (int) ((Color.alpha(g10) * j5Var.H) / 255.0f));
            Paint paint4 = j5Var.d;
            paint4.setColor(o10);
            canvas.drawPath(path2, paint4);
        }
    }

    public final void d(Canvas canvas, m.e3 e3Var, Paint paint) {
        this.P = e3Var;
        j5 j5Var = this.J;
        if (j5Var != null) {
            j5Var.P = e3Var;
        }
        c(canvas, paint);
        this.P = null;
        j5 j5Var2 = this.J;
        if (j5Var2 != null) {
            j5Var2.P = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        j5 j5Var = this.J;
        if (j5Var != null) {
            j5Var.draw(canvas);
            setAlpha((int) (this.K * 255.0f));
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
        boolean z13 = this.f21011q;
        int i20 = this.f21006l;
        RectF rectF = this.f21004j;
        if (z13) {
            if (!this.I && i20 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i14 - this.f21012r) + this.f20999b);
                path.lineTo(rect.left + i10, (i14 - this.f21012r) + this.f20999b);
            } else {
                if (this.f21015u) {
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
                path.lineTo(rect.left + i10, (i14 - this.f21012r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.f21012r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.f21012r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i10, rect.top + i10 + i19);
                int i24 = rect.left + i10;
                int i25 = rect.top + i10;
                int i26 = i19 * 2;
                rectF.set(i24, i25, i24 + i26, i25 + i26);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f21013s) {
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
                    path.lineTo(rect.right - i10, (i14 - this.f21012r) + this.f20999b);
                } else {
                    if (this.f21014t) {
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
                path.lineTo(rect.right - b(8.0f), (i14 - this.f21012r) + this.f20999b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i34 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i34) - b(9.0f), (rect.right - b(7.0f)) + i34, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i20 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.f21012r) + this.f20999b);
                path.lineTo(rect.right - i10, (i14 - this.f21012r) + this.f20999b);
            } else {
                if (this.f21015u) {
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
                path.lineTo(rect.right - i10, (i14 - this.f21012r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.f21012r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.f21012r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i10, rect.top + i10 + i19);
                int i38 = rect.right - i10;
                int i39 = i19 * 2;
                int i40 = rect.top + i10;
                rectF.set(i38 - i39, i40, i38, i40 + i39);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f21013s) {
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
                    path.lineTo(rect.left + i10, (i14 - this.f21012r) + this.f20999b);
                } else {
                    if (this.f21014t || this.f21015u) {
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
                path.lineTo(b(8.0f) + rect.left, (i14 - this.f21012r) + this.f20999b);
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
        int i11;
        boolean z10;
        int i12;
        int i13;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i14;
        int i15;
        Rect rect = this.f21009o;
        int i16 = this.Q;
        if (i16 == 0) {
            if (this.R > 0.0f) {
                i16 = 0;
            } else {
                i16 = b(SharedConfig.bubbleRadius);
            }
        }
        boolean z11 = this.f21013s;
        char c11 = 3;
        if (z11 && this.f21014t) {
            c10 = 3;
        } else if (z11) {
            c10 = 2;
        } else if (this.f21014t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z12 = this.f21007m;
        if (!z12 || !this.f21015u) {
            if (z12) {
                c11 = 1;
            } else if (this.f21015u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        Integer num = this.f21016w;
        boolean z13 = this.f21011q;
        if (num != null) {
            g10 = num.intValue();
        } else if (z12) {
            if (z13) {
                i11 = k6.Ba;
            } else {
                i11 = k6.f21189dc;
            }
            g10 = g(i11);
        } else {
            if (z13) {
                i10 = k6.Aa;
            } else {
                i10 = k6.f21445ra;
            }
            g10 = g(i10);
        }
        if (this.f21017x && this.f20998a == null && !z12 && !this.L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i12 = k6.Ca;
        } else {
            i12 = k6.f21484ta;
        }
        int g11 = g(i12);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 != z10 || iArr4[c11][c10] != i16 || ((z10 && iArr3[c10] != g11) || iArr2[c11][c10] != g10)) {
            iArr4[c11][c10] = i16;
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
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i15 = 0;
                    } else {
                        i15 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i15);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i15);
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
                i14 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, v7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i14).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.M = z10;
            iArr[c11][c10] = i14;
            return drawableArr[c11][c10];
        }
        i14 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.M = z10;
        iArr[c11][c10] = i14;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f21019z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f21018y, -1);
    }

    public int g(int i10) {
        if (this.f21006l == 2) {
            return k6.x0(null, i10, false);
        }
        g6 g6Var = this.f21010p;
        if (g6Var != null) {
            return g6Var.g(i10);
        }
        return k6.x0(null, i10, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.f21006l == 2) {
            return k6.x0(null, i10, false);
        }
        g6 g6Var = this.f21010p;
        if (g6Var != null) {
            return g6Var.i(i10);
        }
        return k6.ul.get(i10);
    }

    public final wc0 i() {
        char c10;
        boolean z10 = this.v;
        wc0[] wc0VarArr = S;
        if (z10) {
            return wc0VarArr[2];
        }
        if (this.f21006l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return wc0VarArr[c10];
    }

    public final Drawable j() {
        char c10;
        int i10;
        int i11;
        if (this.L || (this.f20998a == null && !this.f21007m && this.J == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z10 = this.f21013s;
        boolean z11 = false;
        if (z10 && this.f21014t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f21014t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f21018y;
        int i12 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i12 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f21019z;
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
                drawableArr[c10] = new NinePatchDrawable(createBitmap, v7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f21011q) {
            i10 = k6.Ca;
        } else {
            i10 = k6.f21484ta;
        }
        int g10 = g(i10);
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

    public final boolean k() {
        if (this.f20998a != null && k6.wl) {
            return true;
        }
        return false;
    }

    public final Path l() {
        int b10;
        int i10;
        boolean z10;
        boolean z11;
        Path path;
        m.e3 e3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.Q;
        int i12 = this.f21006l;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.R > 0.0f) {
                i11 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.R);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.R);
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
        if (e3Var != null && bounds.height() < this.f20999b) {
            z10 = true;
            z11 = true;
        } else {
            if (i12 != 1 ? (this.f21012r + bounds.bottom) - i11 < this.f20999b : (this.f21012r + bounds.bottom) - (b12 * 2) < this.f20999b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 * 2) + this.f21012r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (e3Var != null) {
            path = (Path) e3Var.f16259c;
            z13 = e3Var.a(bounds, z10, z11);
        } else {
            path = this.f21008n;
        }
        if (!z13 && this.Q == 0) {
            return path;
        }
        boolean z14 = z10;
        Path path2 = path;
        e(path2, bounds, b11, i11, b12, i10, max, z14, z11, true);
        return path2;
    }

    public void m(int i10, int i11, int i12) {
        n(i10, i11, i12, i12, 0, 0, false, false);
    }

    public void n(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.j5.n(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.H;
        Paint paint = this.f21000c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.H = i10;
            paint.setAlpha(i10);
            if (this.f21011q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(k6.f21151bc))));
            }
        }
        if (this.f20998a == null) {
            Drawable f7 = f();
            if (f7.getAlpha() != i10) {
                f7.setAlpha(i10);
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        j5 j5Var = this.J;
        if (j5Var != null) {
            j5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
