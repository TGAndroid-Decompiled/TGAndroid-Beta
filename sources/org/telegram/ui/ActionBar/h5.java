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
import k7.c8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fc0;
public class h5 extends Drawable {
    public static final fc0[] Q = new fc0[3];
    public NinePatchDrawable D;
    public int E;
    public boolean G;
    public h5 H;
    public float I;
    public boolean J;
    public boolean K;
    public Bitmap L;
    public BitmapShader M;
    public m.e3 N;
    public int O;
    public float P;
    public Shader f21421a;
    public int f21422b;
    public int f21424e;
    public int f21425f;
    public int f21426g;
    public int h;
    public boolean f21427i;
    public final int f21430l;
    public final boolean f21431m;
    public g6 f21434p;
    public final boolean f21435q;
    public int f21436r;
    public boolean f21437s;
    public boolean f21438t;
    public boolean f21439u;
    public boolean v;
    public final Paint f21423c = new Paint(1);
    public final RectF f21428j = new RectF();
    public final Matrix f21429k = new Matrix();
    public final Rect f21433o = new Rect();
    public final int[] f21440w = {-1, -1, -1, -1};
    public final Bitmap[] f21441x = new Bitmap[4];
    public final Drawable[] f21442y = new Drawable[4];
    public final int[] f21443z = {-1, -1, -1, -1};
    public final int[][] A = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] B = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f21432n = new Path();
    public final Paint d = new Paint(1);
    public int F = 255;

    public h5(int i10, boolean z4, boolean z10, g6 g6Var) {
        this.f21434p = g6Var;
        this.f21435q = z4;
        this.f21430l = i10;
        this.f21431m = z10;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f21421a instanceof BitmapShader) {
            boolean z4 = this.J;
            Matrix matrix = this.f21429k;
            fc0[] fc0VarArr = Q;
            char c3 = 0;
            int i10 = this.f21430l;
            char c10 = 2;
            if (z4 && (bitmap = this.L) != null) {
                if (i10 == 2) {
                    c3 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / fc0VarArr[c3].getBounds().width(), this.L.getHeight() / fc0VarArr[c3].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i10 == 2) {
                    c3 = 1;
                }
                c10 = c3;
            }
            Bitmap bitmap2 = fc0VarArr[c10].f26878k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / fc0VarArr[c10].getBounds().width(), bitmap2.getHeight() / fc0VarArr[c10].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f10) {
        if (this.f21430l == 2) {
            return (int) Math.ceil(f10 * 3.0f);
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i10;
        Paint paint2;
        Path path;
        boolean z4;
        h5 h5Var;
        Path path2;
        Drawable f10;
        Rect bounds = getBounds();
        if (paint == null && this.f21421a == null && this.O == 0 && this.P <= 0.0f && (f10 = f()) != null) {
            f10.setBounds(bounds);
            f10.draw(canvas);
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
            } else if (this.f21430l == 2) {
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
            paint2 = this.f21423c;
        } else {
            paint2 = paint;
        }
        if (paint == null && this.f21421a != null) {
            Matrix matrix = this.f21429k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.f21436r);
            this.f21421a.setLocalMatrix(matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.N != null) {
            bounds.height();
            int i12 = this.f21422b;
        }
        m.e3 e3Var = this.N;
        boolean z10 = true;
        if (e3Var != null) {
            path = (Path) e3Var.f13186c;
            z4 = e3Var.a(bounds, true, true);
        } else {
            path = this.f21432n;
            z4 = true;
        }
        if (!z4 && this.O == 0) {
            h5Var = this;
            path2 = path;
        } else {
            if (paint == null) {
                z10 = false;
            }
            h5Var = this;
            int i13 = i11;
            path2 = path;
            h5Var.e(path2, bounds, b11, i13, b12, i10, max, true, true, z10);
        }
        canvas.drawPath(path2, paint2);
        if (h5Var.f21421a != null && h5Var.f21431m && paint == null) {
            int g10 = g(k6.f21631bc);
            int k10 = i0.a.k(g10, (int) ((Color.alpha(g10) * h5Var.F) / 255.0f));
            Paint paint3 = h5Var.d;
            paint3.setColor(k10);
            canvas.drawPath(path2, paint3);
        }
    }

    public final void d(Canvas canvas, m.e3 e3Var, Paint paint) {
        this.N = e3Var;
        h5 h5Var = this.H;
        if (h5Var != null) {
            h5Var.N = e3Var;
        }
        c(canvas, paint);
        this.N = null;
        h5 h5Var2 = this.H;
        if (h5Var2 != null) {
            h5Var2.N = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        h5 h5Var = this.H;
        if (h5Var != null) {
            h5Var.draw(canvas);
            setAlpha((int) (this.I * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z4, boolean z10, boolean z11) {
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
        boolean z12 = this.f21435q;
        int i20 = this.f21430l;
        RectF rectF = this.f21428j;
        if (z12) {
            if (!this.G && i20 != 2 && !z11 && !z4) {
                path.moveTo(rect.right - b(8.0f), (i14 - this.f21436r) + this.f21422b);
                path.lineTo(rect.left + i10, (i14 - this.f21436r) + this.f21422b);
            } else {
                if (this.f21439u) {
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
            if (!this.G && i20 != 2 && !z11 && !z10) {
                path.lineTo(rect.left + i10, (i14 - this.f21436r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.f21436r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.f21436r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i10, rect.top + i10 + i19);
                int i24 = rect.left + i10;
                int i25 = rect.top + i10;
                int i26 = i19 * 2;
                rectF.set(i24, i25, i24 + i26, i25 + i26);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f21437s) {
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
                if (!z11 && !z4) {
                    path.lineTo(rect.right - i10, (i14 - this.f21436r) + this.f21422b);
                } else {
                    if (this.f21438t) {
                        i19 = i13;
                    }
                    path.lineTo(rect.right - i10, (rect.bottom - i10) - i19);
                    int i31 = rect.right - i10;
                    int i32 = i19 * 2;
                    int i33 = rect.bottom - i10;
                    rectF.set(i31 - i32, i33 - i32, i31, i33);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.G && i20 != 2 && !z11 && !z4) {
                path.lineTo(rect.right - b(8.0f), (i14 - this.f21436r) + this.f21422b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i34 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i34) - b(9.0f), (rect.right - b(7.0f)) + i34, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.G && i20 != 2 && !z11 && !z4) {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.f21436r) + this.f21422b);
                path.lineTo(rect.right - i10, (i14 - this.f21436r) + this.f21422b);
            } else {
                if (this.f21439u) {
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
            if (!this.G && i20 != 2 && !z11 && !z10) {
                path.lineTo(rect.right - i10, (i14 - this.f21436r) - b(2.0f));
                if (i20 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.f21436r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.f21436r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i10, rect.top + i10 + i19);
                int i38 = rect.right - i10;
                int i39 = i19 * 2;
                int i40 = rect.top + i10;
                rectF.set(i38 - i39, i40, i38, i40 + i39);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f21437s) {
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
                if (!z11 && !z4) {
                    path.lineTo(rect.left + i10, (i14 - this.f21436r) + this.f21422b);
                } else {
                    if (this.f21438t || this.f21439u) {
                        i19 = i13;
                    }
                    path.lineTo(rect.left + i10, (rect.bottom - i10) - i19);
                    int i45 = rect.left + i10;
                    int i46 = rect.bottom - i10;
                    int i47 = i19 * 2;
                    rectF.set(i45, i46 - i47, i45 + i47, i46);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.G && i20 != 2 && !z11 && !z4) {
                path.lineTo(b(8.0f) + rect.left, (i14 - this.f21436r) + this.f21422b);
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
        char c3;
        int i10;
        int g10;
        boolean z4;
        int i11;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i12;
        int i13;
        int i14;
        Rect rect = this.f21433o;
        int i15 = this.O;
        if (i15 == 0) {
            if (this.P > 0.0f) {
                i15 = 0;
            } else {
                i15 = b(SharedConfig.bubbleRadius);
            }
        }
        boolean z10 = this.f21437s;
        char c10 = 3;
        if (z10 && this.f21438t) {
            c3 = 3;
        } else if (z10) {
            c3 = 2;
        } else if (this.f21438t) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        boolean z11 = this.f21431m;
        if (!z11 || !this.f21439u) {
            if (z11) {
                c10 = 1;
            } else if (this.f21439u) {
                c10 = 2;
            } else {
                c10 = 0;
            }
        }
        boolean z12 = this.f21435q;
        if (z11) {
            if (z12) {
                i14 = k6.Ba;
            } else {
                i14 = k6.f21667dc;
            }
            g10 = g(i14);
        } else {
            if (z12) {
                i10 = k6.Aa;
            } else {
                i10 = k6.f21918ra;
            }
            g10 = g(i10);
        }
        if (this.f21421a == null && !z11 && !this.J) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z12) {
            i11 = k6.Ca;
        } else {
            i11 = k6.f21949ta;
        }
        int g11 = g(i11);
        boolean z13 = this.K;
        Drawable[][] drawableArr2 = this.B;
        int[][] iArr2 = this.C;
        int[] iArr3 = this.f21443z;
        int[][] iArr4 = this.A;
        if (z13 != z4 || iArr4[c10][c3] != i15 || ((z4 && iArr3[c3] != g11) || iArr2[c10][c3] != g10)) {
            iArr4[c10][c3] = i15;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z4) {
                    iArr3[c3] = g11;
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
                    drawableArr2[c10][c3] = new NinePatchDrawable(createBitmap, c8.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i12).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.K = z4;
            iArr[c10][c3] = i12;
            return drawableArr[c10][c3];
        }
        i12 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.K = z4;
        iArr[c10][c3] = i12;
        return drawableArr[c10][c3];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f21441x;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.f21442y, (Object) null);
        Arrays.fill(this.f21440w, -1);
    }

    public int g(int i10) {
        if (this.f21430l == 2) {
            return k6.w0(null, i10, false);
        }
        g6 g6Var = this.f21434p;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return k6.w0(null, i10, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.f21430l == 2) {
            return k6.w0(null, i10, false);
        }
        g6 g6Var = this.f21434p;
        if (g6Var != null) {
            return g6Var.Z0(i10);
        }
        return k6.rl.get(i10);
    }

    public final fc0 i() {
        char c3;
        boolean z4 = this.v;
        fc0[] fc0VarArr = Q;
        if (z4) {
            return fc0VarArr[2];
        }
        if (this.f21430l == 2) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        return fc0VarArr[c3];
    }

    public final Drawable j() {
        char c3;
        int i10;
        int i11;
        if (this.J || (this.f21421a == null && !this.f21431m && this.H == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z4 = this.f21437s;
        boolean z10 = false;
        if (z4 && this.f21438t) {
            c3 = 3;
        } else if (z4) {
            c3 = 2;
        } else if (this.f21438t) {
            c3 = 1;
        } else {
            c3 = 0;
        }
        int[] iArr = this.f21440w;
        int i12 = iArr[c3];
        Drawable[] drawableArr = this.f21442y;
        if (i12 != b10) {
            iArr[c3] = b10;
            Bitmap[] bitmapArr = this.f21441x;
            Bitmap bitmap = bitmapArr[c3];
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
                bitmapArr[c3] = createBitmap;
                drawableArr[c3] = new NinePatchDrawable(createBitmap, c8.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                z10 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f21435q) {
            i10 = k6.Ca;
        } else {
            i10 = k6.f21949ta;
        }
        int g10 = g(i10);
        Drawable drawable = drawableArr[c3];
        if (drawable != null) {
            int[] iArr2 = this.f21443z;
            if (iArr2[c3] != g10 || z10) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c3] = g10;
            }
        }
        return drawableArr[c3];
    }

    public final Drawable[] k() {
        return this.f21442y;
    }

    public final boolean l() {
        if (this.f21421a != null && k6.tl) {
            return true;
        }
        return false;
    }

    public final Path m() {
        int b10;
        int i10;
        boolean z4;
        boolean z10;
        Path path;
        m.e3 e3Var = this.N;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.O;
        int i12 = this.f21430l;
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
        boolean z11 = false;
        int max = Math.max(bounds.top, 0);
        boolean z12 = true;
        if (e3Var != null && bounds.height() < this.f21422b) {
            z4 = true;
            z10 = true;
        } else {
            if (i12 != 1 ? (this.f21436r + bounds.bottom) - i11 < this.f21422b : (this.f21436r + bounds.bottom) - (b12 * 2) < this.f21422b) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i11 * 2) + this.f21436r >= 0) {
                z11 = true;
            }
            z10 = z11;
        }
        if (e3Var != null) {
            path = (Path) e3Var.f13186c;
            z12 = e3Var.a(bounds, z4, z10);
        } else {
            path = this.f21432n;
        }
        if (!z12 && this.O == 0) {
            return path;
        }
        boolean z13 = z4;
        Path path2 = path;
        e(path2, bounds, b11, i11, b12, i10, max, z13, z10, true);
        return path2;
    }

    public void n(int i10, int i11, int i12) {
        o(i10, i11, i12, i12, 0, 0, false, false);
    }

    public void o(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h5.o(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.F;
        Paint paint = this.f21423c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.F = i10;
            paint.setAlpha(i10);
            if (this.f21435q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(k6.f21631bc))));
            }
        }
        if (this.f21421a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i10) {
                f10.setAlpha(i10);
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        h5 h5Var = this.H;
        if (h5Var != null) {
            h5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
