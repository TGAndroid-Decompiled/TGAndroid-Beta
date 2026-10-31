package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.do0;
public class l6 extends FrameLayout implements us {
    public static Typeface f34842j0;
    public static Typeface f34843k0;
    public final g6 D;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final org.telegram.ui.ActionBar.q2 G;
    public final do0 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.t5 K;
    public final View L;
    public final LinearLayout M;
    public final j6 N;
    public final j6 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public k0 W;
    public boolean f34844a;
    public float[] f34845a0;
    public float f34846b;
    public int f34847b0;
    public final Matrix f34848c;
    public int f34849c0;
    public final Matrix d;
    public float f34850d0;
    public final Matrix e;
    public float f34851e0;
    public final RectF f34852f;
    public final org.telegram.ui.Components.t5 f34853f0;
    public final org.telegram.ui.Components.t5 f34854g0;
    public float h;
    public t6 f34855h0;
    public boolean f34856i0;
    public boolean f34857n;
    public float f34858r;
    public float f34859s;
    public final Matrix f34860w;
    public final Matrix f34861x;
    public final Matrix f34862y;

    public l6(Context context) {
        this(context, 2131232808, 46);
    }

    public static void a(final l6 l6Var, final Canvas canvas, float f7) {
        float f10;
        float height = l6Var.getFrontFace().getHeight();
        float width = l6Var.getFrontFace().getWidth() / 1640.0f;
        Paint paint = l6Var.I;
        Context context = l6Var.getContext();
        if (f34842j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f34842j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f34842j0 = org.telegram.messenger.i0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(f34842j0);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = l6Var.f34845a0;
        int b10 = v7.b(0, fArr);
        int b11 = v7.b(1, fArr);
        if (fArr != null && fArr.length >= 18) {
            f10 = fArr[8];
        } else {
            f10 = 0.0f;
        }
        paint.setColor(i0.b.f(f10, b10, b11));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f11 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f12 = width * 27.333332f;
        final String[] split = f(l6Var.Q).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        l6Var.c(f7, new d3(l6Var, 2), new Runnable() {
            @Override
            public final void run() {
                l6 l6Var2 = l6.this;
                l6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f13 = f12;
                float f14 = f11;
                Paint paint2 = l6Var2.I;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f13) + f14, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f13 + f14, paint2);
                }
            }
        });
        canvas.restore();
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder e(long j10) {
        return k0.q(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(k0.p(j10, false))), 0.8f);
    }

    public static String f(String str) {
        char c10;
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        for (int i10 = 0; i10 < split.length; i10++) {
            if (i10 > 0) {
                if (i10 == length) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            sb2.append(split[i10]);
        }
        return sb2.toString();
    }

    public static void k(View view, Matrix matrix) {
        if (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            k(view2, matrix);
            matrix.preTranslate(view.getLeft() - view2.getScrollX(), view.getTop() - view2.getScrollY());
            matrix.preConcat(view.getMatrix());
            return;
        }
        matrix.reset();
    }

    public final float b() {
        float c10 = this.N.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.S) - 48.0f) * this.E.getWidth()) / 336.0f) - this.P.leftMargin) - org.telegram.messenger.i0.L(8.0f));
        if (c10 <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c10);
    }

    public final void c(float f7, d3 d3Var, Runnable runnable) {
        float f10;
        if (f7 > 0.0f) {
            f10 = org.telegram.messenger.i0.L(5.0f);
        } else {
            f10 = 0.0f;
        }
        d3Var.a(f10, org.telegram.messenger.i0.L(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        d3Var.a(org.telegram.messenger.i0.N(1.5f), 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.f34856i0 = true;
        runnable.run();
        this.f34856i0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19582a4) {
            Object obj = objArr[0];
            k0 k0Var = this.W;
            if (obj == k0Var) {
                l(k0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            View view2 = (View) this.E.getParent();
            g6 g6Var = this.D;
            Matrix matrix2 = this.f34860w;
            matrix2.set((Matrix) g6Var.e.d);
            f6 f6Var = g6Var.f34560f;
            matrix2.preTranslate(f6Var.getLeft(), f6Var.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(this.E.getLeft() - view2.getScrollX(), this.E.getTop() - view2.getScrollY());
            matrix.preConcat(this.E.getMatrix());
            Matrix matrix3 = this.f34861x;
            k(view, matrix3);
            Matrix matrix4 = this.f34862y;
            if (matrix3.invert(matrix4)) {
                matrix.postConcat(matrix4);
                return true;
            }
            return false;
        }
        return false;
    }

    public View getBalanceAnchor() {
        return this.L;
    }

    public LinearLayout getBalanceLayout() {
        return this.M;
    }

    public org.telegram.ui.Components.f6 getBalanceView() {
        return this.N;
    }

    public TextView getCardHolderView() {
        return this.G;
    }

    public float getCardRotationX() {
        return this.D.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.D.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.E;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.E.indexOfChild(this.G);
        int indexOfChild2 = this.E.indexOfChild(this.M);
        if (indexOfChild < 0) {
            if (indexOfChild2 < 0) {
                return this.E.getChildCount();
            }
            return indexOfChild2;
        } else if (indexOfChild2 < 0) {
            return indexOfChild;
        } else {
            return Math.min(indexOfChild, indexOfChild2);
        }
    }

    public ArrayList<RectF> getStickerObstacles() {
        j6 j6Var;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.E.getWidth() / 336.0f;
        float b10 = b();
        j6 j6Var2 = this.N;
        float c10 = this.O.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.P;
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((j6Var2.getBottom() + j6Var2.getTop()) / 2.0f) + f10;
        float height = (j6Var2.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, (j6Var2.getDrawable().c() * b10) + f7, bottom + height));
        org.telegram.ui.ActionBar.q2 q2Var = this.G;
        arrayList.add(new RectF(q2Var.getLeft(), q2Var.getTop(), q2Var.getLeft() + Math.min(q2Var.getWidth(), q2Var.getPaint().measureText(q2Var.getText().toString())), q2Var.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f7, j6Var.getTop() + f10, c10 + f7, f10 + j6Var.getBottom()));
        if (this.f34844a) {
            rectF = new RectF(this.f34852f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f34845a0;
    }

    public org.telegram.ui.Components.f6 getUsdBalanceView() {
        return this.O;
    }

    public final void h(Path path, float f7, float f10) {
        path.rewind();
        float f11 = 336 - this.S;
        path.addRoundRect(((f11 - 48.0f) * f7) / 336.0f, 0.36097562f * f10, (f11 * f7) / 336.0f, 0.5365854f * f10, (f7 * 8.0f) / 336.0f, 0.03902439f * f10, Path.Direction.CW);
    }

    public final void i(float f7, float f10) {
        if (this.T == f7 && this.U == f10) {
            return;
        }
        this.T = f7;
        if (f7 == 0.0f) {
            this.f34857n = false;
        }
        this.U = f10;
        this.N.invalidate();
        this.O.invalidate();
    }

    public final void j(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z10 = false;
        spannableString.setSpan(new k6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cd.L0(2131749525, null));
        spannableStringBuilder.setSpan(new bi.m6(this, 5), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round((j10 / 1.0E9d) * ((org.telegram.messenger.k0) vp.r1(i10).f18957y7.f17844l.f13480b).f16499a * 100.0d);
        org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
        if (round % 100 == 0) {
            z10 = true;
        }
        i11.getClass();
        this.O.setText(org.telegram.messenger.u1.g("USD", 2, round, z10));
    }

    public final void l(k0 k0Var) {
        if (k0Var != null) {
            int i10 = k0Var.f34776a;
            setCardHolder(h20.p(d20.i(i10).f()).toUpperCase());
            if (k0Var.t() != null) {
                setCardNumber(d(k0Var.t().toUpperCase()));
            }
            if (k0Var.G()) {
                j(i10, k0Var.v());
            }
        }
    }

    public final void m() {
        float f7;
        int i10;
        double d;
        int f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f34855h0 != null) {
            float[] fArr = this.f34845a0;
            char c10 = '\t';
            int i11 = 2;
            char c11 = 1;
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = v7.f35317c;
            float[] fArr3 = new float[42];
            int i12 = 0;
            while (true) {
                char c12 = c10;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 * 4;
                int i14 = i13 + 10;
                char c13 = c11;
                if (fArr.length < 18 || fArr[i14] < f15) {
                    f11 = f15;
                    System.arraycopy(v7.f35316b, 0, fArr3, i12 * 12, 12);
                    fArr3[i12 + 28] = 1.0f;
                    System.arraycopy(fArr2, 0, fArr3, (i12 * 3) + 30, 3);
                } else {
                    fArr3[i12 + 28] = 0.6f;
                    int i15 = (int) fArr[i14];
                    int i16 = i12 * 3;
                    int i17 = i16 + 30;
                    float f17 = ((i15 >> 16) & 255) / 255.0f;
                    f11 = f15;
                    float f18 = ((i15 >> 8) & 255) / 255.0f;
                    float f19 = (i15 & 255) / 255.0f;
                    float min = Math.min(f17, Math.min(f18, f19));
                    float max = Math.max(f17, Math.max(f18, f19)) - min;
                    float f20 = (fArr2[i11] * 0.0722f) + (fArr2[c13] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    int i18 = (max > f11 ? 1 : (max == f11 ? 0 : -1));
                    if (i18 > 0) {
                        f12 = (f17 - min) / max;
                    } else {
                        f12 = f11;
                    }
                    fArr3[i17] = c3.i0.z(f12, f20, min2, f20);
                    int i19 = i16 + 31;
                    if (i18 > 0) {
                        f13 = (f18 - min) / max;
                    } else {
                        f13 = f11;
                    }
                    fArr3[i19] = c3.i0.z(f13, f20, min2, f20);
                    int i20 = i16 + 32;
                    if (i18 > 0) {
                        f14 = (f19 - min) / max;
                    } else {
                        f14 = f11;
                    }
                    fArr3[i20] = c3.i0.z(f14, f20, min2, f20);
                    int i21 = (int) fArr[i14];
                    int i22 = (int) fArr[i13 + 11];
                    int n10 = v7.n(-16216082, i21, i22);
                    int n11 = v7.n(-15291399, i21, i22);
                    for (int i23 = 0; i23 < 3; i23++) {
                        int i24 = 16 - (i23 * 8);
                        float h = v7.h(n10, i24) * 0.73f;
                        float h10 = v7.h(n11, i24) * 0.73f;
                        int i25 = i12 * 12;
                        fArr3[i25 + i23] = (h + h10) / 2.0f;
                        fArr3[i25 + 3 + i23] = h;
                        fArr3[i25 + 6 + i23] = h10;
                        fArr3[i25 + 9 + i23] = h;
                    }
                }
                i12++;
                c10 = c12;
                c11 = c13;
                f15 = f11;
                i11 = 2;
            }
            char c14 = c11;
            float f21 = f15;
            int i26 = 0;
            for (int i27 = i11; i26 < i27; i27 = 2) {
                int i28 = i26 * 4;
                int i29 = i28 + 10;
                if (fArr.length >= 18 && fArr[i29] >= f21) {
                    f10 = i0.b.f(0.2f, ((int) fArr[i28 + 12]) | (-16777216), ((int) fArr[i28 + 11]) | (-16777216));
                } else {
                    f10 = i0.b.f(0.2f, -16611884, -16748084);
                }
                int i30 = i26 * 3;
                fArr3[i30 + 36] = ((f10 >> 16) & 255) / 255.0f;
                fArr3[i30 + 37] = ((f10 >> 8) & 255) / 255.0f;
                fArr3[i30 + 38] = (f10 & 255) / 255.0f;
                i26++;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.f34845a0;
            if (fArr4 != null && fArr4.length > 8) {
                f7 = Math.max(f21, Math.min(1.0f, fArr4[8]));
            } else {
                f7 = 1.0f;
            }
            t6 t6Var = this.f34855h0;
            float T1 = org.telegram.messenger.i0.T1(fArr3[30], fArr3[33], f7);
            float T12 = org.telegram.messenger.i0.T1(fArr3[31], fArr3[34], f7);
            float T13 = org.telegram.messenger.i0.T1(fArr3[32], fArr3[35], f7);
            t6Var.getClass();
            float[] fArr5 = t6.f35238j;
            float[] a2 = t6.a(T1, T12, T13);
            float f22 = a2[0];
            float f23 = a2[c14];
            float f24 = a2[2];
            if (f22 == t6Var.e && f23 == t6Var.f35247f && f24 == t6Var.f35248g) {
                return;
            }
            t6Var.e = f22;
            t6Var.f35247f = f23;
            t6Var.f35248g = f24;
            if (t6.f35239k == null) {
                t6.f35239k = t6.a(0.0f, 0.47809f, 1.0f);
            }
            float[] fArr6 = t6.f35239k;
            double sqrt = (fArr6[0] - fArr6[c14]) / Math.sqrt(2.0d);
            double sqrt2 = ((fArr6[0] + fArr6[c14]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
            double sqrt3 = (f22 - f23) / Math.sqrt(2.0d);
            double sqrt4 = ((f22 + f23) - (f24 * 2.0f)) / Math.sqrt(6.0d);
            double IEEEremainder = Math.IEEEremainder(Math.atan2(sqrt4, sqrt3) - Math.atan2(sqrt2, sqrt), 6.283185307179586d);
            double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(sqrt3, sqrt4) / Math.hypot(sqrt, sqrt2));
            double cos = Math.cos(IEEEremainder);
            double sin = Math.sin(IEEEremainder) / Math.sqrt(3.0d);
            double d10 = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
            double d11 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
            float[] fArr7 = new float[20];
            int i31 = 0;
            while (true) {
                i10 = 3;
                if (i31 >= 3) {
                    break;
                }
                int i32 = 0;
                while (i32 < i10) {
                    if (i31 == i32) {
                        d = d10;
                    } else {
                        d = d11;
                    }
                    if (i32 == (i31 + 1) % 3) {
                        d -= min3 * sin;
                    } else if (i32 == (i31 + 2) % 3) {
                        d = (min3 * sin) + d;
                    }
                    float f25 = f16;
                    double d12 = d11;
                    fArr7[(i31 * 5) + i32] = (float) d;
                    i32++;
                    f16 = f25;
                    d11 = d12;
                    i10 = 3;
                }
                i31++;
            }
            float f26 = f16;
            int i33 = 0;
            while (i33 < i10) {
                float f27 = (fArr5[2] * fArr7[i33 + 10]) + (fArr5[c14] * fArr7[i33 + 5]) + (fArr5[0] * fArr7[i33]);
                for (int i34 = 0; i34 < 3; i34++) {
                    int i35 = (i34 * 5) + i33;
                    fArr7[i35] = (fArr5[i33] - f27) + fArr7[i35];
                }
                i33++;
                i10 = 3;
            }
            fArr7[18] = f26;
            t6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            t6Var.invalidateSelf();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (view != null) {
            view.setTranslationZ(org.telegram.messenger.i0.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.W != null) {
            zs.f(this.V).c(this, zs.f19582a4);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        View view;
        if (getParent() instanceof View) {
            view = (View) getParent();
        } else {
            view = null;
        }
        if (view != null) {
            view.setTranslationZ(0.0f);
        }
        super.onDetachedFromWindow();
        if (this.W != null) {
            zs.f(this.V).n(this, zs.f19582a4);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.f34858r = f7;
        this.D.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.R = i10;
        this.D.setCardIcon(i10);
    }

    public void setCardNumber(String str) {
        if (str != null && !str.equals(this.Q)) {
            this.Q = str;
            this.D.setHasCardNumber(true);
            this.H.invalidate();
        }
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
        this.D.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.f34844a = z10;
        this.N.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f7) {
        this.D.setScaleX(f7);
        this.D.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.f34845a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.D.setStickerStyle(fArr);
        this.O.setTextColor(i0.b.f(fArr[8], v7.p(-7868417, 0, fArr), v7.p(-7868417, 3, fArr)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f7) {
        this.f34859s = f7;
        this.D.setUseGyroscope(f7);
    }

    public l6(Context context, int i10, int i11) {
        super(context);
        this.f34846b = 1.0f;
        this.f34848c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        new RectF();
        this.f34852f = new RectF();
        this.f34859s = 1.0f;
        this.f34860w = new Matrix();
        this.f34861x = new Matrix();
        this.f34862y = new Matrix();
        this.I = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final l6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34622b.H.invalidate();
                        return;
                    case 1:
                        l6 l6Var = this.f34622b;
                        l6Var.N.invalidate();
                        l6Var.O.invalidate();
                        return;
                    default:
                        this.f34622b.G.invalidate();
                        return;
                }
            }
        };
        gr grVar = gr.h;
        this.K = new org.telegram.ui.Components.t5(runnable, 240L, grVar, 0);
        this.V = d20.f15147s0;
        this.f34853f0 = new org.telegram.ui.Components.t5(new Runnable(this) {
            public final l6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34622b.H.invalidate();
                        return;
                    case 1:
                        l6 l6Var = this.f34622b;
                        l6Var.N.invalidate();
                        l6Var.O.invalidate();
                        return;
                    default:
                        this.f34622b.G.invalidate();
                        return;
                }
            }
        }, 240L, grVar, 0);
        this.f34854g0 = new org.telegram.ui.Components.t5(new Runnable(this) {
            public final l6 f34622b;

            {
                this.f34622b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34622b.H.invalidate();
                        return;
                    case 1:
                        l6 l6Var = this.f34622b;
                        l6Var.N.invalidate();
                        l6Var.O.invalidate();
                        return;
                    default:
                        this.f34622b.G.invalidate();
                        return;
                }
            }
        }, 240L, grVar, 0);
        this.R = i10;
        this.S = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        g6 g6Var = new g6(getContext(), this.R, i11);
        this.D = g6Var;
        this.E = g6Var.getFrontFace();
        float[] fArr = this.f34845a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.f34858r);
        setUseGyroscope(this.f34859s);
        this.D.setOnClickListener(this.F);
        addView(this.D, 0, w7.b6.c(-2.0f, -1));
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 9);
        this.G = q2Var;
        if (f34843k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f34843k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f34843k0 = org.telegram.messenger.i0.o1("fonts/rmono.ttf");
            }
        }
        q2Var.setTypeface(f34843k0);
        q2Var.setTextColor(-1);
        q2Var.setTextSize(1, 13.0f);
        q2Var.setEllipsize(TextUtils.TruncateAt.END);
        q2Var.setMaxLines(1);
        q2Var.setSingleLine();
        this.E.addView(q2Var, w7.b6.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        do0 do0Var = new do0(this, context, 7);
        this.H = do0Var;
        this.E.addView(do0Var, w7.b6.c(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, w7.b6.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = d;
        this.E.addView(linearLayout, d);
        j6 j6Var = new j6(this, context, 0);
        this.N = j6Var;
        j6Var.getDrawable().M = org.telegram.messenger.i0.L(4096.0f);
        j6Var.f25984c.m(0.35f, 320L, 3.5f, grVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        j6Var.setTextSize(org.telegram.messenger.i0.L(23.0f));
        j6Var.setTextColor(-1);
        j6Var.setIgnoreRTL(true);
        linearLayout.addView(j6Var, w7.b6.o(-1, 28));
        j6 j6Var2 = new j6(this, context, 1);
        this.O = j6Var2;
        j6Var2.f25984c.m(0.35f, 320L, 3.5f, grVar);
        j6Var2.setScaleProperty(0.6f);
        j6Var2.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        j6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        j6Var2.setTextColor(-7868417);
        j6Var2.setLayoutDirection(0);
        j6Var2.setTextDirection(3);
        j6Var2.setGravity(19);
        j6Var2.setIgnoreRTL(true);
        linearLayout.addView(j6Var2, w7.b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
