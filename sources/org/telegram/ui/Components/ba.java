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
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ba extends s4.n0 implements bh.a {
    public final RectF E;
    public Bitmap F;
    public float[] G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public xl0 L;
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
    public final zl0 f24874a;
    public boolean f24875a0;
    public final Utilities.CallbackReturn f24876b;
    public float[] f24877b0;
    public final Utilities.CallbackReturn f24878c;
    public int f24879c0;
    public final Utilities.Callback5 d;
    public float[] f24880d0;
    public final int f24881e;
    public int f24882e0;
    public final float f24883f;
    public final boolean h;
    public final Paint f24884n = new Paint(3);
    public final Paint f24885r = new Paint(3);
    public final Paint f24886s = new Paint();
    public final Paint v = new Paint();
    public final Paint f24887w;
    public final RectF f24888x;
    public final Rect f24889y;

    public ba(zl0 zl0Var, Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, pv pvVar, boolean z10, boolean z11, xl0 xl0Var) {
        Paint paint = new Paint();
        this.f24887w = paint;
        this.f24888x = new RectF();
        this.f24889y = new Rect();
        this.E = new RectF();
        this.G = new float[32];
        this.J = -1.0f;
        this.M = new float[128];
        this.N = new int[64];
        this.O = new short[96];
        this.V = new float[128];
        this.W = new float[128];
        this.X = new short[96];
        this.f24877b0 = new float[48];
        this.f24880d0 = new float[32];
        this.f24874a = zl0Var;
        this.f24876b = callbackReturn;
        this.f24878c = callbackReturn2;
        this.f24881e = i10;
        this.f24883f = f7;
        this.d = pvVar;
        this.h = z10;
        this.K = z11;
        this.L = xl0Var;
        paint.setColor(-1);
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        int dp;
        if (s(view)) {
            int i10 = this.f24881e;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.h0 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b10 = T.b()) != -1) {
                if (b10 == 0) {
                    if (this.h) {
                        dp = i10;
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    rect.top = dp;
                }
                if (b10 == adapter.h() - 1) {
                    rect.bottom = i10;
                }
            }
        }
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f450a = true;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        zl0 zl0Var = this.f24874a;
        if (recyclerView == zl0Var) {
            int sectionsBackgroundColorForDecoration = zl0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.f24886s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                this.F = null;
                this.J = -1.0f;
            }
            if (!this.K) {
                n(canvas);
                return;
            }
            int ordinal = this.L.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        k(canvas, 1.0f);
                        n(canvas);
                        return;
                    }
                    this.P = 0;
                    this.Q = 0;
                    this.R = 0;
                    this.S = true;
                    k(canvas, 0.0f);
                    n(canvas);
                    this.S = false;
                    int i10 = this.P;
                    if (i10 == 0) {
                        return;
                    }
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10, this.M, 0, null, 0, this.N, 0, this.O, 0, this.R, this.f24887w);
                    return;
                }
                int p5 = p(1.0f);
                Paint paint2 = this.v;
                paint2.setColor(p5);
                canvas.drawRect(0.0f, 0.0f, zl0Var.getWidth(), zl0Var.getHeight(), paint2);
                k(canvas, 0.0f);
                this.T = true;
                n(canvas);
                this.T = false;
                return;
            }
            canvas.drawRect(0.0f, 0.0f, zl0Var.getWidth(), zl0Var.getHeight(), paint);
            n(canvas);
        }
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        ba baVar = this;
        zl0 zl0Var = baVar.f24874a;
        if (recyclerView == zl0Var) {
            float f7 = baVar.f24883f;
            if (f7 > 0.0f) {
                int sectionsBackgroundColorForDecoration = zl0Var.getSectionsBackgroundColorForDecoration();
                Paint paint = baVar.f24886s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    baVar.F = null;
                    baVar.J = -1.0f;
                }
                boolean z10 = true;
                int max = Math.max(1, (int) Math.ceil(f7));
                Bitmap bitmap = baVar.F;
                Paint paint2 = baVar.f24885r;
                if (bitmap == null || baVar.I != max || baVar.J != f7) {
                    baVar.I = max;
                    baVar.J = f7;
                    int i11 = max * 2;
                    baVar.F = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(baVar.F);
                    canvas2.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f10 = max;
                    canvas2.drawCircle(f10, f10, f7, paint3);
                    Bitmap bitmap2 = baVar.F;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                z10 = (baVar.K && baVar.L == xl0.f32905b) ? false : false;
                baVar.f24875a0 = z10;
                if (z10) {
                    baVar.Y = 0;
                    baVar.Z = 0;
                }
                if (zl0Var.b0()) {
                    int paddingLeft = zl0Var.getPaddingLeft();
                    int i12 = baVar.f24881e;
                    float f11 = paddingLeft + i12;
                    float width = (zl0Var.getWidth() - zl0Var.getPaddingRight()) - i12;
                    float f12 = f7 * 0.2f;
                    for (int i13 = 0; i13 < baVar.f24882e0; i13 += 4) {
                        float[] fArr = baVar.f24880d0;
                        float f13 = fArr[i13];
                        float f14 = fArr[i13 + 1];
                        float f15 = fArr[i13 + 2];
                        float f16 = fArr[i13 + 3];
                        int i14 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                        if (i14 > 0 && i13 > 0) {
                            f15 = Math.min(f15, Math.max(0.0f, Math.min(1.0f, (f13 - fArr[i13 - 3]) / f12)));
                        }
                        if (i14 > 0 && (i10 = i13 + 4) < baVar.f24882e0) {
                            f16 = Math.min(f16, Math.max(0.0f, Math.min(1.0f, (baVar.f24880d0[i10] - f14) / f12)));
                        }
                        baVar.o(canvas, f11, width, f13, f15);
                        baVar.i(canvas, f11, width, f14, f16);
                    }
                } else {
                    int i15 = 0;
                    while (i15 < zl0Var.getChildCount()) {
                        View childAt = zl0Var.getChildAt(i15);
                        s4.c1 T = zl0Var.T(childAt);
                        int R = RecyclerView.R(childAt);
                        if (childAt != zl0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && baVar.s(childAt) && !zl0Var.i1(R))) {
                            float x10 = childAt.getX();
                            float width2 = x10 + childAt.getWidth();
                            if (!baVar.t(R - 1)) {
                                baVar.o(canvas, x10, width2, zl0.v1(childAt), 1.0f);
                            }
                            if (!baVar.t(R + 1)) {
                                baVar.i(canvas, x10, width2, zl0.H0(childAt), 1.0f);
                            }
                        }
                        i15++;
                        baVar = this;
                    }
                }
                if (zl0Var.L2 != null) {
                    for (int i16 = 0; i16 < zl0Var.L2.size(); i16++) {
                        long longValue = ((Long) zl0Var.L2.get(i16)).longValue();
                        View V0 = zl0Var.V0(AndroidUtilities.unpackA(longValue));
                        View V02 = zl0Var.V0(AndroidUtilities.unpackB(longValue));
                        if (V0 != null) {
                            o(canvas, V0.getX(), V0.getWidth() + V0.getX(), zl0.v1(V0), 1.0f);
                        }
                        if (V02 != null) {
                            i(canvas, V02.getX(), V02.getX() + V02.getWidth(), zl0.H0(V02), 1.0f);
                        }
                    }
                }
                if (this.f24875a0) {
                    this.f24875a0 = false;
                    int i17 = this.Y;
                    if (i17 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i17, this.V, 0, this.W, 0, null, 0, this.X, 0, this.Z, paint2);
                    }
                }
            }
        }
    }

    public final void e(float f7, float f10) {
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

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.U = true;
            n(canvas);
        } finally {
            this.U = false;
            canvas.restore();
        }
    }

    public final void g(float f7, float f10, float f11, float f12, int i10) {
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

    public final void h(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f11 > f7 && f12 > f10) {
            boolean z10 = this.S;
            Paint paint = this.f24886s;
            if (z10) {
                g(f7, f10, f11, f12, paint.getColor());
            } else {
                canvas.drawRect(f7, f10, f11, f12, paint);
            }
        }
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f12) * this.I;
        float f13 = f11 - min;
        j(canvas, 2, f7, f13, f7 + min, f11);
        j(canvas, 3, f10 - min, f13, f10, f11);
    }

    public final void j(Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
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
        if (this.f24875a0) {
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
        Rect rect = this.f24889y;
        rect.set(i11, i12, i11 + i33, i33 + i12);
        RectF rectF = this.E;
        rectF.set(f7, f10, f11, f12);
        canvas.drawBitmap(this.F, rect, rectF, this.f24884n);
    }

    public final void k(Canvas canvas, float f7) {
        float f10;
        float f11;
        ba baVar;
        float f12;
        float f13;
        zl0 zl0Var = this.f24874a;
        float width = zl0Var.getWidth();
        float height = zl0Var.getHeight();
        int paddingLeft = zl0Var.getPaddingLeft();
        int i10 = this.f24881e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i10));
        float max2 = Math.max(max, Math.min(width, (width - zl0Var.getPaddingRight()) - i10));
        if (max >= max2) {
            h(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        this.H = 0;
        for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
            View childAt = zl0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            s4.c1 T = zl0Var.T(childAt);
            if (childAt != zl0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!zl0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && s(childAt) && !zl0Var.i1(R))) {
                float v12 = zl0.v1(childAt);
                float H0 = zl0.H0(childAt);
                if (childAt instanceof y80) {
                    H0 -= ((y80) childAt).getBottomInfoMargin();
                }
                e(v12, H0);
            }
        }
        if (zl0Var.L2 != null) {
            for (int i12 = 0; i12 < zl0Var.L2.size(); i12++) {
                long longValue = ((Long) zl0Var.L2.get(i12)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float f14 = height;
                float f15 = 0.0f;
                for (int i13 = 0; i13 < zl0Var.getChildCount(); i13++) {
                    View childAt2 = zl0Var.getChildAt(i13);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= unpackA && R2 <= unpackB) {
                        f14 = Math.min(f14, zl0.v1(childAt2));
                        f15 = Math.max(f15, zl0.H0(childAt2));
                    }
                }
                e(f14, f15);
            }
        }
        int i14 = 2;
        for (int i15 = 2; i15 < this.H; i15 += 2) {
            float[] fArr = this.G;
            float f16 = fArr[i15];
            float f17 = fArr[i15 + 1];
            int i16 = i15 - 2;
            while (i16 >= 0) {
                float[] fArr2 = this.G;
                float f18 = fArr2[i16];
                if (f18 > f16) {
                    fArr2[i16 + 2] = f18;
                    fArr2[i16 + 3] = fArr2[i16 + 1];
                    i16 -= 2;
                }
            }
            float[] fArr3 = this.G;
            fArr3[i16 + 2] = f16;
            fArr3[i16 + 3] = f17;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.H; i18 += 2) {
            float max3 = Math.max(0.0f, this.G[i18]);
            float min = Math.min(height, this.G[i18 + 1]);
            if (min > max3) {
                if (i17 > 0) {
                    float[] fArr4 = this.G;
                    int i19 = i17 - 1;
                    float f19 = fArr4[i19];
                    if (max3 <= f19 + f7) {
                        fArr4[i19] = Math.max(f19, min);
                    }
                }
                float[] fArr5 = this.G;
                int i20 = i17 + 1;
                fArr5[i17] = max3;
                i17 += 2;
                fArr5[i20] = min;
            }
        }
        this.H = i17;
        if (i17 == 0) {
            h(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        float[] fArr6 = this.G;
        float f20 = fArr6[0];
        float f21 = fArr6[i17 - 1];
        int i21 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
        if (i21 > 0) {
            h(canvas, 0.0f, 0.0f, width, Math.min(height, f20 + f7));
        }
        int i22 = (f21 > height ? 1 : (f21 == height ? 0 : -1));
        if (i22 < 0) {
            h(canvas, 0.0f, Math.max(0.0f, f21 - f7), width, height);
        }
        if (i21 > 0) {
            f10 = f20;
        } else {
            f10 = 0.0f;
        }
        if (i22 < 0) {
            f11 = f21;
        } else {
            f11 = height;
        }
        if (f11 > f10) {
            h(canvas, 0.0f, f10, Math.min(width, max + f7), f11);
            baVar = this;
            baVar.h(canvas, Math.max(0.0f, max2 - f7), f10, width, f11);
        } else {
            baVar = this;
        }
        while (i14 < baVar.H) {
            float[] fArr7 = baVar.G;
            float f22 = fArr7[i14 - 1];
            float f23 = fArr7[i14];
            if (f23 > f22) {
                f12 = max;
                f13 = max2;
                baVar.h(canvas, f12, Math.max(0.0f, f22 - f7), f13, Math.min(height, f23 + f7));
            } else {
                f12 = max;
                f13 = max2;
            }
            i14 += 2;
            baVar = this;
            max = f12;
            max2 = f13;
        }
    }

    public final void l(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        float f7;
        zl0 zl0Var;
        float f10;
        if (view != null && view2 != null) {
            float f11 = 0.0f;
            if (view2 instanceof y80) {
                f7 = ((y80) view2).getBottomInfoMargin();
            } else {
                f7 = 0.0f;
            }
            float left = view.getLeft();
            this.f24874a.getClass();
            float f12 = this.f24883f;
            float f13 = -f12;
            float v12 = zl0.v1(view);
            if (z10) {
                f10 = f12;
            } else {
                f10 = 0.0f;
            }
            float max = Math.max(f13, v12 - f10);
            float right = view.getRight();
            float height = zl0Var.getHeight() - (-f12);
            float H0 = zl0.H0(view2);
            if (z11) {
                f11 = f12;
            }
            float min = Math.min(height, (H0 + f11) - f7);
            RectF rectF = this.f24888x;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                m(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void m(Canvas canvas, RectF rectF, float f7) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z10 = this.U;
        Paint paint = this.v;
        if (z10) {
            int sectionColorForDecoration = this.f24874a.getSectionColorForDecoration();
            paint.setColor(i0.a.k(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(sectionColorForDecoration))));
            float f10 = this.f24883f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else if (this.K) {
            paint.setColor(p(f7));
            if (this.T && f7 >= 1.0f) {
                return;
            }
            if (this.S) {
                g(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        } else {
            this.d.mo17run(canvas, rectF, valueOf, valueOf, Float.valueOf(f7));
        }
    }

    public final void n(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ba.n(android.graphics.Canvas):void");
    }

    public final void o(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f12) * this.I;
        float f13 = f11 + min;
        j(canvas, 0, f7, f11, f7 + min, f13);
        j(canvas, 1, f10 - min, f11, f10, f13);
    }

    public final int p(float f7) {
        int sectionColorForDecoration = this.f24874a.getSectionColorForDecoration();
        return i0.a.h(i0.a.k(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(sectionColorForDecoration))), this.f24886s.getColor());
    }

    public final boolean q(int i10, View view) {
        if (view != null && i10 <= 0) {
            s4.h0 adapter = this.f24874a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.f24878c.run(Integer.valueOf(adapter.j(R - 1)))).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean r(int i10, View view) {
        if (view != null) {
            zl0 zl0Var = this.f24874a;
            if (i10 >= zl0Var.getChildCount() - 1) {
                s4.h0 adapter = zl0Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.h() - 1) {
                    if (((Boolean) this.f24878c.run(Integer.valueOf(adapter.j(R + 1)))).booleanValue()) {
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

    public final boolean s(View view) {
        return ((Boolean) this.f24876b.run(view)).booleanValue();
    }

    public final boolean t(int i10) {
        zl0 zl0Var = this.f24874a;
        s4.h0 adapter = zl0Var.getAdapter();
        if (i10 >= 0 && adapter != null && i10 < adapter.h()) {
            View V0 = zl0Var.V0(i10);
            if (V0 != null) {
                if (!s(V0) || zl0Var.i1(i10)) {
                    return false;
                }
                return true;
            }
            if (((Boolean) this.f24878c.run(Integer.valueOf(adapter.j(i10)))).booleanValue() && !zl0Var.i1(i10)) {
                return true;
            }
        }
        return false;
    }
}
