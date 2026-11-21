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
public final class v9 extends v4.o0 implements eh.a {
    public final Rect E;
    public final RectF F;
    public Bitmap G;
    public float[] H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public ck0 M;
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
    public final ek0 f40724a;
    public int f40725a0;
    public final org.telegram.messenger.y10 f40726b;
    public boolean f40727b0;
    public final org.telegram.messenger.y10 f40728c;
    public float[] f40729c0;
    public final org.telegram.messenger.v10 d;
    public int f40730d0;
    public final int f40731e;
    public float[] f40732e0;
    public final float f40733f;
    public int f40734f0;
    public final boolean h;
    public final Paint f40735n = new Paint(3);
    public final Paint f40736r = new Paint(3);
    public final Paint f40737s = new Paint();
    public final Paint f40738w = new Paint();
    public final Paint f40739x;
    public final RectF f40740y;

    public v9(ek0 ek0Var, org.telegram.messenger.y10 y10Var, org.telegram.messenger.y10 y10Var2, int i7, float f10, ky kyVar, boolean z10, boolean z11, ck0 ck0Var) {
        Paint paint = new Paint();
        this.f40739x = paint;
        this.f40740y = new RectF();
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
        this.f40729c0 = new float[48];
        this.f40732e0 = new float[32];
        this.f40724a = ek0Var;
        this.f40726b = y10Var;
        this.f40728c = y10Var2;
        this.f40731e = i7;
        this.f40733f = f10;
        this.d = kyVar;
        this.h = z10;
        this.L = z11;
        this.M = ck0Var;
        paint.setColor(-1);
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8398a = true;
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
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int b10;
        int L;
        if (u(view)) {
            int i7 = this.f40731e;
            rect.right = i7;
            rect.left = i7;
            v4.f1 T = recyclerView.T(view);
            v4.i0 adapter = recyclerView.getAdapter();
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
        ek0 ek0Var = this.f40724a;
        if (recyclerView == ek0Var) {
            int sectionsBackgroundColorForDecoration = ek0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.f40737s;
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
                    int i7 = this.Q;
                    if (i7 == 0) {
                        return;
                    }
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i7, this.N, 0, null, 0, this.O, 0, this.P, 0, this.S, this.f40739x);
                    return;
                }
                int r10 = r(1.0f);
                Paint paint2 = this.f40738w;
                paint2.setColor(r10);
                canvas.drawRect(0.0f, 0.0f, ek0Var.getWidth(), ek0Var.getHeight(), paint2);
                m(canvas, 0.0f);
                this.U = true;
                p(canvas);
                this.U = false;
                return;
            }
            canvas.drawRect(0.0f, 0.0f, ek0Var.getWidth(), ek0Var.getHeight(), paint);
            p(canvas);
        }
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i7;
        v9 v9Var = this;
        ek0 ek0Var = v9Var.f40724a;
        if (recyclerView == ek0Var) {
            float f10 = v9Var.f40733f;
            if (f10 > 0.0f) {
                int sectionsBackgroundColorForDecoration = ek0Var.getSectionsBackgroundColorForDecoration();
                Paint paint = v9Var.f40737s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    v9Var.G = null;
                    v9Var.K = -1.0f;
                }
                boolean z10 = true;
                int max = Math.max(1, (int) Math.ceil(f10));
                Bitmap bitmap = v9Var.G;
                Paint paint2 = v9Var.f40736r;
                if (bitmap == null || v9Var.J != max || v9Var.K != f10) {
                    v9Var.J = max;
                    v9Var.K = f10;
                    int i10 = max * 2;
                    v9Var.G = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(v9Var.G);
                    canvas3.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f11 = max;
                    canvas3.drawCircle(f11, f11, f10, paint3);
                    Bitmap bitmap2 = v9Var.G;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                z10 = (v9Var.L && v9Var.M == ck0.f34216b) ? false : false;
                v9Var.f40727b0 = z10;
                if (z10) {
                    v9Var.Z = 0;
                    v9Var.f40725a0 = 0;
                }
                if (ek0Var.b0()) {
                    int paddingLeft = ek0Var.getPaddingLeft();
                    int i11 = v9Var.f40731e;
                    float f12 = paddingLeft + i11;
                    float width = (ek0Var.getWidth() - ek0Var.getPaddingRight()) - i11;
                    float f13 = f10 * 0.2f;
                    int i12 = 0;
                    while (i12 < v9Var.f40734f0) {
                        float[] fArr = v9Var.f40732e0;
                        float f14 = f12;
                        float f15 = width;
                        float f16 = fArr[i12];
                        float f17 = fArr[i12 + 1];
                        float f18 = fArr[i12 + 2];
                        float f19 = fArr[i12 + 3];
                        int i13 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                        if (i13 > 0 && i12 > 0) {
                            f18 = Math.min(f18, Math.max(0.0f, Math.min(1.0f, (f16 - fArr[i12 - 3]) / f13)));
                        }
                        float f20 = f18;
                        if (i13 > 0 && (i7 = i12 + 4) < v9Var.f40734f0) {
                            f19 = Math.min(f19, Math.max(0.0f, Math.min(1.0f, (v9Var.f40732e0[i7] - f17) / f13)));
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 < ek0Var.getChildCount()) {
                                View childAt = ek0Var.getChildAt(i14);
                                if (ek0.a1(childAt) && Math.abs(ek0.v1(childAt) - f16) < 1.0f) {
                                    canvas2 = canvas;
                                    break;
                                }
                                i14++;
                            } else {
                                canvas2 = canvas;
                                v9Var.q(f14, f15, f16, f20, canvas2);
                                v9Var = this;
                                break;
                            }
                        }
                        v9Var.k(f14, f15, f17, f19, canvas2);
                        i12 += 4;
                        width = f15;
                        f12 = f14;
                    }
                } else {
                    int i15 = 0;
                    while (i15 < ek0Var.getChildCount()) {
                        View childAt2 = ek0Var.getChildAt(i15);
                        v4.f1 T = ek0Var.T(childAt2);
                        int R = RecyclerView.R(childAt2);
                        if (childAt2 != ek0Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && v9Var.u(childAt2) && !ek0Var.h1(R))) {
                            float x10 = childAt2.getX();
                            float width2 = childAt2.getWidth() + x10;
                            if (!v9Var.v(R - 1) && !ek0.a1(childAt2)) {
                                v9Var.q(x10, width2, ek0.v1(childAt2), 1.0f, canvas);
                            }
                            if (!v9Var.v(R + 1)) {
                                v9Var.k(x10, width2, ek0.G0(childAt2), 1.0f, canvas);
                            }
                        }
                        i15++;
                        v9Var = this;
                    }
                }
                if (ek0Var.L2 != null) {
                    for (int i16 = 0; i16 < ek0Var.L2.size(); i16++) {
                        long longValue = ((Long) ek0Var.L2.get(i16)).longValue();
                        Typeface typeface = org.telegram.messenger.g0.f24118a;
                        View T0 = ek0Var.T0((int) (longValue >> 32));
                        View T02 = ek0Var.T0((int) longValue);
                        if (T0 != null && !ek0.a1(T0)) {
                            q(T0.getX(), T0.getX() + T0.getWidth(), ek0.v1(T0), 1.0f, canvas);
                        }
                        if (T02 != null) {
                            k(T02.getX(), T02.getWidth() + T02.getX(), ek0.G0(T02), 1.0f, canvas);
                        }
                    }
                }
                if (this.f40727b0) {
                    this.f40727b0 = false;
                    int i17 = this.Z;
                    if (i17 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i17, this.W, 0, this.X, 0, null, 0, this.Y, 0, this.f40725a0, paint2);
                    }
                }
            }
        }
    }

    public final void h(float f10, float f11) {
        if (f11 <= f10) {
            return;
        }
        int i7 = this.I;
        int i10 = i7 + 2;
        float[] fArr = this.H;
        if (i10 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
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

    public final void i(float f10, float f11, float f12, float f13, int i7) {
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
            iArr3[i16] = i7;
            int i26 = i16 + 2;
            this.R = i26;
            iArr3[i25] = i7;
            int i27 = i16 + 3;
            this.R = i27;
            iArr3[i26] = i7;
            this.R = i16 + 4;
            iArr3[i27] = i7;
            short[] sArr3 = this.P;
            int i28 = this.S;
            int i29 = i28 + 1;
            this.S = i29;
            sArr3[i28] = (short) i16;
            int i30 = i28 + 2;
            this.S = i30;
            short s5 = (short) (i16 + 1);
            sArr3[i29] = s5;
            int i31 = i28 + 3;
            this.S = i31;
            short s9 = (short) (i16 + 2);
            sArr3[i30] = s9;
            int i32 = i28 + 4;
            this.S = i32;
            sArr3[i31] = s9;
            int i33 = i28 + 5;
            this.S = i33;
            sArr3[i32] = s5;
            this.S = i28 + 6;
            sArr3[i33] = (short) (i16 + 3);
        }
    }

    public final void j(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (f12 > f10 && f13 > f11) {
            boolean z10 = this.T;
            Paint paint = this.f40737s;
            if (z10) {
                i(f10, f11, f12, f13, paint.getColor());
            } else {
                canvas.drawRect(f10, f11, f12, f13, paint);
            }
        }
    }

    public final void k(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.J;
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
            i10 = this.J;
        }
        if (i7 < 2) {
            i11 = 0;
        } else {
            i11 = this.J;
        }
        if (this.f40727b0) {
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
            int i15 = this.f40725a0;
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
            int i26 = this.f40725a0;
            int i27 = i26 + 1;
            this.f40725a0 = i27;
            sArr3[i26] = (short) i18;
            int i28 = i26 + 2;
            this.f40725a0 = i28;
            short s5 = (short) (i18 + 1);
            sArr3[i27] = s5;
            int i29 = i26 + 3;
            this.f40725a0 = i29;
            short s9 = (short) (i18 + 2);
            sArr3[i28] = s9;
            int i30 = i26 + 4;
            this.f40725a0 = i30;
            sArr3[i29] = s9;
            int i31 = i26 + 5;
            this.f40725a0 = i31;
            sArr3[i30] = s5;
            this.f40725a0 = i26 + 6;
            sArr3[i31] = (short) (i18 + 3);
            return;
        }
        int i32 = this.J;
        Rect rect = this.E;
        rect.set(i10, i11, i10 + i32, i32 + i11);
        RectF rectF = this.F;
        rectF.set(f10, f11, f12, f13);
        canvas.drawBitmap(this.G, rect, rectF, this.f40735n);
    }

    public final void m(Canvas canvas, float f10) {
        float f11;
        float f12;
        v9 v9Var;
        float f13;
        float f14;
        ek0 ek0Var = this.f40724a;
        float width = ek0Var.getWidth();
        float height = ek0Var.getHeight();
        int paddingLeft = ek0Var.getPaddingLeft();
        int i7 = this.f40731e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i7));
        float max2 = Math.max(max, Math.min(width, (width - ek0Var.getPaddingRight()) - i7));
        if (max >= max2) {
            j(0.0f, 0.0f, width, height, canvas);
            return;
        }
        this.I = 0;
        for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
            View childAt = ek0Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            v4.f1 T = ek0Var.T(childAt);
            if (childAt != ek0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!ek0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !ek0Var.h1(R))) {
                float v12 = ek0.v1(childAt);
                float G0 = ek0.G0(childAt);
                if (childAt instanceof v70) {
                    G0 -= ((v70) childAt).getBottomInfoMargin();
                }
                h(v12, G0);
            }
        }
        if (ek0Var.L2 != null) {
            for (int i11 = 0; i11 < ek0Var.L2.size(); i11++) {
                long longValue = ((Long) ek0Var.L2.get(i11)).longValue();
                Typeface typeface = org.telegram.messenger.g0.f24118a;
                int i12 = (int) (longValue >> 32);
                int i13 = (int) longValue;
                float f15 = height;
                float f16 = 0.0f;
                for (int i14 = 0; i14 < ek0Var.getChildCount(); i14++) {
                    View childAt2 = ek0Var.getChildAt(i14);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= i12 && R2 <= i13) {
                        f15 = Math.min(f15, ek0.v1(childAt2));
                        f16 = Math.max(f16, ek0.G0(childAt2));
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
            j(0.0f, 0.0f, width, height, canvas);
            return;
        }
        float[] fArr6 = this.H;
        float f21 = fArr6[0];
        float f22 = fArr6[i18 - 1];
        int i22 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i22 > 0) {
            j(0.0f, 0.0f, width, Math.min(height, f21 + f10), canvas);
        }
        int i23 = (f22 > height ? 1 : (f22 == height ? 0 : -1));
        if (i23 < 0) {
            j(0.0f, Math.max(0.0f, f22 - f10), width, height, canvas);
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
            j(0.0f, f11, Math.min(width, max + f10), f12, canvas);
            v9Var = this;
            v9Var.j(Math.max(0.0f, max2 - f10), f11, width, f12, canvas);
        } else {
            v9Var = this;
        }
        while (i15 < v9Var.I) {
            float[] fArr7 = v9Var.H;
            float f23 = fArr7[i15 - 1];
            float f24 = fArr7[i15];
            if (f24 > f23) {
                float max4 = Math.max(0.0f, f23 - f10);
                float min2 = Math.min(height, f24 + f10);
                f13 = max;
                f14 = max2;
                v9Var.j(f13, max4, f14, min2, canvas);
            } else {
                f13 = max;
                f14 = max2;
            }
            i15 += 2;
            v9Var = this;
            max = f13;
            max2 = f14;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f10;
        ek0 ek0Var;
        float f11;
        if (view != null && view2 != null) {
            float f12 = 0.0f;
            if (view2 instanceof v70) {
                f10 = ((v70) view2).getBottomInfoMargin();
            } else {
                f10 = 0.0f;
            }
            float left = view.getLeft();
            this.f40724a.getClass();
            float f13 = this.f40733f;
            float sectionsOverscanTop = (-f13) - ek0Var.getSectionsOverscanTop();
            float v12 = ek0.v1(view);
            if (z10) {
                f11 = f13;
            } else {
                f11 = 0.0f;
            }
            float max = Math.max(sectionsOverscanTop, v12 - f11);
            float right = view.getRight();
            float height = ek0Var.getHeight() - (-f13);
            float G0 = ek0.G0(view2);
            if (z11) {
                f12 = f13;
            }
            float min = Math.min(height, (G0 + f12) - f10);
            RectF rectF = this.f40740y;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                o(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f10) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z10 = this.V;
        Paint paint = this.f40738w;
        if (z10) {
            int sectionColorForDecoration = this.f40724a.getSectionColorForDecoration();
            paint.setColor(i0.a.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(sectionColorForDecoration))));
            float f11 = this.f40733f;
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
            this.d.l(canvas, rectF, valueOf, valueOf, Float.valueOf(f10));
        }
    }

    public final void p(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v9.p(android.graphics.Canvas):void");
    }

    public final void q(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.J;
        float f14 = f12 + min;
        l(canvas, 0, f10, f12, f10 + min, f14);
        l(canvas, 1, f11 - min, f12, f11, f14);
    }

    public final int r(float f10) {
        int sectionColorForDecoration = this.f40724a.getSectionColorForDecoration();
        return i0.a.k(i0.a.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(sectionColorForDecoration))), this.f40737s.getColor());
    }

    public final boolean s(int i7, View view) {
        if (view != null && i7 <= 0) {
            v4.i0 adapter = this.f40724a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.f40728c.a(Integer.valueOf(adapter.d(R - 1)))).booleanValue()) {
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
            ek0 ek0Var = this.f40724a;
            if (i7 >= ek0Var.getChildCount() - 1) {
                v4.i0 adapter = ek0Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.b() - 1) {
                    if (((Boolean) this.f40728c.a(Integer.valueOf(adapter.d(R + 1)))).booleanValue()) {
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
        return ((Boolean) this.f40726b.a(view)).booleanValue();
    }

    public final boolean v(int i7) {
        ek0 ek0Var = this.f40724a;
        v4.i0 adapter = ek0Var.getAdapter();
        if (i7 >= 0 && adapter != null && i7 < adapter.b()) {
            View T0 = ek0Var.T0(i7);
            if (T0 != null) {
                if (!u(T0) || ek0Var.h1(i7)) {
                    return false;
                }
                return true;
            }
            if (((Boolean) this.f40728c.a(Integer.valueOf(adapter.d(i7)))).booleanValue() && !ek0Var.h1(i7)) {
                return true;
            }
        }
        return false;
    }
}
