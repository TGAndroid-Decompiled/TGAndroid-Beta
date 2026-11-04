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
import b8.mf;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.ui.Components.xq;
public class f6 extends FrameLayout implements cs {
    public static Typeface f42520k0;
    public static Typeface f42521l0;
    public final a6 E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final org.telegram.ui.ActionBar.k2 H;
    public final org.telegram.ui.Components.voip.r0 I;
    public final Paint J;
    public float K;
    public final org.telegram.ui.Components.u5 L;
    public final View M;
    public final LinearLayout N;
    public final d6 O;
    public final d6 P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final int T;
    public float U;
    public float V;
    public int W;
    public boolean f42522a;
    public k0 f42523a0;
    public float f42524b;
    public float[] f42525b0;
    public final Matrix f42526c;
    public int f42527c0;
    public final Matrix d;
    public int f42528d0;
    public final Matrix f42529e;
    public float f42530e0;
    public final RectF f42531f;
    public float f42532f0;
    public final org.telegram.ui.Components.u5 f42533g0;
    public float h;
    public final org.telegram.ui.Components.u5 f42534h0;
    public n6 f42535i0;
    public boolean f42536j0;
    public boolean f42537n;
    public float f42538r;
    public float f42539s;
    public final Matrix f42540w;
    public final Matrix f42541x;
    public final Matrix f42542y;

    public f6(Context context) {
        this(context, 2131232808, 46);
    }

