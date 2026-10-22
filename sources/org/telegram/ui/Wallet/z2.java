package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.cf0;
import org.telegram.ui.s10;
public final class z2 extends Dialog {
    public static final int W = 0;
    public final gh.b E;
    public final bh.b F;
    public Bitmap G;
    public i0.b H;
    public float I;
    public float J;
    public boolean K;
    public final s10 L;
    public final RectF M;
    public final RectF N;
    public ValueAnimator O;
    public ValueAnimator P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Runnable U;
    public final int[] V;
    public final org.telegram.ui.ActionBar.n2 f35172a;
    public final ai0 f35173b;
    public final boolean f35174c;
    public final boolean d;
    public final boolean e;
    public final RectF f35175f;
    public final x2 h;
    public final y2 f35176n;
    public final x5 f35177r;
    public final t7 f35178s;
    public final ci.i4 v;
    public final TextView f35179w;
    public final Paint f35180x;
    public final RectF f35181y;

    public z2(org.telegram.ui.ActionBar.n2 n2Var, ai0 ai0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(n2Var.getParentActivity(), R.style.TransparentDialog);
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i10;
        int i11;
        String formatString;
        RectF rectF = new RectF();
        this.f35175f = rectF;
        this.f35180x = new Paint(3);
        this.f35181y = new RectF();
        gh.b bVar = new gh.b();
        this.E = bVar;
        this.H = i0.b.e;
        this.L = new s10();
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.f35172a = n2Var;
        this.f35173b = ai0Var;
        if (user != null && user.f20426id == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (user != null && !z10 && MessagesController.getInstance(n2Var.getCurrentAccount()).config.walletAvailable.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35174c = z11;
        if (user != null && !z10 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        ai0Var.getLocationOnScreen(new int[2]);
        rectF.set(ai0Var.v);
        rectF.offset(iArr[0], iArr[1]);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        x2 x2Var = new x2(this, getContext());
        this.h = x2Var;
        y2 y2Var = new y2(this, getContext());
        this.f35176n = y2Var;
        y2Var.setAlpha(0.0f);
        x2Var.addView(y2Var, w7.z5.c(-1.0f, -1));
        x2Var.setClipChildren(false);
        x2Var.setClipToPadding(false);
        x2Var.setOnClickListener(new t2(this, 0));
        o2 o2Var = new o2(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44829a;
        r0.a0.i(x2Var, o2Var);
        x5 x5Var = new x5(getContext());
        this.f35177r = x5Var;
        x5Var.setDiamondOnCard(true);
        int currentAccount = n2Var.getCurrentAccount();
        String userName = UserObject.getUserName(user);
        Locale locale = Locale.ROOT;
        x5Var.setCardHolder(userName.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            x5Var.setCardNumber(x5.d(cardVar.address.toUpperCase(locale)));
        }
        x5Var.j(currentAccount, cardVar.balance);
        CharSequence l4 = m0.w(currentAccount).l(cardVar.balance, false);
        if (!TextUtils.isEmpty(l4)) {
            x5Var.O.c(l4, false, true);
        }
        x5Var.setCardOnClickListener(new cf0(23, this, n2Var));
        x5Var.setOnClickListener(new ah.f(24));
        x5Var.setAlpha(0.0f);
        x2Var.addView(x5Var, w7.z5.c(-2.0f, -2));
        t7 t7Var = new t7(n2Var, x5Var, null, cardVar);
        this.f35178s = t7Var;
        x2Var.addView(t7Var, w7.z5.c(-1.0f, -1));
        bh.b bVar2 = new bh.b(bVar);
        this.F = bVar2;
        bVar2.f4358f = new ih.j(x2Var);
        bVar2.f4359g = x2Var;
        ci.i4 i4Var = new ci.i4(getContext());
        this.v = i4Var;
        dh.d c10 = bVar2.c(i4Var, new eh.b(org.telegram.ui.ActionBar.h6.f20993d6, n2Var.getResourceProvider()), false);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(22.0f));
        i4Var.setBackground(c10);
        w7.b6.b(i4Var, 0.02f, 1.2f);
        ei.d dVar = new ei.d(getContext(), n2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar.setRoundRadius(19);
        if (z10) {
            i10 = R.string.WalletOpenMyMoney;
        } else if (z11) {
            i10 = R.string.WalletSendMoney;
        } else {
            i10 = R.string.HowDoesItWork;
        }
        CharSequence string = LocaleController.getString(i10);
        if (!z11) {
            dVar.g(string, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(string);
            yq yqVar = new yq(R.drawable.mini_gram_24, 0);
            yqVar.setSize(AndroidUtilities.dp(20.0f));
            yqVar.setOverrideColor(-1);
            append.setSpan(yqVar, 0, 1, 33);
            dVar.g(append, false, true);
        }
        dVar.setStateListAnimator(null);
        i4Var.addView(dVar, w7.z5.e(-2, -1, 17));
        i4Var.setContentDescription(string);
        i4Var.setOnClickListener(new n1(this, n2Var, cardVar, 1));
        i4Var.setAlpha(0.0f);
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        i4Var.setVisibility(i11);
        x2Var.addView(i4Var, w7.z5.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f35179w = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(LocaleController.getString(R.string.WalletPublicBalanceNote));
        } else if (user != null) {
            String firstName = UserObject.getFirstName(user);
            if (new BigDecimal(m0.o(cardVar.balance, false)).signum() == 0) {
                formatString = LocaleController.formatString(R.string.WalletProfileOwnsNoGrams, firstName);
            } else {
                formatString = LocaleController.formatString(R.string.WalletProfileOwnsGrams, firstName, m0.k("Grams", x5.e(cardVar.balance).toString(), R.string.Grams_other).toString().replace(' ', (char) 160));
            }
            textView.setText(ei.x3.b(formatString, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        x2Var.addView(textView, w7.z5.e(-2, -2, 49));
    }

    public final void a(float f7) {
        boolean z10;
        long j10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 == 0 && this.T) {
            return;
        }
        if (i10 == 0) {
            this.T = true;
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        x5 x5Var = this.f35177r;
        x5Var.getClass();
        x5Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.O = ofFloat;
        if (i10 == 0) {
            j10 = 650;
        } else {
            j10 = 380;
        }
        ofFloat.setDuration(j10);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new w2(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 6));
        this.O.start();
    }

    public final void b() {
        if (!this.S) {
            this.S = true;
            this.f35177r.setLayerType(0, null);
            this.f35173b.setEjectProgress(0.0f);
            super.dismiss();
            this.f35178s.p();
            this.E.a(null);
            this.G = null;
            if (this.U != null && this.f35172a.getParentActivity() != null) {
                Runnable runnable = this.U;
                this.U = null;
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f35174c && !this.d && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.f35179w;
        if (bitmap != null && !bitmap.isRecycled()) {
            x2 x2Var = this.h;
            if (x2Var.getWidth() > 0 && x2Var.getHeight() > 0) {
                q6 = AndroidUtilities.computePerceivedBrightness(this.G.getPixel(Utilities.clamp((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) x2Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.clamp((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) x2Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q6) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.41f, i10));
    }

    @Override
    public final void dismiss() {
        if (!this.S && !this.R) {
            this.R = true;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.v.setEnabled(false);
            if (this.h.isAttachedToWindow() && this.I != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    public final void e() {
        float f7;
        float f10;
        float interpolation = bs.f25025g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = bs.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        x5 x5Var = this.f35177r;
        float width = x5Var.getWidth();
        float height = x5Var.getHeight();
        RectF rectF = this.f35175f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float lerp = AndroidUtilities.lerp(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f11 = centerY - iArr[1];
        float f12 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f13 = width / 2.0f;
        float f14 = height / 2.0f;
        float lerp2 = AndroidUtilities.lerp(centerX, x5Var.getLeft() + f13, f7);
        float lerp3 = AndroidUtilities.lerp((f12 * interpolation) + (f11 - (f12 / 2.0f)), x5Var.getTop() + f14, f7);
        float f15 = 1.0f - f7;
        float f16 = (-90.0f) * f15;
        double d10 = f16;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f17 = centerX - lerp2;
        float f18 = f11 - lerp3;
        float f19 = sin * f18;
        float f20 = f18 * cos;
        float lerp4 = AndroidUtilities.lerp(((f19 + (cos * f17)) / lerp) + f13, f13, interpolation2);
        float lerp5 = AndroidUtilities.lerp(((f20 + ((-sin) * f17)) / lerp) + f14, f14, interpolation2);
        float f21 = lerp4 - f13;
        float f22 = lerp5 - f14;
        x5Var.setPivotX(lerp4);
        x5Var.setPivotY(lerp5);
        x5Var.setScaleX(lerp);
        x5Var.setScaleY(lerp);
        x5Var.setRotation(f16);
        x5Var.setRotationX(35.0f * f15);
        x5Var.setTranslationX((((cos * f21) - (sin * f22)) * lerp) + ((lerp2 - x5Var.getLeft()) - lerp4));
        x5Var.setTranslationY((((cos * f22) + (sin * f21)) * lerp) + ((lerp3 - x5Var.getTop()) - lerp5));
        if (this.I > 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        x5Var.setAlpha(f10);
        x5Var.setUseGyroscope(this.Q * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f11 * f23);
        this.f35173b.setEjectProgress(interpolation);
        this.f35176n.setAlpha(this.I);
        this.f35178s.setAlpha(interpolation2);
        ci.i4 i4Var = this.v;
        i4Var.setAlpha(interpolation2);
        TextView textView = this.f35179w;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f23);
        i4Var.setTranslationY(AndroidUtilities.dp(16.0f) * f23);
        i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        x2 x2Var = this.h;
        setContentView(x2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        x2Var.setSystemUiVisibility(1792);
        AndroidUtilities.setLightNavigationBar(x2Var, !org.telegram.ui.ActionBar.h6.I.q());
        AndroidUtilities.setLightStatusBar(window, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        zm0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f44829a;
        r0.y.c(this.h);
    }
}
