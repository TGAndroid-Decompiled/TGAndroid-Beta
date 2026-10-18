package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.mk;
import org.telegram.ui.x10;
public class x5 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface f35080n0;
    public static Typeface f35081o0;
    public final FrameLayout E;
    public Bitmap F;
    public View.OnClickListener G;
    public final mk H;
    public final x10 I;
    public final Paint J;
    public float K;
    public final org.telegram.ui.Components.f6 L;
    public final View M;
    public final LinearLayout N;
    public final v5 O;
    public final v5 P;
    public final FrameLayout.LayoutParams Q;
    public String R;
    public int S;
    public final int T;
    public float U;
    public float V;
    public int W;
    public boolean f35082a;
    public m0 f35083a0;
    public float f35084b;
    public float[] f35085b0;
    public final Matrix f35086c;
    public float[] f35087c0;
    public final Matrix d;
    public float[] f35088d0;
    public final Matrix e;
    public String f35089e0;
    public final RectF f35090f;
    public int f35091f0;
    public int f35092g0;
    public float h;
    public float f35093h0;
    public float f35094i0;
    public final org.telegram.ui.Components.f6 f35095j0;
    public final org.telegram.ui.Components.f6 f35096k0;
    public f6 f35097l0;
    public boolean m0;
    public boolean f35098n;
    public float f35099r;
    public float f35100s;
    public final Matrix v;
    public final Matrix f35101w;
    public final Matrix f35102x;
    public final s5 f35103y;

    public x5(Context context) {
        this(context, R.drawable.wallet_card_qr, 46);
    }

    public static String c(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder d(long j10) {
        return m0.p(new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US)).format(new BigDecimal(m0.o(j10, false))), 0.8f);
    }

    public static String e(String str) {
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

    public static Typeface f(Context context) {
        if (f35080n0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f35080n0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 400").setWeight(400).build();
            } else {
                f35080n0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        return f35080n0;
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

    public final float a() {
        float c10 = this.O.getDrawable().c();
        float max = Math.max(0.0f, (((((336.0f - this.T) - 48.0f) * this.E.getWidth()) / 336.0f) - this.Q.leftMargin) - AndroidUtilities.dp(8.0f));
        if (c10 <= 0.0f) {
            return 1.0f;
        }
        return Math.min(1.0f, max / c10);
    }

    public final void b(float f7, boolean z10, o2 o2Var, Runnable runnable) {
        float f10;
        if (z10) {
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), f7);
            float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), 0, f7);
            float dp = AndroidUtilities.dp(1.0f);
            float[] fArr = this.f35085b0;
            int i10 = -16611884;
            if (fArr != null) {
                i10 = i0.a.f(fArr[8], h7.q(fArr, -16611884, 0), h7.q(fArr, -16611884, 3));
            }
            o2Var.a(lerp, lerp2, dp, i0.a.f(f7, i10, 1493172224));
        } else {
            if (f7 > 0.0f) {
                f10 = AndroidUtilities.dp(5.0f);
            } else {
                f10 = 0.0f;
            }
            o2Var.a(f10, 0.0f, AndroidUtilities.dp(1.0f), Color.argb((int) (89.0f * f7), 0, 0, 0));
        }
        runnable.run();
        if (f7 <= 0.0f) {
            return;
        }
        o2Var.a(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, Color.argb((int) (f7 * 140.0f), 0, 0, 0));
        this.m0 = true;
        runnable.run();
        this.m0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            Object obj = objArr[0];
            m0 m0Var = this.f35083a0;
            if (obj == m0Var) {
                l(m0Var);
            }
        }
    }

    public final boolean g(View view, Matrix matrix) {
        if (isAttachedToWindow() && view.isAttachedToWindow() && getRootView() == view.getRootView()) {
            View view2 = (View) this.E.getParent();
            Matrix matrix2 = this.f35103y.e.f34779a;
            Matrix matrix3 = this.v;
            matrix3.set(matrix2);
            k(view2, matrix);
            matrix.preConcat(matrix3);
            matrix.preTranslate(this.E.getLeft() - view2.getScrollX(), this.E.getTop() - view2.getScrollY());
            matrix.preConcat(this.E.getMatrix());
            Matrix matrix4 = this.f35101w;
            k(view, matrix4);
            Matrix matrix5 = this.f35102x;
            if (matrix4.invert(matrix5)) {
                matrix.postConcat(matrix5);
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

    public org.telegram.ui.Components.q6 getBalanceView() {
        return this.O;
    }

    public TextView getCardHolderView() {
        return this.H;
    }

    public float getCardRotationX() {
        return this.f35103y.getCardRotationX();
    }

    public float getCardRotationY() {
        return this.f35103y.getCardRotationY();
    }

    public String getDebugBackdropName() {
        return this.f35089e0;
    }

    public FrameLayout getFrontFace() {
        return this.E;
    }

    public int getStickerLayerIndex() {
        int indexOfChild = this.E.indexOfChild(this.H);
        int indexOfChild2 = this.E.indexOfChild(this.N);
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
        float a2 = a();
        v5 v5Var2 = this.O;
        float c10 = this.P.getDrawable().c();
        FrameLayout.LayoutParams layoutParams = this.Q;
        float f7 = layoutParams.leftMargin;
        float f10 = layoutParams.topMargin;
        float bottom = ((v5Var2.getBottom() + v5Var2.getTop()) / 2.0f) + f10;
        float height = (v5Var2.getHeight() * a2) / 2.0f;
        arrayList.add(new RectF(f7, bottom - height, (v5Var2.getDrawable().c() * a2) + f7, bottom + height));
        mk mkVar = this.H;
        arrayList.add(new RectF(mkVar.getLeft(), mkVar.getTop(), mkVar.getLeft() + Math.min(mkVar.getWidth(), mkVar.getPaint().measureText(mkVar.getText().toString())), mkVar.getBottom()));
        arrayList.add(new RectF(this.E.getWidth() - (34.0f * width), 18.0f * width, this.E.getWidth() - (12.0f * width), width * 187.0f));
        Path path = new Path();
        h(path, this.E.getWidth(), this.E.getHeight());
        RectF rectF2 = new RectF();
        path.computeBounds(rectF2, true);
        arrayList.add(rectF2);
        arrayList.add(new RectF(f7, v5Var.getTop() + f10, c10 + f7, f10 + v5Var.getBottom()));
        if (this.f35082a) {
            rectF = new RectF(this.f35090f);
        } else {
            rectF = new RectF();
        }
        arrayList.add(rectF);
        return arrayList;
    }

    public float[] getStickerStyle() {
        return this.f35085b0;
    }

    public org.telegram.ui.Components.q6 getUsdBalanceView() {
        return this.P;
    }

    public final void h(Path path, float f7, float f10) {
        path.rewind();
        float f11 = 336 - this.T;
        path.addRoundRect(((f11 - 48.0f) * f7) / 336.0f, 0.36097562f * f10, (f11 * f7) / 336.0f, 0.5365854f * f10, (f7 * 8.0f) / 336.0f, 0.03902439f * f10, Path.Direction.CW);
    }

    public final void i(float f7, float f10) {
        if (this.U == f7 && this.V == f10) {
            return;
        }
        this.U = f7;
        if (f7 == 0.0f) {
            this.f35098n = false;
        }
        this.V = f10;
        this.O.invalidate();
        this.P.invalidate();
    }

    public final void j(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        boolean z10 = false;
        spannableString.setSpan(new w5(this, R.drawable.wallet_gram_large), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) d(j10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        spannableStringBuilder.setSpan(new ki.y5(this, 4), length, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        long round = Math.round(MessagesController.getInstance(i10).config.tonUsdRate.get() * (j10 / 1.0E9d) * 100.0d);
        BillingController billingController = BillingController.getInstance();
        if (round % 100 == 0) {
            z10 = true;
        }
        this.P.setText(billingController.formatCurrency(round, "USD", 2, z10));
    }

    public final void l(m0 m0Var) {
        if (m0Var != null) {
            int i10 = m0Var.f34451a;
            setCardHolder(UserObject.getUserName(UserConfig.getInstance(i10).getCurrentUser()).toUpperCase());
            if (m0Var.s() != null) {
                setCardNumber(c(m0Var.s().toUpperCase()));
            }
            if (m0Var.E()) {
                j(i10, m0Var.u());
            }
        }
    }

    public final void m() {
        int i10;
        int[] iArr;
        int f7;
        char c10;
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f35097l0 != null) {
            float[] fArr = this.f35085b0;
            char c11 = '\t';
            char c12 = 1;
            int i11 = 0;
            float f14 = 0.0f;
            float f15 = 1.0f;
            if (fArr == null) {
                fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 1.0f};
            }
            float[] fArr2 = h7.f34276c;
            float[] fArr3 = new float[42];
            int i12 = 0;
            for (int i13 = 2; i12 < i13; i13 = 2) {
                int i14 = i12 * 4;
                int i15 = i14 + 10;
                char c13 = c11;
                if (fArr.length < 18 || fArr[i15] < f14) {
                    c10 = c12;
                    f10 = f14;
                    System.arraycopy(h7.f34275b, 0, fArr3, i12 * 12, 12);
                    fArr3[i12 + 28] = 1.0f;
                    System.arraycopy(fArr2, 0, fArr3, (i12 * 3) + 30, 3);
                } else {
                    fArr3[i12 + 28] = 0.6f;
                    int i16 = (int) fArr[i15];
                    int i17 = i12 * 3;
                    int i18 = i17 + 30;
                    c10 = c12;
                    float f16 = ((i16 >> 16) & 255) / 255.0f;
                    f10 = f14;
                    float f17 = ((i16 >> 8) & 255) / 255.0f;
                    float f18 = (i16 & 255) / 255.0f;
                    float min = Math.min(f16, Math.min(f17, f18));
                    float max = Math.max(f16, Math.max(f17, f18)) - min;
                    float f19 = (fArr2[i13] * 0.0722f) + (fArr2[c10] * 0.7152f) + (fArr2[0] * 0.2126f);
                    float min2 = Math.min(1.0f, max / 0.15f);
                    int i19 = (max > f10 ? 1 : (max == f10 ? 0 : -1));
                    if (i19 > 0) {
                        f11 = (f16 - min) / max;
                    } else {
                        f11 = f10;
                    }
                    fArr3[i18] = com.google.android.gms.internal.play_billing.k3.y(f11, f19, min2, f19);
                    int i20 = i17 + 31;
                    if (i19 > 0) {
                        f12 = (f17 - min) / max;
                    } else {
                        f12 = f10;
                    }
                    fArr3[i20] = com.google.android.gms.internal.play_billing.k3.y(f12, f19, min2, f19);
                    int i21 = i17 + 32;
                    if (i19 > 0) {
                        f13 = (f18 - min) / max;
                    } else {
                        f13 = f10;
                    }
                    fArr3[i21] = com.google.android.gms.internal.play_billing.k3.y(f13, f19, min2, f19);
                    int i22 = (int) fArr[i15];
                    int i23 = (int) fArr[i14 + 11];
                    int o10 = h7.o(-16216082, i22, i23);
                    int o11 = h7.o(-15291399, i22, i23);
                    for (int i24 = 0; i24 < 3; i24++) {
                        int i25 = 16 - (i24 * 8);
                        float i26 = h7.i(o10, i25) * 0.73f;
                        float i27 = h7.i(o11, i25) * 0.73f;
                        int i28 = i12 * 12;
                        fArr3[i28 + i24] = (i26 + i27) / 2.0f;
                        fArr3[i28 + 3 + i24] = i26;
                        fArr3[i28 + 6 + i24] = i27;
                        fArr3[i28 + 9 + i24] = i26;
                    }
                }
                i12++;
                c11 = c13;
                c12 = c10;
                f14 = f10;
            }
            float f20 = f14;
            for (int i29 = 0; i29 < 2; i29++) {
                int i30 = i29 * 4;
                int i31 = i30 + 10;
                if (fArr.length >= 18 && fArr[i31] >= f20) {
                    f7 = i0.a.f(0.2f, ((int) fArr[i30 + 12]) | (-16777216), (-16777216) | ((int) fArr[i30 + 11]));
                } else {
                    f7 = i0.a.f(0.2f, -16611884, -16748084);
                }
                int i32 = i29 * 3;
                fArr3[i32 + 36] = ((f7 >> 16) & 255) / 255.0f;
                fArr3[i32 + 37] = ((f7 >> 8) & 255) / 255.0f;
                fArr3[i32 + 38] = (f7 & 255) / 255.0f;
            }
            System.arraycopy(fArr, 6, fArr3, 24, 4);
            float[] fArr4 = this.f35085b0;
            if (fArr4 != null && fArr4.length > 8) {
                f15 = Math.max(f20, Math.min(1.0f, fArr4[8]));
            }
            f6 f6Var = this.f35097l0;
            float lerp = AndroidUtilities.lerp(fArr3[30], fArr3[33], f15);
            float lerp2 = AndroidUtilities.lerp(fArr3[31], fArr3[34], f15);
            float lerp3 = AndroidUtilities.lerp(fArr3[32], fArr3[35], f15);
            f6Var.getClass();
            float max2 = Math.max(lerp, Math.max(lerp2, lerp3));
            float min3 = max2 - Math.min(lerp, Math.min(lerp2, lerp3));
            float f21 = 0.55f * max2;
            if (min3 > f21) {
                float f22 = f21 / min3;
                lerp = com.google.android.gms.internal.play_billing.k3.y(lerp, max2, f22, max2);
                lerp2 = com.google.android.gms.internal.play_billing.k3.y(lerp2, max2, f22, max2);
                lerp3 = com.google.android.gms.internal.play_billing.k3.y(lerp3, max2, f22, max2);
            }
            if (f6Var.e != null && lerp == f6Var.f34200f && lerp2 == f6Var.f34201g && lerp3 == f6Var.h) {
                return;
            }
            f6Var.f34200f = lerp;
            f6Var.f34201g = lerp2;
            f6Var.h = lerp3;
            if (f6.f34191k == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPremultiplied = false;
                options.inSampleSize = 2;
                Bitmap decodeResource = BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), R.drawable.wallet_card_diamond_layers, options);
                int width = decodeResource.getWidth();
                f6.f34192l = width;
                int[] iArr2 = new int[decodeResource.getHeight() * width];
                f6.f34191k = iArr2;
                int i33 = f6.f34192l;
                decodeResource.getPixels(iArr2, 0, i33, 0, 0, i33, decodeResource.getHeight());
                decodeResource.recycle();
                int[] iArr3 = new int[f6.f34191k.length];
                int i34 = 0;
                while (true) {
                    iArr = f6.f34191k;
                    if (i34 >= iArr.length) {
                        break;
                    }
                    iArr3[i34] = iArr[i34] & (-16777216);
                    i34++;
                }
                int i35 = f6.f34192l;
                Bitmap createBitmap = Bitmap.createBitmap(iArr3, i35, iArr.length / i35, Bitmap.Config.ARGB_8888);
                float f23 = f6.f34192l / 28.0f;
                Paint paint = new Paint();
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint.setMaskFilter(new BlurMaskFilter(5.0f * f23, blur));
                f6.f34193m = createBitmap.extractAlpha(paint, f6.f34195o);
                paint.setMaskFilter(new BlurMaskFilter(f23 * 1.5f, blur));
                f6.f34194n = createBitmap.extractAlpha(paint, f6.f34196p);
                createBitmap.recycle();
            }
            int[] iArr4 = new int[f6.f34191k.length];
            while (true) {
                int[] iArr5 = f6.f34191k;
                if (i11 < iArr5.length) {
                    float f24 = ((i10 >> 16) & 255) / 255.0f;
                    float f25 = ((i10 >> 8) & 255) / 255.0f;
                    iArr4[i11] = (iArr5[i11] & (-16777216)) | (f6.a((f25 * lerp) + f24) << 16) | (f6.a((f25 * lerp2) + f24) << 8) | f6.a((f25 * lerp3) + f24);
                    i11++;
                } else {
                    int i36 = f6.f34192l;
                    f6Var.e = Bitmap.createBitmap(iArr4, i36, iArr5.length / i36, Bitmap.Config.ARGB_8888);
                    f6Var.invalidateSelf();
                    return;
                }
            }
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
        if (this.f35083a0 != null) {
            NotificationCenter.getInstance(this.W).addObserver(this, NotificationCenter.walletUpdate);
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
        if (this.f35083a0 != null) {
            NotificationCenter.getInstance(this.W).removeObserver(this, NotificationCenter.walletUpdate);
        }
    }

    public void setAdditionalTilt(float f7) {
        this.f35099r = f7;
        this.f35103y.setAdditionalTilt(f7);
    }

    public void setCardHolder(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    public void setCardIcon(int i10) {
        this.S = i10;
        this.f35103y.setCardIcon(i10);
    }

    public void setCardNumber(String str) {
        if (str != null && !str.equals(this.R)) {
            this.R = str;
            Context context = getContext();
            Bitmap createBitmap = Bitmap.createBitmap(1640, 1000, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(1527.738f, 500.2976f);
            canvas.rotate(90.0f);
            Paint paint = new Paint(193);
            paint.setColor(-1);
            paint.setTypeface(f(context));
            paint.setTextSize(47.345238f);
            paint.setTextAlign(Paint.Align.CENTER);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f7 = (-(fontMetrics.ascent + fontMetrics.descent)) * 0.5f;
            String[] split = e(str).split("\\n");
            canvas.drawText(split[0], 0.0f, (-27.333332f) + f7, paint);
            if (split.length > 1) {
                canvas.drawText(split[1], 0.0f, f7 + 27.333332f, paint);
            }
            setEngravingBitmap(createBitmap);
        }
    }

    public void setCardOnClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
        this.f35103y.setOnClickListener(onClickListener);
    }

    public void setDebugBackdrop(TLRPC.TL_shareThemeBackdropOption tL_shareThemeBackdropOption) {
        String str;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            return;
        }
        if (tL_shareThemeBackdropOption == null) {
            str = null;
        } else {
            str = tL_shareThemeBackdropOption.name;
        }
        this.f35089e0 = str;
        this.f35088d0 = null;
        if (tL_shareThemeBackdropOption != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = new TL_stars.starGiftAttributeBackdrop();
            stargiftattributebackdrop.center_color = tL_shareThemeBackdropOption.center_color;
            stargiftattributebackdrop.edge_color = tL_shareThemeBackdropOption.edge_color;
            stargiftattributebackdrop.pattern_color = tL_shareThemeBackdropOption.pattern_color;
            stargiftattributebackdrop.text_color = tL_shareThemeBackdropOption.text_color;
            float[] j10 = h7.j(stargiftattributebackdrop);
            float[] fArr = new float[18];
            this.f35088d0 = fArr;
            System.arraycopy(j10, 0, fArr, 0, 3);
            System.arraycopy(j10, 0, this.f35088d0, 3, 3);
            float[] fArr2 = this.f35088d0;
            fArr2[7] = 0.5f;
            fArr2[6] = 0.5f;
            fArr2[9] = 1.0f;
            fArr2[8] = 1.0f;
            h7.n(fArr2, 0, stargiftattributebackdrop);
            h7.n(this.f35088d0, 1, stargiftattributebackdrop);
        }
        setStickerStyle(this.f35087c0);
    }

    public void setDiamondOnCard(boolean z10) {
        this.f35082a = z10;
        this.O.invalidate();
    }

    public void setEngravingBitmap(Bitmap bitmap) {
        this.F = bitmap;
        this.f35103y.setEngravingBitmap(bitmap);
    }

    public void setOnFrontContentPresented(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setStickerImpact(float f7) {
        this.f35103y.setScaleX(f7);
        this.f35103y.setScaleY(f7);
    }

    public void setStickerStyle(float[] fArr) {
        this.f35087c0 = fArr;
        float[] fArr2 = this.f35088d0;
        if (fArr2 != null) {
            fArr = fArr2;
        }
        this.f35085b0 = fArr;
        m();
        this.O.invalidate();
        this.I.invalidate();
        this.f35103y.setStickerStyle(fArr);
        this.P.setTextColor(i0.a.f(fArr[8], h7.q(fArr, -7868417, 0), h7.q(fArr, -7868417, 3)));
        this.H.invalidate();
    }

    public void setUseGyroscope(float f7) {
        this.f35100s = f7;
        this.f35103y.setUseGyroscope(f7);
    }

    public x5(Context context, int i10, int i11) {
        super(context);
        this.f35084b = 1.0f;
        this.f35086c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        new RectF();
        this.f35090f = new RectF();
        this.f35100s = 1.0f;
        this.v = new Matrix();
        this.f35101w = new Matrix();
        this.f35102x = new Matrix();
        this.J = new Paint(193);
        Runnable runnable = new Runnable(this) {
            public final x5 f34888b;

            {
                this.f34888b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34888b.I.invalidate();
                        return;
                    case 1:
                        x5 x5Var = this.f34888b;
                        x5Var.O.invalidate();
                        x5Var.P.invalidate();
                        return;
                    default:
                        this.f34888b.H.invalidate();
                        return;
                }
            }
        };
        bs bsVar = bs.h;
        this.L = new org.telegram.ui.Components.f6(runnable, 240L, bsVar, 0);
        this.W = UserConfig.selectedAccount;
        this.f35095j0 = new org.telegram.ui.Components.f6(new Runnable(this) {
            public final x5 f34888b;

            {
                this.f34888b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34888b.I.invalidate();
                        return;
                    case 1:
                        x5 x5Var = this.f34888b;
                        x5Var.O.invalidate();
                        x5Var.P.invalidate();
                        return;
                    default:
                        this.f34888b.H.invalidate();
                        return;
                }
            }
        }, 240L, bsVar, 0);
        this.f35096k0 = new org.telegram.ui.Components.f6(new Runnable(this) {
            public final x5 f34888b;

            {
                this.f34888b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f34888b.I.invalidate();
                        return;
                    case 1:
                        x5 x5Var = this.f34888b;
                        x5Var.O.invalidate();
                        x5Var.P.invalidate();
                        return;
                    default:
                        this.f34888b.H.invalidate();
                        return;
                }
            }
        }, 240L, bsVar, 0);
        this.S = i10;
        this.T = i11;
        setClipChildren(false);
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        s5 s5Var = new s5(getContext(), this.S, i11);
        this.f35103y = s5Var;
        this.E = s5Var.getFrontFace();
        if (this.f35085b0 != null) {
            setStickerStyle(this.f35087c0);
        }
        setAdditionalTilt(this.f35099r);
        setUseGyroscope(this.f35100s);
        this.f35103y.setOnClickListener(this.G);
        addView(this.f35103y, 0, w7.z5.c(-2.0f, -1));
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            setEngravingBitmap(bitmap);
        }
        mk mkVar = new mk(this, context, 6);
        this.H = mkVar;
        if (f35081o0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f35081o0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f35081o0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        mkVar.setTypeface(f35081o0);
        mkVar.setTextColor(-1);
        mkVar.setTextSize(1, 13.0f);
        mkVar.setShadowLayer(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), -16611884);
        mkVar.setEllipsize(TextUtils.TruncateAt.END);
        mkVar.setMaxLines(1);
        mkVar.setSingleLine();
        this.E.addView(mkVar, w7.z5.d(-1, -2.0f, 83, 24.0f, 0.0f, 64.0f, 17.2f));
        x10 x10Var = new x10(this, context, 11);
        this.I = x10Var;
        this.E.addView(x10Var, w7.z5.c(-1.0f, -1));
        View view = new View(context);
        this.M = view;
        this.E.addView(view, w7.z5.d(1, 1.0f, 19, 24.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 51, 24.0f, 71.0f, 24.0f, 0.0f);
        this.Q = d;
        this.E.addView(linearLayout, d);
        v5 v5Var = new v5(this, context, 0);
        this.O = v5Var;
        v5Var.getDrawable().M = AndroidUtilities.dp(4096.0f);
        v5Var.f29577c.m(0.35f, 320L, 3.5f, bsVar);
        v5Var.setScaleProperty(0.6f);
        v5Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        v5Var.setTextSize(AndroidUtilities.dp(23.0f));
        v5Var.setTextColor(-1);
        v5Var.setIgnoreRTL(true);
        linearLayout.addView(v5Var, w7.z5.n(-1, 28));
        v5 v5Var2 = new v5(this, context, 1);
        this.P = v5Var2;
        v5Var2.f29577c.m(0.35f, 320L, 3.5f, bsVar);
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
