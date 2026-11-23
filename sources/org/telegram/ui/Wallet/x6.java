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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.x01;
import org.telegram.ui.uv;
public class x6 extends FrameLayout implements gs {
    public static Typeface f45298k0;
    public static Typeface f45299l0;
    public final s6 E;
    public final FrameLayout F;
    public View.OnClickListener G;
    public final org.telegram.ui.ActionBar.n2 H;
    public final uv I;
    public final Paint J;
    public float K;
    public final org.telegram.ui.Components.d6 L;
    public final View M;
    public final LinearLayout N;
    public final v6 O;
    public final v6 P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final int T;
    public float U;
    public float V;
    public int W;
    public boolean f45300a;
    public u0 f45301a0;
    public float f45302b;
    public float[] f45303b0;
    public final Matrix f45304c;
    public int f45305c0;
    public final Matrix d;
    public int f45306d0;
    public final Matrix f45307e;
    public float f45308e0;
    public final RectF f45309f;
    public float f45310f0;
    public final org.telegram.ui.Components.d6 f45311g0;
    public float h;
    public final org.telegram.ui.Components.d6 f45312h0;
    public f7 f45313i0;
    public boolean f45314j0;
    public boolean f45315n;
    public float f45316r;
    public float f45317s;
    public final Matrix f45318w;
    public final Matrix f45319x;
    public final Matrix f45320y;

    public x6(Context context) {
        this(context, 2131232813, 46);
    }

