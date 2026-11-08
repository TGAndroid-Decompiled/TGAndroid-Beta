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
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.l00;
public class g6 extends FrameLayout implements ls {
    public static Typeface f42534j0;
    public static Typeface f42535k0;
    public final b6 D;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final org.telegram.ui.ActionBar.m2 G;
    public final l00 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.w5 K;
    public final View L;
    public final LinearLayout M;
    public final e6 N;
    public final e6 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public m0 W;
    public boolean f42536a;
    public float[] f42537a0;
    public float f42538b;
    public int f42539b0;
    public final Matrix f42540c;
    public int f42541c0;
    public final Matrix d;
    public float f42542d0;
    public final Matrix f42543e;
    public float f42544e0;
    public final RectF f42545f;
    public final org.telegram.ui.Components.w5 f42546f0;
    public final org.telegram.ui.Components.w5 f42547g0;
    public float h;
    public o6 f42548h0;
    public boolean f42549i0;
    public boolean f42550n;
    public float f42551r;
    public float f42552s;
    public final Matrix f42553w;
    public final Matrix f42554x;
    public final Matrix f42555y;

    public g6(Context context) {
        this(context, 2131232810, 46);
    }

    public static void a(final g6 g6Var, final Canvas canvas, float f10) {
        float f11;
        float height = g6Var.getFrontFace().getHeight();
        float width = g6Var.getFrontFace().getWidth() / 1640.0f;
        Paint paint = g6Var.I;
        Context context = g6Var.getContext();
        if (f42534j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f42534j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f42534j0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(f42534j0);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = g6Var.f42537a0;
        int b10 = p7.b(0, fArr);
        int b11 = p7.b(1, fArr);
        if (fArr != null && fArr.length >= 18) {
            f11 = fArr[8];
        } else {
            f11 = 0.0f;
        }
        paint.setColor(i0.a.f(f11, b10, b11));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f12 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f13 = width * 27.333332f;
        final String[] split = f(g6Var.Q).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        g6Var.c(f10, new d3(g6Var, 2), new Runnable() {
            @Override
            public final void run() {
                g6 g6Var2 = g6.this;
                g6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f14 = f13;
                float f15 = f12;
                Paint paint2 = g6Var2.I;
                Canvas canvas2 = canvas;
                canvas2.drawText(str, 0.0f, (-f14) + f15, paint2);
                if (strArr.length > 1) {
                    canvas2.drawText(strArr[1], 0.0f, f14 + f15, paint2);
                }
            }
        });
        canvas.restore();
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            if (i7 > 0 && i7 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i7));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder e(long j3) {
        return m0.q(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(m0.p(j3, false))), 0.8f);
    }

