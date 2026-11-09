package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
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
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.io0;
import org.telegram.ui.t81;
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path D;
    public final GradientDrawable E;
    public float F;
    public float G;
    public r1.g H;
    public final n9 I;
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
    public final org.telegram.ui.Components.l9 T;
    public Drawable U;
    public final TextView V;
    public final TextView W;
    public final int f43152a;
    public boolean f43153a0;
    public final org.telegram.ui.ActionBar.g6 f43154b;
    public boolean f43155b0;
    public final org.telegram.ui.Components.w8 f43156c;
    public boolean f43157c0;
    public final ImageView d;
    public boolean f43158d0;
    public final org.telegram.ui.Components.l9 f43159e;
    public ShapeDrawable f43160e0;
    public final TextView f43161f;
    public final TextView h;
    public final TextView f43162n;
    public final TextView f43163r;
    public final Drawable f43164s;
    public final Drawable f43165w;
    public final ha f43166x;
    public final Paint f43167y;

    public u3(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f43156c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.f43167y = new Paint(1);
        this.D = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.E = gradientDrawable;
        this.I = new n9();
        this.f43152a = i7;
        this.f43154b = g6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f43159e = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(l9Var, c8.ha.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, c8.ha.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f43161f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setMaxWidth(org.telegram.messenger.g0.L(120.0f));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout2, textView, c8.ha.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = f10;
        f10.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        f10.setEllipsize(truncateAt);
        f10.setIncludeFontPadding(false);
        f10.setGravity(16);
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, f10, c8.ha.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.f43162n = f11;
        f11.setSingleLine(true);
        f11.setEllipsize(truncateAt);
        f11.setIncludeFontPadding(false);
        f11.setGravity(16);
        f11.setTextSize(1, 13.0f);
        linearLayout2.addView(f11, c8.ha.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.S = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, c8.ha.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
        this.T = l9Var2;
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(8.0f));
        linearLayout3.addView(l9Var2, c8.ha.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, c8.ha.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        org.telegram.messenger.camera.q.m(textView2, 1, 14.0f);
        TextView f12 = org.telegram.messenger.camera.q.f(linearLayout4, textView2, c8.ha.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.W = f12;
        f12.setTextSize(1, 14.0f);
        linearLayout4.addView(f12, c8.ha.t(-1, -2, 55, 0, 0, 0, 0));
        ha haVar = new ha(context);
        this.f43166x = haVar;
        this.f43163r = haVar.f42569a;
        Drawable h = jg.g.h(context, 2131232818);
        this.f43164s = h;
        h.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        Drawable h7 = jg.g.h(context, 2131232834);
        this.f43165w = h7;
        h7.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        linearLayout.addView(haVar, c8.ha.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    public static void a(u3 u3Var, ValueAnimator valueAnimator) {
        u3Var.setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setIconColor(d30 d30Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new q3(d30Var));
        this.d.setBackground(shapeDrawable);
    }

    public void setPendingProgress(float f10) {
        this.F = f10;
        this.E.setColor(org.telegram.ui.ActionBar.l6.r1(this.F, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f43154b)));
        c();
        setElevation(org.telegram.messenger.g0.L(8.0f) * f10);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.M) {
            f10 = 0.0f;
        }
        ha haVar = this.f43166x;
        haVar.d = f10;
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 > 0 && haVar.f42571c == null) {
            u6 u6Var = new u6(40, haVar.getContext(), true);
            haVar.f42571c = u6Var;
            u6Var.setContinuousRotation(300.0f);
            haVar.addView(haVar.f42571c, c8.ha.c(40.0f, 40));
        }
        u6 u6Var2 = haVar.f42571c;
        if (u6Var2 != null && i7 == 0) {
            u6Var2.setPaused(true);
            haVar.removeView(haVar.f42571c);
            haVar.f42571c = null;
        }
        haVar.a();
        haVar.requestLayout();
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27809a7));
    }

    public final void b(boolean z9, float f10) {
        TL_wallet.walletTransaction wallettransaction;
        u6 pendingDiamond;
        boolean z10;
        float e10;
        float e11;
        int i7;
        if (!z9 || this.K == null || this.L != f10) {
            this.L = f10;
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            if (z9 && f10 == 0.0f && this.F > 0.0f && !isAttachedToWindow()) {
                return;
            }
            if (z9) {
                float f11 = this.F;
                if (f11 != f10) {
                    if (f10 == 0.0f && f11 > 0.0f && (wallettransaction = this.R) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a10 = z9.a(pendingDiamond, this);
                        float centerX = a10.centerX();
                        float centerY = a10.centerY();
                        n9 n9Var = this.I;
                        n9Var.getClass();
                        float f12 = org.telegram.messenger.g0.f22562p;
                        for (int i10 = 0; i10 < 56; i10++) {
                            int i11 = i10 % 10;
                            if (i11 <= 6) {
                                e10 = n9Var.e(-0.3f, 0.3f) + 3.1415927f;
                                e11 = n9Var.e(140.0f, 560.0f);
                            } else if (i11 <= 8) {
                                if (n9Var.f42910b.nextBoolean()) {
                                    i7 = 1;
                                } else {
                                    i7 = -1;
                                }
                                e10 = (n9Var.e(0.5f, 1.4f) * i7) + 3.1415927f;
                                e11 = n9Var.e(60.0f, 240.0f);
                            } else {
                                e10 = n9Var.e(0.0f, 6.2831855f);
                                e11 = n9Var.e(40.0f, 160.0f);
                            }
                            n9Var.a(centerX, centerY, e10, e11 * f12, n9Var.e(2.2f, 6.5f) * f12, n9Var.e(0.8f, 1.4f), 2.4f);
                        }
                        if (!this.P && this.M) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.Q = z10;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
                    this.K = ofFloat;
                    ofFloat.setDuration(260L);
                    this.K.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.K.addUpdateListener(new p3(this, 0));
                    this.K.addListener(new t81(this, 4));
                    this.K.start();
                    return;
                }
            }
            setPendingProgress(f10);
        }
    }

    public final void c() {
        float f10 = (this.F * 0.035f) + 1.0f;
        setScaleX(((this.G * 0.012f) + 1.0f) * f10);
        setScaleY((1.0f - (this.G * 0.04f)) * f10);
        setTranslationY(org.telegram.messenger.g0.L(4.0f) * this.G);
        float f11 = this.G;
        ha haVar = this.f43166x;
        haVar.f42572e = f11;
        haVar.a();
    }

    public final void d() {
        r1.g gVar = this.H;
        if (gVar != null) {
            gVar.d();
            this.H = null;
        }
        this.G = 0.0f;
        c();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u6 pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.Q && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.Q = false;
            this.P = true;
            RectF a10 = z9.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.b0(a10.centerX(), a10.centerY(), 1.5f);
        }
        n9 n9Var = this.I;
        n9Var.c(canvas);
        if (n9Var.d()) {
            postInvalidateOnAnimation();
        }
        float f10 = this.F;
        if (f10 > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.J;
            int i7 = org.telegram.ui.ActionBar.l6.Ci;
            org.telegram.ui.ActionBar.g6 g6Var = this.f43154b;
            int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
            Paint paint = this.f43167y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var));
            float f11 = 255.0f * f10;
            paint.setAlpha(Math.round(f11));
            canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(8.0f) * f10, paint);
            paint.setColor(w02);
            paint.setAlpha(Math.round(f11));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(7.0f) * f10, paint);
            e(canvas, ((float) (uptimeMillis % 1000)) * 0.36f, org.telegram.messenger.g0.L(4.6f) * f10);
            e(canvas, (((float) (uptimeMillis % 6000)) * 0.06f) + 120.0f, org.telegram.messenger.g0.L(3.2f) * f10);
            float f12 = ((float) (uptimeMillis % 1600)) / 1600.0f;
            float width = getWidth() * 0.5f;
            float width2 = (((width * 2.0f) + getWidth()) * f12) + (-width);
            float f13 = width / 2.0f;
            float f14 = width2 - f13;
            float f15 = width2 + f13;
            int i10 = 16777215 & w02;
            paint.setShader(new LinearGradient(f14, 0.0f, f15, 0.0f, new int[]{i10, w02, -7346433, i10}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f10 * 150.0f * ((float) Math.sin(f12 * 3.141592653589793d))));
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            canvas.drawRoundRect(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getWidth() - org.telegram.messenger.g0.L(1.0f), getHeight() - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
            paint.setShader(null);
            if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.F > 0.0f && (view == this.f43159e || view == this.d)) {
            int save = canvas.save();
            Path path = this.D;
            path.rewind();
            path.addCircle(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), org.telegram.messenger.g0.L(10.0f) * this.F, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(Canvas canvas, float f10, float f11) {
        double radians = Math.toRadians(f10 - 90.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(51.0f), (((float) Math.cos(radians)) * f11) + org.telegram.messenger.g0.L(52.0f), (((float) Math.sin(radians)) * f11) + org.telegram.messenger.g0.L(51.0f), this.f43167y);
    }

    public final void f(boolean z9) {
        float f10;
        this.O = z9;
        ha haVar = this.f43166x;
        haVar.f42573f = z9;
        haVar.a();
        if (!this.N && !z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        b(!z9, f10);
    }

    public final void g(TL_wallet.walletTransaction wallettransaction, t3 t3Var, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        String a10;
        int i10;
        int i11;
        String a11;
        int i12;
        boolean z15;
        TextUtils.TruncateAt truncateAt;
        int L;
        int L2;
        int i13;
        int i14;
        int i15;
        String Q;
        float f10;
        int i16;
        TLRPC.WebDocument webDocument;
        String a12;
        int i17 = s3.f43087b;
        TL_wallet.walletTransaction wallettransaction2 = this.R;
        if (wallettransaction2 != null && s3.i(wallettransaction2, wallettransaction)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.O = false;
            this.P = false;
            this.Q = false;
            this.J = SystemClock.uptimeMillis();
            d();
            this.I.f42909a.clear();
        }
        this.R = wallettransaction;
        boolean z16 = wallettransaction.pending;
        if (z16 && !wallettransaction.failed) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.N = z11;
        boolean z17 = wallettransaction.incoming;
        if (!z17 && !wallettransaction.key_change && wallettransaction.nft == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.M = z12;
        if (!z16 && !wallettransaction.failed) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f43155b0 = z13;
        this.f43157c0 = z17;
        boolean z18 = wallettransaction.key_change;
        TextView textView = this.h;
        ImageView imageView = this.d;
        org.telegram.ui.Components.l9 l9Var = this.f43159e;
        TextView textView2 = this.f43161f;
        if (z18) {
            l9Var.setVisibility(8);
            setIconColor(d30.f32854x);
            imageView.setImageResource(2131232842);
            textView2.setText(id.M0(2131743081, null));
            if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                a12 = id.M0(2131742973, null);
            } else {
                a12 = t3Var.a(wallettransaction.peer.address);
            }
            textView.setText(a12);
            z14 = true;
        } else {
            TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
            boolean z19 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
            int i18 = this.f43152a;
            d30 d30Var = d30.f32850n;
            z14 = true;
            org.telegram.ui.Components.w8 w8Var = this.f43156c;
            d30 d30Var2 = d30.f32847c;
            if (z19) {
                TLRPC.User a22 = qp.s1(i18).a2(Long.valueOf(((TL_wallet.walletTransactionPeerUser) wallettransaction.peer).user_id));
                if (a22 != null) {
                    l9Var.setVisibility(0);
                    w8Var.r(a22);
                    l9Var.e(a22, w8Var);
                    textView2.setText(t10.p(a22));
                } else {
                    l9Var.setVisibility(8);
                    if (!this.f43157c0) {
                        d30Var2 = d30Var;
                    }
                    setIconColor(d30Var2);
                    if (this.f43157c0) {
                        i12 = 2131232841;
                    } else {
                        i12 = 2131232843;
                    }
                    imageView.setImageResource(i12);
                    textView2.setText(t3Var.a(wallettransaction.peer.address));
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                TLRPC.Chat M0 = qp.s1(i18).M0(Long.valueOf(wallettransaction.peer.channel_id));
                if (M0 != null) {
                    l9Var.setVisibility(0);
                    w8Var.q(M0);
                    l9Var.e(M0, w8Var);
                    textView2.setText(M0.title);
                } else {
                    l9Var.setVisibility(8);
                    if (!this.f43157c0) {
                        d30Var2 = d30Var;
                    }
                    setIconColor(d30Var2);
                    if (this.f43157c0) {
                        i11 = 2131232841;
                    } else {
                        i11 = 2131232843;
                    }
                    imageView.setImageResource(i11);
                    if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                        a11 = wallettransaction.peer.domain;
                    } else {
                        a11 = t3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a11);
                }
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerTelegramGift) {
                l9Var.setVisibility(8);
                if (this.f43157c0) {
                    d30Var2 = d30Var;
                }
                setIconColor(d30Var2);
                if (this.f43157c0) {
                    i10 = 2131232841;
                } else {
                    i10 = 2131232843;
                }
                imageView.setImageResource(i10);
                textView2.setText(id.M0(2131742985, null));
            } else if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerOnramp) {
                TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = (TL_wallet.walletTransactionPeerOnramp) walletTransactionPeer;
                l9Var.setVisibility(8);
                setIconColor(d30Var2);
                if (!"walt".equalsIgnoreCase(wallettransactionpeeronramp.provider_name) && !"wallet".equalsIgnoreCase(wallettransactionpeeronramp.provider_name)) {
                    imageView.setImageResource(2131232844);
                    textView2.setText(id.M0(2131742984, null));
                } else {
                    imageView.setImageResource(2131232845);
                    textView2.setText(id.M0(2131742983, null));
                }
                textView.setText(f.d(wallettransactionpeeronramp.provider_name, Locale.getDefault()));
            } else {
                l9Var.setVisibility(8);
                if (!this.f43157c0) {
                    d30Var2 = d30Var;
                }
                setIconColor(d30Var2);
                if (this.f43157c0) {
                    i7 = 2131232841;
                } else {
                    i7 = 2131232843;
                }
                imageView.setImageResource(i7);
                if (!TextUtils.isEmpty(wallettransaction.peer.domain)) {
                    textView2.setText(wallettransaction.peer.domain);
                } else {
                    if (TextUtils.isEmpty(wallettransaction.peer.address)) {
                        a10 = id.M0(2131742973, null);
                    } else {
                        a10 = t3Var.a(wallettransaction.peer.address);
                    }
                    textView2.setText(a10);
                }
            }
        }
        String str = wallettransaction.peer.address;
        if (str != null && TextUtils.equals(textView2.getText(), t3Var.a(str)) && textView2.length() > 9) {
            z15 = z14;
        } else {
            z15 = false;
        }
        this.f43158d0 = z15;
        textView2.setSingleLine(!z15);
        if (this.f43158d0) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        textView2.setEllipsize(truncateAt);
        if (this.f43158d0) {
            L = Integer.MAX_VALUE;
        } else {
            L = org.telegram.messenger.g0.L(120.0f);
        }
        textView2.setMaxWidth(L);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (this.f43158d0) {
            L2 = -2;
        } else {
            L2 = org.telegram.messenger.g0.L(18.0f);
        }
        layoutParams.height = L2;
        textView2.requestLayout();
        if (wallettransaction.failed) {
            textView.setText(id.M0(2131743122, null));
        } else if (!wallettransaction.key_change) {
            TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
            if (!(walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerOnramp)) {
                if ((walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerTelegramGift) && ((TL_wallet.walletTransactionPeerTelegramGift) walletTransactionPeer2).own_profile) {
                    if (this.f43157c0) {
                        i15 = 2131743075;
                    } else {
                        i15 = 2131743074;
                    }
                    textView.setText(id.M0(i15, null));
                } else if (wallettransaction.nft != null) {
                    if (this.f43157c0) {
                        i14 = 2131743085;
                    } else {
                        i14 = 2131743056;
                    }
                    textView.setText(id.M0(i14, null));
                } else {
                    if (this.f43157c0) {
                        i13 = 2131743086;
                    } else {
                        i13 = 2131743057;
                    }
                    textView.setText(id.M0(i13, null));
                }
            }
        }
        boolean z20 = wallettransaction.pending;
        TextView textView3 = this.f43162n;
        if (z20) {
            textView3.setText(di.w9.a(textView3, id.M0(2131743014, null)));
        } else {
            int i19 = wallettransaction.date;
            if (i19 == 0) {
                Q = "";
            } else {
                Q = id.Q(i19);
            }
            textView3.setText(Q);
        }
        TL_wallet.nftItem nftitem = wallettransaction.nft;
        LinearLayout linearLayout = this.S;
        org.telegram.ui.Components.l9 l9Var2 = this.T;
        org.telegram.ui.ActionBar.g6 g6Var = this.f43154b;
        if (nftitem != null) {
            linearLayout.setVisibility(0);
            int i20 = org.telegram.ui.ActionBar.l6.f28257y6;
            int w02 = org.telegram.ui.ActionBar.l6.w0(i20, g6Var);
            if (this.U == null) {
                this.U = getContext().getResources().getDrawable(2131232835).mutate();
            }
            Drawable drawable = this.U;
            org.telegram.ui.ActionBar.s6.x(this, drawable, i20, g6Var, PorterDuff.Mode.SRC_IN);
            this.f43160e0 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(8.0f), org.telegram.ui.ActionBar.l6.r1(0.1f, w02));
            org.telegram.ui.ActionBar.o6 K = org.telegram.ui.ActionBar.s6.K(0.1f, i20);
            io0 io0Var = new io0(11);
            io0 io0Var2 = new io0(12);
            int i21 = K.f28350a;
            float f11 = K.d;
            org.telegram.ui.ActionBar.g6 g6Var2 = this.f43154b;
            int P = org.telegram.ui.ActionBar.s6.P(i21, -1, 2, f11, g6Var2);
            io0Var2.c(P, this);
            org.telegram.ui.ActionBar.m6 w10 = org.telegram.ui.ActionBar.s6.w(100, this);
            w10.c(i21, -1, 2, f11, g6Var2);
            w10.f28312n = io0Var;
            w10.f28313o = io0Var2;
            w10.f28311m = false;
            w10.f28306g = P;
            xp xpVar = new xp(this.f43160e0, drawable);
            TL_wallet.nftItem nftitem2 = wallettransaction.nft;
            TLRPC.WebDocument webDocument2 = nftitem2.image_small;
            if (webDocument2 == null && (webDocument = nftitem2.image) != null) {
                webDocument2 = webDocument;
            }
            if (webDocument2 != null) {
                l9Var2.j(hc.p(m20.c(webDocument2)), "46_46", xpVar, wallettransaction.nft);
            } else {
                l9Var2.setImageDrawable(xpVar);
            }
            this.V.setText(wallettransaction.nft.name);
            if (wallettransaction.nft.isPhoneNumber()) {
                i16 = 2131743173;
            } else if (wallettransaction.nft.isUsername()) {
                i16 = 2131743171;
            } else if (wallettransaction.nft.isGift()) {
                i16 = 2131743175;
            } else {
                i16 = 2131743176;
            }
            this.W.setText(id.M0(i16, null));
        } else {
            linearLayout.setVisibility(8);
            l9Var2.b();
        }
        int i22 = (wallettransaction.amount > 0L ? 1 : (wallettransaction.amount == 0L ? 0 : -1));
        Drawable drawable2 = this.f43164s;
        Drawable drawable3 = this.f43165w;
        TextView textView4 = this.f43163r;
        if (i22 == 0 && wallettransaction.key_change) {
            textView4.setVisibility(8);
        } else if (wallettransaction.nft != null) {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable3, null);
            if (this.f43157c0) {
                org.telegram.ui.ActionBar.s6.x(this, drawable3, org.telegram.ui.ActionBar.l6.ik, g6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(id.M0(2131743087, null));
            } else {
                org.telegram.ui.ActionBar.s6.x(this, drawable3, org.telegram.ui.ActionBar.l6.f28275z6, g6Var, PorterDuff.Mode.SRC_IN);
                textView4.setText(id.M0(2131743058, null));
            }
        } else {
            textView4.setVisibility(0);
            textView4.setCompoundDrawablesRelative(null, null, drawable2, null);
            boolean z21 = this.f43157c0;
            long abs = Math.abs(wallettransaction.amount);
            SpannableStringBuilder q10 = l0.q(l0.o(abs, false), 0.78571427f);
            int i23 = (abs > 0L ? 1 : (abs == 0L ? 0 : -1));
            if (i23 != 0 && z21) {
                q10.insert(0, (CharSequence) "+");
            } else if (i23 != 0 && !z21) {
                q10.insert(0, (CharSequence) "–");
            }
            textView4.setText(q10);
        }
        int visibility = textView4.getVisibility();
        ha haVar = this.f43166x;
        haVar.setVisibility(visibility);
        CharSequence text = textView4.getText();
        if (wallettransaction.nft != null) {
            drawable2 = drawable3;
        }
        TextView textView5 = haVar.f42569a;
        textView5.setText(text);
        textView5.setCompoundDrawablesRelative(null, null, null, null);
        haVar.f42570b.setImageDrawable(drawable2);
        haVar.f42573f = this.O;
        haVar.a();
        if (!this.N && !this.O) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        b(z10, f10);
        this.f43153a0 = z9;
        updateColors();
        invalidate();
    }

    public u6 getPendingDiamond() {
        return this.f43166x.f42571c;
    }

    @Override
    public final void onAttachedToWindow() {
        float f10;
        super.onAttachedToWindow();
        if (!this.N && !this.O) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        b(true, f10);
    }

    @Override
    public final void onDetachedFromWindow() {
        d();
        this.I.f42909a.clear();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.O = false;
        ha haVar = this.f43166x;
        haVar.f42573f = false;
        haVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f43153a0 && this.F < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f43167y;
            paint.setStyle(style);
            paint.setColor(org.telegram.ui.ActionBar.l6.f27988k0.getColor());
            paint.setAlpha(Math.round((1.0f - this.F) * org.telegram.ui.ActionBar.l6.f27988k0.getAlpha()));
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(71.0f);
            }
            float f10 = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(71.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, height, width - i7, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int w02;
        int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f43154b;
        this.E.setColor(org.telegram.ui.ActionBar.l6.r1(this.F, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        this.f43161f.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        int i11 = org.telegram.ui.ActionBar.l6.f28275z6;
        this.f43162n.setTextColor(org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        if (this.f43155b0 && !this.N) {
            w02 = org.telegram.ui.ActionBar.l6.w0(i11, g6Var);
        } else if (this.f43157c0) {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ik, g6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        }
        this.f43166x.f42569a.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, g6Var);
        LinearLayout linearLayout = this.S;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != w03) {
                shapeDrawable.getPaint().setColor(w03);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(10.0f), w03));
        }
        this.V.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        this.W.setTextColor(org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
    }
}