    public static void a(final x6 x6Var, final Canvas canvas, float f10) {
        float f11;
        float height = x6Var.getFrontFace().getHeight();
        float width = x6Var.getFrontFace().getWidth() / 1640.0f;
        Paint paint = x6Var.J;
        Context context = x6Var.getContext();
        if (f45298k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f45298k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f45298k0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(f45298k0);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = x6Var.f45303b0;
        int b10 = f8.b(0, fArr);
        int b11 = f8.b(1, fArr);
        if (fArr != null && fArr.length >= 18) {
            f11 = fArr[8];
        } else {
            f11 = 0.0f;
        }
        paint.setColor(i0.a.f(f11, b10, b11));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f12 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f13 = width * 27.333332f;
        final String[] split = f(x6Var.R).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        x6Var.c(f10, new h3(x6Var, 2), new Runnable() {
            @Override
            public final void run() {
                x6 x6Var2 = x6.this;
                x6Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f14 = f13;
                float f15 = f12;
                Paint paint2 = x6Var2.J;
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
        return u0.v(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(u0.u(j3, false))), 0.8f);
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
        float c10 = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.F.getWidth()) / 336.0f) - this.Q.leftMargin) - org.telegram.messenger.g0.L(8.0f));
        if (c10 <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c10);
    }

    public final void c(float f10, h3 h3Var, Runnable runnable) {
        float f11;
        if (f10 > 0.0f) {
            f11 = org.telegram.messenger.g0.L(5.0f);
        } else {
            f11 = 0.0f;
        }
        h3Var.a(f11, org.telegram.messenger.g0.L(1.0f), Color.argb((int) (89.0f * f10), 0, 0, 0));
        runnable.run();
        if (f10 <= 0.0f) {
            return;
        }
        h3Var.a(org.telegram.messenger.g0.N(1.5f), 0.0f, Color.argb((int) (f10 * 140.0f), 0, 0, 0));
        this.f45314j0 = true;
        runnable.run();
        this.f45314j0 = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25296d4) {
            Object obj = objArr[0];
            u0 u0Var = this.f45301a0;
            if (obj == u0Var) {
                l(u0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            View view2 = (View) this.F.getParent();
            s6 s6Var = this.E;
            Matrix matrix2 = this.f45318w;
            matrix2.set((Matrix) s6Var.f45045e.d);
            x01 x01Var = s6Var.f45047f;
            matrix2.preTranslate(x01Var.getLeft(), x01Var.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(this.F.getLeft() - view2.getScrollX(), this.F.getTop() - view2.getScrollY());
            matrix.preConcat(this.F.getMatrix());
            Matrix matrix3 = this.f45319x;
            k(view, matrix3);
            Matrix matrix4 = this.f45320y;
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

    public org.telegram.ui.Components.o6 getBalanceView() {
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
        v6 v6Var;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.F.getWidth() / 336.0f;
        float b10 = b();
        v6 v6Var2 = this.O;
        float c10 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f10 = layoutParams.leftMargin;
        float f11 = layoutParams.topMargin;
        float bottom = ((v6Var2.getBottom() + v6Var2.getTop()) / 2.0f) + f11;
        float height = (v6Var2.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f10, bottom - height, (v6Var2.getDrawable().c() * b10) + f10, bottom + height));
        org.telegram.ui.ActionBar.n2 n2Var = this.H;
        arrayList.add(new RectF(n2Var.getLeft(), n2Var.getTop(), n2Var.getLeft() + Math.min(n2Var.getWidth(), n2Var.getPaint().measureText(n2Var.getText().toString())), n2Var.getBottom()));
        arrayList.add(new RectF(this.F.getWidth() - (34.0f * width), 18.0f * width, this.F.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.F.getWidth(), this.F.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f10, v6Var.getTop() + f11, c10 + f10, f11 + v6Var.getBottom()));
        if (this.f45300a) {
            rectF = new RectF(this.f45309f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f45303b0;
    }

    public org.telegram.ui.Components.o6 getUsdBalanceView() {
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
            this.f45315n = false;
        }
        this.V = f11;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i7, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z10 = false;
        spannableString.setSpan(new w6(this), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j3));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) hd.N0(2131749340, null));
        spannableStringBuilder.setSpan(new oi.w5(this, 5), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round((j3 / 1.0E9d) * ((org.telegram.messenger.i0) np.u1(i7).A7.f26231l.f15708b).f24565a * 100.0d);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        if (round % 100 == 0) {
            z10 = true;
        }
        i10.getClass();
        this.P.setText(org.telegram.messenger.r1.g("USD", 2, round, z10));
    }

    public final void l(u0 u0Var) {
        if (u0Var != null) {
            int i7 = u0Var.f45127a;
            setCardHolder(p10.q(k10.i(i7).f()).toUpperCase());
            if (u0Var.y() != null) {
                setCardNumber(d(u0Var.y().toUpperCase()));
            }
            if (u0Var.N()) {
                j(i7, u0Var.A());
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
        if (this.f45313i0 != null) {
            float[] fArr = this.f45303b0;
            char c10 = '\t';
            int i10 = 2;
            char c11 = 1;
            float f16 = 0.0f;
            float f17 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = f8.f44259c;
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
                    System.arraycopy(f8.f44258b, 0, fArr3, i11 * 12, 12);
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
                    fArr3[i16] = com.google.android.gms.internal.vision.e2.z(f13, f21, min2, f21);
                    int i18 = i15 + 31;
                    if (i17 > 0) {
                        f14 = (f19 - min) / max;
                    } else {
                        f14 = f12;
                    }
                    fArr3[i18] = com.google.android.gms.internal.vision.e2.z(f14, f21, min2, f21);
                    int i19 = i15 + 32;
                    if (i17 > 0) {
                        f15 = (f20 - min) / max;
                    } else {
                        f15 = f12;
                    }
                    fArr3[i19] = com.google.android.gms.internal.vision.e2.z(f15, f21, min2, f21);
                    int i20 = (int) fArr[i13];
                    int i21 = (int) fArr[i12 + 11];
                    int n10 = f8.n(-16216082, i20, i21);
                    int n11 = f8.n(-15291399, i20, i21);
                    for (int i22 = 0; i22 < 3; i22++) {
                        int i23 = 16 - (i22 * 8);
                        float h = f8.h(n10, i23) * 0.73f;
                        float h7 = f8.h(n11, i23) * 0.73f;
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
            float[] fArr4 = this.f45303b0;
            if (fArr4 != null && fArr4.length > 8) {
                f10 = Math.max(f22, Math.min(1.0f, fArr4[8]));
            } else {
                f10 = 1.0f;
            }
            f7 f7Var = this.f45313i0;
            float T1 = org.telegram.messenger.g0.T1(fArr3[30], fArr3[33], f10);
            float T12 = org.telegram.messenger.g0.T1(fArr3[31], fArr3[34], f10);
            float T13 = org.telegram.messenger.g0.T1(fArr3[32], fArr3[35], f10);
            f7Var.getClass();
            float[] fArr5 = f7.f44244j;
            float[] a10 = f7.a(T1, T12, T13);
            float f23 = a10[0];
            float f24 = a10[c14];
            float f25 = a10[2];
            if (f23 == f7Var.f44253e && f24 == f7Var.f44254f && f25 == f7Var.f44255g) {
                return;
            }
            f7Var.f44253e = f23;
            f7Var.f44254f = f24;
            f7Var.f44255g = f25;
            if (f7.f44245k == null) {
                f7.f44245k = f7.a(0.0f, 0.47809f, 1.0f);
            }
            float[] fArr6 = f7.f44245k;
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
            f7Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            f7Var.invalidateSelf();
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
        if (this.f45301a0 != null) {
            ls.f(this.W).c(this, ls.f25296d4);
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
        if (this.f45301a0 != null) {
            ls.f(this.W).n(this, ls.f25296d4);
        }
    }

    public void setAdditionalTilt(float f10) {
        this.f45316r = f10;
        this.E.setAdditionalTilt(f10);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i7) {
        this.S = i7;
        this.E.setCardIcon(i7);
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
        this.f45300a = z10;
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
        this.f45303b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.E.setStickerStyle(fArr);
        this.P.setTextColor(i0.a.f(fArr[8], f8.p(-7868417, 0, fArr), f8.p(-7868417, 3, fArr)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f10) {
        this.f45317s = f10;
        this.E.setUseGyroscope(f10);
    }

    public x6(Context context, int i7, int i10) {
        super(context);
        this.f45302b = 1.0f;
        this.f45304c = new Matrix();
        this.d = new Matrix();
        this.f45307e = new Matrix();
        new RectF();
        this.f45309f = new RectF();
        this.f45317s = 1.0f;
        this.f45318w = new Matrix();
        this.f45319x = new Matrix();
        this.f45320y = new Matrix();
        this.J = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final x6 f45115b;

            {
                this.f45115b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f45115b.I.invalidate();
                        return;
                    case 1:
                        x6 x6Var = this.f45115b;
                        x6Var.O.invalidate();
                        x6Var.P.invalidate();
                        return;
                    default:
                        this.f45115b.H.invalidate();
                        return;
                }
            }
        };
        nr nrVar = nr.h;
        this.L = new org.telegram.ui.Components.d6(runnable, 240L, nrVar, 0);
        this.W = k10.f24968t0;
        this.f45311g0 = new org.telegram.ui.Components.d6(new Runnable(this) {
            public final x6 f45115b;

            {
                this.f45115b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f45115b.I.invalidate();
                        return;
                    case 1:
                        x6 x6Var = this.f45115b;
                        x6Var.O.invalidate();
                        x6Var.P.invalidate();
                        return;
                    default:
                        this.f45115b.H.invalidate();
                        return;
                }
            }
        }, 240L, nrVar, 0);
        this.f45312h0 = new org.telegram.ui.Components.d6(new Runnable(this) {
            public final x6 f45115b;

            {
                this.f45115b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f45115b.I.invalidate();
                        return;
                    case 1:
                        x6 x6Var = this.f45115b;
                        x6Var.O.invalidate();
                        x6Var.P.invalidate();
                        return;
                    default:
                        this.f45115b.H.invalidate();
                        return;
                }
            }
        }, 240L, nrVar, 0);
        this.S = i7;
        this.T = i10;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        s6 s6Var = new s6(getContext(), this.S, i10);
        this.E = s6Var;
        this.F = s6Var.getFrontFace();
        float[] fArr = this.f45303b0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.f45316r);
        setUseGyroscope(this.f45317s);
        this.E.setOnClickListener(this.G);
        addView(this.E, 0, c8.ma.c(-2.0f, -1));
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(9, context, this);
        this.H = n2Var;
        if (f45299l0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f45299l0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f45299l0 = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        n2Var.setTypeface(f45299l0);
        n2Var.setTextColor(-1);
        n2Var.setTextSize(1, 13.0f);
        n2Var.setEllipsize(TextUtils.TruncateAt.END);
        n2Var.setMaxLines(1);
        n2Var.setSingleLine();
        this.F.addView(n2Var, c8.ma.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        uv uvVar = new uv(12, context, this);
        this.I = uvVar;
        this.F.addView(uvVar, c8.ma.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.F.addView(view, c8.ma.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.F.addView(linearLayout, d);
        v6 v6Var = new v6(this, context, 0);
        this.O = v6Var;
        v6Var.getDrawable().N = org.telegram.messenger.g0.L(4096.0f);
        v6Var.f38115c.m(0.35f, 320L, 3.5f, nrVar);
        v6Var.setScaleProperty(0.6f);
        v6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        v6Var.setTextSize(org.telegram.messenger.g0.L(23.0f));
        v6Var.setTextColor(-1);
        v6Var.setIgnoreRTL(true);
        linearLayout.addView(v6Var, c8.ma.o(-1, 28));
        v6 v6Var2 = new v6(this, context, 1);
        this.P = v6Var2;
        v6Var2.f38115c.m(0.35f, 320L, 3.5f, nrVar);
        v6Var2.setScaleProperty(0.6f);
        v6Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        v6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        v6Var2.setTextColor(-7868417);
        v6Var2.setLayoutDirection(0);
        v6Var2.setTextDirection(3);
        v6Var2.setGravity(19);
        v6Var2.setIgnoreRTL(true);
        linearLayout.addView(v6Var2, c8.ma.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
