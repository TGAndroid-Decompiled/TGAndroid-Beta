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
public final class l9 extends s4.m0 implements ug.a {
    public final Rect D;
    public final RectF E;
    public Bitmap F;
    public float[] G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public sk0 L;
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
    public final uk0 f28082a;
    public boolean f28083a0;
    public final org.telegram.messenger.s20 f28084b;
    public float[] f28085b0;
    public final org.telegram.messenger.s20 f28086c;
    public int f28087c0;
    public final org.telegram.messenger.p20 d;
    public float[] f28088d0;
    public final int e;
    public int f28089e0;
    public final float f28090f;
    public final boolean h;
    public final Paint f28091n = new Paint(3);
    public final Paint f28092r = new Paint(3);
    public final Paint f28093s = new Paint();
    public final Paint f28094w = new Paint();
    public final Paint f28095x;
    public final RectF f28096y;

    public l9(uk0 uk0Var, org.telegram.messenger.s20 s20Var, org.telegram.messenger.s20 s20Var2, int i10, float f7, px pxVar, boolean z10, boolean z11, sk0 sk0Var) {
        Paint paint = new Paint();
        this.f28095x = paint;
        this.f28096y = new RectF();
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
        this.f28085b0 = new float[48];
        this.f28088d0 = new float[32];
        this.f28082a = uk0Var;
        this.f28084b = s20Var;
        this.f28086c = s20Var2;
        this.e = i10;
        this.f28090f = f7;
        this.d = pxVar;
        this.h = z10;
        this.K = z11;
        this.L = sk0Var;
        paint.setColor(-1);
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        int L;
        if (u(view)) {
            int i10 = this.e;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.g0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                if (b10 == 0) {
                    if (this.h) {
                        L = i10;
                    } else {
                        L = org.telegram.messenger.i0.L(4.0f);
                    }
                    rect.top = L;
                }
                if (b10 == adapter.b() - 1) {
                    rect.bottom = i10;
                }
            }
        }
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
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        uk0 uk0Var = this.f28082a;
        if (recyclerView == uk0Var) {
            int sectionsBackgroundColorForDecoration = uk0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.f28093s;
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
                    int i10 = this.P;
                    if (i10 == 0) {
                        return;
                    }
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10, this.M, 0, null, 0, this.N, 0, this.O, 0, this.R, this.f28095x);
                    return;
                }
                int r10 = r(1.0f);
                Paint paint2 = this.f28094w;
                paint2.setColor(r10);
                canvas.drawRect(0.0f, 0.0f, uk0Var.getWidth(), uk0Var.getHeight(), paint2);
                m(canvas, 0.0f);
                this.T = true;
                p(canvas);
                this.T = false;
                return;
            }
            canvas.drawRect(0.0f, 0.0f, uk0Var.getWidth(), uk0Var.getHeight(), paint);
            p(canvas);
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i10;
        l9 l9Var = this;
        uk0 uk0Var = l9Var.f28082a;
        if (recyclerView == uk0Var) {
            float f7 = l9Var.f28090f;
            if (f7 > 0.0f) {
                int sectionsBackgroundColorForDecoration = uk0Var.getSectionsBackgroundColorForDecoration();
                Paint paint = l9Var.f28093s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    l9Var.F = null;
                    l9Var.J = -1.0f;
                }
                boolean z10 = true;
                int max = Math.max(1, (int) Math.ceil(f7));
                Bitmap bitmap = l9Var.F;
                Paint paint2 = l9Var.f28092r;
                if (bitmap == null || l9Var.I != max || l9Var.J != f7) {
                    l9Var.I = max;
                    l9Var.J = f7;
                    int i11 = max * 2;
                    l9Var.F = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(l9Var.F);
                    canvas3.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f10 = max;
                    canvas3.drawCircle(f10, f10, f7, paint3);
                    Bitmap bitmap2 = l9Var.F;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                z10 = (l9Var.K && l9Var.L == sk0.f30327b) ? false : false;
                l9Var.f28083a0 = z10;
                if (z10) {
                    l9Var.Y = 0;
                    l9Var.Z = 0;
                }
                if (uk0Var.b0()) {
                    int paddingLeft = uk0Var.getPaddingLeft();
                    int i12 = l9Var.e;
                    float f11 = paddingLeft + i12;
                    float width = (uk0Var.getWidth() - uk0Var.getPaddingRight()) - i12;
                    float f12 = f7 * 0.2f;
                    for (int i13 = 0; i13 < l9Var.f28089e0; i13 += 4) {
                        float[] fArr = l9Var.f28088d0;
                        float f13 = fArr[i13];
                        float f14 = fArr[i13 + 1];
                        float f15 = fArr[i13 + 2];
                        float f16 = fArr[i13 + 3];
                        int i14 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                        if (i14 > 0 && i13 > 0) {
                            f15 = Math.min(f15, Math.max(0.0f, Math.min(1.0f, (f13 - fArr[i13 - 3]) / f12)));
                        }
                        if (i14 > 0 && (i10 = i13 + 4) < l9Var.f28089e0) {
                            f16 = Math.min(f16, Math.max(0.0f, Math.min(1.0f, (l9Var.f28088d0[i10] - f14) / f12)));
                        }
                        int i15 = 0;
                        while (true) {
                            if (i15 < uk0Var.getChildCount()) {
                                View childAt = uk0Var.getChildAt(i15);
                                if (uk0.a1(childAt) && Math.abs(uk0.v1(childAt) - f13) < 1.0f) {
                                    canvas2 = canvas;
                                    break;
                                }
                                i15++;
                            } else {
                                canvas2 = canvas;
                                l9Var.q(canvas2, f11, width, f13, f15);
                                l9Var = this;
                                break;
                            }
                        }
                        l9Var.k(canvas2, f11, width, f14, f16);
                    }
                } else {
                    int i16 = 0;
                    while (i16 < uk0Var.getChildCount()) {
                        View childAt2 = uk0Var.getChildAt(i16);
                        s4.c1 T = uk0Var.T(childAt2);
                        int R = RecyclerView.R(childAt2);
                        if (childAt2 != uk0Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && l9Var.u(childAt2) && !uk0Var.h1(R))) {
                            float x10 = childAt2.getX();
                            float width2 = x10 + childAt2.getWidth();
                            if (!l9Var.v(R - 1) && !uk0.a1(childAt2)) {
                                l9Var.q(canvas, x10, width2, uk0.v1(childAt2), 1.0f);
                            }
                            if (!l9Var.v(R + 1)) {
                                l9Var.k(canvas, x10, width2, uk0.G0(childAt2), 1.0f);
                            }
                        }
                        i16++;
                        l9Var = this;
                    }
                }
                if (uk0Var.K2 != null) {
                    for (int i17 = 0; i17 < uk0Var.K2.size(); i17++) {
                        long longValue = ((Long) uk0Var.K2.get(i17)).longValue();
                        Typeface typeface = org.telegram.messenger.i0.f16145a;
                        View T0 = uk0Var.T0((int) (longValue >> 32));
                        View T02 = uk0Var.T0((int) longValue);
                        if (T0 != null && !uk0.a1(T0)) {
                            q(canvas, T0.getX(), T0.getWidth() + T0.getX(), uk0.v1(T0), 1.0f);
                        }
                        if (T02 != null) {
                            k(canvas, T02.getX(), T02.getX() + T02.getWidth(), uk0.G0(T02), 1.0f);
                        }
                    }
                }
                if (this.f28083a0) {
                    this.f28083a0 = false;
                    int i18 = this.Y;
                    if (i18 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i18, this.V, 0, this.W, 0, null, 0, this.X, 0, this.Z, paint2);
                    }
                }
            }
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f7259b = true;
    }

    public final void h(float f7, float f10) {
        if (f10 <= f7) {
            return;
        }
        int i10 = this.H;
        int i11 = i10 + 2;
        float[] fArr = this.G;
        if (i11 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.G = fArr2;
        }
        float[] fArr3 = this.G;
        int i12 = this.H;
        int i13 = i12 + 1;
        this.H = i13;
        fArr3[i12] = f7;
        this.H = i12 + 2;
        fArr3[i13] = f10;
    }

    public final void i(float f7, float f10, float f11, float f12, int i10) {
        if (f11 > f7 && f12 > f10) {
            int i11 = this.P;
            int i12 = i11 + 8;
            float[] fArr = this.M;
            if (i12 > fArr.length) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, i11);
                this.M = fArr2;
            }
            int i13 = this.Q;
            int i14 = i13 + 4;
            int[] iArr = this.N;
            if (i14 > iArr.length) {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i13);
                this.N = iArr2;
            }
            int i15 = this.R;
            int i16 = i15 + 6;
            short[] sArr = this.O;
            if (i16 > sArr.length) {
                short[] sArr2 = new short[sArr.length * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i15);
                this.O = sArr2;
            }
            int i17 = this.Q;
            float[] fArr3 = this.M;
            int i18 = this.P;
            int i19 = i18 + 1;
            this.P = i19;
            fArr3[i18] = f7;
            int i20 = i18 + 2;
            this.P = i20;
            fArr3[i19] = f10;
            int i21 = i18 + 3;
            this.P = i21;
            fArr3[i20] = f11;
            int i22 = i18 + 4;
            this.P = i22;
            fArr3[i21] = f10;
            int i23 = i18 + 5;
            this.P = i23;
            fArr3[i22] = f7;
            int i24 = i18 + 6;
            this.P = i24;
            fArr3[i23] = f12;
            int i25 = i18 + 7;
            this.P = i25;
            fArr3[i24] = f11;
            this.P = i18 + 8;
            fArr3[i25] = f12;
            int[] iArr3 = this.N;
            int i26 = i17 + 1;
            this.Q = i26;
            iArr3[i17] = i10;
            int i27 = i17 + 2;
            this.Q = i27;
            iArr3[i26] = i10;
            int i28 = i17 + 3;
            this.Q = i28;
            iArr3[i27] = i10;
            this.Q = i17 + 4;
            iArr3[i28] = i10;
            short[] sArr3 = this.O;
            int i29 = this.R;
            int i30 = i29 + 1;
            this.R = i30;
            sArr3[i29] = (short) i17;
            int i31 = i29 + 2;
            this.R = i31;
            short s10 = (short) (i17 + 1);
            sArr3[i30] = s10;
            int i32 = i29 + 3;
            this.R = i32;
            short s11 = (short) (i17 + 2);
            sArr3[i31] = s11;
            int i33 = i29 + 4;
            this.R = i33;
            sArr3[i32] = s11;
            int i34 = i29 + 5;
            this.R = i34;
            sArr3[i33] = s10;
            this.R = i29 + 6;
            sArr3[i34] = (short) (i17 + 3);
        }
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f11 > f7 && f12 > f10) {
            boolean z10 = this.S;
            Paint paint = this.f28093s;
            if (z10) {
                i(f7, f10, f11, f12, paint.getColor());
            } else {
                canvas.drawRect(f7, f10, f11, f12, paint);
            }
        }
    }

    public final void k(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f12) * this.I;
        float f13 = f11 - min;
        l(canvas, 2, f7, f13, f7 + min, f11);
        l(canvas, 3, f10 - min, f13, f10, f11);
    }

    public final void l(Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        int i11;
        int i12;
        if ((i10 & 1) == 0) {
            i11 = 0;
        } else {
            i11 = this.I;
        }
        if (i10 < 2) {
            i12 = 0;
        } else {
            i12 = this.I;
        }
        if (this.f28083a0) {
            float f13 = i11;
            float f14 = i12;
            int i13 = this.I;
            float f15 = i11 + i13;
            float f16 = i12 + i13;
            int i14 = this.Y;
            int i15 = i14 + 8;
            float[] fArr = this.V;
            if (i15 > fArr.length) {
                int length = fArr.length * 2;
                float[] fArr2 = new float[length];
                float[] fArr3 = new float[length];
                System.arraycopy(fArr, 0, fArr2, 0, i14);
                System.arraycopy(this.W, 0, fArr3, 0, this.Y);
                this.V = fArr2;
                this.W = fArr3;
            }
            int i16 = this.Z;
            int i17 = i16 + 6;
            short[] sArr = this.X;
            if (i17 > sArr.length) {
                short[] sArr2 = new short[sArr.length * 2];
                System.arraycopy(sArr, 0, sArr2, 0, i16);
                this.X = sArr2;
            }
            int i18 = this.Y;
            int i19 = i18 >> 1;
            float[] fArr4 = this.V;
            fArr4[i18] = f7;
            float[] fArr5 = this.W;
            int i20 = i18 + 1;
            this.Y = i20;
            fArr5[i18] = f13;
            fArr4[i20] = f10;
            int i21 = i18 + 2;
            this.Y = i21;
            fArr5[i20] = f14;
            fArr4[i21] = f11;
            int i22 = i18 + 3;
            this.Y = i22;
            fArr5[i21] = f15;
            fArr4[i22] = f10;
            int i23 = i18 + 4;
            this.Y = i23;
            fArr5[i22] = f14;
            fArr4[i23] = f7;
            int i24 = i18 + 5;
            this.Y = i24;
            fArr5[i23] = f13;
            fArr4[i24] = f12;
            int i25 = i18 + 6;
            this.Y = i25;
            fArr5[i24] = f16;
            fArr4[i25] = f11;
            int i26 = i18 + 7;
            this.Y = i26;
            fArr5[i25] = f15;
            fArr4[i26] = f12;
            this.Y = i18 + 8;
            fArr5[i26] = f16;
            short[] sArr3 = this.X;
            int i27 = this.Z;
            int i28 = i27 + 1;
            this.Z = i28;
            sArr3[i27] = (short) i19;
            int i29 = i27 + 2;
            this.Z = i29;
            short s10 = (short) (i19 + 1);
            sArr3[i28] = s10;
            int i30 = i27 + 3;
            this.Z = i30;
            short s11 = (short) (i19 + 2);
            sArr3[i29] = s11;
            int i31 = i27 + 4;
            this.Z = i31;
            sArr3[i30] = s11;
            int i32 = i27 + 5;
            this.Z = i32;
            sArr3[i31] = s10;
            this.Z = i27 + 6;
            sArr3[i32] = (short) (i19 + 3);
            return;
        }
        int i33 = this.I;
        Rect rect = this.D;
        rect.set(i11, i12, i11 + i33, i33 + i12);
        RectF rectF = this.E;
        rectF.set(f7, f10, f11, f12);
        canvas.drawBitmap(this.F, rect, rectF, this.f28091n);
    }

    public final void m(Canvas canvas, float f7) {
        float f10;
        float f11;
        l9 l9Var;
        float f12;
        float f13;
        uk0 uk0Var = this.f28082a;
        float width = uk0Var.getWidth();
        float height = uk0Var.getHeight();
        int paddingLeft = uk0Var.getPaddingLeft();
        int i10 = this.e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i10));
        float max2 = Math.max(max, Math.min(width, (width - uk0Var.getPaddingRight()) - i10));
        if (max >= max2) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        this.H = 0;
        for (int i11 = 0; i11 < uk0Var.getChildCount(); i11++) {
            View childAt = uk0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            s4.c1 T = uk0Var.T(childAt);
            if (childAt != uk0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!uk0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !uk0Var.h1(R))) {
                float v12 = uk0.v1(childAt);
                float G0 = uk0.G0(childAt);
                if (childAt instanceof y70) {
                    G0 -= ((y70) childAt).getBottomInfoMargin();
                }
                h(v12, G0);
            }
        }
        if (uk0Var.K2 != null) {
            for (int i12 = 0; i12 < uk0Var.K2.size(); i12++) {
                long longValue = ((Long) uk0Var.K2.get(i12)).longValue();
                Typeface typeface = org.telegram.messenger.i0.f16145a;
                int i13 = (int) (longValue >> 32);
                int i14 = (int) longValue;
                float f14 = height;
                float f15 = 0.0f;
                for (int i15 = 0; i15 < uk0Var.getChildCount(); i15++) {
                    View childAt2 = uk0Var.getChildAt(i15);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= i13 && R2 <= i14) {
                        f14 = Math.min(f14, uk0.v1(childAt2));
                        f15 = Math.max(f15, uk0.G0(childAt2));
                    }
                }
                h(f14, f15);
            }
        }
        int i16 = 2;
        for (int i17 = 2; i17 < this.H; i17 += 2) {
            float[] fArr = this.G;
            float f16 = fArr[i17];
            float f17 = fArr[i17 + 1];
            int i18 = i17 - 2;
            while (i18 >= 0) {
                float[] fArr2 = this.G;
                float f18 = fArr2[i18];
                if (f18 > f16) {
                    fArr2[i18 + 2] = f18;
                    fArr2[i18 + 3] = fArr2[i18 + 1];
                    i18 -= 2;
                }
            }
            float[] fArr3 = this.G;
            fArr3[i18 + 2] = f16;
            fArr3[i18 + 3] = f17;
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.H; i20 += 2) {
            float max3 = Math.max(0.0f, this.G[i20]);
            float min = Math.min(height, this.G[i20 + 1]);
            if (min > max3) {
                if (i19 > 0) {
                    float[] fArr4 = this.G;
                    int i21 = i19 - 1;
                    float f19 = fArr4[i21];
                    if (max3 <= f19 + f7) {
                        fArr4[i21] = Math.max(f19, min);
                    }
                }
                float[] fArr5 = this.G;
                int i22 = i19 + 1;
                fArr5[i19] = max3;
                i19 += 2;
                fArr5[i22] = min;
            }
        }
        this.H = i19;
        if (i19 == 0) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        float[] fArr6 = this.G;
        float f20 = fArr6[0];
        float f21 = fArr6[i19 - 1];
        int i23 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
        if (i23 > 0) {
            j(canvas, 0.0f, 0.0f, width, Math.min(height, f20 + f7));
        }
        int i24 = (f21 > height ? 1 : (f21 == height ? 0 : -1));
        if (i24 < 0) {
            j(canvas, 0.0f, Math.max(0.0f, f21 - f7), width, height);
        }
        if (i23 > 0) {
            f10 = f20;
        } else {
            f10 = 0.0f;
        }
        if (i24 < 0) {
            f11 = f21;
        } else {
            f11 = height;
        }
        if (f11 > f10) {
            j(canvas, 0.0f, f10, Math.min(width, max + f7), f11);
            l9Var = this;
            l9Var.j(canvas, Math.max(0.0f, max2 - f7), f10, width, f11);
        } else {
            l9Var = this;
        }
        while (i16 < l9Var.H) {
            float[] fArr7 = l9Var.G;
            float f22 = fArr7[i16 - 1];
            float f23 = fArr7[i16];
            if (f23 > f22) {
                f12 = max;
                f13 = max2;
                l9Var.j(canvas, f12, Math.max(0.0f, f22 - f7), f13, Math.min(height, f23 + f7));
            } else {
                f12 = max;
                f13 = max2;
            }
            i16 += 2;
            l9Var = this;
            max = f12;
            max2 = f13;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        uk0 uk0Var;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof y70) {
                f7 = ((y70) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            float left = view.getLeft();
            this.f28082a.getClass();
            float f12 = this.f28090f;
            float sectionsOverscanTop = (-f12) - uk0Var.getSectionsOverscanTop();
            float v12 = uk0.v1(view);
            if (z10) {
                f10 = f12;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(sectionsOverscanTop, v12 - f10);
            float right = view.getRight();
            float height = uk0Var.getHeight() - (-f12);
            float G0 = uk0.G0(view2);
            if (z11) {
                f11 = f12;
            }
            float min = Math.min(height, (G0 + f11) - f7);
            RectF rectF = this.f28096y;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                o(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f7) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z10 = this.U;
        Paint paint = this.f28094w;
        if (z10) {
            int sectionColorForDecoration = this.f28082a.getSectionColorForDecoration();
            paint.setColor(i0.b.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(sectionColorForDecoration))));
            float f10 = this.f28090f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else if (this.K) {
            paint.setColor(r(f7));
            if (this.T && f7 >= 1.0f) {
                return;
            }
            if (this.S) {
                i(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        } else {
            this.d.k(canvas, rectF, valueOf, valueOf, Float.valueOf(f7));
        }
    }

    public final void p(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l9.p(android.graphics.Canvas):void");
    }

    public final void q(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f12) * this.I;
        float f13 = f11 + min;
        l(canvas, 0, f7, f11, f7 + min, f13);
        l(canvas, 1, f10 - min, f11, f10, f13);
    }

    public final int r(float f7) {
        int sectionColorForDecoration = this.f28082a.getSectionColorForDecoration();
        return i0.b.k(i0.b.o(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(sectionColorForDecoration))), this.f28093s.getColor());
    }

    public final boolean s(int i10, View view) {
        if (view != null && i10 <= 0) {
            s4.g0 adapter = this.f28082a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.f28086c.a(Integer.valueOf(adapter.d(R - 1)))).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean t(int i10, View view) {
        if (view != null) {
            uk0 uk0Var = this.f28082a;
            if (i10 >= uk0Var.getChildCount() - 1) {
                s4.g0 adapter = uk0Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.b() - 1) {
                    if (((Boolean) this.f28086c.a(Integer.valueOf(adapter.d(R + 1)))).booleanValue()) {
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
        return ((Boolean) this.f28084b.a(view)).booleanValue();
    }

    public final boolean v(int i10) {
        uk0 uk0Var = this.f28082a;
        s4.g0 adapter = uk0Var.getAdapter();
        if (i10 >= 0 && adapter != null && i10 < adapter.b()) {
            View T0 = uk0Var.T0(i10);
            if (T0 != null) {
                if (!u(T0) || uk0Var.h1(i10)) {
                    return false;
                }
                return true;
            }
            if (((Boolean) this.f28086c.a(Integer.valueOf(adapter.d(i10)))).booleanValue() && !uk0Var.h1(i10)) {
                return true;
            }
        }
        return false;
    }
}
