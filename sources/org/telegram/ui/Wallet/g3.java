package org.telegram.ui.Wallet;

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
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tf1;
public final class g3 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final GradientDrawable E;
    public float F;
    public float G;
    public o1.k H;
    public final k9 I;
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
    public final org.telegram.ui.Components.w9 T;
    public final TextView U;
    public final TextView V;
    public boolean W;
    public final int f34226a;
    public boolean f34227a0;
    public final org.telegram.ui.ActionBar.d6 f34228b;
    public boolean f34229b0;
    public final org.telegram.ui.Components.h9 f34230c;
    public boolean f34231c0;
    public final ImageView d;
    public final org.telegram.ui.Components.w9 e;
    public final TextView f34232f;
    public final TextView h;
    public final TextView f34233n;
    public final TextView f34234r;
    public final Drawable f34235s;
    public final Drawable v;
    public final da f34236w;
    public final Paint f34237x;
    public final Path f34238y;

    public g3(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f34230c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f34237x = new Paint(1);
        this.f34238y = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new k9();
        this.f34226a = i10;
        this.f34228b = d6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.z5.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, w7.z5.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f34232f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setMaxWidth(AndroidUtilities.dp(120.0f));
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, textView, w7.z5.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = i11;
        i11.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        i11.setEllipsize(truncateAt);
        i11.setIncludeFontPadding(false);
        i11.setGravity(16);
        i11.setTextSize(1, 13.0f);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, i11, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f34233n = i12;
        i12.setSingleLine(true);
        i12.setEllipsize(truncateAt);
        i12.setIncludeFontPadding(false);
        i12.setGravity(16);
        i12.setTextSize(1, 13.0f);
        linearLayout2.addView(i12, w7.z5.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.z5.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.T = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        linearLayout3.addView(w9Var2, w7.z5.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, w7.z5.p(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        lk.k(14.0f, 1, textView2);
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout4, textView2, w7.z5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.V = i13;
        i13.setTextSize(1, 14.0f);
        linearLayout4.addView(i13, w7.z5.t(-1, -2, 55, 0, 0, 0, 0));
        da daVar = new da(context);
        this.f34236w = daVar;
        this.f34234r = daVar.f34117a;
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_gram_small).mutate();
        this.f34235s = mutate;
        mutate.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.wallet_nft).mutate();
        this.v = mutate2;
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        linearLayout.addView(daVar, w7.z5.p(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(16.0f));
        setBackground(gradientDrawable);
        d();
    }

    public static void a(g3 g3Var, ValueAnimator valueAnimator) {
        g3Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(v40 v40Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new c3(v40Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f7) {
        this.F = f7;
        this.E.setColor(org.telegram.ui.ActionBar.h6.m1(this.F, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, this.f34228b)));
        c();
        setElevation(AndroidUtilities.dp(8.0f) * f7);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f7 = 0.0f;
        }
        da daVar = this.f34236w;
        daVar.d = f7;
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0 && daVar.f34119c == null) {
            m6 m6Var = new m6(40, daVar.getContext(), true);
            daVar.f34119c = m6Var;
            m6Var.setContinuousRotation(300.0f);
            daVar.addView(daVar.f34119c, w7.z5.c(40.0f, 40));
        }
        m6 m6Var2 = daVar.f34119c;
        if (m6Var2 != null && i10 == 0) {
            m6Var2.setPaused(true);
            daVar.removeView(daVar.f34119c);
            daVar.f34119c = null;
        }
        daVar.a();
        daVar.requestLayout();
        invalidate();
    }

    public final void b(float f7, boolean z10) {
        TL_wallet.walletTransaction wallettransaction;
        m6 pendingDiamond;
        boolean z11;
        float e;
        float e7;
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
                        RectF a2 = v9.a(this, pendingDiamond);
                        float centerX = a2.centerX();
                        float centerY = a2.centerY();
                        k9 k9Var = this.I;
                        k9Var.getClass();
                        float f11 = AndroidUtilities.density;
                        for (int i11 = 0; i11 < 56; i11++) {
                            int i12 = i11 % 10;
                            if (i12 <= 6) {
                                e = k9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e7 = k9Var.e(140.0f, 560.0f);
                            } else if (i12 <= 8) {
                                if (k9Var.f34434b.nextBoolean()) {
                                    i10 = 1;
                                } else {
                                    i10 = -1;
                                }
                                e = (k9Var.e(0.5f, 1.4f) * i10) + 3.1415927f;
                                e7 = k9Var.e(60.0f, 240.0f);
                            } else {
                                e = k9Var.e(0.0f, 6.2831855f);
                                e7 = k9Var.e(40.0f, 160.0f);
                            }
                            k9Var.a(centerX, centerY, e, e7 * f11, k9Var.e(2.2f, 6.5f) * f11, k9Var.e(0.8f, 1.4f), 2.4f);
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
                    this.K.addUpdateListener(new b3(this, 0));
                    this.K.addListener(new tf1(this, 2));
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
        da daVar = this.f34236w;
        daVar.e = f10;
        daVar.a();
    }

    @Override
    public final void d() {
        int w02;
        int i10 = org.telegram.ui.ActionBar.h6.f20989d6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f34228b;
        this.E.setColor(org.telegram.ui.ActionBar.h6.m1(this.F, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        this.f34232f.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.f21394z6;
        this.f34233n.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (this.f34227a0 && !this.N) {
            w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
        } else if (this.f34229b0) {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, d6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        }
        this.f34236w.f34117a.setTextColor(w02);
        this.S.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20931a7, d6Var)));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.V.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a2 = v9.a((ViewGroup) getRootView(), pendingDiamond);
            LaunchActivity.c0(a2.centerX(), a2.centerY(), 1.5f);
        }
        k9 k9Var = this.I;
        k9Var.c(canvas);
        if (k9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f7 = this.F;
        if (f7 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.J;
            int i10 = org.telegram.ui.ActionBar.h6.Oh;
            org.telegram.ui.ActionBar.d6 d6Var = this.f34228b;
            int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
            Paint paint = this.f34237x;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, d6Var));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.F > 0.0f && (view == this.e || view == this.d)) {
            int save = canvas.save();
            Path path = this.f34238y;
            path.rewind();
            path.addCircle(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), AndroidUtilities.dp(10.0f) * this.F, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        o1.k kVar = this.H;
        if (kVar != null) {
            kVar.c();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    public final void f(Canvas canvas, float f7, float f10) {
        double radians = Math.toRadians(f7 - 90.0f);
        canvas.drawLine(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(51.0f), (((float) Math.cos(radians)) * f10) + AndroidUtilities.dp(52.0f), (((float) Math.sin(radians)) * f10) + AndroidUtilities.dp(51.0f), this.f34237x);
    }

    public final void g(boolean z10) {
        float f7;
        this.O = z10;
        da daVar = this.f34236w;
        daVar.f34120f = z10;
        daVar.a();
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

    public m6 getPendingDiamond() {
        return this.f34236w.f34119c;
    }

    public final void h(TL_wallet.walletTransaction wallettransaction, f3 f3Var, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        String a2;
        int i11;
        int i12;
        String a10;
        int i13;
        boolean z16;
        TextUtils.TruncateAt truncateAt;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        String formatShortDateTime;
        float f7;
        int i17;
        TLRPC.WebDocument webDocument;
        String a11;
        int i18 = e3.f34140a;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        if (wallettransaction2 != null && e3.a(wallettransaction2, wallettransaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.O = false;
            this.P = false;
            this.Q = false;
            this.J = SystemClock.uptimeMillis();
            e();
            this.I.f34433a.clear();
        }
        this.R = wallettransaction;
        boolean z17 = wallettransaction.pending;
        if (z17 && !wallettransaction.failed) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.N = z12;
        boolean z18 = wallettransaction.incoming;
        if (!z18 && !wallettransaction.key_change && wallettransaction.nft == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.M = z13;
        if (!z17 && !wallettransaction.failed) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.f34227a0 = z14;
        this.f34229b0 = z18;
        boolean z19 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.w9 w9Var = this.e;
        TextView textView2 = this.f34232f;
        if (z19) {
            w9Var.setVisibility(8);
            setIconColor(v40.f31149w);
            imageView.setImageResource(R.drawable.wallet_transaction_key);
            textView2.setText(LocaleController.getString(R.string.WalletKeyUpdate));
            if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                a11 = LocaleController.getString(R.string.WalletUnknown);
            } else {
                a11 = f3Var.a(wallettransaction.peer.address);
            }
            textView.setText(a11);
            z15 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i19 = this.f34226a;
            v40 v40Var = v40.f31146n;
            org.telegram.ui.Components.h9 h9Var = this.f34230c;
            z15 = true;
            v40 v40Var2 = v40.f31144c;
            if (z20) {
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (user != null) {
                    w9Var.setVisibility(0);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                    textView2.setText(UserObject.getUserName(user));
                } else {
                    w9Var.setVisibility(8);
                    if (this.f34229b0) {
                        v40Var = v40Var2;
                    }
                    setIconColor(v40Var);
                    if (this.f34229b0) {
                        i13 = R.drawable.wallet_transaction_in;
                    } else {
                        i13 = R.drawable.wallet_transaction_out;
                    }
                    imageView.setImageResource(i13);
                    textView2.setText(f3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(wallettransaction.peer.channel_id));
                if (chat != null) {
                    w9Var.setVisibility(0);
                    h9Var.k(i19, chat);
                    w9Var.e(chat, h9Var);
                    textView2.setText(chat.title);
                } else {
                    w9Var.setVisibility(8);
                    if (this.f34229b0) {
                        v40Var = v40Var2;
                    }
                    setIconColor(v40Var);
                    if (this.f34229b0) {
                        i12 = R.drawable.wallet_transaction_in;
                    } else {
                        i12 = R.drawable.wallet_transaction_out;
                    }
                    imageView.setImageResource(i12);
                    if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                        a10 = wallettransaction.peer.domain;
                    } else {
                        a10 = f3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a10);
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                w9Var.setVisibility(8);
                if (!this.f34229b0) {
                    v40Var = v40Var2;
                }
                setIconColor(v40Var);
                if (this.f34229b0) {
                    i11 = R.drawable.wallet_transaction_in;
                } else {
                    i11 = R.drawable.wallet_transaction_out;
                }
                imageView.setImageResource(i11);
                textView2.setText(LocaleController.getString(R.string.WalletTransactionTelegram));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                w9Var.setVisibility(8);
                setIconColor(v40Var2);
                if (!"walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) && !"wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(R.drawable.wallet_transaction_topup);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUp));
                } else {
                    imageView.setImageResource(R.drawable.wallet_transaction_walt);
                    textView2.setText(LocaleController.getString(R.string.WalletTransactionTopUpCrypto));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                w9Var.setVisibility(8);
                if (this.f34229b0) {
                    v40Var = v40Var2;
                }
                setIconColor(v40Var);
                if (this.f34229b0) {
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
                        a2 = f3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a2);
                }
            }
        }
        String str = wallettransaction.peer.address;
        if (str != null && TextUtils.equals(textView2.getText(), f3Var.a(str)) && textView2.length() > 9) {
            z16 = z15;
        } else {
            z16 = false;
        }
        this.f34231c0 = z16;
        textView2.setSingleLine(!z16);
        if (this.f34231c0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f34231c0) {
            dp = Integer.MAX_VALUE;
        } else {
            dp = AndroidUtilities.dp(120.0f);
        }
        textView2.setMaxWidth(dp);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f34231c0) {
            dp2 = -2;
        } else {
            dp2 = AndroidUtilities.dp(18.0f);
        }
        layoutParams.height = dp2;
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(LocaleController.getString(R.string.WalletFailedTransfer));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    if (this.f34229b0) {
                        i16 = R.string.WalletMovedFromProfile;
                    } else {
                        i16 = R.string.WalletMovedToProfile;
                    }
                    textView.setText(LocaleController.getString(i16));
                } else if (wallettransaction.nft != null) {
                    if (this.f34229b0) {
                        i15 = R.string.WalletIncomingTransferNft;
                    } else {
                        i15 = R.string.WalletOutgoingTransferNft;
                    }
                    textView.setText(LocaleController.getString(i15));
                } else {
                    if (this.f34229b0) {
                        i14 = R.string.WalletIncomingTransfer;
                    } else {
                        i14 = R.string.WalletOutgoingTransfer;
                    }
                    textView.setText(LocaleController.getString(i14));
                }
            }
        }
        boolean z21 = wallettransaction.pending;
        TextView textView3 = this.f34233n;
        if (z21) {
            textView3.setText(ci.ga.a(textView3, LocaleController.getString(R.string.WalletSending)));
        } else {
            int i20 = wallettransaction.date;
            if (i20 == 0) {
                formatShortDateTime = "";
            } else {
                formatShortDateTime = LocaleController.formatShortDateTime(i20);
            }
            textView3.setText(formatShortDateTime);
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.w9 w9Var2 = this.T;
        org.telegram.ui.ActionBar.d6 d6Var = this.f34228b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21377y6, d6Var);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            zq zqVar = new zq(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(8.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, w02)), mutate);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                w9Var2.h(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument2)), "46_46", zqVar, wallettransaction.nft);
            } else {
                w9Var2.setImageDrawable(zqVar);
            }
            this.U.setText(wallettransaction.nft.name);
            if (wallettransaction.nft.isPhoneNumber()) {
                i17 = R.string.WalletCollectibleNumber;
            } else if (wallettransaction.nft.isUsername()) {
                i17 = R.string.WalletCollectibleUsername;
            } else if (wallettransaction.nft.isGift()) {
                i17 = R.string.WalletCollectibleGift;
            } else {
                i17 = R.string.WalletCollectible;
            }
            this.V.setText(LocaleController.getString(i17));
        } else {
            linearLayout.setVisibility(8);
            w9Var2.b();
        }
        int i21 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable = this.f34235s;
        Drawable drawable2 = this.v;
        TextView textView4 = this.f34234r;
        if (i21 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            if (this.f34229b0) {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, d6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletIncomingCollectibleAmount));
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21394z6, d6Var), PorterDuff.Mode.SRC_IN));
                textView4.setText(LocaleController.getString(R.string.WalletOutgoingCollectibleAmount));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable, null);
            boolean z22 = this.f34229b0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder p5 = m0.p(m0.n(abs, false), 0.78571427f);
            int i22 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i22 != 0 && z22) {
                p5.insert(0, (CharSequence) "+");
            } else if (i22 != 0 && !z22) {
                p5.insert(0, (CharSequence) "–");
            }
            textView4.setText(p5);
        }
        int visibility = textView4.getVisibility();
        da daVar = this.f34236w;
        daVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable = drawable2;
        }
        TextView textView5 = daVar.f34117a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        daVar.f34118b.setImageDrawable(drawable);
        daVar.f34120f = this.O;
        daVar.a();
        if (!this.N && !this.O) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        b(f7, z11);
        this.W = z10;
        d();
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
        e();
        this.I.f34433a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        da daVar = this.f34236w;
        daVar.f34120f = false;
        daVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.W && this.F < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f34237x;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.h6.f21110k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.h6.f21110k0.getAlpha()));
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
