package org.telegram.ui.Wallet;

import ai.qc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ep0;
public final class x2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.k H;
    public final l8 I;
    public long J;
    public ValueAnimator K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public TL_wallet.walletTransaction R;
    public final LinearLayout S;
    public final y9 T;
    public final TextView U;
    public final TextView V;
    public boolean W;
    public final int f35647a;
    public boolean f35648a0;
    public final org.telegram.ui.ActionBar.e6 f35649b;
    public boolean f35650b0;
    public final j9 f35651c;
    public boolean f35652c0;
    public final ImageView d;
    public final y9 f35653e;
    public final TextView f35654f;
    public final TextView h;
    public final TextView f35655n;
    public final TextView f35656r;
    public final Drawable f35657s;
    public final Drawable v;
    public final d9 f35658w;
    public final Paint f35659x;
    public final Path f35660y;

    public x2(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f35651c = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f35659x = new Paint(1);
        this.f35660y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new l8();
        this.f35647a = i10;
        this.f35649b = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.a(46.0f, 13.0f, 12.0f, 0.0f, 15.0f, 46, 51));
        y9 y9Var = new y9(context);
        this.f35653e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, w7.x5.a(46.0f, 13.0f, 12.0f, 0.0f, 15.0f, 46, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.a(-1.0f, 71.0f, 0.0f, 20.0f, 0.0f, -1, 119));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, w7.x5.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f35654f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView, w7.x5.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = h;
        h.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        h.setEllipsize(truncateAt);
        h.setIncludeFontPadding(false);
        h.setGravity(16);
        h.setTextSize(1, 13.0f);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout2, h, w7.x5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f35655n = h10;
        h10.setSingleLine(true);
        h10.setEllipsize(truncateAt);
        h10.setIncludeFontPadding(false);
        h10.setGravity(16);
        h10.setTextSize(1, 13.0f);
        linearLayout2.addView(h10, w7.x5.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.x5.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        y9 y9Var2 = new y9(context);
        this.T = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout3.addView(y9Var2, w7.x5.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, w7.x5.p(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        bi.k(14.0f, 1, textView2);
        TextView h11 = com.google.android.gms.internal.vision.e2.h(linearLayout4, textView2, w7.x5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.V = h11;
        h11.setTextSize(1, 14.0f);
        linearLayout4.addView(h11, w7.x5.t(-1, -2, 55, 0, 0, 0, 0));
        d9 d9Var = new d9(context);
        this.f35658w = d9Var;
        this.f35656r = d9Var.f34838a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.f35657s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(d9Var, w7.x5.p(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        e();
    }

    public static void a(x2 x2Var, ValueAnimator valueAnimator) {
        x2Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(d50 d50Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new t2(d50Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.i6.m1(this.F, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f35649b)));
        c();
        setElevation(AndroidUtilities.dp(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        d9 d9Var = this.f35658w;
        d9Var.d = f7;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0 && d9Var.f34840c == null) {
            c6 c6Var = new c6(40, d9Var.getContext(), false);
            d9Var.f34840c = c6Var;
            c6Var.setContinuousRotation(300.0f);
            d9Var.addView(d9Var.f34840c, w7.x5.d(40.0f, 40));
        }
        c6 c6Var2 = d9Var.f34840c;
        if (c6Var2 != null && i10 == 0) {
            c6Var2.setPaused(true);
            d9Var.removeView(d9Var.f34840c);
            d9Var.f34840c = null;
        }
        d9Var.a();
        d9Var.requestLayout();
        invalidate();
    }

    public final void b(float f7, boolean z10) {
        TL_wallet.walletTransaction wallettransaction;
        c6 pendingDiamond;
        boolean z11;
        float e7;
        float e10;
        int i10;
        if (!z10 || this.K == null || this.L != f7) {
            this.L = f7;
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            if (z10 && f7 == 0.0f && this.F > 0.0f && !isAttachedToWindow()) {
                return;
            }
            if (z10) {
                float f10 = this.F;
                if (f10 != f7) {
                    if (f7 == 0.0f && f10 > 0.0f && (wallettransaction = this.R) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a2 = w8.a(this, pendingDiamond);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        l8 l8Var = this.I;
                        l8Var.getClass();
                        float f11 = AndroidUtilities.density;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e7 = l8Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e10 = l8Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                if (l8Var.f35213b.nextBoolean()) {
                                    i10 = 1;
                                } else {
                                    i10 = -1;
                                }
                                e7 = (l8Var.e(0.5f, 1.4f) * i10) + 3.1415927f;
                                e10 = l8Var.e(60.0f, 240.0f);
                            } else {
                                e7 = l8Var.e(0.0f, 6.2831855f);
                                e10 = l8Var.e(40.0f, 160.0f);
                            }
                            l8Var.a(centerX, centerY, e7, e10 * f11, l8Var.e(2.2f, 6.5f) * f11, l8Var.e(0.8f, 1.4f), 2.4f);
                        }
                        if (!this.P && this.M) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.Q = z11;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new s2(this, 0));
                    this.K.addListener(new ep0(this, 28));
                    this.K.start();
                    return;
                }
            }
            setPendingProgress(f7);
        }
    }

    public final void c() {
        float f7 = (this.F * 0.035f) + 1.0f;
        setScaleX(((this.G * 0.012f) + 1.0f) * f7);
        setScaleY((1.0f - (this.G * 0.04f)) * f7);
        setTranslationY(AndroidUtilities.dp(4.0f) * this.G);
        float f10 = this.G;
        d9 d9Var = this.f35658w;
        d9Var.f34841e = f10;
        d9Var.a();
    }

    public final void d() {
        o1.k kVar = this.H;
        if (kVar != null) {
            kVar.c();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = w8.a((ViewGroup) getRootView(), pendingDiamond);
            LaunchActivity.b0(a2.centerX(), a2.centerY(), 1.5f);
        }
        l8 l8Var = this.I;
        l8Var.c(canvas);
        if (l8Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.J;
            int i10 = org.telegram.ui.ActionBar.i6.Oh;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35649b;
            int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
            Paint paint = this.f35659x;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var));
            float f10 = 255.0f * f7;
            paint.setAlpha(Math.round(f10));
            canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(8.0f) * f7, paint);
            paint.setColor(w02);
            paint.setAlpha(Math.round(f10));
            paint.setStrokeWidth(AndroidUtilities.dp(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(7.0f) * f7, paint);
            f(canvas, ((float) (uptimeMillis % 1000)) * 0.36f, AndroidUtilities.dp(4.6f) * f7);
            f(canvas, (((float) (uptimeMillis % 6000)) * 0.06f) + 120.0f, AndroidUtilities.dp(3.2f) * f7);
            float f11 = ((float) (uptimeMillis % 1600)) / 1600.0f;
            float width = getWidth() * 0.5f;
            float width2 = (((width * 2.0f) + getWidth()) * f11) + (-width);
            float f12 = width / 2.0f;
            float f13 = width2 - f12;
            float f14 = width2 + f12;
            int i11 = 16777215 & w02;
            paint.setShader(new LinearGradient(f13, 0.0f, f14, 0.0f, new int[]{i11, w02, -7346433, i11}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f7 * 150.0f * ((float) Math.sin(f11 * 3.141592653589793d))));
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            canvas.drawRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getWidth() - AndroidUtilities.dp(1.0f), getHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
            paint.setShader(null);
            if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.F > 0.0f && (view == this.f35653e || view == this.d)) {
            int save = canvas.save();
            Path path = this.f35660y;
            path.rewind();
            path.addCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(10.0f) * this.F, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        int w02;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35649b;
        this.E.setColor(org.telegram.ui.ActionBar.i6.m1(this.F, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        this.f35654f.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        int i12 = org.telegram.ui.ActionBar.i6.f21199z6;
        this.f35655n.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        if (this.f35648a0 && !this.N) {
            w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
        } else if (this.f35650b0) {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, e6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        }
        this.f35658w.f34838a.setTextColor(w02);
        this.S.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, e6Var)));
        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.V.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
    }

    public final void f(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.f35659x);
    }

    public final void g(boolean z10) {
        float f7;
        this.O = z10;
        d9 d9Var = this.f35658w;
        d9Var.f34842f = z10;
        d9Var.a();
        if (!this.N && !z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, !z10);
    }

    public int[] getColorKeys() {
        return null;
    }

    public c6 getPendingDiamond() {
        return this.f35658w.f34840c;
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, w2 w2Var, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        String a2;
        int i11;
        boolean z15;
        TextUtils.TruncateAt truncateAt;
        int dp;
        int dp2;
        int i12;
        int i13;
        String formatShortDateTime;
        float f7;
        int i14;
        TLRPC.WebDocument webDocument;
        String a10;
        int i15 = v2.f35565a;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        if (wallettransaction2 != null && v2.a(wallettransaction2, wallettransaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.O = false;
            this.P = false;
            this.Q = false;
            this.J = SystemClock.uptimeMillis();
            d();
            this.I.f35212a.clear();
        }
        this.R = wallettransaction;
        boolean z16 = wallettransaction.pending;
        if (z16 && !wallettransaction.failed) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.N = z12;
        boolean z17 = wallettransaction.incoming;
        if (!z17 && !wallettransaction.key_change && wallettransaction.nft == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.M = z13;
        if (!z16 && !wallettransaction.failed) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.f35648a0 = z14;
        this.f35650b0 = z17;
        boolean z18 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        y9 y9Var = this.f35653e;
        TextView textView2 = this.f35654f;
        if (z18) {
            y9Var.setVisibility(8);
            setIconColor(d50.f25600w);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                a10 = LocaleController.getString(R.string.WalletUnknown);
            } else {
                a10 = w2Var.a(wallettransaction.peer.address);
            }
            textView.setText(a10);
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z19 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            d50 d50Var = d50.f25594c;
            if (z19) {
                TLRPC.User user = MessagesController.getInstance(this.f35647a).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    y9Var.setVisibility(0);
                    j9 j9Var = this.f35651c;
                    j9Var.r(user);
                    y9Var.e(user, j9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    y9Var.setVisibility(8);
                    setIconColor(d50Var);
                    if (this.f35650b0) {
                        i11 = R.drawable.wallet_transaction_in;
                    } else {
                        i11 = R.drawable.wallet_transaction_out;
                    }
                    imageView.setImageResource(i11);
                    textView2.setText(w2Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                y9Var.setVisibility(8);
                setIconColor(d50Var);
                if (!"walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) && !"wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUp));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUpCrypto));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                y9Var.setVisibility(8);
                setIconColor(d50Var);
                if (this.f35650b0) {
                    i10 = R.drawable.wallet_transaction_in;
                } else {
                    i10 = R.drawable.wallet_transaction_out;
                }
                imageView.setImageResource(i10);
                if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(wallettransaction.peer.domain);
                } else {
                    if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                        a2 = LocaleController.getString(R.string.WalletUnknown);
                    } else {
                        a2 = w2Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a2);
                }
            }
        }
        String str = wallettransaction.peer.address;
        if (str != null && TextUtils.equals(textView2.getText(), w2Var.a(str)) && textView2.length() > 9) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f35652c0 = z15;
        textView2.setSingleLine(!z15);
        if (this.f35652c0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f35652c0) {
            dp = Integer.MAX_VALUE;
        } else {
            dp = AndroidUtilities.dp(120.0f);
        }
        textView2.setMaxWidth(dp);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f35652c0) {
            dp2 = -2;
        } else {
            dp2 = AndroidUtilities.dp(18.0f);
        }
        layoutParams.height = dp2;
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(LocaleController.getString(R.string.WalletFailedTransfer));
        } else if (!wallettransaction.key_change && !(wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnramp)) {
            if (wallettransaction.nft != null) {
                if (this.f35650b0) {
                    i13 = R.string.WalletIncomingTransferNft;
                } else {
                    i13 = R.string.WalletOutgoingTransferNft;
                }
                textView.setText(LocaleController.getString(i13));
            } else {
                if (this.f35650b0) {
                    i12 = R.string.WalletIncomingTransfer;
                } else {
                    i12 = R.string.WalletOutgoingTransfer;
                }
                textView.setText(LocaleController.getString(i12));
            }
        }
        boolean z20 = wallettransaction.pending;
        TextView textView3 = this.f35655n;
        if (z20) {
            textView3.setText(qc.a(textView3, LocaleController.getString(R.string.WalletSending)));
        } else {
            int i16 = wallettransaction.date;
            if (i16 == 0) {
                formatShortDateTime = "";
            } else {
                formatShortDateTime = LocaleController.formatShortDateTime(i16);
            }
            textView3.setText(formatShortDateTime);
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        y9 y9Var2 = this.T;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35649b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            fr frVar = new fr(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.i6.m1(0.1f, w02)), mutate);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                y9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", frVar, wallettransaction.nft);
            } else {
                y9Var2.setImageDrawable(frVar);
            }
            this.U.setText(wallettransaction.nft.name);
            if (wallettransaction.nft.isPhoneNumber()) {
                i14 = R.string.WalletCollectibleNumber;
            } else if (wallettransaction.nft.isUsername()) {
                i14 = R.string.WalletCollectibleUsername;
            } else if (wallettransaction.nft.isGift()) {
                i14 = R.string.WalletCollectibleGift;
            } else {
                i14 = R.string.WalletCollectible;
            }
            this.V.setText(LocaleController.getString(i14));
        } else {
            linearLayout.setVisibility(8);
            y9Var2.b();
        }
        int i17 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable = this.f35657s;
        Drawable drawable2 = this.v;
        TextView textView4 = this.f35656r;
        if (i17 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            if (this.f35650b0) {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, e6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, e6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable, null);
            boolean z21 = this.f35650b0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder o9 = k0.o(k0.n(abs, false), 0.78571427f);
            int i18 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i18 != 0 && z21) {
                o9.insert(0, (CharSequence) "+");
            } else if (i18 != 0 && !z21) {
                o9.insert(0, (CharSequence) "–");
            }
            textView4.setText(o9);
        }
        int visibility = textView4.getVisibility();
        d9 d9Var = this.f35658w;
        d9Var.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable = drawable2;
        }
        TextView textView5 = d9Var.f34838a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        d9Var.f34839b.setImageDrawable(drawable);
        d9Var.f34842f = this.O;
        d9Var.a();
        if (!this.N && !this.O) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, z11);
        this.W = z10;
        e();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        float f7;
        super.onAttachedToWindow();
        if (!this.N && !this.O) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, true);
    }

    @Override
    public final void onDetachedFromWindow() {
        d();
        this.I.f35212a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        d9 d9Var = this.f35658w;
        d9Var.f34842f = false;
        d9Var.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.W && this.F < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f35659x;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.i6.f20919k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.i6.f20919k0.getAlpha()));
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float f7 = dp;
            float height = getHeight() - 1;
            int width = getWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, height, width - i10, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
