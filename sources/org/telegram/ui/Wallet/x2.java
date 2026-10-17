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
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.ef0;
import org.telegram.ui.u10;
public final class x2 extends Dialog {
    public static final int R = 0;
    public Bitmap E;
    public i0.c F;
    public float G;
    public float H;
    public boolean I;
    public final u10 J;
    public final RectF K;
    public ValueAnimator L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Runnable P;
    public final int[] Q;
    public final org.telegram.ui.ActionBar.n2 f35117a;
    public final zh0 f35118b;
    public final boolean f35119c;
    public final boolean d;
    public final RectF e;
    public final w2 f35120f;
    public final v5 h;
    public final w7 f35121n;
    public final ci.i4 f35122r;
    public final TextView f35123s;
    public final Paint v;
    public final RectF f35124w;
    public final gh.b f35125x;
    public final bh.b f35126y;

    public x2(org.telegram.ui.ActionBar.n2 n2Var, zh0 zh0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(n2Var.getParentActivity(), R.style.TransparentDialog);
        boolean z10;
        boolean z11;
        int[] iArr;
        int i10;
        int i11;
        RectF rectF = new RectF();
        this.e = rectF;
        this.v = new Paint(3);
        this.f35124w = new RectF();
        gh.b bVar = new gh.b();
        this.f35125x = bVar;
        this.F = i0.c.e;
        this.J = new u10();
        this.K = new RectF();
        this.Q = new int[2];
        this.f35117a = n2Var;
        this.f35118b = zh0Var;
        if (user != null && user.f20419id == UserConfig.getInstance(n2Var.getCurrentAccount()).getClientUserId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (user != null && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35119c = z11;
        zh0Var.getLocationOnScreen(new int[2]);
        rectF.set(zh0Var.f29950w);
        rectF.offset(iArr[0], iArr[1]);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        w2 w2Var = new w2(this, getContext());
        this.f35120f = w2Var;
        w2Var.setClipChildren(false);
        w2Var.setClipToPadding(false);
        w2Var.setOnClickListener(new t2(this, 0));
        o2 o2Var = new o2(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.a0.i(w2Var, o2Var);
        v5 v5Var = new v5(R.drawable.wallet_card_qr, 46, getContext(), false);
        this.h = v5Var;
        v5Var.setDiamondOnCard(true);
        int currentAccount = n2Var.getCurrentAccount();
        String userName = UserObject.getUserName(user);
        Locale locale = Locale.ROOT;
        v5Var.setCardHolder(userName.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            v5Var.setCardNumber(v5.e(cardVar.address.toUpperCase(locale)));
        }
        v5Var.l(currentAccount, cardVar.balance);
        CharSequence l4 = m0.w(currentAccount).l(cardVar.balance, false);
        if (!TextUtils.isEmpty(l4)) {
            v5Var.S.c(l4, false, true);
        }
        v5Var.setCardOnClickListener(new ef0(23, this, n2Var));
        v5Var.setOnClickListener(new ah.f(24));
        v5Var.setAlpha(0.0f);
        w2Var.addView(v5Var, w7.z5.d(-2.0f, -2));
        w7 w7Var = new w7(n2Var, v5Var, null, cardVar);
        this.f35121n = w7Var;
        w2Var.addView(w7Var, w7.z5.d(-1.0f, -1));
        bh.b bVar2 = new bh.b(bVar);
        this.f35126y = bVar2;
        bVar2.f4361f = new ih.j(w2Var);
        bVar2.f4362g = w2Var;
        ci.i4 i4Var = new ci.i4(getContext());
        this.f35122r = i4Var;
        dh.d c10 = bVar2.c(i4Var, new eh.b(org.telegram.ui.ActionBar.h6.f20986d6, n2Var.getResourceProvider()), false);
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
        } else {
            i10 = R.string.WalletSendMoney;
        }
        CharSequence string = LocaleController.getString(i10);
        if (z10) {
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
        w2Var.addView(i4Var, w7.z5.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f35123s = textView;
        textView.setText(LocaleController.getString(R.string.WalletPublicBalanceNote));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.41f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, n2Var.getResourceProvider())));
        textView.setAlpha(0.0f);
        textView.setVisibility(z10 ? 0 : 8);
        w2Var.addView(textView, w7.z5.e(-2, -2, 49));
    }

    public final void a(float f7) {
        boolean z10;
        long j10;
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 == 0 && this.O) {
            return;
        }
        if (i10 == 0) {
            this.O = true;
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f7);
        this.L = ofFloat;
        if (i10 == 0) {
            j10 = 650;
        } else {
            j10 = 380;
        }
        ofFloat.setDuration(j10);
        this.L.setInterpolator(new LinearInterpolator());
        this.L.addUpdateListener(new u2(this, 0));
        this.L.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 6));
        this.L.start();
    }

    public final void b() {
        if (!this.N) {
            this.N = true;
            this.f35118b.setEjectProgress(0.0f);
            super.dismiss();
            this.f35121n.p();
            this.f35125x.a(null);
            this.E = null;
            if (this.P != null && this.f35117a.getParentActivity() != null) {
                Runnable runnable = this.P;
                this.P = null;
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f35119c && !this.d) {
            return false;
        }
        return true;
    }

    public final void d() {
        float f7;
        float f10;
        float interpolation = bs.f25031g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.G / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.G - 0.3f) / 0.7f));
        float interpolation2 = bs.h.getInterpolation(max);
        if (this.I) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        v5 v5Var = this.h;
        float width = v5Var.getWidth();
        float height = v5Var.getHeight();
        RectF rectF = this.e;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float lerp = AndroidUtilities.lerp(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.Q;
        float f11 = centerY - iArr[1];
        float f12 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f13 = width / 2.0f;
        float f14 = height / 2.0f;
        float lerp2 = AndroidUtilities.lerp(centerX, v5Var.getLeft() + f13, f7);
        float lerp3 = AndroidUtilities.lerp((f12 * interpolation) + (f11 - (f12 / 2.0f)), v5Var.getTop() + f14, f7);
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
        v5Var.setPivotX(lerp4);
        v5Var.setPivotY(lerp5);
        v5Var.setScaleX(lerp);
        v5Var.setScaleY(lerp);
        v5Var.setRotation(f16);
        v5Var.setRotationX(35.0f * f15);
        v5Var.setTranslationX((((cos * f21) - (sin * f22)) * lerp) + ((lerp2 - v5Var.getLeft()) - lerp4));
        v5Var.setTranslationY((((cos * f22) + (sin * f21)) * lerp) + ((lerp3 - v5Var.getTop()) - lerp5));
        if (this.G > 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v5Var.setAlpha(f10);
        v5Var.setUseGyroscope(interpolation2);
        float f23 = 1.0f - interpolation2;
        this.H = Math.max(0.0f, f11 * f23);
        this.f35118b.setEjectProgress(interpolation);
        this.f35121n.setAlpha(interpolation2);
        ci.i4 i4Var = this.f35122r;
        i4Var.setAlpha(interpolation2);
        TextView textView = this.f35123s;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f23);
        i4Var.setTranslationY(AndroidUtilities.dp(16.0f) * f23);
        i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, interpolation2));
        this.f35120f.invalidate();
    }

    @Override
    public final void dismiss() {
        if (!this.N && !this.M) {
            this.M = true;
            this.f35122r.setEnabled(false);
            if (this.f35120f.isAttachedToWindow() && this.G != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        w2 w2Var = this.f35120f;
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
        AndroidUtilities.setLightNavigationBar(w2Var, !org.telegram.ui.ActionBar.h6.I.q());
        AndroidUtilities.setLightStatusBar(window, !org.telegram.ui.ActionBar.h6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        ym0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.y.c(this.f35120f);
    }
}
