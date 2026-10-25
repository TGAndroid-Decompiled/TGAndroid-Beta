package org.telegram.ui.ActionBar;

import a8.yc;
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
import org.telegram.ui.Components.uc0;
public class l5 extends Drawable {
    public static final uc0[] S = new uc0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public l5 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.d3 P;
    public int Q;
    public float R;
    public Shader f22830a;
    public int f22831b;
    public int e;
    public int f22833f;
    public int f22834g;
    public int h;
    public boolean f22835i;
    public final int f22838l;
    public final boolean f22839m;
    public u6 f22842p;
    public final boolean f22843q;
    public int f22844r;
    public boolean f22845s;
    public boolean f22846t;
    public boolean f22847u;
    public boolean v;
    public final Paint f22832c = new Paint(1);
    public final RectF f22836j = new RectF();
    public final Matrix f22837k = new Matrix();
    public final Rect f22841o = new Rect();
    public Integer f22848w = null;
    public boolean f22849x = true;
    public final int[] f22850y = {-1, -1, -1, -1};
    public final Bitmap[] f22851z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f22840n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public l5(int i10, boolean z10, boolean z11, u6 u6Var) {
        this.f22842p = u6Var;
        this.f22843q = z10;
        this.f22838l = i10;
        this.f22839m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f22830a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.f22837k;
            uc0[] uc0VarArr = S;
            char c10 = 0;
            int i10 = this.f22838l;
            char c11 = 2;
            if (z10 && (bitmap = this.N) != null) {
                if (i10 == 2) {
                    c10 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / uc0VarArr[c10].getBounds().width(), this.N.getHeight() / uc0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i10 == 2) {
                    c10 = 1;
                }
                c11 = c10;
            }
            Bitmap bitmap2 = uc0VarArr[c11].f33361k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / uc0VarArr[c11].getBounds().width(), bitmap2.getHeight() / uc0VarArr[c11].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f7) {
        if (this.f22838l == 2) {
            return (int) Math.ceil(f7 * 3.0f);
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        Paint paint2;
        Path path;
        boolean z10;
        l5 l5Var;
        Path path2;
        int g7;
        Drawable f7;
        Rect bounds = getBounds();
        Paint paint3 = this.f22832c;
        if (paint == null && paint3.getStyle() == Paint.Style.FILL && this.f22830a == null && this.Q == 0 && this.R <= 0.0f && (f7 = f()) != null) {
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
        } else if (this.f22838l == 2) {
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
        if (paint == null && this.f22830a != null) {
            Matrix matrix = this.f22837k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.f22844r);
            this.f22830a.setLocalMatrix(matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.P != null) {
            bounds.height();
            int i11 = this.f22831b;
        }
        m.d3 d3Var = this.P;
        boolean z11 = true;
        if (d3Var != null) {
            path = (Path) d3Var.f17707c;
            z10 = d3Var.a(bounds, true, true);
        } else {
            path = this.f22840n;
            z10 = true;
        }
        if (!z10 && this.Q == 0) {
            l5Var = this;
            path2 = path;
        } else {
            if (paint == null) {
                z11 = false;
            }
            l5Var = this;
            path2 = path;
            l5Var.e(path2, bounds, b11, i10, b12, b10, max, true, true, z11);
        }
        canvas.drawPath(path2, paint2);
        if (l5Var.f22830a != null && l5Var.f22839m && paint == null) {
            int o10 = i0.a.o(g(y6.f23321bc), (int) ((Color.alpha(g7) * l5Var.H) / 255.0f));
            Paint paint4 = l5Var.d;
            paint4.setColor(o10);
            canvas.drawPath(path2, paint4);
        }
    }

    public final void d(Canvas canvas, m.d3 d3Var, Paint paint) {
        this.P = d3Var;
        l5 l5Var = this.J;
        if (l5Var != null) {
            l5Var.P = d3Var;
        }
        c(canvas, paint);
        this.P = null;
        l5 l5Var2 = this.J;
        if (l5Var2 != null) {
            l5Var2.P = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        l5 l5Var = this.J;
        if (l5Var != null) {
            l5Var.draw(canvas);
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
        boolean z13 = this.f22843q;
        int i20 = this.f22838l;
        RectF rectF = this.f22836j;
        if (z13) {
            if (!this.I && i20 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i14 - this.f22844r) + this.f22831b);
                path.lineTo(rect.left + i10, (i14 - this.f22844r) + this.f22831b);
            } else {
                if (this.f22847u) {
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
                path.lineTo(rect.left + i10, (i14 - this.f22844r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.f22844r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.f22844r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i10, rect.top + i10 + i19);
                int i24 = rect.left + i10;
                int i25 = rect.top + i10;
                int i26 = i19 * 2;
                rectF.set(i24, i25, i24 + i26, i25 + i26);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f22845s) {
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
                    path.lineTo(rect.right - i10, (i14 - this.f22844r) + this.f22831b);
                } else {
                    if (this.f22846t) {
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
                path.lineTo(rect.right - b(8.0f), (i14 - this.f22844r) + this.f22831b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i34 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i34) - b(9.0f), (rect.right - b(7.0f)) + i34, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i20 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.f22844r) + this.f22831b);
                path.lineTo(rect.right - i10, (i14 - this.f22844r) + this.f22831b);
            } else {
                if (this.f22847u) {
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
                path.lineTo(rect.right - i10, (i14 - this.f22844r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.f22844r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.f22844r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i10, rect.top + i10 + i19);
                int i38 = rect.right - i10;
                int i39 = i19 * 2;
                int i40 = rect.top + i10;
                rectF.set(i38 - i39, i40, i38, i40 + i39);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f22845s) {
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
                    path.lineTo(rect.left + i10, (i14 - this.f22844r) + this.f22831b);
                } else {
                    if (this.f22846t || this.f22847u) {
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
                path.lineTo(b(8.0f) + rect.left, (i14 - this.f22844r) + this.f22831b);
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
        int g7;
        int i11;
        boolean z10;
        int i12;
        int i13;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i14;
        int i15;
        Rect rect = this.f22841o;
        int i16 = this.Q;
        if (i16 == 0) {
            if (this.R > 0.0f) {
                i16 = 0;
            } else {
                i16 = b(SharedConfig.bubbleRadius);
            }
        }
        boolean z11 = this.f22845s;
        char c11 = 3;
        if (z11 && this.f22846t) {
            c10 = 3;
        } else if (z11) {
            c10 = 2;
        } else if (this.f22846t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        boolean z12 = this.f22839m;
        if (!z12 || !this.f22847u) {
            if (z12) {
                c11 = 1;
            } else if (this.f22847u) {
                c11 = 2;
            } else {
                c11 = 0;
            }
        }
        Integer num = this.f22848w;
        boolean z13 = this.f22843q;
        if (num != null) {
            g7 = num.intValue();
        } else if (z12) {
            if (z13) {
                i11 = y6.Ba;
            } else {
                i11 = y6.f23360dc;
            }
            g7 = g(i11);
        } else {
            if (z13) {
                i10 = y6.Aa;
            } else {
                i10 = y6.f23616ra;
            }
            g7 = g(i10);
        }
        if (this.f22849x && this.f22830a == null && !z12 && !this.L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i12 = y6.Ca;
        } else {
            i12 = y6.f23656ta;
        }
        int g10 = g(i12);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 != z10 || iArr4[c11][c10] != i16 || ((z10 && iArr3[c10] != g10) || iArr2[c11][c10] != g7)) {
            iArr4[c11][c10] = i16;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z10) {
                    iArr3[c10] = g10;
                    Paint paint = new Paint(1);
                    i13 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
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
                paint2.setColor(g7);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i14 = g7;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, yc.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i14).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.M = z10;
            iArr[c11][c10] = i14;
            return drawableArr[c11][c10];
        }
        i14 = g7;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.M = z10;
        iArr[c11][c10] = i14;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f22851z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f22850y, -1);
    }

    public int g(int i10) {
        if (this.f22838l == 2) {
            return y6.x0(null, i10, false);
        }
        u6 u6Var = this.f22842p;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return y6.x0(null, i10, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.f22838l == 2) {
            return y6.x0(null, i10, false);
        }
        u6 u6Var = this.f22842p;
        if (u6Var != null) {
            return u6Var.i(i10);
        }
        return y6.ul.get(i10);
    }

    public final uc0 i() {
        char c10;
        boolean z10 = this.v;
        uc0[] uc0VarArr = S;
        if (z10) {
            return uc0VarArr[2];
        }
        if (this.f22838l == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        return uc0VarArr[c10];
    }

    public final Drawable j() {
        char c10;
        int i10;
        int i11;
        if (this.L || (this.f22830a == null && !this.f22839m && this.J == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z10 = this.f22845s;
        boolean z11 = false;
        if (z10 && this.f22846t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else if (this.f22846t) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int[] iArr = this.f22850y;
        int i12 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i12 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.f22851z;
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
                drawableArr[c10] = new NinePatchDrawable(createBitmap, yc.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f22843q) {
            i10 = y6.Ca;
        } else {
            i10 = y6.f23656ta;
        }
        int g7 = g(i10);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != g7 || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(g7, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g7;
            }
        }
        return drawableArr[c10];
    }

    public final boolean k() {
        if (this.f22830a != null && y6.wl) {
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
        m.d3 d3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.Q;
        int i12 = this.f22838l;
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
        if (d3Var != null && bounds.height() < this.f22831b) {
            z10 = true;
            z11 = true;
        } else {
            if (i12 != 1 ? (this.f22844r + bounds.bottom) - i11 < this.f22831b : (this.f22844r + bounds.bottom) - (b12 * 2) < this.f22831b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 * 2) + this.f22844r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (d3Var != null) {
            path = (Path) d3Var.f17707c;
            z13 = d3Var.a(bounds, z10, z11);
        } else {
            path = this.f22840n;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l5.n(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.H;
        Paint paint = this.f22832c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.H = i10;
            paint.setAlpha(i10);
            if (this.f22843q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(y6.f23321bc))));
            }
        }
        if (this.f22830a == null) {
            Drawable f7 = f();
            if (f7.getAlpha() != i10) {
                f7.setAlpha(i10);
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        l5 l5Var = this.J;
        if (l5Var != null) {
            l5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
