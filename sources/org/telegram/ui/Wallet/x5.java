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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.kk;
import org.telegram.ui.v10;
public class x5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface f35099j0;
    public static Typeface f35100k0;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final kk G;
    public final v10 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.f6 K;
    public final View L;
    public final LinearLayout M;
    public final v5 N;
    public final v5 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public m0 W;
    public boolean f35101a;
    public float[] f35102a0;
    public float f35103b;
    public int f35104b0;
    public final Matrix f35105c;
    public int f35106c0;
    public final Matrix d;
    public float f35107d0;
    public final Matrix e;
    public float f35108e0;
    public final RectF f35109f;
    public final org.telegram.ui.Components.f6 f35110f0;
    public final org.telegram.ui.Components.f6 f35111g0;
    public float h;
    public f6 f35112h0;
    public boolean f35113i0;
    public boolean f35114n;
    public float f35115r;
    public float f35116s;
    public final Matrix v;
    public final Matrix f35117w;
    public final Matrix f35118x;
    public final s5 f35119y;

    public x5(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final x5 x5Var, final Canvas canvas, float f7) {
        float f10;
        float height = x5Var.getFrontFace().getHeight();
        float width = x5Var.getFrontFace().getWidth() / 1640.0f;
        Paint paint = x5Var.I;
        Context context = x5Var.getContext();
        if (f35099j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f35099j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f35099j0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(f35099j0);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = x5Var.f35102a0;
        int b10 = h7.b(fArr, 0);
        int b11 = h7.b(fArr, 1);
        if (fArr != null && fArr.length >= 18) {
            f10 = fArr[8];
        } else {
            f10 = 0.0f;
        }
        paint.setColor(i0.a.f(f10, b10, b11));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        final float f11 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
        final float f12 = width * 27.333332f;
        final String[] split = f(x5Var.Q).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        x5Var.c(f7, new o2(x5Var, 2), new Runnable() {
            @Override
            public final void run() {
                x5 x5Var2 = x5.this;
                x5Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f13 = f12;
                float f14 = f11;
                Paint paint2 = x5Var2.I;
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
        return m0.p(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(m0.o(j10, false))), 0.8f);
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
        float max = Math.max(0.0f, (((((336.0f - this.S) - 48.0f) * this.E.getWidth()) / 336.0f) - this.P.leftMargin) - AndroidUtilities.dp(8.0f));
        if (c10 <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c10);
    }

    public final void c(float f7, o2 o2Var, Runnable runnable) {
        float f10;
        if (f7 > 0.0f) {
            f10 = AndroidUtilities.dp(5.0f);
        } else {
            f10 = 0.0f;
        }
        o2Var.a(f10, AndroidUtilities.dp(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        o2Var.a(AndroidUtilities.dpf2(1.5f), 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.f35113i0 = true;
        runnable.run();
        this.f35113i0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
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
            s5 s5Var = this.f35119y;
            Matrix matrix2 = this.v;
            matrix2.set((Matrix) s5Var.e.f30389c);
            ci.m1 m1Var = s5Var.f34853f;
            matrix2.preTranslate(m1Var.getLeft(), m1Var.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(this.E.getLeft() - view2.getScrollX(), this.E.getTop() - view2.getScrollY());
            matrix.preConcat(this.E.getMatrix());
            Matrix matrix3 = this.f35117w;
            k(view, matrix3);
            Matrix matrix4 = this.f35118x;
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

    public org.telegram.ui.Components.q6 getBalanceView() {
        return this.N;
    }

    public TextView getCardHolderView() {
        return this.G;
    }

    public float getCardRotationX() {
        return this.f35119y.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.f35119y.getCardRotationY();
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
        v5 v5Var;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.E.getWidth() / 336.0f;
        float b10 = b();
        v5 v5Var2 = this.N;
        float c10 = this.O.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.P;
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((v5Var2.getBottom() + v5Var2.getTop()) / 2.0f) + f10;
        float height = (v5Var2.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, (v5Var2.getDrawable().c() * b10) + f7, bottom + height));
        kk kkVar = this.G;
        arrayList.add(new RectF(kkVar.getLeft(), kkVar.getTop(), kkVar.getLeft() + Math.min(kkVar.getWidth(), kkVar.getPaint().measureText(kkVar.getText().toString())), kkVar.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f7, v5Var.getTop() + f10, c10 + f7, f10 + v5Var.getBottom()));
        if (this.f35101a) {
            rectF = new RectF(this.f35109f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f35102a0;
    }

    public org.telegram.ui.Components.q6 getUsdBalanceView() {
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
            this.f35114n = false;
        }
        this.U = f10;
        this.N.invalidate();
        this.O.invalidate();
    }

    public final void j(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z10 = false;
        spannableString.setSpan(new w5(this, R.drawable.wallet_gram_large), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new ki.y5(this, 4), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d);
        BillingController billingController = BillingController.getInstance();
        if (round % 100 == 0) {
            z10 = true;
        }
        this.O.setText(billingController.formatCurrency(round, "USD", 2, z10));
    }

    public final void l(m0 m0Var) {
        if (m0Var != null) {
            int i10 = m0Var.f34481a;
            setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
            if (m0Var.s() != null) {
                setCardNumber(d(m0Var.s().toUpperCase()));
            }
            if (m0Var.E()) {
                j(i10, m0Var.u());
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
        if (this.f35112h0 != null) {
            float[] fArr = this.f35102a0;
            char c10 = '\t';
            int i11 = 2;
            char c11 = 1;
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = h7.f34296c;
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
                    System.arraycopy(h7.f34295b, 0, fArr3, i12 * 12, 12);
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
                    fArr3[i17] = com.google.android.gms.internal.play_billing.k3.y(f12, f20, min2, f20);
                    int i19 = i16 + 31;
                    if (i18 > 0) {
                        f13 = (f18 - min) / max;
                    } else {
                        f13 = f11;
                    }
                    fArr3[i19] = com.google.android.gms.internal.play_billing.k3.y(f13, f20, min2, f20);
                    int i20 = i16 + 32;
                    if (i18 > 0) {
                        f14 = (f19 - min) / max;
                    } else {
                        f14 = f11;
                    }
                    fArr3[i20] = com.google.android.gms.internal.play_billing.k3.y(f14, f20, min2, f20);
                    int i21 = (int) fArr[i14];
                    int i22 = (int) fArr[i13 + 11];
                    int n10 = h7.n(-16216082, i21, i22);
                    int n11 = h7.n(-15291399, i21, i22);
                    for (int i23 = 0; i23 < 3; i23++) {
                        int i24 = 16 - (i23 * 8);
                        float h = h7.h(n10, i24) * 0.73f;
                        float h10 = h7.h(n11, i24) * 0.73f;
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
                    f10 = i0.a.f(0.2f, ((int) fArr[i28 + 12]) | (-16777216), ((int) fArr[i28 + 11]) | (-16777216));
                } else {
                    f10 = i0.a.f(0.2f, -16611884, -16748084);
                }
                int i30 = i26 * 3;
                fArr3[i30 + 36] = ((f10 >> 16) & 255) / 255.0f;
                fArr3[i30 + 37] = ((f10 >> 8) & 255) / 255.0f;
                fArr3[i30 + 38] = (f10 & 255) / 255.0f;
                i26++;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.f35102a0;
            if (fArr4 != null && fArr4.length > 8) {
                f7 = Math.max(f21, Math.min(1.0f, fArr4[8]));
            } else {
                f7 = 1.0f;
            }
            f6 f6Var = this.f35112h0;
            float lerp = AndroidUtilities.lerp(fArr3[30], fArr3[33], f7);
            float lerp2 = AndroidUtilities.lerp(fArr3[31], fArr3[34], f7);
            float lerp3 = AndroidUtilities.lerp(fArr3[32], fArr3[35], f7);
            f6Var.getClass();
            float[] fArr5 = f6.f34210j;
            float[] a2 = f6.a(lerp, lerp2, lerp3);
            float f22 = a2[0];
            float f23 = a2[c14];
            float f24 = a2[2];
            if (f22 == f6Var.e && f23 == f6Var.f34219f && f24 == f6Var.f34220g) {
                return;
            }
            f6Var.e = f22;
            f6Var.f34219f = f23;
            f6Var.f34220g = f24;
            if (f6.f34211k == null) {
                f6.f34211k = f6.a(0.0f, 0.47809f, 1.0f);
            }
            float[] fArr6 = f6.f34211k;
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
            f6Var.d.setColorFilter(new ColorMatrixColorFilter(fArr7));
            f6Var.invalidateSelf();
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
            view.setTranslationZ(AndroidUtilities.dp(16.0f));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
        if (this.W != null) {
            NotificationCenter.getInstance(this.V).addObserver(this, NotificationCenter.walletUpdate);
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
            NotificationCenter.getInstance(this.V).removeObserver(this, NotificationCenter.walletUpdate);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.f35115r = f7;
        this.f35119y.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.R = i10;
        this.f35119y.setCardIcon(i10);
    }

    public void setCardNumber(String str) {
        if (str != null && !str.equals(this.Q)) {
            this.Q = str;
            this.f35119y.setHasCardNumber(true);
            this.H.invalidate();
        }
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
        this.f35119y.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.f35101a = z10;
        this.N.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f7) {
        this.f35119y.setScaleX(f7);
        this.f35119y.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.f35102a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.f35119y.setStickerStyle(fArr);
        this.O.setTextColor(i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f7) {
        this.f35116s = f7;
        this.f35119y.setUseGyroscope(f7);
    }

    public x5(Context context, int i10, int i11) {
        super(context);
        this.f35103b = 1.0f;
        this.f35105c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        new RectF();
        this.f35109f = new RectF();
        this.f35116s = 1.0f;
        this.v = new Matrix();
        this.f35117w = new Matrix();
        this.f35118x = new Matrix();
        this.I = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final x5 f34912b;

            {
                this.f34912b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34912b.H.invalidate();
                        return;
                    case 1:
                        x5 x5Var = this.f34912b;
                        x5Var.N.invalidate();
                        x5Var.O.invalidate();
                        return;
                    default:
                        this.f34912b.G.invalidate();
                        return;
                }
            }
        };
        bs bsVar = bs.h;
        this.K = new org.telegram.ui.Components.f6(runnable, 240L, bsVar, 0);
        this.V = UserConfig.selectedAccount;
        this.f35110f0 = new org.telegram.ui.Components.f6(new Runnable(this) {
            public final x5 f34912b;

            {
                this.f34912b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34912b.H.invalidate();
                        return;
                    case 1:
                        x5 x5Var = this.f34912b;
                        x5Var.N.invalidate();
                        x5Var.O.invalidate();
                        return;
                    default:
                        this.f34912b.G.invalidate();
                        return;
                }
            }
        }, 240L, bsVar, 0);
        this.f35111g0 = new org.telegram.ui.Components.f6(new Runnable(this) {
            public final x5 f34912b;

            {
                this.f34912b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34912b.H.invalidate();
                        return;
                    case 1:
                        x5 x5Var = this.f34912b;
                        x5Var.N.invalidate();
                        x5Var.O.invalidate();
                        return;
                    default:
                        this.f34912b.G.invalidate();
                        return;
                }
            }
        }, 240L, bsVar, 0);
        this.R = i10;
        this.S = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        s5 s5Var = new s5(getContext(), this.R, i11);
        this.f35119y = s5Var;
        this.E = s5Var.getFrontFace();
        float[] fArr = this.f35102a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.f35115r);
        setUseGyroscope(this.f35116s);
        this.f35119y.setOnClickListener(this.F);
        addView(this.f35119y, 0, w7.z5.c(-2.0f, -1));
        kk kkVar = new kk(this, context, 6);
        this.G = kkVar;
        if (f35100k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f35100k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f35100k0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        kkVar.setTypeface(f35100k0);
        kkVar.setTextColor(-1);
        kkVar.setTextSize(1, 13.0f);
        kkVar.setEllipsize(TextUtils.TruncateAt.END);
        kkVar.setMaxLines(1);
        kkVar.setSingleLine();
        this.E.addView(kkVar, w7.z5.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        v10 v10Var = new v10(this, context, 11);
        this.H = v10Var;
        this.E.addView(v10Var, w7.z5.c(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, w7.z5.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = d;
        this.E.addView(linearLayout, d);
        v5 v5Var = new v5(this, context, 0);
        this.N = v5Var;
        v5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        v5Var.f29484c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var.setScaleProperty(0.6f);
        v5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var.setTextSize(AndroidUtilities.dp(23.0f));
        v5Var.setTextColor(-1);
        v5Var.setIgnoreRTL(true);
        linearLayout.addView(v5Var, w7.z5.n(-1, 28));
        v5 v5Var2 = new v5(this, context, 1);
        this.O = v5Var2;
        v5Var2.f29484c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var2.setScaleProperty(0.6f);
        v5Var2.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var2.setTextSize(AndroidUtilities.dp(14.0f));
        v5Var2.setTextColor(-7868417);
        v5Var2.setLayoutDirection(0);
        v5Var2.setTextDirection(3);
        v5Var2.setGravity(19);
        v5Var2.setIgnoreRTL(true);
        linearLayout.addView(v5Var2, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
