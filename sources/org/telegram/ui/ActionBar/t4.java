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
import b8.ld;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.telegram.messenger.az;
import org.telegram.ui.Components.la0;
public class t4 extends Drawable {
    public static final la0[] T = new la0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public t4 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.b3 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader f28633a;
    public int f28634b;
    public int f28636e;
    public int f28637f;
    public int f28638g;
    public int h;
    public boolean f28639i;
    public final int f28642l;
    public final boolean f28643m;
    public e6 f28646p;
    public final boolean f28647q;
    public int f28648r;
    public boolean f28649s;
    public boolean f28650t;
    public boolean f28651u;
    public boolean v;
    public final Paint f28635c = new Paint(1);
    public final RectF f28640j = new RectF();
    public final Matrix f28641k = new Matrix();
    public final Rect f28645o = new Rect();
    public Integer f28652w = null;
    public boolean f28653x = true;
    public final int[] f28654y = {-1, -1, -1, -1};
    public final Bitmap[] f28655z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path f28644n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public t4(int i3, boolean z10, boolean z11, e6 e6Var) {
        this.f28646p = e6Var;
        this.f28647q = z10;
        this.f28642l = i3;
        this.f28643m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.f28633a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.f28641k;
            la0[] la0VarArr = T;
            char c2 = 0;
            int i3 = this.f28642l;
            char c10 = 2;
            if (z10 && (bitmap = this.N) != null) {
                if (i3 == 2) {
                    c2 = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / la0VarArr[c2].getBounds().width(), this.N.getHeight() / la0VarArr[c2].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (i3 == 2) {
                    c2 = 1;
                }
                c10 = c2;
            }
            Bitmap bitmap2 = la0VarArr[c10].f35658k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / la0VarArr[c10].getBounds().width(), bitmap2.getHeight() / la0VarArr[c10].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f10) {
        if (this.f28642l == 2) {
            return (int) Math.ceil(f10 * 3.0f);
        }
        return org.telegram.messenger.g0.L(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i3;
        Path path;
        boolean z10;
        t4 t4Var;
        Path path2;
        int h;
        Drawable g7;
        if (this.f28647q || !n() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.f28635c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.f28633a == null && this.Q == 0 && this.R <= 0.0f && (g7 = g()) != null) {
                g7.setBounds(bounds);
                g7.draw(canvas);
                return;
            }
            int b11 = b(2.0f);
            int i10 = this.Q;
            if (i10 != 0) {
                i3 = i10;
            } else {
                if (this.R > 0.0f) {
                    i10 = org.telegram.messenger.g0.W1(this.R, b(az.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, az.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.f28642l == 2) {
                    i10 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i10 = b(az.Y0);
                    b10 = b(Math.min(6, az.Y0));
                }
                i3 = b10;
            }
            int b12 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.f28633a != null) {
                Matrix matrix = this.f28641k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.f28648r);
                this.f28633a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i11 = this.f28634b;
            }
            m.b3 b3Var = this.P;
            boolean z11 = true;
            if (b3Var != null) {
                path = (Path) b3Var.f18547c;
                z10 = b3Var.b(bounds, true, true);
            } else {
                path = this.f28644n;
                z10 = true;
            }
            if (!z10 && this.Q == 0) {
                t4Var = this;
                path2 = path;
            } else {
                if (paint == null) {
                    z11 = false;
                }
                t4Var = this;
                int i12 = i10;
                path2 = path;
                t4Var.f(path2, bounds, b11, i12, b12, i3, max, true, true, z11);
            }
            canvas.drawPath(path2, paint2);
            if (t4Var.f28633a != null && t4Var.f28643m && paint == null) {
                int o10 = i0.a.o(h(k6.Pc), (int) ((Color.alpha(h) * t4Var.H) / 255.0f));
                Paint paint3 = t4Var.d;
                paint3.setColor(o10);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.b3 b3Var) {
        e(canvas, b3Var, null);
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

    public final void e(Canvas canvas, m.b3 b3Var, Paint paint) {
        this.P = b3Var;
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.P = b3Var;
        }
        c(canvas, paint);
        this.P = null;
        t4 t4Var2 = this.J;
        if (t4Var2 != null) {
            t4Var2.P = null;
        }
    }

    public final void f(Path path, Rect rect, int i3, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        int i14;
        int i15;
        int i16;
        int i17;
        path.rewind();
        int height = (rect.height() - i3) >> 1;
        int i18 = i10;
        if (i18 > height) {
            i18 = height;
        }
        boolean z13 = this.f28647q;
        int i19 = this.f28642l;
        RectF rectF = this.f28640j;
        if (z13) {
            if (!this.I && i19 != 2 && !z12 && !z10) {
                path.moveTo(rect.right - b(8.0f), (i13 - this.f28648r) + this.f28634b);
                path.lineTo(rect.left + i3, (i13 - this.f28648r) + this.f28634b);
            } else {
                if (this.f28651u) {
                    i16 = i12;
                } else {
                    i16 = i18;
                }
                if (i19 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i16, rect.bottom - i3);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i3);
                }
                path.lineTo(rect.left + i3 + i16, rect.bottom - i3);
                int i20 = rect.left + i3;
                int i21 = rect.bottom - i3;
                int i22 = i16 * 2;
                rectF.set(i20, i21 - i22, i20 + i22, i21);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            }
            if (!this.I && i19 != 2 && !z12 && !z11) {
                path.lineTo(rect.left + i3, (i13 - this.f28648r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.right - i3, (i13 - this.f28648r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.f28648r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i3, rect.top + i3 + i18);
                int i23 = rect.left + i3;
                int i24 = rect.top + i3;
                int i25 = i18 * 2;
                rectF.set(i23, i24, i23 + i25, i24 + i25);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.f28649s) {
                    i17 = i12;
                } else {
                    i17 = i18;
                }
                if (i19 == 1) {
                    path.lineTo((rect.right - i3) - i17, rect.top + i3);
                    int i26 = rect.right - i3;
                    int i27 = i17 * 2;
                    int i28 = rect.top + i3;
                    rectF.set(i26 - i27, i28, i26, i28 + i27);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i17, rect.top + i3);
                    int i29 = i17 * 2;
                    rectF.set((rect.right - b(8.0f)) - i29, rect.top + i3, rect.right - b(8.0f), rect.top + i3 + i29);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            }
            if (i19 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.right - i3, (i13 - this.f28648r) + this.f28634b);
                } else {
                    if (this.f28650t) {
                        i18 = i12;
                    }
                    path.lineTo(rect.right - i3, (rect.bottom - i3) - i18);
                    int i30 = rect.right - i3;
                    int i31 = i18 * 2;
                    int i32 = rect.bottom - i3;
                    rectF.set(i30 - i31, i32 - i31, i30, i32);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.I && i19 != 2 && !z12 && !z10) {
                path.lineTo(rect.right - b(8.0f), (i13 - this.f28648r) + this.f28634b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i3) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i3) - i33) - b(9.0f), (rect.right - b(7.0f)) + i33, (rect.bottom - i3) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!this.I && i19 != 2 && !z12 && !z10) {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.f28648r) + this.f28634b);
                path.lineTo(rect.right - i3, (i13 - this.f28648r) + this.f28634b);
            } else {
                if (this.f28651u) {
                    i14 = i12;
                } else {
                    i14 = i18;
                }
                if (i19 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i14, rect.bottom - i3);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i3);
                }
                path.lineTo((rect.right - i3) - i14, rect.bottom - i3);
                int i34 = rect.right - i3;
                int i35 = i14 * 2;
                int i36 = rect.bottom - i3;
                rectF.set(i34 - i35, i36 - i35, i34, i36);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            }
            if (!this.I && i19 != 2 && !z12 && !z11) {
                path.lineTo(rect.right - i3, (i13 - this.f28648r) - b(2.0f));
                if (i19 == 1) {
                    path.lineTo(rect.left + i3, (i13 - this.f28648r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.f28648r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i3, rect.top + i3 + i18);
                int i37 = rect.right - i3;
                int i38 = i18 * 2;
                int i39 = rect.top + i3;
                rectF.set(i37 - i38, i39, i37, i39 + i38);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.f28649s) {
                    i15 = i12;
                } else {
                    i15 = i18;
                }
                if (i19 == 1) {
                    path.lineTo(rect.left + i3 + i15, rect.top + i3);
                    int i40 = rect.left + i3;
                    int i41 = rect.top + i3;
                    int i42 = i15 * 2;
                    rectF.set(i40, i41, i40 + i42, i41 + i42);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i15, rect.top + i3);
                    int i43 = i15 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i3, b(8.0f) + rect.left + i43, rect.top + i3 + i43);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            }
            if (i19 == 1) {
                if (!z12 && !z10) {
                    path.lineTo(rect.left + i3, (i13 - this.f28648r) + this.f28634b);
                } else {
                    if (this.f28650t || this.f28651u) {
                        i18 = i12;
                    }
                    path.lineTo(rect.left + i3, (rect.bottom - i3) - i18);
                    int i44 = rect.left + i3;
                    int i45 = rect.bottom - i3;
                    int i46 = i18 * 2;
                    rectF.set(i44, i45 - i46, i44 + i46, i45);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.I && i19 != 2 && !z12 && !z10) {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.f28648r) + this.f28634b);
            } else {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i3) - i11) - b(3.0f));
                int b10 = b(7.0f) + rect.left;
                int i47 = i11 * 2;
                rectF.set(b10 - i47, ((rect.bottom - i3) - i47) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i3) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            }
        }
        path.close();
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.f28655z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.f28654y, -1);
    }

    public final Drawable g() {
        char c2;
        int i3;
        int h;
        int i10;
        boolean z10;
        int i11;
        int i12;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i13;
        int i14;
        Rect rect = this.f28645o;
        int i15 = this.Q;
        if (i15 == 0) {
            if (this.R > 0.0f) {
                i15 = 0;
            } else {
                i15 = b(az.Y0);
            }
        }
        boolean z11 = this.f28649s;
        char c10 = 3;
        if (z11 && this.f28650t) {
            c2 = 3;
        } else if (z11) {
            c2 = 2;
        } else if (this.f28650t) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        boolean z12 = this.f28643m;
        if (!z12 || !this.f28651u) {
            if (z12) {
                c10 = 1;
            } else if (this.f28651u) {
                c10 = 2;
            } else {
                c10 = 0;
            }
        }
        Integer num = this.f28652w;
        boolean z13 = this.f28647q;
        if (num != null) {
            h = num.intValue();
        } else if (z13 && n()) {
            h = i();
        } else if (z12) {
            if (z13) {
                i10 = k6.f28106pb;
            } else {
                i10 = k6.Rc;
            }
            h = h(i10);
        } else {
            if (z13) {
                i3 = k6.f28086ob;
            } else {
                i3 = k6.f28143ra;
            }
            h = h(i3);
        }
        if (this.f28653x && this.f28633a == null && !z12 && !this.L && !n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13) {
            i11 = k6.f28126qb;
        } else {
            i11 = k6.f28181ta;
        }
        int h7 = h(i11);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 == z10 && iArr4[c10][c2] == i15 && ((!z10 || iArr3[c2] == h7) && iArr2[c10][c2] == h)) {
            i12 = h;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c10][c2] = i15;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z10) {
                    iArr3[c2] = h7;
                    Paint paint = new Paint(1);
                    i13 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(h7, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.g0.f22607p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i14 = 0;
                    } else {
                        i14 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.g0.f22607p > 1.0f) {
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
                    drawableArr2[c10][c2] = new NinePatchDrawable(createBitmap, ld.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i12).array(), new Rect(), null);
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
        this.M = z10;
        iArr[c10][c2] = i12;
        return drawableArr[c10][c2];
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public int h(int i3) {
        if (this.f28642l == 2) {
            return k6.x0(null, i3, false);
        }
        e6 e6Var = this.f28646p;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return k6.x0(null, i3, false);
    }

    public final int i() {
        int h = h(k6.La);
        if (this.f28643m) {
            h = i0.a.o(h, Math.min(255, Color.alpha(h) * 2));
        }
        return i0.a.k(h, h(k6.f28200ua));
    }

    public int j(int i3) {
        if (this.f28642l == 2) {
            return k6.x0(null, i3, false);
        }
        e6 e6Var = this.f28646p;
        if (e6Var != null) {
            return e6Var.j(i3);
        }
        return k6.im.get(i3);
    }

    public final la0 k() {
        char c2;
        boolean z10 = this.v;
        la0[] la0VarArr = T;
        if (z10) {
            return la0VarArr[2];
        }
        if (this.f28642l == 2) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        return la0VarArr[c2];
    }

    public final Drawable l() {
        char c2;
        int i3;
        int i10;
        if (this.L || n() || (this.f28633a == null && !this.f28643m && this.J == null)) {
            return null;
        }
        int b10 = b(az.Y0);
        boolean z10 = this.f28649s;
        boolean z11 = false;
        if (z10 && this.f28650t) {
            c2 = 3;
        } else if (z10) {
            c2 = 2;
        } else if (this.f28650t) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        int[] iArr = this.f28654y;
        int i11 = iArr[c2];
        Drawable[] drawableArr = this.A;
        if (i11 != b10) {
            iArr[c2] = b10;
            Bitmap[] bitmapArr = this.f28655z;
            Bitmap bitmap = bitmapArr[c2];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (org.telegram.messenger.g0.f22607p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.g0.f22607p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                bitmapArr[c2] = createBitmap;
                drawableArr[c2] = new NinePatchDrawable(createBitmap, ld.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.f28647q) {
            i3 = k6.f28126qb;
        } else {
            i3 = k6.f28181ta;
        }
        int h = h(i3);
        Drawable drawable = drawableArr[c2];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c2] != h || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.MULTIPLY));
                iArr2[c2] = h;
            }
        }
        return drawableArr[c2];
    }

    public final boolean m() {
        if (this.f28633a != null && k6.km) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (k6.i1(this.f28646p) && this.f28642l != 2 && this.f28652w == null) {
            return true;
        }
        return false;
    }

    public final Path o() {
        int b10;
        int i3;
        boolean z10;
        boolean z11;
        Path path;
        m.b3 b3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.Q;
        int i11 = this.f28642l;
        if (i10 != 0) {
            i3 = i10;
        } else {
            if (this.R > 0.0f) {
                i10 = org.telegram.messenger.g0.W1(this.R, b(az.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, az.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(az.Y0);
                b10 = b(Math.min(6, az.Y0));
            }
            i3 = b10;
        }
        int b12 = b(6.0f);
        boolean z12 = false;
        int max = Math.max(bounds.top, 0);
        boolean z13 = true;
        if (b3Var != null && bounds.height() < this.f28634b) {
            z10 = true;
            z11 = true;
        } else {
            if (i11 != 1 ? (this.f28648r + bounds.bottom) - i10 < this.f28634b : (this.f28648r + bounds.bottom) - (b12 * 2) < this.f28634b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 * 2) + this.f28648r >= 0) {
                z12 = true;
            }
            z11 = z12;
        }
        if (b3Var != null) {
            path = (Path) b3Var.f18547c;
            z13 = b3Var.b(bounds, z10, z11);
        } else {
            path = this.f28644n;
        }
        if (!z13 && this.Q == 0) {
            return path;
        }
        boolean z14 = z10;
        Path path2 = path;
        f(path2, bounds, b11, i10, b12, i3, max, z14, z11, true);
        return path2;
    }

    public void p(int i3, int i10, int i11) {
        q(i3, i10, i11, i11, 0, 0, false, false);
    }

    public void q(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t4.q(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i3) {
        int i10 = this.H;
        Paint paint = this.f28635c;
        if (i10 != i3 || paint.getAlpha() != i3) {
            this.H = i3;
            paint.setAlpha(i3);
            if (this.f28647q) {
                this.d.setAlpha((int) ((i3 / 255.0f) * Color.alpha(h(k6.Pc))));
            }
        }
        if (this.f28633a == null) {
            Drawable g7 = g();
            if (g7.getAlpha() != i3) {
                g7.setAlpha(i3);
            }
        }
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.setBounds(i3, i10, i11, i12);
        }
    }

    @Override
    public final void setColorFilter(int i3, PorterDuff.Mode mode) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
