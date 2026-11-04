package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class p9 extends u4.n0 implements fh.a {
    public final Rect E;
    public final RectF F;
    public Bitmap G;
    public float[] H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public rj0 M;
    public float[] N;
    public int[] O;
    public short[] P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float[] W;
    public float[] X;
    public short[] Y;
    public int Z;
    public final tj0 f37087a;
    public int f37088a0;
    public final org.telegram.messenger.v10 f37089b;
    public boolean f37090b0;
    public final org.telegram.messenger.v10 f37091c;
    public float[] f37092c0;
    public final org.telegram.messenger.s10 d;
    public int f37093d0;
    public final int f37094e;
    public float[] f37095e0;
    public final float f37096f;
    public int f37097f0;
    public final boolean h;
    public final Paint f37098n = new Paint(3);
    public final Paint f37099r = new Paint(3);
    public final Paint f37100s = new Paint();
    public final Paint f37101w = new Paint();
    public final Paint f37102x;
    public final RectF f37103y;

    public p9(tj0 tj0Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.v10 v10Var2, int i3, float f10, zw zwVar, boolean z10, boolean z11, rj0 rj0Var) {
        Paint paint = new Paint();
        this.f37102x = paint;
        this.f37103y = new RectF();
        this.E = new Rect();
        this.F = new RectF();
        this.H = new float[32];
        this.K = -1.0f;
        this.N = new float[128];
        this.O = new int[64];
        this.P = new short[96];
        this.W = new float[128];
        this.X = new float[128];
        this.Y = new short[96];
        this.f37092c0 = new float[48];
        this.f37095e0 = new float[32];
        this.f37087a = tj0Var;
        this.f37089b = v10Var;
        this.f37091c = v10Var2;
        this.f37094e = i3;
        this.f37096f = f10;
        this.d = zwVar;
        this.h = z10;
        this.L = z11;
        this.M = rj0Var;
        paint.setColor(-1);
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        aVar.f9978a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.V = true;
            p(canvas);
        } finally {
            this.V = false;
            canvas.restore();
        }
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int b10;
        int L;
        if (u(view)) {
            int i3 = this.f37094e;
            rect.right = i3;
            rect.left = i3;
            u4.d1 T = recyclerView.T(view);
            u4.h0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                if (b10 == 0) {
                    if (this.h) {
                        L = i3;
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (b10 == adapter.b() - 1) {
                    rect.bottom = i3;
                }
            }
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        tj0 tj0Var = this.f37087a;
        if (recyclerView == tj0Var) {
            int sectionsBackgroundColorForDecoration = tj0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.f37100s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                this.G = null;
                this.K = -1.0f;
            }
            if (!this.L) {
                p(canvas);
                return;
            }
            int ordinal = this.M.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        m(canvas, 1.0f);
                        p(canvas);
                        return;
                    }
                    this.Q = 0;
                    this.R = 0;
                    this.S = 0;
                    this.T = true;
                    m(canvas, 0.0f);
                    p(canvas);
                    this.T = false;
                    int i3 = this.Q;
                    if (i3 == 0) {
                        return;
                    }
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i3, this.N, 0, null, 0, this.O, 0, this.P, 0, this.S, this.f37102x);
                    return;
                }
                int r5 = r(1.0f);
                Paint paint2 = this.f37101w;
                paint2.setColor(r5);
                canvas.drawRect(0.0f, 0.0f, tj0Var.getWidth(), tj0Var.getHeight(), paint2);
                m(canvas, 0.0f);
                this.U = true;
                p(canvas);
                this.U = false;
                return;
            }
            canvas.drawRect(0.0f, 0.0f, tj0Var.getWidth(), tj0Var.getHeight(), paint);
            p(canvas);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i3;
        p9 p9Var = this;
        tj0 tj0Var = p9Var.f37087a;
        if (recyclerView == tj0Var) {
            float f10 = p9Var.f37096f;
            if (f10 > 0.0f) {
                int sectionsBackgroundColorForDecoration = tj0Var.getSectionsBackgroundColorForDecoration();
                Paint paint = p9Var.f37100s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    p9Var.G = null;
                    p9Var.K = -1.0f;
                }
                boolean z10 = true;
                int max = Math.max(1, (int) Math.ceil(f10));
                Bitmap bitmap = p9Var.G;
                Paint paint2 = p9Var.f37099r;
                if (bitmap == null || p9Var.J != max || p9Var.K != f10) {
                    p9Var.J = max;
                    p9Var.K = f10;
                    int i10 = max * 2;
                    p9Var.G = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(p9Var.G);
                    canvas3.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f11 = max;
                    canvas3.drawCircle(f11, f11, f10, paint3);
                    Bitmap bitmap2 = p9Var.G;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                z10 = (p9Var.L && p9Var.M == rj0.f37742b) ? false : false;
                p9Var.f37090b0 = z10;
                if (z10) {
                    p9Var.Z = 0;
                    p9Var.f37088a0 = 0;
                }
                if (tj0Var.b0()) {
                    int paddingLeft = tj0Var.getPaddingLeft();
                    int i11 = p9Var.f37094e;
                    float f12 = paddingLeft + i11;
                    float width = (tj0Var.getWidth() - tj0Var.getPaddingRight()) - i11;
                    float f13 = f10 * 0.2f;
                    for (int i12 = 0; i12 < p9Var.f37097f0; i12 += 4) {
                        float[] fArr = p9Var.f37095e0;
                        float f14 = fArr[i12];
                        float f15 = fArr[i12 + 1];
                        float f16 = fArr[i12 + 2];
                        float f17 = fArr[i12 + 3];
                        int i13 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                        if (i13 > 0 && i12 > 0) {
                            f16 = Math.min(f16, Math.max(0.0f, Math.min(1.0f, (f14 - fArr[i12 - 3]) / f13)));
                        }
                        if (i13 > 0 && (i3 = i12 + 4) < p9Var.f37097f0) {
                            f17 = Math.min(f17, Math.max(0.0f, Math.min(1.0f, (p9Var.f37095e0[i3] - f15) / f13)));
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 < tj0Var.getChildCount()) {
                                View childAt = tj0Var.getChildAt(i14);
                                if (tj0.a1(childAt) && Math.abs(tj0.v1(childAt) - f14) < 1.0f) {
                                    canvas2 = canvas;
                                    break;
                                }
                                i14++;
                            } else {
                                canvas2 = canvas;
                                p9Var.q(canvas2, f12, width, f14, f16);
                                p9Var = this;
                                break;
                            }
                        }
                        p9Var.k(canvas2, f12, width, f15, f17);
                    }
                } else {
                    int i15 = 0;
                    while (i15 < tj0Var.getChildCount()) {
                        View childAt2 = tj0Var.getChildAt(i15);
                        u4.d1 T = tj0Var.T(childAt2);
                        int R = RecyclerView.R(childAt2);
                        if (childAt2 != tj0Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && p9Var.u(childAt2) && !tj0Var.h1(R))) {
                            float x10 = childAt2.getX();
                            float width2 = x10 + childAt2.getWidth();
                            if (!p9Var.v(R - 1) && !tj0.a1(childAt2)) {
                                p9Var.q(canvas, x10, width2, tj0.v1(childAt2), 1.0f);
                            }
                            if (!p9Var.v(R + 1)) {
                                p9Var.k(canvas, x10, width2, tj0.G0(childAt2), 1.0f);
                            }
                        }
                        i15++;
                        p9Var = this;
                    }
                }
                if (tj0Var.L2 != null) {
                    for (int i16 = 0; i16 < tj0Var.L2.size(); i16++) {
                        long longValue = ((Long) tj0Var.L2.get(i16)).longValue();
                        Typeface typeface = org.telegram.messenger.g0.f22580a;
                        View T0 = tj0Var.T0((int) (longValue >> 32));
                        View T02 = tj0Var.T0((int) longValue);
                        if (T0 != null && !tj0.a1(T0)) {
                            q(canvas, T0.getX(), T0.getWidth() + T0.getX(), tj0.v1(T0), 1.0f);
                        }
                        if (T02 != null) {
                            k(canvas, T02.getX(), T02.getX() + T02.getWidth(), tj0.G0(T02), 1.0f);
                        }
                    }
                }
                if (this.f37090b0) {
                    this.f37090b0 = false;
                    int i17 = this.Z;
                    if (i17 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i17, this.W, 0, this.X, 0, null, 0, this.Y, 0, this.f37088a0, paint2);
                    }
                }
            }
        }
    }

    public final void h(float f10, float f11) {
        if (f11 <= f10) {
            return;
        }
        int i3 = this.I;
        int i10 = i3 + 2;
        float[] fArr = this.H;
        if (i10 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i3);
            this.H = fArr2;
        }
        float[] fArr3 = this.H;
        int i11 = this.I;
        int i12 = i11 + 1;
        this.I = i12;
        fArr3[i11] = f10;
        this.I = i11 + 2;
        fArr3[i12] = f11;
    }

    public final void i(float f10, float f11, float f12, float f13, int i3) {
        if (f12 > f10 && f13 > f11) {
            int i10 = this.Q;
            int i11 = i10 + 8;
            float[] fArr = this.N;
            if (i11 > fArr.length) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                this.N = fArr2;
            }
            int i12 = this.R;
            int i13 = i12 + 4;
            int[] iArr = this.O;
            if (i13 > iArr.length) {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i12);
                this.O = iArr2;
            }
            int i14 = this.S;
            int i15 = i14 + 6;
            short[] sArr = this.P;
            if (i15 > sArr.length) {
                short[] sArr2 = new short[sArr.length * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i14);
                this.P = sArr2;
            }
            int i16 = this.R;
            float[] fArr3 = this.N;
            int i17 = this.Q;
            int i18 = i17 + 1;
            this.Q = i18;
            fArr3[i17] = f10;
            int i19 = i17 + 2;
            this.Q = i19;
            fArr3[i18] = f11;
            int i20 = i17 + 3;
            this.Q = i20;
            fArr3[i19] = f12;
            int i21 = i17 + 4;
            this.Q = i21;
            fArr3[i20] = f11;
            int i22 = i17 + 5;
            this.Q = i22;
            fArr3[i21] = f10;
            int i23 = i17 + 6;
            this.Q = i23;
            fArr3[i22] = f13;
            int i24 = i17 + 7;
            this.Q = i24;
            fArr3[i23] = f12;
            this.Q = i17 + 8;
            fArr3[i24] = f13;
            int[] iArr3 = this.O;
            int i25 = i16 + 1;
            this.R = i25;
            iArr3[i16] = i3;
            int i26 = i16 + 2;
            this.R = i26;
            iArr3[i25] = i3;
            int i27 = i16 + 3;
            this.R = i27;
            iArr3[i26] = i3;
            this.R = i16 + 4;
            iArr3[i27] = i3;
            short[] sArr3 = this.P;
            int i28 = this.S;
            int i29 = i28 + 1;
            this.S = i29;
            sArr3[i28] = (short) i16;
            int i30 = i28 + 2;
            this.S = i30;
            short s6 = (short) (i16 + 1);
            sArr3[i29] = s6;
            int i31 = i28 + 3;
            this.S = i31;
            short s10 = (short) (i16 + 2);
            sArr3[i30] = s10;
            int i32 = i28 + 4;
            this.S = i32;
            sArr3[i31] = s10;
            int i33 = i28 + 5;
            this.S = i33;
            sArr3[i32] = s6;
            this.S = i28 + 6;
            sArr3[i33] = (short) (i16 + 3);
        }
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f12 > f10 && f13 > f11) {
            boolean z10 = this.T;
            Paint paint = this.f37100s;
            if (z10) {
                i(f10, f11, f12, f13, paint.getColor());
            } else {
                canvas.drawRect(f10, f11, f12, f13, paint);
            }
        }
    }

    public final void k(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.J;
        float f14 = f12 - min;
        l(canvas, 2, f10, f14, f10 + min, f12);
        l(canvas, 3, f11 - min, f14, f11, f12);
    }

    public final void l(Canvas canvas, int i3, float f10, float f11, float f12, float f13) {
        int i10;
        int i11;
        if ((i3 & 1) == 0) {
            i10 = 0;
        } else {
            i10 = this.J;
        }
        if (i3 < 2) {
            i11 = 0;
        } else {
            i11 = this.J;
        }
        if (this.f37090b0) {
            float f14 = i10;
            float f15 = i11;
            int i12 = this.J;
            float f16 = i10 + i12;
            float f17 = i11 + i12;
            int i13 = this.Z;
            int i14 = i13 + 8;
            float[] fArr = this.W;
            if (i14 > fArr.length) {
                int length = fArr.length * 2;
                float[] fArr2 = new float[length];
                float[] fArr3 = new float[length];
                System.arraycopy(fArr, 0, fArr2, 0, i13);
                System.arraycopy(this.X, 0, fArr3, 0, this.Z);
                this.W = fArr2;
                this.X = fArr3;
            }
            int i15 = this.f37088a0;
            int i16 = i15 + 6;
            short[] sArr = this.Y;
            if (i16 > sArr.length) {
                short[] sArr2 = new short[sArr.length * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i15);
                this.Y = sArr2;
            }
            int i17 = this.Z;
            int i18 = i17 >> 1;
            float[] fArr4 = this.W;
            fArr4[i17] = f10;
            float[] fArr5 = this.X;
            int i19 = i17 + 1;
            this.Z = i19;
            fArr5[i17] = f14;
            fArr4[i19] = f11;
            int i20 = i17 + 2;
            this.Z = i20;
            fArr5[i19] = f15;
            fArr4[i20] = f12;
            int i21 = i17 + 3;
            this.Z = i21;
            fArr5[i20] = f16;
            fArr4[i21] = f11;
            int i22 = i17 + 4;
            this.Z = i22;
            fArr5[i21] = f15;
            fArr4[i22] = f10;
            int i23 = i17 + 5;
            this.Z = i23;
            fArr5[i22] = f14;
            fArr4[i23] = f13;
            int i24 = i17 + 6;
            this.Z = i24;
            fArr5[i23] = f17;
            fArr4[i24] = f12;
            int i25 = i17 + 7;
            this.Z = i25;
            fArr5[i24] = f16;
            fArr4[i25] = f13;
            this.Z = i17 + 8;
            fArr5[i25] = f17;
            short[] sArr3 = this.Y;
            int i26 = this.f37088a0;
            int i27 = i26 + 1;
            this.f37088a0 = i27;
            sArr3[i26] = (short) i18;
            int i28 = i26 + 2;
            this.f37088a0 = i28;
            short s6 = (short) (i18 + 1);
            sArr3[i27] = s6;
            int i29 = i26 + 3;
            this.f37088a0 = i29;
            short s10 = (short) (i18 + 2);
            sArr3[i28] = s10;
            int i30 = i26 + 4;
            this.f37088a0 = i30;
            sArr3[i29] = s10;
            int i31 = i26 + 5;
            this.f37088a0 = i31;
            sArr3[i30] = s6;
            this.f37088a0 = i26 + 6;
            sArr3[i31] = (short) (i18 + 3);
            return;
        }
        int i32 = this.J;
        Rect rect = this.E;
        rect.set(i10, i11, i10 + i32, i32 + i11);
        RectF rectF = this.F;
        rectF.set(f10, f11, f12, f13);
        canvas.drawBitmap(this.G, rect, rectF, this.f37098n);
    }

    public final void m(Canvas canvas, float f10) {
        float f11;
        float f12;
        p9 p9Var;
        float f13;
        float f14;
        tj0 tj0Var = this.f37087a;
        float width = tj0Var.getWidth();
        float height = tj0Var.getHeight();
        int paddingLeft = tj0Var.getPaddingLeft();
        int i3 = this.f37094e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i3));
        float max2 = Math.max(max, Math.min(width, (width - tj0Var.getPaddingRight()) - i3));
        if (max >= max2) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        this.I = 0;
        for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
            View childAt = tj0Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            u4.d1 T = tj0Var.T(childAt);
            if (childAt != tj0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!tj0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !tj0Var.h1(R))) {
                float v12 = tj0.v1(childAt);
                float G0 = tj0.G0(childAt);
                if (childAt instanceof b70) {
                    G0 -= ((b70) childAt).getBottomInfoMargin();
                }
                h(v12, G0);
            }
        }
        if (tj0Var.L2 != null) {
            for (int i11 = 0; i11 < tj0Var.L2.size(); i11++) {
                long longValue = ((Long) tj0Var.L2.get(i11)).longValue();
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                int i12 = (int) (longValue >> 32);
                int i13 = (int) longValue;
                float f15 = height;
                float f16 = 0.0f;
                for (int i14 = 0; i14 < tj0Var.getChildCount(); i14++) {
                    View childAt2 = tj0Var.getChildAt(i14);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= i12 && R2 <= i13) {
                        f15 = Math.min(f15, tj0.v1(childAt2));
                        f16 = Math.max(f16, tj0.G0(childAt2));
                    }
                }
                h(f15, f16);
            }
        }
        int i15 = 2;
        for (int i16 = 2; i16 < this.I; i16 += 2) {
            float[] fArr = this.H;
            float f17 = fArr[i16];
            float f18 = fArr[i16 + 1];
            int i17 = i16 - 2;
            while (i17 >= 0) {
                float[] fArr2 = this.H;
                float f19 = fArr2[i17];
                if (f19 > f17) {
                    fArr2[i17 + 2] = f19;
                    fArr2[i17 + 3] = fArr2[i17 + 1];
                    i17 -= 2;
                }
            }
            float[] fArr3 = this.H;
            fArr3[i17 + 2] = f17;
            fArr3[i17 + 3] = f18;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.I; i19 += 2) {
            float max3 = Math.max(0.0f, this.H[i19]);
            float min = Math.min(height, this.H[i19 + 1]);
            if (min > max3) {
                if (i18 > 0) {
                    float[] fArr4 = this.H;
                    int i20 = i18 - 1;
                    float f20 = fArr4[i20];
                    if (max3 <= f20 + f10) {
                        fArr4[i20] = Math.max(f20, min);
                    }
                }
                float[] fArr5 = this.H;
                int i21 = i18 + 1;
                fArr5[i18] = max3;
                i18 += 2;
                fArr5[i21] = min;
            }
        }
        this.I = i18;
        if (i18 == 0) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        float[] fArr6 = this.H;
        float f21 = fArr6[0];
        float f22 = fArr6[i18 - 1];
        int i22 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i22 > 0) {
            j(canvas, 0.0f, 0.0f, width, Math.min(height, f21 + f10));
        }
        int i23 = (f22 > height ? 1 : (f22 == height ? 0 : -1));
        if (i23 < 0) {
            j(canvas, 0.0f, Math.max(0.0f, f22 - f10), width, height);
        }
        if (i22 > 0) {
            f11 = f21;
        } else {
            f11 = 0.0f;
        }
        if (i23 < 0) {
            f12 = f22;
        } else {
            f12 = height;
        }
        if (f12 > f11) {
            j(canvas, 0.0f, f11, Math.min(width, max + f10), f12);
            p9Var = this;
            p9Var.j(canvas, Math.max(0.0f, max2 - f10), f11, width, f12);
        } else {
            p9Var = this;
        }
        while (i15 < p9Var.I) {
            float[] fArr7 = p9Var.H;
            float f23 = fArr7[i15 - 1];
            float f24 = fArr7[i15];
            if (f24 > f23) {
                f13 = max;
                f14 = max2;
                p9Var.j(canvas, f13, Math.max(0.0f, f23 - f10), f14, Math.min(height, f24 + f10));
            } else {
                f13 = max;
                f14 = max2;
            }
            i15 += 2;
            p9Var = this;
            max = f13;
            max2 = f14;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f10;
        tj0 tj0Var;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof b70) {
                f10 = ((b70) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            float left = view.getLeft();
            this.f37087a.getClass();
            float f13 = this.f37096f;
            float sectionsOverscanTop = (-f13) - tj0Var.getSectionsOverscanTop();
            float v12 = tj0.v1(view);
            if (z10) {
                f11 = f13;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(sectionsOverscanTop, v12 - f11);
            float right = view.getRight();
            float height = tj0Var.getHeight() - (-f13);
            float G0 = tj0.G0(view2);
            if (z11) {
                f12 = f13;
            }
            float min = Math.min(height, (G0 + f12) - f10);
            RectF rectF = this.f37103y;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                o(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f10) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z10 = this.V;
        Paint paint = this.f37101w;
        if (z10) {
            int sectionColorForDecoration = this.f37087a.getSectionColorForDecoration();
            paint.setColor(i0.a.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(sectionColorForDecoration))));
            float f11 = this.f37096f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else if (this.L) {
            paint.setColor(r(f10));
            if (this.U && f10 >= 1.0f) {
                return;
            }
            if (this.T) {
                i(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        } else {
            this.d.j(canvas, rectF, valueOf, valueOf, Float.valueOf(f10));
        }
    }

    public final void p(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p9.p(android.graphics.Canvas):void");
    }

    public final void q(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.J;
        float f14 = f12 + min;
        l(canvas, 0, f10, f12, f10 + min, f14);
        l(canvas, 1, f11 - min, f12, f11, f14);
    }

    public final int r(float f10) {
        int sectionColorForDecoration = this.f37087a.getSectionColorForDecoration();
        return i0.a.k(i0.a.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(sectionColorForDecoration))), this.f37100s.getColor());
    }

    public final boolean s(int i3, View view) {
        if (view != null && i3 <= 0) {
            u4.h0 adapter = this.f37087a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.f37091c.a(Integer.valueOf(adapter.d(R - 1)))).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean t(int i3, View view) {
        if (view != null) {
            tj0 tj0Var = this.f37087a;
            if (i3 >= tj0Var.getChildCount() - 1) {
                u4.h0 adapter = tj0Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.b() - 1) {
                    if (((Boolean) this.f37091c.a(Integer.valueOf(adapter.d(R + 1)))).booleanValue()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean u(View view) {
        return ((Boolean) this.f37089b.a(view)).booleanValue();
    }

    public final boolean v(int i3) {
        tj0 tj0Var = this.f37087a;
        u4.h0 adapter = tj0Var.getAdapter();
        if (i3 >= 0 && adapter != null && i3 < adapter.b()) {
            View T0 = tj0Var.T0(i3);
            if (T0 != null) {
                if (!u(T0) || tj0Var.h1(i3)) {
                    return false;
                }
                return true;
            }
            if (((Boolean) this.f37091c.a(Integer.valueOf(adapter.d(i3)))).booleanValue() && !tj0Var.h1(i3)) {
                return true;
            }
        }
        return false;
    }
}
