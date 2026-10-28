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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.b20;
import org.telegram.ui.ok;
public class w5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface f37442j0;
    public static Typeface f37443k0;
    public final FrameLayout E;
    public View.OnClickListener F;
    public final ok G;
    public final b20 H;
    public final Paint I;
    public float J;
    public final org.telegram.ui.Components.h6 K;
    public final View L;
    public final LinearLayout M;
    public final u5 N;
    public final u5 O;
    public final FrameLayout.LayoutParams P;
    public String Q;
    public int R;
    public final int S;
    public float T;
    public float U;
    public int V;
    public l0 W;
    public boolean f37444a;
    public float[] f37445a0;
    public float f37446b;
    public int f37447b0;
    public final Matrix f37448c;
    public int f37449c0;
    public final Matrix d;
    public float f37450d0;
    public final Matrix e;
    public float f37451e0;
    public final RectF f37452f;
    public final org.telegram.ui.Components.h6 f37453f0;
    public final org.telegram.ui.Components.h6 f37454g0;
    public float h;
    public f6 f37455h0;
    public boolean f37456i0;
    public boolean f37457n;
    public float f37458r;
    public float f37459s;
    public final Matrix v;
    public final Matrix f37460w;
    public final Matrix f37461x;
    public final r5 f37462y;

    public w5(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static void a(final w5 w5Var, final Canvas canvas, float f7) {
        float f10;
        float height = w5Var.getFrontFace().getHeight();
        float width = w5Var.getFrontFace().getWidth() / 1640.0f;
        Paint paint = w5Var.I;
        Context context = w5Var.getContext();
        if (f37442j0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f37442j0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f37442j0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        paint.setTypeface(f37442j0);
        paint.setTextSize(47.345238f * width);
        paint.setTextAlign(Paint.Align.CENTER);
        float[] fArr = w5Var.f37445a0;
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
        final String[] split = f(w5Var.Q).split("\\n");
        canvas.save();
        canvas.translate(width * 1527.738f, 0.5002976f * height);
        canvas.rotate(90.0f);
        w5Var.c(f7, new n2(w5Var, 2), new Runnable() {
            @Override
            public final void run() {
                w5 w5Var2 = w5.this;
                w5Var2.getClass();
                String[] strArr = split;
                String str = strArr[0];
                float f13 = f12;
                float f14 = f11;
                Paint paint2 = w5Var2.I;
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
        return l0.q(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(l0.p(j10, false))), 0.8f);
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

    public final void c(float f7, n2 n2Var, Runnable runnable) {
        float f10;
        if (f7 > 0.0f) {
            f10 = AndroidUtilities.dp(5.0f);
        } else {
            f10 = 0.0f;
        }
        n2Var.a(f10, AndroidUtilities.dp(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        n2Var.a(AndroidUtilities.dpf2(1.5f), 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.f37456i0 = true;
        runnable.run();
        this.f37456i0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            Object obj = objArr[0];
            l0 l0Var = this.W;
            if (obj == l0Var) {
                l(l0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            View view2 = (View) this.E.getParent();
            r5 r5Var = this.f37462y;
            Matrix matrix2 = this.v;
            matrix2.set((Matrix) r5Var.e.f32797c);
            di.l1 l1Var = r5Var.f37198f;
            matrix2.preTranslate(l1Var.getLeft(), l1Var.getTop());
            k((View) view2.getParent(), matrix);
            matrix.preConcat(matrix2);
            matrix.preTranslate(this.E.getLeft() - view2.getScrollX(), this.E.getTop() - view2.getScrollY());
            matrix.preConcat(this.E.getMatrix());
            Matrix matrix3 = this.f37460w;
            k(view, matrix3);
            Matrix matrix4 = this.f37461x;
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

    public org.telegram.ui.Components.s6 getBalanceView() {
        return this.N;
    }

    public TextView getCardHolderView() {
        return this.G;
    }

    public float getCardRotationX() {
        return this.f37462y.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.f37462y.getCardRotationY();
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
        u5 u5Var;
        RectF rectF;
        ArrayList<RectF> arrayList = new ArrayList<>();
        float width = this.E.getWidth() / 336.0f;
        float b10 = b();
        u5 u5Var2 = this.N;
        float c10 = this.O.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.P;
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((u5Var2.getBottom() + u5Var2.getTop()) / 2.0f) + f10;
        float height = (u5Var2.getHeight() * b10) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, (u5Var2.getDrawable().c() * b10) + f7, bottom + height));
        ok okVar = this.G;
        arrayList.add(new RectF(okVar.getLeft(), okVar.getTop(), okVar.getLeft() + Math.min(okVar.getWidth(), okVar.getPaint().measureText(okVar.getText().toString())), okVar.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f7, u5Var.getTop() + f10, c10 + f7, f10 + u5Var.getBottom()));
        if (this.f37444a) {
            rectF = new RectF(this.f37452f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f37445a0;
    }

    public org.telegram.ui.Components.s6 getUsdBalanceView() {
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
            this.f37457n = false;
        }
        this.U = f10;
        this.N.invalidate();
        this.O.invalidate();
    }

    public final void j(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z10 = false;
        spannableString.setSpan(new v5(this, R.drawable.wallet_gram_large), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) e(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new li.z5(this, 4), length, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d);
        BillingController billingController = BillingController.getInstance();
        if (round % 100 == 0) {
            z10 = true;
        }
        this.O.setText(billingController.formatCurrency(round, "USD", 2, z10));
    }

    public final void l(l0 l0Var) {
        if (l0Var != null) {
            int i10 = l0Var.f36834a;
            setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
            if (l0Var.t() != null) {
                setCardNumber(d(l0Var.t().toUpperCase()));
            }
            if (l0Var.G()) {
                j(i10, l0Var.v());
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
        if (this.f37455h0 != null) {
            float[] fArr = this.f37445a0;
            char c10 = '\t';
            int i11 = 2;
            char c11 = 1;
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = h7.f36664c;
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
                    System.arraycopy(h7.f36663b, 0, fArr3, i12 * 12, 12);
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
                    fArr3[i17] = c3.h0.z(f12, f20, min2, f20);
                    int i19 = i16 + 31;
                    if (i18 > 0) {
                        f13 = (f18 - min) / max;
                    } else {
                        f13 = f11;
                    }
                    fArr3[i19] = c3.h0.z(f13, f20, min2, f20);
                    int i20 = i16 + 32;
                    if (i18 > 0) {
                        f14 = (f19 - min) / max;
                    } else {
                        f14 = f11;
                    }
                    fArr3[i20] = c3.h0.z(f14, f20, min2, f20);
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
            float[] fArr4 = this.f37445a0;
            if (fArr4 != null && fArr4.length > 8) {
                f7 = Math.max(f21, Math.min(1.0f, fArr4[8]));
            } else {
                f7 = 1.0f;
            }
            f6 f6Var = this.f37455h0;
            float lerp = AndroidUtilities.lerp(fArr3[30], fArr3[33], f7);
            float lerp2 = AndroidUtilities.lerp(fArr3[31], fArr3[34], f7);
            float lerp3 = AndroidUtilities.lerp(fArr3[32], fArr3[35], f7);
            f6Var.getClass();
            float[] fArr5 = f6.f36588j;
            float[] a2 = f6.a(lerp, lerp2, lerp3);
            float f22 = a2[0];
            float f23 = a2[c14];
            float f24 = a2[2];
            if (f22 == f6Var.e && f23 == f6Var.f36597f && f24 == f6Var.f36598g) {
                return;
            }
            f6Var.e = f22;
            f6Var.f36597f = f23;
            f6Var.f36598g = f24;
            if (f6.f36589k == null) {
                f6.f36589k = f6.a(0.0f, 0.47809f, 1.0f);
            }
            float[] fArr6 = f6.f36589k;
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
            NotificationCenter.getInstance(this.V).addWeakObserver(this, NotificationCenter.walletUpdate);
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
        this.f37458r = f7;
        this.f37462y.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.G.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.R = i10;
        this.f37462y.setCardIcon(i10);
    }

    public void setCardNumber(String str) {
        if (str != null && !str.equals(this.Q)) {
            this.Q = str;
            this.f37462y.setHasCardNumber(true);
            this.H.invalidate();
        }
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
        this.f37462y.setOnClickListener(onClickListener);
    }

    public void setDiamondOnCard(boolean z10) {
        this.f37444a = z10;
        this.N.invalidate();
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f7) {
        this.f37462y.setScaleX(f7);
        this.f37462y.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.f37445a0 = fArr;
        m();
        this.N.invalidate();
        this.H.invalidate();
        this.f37462y.setStickerStyle(fArr);
        this.O.setTextColor(i0.a.f(fArr[8], h7.p(fArr, -7868417, 0), h7.p(fArr, -7868417, 3)));
        this.G.invalidate();
    }

    public void setUseGyroscope(float f7) {
        this.f37459s = f7;
        this.f37462y.setUseGyroscope(f7);
    }

    public w5(Context context, int i10, int i11) {
        super(context);
        this.f37446b = 1.0f;
        this.f37448c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        new RectF();
        this.f37452f = new RectF();
        this.f37459s = 1.0f;
        this.v = new Matrix();
        this.f37460w = new Matrix();
        this.f37461x = new Matrix();
        this.I = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final w5 f37245b;

            {
                this.f37245b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f37245b.H.invalidate();
                        return;
                    case 1:
                        w5 w5Var = this.f37245b;
                        w5Var.N.invalidate();
                        w5Var.O.invalidate();
                        return;
                    default:
                        this.f37245b.G.invalidate();
                        return;
                }
            }
        };
        ds dsVar = ds.h;
        this.K = new org.telegram.ui.Components.h6(runnable, 240L, dsVar, 0);
        this.V = UserConfig.selectedAccount;
        this.f37453f0 = new org.telegram.ui.Components.h6(new Runnable(this) {
            public final w5 f37245b;

            {
                this.f37245b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f37245b.H.invalidate();
                        return;
                    case 1:
                        w5 w5Var = this.f37245b;
                        w5Var.N.invalidate();
                        w5Var.O.invalidate();
                        return;
                    default:
                        this.f37245b.G.invalidate();
                        return;
                }
            }
        }, 240L, dsVar, 0);
        this.f37454g0 = new org.telegram.ui.Components.h6(new Runnable(this) {
            public final w5 f37245b;

            {
                this.f37245b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f37245b.H.invalidate();
                        return;
                    case 1:
                        w5 w5Var = this.f37245b;
                        w5Var.N.invalidate();
                        w5Var.O.invalidate();
                        return;
                    default:
                        this.f37245b.G.invalidate();
                        return;
                }
            }
        }, 240L, dsVar, 0);
        this.R = i10;
        this.S = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        r5 r5Var = new r5(getContext(), this.R, i11);
        this.f37462y = r5Var;
        this.E = r5Var.getFrontFace();
        float[] fArr = this.f37445a0;
        if (fArr != null) {
            setStickerStyle(fArr);
        }
        setAdditionalTilt(this.f37458r);
        setUseGyroscope(this.f37459s);
        this.f37462y.setOnClickListener(this.F);
        addView(this.f37462y, 0, kb1.g(-2.0f, -1));
        ok okVar = new ok(this, context, 6);
        this.G = okVar;
        if (f37443k0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f37443k0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f37443k0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        okVar.setTypeface(f37443k0);
        okVar.setTextColor(-1);
        okVar.setTextSize(1, 13.0f);
        okVar.setEllipsize(TextUtils.TruncateAt.END);
        okVar.setMaxLines(1);
        okVar.setSingleLine();
        this.E.addView(okVar, kb1.h(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        b20 b20Var = new b20(this, context, 11);
        this.H = b20Var;
        this.E.addView(b20Var, kb1.g(-1.0f, -1));
        View view = new View(context);
        this.L = view;
        this.E.addView(view, kb1.h(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams h = kb1.h(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.P = h;
        this.E.addView(linearLayout, h);
        u5 u5Var = new u5(this, context, 0);
        this.N = u5Var;
        u5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        u5Var.f32490c.m(0.35f, 320L, 3.5f, dsVar);
        u5Var.setScaleProperty(0.6f);
        u5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        u5Var.setTextSize(AndroidUtilities.dp(23.0f));
        u5Var.setTextColor(-1);
        u5Var.setIgnoreRTL(true);
        linearLayout.addView(u5Var, kb1.r(-1, 28));
        u5 u5Var2 = new u5(this, context, 1);
        this.O = u5Var2;
        u5Var2.f32490c.m(0.35f, 320L, 3.5f, dsVar);
        u5Var2.setScaleProperty(0.6f);
        u5Var2.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        u5Var2.setTextSize(AndroidUtilities.dp(14.0f));
        u5Var2.setTextColor(-7868417);
        u5Var2.setLayoutDirection(0);
        u5Var2.setTextDirection(3);
        u5Var2.setGravity(19);
        u5Var2.setIgnoreRTL(true);
        linearLayout.addView(u5Var2, kb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, 16));
    }
}
