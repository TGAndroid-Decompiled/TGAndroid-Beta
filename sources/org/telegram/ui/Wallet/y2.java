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
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.w10;
import org.telegram.ui.xd0;
public final class y2 extends Dialog {
    public static final int W = 0;
    public final hh.b E;
    public final ch.b F;
    public Bitmap G;
    public i0.b H;
    public float I;
    public float J;
    public boolean K;
    public final w10 L;
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
    public final org.telegram.ui.ActionBar.r2 f37493a;
    public final ci0 f37494b;
    public final boolean f37495c;
    public final boolean d;
    public final boolean e;
    public final RectF f37496f;
    public final w2 h;
    public final x2 f37497n;
    public final w5 f37498r;
    public final t7 f37499s;
    public final di.i4 v;
    public final TextView f37500w;
    public final Paint f37501x;
    public final RectF f37502y;

    public y2(org.telegram.ui.ActionBar.r2 r2Var, ci0 ci0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(r2Var.getParentActivity(), R.style.TransparentDialog);
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i10;
        int i11;
        String formatString;
        RectF rectF = new RectF();
        this.f37496f = rectF;
        this.f37501x = new Paint(3);
        this.f37502y = new RectF();
        hh.b bVar = new hh.b();
        this.E = bVar;
        this.H = i0.b.e;
        this.L = new w10();
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.f37493a = r2Var;
        this.f37494b = ci0Var;
        if (user != null && user.f22174id == UserConfig.getInstance(r2Var.getCurrentAccount()).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (user != null && !z10 && MessagesController.getInstance(r2Var.getCurrentAccount()).config.walletAvailable.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f37495c = z11;
        if (user != null && !z10 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        ci0Var.getLocationOnScreen(new int[2]);
        rectF.set(ci0Var.v);
        rectF.offset(iArr[0], iArr[1]);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        w2 w2Var = new w2(this, getContext());
        this.h = w2Var;
        x2 x2Var = new x2(this, getContext());
        this.f37497n = x2Var;
        x2Var.setAlpha(0.0f);
        w2Var.addView(x2Var, gb1.g(-1.0f, -1));
        w2Var.setClipChildren(false);
        w2Var.setClipToPadding(false);
        w2Var.setOnClickListener(new s2(this, 0));
        n2 n2Var = new n2(this, 1);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(w2Var, n2Var);
        w5 w5Var = new w5(getContext());
        this.f37498r = w5Var;
        w5Var.setDiamondOnCard(true);
        int currentAccount = r2Var.getCurrentAccount();
        String userName = UserObject.getUserName(user);
        Locale locale = Locale.ROOT;
        w5Var.setCardHolder(userName.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            w5Var.setCardNumber(w5.d(cardVar.address.toUpperCase(locale)));
        }
        w5Var.j(currentAccount, cardVar.balance);
        CharSequence l4 = l0.w(currentAccount).l(cardVar.balance, false);
        if (!TextUtils.isEmpty(l4)) {
            w5Var.O.c(l4, false, true);
        }
        w5Var.setCardOnClickListener(new xd0(24, this, r2Var));
        w5Var.setOnClickListener(new bh.f(24));
        w5Var.setAlpha(0.0f);
        w2Var.addView(w5Var, gb1.g(-2.0f, -2));
        t7 t7Var = new t7(r2Var, w5Var, null, cardVar);
        this.f37499s = t7Var;
        w2Var.addView(t7Var, gb1.g(-1.0f, -1));
        ch.b bVar2 = new ch.b(bVar);
        this.F = bVar2;
        bVar2.f6301f = new jh.k(w2Var);
        bVar2.f6302g = w2Var;
        di.i4 i4Var = new di.i4(getContext());
        this.v = i4Var;
        eh.d c10 = bVar2.c(i4Var, new fh.b(org.telegram.ui.ActionBar.y6.f23354d6, r2Var.getResourceProvider()), false);
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(22.0f));
        i4Var.setBackground(c10);
        gb1.c(i4Var, 0.02f, 1.2f);
        fi.d dVar = new fi.d(getContext(), r2Var.getResourceProvider(), true);
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
            dVar.i(string, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(string);
            zq zqVar = new zq(R.drawable.mini_gram_24, 0);
            zqVar.setSize(AndroidUtilities.dp(20.0f));
            zqVar.setOverrideColor(-1);
            append.setSpan(zqVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        i4Var.addView(dVar, gb1.i(-2, -1, 17));
        i4Var.setContentDescription(string);
        i4Var.setOnClickListener(new m1(this, r2Var, cardVar, 1));
        i4Var.setAlpha(0.0f);
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        i4Var.setVisibility(i11);
        w2Var.addView(i4Var, gb1.i(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f37500w = textView;
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
            if (new BigDecimal(l0.o(cardVar.balance, false)).signum() == 0) {
                formatString = LocaleController.formatString(R.string.WalletProfileOwnsNoGrams, firstName);
            } else {
                formatString = LocaleController.formatString(R.string.WalletProfileOwnsGrams, firstName, l0.k("Grams", w5.e(cardVar.balance).toString(), R.string.Grams_other).toString().replace(' ', (char) 160));
            }
            textView.setText(fi.v3.b(formatString, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        w2Var.addView(textView, gb1.i(-2, -2, 49));
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
        w5 w5Var = this.f37498r;
        w5Var.getClass();
        w5Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.O = ofFloat;
        if (i10 == 0) {
            j10 = 650;
        } else {
            j10 = 380;
        }
        ofFloat.setDuration(j10);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new v2(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 7));
        this.O.start();
    }

    public final void b() {
        if (!this.S) {
            this.S = true;
            this.f37498r.setLayerType(0, null);
            this.f37494b.setEjectProgress(0.0f);
            super.dismiss();
            this.f37499s.p();
            this.E.a(null);
            this.G = null;
            if (this.U != null && this.f37493a.getParentActivity() != null) {
                Runnable runnable = this.U;
                this.U = null;
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f37495c && !this.d && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.f37500w;
        if (bitmap != null && !bitmap.isRecycled()) {
            w2 w2Var = this.h;
            if (w2Var.getWidth() > 0 && w2Var.getHeight() > 0) {
                q5 = AndroidUtilities.computePerceivedBrightness(this.G.getPixel(Utilities.clamp((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) w2Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.clamp((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) w2Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q5) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.41f, i10));
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
        float interpolation = ds.f27585g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = ds.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        w5 w5Var = this.f37498r;
        float width = w5Var.getWidth();
        float height = w5Var.getHeight();
        RectF rectF = this.f37496f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float lerp = AndroidUtilities.lerp(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f11 = centerY - iArr[1];
        float f12 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f13 = width / 2.0f;
        float f14 = height / 2.0f;
        float lerp2 = AndroidUtilities.lerp(centerX, w5Var.getLeft() + f13, f7);
        float lerp3 = AndroidUtilities.lerp((f12 * interpolation) + (f11 - (f12 / 2.0f)), w5Var.getTop() + f14, f7);
        float f15 = 1.0f - f7;
        float f16 = (-90.0f) * f15;
        double d10 = f16;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f17 = centerX - lerp2;
        float f18 = f11 - lerp3;
        float lerp4 = AndroidUtilities.lerp((((sin * f18) + (cos * f17)) / lerp) + f13, f13, interpolation2);
        float lerp5 = AndroidUtilities.lerp((((cos * f18) + ((-sin) * f17)) / lerp) + f14, f14, interpolation2);
        float f19 = lerp4 - f13;
        float f20 = lerp5 - f14;
        w5Var.setPivotX(lerp4);
        w5Var.setPivotY(lerp5);
        w5Var.setScaleX(lerp);
        w5Var.setScaleY(lerp);
        w5Var.setRotation(f16);
        w5Var.setRotationX(35.0f * f15);
        w5Var.setTranslationX((((cos * f19) - (sin * f20)) * lerp) + ((lerp2 - w5Var.getLeft()) - lerp4));
        w5Var.setTranslationY(org.telegram.ui.d3.e(cos, f20, sin * f19, lerp, (lerp3 - w5Var.getTop()) - lerp5));
        if (this.I > 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w5Var.setAlpha(f10);
        w5Var.setUseGyroscope(this.Q * interpolation2);
        float f21 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f11 * f21);
        this.f37494b.setEjectProgress(interpolation);
        this.f37497n.setAlpha(this.I);
        this.f37499s.setAlpha(interpolation2);
        di.i4 i4Var = this.v;
        i4Var.setAlpha(interpolation2);
        TextView textView = this.f37500w;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f21);
        i4Var.setTranslationY(AndroidUtilities.dp(16.0f) * f21);
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
        w2 w2Var = this.h;
        setContentView(w2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        w2Var.setSystemUiVisibility(1792);
        AndroidUtilities.setLightNavigationBar(w2Var, !org.telegram.ui.ActionBar.y6.I.q());
        AndroidUtilities.setLightStatusBar(window, !org.telegram.ui.ActionBar.y6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        hn0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.y.c(this.h);
    }
}
