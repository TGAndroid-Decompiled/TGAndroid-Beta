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
import h7.l6;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nb0;

public class d5 extends Drawable {
    public static final nb0[] Q = new nb0[3];
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

    public c6 f22856p;

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
    public final Drawable[][] B = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};

    public final Path f22854n = new Path();
    public final Paint d = new Paint(1);
    public int F = 255;

    public d5(int i10, boolean z10, boolean z11, c6 c6Var) {
        this.f22856p = c6Var;
        this.f22857q = z10;
        this.f22852l = i10;
        this.f22853m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f22843a instanceof BitmapShader) {
            boolean z10 = this.J;
            Matrix matrix = this.f22851k;
            nb0[] nb0VarArr = Q;
            int i10 = this.f22852l;
            char c10 = 2;
            if (z10 && (bitmap = this.L) != null) {
                char c11 = i10 == 2 ? (char) 1 : (char) 0;
                float fMin = 1.0f / Math.min(bitmap.getWidth() / nb0VarArr[c11].getBounds().width(), this.L.getHeight() / nb0VarArr[c11].getBounds().height());
                matrix.postScale(fMin, fMin);
            } else {
                if (!this.v) {
                    c10 = i10 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = nb0VarArr[c10].f30929k;
                float fMin2 = 1.0f / Math.min(bitmap2.getWidth() / nb0VarArr[c10].getBounds().width(), bitmap2.getHeight() / nb0VarArr[c10].getBounds().height());
                matrix.postScale(fMin2, fMin2);
            }
        }
    }

    public final int b(float f10) {
        return this.f22852l == 2 ? (int) Math.ceil(f10 * 3.0f) : AndroidUtilities.dp(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int iB;
        int i10;
        Path path;
        boolean zA;
        d5 d5Var;
        Path path2;
        Drawable drawableF;
        Rect bounds = getBounds();
        if (paint == null && this.f22843a == null && this.O == 0 && this.P <= 0.0f && (drawableF = f()) != null) {
            drawableF.setBounds(bounds);
            drawableF.draw(canvas);
            return;
        }
        int iB2 = b(2.0f);
        int iB3 = this.O;
        if (iB3 != 0) {
            i10 = iB3;
        } else {
            if (this.P > 0.0f) {
                iB3 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                iB = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (this.f22852l == 2) {
                iB3 = b(6.0f);
                iB = b(6.0f);
            } else {
                iB3 = b(SharedConfig.bubbleRadius);
                iB = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i10 = iB;
        }
        int iB4 = b(6.0f);
        Paint paint2 = paint == null ? this.f22845c : paint;
        if (paint == null && this.f22843a != null) {
            Matrix matrix = this.f22851k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.f22858r);
            this.f22843a.setLocalMatrix(matrix);
        }
        int iMax = Math.max(bounds.top, 0);
        if (this.N != null) {
            bounds.height();
            int i11 = this.f22844b;
        }
        m.f3 f3Var = this.N;
        if (f3Var != null) {
            path = (Path) f3Var.f17321c;
            zA = f3Var.a(bounds, true, true);
        } else {
            path = this.f22854n;
            zA = true;
        }
        if (zA || this.O != 0) {
            d5Var = this;
            int i12 = iB3;
            path2 = path;
            d5Var.e(path2, bounds, iB2, i12, iB4, i10, iMax, true, true, paint != null);
        } else {
            d5Var = this;
            path2 = path;
        }
        canvas.drawPath(path2, paint2);
        if (d5Var.f22843a != null && d5Var.f22853m && paint == null) {
            int iG = g(g6.f23023bc);
            int iK = i0.b.k(iG, (int) ((Color.alpha(iG) * d5Var.F) / 255.0f));
            Paint paint3 = d5Var.d;
            paint3.setColor(iK);
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
        if (d5Var == null) {
            c(canvas, null);
            return;
        }
        d5Var.draw(canvas);
        setAlpha((int) (this.I * 255.0f));
        c(canvas, null);
        setAlpha(255);
    }

    public final void e(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12) {
        path.rewind();
        int iHeight = (rect.height() - i10) >> 1;
        int i15 = i11;
        if (i15 > iHeight) {
            i15 = iHeight;
        }
        boolean z13 = this.f22857q;
        int i16 = this.f22852l;
        RectF rectF = this.f22850j;
        if (z13) {
            if (this.G || i16 == 2 || z12 || z10) {
                int i17 = this.f22861u ? i13 : i15;
                if (i16 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i17, rect.bottom - i10);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i10);
                }
                path.lineTo(rect.left + i10 + i17, rect.bottom - i10);
                int i18 = rect.left + i10;
                int i19 = rect.bottom - i10;
                int i20 = i17 * 2;
                rectF.set(i18, i19 - i20, i18 + i20, i19);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - b(8.0f), (i14 - this.f22858r) + this.f22844b);
                path.lineTo(rect.left + i10, (i14 - this.f22858r) + this.f22844b);
            }
            if (this.G || i16 == 2 || z12 || z11) {
                path.lineTo(rect.left + i10, rect.top + i10 + i15);
                int i21 = rect.left + i10;
                int i22 = rect.top + i10;
                int i23 = i15 * 2;
                rectF.set(i21, i22, i21 + i23, i22 + i23);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i24 = this.f22859s ? i13 : i15;
                if (i16 == 1) {
                    path.lineTo((rect.right - i10) - i24, rect.top + i10);
                    int i25 = rect.right - i10;
                    int i26 = i24 * 2;
                    int i27 = rect.top + i10;
                    rectF.set(i25 - i26, i27, i25, i27 + i26);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i24, rect.top + i10);
                    int i28 = i24 * 2;
                    rectF.set((rect.right - b(8.0f)) - i28, rect.top + i10, rect.right - b(8.0f), rect.top + i10 + i28);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i10, (i14 - this.f22858r) - b(2.0f));
                if (i16 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.f22858r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.f22858r) - b(2.0f));
                }
            }
            if (i16 == 1) {
                if (z12 || z10) {
                    if (this.f22860t) {
                        i15 = i13;
                    }
                    path.lineTo(rect.right - i10, (rect.bottom - i10) - i15);
                    int i29 = rect.right - i10;
                    int i30 = i15 * 2;
                    int i31 = rect.bottom - i10;
                    rectF.set(i29 - i30, i31 - i30, i29, i31);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i10, (i14 - this.f22858r) + this.f22844b);
                }
            } else if (this.G || i16 == 2 || z12 || z10) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i32 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i32) - b(9.0f), (rect.right - b(7.0f)) + i32, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i14 - this.f22858r) + this.f22844b);
            }
        } else {
            if (this.G || i16 == 2 || z12 || z10) {
                int i33 = this.f22861u ? i13 : i15;
                if (i16 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i33, rect.bottom - i10);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i10);
                }
                path.lineTo((rect.right - i10) - i33, rect.bottom - i10);
                int i34 = rect.right - i10;
                int i35 = i33 * 2;
                int i36 = rect.bottom - i10;
                rectF.set(i34 - i35, i36 - i35, i34, i36);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.f22858r) + this.f22844b);
                path.lineTo(rect.right - i10, (i14 - this.f22858r) + this.f22844b);
            }
            if (this.G || i16 == 2 || z12 || z11) {
                path.lineTo(rect.right - i10, rect.top + i10 + i15);
                int i37 = rect.right - i10;
                int i38 = i15 * 2;
                int i39 = rect.top + i10;
                rectF.set(i37 - i38, i39, i37, i39 + i38);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i40 = this.f22859s ? i13 : i15;
                if (i16 == 1) {
                    path.lineTo(rect.left + i10 + i40, rect.top + i10);
                    int i41 = rect.left + i10;
                    int i42 = rect.top + i10;
                    int i43 = i40 * 2;
                    rectF.set(i41, i42, i41 + i43, i42 + i43);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i40, rect.top + i10);
                    int i44 = i40 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i10, b(8.0f) + rect.left + i44, rect.top + i10 + i44);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i10, (i14 - this.f22858r) - b(2.0f));
                if (i16 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.f22858r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.f22858r) - b(2.0f));
                }
            }
            if (i16 == 1) {
                if (z12 || z10) {
                    if (this.f22860t || this.f22861u) {
                        i15 = i13;
                    }
                    path.lineTo(rect.left + i10, (rect.bottom - i10) - i15);
                    int i45 = rect.left + i10;
                    int i46 = rect.bottom - i10;
                    int i47 = i15 * 2;
                    rectF.set(i45, i46 - i47, i45 + i47, i46);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i10, (i14 - this.f22858r) + this.f22844b);
                }
            } else if (this.G || i16 == 2 || z12 || z10) {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i10) - i12) - b(3.0f));
                int i48 = i12 * 2;
                rectF.set((b(7.0f) + rect.left) - i48, ((rect.bottom - i10) - i48) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(b(8.0f) + rect.left, (i14 - this.f22858r) + this.f22844b);
            }
        }
        path.close();
    }

    public final Drawable f() {
        char c10;
        int iG;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i10;
        int i11;
        Rect rect = this.f22855o;
        int iB = this.O;
        if (iB == 0) {
            iB = this.P > 0.0f ? 0 : b(SharedConfig.bubbleRadius);
        }
        boolean z10 = this.f22859s;
        char c11 = 3;
        if (z10 && this.f22860t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else {
            c10 = this.f22860t ? (char) 1 : (char) 0;
        }
        boolean z11 = this.f22853m;
        if (!z11 || !this.f22861u) {
            if (z11) {
                c11 = 1;
            } else {
                c11 = this.f22861u ? (char) 2 : (char) 0;
            }
        }
        boolean z12 = this.f22857q;
        if (z11) {
            iG = g(z12 ? g6.Ba : g6.f23059dc);
        } else {
            iG = g(z12 ? g6.Aa : g6.f23305ra);
        }
        boolean z13 = (this.f22843a != null || z11 || this.J) ? false : true;
        int iG2 = g(z12 ? g6.Ca : g6.f23343ta);
        boolean z14 = this.K;
        Drawable[][] drawableArr2 = this.B;
        int[][] iArr2 = this.C;
        int[] iArr3 = this.f22865z;
        int[][] iArr4 = this.A;
        if (z14 == z13 && iArr4[c11][c10] == iB && ((!z13 || iArr3[c10] == iG2) && iArr2[c11][c10] == iG)) {
            i10 = iG;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c11][c10] = iB;
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                rect.set(getBounds());
                if (z13) {
                    iArr3[c10] = iG2;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(iG2, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, bitmapCreateBitmap.getWidth() + 1, bitmapCreateBitmap.getHeight() + 1);
                        i11 = 0;
                    } else {
                        i11 = 0;
                        setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i11);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i11);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                        c(canvas, paint);
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(iG);
                setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i10 = iG;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(bitmapCreateBitmap, l6.c((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i10 = iG;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
        }
        this.K = z13;
        iArr[c11][c10] = i10;
        return drawableArr[c11][c10];
    }

    public final void finalize() throws Throwable {
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

    public int g(int i10) {
        if (this.f22852l == 2) {
            return g6.w0(null, i10, false);
        }
        c6 c6Var = this.f22856p;
        return c6Var != null ? c6Var.N0(i10) : g6.w0(null, i10, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.f22852l == 2) {
            return g6.w0(null, i10, false);
        }
        c6 c6Var = this.f22856p;
        return c6Var != null ? c6Var.o1(i10) : g6.rl.get(i10);
    }

    public final nb0 i() {
        boolean z10 = this.v;
        nb0[] nb0VarArr = Q;
        if (z10) {
            return nb0VarArr[2];
        }
        return nb0VarArr[this.f22852l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable j() {
        char c10;
        int i10;
        if (this.J || (this.f22843a == null && !this.f22853m && this.H == null)) {
            return null;
        }
        int iB = b(SharedConfig.bubbleRadius);
        boolean z10 = this.f22859s;
        boolean z11 = false;
        if (z10 && this.f22860t) {
            c10 = 3;
        } else if (z10) {
            c10 = 2;
        } else {
            c10 = this.f22860t ? (char) 1 : (char) 0;
        }
        int[] iArr = this.f22862w;
        int i11 = iArr[c10];
        Drawable[] drawableArr = this.f22864y;
        if (i11 != iB) {
            iArr[c10] = iB;
            Bitmap[] bitmapArr = this.f22863x;
            Bitmap bitmap = bitmapArr[c10];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (AndroidUtilities.density > 1.0f) {
                    setBounds(-1, -1, bitmapCreateBitmap.getWidth() + 1, bitmapCreateBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                }
                c(canvas, paint);
                if (AndroidUtilities.density > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    c(canvas, paint);
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                bitmapArr[c10] = bitmapCreateBitmap;
                drawableArr[c10] = new NinePatchDrawable(bitmapCreateBitmap, l6.c((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        int iG = g(this.f22857q ? g6.Ca : g6.f23343ta);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.f22865z;
            if (iArr2[c10] != iG || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(iG, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = iG;
            }
        }
        return drawableArr[c10];
    }

    public final Drawable[] k() {
        return this.f22864y;
    }

    public final boolean l() {
        return this.f22843a != null && g6.tl;
    }

    public final Path m() {
        int iB;
        int i10;
        boolean z10;
        boolean z11;
        Path path;
        m.f3 f3Var = this.N;
        Rect bounds = getBounds();
        int iB2 = b(2.0f);
        int iB3 = this.O;
        int i11 = this.f22852l;
        if (iB3 != 0) {
            i10 = iB3;
        } else {
            if (this.P > 0.0f) {
                iB3 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                iB = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (i11 == 2) {
                iB3 = b(6.0f);
                iB = b(6.0f);
            } else {
                iB3 = b(SharedConfig.bubbleRadius);
                iB = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i10 = iB;
        }
        int iB4 = b(6.0f);
        int iMax = Math.max(bounds.top, 0);
        boolean zA = true;
        if (f3Var == null || bounds.height() >= this.f22844b) {
            z10 = i11 != 1 ? (this.f22858r + bounds.bottom) - iB3 < this.f22844b : (this.f22858r + bounds.bottom) - (iB4 * 2) < this.f22844b;
            z11 = (iB3 * 2) + this.f22858r >= 0;
        } else {
            z10 = true;
            z11 = true;
        }
        if (f3Var != null) {
            path = (Path) f3Var.f17321c;
            zA = f3Var.a(bounds, z10, z11);
        } else {
            path = this.f22854n;
        }
        if (!zA && this.O == 0) {
            return path;
        }
        boolean z12 = z10;
        Path path2 = path;
        e(path2, bounds, iB2, iB3, iB4, i10, iMax, z12, z11, true);
        return path2;
    }

    public void n(int i10, int i11, int i12) {
        o(i10, i11, i12, i12, 0, 0, false, false);
    }

    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        int i16;
        int i17;
        int iG;
        int iH;
        int iH2;
        int iH3;
        boolean z12;
        int i18;
        char c10;
        boolean z13;
        nb0[] nb0VarArr;
        char c11;
        Paint paint;
        int i19;
        char c12;
        d5 d5Var = this.H;
        if (d5Var != null) {
            i16 = i12;
            i17 = i14;
            d5Var.o(i10, i11, i16, i13, i17, i15, z10, z11);
        } else {
            i16 = i12;
            i17 = i14;
        }
        boolean z14 = this.f22857q;
        boolean z15 = this.f22853m;
        if (z14) {
            iG = g(z15 ? g6.Ba : g6.Aa);
            iH = h(g6.Da);
            iH2 = h(g6.Ea);
            iH3 = h(g6.Fa);
            boolean z16 = h(g6.f23004ac) != 0;
            if (iH != 0) {
                iG = g(g6.Aa);
            }
            z12 = this.v;
            i18 = this.f22852l;
            if (z12) {
                c10 = 2;
            } else if (i18 == 2) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            z13 = this.J;
            nb0VarArr = Q;
            if (z13 && iH2 != 0 && z16) {
                c11 = 3;
                nb0 nb0Var = nb0VarArr[c10];
                if (nb0Var != null) {
                    int[] iArr = nb0Var.f30917a;
                    this.f22846e = iArr[0];
                    this.f22847f = iArr[1];
                    this.f22848g = iArr[2];
                    this.h = iArr[3];
                }
                paint = this.f22845c;
                if (!z13 && iH2 != 0 && z16) {
                    if (i16 != this.f22844b || this.M == null || this.f22846e != iG || this.f22847f != iH || this.f22848g != iH2 || this.h != iH3 || this.f22849i != z16) {
                        if (this.L == null) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                            this.L = bitmapCreateBitmap;
                            bitmapCreateBitmap.setHasAlpha(false);
                            Bitmap bitmap = this.L;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            this.M = new BitmapShader(bitmap, tileMode, tileMode);
                        }
                        if (nb0VarArr[c10] == null) {
                            nb0 nb0Var2 = new nb0();
                            nb0VarArr[c10] = nb0Var2;
                            if (i18 != 2) {
                                c12 = 1;
                                nb0Var2.f30938t = true;
                            } else {
                                c12 = 1;
                            }
                            nb0Var2.w(b(1.0f));
                        } else {
                            c12 = 1;
                        }
                        nb0 nb0Var3 = nb0VarArr[c10];
                        Bitmap bitmap2 = this.L;
                        int[] iArr2 = nb0Var3.f30917a;
                        iArr2[0] = iG;
                        iArr2[c12] = iH;
                        iArr2[2] = iH2;
                        iArr2[c11] = iH3;
                        Utilities.generateGradient(bitmap2, nb0Var3.f30927i, nb0Var3.f30924e.getInterpolation(nb0Var3.h), iArr2);
                        this.M.setLocalMatrix(this.f22851k);
                    }
                    BitmapShader bitmapShader = this.M;
                    this.f22843a = bitmapShader;
                    paint.setShader(bitmapShader);
                    paint.setColor(-1);
                    this.f22846e = iG;
                    this.f22849i = z16;
                    this.f22847f = iH;
                    this.f22848g = iH2;
                    this.h = iH3;
                } else if (iH == 0 && (this.f22843a == null || i16 != this.f22844b || this.f22846e != iG || this.f22847f != iH || this.f22848g != iH2 || this.h != iH3 || this.f22849i != z16)) {
                    if (iH2 != 0 && z16) {
                        if (nb0VarArr[c10] == null) {
                            nb0 nb0Var4 = new nb0();
                            nb0VarArr[c10] = nb0Var4;
                            if (i18 != 2) {
                                nb0Var4.f30938t = true;
                            }
                            nb0Var4.w(b(1.0f));
                        }
                        nb0VarArr[c10].n(iG, iH, iH2, iH3);
                        this.f22843a = nb0VarArr[c10].v;
                    } else if (iH2 == 0) {
                        this.f22843a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{iH, iG}, (float[]) null, Shader.TileMode.CLAMP);
                    } else if (iH3 != 0) {
                        this.f22843a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{iH3, iH2, iH, iG}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        this.f22843a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{iH2, iH, iG}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                    paint.setShader(this.f22843a);
                    this.f22846e = iG;
                    this.f22849i = z16;
                    this.f22847f = iH;
                    this.f22848g = iH2;
                    this.h = iH3;
                    paint.setColor(-1);
                } else if (iH == 0) {
                    if (this.f22843a != null) {
                        this.f22843a = null;
                        paint.setShader(null);
                    }
                    paint.setColor(iG);
                }
                if (this.f22843a instanceof BitmapShader) {
                    i19 = 0;
                    nb0VarArr[c10].setBounds(0, i17, i11, i16 - i13);
                } else {
                    i19 = 0;
                }
                this.f22844b = i16;
                if (this.f22843a instanceof BitmapShader) {
                    i19 = i13;
                }
                this.f22858r = i10 - i19;
                this.f22859s = z10;
                this.f22860t = z11;
            }
            c11 = 3;
            paint = this.f22845c;
            if (!z13) {
                if (iH == 0) {
                    if (iH == 0) {
                        if (this.f22843a != null) {
                            this.f22843a = null;
                            paint.setShader(null);
                        }
                        paint.setColor(iG);
                    }
                } else if (iH == 0) {
                    if (this.f22843a != null) {
                        this.f22843a = null;
                        paint.setShader(null);
                    }
                    paint.setColor(iG);
                }
            } else if (iH == 0) {
                if (iH == 0) {
                    if (this.f22843a != null) {
                        this.f22843a = null;
                        paint.setShader(null);
                    }
                    paint.setColor(iG);
                }
            } else if (iH == 0) {
                if (this.f22843a != null) {
                    this.f22843a = null;
                    paint.setShader(null);
                }
                paint.setColor(iG);
            }
            if (this.f22843a instanceof BitmapShader) {
                i19 = 0;
                nb0VarArr[c10].setBounds(0, i17, i11, i16 - i13);
            } else {
                i19 = 0;
            }
            this.f22844b = i16;
            if (this.f22843a instanceof BitmapShader) {
                i19 = i13;
            }
            this.f22858r = i10 - i19;
            this.f22859s = z10;
            this.f22860t = z11;
        }
        iG = g(z15 ? g6.f23059dc : g6.f23305ra);
        iH = 0;
        iH2 = 0;
        iH3 = 0;
        if (iH != 0) {
            iG = g(g6.Aa);
        }
        z12 = this.v;
        i18 = this.f22852l;
        if (z12) {
            c10 = 2;
        } else if (i18 == 2) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        z13 = this.J;
        nb0VarArr = Q;
        if (z13) {
            c11 = 3;
        } else {
            c11 = 3;
        }
        paint = this.f22845c;
        if (!z13) {
            if (iH == 0) {
                if (iH == 0) {
                    if (this.f22843a != null) {
                        this.f22843a = null;
                        paint.setShader(null);
                    }
                    paint.setColor(iG);
                }
            } else if (iH == 0) {
                if (this.f22843a != null) {
                    this.f22843a = null;
                    paint.setShader(null);
                }
                paint.setColor(iG);
            }
        } else if (iH == 0) {
            if (iH == 0) {
                if (this.f22843a != null) {
                    this.f22843a = null;
                    paint.setShader(null);
                }
                paint.setColor(iG);
            }
        } else if (iH == 0) {
            if (this.f22843a != null) {
                this.f22843a = null;
                paint.setShader(null);
            }
            paint.setColor(iG);
        }
        if (this.f22843a instanceof BitmapShader) {
            i19 = 0;
            nb0VarArr[c10].setBounds(0, i17, i11, i16 - i13);
        } else {
            i19 = 0;
        }
        this.f22844b = i16;
        if (this.f22843a instanceof BitmapShader) {
            i19 = i13;
        }
        this.f22858r = i10 - i19;
        this.f22859s = z10;
        this.f22860t = z11;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.F;
        Paint paint = this.f22845c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.F = i10;
            paint.setAlpha(i10);
            if (this.f22857q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(g6.f23023bc))));
            }
        }
        if (this.f22843a == null) {
            Drawable drawableF = f();
            if (drawableF.getAlpha() != i10) {
                drawableF.setAlpha(i10);
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        d5 d5Var = this.H;
        if (d5Var != null) {
            d5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