    public static String f(String str) {
        char c10;
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        for (int i7 = 0; i7 < split.length; i7++) {
            if (i7 > 0) {
                if (i7 == length) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            sb2.append(split[i7]);
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
        float max = Math.max(0.0f, (((((336.0f - this.S) - 48.0f) * this.E.getWidth()) / 336.0f) - this.P.leftMargin) - org.telegram.messenger.g0.L(8.0f));
        if (c10 <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c10);
    }

    public final void c(float f10, d3 d3Var, Runnable runnable) {
        float f11;
        if (f10 > 0.0f) {
            f11 = org.telegram.messenger.g0.L(5.0f);
        } else {
            f11 = 0.0f;
        }
        d3Var.a(f11, org.telegram.messenger.g0.L(1.0f), Color.argb((int) (89.0f * f10), 0, 0, 0));
        runnable.run();
        if (f10 <= 0.0f) {
            return;
        }
        d3Var.a(org.telegram.messenger.g0.N(1.5f), 0.0f, Color.argb((int) (f10 * 140.0f), 0, 0, 0));
        this.f42549i0 = true;
        runnable.run();
        this.f42549i0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24971a4) {
            Object obj = objArr[0];
            m0 m0Var = this.W;
            if (obj == m0Var) {
                l(m0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            View view2 = (View) this.E.getParent();
            b6 b6Var = this.D;
            Matrix matrix2 = this.f42553w;
            matrix2.set((Matrix) b6Var.f42198e.d);
            v41 v41Var = b6Var.f42200f;
            matrix2.preTranslate(v41Var.getLeft(), v41Var.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(this.E.getLeft() - view2.getScrollX(), this.E.getTop() - view2.getScrollY());
            matrix.preConcat(this.E.getMatrix());
            Matrix matrix3 = this.f42554x;
            k(view, matrix3);
            Matrix matrix4 = this.f42555y;
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

    public org.telegram.ui.Components.j6 getBalanceView() {
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
        e6 e6Var;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.E.getWidth() / 336.0f;
        float b10 = b();
        e6 e6Var2 = this.N;
        float c10 = this.O.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.P;
        float f10 = layoutParams.leftMargin;
        float f11 = layoutParams.topMargin;
        float bottom = ((e6Var2.getBottom() + e6Var2.getTop()) / 2.0f) + f11;
        float height = (e6Var2.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f10, bottom - height, (e6Var2.getDrawable().c() * b10) + f10, bottom + height));
        org.telegram.ui.ActionBar.m2 m2Var = this.G;
        arrayList.add(new RectF(m2Var.getLeft(), m2Var.getTop(), m2Var.getLeft() + Math.min(m2Var.getWidth(), m2Var.getPaint().measureText(m2Var.getText().toString())), m2Var.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f10, e6Var.getTop() + f11, c10 + f10, f11 + e6Var.getBottom()));
        if (this.f42536a) {
            rectF = new RectF(this.f42545f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f42537a0;
    }

    public org.telegram.ui.Components.j6 getUsdBalanceView() {
        return this.O;
    }

    public final void h(Path path, float f10, float f11) {
        path.rewind();
        float f12 = 336 - this.S;
        path.addRoundRect(((f12 - 48.0f) * f10) / 336.0f, 0.36097562f * f11, (f12 * f10) / 336.0f, 0.5365854f * f11, (f10 * 8.0f) / 336.0f, 0.03902439f * f11, Path.Direction.CW);
    }

    public final void i(float f10, float f11) {
        if (this.T == f10 && this.U == f11) {
            return;
        }
        this.T = f10;
        if (f10 == 0.0f) {
            this.f42550n = false;
        }
        this.U = f11;
        this.N.invalidate();
        this.O.invalidate();
    }

    public final void j(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z9 = false;
        spannableString.setSpan(new f6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j3));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749517, null));
        spannableStringBuilder.setSpan(new li.w5(this, 5), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round((j3 / 1.0E9d) * ((org.telegram.messenger.i0) qp.s1(i7).f24942x7.f24449l.f14323b).f23001a * 100.0d);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        if (round % 100 == 0) {
            z9 = true;
        }
        i10.getClass();
        this.O.setText(org.telegram.messenger.r1.g("USD", 2, round, z9));
    }

    public final void l(m0 m0Var) {
        if (m0Var != null) {
            int i7 = m0Var.f42762a;
            setCardHolder(t10.p(p10.i(i7).f()).toUpperCase());
            if (m0Var.t() != null) {
                setCardNumber(d(m0Var.t().toUpperCase()));
            }
            if (m0Var.G()) {
                j(i7, m0Var.v());
            }
        }
    }

    public final void m() {
        float f10;
        int i7;
        double d;
        int f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f42548h0 != null) {
            float[] fArr = this.f42537a0;
            char c10 = '\t';
            int i10 = 2;
            char c11 = 1;
            float f16 = 0.0f;
            float f17 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = p7.f43028c;
            float[] fArr3 = new float[42];
            int i11 = 0;
            while (true) {
                char c12 = c10;
                if (i11 >= i10) {
                    break;
                }
                int i12 = i11 * 4;
                int i13 = i12 + 10;
                char c13 = c11;
                if (fArr.length < 18 || fArr[i13] < f16) {
                    f12 = f16;
                    System.arraycopy(p7.f43027b, 0, fArr3, i11 * 12, 12);
                    fArr3[i11 + 28] = 1.0f;
                    System.arraycopy(fArr2, 0, fArr3, (i11 * 3) + 30, 3);
                } else {
                    fArr3[i11 + 28] = 0.6f;
                    int i14 = (int) fArr[i13];
                    int i15 = i11 * 3;
                    int i16 = i15 + 30;
                    float f18 = ((i14 >> 16) & 255) / 255.0f;
                    f12 = f16;
                    float f19 = ((i14 >> 8) & 255) / 255.0f;
                    float f20 = (i14 & 255) / 255.0f;
                    float min = Math.min(f18, Math.min(f19, f20));
                    float max = Math.max(f18, Math.max(f19, f20)) - min;
                    float f21 = (fArr2[i10] * 0.0722f) + (fArr2[c13] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    int i17 = (max > f12 ? 1 : (max == f12 ? 0 : -1));
                    if (i17 > 0) {
                        f13 = (f18 - min) / max;
                    } else {
                        f13 = f12;
                    }
                    fArr3[i16] = com.google.android.recaptcha.internal.a.z(f13, f21, min2, f21);
                    int i18 = i15 + 31;
                    if (i17 > 0) {
                        f14 = (f19 - min) / max;
                    } else {
                        f14 = f12;
                    }
                    fArr3[i18] = com.google.android.recaptcha.internal.a.z(f14, f21, min2, f21);
                    int i19 = i15 + 32;
                    if (i17 > 0) {
                        f15 = (f20 - min) / max;
                    } else {
                        f15 = f12;
                    }
                    fArr3[i19] = com.google.android.recaptcha.internal.a.z(f15, f21, min2, f21);
                    int i20 = (int) fArr[i13];
                    int i21 = (int) fArr[i12 + 11];
                    int n10 = p7.n(-16216082, i20, i21);
                    int n11 = p7.n(-15291399, i20, i21);
                    for (int i22 = 0; i22 < 3; i22++) {
                        int i23 = 16 - (i22 * 8);
                        float h = p7.h(n10, i23) * 0.73f;
                        float h7 = p7.h(n11, i23) * 0.73f;
                        int i24 = i11 * 12;
                        fArr3[i24 + i22] = (h + h7) / 2.0f;
                        fArr3[i24 + 3 + i22] = h;
                        fArr3[i24 + 6 + i22] = h7;
                        fArr3[i24 + 9 + i22] = h;
                    }
                }
                i11++;
                c10 = c12;
                c11 = c13;
                f16 = f12;
                i10 = 2;
            }
            char c14 = c11;
            float f22 = f16;
            int i25 = 0;
            for (int i26 = i10; i25 < i26; i26 = 2) {
                int i27 = i25 * 4;
                int i28 = i27 + 10;
                if (fArr.length >= 18 && fArr[i28] >= f22) {
                    f11 = i0.a.f(0.2f, ((int) fArr[i27 + 12]) | (-16777216), ((int) fArr[i27 + 11]) | (-16777216));
                } else {
                    f11 = i0.a.f(0.2f, -16611884, -16748084);
                }
                int i29 = i25 * 3;
                fArr3[i29 + 36] = ((f11 >> 16) & 255) / 255.0f;
                fArr3[i29 + 37] = ((f11 >> 8) & 255) / 255.0f;
                fArr3[i29 + 38] = (f11 & 255) / 255.0f;
                i25++;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.f42537a0;
            if (fArr4 != null && fArr4.length > 8) {
                f10 = Math.max(f22, Math.min(1.0f, fArr4[8]));
            } else {
                f10 = 1.0f;
            }
            o6 o6Var = this.f42548h0;
            float T1 = org.telegram.messenger.g0.T1(fArr3[30], fArr3[33], f10);
            float T12 = org.telegram.messenger.g0.T1(fArr3[31], fArr3[34], f10);
            float T13 = org.telegram.messenger.g0.T1(fArr3[32], fArr3[35], f10);
            o6Var.getClass();
            float[] fArr5 = o6.f42963j;
            float[] a10 = o6.a(T1, T12, T13);
            float f23 = a10[0];
            float f24 = a10[c14];
            float f25 = a10[2];
            if (f23 == o6Var.f42972e && f24 == o6Var.f42973f && f25 == o6Var.f42974g) {
                return;
            }
            o6Var.f42972e = f23;
            o6Var.f42973f = f24;
            o6Var.f42974g = f25;
            if (o6.f42964k == null) {
                o6.f42964k = o6.a(0.0f, 0.47809f, 1.0f);
            }
            float[] fArr6 = o6.f42964k;
            double sqrt = (fArr6[0] - fArr6[c14]) / Math.sqrt(2.0d);
            double sqrt2 = ((fArr6[0] + fArr6[c14]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
            double sqrt3 = (f23 - f24) / Math.sqrt(2.0d);
            double sqrt4 = ((f23 + f24) - (f25 * 2.0f)) / Math.sqrt(6.0d);
            double IEEEremainder = Math.IEEEremainder(Math.atan2(sqrt4, sqrt3) - Math.atan2(sqrt2, sqrt), 6.283185307179586d);
            double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(sqrt3, sqrt4) / Math.hypot(sqrt, sqrt2));
            double cos = Math.cos(IEEEremainder);
            double sin = Math.sin(IEEEremainder) / Math.sqrt(3.0d);
            double d2 = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
            double d10 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
            float[] fArr7 = new float[20];
            int i30 = 0;
            while (true) {
                i7 = 3;
                if (i30 >= 3) {
                    break;
                }
                int i31 = 0;
                while (i31 < i7) {
                    if (i30 == i31) {
                        d = d2;
                    } else {
                        d = d10;
                    }
                    if (i31 == (i30 + 1) % 3) {
                        d -= min3 * sin;
                    } else if (i31 == (i30 + 2) % 3) {
                        d = (min3 * sin) + d;
                    }
                    float f26 = f17;
                    double d11 = d10;
                    fArr7[(i30 * 5) + i31] = (float) d;
                    i31++;
                    f17 = f26;
                    d10 = d11;
                    i7 = 3;
                }
                i30++;
            }
            float f27 = f17;
            int i32 = 0;
            while (i32 < i7) {
                float f28 = (fArr5[2] * fArr7[i32 + 10]) + (fArr5[c14] * fArr7[i32 + 5]) + (fArr5[0] * fArr7[i32]);
                for (int i33 = 0; i33 < 3; i33++) {
                    int i34 = (i33 * 5) + i32;
                    fArr7[i34] = (fArr5[i32] - f28) + fArr7[i34];
                }
                i32++;
                i7 = 3;
            }
            fArr7[18] = f27;
            o6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            o6Var.invalidateSelf();
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
            view.setTranslationZ(org.telegram.messenger.g0.L(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.W != null) {
            qs.f(this.V).c(this, qs.f24971a4);
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
            qs.f(this.V).n(this, qs.f24971a4);
        }
    }

    public void setAdditionalTilt(float f10) {
        this.f42551r = f10;
        this.D.setAdditionalTilt(f10);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i7) {
        this.R = i7;
        this.D.setCardIcon(i7);
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

    public void setDiamondOnCard(boolean z9) {
        this.f42536a = z9;
        this.N.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f10) {
        this.D.setScaleX(f10);
        this.D.setScaleY(f10);
    }

    public void setStickerStyle(float[] fArr) {
        this.f42537a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.D.setStickerStyle(fArr);
        this.O.setTextColor(i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f10) {
        this.f42552s = f10;
        this.D.setUseGyroscope(f10);
    }

    public g6(Context context, int i7, int i10) {
        super(context);
        this.f42538b = 1.0f;
        this.f42540c = new Matrix();
        this.d = new Matrix();
        this.f42543e = new Matrix();
        new RectF();
        this.f42545f = new RectF();
        this.f42552s = 1.0f;
        this.f42553w = new Matrix();
        this.f42554x = new Matrix();
        this.f42555y = new Matrix();
        this.I = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final g6 f42359b;

            {
                this.f42359b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f42359b.H.invalidate();
                        return;
                    case 1:
                        g6 g6Var = this.f42359b;
                        g6Var.N.invalidate();
                        g6Var.O.invalidate();
                        return;
                    default:
                        this.f42359b.G.invalidate();
                        return;
                }
            }
        };
        xq xqVar = xq.h;
        this.K = new org.telegram.ui.Components.w5(runnable, 240L, xqVar, 0);
        this.V = p10.f24470s0;
        this.f42546f0 = new org.telegram.ui.Components.w5(new Runnable(this) {
            public final g6 f42359b;

            {
                this.f42359b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f42359b.H.invalidate();
                        return;
                    case 1:
                        g6 g6Var = this.f42359b;
                        g6Var.N.invalidate();
                        g6Var.O.invalidate();
                        return;
                    default:
                        this.f42359b.G.invalidate();
                        return;
                }
            }
        }, 240L, xqVar, 0);
        this.f42547g0 = new org.telegram.ui.Components.w5(new Runnable(this) {
            public final g6 f42359b;

            {
                this.f42359b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f42359b.H.invalidate();
                        return;
                    case 1:
                        g6 g6Var = this.f42359b;
                        g6Var.N.invalidate();
                        g6Var.O.invalidate();
                        return;
                    default:
                        this.f42359b.G.invalidate();
                        return;
                }
            }
        }, 240L, xqVar, 0);
        this.R = i7;
        this.S = i10;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        b6 b6Var = new b6(getContext(), this.R, i10);
        this.D = b6Var;
        this.E = b6Var.getFrontFace();
        float[] fArr = this.f42537a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.f42551r);
        setUseGyroscope(this.f42552s);
        this.D.setOnClickListener(this.F);
        addView(this.D, 0, c8.ha.c(-2.0f, -1));
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(9, context, this);
        this.G = m2Var;
        if (f42535k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f42535k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f42535k0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        m2Var.setTypeface(f42535k0);
        m2Var.setTextColor(-1);
        m2Var.setTextSize(1, 13.0f);
        m2Var.setEllipsize(TextUtils.TruncateAt.END);
        m2Var.setMaxLines(1);
        m2Var.setSingleLine();
        this.E.addView(m2Var, c8.ha.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        l00 l00Var = new l00(11, context, this);
        this.H = l00Var;
        this.E.addView(l00Var, c8.ha.c(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, c8.ha.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = d;
        this.E.addView(linearLayout, d);
        e6 e6Var = new e6(this, context, 0);
        this.N = e6Var;
        e6Var.getDrawable().M = org.telegram.messenger.g0.L(4096.0f);
        e6Var.f34919c.m(0.35f, 320L, 3.5f, xqVar);
        e6Var.setScaleProperty(0.6f);
        e6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        e6Var.setTextSize(org.telegram.messenger.g0.L(23.0f));
        e6Var.setTextColor(-1);
        e6Var.setIgnoreRTL(true);
        linearLayout.addView(e6Var, c8.ha.o(-1, 28));
        e6 e6Var2 = new e6(this, context, 1);
        this.O = e6Var2;
        e6Var2.f34919c.m(0.35f, 320L, 3.5f, xqVar);
        e6Var2.setScaleProperty(0.6f);
        e6Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        e6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        e6Var2.setTextColor(-7868417);
        e6Var2.setLayoutDirection(0);
        e6Var2.setTextDirection(3);
        e6Var2.setGravity(19);
        e6Var2.setIgnoreRTL(true);
        linearLayout.addView(e6Var2, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