    public static void a(final f6 f6Var, final Canvas canvas, float f10) {
        float f11;
        float height = f6Var.getFrontFace().getHeight();
        float width = f6Var.getFrontFace().getWidth() / 1640.0f;
        Paint paint = f6Var.J;
        Context context = f6Var.getContext();
        if (f42520k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f42520k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f42520k0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(f42520k0);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = f6Var.f42525b0;
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
        final String[] split = f(f6Var.R).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        f6Var.c(f10, new c3(f6Var, 2), new Runnable() {
            @Override
            public final void run() {
                f6 f6Var2 = f6.this;
                f6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f14 = f13;
                float f15 = f12;
                Paint paint2 = f6Var2.J;
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
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 > 0 && i3 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i3));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder e(long j10) {
        return k0.q(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(k0.p(j10, false))), 0.8f);
    }

    public static String f(String str) {
        char c2;
        String[] split = str.split(" ");
        if (split.length < 2) {
            return str;
        }
        int length = split.length / 2;
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        for (int i3 = 0; i3 < split.length; i3++) {
            if (i3 > 0) {
                if (i3 == length) {
                    c2 = '\n';
                } else {
                    c2 = ' ';
                }
                sb2.append(c2);
            }
            sb2.append(split[i3]);
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
        float c2 = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - org.telegram.messenger.g0.L(8.0f));
        if (c2 <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c2);
    }

    public final void c(float f10, c3 c3Var, Runnable runnable) {
        float f11;
        if (f10 > 0.0f) {
            f11 = org.telegram.messenger.g0.L(5.0f);
        } else {
            f11 = 0.0f;
        }
        c3Var.a(f11, org.telegram.messenger.g0.L(1.0f), Color.argb((int) (89.0f * f10), 0, 0, 0));
        runnable.run();
        if (f10 <= 0.0f) {
            return;
        }
        c3Var.a(org.telegram.messenger.g0.N(1.5f), 0.0f, Color.argb((int) (f10 * 140.0f), 0, 0, 0));
        this.f42536j0 = true;
        runnable.run();
        this.f42536j0 = false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23200a4) {
            Object obj = objArr[0];
            k0 k0Var = this.f42523a0;
            if (obj == k0Var) {
                l(k0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            View view2 = (View) this.F.getParent();
            a6 a6Var = this.E;
            Matrix matrix2 = this.f42540w;
            matrix2.set((Matrix) a6Var.f42143e.d);
            ei.k1 k1Var = a6Var.f42145f;
            matrix2.preTranslate(k1Var.getLeft(), k1Var.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(this.F.getLeft() - view2.getScrollX(), this.F.getTop() - view2.getScrollY());
            matrix.preConcat(this.F.getMatrix());
            Matrix matrix3 = this.f42541x;
            k(view, matrix3);
            Matrix matrix4 = this.f42542y;
            if (matrix3.invert(matrix4)) {
                matrix.postConcat(matrix4);
                return true;
            }
            return false;
        }
        return false;
    }

    public View getBalanceAnchor() {
        return this.M;
    }

    public LinearLayout getBalanceLayout() {
        return this.N;
    }

    public org.telegram.ui.Components.h6 getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.E.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.E.getCardRotationY();
    }

    public FrameLayout getFrontFace() {
        return this.F;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.F.indexOfChild(this.H);
        int indexOfChild2 = this.F.indexOfChild(this.N);
        if (indexOfChild < 0) {
            if (indexOfChild2 < 0) {
                return this.F.getChildCount();
            }
            return indexOfChild2;
        } else if (indexOfChild2 < 0) {
            return indexOfChild;
        } else {
            return Math.min(indexOfChild, indexOfChild2);
        }
    }

    public ArrayList<RectF> getStickerObstacles() {
        d6 d6Var;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.F.getWidth() / 336.0f;
        float b10 = b();
        d6 d6Var2 = this.O;
        float c2 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f10 = layoutParams.leftMargin;
        float f11 = layoutParams.topMargin;
        float bottom = ((d6Var2.getBottom() + d6Var2.getTop()) / 2.0f) + f11;
        float height = (d6Var2.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f10, bottom - height, (d6Var2.getDrawable().c() * b10) + f10, bottom + height));
        org.telegram.ui.ActionBar.k2 k2Var = this.H;
        arrayList.add(new RectF(k2Var.getLeft(), k2Var.getTop(), k2Var.getLeft() + Math.min(k2Var.getWidth(), k2Var.getPaint().measureText(k2Var.getText().toString())), k2Var.getBottom()));
        arrayList.add(new RectF(this.F.getWidth() - (34.0f * width), 18.0f * width, this.F.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.F.getWidth(), this.F.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f10, d6Var.getTop() + f11, c2 + f10, f11 + d6Var.getBottom()));
        if (this.f42522a) {
            rectF = new RectF(this.f42531f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f42525b0;
    }

    public org.telegram.ui.Components.h6 getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f10, float f11) {
        path.rewind();
        float f12 = 336 - this.T;
        path.addRoundRect(((f12 - 48.0f) * f10) / 336.0f, 0.36097562f * f11, (f12 * f10) / 336.0f, 0.5365854f * f11, (f10 * 8.0f) / 336.0f, 0.03902439f * f11, Path.Direction.CW);
    }

    public final void i(float f10, float f11) {
        if (this.U == f10 && this.V == f11) {
            return;
        }
        this.U = f10;
        if (f10 == 0.0f) {
            this.f42537n = false;
        }
        this.V = f11;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i3, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z10 = false;
        spannableString.setSpan(new e6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        spannableStringBuilder.setSpan(new mi.x5(this, 5), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j10 / 1.0E9d) * ((org.telegram.messenger.i0) hp.s1(i3).f23167x7.f24665l.f14429b).f23413a * 100.0d);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        if (round % 100 == 0) {
            z10 = true;
        }
        i10.getClass();
        this.P.setText(org.telegram.messenger.r1.g("USD", 2, round, z10));
    }

    public final void l(k0 k0Var) {
        if (k0Var != null) {
            int i3 = k0Var.f42718a;
            setCardHolder(l10.p(h10.i(i3).f()).toUpperCase());
            if (k0Var.t() != null) {
                setCardNumber(d(k0Var.t().toUpperCase()));
            }
            if (k0Var.G()) {
                j(i3, k0Var.v());
            }
        }
    }

    public final void m() {
        float f10;
        int i3;
        double d;
        int f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f42535i0 != null) {
            float[] fArr = this.f42525b0;
            char c2 = '\t';
            int i10 = 2;
            char c10 = 1;
            float f16 = 0.0f;
            float f17 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = p7.f43050c;
            float[] fArr3 = new float[42];
            int i11 = 0;
            while (true) {
                char c11 = c2;
                if (i11 >= i10) {
                    break;
                }
                int i12 = i11 * 4;
                int i13 = i12 + 10;
                char c12 = c10;
                if (fArr.length < 18 || fArr[i13] < f16) {
                    f12 = f16;
                    System.arraycopy(p7.f43049b, 0, fArr3, i11 * 12, 12);
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
                    float f21 = (fArr2[i10] * 0.0722f) + (fArr2[c12] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    int i17 = (max > f12 ? 1 : (max == f12 ? 0 : -1));
                    if (i17 > 0) {
                        f13 = (f18 - min) / max;
                    } else {
                        f13 = f12;
                    }
                    fArr3[i16] = com.google.android.recaptcha.internal.a.y(f13, f21, min2, f21);
                    int i18 = i15 + 31;
                    if (i17 > 0) {
                        f14 = (f19 - min) / max;
                    } else {
                        f14 = f12;
                    }
                    fArr3[i18] = com.google.android.recaptcha.internal.a.y(f14, f21, min2, f21);
                    int i19 = i15 + 32;
                    if (i17 > 0) {
                        f15 = (f20 - min) / max;
                    } else {
                        f15 = f12;
                    }
                    fArr3[i19] = com.google.android.recaptcha.internal.a.y(f15, f21, min2, f21);
                    int i20 = (int) fArr[i13];
                    int i21 = (int) fArr[i12 + 11];
                    int n4 = p7.n(-16216082, i20, i21);
                    int n10 = p7.n(-15291399, i20, i21);
                    for (int i22 = 0; i22 < 3; i22++) {
                        int i23 = 16 - (i22 * 8);
                        float h = p7.h(n4, i23) * 0.73f;
                        float h7 = p7.h(n10, i23) * 0.73f;
                        int i24 = i11 * 12;
                        fArr3[i24 + i22] = (h + h7) / 2.0f;
                        fArr3[i24 + 3 + i22] = h;
                        fArr3[i24 + 6 + i22] = h7;
                        fArr3[i24 + 9 + i22] = h;
                    }
                }
                i11++;
                c2 = c11;
                c10 = c12;
                f16 = f12;
                i10 = 2;
            }
            char c13 = c10;
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
            float[] fArr4 = this.f42525b0;
            if (fArr4 != null && fArr4.length > 8) {
                f10 = Math.max(f22, Math.min(1.0f, fArr4[8]));
            } else {
                f10 = 1.0f;
            }
            n6 n6Var = this.f42535i0;
            float T1 = org.telegram.messenger.g0.T1(fArr3[30], fArr3[33], f10);
            float T12 = org.telegram.messenger.g0.T1(fArr3[31], fArr3[34], f10);
            float T13 = org.telegram.messenger.g0.T1(fArr3[32], fArr3[35], f10);
            n6Var.getClass();
            float[] fArr5 = n6.f42934j;
            float[] a10 = n6.a(T1, T12, T13);
            float f23 = a10[0];
            float f24 = a10[c13];
            float f25 = a10[2];
            if (f23 == n6Var.f42943e && f24 == n6Var.f42944f && f25 == n6Var.f42945g) {
                return;
            }
            n6Var.f42943e = f23;
            n6Var.f42944f = f24;
            n6Var.f42945g = f25;
            if (n6.f42935k == null) {
                n6.f42935k = n6.a(0.0f, 0.47809f, 1.0f);
            }
            float[] fArr6 = n6.f42935k;
            double sqrt = (fArr6[0] - fArr6[c13]) / Math.sqrt(2.0d);
            double sqrt2 = ((fArr6[0] + fArr6[c13]) - (fArr6[2] * 2.0f)) / Math.sqrt(6.0d);
            double sqrt3 = (f23 - f24) / Math.sqrt(2.0d);
            double sqrt4 = ((f23 + f24) - (f25 * 2.0f)) / Math.sqrt(6.0d);
            double IEEEremainder = Math.IEEEremainder(Math.atan2(sqrt4, sqrt3) - Math.atan2(sqrt2, sqrt), 6.283185307179586d);
            double min3 = ((Math.min(1.0d, Math.abs(IEEEremainder) / 1.0471975511965976d) * (-0.30000001192092896d)) + 1.0d) * (Math.hypot(sqrt3, sqrt4) / Math.hypot(sqrt, sqrt2));
            double cos = Math.cos(IEEEremainder);
            double sin = Math.sin(IEEEremainder) / Math.sqrt(3.0d);
            double d10 = ((cos - (cos * 0.3333333333333333d)) * min3) + 0.3333333333333333d;
            double d11 = 0.3333333333333333d - ((cos * min3) * 0.3333333333333333d);
            float[] fArr7 = new float[20];
            int i30 = 0;
            while (true) {
                i3 = 3;
                if (i30 >= 3) {
                    break;
                }
                int i31 = 0;
                while (i31 < i3) {
                    if (i30 == i31) {
                        d = d10;
                    } else {
                        d = d11;
                    }
                    if (i31 == (i30 + 1) % 3) {
                        d -= min3 * sin;
                    } else if (i31 == (i30 + 2) % 3) {
                        d = (min3 * sin) + d;
                    }
                    float f26 = f17;
                    double d12 = d11;
                    fArr7[(i30 * 5) + i31] = (float) d;
                    i31++;
                    f17 = f26;
                    d11 = d12;
                    i3 = 3;
                }
                i30++;
            }
            float f27 = f17;
            int i32 = 0;
            while (i32 < i3) {
                float f28 = (fArr5[2] * fArr7[i32 + 10]) + (fArr5[c13] * fArr7[i32 + 5]) + (fArr5[0] * fArr7[i32]);
                for (int i33 = 0; i33 < 3; i33++) {
                    int i34 = (i33 * 5) + i32;
                    fArr7[i34] = (fArr5[i32] - f28) + fArr7[i34];
                }
                i32++;
                i3 = 3;
            }
            fArr7[18] = f27;
            n6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            n6Var.invalidateSelf();
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
        if (this.f42523a0 != null) {
            hs.f(this.W).c(this, hs.f23200a4);
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
        if (this.f42523a0 != null) {
            hs.f(this.W).n(this, hs.f23200a4);
        }
    }

    public void setAdditionalTilt(float f10) {
        this.f42538r = f10;
        this.E.setAdditionalTilt(f10);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i3) {
        this.S = i3;
        this.E.setCardIcon(i3);
    }

    public void setCardNumber(String str) {
        if (str != null && !str.equals(this.R)) {
            this.R = str;
            this.E.setHasCardNumber(true);
            this.I.invalidate();
        }
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.E.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.f42522a = z10;
        this.O.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f10) {
        this.E.setScaleX(f10);
        this.E.setScaleY(f10);
    }

    public void setStickerStyle(float[] fArr) {
        this.f42525b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.E.setStickerStyle(fArr);
        this.P.setTextColor(i0.a.f(fArr[8], p7.p(-7868417, 0, fArr), p7.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f10) {
        this.f42539s = f10;
        this.E.setUseGyroscope(f10);
    }

    public f6(Context context, int i3, int i10) {
        super(context);
        this.f42524b = 1.0f;
        this.f42526c = new Matrix();
        this.d = new Matrix();
        this.f42529e = new Matrix();
        new RectF();
        this.f42531f = new RectF();
        this.f42539s = 1.0f;
        this.f42540w = new Matrix();
        this.f42541x = new Matrix();
        this.f42542y = new Matrix();
        this.J = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final f6 f42283b;

            {
                this.f42283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f42283b.I.invalidate();
                        return;
                    case 1:
                        f6 f6Var = this.f42283b;
                        f6Var.O.invalidate();
                        f6Var.P.invalidate();
                        return;
                    default:
                        this.f42283b.H.invalidate();
                        return;
                }
            }
        };
        xq xqVar = xq.h;
        this.L = new org.telegram.ui.Components.u5(runnable, 240L, xqVar, 0);
        this.W = h10.f22829t0;
        this.f42533g0 = new org.telegram.ui.Components.u5(new Runnable(this) {
            public final f6 f42283b;

            {
                this.f42283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f42283b.I.invalidate();
                        return;
                    case 1:
                        f6 f6Var = this.f42283b;
                        f6Var.O.invalidate();
                        f6Var.P.invalidate();
                        return;
                    default:
                        this.f42283b.H.invalidate();
                        return;
                }
            }
        }, 240L, xqVar, 0);
        this.f42534h0 = new org.telegram.ui.Components.u5(new Runnable(this) {
            public final f6 f42283b;

            {
                this.f42283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f42283b.I.invalidate();
                        return;
                    case 1:
                        f6 f6Var = this.f42283b;
                        f6Var.O.invalidate();
                        f6Var.P.invalidate();
                        return;
                    default:
                        this.f42283b.H.invalidate();
                        return;
                }
            }
        }, 240L, xqVar, 0);
        this.S = i3;
        this.T = i10;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        a6 a6Var = new a6(getContext(), this.S, i10);
        this.E = a6Var;
        this.F = a6Var.getFrontFace();
        float[] fArr = this.f42525b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.f42538r);
        setUseGyroscope(this.f42539s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, mf.c(-2.0f, -1));
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(9, context, this);
        this.H = k2Var;
        if (f42521l0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f42521l0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f42521l0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        k2Var.setTypeface(f42521l0);
        k2Var.setTextColor(-1);
        k2Var.setTextSize(1, 13.0f);
        k2Var.setEllipsize(TextUtils.TruncateAt.END);
        k2Var.setMaxLines(1);
        k2Var.setSingleLine();
        this.F.addView(k2Var, mf.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(13, context, this);
        this.I = r0Var;
        this.F.addView(r0Var, mf.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, mf.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = mf.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        d6 d6Var = new d6(this, context, 0);
        this.O = d6Var;
        d6Var.getDrawable().M = org.telegram.messenger.g0.L(4096.0f);
        d6Var.f34307c.m(0.35f, 320L, 3.5f, xqVar);
        d6Var.setScaleProperty(0.6f);
        d6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        d6Var.setTextSize(org.telegram.messenger.g0.L(23.0f));
        d6Var.setTextColor(-1);
        d6Var.setIgnoreRTL(true);
        linearLayout.addView(d6Var, mf.o(-1, 28));
        d6 d6Var2 = new d6(this, context, 1);
        this.P = d6Var2;
        d6Var2.f34307c.m(0.35f, 320L, 3.5f, xqVar);
        d6Var2.setScaleProperty(0.6f);
        d6Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        d6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        d6Var2.setTextColor(-7868417);
        d6Var2.setLayoutDirection(0);
        d6Var2.setTextDirection(3);
        d6Var2.setGravity(19);
        d6Var2.setIgnoreRTL(true);
        linearLayout.addView(d6Var2, mf.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
