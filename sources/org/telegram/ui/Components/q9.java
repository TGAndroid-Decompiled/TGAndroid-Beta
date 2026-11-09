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
public final class q9 extends v4.m0 implements eh.a {
    public final Rect D;
    public final RectF E;
    public Bitmap F;
    public float[] G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public oj0 L;
    public float[] M;
    public int[] N;
    public short[] O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float[] V;
    public float[] W;
    public short[] X;
    public int Y;
    public int Z;
    public final qj0 f37262a;
    public boolean f37263a0;
    public final org.telegram.messenger.d20 f37264b;
    public float[] f37265b0;
    public final org.telegram.messenger.d20 f37266c;
    public int f37267c0;
    public final org.telegram.messenger.a20 d;
    public float[] f37268d0;
    public final int f37269e;
    public int f37270e0;
    public final float f37271f;
    public final boolean h;
    public final Paint f37272n = new Paint(3);
    public final Paint f37273r = new Paint(3);
    public final Paint f37274s = new Paint();
    public final Paint f37275w = new Paint();
    public final Paint f37276x;
    public final RectF f37277y;

    public q9(qj0 qj0Var, org.telegram.messenger.d20 d20Var, org.telegram.messenger.d20 d20Var2, int i7, float f10, bx bxVar, boolean z9, boolean z10, oj0 oj0Var) {
        Paint paint = new Paint();
        this.f37276x = paint;
        this.f37277y = new RectF();
        this.D = new Rect();
        this.E = new RectF();
        this.G = new float[32];
        this.J = -1.0f;
        this.M = new float[128];
        this.N = new int[64];
        this.O = new short[96];
        this.V = new float[128];
        this.W = new float[128];
        this.X = new short[96];
        this.f37265b0 = new float[48];
        this.f37268d0 = new float[32];
        this.f37262a = qj0Var;
        this.f37264b = d20Var;
        this.f37266c = d20Var2;
        this.f37269e = i7;
        this.f37271f = f10;
        this.d = bxVar;
        this.h = z9;
        this.K = z10;
        this.L = oj0Var;
        paint.setColor(-1);
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8698a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.U = true;
            p(canvas);
        } finally {
            this.U = false;
            canvas.restore();
        }
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int b10;
        int L;
        if (u(view)) {
            int i7 = this.f37269e;
            rect.right = i7;
            rect.left = i7;
            v4.d1 T = recyclerView.T(view);
            v4.g0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                if (b10 == 0) {
                    if (this.h) {
                        L = i7;
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (b10 == adapter.b() - 1) {
                    rect.bottom = i7;
                }
            }
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        qj0 qj0Var = this.f37262a;
        if (recyclerView == qj0Var) {
            int sectionsBackgroundColorForDecoration = qj0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.f37274s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                this.F = null;
                this.J = -1.0f;
            }
            if (!this.K) {
                p(canvas);
                return;
            }
            int ordinal = this.L.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        m(canvas, 1.0f);
                        p(canvas);
                        return;
                    }
                    this.P = 0;
                    this.Q = 0;
                    this.R = 0;
                    this.S = true;
                    m(canvas, 0.0f);
                    p(canvas);
                    this.S = false;
                    int i7 = this.P;
                    if (i7 == 0) {
                        return;
                    }
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i7, this.M, 0, null, 0, this.N, 0, this.O, 0, this.R, this.f37276x);
                    return;
                }
                int r10 = r(1.0f);
                Paint paint2 = this.f37275w;
                paint2.setColor(r10);
                canvas.drawRect(0.0f, 0.0f, qj0Var.getWidth(), qj0Var.getHeight(), paint2);
                m(canvas, 0.0f);
                this.T = true;
                p(canvas);
                this.T = false;
                return;
            }
            canvas.drawRect(0.0f, 0.0f, qj0Var.getWidth(), qj0Var.getHeight(), paint);
            p(canvas);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i7;
        q9 q9Var = this;
        qj0 qj0Var = q9Var.f37262a;
        if (recyclerView == qj0Var) {
            float f10 = q9Var.f37271f;
            if (f10 > 0.0f) {
                int sectionsBackgroundColorForDecoration = qj0Var.getSectionsBackgroundColorForDecoration();
                Paint paint = q9Var.f37274s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    q9Var.F = null;
                    q9Var.J = -1.0f;
                }
                boolean z9 = true;
                int max = Math.max(1, (int) Math.ceil(f10));
                Bitmap bitmap = q9Var.F;
                Paint paint2 = q9Var.f37273r;
                if (bitmap == null || q9Var.I != max || q9Var.J != f10) {
                    q9Var.I = max;
                    q9Var.J = f10;
                    int i10 = max * 2;
                    q9Var.F = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(q9Var.F);
                    canvas3.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f11 = max;
                    canvas3.drawCircle(f11, f11, f10, paint3);
                    Bitmap bitmap2 = q9Var.F;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                z9 = (q9Var.K && q9Var.L == oj0.f36732b) ? false : false;
                q9Var.f37263a0 = z9;
                if (z9) {
                    q9Var.Y = 0;
                    q9Var.Z = 0;
                }
                if (qj0Var.b0()) {
                    int paddingLeft = qj0Var.getPaddingLeft();
                    int i11 = q9Var.f37269e;
                    float f12 = paddingLeft + i11;
                    float width = (qj0Var.getWidth() - qj0Var.getPaddingRight()) - i11;
                    float f13 = f10 * 0.2f;
                    for (int i12 = 0; i12 < q9Var.f37270e0; i12 += 4) {
                        float[] fArr = q9Var.f37268d0;
                        float f14 = fArr[i12];
                        float f15 = fArr[i12 + 1];
                        float f16 = fArr[i12 + 2];
                        float f17 = fArr[i12 + 3];
                        int i13 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                        if (i13 > 0 && i12 > 0) {
                            f16 = Math.min(f16, Math.max(0.0f, Math.min(1.0f, (f14 - fArr[i12 - 3]) / f13)));
                        }
                        if (i13 > 0 && (i7 = i12 + 4) < q9Var.f37270e0) {
                            f17 = Math.min(f17, Math.max(0.0f, Math.min(1.0f, (q9Var.f37268d0[i7] - f15) / f13)));
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 < qj0Var.getChildCount()) {
                                View childAt = qj0Var.getChildAt(i14);
                                if (qj0.a1(childAt) && Math.abs(qj0.v1(childAt) - f14) < 1.0f) {
                                    canvas2 = canvas;
                                    break;
                                }
                                i14++;
                            } else {
                                canvas2 = canvas;
                                q9Var.q(canvas2, f12, width, f14, f16);
                                q9Var = this;
                                break;
                            }
                        }
                        q9Var.k(canvas2, f12, width, f15, f17);
                    }
                } else {
                    int i15 = 0;
                    while (i15 < qj0Var.getChildCount()) {
                        View childAt2 = qj0Var.getChildAt(i15);
                        v4.d1 T = qj0Var.T(childAt2);
                        int R = RecyclerView.R(childAt2);
                        if (childAt2 != qj0Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && q9Var.u(childAt2) && !qj0Var.h1(R))) {
                            float x10 = childAt2.getX();
                            float width2 = x10 + childAt2.getWidth();
                            if (!q9Var.v(R - 1) && !qj0.a1(childAt2)) {
                                q9Var.q(canvas, x10, width2, qj0.v1(childAt2), 1.0f);
                            }
                            if (!q9Var.v(R + 1)) {
                                q9Var.k(canvas, x10, width2, qj0.G0(childAt2), 1.0f);
                            }
                        }
                        i15++;
                        q9Var = this;
                    }
                }
                if (qj0Var.K2 != null) {
                    for (int i16 = 0; i16 < qj0Var.K2.size(); i16++) {
                        long longValue = ((Long) qj0Var.K2.get(i16)).longValue();
                        Typeface typeface = org.telegram.messenger.g0.f22535a;
                        View T0 = qj0Var.T0((int) (longValue >> 32));
                        View T02 = qj0Var.T0((int) longValue);
                        if (T0 != null && !qj0.a1(T0)) {
                            q(canvas, T0.getX(), T0.getWidth() + T0.getX(), qj0.v1(T0), 1.0f);
                        }
                        if (T02 != null) {
                            k(canvas, T02.getX(), T02.getX() + T02.getWidth(), qj0.G0(T02), 1.0f);
                        }
                    }
                }
                if (this.f37263a0) {
                    this.f37263a0 = false;
                    int i17 = this.Y;
                    if (i17 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i17, this.V, 0, this.W, 0, null, 0, this.X, 0, this.Z, paint2);
                    }
                }
            }
        }
    }

    public final void h(float f10, float f11) {
        if (f11 <= f10) {
            return;
        }
        int i7 = this.H;
        int i10 = i7 + 2;
        float[] fArr = this.G;
        if (i10 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.G = fArr2;
        }
        float[] fArr3 = this.G;
        int i11 = this.H;
        int i12 = i11 + 1;
        this.H = i12;
        fArr3[i11] = f10;
        this.H = i11 + 2;
        fArr3[i12] = f11;
    }

    public final void i(float f10, float f11, float f12, float f13, int i7) {
        if (f12 > f10 && f13 > f11) {
            int i10 = this.P;
            int i11 = i10 + 8;
            float[] fArr = this.M;
            if (i11 > fArr.length) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                this.M = fArr2;
            }
            int i12 = this.Q;
            int i13 = i12 + 4;
            int[] iArr = this.N;
            if (i13 > iArr.length) {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i12);
                this.N = iArr2;
            }
            int i14 = this.R;
            int i15 = i14 + 6;
            short[] sArr = this.O;
            if (i15 > sArr.length) {
                short[] sArr2 = new short[sArr.length * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i14);
                this.O = sArr2;
            }
            int i16 = this.Q;
            float[] fArr3 = this.M;
            int i17 = this.P;
            int i18 = i17 + 1;
            this.P = i18;
            fArr3[i17] = f10;
            int i19 = i17 + 2;
            this.P = i19;
            fArr3[i18] = f11;
            int i20 = i17 + 3;
            this.P = i20;
            fArr3[i19] = f12;
            int i21 = i17 + 4;
            this.P = i21;
            fArr3[i20] = f11;
            int i22 = i17 + 5;
            this.P = i22;
            fArr3[i21] = f10;
            int i23 = i17 + 6;
            this.P = i23;
            fArr3[i22] = f13;
            int i24 = i17 + 7;
            this.P = i24;
            fArr3[i23] = f12;
            this.P = i17 + 8;
            fArr3[i24] = f13;
            int[] iArr3 = this.N;
            int i25 = i16 + 1;
            this.Q = i25;
            iArr3[i16] = i7;
            int i26 = i16 + 2;
            this.Q = i26;
            iArr3[i25] = i7;
            int i27 = i16 + 3;
            this.Q = i27;
            iArr3[i26] = i7;
            this.Q = i16 + 4;
            iArr3[i27] = i7;
            short[] sArr3 = this.O;
            int i28 = this.R;
            int i29 = i28 + 1;
            this.R = i29;
            sArr3[i28] = (short) i16;
            int i30 = i28 + 2;
            this.R = i30;
            short s5 = (short) (i16 + 1);
            sArr3[i29] = s5;
            int i31 = i28 + 3;
            this.R = i31;
            short s9 = (short) (i16 + 2);
            sArr3[i30] = s9;
            int i32 = i28 + 4;
            this.R = i32;
            sArr3[i31] = s9;
            int i33 = i28 + 5;
            this.R = i33;
            sArr3[i32] = s5;
            this.R = i28 + 6;
            sArr3[i33] = (short) (i16 + 3);
        }
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f12 > f10 && f13 > f11) {
            boolean z9 = this.S;
            Paint paint = this.f37274s;
            if (z9) {
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
        float min = Math.min(1.0f, f13) * this.I;
        float f14 = f12 - min;
        l(canvas, 2, f10, f14, f10 + min, f12);
        l(canvas, 3, f11 - min, f14, f11, f12);
    }

    public final void l(Canvas canvas, int i7, float f10, float f11, float f12, float f13) {
        int i10;
        int i11;
        if ((i7 & 1) == 0) {
            i10 = 0;
        } else {
            i10 = this.I;
        }
        if (i7 < 2) {
            i11 = 0;
        } else {
            i11 = this.I;
        }
        if (this.f37263a0) {
            float f14 = i10;
            float f15 = i11;
            int i12 = this.I;
            float f16 = i10 + i12;
            float f17 = i11 + i12;
            int i13 = this.Y;
            int i14 = i13 + 8;
            float[] fArr = this.V;
            if (i14 > fArr.length) {
                int length = fArr.length * 2;
                float[] fArr2 = new float[length];
                float[] fArr3 = new float[length];
                System.arraycopy(fArr, 0, fArr2, 0, i13);
                System.arraycopy(this.W, 0, fArr3, 0, this.Y);
                this.V = fArr2;
                this.W = fArr3;
            }
            int i15 = this.Z;
            int i16 = i15 + 6;
            short[] sArr = this.X;
            if (i16 > sArr.length) {
                short[] sArr2 = new short[sArr.length * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i15);
                this.X = sArr2;
            }
            int i17 = this.Y;
            int i18 = i17 >> 1;
            float[] fArr4 = this.V;
            fArr4[i17] = f10;
            float[] fArr5 = this.W;
            int i19 = i17 + 1;
            this.Y = i19;
            fArr5[i17] = f14;
            fArr4[i19] = f11;
            int i20 = i17 + 2;
            this.Y = i20;
            fArr5[i19] = f15;
            fArr4[i20] = f12;
            int i21 = i17 + 3;
            this.Y = i21;
            fArr5[i20] = f16;
            fArr4[i21] = f11;
            int i22 = i17 + 4;
            this.Y = i22;
            fArr5[i21] = f15;
            fArr4[i22] = f10;
            int i23 = i17 + 5;
            this.Y = i23;
            fArr5[i22] = f14;
            fArr4[i23] = f13;
            int i24 = i17 + 6;
            this.Y = i24;
            fArr5[i23] = f17;
            fArr4[i24] = f12;
            int i25 = i17 + 7;
            this.Y = i25;
            fArr5[i24] = f16;
            fArr4[i25] = f13;
            this.Y = i17 + 8;
            fArr5[i25] = f17;
            short[] sArr3 = this.X;
            int i26 = this.Z;
            int i27 = i26 + 1;
            this.Z = i27;
            sArr3[i26] = (short) i18;
            int i28 = i26 + 2;
            this.Z = i28;
            short s5 = (short) (i18 + 1);
            sArr3[i27] = s5;
            int i29 = i26 + 3;
            this.Z = i29;
            short s9 = (short) (i18 + 2);
            sArr3[i28] = s9;
            int i30 = i26 + 4;
            this.Z = i30;
            sArr3[i29] = s9;
            int i31 = i26 + 5;
            this.Z = i31;
            sArr3[i30] = s5;
            this.Z = i26 + 6;
            sArr3[i31] = (short) (i18 + 3);
            return;
        }
        int i32 = this.I;
        Rect rect = this.D;
        rect.set(i10, i11, i10 + i32, i32 + i11);
        RectF rectF = this.E;
        rectF.set(f10, f11, f12, f13);
        canvas.drawBitmap(this.F, rect, rectF, this.f37272n);
    }

    public final void m(Canvas canvas, float f10) {
        float f11;
        float f12;
        q9 q9Var;
        float f13;
        float f14;
        qj0 qj0Var = this.f37262a;
        float width = qj0Var.getWidth();
        float height = qj0Var.getHeight();
        int paddingLeft = qj0Var.getPaddingLeft();
        int i7 = this.f37269e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i7));
        float max2 = Math.max(max, Math.min(width, (width - qj0Var.getPaddingRight()) - i7));
        if (max >= max2) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        this.H = 0;
        for (int i10 = 0; i10 < qj0Var.getChildCount(); i10++) {
            View childAt = qj0Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            v4.d1 T = qj0Var.T(childAt);
            if (childAt != qj0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!qj0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !qj0Var.h1(R))) {
                float v12 = qj0.v1(childAt);
                float G0 = qj0.G0(childAt);
                if (childAt instanceof g70) {
                    G0 -= ((g70) childAt).getBottomInfoMargin();
                }
                h(v12, G0);
            }
        }
        if (qj0Var.K2 != null) {
            for (int i11 = 0; i11 < qj0Var.K2.size(); i11++) {
                long longValue = ((Long) qj0Var.K2.get(i11)).longValue();
                Typeface typeface = org.telegram.messenger.g0.f22535a;
                int i12 = (int) (longValue >> 32);
                int i13 = (int) longValue;
                float f15 = height;
                float f16 = 0.0f;
                for (int i14 = 0; i14 < qj0Var.getChildCount(); i14++) {
                    View childAt2 = qj0Var.getChildAt(i14);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= i12 && R2 <= i13) {
                        f15 = Math.min(f15, qj0.v1(childAt2));
                        f16 = Math.max(f16, qj0.G0(childAt2));
                    }
                }
                h(f15, f16);
            }
        }
        int i15 = 2;
        for (int i16 = 2; i16 < this.H; i16 += 2) {
            float[] fArr = this.G;
            float f17 = fArr[i16];
            float f18 = fArr[i16 + 1];
            int i17 = i16 - 2;
            while (i17 >= 0) {
                float[] fArr2 = this.G;
                float f19 = fArr2[i17];
                if (f19 > f17) {
                    fArr2[i17 + 2] = f19;
                    fArr2[i17 + 3] = fArr2[i17 + 1];
                    i17 -= 2;
                }
            }
            float[] fArr3 = this.G;
            fArr3[i17 + 2] = f17;
            fArr3[i17 + 3] = f18;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.H; i19 += 2) {
            float max3 = Math.max(0.0f, this.G[i19]);
            float min = Math.min(height, this.G[i19 + 1]);
            if (min > max3) {
                if (i18 > 0) {
                    float[] fArr4 = this.G;
                    int i20 = i18 - 1;
                    float f20 = fArr4[i20];
                    if (max3 <= f20 + f10) {
                        fArr4[i20] = Math.max(f20, min);
                    }
                }
                float[] fArr5 = this.G;
                int i21 = i18 + 1;
                fArr5[i18] = max3;
                i18 += 2;
                fArr5[i21] = min;
            }
        }
        this.H = i18;
        if (i18 == 0) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        float[] fArr6 = this.G;
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
            q9Var = this;
            q9Var.j(canvas, Math.max(0.0f, max2 - f10), f11, width, f12);
        } else {
            q9Var = this;
        }
        while (i15 < q9Var.H) {
            float[] fArr7 = q9Var.G;
            float f23 = fArr7[i15 - 1];
            float f24 = fArr7[i15];
            if (f24 > f23) {
                f13 = max;
                f14 = max2;
                q9Var.j(canvas, f13, Math.max(0.0f, f23 - f10), f14, Math.min(height, f24 + f10));
            } else {
                f13 = max;
                f14 = max2;
            }
            i15 += 2;
            q9Var = this;
            max = f13;
            max2 = f14;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z9, boolean z10) {
        float f10;
        qj0 qj0Var;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof g70) {
                f10 = ((g70) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            float left = view.getLeft();
            this.f37262a.getClass();
            float f13 = this.f37271f;
            float sectionsOverscanTop = (-f13) - qj0Var.getSectionsOverscanTop();
            float v12 = qj0.v1(view);
            if (z9) {
                f11 = f13;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(sectionsOverscanTop, v12 - f11);
            float right = view.getRight();
            float height = qj0Var.getHeight() - (-f13);
            float G0 = qj0.G0(view2);
            if (z10) {
                f12 = f13;
            }
            float min = Math.min(height, (G0 + f12) - f10);
            RectF rectF = this.f37277y;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                o(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f10) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z9 = this.U;
        Paint paint = this.f37275w;
        if (z9) {
            int sectionColorForDecoration = this.f37262a.getSectionColorForDecoration();
            paint.setColor(i0.a.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(sectionColorForDecoration))));
            float f11 = this.f37271f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else if (this.K) {
            paint.setColor(r(f10));
            if (this.T && f10 >= 1.0f) {
                return;
            }
            if (this.S) {
                i(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        } else {
            this.d.i(canvas, rectF, valueOf, valueOf, Float.valueOf(f10));
        }
    }

    public final void p(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q9.p(android.graphics.Canvas):void");
    }

    public final void q(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.I;
        float f14 = f12 + min;
        l(canvas, 0, f10, f12, f10 + min, f14);
        l(canvas, 1, f11 - min, f12, f11, f14);
    }

    public final int r(float f10) {
        int sectionColorForDecoration = this.f37262a.getSectionColorForDecoration();
        return i0.a.k(i0.a.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(sectionColorForDecoration))), this.f37274s.getColor());
    }

    public final boolean s(int i7, View view) {
        if (view != null && i7 <= 0) {
            v4.g0 adapter = this.f37262a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.f37266c.a(Integer.valueOf(adapter.d(R - 1)))).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean t(int i7, View view) {
        if (view != null) {
            qj0 qj0Var = this.f37262a;
            if (i7 >= qj0Var.getChildCount() - 1) {
                v4.g0 adapter = qj0Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.b() - 1) {
                    if (((Boolean) this.f37266c.a(Integer.valueOf(adapter.d(R + 1)))).booleanValue()) {
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
        return ((Boolean) this.f37264b.a(view)).booleanValue();
    }

    public final boolean v(int i7) {
        qj0 qj0Var = this.f37262a;
        v4.g0 adapter = qj0Var.getAdapter();
        if (i7 >= 0 && adapter != null && i7 < adapter.b()) {
            View T0 = qj0Var.T0(i7);
            if (T0 != null) {
                if (!u(T0) || qj0Var.h1(i7)) {
                    return false;
                }
                return true;
            }
            if (((Boolean) this.f37266c.a(Integer.valueOf(adapter.d(i7)))).booleanValue() && !qj0Var.h1(i7)) {
                return true;
            }
        }
        return false;
    }
}
